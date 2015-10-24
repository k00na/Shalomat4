package org.development.k00na_.shalomat66.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.development.k00na_.shalomat66.Parse.VsiVici;
import org.development.k00na_.shalomat66.R;
import org.development.k00na_.shalomat66.Util.FontManager;

import java.util.List;

/**
 * Created by k00na_ on 19.10.2015.
 */
public class VsiViciAdapter extends RecyclerView.Adapter<VsiViciAdapter.VsiViciHolder>{


    private List<VsiVici> mVsiViciList;
    private Context mContext;

    public VsiViciAdapter(Context c, List<VsiVici> list){

        mContext = c;
        mVsiViciList  = list;
    }


    @Override
    public VsiViciHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(mContext).inflate(R.layout.vsi_vici_holder, parent, false);
        VsiViciHolder vsiViciHolder = new VsiViciHolder(v);

        return vsiViciHolder;
    }

    @Override
    public void onBindViewHolder(VsiViciHolder holder, int position) {


        String contentText = mVsiViciList.get(position).getContent();


        if(contentText.length() < 450){

            holder.mJokeContent.setText(contentText);
            holder.mPreberiVecBTN.setVisibility(View.GONE);
       //     holder.mTableLayout.setVisibility(View.VISIBLE);
        }

        else{
            holder.mJokeContent.setText(contentText.substring(0, 450) + " ... ");
            holder.mPreberiVecBTN.setVisibility(View.VISIBLE);
            holder.mDevider.setVisibility(View.GONE);
            holder.mLinearLayout.setVisibility(View.GONE);
         //   holder.mTableLayout.setVisibility(View.GONE);
        }


        holder.mNumOfLikes.setText("" + mVsiViciList.get(position).getNumOfLikes());

        if(mVsiViciList.get(position).getUser() != null)
            holder.mUserName.setText("" + mVsiViciList.get(position).getUser());
        else
            holder.mVicDodalText.setVisibility(View.GONE);


    }

    @Override
    public int getItemCount() {
        return mVsiViciList.size();
    }

    class VsiViciHolder extends RecyclerView.ViewHolder{

        private TextView mLikeIcon, mDislikeIcon, mShareIcon, mNumOfLikes, mJokeContent, mFavIcon, mCopyIcon, mUserName, mVicDodalText;
        private Button mPreberiVecBTN;
        private LinearLayout mLinearLayout;
        private View mDevider;



        public VsiViciHolder(View itemView) {
            super(itemView);

            mLikeIcon = (TextView)itemView.findViewById(R.id.likeIcon_TV);
            mDislikeIcon = (TextView)itemView.findViewById(R.id.dislikeIcon_TV);
            mShareIcon = (TextView)itemView.findViewById(R.id.shareIcon_TV);
            mDevider = (View)itemView.findViewById(R.id.deviderLine_XML);
            mLinearLayout = (LinearLayout)itemView.findViewById(R.id.linearLayoutXML);
            mNumOfLikes = (TextView)itemView.findViewById(R.id.numOfLikes_TV);
            mJokeContent = (TextView)itemView.findViewById(R.id.jokeContent_TV);
            mFavIcon = (TextView)itemView.findViewById(R.id.favIcon_TV);
            mCopyIcon = (TextView)itemView.findViewById(R.id.copyIcon_TV);
            mPreberiVecBTN = (Button)itemView.findViewById(R.id.preberiVec_BTN);
            mUserName = (TextView)itemView.findViewById(R.id.vicDodalParseUser_TV);
            mVicDodalText = (TextView)itemView.findViewById(R.id.vicDodalText_TV);

            Typeface iconFont = FontManager.getTypeface(mContext, FontManager.FONTAWESOME);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.favIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.copyIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.likeIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.dislikeIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.shareIcon_TV), iconFont);

        }
    }
}
