package com.transsion.member.history;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.BaseListFragment;
import com.transsion.member.R$string;
import com.transsion.member.adapter.C15780b;
import com.transsion.member.bean.Pager;
import com.transsion.member.bean.PointsHistoryData;
import com.transsion.member.bean.PointsHistoryItem;
import com.transsion.member.view.HistoryStateView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m97100d2 = {"Lcom/transsion/member/history/PointsHistoryFragment;", "Lcom/transsion/baseui/fragment/BaseListFragment;", "Lcom/transsion/member/bean/PointsHistoryItem;", "<init>", "()V", "", "s0", "()Ljava/lang/String;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "m0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "initViewData", "G0", "loadMore", "lazyLoadData", "getPageStateLayoutTitle", "initViewModel", "retryLoadData", "Landroid/view/View;", "q0", "()Landroid/view/View;", "Lcom/transsion/member/history/PointsHistoryViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "Q0", "()Lcom/transsion/member/history/PointsHistoryViewModel;", "mViewModel", "c", "Ljava/lang/String;", "mPageNum", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "hasMoreData", "e", "a", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PointsHistoryFragment extends BaseListFragment<PointsHistoryItem> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f54331f = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(PointsHistoryViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.member.history.PointsHistoryFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.member.history.PointsHistoryFragment$special$$inlined$activityViewModels$default$2
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
    private String mPageNum = "1";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean hasMoreData = true;

    /* JADX INFO: renamed from: com.transsion.member.history.PointsHistoryFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final PointsHistoryFragment m70078a() {
            return new PointsHistoryFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.history.PointsHistoryFragment$b */
    static final class C15843b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54335a;

        C15843b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54335a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54335a;
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
            this.f54335a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private final PointsHistoryViewModel m70075Q0() {
        return (PointsHistoryViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m70076R0(PointsHistoryFragment pointsHistoryFragment) {
        Navigator.m61845x(TheRouter.m61773c("/rewards/center"), pointsHistoryFragment.requireContext(), null, 2, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final Unit m70077S0(PointsHistoryFragment pointsHistoryFragment, PointsHistoryData pointsHistoryData) {
        Pager page;
        List<PointsHistoryItem> list;
        if (pointsHistoryData == null || (list = pointsHistoryData.getList()) == null) {
            pointsHistoryFragment.m65539N0();
        } else if (pointsHistoryFragment.m65529A0() || Intrinsics.m97797c(pointsHistoryFragment.mPageNum, "1")) {
            pointsHistoryFragment.m65536I0(false);
            if (list.isEmpty()) {
                BaseListFragment.m65523K0(pointsHistoryFragment, null, 1, null);
            } else {
                BaseQuickAdapter mBaseAdapter = pointsHistoryFragment.getMBaseAdapter();
                if (mBaseAdapter != null) {
                    mBaseAdapter.mo36201n1(list);
                }
            }
        } else {
            BaseQuickAdapter mBaseAdapter2 = pointsHistoryFragment.getMBaseAdapter();
            if (mBaseAdapter2 != null) {
                mBaseAdapter2.mo36208q(list);
            }
        }
        if (pointsHistoryData != null && (page = pointsHistoryData.getPage()) != null) {
            if (!page.getHasMore() || Intrinsics.m97797c(pointsHistoryFragment.mPageNum, page.getNextPage())) {
                pointsHistoryFragment.hasMoreData = false;
                BaseListFragment.m65522D0(pointsHistoryFragment, false, 1, null);
            } else {
                pointsHistoryFragment.hasMoreData = true;
                pointsHistoryFragment.mPageNum = page.getNextPage();
                pointsHistoryFragment.m65530B0();
            }
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: G0 */
    public void mo65534G0() {
        m65536I0(true);
        this.mPageNum = "1";
        this.hasMoreData = true;
        lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        String string = getString(R$string.points_history_title);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        m65536I0(true);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m65548u0();
        m70075Q0().m70084e().m14851j(this, new C15843b(new Function1() { // from class: com.transsion.member.history.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PointsHistoryFragment.m70077S0(this.f54343a, (PointsHistoryData) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        if (this.hasMoreData) {
            PointsHistoryViewModel pointsHistoryViewModelM70075Q0 = m70075Q0();
            String str = this.mPageNum;
            if (str == null) {
                str = "1";
            }
            pointsHistoryViewModelM70075Q0.m70083d(str);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    public void loadMore() {
        String str = this.mPageNum;
        if (str == null || str.length() == 0 || Intrinsics.m97797c(this.mPageNum, "0")) {
            BaseListFragment.m65522D0(this, false, 1, null);
        } else {
            lazyLoadData();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: m0 */
    public BaseQuickAdapter mo65540m0() {
        return new C15780b(0, 1, null);
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: q0 */
    public View mo65544q0() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        HistoryStateView historyStateView = new HistoryStateView(contextRequireContext);
        String string = getString(R$string.points_history_empty);
        Intrinsics.m97801g(string, "getString(...)");
        historyStateView.showData(4, 1, false, "", string);
        String string2 = getString(R$string.points_history_earn);
        Intrinsics.m97801g(string2, "getString(...)");
        historyStateView.setReTryTxt(string2);
        historyStateView.retry(new Function0() { // from class: com.transsion.member.history.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PointsHistoryFragment.m70076R0(this.f54342a);
            }
        });
        return historyStateView;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: s0 */
    public String mo65546s0() {
        String string = getString(R$string.points_history_title);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }
}
