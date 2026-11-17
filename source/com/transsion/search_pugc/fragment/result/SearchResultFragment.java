package com.transsion.search_pugc.fragment.result;

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
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.GradientLinePagerIndicator;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$mipmap;
import com.transsion.baseui.R$string;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.baseui.widget.CustomPagerTitleView;
import com.transsion.baseui.widget.ResourcesRequestView;
import com.transsion.publish.model.PostEntity;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.bean.SearchTab;
import com.transsion.search_pugc.bean.UGCSearchResultData;
import com.transsion.search_pugc.fragment.BaseSearchMainFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import k00.InterfaceC24549a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import p881wq.C28422g;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0004J+\u0010/\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u0018\u0010,\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010-\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00105R\u0018\u0010.\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00105R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bJ\u0010K¨\u0006N"}, m97100d2 = {"Lcom/transsion/search_pugc/fragment/result/SearchResultFragment;", "Lcom/transsion/search_pugc/fragment/BaseSearchMainFragment;", "Lwq/g;", "<init>", "()V", "", "initViewPager", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "magicIndicator", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "l0", "(Lnet/lucode/hackware/magicindicator/MagicIndicator;Landroidx/viewpager2/widget/ViewPager2;)V", "Landroid/view/View;", "r0", "()Landroid/view/View;", "Landroid/content/Context;", "context", "", "index", "", "textStr", "Lm00/d;", "getIndicatorText", "(Landroid/content/Context;ILjava/lang/String;)Lm00/d;", "Lm00/c;", "getIndicatorView", "(Landroid/content/Context;)Lm00/c;", "Landroid/view/LayoutInflater;", "inflater", "n0", "(Landroid/view/LayoutInflater;)Lwq/g;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "tabId", "Lcom/transsion/search_pugc/bean/UGCSearchResultData;", "m0", "(Ljava/lang/String;)Lcom/transsion/search_pugc/bean/UGCSearchResultData;", "startLoading", "hideLoading", "lazyLoadData", "keyword", "searchFrom", "fromUGCVideoId", "u0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "a", "Ljava/lang/String;", "Lcom/transsion/search_pugc/fragment/result/SearchResultViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "o0", "()Lcom/transsion/search_pugc/fragment/result/SearchResultViewModel;", "viewModel", "c", "Lcom/transsion/search_pugc/bean/UGCSearchResultData;", "searchResultData", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "Lcom/transsion/baseui/widget/ResourcesRequestView;", "f", "Lcom/transsion/baseui/widget/ResourcesRequestView;", "requestView", "g", "Ljava/lang/Integer;", "requestMovieCount", "Lcom/transsion/search_pugc/g;", "h", "getSearchReporter", "()Lcom/transsion/search_pugc/g;", "searchReporter", "i", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchResultFragment extends BaseSearchMainFragment<C28422g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String keyword;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private UGCSearchResultData searchResultData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String searchFrom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String fromUGCVideoId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ResourcesRequestView requestView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Integer requestMovieCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.result.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultFragment.m78363v0(this.f60206a);
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy searchReporter = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.result.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultFragment.m78362t0(this.f60212a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.SearchResultFragment$b */
    public static final class C18613b extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MagicIndicator f60175a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SearchResultFragment f60176b;

        C18613b(MagicIndicator magicIndicator, SearchResultFragment searchResultFragment) {
            this.f60175a = magicIndicator;
            this.f60176b = searchResultFragment;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            this.f60175a.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            this.f60175a.onPageScrolled(i11, f11, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            this.f60175a.onPageSelected(i11);
            C18670g c18670gM78520a = C18670g.f60281h.m78520a(this.f60176b.getContext());
            String str = this.f60176b.keyword;
            UGCSearchResultData uGCSearchResultData = this.f60176b.searchResultData;
            SearchTab searchTab = uGCSearchResultData != null ? uGCSearchResultData.getTabs().get(i11) : null;
            UGCSearchResultData uGCSearchResultData2 = this.f60176b.searchResultData;
            c18670gM78520a.m78494C(str, searchTab, uGCSearchResultData2 != null ? uGCSearchResultData2.getOps() : null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.SearchResultFragment$c */
    public static final class C18614c extends AbstractViewOnClickListenerC14560f {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f60178f;

        C18614c(int i11) {
            this.f60178f = i11;
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
            viewPager2.setCurrentItem(this.f60178f, false);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.SearchResultFragment$d */
    public static final class C18615d extends AbstractC25775a {
        C18615d() {
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            List<SearchTab> tabs;
            UGCSearchResultData uGCSearchResultData = SearchResultFragment.this.searchResultData;
            if (uGCSearchResultData == null || (tabs = uGCSearchResultData.getTabs()) == null) {
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
            List<SearchTab> tabs;
            SearchTab searchTab;
            Intrinsics.m97802h(context, "context");
            SearchResultFragment searchResultFragment = SearchResultFragment.this;
            UGCSearchResultData uGCSearchResultData = searchResultFragment.searchResultData;
            return searchResultFragment.getIndicatorText(context, i11, (uGCSearchResultData == null || (tabs = uGCSearchResultData.getTabs()) == null || (searchTab = tabs.get(i11)) == null) ? null : searchTab.getName());
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.SearchResultFragment$e */
    public static final class C18616e extends FragmentStateAdapter {
        C18616e() {
            super(SearchResultFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            List<SearchTab> tabs;
            List<SearchTab> tabs2;
            UGCSearchResultData uGCSearchResultData = SearchResultFragment.this.searchResultData;
            if (uGCSearchResultData != null && (tabs2 = uGCSearchResultData.getTabs()) != null) {
                tabs2.get(i11);
            }
            UGCSearchResultData uGCSearchResultData2 = SearchResultFragment.this.searchResultData;
            return SearchResultTabFragment.INSTANCE.m78395a(SearchResultFragment.this.keyword, null, (uGCSearchResultData2 == null || (tabs = uGCSearchResultData2.getTabs()) == null) ? null : tabs.get(i11), SearchResultFragment.this.searchFrom, SearchResultFragment.this.fromUGCVideoId);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<SearchTab> tabs;
            UGCSearchResultData uGCSearchResultData = SearchResultFragment.this.searchResultData;
            if (uGCSearchResultData == null || (tabs = uGCSearchResultData.getTabs()) == null) {
                return 0;
            }
            return tabs.size();
        }
    }

    /* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.SearchResultFragment$f */
    static final class C18617f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60181a;

        C18617f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60181a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60181a;
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
            this.f60181a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC25778d getIndicatorText(Context context, int index, String textStr) {
        CustomPagerTitleView customPagerTitleView = new CustomPagerTitleView(context, 17, AbstractC5776a0.m27313a(12.0f));
        customPagerTitleView.setSelectTextSize(16.0f);
        customPagerTitleView.setText(textStr);
        customPagerTitleView.setOnClickListener(new C18614c(index));
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

    private final C18670g getSearchReporter() {
        return (C18670g) this.searchReporter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewPager() {
        ViewPager2 viewPager2;
        MagicIndicator magicIndicator;
        C28422g c28422g = (C28422g) getMViewBinding();
        if (c28422g != null && (magicIndicator = c28422g.f87184c) != null) {
            CommonNavigator commonNavigator = new CommonNavigator(getContext());
            commonNavigator.setAdapter(new C18615d());
            magicIndicator.setNavigator(commonNavigator);
        }
        C28422g c28422g2 = (C28422g) getMViewBinding();
        if (c28422g2 == null || (viewPager2 = c28422g2.f87187f) == null) {
            return;
        }
        viewPager2.setAdapter(new C18616e());
    }

    /* JADX INFO: renamed from: l0 */
    private final void m78356l0(MagicIndicator magicIndicator, ViewPager2 viewPager) {
        viewPager.registerOnPageChangeCallback(new C18613b(magicIndicator, this));
    }

    /* JADX INFO: renamed from: o0 */
    private final SearchResultViewModel m78357o0() {
        return (SearchResultViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public static final Unit m78358p0(SearchResultFragment searchResultFragment, UGCSearchResultData uGCSearchResultData) {
        ViewPager2 viewPager2;
        RecyclerView.Adapter adapter;
        MagicIndicator magicIndicator;
        InterfaceC24549a navigator;
        FrameLayout frameLayout;
        View view;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        searchResultFragment.hideLoading();
        if (uGCSearchResultData == null) {
            C28422g c28422g = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g != null && (frameLayout3 = c28422g.f87183b) != null) {
                frameLayout3.removeAllViews();
            }
            C28422g c28422g2 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g2 != null && (frameLayout2 = c28422g2.f87183b) != null) {
                frameLayout2.addView(searchResultFragment.m78360r0());
            }
            C28422g c28422g3 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g3 != null && (view = c28422g3.f87185d) != null) {
                view.setVisibility(4);
            }
            C28422g c28422g4 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g4 != null && (frameLayout = c28422g4.f87183b) != null) {
                frameLayout.setVisibility(0);
            }
            searchResultFragment.getSearchReporter().m78516x("net_error", null);
        } else if (uGCSearchResultData.getTabs().isEmpty() || uGCSearchResultData.getItems().isEmpty()) {
            searchResultFragment.getSearchReporter().m78516x("empty", null);
            searchResultFragment.m78357o0().m78405i().mo14855n(Boolean.TRUE);
        } else {
            searchResultFragment.searchResultData = uGCSearchResultData;
            C28422g c28422g5 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g5 != null && (magicIndicator = c28422g5.f87184c) != null && (navigator = magicIndicator.getNavigator()) != null) {
                navigator.notifyDataSetChanged();
            }
            C28422g c28422g6 = (C28422g) searchResultFragment.getMViewBinding();
            if (c28422g6 != null && (viewPager2 = c28422g6.f87187f) != null && (adapter = viewPager2.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            searchResultFragment.getSearchReporter().m78516x(NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS, uGCSearchResultData.getOps());
            C24655b logViewConfig = searchResultFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96844g().put("ops", uGCSearchResultData.getOps());
            }
        }
        C24655b logViewConfig2 = searchResultFragment.getLogViewConfig();
        if (logViewConfig2 != null) {
            logViewConfig2.m96848k(uGCSearchResultData != null);
        }
        searchResultFragment.getSearchReporter().m78501i(searchResultFragment.getLogViewConfig());
        searchResultFragment.getSearchReporter().m78495D(searchResultFragment.getLogViewConfig());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m78359q0(SearchResultFragment searchResultFragment, PostEntity postEntity) {
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
    /* JADX INFO: renamed from: r0 */
    private final View m78360r0() {
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
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search_pugc.fragment.result.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchResultFragment.m78361s0(this.f60215a, view);
            }
        });
        Intrinsics.m97799e(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m78361s0(SearchResultFragment searchResultFragment, View view) {
        String str = searchResultFragment.keyword;
        if (str == null) {
            str = "";
        }
        searchResultFragment.m78366u0(str, searchResultFragment.searchFrom, searchResultFragment.fromUGCVideoId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C18670g m78362t0(SearchResultFragment searchResultFragment) {
        return C18670g.f60281h.m78520a(searchResultFragment.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final SearchResultViewModel m78363v0(SearchResultFragment searchResultFragment) {
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
        m78357o0().m78407l().m14851j(getViewLifecycleOwner(), new C18617f(new Function1() { // from class: com.transsion.search_pugc.fragment.result.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultFragment.m78358p0(this.f60213a, (UGCSearchResultData) obj);
            }
        }));
        m78357o0().m78404h().m14851j(this, new C18617f(new Function1() { // from class: com.transsion.search_pugc.fragment.result.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchResultFragment.m78359q0(this.f60214a, (PostEntity) obj);
            }
        }));
        C28422g c28422g = (C28422g) getMViewBinding();
        if (c28422g != null) {
            MagicIndicator searchResultMagicIndicator = c28422g.f87184c;
            Intrinsics.m97801g(searchResultMagicIndicator, "searchResultMagicIndicator");
            ViewPager2 searchResultViewPager = c28422g.f87187f;
            Intrinsics.m97801g(searchResultViewPager, "searchResultViewPager");
            m78356l0(searchResultMagicIndicator, searchResultViewPager);
        }
        getSearchReporter().m78502j(getLogViewConfig());
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    /* JADX INFO: renamed from: m0 */
    public final UGCSearchResultData m78364m0(String tabId) {
        UGCSearchResultData uGCSearchResultData = this.searchResultData;
        if (Intrinsics.m97797c(tabId, uGCSearchResultData != null ? uGCSearchResultData.getTabId() : null)) {
            return this.searchResultData;
        }
        return null;
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
        return getSearchReporter().m78500g("/ugc_search/search_result");
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

    /* JADX INFO: renamed from: u0 */
    public final void m78366u0(String keyword, String searchFrom, String fromUGCVideoId) {
        Intrinsics.m97802h(keyword, "keyword");
        this.keyword = keyword;
        this.searchFrom = searchFrom;
        this.fromUGCVideoId = fromUGCVideoId;
        startLoading();
        this.searchResultData = null;
        initViewPager();
        m78357o0().m78409p(fromUGCVideoId);
        m78357o0().m78410q(1);
        SearchResultViewModel.m78401n(m78357o0(), keyword, "", getSearchReporter().m78499f(), false, null, 24, null);
    }
}
