package com.example.mechrev.day08_zhongdazaixian.net;

/**
* Created by TMVPHelper on 2017/11/27
*/
public class NetPresenter extends NetContract.Presenter{


    @Override
    public void getDataFromModel(String url) {

      baseModel.getDataFromModel(url, new NetCallbacks() {
          @Override
          public void succ(String result) {

              baseView.show(result);
          }
      });
    }
}