package com.kwang0.androidanimation.presentation.ui.activities

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.kwang0.androidanimation.R
import kotlinx.android.synthetic.main.activity_neon_button_switch.*
import kotlinx.android.synthetic.main.view_neon_btn.view.*


class NeonButtonSwitchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neon_button_switch)

        val view = layoutInflater.inflate(R.layout.view_neon_btn, neon_btn_fl, false)
        view.view_neon_btn.background.also {
            (it as AnimationDrawable).start()
        }
        neon_btn_fl?.addView(view)
    }
}