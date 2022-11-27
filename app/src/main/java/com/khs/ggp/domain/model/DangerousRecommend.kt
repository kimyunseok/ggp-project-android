package com.khs.ggp.domain.model

data class DangerousRecommend (val type: Int, val title: String, val youtubeIdList: List<DangerousRecommendDetail>)