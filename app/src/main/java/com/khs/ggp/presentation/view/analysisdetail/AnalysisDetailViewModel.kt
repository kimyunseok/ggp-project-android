package com.khs.ggp.presentation.view.analysisdetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.khs.ggp.domain.model.DangerousComment
import com.khs.ggp.domain.model.DangerousRecommend
import com.khs.ggp.domain.model.DangerousRecommendDetail
import kotlinx.coroutines.launch

class AnalysisDetailViewModel: ViewModel() {
    val dangerousCommentListLiveData = MutableLiveData<List<DangerousComment>>()

    val dangerousRecommendListLiveData = MutableLiveData<List<DangerousRecommend>>()

    fun getDummyData() {

        viewModelScope.launch {
            dangerousCommentListLiveData.postValue(
                listOf(
                    DangerousComment(
                        type = 1,
                        comment = listOf(
                            "안녕하세요.\n저는XXX입니다.\n영상잘보고있어요.", "반갑습니다.", "하이요"
                        )
                    ),
                    DangerousComment(
                        type = 2,
                        comment = listOf(
                            "안녕하세요.", "반갑습니다.", "하이요"
                        )
                    ),
                    DangerousComment(
                        type = 3,
                        comment = listOf(
                            "안녕하세요.", "반갑습니다.", "하이요"
                        )
                    )
                )
            )

            dangerousRecommendListLiveData.postValue(
                listOf(
                    DangerousRecommend(
                        type = 1,
                        youtubeIdList = listOf(
                            DangerousRecommendDetail(
                                youtubeId = "fTf0vT3DcqY",
                                title = "악플러들은 실제로 어떤 사람일까?"
                            ),
                            DangerousRecommendDetail(
                                youtubeId = "G2TMc9U0uOg",
                                title = "악플러들은 '나르시시즘, 마키아벨리즘, 사이코패시즘' 인간 악의 3대장를 모두 가졌다? [타인의심리읽어드립니다 EP.5] | 김경일 교수"
                            ),
                        )
                    ),
                    DangerousRecommend(
                        type = 2,
                        youtubeIdList = listOf(
                            DangerousRecommendDetail(
                                youtubeId = "LS9OGiyopuU",
                                title = "남성에게도 성평등이 좋은 이유 | 3분 씨리얼"
                            ),
                            DangerousRecommendDetail(
                                youtubeId = "ERxtacu4Omw",
                                title = "전 세계 남성과 여성을 감동시킨, 엠마 왓슨 UN 연설"
                            ),
                            DangerousRecommendDetail(
                                youtubeId = "Nv1n489rOb0",
                                title = "헤겔 [법철학] : 가족이란 무엇인가? (1) [정진우의 철학교실]"
                            ),
                        )
                    ),
                    DangerousRecommend(
                        type = 3,
                        youtubeIdList = listOf(
                            DangerousRecommendDetail(
                                youtubeId = "IgBt1T6WZno",
                                title = "2022. 05. 30 [어린이 인권 기획 16편] \"어린이 출입 금지·'잼민이' 낙인\"‥어린이 혐오 확산"
                            ),
                            DangerousRecommendDetail(
                                youtubeId = "rt_IxwpJne8",
                                title = "고령화 속도보다 빠른 '노인 혐오'/ 연합뉴스 (Yonhapnews)\n"
                            ),
                        )
                    ),
                )
            )
        }

    }
}