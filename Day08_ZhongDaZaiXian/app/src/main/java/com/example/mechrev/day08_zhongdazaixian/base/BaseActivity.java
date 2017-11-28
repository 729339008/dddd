package com.example.mechrev.day08_zhongdazaixian.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mechrev.day08_zhongdazaixian.app.App;
import com.example.mechrev.day08_zhongdazaixian.utils.TUtils;

public abstract class BaseActivity <P extends BasePresenter, M extends BaseModel> extends AppCompatActivity  {

    public P mPresenter;

    public M mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        App.baseActivity = this;

        mPresenter = TUtils.getT(this,0);

        mModel = TUtils.getT(this,1);

        if (this instanceof BaseView){

            mPresenter.setVM(mModel,this);
        }

        initView();

    }

    protected abstract void initView();

    protected abstract int getLayoutId();
}
