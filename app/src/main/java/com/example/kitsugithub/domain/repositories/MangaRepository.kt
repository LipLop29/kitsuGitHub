package com.example.kitsugithub.domain.repositories

import androidx.lifecycle.LiveData
import androidx.paging.PagingData
import com.example.kitsugithub.data.dtos.DataItemDto
import com.example.kitsugithub.data.dtos.ResponseDataDto
import com.example.kitsugithub.utils.Resource
import kotlinx.coroutines.flow.Flow

interface MangaRepository {

    fun fetchManga(): LiveData<PagingData<DataItemDto>>

    fun fetchMangaDetail(id: String): Flow<Resource<ResponseDataDto>>

}