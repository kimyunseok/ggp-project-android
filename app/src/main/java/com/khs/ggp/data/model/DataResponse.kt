package com.khs.ggp.data.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class DataResponse(
    @SerializedName("data")
    val data: List<DataResponseModel>,
) {
    @Serializable
    data class DataResponseModel(
        val data: String,
    )
}
