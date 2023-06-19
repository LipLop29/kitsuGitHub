package com.example.kitsugithub.data.dtos

import com.google.gson.annotations.SerializedName

data class AnimeDto<T>(
    @SerializedName("data")
    val data: List<T>,

    @SerializedName("links")
    val linksDto: LinksDto
)