package com.khs.ggp.domain.usecase

import com.khs.ggp.data.model.DataEntity
import com.khs.ggp.domain.repository.DataRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DataUseCase @Inject constructor(private val dataRepository: DataRepository) {
    suspend fun getRemoteData() = dataRepository.getRemoteData()
    suspend fun insertData(dataList: List<DataEntity>) = dataRepository.insertData(dataList)
    suspend fun getLocalData(): Flow<List<DataEntity>> = dataRepository.getLocalData()
}