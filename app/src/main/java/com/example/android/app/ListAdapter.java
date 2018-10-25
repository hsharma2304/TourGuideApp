package com.example.android.app;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ListAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public ListAdapter(Context context, FragmentManager fm) {

        super(fm);

        mContext = context;

    }
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {

            return new KashmirFragment();

        } else if (position == 1){

            return new RishikeshFragment();

        } else if (position == 2){

            return new NainitalFragment();

        } else {

            return new KeralaFragment();

        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {

            return mContext.getString(R.string.category_kashmir);

        } else if (position == 1) {

            return mContext.getString(R.string.category_rishikesh);

        } else if (position == 2) {

            return mContext.getString(R.string.category_naini);

        } else {

            return mContext.getString(R.string.category_kerala);

        }

    }

}

