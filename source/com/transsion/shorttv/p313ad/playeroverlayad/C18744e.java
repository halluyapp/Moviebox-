package com.transsion.shorttv.p313ad.playeroverlayad;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.cloud.sdk.commonutil.util.AbstractC8394e;
import com.transsion.p285ad.scene.C14047a;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.shorttv.p313ad.common.STCommonNativeAdHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p450h7.AbstractC23750e;

/* JADX INFO: renamed from: com.transsion.shorttv.ad.playeroverlayad.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18744e {

    /* JADX INFO: renamed from: a */
    private final String f60557a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC25149n0 f60558b;

    /* JADX INFO: renamed from: c */
    private final STCommonNativeAdHelper f60559c;

    /* JADX INFO: renamed from: d */
    private ShortTvPlayerOverlayAdContainer f60560d;

    /* JADX INFO: renamed from: e */
    private AbstractC23750e f60561e;

    /* JADX INFO: renamed from: f */
    private Long f60562f;

    /* JADX INFO: renamed from: g */
    private long f60563g;

    /* JADX INFO: renamed from: com.transsion.shorttv.ad.playeroverlayad.e$a */
    public static final class a extends AbstractC23750e {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ShortTvPlayerOverlayAdContainer f60565g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Function0 f60566h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ShortTvPlayerOverlayAdContainer shortTvPlayerOverlayAdContainer, Function0 function0, long j11) {
            super(j11, 1000L);
            this.f60565g = shortTvPlayerOverlayAdContainer;
            this.f60566h = function0;
        }

        @Override // p450h7.AbstractC23750e
        /* JADX INFO: renamed from: e */
        public void mo37494e() {
            C18744e.this.m78971o(this.f60566h);
        }

        @Override // p450h7.AbstractC23750e
        /* JADX INFO: renamed from: f */
        public void mo37495f(long j11) {
            long jCeil = (long) Math.ceil(j11 / 1000.0f);
            C18744e.this.f60562f = Long.valueOf(jCeil);
            TextView countdownView = this.f60565g.getCountdownView();
            if (countdownView != null) {
                countdownView.setText(jCeil + "s");
            }
        }
    }

    public C18744e(String sceneId, InterfaceC25149n0 lifecycleScope) {
        Intrinsics.m97802h(sceneId, "sceneId");
        Intrinsics.m97802h(lifecycleScope, "lifecycleScope");
        this.f60557a = sceneId;
        this.f60558b = lifecycleScope;
        STCommonNativeAdHelper sTCommonNativeAdHelper = new STCommonNativeAdHelper(sceneId, lifecycleScope);
        sTCommonNativeAdHelper.m78918r("overlay");
        this.f60559c = sTCommonNativeAdHelper;
    }

    /* JADX INFO: renamed from: g */
    private final void m78967g() {
        AbstractC23750e abstractC23750e = this.f60561e;
        if (abstractC23750e != null) {
            abstractC23750e.m93886d();
        }
        this.f60561e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m78968l(C18744e c18744e, Function0 function0, View view) {
        c18744e.m78971o(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m78969m(ShortTvPlayerOverlayAdContainer shortTvPlayerOverlayAdContainer, final C18744e c18744e) {
        NativeWrapperAdView nativeAdView = shortTvPlayerOverlayAdContainer.getNativeAdView();
        if (nativeAdView != null) {
            STCommonNativeAdHelper sTCommonNativeAdHelper = c18744e.f60559c;
            Context contextM39334a = AbstractC8394e.m39334a();
            Intrinsics.m97801g(contextM39334a, "getContext(...)");
            sTCommonNativeAdHelper.m78919s(new C18745f(contextM39334a), nativeAdView, new Function1() { // from class: com.transsion.shorttv.ad.playeroverlayad.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C18744e.m78970n(this.f60556a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Unit m78970n(C18744e c18744e, boolean z11) {
        if (z11) {
            c18744e.f60563g = System.currentTimeMillis();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m78971o(Function0 function0) {
        m78972f();
        function0.invoke();
    }

    /* JADX INFO: renamed from: f */
    public final void m78972f() {
        STCommonNativeAdHelper.m78913n(this.f60559c, 0, 1, null);
        m78967g();
        this.f60562f = null;
        ShortTvPlayerOverlayAdContainer shortTvPlayerOverlayAdContainer = this.f60560d;
        if (shortTvPlayerOverlayAdContainer != null) {
            shortTvPlayerOverlayAdContainer.removeAdView();
        }
        ShortTvPlayerOverlayAdContainer shortTvPlayerOverlayAdContainer2 = this.f60560d;
        if (shortTvPlayerOverlayAdContainer2 != null) {
            shortTvPlayerOverlayAdContainer2.setVisibility(8);
        }
        this.f60560d = null;
        this.f60563g = 0L;
    }

    /* JADX INFO: renamed from: h */
    public final long m78973h() {
        return this.f60563g;
    }

    /* JADX INFO: renamed from: i */
    public final void m78974i(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f60559c.m78917q(callback);
    }

    /* JADX INFO: renamed from: j */
    public final void m78975j() {
        m78967g();
        ShortTvPlayerOverlayAdContainer shortTvPlayerOverlayAdContainer = this.f60560d;
        if (shortTvPlayerOverlayAdContainer != null) {
            shortTvPlayerOverlayAdContainer.removeAdView();
        }
        ShortTvPlayerOverlayAdContainer shortTvPlayerOverlayAdContainer2 = this.f60560d;
        if (shortTvPlayerOverlayAdContainer2 != null) {
            shortTvPlayerOverlayAdContainer2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m78976k(final ShortTvPlayerOverlayAdContainer adContainerView, final Function0 timerEndCallback) {
        Intrinsics.m97802h(adContainerView, "adContainerView");
        Intrinsics.m97802h(timerEndCallback, "timerEndCallback");
        adContainerView.setVisibility(0);
        adContainerView.bringToFront();
        ImageView closeView = adContainerView.getCloseView();
        if (closeView != null) {
            closeView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ad.playeroverlayad.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C18744e.m78968l(this.f60552a, timerEndCallback, view);
                }
            });
        }
        adContainerView.addAdView();
        adContainerView.post(new Runnable() { // from class: com.transsion.shorttv.ad.playeroverlayad.c
            @Override // java.lang.Runnable
            public final void run() {
                C18744e.m78969m(adContainerView, this);
            }
        });
        this.f60560d = adContainerView;
        m78967g();
        Long lValueOf = this.f60562f;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(C14047a.f49716a.m63587e("ShortTvPlayerOverlayScene"));
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            if (lValueOf == null) {
                TextView countdownView = adContainerView.getCountdownView();
                if (countdownView != null) {
                    countdownView.setVisibility(8);
                    return;
                }
                return;
            }
        }
        long jLongValue = lValueOf.longValue();
        TextView countdownView2 = adContainerView.getCountdownView();
        if (countdownView2 != null) {
            countdownView2.setVisibility(0);
        }
        a aVar = new a(adContainerView, timerEndCallback, jLongValue * 1000);
        this.f60561e = aVar;
        aVar.m93887g();
    }
}
