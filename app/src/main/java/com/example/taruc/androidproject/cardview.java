package com.example.taruc.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.taruc.androidproject.rview.rviewMain;

/**
 * Created by taruc on 22/2/2018.
 */

public class cardview extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key);
        RelativeLayout lo1 = (RelativeLayout)findViewById(R.id.rlayout);
        lo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cardview.this,rviewMain.class);
                startActivity(i);
            }
        });
    }

}
