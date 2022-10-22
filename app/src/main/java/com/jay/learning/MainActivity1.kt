package com.sriyank.layoutfundamentals

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.jay.learning.R


class MainActivity1 : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.view_stub_example)

	}

	fun showSnackBar(view: View) {
		Snackbar.make(view, "Hey! I am Snackbar", Snackbar.LENGTH_LONG).show()
	}
}
