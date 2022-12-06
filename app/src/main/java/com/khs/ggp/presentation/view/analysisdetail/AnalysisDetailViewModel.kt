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
                        type = 5,
                        comment = listOf(
                            "만두피나네 ㅋㅋ 아직 너무 어리다 어려 애새끼여 무슨",
                            "아니 왤캐 어린새끼를 데려왔냐..... 체육관에 선수가 그렇게 없나",
                            "키가 초딩 잼민이잖아.... 극혐이네"
                        )
                    ),
                    DangerousComment(
                        type = 9,
                        comment = listOf(
                            "바이퍼는 항상저런 졷밥이랑만 붙히노",
                            "그러게 왜깝침ㅋㅋㅋ 쳐맞는거 보니까 시원하네",
                            "꼬우면 보지말던가 씨발ㅋㅋ"
                        )
                    ),
                    DangerousComment(
                        type = 8,
                        comment = listOf(
                            "와... 블랙컴뱃 어쩌다 이렇게 망했냐 진짜 ㅋㅋㅋ 눈갱수준인데",
                            "아니 진짜 좆소 마이너 리그 보다 못하네",
                            "체급이 낮다지만 난쟁이새끼가 나와서 경기를하네ㅡㅡ"
                        )
                    )
                )
            )

            dangerousRecommendListLiveData.postValue(
                listOf(
                    DangerousRecommend(
                        type = 5,
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
                    DangerousRecommend(
                        type = 9,
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
                        type = 8,
                        youtubeIdList = listOf(
                            DangerousRecommendDetail(
                                youtubeId = "veicmwanP_E",
                                title = "세바시 790회 혐오표현은 어떻게 사회를 파괴하는가 | 홍성수 숙명여자대학교 법학부 교수"
                            ),
                            DangerousRecommendDetail(
                                youtubeId = "-HY62NCqB4I",
                                title = "[비정상회담][46-5] 타일러vs일리야♨ '혐오 표현도 표현의 자유인가' (Abnormal Summit)"
                            )
                        )
                    ),
//                    DangerousRecommend(
//                        type = 1,
//                        youtubeIdList = listOf(
//                            DangerousRecommendDetail(
//                                youtubeId = "LS9OGiyopuU",
//                                title = "남성에게도 성평등이 좋은 이유 | 3분 씨리얼"
//                            ),
//                            DangerousRecommendDetail(
//                                youtubeId = "ERxtacu4Omw",
//                                title = "전 세계 남성과 여성을 감동시킨, 엠마 왓슨 UN 연설"
//                            ),
//                            DangerousRecommendDetail(
//                                youtubeId = "Nv1n489rOb0",
//                                title = "헤겔 [법철학] : 가족이란 무엇인가? (1) [정진우의 철학교실]"
//                            ),
//                        )
//                    ),
                )
            )
        }

    }
}