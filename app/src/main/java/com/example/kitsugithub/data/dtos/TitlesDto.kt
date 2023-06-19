package com.example.kitsugithub.data.dtos

import com.google.gson.annotations.SerializedName

data class TitlesDto(

    @SerializedName("en")
    val en: String = "",
    @SerializedName("ja_jp")
    val jaJp: String = "",
    @SerializedName("en_jp")
    val enJp: String = "",
)
