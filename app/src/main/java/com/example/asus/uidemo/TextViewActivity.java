package com.example.asus.uidemo;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
private TextView tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        tv4=(TextView) findViewById(R.id.tv_4);
        tv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//为tv4设置中划线
        tv4.getPaint().setAntiAlias(true);//清楚中划线锯齿
        tv5=findViewById(R.id.tv_5);
        tv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//为tv5设置下划线
    }
}
