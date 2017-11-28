package com.example.mechrev.day08_zhongdazaixian.net;

import com.example.mechrev.day08_zhongdazaixian.base.BaseModel;
import com.example.mechrev.day08_zhongdazaixian.base.BasePresenter;
import com.example.mechrev.day08_zhongdazaixian.base.BaseView;

/**
 * Created by MECHREV on 2017/11/27.
 */

public class NetContract {

    interface View extends BaseView {

        void show(String result);
    }

    interface Model extends BaseModel {

        void getDataFromModel(String url,NetCallbacks netCallbacks);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

        @Override
        public void onStart() {

        }
        public abstract void getDataFromModel(String url);
        
    }
}