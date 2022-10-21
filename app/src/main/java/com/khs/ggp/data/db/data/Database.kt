package com.khs.ggp.data.db.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.khs.ggp.data.model.DataEntity

@Database(entities = [DataEntity::class], version = 1)
abstract class Database: RoomDatabase() {
    abstract fun dataDao(): DataDao
}