package com.example.kitsugithub.presentation.ui.fragments.anime.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsugithub.R
import com.example.kitsugithub.presentation.base.BaseFragment
import com.example.kitsugithub.databinding.FragmentDetailAnimeBinding
import com.example.kitsugithub.presentation.extension.setImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailAnimeFragment :
    BaseFragment<DetailAnimeViewModel, FragmentDetailAnimeBinding>(R.layout.fragment_detail_anime) {

    override val binding by viewBinding(FragmentDetailAnimeBinding::bind)
    override val viewModel by viewModels<DetailAnimeViewModel>()
    private val args by navArgs<DetailAnimeFragmentArgs>()

    override fun setupSubscribes() = with(binding){
        viewModel.fetchDetailAnime(args.id).subscribe(
            onError = {
            },
            onSuccess = { it ->
                it.data.let {
                    itemDetailImg.setImage(it.attributesDto.posterImageDto.original)
                    itemBigImg.setImage(it.attributesDto.posterImageDto.original)
                    detailNameAnime.text = it.attributesDto.titlesDto.enJp
                    tvAnimeEpisodes.text = it.attributesDto.episodeCount.toString()
                    tvAnimeStatus.text = it.attributesDto.status
                    tvAnimePremiered.text = it.attributesDto.startDate
                    tvAnimeAgeRating.text = it.attributesDto.ageRatingGuide
                    detailDescription.text = it.attributesDto.description
                }
            }
        )
    }
}