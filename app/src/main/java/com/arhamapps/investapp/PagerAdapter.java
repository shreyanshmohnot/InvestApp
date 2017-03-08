package com.arhamapps.investapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

//Extending FragmentStatePagerAdapter
public class PagerAdapter extends FragmentStatePagerAdapter {
    ViewPager viewPager;
    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public PagerAdapter(FragmentManager fm, int tabCount, ViewPager viewPager) {
        super(fm);
        //Initializing tab count
        this.tabCount = tabCount;
        this.viewPager = viewPager;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                LoginFragment logintab = new LoginFragment(viewPager);
                return logintab;
            case 1:
                SignupFragment signuptab = new SignupFragment();
                return signuptab;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
