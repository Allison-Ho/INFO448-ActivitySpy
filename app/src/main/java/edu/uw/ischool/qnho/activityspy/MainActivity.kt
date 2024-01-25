package edu.uw.ischool.qnho.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = "edu.uw.ischool.qnho.activityspy"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(savedInstanceState != null){
            Log.i(TAG, "onCreate() event fired with param " + savedInstanceState)
        } else{
            Log.i(TAG, "onCreate() event fired")
        }
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() event fired")
        Log.e(TAG, "We're going down, Captain!")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() event fired")
    }
}