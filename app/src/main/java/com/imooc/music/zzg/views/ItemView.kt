package com.imooc.music.zzg.views

import android.content.Context
import android.widget.ImageView

/**
 * 宽高相等的ImageView
 */
class ItemView(context: Context?) : ImageView(context) {
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec)
    }
}