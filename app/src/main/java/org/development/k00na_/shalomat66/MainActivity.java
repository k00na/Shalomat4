package org.development.k00na_.shalomat66;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.k00na_.shalomat4.R;

import org.development.k00na_.shalomat66.Util.WellcomingDialog;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import org.development.k00na_.shalomat66.Fragments.ListOfJokesFragment;
import org.development.k00na_.shalomat66.Model.GlobalState;
import org.development.k00na_.shalomat66.Util.CreateFilesForCategories;
import org.development.k00na_.shalomat66.Util.JSONSerializer;
import com.michael.easydialog.EasyDialog;

import org.json.JSONException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;

    private GlobalState globalState;
    private Toolbar mToolbar;
    public int selectedCategoryNum;

    private AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adView = (AdView) this.findViewById(R.id.adViewYoYo);

        AdRequest adRequest = new AdRequest.Builder()
                .build()
                ;
        adView.loadAd(adRequest);


        globalState = (GlobalState)getApplicationContext();


        setupViews();
        navigationListener();
        actionBarDrawerToggleSetup();

        CreateFilesForCategories createFiles = new CreateFilesForCategories(this);
        JSONSerializer serializer = new JSONSerializer(this);

        if (numOfVisits() == 0) {

            WellcomingDialog wellcomingDialog = new WellcomingDialog();
            wellcomingDialog.show(getSupportFragmentManager(), "wellcome");

            try {
                createFiles.createAllJokes();
                serializer.createVsiViciCategory();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            displayListOfJokes(R.id.nakljucni_navigation);

            mDrawerLayout.openDrawer(Gravity.LEFT);

            mDrawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {
                @Override
                public void onDrawerSlide(View drawerView, float slideOffset) {

                }

                @Override
                public void onDrawerOpened(View drawerView) {

                }

                @Override
                public void onDrawerClosed(View drawerView) {



                  //  easyDialogWellcomeAnimation();
                    incrementAndSaveVisits();

                }

                @Override
                public void onDrawerStateChanged(int newState) {

                }
            });





        }

        else{
            displayListOfJokes(R.id.nakljucni_navigation);
            incrementAndSaveVisits();
        }




        navigationListener();



    }


    private void setupViews() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.ourDrawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.navigationView);
        mToolbar = (Toolbar)findViewById(R.id.includeappbar);
        setSupportActionBar(mToolbar);
    }

    private void navigationListener(){

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                if (menuItem.isChecked())
                    menuItem.setChecked(false);
                else
                    menuItem.setChecked(true);

                mDrawerLayout.closeDrawers();

                switch (menuItem.getItemId()) {


                    case (R.id.blondinke_navigation): {


                        try {
                            setupToolbarTitle(R.id.blondinke_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        displayListOfJokes(R.id.blondinke_navigation);

                        return true;
                    }

                    case (R.id.crnihumor_navigation): {

                        try {
                            setupToolbarTitle(R.id.crnihumor_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.crnihumor_navigation);

                        return true;
                    }

                    case (R.id.gostilniske_navigation): {

                        try {
                            setupToolbarTitle(R.id.gostilniske_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.gostilniske_navigation);
                        return true;
                    }

                    case (R.id.janezek_navigation): {

                        try {
                            setupToolbarTitle(R.id.janezek_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.janezek_navigation);
                        return true;
                    }
                    case (R.id.shranjeni_navigation): {
                        JSONSerializer serializer = new JSONSerializer(getApplicationContext());
                        try {
                            if (serializer.loadCategory(JSONSerializer.PRILJUBLJENI_FILENAME).size() == 0)
                                Toast.makeText(getApplicationContext(), "Prazna kategorija", Toast.LENGTH_LONG).show();
                            else {

                                try {
                                    setupToolbarTitle(R.id.shranjeni_navigation);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                displayListOfJokes(R.id.shranjeni_navigation);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return true;
                    }


                    case (R.id.mujohaso_navigation): {

                        try {
                            setupToolbarTitle(R.id.mujohaso_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.mujohaso_navigation);
                        return true;
                    }

                    case (R.id.policaji_navigation): {

                        try {
                            setupToolbarTitle(R.id.policaji_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.policaji_navigation);
                        return true;
                    }

                    case (R.id.tvojamama_navigation): {
                        try {
                            setupToolbarTitle(R.id.tvojamama_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.tvojamama_navigation);
                        return true;
                    }


                    case (R.id.yugovici_navigation): {
                        try {
                            setupToolbarTitle(R.id.yugovici_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.yugovici_navigation);
                        return true;

                    }
                    case (R.id.nakljucni_navigation): {
                        try {
                            setupToolbarTitle(R.id.nakljucni_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.nakljucni_navigation);
                        return true;
                    }
                    case (R.id.opolzke_navigation): {
                        try {
                            setupToolbarTitle(R.id.opolzke_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.opolzke_navigation);
                        return true;
                    }

                    case (R.id.srbi_navigation): {
                        try {
                            setupToolbarTitle(R.id.srbi_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.srbi_navigation);
                        return true;
                    }

                    case (R.id.hrvati_navigation): {
                        try {
                            setupToolbarTitle(R.id.hrvati_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.hrvati_navigation);
                        return true;
                    }

                    case (R.id.crnogorci_navigation): {
                        try {
                            setupToolbarTitle(R.id.crnogorci_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.crnogorci_navigation);
                        return true;
                    }

                    case (R.id.slovenci_navigation): {
                        try {
                            setupToolbarTitle(R.id.slovenci_navigation);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        displayListOfJokes(R.id.slovenci_navigation);
                        return true;
                    }

                    default: {
                        Toast.makeText(getApplicationContext(), "No such category...", Toast.LENGTH_LONG).show();
                        return true;
                    }

                }


            }


        });


    }

    private void actionBarDrawerToggleSetup(){

        ActionBarDrawerToggle toggler = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.drawerOpen, R.string.drawerClosed){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);


                invalidateOptionsMenu();


            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

                invalidateOptionsMenu();
            }
        };

        mDrawerLayout.setDrawerListener(toggler);
        toggler.syncState();

    }

    private String setupSpacesForMenu(String title){

        int titLen = title.length();

        while(titLen < 22){
           title = title.concat("_");
            titLen++;
        }

        return title;

    }

    private void setupToolbarTitle(int categoryID) throws IOException {

        JSONSerializer serializer = new JSONSerializer(this);

        switch(categoryID){
            case(R.id.blondinke_navigation):{
                getSupportActionBar().setTitle(getString(R.string.blondinkeNav) + " [" + serializer.loadCategory(JSONSerializer.BLONDINKE_FILENAME).size() + " vicev]");

                break;
            }
            case(R.id.opolzke_navigation):{

                getSupportActionBar().setTitle(getString(R.string.opolzkeNav) + " [" + serializer.loadCategory(JSONSerializer.OPOLZKE_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.policaji_navigation):{

                getSupportActionBar().setTitle(getString(R.string.policajiNav) + " [" + serializer.loadCategory(JSONSerializer.POLICAJI_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.tvojamama_navigation):{

                getSupportActionBar().setTitle(getString(R.string.tvojaMamaNav) + " [" + serializer.loadCategory(JSONSerializer.TVOJAMAMA_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.gostilniske_navigation):{

                getSupportActionBar().setTitle(getString(R.string.gostilniskeNav) + " [" + serializer.loadCategory(JSONSerializer.GOSTILNSIKE_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.janezek_navigation):{

                getSupportActionBar().setTitle(getString(R.string.janezNav) + " [" + serializer.loadCategory(JSONSerializer.JANEZEK_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.mujohaso_navigation):{

                getSupportActionBar().setTitle(getString(R.string.mujohasoNav) + " [" + serializer.loadCategory(JSONSerializer.MUJOHASO_FILENAME).size()+ " vicev]");
                break;
            }
            case(R.id.crnihumor_navigation):{

                getSupportActionBar().setTitle(getString(R.string.crnihumorNav) + " [" + serializer.loadCategory(JSONSerializer.CRNIHUMOR_FILENAME).size() + " vicev]");
                break;
            }

            case(R.id.yugovici_navigation):{

                getSupportActionBar().setTitle(getString(R.string.yugoviciNav) + " [" + serializer.loadCategory(JSONSerializer.YUGO_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.shranjeni_navigation):{

                getSupportActionBar().setTitle(getString(R.string.pribljubljeniNav) + " [" + serializer.loadCategory(JSONSerializer.PRILJUBLJENI_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.nakljucni_navigation):{

                getSupportActionBar().setTitle(getString(R.string.nakljucniVici) + " [" + serializer.loadCategory(JSONSerializer.VSIVICI_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.hrvati_navigation):{
                getSupportActionBar().setTitle(getString(R.string.hrvatiNav) + " [" + serializer.loadCategory(JSONSerializer.HRVATI_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.srbi_navigation):{
                getSupportActionBar().setTitle(getString(R.string.srbiNav) + " [" + serializer.loadCategory(JSONSerializer.SRBI_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.slovenci_navigation):{
                getSupportActionBar().setTitle(getString(R.string.slovenciNav) + " [" + serializer.loadCategory(JSONSerializer.SLOVENCI_FILENAME).size() + " vicev]");
                break;
            }
            case(R.id.crnogorci_navigation):{
                getSupportActionBar().setTitle(getString(R.string.crnogorciNav) + " [" + serializer.loadCategory(JSONSerializer.CRNOGORCI_FILENAME).size() + " vicev]");
                break;
            }
        }

        // yoyo
    }

    public int numOfVisits() {

        SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        globalState.setNumOfVisits(prefs.getInt("counter", 0));

        return globalState.getNumOfVisits();
    }

    public void incrementAndSaveVisits() {

        SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        globalState.setNumOfVisits(prefs.getInt("counter", 0) + 1);


        editor.putInt("counter", globalState.getNumOfVisits());
        editor.commit();
//

    }

    private void displayListOfJokes(int menuItemID){

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ListOfJokesFragment.newInstance(menuItemID, getSupportActionBar().getTitle().toString()))
                .addToBackStack(null)
                .commit();

    }


    private void easyDialogWellcomeAnimation(){


        new EasyDialog(MainActivity.this)
                .setLayoutResourceId(R.layout.easydialog_recycler_notify)
                .setGravity(EasyDialog.GRAVITY_BOTTOM)
                .setBackgroundColor(MainActivity.this.getResources().getColor(R.color.background_color_black))
                .setLocationByAttachedView(mToolbar)
               // .setLocation(yo)
                .setAnimationTranslationShow(20, 350, 400, 0)
                .setAnimationTranslationDismiss(70, 350, 0, 400)
                .setTouchOutsideDismiss(true)
                .setMatchParent(false)
                .setMarginLeftAndRight(24, 24)
              //  .setOutsideColor(MainActivity.this.getResources().getColor(R.color.accentColor))
                .show();


    }


}
