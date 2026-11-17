package com.transsion.room.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baseui.fragment.LazyFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.RoomFilter;
import com.transsion.moviedetailapi.bean.RoomFilterClasses;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.adapter.RoomFilterTabListAdapter;
import com.transsion.room.viewmodel.RoomViewModel;
import com.transsion.usercenter.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23654p;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomFilterListFragment;", "Lcom/transsion/baseui/fragment/LazyFragment;", "Lgq/p;", "<init>", "()V", "", "loadData", "checkToShowEmptyView", "Lcom/transsion/moviedetailapi/bean/RoomFilter;", "filter", "s0", "(Lcom/transsion/moviedetailapi/bean/RoomFilter;)V", "t0", "u0", "p0", "", BidResponsedEx.KEY_CID, "Landroidx/fragment/app/Fragment;", "m0", "(Ljava/lang/Integer;)Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "o0", "(Landroid/view/LayoutInflater;)Lgq/p;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "getEmptyDescText", "", "isAudioShowNoNetworkLayout", "()Z", "isMonitorNetworkState", "isShowPageStateLayoutTitle", "initViewData", "initViewModel", "initListener", "lazyLoadData", "retryLoadData", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/room/adapter/RoomFilterTabListAdapter;", "a", "Lcom/transsion/room/adapter/RoomFilterTabListAdapter;", "mAdapter", "Lcom/transsion/room/viewmodel/RoomViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "n0", "()Lcom/transsion/room/viewmodel/RoomViewModel;", "mViewModel", "c", "Ljava/lang/Integer;", "curSelectCid", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "isSelectRoom", "e", "Landroid/view/View;", "loadingView", "f", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomFilterListFragment extends LazyFragment<C23654p> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RoomFilterTabListAdapter mAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(RoomViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.room.fragment.RoomFilterListFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.room.fragment.RoomFilterListFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Integer curSelectCid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isSelectRoom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private View loadingView;

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomFilterListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RoomFilterListFragment m76891a(boolean z11) {
            RoomFilterListFragment roomFilterListFragment = new RoomFilterListFragment();
            roomFilterListFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("is_select_room", Boolean.valueOf(z11))));
            return roomFilterListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomFilterListFragment$b */
    static final class C18064b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59158a;

        C18064b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59158a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59158a;
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
            this.f59158a.invoke(obj);
        }
    }

    private final void checkToShowEmptyView() {
        if (C27287m.f83003a.m106330e()) {
            showEmptyView(false);
        } else {
            showLocalNoNetworkView(false);
        }
    }

    private final void loadData() {
        m76883n0().m77452E();
    }

    /* JADX INFO: renamed from: m0 */
    private final Fragment m76882m0(Integer cid) {
        return RoomListFragment.INSTANCE.m77029a(cid, this.isSelectRoom);
    }

    /* JADX INFO: renamed from: n0 */
    private final RoomViewModel m76883n0() {
        return (RoomViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    private final void m76884p0() {
        List listM14574y0 = getChildFragmentManager().m14574y0();
        Intrinsics.m97801g(listM14574y0, "getFragments(...)");
        Iterator it = listM14574y0.iterator();
        while (it.hasNext()) {
            getChildFragmentManager().m14557p().mo14676p((Fragment) it.next()).mo14673l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m76885q0(RoomFilterListFragment roomFilterListFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        Intrinsics.m97800f(item, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.RoomFilter");
        roomFilterListFragment.m76887s0((RoomFilter) item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public static final Unit m76886r0(RoomFilterListFragment roomFilterListFragment, RoomFilterClasses roomFilterClasses) {
        List<RoomFilter> classes;
        RecyclerView recyclerView;
        Integer cid;
        if (roomFilterClasses == null || (classes = roomFilterClasses.getClasses()) == null || classes.isEmpty()) {
            roomFilterListFragment.checkToShowEmptyView();
        } else {
            List<RoomFilter> classes2 = roomFilterClasses.getClasses();
            Intrinsics.m97799e(classes2);
            for (RoomFilter roomFilter : classes2) {
                Integer num = roomFilterListFragment.curSelectCid;
                if ((num != null && Intrinsics.m97797c(num, roomFilter.getCid())) || ((roomFilterClasses.getDefCid() != null && Intrinsics.m97797c(roomFilter.getCid(), roomFilterClasses.getDefCid())) || ((cid = roomFilter.getCid()) != null && cid.intValue() == -1))) {
                    roomFilter.setSelected(true);
                    roomFilterListFragment.curSelectCid = roomFilter.getCid();
                    roomFilterListFragment.m76889u0(roomFilter);
                    break;
                }
            }
            roomFilterListFragment.showContentView();
            C23654p c23654p = (C23654p) roomFilterListFragment.getMViewBinding();
            if (c23654p != null && (recyclerView = c23654p.f72290c) != null) {
                AbstractC26006c.m102058k(recyclerView);
            }
            RoomFilterTabListAdapter roomFilterTabListAdapter = roomFilterListFragment.mAdapter;
            if (roomFilterTabListAdapter != null) {
                roomFilterTabListAdapter.mo36201n1(roomFilterClasses.getClasses());
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m76887s0(RoomFilter filter) {
        if (Intrinsics.m97797c(this.curSelectCid, filter.getCid())) {
            return;
        }
        m76888t0(filter);
        this.curSelectCid = filter.getCid();
        m76889u0(filter);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m76888t0(RoomFilter filter) {
        int i11;
        List<Object> data;
        List<Object> data2;
        Object next;
        List<Object> data3;
        List<Object> data4;
        RoomFilterTabListAdapter roomFilterTabListAdapter = this.mAdapter;
        int i12 = -1;
        if (roomFilterTabListAdapter == null || (data4 = roomFilterTabListAdapter.getData()) == null) {
            i11 = -1;
            break;
        }
        Iterator<Object> it = data4.iterator();
        i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.m97797c(this.curSelectCid, ((RoomFilter) it.next()).getCid())) {
                break;
            } else {
                i11++;
            }
        }
        RoomFilterTabListAdapter roomFilterTabListAdapter2 = this.mAdapter;
        if (roomFilterTabListAdapter2 != null && (data3 = roomFilterTabListAdapter2.getData()) != null) {
            Iterator<Object> it2 = data3.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                if (Intrinsics.m97797c(filter.getCid(), ((RoomFilter) it2.next()).getCid())) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
        }
        Object obj = null;
        if (i11 >= 0) {
            RoomFilterTabListAdapter roomFilterTabListAdapter3 = this.mAdapter;
            if (roomFilterTabListAdapter3 != null && (data2 = roomFilterTabListAdapter3.getData()) != null) {
                Iterator<T> it3 = data2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!Intrinsics.m97797c(this.curSelectCid, ((RoomFilter) next).getCid()));
                RoomFilter roomFilter = (RoomFilter) next;
                if (roomFilter != null) {
                    roomFilter.setSelected(false);
                }
            }
            RoomFilterTabListAdapter roomFilterTabListAdapter4 = this.mAdapter;
            if (roomFilterTabListAdapter4 != null) {
                roomFilterTabListAdapter4.notifyItemChanged(i11, Boolean.FALSE);
            }
        }
        if (i12 >= 0) {
            RoomFilterTabListAdapter roomFilterTabListAdapter5 = this.mAdapter;
            if (roomFilterTabListAdapter5 != null && (data = roomFilterTabListAdapter5.getData()) != null) {
                for (Object obj2 : data) {
                    if (Intrinsics.m97797c(filter.getCid(), ((RoomFilter) obj2).getCid())) {
                        obj = obj2;
                        break;
                    }
                }
                RoomFilter roomFilter2 = (RoomFilter) obj;
                if (roomFilter2 != null) {
                    roomFilter2.setSelected(true);
                }
            }
            RoomFilterTabListAdapter roomFilterTabListAdapter6 = this.mAdapter;
            if (roomFilterTabListAdapter6 != null) {
                roomFilterTabListAdapter6.notifyItemChanged(i12, Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m76889u0(RoomFilter filter) {
        String str = filter.getTitle() + filter.getCid();
        C26866a.a.m104898f(C26866a.f81698a, "RoomFilter", "showFragment tag = " + str, false, 4, null);
        m76884p0();
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0(str);
        if (fragmentM14547k0 == null) {
            fragmentM14547k0 = m76882m0(filter.getCid());
        }
        if (fragmentM14547k0.isAdded()) {
            getChildFragmentManager().m14557p().mo14681y(fragmentM14547k0).mo14673l();
        } else {
            getChildFragmentManager().m14557p().m14806c(R$id.fl_container, fragmentM14547k0, str).mo14673l();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getEmptyDescText() {
        String string = getString(R$string.profile_not_content);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        if (this.loadingView == null) {
            this.loadingView = LayoutInflater.from(requireContext()).inflate(R$layout.layout_room_list_filter_loading, (ViewGroup) getFlStateView(), false);
        }
        return this.loadingView;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        RecyclerView recyclerView;
        Bundle arguments = getArguments();
        this.isSelectRoom = arguments != null ? arguments.getBoolean("is_select_room") : false;
        RoomFilterTabListAdapter roomFilterTabListAdapter = new RoomFilterTabListAdapter();
        roomFilterTabListAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.room.fragment.h0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RoomFilterListFragment.m76885q0(this.f59257a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = roomFilterTabListAdapter;
        C23654p c23654p = (C23654p) getMViewBinding();
        if (c23654p == null || (recyclerView = c23654p.f72290c) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.mAdapter);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m76883n0().m77456I().m14851j(this, new C18064b(new Function1() { // from class: com.transsion.room.fragment.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomFilterListFragment.m76886r0(this.f59259a, (RoomFilterClasses) obj);
            }
        }));
        if (C27287m.f83003a.m106330e()) {
            return;
        }
        showNoNetworkView(false);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        showLoadingView();
        loadData();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("room_list", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C23654p getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23654p c23654pM93566c = C23654p.m93566c(inflater);
        Intrinsics.m97801g(c23654pM93566c, "inflate(...)");
        return c23654pM93566c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        loadData();
    }
}
