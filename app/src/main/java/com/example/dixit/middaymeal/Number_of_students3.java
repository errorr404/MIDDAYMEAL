package com.example.dixit.middaymeal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class Number_of_students3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_number_of_students3);
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

        double som=0.020;
        double soa=2.40;
        double am=0.050;
        double aa=0.50;
        double tm=0.005;
        double ta=0.40;
        double mm=0.004;
        double ma=0.22;
        double jm=0.061;
        double ja=0.61;
        double total=4.13;
        double soyam=som*number;
        double soyaa=soa*number;
        double aalum=am*number;
        double aalua=aa*number;
        double telm=tm*number;
        double tela=ta*number;
        double masalam=mm*number;
        double masalaa=ma*number;
        double jalawanm=jm*number;
        double totalcost=total*number;
        double jalawana=ja*number;
        k1.setText(String.format( " %.2f", soyam ));
        k2.setText(String.format( " %.2f", aalum ));
        k3.setText(String.format( " %.2f", telm ));
        k4.setText(String.format( " %.2f", masalam ));
        k5.setText(String.format( " %.2f", jalawanm ));
        t1.setText(String.format( " %.2f", soyaa ));
        t2.setText(String.format( " %.2f", aalua ));

        t3.setText(String.format( " %.2f", tela ));
        t4.setText(String.format( " %.2f", masalaa ));
        t5.setText(String.format( " %.2f", jalawana ));
        t6.setText(String.format( " %.2f", totalcost ));
    }
}
