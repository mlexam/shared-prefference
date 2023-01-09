package com.example.sharedprefrences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name,email,password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        button=findViewById(R.id.button);

        SharedPreferences s=getSharedPreferences("data",MODE_PRIVATE);
        String name1= s.getString("rname","Not available");
        String email1=s.getString("remail","NA");
        String password1=s.getString("rpassword","NA");

        name.setText("User name :"+name1);
        email.setText("Email: "+email1);
        password.setText("password :"+password1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });





    }
}