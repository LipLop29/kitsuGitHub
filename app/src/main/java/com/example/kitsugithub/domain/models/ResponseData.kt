package com.example.kitsugithub.models

import com.example.kitsugithub.data.dtos.DataItemDto
import com.google.gson.annotations.SerializedName
data class ResponseData(

    @SerializedName("data")
    val data: DataItemDto
)