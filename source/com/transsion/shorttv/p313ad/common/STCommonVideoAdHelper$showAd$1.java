package com.transsion.shorttv.p313ad.common;

import android.app.Activity;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p988zr.C29238a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.ad.common.STCommonVideoAdHelper$showAd$1", m97637f = "STCommonVideoAdHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
final class STCommonVideoAdHelper$showAd$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Function1<Boolean, Unit> $closeCallback;
    final /* synthetic */ Function0<Unit> $rewardedCallback;
    int label;
    final /* synthetic */ STCommonVideoAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    STCommonVideoAdHelper$showAd$1(STCommonVideoAdHelper sTCommonVideoAdHelper, Function0<Unit> function0, Function1<? super Boolean, Unit> function1, Activity activity, Continuation<? super STCommonVideoAdHelper$showAd$1> continuation) {
        super(2, continuation);
        this.this$0 = sTCommonVideoAdHelper;
        this.$rewardedCallback = function0;
        this.$closeCallback = function1;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new STCommonVideoAdHelper$showAd$1(this.this$0, this.$rewardedCallback, this.$closeCallback, this.$activity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((STCommonVideoAdHelper$showAd$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        STCommonVideoAdHelper sTCommonVideoAdHelper = this.this$0;
        Function0<Unit> function0 = this.$rewardedCallback;
        Function1<Boolean, Unit> function1 = this.$closeCallback;
        Activity activity = this.$activity;
        try {
            Result.Companion companion = Result.INSTANCE;
            C29238a c29238a = C29238a.f89219a;
            String strM78939r = sTCommonVideoAdHelper.m78939r();
            BiddingVideoManager biddingVideoManager = sTCommonVideoAdHelper.f60526c;
            Unit unit = null;
            c29238a.m112118b(strM78939r, "trigger show ad", biddingVideoManager != null ? biddingVideoManager.getMSceneId() : null);
            sTCommonVideoAdHelper.f60529f = function0;
            sTCommonVideoAdHelper.f60530g = function1;
            BiddingVideoManager biddingVideoManager2 = sTCommonVideoAdHelper.f60526c;
            if (biddingVideoManager2 != null) {
                biddingVideoManager2.m62832N0(activity, sTCommonVideoAdHelper.f60527d, false);
                unit = Unit.f75682a;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return Unit.f75682a;
    }
}
