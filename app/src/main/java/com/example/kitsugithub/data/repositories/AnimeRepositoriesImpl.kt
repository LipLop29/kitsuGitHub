package com.example.kitsugithub.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.kitsugithub.data.base.BaseRepository
import com.example.kitsugithub.data.remote.apiservices.AnimeApiServices
import com.example.kitsugithub.data.repositories.pagingsours.AnimePagingSours
import com.example.kitsugithub.domain.repositories.AnimeRepository
import javax.inject.Inject

class AnimeRepositoriesImpl @Inject constructor(
    private val animeApiServices: AnimeApiServices
) : BaseRepository(), AnimeRepository {

    override fun fetchAnime() = Pager(
        PagingConfig(pageSize = 20, initialLoadSize = 10)
    ) {
        AnimePagingSours(animeApiServices)
    }.liveData

    override fun fetchAnimeDetail(id: String) = doRequest {
            animeApiServices.fetchAnimeDetail(id)
    }
}