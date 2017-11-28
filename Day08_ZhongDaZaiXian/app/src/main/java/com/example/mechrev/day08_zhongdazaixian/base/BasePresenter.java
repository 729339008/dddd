package com.example.mechrev.day08_zhongdazaixian.base;

/**
 * Created by MECHREV on 2017/11/27.
 */

public abstract class BasePresenter <M,V> {

    public M baseModel;

    public V baseView;

    public void setVM(M m, V v) {
        baseModel = m;
        baseView = v;
        this.onStart();
    }

    protected abstract void onStart();



}
