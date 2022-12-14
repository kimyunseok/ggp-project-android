package com.khs.ggp.presentation.di.module

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.khs.ggp.data.api.ApiClient
import com.khs.ggp.data.api.ApiService
import com.khs.ggp.data.datasource.remote.RemoteDataSource
import com.khs.ggp.data.datasource.remote.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Singleton
    @Provides
    fun provideRemoteDataSource(apiService: ApiService): RemoteDataSource {
        return RemoteDataSourceImpl(apiService)
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, json: Json): Retrofit {
        return Retrofit.Builder()
            .baseUrl(ApiClient.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
            .build()
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(
        headerInterceptor: Interceptor
    ): OkHttpClient {

        val okHttpClientBuilder = OkHttpClient().newBuilder()
        okHttpClientBuilder.connectTimeout(15, TimeUnit.SECONDS)
        okHttpClientBuilder.readTimeout(15, TimeUnit.SECONDS)
        okHttpClientBuilder.writeTimeout(15, TimeUnit.SECONDS)
        okHttpClientBuilder.addInterceptor(headerInterceptor)

        return okHttpClientBuilder.build()
    }

    @Provides
    @Singleton
    fun provideHeaderInterceptor(): Interceptor {
        return Interceptor { chain ->
            with(chain) {
                val newRequest = request().newBuilder()
                    .addHeader("{Head Name}", "{Header Value}")
                    .build()
                proceed(newRequest)
            }
        }
    }

    @Singleton
    @Provides
    fun providesJsonParser(): Json = Json {
        ignoreUnknownKeys = true // Field??? ?????? ?????? ??????. (false??? ??????, ?????? ??????.)
        coerceInputValues = true // Field?????? NULL??? ??????, default Argument ????????? ??????
    }
}