package com.khs.ggp.presentation.view.analysisdetail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khs.ggp.databinding.ItemYoutubeUrlHolderBinding

class DangerousRecommendAdapter(private val linkList: List<String>): RecyclerView.Adapter<DangerousRecommendAdapter.YoutubeURLHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubeURLHolder {
        val binding = ItemYoutubeUrlHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return YoutubeURLHolder(binding)
    }

    override fun onBindViewHolder(holder: YoutubeURLHolder, position: Int) {
        holder.bind(linkList[position])
    }

    override fun getItemCount(): Int {
        return linkList.size
    }

    inner class YoutubeURLHolder(val binding: ItemYoutubeUrlHolderBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(url: String) {

        }

    }

}