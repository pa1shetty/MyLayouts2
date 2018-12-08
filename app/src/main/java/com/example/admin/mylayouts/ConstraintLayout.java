package com.example.admin.mylayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ConstraintLayout extends AppCompatActivity implements View.OnClickListener {
    Button mButtonf;
    private static final String TAG = "" +"ConstraintLayout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
        mButtonf=(Button) findViewById(R.id.bn_c4);
        mButtonf.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(this,FrameLayout.class);
        startActivity(intent);
        Log.d(TAG, "onClick: FrameLayout is Called");
    }
}
