package com.khs.ggp.domain.model

import android.graphics.Color

data class AnalysisType(val type: Int, val name: String, val score: Float) {
    fun convertTypeToColor(): Int {
        return when(this.type) {
            1 -> Color.parseColor("#FF0000")
            2 -> Color.parseColor("#FF8800")
            3 -> Color.parseColor("#0000FF")
            else -> Color.BLACK
        }
    }
}
