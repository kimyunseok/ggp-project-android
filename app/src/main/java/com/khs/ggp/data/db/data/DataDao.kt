package com.khs.ggp.data.db.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.khs.ggp.data.model.DataEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DataDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(dataEntity: List<DataEntity>)

    @Query("SELECT * FROM dataTable")
    fun getAllData(): Flow<List<DataEntity>>
}