package com.transsion.ugcvideodetail.hepler;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.p282tn.lib.pager.PagerLayoutManager;
import com.transsion.baselib.report.C14492k;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.widget.UGCImmVideoItemView;
import gh.AbstractC23576a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p743rh.C27287m;
import p801u6.C27941f;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C20311b extends AbstractC23576a implements C14492k.a {

    /* JADX INFO: renamed from: k */
    public static final a f64370k = new a(null);

    /* JADX INFO: renamed from: a */
    private final Fragment f64371a;

    /* JADX INFO: renamed from: b */
    private final BaseProviderMultiAdapter f64372b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC16634g f64373c;

    /* JADX INFO: renamed from: d */
    private final ORPlayerView f64374d;

    /* JADX INFO: renamed from: e */
    private PagerLayoutManager f64375e;

    /* JADX INFO: renamed from: f */
    private int f64376f;

    /* JADX INFO: renamed from: g */
    private int f64377g;

    /* JADX INFO: renamed from: h */
    private boolean f64378h;

    /* JADX INFO: renamed from: i */
    private View f64379i;

    /* JADX INFO: renamed from: j */
    private boolean f64380j;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20311b(Fragment fragment, BaseProviderMultiAdapter baseProviderMultiAdapter, InterfaceC16634g interfaceC16634g, ORPlayerView oRPlayerView, PagerLayoutManager pagerLayoutManager) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f64371a = fragment;
        this.f64372b = baseProviderMultiAdapter;
        this.f64373c = interfaceC16634g;
        this.f64374d = oRPlayerView;
        this.f64375e = pagerLayoutManager;
        C14492k.f50955a.m65317g(this);
    }

    /* JADX INFO: renamed from: e */
    private final void m84068e() {
        C27941f c27941fM36186h0;
        BaseProviderMultiAdapter baseProviderMultiAdapter = this.f64372b;
        if (((baseProviderMultiAdapter == null || (c27941fM36186h0 = baseProviderMultiAdapter.m36186h0()) == null) ? null : c27941fM36186h0.m108661i()) == LoadMoreStatus.Fail && C27287m.f83003a.m106330e()) {
            C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoControl", "current is fail, try load more", false, 4, null);
            this.f64372b.m36186h0().m108670w();
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m84069h(int i11, View view) {
        this.f64379i = view;
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoControl", "on page select position = " + i11, false, 4, null);
        if (i11 < 0) {
            return;
        }
        BaseProviderMultiAdapter baseProviderMultiAdapter = this.f64372b;
        UGCImmVideo uGCImmVideo = baseProviderMultiAdapter != null ? (UGCImmVideo) baseProviderMultiAdapter.m36182f0(i11) : null;
        this.f64376f = i11;
        if (uGCImmVideo != null) {
            if (view instanceof UGCImmVideoItemView) {
                ((UGCImmVideoItemView) view).onPageSelected(this.f64373c, this.f64374d, uGCImmVideo);
            }
        } else {
            InterfaceC16634g interfaceC16634g = this.f64373c;
            if (interfaceC16634g != null) {
                interfaceC16634g.pause();
            }
        }
    }

    @Override // gh.AbstractC23576a
    /* JADX INFO: renamed from: a */
    public void mo84070a(int i11, boolean z11, View view) {
        C26866a.a.m104905r(C26866a.f81698a, "UGCImmVideoControl", new String[]{"onEachPageSelected, position = " + i11}, false, 4, null);
    }

    @Override // gh.AbstractC23576a
    /* JADX INFO: renamed from: b */
    public void mo84071b(View view) {
        if (this.f64380j) {
            this.f64380j = false;
            return;
        }
        PagerLayoutManager pagerLayoutManager = this.f64375e;
        if (pagerLayoutManager != null) {
            int iFindFirstVisibleItemPosition = pagerLayoutManager.findFirstVisibleItemPosition();
            C26866a.a.m104908v(C26866a.f81698a, "UGCImmVideoControl", "onInitComplete, position = " + iFindFirstVisibleItemPosition + ", ----- currentPosition = " + this.f64376f, false, 4, null);
            if (this.f64376f == iFindFirstVisibleItemPosition) {
                return;
            }
            if (iFindFirstVisibleItemPosition != -1) {
                this.f64376f = iFindFirstVisibleItemPosition;
            }
            m84069h(this.f64376f, view);
        }
    }

    @Override // gh.AbstractC23576a
    /* JADX INFO: renamed from: c */
    public void mo71412c(boolean z11, int i11, View view) {
        RecyclerView recyclerView;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104908v(aVar, "UGCImmVideoControl", "onPageRelease, position = " + i11 + ", ----- currentPosition = " + this.f64376f, false, 4, null);
        if (i11 == this.f64376f) {
            BaseProviderMultiAdapter baseProviderMultiAdapter = this.f64372b;
            if (baseProviderMultiAdapter != null && (recyclerView = baseProviderMultiAdapter.getRecyclerView()) != null && recyclerView.getScrollState() == 1) {
                C26866a.a.m104908v(aVar, "UGCImmVideoControl", "onPageRelease, 连续滑动，暂停", false, 4, null);
                InterfaceC16634g interfaceC16634g = this.f64373c;
                if (interfaceC16634g != null) {
                    interfaceC16634g.pause();
                }
            }
            if (view instanceof UGCImmVideoItemView) {
                ((UGCImmVideoItemView) view).onPageRelease(i11);
            }
        }
    }

    @Override // gh.AbstractC23576a
    /* JADX INFO: renamed from: d */
    public void mo84072d(int i11, boolean z11, View view) {
        m84068e();
        C26866a.a.m104898f(C26866a.f81698a, "UGCImmVideoControl", "onPageSelected, position = " + i11 + ", ----- currentPosition = " + this.f64376f, false, 4, null);
        int i12 = this.f64376f;
        if (i12 != i11 || this.f64378h) {
            this.f64378h = false;
            this.f64377g = i12;
            this.f64376f = i11;
            m84069h(i11, view);
        }
    }

    /* JADX INFO: renamed from: f */
    public final UGCImmVideoItemView m84073f() {
        View view = this.f64379i;
        if (view instanceof UGCImmVideoItemView) {
            return (UGCImmVideoItemView) view;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m84074g() {
        View view = this.f64379i;
        UGCImmVideoItemView uGCImmVideoItemView = view instanceof UGCImmVideoItemView ? (UGCImmVideoItemView) view : null;
        if (uGCImmVideoItemView != null) {
            uGCImmVideoItemView.onPageDestroy();
        }
        C14492k.f50955a.m65326t(this);
    }

    @Override // com.transsion.baselib.report.C14492k.a
    public void onBackgroundStatusChange(boolean z11) {
        if (z11) {
            View view = this.f64379i;
            UGCImmVideoItemView uGCImmVideoItemView = view instanceof UGCImmVideoItemView ? (UGCImmVideoItemView) view : null;
            if (uGCImmVideoItemView != null) {
                uGCImmVideoItemView.app2Background();
            }
        }
    }
}
