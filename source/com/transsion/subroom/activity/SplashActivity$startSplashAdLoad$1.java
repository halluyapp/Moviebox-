package com.transsion.subroom.activity;

import androidx.p1004lifecycle.AbstractC3226v;
import com.hisavana.common.bean.TAdErrorCode;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.splash.C13965b;
import com.transsion.startup.pref.consume.AppStartDotState;
import com.transsion.startup.pref.consume.AppStartReport;
import com.transsion.startup.pref.consume.C19582c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import p461hi.AbstractC23854a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subroom.activity.SplashActivity$startSplashAdLoad$1", m97637f = "SplashActivity.kt", m97638l = {194}, m97639m = "invokeSuspend")
final class SplashActivity$startSplashAdLoad$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SplashActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplashActivity$startSplashAdLoad$1(SplashActivity splashActivity, Continuation<? super SplashActivity$startSplashAdLoad$1> continuation) {
        super(2, continuation);
        this.this$0 = splashActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashActivity$startSplashAdLoad$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SplashActivity$startSplashAdLoad$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbsAdBidding absAdBiddingM62830L0;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            this.this$0.splashManager = new C13965b();
            C13965b c13965b = this.this$0.splashManager;
            if (c13965b != null && (absAdBiddingM62830L0 = c13965b.m62830L0("ColdStartScene")) != null) {
                final SplashActivity splashActivity = this.this$0;
                AbsAdBidding absAdBiddingM62829K0 = absAdBiddingM62830L0.m62829K0(new AbstractC23854a() { // from class: com.transsion.subroom.activity.SplashActivity$startSplashAdLoad$1.1
                    @Override // p461hi.AbstractC23854a
                    /* JADX INFO: renamed from: i */
                    public void mo62846i(TAdErrorCode tAdErrorCode) {
                        super.mo62846i(tAdErrorCode);
                        AbstractC25136k.m99058d(AbstractC3226v.m14968a(splashActivity), null, null, new SplashActivity$startSplashAdLoad$1$1$onBiddingError$1(splashActivity, null), 3, null);
                    }

                    @Override // p461hi.AbstractC23854a
                    /* JADX INFO: renamed from: j */
                    public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                        super.mo62778j(biddingIntermediateMaterialBean);
                        AbstractC25136k.m99058d(AbstractC3226v.m14968a(splashActivity), null, null, new SplashActivity$startSplashAdLoad$1$1$onBiddingLoad$1(splashActivity, biddingIntermediateMaterialBean, null), 3, null);
                    }

                    @Override // p461hi.AbstractC23854a
                    /* JADX INFO: renamed from: m */
                    public void mo62851m(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                        super.mo62851m(biddingIntermediateMaterialBean);
                        AppStartReport.f62550a.m81545f(new AppStartDotState(AppStartDotState.AD_END, 0L, 2, null));
                        C19582c.f62562a.m81571q();
                    }

                    @Override // p461hi.AbstractC23854a
                    /* JADX INFO: renamed from: p */
                    public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                        super.mo62855p(biddingIntermediateMaterialBean);
                        AbstractC25136k.m99058d(AbstractC3226v.m14968a(splashActivity), null, null, new C19603x2888c958(splashActivity, null), 3, null);
                    }
                });
                if (absAdBiddingM62829K0 != null) {
                    this.label = 1;
                    if (AbsAdBidding.m62816t0(absAdBiddingM62829K0, 0, false, this, 3, null) == objF) {
                        return objF;
                    }
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
