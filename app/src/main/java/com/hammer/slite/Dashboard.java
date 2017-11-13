package com.hammer.slite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {
ListView line1;
ArrayAdapter a1;
ArrayList<String> a;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        line1=(ListView)findViewById(R.id.line1);
         a=new ArrayList<String>();
         Home h=new Home(Dashboard.this);
         h.display();
         for(int i=0;i<h.display().size();i++){
            a.add(h.display().get(i).getName()+","+h.display().get(i).getEmail()+","+h.display().get(i).getPhone()+","+h.display().get(i).getPassword()+"");
    }
            a1=new ArrayAdapter(Dashboard.this,android.R.layout.simple_expandable_list_item_1,a);
            line1.setAdapter(a1);


    }
}
