package com.example.kitsugithub.presentation.ui.fragments.manga.detail

import com.example.kitsugithub.presentation.base.BaseViewModel
import com.example.kitsugithub.data.repositories.MangaRepositoriesImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailMangaViewModel @Inject constructor(
    private val mangaRepositoriesImpl: MangaRepositoriesImpl
): BaseViewModel() {

    fun fetchDetailManga(id: String) = mangaRepositoriesImpl.fetchMangaDetail(id)
}