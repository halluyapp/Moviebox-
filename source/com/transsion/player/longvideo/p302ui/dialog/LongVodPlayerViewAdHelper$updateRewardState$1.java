package com.transsion.player.longvideo.p302ui.dialog;

import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.dialog.LongVodPlayerViewAdHelper$updateRewardState$1", m97637f = "LongVodPlayerViewAdHelper.kt", m97638l = {805, 809}, m97639m = "invokeSuspend")
final class LongVodPlayerViewAdHelper$updateRewardState$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LongVodPlayerViewAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongVodPlayerViewAdHelper$updateRewardState$1(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper, Continuation<? super LongVodPlayerViewAdHelper$updateRewardState$1> continuation) {
        super(2, continuation);
        this.this$0 = longVodPlayerViewAdHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LongVodPlayerViewAdHelper$updateRewardState$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LongVodPlayerViewAdHelper$updateRewardState$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LongVodPlayerViewAdHelper longVodPlayerViewAdHelper;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longVodPlayerViewAdHelper = (LongVodPlayerViewAdHelper) this.L$0;
                ResultKt.m97107b(obj);
            }
            C26866a.a.m104899g(C26866a.f81698a, longVodPlayerViewAdHelper.m72201N3() + " --> updateRewardUnlock videoDetailPlayDao --> insertOrUpdate()", false, 2, null);
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        LongVodPlayerViewAdHelper longVodPlayerViewAdHelper2 = this.this$0;
        this.label = 1;
        obj = longVodPlayerViewAdHelper2.m72235Z3(this);
        if (obj == objF) {
            return objF;
        }
        VideoDetailPlayBean videoDetailPlayBean = (VideoDetailPlayBean) obj;
        if (videoDetailPlayBean != null) {
            LongVodPlayerViewAdHelper longVodPlayerViewAdHelper3 = this.this$0;
            videoDetailPlayBean.setRewardUnlock(longVodPlayerViewAdHelper3.f55791b0);
            videoDetailPlayBean.setRewardPlayed(longVodPlayerViewAdHelper3.f55792c0);
            videoDetailPlayBean.setRewardFree(longVodPlayerViewAdHelper3.f55793d0);
            VideoDetailPlayDao videoDetailPlayDaoM72238a4 = longVodPlayerViewAdHelper3.m72238a4();
            this.L$0 = longVodPlayerViewAdHelper3;
            this.label = 2;
            if (videoDetailPlayDaoM72238a4.mo65007p(videoDetailPlayBean, this) == objF) {
                return objF;
            }
            longVodPlayerViewAdHelper = longVodPlayerViewAdHelper3;
            C26866a.a.m104899g(C26866a.f81698a, longVodPlayerViewAdHelper.m72201N3() + " --> updateRewardUnlock videoDetailPlayDao --> insertOrUpdate()", false, 2, null);
        }
        return Unit.f75682a;
    }
}
