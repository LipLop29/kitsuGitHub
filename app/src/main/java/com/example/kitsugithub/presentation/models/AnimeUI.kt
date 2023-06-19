package com.example.kitsugithub.models

import com.example.kitsugithub.data.dtos.LinksDto
import com.google.gson.annotations.SerializedName

data class AnimeUI<T>(
    @SerializedName("data")
    val data: List<T>,

    @SerializedName("links")
    val linksDto: LinksDto
)