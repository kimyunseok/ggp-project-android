package com.khs.ggp.presentation.utils

import android.graphics.Color

fun Int.convertTypeNumToTypeString(): String {
    return when(this) {
        0 -> "clean"
        1 -> "여성 / 가족"
        2 -> "남성"
        3 -> "성소수자"
        4 -> "인종 / 국적"
        5 -> "연령"
        6 -> "지역"
        7 -> "종교"
        8 -> "기타 혐오"         
        9 -> "악플 / 욕설"
        else -> "알 수 없음"
    }
}

fun Int.convertTypeToColor(): Int {
    return when(this) {
        1 -> Color.parseColor("#FF0000")
        2 -> Color.parseColor("#FF8800")
        3 -> Color.parseColor("#0000FF")
        4 -> Color.parseColor("#FBCEB1")
        5 -> Color.parseColor("#00CC00")
        6 -> Color.parseColor("#CC00CC")
        7 -> Color.parseColor("#663300")
        8 -> Color.parseColor("#006699")
        9 -> Color.parseColor("#660033")
        else -> Color.BLACK
    }
}