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

    /*fun showLoadingDialog(title:String, isCancelable:Boolean) {
        runOnUiThread(object:Runnable {
            public override fun run() {
                try
                {
                    if (loadingDialog != null)
                    {
                        loadingDialog.dismiss()
                    }
                    if (loadingDialog == null || !loadingDialog.isShowing())
                    {
                        loadingDialog = Dialog(this@BaseActivity, R.style.LoadingTheme)
                        loadingDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                        loadingDialog.setContentView(R.layout.loading_dialog)
                        loadingDialog.setCancelable(isCancelable)
                        loadingDialog.show()
                    }
                }
                catch (e:Exception) {
                    e.printStackTrace()
                }
            }
        })
    }
    fun hideLoadingDialog() {
        if (loadingDialog != null && loadingDialog.isShowing())
        {
            loadingDialog.dismiss()
        }
    }*/
    /*override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right)
    }
    override protected fun onResume() {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        super.onResume()
    }*/
}