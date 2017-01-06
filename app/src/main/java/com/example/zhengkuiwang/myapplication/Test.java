package com.example.zhengkuiwang.myapplication;
//测试
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by zhengkuiwang on 16/11/29.
 */

public class Test extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
//        Button layout_weight = (Button)findViewById(R.id.buttonBack);
//        layout_weight.setOnClickListener(new buttonClickListrner());

        TextView textView = (TextView)findViewById(R.id.textView1);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String IP = intent.getStringExtra("IP");

        textView.setText("欢迎 "+name+" 到来"+"您的IP是:\n\n"+"\t\t"+IP);


        Button buttonBack = (Button)findViewById(R.id.buttonBackPublicBar);
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
