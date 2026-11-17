package com.transsion.room.fragment;

import android.content.Intent;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.AdvRecyclerView;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.R$string;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.activity.RoomDetailActivity;
import com.transsion.room.adapter.C18039d;
import com.transsion.room.viewmodel.RoomViewModel;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23651m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p393f.C23284j;
import p550kj.C24655b;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J!\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\r\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010>\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0016\u0010@\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010+R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lgq/m;", "<init>", "()V", "", "m0", "", WebConstants.FIELD_ITEM, "", RequestParameters.POSITION, "p0", "(Ljava/lang/Object;I)V", "i0", "initViewModel", "Lcom/transsion/moviedetailapi/bean/RoomBean;", "roomBean", "u0", "(Lcom/transsion/moviedetailapi/bean/RoomBean;)V", "loadMore", "loadData", "t0", "s0", "q0", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "r0", "startLoading", "Landroid/view/LayoutInflater;", "inflater", "h0", "(Landroid/view/LayoutInflater;)Lgq/m;", "onResume", "onDestroyView", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "a", "I", "requestCode", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Z", "isRefresh", "Lcom/transsion/room/adapter/d;", "c", "Lcom/transsion/room/adapter/d;", "mHotAdapter", "Lcom/transsion/room/viewmodel/RoomViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/room/viewmodel/RoomViewModel;", "mRoomViewModel", "", "e", "Ljava/lang/String;", "mPersonalRoomPage", "f", "mHotRoomPage", "g", "mPerPage", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "h", "Landroidx/activity/result/b;", "requestRoomDetailLaunch", "i", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomFragment extends BaseFragment<C23651m> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C18039d mHotAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RoomViewModel mRoomViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private AbstractC0249b requestRoomDetailLaunch;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int requestCode = 100;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isRefresh = true;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mPersonalRoomPage = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String mHotRoomPage = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mPerPage = 20;

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomFragment$b */
    public static final class C18068b extends DiffUtil.AbstractC4174e {
        C18068b() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(RoomItem oldItem, RoomItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getCreatorId(), newItem.getCreatorId()) && Intrinsics.m97797c(oldItem.getName(), newItem.getName());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(RoomItem oldItem, RoomItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getGroupId(), newItem.getGroupId());
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomFragment$c */
    public static final class C18069c implements AdvRecyclerView.InterfaceC13719a {
        C18069c() {
        }

        @Override // com.p282tn.lib.view.AdvRecyclerView.InterfaceC13719a
        /* JADX INFO: renamed from: a */
        public void mo62001a() {
            RoomFragment.this.loadData();
        }

        @Override // com.p282tn.lib.view.AdvRecyclerView.InterfaceC13719a
        /* JADX INFO: renamed from: b */
        public void mo62002b() {
            RoomFragment.this.loadData();
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomFragment$d */
    public static final class C18070d extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int[] f59169a;

        /* JADX INFO: renamed from: b */
        private int f59170b;

        C18070d() {
        }

        /* JADX INFO: renamed from: d */
        private final void m76915d(RecyclerView recyclerView) {
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                if (this.f59169a == null) {
                    this.f59169a = new int[((StaggeredGridLayoutManager) layoutManager).m20978Q()];
                }
                ((StaggeredGridLayoutManager) layoutManager).m20974E(this.f59169a);
                this.f59170b = m76916e(this.f59169a);
                return;
            }
            if (layoutManager instanceof GridLayoutManager) {
                this.f59170b = ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
            } else {
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    throw new RuntimeException("Unsupported layoutManager.");
                }
                this.f59170b = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
            }
        }

        /* JADX INFO: renamed from: e */
        private final int m76916e(int[] iArr) {
            if (iArr == null) {
                return 0;
            }
            int i11 = 0;
            for (int i12 : iArr) {
                if (i12 > i11) {
                    i11 = i12;
                }
            }
            return i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            C18039d c18039d;
            C27941f c27941fM36186h0;
            C27941f c27941fM36186h1;
            Intrinsics.m97802h(recyclerView, "recyclerView");
            RecyclerView.AbstractC4214m layoutManager = recyclerView.getLayoutManager();
            int childCount = layoutManager != null ? layoutManager.getChildCount() : 0;
            int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
            if (i11 != 0 || childCount <= 0 || this.f59170b < itemCount - 1) {
                return;
            }
            C18039d c18039d2 = RoomFragment.this.mHotAdapter;
            if (((c18039d2 == null || (c27941fM36186h1 = c18039d2.m36186h0()) == null) ? null : c27941fM36186h1.m108661i()) != LoadMoreStatus.Fail || (c18039d = RoomFragment.this.mHotAdapter) == null || (c27941fM36186h0 = c18039d.m36186h0()) == null) {
                return;
            }
            c27941fM36186h0.m108670w();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            m76915d(recyclerView);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomFragment$e */
    public static final class C18071e implements InterfaceC27288n {
        C18071e() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            C27941f c27941fM36186h0;
            List<Object> data;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            C18039d c18039d = RoomFragment.this.mHotAdapter;
            if (c18039d != null && (data = c18039d.getData()) != null && data.isEmpty()) {
                RoomFragment.this.loadData();
                return;
            }
            C18039d c18039d2 = RoomFragment.this.mHotAdapter;
            if (c18039d2 == null || (c27941fM36186h0 = c18039d2.m36186h0()) == null) {
                return;
            }
            c27941fM36186h0.m108670w();
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomFragment$f */
    static final class C18072f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59173a;

        C18072f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59173a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59173a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59173a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final void m76899i0() {
        AdvRecyclerView advRecyclerView;
        AdvRecyclerView advRecyclerView2;
        SwipeRefreshLayout swipeRefreshLayout;
        AdvRecyclerView advRecyclerView3;
        AdvRecyclerView advRecyclerView4;
        C23651m mViewBinding = getMViewBinding();
        RecyclerView recyclerView = (mViewBinding == null || (advRecyclerView4 = mViewBinding.f72239b) == null) ? null : advRecyclerView4.getRecyclerView();
        C23651m mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (advRecyclerView3 = mViewBinding2.f72239b) != null) {
            advRecyclerView3.setPageName("rooms");
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        C18039d c18039d = new C18039d(new ArrayList());
        c18039d.m36186h0().m108673z(true);
        c18039d.m36186h0().m108672y(true);
        c18039d.m36186h0().m108657E(4);
        c18039d.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.room.fragment.k0
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                RoomFragment.m76900j0(this.f59264a);
            }
        });
        c18039d.m36158R0(new C18068b());
        c18039d.m36227w1(new InterfaceC27566d() { // from class: com.transsion.room.fragment.l0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RoomFragment.m76901k0(this.f59267a, baseQuickAdapter, view, i11);
            }
        });
        this.mHotAdapter = c18039d;
        if (recyclerView != null) {
            recyclerView.setAdapter(c18039d);
        }
        C23651m mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (swipeRefreshLayout = mViewBinding3.f72240c) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.room.fragment.m0
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    RoomFragment.m76902l0(this.f59271a);
                }
            });
        }
        C23651m mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (advRecyclerView2 = mViewBinding4.f72239b) != null) {
            advRecyclerView2.setOnStateClickListener(new C18069c());
        }
        C23651m mViewBinding5 = getMViewBinding();
        if (mViewBinding5 == null || (advRecyclerView = mViewBinding5.f72239b) == null) {
            return;
        }
        advRecyclerView.addOnScrollListener(new C18070d());
    }

    private final void initViewModel() {
        RoomViewModel roomViewModel = (RoomViewModel) new C3227v0(this).m14969a(RoomViewModel.class);
        roomViewModel.m77461x().m14851j(this, new C18072f(new Function1() { // from class: com.transsion.room.fragment.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomFragment.m76905o0(this.f59275a, (RoomBean) obj);
            }
        }));
        this.mRoomViewModel = roomViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m76900j0(RoomFragment roomFragment) {
        roomFragment.loadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m76901k0(RoomFragment roomFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        roomFragment.m76906p0(adapter.getItem(i11), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m76902l0(RoomFragment roomFragment) {
        roomFragment.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        List<Object> data;
        SwipeRefreshLayout swipeRefreshLayout;
        C23651m mViewBinding;
        SwipeRefreshLayout swipeRefreshLayout2;
        this.isRefresh = true;
        this.mHotRoomPage = "";
        this.mPersonalRoomPage = "";
        if (C27287m.f83003a.m106330e()) {
            RoomViewModel roomViewModel = this.mRoomViewModel;
            if (roomViewModel != null) {
                roomViewModel.m77460w(this.mHotRoomPage, this.mPerPage);
                return;
            }
            return;
        }
        C28951b.f88586a.m111454d(R$string.no_network_tips);
        C23651m mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (swipeRefreshLayout = mViewBinding2.f72240c) != null && swipeRefreshLayout.isRefreshing() && (mViewBinding = getMViewBinding()) != null && (swipeRefreshLayout2 = mViewBinding.f72240c) != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        C18039d c18039d = this.mHotAdapter;
        if (c18039d == null || (data = c18039d.getData()) == null || !data.isEmpty()) {
            return;
        }
        m76908s0();
    }

    private final void loadMore() {
        C27941f c27941fM36186h0;
        if (C27287m.f83003a.m106330e()) {
            RoomViewModel roomViewModel = this.mRoomViewModel;
            if (roomViewModel != null) {
                roomViewModel.m77460w(this.mHotRoomPage, this.mPerPage);
                return;
            }
            return;
        }
        C28951b.f88586a.m111454d(R$string.no_network_tips);
        C18039d c18039d = this.mHotAdapter;
        if (c18039d == null || (c27941fM36186h0 = c18039d.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: renamed from: m0 */
    private final void m76903m0() {
        TitleLayout titleLayout;
        C23651m mViewBinding = getMViewBinding();
        if (mViewBinding == null || (titleLayout = mViewBinding.f72241d) == null) {
            return;
        }
        titleLayout.setTitleText(com.transsion.room.R$string.str_hot_room);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m76904n0(ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        it.getResultCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final Unit m76905o0(RoomFragment roomFragment, RoomBean roomBean) {
        C27941f c27941fM36186h0;
        roomFragment.hideLoading();
        if (roomBean == null) {
            C18039d c18039d = roomFragment.mHotAdapter;
            if (c18039d != null && (c27941fM36186h0 = c18039d.m36186h0()) != null) {
                c27941fM36186h0.m108669v();
            }
        } else {
            roomFragment.m76910u0(roomBean);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p0 */
    private final void m76906p0(Object item, int position) {
        if (item instanceof RoomItem) {
            Intent intent = new Intent(requireActivity(), (Class<?>) RoomDetailActivity.class);
            intent.putExtra(WebConstants.FIELD_ITEM, (Parcelable) item);
            AbstractC0249b abstractC0249b = this.requestRoomDetailLaunch;
            if (abstractC0249b != null) {
                abstractC0249b.m999a(intent);
            }
            HashMap map = new HashMap();
            String groupId = ((RoomItem) item).getGroupId();
            if (groupId == null) {
                groupId = "";
            }
            map.put("group_id", groupId);
            map.put("sequence", String.valueOf(position));
            C14450a.f50860a.m65139b("rooms", map);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m76907q0() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new RoomFragment$observerPublishEvent$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m76908s0() {
        AdvRecyclerView advRecyclerView;
        C23651m mViewBinding = getMViewBinding();
        if (mViewBinding == null || (advRecyclerView = mViewBinding.f72239b) == null) {
            return;
        }
        advRecyclerView.showError();
    }

    /* JADX INFO: renamed from: t0 */
    private final void m76909t0() {
        AdvRecyclerView advRecyclerView;
        C23651m mViewBinding = getMViewBinding();
        if (mViewBinding == null || (advRecyclerView = mViewBinding.f72239b) == null) {
            return;
        }
        advRecyclerView.showEmpty();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m76910u0(RoomBean roomBean) {
        String nextPage;
        C18039d c18039d;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C18039d c18039d2;
        C27941f c27941fM36186h2;
        C18039d c18039d3;
        SwipeRefreshLayout swipeRefreshLayout;
        C23651m mViewBinding;
        SwipeRefreshLayout swipeRefreshLayout2;
        Pager pager = roomBean.getPager();
        if (pager == null || (nextPage = pager.getNextPage()) == null) {
            nextPage = "";
        }
        this.mHotRoomPage = nextPage;
        m76912r0();
        if (this.isRefresh) {
            this.isRefresh = false;
            C23651m mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (swipeRefreshLayout = mViewBinding2.f72240c) != null && swipeRefreshLayout.isRefreshing() && (mViewBinding = getMViewBinding()) != null && (swipeRefreshLayout2 = mViewBinding.f72240c) != null) {
                swipeRefreshLayout2.setRefreshing(false);
            }
            List<RoomItem> items = roomBean.getItems();
            if (items != null && (c18039d3 = this.mHotAdapter) != null) {
                c18039d3.mo36201n1(items);
            }
            List<RoomItem> items2 = roomBean.getItems();
            if (items2 == null || !items2.isEmpty()) {
                return;
            }
            m76909t0();
            return;
        }
        List<RoomItem> items3 = roomBean.getItems();
        if (items3 != null) {
            C18039d c18039d4 = this.mHotAdapter;
            List<Object> data = c18039d4 != null ? c18039d4.getData() : null;
            ArrayList arrayList = new ArrayList();
            if (data == null || !(!data.isEmpty())) {
                arrayList.addAll(items3);
            } else {
                for (RoomItem roomItem : items3) {
                    if (data.contains(roomItem)) {
                        C26866a.a.m104898f(C26866a.f81698a, PlaceTypes.ROOM, "find same item name..." + roomItem.getName(), false, 4, null);
                    } else {
                        arrayList.add(roomItem);
                    }
                }
            }
            C18039d c18039d5 = this.mHotAdapter;
            if (c18039d5 != null) {
                c18039d5.mo36208q(arrayList);
            }
        }
        C18039d c18039d6 = this.mHotAdapter;
        if (c18039d6 != null && (c27941fM36186h1 = c18039d6.m36186h0()) != null && c27941fM36186h1.m108666r() && (c18039d2 = this.mHotAdapter) != null && (c27941fM36186h2 = c18039d2.m36186h0()) != null) {
            c27941fM36186h2.m108667s();
        }
        Pager pager2 = roomBean.getPager();
        if (!(pager2 != null ? Intrinsics.m97797c(pager2.getHasMore(), Boolean.FALSE) : false) || (c18039d = this.mHotAdapter) == null || (c27941fM36186h0 = c18039d.m36186h0()) == null) {
            return;
        }
        C27941f.m108652u(c27941fM36186h0, false, 1, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C23651m getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23651m c23651mM93554c = C23651m.m93554c(inflater);
        Intrinsics.m97801g(c23651mM93554c, "inflate(...)");
        return c23651mM93554c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        AbstractC26006c.m102052e(view);
        m76903m0();
        m76899i0();
        initViewModel();
        setNetListener(new C18071e());
        this.requestRoomDetailLaunch = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.room.fragment.j0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                RoomFragment.m76904n0((ActivityResult) obj);
            }
        });
        m76907q0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        startLoading();
        loadData();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b("rooms", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC0249b abstractC0249b = this.requestRoomDetailLaunch;
        if (abstractC0249b != null) {
            abstractC0249b.mo992c();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m76912r0() {
        AdvRecyclerView advRecyclerView;
        C23651m mViewBinding = getMViewBinding();
        if (mViewBinding != null && (advRecyclerView = mViewBinding.f72239b) != null) {
            advRecyclerView.showData();
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        AdvRecyclerView advRecyclerView;
        C23651m mViewBinding = getMViewBinding();
        if (mViewBinding == null || (advRecyclerView = mViewBinding.f72239b) == null) {
            return;
        }
        advRecyclerView.showProgress();
    }
}
