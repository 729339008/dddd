package com.example.mechrev.day08_zhongdazaixian.app;

import android.app.Application;

import com.example.mechrev.day08_zhongdazaixian.base.BaseActivity;
import com.example.mechrev.day08_zhongdazaixian.base.BaseFragment;

/**
 * Created by MECHREV on 2017/11/27.
 */

public class App extends Application {

    public static BaseActivity baseActivity;

    public static BaseFragment mLastFragment;
}
