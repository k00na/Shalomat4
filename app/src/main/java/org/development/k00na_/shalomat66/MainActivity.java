package org.development.k00na_.shalomat66;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
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
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.development.k00na_.shalomat66.Activities.AddJokeActivity;
import org.development.k00na_.shalomat66.Activities.LoginActivity;
import org.development.k00na_.shalomat66.Adapters.VsiViciAdapter;
import org.development.k00na_.shalomat66.Fragments.AddJokeDialog;
import org.development.k00na_.shalomat66.Parse.VsiVici;
import org.development.k00na_.shalomat66.Util.Constants;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import org.development.k00na_.shalomat66.Model.GlobalState;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    private static CollapsingToolbarLayout mCollapsingToolbarLayout;

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private ViewPager mViewPager;
    private ViewPagerAdapter mTabsAdapter;
    public FloatingActionButton FAB;

    private AdView adView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setupAdView();
        printOutHashKey();

        globalState = (GlobalState)getApplicationContext();

        mCoordinator = (CoordinatorLayout) findViewById(R.id.root_coordinator);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.ourDrawerLayout);
        mNavigationView = (NavigationView)findViewById(R.id.navigationView);
        mToolbar = (Toolbar) findViewById(R.id.app_bar);
        FAB = (FloatingActionButton)findViewById(R.id.FAB_xml);


        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // If the user is signed in, take him to the AddJokeActivity
                // If the user is not signed in show him a MaterialDialog that promts him to go to the LoginActivity

                if(ParseUser.getCurrentUser() != null){
                    Intent intent = new Intent(MainActivity.this, AddJokeActivity.class);
                    startActivity(intent);
                } else {
                   new MaterialDialog.Builder(MainActivity.this)
                            .title("Prijava")
                            .content("Za dodajanje vicev v Šalomatu je potrebno ustvariti uporabniški račun.")
                            .positiveText("Ustvari")
                            .negativeText("Opusti")
                           .onPositive(new MaterialDialog.SingleButtonCallback() {
                               @Override
                               public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                                   Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                                   startActivity(intent);
                               }
                           })
                            .show();


                }

            }
        });


        setSupportActionBar(mToolbar);


        mCurrentCategory = Constants.VSI_VICI;


        mTabLayout = (TabLayout)findViewById(R.id.tab_layout);
        mTabsAdapter = new ViewPagerAdapter(getSupportFragmentManager(), mCurrentCategory);
        mTabLayout.setTabsFromPagerAdapter(mTabsAdapter);
        mViewPager = (ViewPager)findViewById(R.id.view_pager);
        mViewPager.setAdapter(mTabsAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));


        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                handleNavigationClicks(menuItem.getItemId());

                return true;
            }
        });


        setupDrawerToggle();



    } // <-- END of onCreate()



    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        menu.clear();

        getMenuInflater().inflate(R.menu.options_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.vpisItem);



        if(ParseUser.getCurrentUser() != null)
            menuItem.setTitle("Izpis");
        else if (ParseUser.getCurrentUser() == null)
            menuItem.setTitle("Vpis");

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.vpisItem && ParseUser.getCurrentUser() == null){
            Intent openLogin = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(openLogin);
        } else if(item.getItemId() == R.id.vpisItem && ParseUser.getCurrentUser() != null)
            ParseUser.getCurrentUser().logOut();


        return super.onOptionsItemSelected(item);
    }



    /////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * MainActivity custom methods:
     */


    private void printOutHashKey(){
        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "org.development.k00na_.shalomat66",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }
    }

    private void handleNavigationClicks(int itemID){


        switch(itemID){

            case(R.id.blondinke_navigation):
                mCurrentCategory = Constants.BLONDINKE;
                setupTabsAndViewPager();
                break;

            case(R.id.opolzke_navigation):
                mCurrentCategory = Constants.OPOLZKI;
                setupTabsAndViewPager();
                break;

            case(R.id.policaji_navigation):
                mCurrentCategory = Constants.POLICAJI;
                setupTabsAndViewPager();
                break;
                /*
            case(R.id.tvojamama_navigation):
                mCurrentCategory = Constants.TVOJAMAMA;
                setupTabsAndViewPager();
                break;
                */

            case(R.id.gostilniske_navigation):
                mCurrentCategory = Constants.GOSTILNISKI;
                setupTabsAndViewPager();
                break;

            case(R.id.janezek_navigation):
                mCurrentCategory = Constants.JANEZEK;
                setupTabsAndViewPager();
                break;

            case(R.id.crnihumor_navigation):
                mCurrentCategory = Constants.CRNIHUMOR;
                setupTabsAndViewPager();
                break;

            case(R.id.yugovici_navigation):
                mCurrentCategory = Constants.YUGOVICI;
                setupTabsAndViewPager();
                break;


            // NACIONALNI
            case(R.id.crnogorci_navigation):
                mCurrentCategory = Constants.CRNOGORCI;
                setupTabsAndViewPager();
                break;

            case(R.id.mujohaso_navigation):
                mCurrentCategory = Constants.MUJOHASO;
                setupTabsAndViewPager();
                break;

            case(R.id.hrvati_navigation):
                mCurrentCategory = Constants.HRVATI;
                setupTabsAndViewPager();
                break;

            case(R.id.slovenci_navigation):
                mCurrentCategory = Constants.SLOVENCI;
                setupTabsAndViewPager();
                break;

            case(R.id.srbi_navigation):
                mCurrentCategory = Constants.SRBI;
                setupTabsAndViewPager();
                break;


            // ANGLEŠKI
            case(R.id.yomomma_navigation):
                mCurrentCategory = Constants.YOMOMMA;
                setupTabsAndViewPager();
                break;

            case(R.id.blondes_navigation):
                mCurrentCategory = Constants.BLONDES;
                setupTabsAndViewPager();
                break;

            case(R.id.sexrelated_navigation):
                mCurrentCategory = Constants.SEXRELATED;
                setupTabsAndViewPager();
                break;

            case(R.id.wordplay_navigation):
                mCurrentCategory = Constants.WORDPLAY;
                setupTabsAndViewPager();
                break;

        }

    }

    private void setupTabsAndViewPager(){

        mTabsAdapter = new ViewPagerAdapter(getSupportFragmentManager(), mCurrentCategory);
        mTabLayout.setTabsFromPagerAdapter(mTabsAdapter);
        mViewPager.setAdapter(mTabsAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

    }


    private void setupDrawerToggle() {

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
    }

    private void setupAdView() {
/*
        adView = (AdView) this.findViewById(R.id.adViewYoYo);

        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build()
                ;
        adView.loadAd(adRequest);
        */
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *  INNER CLASS :VIEW PAGERS ADAPTER
     */

    public class ViewPagerAdapter extends FragmentStatePagerAdapter{

        private String selectedCategory;
        private String[] titles = {"Naključni", "Novi", "Najboljši"};

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
    } // <- END OF ViewPagerAdapter

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *      FRAGMENT THINGY
     */


    public static class FragmentThingy extends Fragment{



        final ParseQuery<VsiVici> parseQuery = new ParseQuery("VsiVici");
        int mTabNum = 0;
        String mSelectedCat = "VsiVici";
        private List<VsiVici> trenutniVici_List;
        private RecyclerView fragmentRecycler;
        ProgressDialog progressDialog;
        private CollapsingToolbarLayout mCollapsingToolbarLayout;

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


            progressDialog = new ProgressDialog(getActivity());
            progressDialog.setMessage("Nalagam vice...");


            parseQuery.setLimit(1000);
          //  parseQuery.whereEqualTo(Constants.PARSE_CATEGORY_COLUMN, mSelectedCat);

            if(mTabNum == 1)
                parseQuery.orderByAscending(Constants.PARSE_CREATEDAT_COL);
            if(mTabNum == 2)
                parseQuery.orderByDescending(Constants.PARSE_NUMOFLIKES_COL);

            // TODO: might have to change "VsiVici" to "Vici"
            if(!mSelectedCat.equals("VsiVici"))
                parseQuery.whereContains("category", mSelectedCat);

            parseQuery.findInBackground(getAllObjects());



            return fragmentRecycler;
        }

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
                            progressDialog.show();
                        }
                        else {
                            progressDialog.dismiss();
                            if(mTabNum == 0)
                                Collections.shuffle(trenutniVici_List);

                            VsiViciAdapter vsiViciAdapter = new VsiViciAdapter(getActivity(), trenutniVici_List);
                            fragmentRecycler.setAdapter(vsiViciAdapter);

                        }

                    } else {
                        Toast.makeText(getActivity(), "Nešto vent narobe." + e.toString(), Toast.LENGTH_LONG).show();
                        progressDialog.cancel();

                    }

                }
            };


        }

    } // < --- END OF FRAGMENT THINGY

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////





}
