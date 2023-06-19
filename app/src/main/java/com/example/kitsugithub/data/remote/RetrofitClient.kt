package com.example.kitsugithub.data.remote

import com.example.kitsugithub.data.remote.apiservices.AnimeApiServices
import com.example.kitsugithub.data.remote.apiservices.MangaApiServices
import com.example.kitsugithub.utils.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

    private var OkHttpClient = OkHttpClient()
        .newBuilder()
        .addInterceptor(provideLoggingInterceptor())
        .callTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private val retrofitClient = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(OkHttpClient)
        .build()

    private fun provideLoggingInterceptor() = HttpLoggingInterceptor().setLevel(
        HttpLoggingInterceptor.Level.BODY)

    fun provideAnimeApiServices(): AnimeApiServices {
        return retrofitClient.create(AnimeApiServices::class.java)
    }
    fun provideMangaApiServices(): MangaApiServices {
        return retrofitClient.create(MangaApiServices::class.java)
    }
}