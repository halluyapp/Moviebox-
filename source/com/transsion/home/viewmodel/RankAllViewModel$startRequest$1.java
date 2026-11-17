package com.transsion.home.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.home.bean.RankAllData;
import com.transsion.moviedetailapi.bean.Pager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;
import sl.InterfaceC27630d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.RankAllViewModel$startRequest$1", m97637f = "RankAllViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE}, m97639m = "invokeSuspend")
final class RankAllViewModel$startRequest$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadMore;
    int label;
    final /* synthetic */ RankAllViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RankAllViewModel$startRequest$1(boolean z11, RankAllViewModel rankAllViewModel, Continuation<? super RankAllViewModel$startRequest$1> continuation) {
        super(2, continuation);
        this.$isLoadMore = z11;
        this.this$0 = rankAllViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankAllViewModel$startRequest$1(this.$isLoadMore, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RankAllViewModel$startRequest$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pager pager;
        String page;
        Integer numV;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                int i12 = this.$isLoadMore ? this.this$0.f53659c + 1 : this.this$0.f53659c;
                InterfaceC27630d interfaceC27630d = this.this$0.f53660d;
                String str = this.this$0.f53661e;
                int i13 = this.this$0.f53662f;
                String str2 = this.this$0.f53663g;
                this.label = 1;
                obj = InterfaceC27630d.a.m107482a(interfaceC27630d, null, i13, str, i12, 0, str2, this, 17, null);
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
            this.this$0.m68978m((RankAllData) baseDto.getData());
            if (this.$isLoadMore) {
                this.this$0.m68980i().mo14855n((RankAllData) baseDto.getData());
                RankAllViewModel rankAllViewModel = this.this$0;
                RankAllData rankAllData = (RankAllData) baseDto.getData();
                rankAllViewModel.f53659c = (rankAllData == null || (pager = rankAllData.getPager()) == null || (page = pager.getPage()) == null || (numV = StringsKt.m98216v(page)) == null) ? this.this$0.f53659c + 1 : numV.intValue();
            } else {
                this.this$0.m68981j().mo14855n(baseDto.getData());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            C26866a.a aVar = C26866a.f81698a;
            String simpleName = RankAllViewModel.class.getSimpleName();
            Intrinsics.m97801g(simpleName, "getSimpleName(...)");
            aVar.m104915i(simpleName, "exceptionHandler " + e11.getMessage(), true);
            if (this.$isLoadMore) {
                this.this$0.m68980i().mo14855n(null);
            } else {
                this.this$0.m68981j().mo14855n(null);
            }
        }
        return Unit.f75682a;
    }
}
