package com.mhmd.eeluproject.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.mhmd.eeluproject.R;

public class UserEnter extends AppCompatActivity {
    Button userlogin;
    TextView forpass ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_enter);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        userlogin = findViewById(R.id.user_login);
        forpass = findViewById(R.id.for_Pass);


        forpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserEnter.this , Forgetpassword.class);
                startActivity(intent);
            }
        });
        userlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserEnter.this,Home.class);
                startActivity(intent);
            }
        });
    }
}
