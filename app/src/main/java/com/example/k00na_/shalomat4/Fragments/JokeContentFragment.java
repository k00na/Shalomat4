package com.example.k00na_.shalomat4.Fragments;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
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
import android.widget.Toast;

import com.example.k00na_.shalomat4.Model.Joke;
import com.example.k00na_.shalomat4.R;
import com.example.k00na_.shalomat4.Util.JSONSerializer;

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
    private FloatingActionButton FAB;

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

        setHasOptionsMenu(true);

        FAB = (FloatingActionButton)v.findViewById(R.id.googleFAB);



        try {
            getBundleAndSetupData();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.i("idValue","Joke ID: " +  mCurrentJoke.getJokeID());

        if(mCurrentJoke.isFavorited() == true)
            FAB.setImageResource(R.drawable.ic_star_black_24dp);
        else
            FAB.setImageResource(R.drawable.ic_star_border_black_24dp);

        setupViews(v);

        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // if the currentJoke is not set to favorite, save it into that category
                // otherwise, if it's already favorited and the user clicks on the FAB,
                // delete the joke from favorites...


                if(mCurrentJoke.isFavorited() == false) {
                    FAB.setImageResource(R.drawable.ic_star_black_24dp);
                    JSONSerializer serializer = new JSONSerializer(getActivity());
                    Toast.makeText(getActivity(), "Shranjeno =)", Toast.LENGTH_LONG).show();
                    String fileName = getFileNameForCategory(currentCatNum);
                    mCurrentJoke.setIsFavorited(true);
                    try {
                        // save current category
                        serializer.saveCategory(mCurrentCategory, fileName);
                        // check favorites category
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
                } else {

                    if(currentCatNum != R.id.shranjeni_navigation) {
                        FAB.setImageResource(R.drawable.ic_star_border_black_24dp);
                        Toast.makeText(getActivity(), "Odstranjeno =(", Toast.LENGTH_LONG).show();
                        JSONSerializer serializer = new JSONSerializer(getActivity());
                        ArrayList<Joke> currentArray = new ArrayList<Joke>();
                        // problem bo dobit ta joke v izvirnem array-ju in mu spremenit vrednost
                        // 1. dobi izviren array
                        // s for zanko pejt čez ceu array
                        // ko najdeš item, ki se ujema z currentID-jem, odstrani to šalo
                        // sam a ne bo problem tle v tem, da je ID te šale vezan samo na kategorijo v priljubljenih
                        // torej v priljubljenih ima drugačen ID kot v svoji kategoriji... hm, hm...
                        // vicev isFavorited bi tako lahko spremenil le znotraj JokeContentFragment-a...

                        // hm... grem z logom čekirat, če imajo res različne ID-je...
                        try {
                            currentArray = serializer.loadCategory(mCurrentJoke.getJokeCategoryTitle());
                            for(int i = 0; i<currentArray.size(); i++){
                                if(currentArray.get(i).getJokeID().equals(mCurrentJoke.getJokeID()))
                                    currentArray.get(i).setIsFavorited(false);
                            }

                            serializer.saveCategory(currentArray, mCurrentJoke.getJokeCategoryTitle());

                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }




                }

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
        Collections.shuffle(mCurrentCategory);

        for(int i = 0; i<mCurrentCategory.size(); i++){
            if(mCurrentCategory.get(i).getJokeID().equals(jokeID)){
                mCurrentJoke = mCurrentCategory.get(i);
                break;
            }

        }

        if(mCurrentJoke.isFavorited() == true)
            FAB.setImageResource(R.drawable.ic_star_black_24dp);



    }

    private void setupViews(View v){

        mTextViewContent = (TextView)v.findViewById(R.id.jokeContentFragmentTextView);

        if(mCurrentJoke.getJokeContent().length() < 200)
            mTextViewContent.setTextSize(35);
        else
            mTextViewContent.setTextSize(25);

        mTextViewContent.setText(mCurrentJoke.getJokeContent());



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
            case(R.id.shranjeni_navigation):{
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

        /*
         getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
         */

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

            Toast.makeText(getActivity(), "Kopirano", Toast.LENGTH_LONG).show();

        }

        return super.onOptionsItemSelected(item);
    }
}
