package com.transsion.postdetail.p304ad;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ad.BaseVideoAdHelper$closeSceneAd$1", m97637f = "BaseVideoAdHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
final class BaseVideoAdHelper$closeSceneAd$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseVideoAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseVideoAdHelper$closeSceneAd$1(BaseVideoAdHelper baseVideoAdHelper, Continuation<? super BaseVideoAdHelper$closeSceneAd$1> continuation) {
        super(2, continuation);
        this.this$0 = baseVideoAdHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseVideoAdHelper$closeSceneAd$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((BaseVideoAdHelper$closeSceneAd$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        ViewGroup viewGroupMo72313g0 = this.this$0.mo72313g0();
        if (viewGroupMo72313g0 != null) {
            viewGroupMo72313g0.setVisibility(8);
        }
        ViewGroup viewGroupMo72315h0 = this.this$0.mo72315h0();
        if (viewGroupMo72315h0 != null) {
            viewGroupMo72315h0.setVisibility(8);
        }
        this.this$0.mo72300H(false);
        this.this$0.m72714A1(false);
        this.this$0.m72780w1(false);
        this.this$0.m72676g1();
        if (this.this$0.m72736O0()) {
            this.this$0.m72679h1();
        }
        this.this$0.m72771p1(false);
        this.this$0.m72739Q();
        this.this$0.m72741R();
        this.this$0.m72692m2();
        return Unit.f75682a;
    }
}
