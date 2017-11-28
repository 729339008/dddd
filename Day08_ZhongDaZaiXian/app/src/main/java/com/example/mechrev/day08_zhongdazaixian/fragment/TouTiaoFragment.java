package com.example.mechrev.day08_zhongdazaixian.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mechrev.day08_zhongdazaixian.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TouTiaoFragment extends Fragment {


    public TouTiaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tou_tiao, container, false);
    }

}
