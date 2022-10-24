package com.khs.ggp.presentation.view.analysis

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.khs.ggp.R
import com.khs.ggp.databinding.FragmentAnalysisBinding
import com.khs.ggp.presentation.view.base.BaseFragment

class AnalysisFragment(override var layoutId: Int = R.layout.fragment_analysis) : BaseFragment<FragmentAnalysisBinding>() {

    private val analysisViewModel: AnalysisViewModel by viewModels()

    override fun init() {
        binding.vm = analysisViewModel

        testFun()
        setUpRecyclerView()
    }

    private fun testFun() {
        analysisViewModel.getDummyData()
    }

    private fun setUpRecyclerView() {
        analysisViewModel.dangerousListLiveData.observe(viewLifecycleOwner) {
            binding.analysisResultRecyclerView.apply {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter = DangerousTypeAdapter(it)
            }
        }
    }
    
}