package com.transsion.postdetail.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.postdetail.layer.local.LocalUiType;
import com.transsion.postdetail.p304ad.AdInterceptTimerView;
import com.transsion.postdetail.p304ad.BaseVideoAdHelper;
import com.transsion.postdetail.p306ui.view.AdCountDownView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p844vo.C28158k;
import p844vo.C28181z;

/* JADX INFO: loaded from: classes6.dex */
public final class LocalVideoAdHelper extends BaseVideoAdHelper {

    /* JADX INFO: renamed from: S */
    private C28158k f57804S;

    /* JADX INFO: renamed from: T */
    private DownloadBean f57805T;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final Unit m74889x2(LocalVideoAdHelper localVideoAdHelper) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM72779w0 = localVideoAdHelper.m72779w0();
        if (lifecycleCoroutineScopeM72779w0 != null) {
            AbstractC25136k.m99058d(lifecycleCoroutineScopeM72779w0, null, null, new LocalVideoAdHelper$onCompletion$1$1(localVideoAdHelper, null), 3, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: A2 */
    public final void m74890A2() {
        m72728K1(System.currentTimeMillis());
        m72718D1(false);
        m72735O();
    }

    /* JADX INFO: renamed from: B2 */
    public final void m74891B2() {
        m72739Q();
        m72741R();
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: C0 */
    protected ViewGroup mo72297C0() {
        C28181z c28181z;
        C28158k c28158k = this.f57804S;
        if (c28158k == null || (c28181z = c28158k.f86505l) == null) {
            return null;
        }
        return c28181z.f86769R;
    }

    /* JADX INFO: renamed from: C2 */
    public final void m74892C2() {
        if (m72738P0()) {
            m72725I(m72753b0());
        }
    }

    /* JADX INFO: renamed from: D2 */
    public final void m74893D2(DownloadBean downloadBean) {
        Long lastAdEndTimeStamp;
        Long lastAdStartTimeStamp;
        this.f57805T = downloadBean;
        long jLongValue = 0;
        long jLongValue2 = (downloadBean == null || (lastAdStartTimeStamp = downloadBean.getLastAdStartTimeStamp()) == null) ? 0L : lastAdStartTimeStamp.longValue();
        if (downloadBean != null && (lastAdEndTimeStamp = downloadBean.getLastAdEndTimeStamp()) != null) {
            jLongValue = lastAdEndTimeStamp.longValue();
        }
        m72719E0(jLongValue2, jLongValue);
        m72723G0("localVideo");
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: V */
    protected NativeWrapperAdView mo72307V() {
        C28158k c28158k = this.f57804S;
        if (c28158k != null) {
            return c28158k.f86496c;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: W */
    protected AdCountDownView mo72308W() {
        C28158k c28158k = this.f57804S;
        if (c28158k != null) {
            return c28158k.f86497d;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: e0 */
    protected AdInterceptTimerView mo72311e0() {
        C28158k c28158k = this.f57804S;
        if (c28158k != null) {
            return c28158k.f86498e;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: f0 */
    protected NativeWrapperAdView mo72312f0() {
        C28158k c28158k = this.f57804S;
        if (c28158k != null) {
            return c28158k.f86499f;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: g0 */
    protected ViewGroup mo72313g0() {
        C28158k c28158k = this.f57804S;
        if (c28158k != null) {
            return c28158k.f86500g;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: h0 */
    protected ViewGroup mo72315h0() {
        C28158k c28158k = this.f57804S;
        if (c28158k != null) {
            return c28158k.f86501h;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: k0 */
    protected View mo72316k0() {
        C28158k c28158k = this.f57804S;
        if (c28158k != null) {
            return c28158k.f86502i;
        }
        return null;
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: n2 */
    public void mo72318n2() {
        ConstraintLayout root;
        C28158k c28158k = this.f57804S;
        Context context = (c28158k == null || (root = c28158k.getRoot()) == null) ? null : root.getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(appCompatActivity), null, null, new LocalVideoAdHelper$updateAdStartLastShowTime$1$1(this, null), 3, null);
        }
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: t0 */
    protected ImageView mo72320t0() {
        C28158k c28158k = this.f57804S;
        if (c28158k != null) {
            return c28158k.f86503j;
        }
        return null;
    }

    /* JADX INFO: renamed from: t2 */
    public final void m74894t2() {
        BiddingNativeManager biddingNativeManagerM72775u0 = m72775u0();
        if (biddingNativeManagerM72775u0 != null) {
            biddingNativeManagerM72775u0.mo62775U();
        }
        m72778v1(null);
        BiddingInterstitialManager biddingInterstitialManagerM72777v0 = m72777v0();
        if (biddingInterstitialManagerM72777v0 != null) {
            biddingInterstitialManagerM72777v0.mo62775U();
        }
        m72783z1(null);
        this.f57804S = null;
        m72739Q();
        m72741R();
    }

    /* JADX INFO: renamed from: u2 */
    public final void m74895u2() {
        m72720E1(m72781x0() + ((System.currentTimeMillis() - m72715B0()) / ((long) 1000)));
        m72728K1(System.currentTimeMillis());
        m72718D1(true);
        m72747V1();
    }

    /* JADX INFO: renamed from: v2 */
    public final void m74896v2(C28158k c28158k, String str, Function1 adShowCallback) {
        Intrinsics.m97802h(adShowCallback, "adShowCallback");
        m72721F0(c28158k, str, adShowCallback);
        this.f57804S = c28158k;
    }

    /* JADX INFO: renamed from: w2 */
    public final void m74897w2() {
        m72720E1(0L);
        m72728K1(0L);
        m72741R();
        m72759f2(new Function0() { // from class: com.transsion.postdetail.util.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoAdHelper.m74889x2(this.f57823a);
            }
        });
    }

    /* JADX INFO: renamed from: y2 */
    public final void m74898y2() {
        m72763k1(null);
        m72737P();
        m72722F1(0);
    }

    @Override // com.transsion.postdetail.p304ad.BaseVideoAdHelper
    /* JADX INFO: renamed from: z0 */
    protected ImageView mo72325z0() {
        C28158k c28158k = this.f57804S;
        if (c28158k != null) {
            return c28158k.f86507n;
        }
        return null;
    }

    /* JADX INFO: renamed from: z2 */
    public final void m74899z2(LocalUiType uiType, InterfaceC16634g interfaceC16634g) {
        Intrinsics.m97802h(uiType, "uiType");
        m72716B1(uiType == LocalUiType.LAND);
        m72758f1();
        if (m72740Q0()) {
            return;
        }
        m72735O();
        if (interfaceC16634g != null && !interfaceC16634g.isPlaying() && !interfaceC16634g.isComplete() && m72745U0()) {
            m72747V1();
        }
        if (m72738P0()) {
            m72748W0();
            m72766m1(false);
        }
    }
}
