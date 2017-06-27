package com.example.dixit.middaymeal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;

import static com.example.dixit.middaymeal.R.id.textView;
import static com.example.dixit.middaymeal.R.id.textView13;

public class Number_of_students extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_number_of_students);

    }
    public void ref(View view){
        EditText e1=(EditText) findViewById(R.id.editText);
        Double number=Double.parseDouble(e1.getText().toString());
        TextView k1=(TextView)findViewById(R.id.textView6);
        TextView t1=(TextView)findViewById(R.id.textView7);
        TextView k2=(TextView)findViewById(R.id.textView9);
        TextView k3=(TextView)findViewById(R.id.textView12);
        TextView k4=(TextView)findViewById(R.id.textView15);
        TextView k5=(TextView)findViewById(R.id.textView18);
        TextView t2=(TextView)findViewById(R.id.textView10);
        TextView t3=(TextView)findViewById(R.id.textView13);
        TextView t4=(TextView)findViewById(R.id.textView16);
        TextView t5=(TextView)findViewById(R.id.textView19);
        TextView t6=(TextView)findViewById(R.id.textView20);
         double dm=0.020;
        double da=2.40;
        double sm=0.050;
        double sa=0.50;
        double tm=0.005;
        double ta=0.40;
        double mm=0.004;
        double ma=0.22;
        double jm=0.061;
        double ja=0.61;
        double total=4.13;
        double dalm=dm*number;
        double dala=da*number;
        double sabzim=sm*number;
        double sabzia=sa*number;
        double telm=tm*number;
        double tela=ta*number;
        double masalam=mm*number;
        double masalaa=ma*number;
        double jalawanm=jm*number;
        double totalcost=total*number;
        double jalawana=ja*number;
        k1.setText(String.format( " %.2f", dalm ));
        k2.setText(String.format( " %.2f", sabzim ));
        k3.setText(String.format( " %.2f", telm ));
        k4.setText(String.format( " %.2f", masalam ));
        k5.setText(String.format( " %.2f", jalawanm ));
        t1.setText(String.format( " %.2f", dala ));
        t2.setText(String.format( " %.2f", sabzia ));
        t3.setText(String.format( " %.2f", tela ));
        t4.setText(String.format( " %.2f", masalaa ));
        t5.setText(String.format( " %.2f", jalawana ));
        t6.setText(String.format( " %.2f", totalcost ));
    }
}
