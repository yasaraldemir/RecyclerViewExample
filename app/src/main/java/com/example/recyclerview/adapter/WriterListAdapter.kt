package com.example.recyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.WriterModel

class WriterListAdapter(val writerList: List<WriterModel>) :
    RecyclerView.Adapter<WriterListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriterListViewHolder {
        return WriterListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return writerList.size
    }

    override fun onBindViewHolder(holder: WriterListViewHolder, position: Int) {
        holder.bind(writerList[position])
    }
}