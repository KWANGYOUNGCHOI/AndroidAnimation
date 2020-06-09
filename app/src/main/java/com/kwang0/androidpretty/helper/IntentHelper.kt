package com.kwang0.androidpretty.helper

import android.content.Context
import android.content.Intent

object IntentHelper {
    // 다른 액티비티 시작
    fun activityIntent(context: Context?, cls: Class<*>) {
        val intent = Intent(context, cls)
        context?.startActivity(intent)
    }
}