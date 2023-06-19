package com.example.kitsugithub.presentation.ui.fragments.tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kitsugithub.databinding.FragmentTabLayoutBinding
import com.example.kitsugithub.presentation.ui.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutFragment : Fragment() {

    private lateinit var binding: FragmentTabLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentTabLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        val adapter = ViewPagerAdapter(this@TabLayoutFragment)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Anime"
                }
                1 -> {
                    tab.text = "Manga"
                }
            }
        }.attach()
    }
}