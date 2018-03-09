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

            /*val sdf = SimpleDateFormat("MM/dd HH:mm")
            val tracker = AppPreference.getInstance(activity).getDefaultTracker()
            tracker.send(HitBuilders.ExceptionBuilder()
                    .setDescription(sdf.format(Date()) + "- " + paramThrowable.message + ": " + Arrays.asList(*paramThrowable.stackTrace).toString())
                    .build())
            GoogleAnalytics.getInstance(getActivity().applicationContext).dispatchLocalHits()

            val intent = Intent(activity, SplashActivity::class.java)
            intent.putExtra("RecoveringFromUncaughtException", true)
            activity.startActivity(intent)

            android.os.Process.killProcess(android.os.Process.myPid())
            System.exit(10)*/
        }
    }

    override fun onClick(v: View) {

    }

    /**
     * This sets button back press listener
     */
    fun setOnBackPressedListener() {
        /*view!!.isFocusableInTouchMode = true
        view!!.requestFocus()
        view!!.setOnKeyListener { v, keyCode, event ->
            if (event.action == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                true
            } else false
        }*/
    }

    fun finish() {
        activity?.supportFragmentManager?.beginTransaction()?.detach(this)?.commit()
    }
}
