package com.example.mystopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation alt,btn1;
    ImageView ivmain;
    Button btnmain;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnmain= findViewById(R.id.btnmain);
        ivmain=findViewById(R.id.ivmain);
        textView2=findViewById(R.id.textView2);


        //animation
        alt=AnimationUtils.loadAnimation(this,R.anim.alt);
        btn1=AnimationUtils.loadAnimation(this,R.anim.btn1);

        //load animation
        ivmain.startAnimation(alt);
        btnmain.startAnimation(btn1);
        textView2.startAnimation(btn1);

    //button click
    btnmain.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent a=new Intent(MainActivity.this,stopWatch.class);
            a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(a);
        }
    });
    }
}