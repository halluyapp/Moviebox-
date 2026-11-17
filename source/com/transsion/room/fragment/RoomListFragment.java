package com.transsion.room.fragment;

import android.location.Address;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cf.C5088c;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.adapter.RoomListAdapter;
import com.transsion.room.adapter.RoomListFrom;
import com.transsion.room.api.bean.LocationPlace;
import com.transsion.room.helper.C18182e;
import com.transsion.room.helper.LocationPlaceHelper;
import com.transsion.room.viewmodel.RoomViewModel;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.JoinRoomEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23656r;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import p743rh.C27287m;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0018\u00103\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomListFragment;", "Lcom/transsion/room/fragment/RoomListBaseFragment;", "<init>", "()V", "", "checkGPS", "W0", "addLocationHeaderView", "requestLocationPermission", "getCurrentLocation", "removeLocationHeaderView", "removeEmptyView", "c1", "initListener", "initViewData", "initViewModel", "lazyLoadData", "checkToShowEmptyView", "Lcom/transsion/room/adapter/RoomListFrom;", "w0", "()Lcom/transsion/room/adapter/RoomListFrom;", "", "isRefresh", "E0", "(Z)V", "hidden", "onHiddenChanged", "", "pageName", "()Ljava/lang/String;", "", "n", "Ljava/lang/Integer;", "mCid", "", "o", "Ljava/lang/Double;", "mLat", TtmlNode.TAG_P, "mLon", "Landroid/location/Address;", CampaignEx.JSON_KEY_AD_Q, "Landroid/location/Address;", "mAddress", "Landroid/view/View;", CampaignEx.JSON_KEY_AD_R, "Landroid/view/View;", "locationPermissionHeaderView", "s", "mEmptyView", "t", "mNoNetView", "Lcom/transsion/room/helper/e;", TmcStartParams.KEY_URL_SHORT, "Lkotlin/Lazy;", "Z0", "()Lcom/transsion/room/helper/e;", "mGpsServiceHelper", "v", "a", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomListFragment extends RoomListBaseFragment {

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private Integer mCid;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private Double mLat;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Double mLon;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Address mAddress;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private View locationPermissionHeaderView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private View mEmptyView;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private View mNoNetView;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Lazy mGpsServiceHelper = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.fragment.q1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomListFragment.m77025b1(this.f59285a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RoomListFragment m77029a(Integer num, boolean z11) {
            RoomListFragment roomListFragment = new RoomListFragment();
            roomListFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("id", num), TuplesKt.m97108a("is_select_room", Boolean.valueOf(z11))));
            return roomListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomListFragment$b */
    static final class C18083b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59215a;

        C18083b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59215a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59215a;
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
            this.f59215a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m77017T0(RoomListFragment roomListFragment, View view) {
        roomListFragment.requestLocationPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public static final Unit m77018U0(final RoomListFragment roomListFragment, boolean z11) {
        SwipeRefreshLayout root;
        C26866a.a.m104898f(C26866a.f81698a, "RoomLocation", "openGPS result:" + z11, false, 4, null);
        C23656r c23656r = (C23656r) roomListFragment.getMViewBinding();
        if (c23656r != null && (root = c23656r.getRoot()) != null) {
            root.post(new Runnable() { // from class: com.transsion.room.fragment.u1
                @Override // java.lang.Runnable
                public final void run() {
                    RoomListFragment.m77019V0(this.f59297a);
                }
            });
        }
        roomListFragment.showLoadingView();
        RoomListBaseFragment.m76984F0(roomListFragment, false, 1, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m77019V0(RoomListFragment roomListFragment) {
        roomListFragment.m77020W0();
    }

    /* JADX INFO: renamed from: W0 */
    private final void m77020W0() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (C5088c.f17563a.m23821f(activity, "android.permission.ACCESS_FINE_LOCATION")) {
            getCurrentLocation();
            return;
        }
        C14496b c14496b = C14496b.f50966a;
        if (c14496b.m65344b().getBoolean("key_list_lo_per_requested", false)) {
            addLocationHeaderView();
        } else {
            c14496b.m65344b().putBoolean("key_list_lo_per_requested", true);
            requestLocationPermission();
        }
        showLoadingView();
        RoomListBaseFragment.m76984F0(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m77021X0(RoomListFragment roomListFragment, View view) {
        RoomListAdapter mAdapter = roomListFragment.getMAdapter();
        if (mAdapter != null) {
            BaseQuickAdapter.m36130y(mAdapter, view, 1, 0, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m77022Y0(RoomListFragment roomListFragment, LocationPlace locationPlace) {
        roomListFragment.mLat = locationPlace != null ? locationPlace.getLat() : null;
        roomListFragment.mLon = locationPlace != null ? locationPlace.getLon() : null;
        roomListFragment.mAddress = locationPlace != null ? locationPlace.getLocationAddress() : null;
        roomListFragment.showLoadingView();
        RoomListBaseFragment.m76984F0(roomListFragment, false, 1, null);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Z0 */
    private final C18182e m77023Z0() {
        return (C18182e) this.mGpsServiceHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m77024a1(RoomListFragment roomListFragment, RoomBean roomBean) {
        roomListFragment.removeEmptyView();
        roomListFragment.m77000J0(roomBean);
        return Unit.f75682a;
    }

    private final void addLocationHeaderView() {
        if (this.locationPermissionHeaderView == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_location_permission_header, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R$id.tv_allow)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.t1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomListFragment.m77017T0(this.f59294a, view);
                }
            });
            RoomListAdapter mAdapter = getMAdapter();
            if (mAdapter != null) {
                Intrinsics.m97799e(viewInflate);
                BaseQuickAdapter.m36130y(mAdapter, viewInflate, 0, 0, 4, null);
            }
            this.locationPermissionHeaderView = viewInflate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C18182e m77025b1(RoomListFragment roomListFragment) {
        return new C18182e(roomListFragment);
    }

    /* JADX INFO: renamed from: c1 */
    private final void m77026c1() {
        Function1 function1 = new Function1() { // from class: com.transsion.room.fragment.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomListFragment.m77027d1(this.f59279a, (JoinRoomEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = JoinRoomEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    private final void checkGPS() {
        if (m77023Z0().mo77089b()) {
            C26866a.a.m104898f(C26866a.f81698a, "RoomLocation", "GPS is open, checkPermission", false, 4, null);
            m77020W0();
        } else if (getActivity() != null) {
            C14496b c14496b = C14496b.f50966a;
            if (c14496b.m65344b().getBoolean("key_list_lo_per_requested", false)) {
                addLocationHeaderView();
            } else {
                c14496b.m65344b().putBoolean("key_list_lo_per_requested", true);
                m77023Z0().mo77088a(new Function1() { // from class: com.transsion.room.fragment.p1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RoomListFragment.m77018U0(this.f59282a, ((Boolean) obj).booleanValue());
                    }
                });
            }
            showLoadingView();
            RoomListBaseFragment.m76984F0(this, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final Unit m77027d1(RoomListFragment roomListFragment, JoinRoomEvent value) {
        RoomItem roomItem;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        RoomListAdapter mAdapter = roomListFragment.getMAdapter();
        int i11 = -1;
        if (mAdapter != null && (data = mAdapter.getData()) != null) {
            Iterator<Object> it = data.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.m97797c(value.getGroupId(), ((RoomItem) it.next()).getGroupId())) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 >= 0) {
            RoomListAdapter mAdapter2 = roomListFragment.getMAdapter();
            if (mAdapter2 != null && (roomItem = (RoomItem) mAdapter2.m36182f0(i11)) != null) {
                roomItem.setHasJoin(Boolean.valueOf(value.getJoin()));
            }
            RoomListAdapter mAdapter3 = roomListFragment.getMAdapter();
            if (mAdapter3 != null) {
                mAdapter3.notifyItemChanged(i11, Boolean.valueOf(value.getJoin()));
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m77028e1(RoomListFragment roomListFragment, boolean z11) {
        if (z11) {
            roomListFragment.removeLocationHeaderView();
            roomListFragment.getCurrentLocation();
        } else {
            roomListFragment.addLocationHeaderView();
        }
        return Unit.f75682a;
    }

    private final void getCurrentLocation() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        LocationPlaceHelper.f59312a.m77077n(activity, new Function1() { // from class: com.transsion.room.fragment.s1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomListFragment.m77022Y0(this.f59291a, (LocationPlace) obj);
            }
        });
    }

    private final void removeEmptyView() {
        View view = this.mNoNetView;
        if (view != null) {
            RoomListAdapter mAdapter = getMAdapter();
            if (mAdapter != null) {
                mAdapter.m36143J0(view);
            }
            this.mNoNetView = null;
        }
        View view2 = this.mEmptyView;
        if (view2 != null) {
            RoomListAdapter mAdapter2 = getMAdapter();
            if (mAdapter2 != null) {
                mAdapter2.m36143J0(view2);
            }
            this.mEmptyView = null;
        }
    }

    private final void removeLocationHeaderView() {
        View view = this.locationPermissionHeaderView;
        if (view != null) {
            RoomListAdapter mAdapter = getMAdapter();
            if (mAdapter != null) {
                mAdapter.m36143J0(view);
            }
            this.locationPermissionHeaderView = null;
        }
    }

    private final void requestLocationPermission() {
        FragmentActivity activity = getActivity();
        if (activity == null || !isAdded() || isDetached() || isRemoving()) {
            return;
        }
        LocationPlaceHelper.f59312a.m77079t(activity, false, new Function1() { // from class: com.transsion.room.fragment.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomListFragment.m77028e1(this.f59299a, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment
    /* JADX INFO: renamed from: E0 */
    public void mo76999E0(boolean isRefresh) {
        Integer num = this.mCid;
        if (num != null) {
            int iIntValue = num.intValue();
            RoomViewModel mViewModel = getMViewModel();
            if (mViewModel != null) {
                String mPage = getMPage();
                if (mPage == null) {
                    mPage = "1";
                }
                mViewModel.m77453F(isRefresh, iIntValue, mPage, getMPerPage(), this.mLat, this.mLon, this.mAddress);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.room.fragment.RoomListBaseFragment
    public void checkToShowEmptyView() {
        final View emptyView;
        SwipeRefreshLayout root;
        Integer num = this.mCid;
        if (num == null || num.intValue() != -2) {
            super.checkToShowEmptyView();
            return;
        }
        if (C27287m.f83003a.m106330e()) {
            emptyView = getEmptyView(false);
            this.mEmptyView = emptyView;
        } else {
            emptyView = getLocalNoNetworkView(false);
            this.mNoNetView = emptyView;
        }
        C23656r c23656r = (C23656r) getMViewBinding();
        if (c23656r == null || (root = c23656r.getRoot()) == null) {
            return;
        }
        root.post(new Runnable() { // from class: com.transsion.room.fragment.r1
            @Override // java.lang.Runnable
            public final void run() {
                RoomListFragment.m77021X0(this.f59288a, emptyView);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        m77026c1();
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("id", -1)) : null;
        this.mCid = numValueOf;
        if (numValueOf != null && numValueOf.intValue() == -2) {
            checkGPS();
        }
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        C3187b0 c3187b0M77457J;
        super.initViewModel();
        RoomViewModel mViewModel = getMViewModel();
        if (mViewModel == null || (c3187b0M77457J = mViewModel.m77457J()) == null) {
            return;
        }
        c3187b0M77457J.m14851j(this, new C18083b(new Function1() { // from class: com.transsion.room.fragment.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomListFragment.m77024a1(this.f59276a, (RoomBean) obj);
            }
        }));
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment, com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        Integer num = this.mCid;
        if (num != null && num.intValue() == -2) {
            return;
        }
        super.lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.LazyFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment
    public String pageName() {
        return "room_list";
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment
    /* JADX INFO: renamed from: w0 */
    public RoomListFrom mo77004w0() {
        return RoomListFrom.ROOM_LIST;
    }
}
