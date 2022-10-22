package com.khs.ggp.presentation.view.main

import com.khs.ggp.R
import com.khs.ggp.databinding.FragmentMainBinding
import com.khs.ggp.presentation.view.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment(override var layoutId: Int = R.layout.fragment_main) : BaseFragment<FragmentMainBinding>() {
    override fun init() {

    }
}