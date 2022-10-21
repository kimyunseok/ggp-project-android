package com.khs.ggp.presentation.di.module

import android.content.Context
import androidx.room.Room
import com.khs.ggp.data.datasource.local.LocalDataSource
import com.khs.ggp.data.datasource.local.LocalDataSourceImpl
import com.khs.ggp.data.datasource.remote.RemoteDataSource
import com.khs.ggp.data.db.data.DataDao
import com.khs.ggp.data.db.data.Database
import com.khs.ggp.data.repository.DataRepositoryImpl
import com.khs.ggp.domain.repository.DataRepository
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

object LocalModule {

    @Singleton
    @Provides
    fun provideNewsDao(database: Database): DataDao = database.dataDao()

    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext context: Context): Database {
        return Room.databaseBuilder(
            context,
            Database::class.java,
            "data.db"
        ).allowMainThreadQueries()
            .build()
    }

    @Singleton
    @Provides
    fun provideLocalDataSource(dataDao: DataDao): LocalDataSource = LocalDataSourceImpl(dataDao)

    @Singleton
    @Provides
    fun provideNewsRepository(
        localDataSource: LocalDataSource,
        remoteDataSource: RemoteDataSource): DataRepository = DataRepositoryImpl(localDataSource, remoteDataSource)

}