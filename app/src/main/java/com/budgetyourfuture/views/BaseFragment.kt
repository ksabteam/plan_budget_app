package com.budgetyourfuture.views

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

open class BaseFragment : Fragment(), View.OnClickListener {

    var activity: MainActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (getActivity() is MainActivity) {
            activity = getActivity() as MainActivity
        }

        Thread.setDefaultUncaughtExceptionHandler { paramThread, paramThrowable ->
            paramThrowable.printStackTrace(System.out)
        }
    }

    override fun onClick(v: View) {

    }

    /**
     * This sets button back press listener
     */
    fun setOnBackPressedListener() {

    }

    fun finish() {
        activity?.supportFragmentManager?.beginTransaction()?.detach(this)?.commit()
    }
}
