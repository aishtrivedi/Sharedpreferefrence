package com.example.hp.sharedpreferefrence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

       ImageView splash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splash=(ImageView)findViewById(R.id.splash);

        Thread Timer = new Thread(){
            public void run()
            {
                try{
                    sleep(4000);
                    }
                    catch (InterruptedException e){
                    e.printStackTrace();
                    }

                    finally {
                   Intent i = new Intent(getApplicationContext(),Register.class);
                    startActivity(i);
                    finish();
                }

            }
        };

        Timer.start();
    }
}
