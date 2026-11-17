package com.transsion.baseui.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.p282tn.lib.view.StateView;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.R$string;
import com.transsion.baseui.R$layout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22989b;
import hk.C23862a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p743rh.C27287m;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u0005J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010\u0013J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\u0005J\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010(\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\u0011¢\u0006\u0004\b(\u0010\"J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\u0005J\r\u0010*\u001a\u00020\u0011¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010,\u001a\u00020+H&¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020/\u0018\u00010.H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\nH&¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\nH&¢\u0006\u0004\b3\u0010\u0005R0\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00101\"\u0004\b7\u00108¨\u0006:"}, m97100d2 = {"Lcom/transsion/baseui/fragment/BaseListFragment;", "T", "Lcom/transsion/baseui/fragment/LazyFragment;", "Ldk/b;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "t0", "(Landroid/view/LayoutInflater;)Ldk/b;", "", "initViewData", "initListener", "Landroidx/recyclerview/widget/RecyclerView$m;", "o0", "()Landroidx/recyclerview/widget/RecyclerView$m;", "x0", "", "y0", "()Z", "Landroid/view/View;", "q0", "()Landroid/view/View;", "r0", "N0", "u0", "emptyView", "J0", "(Landroid/view/View;)V", "loadingView", "L0", "A0", "isRefresh", "I0", "(Z)V", "n0", "z0", "E0", "B0", "gone", "C0", "F0", "isEmpty", "", "s0", "()Ljava/lang/String;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "m0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "G0", "loadMore", "a", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "p0", "H0", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "mBaseAdapter", "BaseUI_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public abstract class BaseListFragment<T> extends LazyFragment<C22989b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private BaseQuickAdapter mBaseAdapter;

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m65522D0(BaseListFragment baseListFragment, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreEnd");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        baseListFragment.m65531C0(z11);
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m65523K0(BaseListFragment baseListFragment, View view, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRvEmptyLayout");
        }
        if ((i11 & 1) != 0) {
            view = baseListFragment.mo65544q0();
        }
        baseListFragment.m65537J0(view);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m65524M0(BaseListFragment baseListFragment, View view, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRvLoadingLayout");
        }
        if ((i11 & 1) != 0) {
            view = baseListFragment.m65545r0();
        }
        baseListFragment.m65538L0(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m65527v0(BaseListFragment baseListFragment) {
        if (!baseListFragment.m65551z0()) {
            baseListFragment.mo65534G0();
        } else {
            baseListFragment.m65536I0(false);
            C28951b.f88586a.m111455e("loading, please try again later ...");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m65528w0(BaseListFragment baseListFragment) {
        if (!baseListFragment.m65529A0()) {
            baseListFragment.loadMore();
        } else {
            C28951b.f88586a.m111455e("being refreshed, please try again later ...");
            baseListFragment.m65532E0();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m65529A0() {
        SwipeRefreshLayout swipeRefreshLayout;
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b == null || (swipeRefreshLayout = c22989b.f70180c) == null) {
            return false;
        }
        return swipeRefreshLayout.isRefreshing();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m65530B0() {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108667s();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m65531C0(boolean gone) {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108668t(gone);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m65532E0() {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: renamed from: F0 */
    public final void m65533F0() {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108670w();
    }

    /* JADX INFO: renamed from: G0 */
    public abstract void mo65534G0();

    /* JADX INFO: renamed from: H0 */
    public final void m65535H0(BaseQuickAdapter baseQuickAdapter) {
        this.mBaseAdapter = baseQuickAdapter;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m65536I0(boolean isRefresh) {
        SwipeRefreshLayout swipeRefreshLayout;
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b == null || (swipeRefreshLayout = c22989b.f70180c) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(isRefresh);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m65537J0(View emptyView) {
        Intrinsics.m97802h(emptyView, "emptyView");
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.m36171Y0(emptyView);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m65538L0(View loadingView) {
        Intrinsics.m97802h(loadingView, "loadingView");
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.m36171Y0(loadingView);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m65539N0() {
        m65536I0(false);
        m65532E0();
        if (isEmpty()) {
            m65523K0(this, null, 1, null);
        }
        if (C27287m.f83003a.m106330e()) {
            return;
        }
        C28951b.f88586a.m111455e(getString(R$string.no_network_toast));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        SwipeRefreshLayout swipeRefreshLayout;
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b != null && (swipeRefreshLayout = c22989b.f70180c) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.baseui.fragment.b
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    BaseListFragment.m65527v0(this.f51041a);
                }
            });
        }
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.baseui.fragment.c
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    BaseListFragment.m65528w0(this.f51042a);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        TitleLayout titleLayout;
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b != null && (titleLayout = c22989b.f70182e) != null) {
            titleLayout.setTitleText(mo65546s0());
        }
        mo65549x0();
    }

    public final boolean isEmpty() {
        List<Object> data;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        return (baseQuickAdapter == null || (data = baseQuickAdapter.getData()) == null || !data.isEmpty()) ? false : true;
    }

    public abstract void loadMore();

    /* JADX INFO: renamed from: m0 */
    public abstract BaseQuickAdapter mo65540m0();

    /* JADX INFO: renamed from: n0 */
    public final void m65541n0() {
        SwipeRefreshLayout swipeRefreshLayout;
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b == null || (swipeRefreshLayout = c22989b.f70180c) == null) {
            return;
        }
        swipeRefreshLayout.setEnabled(false);
    }

    /* JADX INFO: renamed from: o0 */
    public RecyclerView.AbstractC4214m m65542o0() {
        return new LinearLayoutManager(requireContext());
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final BaseQuickAdapter getMBaseAdapter() {
        return this.mBaseAdapter;
    }

    /* JADX INFO: renamed from: q0 */
    public View mo65544q0() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        StateView stateView = new StateView(contextRequireContext);
        stateView.showData(2, 1, false, "", getEmptyDescText());
        return stateView;
    }

    /* JADX INFO: renamed from: r0 */
    public View m65545r0() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.default_rv_loading_layout, (ViewGroup) null);
        Intrinsics.m97801g(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: s0 */
    public abstract String mo65546s0();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C22989b getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C22989b c22989bM91562c = C22989b.m91562c(inflater);
        Intrinsics.m97801g(c22989bM91562c, "inflate(...)");
        return c22989bM91562c;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m65548u0() {
        TitleLayout titleLayout;
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b == null || (titleLayout = c22989b.f70182e) == null) {
            return;
        }
        titleLayout.setVisibility(8);
    }

    /* JADX INFO: renamed from: x0 */
    public void mo65549x0() {
        RecyclerView recyclerView;
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b == null || (recyclerView = c22989b.f70181d) == null) {
            return;
        }
        recyclerView.setLayoutManager(m65542o0());
        BaseQuickAdapter baseQuickAdapterMo65540m0 = mo65540m0();
        this.mBaseAdapter = baseQuickAdapterMo65540m0;
        recyclerView.setAdapter(baseQuickAdapterMo65540m0);
        if (m65550y0()) {
            BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
            recyclerView.addOnScrollListener(new C23862a(baseQuickAdapter != null ? baseQuickAdapter.m36186h0() : null));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m65550y0() {
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m65551z0() {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return false;
        }
        return c27941fM36186h0.m108666r();
    }
}
