package com.example.kitsugithub.models

import com.example.kitsugithub.data.dtos.AttributesDto
import com.example.kitsugithub.data.dtos.LinksDto
import com.google.gson.annotations.SerializedName

data class DataItem(

    @SerializedName("attributes")
    val attributesDto: AttributesDto,

    @SerializedName("id")
    val id: String = "",
)
