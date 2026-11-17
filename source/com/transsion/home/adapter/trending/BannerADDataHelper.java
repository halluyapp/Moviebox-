package com.transsion.home.adapter.trending;

import android.widget.ImageView;
import com.hisavana.common.bean.TAdErrorCode;
import com.hisavana.mediation.p276ad.TMediaView;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.wrapperad.R$id;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p461hi.AbstractC23854a;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class BannerADDataHelper {

    /* JADX INFO: renamed from: c */
    private static BiddingNativeManager f52408c;

    /* JADX INFO: renamed from: d */
    private static Function2 f52409d;

    /* JADX INFO: renamed from: e */
    private static NativeWrapperAdView f52410e;

    /* JADX INFO: renamed from: f */
    private static boolean f52411f;

    /* JADX INFO: renamed from: g */
    private static boolean f52412g;

    /* JADX INFO: renamed from: a */
    public static final BannerADDataHelper f52406a = new BannerADDataHelper();

    /* JADX INFO: renamed from: b */
    private static int f52407b = 1;

    /* JADX INFO: renamed from: h */
    private static final C14999a f52413h = new C14999a();

    /* JADX INFO: renamed from: i */
    public static final int f52414i = 8;

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.BannerADDataHelper$a */
    public static final class C14999a extends AbstractC23854a {
        C14999a() {
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: i */
        public void mo62846i(TAdErrorCode tAdErrorCode) {
            super.mo62846i(tAdErrorCode);
            C26866a.a.m104898f(C26866a.f81698a, "BannerADDataHelper", "--> onBiddingError() --> p0 = " + (tAdErrorCode != null ? tAdErrorCode.getErrorMessage() : null), false, 4, null);
            Function2 function2 = BannerADDataHelper.f52409d;
            if (function2 != null) {
                function2.invoke(null, Integer.valueOf(BannerADDataHelper.f52407b));
            }
            BannerADDataHelper.f52411f = false;
            BannerADDataHelper.f52412g = true;
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: j */
        public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62778j(biddingIntermediateMaterialBean);
            C26866a.a.m104898f(C26866a.f81698a, "BannerADDataHelper", "--> onBiddingLoad() --> " + biddingIntermediateMaterialBean, false, 4, null);
            Function2 function2 = BannerADDataHelper.f52409d;
            if (function2 != null) {
                function2.invoke(biddingIntermediateMaterialBean, Integer.valueOf(BannerADDataHelper.f52407b));
            }
            BannerADDataHelper.f52411f = false;
            BannerADDataHelper.f52412g = false;
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: n */
        public void mo62853n(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62853n(biddingIntermediateMaterialBean);
            BannerADDataHelper.f52412g = true;
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: p */
        public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62855p(biddingIntermediateMaterialBean);
            BannerADDataHelper.f52412g = true;
        }
    }

    private BannerADDataHelper() {
    }

    /* JADX INFO: renamed from: i */
    public final void m67189i(NativeWrapperAdView nativeWrapperAdView, AbstractC13924r abstractC13924r, BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        f52410e = nativeWrapperAdView;
        if (nativeWrapperAdView != null) {
            nativeWrapperAdView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (nativeWrapperAdView != null) {
            nativeWrapperAdView.bindNativeView(f52408c, abstractC13924r, biddingIntermediateMaterialBean);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m67190j() {
        BiddingNativeManager biddingNativeManager = f52408c;
        if (biddingNativeManager != null) {
            biddingNativeManager.mo62775U();
        }
        f52408c = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m67191k(Function2 function2) {
        if (f52411f) {
            return;
        }
        f52411f = true;
        f52409d = function2;
        m67190j();
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new BannerADDataHelper$fetchData$1(null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m67192l() {
        TMediaView tMediaView;
        NativeWrapperAdView nativeWrapperAdView = f52410e;
        if (nativeWrapperAdView == null || (tMediaView = (TMediaView) nativeWrapperAdView.findViewById(R$id.ad_media)) == null) {
            return;
        }
        tMediaView.performClick();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m67193m() {
        return f52412g;
    }

    /* JADX INFO: renamed from: n */
    public final void m67194n() {
        f52410e = null;
    }
}
