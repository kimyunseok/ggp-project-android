package com.khs.ggp.presentation.view.analysisdetail.dangerousrecommend

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khs.ggp.databinding.ItemDangerousRecommendHolderBinding
import com.khs.ggp.domain.model.DangerousRecommend
import com.khs.ggp.presentation.utils.convertTypeToColor

class DangerousRecommendAdapter(private val dangerousRecommendList: List<DangerousRecommend>): RecyclerView.Adapter<DangerousRecommendAdapter.DangerousRecommendHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DangerousRecommendHolder {
        val binding = ItemDangerousRecommendHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DangerousRecommendHolder(binding)
    }

    override fun onBindViewHolder(holder: DangerousRecommendHolder, position: Int) {
        holder.bind(dangerousRecommendList[position])
    }

    override fun getItemCount(): Int {
        return dangerousRecommendList.size
    }

    inner class DangerousRecommendHolder(val binding: ItemDangerousRecommendHolderBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: DangerousRecommend) {
            binding.item = item

            binding.textView.setTextColor(item.type.convertTypeToColor())

            binding.dangerousRecommendDetailRecyclerView.apply {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter = DangerousRecommendDetailAdapter(item.youtubeIdList)
            }
        }

    }

}