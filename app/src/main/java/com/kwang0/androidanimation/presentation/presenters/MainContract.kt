package com.kwang0.androidanimation.presentation.presenters

interface MainContract {
    interface Presenter {
        fun resume()
    }

    interface View {
        fun refresh()
    }
}
