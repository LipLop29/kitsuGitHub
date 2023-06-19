package com.example.kitsugithub.presentation.ui.fragments.anime

import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.kitsugithub.presentation.base.BaseViewModel
import com.example.kitsugithub.data.repositories.AnimeRepositoriesImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoriesImpl: AnimeRepositoriesImpl
): BaseViewModel() {

    fun fetchAnime() = animeRepositoriesImpl.fetchAnime().cachedIn(viewModelScope)
}