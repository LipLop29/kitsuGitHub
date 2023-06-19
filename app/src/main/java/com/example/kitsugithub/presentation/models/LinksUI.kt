package com.example.kitsugithub.models

import com.google.gson.annotations.SerializedName

data class LinksUI(

    @SerializedName("next")
    val next: String = "",

    @SerializedName("last")
    val last: String = "",

    @SerializedName("first")
    val first: String = ""
)
