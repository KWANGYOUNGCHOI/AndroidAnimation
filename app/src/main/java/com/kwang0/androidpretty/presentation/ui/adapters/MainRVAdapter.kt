package com.kwang0.androidpretty.presentation.ui.adapters

import android.app.Activity
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.kwang0.androidpretty.R
import com.kwang0.androidpretty.data.models.Content
import com.kwang0.androidpretty.helper.IntentHelper
import com.kwang0.androidpretty.presentation.ui.activities.NeonButtonSwitchActivity

class MainRVAdapter(val mContext: Context, var mData: List<Content>) : RecyclerView.Adapter<MainRVAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRVAdapter.ViewHolder {
        val rootView: View
        rootView = LayoutInflater.from(mContext).inflate(R.layout.activity_main_rv, parent, false)
        return ViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: MainRVAdapter.ViewHolder, position: Int) {
        try {
            val item: Content = mData.get(position)

            setContentFrame(holder, item.id)
            setContentText(holder, item.text)
            setClickListener(holder, item.id)
        } catch (e: IndexOutOfBoundsException) {
            Toast.makeText(mContext, mContext.getString(R.string.exception_out_of_bounds), Toast.LENGTH_LONG).show()
        }
    }

    private fun setContentFrame(holder: ViewHolder, id: String) {
        when(id) {
            "anim-01" -> {
                val view = LayoutInflater.from(mContext)
                    .inflate(R.layout.view_neon_btn, holder.fl, false)
                val button = view.findViewById<Button>(R.id.view_neon_btn)
                val frameAnimation = button.getBackground() as AnimationDrawable
                frameAnimation.start()
                holder.fl.addView(view)
            }
        }
    }

    private fun setContentText(holder: ViewHolder, text: String) {
        holder.tv.text = text
    }
    private fun setClickListener(holder: ViewHolder, id: String) {
        when(id) {
            "anim-01" -> holder.layout.setOnClickListener{
                holder.fl.transitionName = "frameTransition"
                IntentHelper.activityTransitionIntent(mContext as Activity, NeonButtonSwitchActivity::class.java, holder.fl, "frameTransition")
            }
        }
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var layout: ConstraintLayout
        var fl: FrameLayout
        var tv: TextView
        init {
            layout = itemView.findViewById<ConstraintLayout>(R.id.main_rv_layout)
            fl = itemView.findViewById<FrameLayout>(R.id.main_rv_fl)
            tv = itemView.findViewById<TextView>(R.id.main_rv_tv)
        }
    }
}