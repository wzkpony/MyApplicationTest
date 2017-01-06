package com.example.zhengkuiwang.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhengkuiwang on 16/11/23. 能行吗
 */

public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private List<HashMap<String,Object>> list;
    private ArrayList list1;
    private Array list2;
    private boolean colorType;
    public ListViewAdapter(Context context, ArrayList<HashMap<String, Object>> list)
    {
        this.context = context;
        this.list = list;
        colorType = false;

    }

    @Override// List表单的总数
    public int getCount() {
        return this.list.size();
    }

    @Override// 位于position处的List表单的一项
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override// List表单的各项的索引
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        System.out.println(position);
        if (convertView == null)
        {
            holder = new ViewHolder();
            LayoutInflater  mLayoutInflater = LayoutInflater.from(context);
            convertView = mLayoutInflater.inflate(R.layout.user,null);
            holder.textViewName = (TextView) convertView.findViewById(R.id.user_name);
            holder.textViewIP = (TextView) convertView.findViewById(R.id.user_ip);
            convertView.setTag(holder);
        }
         else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        if (colorType == false)
        {
            if (position%2 == 1)
            {
                holder.textViewName.setTextColor(Color.RED);
                holder.textViewIP.setTextColor(Color.RED);
            }
            else
            {
                holder.textViewName.setTextColor(Color.BLACK);
                holder.textViewIP.setTextColor(Color.BLACK);
            }
        }
        else
        {
            if (position%2 == 0)
            {
                holder.textViewName.setTextColor(Color.RED);
                holder.textViewIP.setTextColor(Color.RED);
            }
            else
            {
                holder.textViewName.setTextColor(Color.BLACK);
                holder.textViewIP.setTextColor(Color.BLACK);
            }
        }
        String name = (String) list.get(position).get("userName");
        String IP = (String) list.get(position).get("userIp");
        holder.textViewName.setText(name);
        holder.textViewIP.setText(IP);

        convertView.setOnClickListener(new itemClickListener(position));
        return convertView;
    }
    public class itemClickListener implements View.OnClickListener {
        private int position;
        @Override
        public void onClick(View v) {
            switch (this.position)
            {
             case 1:

                 break;
             default:
                 break;
            }
            String name = (String) list.get(position).get("userName");
            String IP = (String) list.get(position).get("userIp");
            Intent intent = new Intent(context, Test.class);
            intent.putExtra("Name",name);
            intent.putExtra("IP",IP);
            context.startActivity(intent);
        }
        public  itemClickListener(int position)
        {
            this.position = position;
        }
    }
    public static class ViewHolder {
        public TextView textViewName,textViewIP;
    }
    //外部调用,改变colorType类型,让listView发生改变
    public void changeColorTypes(boolean types)
    {
        colorType = types;
        this.notifyDataSetChanged();
    }
}

