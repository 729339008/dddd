package com.example.mechrev.day08_zhongdazaixian;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.mechrev.day08_zhongdazaixian.app.App;
import com.example.mechrev.day08_zhongdazaixian.base.BaseFragment;

/**
 * Created by MECHREV on 2017/11/27.
 */

public class FragmentBuilder {

    private static volatile FragmentBuilder fragmentBuilder;

    private FragmentManager manager;

    private FragmentTransaction transaction;

    private Fragment fragment;

    private BaseFragment instance;

    public FragmentBuilder() {
    }

    public static FragmentBuilder getInstance() {

        if (fragmentBuilder == null) {

            synchronized (FragmentBuilder.class){

                fragmentBuilder = new FragmentBuilder();
            }
        }

        return fragmentBuilder;
    }

    public FragmentBuilder init(){

        manager = App.baseActivity.getSupportFragmentManager();

        transaction = manager.beginTransaction();

        return this;
    }

    public  FragmentBuilder add(int containerId,Class<? extends BaseFragment> fragmentClass){

        String tag = fragmentClass.getSimpleName();

        fragment = manager.findFragmentByTag(tag);

        if (fragment == null) {

            try {
                fragment = fragmentClass.newInstance();

                transaction.add(containerId,fragment,tag);


                transaction.addToBackStack(tag);

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        if (App.mLastFragment != null) {
            transaction.hide(App.mLastFragment);
        }

        return this;
    }

    public void Builder(){

        App.mLastFragment= (BaseFragment) fragment;

        transaction.commit();
    }
}
