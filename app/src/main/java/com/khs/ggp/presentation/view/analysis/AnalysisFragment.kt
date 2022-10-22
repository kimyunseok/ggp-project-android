package com.khs.ggp.presentation.view.analysis

import androidx.fragment.app.viewModels
import com.khs.ggp.R
import com.khs.ggp.databinding.FragmentAnalysisBinding
import com.khs.ggp.presentation.view.base.BaseFragment

class AnalysisFragment(override var layoutId: Int = R.layout.fragment_analysis) : BaseFragment<FragmentAnalysisBinding>() {

    private val analysisViewModel: AnalysisViewModel by viewModels()

    override fun init() {
        binding.vm = analysisViewModel

    }
    
}