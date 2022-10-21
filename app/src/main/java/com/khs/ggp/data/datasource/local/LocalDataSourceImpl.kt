package com.khs.ggp.data.datasource.local

import com.khs.ggp.data.db.data.DataDao
import com.khs.ggp.data.model.DataEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(private val dataDao: DataDao): LocalDataSource {
    override suspend fun insertData(dataList: List<DataEntity>) = dataDao.insertData(dataList)

    override suspend fun getAllData(): Flow<Result<List<DataEntity>>> = dataDao.getAllData()
}