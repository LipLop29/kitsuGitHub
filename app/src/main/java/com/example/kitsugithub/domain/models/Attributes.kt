package com.example.kitsugithub.domain.models

import com.example.kitsugithub.data.dtos.PosterImageDto
import com.example.kitsugithub.data.dtos.TitlesDto

data class Attributes(
    val description: String = "",
    val episodeCount: Int = 0,
    val posterImageDto: PosterImageDto,
    val chapterCount: Int,
    val titlesDto: TitlesDto,
    val ageRating: String = "",
    val ageRatingGuide: String = "",
    val startDate: String = "",
    val status: String = "",
)
