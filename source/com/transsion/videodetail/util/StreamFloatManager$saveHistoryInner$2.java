package com.transsion.videodetail.util;

import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p755rx.C27425a;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.videodetail.util.StreamFloatManager$saveHistoryInner$2", m97637f = "StreamFloatManager.kt", m97638l = {87}, m97639m = "invokeSuspend")
final class StreamFloatManager$saveHistoryInner$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C27425a $floatBean;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StreamFloatManager$saveHistoryInner$2(C27425a c27425a, Continuation<? super StreamFloatManager$saveHistoryInner$2> continuation) {
        super(2, continuation);
        this.$floatBean = c27425a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StreamFloatManager$saveHistoryInner$2 streamFloatManager$saveHistoryInner$2 = new StreamFloatManager$saveHistoryInner$2(this.$floatBean, continuation);
        streamFloatManager$saveHistoryInner$2.L$0 = obj;
        return streamFloatManager$saveHistoryInner$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((StreamFloatManager$saveHistoryInner$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                C27425a c27425a = this.$floatBean;
                if (c27425a != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C26866a.f81698a.m104912c("VideoFloat", "stream-----saveHistory, subjectId:" + c27425a.m106634r() + " time:" + jCurrentTimeMillis + ",se:" + c27425a.m106633q() + " ep:" + c27425a.m106620c() + ", progress:" + c27425a.m106630n(), true);
                    Result.Companion companion = Result.INSTANCE;
                    VideoDetailPlayDao videoDetailPlayDaoM86487n = StreamFloatManager.f65956b.m86487n();
                    String strM106634r = c27425a.m106634r();
                    int iM106633q = c27425a.m106633q();
                    int iM106620c = c27425a.m106620c();
                    long jM106630n = c27425a.m106630n();
                    this.label = 1;
                    if (videoDetailPlayDaoM86487n.mo64997f(strM106634r, iM106633q, iM106620c, jCurrentTimeMillis, jM106630n, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "saveHistory--end", false, 4, null);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return Unit.f75682a;
    }
}
