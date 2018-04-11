package com.budgetyourfuture.views

import android.app.Dialog
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.Window

abstract class BaseActivity:AppCompatActivity(), View.OnClickListener {
    //private val loadingDialog:Dialog = Dialog(this@BaseActivity, R.style.LoadingTheme)

    override fun onCreate(savedInstanceState:Bundle, persistentState:PersistableBundle) {
        super.onCreate(savedInstanceState, persistentState)
    }
    abstract fun initComponents()
    abstract fun setListeners()

}