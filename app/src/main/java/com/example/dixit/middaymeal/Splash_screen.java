package com.example.dixit.middaymeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        Thread th = new Thread() {
            @Override
            public void run(){
                try{
                    sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent obj=new Intent(Splash_screen.this,First_page.class);
                    startActivity(obj);
                }

            }
        };
        th.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }

}
