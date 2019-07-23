package com.example.eventest;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView bPost, bEvents, bSocial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bPost = findViewById(R.id.bPosts);
        bEvents = findViewById(R.id.bEvents);
        bSocial = findViewById(R.id.bSocial);

        bPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, activity_act_2.class);
                startActivity(i);

            }
        });

        bEvents.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, activity_act_event.class);

                startActivity(i);

            }
        });

        bSocial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(MainActivity.this, activity_act_create_event.class);

                startActivity(i);
            }


        });
    }
}
