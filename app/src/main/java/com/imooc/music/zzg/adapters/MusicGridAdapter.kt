package com.imooc.music.zzg.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.imooc.music.zzg.R
import kotlin.contracts.contract

class MusicGridAdapter(val context: Context): RecyclerView.Adapter<MusicGridAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
      return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_grid_music,p0,false))
    }

    override fun getItemCount(): Int {
      return 6
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}