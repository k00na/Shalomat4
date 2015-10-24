package org.development.k00na_.shalomat66;

import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.development.k00na_.shalomat66.Adapters.VsiViciAdapter;
import org.development.k00na_.shalomat66.Parse.VsiVici;
import org.development.k00na_.shalomat66.Util.Constants;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import org.development.k00na_.shalomat66.Model.GlobalState;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private NavigationView mNavigationView;

    private GlobalState globalState;

    public int selectedCategoryNum;
    private String mCurrentCategory;
    private List<VsiVici> mVsiViciListRandomized;
    private List<VsiVici> mVsiViciListNewest;
    private List<VsiVici> mVsiViciListBest;

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
    private ViewPagerAdapter mTabsAdapter;

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
        mTabsAdapter = new ViewPagerAdapter(getSupportFragmentManager(), "VsiVici");
        mTabLayout.setTabsFromPagerAdapter(mTabsAdapter);




        mViewPager = (ViewPager)findViewById(R.id.view_pager);

        mViewPager.setAdapter(mTabsAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));


/**
 *


        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {



                mCurrentCategory = "VsiVici";

                if(tab.getPosition() == 0){

                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, FragmentThingy.newInstance(tab.getPosition(), mCurrentCategory))
                            .commit();


                }
                if(tab.getPosition() == 1){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, FragmentThingy.newInstance(tab.getPosition(), mCurrentCategory))
                            .commit();
                }

                if(tab.getPosition() == 2){

                    // TEST:
                    // poskrbi, da bo view pager-ju nastavljen VsiViciAdapter
                    // 1. dobi vice z Parse-a v List<VsiVici>
                    // 2. naredi VsiViciAdapter objekt
                    // 3. podaj ta adapter objekt viewPager-ju


                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_container, FragmentThingy.newInstance(tab.getPosition(), mCurrentCategory))
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

 */



        setupDrawerToggle();




    }


    /*
     *  INNER CLASS :VIEW PAGERS ADAPTER
     */

    public class ViewPagerAdapter extends FragmentStatePagerAdapter{

        private String selectedCategory;
        private String[] titles = {"VSI", "NOVO", "NAKLJUČNI"};

        public ViewPagerAdapter(FragmentManager fm, String selCat) {
            super(fm);

            selectedCategory = selCat;
        }

        @Override
        public Fragment getItem(int position) {
            return FragmentThingy.newInstance(position, selectedCategory);
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }

    /**
     *      FRAGMENT THINGY
     */


    public static class FragmentThingy extends Fragment{



        final ParseQuery<VsiVici> parseQuery = new ParseQuery("VsiVici");
        int mTabNum = 0;
        String mSelectedCat = "VsiVici";
        private List<VsiVici> trenutniVici_List;
        private RecyclerView fragmentRecycler;

        // variables for getAllObjects method
        int skip = 0;
        int limit = 1000;


        public FragmentThingy(){

        }

        public static FragmentThingy newInstance(int tabNum, String selectedCategory){

            Bundle args = new Bundle();
            args.putInt(Constants.TABNUM, tabNum);
            args.putString(Constants.SELECTED_CAT, selectedCategory);

            FragmentThingy fragmentThingy = new FragmentThingy();
            fragmentThingy.setArguments(args);

            return fragmentThingy;
        }


        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            trenutniVici_List = new ArrayList<>();

            mSelectedCat = getArguments().getString(Constants.SELECTED_CAT);
            mTabNum = getArguments().getInt(Constants.TABNUM);
            fragmentRecycler = new RecyclerView(getActivity());
            LinearLayoutManager llm = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
            fragmentRecycler.setLayoutManager(llm);

      //      fetchDataFromParse("VsiVici", mTabNum);

            // TEST BELLOW:


            parseQuery.setLimit(1000);
          //  parseQuery.whereEqualTo(Constants.PARSE_CATEGORY_COLUMN, mSelectedCat);

            if(mTabNum == 1)
                parseQuery.orderByAscending(Constants.PARSE_CREATEDAT_COL);
            if(mTabNum == 2)
                parseQuery.orderByDescending(Constants.PARSE_NUMOFLIKES_COL);

            parseQuery.findInBackground(getAllObjects());



            return fragmentRecycler;
        }

        private void fetchDataFromParse(String categoryName, final int mode){

            // če bo kategory name samo dummy String kot npr "" bom query vrnil vse vici
            // če bo kategory name npr. "blondinke.json" bomo query-ju dodali where clause za kategorijo

            final ParseQuery<VsiVici> query = ParseQuery.getQuery(categoryName);

            if(mode == 1)
                query.addDescendingOrder("createdAt");
            if(mode == 2)
                query.addDescendingOrder("numOfLikes");

            query.setLimit(1000);
            query.findInBackground(new FindCallback<VsiVici>() {
                @Override
                public void done(List<VsiVici> list, ParseException e) {

                    // load more jokes if size exceeds 1000
                    if (list.size() == 1000) {

                        query.setSkip(1000);
                        query.findInBackground(new FindCallback<VsiVici>() {
                            @Override
                            public void done(List<VsiVici> list, ParseException e) {

                                if (mode == 0) {
                                    Collections.shuffle(list);
                                    GlobalState.getmVsiViciListRandomized().addAll(list);

                                }
                            }
                        });

                    }

                    if (mode == 0) {
                        Collections.shuffle(list);
                        GlobalState.setmVsiViciListRandomized(list);

                    }


                    if (mode == 1)
                        GlobalState.setmVsiViciListNewest(list);

                    if (mode == 2)
                        GlobalState.setmVsiViciListBest(list);

                    Toast.makeText(getActivity(), "List size: " + list.size(), Toast.LENGTH_LONG).show();


                    trenutniVici_List.addAll(list);

                    VsiViciAdapter vsiViciAdapter = new VsiViciAdapter(getActivity(), trenutniVici_List);
                    fragmentRecycler.setAdapter(vsiViciAdapter);

                }
            });

        }   // <--- END OF fetchDataFromParse




        FindCallback<VsiVici> getAllObjects(){


            return new FindCallback<VsiVici>() {
                @Override
                public void done(List<VsiVici> list, ParseException e) {

                    if(e == null){

                        trenutniVici_List.addAll(list);

                        if(list.size() == limit){
                            skip = skip + limit;
                            parseQuery.setSkip(skip);
                            parseQuery.setLimit(limit);
                            parseQuery.findInBackground(getAllObjects());

                        }
                        else {
                            VsiViciAdapter vsiViciAdapter = new VsiViciAdapter(getActivity(), trenutniVici_List);
                            fragmentRecycler.setAdapter(vsiViciAdapter);
                        }

                    } else {
                        Toast.makeText(getActivity(), "Nešto vent narobe.", Toast.LENGTH_LONG).show();

                    }
                    Toast.makeText(getActivity(), "getAllObjects listSize = " + trenutniVici_List.size(), Toast.LENGTH_LONG).show();

                }
            };


        }

    } // < --- END OF FRAGMENT THINGY




    /**
     * MainActivity methods:
     */



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
