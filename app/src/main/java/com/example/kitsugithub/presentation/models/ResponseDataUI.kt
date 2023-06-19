package com.example.kitsugithub.models

import com.example.kitsugithub.data.dtos.DataItemDto
import com.google.gson.annotations.SerializedName
data class ResponseDataUI(

    @SerializedName("data")
    val data: DataItemDto
)