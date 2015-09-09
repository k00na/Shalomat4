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
import android.widget.Toast;

import com.example.k00na_.shalomat4.Activities.JokeContentActivity;
import com.example.k00na_.shalomat4.Fragments.ListOfJokesFragment;
import com.example.k00na_.shalomat4.Model.GlobalState;
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

        if(currentCategoryNum != R.id.vsivici_navigation)
            mJokeArrayList = currentJokeList(currentCategoryNum);
        else if (currentCategoryNum == R.id.vsivici_navigation){
            ArrayList<Joke> randomisedArray = currentJokeList(currentCategoryNum);
            Collections.shuffle(randomisedArray);
            mJokeArrayList = randomisedArray;


        }

    }



    @Override
    public HolderThingy onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.joke_view_holder, parent, false);
        HolderThingy holderThingy = new HolderThingy(v);

        return holderThingy;
    }

    @Override
    public void onBindViewHolder(HolderThingy holderThingy, final int position) {

        if(mCurrentCategoryNum != R.id.priljubljeni_navigation && mCurrentCategoryNum != R.id.vsivici_navigation) {
            holderThingy.favoritedIcon.setVisibility(View.VISIBLE);
            holderThingy.categoryTitle.setVisibility(View.INVISIBLE);
        }


        if(mJokeArrayList.get(position).isFavorited() == true)
            holderThingy.favoritedIcon.setImageResource(R.drawable.ic_star_black_24dp);

        String shrunkenJokePreview = shrinkText(mJokeArrayList.get(position).getJokeContent());

        holderThingy.categoryTitle.setText("" + mJokeArrayList.get(position).getJokeCategoryTitle());
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
            case(R.id.vsivici_navigation):{
                fileName = JSONSerializer.VSIVICI_FILENAME;
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
