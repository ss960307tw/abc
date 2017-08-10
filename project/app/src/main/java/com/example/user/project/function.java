package com.example.user.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class function extends AppCompatActivity {
    private static final int SHOW_EDITOR=0;
    private Object[] listViewData={
            "1.老街美食",Information.class,
            "2.地圖導航",Google_map.class,
            "3.開始計步",Pedometer.class,
            "4.身體狀況",page2.class,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        CharSequence[] list=new CharSequence[listViewData.length/2];
        for(int i=0;i<list.length;i++){
            list[i]=(String)listViewData[i*2];
        }
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,list);
        ListView list1=(ListView)(findViewById(R.id.list));
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent=new Intent
                        (function.this,(Class<?>)listViewData[position*2+1]);

                startActivity(intent);

            }
        });




    }
}
