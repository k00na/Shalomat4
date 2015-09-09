package com.example.k00na_.shalomat4.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.k00na_.shalomat4.Adapters.ListOfJokesAdapter;
import com.example.k00na_.shalomat4.Model.GlobalState;
import com.example.k00na_.shalomat4.Model.Joke;
import com.example.k00na_.shalomat4.R;
import com.example.k00na_.shalomat4.Util.JSONSerializer;

import org.json.JSONException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class ListOfJokesFragment extends Fragment{

    public static final String CATEGORY_KEY = "pageintegerkey";
    public static final String CATEGORY_TITLE_KEY = "categoryTitleKey";
    private int mCurrentCategoryInt;
    private String mCurrentCategoryTitle;
    private ArrayList<Joke> mCurrentJokeList;
    private ListOfJokesAdapter mListOfJokesAdapter;
    private RecyclerView mRecyclerView;
    GlobalState globalState;


    private TextView mTestingTextView;

    public static Fragment newInstance(int categoryNum, String currentTitle){

        Bundle args = new Bundle();
        args.putInt(CATEGORY_KEY, categoryNum);
        args.putString(CATEGORY_TITLE_KEY, currentTitle);
        ListOfJokesFragment fragment = new ListOfJokesFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        globalState = (GlobalState)getActivity().getApplicationContext();

    //    mCurrentCategoryInt = getArguments().getInt(CATEGORY_KEY);
     //   mCurrentCategoryTitle = getArguments().getString(CATEGORY_TITLE_KEY);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.list_of_jokes_fragment, container, false);
        mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerViewID);

        /*
            GET DATA
         */

        mCurrentCategoryInt = getArguments().getInt(CATEGORY_KEY);
        mCurrentCategoryTitle = getArguments().getString(CATEGORY_TITLE_KEY);

        try {
            mCurrentJokeList = getCurrentJokeList(mCurrentCategoryInt);
            Log.i("yoyo", "Janezek size: " + mCurrentJokeList.size());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        /*
            SETUP ADAPTER & RECYCLERVIEW
         */

        try {
            mListOfJokesAdapter = new ListOfJokesAdapter(mCurrentCategoryInt, mCurrentCategoryTitle, getActivity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(llm);
        mRecyclerView.setAdapter(mListOfJokesAdapter);

        return v;
    }


    private ArrayList<Joke> getCurrentJokeList(int currentCategoryInt) throws IOException, JSONException {

        JSONSerializer serializer = new JSONSerializer(getActivity());
        String fileName = "";


        switch (currentCategoryInt){

            case(R.id.blondinke_navigation):{
                fileName = JSONSerializer.BLONDINKE_FILENAME;
                break;
            }
            case(R.id.gostilniske_navigation):{
                fileName = JSONSerializer.GOSTILNSIKE_FILENAME;
                break;
            }
            case (R.id.priljubljeni_navigation):{
                fileName = JSONSerializer.PRILJUBLJENI_FILENAME;
                break;
            }
            case (R.id.janezek_navigation):{
                fileName = JSONSerializer.JANEZEK_FILENAME;
            }


        }

        Log.i("fav", "Size iz: " + serializer.loadCategory(fileName).size());
        return serializer.loadCategory(fileName);


    }

    @Override
    public void onResume() {
        super.onResume();

        try {
            mListOfJokesAdapter = new ListOfJokesAdapter(mCurrentCategoryInt, mCurrentCategoryTitle, getActivity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mCurrentJokeList = getCurrentJokeList(mCurrentCategoryInt);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            mListOfJokesAdapter = new ListOfJokesAdapter(mCurrentCategoryInt, mCurrentCategoryTitle, getActivity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        mRecyclerView.setAdapter(mListOfJokesAdapter);

    }
}
