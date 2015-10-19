package org.development.k00na_.shalomat66.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

/**
 * Created by k00na_ on 19.10.2015.
 */
public class ListOfJokesFragment extends Fragment {

    private int mPageNum;
    private String mCategory;
    public static final String ARG_CATEGORY = "category";
    public static final String ARG_PAGENUM = "pageNumber";


    public ListOfJokesFragment(){

    }

    public static ListOfJokesFragment newInstance(String category, int pageNumber){

        Bundle bundle = new Bundle();
        bundle.putString(ARG_CATEGORY, category);
        bundle.putInt(ARG_PAGENUM, pageNumber);

        ListOfJokesFragment listOfJokesFragment = new ListOfJokesFragment();

        listOfJokesFragment.setArguments(bundle);
        return listOfJokesFragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getArguments();

        mPageNum = arguments.getInt(ARG_PAGENUM);
        mCategory = arguments.getString(ARG_CATEGORY);

        // HERE'S where the fetching from Parse process will happen.
        // get the right List<VsiVici> based on mPageNum & mCategory and then call the adapter

        RecyclerView recyclerView = new RecyclerView(getActivity());

    }
}
