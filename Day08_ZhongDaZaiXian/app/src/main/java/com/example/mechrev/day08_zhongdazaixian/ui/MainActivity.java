package com.example.mechrev.day08_zhongdazaixian.ui;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.example.mechrev.day08_zhongdazaixian.R;
import com.example.mechrev.day08_zhongdazaixian.adapter.MyPagerAdapter;
import com.example.mechrev.day08_zhongdazaixian.base.BaseActivity;
import com.example.mechrev.day08_zhongdazaixian.base.BaseModel;
import com.example.mechrev.day08_zhongdazaixian.base.BasePresenter;
import com.example.mechrev.day08_zhongdazaixian.fragment.HuoDongFragment;
import com.example.mechrev.day08_zhongdazaixian.fragment.JiuYeFragment;
import com.example.mechrev.day08_zhongdazaixian.fragment.KeTangFragment;
import com.example.mechrev.day08_zhongdazaixian.fragment.TouTiaoFragment;
import com.example.mechrev.day08_zhongdazaixian.fragment.XiaoYuanFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity  <BasePresenter, BaseModel> implements View.OnClickListener{

    private List<Fragment> mLists = new ArrayList<>();

    private List<String> mTitle = new ArrayList<>();

    private TabLayout mTabLayout;

    private Button mBtn;

    private ViewPager mViewPger;

    private MyPagerAdapter myPagerAdapter;

    private TouTiaoFragment touTiaoFragment;

    private XiaoYuanFragment xiaoYuanFragment;

    private JiuYeFragment jiuYeFragment;

    private HuoDongFragment huoDongFragment;

    private KeTangFragment keTangFragment;


    @Override
    protected void initView() {

        mTabLayout = (TabLayout) findViewById(R.id.TabLayout);

        mViewPger = (ViewPager) findViewById(R.id.ViewPager);

        mBtn = (Button) findViewById(R.id.Btn);

        mBtn.setOnClickListener(this);

        touTiaoFragment = new TouTiaoFragment();

        xiaoYuanFragment = new XiaoYuanFragment();

        keTangFragment = new KeTangFragment();

        jiuYeFragment = new JiuYeFragment();

        huoDongFragment = new HuoDongFragment();

        mLists.add(touTiaoFragment);

        mLists.add(xiaoYuanFragment);

        mLists.add(jiuYeFragment);

        mLists.add(keTangFragment);

        mLists.add(huoDongFragment);

        mTitle.add("头条");

        mTitle.add("校园");

        mTitle.add("就业");

        mTitle.add("课堂");

        mTitle.add("活动");

        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),mLists,mTitle);

        mViewPger.setAdapter(myPagerAdapter);

        mTabLayout.setupWithViewPager(mViewPger);
    }

    @Override
    protected int getLayoutId() {

        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case  R.id.Btn:

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                startActivity(intent);

                break;
        }
    }
}
