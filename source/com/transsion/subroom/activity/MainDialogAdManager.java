package com.transsion.subroom.activity;

import androidx.p1004lifecycle.AbstractC3226v;
import com.hisavana.common.bean.TAdErrorCode;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import ki.C24650c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import li.C25639b;
import p461hi.AbstractC23854a;

/* JADX INFO: loaded from: classes6.dex */
public final class MainDialogAdManager extends AbstractC23854a {

    /* JADX INFO: renamed from: d */
    private MainActivity f62619d;

    /* JADX INFO: renamed from: e */
    private BiddingInterstitialManager f62620e;

    /* JADX INFO: renamed from: f */
    private final String f62621f = "MainDialogInterstitialScene";

    /* JADX INFO: renamed from: B */
    private final void m81674B() {
        BiddingInterstitialManager biddingInterstitialManager = this.f62620e;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
        this.f62620e = null;
        this.f62619d = null;
    }

    /* JADX INFO: renamed from: A */
    public final void m81678A(MainActivity activity) {
        Intrinsics.m97802h(activity, "activity");
        C25639b c25639b = C25639b.f77786a;
        if (c25639b.m100914a(this.f62621f)) {
            if (C24650c.f75312a.m96818a()) {
                C25639b.m100912d(c25639b, this.f62621f, false, 2, null);
            } else if (this.f62620e != null) {
                C25639b.m100912d(c25639b, this.f62621f, false, 2, null);
            } else {
                this.f62619d = activity;
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(activity), null, null, new MainDialogAdManager$loadAd$1(this, null), 3, null);
            }
        }
    }

    @Override // p461hi.AbstractC23854a
    /* JADX INFO: renamed from: i */
    public void mo62846i(TAdErrorCode tAdErrorCode) {
        super.mo62846i(tAdErrorCode);
        C25639b.f77786a.m100916e(this.f62621f, false);
        m81674B();
    }

    @Override // p461hi.AbstractC23854a
    /* JADX INFO: renamed from: j */
    public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        super.mo62778j(biddingIntermediateMaterialBean);
        C25639b c25639b = C25639b.f77786a;
        if (c25639b.m100914a(this.f62621f)) {
            BiddingInterstitialManager biddingInterstitialManager = this.f62620e;
            if (biddingInterstitialManager != null) {
                AbsAdBidding.m62802O0(biddingInterstitialManager, this.f62619d, biddingIntermediateMaterialBean, false, 4, null);
            }
            C25639b.m100913g(c25639b, this.f62621f, null, 2, null);
        }
    }

    @Override // p461hi.AbstractC23854a
    /* JADX INFO: renamed from: m */
    public void mo62851m(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        super.mo62851m(biddingIntermediateMaterialBean);
        C25639b.f77786a.m100916e(this.f62621f, true);
        m81674B();
    }

    @Override // p461hi.AbstractC23854a
    /* JADX INFO: renamed from: p */
    public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        super.mo62855p(biddingIntermediateMaterialBean);
        C25639b.f77786a.m100916e(this.f62621f, false);
        m81674B();
    }
}
