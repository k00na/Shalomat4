package org.development.k00na_.shalomat66;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import org.development.k00na_.shalomat66.Adapters.TabsPagerAdapter;
import org.development.k00na_.shalomat66.Fragments.ListOfJokesFragment;
import org.development.k00na_.shalomat66.Util.WellcomingDialog;

import com.flurry.android.FlurryAgent;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import org.development.k00na_.shalomat66.Model.GlobalState;

import com.michael.easydialog.EasyDialog;

import org.json.JSONException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    private NavigationView mNavigationView;

    private GlobalState globalState;

    public int selectedCategoryNum;
    private String mCurrentCategory;

    /*
     *  WIDGETS DOWN-BELLOW
     */

    // Need this to link with the Snackbar
    private CoordinatorLayout mCoordinator;
    //Need this to set the title of the app bar
    private CollapsingToolbarLayout mCollapsingToolbarLayout;

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private ViewPager mViewPager;
    private TabsPagerAdapter mTabsAdapter;

    private AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupAdView();


        globalState = (GlobalState)getApplicationContext();

        mCoordinator = (CoordinatorLayout) findViewById(R.id.root_coordinator);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.ourDrawerLayout);

        mToolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(mToolbar);

        mTabLayout = (TabLayout)findViewById(R.id.tab_layout);
        mTabsAdapter = new TabsPagerAdapter(getSupportFragmentManager(), MainActivity.this, "justTesting");
        mTabLayout.setTabsFromPagerAdapter(mTabsAdapter);


        mViewPager = (ViewPager)findViewById(R.id.view_pager);

        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                /**
                 * TODO: naredi metodo, ki bo hendlala še ostale kategorije
                 * Zanekrat imam samo VsiVici kategorijo.
                 */

                mCurrentCategory = "VsiVici";

                if(tab.getPosition() == 0){

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, ListOfJokesFragment.newInstance(mCurrentCategory, tab.getPosition()))
                            .commit();


                }
                if(tab.getPosition() == 1){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, ListOfJokesFragment.newInstance(mCurrentCategory, tab.getPosition()))
                            .commit();
                }

                if(tab.getPosition() == 2){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, ListOfJokesFragment.newInstance(mCurrentCategory, tab.getPosition()))
                            .commit();
                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        setupDrawerToggle();




    }

    private void setupDrawerToggle() {

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
    }

    private void setupAdView() {

        adView = (AdView) this.findViewById(R.id.adViewYoYo);

        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build()
                ;
        adView.loadAd(adRequest);
    }


}
