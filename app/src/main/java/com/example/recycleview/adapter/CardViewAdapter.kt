package com.example.recycleview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recycleview.Data
import com.example.recycleview.databinding.ItemRecyclerViewBinding

class CardViewAdapter(private val list: ArrayList<Data>):
    RecyclerView.Adapter<CardViewAdapter.CardViewHolder>() {
    class CardViewHolder(private val binding: ItemRecyclerViewBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(list: Data){
            with(binding){
                Glide.with(itemView.context)
                    .load(list.image)
                    .apply(RequestOptions().override(200, 200))
                    .into(imgProfile)

                txtName.text = list.name
                txtAddress.text = list.address
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val binding = ItemRecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

}
