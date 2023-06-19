package com.example.kitsugithub.data.repositories.pagingsours

import android.net.Uri
import com.example.kitsugithub.data.dtos.DataItemDto
import com.example.kitsugithub.data.base.BasePagingSource
import com.example.kitsugithub.data.remote.apiservices.MangaApiServices

class MangaPagingSours (private val apiServices: MangaApiServices
): BasePagingSource<DataItemDto>(){

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, DataItemDto> {
        return try {
            val nextPage = params.key ?: HEADLINE_PAGE
            val response = apiServices.fetchManga(params.loadSize, nextPage)
            val nextPages =
                Uri.parse(response.linksDto.next).getQueryParameter("page[offset]")!!.toInt()

            LoadResult.Page(
                data = response.data,
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = nextPages
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}