package com.example.taruc.androidproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_information.*

/**
 * Created by taruc on 23/2/2018.
 */

class Information : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        tvtitle.setText("ICT Services")
        tvOhInfo.setText("Monday ~ Monday   " +
                     "8am - 9pm\n" +
                "Saturday   " +
                "9am - 4pm\n" +
                "Closed On Sunday")
        tvcontactinfo.setText("03-4145 0230")

    }
}
