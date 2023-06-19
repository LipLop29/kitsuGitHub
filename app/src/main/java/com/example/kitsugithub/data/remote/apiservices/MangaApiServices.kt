package com.example.kitsugithub.data.remote.apiservices

import com.example.kitsugithub.data.dtos.AnimeDto
import com.example.kitsugithub.data.dtos.DataItemDto
import com.example.kitsugithub.data.dtos.ResponseDataDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MangaApiServices {

    @GET("edge/manga")
    suspend fun fetchManga(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int,
    ): AnimeDto<DataItemDto>

    @GET("edge/manga/{id}")
    suspend fun fetchMangaDetail(@Path("id") id: String): ResponseDataDto
}