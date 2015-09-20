package com.example.k00na_.shalomat4.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.k00na_.shalomat4.Activities.JokeContentActivity;
import com.example.k00na_.shalomat4.Fragments.ListOfJokesFragment;
import com.example.k00na_.shalomat4.Model.Joke;
import com.example.k00na_.shalomat4.R;
import com.example.k00na_.shalomat4.Util.JSONSerializer;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class ListOfJokesAdapter extends RecyclerView.Adapter<HolderThingy> {

    private int mCurrentCategoryNum;
    private String mCurrentCategoryTitle;
    private Context mContext;
    private ArrayList<Joke> mJokeArrayList;


    public ListOfJokesAdapter(int currentCategoryNum, String currentCategoryTitle, Context c) throws IOException {

        mCurrentCategoryNum = currentCategoryNum;
        mCurrentCategoryTitle = currentCategoryTitle;
        mContext = c;
        Log.i("curCat", "Curr Cat, ListOfJokesAdapter: " + mCurrentCategoryNum);
        mJokeArrayList = currentJokeList(currentCategoryNum);
        Collections.shuffle(mJokeArrayList);


    }



    @Override
    public HolderThingy onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.joke_view_holder, parent, false);
        HolderThingy holderThingy = new HolderThingy(v);




        return holderThingy;
    }

    @Override
    public void onBindViewHolder(final HolderThingy holderThingy, final int position) {


        bindViewsForHolder(holderThingy, position);

        holderThingy.mBtnPreberiVec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupIntent(mJokeArrayList.get(position).getJokeID());
            }
        });

        holderThingy.jokePreviewText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupIntent(mJokeArrayList.get(position).getJokeID());
            }
        });



        String shrunkenJokePreview = shrinkText(mJokeArrayList.get(position).getJokeContent(), holderThingy);

        // povečaj velikost teksta v kratkih šalah...
        // saveToFavorites(mCurrentJoke, currentCatNum, mCurrentCategory);

        holderThingy.categoryTitle.setText("" + getCategoryTitle(mJokeArrayList.get(position).getJokeCategoryTitle()));
        holderThingy.jokePreviewText.setText(shrunkenJokePreview);

