package com.example.kitsugithub.presentation.ui.fragments.manga

import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.kitsugithub.presentation.base.BaseViewModel
import com.example.kitsugithub.data.repositories.MangaRepositoriesImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel  @Inject constructor(
    private val mangaRepositoriesImpl: MangaRepositoriesImpl
): BaseViewModel() {

    fun fetchManga() = mangaRepositoriesImpl.fetchManga().cachedIn(viewModelScope)
}