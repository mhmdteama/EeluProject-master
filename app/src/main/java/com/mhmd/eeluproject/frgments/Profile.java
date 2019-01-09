package com.mhmd.eeluproject.frgments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.mhmd.eeluproject.Activites.Change_Password;
import com.mhmd.eeluproject.Activites.Edit_Profile;
import com.mhmd.eeluproject.Activites.MyProfile;
import com.mhmd.eeluproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Profile extends Fragment {

    ImageView myprof , editprof , changepass;

    public Profile() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        myprof = view.findViewById(R.id.to_my_profile);
        editprof =view.findViewById(R.id.edit_my_profile);
        changepass = view.findViewById(R.id.change_my_password);

        myprof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity() , MyProfile.class);
                startActivity(intent);
            }
        });

        editprof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Edit_Profile.class);
                startActivity(intent);
            }
        });

        changepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Change_Password.class);
                startActivity(intent);
            }
        });
    }
}
