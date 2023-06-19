package com.example.kitsugithub.data.dtos

import com.google.gson.annotations.SerializedName

data class DataItemDto(

    @SerializedName("links")
    val linksDto: LinksDto,

    @SerializedName("attributes")
    val attributesDto: AttributesDto,

    @SerializedName("id")
    val id: String = "",

    @SerializedName("type")
    val type: String = "",
)
