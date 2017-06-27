package com.example.dixit.middaymeal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Days_selection extends AppCompatActivity {
Button monday;
    Button thursday;
    Button friday;
    Button wednesday;
    Button saturday;
    Button tuesday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_days_selection);
        monday=(Button)findViewById(R.id.button10);
        thursday=(Button)findViewById(R.id.button13);
        friday=(Button)findViewById(R.id.button14);
        wednesday=(Button)findViewById(R.id.button12);
        saturday=(Button)findViewById(R.id.button15);
        tuesday=(Button)findViewById(R.id.button11) ;
        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Days_selection.this,Number_of_students.class);
                startActivity(i);
            }
        });
        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Days_selection.this,Number_of_students.class);
                startActivity(j);
            }
        });
        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Days_selection.this,Number_of_students.class);
                startActivity(k);
            }
        });
        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(Days_selection.this,Number_of_student2.class);
                startActivity(l);
            }
        });
        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(Days_selection.this,Number_of_student2.class);
                startActivity(m);
            }
        });
        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Days_selection.this,Number_of_students3.class);
                startActivity(n);
            }
        });
    }
}
