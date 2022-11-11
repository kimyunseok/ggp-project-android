package com.khs.ggp.presentation.view.analysisdetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.khs.ggp.domain.model.AnalysisType
import com.khs.ggp.domain.model.DangerousComment
import kotlinx.coroutines.launch

class AnalysisDetailViewModel: ViewModel() {
    val dangerousCommentListLiveData = MutableLiveData<List<DangerousComment>>()

    fun getDummyData() {

        viewModelScope.launch {
            dangerousCommentListLiveData.postValue(
                listOf(
                    DangerousComment(
                        type = 1, 
                        title = "악플 / 욕설", 
                        comment = listOf(
                            "안녕하세요.\n저는XXX입니다.\n영상잘보고있어요.", "반갑습니다.", "하이요"
                        )
                    ),
                    DangerousComment(
                        type = 2,
                        title = "여성 / 가족",
                        comment = listOf(
                            "안녕하세요.", "반갑습니다.", "하이요"
                        )
                    ),
                    DangerousComment(
                        type = 3,
                        title = "연령",
                        comment = listOf(
                            "안녕하세요.", "반갑습니다.", "하이요"
                        )
                    )
                )
            )
        }

    }
}