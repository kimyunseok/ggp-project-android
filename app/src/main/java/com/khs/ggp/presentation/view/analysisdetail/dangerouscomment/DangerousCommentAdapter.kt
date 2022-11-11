package com.khs.ggp.presentation.view.analysisdetail.dangerouscomment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khs.ggp.databinding.ItemDangerousCommentHolderBinding
import com.khs.ggp.databinding.ItemYoutubeUrlHolderBinding
import com.khs.ggp.domain.model.DangerousComment
import com.khs.ggp.presentation.utils.convertTypeToColor

class DangerousCommentAdapter(private val dangerousCommentList: List<DangerousComment>): RecyclerView.Adapter<DangerousCommentAdapter.DangerousCommentHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DangerousCommentHolder {
        val binding = ItemDangerousCommentHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DangerousCommentHolder(binding)
    }

    override fun onBindViewHolder(holder: DangerousCommentHolder, position: Int) {
        holder.bind(dangerousCommentList[position])
    }

    override fun getItemCount(): Int {
        return dangerousCommentList.size
    }

    inner class DangerousCommentHolder(val binding: ItemDangerousCommentHolderBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: DangerousComment) {
            binding.item = item

            binding.textView.setTextColor(item.type.convertTypeToColor())
        }

    }

}