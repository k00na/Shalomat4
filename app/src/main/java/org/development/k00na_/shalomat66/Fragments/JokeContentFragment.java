package org.development.k00na_.shalomat66.Fragments;

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
import android.widget.Toast;

import com.google.android.gms.ads.AdView;

import org.development.k00na_.shalomat66.Model.Joke;
import com.example.k00na_.shalomat4.R;
import org.development.k00na_.shalomat66.Util.JSONSerializer;

import com.melnykov.fab.ObservableScrollView;
import com.melnykov.fab.ScrollDirectionListener;

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
    private boolean textContentClicked = false;
  //  private FloatingActionButton FAB;
    private com.melnykov.fab.FloatingActionButton FAB;
    private AdView adView;

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

        setupFAB(v);

        setHasOptionsMenu(true);

        try {
            getBundleAndSetupData();
        } catch (IOException e) {
            e.printStackTrace();
        }

        setupViews(v);


        mTextViewContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textContentClicked == false) {
                    FAB.hide();
                    textContentClicked = true;
                } else if (textContentClicked == true) {
                    FAB.show();
                    textContentClicked = false;
                }
            }
        });




        Log.i("idValue", "Joke ID: " + mCurrentJoke.getJokeID());

        if(mCurrentJoke.isFavorited() == true)
            FAB.setImageResource(R.drawable.ic_star_black_24dp);
        else
            FAB.setImageResource(R.drawable.ic_star_border_black_24dp);



        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // if the currentJoke is not set to favorite, save it into that category
                // otherwise, if it's already favorited and the user clicks on the FAB,
                // delete the joke from favorites...

                saveToFavorites(mCurrentJoke, currentCatNum, mCurrentCategory);




            }


        });

        return v;
    }

    private void saveToFavorites(Joke currentJoke, int currentCatNum, ArrayList<Joke> currentCategory) {

        if (mCurrentJoke.isFavorited() == false) {
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
        }

    }


    private void getBundleAndSetupData() throws IOException {
        Bundle bundle = getArguments();
        jokeID = (UUID) bundle.getSerializable("jokeID");
        currentCatNum = bundle.getInt("currentCatNum");
        currentJokeNum = bundle.getInt("indexNum", 0);
        mCurrentCategory = currentJokeList(currentCatNum);
     //   Collections.shuffle(mCurrentCategory);

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
            mTextViewContent.setTextSize(30);
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
            case(R.id.srbi_navigation):{
                fileName = JSONSerializer.SRBI_FILENAME;
                break;
            }

            case(R.id.hrvati_navigation):{
                fileName = JSONSerializer.HRVATI_FILENAME;
                break;
            }

            case(R.id.slovenci_navigation):{
                fileName = JSONSerializer.SLOVENCI_FILENAME;
                break;
            }

            case(R.id.crnogorci_navigation):{
                fileName = JSONSerializer.CRNOGORCI_FILENAME;
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


        menu.clear();

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

    private void setupFAB(View v){

        FAB = (com.melnykov.fab.FloatingActionButton)v.findViewById(R.id.googleFAB);
        ObservableScrollView scrollViewYo = (ObservableScrollView)v.findViewById(R.id.scrollView);


        FAB.attachToScrollView(scrollViewYo, new ScrollDirectionListener() {
            @Override
            public void onScrollDown() {
                FAB.show();
            }

            @Override
            public void onScrollUp() {

                FAB.hide();


            }





        });

    }
}
