package com.example.kitsugithub.models

import com.example.kitsugithub.data.dtos.LinksDto

data class Anime<T>(

    val data: List<T>,
    val linksDto: LinksDto
)