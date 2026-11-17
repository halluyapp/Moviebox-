package com.transsion.postdetail.util;

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
@DebugMetadata(m97636c = "com.transsion.postdetail.util.UGCShortTVFloatManager$saveHistoryInner$1", m97637f = "UGCShortTVFloatManager.kt", m97638l = {59, 63}, m97639m = "invokeSuspend")
final class UGCShortTVFloatManager$saveHistoryInner$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ C27425a $floatBean;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCShortTVFloatManager$saveHistoryInner$1(C27425a c27425a, Function0<Unit> function0, Continuation<? super UGCShortTVFloatManager$saveHistoryInner$1> continuation) {
        super(2, continuation);
        this.$floatBean = c27425a;
        this.$callback = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCShortTVFloatManager$saveHistoryInner$1 uGCShortTVFloatManager$saveHistoryInner$1 = new UGCShortTVFloatManager$saveHistoryInner$1(this.$floatBean, this.$callback, continuation);
        uGCShortTVFloatManager$saveHistoryInner$1.L$0 = obj;
        return uGCShortTVFloatManager$saveHistoryInner$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCShortTVFloatManager$saveHistoryInner$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d0 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r11;
        AbstractC24917a2 abstractC24917a2M99269c;
        UGCShortTVFloatManager$saveHistoryInner$1$1$2 uGCShortTVFloatManager$saveHistoryInner$1$1$2;
        String strM106634r;
        String ugcVideoId;
        UGCVideoBelongToCollection belongToCollection;
        Object objF = IntrinsicsKt.m97630f();
        ?? r12 = this.label;
        try {
            if (r12 == 0) {
                ResultKt.m97107b(obj);
                C27425a c27425a = this.$floatBean;
                if (c27425a != null) {
                    Function0<Unit> function0 = this.$callback;
                    C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "shorttv-----saveHistory, ep:" + c27425a.m106620c() + ", progress:" + c27425a.m106630n(), false, 4, null);
                    Result.Companion companion = Result.INSTANCE;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    UGCVideo uGCVideoM106638v = c27425a.m106638v();
                    if (uGCVideoM106638v == null || (belongToCollection = uGCVideoM106638v.getBelongToCollection()) == null || (strM106634r = belongToCollection.getCollectionId()) == null) {
                        strM106634r = c27425a.m106634r();
                    }
                    String str = strM106634r;
                    UGCVideo uGCVideoM106638v2 = c27425a.m106638v();
                    r12 = function0;
                    if (uGCVideoM106638v2 != null && (ugcVideoId = uGCVideoM106638v2.getUgcVideoId()) != null) {
                        UGCVideoDetailPlayDao uGCVideoDetailPlayDaoM74938i = UGCShortTVFloatManager.f57816b.m74938i();
                        long jM106630n = c27425a.m106630n();
                        this.L$0 = function0;
                        this.label = 1;
                        if (uGCVideoDetailPlayDaoM74938i.mo64974k(str, ugcVideoId, jCurrentTimeMillis, jM106630n, this) == objF) {
                            r12 = function0;
                            r12 = function0;
                            return objF;
                        }
                    }
                    r12 = function0;
                    r12 = function0;
                    r12 = function0;
                    C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "shorttv--saveHistory--end", false, 4, null);
                    Result.m112707constructorimpl(Unit.f75682a);
                    r11 = r12;
                    abstractC24917a2M99269c = C25220y0.m99269c();
                    uGCShortTVFloatManager$saveHistoryInner$1$1$2 = new UGCShortTVFloatManager$saveHistoryInner$1$1$2(r11, null);
                    this.L$0 = null;
                    this.label = 2;
                    if (AbstractC25088i.m98910g(abstractC24917a2M99269c, uGCShortTVFloatManager$saveHistoryInner$1$1$2, this) == objF) {
                        return objF;
                    }
                }
            } else if (r12 == 1) {
                Function0 function1 = (Function0) this.L$0;
                ResultKt.m97107b(obj);
                r12 = function1;
                r12 = function0;
                r12 = function0;
                r12 = function0;
                C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "shorttv--saveHistory--end", false, 4, null);
                Result.m112707constructorimpl(Unit.f75682a);
                r11 = r12;
                abstractC24917a2M99269c = C25220y0.m99269c();
                uGCShortTVFloatManager$saveHistoryInner$1$1$2 = new UGCShortTVFloatManager$saveHistoryInner$1$1$2(r11, null);
                this.L$0 = null;
                this.label = 2;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, uGCShortTVFloatManager$saveHistoryInner$1$1$2, this) == objF) {
                    return objF;
                }
            } else {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
            r11 = r12;
        }
        return Unit.f75682a;
    }
}
