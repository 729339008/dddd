package com.example.mechrev.day08_zhongdazaixian.net;

import com.example.mechrev.day08_zhongdazaixian.app.App;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
* Created by TMVPHelper on 2017/11/27
*/
public class NetModel implements NetContract.Model{

    public static NetModel netmodel;

    private OkHttpClient okhttpclient;

    public static NetModel getInstance() {

        if (netmodel==null){

            synchronized (NetModel.class){

                netmodel = new NetModel();
            }
        }

        return netmodel;
    }

    public NetModel() {
        okhttpclient = new OkHttpClient();
    }

    @Override
    public void getDataFromModel(String url, final NetCallbacks netCallbacks) {

        Request request = new Request.Builder().url(url).build();

        okhttpclient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(final Call call, Response response) throws IOException {

                final String string = response.body().string();

                App.baseActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        netCallbacks.succ(string);
                    }
                });
            }
        });

    }
}