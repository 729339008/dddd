package com.example.mechrev.day08_zhongdazaixian.fragment;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.mechrev.day08_zhongdazaixian.R;
import com.example.mechrev.day08_zhongdazaixian.adapter.MyJiuYe_Banner_Adapter;
import com.example.mechrev.day08_zhongdazaixian.base.BaseFragment;
import com.example.mechrev.day08_zhongdazaixian.bean.JiuYeBean;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class JiuYeFragment extends BaseFragment {

    private Banner mBanner;

    private List<String> mList = new ArrayList<>();

    private MyJiuYe_Banner_Adapter mAdapter;

    private List<JiuYeBean.DataBean> mLists = new ArrayList<>();

    @Override
    protected void initData() {



    }

    @Override
    protected void initView(View view) {

        mBanner = view.findViewById(R.id.Banner);

        mList.add("http://upload.univs.cn/2017/0424/1493040123828.jpg");

        mList.add("http://upload.univs.cn/2017/0424/thumb_640_314_1493022268406.jpg");

        mList.add("http://upload.univs.cn/2017/0417/thumb_640_314_1492433907753.png");

        mBanner.setImages(mLists)
                .setDelayTime(2000)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
                .setImageLoader(new GlideImage())
                .setIndicatorGravity(BannerConfig.CENTER)
                .start();

        mAdapter = new MyJiuYe_Banner_Adapter(mLists,getActivity());



    }

    @Override
    protected int getLayoutFragment()  {

        return R.layout.fragment_jiu_ye;
    }

    public class GlideImage extends ImageLoader {

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context.getApplicationContext()).load(path).into(imageView);
        }

    }
}
