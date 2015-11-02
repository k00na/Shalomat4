package org.development.k00na_.shalomat66.Adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.development.k00na_.shalomat66.MainActivity;
import org.development.k00na_.shalomat66.Parse.VsiVici;
import org.development.k00na_.shalomat66.R;
import org.development.k00na_.shalomat66.Util.Constants;
import org.development.k00na_.shalomat66.Util.FontManager;

import java.util.List;

/**
 * Created by k00na_ on 19.10.2015.
 */
public class VsiViciAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private static final int TYPE_PREBERIVEC = 0;
    private static final int TYPE_USUAL = 1;
    private static final int TYPE_REKLAMA = 2;
    private List<VsiVici> mVsiViciList;
    private Context mContext;

    public VsiViciAdapter(Context c, List<VsiVici> list){

        mContext = c;
        mVsiViciList  = list;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = null;

        if(viewType == TYPE_PREBERIVEC) {
            v = LayoutInflater.from(mContext).inflate(R.layout.vsi_vici_holder_preberivec, parent, false);
            VsiViciHolder_preberiVec vsiViciHolder_preberiVec = new VsiViciHolder_preberiVec(v);
            return vsiViciHolder_preberiVec;
        }
        else if(viewType == TYPE_USUAL) {
            v = LayoutInflater.from(mContext).inflate(R.layout.vsi_vici_holder, parent, false);
            VsiViciHolder vsiViciHolder = new VsiViciHolder(v);
            return vsiViciHolder;
        }

        else {
            v = LayoutInflater.from(mContext).inflate(R.layout.adview_layout, parent, false);
            AdHolder adHolder = new AdHolder(v);
            return adHolder;

        }


    }


    // I should re-think this approach of implementing onClick listeners inside the onBindViewHolder
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {



        String contentText = mVsiViciList.get(position).getContent();
        String parseUserString = mVsiViciList.get(position).getUser();
        String categoryTitle = mVsiViciList.get(position).getCategoryTitle();
        String jokeContent = mVsiViciList.get(position).getContent();
        final String jokeID = mVsiViciList.get(position).getObjectId();
        boolean addedByUser = false;

        if(parseUserString != null)
            addedByUser = true;


        // If statement for two types of Holders
        // first one is the case, when the joke is short enough to be shown fully in the ViewHolder
        if(holder instanceof VsiViciHolder){
            ((VsiViciHolder) holder).mNumOfLikes.setText("" + mVsiViciList.get(position).getNumOfLikes());
            ((VsiViciHolder) holder).mJokeContent.setText(jokeContent);


            // LIKE BTN FUNCTIONALITY
            ((VsiViciHolder) holder).mLikeIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(checkIfAlreadyLiked(jokeID) == false) {
                        saveToPrefs(jokeID);
                        mVsiViciList.get(position).increment(Constants.PARSE_NUMOFLIKES_COL);
                        mVsiViciList.get(position).saveInBackground();

                        ((VsiViciHolder) holder).mNumOfLikes.setText("" + mVsiViciList.get(position).getNumOfLikes());

                    }
                    else
                        Toast.makeText(mContext, "Ta vic ste že ocenili", Toast.LENGTH_LONG).show();

                }
            });
            // DISLIKE BTN FUNCTIONALITY
            ((VsiViciHolder) holder).mDislikeIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(checkIfAlreadyLiked(jokeID) == false){
                        saveToPrefs(jokeID);
                        mVsiViciList.get(position).increment(Constants.PARSE_NUMOFLIKES_COL, -1);
                        mVsiViciList.get(position).saveInBackground();

                        ((VsiViciHolder) holder).mNumOfLikes.setText("" + mVsiViciList.get(position).getNumOfLikes());

                    }else
                        Toast.makeText(mContext, "Ta vic ste že ocenili", Toast.LENGTH_LONG).show();

                }
            });
            




            if(addedByUser == true)
                ((VsiViciHolder) holder).mVicDodalParseUser.setText(parseUserString);

            ((VsiViciHolder) holder).mCategoryTitle.setText(categoryTitle);

        }

        // if the joke is too long to be shown fully, a different type of ViewHolder is used
        else if(holder instanceof VsiViciHolder_preberiVec) {
            ((VsiViciHolder_preberiVec)holder).mCategoryTitle.setText(categoryTitle);
            ((VsiViciHolder_preberiVec)holder).mJokeContent.setText(contentText.substring(0, 450) + " ...");
            if(addedByUser == true)
                ((VsiViciHolder_preberiVec)holder).mVicDodalText.setText(parseUserString);

            ((VsiViciHolder_preberiVec) holder).mNumOfLikes.setText("" + mVsiViciList.get(position).getNumOfLikes());

        }

    }

    @Override
    public int getItemCount() {
        return mVsiViciList.size();
    }

    @Override
    public int getItemViewType(int position) {

        if(mVsiViciList.get(position).getContent().length() > 450)
            return TYPE_PREBERIVEC;
        else if(position % 7 == 0 && position != 0)
            return TYPE_REKLAMA;
        else
            return TYPE_USUAL;

    }

    /**
     *  My Methods:
     */


    private boolean checkIfAlreadyLiked(String currentJokeID) {

        boolean alreadyLiked = false;

        String likesString = getPrefs();
        String[] likes = likesString.split(",");



        for(int i=0; i<likes.length; i++){
            if(likes[i].equals(currentJokeID)){
                alreadyLiked = true;
                break;
            }

        }

        return alreadyLiked;
    }

    private String getPrefs(){

        SharedPreferences prefs = mContext.getSharedPreferences("likes2", 0);
        String likesList = (prefs.getString("likes2", ""));
        if(likesList.length() == 0)
            Toast.makeText(mContext, "empty list", Toast.LENGTH_LONG).show();


        return likesList;

    }


    private void saveToPrefs(String string){


        SharedPreferences prefs = mContext.getSharedPreferences("likes2", 0);
        SharedPreferences.Editor editor = prefs.edit();
        String wholeString = prefs.getString("likes2", "");
        if(wholeString.length() > 0)
            wholeString = wholeString + "," + string;
        else
            wholeString = string;

        editor.putString("likes2", wholeString);

        editor.commit();


    }





    ////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Holder 1
     */

    class VsiViciHolder extends RecyclerView.ViewHolder{

        private TextView mLikeIcon, mDislikeIcon, mShareIcon, mCategoryTitle, mNumOfLikes, mJokeContent, mFavIcon, mCopyIcon, mVicDodalParseUser, mVicDodalText;
        private Button mPreberiVecBTN;
        private LinearLayout mLinearLayout;
        private View mDevider;



        public VsiViciHolder(View itemView) {
            super(itemView);

            mLikeIcon = (TextView)itemView.findViewById(R.id.likeIcon_TV);
            mCategoryTitle = (TextView)itemView.findViewById(R.id.categoryTitle_TV);
            mDislikeIcon = (TextView)itemView.findViewById(R.id.dislikeIcon_TV);
            mShareIcon = (TextView)itemView.findViewById(R.id.shareIcon_TV);
            mDevider = (View)itemView.findViewById(R.id.deviderLine_XML);
            mLinearLayout = (LinearLayout)itemView.findViewById(R.id.linearLayoutXML);
            mNumOfLikes = (TextView)itemView.findViewById(R.id.numOfLikes_TV);
            mJokeContent = (TextView)itemView.findViewById(R.id.jokeContent_TV);
            mFavIcon = (TextView)itemView.findViewById(R.id.favIcon_TV);
            mCopyIcon = (TextView)itemView.findViewById(R.id.copyIcon_TV);
            mVicDodalParseUser = (TextView)itemView.findViewById(R.id.vicDodalParseUser_TV);
            mVicDodalText = (TextView)itemView.findViewById(R.id.vicDodalText_TV);

            Typeface iconFont = FontManager.getTypeface(mContext, FontManager.FONTAWESOME);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.favIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.copyIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.likeIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.dislikeIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.shareIcon_TV), iconFont);

        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Holder 2
     */

    class VsiViciHolder_preberiVec extends RecyclerView.ViewHolder{

        private TextView mNumOfLikes, mJokeContent, mUserName, mVicDodalText, mCategoryTitle;
        private Button mPreberiVecBTN;


        public VsiViciHolder_preberiVec(View itemView) {
            super(itemView);

            mNumOfLikes = (TextView)itemView.findViewById(R.id.numOfLikes_TV_preberiVec);
            mJokeContent = (TextView)itemView.findViewById(R.id.jokeContent_TV_preberiVec);
            mUserName = (TextView)itemView.findViewById(R.id.vicDodalParseUser_TV_preberiVec);
            mVicDodalText = (TextView)itemView.findViewById(R.id.vicDodalText_TV_preberiVec);
            mCategoryTitle = (TextView)itemView.findViewById(R.id.categoryTitle_TV_preberiVec);

            mPreberiVecBTN = (Button)itemView.findViewById(R.id.preberiVec_BTN_preberiVec);
        }
    }

    class AdHolder extends RecyclerView.ViewHolder{


        private AdView mAdView;

        public AdHolder(View itemView) {
            super(itemView);

            mAdView = (AdView)itemView.findViewById(R.id.adView2);

            AdRequest adRequest = new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build()
                    ;
            mAdView.loadAd(adRequest);
        }
    }



}
