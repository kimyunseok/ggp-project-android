package com.khs.ggp.presentation.view.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.khs.ggp.databinding.FragmentLoadingDialogBinding

class LoadingDialogFragment: DialogFragment() {

    lateinit var binding: FragmentLoadingDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoadingDialogBinding.inflate(inflater, container, false)

        isCancelable = false

        return binding.root
    }

}