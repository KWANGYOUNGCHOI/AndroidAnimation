package com.kwang0.androidanimation.presentation.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kwang0.androidanimation.R
import kotlinx.android.synthetic.main.activity_hosts_anim.*

class HostsAnimActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hosts_anim)


        val view = layoutInflater.inflate(R.layout.view_neon_btn, host_anim_fl, false)
        host_anim_fl.addView(view)
    }
}
