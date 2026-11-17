package com.transsion.home.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.home.bean.ugc.UGCFilterItem;
import com.transsion.home.bean.ugc.UGCFilterResponse;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p978zg.C29182a;
import pg.C26866a;
import sl.InterfaceC27629c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.UGCFilterViewModel$getFilterItems$1", m97637f = "UGCFilterViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION_VALUE}, m97639m = "invokeSuspend")
final class UGCFilterViewModel$getFilterItems$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $category;
    int label;
    final /* synthetic */ UGCFilterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCFilterViewModel$getFilterItems$1(String str, UGCFilterViewModel uGCFilterViewModel, Continuation<? super UGCFilterViewModel$getFilterItems$1> continuation) {
        super(2, continuation);
        this.$category = str;
        this.this$0 = uGCFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCFilterViewModel$getFilterItems$1(this.$category, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCFilterViewModel$getFilterItems$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<UGCFilterItem> items;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                C26866a.f81698a.m104912c("UGCFilterViewModel", "getFilterItems: category=" + this.$category, false);
                InterfaceC27629c interfaceC27629c = this.this$0.f53707e;
                String strM111992a = C29182a.f89053a.m111992a();
                String str = this.$category;
                this.label = 1;
                obj = interfaceC27629c.m107478c(strM111992a, str, this);
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
            this.this$0.m69090k().mo14855n(baseDto);
            C26866a.a aVar = C26866a.f81698a;
            UGCFilterResponse uGCFilterResponse = (UGCFilterResponse) baseDto.getData();
            aVar.m104912c("UGCFilterViewModel", "getFilterItems success: items size=" + ((uGCFilterResponse == null || (items = uGCFilterResponse.getItems()) == null) ? 0 : items.size()), false);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.this$0.m69090k().mo14855n(null);
            C26866a.f81698a.m104915i("UGCFilterViewModel", "getFilterItems error: " + e11.getMessage() + ", category=" + this.$category, true);
        }
        return Unit.f75682a;
    }
}
