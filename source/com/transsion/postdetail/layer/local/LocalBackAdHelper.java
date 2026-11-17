package com.transsion.postdetail.layer.local;

import android.app.Activity;
import com.hisavana.common.bean.TAdErrorCode;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import com.transsion.p285ad.strategy.C14058c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.InterfaceC25204t1;
import li.C25639b;
import p461hi.AbstractC23854a;
import p723qx.InterfaceC27138e;

/* JADX INFO: loaded from: classes6.dex */
public final class LocalBackAdHelper {

    /* JADX INFO: renamed from: a */
    private final String f56450a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC25149n0 f56451b;

    /* JADX INFO: renamed from: c */
    private final Function0 f56452c;

    /* JADX INFO: renamed from: d */
    private final Function0 f56453d;

    /* JADX INFO: renamed from: e */
    private final boolean f56454e;

    /* JADX INFO: renamed from: f */
    private BiddingInterstitialManager f56455f;

    /* JADX INFO: renamed from: g */
    private InterfaceC25204t1 f56456g;

    /* JADX INFO: renamed from: h */
    private boolean f56457h;

    /* JADX INFO: renamed from: i */
    private boolean f56458i;

    public LocalBackAdHelper(String sceneId, InterfaceC25149n0 scope, Function0 getActivity, Function0 onFinish, boolean z11) {
        Intrinsics.m97802h(sceneId, "sceneId");
        Intrinsics.m97802h(scope, "scope");
        Intrinsics.m97802h(getActivity, "getActivity");
        Intrinsics.m97802h(onFinish, "onFinish");
        this.f56450a = sceneId;
        this.f56451b = scope;
        this.f56452c = getActivity;
        this.f56453d = onFinish;
        this.f56454e = z11;
    }

    public /* synthetic */ LocalBackAdHelper(String str, InterfaceC25149n0 interfaceC25149n0, Function0 function0, Function0 function1, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC25149n0, function0, function1, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m73156m() {
        InterfaceC25204t1 interfaceC25204t1 = this.f56456g;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.f56456g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final AbstractC23854a m73157n() {
        return new AbstractC23854a() { // from class: com.transsion.postdetail.layer.local.LocalBackAdHelper$createListener$1
            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: i */
            public void mo62846i(TAdErrorCode tAdErrorCode) {
                super.mo62846i(tAdErrorCode);
                if (this.f56459d.f56457h) {
                    return;
                }
                this.f56459d.f56458i = false;
                this.f56459d.m73156m();
                C25639b.f77786a.m100916e(this.f56459d.f56450a, false);
                this.f56459d.f56453d.invoke();
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: j */
            public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                BiddingInterstitialManager biddingInterstitialManager;
                super.mo62778j(biddingIntermediateMaterialBean);
                if (this.f56459d.f56457h) {
                    return;
                }
                this.f56459d.m73156m();
                C25639b c25639b = C25639b.f77786a;
                if (!c25639b.m100914a(this.f56459d.f56450a)) {
                    this.f56459d.m73158p();
                    return;
                }
                Activity activity = (Activity) this.f56459d.f56452c.invoke();
                if (activity != null && (biddingInterstitialManager = this.f56459d.f56455f) != null) {
                    AbsAdBidding.m62802O0(biddingInterstitialManager, activity, biddingIntermediateMaterialBean, false, 4, null);
                }
                C25639b.m100913g(c25639b, this.f56459d.f56450a, null, 2, null);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: m */
            public void mo62851m(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62851m(biddingIntermediateMaterialBean);
                this.f56459d.f56458i = false;
                C14496b.f50966a.m65344b().putLong("show_" + this.f56459d.f56450a + "_timestamp", System.currentTimeMillis());
                BiddingInterstitialManager biddingInterstitialManager = this.f56459d.f56455f;
                if (biddingInterstitialManager != null) {
                    biddingInterstitialManager.mo62775U();
                }
                C25639b.f77786a.m100916e(this.f56459d.f56450a, true);
                if (this.f56459d.f56454e && InterfaceC27138e.f82251a.m105606b().mo86568c()) {
                    AbstractC25136k.m99058d(this.f56459d.f56451b, null, null, new LocalBackAdHelper$createListener$1$onBiddingWrapperAdClose$1(this.f56459d, null), 3, null);
                } else {
                    this.f56459d.f56453d.invoke();
                }
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: p */
            public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62855p(biddingIntermediateMaterialBean);
                if (this.f56459d.f56457h) {
                    return;
                }
                this.f56459d.f56458i = false;
                this.f56459d.m73156m();
                C25639b.f77786a.m100916e(this.f56459d.f56450a, false);
                this.f56459d.f56453d.invoke();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m73158p() {
        if (this.f56457h) {
            return;
        }
        this.f56457h = true;
        this.f56458i = false;
        BiddingInterstitialManager biddingInterstitialManager = this.f56455f;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
        this.f56455f = null;
        C25639b.f77786a.m100916e(this.f56450a, false);
        this.f56453d.invoke();
    }

    /* JADX INFO: renamed from: s */
    private final void m73159s() {
        this.f56456g = AbstractC25136k.m99058d(this.f56451b, null, null, new LocalBackAdHelper$startTimeout$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m73160o() {
        this.f56458i = false;
        m73156m();
        BiddingInterstitialManager biddingInterstitialManager = this.f56455f;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
        this.f56455f = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m73161q(String str) {
        BiddingInterstitialManager.f49491t.m63106a(this.f56450a, C14058c.f49742a.m63681a(str));
        C25639b.f77786a.m100918h(this.f56450a);
    }

    /* JADX INFO: renamed from: r */
    public final void m73162r(String str) {
        if (this.f56458i) {
            return;
        }
        this.f56457h = false;
        if (!C25639b.f77786a.m100914a(this.f56450a)) {
            this.f56453d.invoke();
            return;
        }
        this.f56458i = true;
        AbstractC25136k.m99058d(this.f56451b, null, null, new LocalBackAdHelper$show$1(this, str, null), 3, null);
        m73159s();
    }
}