/*
        holderThingy.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupIntent(mJokeArrayList.get(position).getJokeID());

            }
        });

        */

        holderThingy.favoritedIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveToFavorites(mJokeArrayList.get(position), mCurrentCategoryNum, mJokeArrayList, holderThingy);
            }
        });


    }

    private void saveToFavorites(Joke joke, int currentCategoryNum, ArrayList<Joke> jokeArrayList, HolderThingy holderThingy) {

        if (joke.isFavorited() == false) {
            holderThingy.favoritedIcon.setImageResource(R.drawable.ic_star_black_48dp);
            JSONSerializer serializer = new JSONSerializer(mContext);
            Toast.makeText(mContext, "Shranjeno =)", Toast.LENGTH_LONG).show();
            String fileName = joke.getJokeCategoryTitle();
            joke.setIsFavorited(true);
            try {
                // save current category
                serializer.saveCategory(jokeArrayList, fileName);
                // check favorites category
                if (serializer.loadCategory(JSONSerializer.PRILJUBLJENI_FILENAME).size() == 0)
                    serializer.createPriljubljene(joke);
                else
                    serializer.addToPriljubljene(joke);

                Log.i("favSize", "Fav array size: " + serializer.loadCategory(JSONSerializer.PRILJUBLJENI_FILENAME).size());
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void bindViewsForHolder(HolderThingy holderThingy, int position) {

        if(mCurrentCategoryNum == R.id.shranjeni_navigation){
            holderThingy.favoritedIcon.setVisibility(View.INVISIBLE);
            holderThingy.categoryTitle.setVisibility(View.VISIBLE);
        } else if (mCurrentCategoryNum == R.id.nakljucni_navigation){
            holderThingy.favoritedIcon.setVisibility(View.INVISIBLE);
            holderThingy.categoryTitle.setVisibility(View.VISIBLE);
        } else{
            holderThingy.favoritedIcon.setVisibility(View.VISIBLE);
            holderThingy.categoryTitle.setVisibility(View.INVISIBLE);

        }


        if(mJokeArrayList.get(position).isFavorited() == true) {
            holderThingy.favoritedIcon.setImageResource(R.drawable.ic_star_black_48dp);
            Log.i("check1", "Is " + position + " favorited? A:" + mJokeArrayList.get(position).isFavorited());
        } else{
            holderThingy.favoritedIcon.setImageResource(R.drawable.ic_star_border_black_48dp);
        }
    }

    @Override
    public int getItemCount() {
        return mJokeArrayList.size();
    }

    /*
        CUSTOM METHODS DOWNBELLOW
     */

    private String getCategoryTitle(String fName){

        String categoryName = "";

        switch (fName){

            case(JSONSerializer.BLONDINKE_FILENAME):{
                categoryName = "Blondinke";
                break;
            }
            case(JSONSerializer.POLICAJI_FILENAME):{
                categoryName = "Policaji";
                break;
            }
            case(JSONSerializer.TVOJAMAMA_FILENAME):{
                categoryName = "Tvoja Mama";
                break;
            }
            case(JSONSerializer.GOSTILNSIKE_FILENAME):{
                categoryName = "Gostilniški";
                break;
            }
            case(JSONSerializer.JANEZEK_FILENAME):{
                categoryName = "Janezek";
                break;
            }
            case(JSONSerializer.MUJOHASO_FILENAME):{
                categoryName = "Mujo in Haso";
                break;
            }
            case(JSONSerializer.CRNIHUMOR_FILENAME):{
                categoryName = "Črni Humor";
                break;
            }
            case(JSONSerializer.TASCE_FILENAME):{
                categoryName = "Tašče";
                break;
            }
            case(JSONSerializer.POLITICNI_FILENAME):{
                categoryName = "Politični" ;
                break;
            }
            case(JSONSerializer.YUGO_FILENAME):{
                categoryName = "Yugo";
                break;
            }
            case(JSONSerializer.OPOLZKE_FILENAME):{
                categoryName = "Opolzke Šale";
                break;
            }

            case(JSONSerializer.SRBI_FILENAME):{
                    categoryName = "Srbi ";
                break;
            }

            case(JSONSerializer.HRVATI_FILENAME):{
                categoryName = "Hrvati ";
                break;
            }

            case(JSONSerializer.SLOVENCI_FILENAME):{
                categoryName = "Slovenci ";
                break;
            }
            case(JSONSerializer.CRNOGORCI_FILENAME):{
                categoryName = "Črnogorci ";
                break;
            }

        }

        return categoryName;
    }



    private void setupIntent(UUID jokeID){

        Intent intent = new Intent(mContext.getApplicationContext(), JokeContentActivity.class);
        intent.putExtra("jokeIDForContentFragment", jokeID);
        intent.putExtra(ListOfJokesFragment.CATEGORY_TITLE_KEY, mCurrentCategoryTitle);
        intent.putExtra("currentCategoryInt", mCurrentCategoryNum);
        mContext.startActivity(intent);

    }


    private String shrinkText(String text, HolderThingy holderThingy){

        int textSize = text.length();
        if(textSize > 400) {
            text = text.substring(0, 400) + " ... ";
            holderThingy.mBtnPreberiVec.setVisibility(View.VISIBLE);

        } else{
            holderThingy.mBtnPreberiVec.setVisibility(View.GONE);
        }




        return text;
    }

    private ArrayList<Joke> currentJokeList(int catNum) throws IOException {

        JSONSerializer serializer = new JSONSerializer(mContext);
        String fileName = "";

        switch (catNum){

            case(R.id.blondinke_navigation):{
                fileName = JSONSerializer.BLONDINKE_FILENAME;
                break;
            }
            case(R.id.gostilniske_navigation):{
                fileName = JSONSerializer.GOSTILNSIKE_FILENAME;
                break;
            }

            case(R.id.crnihumor_navigation):{
                fileName = JSONSerializer.CRNIHUMOR_FILENAME;
                break;
            }
            case(R.id.mujohaso_navigation):{
                fileName = JSONSerializer.MUJOHASO_FILENAME;
                break;
            }
            case(R.id.yugovici_navigation):{
                fileName = JSONSerializer.YUGO_FILENAME;
                break;
            }

            case(R.id.shranjeni_navigation):{
               fileName = JSONSerializer.PRILJUBLJENI_FILENAME;
                break;
            }
            case(R.id.nakljucni_navigation):{
                fileName = JSONSerializer.VSIVICI_FILENAME;
                break;
            }
            case(R.id.janezek_navigation):{
                fileName = JSONSerializer.JANEZEK_FILENAME;
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


        return serializer.loadCategory(fileName);

    }

    public ArrayList<Joke> getJokeArrayList() {
        return mJokeArrayList;
    }


}

class HolderThingy extends RecyclerView.ViewHolder{

    TextView categoryTitle;
    TextView jokePreviewText;
    TextView rating;
    ImageView favoritedIcon;
    CardView mCardView;
    Button mBtnPreberiVec;


    public HolderThingy(View itemView) {
        super(itemView);

        categoryTitle = (TextView)itemView.findViewById(R.id.categoryTitle);
        mCardView = (CardView)itemView.findViewById(R.id.card_view);
        jokePreviewText = (TextView)itemView.findViewById(R.id.jokePreviewTextID);
        //rating = (TextView)itemView.findViewById(R.id.ratingText);
        favoritedIcon = (ImageView)itemView.findViewById(R.id.favoritedIcon);
        mBtnPreberiVec = (Button)itemView.findViewById(R.id.preberiVec);
    }


}
