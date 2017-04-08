package com.example.android.camera2basic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LightFragment extends Fragment implements View.OnClickListener {
    private at.markushi.ui.CircleButton btn_redcolor;
    private at.markushi.ui.CircleButton btn_orangecolor;
    private at.markushi.ui.CircleButton btn_yellowcolor;
    private at.markushi.ui.CircleButton btn_greencolor;
    private at.markushi.ui.CircleButton btn_cyancolor;
    private at.markushi.ui.CircleButton btn_bluecolor;
    private at.markushi.ui.CircleButton btn_purplecolor;
    private at.markushi.ui.CircleButton btn_pinkcolor;

    private at.markushi.ui.CircleButton btn_laughface;
    private at.markushi.ui.CircleButton btn_neutralface;
    private at.markushi.ui.CircleButton btn_wowface;
    private at.markushi.ui.CircleButton btn_smileface;
    private at.markushi.ui.CircleButton btn_sadface;

    private Button btn_android;
    private Button btn_krab;
    private Button btn_clear;

    private at.markushi.ui.CircleButton btn_back;
    private ServerAsker controller;
    private String TAG = "LightFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_light, container, false);
        btn_redcolor = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_redcolor);
        btn_orangecolor = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_orangecolor);
        btn_yellowcolor = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_yellowcolor);
        btn_greencolor = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_greencolor);
        btn_cyancolor = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_cyancolor);
        btn_bluecolor = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_bluecolor);
        btn_purplecolor = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_purplecolor);
        btn_pinkcolor = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_pinkcolor);

        btn_laughface = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_laughface);
        btn_neutralface = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_neutralface);
        btn_wowface = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_wowface);
        btn_smileface = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_smileface);
        btn_sadface = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_sadface);

        btn_android = (Button) view.findViewById(R.id.btn_android);
        btn_krab = (Button) view.findViewById(R.id.btn_krab);
        btn_clear = (Button) view.findViewById(R.id.btn_clear);

        btn_back = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_back);

        btn_back.setOnClickListener(this);

        btn_redcolor.setOnClickListener(this);
        btn_orangecolor.setOnClickListener(this);
        btn_yellowcolor.setOnClickListener(this);
        btn_greencolor.setOnClickListener(this);
        btn_cyancolor.setOnClickListener(this);
        btn_bluecolor.setOnClickListener(this);
        btn_purplecolor.setOnClickListener(this);
        btn_pinkcolor.setOnClickListener(this);

        btn_laughface.setOnClickListener(this);
        btn_neutralface.setOnClickListener(this);
        btn_wowface.setOnClickListener(this);
        btn_smileface.setOnClickListener(this);
        btn_sadface.setOnClickListener(this);

        btn_clear.setOnClickListener(this);

        btn_android.setOnClickListener(this);
        btn_krab.setOnClickListener(this);

        controller = new ServerAsker();
        return view;
    }

    private int objid = 1;
    private int reqid = 0;

    @Override
    public void onClick(View v) {
        Log.d(TAG, "Pressed");
        objid = 1;
        reqid = 0;
        switch (v.getId()) {
            case R.id.btn_back:
                getActivity().onBackPressed();
                break;
            case R.id.btn_redcolor:
                reqid = 0;
                break;
            case R.id.btn_orangecolor:
                reqid = 1;
                break;
            case R.id.btn_yellowcolor:
                reqid = 2;
                break;
            case R.id.btn_greencolor:
                reqid = 3;
                break;
            case R.id.btn_cyancolor:
                reqid = 4;
                break;
            case R.id.btn_bluecolor:
                reqid = 5;
                break;
            case R.id.btn_purplecolor:
                reqid = 6;
                break;
            case R.id.btn_pinkcolor:
                reqid = 7;
                break;
            case R.id.btn_laughface:
                reqid = 8;
                break;
            case R.id.btn_neutralface:
                reqid = 9;
                break;
            case R.id.btn_wowface:
                reqid = 10;
                break;
            case R.id.btn_smileface:
                reqid = 11;
                break;
            case R.id.btn_sadface:
                reqid = 12;
                break;
            case R.id.btn_android:
                reqid = 13;
                break;
            case R.id.btn_krab:
                reqid = 14;
                break;
            case R.id.btn_clear:
                reqid = 20;
                break;
        }
        new Thread(new Runnable() {
            public void run(){
                try {
                    controller.request(objid, reqid);
                } catch (Exception e) {
                    Log.d(TAG, e.toString());
                }
            }
        }).start();
    }
}