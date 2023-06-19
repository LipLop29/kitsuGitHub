package com.example.kitsugithub.data.dtos

import com.google.gson.annotations.SerializedName
data class ResponseDataDto(

    @SerializedName("data")
    val data: DataItemDto
)