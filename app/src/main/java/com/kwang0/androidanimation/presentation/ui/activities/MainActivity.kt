package com.kwang0.androidanimation.presentation.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kwang0.androidanimation.R
import com.kwang0.androidanimation.presentation.ui.recyclers.main.MainRecycler

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.simpleName

    private var animationView: MainRecycler? = null

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
        animationView = MainRecycler(this)
        animationView?.bindView(this)
    }
}
