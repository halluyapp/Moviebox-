package com.transsion.shorttv_pugc.base.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv_pugc.base.widget.C19258f;
import com.transsion.shorttv_pugc.base.widget.StateView;
import com.transsion.shorttv_pugc.base.widget.TnTextView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import ht.AbstractC23896b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p743rh.C27287m;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import pt.C26950b;
import rs.C27330b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0013J\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u0005J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u0005J\u0017\u0010#\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u001eJ\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010\u0013J\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)\u0018\u00010(H&¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH&¢\u0006\u0004\b,\u0010\u0005J\u000f\u0010-\u001a\u00020\nH&¢\u0006\u0004\b-\u0010\u0005R0\u00103\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010+\"\u0004\b1\u00102¨\u00064"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/base/fragment/BaseListFragment;", "T", "Lcom/transsion/shorttv_pugc/base/fragment/LazyFragment;", "Lrs/b;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "n0", "(Landroid/view/LayoutInflater;)Lrs/b;", "", "initViewData", "initListener", "Landroidx/recyclerview/widget/RecyclerView$m;", "j0", "()Landroidx/recyclerview/widget/RecyclerView$m;", "q0", "", "r0", "()Z", "Landroid/view/View;", "l0", "()Landroid/view/View;", "C0", "emptyView", "A0", "(Landroid/view/View;)V", "t0", "isRefresh", "z0", "(Z)V", "s0", "x0", "u0", "gone", "v0", "isEmpty", "", "m0", "()Ljava/lang/String;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "i0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "y0", "loadMore", "m", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "k0", "setMBaseAdapter", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "mBaseAdapter", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public abstract class BaseListFragment<T> extends LazyFragment<C27330b> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private BaseQuickAdapter mBaseAdapter;

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m80473B0(BaseListFragment baseListFragment, View view, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRvEmptyLayout");
        }
        if ((i11 & 1) != 0) {
            view = baseListFragment.m80484l0();
        }
        baseListFragment.m80479A0(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m80476o0(BaseListFragment baseListFragment) {
        if (!baseListFragment.m80489s0()) {
            baseListFragment.mo80494y0();
        } else {
            baseListFragment.m80495z0(false);
            C26950b.f81855a.m105092e("loading, please try again later ...");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m80477p0(BaseListFragment baseListFragment) {
        if (!baseListFragment.m80490t0()) {
            baseListFragment.loadMore();
        } else {
            C26950b.f81855a.m105092e("being refreshed, please try again later ...");
            baseListFragment.m80493x0();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m80478w0(BaseListFragment baseListFragment, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreEnd");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        baseListFragment.m80492v0(z11);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m80479A0(View emptyView) {
        Intrinsics.m97802h(emptyView, "emptyView");
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.m36171Y0(emptyView);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m80480C0() {
        m80495z0(false);
        m80493x0();
        if (isEmpty()) {
            m80473B0(this, null, 1, null);
        }
        if (C27287m.f83003a.m106330e()) {
            return;
        }
        C26950b.f81855a.m105092e(getString(R$string.short_tv_no_network_toast));
    }

    /* JADX INFO: renamed from: i0 */
    public abstract BaseQuickAdapter mo80481i0();

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initListener() {
        SwipeRefreshLayout swipeRefreshLayout;
        C27330b c27330b = (C27330b) getMViewBinding();
        if (c27330b != null && (swipeRefreshLayout = c27330b.f83077d) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.shorttv_pugc.base.fragment.a
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    BaseListFragment.m80476o0(this.f61708a);
                }
            });
        }
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter != null) {
            baseQuickAdapter.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.shorttv_pugc.base.fragment.b
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    BaseListFragment.m80477p0(this.f61709a);
                }
            });
        }
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewData() {
        C27330b c27330b = (C27330b) getMViewBinding();
        if (c27330b != null) {
            String strMo80485m0 = mo80485m0();
            if (strMo80485m0.length() > 0) {
                AppCompatImageView ivBack = c27330b.f83076c;
                Intrinsics.m97801g(ivBack, "ivBack");
                AbstractC23896b.m94642d(ivBack);
                TnTextView tvTitle = c27330b.f83079f;
                Intrinsics.m97801g(tvTitle, "tvTitle");
                AbstractC23896b.m94642d(tvTitle);
            } else {
                AppCompatImageView ivBack2 = c27330b.f83076c;
                Intrinsics.m97801g(ivBack2, "ivBack");
                AbstractC23896b.m94640b(ivBack2);
                TnTextView tvTitle2 = c27330b.f83079f;
                Intrinsics.m97801g(tvTitle2, "tvTitle");
                AbstractC23896b.m94640b(tvTitle2);
            }
            c27330b.f83079f.setText(strMo80485m0);
        }
        m80487q0();
    }

    public final boolean isEmpty() {
        List<Object> data;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        return (baseQuickAdapter == null || (data = baseQuickAdapter.getData()) == null || !data.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: j0 */
    public RecyclerView.AbstractC4214m m80482j0() {
        return new LinearLayoutManager(requireContext());
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final BaseQuickAdapter getMBaseAdapter() {
        return this.mBaseAdapter;
    }

    /* JADX INFO: renamed from: l0 */
    public View m80484l0() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        StateView stateView = new StateView(contextRequireContext);
        stateView.showData(2, 1, false, "", getEmptyDescText());
        return stateView;
    }

    public abstract void loadMore();

    /* JADX INFO: renamed from: m0 */
    public abstract String mo80485m0();

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C27330b getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27330b c27330bM106422c = C27330b.m106422c(inflater);
        Intrinsics.m97801g(c27330bM106422c, "inflate(...)");
        return c27330bM106422c;
    }

    /* JADX INFO: renamed from: q0 */
    public void m80487q0() {
        RecyclerView recyclerView;
        C27330b c27330b = (C27330b) getMViewBinding();
        if (c27330b == null || (recyclerView = c27330b.f83078e) == null) {
            return;
        }
        recyclerView.setLayoutManager(m80482j0());
        BaseQuickAdapter baseQuickAdapterMo80481i0 = mo80481i0();
        this.mBaseAdapter = baseQuickAdapterMo80481i0;
        recyclerView.setAdapter(baseQuickAdapterMo80481i0);
        if (m80488r0()) {
            BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
            recyclerView.addOnScrollListener(new C19258f(baseQuickAdapter != null ? baseQuickAdapter.m36186h0() : null));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m80488r0() {
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m80489s0() {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return false;
        }
        return c27941fM36186h0.m108666r();
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m80490t0() {
        SwipeRefreshLayout swipeRefreshLayout;
        C27330b c27330b = (C27330b) getMViewBinding();
        if (c27330b == null || (swipeRefreshLayout = c27330b.f83077d) == null) {
            return false;
        }
        return swipeRefreshLayout.isRefreshing();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m80491u0() {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108667s();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m80492v0(boolean gone) {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108668t(gone);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m80493x0() {
        C27941f c27941fM36186h0;
        BaseQuickAdapter baseQuickAdapter = this.mBaseAdapter;
        if (baseQuickAdapter == null || (c27941fM36186h0 = baseQuickAdapter.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: renamed from: y0 */
    public abstract void mo80494y0();

    /* JADX INFO: renamed from: z0 */
    public final void m80495z0(boolean isRefresh) {
        SwipeRefreshLayout swipeRefreshLayout;
        C27330b c27330b = (C27330b) getMViewBinding();
        if (c27330b == null || (swipeRefreshLayout = c27330b.f83077d) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(isRefresh);
    }
}
