package com.example.k00na_.shalomat4.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.k00na_.shalomat4.Fragments.ListOfJokesFragment;
import com.example.k00na_.shalomat4.Model.Joke;
import com.example.k00na_.shalomat4.R;
import com.example.k00na_.shalomat4.Util.JSONSerializer;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class JokeContentActivity extends AppCompatActivity {


    private ViewPager mViewPager;
    private TextView jokeContent;
    private Toolbar mToolbar;
    private ArrayList<Joke> mCurrentCategory;
    private int mCurrentCategoryNum;
    private UUID mJokeID;
    private Context activityContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_content);

        mViewPager = (ViewPager)findViewById(R.id.viewPagerXMLid);
        mToolbar = (Toolbar)findViewById(R.id.includingAppBarForJokeContent);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Intent i = getIntent();


        mJokeID = (UUID) i.getSerializableExtra("jokeIDForContentFragment");
        String currentTitle = i.getStringExtra(ListOfJokesFragment.CATEGORY_TITLE_KEY);
        mCurrentCategoryNum = i.getIntExtra("currentCategoryInt", 0);


        mCurrentCategory = setupCategory(mCurrentCategoryNum);

        TextView testText = (TextView)findViewById(R.id.testtext);
        String content = "";

        for(int j = 0; j <mCurrentCategory.size(); j++){

            if(mCurrentCategory.get(j).getJokeID().equals(mJokeID)) {
                content = mCurrentCategory.get(j).getJokeContent();
                break;
            }

        }

        testText.setText(content);





/*
        mViewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return null;
            }

            @Override
            public int getCount() {
                return 0;
            }
        });
        */


    }

    private void gettingTheIntent(){

        Intent i = getIntent();


        mJokeID = (UUID) i.getSerializableExtra("jokeIDForContentFragment");
        int currentJokeIndex = i.getIntExtra("currentJokeIndex", 0);
        String currentTitle = i.getStringExtra(ListOfJokesFragment.CATEGORY_TITLE_KEY);
        mCurrentCategoryNum = i.getIntExtra("currentCategoryInt", 0);

    }

    private ArrayList<Joke> setupCategory(int catNum){

        JSONSerializer serializer = new JSONSerializer(this);
        String fileName = "";

        switch (catNum){

            case(R.id.blondinke_navigation):{
                fileName = JSONSerializer.BLONDINKE_FILENAME;
                break;
            }
            case(R.id.policaji_navigation):{
                fileName = JSONSerializer.POLICAJI_FILENAME;
                break;
            }
            case(R.id.politicnivici_navigation):{
                fileName = JSONSerializer.POLITICNI_FILENAME;
                break;
            }
            case(R.id.tvojamama_navigation):{
                fileName = JSONSerializer.TVOJAMAMA_FILENAME;
                break;
            }
            case(R.id.gostilniske_navigation):{
                fileName = JSONSerializer.GOSTILNSIKE_FILENAME;
                break;
            }
            case(R.id.mujohaso_navigation):{
                fileName = JSONSerializer.MUJOHASO_FILENAME;
                break;
            }
            case(R.id.crnihumor_navigation):{
                fileName = JSONSerializer.CRNIHUMOR_FILENAME;
                break;
            }
            case(R.id.tasce_navigation):{
                fileName = JSONSerializer.TASCE_FILENAME;
                break;
            }
            case(R.id.yugovici_navigation):{
                fileName = JSONSerializer.YUGO_FILENAME;
                break;
            }
            case(R.id.priljubljeni_navigation):{
                fileName = JSONSerializer.PRILJUBLJENI_FILENAME;
                break;
            }
            case(R.id.vsivici_navigation):{
                fileName = JSONSerializer.VSIVICI_FILENAME;
                break;
            }


        }

        return serializer.loadCategory(fileName);

    }

}
