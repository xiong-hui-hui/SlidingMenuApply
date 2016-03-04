package com.example.tozc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/2/28.
 */
public class MyAdapt extends FragmentPagerAdapter {

    List<Fragment> lists;
    public MyAdapt(FragmentManager fm,List<Fragment>lists) {
        super(fm);
        this.lists=lists;
    }

    @Override
    public Fragment getItem(int i) {
        return lists.get(i);
    }

    @Override
    public int getCount() {
        return lists.size();
    }
    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

}
