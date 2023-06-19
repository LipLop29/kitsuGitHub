package com.example.kitsugithub.presentation.ui.fragments.manga.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsugithub.R
import com.example.kitsugithub.presentation.base.BaseFragment
import com.example.kitsugithub.databinding.FragmentDetailMangaBinding
import com.example.kitsugithub.presentation.extension.setImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailMangaFragment :
    BaseFragment<DetailMangaViewModel, FragmentDetailMangaBinding>(R.layout.fragment_detail_manga) {

    override val binding by viewBinding(FragmentDetailMangaBinding::bind)
    override val viewModel by viewModels<DetailMangaViewModel>()
    private val args by navArgs<DetailMangaFragmentArgs>()

    override fun setupSubscribes() = with(binding){
        viewModel.fetchDetailManga(args.id).subscribe(
            onError = {
            },
            onSuccess = { it ->

                it.data.let {
                    itemDetailImg.setImage(it.attributesDto.posterImageDto.original)
                    itemBigImg.setImage(it.attributesDto.posterImageDto.original)
                    detailNameAnime.text = it.attributesDto.titlesDto.enJp
                    tvMangaChapters.text = it.attributesDto.chapterCount.toString()
                    tvMangaStatus.text = it.attributesDto.status
                    tvMangaPremiered.text = it.attributesDto.startDate
                    tvMangaAgeRating.text = it.attributesDto.ageRating
                    detailDescription2.text = it.attributesDto.description
                }
            }
        )
    }
}