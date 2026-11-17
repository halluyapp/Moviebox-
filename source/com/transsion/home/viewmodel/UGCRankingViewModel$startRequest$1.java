package com.transsion.home.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.home.bean.UGCRankAllData;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;
import sl.InterfaceC27630d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.UGCRankingViewModel$startRequest$1", m97637f = "UGCRankingViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE}, m97639m = "invokeSuspend")
final class UGCRankingViewModel$startRequest$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadMore;
    int label;
    final /* synthetic */ UGCRankingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCRankingViewModel$startRequest$1(boolean z11, UGCRankingViewModel uGCRankingViewModel, Continuation<? super UGCRankingViewModel$startRequest$1> continuation) {
        super(2, continuation);
        this.$isLoadMore = z11;
        this.this$0 = uGCRankingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCRankingViewModel$startRequest$1(this.$isLoadMore, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCRankingViewModel$startRequest$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String nextPage;
        Pager pager;
        String page;
        Pager pager2;
        Pager pager3;
        Pager pager4;
        List<UGCContent> items;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                C26866a.a.m104898f(C26866a.f81698a, "UGCRankingViewModel", "startRequest: isLoadMore=" + this.$isLoadMore + ", page=" + this.this$0.f53712c + ", category=" + this.this$0.f53714e + ", tabId=" + this.this$0.f53715f, false, 4, null);
                InterfaceC27630d interfaceC27630d = this.this$0.f53713d;
                String str = this.this$0.f53714e;
                String str2 = this.this$0.f53715f;
                String str3 = this.this$0.f53712c;
                this.label = 1;
                obj = InterfaceC27630d.a.m107483b(interfaceC27630d, null, str2, str, str3, 0, this, 17, null);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            BaseDto baseDto = (BaseDto) obj;
            C26866a.a aVar = C26866a.f81698a;
            UGCRankAllData uGCRankAllData = (UGCRankAllData) baseDto.getData();
            Integer numM97634d = (uGCRankAllData == null || (items = uGCRankAllData.getItems()) == null) ? null : Boxing.m97634d(items.size());
            UGCRankAllData uGCRankAllData2 = (UGCRankAllData) baseDto.getData();
            C26866a.a.m104898f(aVar, "UGCRankingViewModel", "startRequest: received data, items size=" + numM97634d + ", hasMore=" + ((uGCRankAllData2 == null || (pager4 = uGCRankAllData2.getPager()) == null) ? null : pager4.getHasMore()), false, 4, null);
            this.this$0.m69103o((UGCRankAllData) baseDto.getData());
            this.this$0.m69102i((UGCRankAllData) baseDto.getData());
            if (this.$isLoadMore) {
                this.this$0.m69105j().mo14855n(baseDto.getData());
                UGCRankingViewModel uGCRankingViewModel = this.this$0;
                UGCRankAllData uGCRankAllData3 = (UGCRankAllData) baseDto.getData();
                if (uGCRankAllData3 == null || (pager3 = uGCRankAllData3.getPager()) == null || (page = pager3.getNextPage()) == null) {
                    UGCRankAllData uGCRankAllData4 = (UGCRankAllData) baseDto.getData();
                    page = (uGCRankAllData4 == null || (pager2 = uGCRankAllData4.getPager()) == null) ? null : pager2.getPage();
                    if (page == null) {
                        page = this.this$0.f53712c;
                    }
                }
                uGCRankingViewModel.f53712c = page;
                C26866a.a.m104898f(aVar, "UGCRankingViewModel", "startRequest: loadMore completed, nextPage=" + this.this$0.f53712c, false, 4, null);
            } else {
                this.this$0.m69106k().mo14855n(baseDto.getData());
                UGCRankingViewModel uGCRankingViewModel2 = this.this$0;
                UGCRankAllData uGCRankAllData5 = (UGCRankAllData) baseDto.getData();
                if (uGCRankAllData5 == null || (pager = uGCRankAllData5.getPager()) == null || (nextPage = pager.getNextPage()) == null) {
                    nextPage = "1";
                }
                uGCRankingViewModel2.f53712c = nextPage;
                C26866a.a.m104898f(aVar, "UGCRankingViewModel", "startRequest: initial load completed, nextPage=" + this.this$0.f53712c, false, 4, null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            C26866a.f81698a.m104915i("UGCRankingViewModel", "startRequest: exception " + e11.getMessage(), true);
            if (this.$isLoadMore) {
                this.this$0.m69105j().mo14855n(null);
            } else {
                this.this$0.m69106k().mo14855n(null);
            }
        }
        return Unit.f75682a;
    }
}
