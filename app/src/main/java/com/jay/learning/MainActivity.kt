package com.jay.learning

import android.os.Bundle
import android.text.Layout
import android.view.View
import android.view.ViewStub
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_globochat)
    }


//    Below this is for activating the login screen and progressbar.
/*    fun showSnackbar(view: View){

        Snackbar.make(view, "You can't log in yet. Trust the process", Snackbar.LENGTH_LONG).show()
    }

    fun hideProgressBar(view: View) {
        val pq = findViewById<FrameLayout>(R.id.progress_bar_layout)
        pq?.visibility = View.GONE

    }

    fun showProgressBar(view: View) {
        val pq = findViewById<FrameLayout>(R.id.progress_bar_layout)
        val mt = findViewById<ViewStub>(R.id.view_stub)
        val progressBarLayout : View? = mt?.inflate()
        pq?.visibility = View.VISIBLE
    }*/
}