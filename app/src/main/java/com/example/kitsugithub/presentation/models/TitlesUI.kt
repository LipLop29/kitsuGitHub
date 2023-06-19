package com.example.kitsugithub.models

import com.google.gson.annotations.SerializedName

data class TitlesUI(

    @SerializedName("en")
    val en: String = "",
    @SerializedName("ja_jp")
    val jaJp: String = "",
    @SerializedName("en_jp")
    val enJp: String = "",
)
