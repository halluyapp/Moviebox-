package com.transsion.postdetail.util;

import com.transsion.baselib.p291db.video.ShortTVPlayDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p755rx.C27425a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.util.ShortTVFloatManager$saveHistoryInner$1", m97637f = "ShortTVFloatManager.kt", m97638l = {62, 63}, m97639m = "invokeSuspend")
final class ShortTVFloatManager$saveHistoryInner$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ C27425a $floatBean;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTVFloatManager$saveHistoryInner$1(C27425a c27425a, Function0<Unit> function0, Continuation<? super ShortTVFloatManager$saveHistoryInner$1> continuation) {
        super(2, continuation);
        this.$floatBean = c27425a;
        this.$callback = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTVFloatManager$saveHistoryInner$1(this.$floatBean, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTVFloatManager$saveHistoryInner$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0089 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Function0<Unit> function0;
        AbstractC24917a2 abstractC24917a2M99269c;
        ShortTVFloatManager$saveHistoryInner$1$1$1 shortTVFloatManager$saveHistoryInner$1$1$1;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C27425a c27425a = this.$floatBean;
            if (c27425a != null) {
                function0 = this.$callback;
                C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "shorttv-----saveHistory, ep:" + c27425a.m106620c() + ", progress:" + c27425a.m106630n(), false, 4, null);
                ShortTVPlayDao shortTVPlayDaoM74918l = ShortTVFloatManager.f57812b.m74918l();
                String strM106634r = c27425a.m106634r();
                int iM106620c = c27425a.m106620c();
                long jM106630n = c27425a.m106630n();
                this.L$0 = function0;
                this.label = 1;
                if (shortTVPlayDaoM74918l.mo64953h(strM106634r, iM106620c, jM106630n, this) == objF) {
                    return objF;
                }
                abstractC24917a2M99269c = C25220y0.m99269c();
                shortTVFloatManager$saveHistoryInner$1$1$1 = new ShortTVFloatManager$saveHistoryInner$1$1$1(function0, null);
                this.L$0 = null;
                this.label = 2;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, shortTVFloatManager$saveHistoryInner$1$1$1, this) == objF) {
                    return objF;
                }
            }
        } else if (i11 == 1) {
            function0 = (Function0) this.L$0;
            ResultKt.m97107b(obj);
            abstractC24917a2M99269c = C25220y0.m99269c();
            shortTVFloatManager$saveHistoryInner$1$1$1 = new ShortTVFloatManager$saveHistoryInner$1$1$1(function0, null);
            this.L$0 = null;
            this.label = 2;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, shortTVFloatManager$saveHistoryInner$1$1$1, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
