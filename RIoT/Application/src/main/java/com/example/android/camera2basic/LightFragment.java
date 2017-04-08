package com.example.android.camera2basic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LightFragment extends Fragment {
    private Button btn_redcolor;
    private Button btn_orangecolor;
    private Button btn_yellowcolor;
    private Button btn_greencolor;
    private Button btn_cyancolor;
    private Button btn_bluecolor;
    private Button btn_purplecolor;
    private Button btn_pinkcolor;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        btn_redcolor = (Button) container.findViewById(R.id.btn_redcolor);
        btn_orangecolor = (Button) container.findViewById(R.id.btn_orangecolor);
        btn_yellowcolor = (Button) container.findViewById(R.id.btn_yellowcolor);
        btn_greencolor = (Button) container.findViewById(R.id.btn_greencolor);
        btn_cyancolor = (Button) container.findViewById(R.id.btn_cyancolor);
        btn_bluecolor = (Button) container.findViewById(R.id.btn_bluecolor);
        btn_purplecolor = (Button) container.findViewById(R.id.btn_purplecolor);
        btn_pinkcolor = (Button) container.findViewById(R.id.btn_pinkcolor);
        return inflater.inflate(R.layout.activity_light, container, false);
    }
}