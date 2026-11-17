package com.transsion.shorttv_pugc.p317ui.widget;

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
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.base.pager.PagerLayoutManager;
import com.transsion.shorttv_pugc.utils.ShortTvExtKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mt.AbstractC25907a;
import p743rh.C27287m;
import p801u6.C27941f;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C19516u extends AbstractC25907a implements InterfaceC3218r {

    /* JADX INFO: renamed from: l */
    public static final a f62435l = new a(null);

    /* JADX INFO: renamed from: a */
    private final Fragment f62436a;

    /* JADX INFO: renamed from: b */
    private final BaseProviderMultiAdapter f62437b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC16634g f62438c;

    /* JADX INFO: renamed from: d */
    private final ORPlayerView f62439d;

    /* JADX INFO: renamed from: e */
    private PagerLayoutManager f62440e;

    /* JADX INFO: renamed from: f */
    private int f62441f;

    /* JADX INFO: renamed from: g */
    private int f62442g;

    /* JADX INFO: renamed from: h */
    private boolean f62443h;

    /* JADX INFO: renamed from: i */
    private View f62444i;

    /* JADX INFO: renamed from: j */
    private boolean f62445j;

    /* JADX INFO: renamed from: k */
    private boolean f62446k;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.u$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.widget.u$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f62447a;

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
            f62447a = iArr;
        }
    }

    public C19516u(Fragment fragment, BaseProviderMultiAdapter baseProviderMultiAdapter, InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView, PagerLayoutManager pagerLayoutManager) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f62436a = fragment;
        this.f62437b = baseProviderMultiAdapter;
        this.f62438c = interfaceC16634g;
        this.f62439d = oRPlayerView;
        this.f62440e = pagerLayoutManager;
        this.f62443h = true;
        fragment.getLifecycle().mo14832a(this);
    }

    /* JADX INFO: renamed from: e */
    private final void m81287e() {
        C27941f c27941fM36186h0;
        BaseProviderMultiAdapter baseProviderMultiAdapter = this.f62437b;
        if (((baseProviderMultiAdapter == null || (c27941fM36186h0 = baseProviderMultiAdapter.m36186h0()) == null) ? null : c27941fM36186h0.m108661i()) == LoadMoreStatus.Fail && C27287m.f83003a.m106330e()) {
            C26866a.a.m104898f(C26866a.f81698a, "ShortTvControl", "current is fail, try load more", false, 4, null);
            this.f62437b.m36186h0().m108670w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    private final void m81288j(int i11, View view) {
        List<Object> data;
        this.f62444i = view;
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvControl", "ep = " + i11, false, 4, null);
        if (i11 < 0) {
            return;
        }
        BaseProviderMultiAdapter baseProviderMultiAdapter = this.f62437b;
        ShorttvModel.UGCVideo uGCVideo = null;
        Object obj = null;
        uGCVideo = null;
        if (baseProviderMultiAdapter != null && (data = baseProviderMultiAdapter.getData()) != null) {
            for (Object obj2 : data) {
                if (((ShorttvModel.UGCVideo) obj2).getEp() == ShortTvExtKt.m81309l(i11)) {
                    obj = obj2;
                    break;
                }
            }
            uGCVideo = (ShorttvModel.UGCVideo) obj;
        }
        this.f62441f = i11;
        if (view instanceof InterfaceC19486a) {
            ((InterfaceC19486a) view).onPageSelected(this.f62438c, this.f62439d, uGCVideo);
        }
    }

    @Override // mt.AbstractC25907a
    /* JADX INFO: renamed from: a */
    public void mo81289a(int i11, boolean z11, View view) {
        C26866a.a.m104905r(C26866a.f81698a, "ShortTvControl", new String[]{"onEachPageSelected, position = " + i11}, false, 4, null);
    }

    @Override // mt.AbstractC25907a
    /* JADX INFO: renamed from: b */
    public void mo81290b(View view) {
        if (this.f62445j) {
            this.f62445j = false;
            return;
        }
        PagerLayoutManager pagerLayoutManager = this.f62440e;
        if (pagerLayoutManager != null) {
            int iFindFirstVisibleItemPosition = pagerLayoutManager.findFirstVisibleItemPosition();
            C26866a.a.m104908v(C26866a.f81698a, "ShortTvControl", "onInitComplete, position = " + iFindFirstVisibleItemPosition + ", ----- currentPosition = " + this.f62441f, false, 4, null);
            if (this.f62441f == iFindFirstVisibleItemPosition) {
                return;
            }
            if (iFindFirstVisibleItemPosition != -1) {
                this.f62441f = iFindFirstVisibleItemPosition;
            }
            m81288j(this.f62441f, view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.AbstractC25907a
    /* JADX INFO: renamed from: c */
    public void mo81291c(boolean z11, int i11, View view) {
        RecyclerView recyclerView;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104908v(aVar, "ShortTvControl", "onPageRelease, position = " + i11 + ", ----- currentPosition = " + this.f62441f, false, 4, null);
        if (i11 == this.f62441f) {
            BaseProviderMultiAdapter baseProviderMultiAdapter = this.f62437b;
            if (baseProviderMultiAdapter != null && (recyclerView = baseProviderMultiAdapter.getRecyclerView()) != null && recyclerView.getScrollState() == 1) {
                C26866a.a.m104908v(aVar, "ShortTvControl", "onPageRelease, 连续滑动，暂停", false, 4, null);
                InterfaceC16634g interfaceC16634g = this.f62438c;
                if (interfaceC16634g != null) {
                    interfaceC16634g.pause();
                }
            }
            if (view instanceof InterfaceC19486a) {
                ((InterfaceC19486a) view).onPageRelease(i11);
            }
        }
    }

    @Override // mt.AbstractC25907a
    /* JADX INFO: renamed from: d */
    public void mo81292d(int i11, boolean z11, View view) {
        m81287e();
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvControl", "onPageSelected, position = " + i11 + ", ----- currentPosition = " + this.f62441f, false, 4, null);
        int i12 = this.f62441f;
        if (i12 == i11 && this.f62446k) {
            return;
        }
        this.f62446k = true;
        this.f62442g = i12;
        this.f62441f = i11;
        m81288j(i11, view);
    }

    /* JADX INFO: renamed from: f */
    public final View m81293f() {
        return this.f62444i;
    }

    /* JADX INFO: renamed from: g */
    public final int m81294g() {
        return this.f62441f;
    }

    /* JADX INFO: renamed from: h */
    public final long m81295h() {
        KeyEvent.Callback callback = this.f62444i;
        InterfaceC19486a interfaceC19486a = callback instanceof InterfaceC19486a ? (InterfaceC19486a) callback : null;
        if (interfaceC19486a != null) {
            return interfaceC19486a.getProgress();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: i */
    public final void m81296i() {
        View view = this.f62444i;
        ShortTvVideoItemView shortTvVideoItemView = view instanceof ShortTvVideoItemView ? (ShortTvVideoItemView) view : null;
        if (shortTvVideoItemView != null) {
            shortTvVideoItemView.onNetConnect();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m81297k(boolean z11) {
        this.f62445j = z11;
    }

    @Override // androidx.p1004lifecycle.InterfaceC3218r
    public void onStateChanged(InterfaceC3224u source, Lifecycle.Event event) {
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(event, "event");
        if (b.f62447a[event.ordinal()] != 3) {
            return;
        }
        this.f62444i = null;
        this.f62436a.getLifecycle().mo14835d(this);
    }
}
