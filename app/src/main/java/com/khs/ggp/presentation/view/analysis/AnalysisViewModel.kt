package com.khs.ggp.presentation.view.analysis

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.khs.ggp.domain.model.AnalysisType
import kotlinx.coroutines.launch

class AnalysisViewModel: ViewModel() {
    val dangerousScoreLiveData = MutableLiveData(0)
    val dangerousListLiveData = MutableLiveData<List<AnalysisType>>()

    fun getDummyData() {
        viewModelScope.launch {
            dangerousScoreLiveData.postValue(67)
            dangerousListLiveData.postValue(
                listOf(
                    AnalysisType(type = 9, score = 0.53F),
                    AnalysisType(type = 5, score = 0.31F),
                    AnalysisType(type = 8, score = 0.09F)
                )
            )
        }
    }
}