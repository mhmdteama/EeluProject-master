package com.mhmd.eeluproject.frgments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.mhmd.eeluproject.Activites.Calender_Date;
import com.mhmd.eeluproject.Activites.Reminde_Phones;
import com.mhmd.eeluproject.R;


public class User_Activities extends Fragment {

    ImageButton call , address , calend , alarm;

    public static final String TAG = "userActiv";

    public User_Activities() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user__activities, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        call = view.findViewById(R.id.to_calls);
        address = view.findViewById(R.id.to_address);
        calend = view.findViewById(R.id.to_calender);
        alarm = view.findViewById(R.id.to_alarm);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity() , Reminde_Phones.class);
                startActivity(intent);
            }
        });

        calend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Calender_Date.class);
                startActivity(intent);
            }
        });
    }
}
