package com.example.user.project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        TextView UBMI;
        TextView UBMR;
        TextView UREE;
        Bundle bundleAfter=this.getIntent().getExtras();

        String sex=bundleAfter.getString("sex");

        double height = bundleAfter.getDouble("hhh");
        double weight=bundleAfter.getDouble("www");
        int age=bundleAfter.getInt("aaa");

        UBMI=(TextView)(findViewById(R.id.BMI2));
        UBMR=(TextView)(findViewById(R.id.BMR2));
        UREE=(TextView)(findViewById(R.id.REE2));
        if(sex.equals("M")){
            double BMIresult=weight/(height/100*height/100);
            double BMRresult=(13.7*weight)+(5.0*height)-(6.8*age)+66;
            double REEresult=(10*weight)+(6.25*height)-(5*age)+5;
            UBMI.setText(String.valueOf(String.format("%.2f", BMIresult)));
            UBMR.setText(String.valueOf(String.format("%.2f", BMRresult)));
            UREE.setText(String.valueOf(String.format("%.2f", REEresult)));

        }
        else{
            double BMIresult=weight/(height/100*height/100);
            double BMRresult=(9.6*weight)+(1.8*height)-(4.7*age)+655;
            double REEresult=(10*weight)+(6.25*height)-(5*age)-161;
            UBMI.setText(String.valueOf(String.format("%.2f", BMIresult)));
            UBMR.setText(String.valueOf(String.format("%.2f", BMRresult)));
            UREE.setText(String.valueOf(String.format("%.2f", REEresult)));
        }









    }


}
