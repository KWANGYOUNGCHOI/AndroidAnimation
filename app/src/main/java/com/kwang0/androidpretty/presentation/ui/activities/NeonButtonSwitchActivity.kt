package com.kwang0.androidpretty.presentation.ui.activities

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.kwang0.androidpretty.R
import kotlinx.android.synthetic.main.activity_neon_button_switch.*


class NeonButtonSwitchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neon_button_switch)

        val view = layoutInflater.inflate(R.layout.view_neon_btn, neon_btn_fl, false)
        val button = view.findViewById<Button>(R.id.view_neon_btn)
        val frameAnimation = button.getBackground() as AnimationDrawable
        frameAnimation.start()
        neon_btn_fl?.addView(view)
    }
}