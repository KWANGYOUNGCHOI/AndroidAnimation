package com.kwang0.androidpretty.helper

import android.content.Context
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.kwang0.androidpretty.R
import java.io.File

object GlideHelper {
    fun loadImg(context: Context, path: String?, target: ImageView) {
        Glide.with(context)
            .asBitmap()
            .load(path)
            .placeholder(R.drawable.ic_place_holder)
            .circleCrop()
            .into(target)
    }
    fun loadImg(context: Context, uri: Uri?, target: ImageView) {
        Glide.with(context)
            .asBitmap()
            .load(uri)
            .placeholder(R.drawable.ic_place_holder)
            .circleCrop()
            .into(target)
    }
    fun loadImg(context: Context, file: File?, target: ImageView) {
        Glide.with(context)
            .asBitmap()
            .load(file)
            .placeholder(R.drawable.ic_place_holder)
            .circleCrop()
            .into(target)
    }
}