package com.mhmd.eeluproject.Activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.bumptech.glide.Glide;
import com.mhmd.eeluproject.R;
import com.mhmd.eeluproject.others.CallAdapter;
import com.mhmd.eeluproject.others.Call_items;

import java.util.ArrayList;

public class Reminde_Phones extends AppCompatActivity {

    RecyclerView calls ;
    RecyclerView.Adapter callsAdapter ;
    ArrayList<Call_items> callItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminde__phones);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ////////////////////////////////////////////////////////////////////////////////////

        calls = findViewById(R.id.contact_rv);
        calls.setHasFixedSize(true);
        calls.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , true));
        callsAdapter = new CallAdapter(callItems);
        callItems = new ArrayList<Call_items>();
        callItems.add(new Call_items("Mamhmoud Taha","01024681676",R.drawable.taha));
        callItems.add(new Call_items("Teama","01024681676", R.drawable.teama));
        callItems.add(new Call_items("Badawy","01024681676",R.drawable.badawy));
        callItems.add(new Call_items("Omar","01024681676",R.drawable.omar));
        callItems.add(new Call_items("David","01024681676",R.drawable.davied));

        callsAdapter = new CallAdapter(callItems);
        calls.setAdapter(callsAdapter);



    }
}
