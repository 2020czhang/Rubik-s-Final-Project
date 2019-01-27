package com.example.xiaohuali.rubi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NavigationActivity extends AppCompatActivity {

    private Button mScrambled;
    private Button mOne;
    private Button mTwo;
    private Button mHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        mScrambled = (Button)findViewById(R.id.scrambled);
        mOne = (Button)findViewById(R.id.layer_one);
        mTwo = (Button)findViewById(R.id.layer_two);
        mHelp = (Button)findViewById(R.id.help);

        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NavigationActivity.this, One.class);
                startActivity(i);
            }
        });

        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NavigationActivity.this, Two.class);
                startActivity(i);
            }
        });

        mHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NavigationActivity.this, SymbolsActivity.class);
                startActivity(i);
            }
        });
    }
}
