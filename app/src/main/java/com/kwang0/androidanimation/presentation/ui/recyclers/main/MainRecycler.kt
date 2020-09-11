package com.kwang0.androidanimation.presentation.ui.recyclers.main

import android.app.Activity
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kwang0.androidanimation.R
import com.kwang0.androidanimation.data.models.Content
import com.kwang0.androidanimation.presentation.presenters.MainContract
import com.kwang0.androidanimation.presentation.presenters.impl.MainPresenterImpl
import java.util.ArrayList

class MainRecycler(private var mContext: Context): MainContract.View {
    var TAG = MainRecycler::class.simpleName

    private lateinit var animation_recycler: RecyclerView

    var mainPresenter: MainContract.Presenter
    private var animationList: MutableList<Content> = ArrayList<Content>()
    var animationAdapter: MainRecyclerAdapter

    init {
        mainPresenter = MainPresenterImpl(this)

        animationAdapter =
            MainRecyclerAdapter(
                mContext,
                animationList
            )
    }

    fun bindView(a: Activity) {
        animation_recycler = a.findViewById<RecyclerView>(R.id.main_animation_rv)
        recyclerInit()
    }

    fun bindView(v: View) {
        animation_recycler = v.findViewById<RecyclerView>(R.id.main_animation_rv)
        recyclerInit()
    }

    fun recyclerInit() {
        animation_recycler.setHasFixedSize(true)
        animation_recycler.isNestedScrollingEnabled = false
        animation_recycler.layoutManager = LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false)
        animation_recycler.adapter = animationAdapter

        addAnimationContent()
    }

    fun addAnimationContent() {
        animationList.add(Content("anim-01", "NEON BUTTON"))
        animationList.add(Content("anim-02", "HOSTS ANIM"))

        animationAdapter.notifyDataSetChanged()
    }

    override fun refresh() {
        animationAdapter.notifyDataSetChanged()
    }
}
