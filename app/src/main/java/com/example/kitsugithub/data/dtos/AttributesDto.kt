package com.example.kitsugithub.data.dtos

import com.example.kitsugithub.domain.models.Attributes
import com.google.gson.annotations.SerializedName

data class AttributesDto(

    @SerializedName("description")
    val description: String = "",
    @SerializedName("episodeCount")
    val episodeCount: Int = 0,
    @SerializedName("posterImage")
    val posterImageDto: PosterImageDto,
    @SerializedName("chapterCount")
    val chapterCount: Int,
    @SerializedName("titles")
    val titlesDto: TitlesDto,
    @SerializedName("ageRating")
    val ageRating: String = "",
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String = "",
    @SerializedName("startDate")
    val startDate: String = "",
    @SerializedName("status")
    val status: String = "",
)

fun AttributesDto.toDomain() : Attributes {
    return Attributes(
        description,
        episodeCount,
        posterImageDto,
        chapterCount,
        titlesDto,
        ageRating,
        ageRatingGuide,
        startDate
    )
}
