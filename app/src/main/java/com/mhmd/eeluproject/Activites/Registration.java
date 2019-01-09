package com.mhmd.eeluproject.Activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.mhmd.eeluproject.R;

public class Registration extends AppCompatActivity {

    Spinner state ;

    public static final String [] mytype = {"Type","Patient","Assistant "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        typeSpiner();

    }




    public void typeSpiner()
    {
        state = findViewById(R.id.my_state);
        ArrayAdapter<String> add_madenaAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_item, mytype);
        add_madenaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state.setAdapter(add_madenaAdapter);
    }
}
