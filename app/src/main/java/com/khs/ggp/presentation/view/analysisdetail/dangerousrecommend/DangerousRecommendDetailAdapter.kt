package com.khs.ggp.presentation.view.analysisdetail.dangerousrecommend

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.khs.ggp.databinding.ItemDangerousRecommendDetailHolderBinding
import com.khs.ggp.domain.model.DangerousRecommendDetail

class DangerousRecommendDetailAdapter(private val youtubeIdList: List<DangerousRecommendDetail>): RecyclerView.Adapter<DangerousRecommendDetailAdapter.DangerousRecommendDetailHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DangerousRecommendDetailHolder {
        val binding = ItemDangerousRecommendDetailHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DangerousRecommendDetailHolder(binding)
    }

    override fun onBindViewHolder(holder: DangerousRecommendDetailHolder, position: Int) {
        holder.bind(youtubeIdList[position])
    }

    override fun getItemCount(): Int {
        return youtubeIdList.size
    }

    inner class DangerousRecommendDetailHolder(val binding: ItemDangerousRecommendDetailHolderBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: DangerousRecommendDetail) {
            val youtubeThumbnailURL = "https://img.youtube.com/vi/${item.youtubeId}/0.jpg"
            binding.imageView.load(youtubeThumbnailURL)

            binding.textView.text = item.title

            itemView.setOnClickListener {
                val youtubeLinkURL = "https://www.youtube.com/watch?v=${item.youtubeId}"

                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse(youtubeLinkURL)
                }

                itemView.context.startActivity(intent)
            }
        }

    }

}