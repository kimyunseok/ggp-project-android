package com.khs.ggp.presentation.view.analysis

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.khs.ggp.databinding.ItemDangerousTypeHolderBinding
import com.khs.ggp.domain.model.AnalysisType
import com.khs.ggp.presentation.utils.convertTypeToColor

class DangerousTypeAdapter(private val typeList: List<AnalysisType>): RecyclerView.Adapter<DangerousTypeAdapter.DangerousTypeHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DangerousTypeHolder {
        val binding = ItemDangerousTypeHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DangerousTypeHolder(binding)
    }

    override fun onBindViewHolder(holder: DangerousTypeHolder, position: Int) {
        holder.bind(typeList[position])
    }

    override fun getItemCount(): Int {
        return typeList.size
    }

    inner class DangerousTypeHolder(val binding: ItemDangerousTypeHolderBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: AnalysisType) {
            binding.item = item

            binding.dangerousTypeView.apply {
                (layoutParams as ConstraintLayout.LayoutParams).apply {
                    matchConstraintPercentHeight = item.score
                }

                setBackgroundColor(item.type.convertTypeToColor())
            }

        }

    }

}