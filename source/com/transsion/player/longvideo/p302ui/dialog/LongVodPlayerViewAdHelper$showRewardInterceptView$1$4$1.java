package com.transsion.player.longvideo.p302ui.dialog;

import com.therouter.TheRouter;
import com.transsion.memberapi.MemberSceneType;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import p710qk.C27089h;
import p710qk.InterfaceC27087f;
import p710qk.InterfaceC27088g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.dialog.LongVodPlayerViewAdHelper$showRewardInterceptView$1$4$1", m97637f = "LongVodPlayerViewAdHelper.kt", m97638l = {605}, m97639m = "invokeSuspend")
final class LongVodPlayerViewAdHelper$showRewardInterceptView$1$4$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LongVodPlayerViewAdHelper this$0;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.ui.dialog.LongVodPlayerViewAdHelper$showRewardInterceptView$1$4$1$a */
    public static final class C16542a implements InterfaceC27088g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LongVodPlayerViewAdHelper f55816a;

        C16542a(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper) {
            this.f55816a = longVodPlayerViewAdHelper;
        }

        @Override // p710qk.InterfaceC27088g
        /* JADX INFO: renamed from: a */
        public void mo23270a(boolean z11) {
            InterfaceC27088g.a.m105448a(this, z11);
        }

        @Override // p710qk.InterfaceC27088g
        public void onFail() {
            C27089h.f82174a.m105449a(this.f55816a.m72201N3() + " --> interception()--> onFail() --> 失败了");
        }

        @Override // p710qk.InterfaceC27088g
        public void onSuccess() {
            C27089h.f82174a.m105449a(this.f55816a.m72201N3() + " --> interception() --> onSuccess() --> 流媒体解锁成功");
            this.f55816a.m72207P4();
            this.f55816a.m72176D3();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongVodPlayerViewAdHelper$showRewardInterceptView$1$4$1(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper, Continuation<? super LongVodPlayerViewAdHelper$showRewardInterceptView$1$4$1> continuation) {
        super(2, continuation);
        this.this$0 = longVodPlayerViewAdHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LongVodPlayerViewAdHelper$showRewardInterceptView$1$4$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LongVodPlayerViewAdHelper$showRewardInterceptView$1$4$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            if (this.this$0.m72742R0()) {
                LongVodPlayerView longVodPlayerView = this.this$0.f55813x0;
                if (longVodPlayerView != null) {
                    LongVodPlayerView.backClick$default(longVodPlayerView, false, false, 3, null);
                }
                this.label = 1;
                if (AbstractC25207u0.m99223a(200L, this) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        InterfaceC27087f interfaceC27087f = (InterfaceC27087f) TheRouter.m61774d(InterfaceC27087f.class, new Object[0]);
        if (interfaceC27087f != null) {
            interfaceC27087f.mo66156a(Boxing.m97634d(0), "", new C16542a(this.this$0), MemberSceneType.SCENE_STREAM_ACTIVATE);
        }
        return Unit.f75682a;
    }
}
