package com.kwang0.androidpretty.presentation.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kwang0.androidpretty.R
import com.kwang0.androidpretty.presentation.ui.views.MainRVView

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.simpleName

    private var animationView: MainRVView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewSetUp()
    }



    private fun mainViewSetUp() {
        animationView = MainRVView(this)
        animationView?.bindView(this)
    }
}