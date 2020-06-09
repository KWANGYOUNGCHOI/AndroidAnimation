package com.kwang0.androidpretty.presentation.ui.views

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kwang0.androidpretty.R
import com.kwang0.androidpretty.data.models.Content
import com.kwang0.androidpretty.presentation.presenters.MainPresenter
import com.kwang0.androidpretty.presentation.presenters.MainPresenterView
import com.kwang0.androidpretty.presentation.presenters.impl.MainPresenterImpl
import com.kwang0.androidpretty.presentation.ui.adapters.MainRVAdapter
import java.util.ArrayList

class MainRVView(private var mContext: Context): MainPresenterView {
    var TAG = MainRVView::class.simpleName

    private lateinit var animation_rv: RecyclerView

    var mainPresenter: MainPresenter
    private var animationList: MutableList<Content> = ArrayList<Content>()
    var animationAdapter: MainRVAdapter

    init {
        mainPresenter = MainPresenterImpl()

        animationAdapter = MainRVAdapter(mContext, animationList)
    }

    fun bindView(a: Activity) {
        animation_rv = a.findViewById<RecyclerView>(R.id.main_animation_rv)
        recyclerInit()
    }

    fun bindView(v: View) {
        animation_rv = v.findViewById<RecyclerView>(R.id.main_animation_rv)
        recyclerInit()
    }

    fun recyclerInit() {
        animation_rv.setHasFixedSize(true)
        animation_rv.isNestedScrollingEnabled = false
        animation_rv.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        animation_rv.adapter = animationAdapter

        addAnimationContent()
    }

    fun addAnimationContent() {
        animationList.add(Content("anim-01","1", "NEON BUTTON"))

        animationAdapter.notifyDataSetChanged()
    }
}