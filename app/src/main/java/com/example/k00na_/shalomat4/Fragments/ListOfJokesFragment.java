package com.example.k00na_.shalomat4.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.k00na_.shalomat4.R;

import java.io.FileNotFoundException;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class ListOfJokesFragment extends Fragment{

    public static final String CATEGORY_KEY = "pageintegerkey";
    public static final String CATEGORY_TITLE_KEY = "categoryTitleKey";
    private int mCurrentCategoryInt;
    private String mCurrentCategoryTitle;


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

    //    mCurrentCategoryInt = getArguments().getInt(CATEGORY_KEY);
     //   mCurrentCategoryTitle = getArguments().getString(CATEGORY_TITLE_KEY);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.list_of_jokes_fragment, container, false);

        mTestingTextView = (TextView)v.findViewById(R.id.testingTextView);

        mCurrentCategoryInt = getArguments().getInt(CATEGORY_KEY);
        mCurrentCategoryTitle = getArguments().getString(CATEGORY_TITLE_KEY);

        mTestingTextView.setText("" + mCurrentCategoryTitle);

        return v;


    }
}
