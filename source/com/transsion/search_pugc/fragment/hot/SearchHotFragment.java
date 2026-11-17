package com.transsion.search_pugc.fragment.hot;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.GradientLinePagerIndicator;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$drawable;
import com.p282tn.lib.widget.dialog.TRDialog;
import com.p282tn.lib.widget.dialog.TRDialogListener;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.baseui.widget.CustomPagerTitleView;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.postdetail.shorttv.widget.ShortTVHistoryView;
import com.transsion.search.R$id;
import com.transsion.search.R$string;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.InterfaceC18543a;
import com.transsion.search_pugc.SearchManager;
import com.transsion.search_pugc.bean.HotRank;
import com.transsion.search_pugc.bean.HotWord;
import com.transsion.search_pugc.bean.UGCEveryoneSearchData;
import com.transsion.search_pugc.bean.UGCRankSearchData;
import com.transsion.search_pugc.bean.UGCSearchResultData;
import com.transsion.search_pugc.fragment.BaseSearchMainFragment;
import com.transsion.search_pugc.fragment.SearchSubjectFragment;
import com.transsion.search_pugc.fragment.hot.SearchHotFragment;
import com.transsion.search_pugc.fragment.hot.adapter.C18602a;
import com.transsion.search_pugc.fragment.hot.adapter.C18604c;
import com.transsion.search_pugc.fragment.hot.adapter.C18606e;
import com.transsion.search_pugc.fragment.result.SearchResultViewModel;
import com.transsion.search_pugc.p311ad.SearchHotAdHelper;
import com.transsion.search_pugc.widget.LinesFlexBoxLayoutManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k00.InterfaceC24549a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lr.C25674c;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p684pp.C26922o;
import p765s6.InterfaceC27564b;
import p881wq.C28429n;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002^_B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u001d\u0010\u0017\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u0005J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J!\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\u0005J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\u0005J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\u0005J\u0015\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u001d¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u0010\rJ\u0017\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b?\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001d0J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010LR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006`"}, m97100d2 = {"Lcom/transsion/search_pugc/fragment/hot/SearchHotFragment;", "Lcom/transsion/search_pugc/fragment/BaseSearchMainFragment;", "Lwq/n;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "<init>", "()V", "", "initViewModel", "initHistory", "loadHistoryData", "", "isExpand", "expandHistoryLine", "(Z)V", "showHistoryList", "", "Lcom/transsion/search_pugc/bean/HotWord;", "hotWords", "initHotWordWithData", "(Ljava/util/List;)V", "initEveryoneSearch", "Lcom/transsion/search_pugc/bean/HotRank;", "rankRanks", "initRankWithData", "initViewPager", "Landroid/content/Context;", "context", "", "index", "", "textStr", "Lm00/d;", "getIndicatorText", "(Landroid/content/Context;ILjava/lang/String;)Lm00/d;", "Lm00/c;", "getIndicatorView", "(Landroid/content/Context;)Lm00/c;", "clearTipsDialog", "Landroid/view/LayoutInflater;", "inflater", "getViewBinding", "(Landroid/view/LayoutInflater;)Lwq/n;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "lazyLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onConnected", "keyword", "addHistoryWord", "(Ljava/lang/String;)V", "hidden", "onHiddenChanged", "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "Lcom/transsion/search_pugc/fragment/hot/adapter/c;", "mSearchHistoryAdapter", "Lcom/transsion/search_pugc/fragment/hot/adapter/c;", "expand", "Z", "historyExpandLine", "I", "historyCollapseLine", "hotSearchWord", "Ljava/lang/String;", "", "mHistoryList", "Ljava/util/List;", "Lcom/transsion/search_pugc/fragment/hot/adapter/e;", "everyOneSearchAdapter", "Lcom/transsion/search_pugc/fragment/hot/adapter/e;", "rankList", "Llr/c;", "mSearchViewModel", "Llr/c;", "Lcom/transsion/search_pugc/ad/SearchHotAdHelper;", "adHelper", "Lcom/transsion/search_pugc/ad/SearchHotAdHelper;", "Lcom/transsion/search_pugc/g;", "searchReporter$delegate", "Lkotlin/Lazy;", "getSearchReporter", "()Lcom/transsion/search_pugc/g;", "searchReporter", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchHotFragment extends BaseSearchMainFragment<C28429n> implements TRDialogListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PAGE_NAME = "/ugc_search/search_manager";
    private C18606e everyOneSearchAdapter;
    private boolean expand;
    private String hotSearchWord;
    private C18604c mSearchHistoryAdapter;
    private C25674c mSearchViewModel;
    private int historyExpandLine = 2;
    private int historyCollapseLine = 1;
    private List<String> mHistoryList = new ArrayList();
    private List<HotRank> rankList = CollectionsKt.m97506l();
    private SearchHotAdHelper adHelper = new SearchHotAdHelper(AbstractC3226v.m14968a(this));

    /* JADX INFO: renamed from: searchReporter$delegate, reason: from kotlin metadata */
    private final Lazy searchReporter = LazyKt.m97097b(new Function0() { // from class: ir.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchHotFragment.searchReporter_delegate$lambda$0(this.f73720a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.SearchHotFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchHotFragment m78317a(String str) {
            SearchHotFragment searchHotFragment = new SearchHotFragment();
            searchHotFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("hot_search_word", str)));
            return searchHotFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.SearchHotFragment$b */
    public static final class C18594b implements ViewPager2.PageTransformer {

        /* JADX INFO: renamed from: a */
        private final int f60131a;

        public C18594b() {
            this(0, 1, null);
        }

        public C18594b(int i11) {
            this.f60131a = i11;
        }

        public /* synthetic */ C18594b(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? AbstractC23384a.m92908b(38) : i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
        public void transformPage(View page, float f11) {
            Intrinsics.m97802h(page, "page");
            if (f11 < -1.0f) {
                page.setTranslationX(0.0f);
                return;
            }
            if (f11 <= 0.0f) {
                page.setTranslationX(0.0f);
            } else if (f11 <= 1.0f) {
                page.setTranslationX(-(this.f60131a * f11));
            } else {
                page.setTranslationX(-(this.f60131a * (f11 - 1)));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.SearchHotFragment$c */
    public static final class C18595c extends AbstractViewOnClickListenerC14560f {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f60133f;

        C18595c(int i11) {
            this.f60133f = i11;
        }

        @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
        /* JADX INFO: renamed from: c */
        public void mo64493c(View view) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
        /* JADX INFO: renamed from: d */
        public void mo64494d(View view) {
            MagicIndicator magicIndicator;
            ViewPager2 viewPager2;
            C28429n c28429n = (C28429n) SearchHotFragment.this.getMViewBinding();
            if (c28429n != null && (viewPager2 = c28429n.f87239r) != null) {
                viewPager2.setCurrentItem(this.f60133f, false);
            }
            C28429n c28429n2 = (C28429n) SearchHotFragment.this.getMViewBinding();
            if (c28429n2 == null || (magicIndicator = c28429n2.f87236o) == null) {
                return;
            }
            magicIndicator.onPageScrolled(this.f60133f, 0.0f, 0);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.SearchHotFragment$d */
    public static final class C18596d extends AbstractC25775a {
        C18596d() {
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return SearchHotFragment.this.rankList.size();
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            return SearchHotFragment.this.getIndicatorView(context);
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, int i11) {
            String name;
            Intrinsics.m97802h(context, "context");
            HotRank hotRank = (HotRank) CollectionsKt.m97362l0(SearchHotFragment.this.rankList, i11);
            if (hotRank == null || (name = hotRank.getName()) == null) {
                name = "";
            }
            return SearchHotFragment.this.getIndicatorText(context, i11, name);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.SearchHotFragment$e */
    public static final class C18597e extends FragmentStateAdapter {
        C18597e() {
            super(SearchHotFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            return SearchRankPagerFragment.INSTANCE.m78322a((HotRank) SearchHotFragment.this.rankList.get(i11), i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return SearchHotFragment.this.rankList.size();
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.SearchHotFragment$f */
    public static final class C18598f extends ViewPager2.OnPageChangeCallback {
        C18598f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            MagicIndicator magicIndicator;
            super.onPageScrollStateChanged(i11);
            C28429n c28429n = (C28429n) SearchHotFragment.this.getMViewBinding();
            if (c28429n == null || (magicIndicator = c28429n.f87236o) == null) {
                return;
            }
            magicIndicator.onPageScrollStateChanged(i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            MagicIndicator magicIndicator;
            super.onPageScrolled(i11, f11, i12);
            C28429n c28429n = (C28429n) SearchHotFragment.this.getMViewBinding();
            if (c28429n == null || (magicIndicator = c28429n.f87236o) == null) {
                return;
            }
            magicIndicator.onPageScrolled(i11, f11, i12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            MagicIndicator magicIndicator;
            super.onPageSelected(i11);
            Fragment fragmentM14547k0 = SearchHotFragment.this.getChildFragmentManager().m14547k0("f" + i11);
            if (fragmentM14547k0 instanceof SearchRankPagerFragment) {
                ((SearchRankPagerFragment) fragmentM14547k0).m78321b0();
            }
            C28429n c28429n = (C28429n) SearchHotFragment.this.getMViewBinding();
            if (c28429n == null || (magicIndicator = c28429n.f87236o) == null) {
                return;
            }
            magicIndicator.onPageSelected(i11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.SearchHotFragment$g */
    public static final class C18599g implements InterfaceC18543a {
        C18599g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static final void m78319c(SearchHotFragment searchHotFragment, List list) {
            ConstraintLayout constraintLayout;
            searchHotFragment.mHistoryList = CollectionsKt.m97343U0(CollectionsKt.m97326D0(list));
            searchHotFragment.showHistoryList();
            C28429n c28429n = (C28429n) searchHotFragment.getMViewBinding();
            if (c28429n == null || (constraintLayout = c28429n.f87230i) == null) {
                return;
            }
            constraintLayout.setVisibility(!list.isEmpty() ? 0 : 8);
        }

        @Override // com.transsion.search_pugc.InterfaceC18543a
        /* JADX INFO: renamed from: a */
        public void mo78163a(final List list) {
            Intrinsics.m97802h(list, "list");
            FragmentActivity activity = SearchHotFragment.this.getActivity();
            if (activity != null) {
                final SearchHotFragment searchHotFragment = SearchHotFragment.this;
                activity.runOnUiThread(new Runnable() { // from class: ir.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchHotFragment.C18599g.m78319c(searchHotFragment, list);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.SearchHotFragment$h */
    static final class C18600h implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60138a;

        C18600h(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60138a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60138a;
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
            this.f60138a.invoke(obj);
        }
    }

    private final void clearTipsDialog() {
        try {
            TRDialog.C13786a c13786a = new TRDialog.C13786a();
            String string = getString(R$string.search_clear_title);
            Intrinsics.m97801g(string, "getString(...)");
            TRDialog.C13786a c13786aM62292k = c13786a.m62292k(string);
            String string2 = getString(R$string.search_clear_des);
            Intrinsics.m97801g(string2, "getString(...)");
            TRDialog.C13786a c13786aM62288g = c13786aM62292k.m62288g(string2);
            String string3 = getString(R$string.search_clear_cancel);
            Intrinsics.m97801g(string3, "getString(...)");
            TRDialog.C13786a c13786aM62286e = c13786aM62288g.m62286e(string3);
            String string4 = getString(R$string.search_clear_clear);
            Intrinsics.m97801g(string4, "getString(...)");
            c13786aM62286e.m62291j(string4).m62289h(R$drawable.libui_sub_btn2_normal).m62287f(this).m62282a().m62248d0(this, "clear_tips");
        } catch (Exception e11) {
            C26866a.a.m104899g(C26866a.f81698a, "e " + e11.getLocalizedMessage(), false, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NotifyDataSetChanged"})
    private final void expandHistoryLine(final boolean isExpand) {
        RecyclerView recyclerView;
        C28429n c28429n = (C28429n) getMViewBinding();
        if (c28429n == null || (recyclerView = c28429n.f87231j) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: ir.n
            @Override // java.lang.Runnable
            public final void run() {
                SearchHotFragment.expandHistoryLine$lambda$12(this.f73730a, isExpand);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void expandHistoryLine$lambda$12(final SearchHotFragment searchHotFragment, final boolean z11) {
        int iM78597n0;
        C28429n c28429n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C28429n c28429n2 = (C28429n) searchHotFragment.getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (c28429n2 == null || (recyclerView2 = c28429n2.f87231j) == null) ? null : recyclerView2.getLayoutManager();
        final LinesFlexBoxLayoutManager linesFlexBoxLayoutManager = layoutManager instanceof LinesFlexBoxLayoutManager ? (LinesFlexBoxLayoutManager) layoutManager : null;
        if (linesFlexBoxLayoutManager != null && (iM78597n0 = linesFlexBoxLayoutManager.m78597n0()) > 0) {
            linesFlexBoxLayoutManager.m78600q0(z11 ? searchHotFragment.historyExpandLine : searchHotFragment.historyCollapseLine);
            boolean z12 = z11 || iM78597n0 > searchHotFragment.historyCollapseLine;
            final int iM78598o0 = linesFlexBoxLayoutManager.m78598o0() - 1;
            C18604c c18604c = searchHotFragment.mSearchHistoryAdapter;
            if (c18604c != null) {
                c18604c.m78335Z1(z12, z11, iM78598o0);
            }
            C18604c c18604c2 = searchHotFragment.mSearchHistoryAdapter;
            if (c18604c2 != null) {
                c18604c2.notifyDataSetChanged();
            }
            if (!z12 || (c28429n = (C28429n) searchHotFragment.getMViewBinding()) == null || (recyclerView = c28429n.f87231j) == null) {
                return;
            }
            recyclerView.post(new Runnable() { // from class: ir.l
                @Override // java.lang.Runnable
                public final void run() {
                    SearchHotFragment.expandHistoryLine$lambda$12$lambda$11(linesFlexBoxLayoutManager, iM78598o0, searchHotFragment, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandHistoryLine$lambda$12$lambda$11(LinesFlexBoxLayoutManager linesFlexBoxLayoutManager, int i11, SearchHotFragment searchHotFragment, boolean z11) {
        C18604c c18604c;
        if (linesFlexBoxLayoutManager.getChildCount() <= i11 && (c18604c = searchHotFragment.mSearchHistoryAdapter) != null) {
            c18604c.m78335Z1(true, z11, i11 - 1);
        }
        C18604c c18604c2 = searchHotFragment.mSearchHistoryAdapter;
        if (c18604c2 != null) {
            c18604c2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC25778d getIndicatorText(Context context, int index, String textStr) {
        CustomPagerTitleView customPagerTitleView = new CustomPagerTitleView(context, 17, AbstractC5776a0.m27313a(10.0f));
        customPagerTitleView.setSelectTextSize(16.0f);
        customPagerTitleView.setText(textStr);
        customPagerTitleView.setOnClickListener(new C18595c(index));
        return customPagerTitleView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC25777c getIndicatorView(Context context) {
        GradientLinePagerIndicator gradientLinePagerIndicator = new GradientLinePagerIndicator(context);
        gradientLinePagerIndicator.setMode(1);
        gradientLinePagerIndicator.setLineHeight(AbstractC5776a0.m27313a(2.0f));
        gradientLinePagerIndicator.setLineWidth(AbstractC5776a0.m27313a(30.0f));
        gradientLinePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
        gradientLinePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
        int color = AbstractC2397b.getColor(context, R$color.white);
        gradientLinePagerIndicator.setColors(color, color, color);
        return gradientLinePagerIndicator;
    }

    private final C18670g getSearchReporter() {
        return (C18670g) this.searchReporter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initEveryoneSearch() {
        RecyclerView recyclerView;
        Bundle arguments = getArguments();
        this.hotSearchWord = arguments != null ? arguments.getString("hot_search_word") : null;
        C18606e c18606e = new C18606e(0, 1, null);
        c18606e.m36193l(R$id.tv_keyword);
        c18606e.m36216s1(new InterfaceC27564b() { // from class: ir.h
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SearchHotFragment.initEveryoneSearch$lambda$23$lambda$22(this.f73721a, baseQuickAdapter, view, i11);
            }
        });
        this.everyOneSearchAdapter = c18606e;
        C28429n c28429n = (C28429n) getMViewBinding();
        if (c28429n == null || (recyclerView = c28429n.f87225d) == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        LinesFlexBoxLayoutManager linesFlexBoxLayoutManager = new LinesFlexBoxLayoutManager(contextRequireContext);
        linesFlexBoxLayoutManager.m44837c0(0);
        linesFlexBoxLayoutManager.m44838d0(1);
        linesFlexBoxLayoutManager.m44839e0(0);
        linesFlexBoxLayoutManager.m78600q0(this.historyExpandLine);
        recyclerView.setLayoutManager(linesFlexBoxLayoutManager);
        recyclerView.setAdapter(this.everyOneSearchAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEveryoneSearch$lambda$23$lambda$22(final SearchHotFragment searchHotFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        C18606e c18606e;
        HotWord hotWord;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        Fragment parentFragment = searchHotFragment.getParentFragment();
        if (!(parentFragment instanceof SearchSubjectFragment) || (c18606e = searchHotFragment.everyOneSearchAdapter) == null || (hotWord = (HotWord) c18606e.getItem(i11)) == null) {
            return;
        }
        ((SearchSubjectFragment) parentFragment).m78292z0(hotWord.getWord(), "hot", new Function1() { // from class: ir.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchHotFragment.initEveryoneSearch$lambda$23$lambda$22$lambda$21$lambda$20(this.f73729a, (String) obj);
            }
        });
        searchHotFragment.getSearchReporter().m78496E("hot", hotWord.getWord());
        searchHotFragment.getSearchReporter().m78510r(hotWord.getWord(), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initEveryoneSearch$lambda$23$lambda$22$lambda$21$lambda$20(SearchHotFragment searchHotFragment, String it) {
        Intrinsics.m97802h(it, "it");
        C18604c c18604c = searchHotFragment.mSearchHistoryAdapter;
        if (c18604c != null) {
            c18604c.mo36205p(new C18602a(1, it));
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initHistory() {
        TextView textView;
        C28429n c28429n = (C28429n) getMViewBinding();
        if (c28429n != null && (textView = c28429n.f87241t) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: ir.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchHotFragment.initHistory$lambda$8(this.f73723a, view);
                }
            });
        }
        C18604c c18604c = new C18604c();
        this.mSearchHistoryAdapter = c18604c;
        c18604c.m36193l(R$id.search_history_text);
        C18604c c18604c2 = this.mSearchHistoryAdapter;
        if (c18604c2 != null) {
            c18604c2.m36216s1(new InterfaceC27564b() { // from class: ir.k
                @Override // p765s6.InterfaceC27564b
                /* JADX INFO: renamed from: a */
                public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    SearchHotFragment.initHistory$lambda$10(this.f73724a, baseQuickAdapter, view, i11);
                }
            });
        }
        loadHistoryData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHistory$lambda$10(final SearchHotFragment searchHotFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        C18604c c18604c;
        C18602a c18602a;
        String strM78323a;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        Fragment parentFragment = searchHotFragment.getParentFragment();
        if (!(parentFragment instanceof SearchSubjectFragment) || (c18604c = searchHotFragment.mSearchHistoryAdapter) == null || (c18602a = (C18602a) c18604c.getItem(i11)) == null || (strM78323a = c18602a.m78323a()) == null) {
            return;
        }
        ((SearchSubjectFragment) parentFragment).m78292z0(strM78323a, ShortTVHistoryView.TYPE_HISTORY, new Function1() { // from class: ir.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchHotFragment.initHistory$lambda$10$lambda$9(this.f73722a, (String) obj);
            }
        });
        searchHotFragment.getSearchReporter().m78508p(strM78323a, i11);
        searchHotFragment.getSearchReporter().m78496E(ShortTVHistoryView.TYPE_HISTORY, strM78323a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHistory$lambda$10$lambda$9(SearchHotFragment searchHotFragment, String it) {
        Intrinsics.m97802h(it, "it");
        C18604c c18604c = searchHotFragment.mSearchHistoryAdapter;
        if (c18604c != null) {
            c18604c.mo36205p(new C18602a(1, it));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHistory$lambda$8(SearchHotFragment searchHotFragment, View view) {
        searchHotFragment.clearTipsDialog();
        Context context = view.getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
        if (KeyboardUtils.m27133g((Activity) context)) {
            Context context2 = view.getContext();
            Intrinsics.m97800f(context2, "null cannot be cast to non-null type android.app.Activity");
            KeyboardUtils.m27130d((Activity) context2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initHotWordWithData(List<HotWord> hotWords) {
        ConstraintLayout constraintLayout;
        RecyclerView recyclerView;
        ConstraintLayout constraintLayout2;
        TextView textView;
        C28429n c28429n = (C28429n) getMViewBinding();
        if (c28429n != null && (textView = c28429n.f87242u) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: ir.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchHotFragment.initHotWordWithData$lambda$17(view);
                }
            });
        }
        if (hotWords.isEmpty()) {
            C28429n c28429n2 = (C28429n) getMViewBinding();
            if (c28429n2 == null || (constraintLayout = c28429n2.f87232k) == null) {
                return;
            }
            AbstractC26006c.m102054g(constraintLayout);
            return;
        }
        C28429n c28429n3 = (C28429n) getMViewBinding();
        if (c28429n3 != null && (constraintLayout2 = c28429n3.f87232k) != null) {
            AbstractC26006c.m102058k(constraintLayout2);
        }
        final ArrayList arrayList = new ArrayList();
        for (Object obj : hotWords) {
            if (!Intrinsics.m97797c(((HotWord) obj).getWord(), this.hotSearchWord)) {
                arrayList.add(obj);
            }
        }
        C18606e c18606e = this.everyOneSearchAdapter;
        if (c18606e != null) {
            c18606e.mo36201n1(arrayList);
        }
        C28429n c28429n4 = (C28429n) getMViewBinding();
        if (c28429n4 == null || (recyclerView = c28429n4.f87225d) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: ir.p
            @Override // java.lang.Runnable
            public final void run() {
                SearchHotFragment.initHotWordWithData$lambda$19(this.f73732a, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHotWordWithData$lambda$17(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initHotWordWithData$lambda$19(SearchHotFragment searchHotFragment, List list) {
        RecyclerView recyclerView;
        C28429n c28429n = (C28429n) searchHotFragment.getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (c28429n == null || (recyclerView = c28429n.f87225d) == null) ? null : recyclerView.getLayoutManager();
        if (layoutManager instanceof LinesFlexBoxLayoutManager) {
            int iM78598o0 = ((LinesFlexBoxLayoutManager) layoutManager).m78598o0();
            for (int i11 = 0; i11 < iM78598o0; i11++) {
                if (i11 < list.size()) {
                    searchHotFragment.getSearchReporter().m78509q(((HotWord) list.get(i11)).getWord(), i11);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRankWithData(List<HotRank> rankRanks) {
        ViewPager2 viewPager2;
        RecyclerView.Adapter adapter;
        MagicIndicator magicIndicator;
        InterfaceC24549a navigator;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        if (rankRanks.isEmpty()) {
            C28429n c28429n = (C28429n) getMViewBinding();
            if (c28429n == null || (relativeLayout2 = c28429n.f87238q) == null) {
                return;
            }
            AbstractC26006c.m102055h(relativeLayout2);
            return;
        }
        C28429n c28429n2 = (C28429n) getMViewBinding();
        if (c28429n2 != null && (relativeLayout = c28429n2.f87238q) != null) {
            AbstractC26006c.m102058k(relativeLayout);
        }
        C28429n c28429n3 = (C28429n) getMViewBinding();
        if (c28429n3 != null && (magicIndicator = c28429n3.f87236o) != null && (navigator = magicIndicator.getNavigator()) != null) {
            navigator.notifyDataSetChanged();
        }
        C28429n c28429n4 = (C28429n) getMViewBinding();
        if (c28429n4 == null || (viewPager2 = c28429n4.f87239r) == null || (adapter = viewPager2.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$2(SearchHotFragment searchHotFragment, NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
        Intrinsics.m97802h(nestedScrollView, "<unused var>");
        FragmentActivity activity = searchHotFragment.getActivity();
        if (activity == null || !KeyboardUtils.m27133g(activity)) {
            return;
        }
        C28429n c28429n = (C28429n) searchHotFragment.getMViewBinding();
        C26922o.m105057a(c28429n != null ? c28429n.f87240s : null);
    }

    private final void initViewModel() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        C25674c c25674c = (C25674c) new C3227v0(fragmentActivityRequireActivity).m14969a(C25674c.class);
        getSearchReporter().m78497F(c25674c.m101026g());
        c25674c.m101030k().m14851j(this, new C18600h(new Function1() { // from class: ir.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchHotFragment.initViewModel$lambda$5$lambda$3(this.f73715a, (UGCEveryoneSearchData) obj);
            }
        }));
        c25674c.m101031l().m14851j(this, new C18600h(new Function1() { // from class: ir.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchHotFragment.initViewModel$lambda$5$lambda$4(this.f73716a, (UGCRankSearchData) obj);
            }
        }));
        this.mSearchViewModel = c25674c;
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity2, "requireActivity(...)");
        ((SearchResultViewModel) new C3227v0(fragmentActivityRequireActivity2).m14969a(SearchResultViewModel.class)).m78407l().m14851j(getViewLifecycleOwner(), new C18600h(new Function1() { // from class: ir.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchHotFragment.initViewModel$lambda$7$lambda$6(this.f73717a, (UGCSearchResultData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViewModel$lambda$5$lambda$3(SearchHotFragment searchHotFragment, UGCEveryoneSearchData uGCEveryoneSearchData) {
        List<HotWord> listL;
        View view;
        ProgressBar progressBar;
        C28429n c28429n = (C28429n) searchHotFragment.getMViewBinding();
        if (c28429n != null && (progressBar = c28429n.f87229h) != null) {
            progressBar.setVisibility(8);
        }
        C28429n c28429n2 = (C28429n) searchHotFragment.getMViewBinding();
        if (c28429n2 != null && (view = c28429n2.f87235n) != null) {
            view.setVisibility(0);
        }
        if (uGCEveryoneSearchData == null || (listL = uGCEveryoneSearchData.getHotWords()) == null) {
            listL = CollectionsKt.m97506l();
        }
        searchHotFragment.initHotWordWithData(listL);
        C24655b logViewConfig = searchHotFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(uGCEveryoneSearchData != null);
        }
        searchHotFragment.getSearchReporter().m78501i(searchHotFragment.getLogViewConfig());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$5$lambda$4(SearchHotFragment searchHotFragment, UGCRankSearchData uGCRankSearchData) {
        List<HotRank> listL;
        if (uGCRankSearchData == null || (listL = uGCRankSearchData.getHotRanks()) == null) {
            listL = CollectionsKt.m97506l();
        }
        searchHotFragment.rankList = listL;
        searchHotFragment.initRankWithData(listL);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViewModel$lambda$7$lambda$6(SearchHotFragment searchHotFragment, UGCSearchResultData uGCSearchResultData) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        if (uGCSearchResultData == null || !(uGCSearchResultData.getTabs().isEmpty() || uGCSearchResultData.getItems().isEmpty())) {
            C28429n c28429n = (C28429n) searchHotFragment.getMViewBinding();
            if (c28429n != null && (constraintLayout2 = c28429n.f87224c) != null) {
                AbstractC26006c.m102054g(constraintLayout2);
            }
            C28429n c28429n2 = (C28429n) searchHotFragment.getMViewBinding();
            if (c28429n2 != null && (constraintLayout = c28429n2.f87227f) != null) {
                AbstractC26006c.m102058k(constraintLayout);
            }
        } else {
            C28429n c28429n3 = (C28429n) searchHotFragment.getMViewBinding();
            if (c28429n3 != null && (constraintLayout4 = c28429n3.f87224c) != null) {
                AbstractC26006c.m102058k(constraintLayout4);
            }
            C28429n c28429n4 = (C28429n) searchHotFragment.getMViewBinding();
            if (c28429n4 != null && (constraintLayout3 = c28429n4.f87227f) != null) {
                AbstractC26006c.m102054g(constraintLayout3);
            }
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewPager() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        ViewPager2 viewPager4;
        ViewPager2 viewPager5;
        ViewPager2 viewPager6;
        MagicIndicator magicIndicator;
        C28429n c28429n = (C28429n) getMViewBinding();
        if (c28429n != null && (magicIndicator = c28429n.f87236o) != null) {
            CommonNavigator commonNavigator = new CommonNavigator(requireContext());
            commonNavigator.setAdapter(new C18596d());
            magicIndicator.setNavigator(commonNavigator);
        }
        C28429n c28429n2 = (C28429n) getMViewBinding();
        if (c28429n2 != null && (viewPager6 = c28429n2.f87239r) != null) {
            viewPager6.setAdapter(new C18597e());
        }
        C28429n c28429n3 = (C28429n) getMViewBinding();
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c28429n3 != null && (viewPager5 = c28429n3.f87239r) != null) {
            viewPager5.setLayerType(2, null);
        }
        C28429n c28429n4 = (C28429n) getMViewBinding();
        int i11 = 1;
        if (c28429n4 != null && (viewPager4 = c28429n4.f87239r) != null) {
            viewPager4.setPageTransformer(new C18594b(0, i11, defaultConstructorMarker));
        }
        C28429n c28429n5 = (C28429n) getMViewBinding();
        if (c28429n5 != null && (viewPager3 = c28429n5.f87239r) != null) {
            viewPager3.setOffscreenPageLimit(1);
        }
        C28429n c28429n6 = (C28429n) getMViewBinding();
        if (c28429n6 == null || (viewPager2 = c28429n6.f87239r) == null) {
            return;
        }
        viewPager2.registerOnPageChangeCallback(new C18598f());
    }

    private final void loadHistoryData() {
        SearchManager.f60047f.m78162a().m78161p(3, new C18599g());
        if (getParentFragment() instanceof SearchSubjectFragment) {
            Fragment parentFragment = getParentFragment();
            Intrinsics.m97800f(parentFragment, "null cannot be cast to non-null type com.transsion.search_pugc.fragment.SearchSubjectFragment");
            ((SearchSubjectFragment) parentFragment).m78291S0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18670g searchReporter_delegate$lambda$0(SearchHotFragment searchHotFragment) {
        return C18670g.f60281h.m78520a(searchHotFragment.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showHistoryList() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        String value;
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_history_lines_double", false);
        if (Intrinsics.m97797c((configBeanM110360c == null || (value = configBeanM110360c.getValue()) == null) ? null : StringsKt.m98153m1(value), Boolean.TRUE)) {
            this.historyExpandLine = 4;
            this.historyCollapseLine = 2;
        }
        C18604c c18604c = this.mSearchHistoryAdapter;
        if (c18604c != null) {
            c18604c.m78334Y1(new Function0() { // from class: ir.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchHotFragment.showHistoryList$lambda$13(this.f73718a);
                }
            });
        }
        C28429n c28429n = (C28429n) getMViewBinding();
        if (c28429n != null && (recyclerView4 = c28429n.f87231j) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            LinesFlexBoxLayoutManager linesFlexBoxLayoutManager = new LinesFlexBoxLayoutManager(contextRequireContext);
            linesFlexBoxLayoutManager.m44837c0(0);
            linesFlexBoxLayoutManager.m44838d0(1);
            linesFlexBoxLayoutManager.m44839e0(0);
            linesFlexBoxLayoutManager.m78600q0(this.expand ? this.historyExpandLine : this.historyCollapseLine);
            recyclerView4.setLayoutManager(linesFlexBoxLayoutManager);
        }
        C28429n c28429n2 = (C28429n) getMViewBinding();
        if (c28429n2 != null && (recyclerView3 = c28429n2.f87231j) != null) {
            recyclerView3.setAdapter(this.mSearchHistoryAdapter);
        }
        C28429n c28429n3 = (C28429n) getMViewBinding();
        if (c28429n3 != null && (recyclerView2 = c28429n3.f87231j) != null) {
            recyclerView2.setItemAnimator(null);
        }
        List<String> list = this.mHistoryList;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C18602a(1, (String) it.next()));
        }
        List<Object> listU0 = CollectionsKt.m97343U0(arrayList);
        C18604c c18604c2 = this.mSearchHistoryAdapter;
        if (c18604c2 != null) {
            c18604c2.mo36210q1(listU0);
        }
        C28429n c28429n4 = (C28429n) getMViewBinding();
        if (c28429n4 == null || (recyclerView = c28429n4.f87231j) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: ir.f
            @Override // java.lang.Runnable
            public final void run() {
                SearchHotFragment.showHistoryList$lambda$16(this.f73719a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showHistoryList$lambda$13(SearchHotFragment searchHotFragment) {
        boolean z11 = !searchHotFragment.expand;
        searchHotFragment.expand = z11;
        searchHotFragment.expandHistoryLine(z11);
        C28429n c28429n = (C28429n) searchHotFragment.getMViewBinding();
        C26922o.m105057a(c28429n != null ? c28429n.f87231j : null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHistoryList$lambda$16(SearchHotFragment searchHotFragment) {
        searchHotFragment.expandHistoryLine(searchHotFragment.expand);
    }

    public final void addHistoryWord(String keyword) {
        Intrinsics.m97802h(keyword, "keyword");
        if (this.mHistoryList.contains(keyword)) {
            return;
        }
        SearchManager.f60047f.m78162a().m78158g(keyword);
        this.mHistoryList.add(0, keyword);
        if (this.mHistoryList.size() > 30) {
            List<String> list = this.mHistoryList;
            list.remove(list.size() - 1);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C28429n getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28429n c28429nM109845c = C28429n.m109845c(inflater);
        Intrinsics.m97801g(c28429nM109845c, "inflate(...)");
        return c28429nM109845c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        NestedScrollView nestedScrollView;
        Intrinsics.m97802h(view, "view");
        initViewModel();
        initHistory();
        initEveryoneSearch();
        initViewPager();
        SearchHotAdHelper searchHotAdHelper = this.adHelper;
        C28429n c28429n = (C28429n) getMViewBinding();
        searchHotAdHelper.m78190m(c28429n != null ? c28429n.f87223b : null);
        C28429n c28429n2 = (C28429n) getMViewBinding();
        if (c28429n2 != null && (nestedScrollView = c28429n2.f87240s) != null) {
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.InterfaceC2768e() { // from class: ir.a
                @Override // androidx.core.widget.NestedScrollView.InterfaceC2768e
                /* JADX INFO: renamed from: a */
                public final void mo11145a(NestedScrollView nestedScrollView2, int i11, int i12, int i13, int i14) {
                    SearchHotFragment.initView$lambda$2(this.f73714a, nestedScrollView2, i11, i12, i13, i14);
                }
            });
        }
        getSearchReporter().m78502j(getLogViewConfig());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        View view;
        ProgressBar progressBar;
        C25674c c25674c = this.mSearchViewModel;
        if (c25674c != null) {
            c25674c.m101027h(getSearchReporter().m78499f());
        }
        C25674c c25674c2 = this.mSearchViewModel;
        if (c25674c2 != null) {
            c25674c2.m101028i(getSearchReporter().m78499f());
        }
        C28429n c28429n = (C28429n) getMViewBinding();
        if (c28429n != null && (progressBar = c28429n.f87229h) != null) {
            progressBar.setVisibility(0);
        }
        C28429n c28429n2 = (C28429n) getMViewBinding();
        if (c28429n2 == null || (view = c28429n2.f87235n) == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return C18670g.f60281h.m78520a(getContext()).m78500g(PAGE_NAME);
    }

    public final void onConnected() {
        C18606e c18606e = this.everyOneSearchAdapter;
        List<Object> data = c18606e != null ? c18606e.getData() : null;
        if (data == null || data.isEmpty() || this.rankList.isEmpty()) {
            lazyLoadData();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.adHelper.m78191p();
    }

    @Override // com.transsion.search_pugc.fragment.BaseSearchMainFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        loadHistoryData();
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onLeftButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onRightButtonClick(TRDialog dialog) {
        RecyclerView recyclerView;
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(dialog, "dialog");
        if (TextUtils.equals(dialog.getTag(), "clear_tips")) {
            SearchManager.f60047f.m78162a().m78159j();
            this.mHistoryList.clear();
            C28429n c28429n = (C28429n) getMViewBinding();
            if (c28429n != null && (constraintLayout = c28429n.f87230i) != null) {
                constraintLayout.setVisibility(8);
            }
            C18604c c18604c = this.mSearchHistoryAdapter;
            if (c18604c != null) {
                c18604c.mo36210q1(new ArrayList());
            }
            C28429n c28429n2 = (C28429n) getMViewBinding();
            RecyclerView.AbstractC4214m layoutManager = (c28429n2 == null || (recyclerView = c28429n2.f87231j) == null) ? null : recyclerView.getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type com.transsion.search_pugc.widget.LinesFlexBoxLayoutManager");
            ((LinesFlexBoxLayoutManager) layoutManager).m78599p0();
            this.expand = false;
            expandHistoryLine(false);
            getSearchReporter().m78505m();
        }
    }
}
