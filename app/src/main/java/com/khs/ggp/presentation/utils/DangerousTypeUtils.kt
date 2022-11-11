package com.khs.ggp.presentation.utils

import android.graphics.Color

fun Int.convertTypeToColor(): Int {
    return when(this) {
        1 -> Color.parseColor("#FF0000")
        2 -> Color.parseColor("#FF8800")
        3 -> Color.parseColor("#0000FF")
        else -> Color.BLACK
    }
}