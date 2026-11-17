package com.transsion.shorttv.p315ui.widget;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.InterfaceC3218r;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.shorttv.base.pager.PagerLayoutManager;
import com.transsion.shorttv.p313ad.playeroverlayad.ShortTvPlayerOverlayAdManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p467hs.AbstractC23893a;
import p659os.AbstractC26725k;
import p659os.C26719e;
import p743rh.C27287m;
import p801u6.C27941f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvPagerChangeControl extends AbstractC23893a implements InterfaceC3218r, InterfaceC19107a1 {

    /* JADX INFO: renamed from: o */
    public static final C19094a f61394o = new C19094a(null);

    /* JADX INFO: renamed from: a */
    private final Fragment f61395a;

    /* JADX INFO: renamed from: b */
    private final BaseProviderMultiAdapter f61396b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC16634g f61397c;

    /* JADX INFO: renamed from: d */
    private final ORPlayerView f61398d;

    /* JADX INFO: renamed from: e */
    private PagerLayoutManager f61399e;

    /* JADX INFO: renamed from: f */
    private boolean f61400f;

    /* JADX INFO: renamed from: g */
    private int f61401g;

    /* JADX INFO: renamed from: h */
    private Integer f61402h;

    /* JADX INFO: renamed from: i */
    private boolean f61403i;

    /* JADX INFO: renamed from: j */
    private boolean f61404j;

    /* JADX INFO: renamed from: k */
    private View f61405k;

    /* JADX INFO: renamed from: l */
    private boolean f61406l;

    /* JADX INFO: renamed from: m */
    private final Handler f61407m;

    /* JADX INFO: renamed from: n */
    private Runnable f61408n;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvPagerChangeControl$a */
    public static final class C19094a {
        private C19094a() {
        }

        public /* synthetic */ C19094a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTvPagerChangeControl$b */
    public /* synthetic */ class C19095b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f61409a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61409a = iArr;
        }
    }

    public ShortTvPagerChangeControl(Fragment fragment, BaseProviderMultiAdapter baseProviderMultiAdapter, InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView, PagerLayoutManager pagerLayoutManager) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f61395a = fragment;
        this.f61396b = baseProviderMultiAdapter;
        this.f61397c = interfaceC16634g;
        this.f61398d = oRPlayerView;
        this.f61399e = pagerLayoutManager;
        this.f61400f = true;
        this.f61403i = true;
        this.f61407m = new Handler(Looper.getMainLooper());
        fragment.getLifecycle().mo14832a(this);
    }

    /* JADX INFO: renamed from: i */
    private final void m80076i() {
        C27941f c27941fM36186h0;
        BaseProviderMultiAdapter baseProviderMultiAdapter = this.f61396b;
        if (((baseProviderMultiAdapter == null || (c27941fM36186h0 = baseProviderMultiAdapter.m36186h0()) == null) ? null : c27941fM36186h0.m108661i()) == LoadMoreStatus.Fail && C27287m.f83003a.m106330e()) {
            C26866a.a.m104898f(C26866a.f81698a, "ShortTvControl", "current is fail, try load more", false, 4, null);
            this.f61396b.m36186h0().m108670w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private final void m80077q(int i11, View view) {
        this.f61405k = view;
        boolean z11 = view instanceof ShortTvVideoItemView;
        ShortTvVideoItemView shortTvVideoItemView = z11 ? (ShortTvVideoItemView) view : null;
        if (shortTvVideoItemView != null) {
            shortTvVideoItemView.setCountdownController(this);
        }
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvControl", "on page select position = " + i11, false, 4, null);
        if (i11 < 0) {
            return;
        }
        BaseProviderMultiAdapter baseProviderMultiAdapter = this.f61396b;
        AbstractC26725k abstractC26725k = baseProviderMultiAdapter != null ? (AbstractC26725k) baseProviderMultiAdapter.m36182f0(i11) : null;
        this.f61401g = i11;
        if (!(abstractC26725k instanceof C26719e)) {
            InterfaceC16634g interfaceC16634g = this.f61397c;
            if (interfaceC16634g != null) {
                interfaceC16634g.pause();
                return;
            }
            return;
        }
        if (view instanceof InterfaceC19112d) {
            ShortTvVideoItemView shortTvVideoItemView2 = z11 ? (ShortTvVideoItemView) view : null;
            if (shortTvVideoItemView2 != null) {
                shortTvVideoItemView2.setFirstPlayInSession(this.f61400f);
            }
            this.f61400f = false;
            ((InterfaceC19112d) view).onPageSelected(this.f61397c, this.f61398d, (C26719e) abstractC26725k);
        }
    }

    @Override // com.transsion.shorttv.p315ui.widget.InterfaceC19107a1
    /* JADX INFO: renamed from: a */
    public void mo80078a(int i11) {
        mo80079b();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i11;
        View view = this.f61405k;
        ShortTvVideoItemView shortTvVideoItemView = view instanceof ShortTvVideoItemView ? (ShortTvVideoItemView) view : null;
        if (shortTvVideoItemView != null) {
            shortTvVideoItemView.updateUnlockCountdownText$shortTvLib_release(Integer.valueOf(i11));
        }
        Runnable runnable = new Runnable() { // from class: com.transsion.shorttv.ui.widget.ShortTvPagerChangeControl$startCountdown$1
            @Override // java.lang.Runnable
            public void run() {
                intRef.element--;
                View view2 = this.f61405k;
                ShortTvVideoItemView shortTvVideoItemView2 = view2 instanceof ShortTvVideoItemView ? (ShortTvVideoItemView) view2 : null;
                int i12 = intRef.element;
                if (i12 > 0) {
                    if (shortTvVideoItemView2 != null) {
                        shortTvVideoItemView2.updateUnlockCountdownText$shortTvLib_release(Integer.valueOf(i12));
                    }
                    this.f61407m.postDelayed(this, 1000L);
                } else {
                    this.mo80079b();
                    if (shortTvVideoItemView2 != null) {
                        shortTvVideoItemView2.watchAdToUnlock$shortTvLib_release(true);
                    }
                }
            }
        };
        this.f61408n = runnable;
        Handler handler = this.f61407m;
        Intrinsics.m97799e(runnable);
        handler.postDelayed(runnable, 1000L);
    }

    @Override // com.transsion.shorttv.p315ui.widget.InterfaceC19107a1
    /* JADX INFO: renamed from: b */
    public void mo80079b() {
        View view = this.f61405k;
        ShortTvVideoItemView shortTvVideoItemView = view instanceof ShortTvVideoItemView ? (ShortTvVideoItemView) view : null;
        if (shortTvVideoItemView != null) {
            shortTvVideoItemView.updateUnlockCountdownText$shortTvLib_release(null);
        }
        Runnable runnable = this.f61408n;
        if (runnable != null) {
            this.f61407m.removeCallbacks(runnable);
        }
        this.f61408n = null;
    }

    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: c */
    public void mo80080c(int i11, boolean z11, View view) {
        C26866a.a.m104905r(C26866a.f81698a, "ShortTvControl", new String[]{"onEachPageSelected, position = " + i11}, false, 4, null);
    }

    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: d */
    public void mo72958d(View view) {
        if (this.f61406l) {
            this.f61406l = false;
            return;
        }
        PagerLayoutManager pagerLayoutManager = this.f61399e;
        if (pagerLayoutManager != null) {
            int iFindFirstVisibleItemPosition = pagerLayoutManager.findFirstVisibleItemPosition();
            C26866a.a.m104908v(C26866a.f81698a, "ShortTvControl", "onInitComplete, position = " + iFindFirstVisibleItemPosition + ", ----- currentPosition = " + this.f61401g, false, 4, null);
            if (this.f61401g == iFindFirstVisibleItemPosition) {
                return;
            }
            if (iFindFirstVisibleItemPosition != -1) {
                this.f61401g = iFindFirstVisibleItemPosition;
            }
            m80077q(this.f61401g, view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: e */
    public void mo72959e(boolean z11, int i11, View view) {
        RecyclerView recyclerView;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104908v(aVar, "ShortTvControl", "onPageRelease, position = " + i11 + ", ----- currentPosition = " + this.f61401g, false, 4, null);
        if (i11 == this.f61401g) {
            BaseProviderMultiAdapter baseProviderMultiAdapter = this.f61396b;
            if (baseProviderMultiAdapter != null && (recyclerView = baseProviderMultiAdapter.getRecyclerView()) != null && recyclerView.getScrollState() == 1) {
                C26866a.a.m104908v(aVar, "ShortTvControl", "onPageRelease, 连续滑动，暂停", false, 4, null);
                InterfaceC16634g interfaceC16634g = this.f61397c;
                if (interfaceC16634g != null) {
                    interfaceC16634g.pause();
                }
            }
            if (view instanceof InterfaceC19112d) {
                ((InterfaceC19112d) view).onPageRelease(i11);
            }
        }
    }

    @Override // p467hs.AbstractC23893a
    /* JADX INFO: renamed from: f */
    public void mo72960f(int i11, boolean z11, View view) {
        m80076i();
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvControl", "onPageSelected, position = " + i11 + ", ----- currentPosition = " + this.f61401g, false, 4, null);
        if (this.f61401g != i11 || this.f61404j) {
            mo80079b();
            this.f61404j = false;
            Integer numValueOf = Integer.valueOf(this.f61401g);
            this.f61402h = numValueOf;
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                BaseProviderMultiAdapter baseProviderMultiAdapter = this.f61396b;
                AbstractC26725k abstractC26725k = baseProviderMultiAdapter != null ? (AbstractC26725k) baseProviderMultiAdapter.getItem(iIntValue) : null;
                if (abstractC26725k != null) {
                    C26719e c26719e = abstractC26725k instanceof C26719e ? (C26719e) abstractC26725k : null;
                    if (c26719e != null) {
                        ShortTvPlayerOverlayAdManager.f60541a.m78952e(c26719e.m104509a());
                    }
                }
            }
            this.f61401g = i11;
            m80077q(i11, view);
        }
    }

    /* JADX INFO: renamed from: j */
    public final View m80081j() {
        return this.f61405k;
    }

    /* JADX INFO: renamed from: k */
    public final int m80082k() {
        return this.f61401g;
    }

    /* JADX INFO: renamed from: l */
    public final long m80083l() {
        KeyEvent.Callback callback = this.f61405k;
        InterfaceC19112d interfaceC19112d = callback instanceof InterfaceC19112d ? (InterfaceC19112d) callback : null;
        if (interfaceC19112d != null) {
            return interfaceC19112d.getProgress();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: m */
    public final void m80084m() {
        KeyEvent.Callback callback = this.f61405k;
        InterfaceC19112d interfaceC19112d = callback instanceof InterfaceC19112d ? (InterfaceC19112d) callback : null;
        if (interfaceC19112d != null) {
            interfaceC19112d.onAudioTrackChange();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m80085n() {
        KeyEvent.Callback callback = this.f61405k;
        InterfaceC19112d interfaceC19112d = callback instanceof InterfaceC19112d ? (InterfaceC19112d) callback : null;
        if (interfaceC19112d != null) {
            interfaceC19112d.onGetDubsInfo();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m80086o() {
        if (this.f61403i) {
            this.f61403i = false;
        }
    }

    @Override // androidx.p1004lifecycle.InterfaceC3218r
    public void onStateChanged(InterfaceC3224u source, Lifecycle.Event event) {
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(event, "event");
        if (C19095b.f61409a[event.ordinal()] != 3) {
            return;
        }
        mo80079b();
        this.f61405k = null;
        this.f61395a.getLifecycle().mo14835d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m80087p() {
        View view = this.f61405k;
        ShortTvVideoItemView shortTvVideoItemView = view instanceof ShortTvVideoItemView ? (ShortTvVideoItemView) view : null;
        if (shortTvVideoItemView != null) {
            shortTvVideoItemView.onNetConnect();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m80088r(boolean z11) {
        this.f61406l = z11;
    }

    /* JADX INFO: renamed from: s */
    public final void m80089s(int i11) {
        this.f61401g = i11;
    }

    /* JADX INFO: renamed from: t */
    public final void m80090t(ShortTvVideoItemView view, int i11, C26719e item) {
        Intrinsics.m97802h(view, "view");
        Intrinsics.m97802h(item, "item");
        view.updateShortTvInfo(this.f61397c, this.f61398d, item);
    }
}
