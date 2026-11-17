package com.transsion.shorttv.p313ad.common;

import android.app.Activity;
import com.hisavana.common.bean.TAdErrorCode;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.shorttv.p313ad.AdLoadState;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p461hi.AbstractC23854a;
import p988zr.C29238a;

/* JADX INFO: loaded from: classes6.dex */
public final class STCommonVideoAdHelper {

    /* JADX INFO: renamed from: a */
    private final String f60524a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC25149n0 f60525b;

    /* JADX INFO: renamed from: c */
    private BiddingVideoManager f60526c;

    /* JADX INFO: renamed from: d */
    private BiddingIntermediateMaterialBean f60527d;

    /* JADX INFO: renamed from: e */
    private Function3 f60528e;

    /* JADX INFO: renamed from: f */
    private Function0 f60529f;

    /* JADX INFO: renamed from: g */
    private Function1 f60530g;

    /* JADX INFO: renamed from: h */
    private String f60531h;

    /* JADX INFO: renamed from: i */
    private AdLoadState f60532i;

    /* JADX INFO: renamed from: j */
    private boolean f60533j;

    /* JADX INFO: renamed from: k */
    private final STCommonVideoAdHelper$videoListener$1 f60534k;

    /* JADX WARN: Type inference failed for: r2v3, types: [com.transsion.shorttv.ad.common.STCommonVideoAdHelper$videoListener$1] */
    public STCommonVideoAdHelper(String sceneId, InterfaceC25149n0 scope) {
        Intrinsics.m97802h(sceneId, "sceneId");
        Intrinsics.m97802h(scope, "scope");
        this.f60524a = sceneId;
        this.f60525b = scope;
        this.f60531h = "";
        this.f60532i = AdLoadState.IDLE;
        this.f60534k = new AbstractC23854a() { // from class: com.transsion.shorttv.ad.common.STCommonVideoAdHelper$videoListener$1
            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: i */
            public void mo62846i(TAdErrorCode tAdErrorCode) {
                super.mo62846i(tAdErrorCode);
                this.f60535d.f60532i = AdLoadState.FAILED;
                C29238a c29238a = C29238a.f89219a;
                String strM78939r = this.f60535d.m78939r();
                String str = "onBiddingError, error=" + tAdErrorCode;
                BiddingVideoManager biddingVideoManager = this.f60535d.f60526c;
                c29238a.m112119d(strM78939r, str, biddingVideoManager != null ? biddingVideoManager.getMSceneId() : null);
                AbstractC25136k.m99058d(this.f60535d.f60525b, C25220y0.m99269c(), null, new STCommonVideoAdHelper$videoListener$1$onBiddingError$1(this.f60535d, tAdErrorCode, null), 2, null);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: j */
            public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62778j(biddingIntermediateMaterialBean);
                this.f60535d.f60532i = AdLoadState.SUCCEED;
                C29238a c29238a = C29238a.f89219a;
                String strM78939r = this.f60535d.m78939r();
                BiddingVideoManager biddingVideoManager = this.f60535d.f60526c;
                c29238a.m112118b(strM78939r, "onBiddingLoad", biddingVideoManager != null ? biddingVideoManager.getMSceneId() : null);
                this.f60535d.f60527d = biddingIntermediateMaterialBean;
                AbstractC25136k.m99058d(this.f60535d.f60525b, C25220y0.m99269c(), null, new STCommonVideoAdHelper$videoListener$1$onBiddingLoad$1(this.f60535d, null), 2, null);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: m */
            public void mo62851m(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62851m(biddingIntermediateMaterialBean);
                this.f60535d.f60532i = AdLoadState.CLOSED;
                C29238a c29238a = C29238a.f89219a;
                String strM78939r = this.f60535d.m78939r();
                String str = "onBiddingWrapperAdClose, isRewarded=" + this.f60535d.f60533j;
                BiddingVideoManager biddingVideoManager = this.f60535d.f60526c;
                c29238a.m112118b(strM78939r, str, biddingVideoManager != null ? biddingVideoManager.getMSceneId() : null);
                AbstractC25136k.m99058d(this.f60535d.f60525b, C25220y0.m99269c(), null, new STCommonVideoAdHelper$videoListener$1$onBiddingWrapperAdClose$1(this.f60535d, this.f60535d.f60533j, null), 2, null);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: o */
            public void mo62854o(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62854o(biddingIntermediateMaterialBean);
                C29238a c29238a = C29238a.f89219a;
                String strM78939r = this.f60535d.m78939r();
                BiddingVideoManager biddingVideoManager = this.f60535d.f60526c;
                c29238a.m112118b(strM78939r, "onBiddingWrapperAdRewarded", biddingVideoManager != null ? biddingVideoManager.getMSceneId() : null);
                this.f60535d.f60533j = true;
                AbstractC25136k.m99058d(this.f60535d.f60525b, C25220y0.m99269c(), null, new C18738x4d87741(this.f60535d, null), 2, null);
            }
        };
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m78937q(STCommonVideoAdHelper sTCommonVideoAdHelper, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        sTCommonVideoAdHelper.m78938p(i11);
    }

    /* JADX INFO: renamed from: p */
    public final void m78938p(int i11) {
        this.f60532i = AdLoadState.DESTROYED;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.f60526c != null) {
                if (i11 == 0) {
                    C29238a.f89219a.m112118b(this.f60531h, "trigger destroy", this.f60524a);
                } else if (i11 == 1) {
                    C29238a.f89219a.m112118b(this.f60531h, "trigger destroy when load error", this.f60524a);
                } else if (i11 == 3) {
                    C29238a.f89219a.m112118b(this.f60531h, "trigger destroy before load", this.f60524a);
                } else if (i11 != 4) {
                    C29238a.f89219a.m112118b(this.f60531h, "trigger destroy", this.f60524a);
                } else {
                    C29238a.f89219a.m112118b(this.f60531h, "trigger destroy when ad closed", this.f60524a);
                }
                BiddingVideoManager biddingVideoManager = this.f60526c;
                if (biddingVideoManager != null) {
                    biddingVideoManager.mo62775U();
                }
                this.f60526c = null;
            }
            this.f60527d = null;
            this.f60528e = null;
            this.f60529f = null;
            this.f60530g = null;
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: r */
    public final String m78939r() {
        return this.f60531h;
    }

    /* JADX INFO: renamed from: s */
    public final String m78940s() {
        return this.f60524a;
    }

    /* JADX INFO: renamed from: t */
    public final void m78941t(Function3 function3) {
        if (this.f60524a.length() == 0) {
            C29238a.f89219a.m112119d(this.f60531h, "trigger load ad error, sceneId is null", this.f60524a);
            return;
        }
        AdLoadState adLoadState = this.f60532i;
        if (adLoadState == AdLoadState.LOADING) {
            C29238a.f89219a.m112119d(this.f60531h, "trigger load ad error, current ad is loading", this.f60524a);
        } else if (adLoadState == AdLoadState.SUCCEED) {
            C29238a.f89219a.m112119d(this.f60531h, "trigger load ad error, current ad is already loaded succeed", this.f60524a);
        } else {
            AbstractC25136k.m99058d(this.f60525b, C25220y0.m99269c(), null, new STCommonVideoAdHelper$loadAd$1(this, function3, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m78942u(Activity activity, Function0 function0, Function1 function1) {
        Intrinsics.m97802h(activity, "activity");
        if (this.f60526c == null || this.f60527d == null) {
            C29238a.f89219a.m112119d(this.f60531h, "trigger show ad error, videoManager or maxEcpmObject is null", this.f60524a);
        } else {
            AbstractC25136k.m99058d(this.f60525b, C25220y0.m99269c(), null, new STCommonVideoAdHelper$showAd$1(this, function0, function1, activity, null), 2, null);
        }
    }
}
