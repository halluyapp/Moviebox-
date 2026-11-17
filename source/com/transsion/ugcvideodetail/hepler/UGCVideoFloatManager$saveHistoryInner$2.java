package com.transsion.ugcvideodetail.hepler;

import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.hepler.UGCVideoFloatManager$saveHistoryInner$2", m97637f = "UGCVideoFloatManager.kt", m97638l = {86}, m97639m = "invokeSuspend")
final class UGCVideoFloatManager$saveHistoryInner$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C27425a $floatBean;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCVideoFloatManager$saveHistoryInner$2(C27425a c27425a, Continuation<? super UGCVideoFloatManager$saveHistoryInner$2> continuation) {
        super(2, continuation);
        this.$floatBean = c27425a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCVideoFloatManager$saveHistoryInner$2 uGCVideoFloatManager$saveHistoryInner$2 = new UGCVideoFloatManager$saveHistoryInner$2(this.$floatBean, continuation);
        uGCVideoFloatManager$saveHistoryInner$2.L$0 = obj;
        return uGCVideoFloatManager$saveHistoryInner$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCVideoFloatManager$saveHistoryInner$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strM106634r;
        String ugcVideoId;
        UGCVideoBelongToCollection belongToCollection;
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
                    UGCVideo uGCVideoM106638v = c27425a.m106638v();
                    if (uGCVideoM106638v == null || (belongToCollection = uGCVideoM106638v.getBelongToCollection()) == null || (strM106634r = belongToCollection.getCollectionId()) == null) {
                        strM106634r = c27425a.m106634r();
                    }
                    String str = strM106634r;
                    UGCVideo uGCVideoM106638v2 = c27425a.m106638v();
                    if (uGCVideoM106638v2 != null && (ugcVideoId = uGCVideoM106638v2.getUgcVideoId()) != null) {
                        UGCVideoDetailPlayDao uGCVideoDetailPlayDaoM84035m = UGCVideoFloatManager.f64340b.m84035m();
                        long jM106630n = c27425a.m106630n();
                        this.label = 1;
                        if (uGCVideoDetailPlayDaoM84035m.mo64974k(str, ugcVideoId, jCurrentTimeMillis, jM106630n, this) == objF) {
                            return objF;
                        }
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
