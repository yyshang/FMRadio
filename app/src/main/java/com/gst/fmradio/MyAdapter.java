package com.gst.fmradio;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by yu on 2015/7/22.
 */

public class MyAdapter extends FragmentPagerAdapter {
    public static final int[] TITLES = new int[]{R.drawable.avatar_one, R.drawable.avatar_two, R.drawable.avatar_three, R.drawable.avatar_four, R.drawable.avatar_five};
    int mCount;

    public MyAdapter(FragmentManager fm) {
        super(fm);
        mCount = TITLES.length;

    }


    @Override
    public int getItemPosition(Object object) {

        return super.getItemPosition(object);
    }

    @Override
    public Fragment getItem(int arg0) {
        if (arg0 >= TITLES.length) {
            arg0 = arg0 % TITLES.length;
            mCount++;
        }
        if (arg0 < 0) {
            arg0 = -arg0;
            mCount--;
        }
        PageFragment fragment = new PageFragment();
        fragment.newInstance(arg0);
        Log.e("arg0", "arg0:" + arg0);
        return fragment;
    }

    @Override
    public int getCount() {

        return Integer.MAX_VALUE;
    }


}
