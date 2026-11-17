package com.transsion.home.viewmodel.preload;

import android.content.Context;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
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
import p421fx.C23450d;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.preload.PreloadTrendingData$preloadVideoCache$1", m97637f = "PreloadTrendingData.kt", m97638l = {}, m97639m = "invokeSuspend")
final class PreloadTrendingData$preloadVideoCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ PreloadTrendingData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreloadTrendingData$preloadVideoCache$1(PreloadTrendingData preloadTrendingData, Context context, Continuation<? super PreloadTrendingData$preloadVideoCache$1> continuation) {
        super(2, continuation);
        this.this$0 = preloadTrendingData;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreloadTrendingData$preloadVideoCache$1(this.this$0, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PreloadTrendingData$preloadVideoCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        try {
            String strM69168d = this.this$0.m69111E().m69168d(this.$context);
            if (strM69168d != null && strM69168d.length() > 0) {
                List list = (List) AbstractC5796o.m27442e(strM69168d, AbstractC5796o.m27444g(PostSubjectItem.class));
                C23450d.f71492a.m93068d().mo14855n(list);
                C15568a c15568aM69111E = this.this$0.m69111E();
                Intrinsics.m97799e(list);
                c15568aM69111E.m69165a(list);
            }
        } catch (Exception e11) {
            C26866a.a.m104898f(C26866a.f81698a, "PreloadTrending", "preloadVideoCache exception " + e11.getMessage(), false, 4, null);
        }
        return Unit.f75682a;
    }
}
