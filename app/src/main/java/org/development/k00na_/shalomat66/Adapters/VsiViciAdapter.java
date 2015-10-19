package org.development.k00na_.shalomat66.Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.View;
import android.view.ViewGroup;
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
        return null;
    }

    @Override
    public void onBindViewHolder(VsiViciHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class VsiViciHolder extends RecyclerView.ViewHolder{

        private TextView mLikeIcon, mDislikeIcon, mShareIcon, mNumOfLikes;



        public VsiViciHolder(View itemView) {
            super(itemView);

            mLikeIcon = (TextView)itemView.findViewById(R.id.likeIcon_TV);
            mDislikeIcon = (TextView)itemView.findViewById(R.id.dislikeIcon_TV);
            mShareIcon = (TextView)itemView.findViewById(R.id.shareIcon_TV);
            mNumOfLikes = (TextView)itemView.findViewById(R.id.numOfLikes_TV);

            Typeface iconFont = FontManager.getTypeface(mContext, FontManager.FONTAWESOME);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.likeIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.dislikeIcon_TV), iconFont);
            FontManager.markAsIconContainer(itemView.findViewById(R.id.shareIcon_TV), iconFont);

        }
    }
}
