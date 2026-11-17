package com.transsion.home.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.home.bean.MainOperateData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.p1000enum.HomeTabId;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import sl.InterfaceC27631e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.TrendingUGCViewModel$requestOperateData$1", m97637f = "TrendingUGCViewModel.kt", m97638l = {Sdk$SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m97639m = "invokeSuspend")
final class TrendingUGCViewModel$requestOperateData$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TrendingUGCViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrendingUGCViewModel$requestOperateData$1(TrendingUGCViewModel trendingUGCViewModel, Continuation<? super TrendingUGCViewModel$requestOperateData$1> continuation) {
        super(2, continuation);
        this.this$0 = trendingUGCViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrendingUGCViewModel$requestOperateData$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((TrendingUGCViewModel$requestOperateData$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        List<OperateItem> items;
        String version;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            String string = C14496b.f50966a.m65344b().getString("trending_operating_version", "");
            InterfaceC27631e interfaceC27631eM69006C = this.this$0.m69006C();
            int value = HomeTabId.UGC_Trending.getValue();
            this.L$0 = string;
            this.label = 1;
            Object objM107498e = InterfaceC27631e.a.m107498e(interfaceC27631eM69006C, null, value, string, this, 1, null);
            if (objM107498e == objF) {
                return objF;
            }
            str = string;
            obj = objM107498e;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.m97107b(obj);
        }
        BaseDto baseDto = (BaseDto) obj;
        if (!Intrinsics.m97797c(baseDto.getCode(), "0") || baseDto.getData() == null) {
            this.this$0.m69045z().mo14855n(null);
        } else {
            MainOperateData mainOperateData = (MainOperateData) baseDto.getData();
            if (str == null || str.length() == 0 || mainOperateData == null || (items = mainOperateData.getItems()) == null || !items.isEmpty() || (version = mainOperateData.getVersion()) == null || version.length() <= 0) {
                this.this$0.m69012M(mainOperateData);
            } else {
                mainOperateData = (MainOperateData) AbstractC5796o.m27441d(C14496b.f50966a.m65344b().getString("trending_operating_data", ""), MainOperateData.class);
            }
            this.this$0.m69007F(mainOperateData);
            this.this$0.m69045z().mo14855n(mainOperateData);
        }
        return Unit.f75682a;
    }
}
