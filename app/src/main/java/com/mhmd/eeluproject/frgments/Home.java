package com.mhmd.eeluproject.frgments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mhmd.eeluproject.Activites.Registration;
import com.mhmd.eeluproject.Activites.UserEnter;
import com.mhmd.eeluproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {
    public static final String TAG = "homefragment";
    Button login;
    TextView  create;


    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v ;
         v  = inflater.inflate(R.layout.fragment_main2, container, false);
         return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        create = view.findViewById(R.id.create_new);

        login = view.findViewById(R.id.loginee);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity() , UserEnter.class);
                startActivity(intent);
            }
        });


        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity() , Registration.class);
                startActivity(intent);
            }
        });

    }
}
