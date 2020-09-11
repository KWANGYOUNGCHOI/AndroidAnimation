package com.kwang0.androidanimation.presentation.ui.recyclers.main

import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.kwang0.androidanimation.R

class MainRecyclerHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var layout: ConstraintLayout
    var fl: FrameLayout
    var tv: TextView
    init {
        layout = itemView.findViewById<ConstraintLayout>(R.id.main_rv_layout)
        fl = itemView.findViewById<FrameLayout>(R.id.main_rv_fl)
        tv = itemView.findViewById<TextView>(R.id.main_rv_tv)
    }
}
