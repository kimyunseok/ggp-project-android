package com.khs.ggp.data.datasource.remote

import com.khs.ggp.data.model.DataResponse
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {

    suspend fun getData(): Flow<Result<DataResponse>>

}