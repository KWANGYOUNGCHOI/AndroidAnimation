package com.kwang0.androidanimation.presentation.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kwang0.androidanimation.R
import com.kwang0.androidanimation.presentation.ui.views.MainRVView

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.simpleName

    private var animationView: MainRVView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewSetUp()
    }

    override fun onResume() {
        super.onResume()
        animationView?.mainPresenter?.resume()
    }

    private fun mainViewSetUp() {
        animationView = MainRVView(this)
        animationView?.bindView(this)
    }
}