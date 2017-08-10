package com.example.user.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class page2 extends AppCompatActivity {
    Button bt;
    EditText height;
    EditText weight;
    EditText age;
    RadioButton boy;
    RadioButton girl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        bt=(Button)(findViewById(R.id.buttonRegister));
        age=(EditText)findViewById(R.id.editText2);
        height = (EditText) findViewById(R.id.editText4);
        weight  =(EditText)findViewById(R.id.editText3);


        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double hhh=Double.parseDouble(height.getText().toString());
                double www=Double.parseDouble(weight.getText().toString());
                int aaa= Integer.parseInt(age.getText().toString());
                String sex=" ";
                boy=(RadioButton)findViewById(R.id.boy);
                girl=(RadioButton)findViewById(R.id.girl);
                if(boy.isChecked()){
                    sex="M";
                }
                if(girl.isChecked()){
                    sex="F";
                }

                Intent intent=new Intent();
                intent.setClass(page2.this,page4.class);

                Bundle bundle=new Bundle();
                bundle.putDouble("hhh",hhh);
                bundle.putDouble("www",www);
                bundle.putInt("aaa",aaa);
                bundle.putString("sex",sex);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });


    }
}
