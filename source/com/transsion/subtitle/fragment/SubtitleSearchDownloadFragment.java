package com.transsion.subtitle.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.download.SubtitleLanguageMapBean;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.baseui.widget.EditTextWithClear;
import com.transsion.subtitle.R$string;
import com.transsion.subtitle.helper.AbstractC19718c;
import com.transsion.subtitle.view.SubtitleSearchTabTitleView;
import com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import p559ku.C25436f;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J:\u0010&\u001a\u00020\u00072#\u0010#\u001a\u001f\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R \u0010=\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00105¨\u0006H"}, m97100d2 = {"Lcom/transsion/subtitle/fragment/SubtitleSearchDownloadFragment;", "Lcom/transsion/subtitle/fragment/SubtitleBaseFragment;", "Lku/f;", "<init>", "()V", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", "", "y0", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "initViewModel", "", "Lcom/transsion/baselib/db/download/SubtitleLanguageMapBean;", "tabs", "x0", "(Ljava/util/List;)V", "r0", "t0", "Landroid/view/LayoutInflater;", "inflater", "s0", "(Landroid/view/LayoutInflater;)Lku/f;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "lazyLoadData", "Lkotlin/Function1;", "Lju/a;", "Lkotlin/ParameterName;", "name", "bean", "callback", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "z0", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/CommonNavigator;", "g", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/CommonNavigator;", "commonNavigator", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "h", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "vpAdapter", "", "i", "I", "selectTabIndex", "j", "Ljava/lang/String;", "searchName", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/baselib/db/download/DownloadBean;", "", "Lcom/transsion/subtitle/fragment/SubtitleSearchResultListFragment;", "l", "Ljava/util/Map;", "fragmentList", "m", "Lkotlin/jvm/functions/Function1;", "subtitleSelectCallback", "", "n", "Z", "isFeedbackShown", "o", TtmlNode.TAG_P, "a", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubtitleSearchDownloadFragment extends SubtitleBaseFragment<C25436f> {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private CommonNavigator commonNavigator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private FragmentStateAdapter vpAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int selectTabIndex;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String searchName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private Function1 subtitleSelectCallback;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isFeedbackShown;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Map fragmentList = new LinkedHashMap();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String type = "";

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchDownloadFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubtitleSearchDownloadFragment m82045a(String str, DownloadBean downloadBean, String str2) {
            SubtitleSearchDownloadFragment subtitleSearchDownloadFragment = new SubtitleSearchDownloadFragment();
            subtitleSearchDownloadFragment.m82042y0(downloadBean);
            subtitleSearchDownloadFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("EXTRA_NAME", str), TuplesKt.m97108a("KEY_PAGE_NAME", str2)));
            return subtitleSearchDownloadFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchDownloadFragment$b */
    public static final class C19671b extends AbstractC25775a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f62856b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ SubtitleSearchDownloadFragment f62857c;

        /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchDownloadFragment$b$a */
        public static final class a extends AbstractViewOnClickListenerC14560f {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ SubtitleSearchDownloadFragment f62858e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f62859f;

            a(SubtitleSearchDownloadFragment subtitleSearchDownloadFragment, int i11) {
                this.f62858e = subtitleSearchDownloadFragment;
                this.f62859f = i11;
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
                C25436f c25436f = (C25436f) this.f62858e.getMViewBinding();
                if (c25436f == null || (viewPager2 = c25436f.f77049i) == null) {
                    return;
                }
                viewPager2.setCurrentItem(this.f62859f, true);
            }
        }

        C19671b(List list, SubtitleSearchDownloadFragment subtitleSearchDownloadFragment) {
            this.f62856b = list;
            this.f62857c = subtitleSearchDownloadFragment;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return this.f62856b.size();
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setColors(0);
            return linePagerIndicator;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, int i11) {
            Intrinsics.m97802h(context, "context");
            SubtitleSearchTabTitleView subtitleSearchTabTitleView = new SubtitleSearchTabTitleView(context);
            List list = this.f62856b;
            SubtitleSearchDownloadFragment subtitleSearchDownloadFragment = this.f62857c;
            subtitleSearchTabTitleView.setTextWithString(((SubtitleLanguageMapBean) list.get(i11)).getLanName());
            subtitleSearchTabTitleView.setOnClickListener(new a(subtitleSearchDownloadFragment, i11));
            return subtitleSearchTabTitleView;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchDownloadFragment$c */
    public static final class C19672c extends ViewPager2.OnPageChangeCallback {
        C19672c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            MagicIndicator magicIndicator;
            super.onPageScrollStateChanged(i11);
            C25436f c25436f = (C25436f) SubtitleSearchDownloadFragment.this.getMViewBinding();
            if (c25436f == null || (magicIndicator = c25436f.f77045e) == null) {
                return;
            }
            magicIndicator.onPageScrollStateChanged(i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            MagicIndicator magicIndicator;
            super.onPageScrolled(i11, f11, i12);
            C25436f c25436f = (C25436f) SubtitleSearchDownloadFragment.this.getMViewBinding();
            if (c25436f == null || (magicIndicator = c25436f.f77045e) == null) {
                return;
            }
            magicIndicator.onPageScrolled(i11, f11, i12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            MagicIndicator magicIndicator;
            super.onPageSelected(i11);
            C25436f c25436f = (C25436f) SubtitleSearchDownloadFragment.this.getMViewBinding();
            if (c25436f != null && (magicIndicator = c25436f.f77045e) != null) {
                magicIndicator.onPageSelected(i11);
            }
            SubtitleSearchDownloadFragment.this.selectTabIndex = i11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchDownloadFragment$d */
    public static final class C19673d implements TextWatcher {
        public C19673d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SubtitleSearchDownloadFragment.this.searchName = String.valueOf(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchDownloadFragment$e */
    public static final class C19674e implements TextView.OnEditorActionListener {
        C19674e() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            if (i11 != 0 && i11 != 3) {
                return false;
            }
            CharSequence text = textView != null ? textView.getText() : null;
            if (text == null || text.length() == 0) {
                C28951b.f88586a.m111455e(Utils.m27275a().getString(R$string.subtitle_search_empty_tips));
                return true;
            }
            SubtitleSearchResultListFragment subtitleSearchResultListFragment = (SubtitleSearchResultListFragment) SubtitleSearchDownloadFragment.this.fragmentList.get(Integer.valueOf(SubtitleSearchDownloadFragment.this.selectTabIndex));
            if (subtitleSearchResultListFragment != null) {
                subtitleSearchResultListFragment.m82087Q0(SubtitleSearchDownloadFragment.this.searchName);
            }
            if (textView != null) {
                KeyboardUtils.m27131e(textView);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchDownloadFragment$f */
    public static final class C19675f extends FragmentStateAdapter {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f62864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C19675f(List list) {
            super(SubtitleSearchDownloadFragment.this);
            this.f62864b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final Unit m82047h(SubtitleSearchDownloadFragment subtitleSearchDownloadFragment) {
            return subtitleSearchDownloadFragment.isFeedbackShown ? Unit.f75682a : Unit.f75682a;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            SubtitleSearchResultListFragment subtitleSearchResultListFragmentM82090a = SubtitleSearchResultListFragment.INSTANCE.m82090a(SubtitleSearchDownloadFragment.this.downloadBean, (SubtitleLanguageMapBean) this.f62864b.get(i11), SubtitleSearchDownloadFragment.this.searchName, SubtitleSearchDownloadFragment.this.getPageName());
            final SubtitleSearchDownloadFragment subtitleSearchDownloadFragment = SubtitleSearchDownloadFragment.this;
            subtitleSearchDownloadFragment.fragmentList.put(Integer.valueOf(i11), subtitleSearchResultListFragmentM82090a);
            subtitleSearchResultListFragmentM82090a.m82089U0(subtitleSearchDownloadFragment.subtitleSelectCallback);
            subtitleSearchResultListFragmentM82090a.m82088T0(new Function0() { // from class: com.transsion.subtitle.fragment.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubtitleSearchDownloadFragment.C19675f.m82047h(subtitleSearchDownloadFragment);
                }
            });
            return subtitleSearchResultListFragmentM82090a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f62864b.size();
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchDownloadFragment$g */
    static final class C19676g implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62865a;

        C19676g(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62865a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62865a;
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
            this.f62865a.invoke(obj);
        }
    }

    private final void initViewModel() {
        C3187b0 c3187b0M82251j;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            C26866a.a aVar = C26866a.f81698a;
            String tag = getTAG();
            Intrinsics.m97801g(tag, "<get-TAG>(...)");
            C26866a.a.m104898f(aVar, tag, "initViewModel ", false, 4, null);
            SubtitleDownloadViewModel viewModel = getViewModel();
            if (viewModel != null && (c3187b0M82251j = viewModel.m82251j()) != null) {
                c3187b0M82251j.m14851j(parentFragment, new C19676g(new Function1() { // from class: com.transsion.subtitle.fragment.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SubtitleSearchDownloadFragment.m82040w0(this.f62909a, (List) obj);
                    }
                }));
            }
            SubtitleDownloadViewModel viewModel2 = getViewModel();
            if (viewModel2 != null) {
                viewModel2.m82250i();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    private final void m82036r0(List tabs) {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        MagicIndicator magicIndicator;
        Context context = getContext();
        if (context == null) {
            return;
        }
        CommonNavigator commonNavigator = new CommonNavigator(context);
        commonNavigator.setFollowTouch(true);
        commonNavigator.setAdapter(new C19671b(tabs, this));
        this.commonNavigator = commonNavigator;
        C25436f c25436f = (C25436f) getMViewBinding();
        if (c25436f != null && (magicIndicator = c25436f.f77045e) != null) {
            magicIndicator.setNavigator(this.commonNavigator);
        }
        m82037t0();
        C25436f c25436f2 = (C25436f) getMViewBinding();
        if (c25436f2 != null && (viewPager3 = c25436f2.f77049i) != null) {
            viewPager3.registerOnPageChangeCallback(new C19672c());
        }
        C25436f c25436f3 = (C25436f) getMViewBinding();
        if (c25436f3 == null || (viewPager2 = c25436f3.f77049i) == null) {
            return;
        }
        viewPager2.setCurrentItem(this.selectTabIndex, false);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m82037t0() {
        LinearLayout titleContainer;
        View childAt;
        LinearLayout titleContainer2;
        CommonNavigator commonNavigator = this.commonNavigator;
        int childCount = (commonNavigator == null || (titleContainer2 = commonNavigator.getTitleContainer()) == null) ? 0 : titleContainer2.getChildCount();
        if (childCount > 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                CommonNavigator commonNavigator2 = this.commonNavigator;
                if (commonNavigator2 != null && (titleContainer = commonNavigator2.getTitleContainer()) != null && (childAt = titleContainer.getChildAt(i11)) != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 == null) {
                        layoutParams2 = new LinearLayout.LayoutParams(-2, AbstractC5776a0.m27313a(30.0f));
                    }
                    layoutParams2.height = AbstractC5776a0.m27313a(30.0f);
                    if (i11 == 0) {
                        layoutParams2.setMarginStart(AbstractC5776a0.m27313a(16.0f));
                    }
                    layoutParams2.setMarginEnd(AbstractC5776a0.m27313a(8.0f));
                    childAt.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m82038u0(SubtitleSearchDownloadFragment subtitleSearchDownloadFragment, View view) {
        C3187b0 c3187b0M82249h;
        SubtitleDownloadViewModel viewModel = subtitleSearchDownloadFragment.getViewModel();
        if (viewModel == null || (c3187b0M82249h = viewModel.m82249h()) == null) {
            return;
        }
        c3187b0M82249h.mo14858q(subtitleSearchDownloadFragment.type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m82039v0(SubtitleSearchDownloadFragment subtitleSearchDownloadFragment, View view) {
        String str = subtitleSearchDownloadFragment.searchName;
        if (str == null || str.length() == 0) {
            C28951b.f88586a.m111455e(Utils.m27275a().getString(R$string.subtitle_search_empty_tips));
            return;
        }
        SubtitleSearchResultListFragment subtitleSearchResultListFragment = (SubtitleSearchResultListFragment) subtitleSearchDownloadFragment.fragmentList.get(Integer.valueOf(subtitleSearchDownloadFragment.selectTabIndex));
        if (subtitleSearchResultListFragment != null) {
            subtitleSearchResultListFragment.m82087Q0(subtitleSearchDownloadFragment.searchName);
        }
        if (view != null) {
            KeyboardUtils.m27131e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m82040w0(SubtitleSearchDownloadFragment subtitleSearchDownloadFragment, List list) {
        C26866a.a aVar = C26866a.f81698a;
        String tag = subtitleSearchDownloadFragment.getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, tag, "get languages list success, size = " + list.size() + " ", false, 4, null);
        ArrayList arrayList = new ArrayList();
        Intrinsics.m97799e(list);
        arrayList.addAll(list);
        AbstractC19718c.m82170d(arrayList);
        subtitleSearchDownloadFragment.m82041x0(arrayList);
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    private final void m82041x0(List tabs) {
        ViewPager2 viewPager2;
        this.vpAdapter = new C19675f(tabs);
        C25436f c25436f = (C25436f) getMViewBinding();
        if (c25436f != null && (viewPager2 = c25436f.f77049i) != null) {
            viewPager2.setAdapter(this.vpAdapter);
        }
        m82036r0(tabs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final void m82042y0(DownloadBean downloadBean) {
        this.downloadBean = downloadBean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        EditTextWithClear editTextWithClear;
        TextView textView;
        EditTextWithClear editTextWithClear2;
        AppCompatImageView appCompatImageView;
        C25436f c25436f;
        EditTextWithClear editTextWithClear3;
        EditTextWithClear editTextWithClear4;
        Intrinsics.m97802h(view, "view");
        if (m82015c0()) {
            int iM27313a = AbstractC5776a0.m27313a(12.0f);
            int iM27313a2 = AbstractC5776a0.m27313a(5.0f);
            C25436f c25436f2 = (C25436f) getMViewBinding();
            if (c25436f2 != null && (editTextWithClear4 = c25436f2.f77042b) != null) {
                editTextWithClear4.setPadding(iM27313a * 3, iM27313a2, iM27313a, iM27313a2);
            }
        }
        initViewModel();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.searchName = arguments.getString("EXTRA_NAME", "");
        }
        String str = this.searchName;
        if (str != null && str.length() != 0 && (c25436f = (C25436f) getMViewBinding()) != null && (editTextWithClear3 = c25436f.f77042b) != null) {
            editTextWithClear3.setText(this.searchName);
        }
        C25436f c25436f3 = (C25436f) getMViewBinding();
        if (c25436f3 != null && (appCompatImageView = c25436f3.f77043c) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubtitleSearchDownloadFragment.m82038u0(this.f62907a, view2);
                }
            });
        }
        C25436f c25436f4 = (C25436f) getMViewBinding();
        if (c25436f4 != null && (editTextWithClear2 = c25436f4.f77042b) != null) {
            editTextWithClear2.addTextChangedListener(new C19673d());
        }
        C25436f c25436f5 = (C25436f) getMViewBinding();
        if (c25436f5 != null && (textView = c25436f5.f77047g) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubtitleSearchDownloadFragment.m82039v0(this.f62908a, view2);
                }
            });
        }
        C25436f c25436f6 = (C25436f) getMViewBinding();
        if (c25436f6 == null || (editTextWithClear = c25436f6.f77042b) == null) {
            return;
        }
        editTextWithClear.setOnEditorActionListener(new C19674e());
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.subtitle.fragment.SubtitleBaseFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m82017e0("dialog_subtitle_search");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C25436f getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25436f c25436fM100011c = C25436f.m100011c(inflater);
        Intrinsics.m97801g(c25436fM100011c, "inflate(...)");
        return c25436fM100011c;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m82044z0(Function1 callback, String type) {
        Intrinsics.m97802h(type, "type");
        this.subtitleSelectCallback = callback;
        this.type = type;
    }
}
