package org.development.k00na_.shalomat66.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import org.development.k00na_.shalomat66.Fragments.ListOfJokesFragment;

/**
 * Created by k00na_ on 19.10.2015.
 */
public class TabsPagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;
    private String mCategory;
    private String[] tabTitles = {"Vsi", "Novo", "Najboljši"};


    public TabsPagerAdapter(FragmentManager fm, Context c, String selectedCat) {
        super(fm);
        mContext = c;
        mCategory = selectedCat;
    }

    @Override
    public Fragment getItem(int position) {
        return ListOfJokesFragment.newInstance(mCategory, position);
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
