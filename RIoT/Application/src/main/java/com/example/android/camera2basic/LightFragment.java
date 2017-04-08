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

        MyTouchListener touchListener = new MyTouchListener();

        btn_redcolor.setOnTouchListener(touchListener);
        btn_yellowcolor.setOnTouchListener(touchListener);
        btn_greencolor.setOnTouchListener(touchListener);
        btn_cyancolor.setOnTouchListener(touchListener);
        btn_bluecolor.setOnTouchListener(touchListener);
        btn_purplecolor.setOnTouchListener(touchListener);
        btn_pinkcolor.setOnTouchListener(touchListener);
        return inflater.inflate(R.layout.activity_light, container, false);
    }
}

class MyTouchListener implements View.OnTouchListener {
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch(v.getId()){
            case 1:
                //do stuff for button 1
                break;
            case 2:
                //do stuff for button 2
                break;
            case 3:
                //do stuff for button 3
                break;
            case 4:
                //do stuff for button 4
                break;
            default:
                break;
        }
        return true;
    }

}