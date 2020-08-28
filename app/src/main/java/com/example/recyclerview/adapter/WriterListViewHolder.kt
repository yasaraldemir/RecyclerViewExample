package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.WriterModel

class WriterListViewHolder(container: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(container.context).inflate(
            R.layout.adapter_item_writer_list,
            container,
            false
        )
    ) {

    val bookImage: ImageView = itemView.findViewById(R.id.bookImage)
    val title: TextView = itemView.findViewById(R.id.title)
    val author: TextView = itemView.findViewById(R.id.author)
    val edition: TextView = itemView.findViewById(R.id.edition)
    val publisher: TextView = itemView.findViewById(R.id.publisher)
    val price: TextView = itemView.findViewById(R.id.price)
    val dicountedPrice: TextView = itemView.findViewById(R.id.discountedPrice)
    val discount: TextView = itemView.findViewById(R.id.dicount)

    fun bind(writerModel: WriterModel) {
        title.text = writerModel.title
        author.text = writerModel.author
        edition.text = writerModel.edition
        publisher.text = writerModel.publisher
        price.text = writerModel.price
        dicountedPrice.text = writerModel.discountedPrice
        discount.text = writerModel.discount

    }
}