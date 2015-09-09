package com.example.k00na_.shalomat4.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.k00na_.shalomat4.Activities.JokeContentActivity;
import com.example.k00na_.shalomat4.Fragments.ListOfJokesFragment;
import com.example.k00na_.shalomat4.Model.Joke;
import com.example.k00na_.shalomat4.R;
import com.example.k00na_.shalomat4.Util.JSONSerializer;

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
    public void onBindViewHolder(HolderThingy holderThingy, final int position) {


        if(mCurrentCategoryNum == R.id.priljubljeni_navigation){
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
            holderThingy.favoritedIcon.setImageResource(R.drawable.ic_star_black_24dp);
            Log.i("check1", "Is " + position + " favorited? A:" + mJokeArrayList.get(position).isFavorited());
        } else{
            holderThingy.favoritedIcon.setImageResource(R.drawable.ic_star_border_black_24dp);
        }

        String shrunkenJokePreview = shrinkText(mJokeArrayList.get(position).getJokeContent());

        holderThingy.categoryTitle.setText("" + getCategoryTitle(mJokeArrayList.get(position).getJokeCategoryTitle()));
        holderThingy.jokePreviewText.setText(shrunkenJokePreview);


        holderThingy.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setupIntent(mJokeArrayList.get(position).getJokeID());

            }
        });


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


    private String shrinkText(String text){

        int textSize = text.length();
        if(textSize > 200)
            text = text.substring(0, 200) + " ...";


        else    // dodaj Stringu toliko presledkov, da bo dolg 200
            for(int j = text.length(); text.length()<200; j++){
                text = text + " ";
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

            case(R.id.priljubljeni_navigation):{
               fileName = JSONSerializer.PRILJUBLJENI_FILENAME;
                break;
            }
            case(R.id.nakljucni_navigation):{
                fileName = JSONSerializer.VSIVICI_FILENAME;
            }
            case(R.id.janezek_navigation):{
                fileName = JSONSerializer.JANEZEK_FILENAME;
            }

        }


        return serializer.loadCategory(fileName);

    }


}

class HolderThingy extends RecyclerView.ViewHolder{

    TextView categoryTitle;
    TextView jokePreviewText;
    TextView rating;
    ImageView favoritedIcon;
    CardView mCardView;


    public HolderThingy(View itemView) {
        super(itemView);

        categoryTitle = (TextView)itemView.findViewById(R.id.categoryTitle);
        mCardView = (CardView)itemView.findViewById(R.id.card_view);
        jokePreviewText = (TextView)itemView.findViewById(R.id.jokePreviewTextID);
        //rating = (TextView)itemView.findViewById(R.id.ratingText);
        favoritedIcon = (ImageView)itemView.findViewById(R.id.favoritedIcon);
    }
}
