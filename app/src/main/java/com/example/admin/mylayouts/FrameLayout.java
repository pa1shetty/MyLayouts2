package com.example.admin.mylayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FrameLayout extends AppCompatActivity implements View.OnClickListener {
Button mButtonf1,mButtonf2;
    private static final String TAG = "" + "frameLayout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        mButtonf1=(Button) findViewById(R.id.bn_f1);
        mButtonf2=(Button) findViewById(R.id.bn_f2);
        mButtonf1.setOnClickListener(this);
        mButtonf2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bn_f1){
            mButtonf1.setVisibility(View.GONE);
            Log.d(TAG, "onClick: Button one is Pressed");
            mButtonf2.setVisibility(View.VISIBLE);
        }
        else
        { mButtonf2.setVisibility(View.GONE);
            mButtonf1.setVisibility(View.VISIBLE);
            Log.d(TAG, "onClick: Button two is Pressed");


        }

    }
}
