package com.example.kitsugithub.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.kitsugithub.data.base.BaseRepository
import com.example.kitsugithub.data.remote.apiservices.MangaApiServices
import com.example.kitsugithub.data.repositories.pagingsours.AnimePagingSours
import com.example.kitsugithub.data.repositories.pagingsours.MangaPagingSours
import com.example.kitsugithub.domain.repositories.MangaRepository
import javax.inject.Inject

class MangaRepositoriesImpl  @Inject constructor(
    private val mangaApiServices: MangaApiServices
): BaseRepository(), MangaRepository {

    override fun fetchManga() = Pager(
        PagingConfig(pageSize = 20, initialLoadSize = 10)
    ) {
        MangaPagingSours(mangaApiServices)
    }.liveData

    override fun fetchMangaDetail(id: String) = doRequest {
        mangaApiServices.fetchMangaDetail(id)
    }
}