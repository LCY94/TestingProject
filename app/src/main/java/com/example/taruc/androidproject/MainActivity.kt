package com.example.taruc.androidproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonLogin.setOnClickListener(View.OnClickListener {
            v ->
            val intent = Intent(this,cardview::class.java)
            startActivity(intent)
                if(edtstuid.text.toString().toUpperCase().equals("HEHE")){
                    Log.d("Test:","True")
                }
                else{
                    edtstuid.setError("Invalid Id")
                    Log.d("Test","Invalid Id or password")
                }
        })
    }


}
