package com.kwang0.androidpretty.presentation.presenters.impl

import com.kwang0.androidpretty.presentation.presenters.MainPresenter
import com.kwang0.androidpretty.presentation.presenters.MainPresenterView

class MainPresenterImpl(var view: MainPresenterView): MainPresenter {
    override fun resume() {
        view.refresh()
    }
}