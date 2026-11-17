package com.transsion.search.fragment.hot;

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
import androidx.cardview.widget.CardView;
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
import com.transsion.search.InterfaceC18354a;
import com.transsion.search.R$id;
import com.transsion.search.R$string;
import com.transsion.search.SearchManager;
import com.transsion.search.bean.HotRankItem;
import com.transsion.search.bean.HotSearchKeyWord;
import com.transsion.search.bean.HotSubjectEntity;
import com.transsion.search.fragment.BaseSearchMainFragment;
import com.transsion.search.fragment.SearchSubjectFragment;
import com.transsion.search.fragment.hot.SearchHotFragment;
import com.transsion.search.fragment.hot.adapter.C18448a;
import com.transsion.search.fragment.hot.adapter.C18451d;
import com.transsion.search.fragment.hot.adapter.C18453f;
import com.transsion.search.p310ad.SearchHotAdContainerView;
import com.transsion.search.p310ad.SearchHotAdHelper;
import com.transsion.search.viewmodel.SearchViewModel;
import com.transsion.search.widget.C18541d;
import com.transsion.search.widget.LinesFlexBoxLayoutManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k00.InterfaceC24549a;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
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
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p684pp.C26922o;
import p765s6.InterfaceC27564b;
import p881wq.C28418c;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002WXB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0005J\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\u0005J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u0005J\u0015\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u001b¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u0010\rJ\u0017\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001b0H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006Y"}, m97100d2 = {"Lcom/transsion/search/fragment/hot/SearchHotFragment;", "Lcom/transsion/search/fragment/BaseSearchMainFragment;", "Lwq/c;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "<init>", "()V", "", "initViewModel", "initHistory", "loadHistoryData", "", "isExpand", "expandHistoryLine", "(Z)V", "showHistoryList", "Lcom/transsion/search/bean/HotSubjectEntity;", "subjectEntity", "initHotWordWithData", "(Lcom/transsion/search/bean/HotSubjectEntity;)V", "initEveryoneSearch", "it", "initRankWithData", "initViewPager", "Landroid/content/Context;", "context", "", "index", "", "textStr", "Lm00/d;", "getIndicatorText", "(Landroid/content/Context;ILjava/lang/String;)Lm00/d;", "Lm00/c;", "getIndicatorView", "(Landroid/content/Context;)Lm00/c;", "clearTipsDialog", "Landroid/view/LayoutInflater;", "inflater", "getViewBinding", "(Landroid/view/LayoutInflater;)Lwq/c;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "lazyLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onConnected", "keyword", "addHistoryWord", "(Ljava/lang/String;)V", "hidden", "onHiddenChanged", "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "Lcom/transsion/search/fragment/hot/adapter/d;", "mSearchHistoryAdapter", "Lcom/transsion/search/fragment/hot/adapter/d;", "expand", "Z", "historyExpandLine", "I", "historyCollapseLine", "hotSearchWord", "Ljava/lang/String;", "", "mHistoryList", "Ljava/util/List;", "Lcom/transsion/search/fragment/hot/adapter/f;", "everyOneSearchAdapter", "Lcom/transsion/search/fragment/hot/adapter/f;", "mHotSubjectEntity", "Lcom/transsion/search/bean/HotSubjectEntity;", "Lcom/transsion/search/viewmodel/SearchViewModel;", "mSearchViewModel", "Lcom/transsion/search/viewmodel/SearchViewModel;", "Lcom/transsion/search/ad/SearchHotAdHelper;", "adHelper", "Lcom/transsion/search/ad/SearchHotAdHelper;", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchHotFragment extends BaseSearchMainFragment<C28418c> implements TRDialogListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PAGE_NAME = "search_hot_subject";
    private SearchHotAdHelper adHelper;
    private C18453f everyOneSearchAdapter;
    private boolean expand;
    private String hotSearchWord;
    private HotSubjectEntity mHotSubjectEntity;
    private C18451d mSearchHistoryAdapter;
    private SearchViewModel mSearchViewModel;
    private int historyExpandLine = 2;
    private int historyCollapseLine = 1;
    private List<String> mHistoryList = new ArrayList();

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.SearchHotFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SearchHotFragment m77802a(String str) {
            SearchHotFragment searchHotFragment = new SearchHotFragment();
            searchHotFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("hot_search_word", str)));
            return searchHotFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.SearchHotFragment$b */
    public static final class C18440b implements ViewPager2.PageTransformer {

        /* JADX INFO: renamed from: a */
        private final int f59800a;

        public C18440b() {
            this(0, 1, null);
        }

        public C18440b(int i11) {
            this.f59800a = i11;
        }

        public /* synthetic */ C18440b(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
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
                page.setTranslationX(-(this.f59800a * f11));
            } else {
                page.setTranslationX(-(this.f59800a * (f11 - 1)));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.SearchHotFragment$c */
    public static final class C18441c extends AbstractViewOnClickListenerC14560f {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f59802f;

        C18441c(int i11) {
            this.f59802f = i11;
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
            C28418c c28418c = (C28418c) SearchHotFragment.this.getMViewBinding();
            if (c28418c != null && (viewPager2 = c28418c.f87157o) != null) {
                viewPager2.setCurrentItem(this.f59802f, false);
            }
            C28418c c28418c2 = (C28418c) SearchHotFragment.this.getMViewBinding();
            if (c28418c2 == null || (magicIndicator = c28418c2.f87154l) == null) {
                return;
            }
            magicIndicator.onPageScrolled(this.f59802f, 0.0f, 0);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.SearchHotFragment$d */
    public static final class C18442d extends AbstractC25775a {
        C18442d() {
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            List<HotRankItem> hot;
            HotSubjectEntity hotSubjectEntity = SearchHotFragment.this.mHotSubjectEntity;
            if (hotSubjectEntity == null || (hot = hotSubjectEntity.getHot()) == null) {
                return 0;
            }
            return hot.size();
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
            List<HotRankItem> hot;
            HotRankItem hotRankItem;
            Intrinsics.m97802h(context, "context");
            HotSubjectEntity hotSubjectEntity = SearchHotFragment.this.mHotSubjectEntity;
            if (hotSubjectEntity == null || (hot = hotSubjectEntity.getHot()) == null || (hotRankItem = hot.get(i11)) == null || (name = hotRankItem.getName()) == null) {
                name = "";
            }
            return SearchHotFragment.this.getIndicatorText(context, i11, name);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.SearchHotFragment$e */
    public static final class C18443e extends FragmentStateAdapter {
        C18443e() {
            super(SearchHotFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            List<HotRankItem> hot;
            HotSubjectEntity hotSubjectEntity = SearchHotFragment.this.mHotSubjectEntity;
            HotRankItem hotRankItem = (hotSubjectEntity == null || (hot = hotSubjectEntity.getHot()) == null) ? null : hot.get(i11);
            if (hotRankItem != null) {
                hotRankItem.setIndex(i11);
            }
            return SearchRankPagerFragment.INSTANCE.m77807a(hotRankItem);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<HotRankItem> hot;
            HotSubjectEntity hotSubjectEntity = SearchHotFragment.this.mHotSubjectEntity;
            if (hotSubjectEntity == null || (hot = hotSubjectEntity.getHot()) == null) {
                return 0;
            }
            return hot.size();
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.SearchHotFragment$f */
    public static final class C18444f extends ViewPager2.OnPageChangeCallback {
        C18444f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            MagicIndicator magicIndicator;
            super.onPageScrollStateChanged(i11);
            C28418c c28418c = (C28418c) SearchHotFragment.this.getMViewBinding();
            if (c28418c == null || (magicIndicator = c28418c.f87154l) == null) {
                return;
            }
            magicIndicator.onPageScrollStateChanged(i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            MagicIndicator magicIndicator;
            super.onPageScrolled(i11, f11, i12);
            C28418c c28418c = (C28418c) SearchHotFragment.this.getMViewBinding();
            if (c28418c == null || (magicIndicator = c28418c.f87154l) == null) {
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
                ((SearchRankPagerFragment) fragmentM14547k0).m77806b0();
            }
            C28418c c28418c = (C28418c) SearchHotFragment.this.getMViewBinding();
            if (c28418c == null || (magicIndicator = c28418c.f87154l) == null) {
                return;
            }
            magicIndicator.onPageSelected(i11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.SearchHotFragment$g */
    public static final class C18445g implements InterfaceC18354a {
        C18445g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static final void m77804c(List list, SearchHotFragment searchHotFragment) {
            ConstraintLayout constraintLayout;
            ArrayList arrayList = new ArrayList();
            List list2 = list;
            arrayList.addAll(list2);
            CollectionsKt.m97544Y(arrayList);
            searchHotFragment.mHistoryList = arrayList;
            searchHotFragment.showHistoryList();
            C28418c c28418c = (C28418c) searchHotFragment.getMViewBinding();
            if (c28418c == null || (constraintLayout = c28418c.f87148f) == null) {
                return;
            }
            constraintLayout.setVisibility(!list2.isEmpty() ? 0 : 8);
        }

        @Override // com.transsion.search.InterfaceC18354a
        /* JADX INFO: renamed from: a */
        public void mo77606a(final List list) {
            Intrinsics.m97802h(list, "list");
            FragmentActivity activity = SearchHotFragment.this.getActivity();
            if (activity != null) {
                final SearchHotFragment searchHotFragment = SearchHotFragment.this;
                activity.runOnUiThread(new Runnable() { // from class: zq.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        SearchHotFragment.C18445g.m77804c(list, searchHotFragment);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.SearchHotFragment$h */
    static final class C18446h implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59807a;

        C18446h(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59807a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59807a;
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
            this.f59807a.invoke(obj);
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
        C28418c c28418c = (C28418c) getMViewBinding();
        if (c28418c == null || (recyclerView = c28418c.f87149g) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: zq.g
            @Override // java.lang.Runnable
            public final void run() {
                SearchHotFragment.expandHistoryLine$lambda$12(this.f89206a, isExpand);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void expandHistoryLine$lambda$12(final SearchHotFragment searchHotFragment, final boolean z11) {
        C28418c c28418c;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        C28418c c28418c2 = (C28418c) searchHotFragment.getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = null;
        if (((c28418c2 == null || (recyclerView3 = c28418c2.f87149g) == null) ? null : recyclerView3.getLayoutManager()) instanceof LinesFlexBoxLayoutManager) {
            C28418c c28418c3 = (C28418c) searchHotFragment.getMViewBinding();
            if (c28418c3 != null && (recyclerView2 = c28418c3.f87149g) != null) {
                layoutManager = recyclerView2.getLayoutManager();
            }
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type com.transsion.search.widget.LinesFlexBoxLayoutManager");
            final LinesFlexBoxLayoutManager linesFlexBoxLayoutManager = (LinesFlexBoxLayoutManager) layoutManager;
            int iM78117n0 = linesFlexBoxLayoutManager.m78117n0();
            if (iM78117n0 <= 0) {
                return;
            }
            linesFlexBoxLayoutManager.m78120q0(z11 ? searchHotFragment.historyExpandLine : searchHotFragment.historyCollapseLine);
            boolean z12 = z11 || iM78117n0 > searchHotFragment.historyCollapseLine;
            final int iM78118o0 = linesFlexBoxLayoutManager.m78118o0() - 1;
            C18451d c18451d = searchHotFragment.mSearchHistoryAdapter;
            if (c18451d != null) {
                c18451d.m77821W1(z12, z11, iM78118o0);
            }
            C18451d c18451d2 = searchHotFragment.mSearchHistoryAdapter;
            if (c18451d2 != null) {
                c18451d2.notifyDataSetChanged();
            }
            if (!z12 || (c28418c = (C28418c) searchHotFragment.getMViewBinding()) == null || (recyclerView = c28418c.f87149g) == null) {
                return;
            }
            recyclerView.post(new Runnable() { // from class: zq.k
                @Override // java.lang.Runnable
                public final void run() {
                    SearchHotFragment.expandHistoryLine$lambda$12$lambda$11(linesFlexBoxLayoutManager, iM78118o0, searchHotFragment, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandHistoryLine$lambda$12$lambda$11(LinesFlexBoxLayoutManager linesFlexBoxLayoutManager, int i11, SearchHotFragment searchHotFragment, boolean z11) {
        C18451d c18451d;
        if (linesFlexBoxLayoutManager.getChildCount() <= i11 && (c18451d = searchHotFragment.mSearchHistoryAdapter) != null) {
            c18451d.m77821W1(true, z11, i11 - 1);
        }
        C18451d c18451d2 = searchHotFragment.mSearchHistoryAdapter;
        if (c18451d2 != null) {
            c18451d2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC25778d getIndicatorText(Context context, int index, String textStr) {
        CustomPagerTitleView customPagerTitleView = new CustomPagerTitleView(context, 17, AbstractC5776a0.m27313a(10.0f));
        customPagerTitleView.setSelectTextSize(16.0f);
        customPagerTitleView.setText(textStr);
        customPagerTitleView.setOnClickListener(new C18441c(index));
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void initEveryoneSearch() {
        RecyclerView recyclerView;
        Bundle arguments = getArguments();
        this.hotSearchWord = arguments != null ? arguments.getString("hot_search_word") : null;
        C18453f c18453f = new C18453f(0, 1, null);
        c18453f.m36193l(R$id.tv_keyword);
        c18453f.m36216s1(new InterfaceC27564b() { // from class: zq.i
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SearchHotFragment.initEveryoneSearch$lambda$23$lambda$22(this.f89209a, baseQuickAdapter, view, i11);
            }
        });
        this.everyOneSearchAdapter = c18453f;
        C28418c c28418c = (C28418c) getMViewBinding();
        if (c28418c == null || (recyclerView = c28418c.f87145c) == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        LinesFlexBoxLayoutManager linesFlexBoxLayoutManager = new LinesFlexBoxLayoutManager(contextRequireContext);
        linesFlexBoxLayoutManager.m44837c0(0);
        linesFlexBoxLayoutManager.m44838d0(1);
        linesFlexBoxLayoutManager.m44839e0(0);
        linesFlexBoxLayoutManager.m78120q0(this.historyExpandLine);
        recyclerView.setLayoutManager(linesFlexBoxLayoutManager);
        recyclerView.setAdapter(this.everyOneSearchAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEveryoneSearch$lambda$23$lambda$22(final SearchHotFragment searchHotFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Object objM112707constructorimpl;
        String strM78084s;
        HotSearchKeyWord hotSearchKeyWord;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        Fragment parentFragment = searchHotFragment.getParentFragment();
        if (parentFragment instanceof SearchSubjectFragment) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C18453f c18453f = searchHotFragment.everyOneSearchAdapter;
                objM112707constructorimpl = Result.m112707constructorimpl((c18453f == null || (hotSearchKeyWord = (HotSearchKeyWord) c18453f.getItem(i11)) == null) ? null : hotSearchKeyWord.getTitle());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            String str = (String) (Result.m112713isFailureimpl(objM112707constructorimpl) ? null : objM112707constructorimpl);
            if (str == null) {
                return;
            }
            ((SearchSubjectFragment) parentFragment).m77716u0(str, "hot", new Function1() { // from class: zq.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchHotFragment.initEveryoneSearch$lambda$23$lambda$22$lambda$21(this.f89210a, (String) obj);
                }
            });
            C18541d.a aVar = C18541d.f60046a;
            SearchViewModel searchViewModel = searchHotFragment.mSearchViewModel;
            if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
                strM78084s = "mb_sug";
            }
            aVar.m78128h(str, i11, strM78084s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initEveryoneSearch$lambda$23$lambda$22$lambda$21(SearchHotFragment searchHotFragment, String it) {
        Intrinsics.m97802h(it, "it");
        C18451d c18451d = searchHotFragment.mSearchHistoryAdapter;
        if (c18451d != null) {
            c18451d.mo36205p(new C18448a(1, it));
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initHistory() {
        String strM78084s;
        TextView textView;
        C28418c c28418c = (C28418c) getMViewBinding();
        if (c28418c != null && (textView = c28418c.f87159q) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: zq.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchHotFragment.initHistory$lambda$7(this.f89204a, view);
                }
            });
        }
        C18451d c18451d = new C18451d();
        this.mSearchHistoryAdapter = c18451d;
        SearchViewModel searchViewModel = this.mSearchViewModel;
        if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
            strM78084s = "mb_sug";
        }
        c18451d.m77822Y1(strM78084s);
        C18451d c18451d2 = this.mSearchHistoryAdapter;
        if (c18451d2 != null) {
            c18451d2.m36193l(R$id.search_history_text);
        }
        C18451d c18451d3 = this.mSearchHistoryAdapter;
        if (c18451d3 != null) {
            c18451d3.m36216s1(new InterfaceC27564b() { // from class: zq.f
                @Override // p765s6.InterfaceC27564b
                /* JADX INFO: renamed from: a */
                public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    SearchHotFragment.initHistory$lambda$10(this.f89205a, baseQuickAdapter, view, i11);
                }
            });
        }
        loadHistoryData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHistory$lambda$10(final SearchHotFragment searchHotFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Object objM112707constructorimpl;
        String strM78084s;
        C18448a c18448a;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        Fragment parentFragment = searchHotFragment.getParentFragment();
        if (parentFragment instanceof SearchSubjectFragment) {
            try {
                Result.Companion companion = Result.INSTANCE;
                C18451d c18451d = searchHotFragment.mSearchHistoryAdapter;
                objM112707constructorimpl = Result.m112707constructorimpl((c18451d == null || (c18448a = (C18448a) c18451d.getItem(i11)) == null) ? null : c18448a.m77808a());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            String str = (String) (Result.m112713isFailureimpl(objM112707constructorimpl) ? null : objM112707constructorimpl);
            if (str == null) {
                return;
            }
            ((SearchSubjectFragment) parentFragment).m77716u0(str, ShortTVHistoryView.TYPE_HISTORY, new Function1() { // from class: zq.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchHotFragment.initHistory$lambda$10$lambda$9(this.f89208a, (String) obj);
                }
            });
            C18541d.a aVar = C18541d.f60046a;
            SearchViewModel searchViewModel = searchHotFragment.mSearchViewModel;
            if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
                strM78084s = "mb_sug";
            }
            aVar.m78126f(str, i11, strM78084s);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHistory$lambda$10$lambda$9(SearchHotFragment searchHotFragment, String it) {
        Intrinsics.m97802h(it, "it");
        C18451d c18451d = searchHotFragment.mSearchHistoryAdapter;
        if (c18451d != null) {
            c18451d.mo36205p(new C18448a(1, it));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHistory$lambda$7(SearchHotFragment searchHotFragment, View view) {
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
    private final void initHotWordWithData(HotSubjectEntity subjectEntity) {
        ConstraintLayout constraintLayout;
        RecyclerView recyclerView;
        List<HotSearchKeyWord> everyoneSearch;
        List<HotSearchKeyWord> everyoneSearch2;
        C28418c c28418c = (C28418c) getMViewBinding();
        if (c28418c == null || (constraintLayout = c28418c.f87150h) == null) {
            return;
        }
        if (((subjectEntity == null || (everyoneSearch2 = subjectEntity.getEveryoneSearch()) == null) ? 0 : everyoneSearch2.size()) <= 0) {
            AbstractC26006c.m102054g(constraintLayout);
            return;
        }
        AbstractC26006c.m102058k(constraintLayout);
        final ArrayList arrayList = new ArrayList();
        if (subjectEntity != null && (everyoneSearch = subjectEntity.getEveryoneSearch()) != null) {
            for (HotSearchKeyWord hotSearchKeyWord : everyoneSearch) {
                if (!Intrinsics.m97797c(hotSearchKeyWord.getTitle(), this.hotSearchWord)) {
                    arrayList.add(hotSearchKeyWord);
                }
            }
        }
        C18453f c18453f = this.everyOneSearchAdapter;
        if (c18453f != null) {
            c18453f.mo36201n1(arrayList);
        }
        C28418c c28418c2 = (C28418c) getMViewBinding();
        if (c28418c2 == null || (recyclerView = c28418c2.f87145c) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: zq.d
            @Override // java.lang.Runnable
            public final void run() {
                SearchHotFragment.initHotWordWithData$lambda$19$lambda$18(this.f89202a, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initHotWordWithData$lambda$19$lambda$18(SearchHotFragment searchHotFragment, List list) {
        String strM78084s;
        RecyclerView recyclerView;
        C28418c c28418c = (C28418c) searchHotFragment.getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (c28418c == null || (recyclerView = c28418c.f87145c) == null) ? null : recyclerView.getLayoutManager();
        if (layoutManager instanceof LinesFlexBoxLayoutManager) {
            int iM78118o0 = ((LinesFlexBoxLayoutManager) layoutManager).m78118o0();
            for (int i11 = 0; i11 < iM78118o0; i11++) {
                if (i11 < list.size()) {
                    C18541d.a aVar = C18541d.f60046a;
                    String title = ((HotSearchKeyWord) list.get(i11)).getTitle();
                    SearchViewModel searchViewModel = searchHotFragment.mSearchViewModel;
                    if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
                        strM78084s = "mb_sug";
                    }
                    aVar.m78127g(title, i11, strM78084s);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRankWithData(HotSubjectEntity it) {
        RelativeLayout relativeLayout;
        ViewPager2 viewPager2;
        RecyclerView.Adapter adapter;
        MagicIndicator magicIndicator;
        InterfaceC24549a navigator;
        RelativeLayout relativeLayout2;
        List<HotRankItem> hot = it != null ? it.getHot() : null;
        if (hot == null || hot.isEmpty()) {
            C28418c c28418c = (C28418c) getMViewBinding();
            if (c28418c == null || (relativeLayout = c28418c.f87156n) == null) {
                return;
            }
            AbstractC26006c.m102055h(relativeLayout);
            return;
        }
        C28418c c28418c2 = (C28418c) getMViewBinding();
        if (c28418c2 != null && (relativeLayout2 = c28418c2.f87156n) != null) {
            AbstractC26006c.m102058k(relativeLayout2);
        }
        this.mHotSubjectEntity = it;
        C28418c c28418c3 = (C28418c) getMViewBinding();
        if (c28418c3 != null && (magicIndicator = c28418c3.f87154l) != null && (navigator = magicIndicator.getNavigator()) != null) {
            navigator.notifyDataSetChanged();
        }
        C28418c c28418c4 = (C28418c) getMViewBinding();
        if (c28418c4 == null || (viewPager2 = c28418c4.f87157o) == null || (adapter = viewPager2.getAdapter()) == null) {
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
        C28418c c28418c = (C28418c) searchHotFragment.getMViewBinding();
        C26922o.m105057a(c28418c != null ? c28418c.f87158p : null);
    }

    private final void initViewModel() {
        HashMap mapM96844g;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        SearchViewModel searchViewModel = (SearchViewModel) new C3227v0(fragmentActivityRequireActivity).m14969a(SearchViewModel.class);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
        }
        searchViewModel.m78078l().m14851j(this, new C18446h(new Function1() { // from class: zq.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchHotFragment.initViewModel$lambda$6$lambda$5(this.f89201a, (HotSubjectEntity) obj);
            }
        }));
        this.mSearchViewModel = searchViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViewModel$lambda$6$lambda$5(final SearchHotFragment searchHotFragment, HotSubjectEntity hotSubjectEntity) {
        View view;
        ProgressBar progressBar;
        C28418c c28418c = (C28418c) searchHotFragment.getMViewBinding();
        if (c28418c != null && (progressBar = c28418c.f87147e) != null) {
            progressBar.setVisibility(8);
        }
        C28418c c28418c2 = (C28418c) searchHotFragment.getMViewBinding();
        if (c28418c2 != null && (view = c28418c2.f87153k) != null) {
            view.setVisibility(0);
        }
        SearchHotAdHelper searchHotAdHelper = searchHotFragment.adHelper;
        if (searchHotAdHelper != null) {
            searchHotAdHelper.m77636y(new Function1() { // from class: zq.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchHotFragment.initViewModel$lambda$6$lambda$5$lambda$4(this.f89199a, ((Boolean) obj).booleanValue());
                }
            });
        }
        C24655b logViewConfig = searchHotFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        searchHotFragment.initHotWordWithData(hotSubjectEntity);
        searchHotFragment.initRankWithData(hotSubjectEntity);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViewModel$lambda$6$lambda$5$lambda$4(SearchHotFragment searchHotFragment, boolean z11) {
        C28418c c28418c;
        CardView cardView;
        if (z11 && (c28418c = (C28418c) searchHotFragment.getMViewBinding()) != null && (cardView = c28418c.f87146d) != null) {
            AbstractC26006c.m102058k(cardView);
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
        C28418c c28418c = (C28418c) getMViewBinding();
        if (c28418c != null && (magicIndicator = c28418c.f87154l) != null) {
            CommonNavigator commonNavigator = new CommonNavigator(requireContext());
            commonNavigator.setAdapter(new C18442d());
            magicIndicator.setNavigator(commonNavigator);
        }
        C28418c c28418c2 = (C28418c) getMViewBinding();
        if (c28418c2 != null && (viewPager6 = c28418c2.f87157o) != null) {
            viewPager6.setAdapter(new C18443e());
        }
        C28418c c28418c3 = (C28418c) getMViewBinding();
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c28418c3 != null && (viewPager5 = c28418c3.f87157o) != null) {
            viewPager5.setLayerType(2, null);
        }
        C28418c c28418c4 = (C28418c) getMViewBinding();
        int i11 = 1;
        if (c28418c4 != null && (viewPager4 = c28418c4.f87157o) != null) {
            viewPager4.setPageTransformer(new C18440b(0, i11, defaultConstructorMarker));
        }
        C28418c c28418c5 = (C28418c) getMViewBinding();
        if (c28418c5 != null && (viewPager3 = c28418c5.f87157o) != null) {
            viewPager3.setOffscreenPageLimit(1);
        }
        C28418c c28418c6 = (C28418c) getMViewBinding();
        if (c28418c6 == null || (viewPager2 = c28418c6.f87157o) == null) {
            return;
        }
        viewPager2.registerOnPageChangeCallback(new C18444f());
    }

    private final void loadHistoryData() {
        SearchManager.f59668f.m77605a().m77604m(3, new C18445g());
        if (getParentFragment() instanceof SearchSubjectFragment) {
            Fragment parentFragment = getParentFragment();
            Intrinsics.m97800f(parentFragment, "null cannot be cast to non-null type com.transsion.search.fragment.SearchSubjectFragment");
            ((SearchSubjectFragment) parentFragment).m77715K0();
        }
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
        C18451d c18451d = this.mSearchHistoryAdapter;
        if (c18451d != null) {
            c18451d.m77820V1(new Function0() { // from class: zq.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchHotFragment.showHistoryList$lambda$13(this.f89216a);
                }
            });
        }
        C28418c c28418c = (C28418c) getMViewBinding();
        if (c28418c != null && (recyclerView4 = c28418c.f87149g) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            LinesFlexBoxLayoutManager linesFlexBoxLayoutManager = new LinesFlexBoxLayoutManager(contextRequireContext);
            linesFlexBoxLayoutManager.m44837c0(0);
            linesFlexBoxLayoutManager.m44838d0(1);
            linesFlexBoxLayoutManager.m44839e0(0);
            linesFlexBoxLayoutManager.m78120q0(this.expand ? this.historyExpandLine : this.historyCollapseLine);
            recyclerView4.setLayoutManager(linesFlexBoxLayoutManager);
        }
        C28418c c28418c2 = (C28418c) getMViewBinding();
        if (c28418c2 != null && (recyclerView3 = c28418c2.f87149g) != null) {
            recyclerView3.setAdapter(this.mSearchHistoryAdapter);
        }
        C28418c c28418c3 = (C28418c) getMViewBinding();
        if (c28418c3 != null && (recyclerView2 = c28418c3.f87149g) != null) {
            recyclerView2.setItemAnimator(null);
        }
        List<String> list = this.mHistoryList;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C18448a(1, (String) it.next()));
        }
        List<Object> listU0 = CollectionsKt.m97343U0(arrayList);
        C18451d c18451d2 = this.mSearchHistoryAdapter;
        if (c18451d2 != null) {
            c18451d2.mo36210q1(listU0);
        }
        C28418c c28418c4 = (C28418c) getMViewBinding();
        if (c28418c4 == null || (recyclerView = c28418c4.f87149g) == null) {
            return;
        }
        recyclerView.post(new Runnable() { // from class: zq.b
            @Override // java.lang.Runnable
            public final void run() {
                SearchHotFragment.showHistoryList$lambda$16(this.f89200a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showHistoryList$lambda$13(SearchHotFragment searchHotFragment) {
        boolean z11 = !searchHotFragment.expand;
        searchHotFragment.expand = z11;
        searchHotFragment.expandHistoryLine(z11);
        C28418c c28418c = (C28418c) searchHotFragment.getMViewBinding();
        C26922o.m105057a(c28418c != null ? c28418c.f87149g : null);
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
        SearchManager.f59668f.m77605a().m77601g(keyword);
        this.mHistoryList.add(0, keyword);
        if (this.mHistoryList.size() > 30) {
            List<String> list = this.mHistoryList;
            list.remove(list.size() - 1);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C28418c getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28418c c28418cM109804c = C28418c.m109804c(inflater);
        Intrinsics.m97801g(c28418cM109804c, "inflate(...)");
        return c28418cM109804c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        NestedScrollView nestedScrollView;
        SearchHotAdContainerView searchHotAdContainerView;
        SearchHotAdHelper searchHotAdHelper;
        Intrinsics.m97802h(view, "view");
        initViewModel();
        initHistory();
        initEveryoneSearch();
        initViewPager();
        this.adHelper = new SearchHotAdHelper(AbstractC3226v.m14968a(this));
        C28418c c28418c = (C28418c) getMViewBinding();
        if (c28418c != null && (searchHotAdContainerView = c28418c.f87144b) != null && (searchHotAdHelper = this.adHelper) != null) {
            searchHotAdHelper.m77634m(searchHotAdContainerView);
        }
        C28418c c28418c2 = (C28418c) getMViewBinding();
        if (c28418c2 == null || (nestedScrollView = c28418c2.f87158p) == null) {
            return;
        }
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.InterfaceC2768e() { // from class: zq.l
            @Override // androidx.core.widget.NestedScrollView.InterfaceC2768e
            /* JADX INFO: renamed from: a */
            public final void mo11145a(NestedScrollView nestedScrollView2, int i11, int i12, int i13, int i14) {
                SearchHotFragment.initView$lambda$2(this.f89215a, nestedScrollView2, i11, i12, i13, i14);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        View view;
        ProgressBar progressBar;
        SearchViewModel searchViewModel = this.mSearchViewModel;
        if (searchViewModel != null) {
            searchViewModel.m78077k();
        }
        C28418c c28418c = (C28418c) getMViewBinding();
        if (c28418c != null && (progressBar = c28418c.f87147e) != null) {
            progressBar.setVisibility(0);
        }
        C28418c c28418c2 = (C28418c) getMViewBinding();
        if (c28418c2 == null || (view = c28418c2.f87153k) == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        C24655b c24655b = new C24655b(PAGE_NAME, false, 2, null);
        c24655b.m96849l(true);
        c24655b.m96844g().put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
        return c24655b;
    }

    public final void onConnected() {
        if (this.mHotSubjectEntity == null) {
            lazyLoadData();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        super.onDestroyView();
        C28418c c28418c = (C28418c) getMViewBinding();
        if (c28418c != null && (recyclerView = c28418c.f87149g) != null) {
            recyclerView.setAdapter(null);
        }
        this.mSearchHistoryAdapter = null;
        SearchHotAdHelper searchHotAdHelper = this.adHelper;
        if (searchHotAdHelper != null) {
            searchHotAdHelper.m77635p();
        }
        this.adHelper = null;
    }

    @Override // com.transsion.search.fragment.BaseSearchMainFragment, androidx.fragment.app.Fragment
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
        String strM78084s;
        RecyclerView recyclerView;
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(dialog, "dialog");
        if (TextUtils.equals(dialog.getTag(), "clear_tips")) {
            SearchManager.f59668f.m77605a().m77602j();
            this.mHistoryList.clear();
            C28418c c28418c = (C28418c) getMViewBinding();
            if (c28418c != null && (constraintLayout = c28418c.f87148f) != null) {
                constraintLayout.setVisibility(8);
            }
            C18451d c18451d = this.mSearchHistoryAdapter;
            if (c18451d != null) {
                c18451d.mo36210q1(new ArrayList());
            }
            C28418c c28418c2 = (C28418c) getMViewBinding();
            RecyclerView.AbstractC4214m layoutManager = (c28418c2 == null || (recyclerView = c28418c2.f87149g) == null) ? null : recyclerView.getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type com.transsion.search.widget.LinesFlexBoxLayoutManager");
            ((LinesFlexBoxLayoutManager) layoutManager).m78119p0();
            this.expand = false;
            expandHistoryLine(false);
            C18541d.a aVar = C18541d.f60046a;
            SearchViewModel searchViewModel = this.mSearchViewModel;
            if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
                strM78084s = "mb_sug";
            }
            aVar.m78123c(strM78084s);
        }
    }
}
