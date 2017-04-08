package com.example.android.camera2basic;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class LightFragment extends Fragment {
    private at.markushi.ui.CircleButton btn_redcolor;
    private at.markushi.ui.CircleButton btn_orangecolor;
    private at.markushi.ui.CircleButton btn_yellowcolor;
    private at.markushi.ui.CircleButton btn_greencolor;
    private at.markushi.ui.CircleButton btn_cyancolor;
    private at.markushi.ui.CircleButton btn_bluecolor;
    private at.markushi.ui.CircleButton btn_purplecolor;
    private at.markushi.ui.CircleButton btn_pinkcolor;
    private at.markushi.ui.CircleButton btn_back;

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

        btn_back = (at.markushi.ui.CircleButton) view.findViewById(R.id.btn_back);

        btn_redcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_yellowcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_greencolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_cyancolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_bluecolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_purplecolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_pinkcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragment().getActivity().onBackPressed();
            }
        });

        return inflater.inflate(R.layout.activity_light, container, false);
    }
}