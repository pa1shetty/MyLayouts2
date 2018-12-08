package com.example.admin.mylayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LinearLayout extends AppCompatActivity implements View.OnClickListener {
Button mButtonl3;
    private static final String TAG = "LinearLayout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        mButtonl3=(Button) findViewById(R.id.bn_l3);
        mButtonl3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(this,ConstraintLayout.class);
        startActivity(intent);
        Log.d(TAG, "onClick: ConstraintLayout is called");

    }
}
