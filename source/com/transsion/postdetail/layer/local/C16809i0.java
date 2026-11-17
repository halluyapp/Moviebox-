package com.transsion.postdetail.layer.local;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsion.p285ad.scene.C14048b;
import com.transsion.postdetail.p306ui.view.AdCountDownView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC26006c;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.local.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16809i0 {

    /* JADX INFO: renamed from: v */
    public static final a f56610v = new a(null);

    /* JADX INFO: renamed from: w */
    private static final Lazy f56611w = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.layer.local.d0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C16809i0.m73464j();
        }
    });

    /* JADX INFO: renamed from: a */
    private long f56612a;

    /* JADX INFO: renamed from: b */
    private long f56613b;

    /* JADX INFO: renamed from: c */
    private int f56614c;

    /* JADX INFO: renamed from: d */
    private int f56615d;

    /* JADX INFO: renamed from: e */
    private boolean f56616e;

    /* JADX INFO: renamed from: f */
    private boolean f56617f;

    /* JADX INFO: renamed from: g */
    private boolean f56618g;

    /* JADX INFO: renamed from: h */
    private boolean f56619h;

    /* JADX INFO: renamed from: i */
    private int f56620i;

    /* JADX INFO: renamed from: j */
    private AdCountDownView f56621j;

    /* JADX INFO: renamed from: k */
    private AppCompatImageView f56622k;

    /* JADX INFO: renamed from: l */
    private Function1 f56623l;

    /* JADX INFO: renamed from: m */
    private Function0 f56624m;

    /* JADX INFO: renamed from: q */
    private int f56628q;

    /* JADX INFO: renamed from: n */
    private int f56625n = 15;

    /* JADX INFO: renamed from: o */
    private int f56626o = 15;

    /* JADX INFO: renamed from: p */
    private long f56627p = 180000;

    /* JADX INFO: renamed from: r */
    private Handler f56629r = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: s */
    private int f56630s = 1;

    /* JADX INFO: renamed from: t */
    private int f56631t = 1;

    /* JADX INFO: renamed from: u */
    private final Runnable f56632u = new Runnable() { // from class: com.transsion.postdetail.layer.local.e0
        @Override // java.lang.Runnable
        public final void run() {
            C16809i0.m73463i(this.f56600a);
        }
    };

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.i0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C16809i0 m73479a() {
            return (C16809i0) C16809i0.f56611w.getValue();
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m73462h() {
        this.f56629r.postDelayed(this.f56632u, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m73463i(C16809i0 c16809i0) {
        int i11;
        if (c16809i0.f56628q < 1) {
            c16809i0.m73466m();
            return;
        }
        int i12 = c16809i0.f56620i == 1 ? c16809i0.f56630s : c16809i0.f56631t;
        if (C14048b.f49717a.m63614k() && c16809i0.f56626o - c16809i0.f56628q >= i12 && ((i11 = c16809i0.f56620i) == 1 || i11 == 3)) {
            AppCompatImageView appCompatImageView = c16809i0.f56622k;
            if (appCompatImageView != null) {
                AbstractC26006c.m102058k(appCompatImageView);
            }
            C26866a.a.m104898f(C26866a.f81698a, "LocalVideoLandAdControl", "countdownRunnable, show adCloseView", false, 4, null);
        }
        AdCountDownView adCountDownView = c16809i0.f56621j;
        if (adCountDownView != null) {
            int i13 = c16809i0.f56628q;
            c16809i0.f56628q = i13 - 1;
            adCountDownView.refreshCountDown(i13);
        }
        c16809i0.m73462h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C16809i0 m73464j() {
        return new C16809i0();
    }

    /* JADX INFO: renamed from: l */
    private final boolean m73465l() {
        return this.f56616e;
    }

    /* JADX INFO: renamed from: m */
    private final void m73466m() {
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "LocalVideoLandAdControl", "onCountdownFinish, curAdType = " + this.f56620i, false, 4, null);
        int i11 = this.f56620i;
        if (i11 == 1) {
            this.f56614c = this.f56615d;
            Function0 function0 = this.f56624m;
            if (function0 != null) {
                function0.invoke();
            }
            AdCountDownView adCountDownView = this.f56621j;
            if (adCountDownView != null) {
                adCountDownView.setVisibility(8);
            }
            if (m73476k()) {
                C26866a.a.m104898f(aVar, "LocalVideoLandAdControl", "onCountdownFinish, start finish, show end", false, 4, null);
                m73475g(this.f56620i);
                m73478v(3, new Function1() { // from class: com.transsion.postdetail.layer.local.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16809i0.m73467n(((Integer) obj).intValue());
                    }
                });
                return;
            } else if (m73465l()) {
                C26866a.a.m104898f(aVar, "LocalVideoLandAdControl", "onCountdownFinish, start finish, show pause", false, 4, null);
                m73475g(this.f56620i);
                m73478v(2, new Function1() { // from class: com.transsion.postdetail.layer.local.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C16809i0.m73468o(((Integer) obj).intValue());
                    }
                });
                return;
            } else {
                C26866a.a.m104898f(aVar, "LocalVideoLandAdControl", "onCountdownFinish, start finish now", false, 4, null);
                Function1 function1 = this.f56623l;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(this.f56620i));
                    return;
                }
                return;
            }
        }
        if (i11 == 2) {
            C26866a.a.m104898f(aVar, "LocalVideoLandAdControl", "onCountdownFinish, pause finish now", false, 4, null);
            Function1 function2 = this.f56623l;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(this.f56620i));
                return;
            }
            return;
        }
        if (i11 != 3) {
            return;
        }
        this.f56617f = true;
        this.f56618g = false;
        AdCountDownView adCountDownView2 = this.f56621j;
        if (adCountDownView2 != null) {
            adCountDownView2.setVisibility(8);
        }
        if (m73465l()) {
            C26866a.a.m104898f(aVar, "LocalVideoLandAdControl", "onCountdownFinish, end finish , show pause", false, 4, null);
            m73475g(this.f56620i);
            m73478v(2, new Function1() { // from class: com.transsion.postdetail.layer.local.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16809i0.m73469p(((Integer) obj).intValue());
                }
            });
        } else {
            C26866a.a.m104898f(aVar, "LocalVideoLandAdControl", "onCountdownFinish, end finish now", false, 4, null);
            Function1 function3 = this.f56623l;
            if (function3 != null) {
                function3.invoke(Integer.valueOf(this.f56620i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Unit m73467n(int i11) {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Unit m73468o(int i11) {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Unit m73469p(int i11) {
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: q */
    private final void m73470q(Function1 function1) {
        m73474w(this.f56626o);
    }

    /* JADX INFO: renamed from: r */
    private final void m73471r(Function1 function1) {
        AdCountDownView adCountDownView = this.f56621j;
        if (adCountDownView != null) {
            adCountDownView.refreshCountDown(-1);
        }
        AdCountDownView adCountDownView2 = this.f56621j;
        if (adCountDownView2 != null) {
            adCountDownView2.setVisibility(0);
        }
        C26866a.a.m104898f(C26866a.f81698a, "LocalVideoLandAdControl", "onShowPauseAd", false, 4, null);
    }

    /* JADX INFO: renamed from: s */
    private final void m73472s(Function1 function1) {
        C26866a.a.m104898f(C26866a.f81698a, "LocalVideoLandAdControl", "onShowStartAd", false, 4, null);
        m73474w(this.f56625n);
    }

    /* JADX INFO: renamed from: u */
    private final void m73473u() {
        this.f56629r.removeCallbacksAndMessages(this.f56632u);
    }

    /* JADX INFO: renamed from: w */
    private final void m73474w(int i11) {
        C26866a.a.m104898f(C26866a.f81698a, "LocalVideoLandAdControl", "startCountdown, countdownTime = " + i11, false, 4, null);
        this.f56628q = i11;
        AdCountDownView adCountDownView = this.f56621j;
        if (adCountDownView != null) {
            adCountDownView.setVisibility(0);
        }
        this.f56629r.post(this.f56632u);
    }

    /* JADX INFO: renamed from: g */
    public final void m73475g(int i11) {
        C26866a.a.m104898f(C26866a.f81698a, "LocalVideoLandAdControl", "----closeLandAd, adType = " + i11, false, 4, null);
        this.f56620i = 0;
        m73473u();
        AppCompatImageView appCompatImageView = this.f56622k;
        if (appCompatImageView != null) {
            AbstractC26006c.m102054g(appCompatImageView);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m73476k() {
        if (this.f56617f || this.f56618g || this.f56612a - this.f56613b > this.f56627p) {
            return false;
        }
        if (!this.f56619h) {
            this.f56619h = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m73477t(long j11, long j12) {
        this.f56613b = j11;
        this.f56612a = j12;
    }

    /* JADX INFO: renamed from: v */
    public final void m73478v(int i11, Function1 function1) {
        C26866a.a.m104898f(C26866a.f81698a, "LocalVideoLandAdControl", "----showLandAd, adType = " + i11, false, 4, null);
        this.f56620i = i11;
        if (i11 == 1) {
            m73472s(function1);
        } else if (i11 == 2) {
            m73471r(function1);
        } else {
            if (i11 != 3) {
                return;
            }
            m73470q(function1);
        }
    }
}
