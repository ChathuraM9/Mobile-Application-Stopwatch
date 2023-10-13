package com.example.mystopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class stopWatch extends AppCompatActivity {
    Button btnstart,btnstop;

    Chronometer timmer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        btnstart=findViewById(R.id.btnstart);
        btnstop=findViewById(R.id.btnstop);
        timmer=findViewById(R.id.timer);

        btnstop.setAlpha(0);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            btnstop.animate().alpha(1).setDuration(300).start();
            btnstart.animate().alpha(0).setDuration(300).start();

                //start timmer
                timmer.setBase(SystemClock.elapsedRealtime());
                timmer.start();


            }
    } );
        //stop timemr
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timmer.stop();


            }
    });
}
}