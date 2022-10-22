package com.khs.ggp.presentation.view.main

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.khs.ggp.R
import com.khs.ggp.databinding.FragmentMainBinding
import com.khs.ggp.presentation.view.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

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
    }
}