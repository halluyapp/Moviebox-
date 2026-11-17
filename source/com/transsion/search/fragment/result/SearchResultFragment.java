package com.transsion.search.fragment.result;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.GradientLinePagerIndicator;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$mipmap;
import com.transsion.baseui.R$string;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.baseui.widget.CustomPagerTitleView;
import com.transsion.baseui.widget.DrawableCenterTextView;
import com.transsion.baseui.widget.ResourcesRequestView;
import com.transsion.publish.model.PostEntity;
import com.transsion.pushapi.NoticePermissionFrom;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.bean.SearchList;
import com.transsion.search.bean.SearchResultEntity;
import com.transsion.search.bean.TabItem;
import com.transsion.search.fragment.BaseSearchMainFragment;
import com.transsion.search.viewmodel.SearchViewModel;
import com.transsion.search.widget.C18541d;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22994g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k00.InterfaceC24549a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import p550kj.C24655b;
import p743rh.C27287m;
import p880wp.C28415e;
import p881wq.C28422g;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010\u0004J\u001f\u00101\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0019¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108R\u0018\u0010/\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u00100\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010:¨\u0006R"}, m97100d2 = {"Lcom/transsion/search/fragment/result/SearchResultFragment;", "Lcom/transsion/search/fragment/BaseSearchMainFragment;", "Lwq/g;", "<init>", "()V", "", "initViewPager", "Lcom/transsion/search/bean/TabItem;", "tabItem", "Landroidx/fragment/app/Fragment;", "m0", "(Lcom/transsion/search/bean/TabItem;)Landroidx/fragment/app/Fragment;", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "magicIndicator", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "l0", "(Lnet/lucode/hackware/magicindicator/MagicIndicator;Landroidx/viewpager2/widget/ViewPager2;)V", "Landroid/view/View;", "s0", "()Landroid/view/View;", "Landroid/content/Context;", "context", "", "index", "", "textStr", "Lm00/d;", "getIndicatorText", "(Landroid/content/Context;ILjava/lang/String;)Lm00/d;", "Lm00/c;", "getIndicatorView", "(Landroid/content/Context;)Lm00/c;", "Landroid/view/LayoutInflater;", "inflater", "n0", "(Landroid/view/LayoutInflater;)Lwq/g;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "startLoading", "hideLoading", "lazyLoadData", "keyword", "searchFrom", "v0", "(Ljava/lang/String;Ljava/lang/String;)V", "id", "r0", "(Ljava/lang/String;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "a", "Ljava/lang/String;", "Lcom/transsion/search/fragment/result/SearchResultViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "o0", "()Lcom/transsion/search/fragment/result/SearchResultViewModel;", "viewModel", "Lcom/transsion/search/viewmodel/SearchViewModel;", "c", "Lcom/transsion/search/viewmodel/SearchViewModel;", "searchViewModel", "Lcom/transsion/search/bean/SearchResultEntity;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/search/bean/SearchResultEntity;", "searchResultData", "Lcom/transsion/baseui/widget/ResourcesRequestView;", "e", "Lcom/transsion/baseui/widget/ResourcesRequestView;", "requestView", "f", "Ljava/lang/Integer;", "requestMovieCount", "g", "h", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchResultFragment extends BaseSearchMainFragment<C28422g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String keyword;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.search.fragment.result.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultFragment.m77853w0(this.f59879a);
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private SearchViewModel searchViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SearchResultEntity searchResultData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ResourcesRequestView requestView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Integer requestMovieCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String searchFrom;

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultFragment$b */
    public static final class C18458b extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MagicIndicator f59846a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SearchResultFragment f59847b;

        C18458b(MagicIndicator magicIndicator, SearchResultFragment searchResultFragment) {
            this.f59846a = magicIndicator;
            this.f59847b = searchResultFragment;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            this.f59846a.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            this.f59846a.onPageScrolled(i11, f11, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            String strM78084s;
            List<TabItem> tabs;
            TabItem tabItem;
            this.f59846a.onPageSelected(i11);
            C18541d.a aVar = C18541d.f60046a;
            String str = this.f59847b.keyword;
            SearchResultEntity searchResultEntity = this.f59847b.searchResultData;
            String tabId = (searchResultEntity == null || (tabs = searchResultEntity.getTabs()) == null || (tabItem = tabs.get(i11)) == null) ? null : tabItem.getTabId();
            SearchViewModel searchViewModel = this.f59847b.searchViewModel;
            if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
                strM78084s = "mb_sug";
            }
            aVar.m78144x(str, tabId, strM78084s);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultFragment$c */
    public static final class C18459c extends AbstractViewOnClickListenerC14560f {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f59849f;

        C18459c(int i11) {
            this.f59849f = i11;
        }

        @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
        /* JADX INFO: renamed from: c */
        public void mo64493c(View view) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
        /* JADX INFO: renamed from: d */
        public void mo64494d(View view) {
            ViewPager2 viewPager2;
            C28422g c28422g = (C28422g) SearchResultFragment.this.getMViewBinding();
            if (c28422g == null || (viewPager2 = c28422g.f87187f) == null) {
                return;
            }
            viewPager2.setCurrentItem(this.f59849f, false);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultFragment$d */
    public static final class C18460d extends AbstractC25775a {
        C18460d() {
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            List<TabItem> tabs;
            SearchResultEntity searchResultEntity = SearchResultFragment.this.searchResultData;
            if (searchResultEntity == null || (tabs = searchResultEntity.getTabs()) == null) {
                return 0;
            }
            return tabs.size();
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            return SearchResultFragment.this.getIndicatorView(context);
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, int i11) {
            List<TabItem> tabs;
            TabItem tabItem;
            Intrinsics.m97802h(context, "context");
            SearchResultFragment searchResultFragment = SearchResultFragment.this;
            SearchResultEntity searchResultEntity = searchResultFragment.searchResultData;
            return searchResultFragment.getIndicatorText(context, i11, (searchResultEntity == null || (tabs = searchResultEntity.getTabs()) == null || (tabItem = tabs.get(i11)) == null) ? null : tabItem.getName());
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultFragment$e */
    public static final class C18461e extends FragmentStateAdapter {
        C18461e() {
            super(SearchResultFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            List<TabItem> tabs;
            SearchResultFragment searchResultFragment = SearchResultFragment.this;
            SearchResultEntity searchResultEntity = searchResultFragment.searchResultData;
            return searchResultFragment.m77846m0((searchResultEntity == null || (tabs = searchResultEntity.getTabs()) == null) ? null : tabs.get(i11));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<TabItem> tabs;
            SearchResultEntity searchResultEntity = SearchResultFragment.this.searchResultData;
            if (searchResultEntity == null || (tabs = searchResultEntity.getTabs()) == null) {
                return 0;
            }
            return tabs.size();
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.result.SearchResultFragment$f */
    static final class C18462f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59852a;

        C18462f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59852a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59852a;
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
            this.f59852a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC25778d getIndicatorText(Context context, int index, String textStr) {
        CustomPagerTitleView customPagerTitleView = new CustomPagerTitleView(context, 17, AbstractC5776a0.m27313a(12.0f));
        customPagerTitleView.setSelectTextSize(16.0f);
        customPagerTitleView.setText(textStr);
        customPagerTitleView.setOnClickListener(new C18459c(index));
        return customPagerTitleView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC25777c getIndicatorView(Context context) {
        GradientLinePagerIndicator gradientLinePagerIndicator = new GradientLinePagerIndicator(context);
        gradientLinePagerIndicator.setMode(1);
        gradientLinePagerIndicator.setLineHeight(AbstractC5776a0.m27313a(2.0f));
        gradientLinePagerIndicator.setLineWidth(AbstractC5776a0.m27313a(24.0f));
        gradientLinePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
        gradientLinePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
        int color = AbstractC2397b.getColor(context, R$color.white);
        gradientLinePagerIndicator.setColors(color, color, color);
        return gradientLinePagerIndicator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewPager() {
        ViewPager2 viewPager2;
        MagicIndicator magicIndicator;
        C28422g c28422g = (C28422g) getMViewBinding();
        if (c28422g != null && (magicIndicator = c28422g.f87184c) != null) {
            CommonNavigator commonNavigator = new CommonNavigator(getContext());
            commonNavigator.setAdapter(new C18460d());
            magicIndicator.setNavigator(commonNavigator);
        }
        C28422g c28422g2 = (C28422g) getMViewBinding();
        if (c28422g2 == null || (viewPager2 = c28422g2.f87187f) == null) {
            return;
        }
        viewPager2.setAdapter(new C18461e());
    }

    /* JADX INFO: renamed from: l0 */
    private final void m77845l0(MagicIndicator magicIndicator, ViewPager2 viewPager) {
        viewPager.registerOnPageChangeCallback(new C18458b(magicIndicator, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public final Fragment m77846m0(TabItem tabItem) {
        String tabId = tabItem != null ? tabItem.getTabId() : null;
        SearchResultEntity searchResultEntity = this.searchResultData;
        return SearchResultTabFragment.INSTANCE.m77892a(this.keyword, tabItem, Intrinsics.m97797c(tabId, searchResultEntity != null ? searchResultEntity.getTabId() : null) ? this.searchResultData : null, this.searchFrom);
    }

    /* JADX INFO: renamed from: o0 */
    private final SearchResultViewModel m77847o0() {
        return (SearchResultViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public static final Unit m77848p0(SearchResultFragment searchResultFragment, SearchResultEntity searchResultEntity) {
        List<SearchList> results;
        String strM78084s;
        FrameLayout frameLayout;
        View view;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        List<TabItem> tabs;
        List<SearchList> results2;
        ViewPager2 viewPager2;
        RecyclerView.Adapter adapter;
        MagicIndicator magicIndicator;
        InterfaceC24549a navigator;
        searchResultFragment.hideLoading();
        if (searchResultEntity == null || (tabs = searchResultEntity.getTabs()) == null || tabs.isEmpty() || (results2 = searchResultEntity.getResults()) == null || results2.isEmpty()) {
            C28422g c28422g = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g != null && (frameLayout3 = c28422g.f87183b) != null) {
                frameLayout3.removeAllViews();
            }
            C28422g c28422g2 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g2 != null && (frameLayout2 = c28422g2.f87183b) != null) {
                frameLayout2.addView(searchResultFragment.m77850s0());
            }
            C28422g c28422g3 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g3 != null && (view = c28422g3.f87185d) != null) {
                view.setVisibility(4);
            }
            C28422g c28422g4 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g4 != null && (frameLayout = c28422g4.f87183b) != null) {
                frameLayout.setVisibility(0);
            }
            if ((searchResultEntity != null ? searchResultEntity.getPager() : null) != null && ((results = searchResultEntity.getResults()) == null || results.isEmpty())) {
                C18541d.a aVar = C18541d.f60046a;
                String str = searchResultFragment.keyword;
                String str2 = searchResultFragment.searchFrom;
                SearchViewModel searchViewModel = searchResultFragment.searchViewModel;
                if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
                    strM78084s = "mb_sug";
                }
                aVar.m78129i(str, str2, strM78084s);
            }
        } else {
            searchResultFragment.searchResultData = searchResultEntity;
            C28422g c28422g5 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g5 != null && (magicIndicator = c28422g5.f87184c) != null && (navigator = magicIndicator.getNavigator()) != null) {
                navigator.notifyDataSetChanged();
            }
            C28422g c28422g6 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g6 != null && (viewPager2 = c28422g6.f87187f) != null && (adapter = viewPager2.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m77849q0(SearchResultFragment searchResultFragment, PostEntity postEntity) {
        C26866a.a.m104899g(C26866a.f81698a, "Post request succeed " + postEntity + ", " + (postEntity != null ? postEntity.getCount() : null), false, 2, null);
        if (postEntity != null && searchResultFragment.requestMovieCount == null) {
            int count = postEntity.getCount();
            if (count == null) {
                count = 0;
            }
            searchResultFragment.requestMovieCount = count;
            ResourcesRequestView resourcesRequestView = searchResultFragment.requestView;
            if (resourcesRequestView != null) {
                Integer count2 = postEntity.getCount();
                resourcesRequestView.setCount(count2 != null ? count2.intValue() : 0, false);
            }
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    private final View m77850s0() {
        DrawableCenterTextView drawableCenterTextView;
        if (!C27287m.f83003a.m106330e()) {
            LayoutInflater layoutInflater = getLayoutInflater();
            int i11 = R$layout.view_search_no_network;
            C28422g c28422g = (C28422g) getMViewBinding();
            View viewInflate = layoutInflater.inflate(i11, (ViewGroup) (c28422g != null ? c28422g.f87183b : null), false);
            TextView textView = (TextView) viewInflate.findViewById(R$id.tv_empty_tips);
            ImageView imageView = (ImageView) viewInflate.findViewById(R$id.iv_tips);
            AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(R$id.tv_retry);
            textView.setText(R$string.base_net_err);
            imageView.setImageResource(R$mipmap.ic_no_network);
            appCompatTextView.setVisibility(0);
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.result.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchResultFragment.m77852u0(this.f59891a, view);
                }
            });
            Intrinsics.m97799e(viewInflate);
            return viewInflate;
        }
        LayoutInflater layoutInflater2 = getLayoutInflater();
        int i12 = R$layout.view_search_empty;
        C28422g c28422g2 = (C28422g) getMViewBinding();
        View viewInflate2 = layoutInflater2.inflate(i12, (ViewGroup) (c28422g2 != null ? c28422g2.f87183b : null), false);
        final ResourcesRequestView resourcesRequestView = (ResourcesRequestView) viewInflate2.findViewById(R$id.resources_request);
        this.requestView = resourcesRequestView;
        final String str = this.keyword;
        if (str == null) {
            str = "";
        }
        if (str.length() > 10) {
            String strSubstring = str.substring(0, 10);
            Intrinsics.m97801g(strSubstring, "substring(...)");
            str = strSubstring + "...";
        }
        String string = getString(com.transsion.search.R$string.search_value_no_result, this.keyword);
        Intrinsics.m97801g(string, "getString(...)");
        resourcesRequestView.set(string);
        resourcesRequestView.setGray(true);
        m77847o0().m77906m(str, true);
        this.requestMovieCount = null;
        C22994g mViewBinding = resourcesRequestView.getMViewBinding();
        if (mViewBinding != null && (drawableCenterTextView = mViewBinding.f70213e) != null) {
            drawableCenterTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.result.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchResultFragment.m77851t0(this.f59888a, str, resourcesRequestView, view);
                }
            });
        }
        Intrinsics.m97799e(viewInflate2);
        return viewInflate2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m77851t0(SearchResultFragment searchResultFragment, String str, ResourcesRequestView resourcesRequestView, View view) {
        C28415e.f87132a.m109794e(searchResultFragment, NoticePermissionFrom.DETAIL_NO_RES);
        SearchResultViewModel.m77900n(searchResultFragment.m77847o0(), str, false, 2, null);
        Integer num = searchResultFragment.requestMovieCount;
        if (num != null) {
            Intrinsics.m97799e(num);
            Integer numValueOf = Integer.valueOf(num.intValue() + 1);
            searchResultFragment.requestMovieCount = numValueOf;
            Intrinsics.m97799e(numValueOf);
            ResourcesRequestView.setCount$default(resourcesRequestView, numValueOf.intValue(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m77852u0(SearchResultFragment searchResultFragment, View view) {
        String str = searchResultFragment.keyword;
        if (str == null) {
            str = "";
        }
        searchResultFragment.m77856v0(str, searchResultFragment.searchFrom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final SearchResultViewModel m77853w0(SearchResultFragment searchResultFragment) {
        FragmentActivity fragmentActivityRequireActivity = searchResultFragment.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        return (SearchResultViewModel) new C3227v0(fragmentActivityRequireActivity).m14969a(SearchResultViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        View view;
        MagicIndicator magicIndicator;
        ViewPager2 viewPager2;
        ProgressBar progressBar;
        C28422g c28422g = (C28422g) getMViewBinding();
        if (c28422g != null && (progressBar = c28422g.f87186e) != null) {
            progressBar.setVisibility(4);
        }
        C28422g c28422g2 = (C28422g) getMViewBinding();
        if (c28422g2 != null && (viewPager2 = c28422g2.f87187f) != null) {
            viewPager2.setVisibility(0);
        }
        C28422g c28422g3 = (C28422g) getMViewBinding();
        if (c28422g3 != null && (magicIndicator = c28422g3.f87184c) != null) {
            magicIndicator.setVisibility(0);
        }
        C28422g c28422g4 = (C28422g) getMViewBinding();
        if (c28422g4 == null || (view = c28422g4.f87185d) == null) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        initViewPager();
        m77847o0().m77905k().m14851j(getViewLifecycleOwner(), new C18462f(new Function1() { // from class: com.transsion.search.fragment.result.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultFragment.m77848p0(this.f59886a, (SearchResultEntity) obj);
            }
        }));
        m77847o0().m77903i().m14851j(this, new C18462f(new Function1() { // from class: com.transsion.search.fragment.result.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultFragment.m77849q0(this.f59887a, (PostEntity) obj);
            }
        }));
        C28422g c28422g = (C28422g) getMViewBinding();
        if (c28422g != null) {
            MagicIndicator searchResultMagicIndicator = c28422g.f87184c;
            Intrinsics.m97801g(searchResultMagicIndicator, "searchResultMagicIndicator");
            ViewPager2 searchResultViewPager = c28422g.f87187f;
            Intrinsics.m97801g(searchResultViewPager, "searchResultViewPager");
            m77845l0(searchResultMagicIndicator, searchResultViewPager);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C28422g getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28422g c28422gM109820c = C28422g.m109820c(inflater);
        Intrinsics.m97801g(c28422gM109820c, "inflate(...)");
        return c28422gM109820c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        String strM78084s;
        C24655b c24655b = new C24655b("searchresult", false, 2, null);
        c24655b.m96849l(true);
        c24655b.m96844g().put("search_id", BaseSearchMainFragment.INSTANCE.m77677a());
        HashMap mapM96844g = c24655b.m96844g();
        SearchViewModel searchViewModel = this.searchViewModel;
        if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
            strM78084s = "mb_sug";
        }
        mapM96844g.put("sug_source", strM78084s);
        return c24655b;
    }

    @Override // com.transsion.search.fragment.BaseSearchMainFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object objM112707constructorimpl;
        super.onCreate(savedInstanceState);
        try {
            Result.Companion companion = Result.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            objM112707constructorimpl = Result.m112707constructorimpl((SearchViewModel) new C3227v0(fragmentActivityRequireActivity).m14969a(SearchViewModel.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = null;
        }
        this.searchViewModel = (SearchViewModel) objM112707constructorimpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final void m77855r0(String id2) {
        Integer numValueOf;
        ViewPager2 viewPager2;
        List<TabItem> tabs;
        Intrinsics.m97802h(id2, "id");
        SearchResultEntity searchResultEntity = this.searchResultData;
        if (searchResultEntity == null || (tabs = searchResultEntity.getTabs()) == null) {
            numValueOf = null;
        } else {
            Iterator<TabItem> it = tabs.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (Intrinsics.m97797c(it.next().getTabId(), id2)) {
                    break;
                } else {
                    i11++;
                }
            }
            numValueOf = Integer.valueOf(i11);
        }
        C28422g c28422g = (C28422g) getMViewBinding();
        if (c28422g == null || (viewPager2 = c28422g.f87187f) == null) {
            return;
        }
        viewPager2.setCurrentItem(numValueOf != null ? numValueOf.intValue() : 0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        FrameLayout frameLayout;
        View view;
        MagicIndicator magicIndicator;
        ViewPager2 viewPager2;
        ProgressBar progressBar;
        C28422g c28422g = (C28422g) getMViewBinding();
        if (c28422g != null && (progressBar = c28422g.f87186e) != null) {
            progressBar.setVisibility(0);
        }
        C28422g c28422g2 = (C28422g) getMViewBinding();
        if (c28422g2 != null && (viewPager2 = c28422g2.f87187f) != null) {
            viewPager2.setVisibility(4);
        }
        C28422g c28422g3 = (C28422g) getMViewBinding();
        if (c28422g3 != null && (magicIndicator = c28422g3.f87184c) != null) {
            magicIndicator.setVisibility(4);
        }
        C28422g c28422g4 = (C28422g) getMViewBinding();
        if (c28422g4 != null && (view = c28422g4.f87185d) != null) {
            view.setVisibility(4);
        }
        C28422g c28422g5 = (C28422g) getMViewBinding();
        if (c28422g5 == null || (frameLayout = c28422g5.f87183b) == null) {
            return;
        }
        frameLayout.setVisibility(4);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m77856v0(String keyword, String searchFrom) {
        String strM78084s;
        HashMap mapM96844g;
        Intrinsics.m97802h(keyword, "keyword");
        this.keyword = keyword;
        startLoading();
        this.searchResultData = null;
        initViewPager();
        this.searchFrom = searchFrom;
        m77847o0().m77908r(1);
        SearchResultViewModel.m77901p(m77847o0(), keyword, null, false, 6, null);
        C18541d.a aVar = C18541d.f60046a;
        SearchViewModel searchViewModel = this.searchViewModel;
        if (searchViewModel == null || (strM78084s = searchViewModel.m78084s()) == null) {
            strM78084s = "mb_sug";
        }
        aVar.m78137q(keyword, searchFrom, strM78084s);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }
}
