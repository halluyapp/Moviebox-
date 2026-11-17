package com.transsion.home.fragment.home;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.hisavana.common.bean.TAdErrorCode;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.wrapperad.view.BiddingRectangleIrregularView;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p461hi.AbstractC23854a;

/* JADX INFO: renamed from: com.transsion.home.fragment.home.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C15258t {

    /* JADX INFO: renamed from: a */
    private BiddingRectangleIrregularView f52993a;

    /* JADX INFO: renamed from: b */
    private BiddingRectangleIrregularView f52994b;

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.t$a */
    public static final class a extends AbstractC23854a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ FrameLayout f52995d;

        a(FrameLayout frameLayout) {
            this.f52995d = frameLayout;
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: i */
        public void mo62846i(TAdErrorCode tAdErrorCode) {
            super.mo62846i(tAdErrorCode);
            this.f52995d.setVisibility(8);
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: j */
        public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62778j(biddingIntermediateMaterialBean);
            this.f52995d.setVisibility(0);
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: p */
        public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62855p(biddingIntermediateMaterialBean);
            this.f52995d.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.t$b */
    public static final class b extends AbstractC23854a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ View f52996d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ FrameLayout f52997e;

        b(View view, FrameLayout frameLayout) {
            this.f52996d = view;
            this.f52997e = frameLayout;
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: i */
        public void mo62846i(TAdErrorCode tAdErrorCode) {
            super.mo62846i(tAdErrorCode);
            this.f52997e.setVisibility(8);
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: j */
        public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62778j(biddingIntermediateMaterialBean);
            this.f52996d.setVisibility(8);
            this.f52997e.setVisibility(0);
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: p */
        public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62855p(biddingIntermediateMaterialBean);
            this.f52997e.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m67987a() {
        BiddingRectangleIrregularView biddingRectangleIrregularView = this.f52993a;
        if (biddingRectangleIrregularView != null) {
            biddingRectangleIrregularView.onAdViewDestroy();
        }
        BiddingRectangleIrregularView biddingRectangleIrregularView2 = this.f52994b;
        if (biddingRectangleIrregularView2 != null) {
            biddingRectangleIrregularView2.onAdViewDestroy();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m67988b(FrameLayout flGameCenter, FrameLayout flPhoneCenter, View leftLogo, InterfaceC25149n0 interfaceC25149n0) {
        Intrinsics.m97802h(flGameCenter, "flGameCenter");
        Intrinsics.m97802h(flPhoneCenter, "flPhoneCenter");
        Intrinsics.m97802h(leftLogo, "leftLogo");
        if (this.f52993a == null) {
            Context context = flGameCenter.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            BiddingRectangleIrregularView biddingRectangleIrregularView = new BiddingRectangleIrregularView(context, null, 2, null);
            this.f52993a = biddingRectangleIrregularView;
            biddingRectangleIrregularView.setSceneId("HomeRIGHTTopGameNonstandardScene");
            BiddingRectangleIrregularView biddingRectangleIrregularView2 = this.f52993a;
            if (biddingRectangleIrregularView2 != null) {
                biddingRectangleIrregularView2.setIrregularAdListener(new a(flGameCenter));
            }
            BiddingRectangleIrregularView biddingRectangleIrregularView3 = this.f52993a;
            if (biddingRectangleIrregularView3 != null) {
                biddingRectangleIrregularView3.loadAd();
            }
            flGameCenter.removeAllViews();
            flGameCenter.addView(this.f52993a);
        }
        if (this.f52994b == null) {
            Context context2 = flPhoneCenter.getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            BiddingRectangleIrregularView biddingRectangleIrregularView4 = new BiddingRectangleIrregularView(context2, null, 2, null);
            this.f52994b = biddingRectangleIrregularView4;
            biddingRectangleIrregularView4.setSceneId("HomeLeftTopBrandNonstandardScene");
            BiddingRectangleIrregularView biddingRectangleIrregularView5 = this.f52994b;
            if (biddingRectangleIrregularView5 != null) {
                biddingRectangleIrregularView5.setIrregularAdListener(new b(leftLogo, flPhoneCenter));
            }
            BiddingRectangleIrregularView biddingRectangleIrregularView6 = this.f52994b;
            if (biddingRectangleIrregularView6 != null) {
                biddingRectangleIrregularView6.loadAd();
            }
            flPhoneCenter.removeAllViews();
            flPhoneCenter.addView(this.f52994b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m67989c() {
        BiddingRectangleIrregularView biddingRectangleIrregularView = this.f52993a;
        if (biddingRectangleIrregularView != null) {
            biddingRectangleIrregularView.loadAd();
        }
        BiddingRectangleIrregularView biddingRectangleIrregularView2 = this.f52994b;
        if (biddingRectangleIrregularView2 != null) {
            biddingRectangleIrregularView2.loadAd();
        }
    }
}
