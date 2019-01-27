package com.example.xiaohuali.rubi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MiddleActivity extends AppCompatActivity {

    private Button mReturnNavi;
    private Button mReturnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        mReturnNavi = (Button)findViewById(R.id.return_navi);
        mReturnTwo = (Button)findViewById(R.id.return_two);

        mReturnNavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MiddleActivity.this, NavigationActivity.class);
                startActivity(i);
            }
        });

        mReturnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MiddleActivity.this, Two.class);
                startActivity(i);
            }
        });
    }
}
