package com.transsion.home.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.home.bean.TrendingRequestEntity;
import com.transsion.home.bean.TrendingRespData;
import com.transsion.home.bean.TrendingRespItem;
import com.transsion.moviedetailapi.bean.Pager;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p978zg.C29182a;
import pg.C26866a;
import sl.InterfaceC27631e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.TrendingUGCViewModel$requestFeedsList$1", m97637f = "TrendingUGCViewModel.kt", m97638l = {274}, m97639m = "invokeSuspend")
final class TrendingUGCViewModel$requestFeedsList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ TrendingRequestEntity $requestEntity;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TrendingUGCViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrendingUGCViewModel$requestFeedsList$1(TrendingRequestEntity trendingRequestEntity, TrendingUGCViewModel trendingUGCViewModel, Continuation<? super TrendingUGCViewModel$requestFeedsList$1> continuation) {
        super(2, continuation);
        this.$requestEntity = trendingRequestEntity;
        this.this$0 = trendingUGCViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrendingUGCViewModel$requestFeedsList$1 trendingUGCViewModel$requestFeedsList$1 = new TrendingUGCViewModel$requestFeedsList$1(this.$requestEntity, this.this$0, continuation);
        trendingUGCViewModel$requestFeedsList$1.L$0 = obj;
        return trendingUGCViewModel$requestFeedsList$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((TrendingUGCViewModel$requestFeedsList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC25149n0 interfaceC25149n0;
        TrendingUGCViewModel trendingUGCViewModel;
        String nextPage;
        Integer perPage;
        List<TrendingRespItem> items;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                C23367b.a aVar = C23367b.f71265a;
                String strM27447j = AbstractC5796o.m27447j(this.$requestEntity);
                Intrinsics.m97801g(strM27447j, "toJson(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(strM27447j);
                if (requestBodyM92796a != null) {
                    TrendingUGCViewModel trendingUGCViewModel2 = this.this$0;
                    InterfaceC27631e interfaceC27631eM69006C = trendingUGCViewModel2.m69006C();
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.L$0 = interfaceC25149n0;
                    this.L$1 = trendingUGCViewModel2;
                    this.label = 1;
                    obj = interfaceC27631eM69006C.m107492i(strM111992a, requestBodyM92796a, this);
                    if (obj == objF) {
                        return objF;
                    }
                    trendingUGCViewModel = trendingUGCViewModel2;
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trendingUGCViewModel = (TrendingUGCViewModel) this.L$1;
            interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
            ResultKt.m97107b(obj);
            BaseDto baseDto = (BaseDto) obj;
            TrendingRespData trendingRespData = (TrendingRespData) baseDto.getData();
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                C26866a.a.m104898f(C26866a.f81698a, "TrendingUGCFragment", "success " + ((trendingRespData == null || (items = trendingRespData.getItems()) == null) ? null : Boxing.m97634d(items.size())) + " " + interfaceC25149n0 + "@PostListViewModel", false, 4, null);
                if ((trendingRespData != null ? trendingRespData.getPager() : null) != null) {
                    Pager pager = trendingRespData.getPager();
                    if (pager == null || (nextPage = pager.getNextPage()) == null) {
                        nextPage = "1";
                    }
                    trendingUGCViewModel.f53675b = nextPage;
                    Pager pager2 = trendingRespData.getPager();
                    trendingUGCViewModel.f53676c = (pager2 == null || (perPage = pager2.getPerPage()) == null) ? 14 : perPage.intValue();
                }
            } else {
                C26866a.a.m104898f(C26866a.f81698a, "TrendingUGCFragment", "code " + baseDto.getCode() + " message " + baseDto.getMsg(), false, 4, null);
            }
            if (trendingRespData != null) {
                List<TrendingRespItem> items2 = trendingRespData.getItems();
                if (items2 == null) {
                    items2 = CollectionsKt.m97506l();
                }
                trendingRespData.setTransferData(trendingUGCViewModel.m69032t(items2));
            }
            trendingUGCViewModel.m69038E().mo14855n(trendingRespData);
        } catch (Exception e11) {
            C26866a.a.m104898f(C26866a.f81698a, "TrendingUGCFragment", String.valueOf(e11.getMessage()), false, 4, null);
            e11.printStackTrace();
            this.this$0.m69038E().mo14855n(null);
        } finally {
            this.this$0.f53677d = false;
        }
        return Unit.f75682a;
    }
}
