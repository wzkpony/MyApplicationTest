package com.example.zhengkuiwang.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Switch aswitch;
    private SimpleAdapter lisetAdapter;
    private ListViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<HashMap<String,Object>> list = dataForMe();




        listView = (ListView) findViewById(R.id.listID);
//        lisetAdapter = new SimpleAdapter(this,list,R.layout.user,new String[]{"userName","userIp"},new int[]{R.id.user_name,R.id.user_ip});
//        listView.setAdapter(lisetAdapter);
        adapter = new ListViewAdapter(this,list);
        listView.setAdapter(adapter);



        aswitch = (Switch)findViewById(R.id.switch1);
        aswitch.setText(getString(R.string.switchText));//在strings.xml中找到配置的文本
        aswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                adapter.changeColorTypes(isChecked);
            }
        });

    }
    private ArrayList<HashMap<String,Object>> dataForMe()
    {
        ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();

        HashMap<String,Object> map1 = new HashMap<String,Object>();
        HashMap<String,Object> map2 = new HashMap<String,Object>();
        HashMap<String,Object> map3 = new HashMap<String,Object>();
        HashMap<String,Object> map4 = new HashMap<String,Object>();
        HashMap<String,Object> map5 = new HashMap<String,Object>();
        HashMap<String,Object> map6 = new HashMap<String,Object>();
        HashMap<String,Object> map7 = new HashMap<String,Object>();
        HashMap<String,Object> map8 = new HashMap<String,Object>();
        HashMap<String,Object> map9 = new HashMap<String,Object>();
        map1.put("userName","王正魁");
        map1.put("userIp","192.168.106");

        map2.put("userName","张**");
        map2.put("userIp","192.168.134");

        map3.put("userName","李**");
        map3.put("userIp","192.168.175");

        map4.put("userName","张**");
        map4.put("userIp","192.168.74");

        map5.put("userName","樊**");
        map5.put("userIp","192.168.146");

        map6.put("userName","汪**");
        map6.put("userIp","192.168.136");

        map7.put("userName","王**");
        map7.put("userIp","192.168.113");

        map8.put("userName","陈**");
        map8.put("userIp","192.168.106");

        map9.put("userName","许**");
        map9.put("userIp","192.168.154");


        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);
        list.add(map8);
        list.add(map9);
        return  list;
    }
    private ArrayList<HashMap<String,Object>> dataForAll()
    {
        ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();

        for (int i = 0; i<1000;i++)
        {
            HashMap<String,Object> map1 = new HashMap<String,Object>();
            map1.put("userName","王正魁");
            map1.put("userIp","192.168.106");
            list.add(map1);
        }
        return list;
    }
}
