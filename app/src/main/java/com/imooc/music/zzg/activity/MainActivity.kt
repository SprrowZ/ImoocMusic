package com.imooc.music.zzg.activity

import android.support.v7.widget.GridLayoutManager
import com.imooc.music.zzg.BaseActivity
import com.imooc.music.zzg.R
import com.imooc.music.zzg.adapters.MusicGridAdapter
import kotlinx.android.synthetic.main.activity_main.*


/**
 *Created by 18041at 2019/6/6
 *Function:
 */

class MainActivity:BaseActivity() {
    private  var musicAdapter:MusicGridAdapter?=null

    override fun getLayoutRes(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        initNav(false, "慕课音乐", true)
        musicAdapter=MusicGridAdapter(this)
        rv_grid.layoutManager=GridLayoutManager(this,3)
        rv_grid.adapter=musicAdapter
     }

    override fun initEvent() {

     }
}