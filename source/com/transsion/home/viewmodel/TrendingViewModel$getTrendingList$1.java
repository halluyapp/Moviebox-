package com.transsion.home.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.tencent.mmkv.MMKV;
import com.transsion.home.bean.TrendingRequestEntity;
import com.transsion.home.bean.TrendingRespData;
import com.transsion.home.bean.TrendingRespItem;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p842vl.C28123e;
import p978zg.C29182a;
import pg.C26866a;
import sl.InterfaceC27631e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.TrendingViewModel$getTrendingList$1", m97637f = "TrendingViewModel.kt", m97638l = {87}, m97639m = "invokeSuspend")
final class TrendingViewModel$getTrendingList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $nextPage;
    final /* synthetic */ TrendingRequestEntity $requestEntity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TrendingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrendingViewModel$getTrendingList$1(TrendingRequestEntity trendingRequestEntity, TrendingViewModel trendingViewModel, String str, Continuation<? super TrendingViewModel$getTrendingList$1> continuation) {
        super(2, continuation);
        this.$requestEntity = trendingRequestEntity;
        this.this$0 = trendingViewModel;
        this.$nextPage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrendingViewModel$getTrendingList$1 trendingViewModel$getTrendingList$1 = new TrendingViewModel$getTrendingList$1(this.$requestEntity, this.this$0, this.$nextPage, continuation);
        trendingViewModel$getTrendingList$1.L$0 = obj;
        return trendingViewModel$getTrendingList$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((TrendingViewModel$getTrendingList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC25149n0 interfaceC25149n0;
        TrendingViewModel trendingViewModel;
        String str;
        Integer perRow;
        List<TrendingRespItem> items;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        boolean z11 = true;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                C23367b.a aVar = C23367b.f71265a;
                String strM27447j = AbstractC5796o.m27447j(this.$requestEntity);
                Intrinsics.m97801g(strM27447j, "toJson(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(strM27447j);
                if (requestBodyM92796a != null) {
                    trendingViewModel = this.this$0;
                    String str2 = this.$nextPage;
                    InterfaceC27631e interfaceC27631e = trendingViewModel.f53691o;
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.L$0 = interfaceC25149n0;
                    this.L$1 = trendingViewModel;
                    this.L$2 = str2;
                    this.label = 1;
                    obj = interfaceC27631e.m107485b(strM111992a, requestBodyM92796a, this);
                    if (obj == objF) {
                        return objF;
                    }
                    str = str2;
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$2;
            trendingViewModel = (TrendingViewModel) this.L$1;
            interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
            ResultKt.m97107b(obj);
            BaseDto baseDto = (BaseDto) obj;
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                C26866a.a aVar2 = C26866a.f81698a;
                TrendingRespData trendingRespData = (TrendingRespData) baseDto.getData();
                C26866a.a.m104898f(aVar2, "TrendingViewModel", "success " + ((trendingRespData == null || (items = trendingRespData.getItems()) == null) ? null : Boxing.m97634d(items.size())) + " " + interfaceC25149n0 + "@PostListViewModel", false, 4, null);
                trendingViewModel.m69062X().mo14855n(baseDto.getData());
                if (Intrinsics.m97797c(str, "1")) {
                    MMKV mmkvM109233b = C28123e.f86305a.m109233b();
                    TrendingRespData trendingRespData2 = (TrendingRespData) baseDto.getData();
                    if (trendingRespData2 != null && (perRow = trendingRespData2.getPerRow()) != null && perRow.intValue() == 1) {
                        z11 = false;
                    }
                    mmkvM109233b.putBoolean("trending_operation_grid_feeds", z11);
                }
            } else {
                C26866a.a.m104898f(C26866a.f81698a, "TrendingViewModel", "code " + baseDto.getCode() + " message " + baseDto.getMsg(), false, 4, null);
                trendingViewModel.m69062X().mo14855n(baseDto.getData());
            }
        } catch (Exception e11) {
            C26866a.a.m104898f(C26866a.f81698a, "TrendingViewModel", String.valueOf(e11.getMessage()), false, 4, null);
            e11.printStackTrace();
            this.this$0.m69062X().mo14855n(null);
        }
        return Unit.f75682a;
    }
}
