package com.khs.ggp.presentation.view.analysisdetail

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.khs.ggp.R
import com.khs.ggp.databinding.FragmentAnalysisDetailBinding
import com.khs.ggp.presentation.view.analysisdetail.dangerouscomment.DangerousCommentAdapter
import com.khs.ggp.presentation.view.base.BaseFragment

class AnalysisDetailFragment(override val layoutId: Int = R.layout.fragment_analysis_detail): BaseFragment<FragmentAnalysisDetailBinding>() {

    private val analysisDetailViewModel: AnalysisDetailViewModel by viewModels()

    override fun init() {
        binding.vm = analysisDetailViewModel

        testFun()
        setUpRecyclerView()
    }

    private fun testFun() {
        analysisDetailViewModel.getDummyData()
    }

    private fun setUpRecyclerView() {
        analysisDetailViewModel.dangerousCommentListLiveData.observe(viewLifecycleOwner) {
            binding.dangerousCommentRecyclerView.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = DangerousCommentAdapter(it )
            }
        }
    }
}