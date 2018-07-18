package com.example.asus.uidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.bt_1);
        setListener();
    }

    private void setListener() {
        bt1.setOnClickListener(this);
    }
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.bt_1:
                    Intent intent=new Intent(MainActivity.this,TextViewActivity.class);
                    startActivity(intent);
                    break;
            }
        }

}
