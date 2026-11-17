package com.transsion.home.viewmodel.preload;

import com.blankj.utilcode.util.AbstractC5796o;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.home.bean.HotSubjectEntity;
import kotlin.Metadata;
import kotlin.Result;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.preload.PreloadTrendingData$getHotSearch$1", m97637f = "PreloadTrendingData.kt", m97638l = {TTAdConstant.IMAGE_CODE}, m97639m = "invokeSuspend")
final class PreloadTrendingData$getHotSearch$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PreloadTrendingData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreloadTrendingData$getHotSearch$1(PreloadTrendingData preloadTrendingData, Continuation<? super PreloadTrendingData$getHotSearch$1> continuation) {
        super(2, continuation);
        this.this$0 = preloadTrendingData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PreloadTrendingData$getHotSearch$1 preloadTrendingData$getHotSearch$1 = new PreloadTrendingData$getHotSearch$1(this.this$0, continuation);
        preloadTrendingData$getHotSearch$1.L$0 = obj;
        return preloadTrendingData$getHotSearch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PreloadTrendingData$getHotSearch$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        HotSubjectEntity hotSubjectEntityM69112I;
        PreloadTrendingData preloadTrendingData;
        Object obj2;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                PreloadTrendingData preloadTrendingData2 = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC27631e interfaceC27631e = preloadTrendingData2.f53723d;
                this.L$0 = preloadTrendingData2;
                this.label = 1;
                Object objM107494a = InterfaceC27631e.a.m107494a(interfaceC27631e, null, 2, this, 1, null);
                if (objM107494a == objF) {
                    return objF;
                }
                preloadTrendingData = preloadTrendingData2;
                obj = objM107494a;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                preloadTrendingData = (PreloadTrendingData) this.L$0;
                ResultKt.m97107b(obj);
            }
            BaseDto baseDto = (BaseDto) obj;
            Object obj3 = null;
            obj3 = null;
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                preloadTrendingData.m69154H().mo14855n(baseDto.getData());
                String strM27447j = AbstractC5796o.m27447j(baseDto.getData());
                if (strM27447j != null) {
                    C14496b.f50966a.m65344b().putString("hot_search_words", strM27447j);
                    obj2 = strM27447j;
                    obj3 = obj2;
                }
            } else {
                HotSubjectEntity hotSubjectEntityM69112I2 = preloadTrendingData.m69112I();
                if (hotSubjectEntityM69112I2 != null) {
                    preloadTrendingData.m69154H().mo14855n(hotSubjectEntityM69112I2);
                    obj2 = hotSubjectEntityM69112I2;
                    obj3 = obj2;
                }
            }
            objM112707constructorimpl = Result.m112707constructorimpl(obj3);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        PreloadTrendingData preloadTrendingData3 = this.this$0;
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null && (hotSubjectEntityM69112I = preloadTrendingData3.m69112I()) != null) {
            preloadTrendingData3.m69154H().mo14855n(hotSubjectEntityM69112I);
        }
        return Unit.f75682a;
    }
}
