package com.example.kitsugithub.presentation.ui.fragments.anime.detail

import com.example.kitsugithub.presentation.base.BaseViewModel
import com.example.kitsugithub.data.repositories.AnimeRepositoriesImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailAnimeViewModel @Inject constructor(
    private val animeRepositoriesImpl: AnimeRepositoriesImpl,
) : BaseViewModel() {

    fun fetchDetailAnime(id: String) = animeRepositoriesImpl.fetchAnimeDetail(id)
}