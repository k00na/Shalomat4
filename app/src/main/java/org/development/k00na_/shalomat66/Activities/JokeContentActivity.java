package org.development.k00na_.shalomat66.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.development.k00na_.shalomat66.Fragments.JokeContentFragment;
import org.development.k00na_.shalomat66.Fragments.ListOfJokesFragment;
import org.development.k00na_.shalomat66.Model.GlobalState;
import org.development.k00na_.shalomat66.Model.Joke;
import org.development.k00na_.shalomat66.R;
import org.development.k00na_.shalomat66.Util.DialogJokeContent;
import org.development.k00na_.shalomat66.Util.JSONSerializer;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.michael.easydialog.EasyDialog;

import java.io.IOException;
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
    private Context activityContext;

    // primitives and strings
    private int mCurrentCategoryNum;
    private UUID mJokeID;
    private String mCategoryTitle;
    private AdView adView;
    private GlobalState mGlobalState;
    private LinearLayout toolbarAndAdHolder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_content);

        mGlobalState = (GlobalState)getApplicationContext();

        mViewPager = (ViewPager)findViewById(R.id.viewPagerXMLid);
        mToolbar = (Toolbar)findViewById(R.id.includingAppBarForJokeContent);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbarAndAdHolder = (LinearLayout)findViewById(R.id.addsAndToolbar);


        adView = (AdView) this.findViewById(R.id.adView);


        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(adRequest);


        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

             //   onBackPressed();

            }
        });

        gettingTheIntent();
        getSupportActionBar().setTitle(mCategoryTitle);

        try {
            mCurrentCategory = setupCategory(mCurrentCategoryNum);
         //   Collections.shuffle(mCurrentCategory);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(numOfVisitsForContentActivity() == 0){

            DialogJokeContent dialogJokeContent = new DialogJokeContent();
            dialogJokeContent.show(getSupportFragmentManager(), "dialogJokeContent");

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

            case(R.id.srbi_navigation):{
                fileName = JSONSerializer.SRBI_FILENAME;
                break;
            }

            case(R.id.hrvati_navigation):{
                fileName = JSONSerializer.HRVATI_FILENAME;
                break;
            }

            case(R.id.slovenci_navigation):{
                fileName = JSONSerializer.SLOVENCI_FILENAME;
                break;
            }

            case(R.id.crnogorci_navigation):{
                fileName = JSONSerializer.CRNOGORCI_FILENAME;
                break;
            }


        }

        return serializer.loadCategory(fileName);

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

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("onPause", "On Pause called...");

    }

    public void incrementAndSaveVisitsForContentActivity() {

        SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        mGlobalState.setNumOfVisitsContent(prefs.getInt("counter2FirstUpdate", 0) + 1);


        editor.putInt("counter2FirstUpdate", mGlobalState.getNumOfVisitsContent());
        editor.commit();


    }

    public int numOfVisitsForContentActivity() {

        SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        mGlobalState.setNumOfVisitsContent(prefs.getInt("counter2FirstUpdate", 0));

        return mGlobalState.getNumOfVisitsContent();
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        incrementAndSaveVisitsForContentActivity();
    }



    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate();
        return super.onCreateOptionsMenu(menu);
    }*/
}
