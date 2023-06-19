package com.example.kitsugithub.models

import com.example.kitsugithub.data.dtos.AttributesDto
import com.example.kitsugithub.data.dtos.LinksDto
import com.google.gson.annotations.SerializedName

data class DataItemUI(

    @SerializedName("links")
    val linksDto: LinksDto,

    @SerializedName("attributes")
    val attributesDto: AttributesDto,

    @SerializedName("id")
    val id: String = "",

    @SerializedName("type")
    val type: String = "",
)
