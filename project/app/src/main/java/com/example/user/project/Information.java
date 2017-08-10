package com.example.user.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Spinner notify=(Spinner)(findViewById(R.id.sp1));
        Spinner notify2=(Spinner)(findViewById(R.id.sp2));
        Spinner notify3=(Spinner)(findViewById(R.id.sp3));

        final ArrayAdapter<CharSequence>nAdapter=ArrayAdapter.createFromResource(
                this,R.array.category,android.R.layout.simple_spinner_item
        );
        final ArrayAdapter<CharSequence>nAdapter2=ArrayAdapter.createFromResource(
                this,R.array.choosestore,android.R.layout.simple_spinner_item
        );
        final ArrayAdapter<CharSequence>nAdapter3=ArrayAdapter.createFromResource(
                this,R.array.ingredient,android.R.layout.simple_spinner_item
        );
        nAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        nAdapter2.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        nAdapter3.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        notify.setAdapter(nAdapter);
        notify2.setAdapter(nAdapter2);
        notify3.setAdapter(nAdapter3);

        notify.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if(!nAdapter.getItem(position).equals("")) {
                            Toast.makeText(Information.this,nAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Information.this, Information2.class);

                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        notify2.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if(!nAdapter2.getItem(position).equals("")) {
                            Toast.makeText(Information.this,nAdapter2.getItem(position), Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Information.this, storeIn.class);

                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        notify3.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if(!nAdapter3.getItem(position).equals("")) {
                            Toast.makeText(Information.this,nAdapter3.getItem(position), Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Information.this, commodity.class);

                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );



        }


    }

