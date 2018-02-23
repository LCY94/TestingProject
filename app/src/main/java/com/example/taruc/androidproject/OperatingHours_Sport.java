package com.example.taruc.androidproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.taruc.androidproject.rview.RecyclerItemClickListener;
import com.example.taruc.androidproject.rview.rviewAdapter;
import com.example.taruc.androidproject.rview.rviewMain;

    /**
     * Created by taruc on 23/2/2018.
     */

 public class OperatingHours_Sport extends AppCompatActivity {
        TextView tv1;
        Context context;
        RecyclerView recyclerView;
        RelativeLayout relativeLayout;
        RecyclerView.Adapter recyclerViewAdapter;
        RecyclerView.LayoutManager recylerViewLayoutManager;
        String[] SportFacility ={"Sport Complex","Clubhouse","Outdoor Facilities"};
        String weekday = "Monday ~ Friday";
        String weekend = "Saturday ~ Sunday";
        String publicholidayclosed = "Closed on Public Holiday";
        String[] operatinghoursweekday = {"9.00am ~ 9.00pm", "9.00am ~ 9.00pm", "9.00am ~ 10.00pm"};
        String[] operatinghoursweekdaySpecial = {"", "", "9.00am ~ 7.00pm"};
        String[] operatinghoursweekend = {"9.00am ~ 7.00pm", "9.00am ~ 12.00pm, 3.00pm ~ 7.00pm", "9.00am ~ 7.00pm"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_ACTION_BAR);

            setContentView(R.layout.rview_main_layout);

            context = getApplicationContext();


            relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout1);

            recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);

            recyclerView.addOnItemTouchListener(
                    new RecyclerItemClickListener(context, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                        @Override public void onItemClick(View view, int position) {

                        }

                        @Override public void onLongItemClick(View view, int position) {
                            // do whatever
                        }
                    })
            );
            recylerViewLayoutManager = new LinearLayoutManager(context);

            recyclerView.setLayoutManager(recylerViewLayoutManager);

            recyclerViewAdapter = new rviewAdapter(context, SportFacility);

            recyclerView.setAdapter(recyclerViewAdapter);

    }
}
