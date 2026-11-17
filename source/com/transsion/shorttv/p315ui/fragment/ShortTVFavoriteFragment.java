package com.transsion.shorttv.p315ui.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.base.fragment.BaseListFragment;
import com.transsion.shorttv.base.widget.BaseLoadMoreView;
import com.transsion.shorttv.base.widget.NpaLinearLayoutManager;
import com.transsion.shorttv.bean.Pager;
import com.transsion.shorttv.bean.ShortTVRespData;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.adapter.ShortTVTrendingAdapter;
import com.transsion.shorttv.p315ui.widget.ShortTVDiscoverHeaderView;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p330cs.C22776b;
import p330cs.InterfaceC22775a;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p919xs.C28653a;
import rs.C27358p;
import ss.C27644a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u001d\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u0013J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004R\u0018\u0010)\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, m97100d2 = {"Lcom/transsion/shorttv/ui/fragment/ShortTVFavoriteFragment;", "Lcom/transsion/shorttv/base/fragment/BaseListFragment;", "Lcom/transsion/shorttv/bean/Subject;", "<init>", "()V", "", "L0", "subject", "", "isDownloadView", "X0", "(Lcom/transsion/shorttv/bean/Subject;Z)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "M0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "U0", "", "getPageName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "initViewData", "initListener", "m0", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "i0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "y0", "loadMore", "lazyLoadData", "getPageStateLayoutTitle", "initViewModel", "Q0", "retryLoadData", "n", "Ljava/lang/String;", "ops", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "o", "Lkotlin/Lazy;", "S0", "()Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "mViewModel", TtmlNode.TAG_P, "mPageNum", "Lcom/transsion/shorttv/ui/adapter/ShortTVTrendingAdapter;", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/shorttv/ui/adapter/ShortTVTrendingAdapter;", "R0", "()Lcom/transsion/shorttv/ui/adapter/ShortTVTrendingAdapter;", "setListAdapter", "(Lcom/transsion/shorttv/ui/adapter/ShortTVTrendingAdapter;)V", "listAdapter", "Lxs/a;", CampaignEx.JSON_KEY_AD_R, "T0", "()Lxs/a;", "recReport", "Lcs/b;", "s", "Lcs/b;", "exposureHelper", "t", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTVFavoriteFragment extends BaseListFragment<Subject> {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String mPageNum;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private ShortTVTrendingAdapter listAdapter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Lazy mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv.ui.fragment.ShortTVFavoriteFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv.ui.fragment.ShortTVFavoriteFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Lazy recReport = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.ui.fragment.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVFavoriteFragment.m79835Y0();
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C22776b exposureHelper = new C22776b(0.6f, new C18993d(), false, 4, null);

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVFavoriteFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTVFavoriteFragment m79838a() {
            return new ShortTVFavoriteFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVFavoriteFragment$b */
    public static final class C18991b extends RecyclerView.AbstractC4219r {
        C18991b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (i12 > 0) {
                ShortTVFavoriteFragment.this.m79825M0(recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVFavoriteFragment$c */
    public static final class C18992c extends DiffUtil.AbstractC4174e {
        C18992c() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(Subject oldItem, Subject newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getSubjectId(), newItem.getSubjectId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(Subject oldItem, Subject newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return oldItem.hashCode() == newItem.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVFavoriteFragment$d */
    public static final class C18993d implements InterfaceC22775a {
        C18993d() {
        }

        @Override // p330cs.InterfaceC22775a
        /* JADX INFO: renamed from: a */
        public void mo78681a(int i11, long j11, View view) {
            List<Object> data;
            List<Object> data2;
            ShortTVTrendingAdapter listAdapter = ShortTVFavoriteFragment.this.getListAdapter();
            if (((listAdapter == null || (data2 = listAdapter.getData()) == null) ? 0 : data2.size()) <= i11) {
                return;
            }
            ShortTVTrendingAdapter listAdapter2 = ShortTVFavoriteFragment.this.getListAdapter();
            Subject subject = (listAdapter2 == null || (data = listAdapter2.getData()) == null) ? null : (Subject) data.get(i11);
            if (subject != null) {
                ShortTVFavoriteFragment.this.m79830T0().m110418a(ShortTVFavoriteFragment.this.getPageName(), subject, i11, Long.valueOf(j11), ShortTVFavoriteFragment.this.m79836Q0());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVFavoriteFragment$e */
    public static final class C18994e extends RecyclerView.AbstractC4213l {
        C18994e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            if (parent.getAdapter() != null) {
                outRect.top = AbstractC5776a0.m27313a(16.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTVFavoriteFragment$f */
    static final class C18995f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f61165a;

        C18995f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f61165a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f61165a;
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
            this.f61165a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: L0 */
    private final void m79824L0() {
        RecyclerView recyclerView;
        C27358p c27358p = (C27358p) getMViewBinding();
        if (c27358p == null || (recyclerView = c27358p.f83288e) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C18991b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public final void m79825M0(RecyclerView recyclerView) {
        ShortTVTrendingAdapter shortTVTrendingAdapter;
        LinearLayout linearLayoutM36172Z;
        RecyclerView.AbstractC4214m layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() != 0 || (shortTVTrendingAdapter = this.listAdapter) == null || (linearLayoutM36172Z = shortTVTrendingAdapter.m36172Z()) == null) {
            return;
        }
        int childCount = linearLayoutM36172Z.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutM36172Z.getChildAt(i11);
            if ((childAt instanceof ShortTVDiscoverHeaderView) && childAt.getVisibility() == 0) {
                ((ShortTVDiscoverHeaderView) childAt).clearExposureCache();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m79826N0(ShortTVFavoriteFragment shortTVFavoriteFragment) {
        shortTVFavoriteFragment.loadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m79827O0(ShortTVFavoriteFragment shortTVFavoriteFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTVFavoriteFragment.m79830T0().m110419c(shortTVFavoriteFragment.getPageName(), subject, i11, shortTVFavoriteFragment.m79836Q0());
            shortTVFavoriteFragment.m79834X0(subject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m79828P0(ShortTVFavoriteFragment shortTVFavoriteFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTVFavoriteFragment.m79830T0().m110419c(shortTVFavoriteFragment.getPageName(), subject, i11, shortTVFavoriteFragment.m79836Q0());
            shortTVFavoriteFragment.m79834X0(subject, true);
        }
    }

    /* JADX INFO: renamed from: S0 */
    private final ShortTvViewModel m79829S0() {
        return (ShortTvViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public final C28653a m79830T0() {
        return (C28653a) this.recReport.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    private final void m79831U0() {
        RecyclerView recyclerView;
        C27358p c27358p = (C27358p) getMViewBinding();
        if (c27358p == null || (recyclerView = c27358p.f83288e) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.listAdapter);
        recyclerView.addOnScrollListener(this.exposureHelper);
        m79824L0();
        recyclerView.addItemDecoration(new C18994e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m79832V0(ShortTVFavoriteFragment shortTVFavoriteFragment, View view) {
        FragmentActivity activity = shortTVFavoriteFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final Unit m79833W0(ShortTVFavoriteFragment shortTVFavoriteFragment, ShortTVRespData shortTVRespData) {
        Pager pager;
        List<Subject> items;
        if (shortTVRespData == null || (items = shortTVRespData.getItems()) == null) {
            shortTVFavoriteFragment.m79045C0();
        } else if (shortTVFavoriteFragment.m79055t0() || Intrinsics.m97797c(shortTVFavoriteFragment.mPageNum, "1")) {
            shortTVFavoriteFragment.m79060z0(false);
            if (items.isEmpty()) {
                BaseListFragment.m79038B0(shortTVFavoriteFragment, null, 1, null);
            } else {
                BaseQuickAdapter mBaseAdapter = shortTVFavoriteFragment.getMBaseAdapter();
                if (mBaseAdapter != null) {
                    mBaseAdapter.mo36201n1(items);
                }
            }
        } else {
            BaseQuickAdapter mBaseAdapter2 = shortTVFavoriteFragment.getMBaseAdapter();
            if (mBaseAdapter2 != null) {
                mBaseAdapter2.mo36208q(items);
            }
        }
        if (shortTVRespData != null && (pager = shortTVRespData.getPager()) != null) {
            if (Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE)) {
                shortTVFavoriteFragment.mPageNum = pager.getNextPage();
                shortTVFavoriteFragment.m79056u0();
            } else {
                BaseListFragment.m79043w0(shortTVFavoriteFragment, false, 1, null);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: X0 */
    private final void m79834X0(Subject subject, boolean isDownloadView) {
        Context context = getContext();
        if (context != null) {
            C27644a.f84793a.m107539a((FragmentActivity) context, getPageName(), subject.getOps(), (64 & 8) != 0 ? null : "download_subject", (64 & 16) != 0 ? false : isDownloadView, (64 & 32) != 0 ? null : subject, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? Boolean.FALSE : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C28653a m79835Y0() {
        return new C28653a();
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m79836Q0() {
        return "favorite";
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    public final ShortTVTrendingAdapter getListAdapter() {
        return this.listAdapter;
    }

    public final String getPageName() {
        return "minitv_favorite";
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        String string;
        Context context = getContext();
        return (context == null || (string = context.getString(R$string.short_tv_my_list)) == null) ? "" : string;
    }

    @Override // com.transsion.shorttv.base.fragment.BaseListFragment
    /* JADX INFO: renamed from: i0 */
    public BaseQuickAdapter mo79046i0() {
        ShortTVTrendingAdapter shortTVTrendingAdapter = new ShortTVTrendingAdapter(getPageName(), true);
        shortTVTrendingAdapter.m36186h0().m108655C(new BaseLoadMoreView());
        shortTVTrendingAdapter.m36186h0().m108673z(true);
        shortTVTrendingAdapter.m36186h0().m108672y(true);
        shortTVTrendingAdapter.m36186h0().m108657E(3);
        shortTVTrendingAdapter.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.shorttv.ui.fragment.u
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ShortTVFavoriteFragment.m79826N0(this.f61329a);
            }
        });
        shortTVTrendingAdapter.m36158R0(new C18992c());
        shortTVTrendingAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv.ui.fragment.v
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVFavoriteFragment.m79827O0(this.f61330a, baseQuickAdapter, view, i11);
            }
        });
        shortTVTrendingAdapter.m36193l(R$id.btn_download);
        shortTVTrendingAdapter.m36216s1(new InterfaceC27564b() { // from class: com.transsion.shorttv.ui.fragment.w
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVFavoriteFragment.m79828P0(this.f61331a, baseQuickAdapter, view, i11);
            }
        });
        this.listAdapter = shortTVTrendingAdapter;
        return shortTVTrendingAdapter;
    }

    @Override // com.transsion.shorttv.base.fragment.BaseListFragment, com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        super.initListener();
        C27358p c27358p = (C27358p) getMViewBinding();
        if (c27358p == null || (appCompatImageView = c27358p.f83286c) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.fragment.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVFavoriteFragment.m79832V0(this.f61332a, view);
            }
        });
    }

    @Override // com.transsion.shorttv.base.fragment.BaseListFragment, com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        m79831U0();
        m79060z0(true);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewModel() {
        m79829S0().m80373c0().m14851j(this, new C18995f(new Function1() { // from class: com.transsion.shorttv.ui.fragment.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTVFavoriteFragment.m79833W0(this.f61328a, (ShortTVRespData) obj);
            }
        }));
    }

    @Override // com.transsion.shorttv.base.fragment.LazyFragment
    public void lazyLoadData() {
        boolean zM97797c = Intrinsics.m97797c(this.mPageNum, "1");
        ShortTvViewModel shortTvViewModelM79829S0 = m79829S0();
        String str = this.mPageNum;
        shortTvViewModelM79829S0.m80389p0(str != null ? str : "1", 8, zM97797c, this.ops);
    }

    @Override // com.transsion.shorttv.base.fragment.BaseListFragment
    public void loadMore() {
        lazyLoadData();
    }

    @Override // com.transsion.shorttv.base.fragment.BaseListFragment
    /* JADX INFO: renamed from: m0 */
    public String mo79050m0() {
        String string;
        Context context = getContext();
        return (context == null || (string = context.getString(R$string.short_tv_my_list)) == null) ? "" : string;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.ops = arguments != null ? arguments.getString("ops") : null;
    }

    @Override // com.transsion.shorttv.base.fragment.LazyFragment, com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mo79059y0();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void retryLoadData() {
        lazyLoadData();
    }

    @Override // com.transsion.shorttv.base.fragment.BaseListFragment
    /* JADX INFO: renamed from: y0 */
    public void mo79059y0() {
        m79060z0(true);
        this.mPageNum = "1";
        lazyLoadData();
    }
}
