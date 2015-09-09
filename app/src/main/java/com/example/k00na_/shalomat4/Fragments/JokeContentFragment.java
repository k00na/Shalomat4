package com.example.k00na_.shalomat4.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.k00na_.shalomat4.Model.GlobalState;
import com.example.k00na_.shalomat4.Model.Joke;
import com.example.k00na_.shalomat4.R;
import com.example.k00na_.shalomat4.Util.JSONSerializer;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
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

        saveToFavFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JSONSerializer serializer = new JSONSerializer(getActivity());
                saveToFavFAB.setTitle("Shranjeno! ;-)");
                String fileName = getFileNameForCategory(currentCatNum);
                mCurrentJoke.setIsFavorited(true);
                try {
                    serializer.saveCategory(mCurrentCategory, fileName);
                    if (serializer.loadCategory(JSONSerializer.PRILJUBLJENI_FILENAME).size() == 0)
                        serializer.createPriljubljene(mCurrentJoke);
                    else
                        serializer.addToPriljubljene(mCurrentJoke);

                    Log.i("favSize", "Fav array size: " + serializer.loadCategory(JSONSerializer.PRILJUBLJENI_FILENAME).size());
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        sendSmsFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent smsIntent = new Intent(Intent.ACTION_SEND);
                smsIntent.setType("text/plain");
                smsIntent.putExtra(Intent.EXTRA_TEXT, "" + mCurrentJoke.getJokeContent()+"\n" + "\n" + "Poslano s Šalomatom :Đ");
                startActivity(smsIntent);

            }
        });

        return v;
    }


    private void getBundleAndSetupData() throws IOException {
        Bundle bundle = getArguments();
        jokeID = (UUID) bundle.getSerializable("jokeID");
        currentCatNum = bundle.getInt("currentCatNum");
        currentJokeNum = bundle.getInt("indexNum", 0);
        mCurrentCategory = currentJokeList(currentCatNum);

        for(int i = 0; i<mCurrentCategory.size(); i++){
            if(mCurrentCategory.get(i).getJokeID().equals(jokeID)){
                mCurrentJoke = mCurrentCategory.get(i);
                break;
            }

        }

    }

    private void setupViews(View v){

        mTextViewContent = (TextView)v.findViewById(R.id.jokeContentFragmentTextView);
        mTextViewContent.setText(mCurrentJoke.getJokeContent());
        FAB = (FloatingActionsMenu)v.findViewById(R.id.fabulousFAB);
        saveToFavFAB = (com.getbase.floatingactionbutton.FloatingActionButton)v.findViewById(R.id.saveToFavoritesFAB);
        sendSmsFAB = (com.getbase.floatingactionbutton.FloatingActionButton)v.findViewById(R.id.sendSmsFAB);

        mTextViewContent.setMovementMethod(new ScrollingMovementMethod());

    }

    private ArrayList<Joke> currentJokeList(int catNum) throws IOException {

        JSONSerializer serializer = new JSONSerializer(getActivity());
        String fileName = getFileNameForCategory(catNum);
        ArrayList<Joke> currentArray = new ArrayList<Joke>();

        switch (catNum) {

            case (R.id.blondinke_navigation): {
                fileName = JSONSerializer.BLONDINKE_FILENAME;
                break;
            }
            case(R.id.gostilniske_navigation):{
                fileName = JSONSerializer.GOSTILNSIKE_FILENAME;
                break;
            }
            case(R.id.vsivici_navigation):{
                    fileName = JSONSerializer.VSIVICI_FILENAME;
                break;
            }


        }

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
            case(R.id.vsivici_navigation):{
                fileName = JSONSerializer.VSIVICI_FILENAME;
                break;
            }
            case(R.id.priljubljeni_navigation):{
                fileName = JSONSerializer.PRILJUBLJENI_FILENAME;
                break;
            }


        }
        return fileName;
    }

    @Override
    public void onPause() {
        super.onPause();



    }
}
