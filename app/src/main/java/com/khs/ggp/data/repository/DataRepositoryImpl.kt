package com.khs.ggp.data.repository

import com.khs.ggp.data.datasource.local.LocalDataSource
import com.khs.ggp.data.datasource.remote.RemoteDataSource
import com.khs.ggp.data.model.DataEntity
import com.khs.ggp.data.model.DataResponse
import com.khs.ggp.domain.repository.DataRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DataRepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
): DataRepository {
    override suspend fun getRemoteData(): Flow<Result<DataResponse>> = remoteDataSource.getData()

    override suspend fun insertData(dataList: List<DataEntity>) = localDataSource.insertData(dataList)

    override suspend fun getLocalData(): Flow<Result<List<DataEntity>>> = localDataSource.getAllData()

}