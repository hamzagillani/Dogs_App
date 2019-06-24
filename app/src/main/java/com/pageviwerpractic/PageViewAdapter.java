package com.pageviwerpractic;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageViewAdapter extends FragmentPagerAdapter {
    public PageViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;

        switch (position){
            case 0:
                fragment=new Fragment_Dogs();
                break;
            case 1:
                fragment=new Fragment_Cat();
                break;
            case 2:
                fragment=new Fragment_Birds();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
