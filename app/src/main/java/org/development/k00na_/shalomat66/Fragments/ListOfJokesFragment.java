package org.development.k00na_.shalomat66.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import org.development.k00na_.shalomat66.Adapters.VsiViciAdapter;
import org.development.k00na_.shalomat66.Parse.VsiVici;
import org.development.k00na_.shalomat66.R;
import org.development.k00na_.shalomat66.Util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k00na_ on 19.10.2015.
 */
public class ListOfJokesFragment extends Fragment {

    private int mPageNum;
    private String mCategory;
    private List<VsiVici> mVsiViciList;
    private int skip = 0;

    public static final String ARG_CATEGORY = "category";
    public static final String ARG_PAGENUM = "pageNumber";

    private RecyclerView mRecyclerView;

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

        mVsiViciList = new ArrayList<>();
        Bundle arguments = getArguments();

        mPageNum = arguments.getInt(ARG_PAGENUM);
        mCategory = arguments.getString(ARG_CATEGORY);
        Toast.makeText(getActivity(), "OnCreate Got Called", Toast.LENGTH_LONG).show();




    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.list_of_jokes_fragment, container, false);

        mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerListOfJokes);


        LinearLayoutManager llm = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(llm);
        Toast.makeText(getActivity(), "onCreateView got called", Toast.LENGTH_LONG).show();

        fetchDataFromParse("VsiVici", mPageNum);


        return v;
    }

    private void fetchDataFromParse(String categoryName, int mode){

        // če bo kategory name samo dummy String kot npr "" bom query vrnil vse vici
        // če bo kategory name npr. "blondinke.json" bomo query-ju dodali where clause za kategorijo

        ParseQuery<VsiVici> query = ParseQuery.getQuery(categoryName);

        if(mode == 1)
            query.addDescendingOrder("createdAt");
        if(mode == 2)
            query.addDescendingOrder("numOfLikes");

        query.setLimit(1000);
        query.findInBackground(new FindCallback<VsiVici>() {
            @Override
            public void done(List<VsiVici> list, ParseException e) {
                mVsiViciList.addAll(list);
                Toast.makeText(getActivity(), "List size: " + list.size(), Toast.LENGTH_LONG).show();

                VsiViciAdapter vsiViciAdapter = new VsiViciAdapter(getActivity(), mVsiViciList);
                mRecyclerView.setAdapter(vsiViciAdapter);
            }
        });

    }

    private void newQuery(int skipValue){


        ParseQuery query = new ParseQuery(Constants.VSI_VICI);
        query.setSkip(skipValue);
        query.setLimit(1000);
        query.findInBackground(new FindCallback<VsiVici>() {
            @Override
            public void done(List<VsiVici> list, ParseException e) {

                mVsiViciList.addAll(list);
                Toast.makeText(getActivity(), "List size inside query: " + list.size(), Toast.LENGTH_LONG).show();
                if(list.size() == 1000){
                    skip = skip + 1000;
                    newQuery(skip);
                }



            }
        });



    }
}
