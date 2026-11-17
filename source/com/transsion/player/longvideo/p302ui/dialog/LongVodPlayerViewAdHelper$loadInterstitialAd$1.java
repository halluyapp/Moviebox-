package com.transsion.player.longvideo.p302ui.dialog;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import com.transsion.p285ad.strategy.C14058c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.dialog.LongVodPlayerViewAdHelper$loadInterstitialAd$1", m97637f = "LongVodPlayerViewAdHelper.kt", m97638l = {979}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class LongVodPlayerViewAdHelper$loadInterstitialAd$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    int label;
    final /* synthetic */ LongVodPlayerViewAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongVodPlayerViewAdHelper$loadInterstitialAd$1(Context context, LongVodPlayerViewAdHelper longVodPlayerViewAdHelper, Continuation<? super LongVodPlayerViewAdHelper$loadInterstitialAd$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.this$0 = longVodPlayerViewAdHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LongVodPlayerViewAdHelper$loadInterstitialAd$1(this.$ctx, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LongVodPlayerViewAdHelper$loadInterstitialAd$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            Context context = this.$ctx;
            AppCompatActivity appCompatActivity = null;
            AppCompatActivity appCompatActivity2 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (appCompatActivity2 != null) {
                if (!appCompatActivity2.isDestroyed() && !appCompatActivity2.isFinishing()) {
                    appCompatActivity = appCompatActivity2;
                }
                if (appCompatActivity != null) {
                    this.this$0.f55790a0 = new BiddingInterstitialManager();
                    BiddingInterstitialManager biddingInterstitialManager = this.this$0.f55790a0;
                    if (biddingInterstitialManager != null) {
                        biddingInterstitialManager.m62830L0(this.this$0.f55801l0);
                    }
                    BiddingInterstitialManager biddingInterstitialManager2 = this.this$0.f55790a0;
                    if (biddingInterstitialManager2 != null) {
                        biddingInterstitialManager2.m62828J0(C14058c.f49742a.m63681a(this.this$0.m72762j0()));
                    }
                    BiddingInterstitialManager biddingInterstitialManager3 = this.this$0.f55790a0;
                    if (biddingInterstitialManager3 != null) {
                        biddingInterstitialManager3.m62827I0(appCompatActivity);
                    }
                    BiddingInterstitialManager biddingInterstitialManager4 = this.this$0.f55790a0;
                    if (biddingInterstitialManager4 != null) {
                        biddingInterstitialManager4.m62829K0(this.this$0.f55812w0);
                    }
                    BiddingInterstitialManager biddingInterstitialManager5 = this.this$0.f55790a0;
                    if (biddingInterstitialManager5 != null) {
                        this.label = 1;
                        if (AbsAdBidding.m62816t0(biddingInterstitialManager5, 0, false, this, 3, null) == objF) {
                            return objF;
                        }
                    }
                }
            }
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        return Unit.f75682a;
    }
}
