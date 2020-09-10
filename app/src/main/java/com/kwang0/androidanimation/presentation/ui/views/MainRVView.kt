package com.kwang0.androidanimation.presentation.ui.views

import android.app.Activity
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kwang0.androidanimation.R
import com.kwang0.androidanimation.data.models.Content
import com.kwang0.androidanimation.presentation.presenters.MainContract
import com.kwang0.androidanimation.presentation.presenters.impl.MainPresenterImpl
import com.kwang0.androidanimation.presentation.ui.adapters.MainRVAdapter
import java.util.ArrayList

class MainRVView(private var mContext: Context): MainContract.View {
    var TAG = MainRVView::class.simpleName

    private lateinit var animation_rv: RecyclerView

    var mainPresenter: MainContract.Presenter
    private var animationList: MutableList<Content> = ArrayList<Content>()
    var animationAdapter: MainRVAdapter

    init {
        mainPresenter = MainPresenterImpl(this)

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
        animationList.add(Content("anim-01", "NEON BUTTON"))
        animationList.add(Content("anim-02", "HOSTS ANIM"))

        animationAdapter.notifyDataSetChanged()
    }

    override fun refresh() {
        animationAdapter.notifyDataSetChanged()
    }
}