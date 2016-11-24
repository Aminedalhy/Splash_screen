package com.example.pc.splash_screen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText username , password ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            username = (EditText) findViewById(R.id.Name);
            password = (EditText) findViewById(R.id.password_in);
            Animation anim = AnimationUtils.loadAnimation(this,R.anim.move);
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setAnimation(anim);


            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.authentication);
            Animation anim_2 = AnimationUtils.loadAnimation(this,R.anim.move_2);
            relativeLayout.setAnimation(anim_2);

            /*
            Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    //startActivity(new Intent(Splash_screen.this,MainActivity.class));
                    finish();

                }
            },8000);

*/

        }


    }


