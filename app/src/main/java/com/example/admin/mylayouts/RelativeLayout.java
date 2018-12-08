package com.example.admin.mylayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class RelativeLayout extends AppCompatActivity implements View.OnClickListener {
    Button mButton4;
    RelativeLayout mRelative1;
    private static final String TAG = "" + "relativeLayout";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        mButton4 = (Button) findViewById(R.id.bn_r4);
        mButton4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,LinearLayout.class);
        startActivity(intent);
        Log.d(TAG, "onClick: LinearLayout Called");



    }
}
