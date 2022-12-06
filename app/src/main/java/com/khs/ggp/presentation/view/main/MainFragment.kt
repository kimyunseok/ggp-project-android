package com.khs.ggp.presentation.view.main

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.khs.ggp.R
import com.khs.ggp.databinding.FragmentMainBinding
import com.khs.ggp.presentation.view.base.BaseFragment
import com.khs.ggp.presentation.view.base.LoadingDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment(override var layoutId: Int = R.layout.fragment_main) : BaseFragment<FragmentMainBinding>() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun init() {
        setUpURLRecyclerView()
        setUpBtnListener()
    }

    private fun setUpURLRecyclerView() {
        binding.mainLinkRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = YoutubeURLAdapter(mainViewModel.urlList)
        }
    }

    private fun setUpBtnListener() {
        binding.mainLinkAddBtn.setOnClickListener {
            if(mainViewModel.urlList.size < 5) {
                mainViewModel.urlList.add("")
                binding.mainLinkRecyclerView.adapter?.notifyItemInserted(mainViewModel.urlList.size)
            } else {
                Toast.makeText(context, R.string.maximum_url_is_five, Toast.LENGTH_SHORT).show()
            }
        }

        binding.mainAnalyzeRequestBtn.setOnClickListener {
            val loadingDialogFragment = LoadingDialogFragment()
            loadingDialogFragment.show(childFragmentManager, null)
            lifecycleScope.launch {
                delay(3000)
                loadingDialogFragment.dismiss()
                findNavController().navigate(R.id.action_mainFragment_to_analysisFragment)
            }
        }
    }
}