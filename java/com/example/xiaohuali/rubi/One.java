package com.example.xiaohuali.rubi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class One extends AppCompatActivity {

    private Button mReturnNavi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        mReturnNavi = (Button)findViewById(R.id.return_navi);

        mReturnNavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(One.this, NavigationActivity.class);
                startActivity(i);
            }
        });

    }
}
