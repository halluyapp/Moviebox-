package com.transsion.shorttv_pugc.p317ui.fragment;

import android.content.Context;
import android.graphics.Rect;
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
import com.mbridge.msdk.playercommon.exoplayer2.extractor.p278ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv_pugc.base.fragment.BaseListFragment;
import com.transsion.shorttv_pugc.base.widget.BaseLoadMoreView;
import com.transsion.shorttv_pugc.base.widget.NpaLinearLayoutManager;
import com.transsion.shorttv_pugc.bean.Pager;
import com.transsion.shorttv_pugc.bean.ShortTVRespData;
import com.transsion.shorttv_pugc.bean.Subject;
import com.transsion.shorttv_pugc.p317ui.adapter.ShortTVTrendingAdapter;
import com.transsion.shorttv_pugc.p317ui.widget.ShortTVDiscoverHeaderView;
import com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gt.C23673b;
import gt.InterfaceC23672a;
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
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p849vt.C28224a;
import p990zt.C29244b;
import rs.C27330b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/fragment/ShortTVFavoriteFragment;", "Lcom/transsion/shorttv_pugc/base/fragment/BaseListFragment;", "Lcom/transsion/shorttv_pugc/bean/Subject;", "<init>", "()V", "", "L0", "subject", "", "isDownloadView", "X0", "(Lcom/transsion/shorttv_pugc/bean/Subject;Z)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "M0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "U0", "", "getPageName", "()Ljava/lang/String;", "onResume", "initViewData", "initListener", "m0", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "i0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "y0", "loadMore", "lazyLoadData", "getPageStateLayoutTitle", "initViewModel", "Q0", "retryLoadData", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "n", "Lkotlin/Lazy;", "S0", "()Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "mViewModel", "o", "Ljava/lang/String;", "mPageNum", "Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVTrendingAdapter;", TtmlNode.TAG_P, "Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVTrendingAdapter;", "R0", "()Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVTrendingAdapter;", "setListAdapter", "(Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVTrendingAdapter;)V", "listAdapter", "Lzt/b;", CampaignEx.JSON_KEY_AD_Q, "T0", "()Lzt/b;", "recReport", "Lgt/b;", CampaignEx.JSON_KEY_AD_R, "Lgt/b;", "exposureHelper", "s", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTVFavoriteFragment extends BaseListFragment<Subject> {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String mPageNum;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private ShortTVTrendingAdapter listAdapter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Lazy mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv_pugc.ui.fragment.ShortTVFavoriteFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv_pugc.ui.fragment.ShortTVFavoriteFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Lazy recReport = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.ui.fragment.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVFavoriteFragment.m81003Y0();
        }
    });

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C23673b exposureHelper = new C23673b(0.6f, new C19384d(), false, 4, null);

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVFavoriteFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTVFavoriteFragment m81006a() {
            return new ShortTVFavoriteFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVFavoriteFragment$b */
    public static final class C19382b extends RecyclerView.AbstractC4219r {
        C19382b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (i12 > 0) {
                ShortTVFavoriteFragment.this.m80993M0(recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVFavoriteFragment$c */
    public static final class C19383c extends DiffUtil.AbstractC4174e {
        C19383c() {
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

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVFavoriteFragment$d */
    public static final class C19384d implements InterfaceC23672a {
        C19384d() {
        }

        @Override // gt.InterfaceC23672a
        /* JADX INFO: renamed from: a */
        public void mo80863a(int i11, long j11, View view) {
            List<Object> data;
            List<Object> data2;
            ShortTVTrendingAdapter listAdapter = ShortTVFavoriteFragment.this.getListAdapter();
            if (((listAdapter == null || (data2 = listAdapter.getData()) == null) ? 0 : data2.size()) <= i11) {
                return;
            }
            ShortTVTrendingAdapter listAdapter2 = ShortTVFavoriteFragment.this.getListAdapter();
            Subject subject = (listAdapter2 == null || (data = listAdapter2.getData()) == null) ? null : (Subject) data.get(i11);
            if (subject != null) {
                ShortTVFavoriteFragment.this.m80998T0().m112128a(ShortTVFavoriteFragment.this.getPageName(), subject, i11, j11, ShortTVFavoriteFragment.this.m81004Q0());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVFavoriteFragment$e */
    public static final class C19385e extends RecyclerView.AbstractC4213l {
        C19385e() {
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

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShortTVFavoriteFragment$f */
    static final class C19386f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62145a;

        C19386f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62145a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62145a;
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
            this.f62145a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: L0 */
    private final void m80992L0() {
        RecyclerView recyclerView;
        C27330b c27330b = (C27330b) getMViewBinding();
        if (c27330b == null || (recyclerView = c27330b.f83078e) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C19382b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public final void m80993M0(RecyclerView recyclerView) {
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
    public static final void m80994N0(ShortTVFavoriteFragment shortTVFavoriteFragment) {
        shortTVFavoriteFragment.loadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m80995O0(ShortTVFavoriteFragment shortTVFavoriteFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTVFavoriteFragment.m80998T0().m112129b(shortTVFavoriteFragment.getPageName(), subject, i11, shortTVFavoriteFragment.m81004Q0());
            shortTVFavoriteFragment.m81002X0(subject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m80996P0(ShortTVFavoriteFragment shortTVFavoriteFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTVFavoriteFragment.m80998T0().m112129b(shortTVFavoriteFragment.getPageName(), subject, i11, shortTVFavoriteFragment.m81004Q0());
            shortTVFavoriteFragment.m81002X0(subject, true);
        }
    }

    /* JADX INFO: renamed from: S0 */
    private final ShortTvViewModel m80997S0() {
        return (ShortTvViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public final C29244b m80998T0() {
        return (C29244b) this.recReport.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    private final void m80999U0() {
        RecyclerView recyclerView;
        C27330b c27330b = (C27330b) getMViewBinding();
        if (c27330b == null || (recyclerView = c27330b.f83078e) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.listAdapter);
        recyclerView.addOnScrollListener(this.exposureHelper);
        m80992L0();
        recyclerView.addItemDecoration(new C19385e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m81000V0(ShortTVFavoriteFragment shortTVFavoriteFragment, View view) {
        FragmentActivity activity = shortTVFavoriteFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final Unit m81001W0(ShortTVFavoriteFragment shortTVFavoriteFragment, ShortTVRespData shortTVRespData) {
        Pager pager;
        List<Subject> items;
        if (shortTVRespData == null || (items = shortTVRespData.getItems()) == null) {
            shortTVFavoriteFragment.m80480C0();
        } else if (shortTVFavoriteFragment.m80490t0() || Intrinsics.m97797c(shortTVFavoriteFragment.mPageNum, "1")) {
            shortTVFavoriteFragment.m80495z0(false);
            if (items.isEmpty()) {
                BaseListFragment.m80473B0(shortTVFavoriteFragment, null, 1, null);
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
                shortTVFavoriteFragment.m80491u0();
            } else {
                BaseListFragment.m80478w0(shortTVFavoriteFragment, false, 1, null);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: X0 */
    private final void m81002X0(Subject subject, boolean isDownloadView) {
        Context context = getContext();
        if (context != null) {
            C28224a.f86828a.m109403a((FragmentActivity) context, getPageName(), subject.getOps(), (PsExtractor.AUDIO_STREAM & 8) != 0 ? null : "download_subject", (PsExtractor.AUDIO_STREAM & 16) != 0 ? false : isDownloadView, (PsExtractor.AUDIO_STREAM & 32) != 0 ? null : subject, (PsExtractor.AUDIO_STREAM & 64) != 0 ? null : null, (PsExtractor.AUDIO_STREAM & 128) != 0 ? Boolean.FALSE : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C29244b m81003Y0() {
        return new C29244b();
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m81004Q0() {
        return "favorite";
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    public final ShortTVTrendingAdapter getListAdapter() {
        return this.listAdapter;
    }

    public final String getPageName() {
        return "minitv_favorite";
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        String string;
        Context context = getContext();
        return (context == null || (string = context.getString(R$string.short_tv_my_list)) == null) ? "" : string;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.BaseListFragment
    /* JADX INFO: renamed from: i0 */
    public BaseQuickAdapter mo80481i0() {
        ShortTVTrendingAdapter shortTVTrendingAdapter = new ShortTVTrendingAdapter(getPageName(), true);
        shortTVTrendingAdapter.m36186h0().m108655C(new BaseLoadMoreView());
        shortTVTrendingAdapter.m36186h0().m108673z(true);
        shortTVTrendingAdapter.m36186h0().m108672y(true);
        shortTVTrendingAdapter.m36186h0().m108657E(3);
        shortTVTrendingAdapter.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.shorttv_pugc.ui.fragment.q
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ShortTVFavoriteFragment.m80994N0(this.f62283a);
            }
        });
        shortTVTrendingAdapter.m36158R0(new C19383c());
        shortTVTrendingAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv_pugc.ui.fragment.r
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVFavoriteFragment.m80995O0(this.f62284a, baseQuickAdapter, view, i11);
            }
        });
        shortTVTrendingAdapter.m36193l(R$id.btn_download);
        shortTVTrendingAdapter.m36216s1(new InterfaceC27564b() { // from class: com.transsion.shorttv_pugc.ui.fragment.s
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVFavoriteFragment.m80996P0(this.f62285a, baseQuickAdapter, view, i11);
            }
        });
        this.listAdapter = shortTVTrendingAdapter;
        return shortTVTrendingAdapter;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.BaseListFragment, com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        super.initListener();
        C27330b c27330b = (C27330b) getMViewBinding();
        if (c27330b == null || (appCompatImageView = c27330b.f83076c) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVFavoriteFragment.m81000V0(this.f62281a, view);
            }
        });
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.BaseListFragment, com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        m80999U0();
        m80495z0(true);
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewModel() {
        m80997S0().m81435x().m14851j(this, new C19386f(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTVFavoriteFragment.m81001W0(this.f62282a, (ShortTVRespData) obj);
            }
        }));
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.LazyFragment
    public void lazyLoadData() {
        Intrinsics.m97797c(this.mPageNum, "1");
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.BaseListFragment
    public void loadMore() {
        lazyLoadData();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.BaseListFragment
    /* JADX INFO: renamed from: m0 */
    public String mo80485m0() {
        String string;
        Context context = getContext();
        return (context == null || (string = context.getString(R$string.short_tv_my_list)) == null) ? "" : string;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.LazyFragment, com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mo80494y0();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void retryLoadData() {
        lazyLoadData();
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.BaseListFragment
    /* JADX INFO: renamed from: y0 */
    public void mo80494y0() {
        m80495z0(true);
        this.mPageNum = "1";
        lazyLoadData();
    }
}
