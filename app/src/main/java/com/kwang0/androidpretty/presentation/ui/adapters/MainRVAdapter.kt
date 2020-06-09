package com.kwang0.androidpretty.presentation.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.kwang0.androidpretty.R
import com.kwang0.androidpretty.data.models.Content
import com.kwang0.androidpretty.helper.GlideHelper
import com.kwang0.androidpretty.helper.IntentHelper
import com.kwang0.androidpretty.presentation.ui.activities.NeonButtonActivity

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

            setContentImage(holder, item.image)
            setContentText(holder, item.text)
            setClickListener(holder, item.id)
        } catch (e: IndexOutOfBoundsException) {
            Toast.makeText(mContext, mContext.getString(R.string.exception_out_of_bounds), Toast.LENGTH_LONG).show()
        }
    }

    private fun setContentImage(holder: ViewHolder, image: String) {
        GlideHelper.loadImg(mContext, image, holder.iv)
    }

    private fun setContentText(holder: ViewHolder, text: String) {
        holder.tv.text = text
    }
    private fun setClickListener(holder: ViewHolder, id: String) {
        when(id) {
            "anim-01" -> holder.layout.setOnClickListener{ IntentHelper.activityIntent(mContext, NeonButtonActivity::class.java) }
        }
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var layout: ConstraintLayout
        var iv: ImageView
        var tv: TextView
        init {
            layout = itemView.findViewById<ConstraintLayout>(R.id.main_rv_layout)
            iv = itemView.findViewById<ImageView>(R.id.main_rv_iv)
            tv = itemView.findViewById<TextView>(R.id.main_rv_tv)
        }
    }
}