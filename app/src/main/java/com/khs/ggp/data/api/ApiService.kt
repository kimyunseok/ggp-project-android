package com.khs.ggp.data.api

import com.khs.ggp.data.model.DataResponse
import retrofit2.http.GET

interface ApiService {
    @GET("{path}")
    suspend fun getData(): DataResponse
}