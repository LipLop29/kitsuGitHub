package com.example.kitsugithub.presentation.ui.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsugithub.databinding.ItemKitsuBinding
import com.example.kitsugithub.models.DataItemUI
import com.example.kitsugithub.presentation.extension.setImage

class AnimeAdapter(val onItemClick: (id: String) -> Unit):
    PagingDataAdapter<DataItemUI, AnimeAdapter.ViewHolder>(
    AnimeDiffCallBack
) {

    inner class ViewHolder(private val binding: ItemKitsuBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                getItem(absoluteAdapterPosition)?.let { anime -> onItemClick(anime.id) }
            }
        }

        fun onBind(item: DataItemUI) {
            binding.itemText.text = item.attributesDto.titlesDto.enJp
            binding.itemImage.setImage(item.attributesDto.posterImageDto.original)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemKitsuBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    object AnimeDiffCallBack : DiffUtil.ItemCallback<DataItemUI>() {
        override fun areItemsTheSame(
            oldItem: DataItemUI,
            newItem: DataItemUI,
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: DataItemUI,
            newItem: DataItemUI,
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }
}