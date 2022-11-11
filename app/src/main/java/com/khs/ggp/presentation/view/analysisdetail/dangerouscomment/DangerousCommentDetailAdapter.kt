package com.khs.ggp.presentation.view.analysisdetail.dangerouscomment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khs.ggp.databinding.ItemDangerousCommentDetailHolderBinding
import com.khs.ggp.databinding.ItemDangerousCommentHolderBinding
import com.khs.ggp.databinding.ItemYoutubeUrlHolderBinding
import com.khs.ggp.domain.model.DangerousComment
import com.khs.ggp.presentation.utils.convertTypeToColor

class DangerousCommentDetailAdapter(private val dangerousCommentDetailList: List<String>): RecyclerView.Adapter<DangerousCommentDetailAdapter.DangerousCommentDetailHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DangerousCommentDetailHolder {
        val binding = ItemDangerousCommentDetailHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DangerousCommentDetailHolder(binding)
    }

    override fun onBindViewHolder(holder: DangerousCommentDetailHolder, position: Int) {
        holder.bind(dangerousCommentDetailList[position])
    }

    override fun getItemCount(): Int {
        return dangerousCommentDetailList.size
    }

    inner class DangerousCommentDetailHolder(val binding: ItemDangerousCommentDetailHolderBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: String) {
            binding.item = item
        }

    }

}