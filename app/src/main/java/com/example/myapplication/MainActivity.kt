package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //https://www.androidauthority.com/using-coordinatorlayout-android-apps-703720/
        findViewById<Button>(R.id.button).setOnClickListener {
            Snackbar.make(findViewById(R.id.root),"Simple Text",Snackbar.LENGTH_LONG)
                .setAction("Close", {
                    // action
                }).show()
        }
    }
}