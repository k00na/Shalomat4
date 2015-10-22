package org.development.k00na_.shalomat66.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
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
         //   holder.mTableLayout.setVisibility(View.GONE);
        }


    }

    @Override
    public int getItemCount() {
        return mVsiViciList.size();
    }

    class VsiViciHolder extends RecyclerView.ViewHolder{

        private TextView mLikeIcon, mDislikeIcon, mShareIcon, mNumOfLikes, mJokeContent, mFavIcon, mCopyIcon;
        private Button mPreberiVecBTN;
        private TableLayout mTableLayout;



        public VsiViciHolder(View itemView) {
            super(itemView);

            mLikeIcon = (TextView)itemView.findViewById(R.id.likeIcon_TV);
            mDislikeIcon = (TextView)itemView.findViewById(R.id.dislikeIcon_TV);
            mShareIcon = (TextView)itemView.findViewById(R.id.shareIcon_TV);
         //   mNumOfLikes = (TextView)itemView.findViewById(R.id.numOfLikes_TV);
            mJokeContent = (TextView)itemView.findViewById(R.id.jokeContent_TV);
            mFavIcon = (TextView)itemView.findViewById(R.id.favIcon_TV);
            mCopyIcon = (TextView)itemView.findViewById(R.id.copyIcon_TV);
            mPreberiVecBTN = (Button)itemView.findViewById(R.id.preberiVec_BTN);
         //   mTableLayout = (TableLayout)itemView.findViewById(R.id.tableLayout_holder);

            Typeface iconFont = FontManager.getTypeface(mContext, FontManager.FONTAWESOME);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.favIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.copyIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.likeIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.dislikeIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.shareIcon_TV), iconFont);

        }
    }
}
