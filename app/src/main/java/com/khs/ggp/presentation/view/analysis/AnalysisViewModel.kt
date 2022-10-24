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
            dangerousScoreLiveData.postValue(88)
            dangerousListLiveData.postValue(
                listOf(
                    AnalysisType(type = 1, name = "악플 / 욕설", score = 0.768234F),
                    AnalysisType(type = 2, name = "여성 / 가족", score = 0.421352F),
                    AnalysisType(type = 3, name = "연령", score = 0.157689F)
                )
            )
        }
    }
}