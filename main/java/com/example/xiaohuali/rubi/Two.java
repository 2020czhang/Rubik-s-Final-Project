package com.example.xiaohuali.rubi;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Two extends AppCompatActivity {

    private ImageButton mMiddle;
    private ImageButton mL;
    private ImageButton mLine;

    private Button mReturnNavi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        mMiddle = (ImageButton)findViewById(R.id.middle_button);
        mL = (ImageButton)findViewById(R.id.l_shape);
        mLine = (ImageButton)findViewById(R.id.line);

        mMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Two.this, MiddleActivity.class);
                startActivity(i);
            }
        });

        mL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Two.this, MiddleActivity.class);
                startActivity(i);
            }
        });

        mLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Two.this, MiddleActivity.class);
                startActivity(i);
            }
        });

        mReturnNavi = (Button)findViewById(R.id.return_navi);

        mReturnNavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Two.this, NavigationActivity.class);
                startActivity(i);
            }
        });
    }
}
