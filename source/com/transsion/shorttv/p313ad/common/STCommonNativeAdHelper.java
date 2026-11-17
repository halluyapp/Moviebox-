package com.transsion.shorttv.p313ad.common;

import com.hisavana.common.bean.TAdErrorCode;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.shorttv.p313ad.AdLoadState;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p461hi.AbstractC23854a;
import p988zr.C29238a;

/* JADX INFO: loaded from: classes6.dex */
public final class STCommonNativeAdHelper {

    /* JADX INFO: renamed from: a */
    private final String f60513a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC25149n0 f60514b;

    /* JADX INFO: renamed from: c */
    private BiddingNativeManager f60515c;

    /* JADX INFO: renamed from: d */
    private BiddingIntermediateMaterialBean f60516d;

    /* JADX INFO: renamed from: e */
    private Function1 f60517e;

    /* JADX INFO: renamed from: f */
    private Function1 f60518f;

    /* JADX INFO: renamed from: g */
    private WeakReference f60519g;

    /* JADX INFO: renamed from: h */
    private String f60520h;

    /* JADX INFO: renamed from: i */
    private AdLoadState f60521i;

    /* JADX INFO: renamed from: j */
    private final STCommonNativeAdHelper$nativeAdListener$1 f60522j;

    /* JADX WARN: Type inference failed for: r2v3, types: [com.transsion.shorttv.ad.common.STCommonNativeAdHelper$nativeAdListener$1] */
    public STCommonNativeAdHelper(String sceneId, InterfaceC25149n0 scope) {
        Intrinsics.m97802h(sceneId, "sceneId");
        Intrinsics.m97802h(scope, "scope");
        this.f60513a = sceneId;
        this.f60514b = scope;
        this.f60520h = "";
        this.f60521i = AdLoadState.IDLE;
        this.f60522j = new AbstractC23854a() { // from class: com.transsion.shorttv.ad.common.STCommonNativeAdHelper$nativeAdListener$1
            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: i */
            public void mo62846i(TAdErrorCode tAdErrorCode) {
                super.mo62846i(tAdErrorCode);
                this.f60523d.f60521i = AdLoadState.FAILED;
                C29238a c29238a = C29238a.f89219a;
                String strM78915o = this.f60523d.m78915o();
                String str = "onBiddingError, error=" + tAdErrorCode;
                BiddingNativeManager biddingNativeManager = this.f60523d.f60515c;
                c29238a.m112119d(strM78915o, str, biddingNativeManager != null ? biddingNativeManager.getMSceneId() : null);
                AbstractC25136k.m99058d(this.f60523d.f60514b, C25220y0.m99269c(), null, new STCommonNativeAdHelper$nativeAdListener$1$onBiddingError$1(this.f60523d, null), 2, null);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: j */
            public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62778j(biddingIntermediateMaterialBean);
                this.f60523d.f60521i = AdLoadState.SUCCEED;
                C29238a c29238a = C29238a.f89219a;
                String strM78915o = this.f60523d.m78915o();
                BiddingNativeManager biddingNativeManager = this.f60523d.f60515c;
                c29238a.m112118b(strM78915o, "onBiddingLoad", biddingNativeManager != null ? biddingNativeManager.getMSceneId() : null);
                this.f60523d.f60516d = biddingIntermediateMaterialBean;
                AbstractC25136k.m99058d(this.f60523d.f60514b, C25220y0.m99269c(), null, new STCommonNativeAdHelper$nativeAdListener$1$onBiddingLoad$1(this.f60523d, null), 2, null);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: m */
            public void mo62851m(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62851m(biddingIntermediateMaterialBean);
                this.f60523d.f60521i = AdLoadState.CLOSED;
                C29238a c29238a = C29238a.f89219a;
                String strM78915o = this.f60523d.m78915o();
                BiddingNativeManager biddingNativeManager = this.f60523d.f60515c;
                c29238a.m112119d(strM78915o, "onBiddingWrapperAdClose", biddingNativeManager != null ? biddingNativeManager.getMSceneId() : null);
                this.f60523d.m78914m(4);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: n */
            public void mo62853n(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62853n(biddingIntermediateMaterialBean);
                C29238a c29238a = C29238a.f89219a;
                String strM78915o = this.f60523d.m78915o();
                BiddingNativeManager biddingNativeManager = this.f60523d.f60515c;
                c29238a.m112118b(strM78915o, "onBiddingWrapperAdDisplay", biddingNativeManager != null ? biddingNativeManager.getMSceneId() : null);
                AbstractC25136k.m99058d(this.f60523d.f60514b, C25220y0.m99269c(), null, new C18736x1b3dbd5c(this.f60523d, null), 2, null);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: p */
            public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62855p(biddingIntermediateMaterialBean);
                C29238a c29238a = C29238a.f89219a;
                String strM78915o = this.f60523d.m78915o();
                BiddingNativeManager biddingNativeManager = this.f60523d.f60515c;
                c29238a.m112119d(strM78915o, "onBiddingWrapperAdShowError", biddingNativeManager != null ? biddingNativeManager.getMSceneId() : null);
                AbstractC25136k.m99058d(this.f60523d.f60514b, C25220y0.m99269c(), null, new C18737x9ba72425(this.f60523d, null), 2, null);
            }
        };
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m78913n(STCommonNativeAdHelper sTCommonNativeAdHelper, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        sTCommonNativeAdHelper.m78914m(i11);
    }

    /* JADX INFO: renamed from: m */
    public final void m78914m(int i11) {
        this.f60521i = AdLoadState.DESTROYED;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.f60515c != null) {
                if (i11 == 0) {
                    C29238a.f89219a.m112118b(this.f60520h, "trigger destroy", this.f60513a);
                } else if (i11 == 1) {
                    C29238a.f89219a.m112118b(this.f60520h, "trigger destroy when load error", this.f60513a);
                } else if (i11 == 2) {
                    C29238a.f89219a.m112118b(this.f60520h, "trigger destroy when show error", this.f60513a);
                } else if (i11 == 3) {
                    C29238a.f89219a.m112118b(this.f60520h, "trigger destroy before load", this.f60513a);
                } else if (i11 != 4) {
                    C29238a.f89219a.m112118b(this.f60520h, "trigger destroy", this.f60513a);
                } else {
                    C29238a.f89219a.m112118b(this.f60520h, "trigger destroy when ad closed", this.f60513a);
                }
                BiddingNativeManager biddingNativeManager = this.f60515c;
                if (biddingNativeManager != null) {
                    biddingNativeManager.mo62775U();
                }
                this.f60515c = null;
            }
            this.f60516d = null;
            this.f60517e = null;
            this.f60518f = null;
            WeakReference weakReference = this.f60519g;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f60519g = null;
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: o */
    public final String m78915o() {
        return this.f60520h;
    }

    /* JADX INFO: renamed from: p */
    public final String m78916p() {
        return this.f60513a;
    }

    /* JADX INFO: renamed from: q */
    public final void m78917q(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        if (this.f60513a.length() == 0) {
            C29238a.f89219a.m112119d(this.f60520h, "trigger load ad error, sceneId is null", this.f60513a);
            return;
        }
        AdLoadState adLoadState = this.f60521i;
        if (adLoadState == AdLoadState.LOADING) {
            C29238a.f89219a.m112119d(this.f60520h, "trigger load ad error, current ad is loading", this.f60513a);
        } else if (adLoadState == AdLoadState.SUCCEED) {
            C29238a.f89219a.m112119d(this.f60520h, "trigger load ad error, current ad is already loaded succeed", this.f60513a);
        } else {
            AbstractC25136k.m99058d(this.f60514b, C25220y0.m99269c(), null, new STCommonNativeAdHelper$loadAd$1(this, callback, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m78918r(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f60520h = str;
    }

    /* JADX INFO: renamed from: s */
    public final void m78919s(AbstractC13924r layoutProvider, NativeWrapperAdView nativeAdView, Function1 function1) {
        Intrinsics.m97802h(layoutProvider, "layoutProvider");
        Intrinsics.m97802h(nativeAdView, "nativeAdView");
        if (this.f60515c != null && this.f60516d != null) {
            AbstractC25136k.m99058d(this.f60514b, C25220y0.m99269c(), null, new STCommonNativeAdHelper$showAd$1(this, function1, nativeAdView, layoutProvider, null), 2, null);
            return;
        }
        C29238a.f89219a.m112119d(this.f60520h, "trigger show ad error, nativeManager or maxEcpmObject is null", this.f60513a);
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }
}
