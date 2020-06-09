package com.kwang0.androidpretty.helper

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.text.Layout
import android.util.Pair
import android.view.View

object IntentHelper {
    // 다른 액티비티 시작
    fun activityIntent(context: Context?, cls: Class<*>) {
        val intent = Intent(context, cls)
        context?.startActivity(intent)
    }

    fun activityTransitionIntent(activity: Activity?, cls: Class<*>, view: View, transition: String) {
        val intent = Intent(activity, cls)
        val pair = Pair<View, String>(view, transition)
        val options = ActivityOptions.makeSceneTransitionAnimation(activity, pair)
        activity?.startActivity(intent, options.toBundle())
    }
}