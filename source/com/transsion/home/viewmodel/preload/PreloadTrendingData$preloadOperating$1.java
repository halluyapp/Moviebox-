package com.transsion.home.viewmodel.preload;

import android.content.Context;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.home.bean.MainOperateData;
import com.transsion.home.bean.OperateItem;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.preload.PreloadTrendingData$preloadOperating$1", m97637f = "PreloadTrendingData.kt", m97638l = {}, m97639m = "invokeSuspend")
final class PreloadTrendingData$preloadOperating$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ PreloadTrendingData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreloadTrendingData$preloadOperating$1(PreloadTrendingData preloadTrendingData, Context context, Continuation<? super PreloadTrendingData$preloadOperating$1> continuation) {
        super(2, continuation);
        this.this$0 = preloadTrendingData;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreloadTrendingData$preloadOperating$1(this.this$0, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PreloadTrendingData$preloadOperating$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        String string = C14496b.f50966a.m65344b().getString("main_operating_data", "");
        if (string == null || string.length() == 0) {
            string = this.this$0.m69111E().m69167c(this.$context);
        }
        if (string != null) {
            try {
                if (string.length() == 0) {
                    this.this$0.m69159Q("");
                    C26866a.f81698a.m104912c("PreloadTrending", "preloadOperatingCache json is null", true);
                } else {
                    MainOperateData mainOperateData = (MainOperateData) AbstractC5796o.m27441d(string, MainOperateData.class);
                    if (mainOperateData != null) {
                        PreloadTrendingData preloadTrendingData = this.this$0;
                        mainOperateData.setSourceFrom("from_cache");
                        C26866a.a aVar = C26866a.f81698a;
                        List<OperateItem> items = mainOperateData.getItems();
                        aVar.m104912c("PreloadTrending", "load operating cache size=" + (items != null ? Boxing.m97634d(items.size()) : null) + "}", true);
                        preloadTrendingData.m69155J().mo14855n(mainOperateData);
                        String version = mainOperateData.getVersion();
                        if (version == null) {
                            version = "";
                        }
                        Boxing.m97631a(preloadTrendingData.m69159Q(version));
                    }
                }
            } catch (Exception e11) {
                C26866a.f81698a.m104912c("PreloadTrending", "exception when from json " + e11.getMessage(), true);
                Boxing.m97631a(this.this$0.m69159Q(""));
            }
        } else {
            this.this$0.m69159Q("");
            C26866a.f81698a.m104912c("PreloadTrending", "preloadOperatingCache json is null", true);
        }
        return Unit.f75682a;
    }
}
