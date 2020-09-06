package com.kwang0.androidanimation.presentation.presenters.impl

import com.kwang0.androidanimation.presentation.presenters.MainPresenter
import com.kwang0.androidanimation.presentation.presenters.MainPresenterView

class MainPresenterImpl(var view: MainPresenterView): MainPresenter {
    override fun resume() {
        view.refresh()
    }
}