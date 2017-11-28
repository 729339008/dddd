package com.example.mechrev.day08_zhongdazaixian.base;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mechrev.day08_zhongdazaixian.utils.TUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment<P extends BasePresenter, M extends BaseModel> extends Fragment {

    private View view;

    private P mPresenter;

    private M mModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mPresenter = TUtils.getT(this,0);

        mModel = TUtils.getT(this,1);

        if (this instanceof BaseView){

            mPresenter.setVM(mModel,this);
        }


        view = inflater.inflate(getLayoutFragment(), container, false);

        initView(view);

        initData();

        return view;
    }

    protected abstract void initData();

    protected abstract void initView(View view);

    protected abstract int getLayoutFragment();

}
