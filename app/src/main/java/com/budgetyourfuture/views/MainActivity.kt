package com.budgetyourfuture.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.budgetyourfuture.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ButterKnife.bind(this);
        //initComponents();
    }
}
