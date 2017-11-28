package com.example.mechrev.day08_zhongdazaixian.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by MECHREV on 2017/11/27.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mLists;

    private List<String> mTitle;

    public MyPagerAdapter(FragmentManager fm,List<Fragment> mLists,List<String> mTitle) {
        super(fm);
        this.mTitle = mTitle;
        this.mLists = mLists;
    }

    @Override
    public Fragment getItem(int position) {
        return mLists.get(position);
    }

    @Override
    public int getCount() {
        return mLists.isEmpty()?0:mLists.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }
}
