package com.example.kitsugithub.data.dtos

import com.google.gson.annotations.SerializedName

data class PosterImageDto(

    @SerializedName("small")
    val small: String = "",
    @SerializedName("original")
    val original: String = "",
    @SerializedName("large")
    val large: String = "",
    @SerializedName("tiny")
    val tiny: String = "",
    @SerializedName("medium")
    val medium: String = ""
)