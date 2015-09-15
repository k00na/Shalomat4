package com.example.k00na_.shalomat4.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.example.k00na_.shalomat4.Fragments.JokeContentFragment;
import com.example.k00na_.shalomat4.Fragments.ListOfJokesFragment;
import com.example.k00na_.shalomat4.Model.Joke;
import com.example.k00na_.shalomat4.R;
import com.example.k00na_.shalomat4.Util.JSONSerializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

/**
 * Created by k00na_ on 7.9.2015.
 */
public class JokeContentActivity extends AppCompatActivity {


    private ViewPager mViewPager;
    private TextView jokeContent;
    private Toolbar mToolbar;
    private ArrayList<Joke> mCurrentCategory;
    private Context activityContext;

    // primitives and strings
    private int mCurrentCategoryNum;
    private UUID mJokeID;
    private String mCategoryTitle;



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

        gettingTheIntent();
        getSupportActionBar().setTitle(mCategoryTitle);

        try {
            mCurrentCategory = setupCategory(mCurrentCategoryNum);
            Collections.shuffle(mCurrentCategory);
        } catch (IOException e) {
            e.printStackTrace();
        }

        mViewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Joke joke = mCurrentCategory.get(position);

                return JokeContentFragment.newInstance(joke.getJokeID(), mCurrentCategoryNum, position);
            }

            @Override
            public int getCount() {
                return mCurrentCategory.size();
            }
        });

        for(int j = 0; j<mCurrentCategory.size(); j++){

            if(mCurrentCategory.get(j).getJokeID().equals(mJokeID))
                mViewPager.setCurrentItem(j);
        }





    }

    private void gettingTheIntent(){

        Intent i = getIntent();

        mJokeID = (UUID) i.getSerializableExtra("jokeIDForContentFragment");
        mCategoryTitle = i.getStringExtra(ListOfJokesFragment.CATEGORY_TITLE_KEY);
        mCurrentCategoryNum = i.getIntExtra("currentCategoryInt", 0);

    }

    private ArrayList<Joke> setupCategory(int catNum) throws IOException {

        JSONSerializer serializer = new JSONSerializer(this);
        String fileName = "";

        switch (catNum){

            case (R.id.opolzke_navigation):{
                fileName = JSONSerializer.OPOLZKE_FILENAME;
                break;
            }
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
            case(R.id.shranjeni_navigation):{
                fileName = JSONSerializer.PRILJUBLJENI_FILENAME;
                break;
            }
            case(R.id.nakljucni_navigation):{
                fileName = JSONSerializer.VSIVICI_FILENAME;
                break;
            }
            case(R.id.janezek_navigation):{
                fileName = JSONSerializer.JANEZEK_FILENAME;
                break;
            }


        }

        return serializer.loadCategory(fileName);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onResume() {
        super.onResume();

        try {
            mCurrentCategory = setupCategory(mCurrentCategoryNum);
        } catch (IOException e) {
            e.printStackTrace();
        }

        getSupportActionBar().setTitle(mCategoryTitle);


    }
}
