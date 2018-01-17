package com.fuswork.bcdemo.view.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fuswork.bcdemo.R;

/**
 * Created by dgf000011 on 2018/1/17.
 */

public class Page1Fragment extends Fragment{

    public Page1Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page1, container, false);

    }
}
