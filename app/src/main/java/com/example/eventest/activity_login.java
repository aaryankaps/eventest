package com.example.eventest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_login extends AppCompatActivity{

    EditText u,p;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        u=findViewById(R.id.Etusername);
        p=findViewById(R.id.Etpassword);


        Button b=findViewById(R.id.Blogin);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (u.getText().toString().matches( "jhalak") &&  p.getText().toString().matches("1234")) {
                    startActivity(new Intent(activity_login.this, MainActivity.class));
                }
            }
        });


    }
}




