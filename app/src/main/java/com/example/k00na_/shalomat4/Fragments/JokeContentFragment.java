package com.example.k00na_.shalomat4.Fragments;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.k00na_.shalomat4.Model.Joke;
import com.example.k00na_.shalomat4.R;
import com.example.k00na_.shalomat4.Util.JSONSerializer;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

/**
 * Created by k00na_ on 8.9.2015.
 */
public class JokeContentFragment extends Fragment{

    private TextView mTextViewContent;
    private UUID jokeID;
    private Joke mCurrentJoke;
    private boolean isFaved;
    private int currentCatNum;
    private ArrayList<Joke> mCurrentCategory;
    private int currentJokeNum;
    private FloatingActionsMenu FAB;
    private com.getbase.floatingactionbutton.FloatingActionButton saveToFavFAB;
    private com.getbase.floatingactionbutton.FloatingActionButton sendSmsFAB;
    private com.getbase.floatingactionbutton.FloatingActionButton copyToClipboard;

    public static JokeContentFragment newInstance(UUID jokeID, int currentCatNum, int indexNum){

        Bundle args = new Bundle();
        args.putSerializable("jokeID", jokeID);
        args.putInt("currentCatNum", currentCatNum);
        args.putInt("indexNum", indexNum);

        JokeContentFragment jokeContentFragment = new JokeContentFragment();
        jokeContentFragment.setArguments(args);
        return jokeContentFragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.joke_content_fragment, container, false);

        try {
            getBundleAndSetupData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        setupViews(v);
        
        return v;
    }


    private void getBundleAndSetupData() throws IOException {
        Bundle bundle = getArguments();
        jokeID = (UUID) bundle.getSerializable("jokeID");
        currentCatNum = bundle.getInt("currentCatNum");
        currentJokeNum = bundle.getInt("indexNum", 0);
        mCurrentCategory = currentJokeList(currentCatNum);
        Collections.shuffle(mCurrentCategory);

        for(int i = 0; i<mCurrentCategory.size(); i++){
            if(mCurrentCategory.get(i).getJokeID().equals(jokeID)){
                mCurrentJoke = mCurrentCategory.get(i);
                break;
            }

        }

    }

    private void setupViews(View v){

        mTextViewContent = (TextView)v.findViewById(R.id.jokeContentFragmentTextView);

        if(mCurrentJoke.getJokeContent().length() < 200)
            mTextViewContent.setTextSize(35);
        else
            mTextViewContent.setTextSize(25);

        mTextViewContent.setText(mCurrentJoke.getJokeContent());
        FAB = (FloatingActionsMenu)v.findViewById(R.id.fabulousFAB);
        saveToFavFAB = (com.getbase.floatingactionbutton.FloatingActionButton)v.findViewById(R.id.saveToFavoritesFAB);
        sendSmsFAB = (com.getbase.floatingactionbutton.FloatingActionButton)v.findViewById(R.id.sendSmsFAB);
        copyToClipboard = (com.getbase.floatingactionbutton.FloatingActionButton)v.findViewById(R.id.copyToClipBoardFAB);

        mTextViewContent.setMovementMethod(new ScrollingMovementMethod());

    }

    private ArrayList<Joke> currentJokeList(int catNum) throws IOException {

        JSONSerializer serializer = new JSONSerializer(getActivity());
        String fileName = getFileNameForCategory(catNum);



        return serializer.loadCategory(fileName);
    }

    private String getFileNameForCategory(int catNum){

        String fileName = "";

        switch (catNum){

            case(R.id.blondinke_navigation):{
                fileName = JSONSerializer.BLONDINKE_FILENAME;
                        break;
            }
            case(R.id.policaji_navigation):{
                fileName = JSONSerializer.POLICAJI_FILENAME;
                        break;
            }
            case(R.id.tvojamama_navigation):{
                fileName = JSONSerializer.TVOJAMAMA_FILENAME;
                        break;
            }
            case(R.id.gostilniske_navigation):{
                fileName = JSONSerializer.GOSTILNSIKE_FILENAME;
                break;
            }
            case(R.id.janezek_navigation):{
                fileName = JSONSerializer.JANEZEK_FILENAME;
                break;
            }
            case(R.id.mujohaso_navigation):{
                fileName = JSONSerializer.MUJOHASO_FILENAME;
                break;
            }
            case(R.id.crnihumor_navigation):{
                fileName = JSONSerializer.CRNIHUMOR_FILENAME;
                break;
            }
            case(R.id.tasce_navigation):{
                fileName = JSONSerializer.TASCE_FILENAME;
                break;
            }
            case(R.id.politicnivici_navigation):{
                fileName = JSONSerializer.POLITICNI_FILENAME;
                break;
            }
            case(R.id.yugovici_navigation):{
                fileName = JSONSerializer.YUGO_FILENAME;
                break;
            }
            case(R.id.nakljucni_navigation):{
                fileName = JSONSerializer.VSIVICI_FILENAME;
                break;
            }
            case(R.id.priljubljeni_navigation):{
                fileName = JSONSerializer.PRILJUBLJENI_FILENAME;
                break;
            }
            case(R.id.opolzke_navigation):{
                fileName = JSONSerializer.OPOLZKE_FILENAME;
                break;
            }


        }
        return fileName;
    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);


        inflater.inflate(R.menu.joke_content_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.kopirajIcon){

        }

        if(item.getItemId() == R.id.posljiIcon){
            Intent smsIntent = new Intent(Intent.ACTION_SEND);
            smsIntent.setType("text/plain");
            smsIntent.putExtra(Intent.EXTRA_TEXT, "" + mCurrentJoke.getJokeContent() + "\n \n Šalomat™ ");
            startActivity(smsIntent);
        }

        if(item.getItemId() == R.id.kopirajIcon){

            ((ClipboardManager)getActivity().getSystemService(getActivity().CLIPBOARD_SERVICE))
                    .setText(mCurrentJoke.getJokeContent() + "\n \n Šalomat™ ");

        }

        return super.onOptionsItemSelected(item);
    }
}
