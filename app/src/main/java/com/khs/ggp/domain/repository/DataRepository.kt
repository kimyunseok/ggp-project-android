package com.khs.ggp.domain.repository

import com.khs.ggp.data.model.DataEntity
import com.khs.ggp.data.model.DataResponse
import kotlinx.coroutines.flow.Flow

interface DataRepository {
    suspend fun getRemoteData(): Flow<Result<DataResponse>>
    suspend fun insertData(dataList: List<DataEntity>)
    suspend fun getLocalData(): Flow<Result<List<DataEntity>>>
}