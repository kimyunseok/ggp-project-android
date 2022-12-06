package com.khs.ggp.presentation.view.analysis

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.khs.ggp.R
import com.khs.ggp.databinding.FragmentAnalysisBinding
import com.khs.ggp.presentation.view.base.BaseFragment
import com.khs.ggp.presentation.view.base.LoadingDialogFragment
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class AnalysisFragment(override var layoutId: Int = R.layout.fragment_analysis) : BaseFragment<FragmentAnalysisBinding>() {

    private val analysisViewModel: AnalysisViewModel by viewModels()

    override fun init() {
        binding.vm = analysisViewModel

        testFun()
        setUpRecyclerView()
        setUpBtnListener()
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

    private fun setUpBtnListener() {
        binding.analysisWatchDetailBtn.setOnClickListener {

            val loadingDialogFragment = LoadingDialogFragment()
            loadingDialogFragment.show(childFragmentManager, null)
            lifecycleScope.launch {
                delay(3000)
                loadingDialogFragment.dismiss()
                findNavController().navigate(R.id.action_analysisFragment_to_analysisDetailFragment)
            }
        }
    }
    
}