package com.kwang0.androidpretty.presentation.ui.activities

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.kwang0.androidpretty.R


class NeonButtonActivity : AppCompatActivity() {
    var fl: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neon_button)

        fl = findViewById(R.id.neon_btn_fl)

        val view = layoutInflater.inflate(R.layout.view_neon_btn, fl, false)
        val button = view.findViewById<Button>(R.id.view_neon_btn)
        val frameAnimation = button.getBackground() as AnimationDrawable
        frameAnimation.setCallback(button)
        frameAnimation.setVisible(true, true)
        frameAnimation.start()
        fl?.addView(view)
    }
}