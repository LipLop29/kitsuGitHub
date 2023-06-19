package com.example.kitsugithub.data.dtos

import com.google.gson.annotations.SerializedName

data class LinksDto(

    @SerializedName("next")
    val next: String = "",

    @SerializedName("last")
    val last: String = "",

    @SerializedName("first")
    val first: String = ""
)
