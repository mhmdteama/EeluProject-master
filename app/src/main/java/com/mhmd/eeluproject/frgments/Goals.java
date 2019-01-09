package com.mhmd.eeluproject.frgments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.mhmd.eeluproject.R;

import java.util.HashMap;


public class Goals extends Fragment {

    public static final String TAG = "goalsfragment";
    private SliderLayout myimgs;

    public Goals() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.fragment_goals, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        myimgs =(SliderLayout) view.findViewById(R.id.goalsimgs);



        HashMap<String, Integer> myimages = new HashMap<>();
        myimages.put("1", R.drawable.img1);
        myimages.put("2", R.drawable.img2);
        myimages.put("3", R.drawable.img3);
        myimages.put("4", R.drawable.img4);
        myimages.put("5", R.drawable.img5);
        myimages.put("6", R.drawable.img6);
        myimages.put("7", R.drawable.img7);
        myimages.put("8", R.drawable.img8);

        for (String name : myimages.keySet()) {
            TextSliderView textSliderView = new TextSliderView(getContext());
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(myimages.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);


            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);

            myimgs.addSlider(textSliderView);

        }
    }
}
