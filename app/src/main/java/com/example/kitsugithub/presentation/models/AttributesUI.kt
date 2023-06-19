package com.example.kitsugithub.presentation.models

import android.os.Parcelable
import com.example.kitsugithub.data.dtos.PosterImageDto
import com.example.kitsugithub.data.dtos.TitlesDto
import com.example.kitsugithub.domain.models.Attributes
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class AttributesUI(
    @SerializedName("description")
    val description: String = "",
    @SerializedName("episodeCount")
    val episodeCount: Int = 0,
    @SerializedName("posterImage")
    val posterImageDto: @RawValue PosterImageDto,
    @SerializedName("chapterCount")
    val chapterCount: Int,
    @SerializedName("titles")
    val titlesDto: @RawValue TitlesDto,
    @SerializedName("ageRating")
    val ageRating: String = "",
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String = "",
    @SerializedName("startDate")
    val startDate: String = "",
    @SerializedName("status")
    val status: String = "",
) : Parcelable

fun Attributes.toUI(): AttributesUI {
    return AttributesUI(
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
