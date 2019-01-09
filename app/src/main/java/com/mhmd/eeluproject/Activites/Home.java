package com.mhmd.eeluproject.Activites;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.app.Fragment;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import com.mhmd.eeluproject.R;
import android.app.FragmentTransaction;

import com.mhmd.eeluproject.frgments.Profile;
import com.mhmd.eeluproject.frgments.User_Activities;

public class Home extends AppCompatActivity {

    ImageButton homee,profilee,location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        homee =findViewById(R.id.homee);
        profilee =findViewById(R.id.my_profile);
        location = findViewById(R.id.my_location);

        final User_Activities userActivities = new User_Activities();

        final Profile profile = new Profile();

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.admincontauner,userActivities);
        fragmentTransaction.commit();



        homee.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
               android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
               fragmentTransaction.replace(R.id.admincontauner,userActivities);
               fragmentTransaction.commit();

           }
       });

        profilee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.admincontauner,profile);
                fragmentTransaction.commit();


            }
        });

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this , My_Map_Activity.class);
                startActivity(intent);
            }
        });

    }
}
