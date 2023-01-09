package com.example.sharedprefrences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,password,email;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name1=name.getText().toString();
                String email1=email.getText().toString();
                String password1=password.getText().toString();

                SharedPreferences p= getSharedPreferences("data",MODE_PRIVATE);
                SharedPreferences.Editor e=p.edit();
                e.putString("rname",name1);
                e.putString("remail",email1);
                e.putString("rpassword",password1);
                e.apply();

                Intent intent= new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);






            }
        });


    }
}