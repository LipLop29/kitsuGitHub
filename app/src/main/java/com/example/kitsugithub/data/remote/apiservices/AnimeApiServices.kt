package com.example.kitsugithub.data.remote.apiservices

import com.example.kitsugithub.data.dtos.AnimeDto
import com.example.kitsugithub.data.dtos.DataItemDto
import com.example.kitsugithub.data.dtos.ResponseDataDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeApiServices {

    @GET("edge/anime")
    suspend fun fetchAnime(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int,
    ): AnimeDto<DataItemDto>

    @GET("edge/anime/{id}")
    suspend fun fetchAnimeDetail(@Path("id") id: String): ResponseDataDto
}