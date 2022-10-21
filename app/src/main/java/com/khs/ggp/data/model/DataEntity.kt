package com.khs.ggp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = "dataTable")
data class DataEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val data: String,
)
