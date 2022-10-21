package com.khs.ggp.data.datasource.remote

import com.khs.ggp.data.api.ApiService
import com.khs.ggp.data.model.DataResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiService: ApiService): RemoteDataSource {
    override suspend fun getData(): Flow<DataResponse> = flow {
        val dataResponse = apiService.getData()
        emit(dataResponse)
    }
}