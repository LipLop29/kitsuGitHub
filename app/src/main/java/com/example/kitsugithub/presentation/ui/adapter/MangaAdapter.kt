package com.example.kitsugithub.presentation.ui.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsugithub.data.dtos.DataItemDto
import com.example.kitsugithub.databinding.ItemKitsuBinding
import com.example.kitsugithub.presentation.extension.setImage

class MangaAdapter(val onItemClick: (id: String) -> Unit):
    PagingDataAdapter<DataItemDto, MangaAdapter.ViewHolder>(
    AnimeDiffCallBack
) {
    inner class ViewHolder(private val binding: ItemKitsuBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                getItem(absoluteAdapterPosition)?.let { anime -> onItemClick(anime.id) }
            }
        }

        fun onBind(item: DataItemDto) {
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

    object AnimeDiffCallBack : DiffUtil.ItemCallback<DataItemDto>() {
        override fun areItemsTheSame(
            oldItem: DataItemDto,
            newItem: DataItemDto,
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: DataItemDto,
            newItem: DataItemDto,
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }
}