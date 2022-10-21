package com.khs.ggp.data.datasource.local

import com.khs.ggp.data.model.DataEntity
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {
    suspend fun insertData(dataList: List<DataEntity>)
    suspend fun getAllData(): Flow<List<DataEntity>>
}