package com.example.zhengkuiwang.myapplication;
//测试
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by zhengkuiwang on 16/11/29.
 */

public class IPDetailsActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipdetails);
//        Button layout_weight = (Button)findViewById(R.id.buttonBack);
//        layout_weight.setOnClickListener(new buttonClickListrner());

        TextView textView = (TextView)findViewById(R.id.textView1);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String IP = intent.getStringExtra("IP");

        textView.setText("欢迎 "+name+" 到来"+"您的IP是:\n\n"+"\t\t"+IP);


        Button buttonBack = (Button)findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new buttonClickListrner());
    }
    protected class buttonClickListrner implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            finish();
        }
    }
}
