package com.transsion.home.fragment.hashtag;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.AbstractC2397b;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5790i;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.baseui.widget.CustomPagerTitleView;
import com.transsion.gslb.Utils;
import com.transsion.home.R$string;
import com.transsion.home.hashtag.HashTagViewModel;
import com.transsion.home.hashtag.model.HashTagTab;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import p550kj.C24655b;
import p550kj.C24662i;
import p552kl.C24694p;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, m97100d2 = {"Lcom/transsion/home/fragment/hashtag/UGCHashTagFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lkl/p;", "<init>", "()V", "", "", "tabTitles", "", "j0", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "h0", "(Landroid/view/LayoutInflater;)Lkl/p;", "lazyLoadData", "onResume", "", "hidden", "onHiddenChanged", "(Z)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoHashTag;", "a", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoHashTag;", "mainHasTag", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/util/List;", "hasTagList", "Lcom/transsion/home/hashtag/HashTagViewModel;", "c", "Lkotlin/Lazy;", "i0", "()Lcom/transsion/home/hashtag/HashTagViewModel;", "viewModel", "Lcom/transsion/home/fragment/hashtag/UGCHashTagFragment$b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/home/fragment/hashtag/UGCHashTagFragment$b;", "titleUpdateCallback", "e", "Ljava/lang/String;", "fromOptId", "f", "ugcVideoId", "", "g", "I", "tabId", "h", "Z", "hasMarkLoadResult", "i", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCHashTagFragment extends BaseFragment<C24694p> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    public static final int f52883j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private UGCVideoHashTag mainHasTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List hasTagList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(HashTagViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.home.fragment.hashtag.UGCHashTagFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.home.fragment.hashtag.UGCHashTagFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InterfaceC15208b titleUpdateCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String fromOptId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String ugcVideoId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int tabId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean hasMarkLoadResult;

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.UGCHashTagFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCHashTagFragment m67860a(UGCVideoHashTag uGCVideoHashTag, ArrayList arrayList, String str, String str2, int i11) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("hash_tag", uGCVideoHashTag);
            bundle.putParcelableArrayList("hash_tags", arrayList);
            bundle.putString("fromOptId", str);
            bundle.putString("UGCVideoId", str2);
            bundle.putInt("tabId", i11);
            UGCHashTagFragment uGCHashTagFragment = new UGCHashTagFragment();
            uGCHashTagFragment.setArguments(bundle);
            return uGCHashTagFragment;
        }

        /* JADX INFO: renamed from: b */
        public final UGCHashTagFragment m67861b(String str, String str2, String str3, int i11) {
            Bundle bundle = new Bundle();
            bundle.putString("hashtag", str);
            bundle.putString("fromOptId", str2);
            bundle.putString("UGCVideoId", str3);
            bundle.putInt("tabId", i11);
            UGCHashTagFragment uGCHashTagFragment = new UGCHashTagFragment();
            uGCHashTagFragment.setArguments(bundle);
            return uGCHashTagFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.UGCHashTagFragment$b */
    public interface InterfaceC15208b {
        /* JADX INFO: renamed from: j */
        void mo66703j(String str);
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.UGCHashTagFragment$c */
    public static final class C15209c extends AbstractC25775a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f52892b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ UGCHashTagFragment f52893c;

        /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.UGCHashTagFragment$c$a */
        public static final class a extends AbstractViewOnClickListenerC14560f {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ UGCHashTagFragment f52894e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f52895f;

            a(UGCHashTagFragment uGCHashTagFragment, int i11) {
                this.f52894e = uGCHashTagFragment;
                this.f52895f = i11;
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: c */
            public void mo64493c(View view) {
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: d */
            public void mo64494d(View view) {
                MagicIndicator magicIndicator;
                ViewPager2 viewPager2;
                C24694p mViewBinding = this.f52894e.getMViewBinding();
                if (mViewBinding != null && (viewPager2 = mViewBinding.f75536d) != null) {
                    viewPager2.setCurrentItem(this.f52895f, true);
                }
                C24694p mViewBinding2 = this.f52894e.getMViewBinding();
                if (mViewBinding2 == null || (magicIndicator = mViewBinding2.f75535c) == null) {
                    return;
                }
                magicIndicator.onPageScrolled(this.f52895f, 0.0f, 0);
            }
        }

        C15209c(List list, UGCHashTagFragment uGCHashTagFragment) {
            this.f52892b = list;
            this.f52893c = uGCHashTagFragment;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return this.f52892b.size();
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setMode(1);
            linePagerIndicator.setLineHeight(AbstractC5790i.m27411e(2.0f));
            linePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
            linePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
            int color = AbstractC2397b.getColor(context, R$color.text_01);
            linePagerIndicator.setColors(Integer.valueOf(color), Integer.valueOf(color), Integer.valueOf(color));
            return linePagerIndicator;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, int i11) {
            Intrinsics.m97802h(context, "context");
            CustomPagerTitleView customPagerTitleView = new CustomPagerTitleView(context, 17, AbstractC5776a0.m27313a(10.0f));
            List list = this.f52892b;
            UGCHashTagFragment uGCHashTagFragment = this.f52893c;
            customPagerTitleView.setText((CharSequence) list.get(i11));
            customPagerTitleView.setTextSize(16.0f);
            customPagerTitleView.setOnClickListener(new a(uGCHashTagFragment, i11));
            return customPagerTitleView;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.UGCHashTagFragment$d */
    public static final class C15210d extends FragmentStateAdapter {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f52897b;

        /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.UGCHashTagFragment$d$a */
        public static final class a implements HashTagPageFragment.InterfaceC15200b {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ List f52898a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ UGCHashTagFragment f52899b;

            a(List list, UGCHashTagFragment uGCHashTagFragment) {
                this.f52898a = list;
                this.f52899b = uGCHashTagFragment;
            }

            @Override // com.transsion.home.fragment.hashtag.HashTagPageFragment.InterfaceC15200b
            /* JADX INFO: renamed from: a */
            public void mo67848a(String tabId, Long l11, String str) {
                HashMap mapM96844g;
                String string;
                Intrinsics.m97802h(tabId, "tabId");
                HashTagTab hashTagTab = (HashTagTab) CollectionsKt.m97362l0(this.f52898a, 0);
                if (Intrinsics.m97797c(tabId, hashTagTab != null ? hashTagTab.getId() : null) && !this.f52899b.hasMarkLoadResult) {
                    this.f52899b.hasMarkLoadResult = true;
                    C24655b logViewConfig = this.f52899b.getLogViewConfig();
                    if (logViewConfig != null) {
                        logViewConfig.m96848k(true);
                    }
                    C24655b logViewConfig2 = this.f52899b.getLogViewConfig();
                    if (logViewConfig2 == null || (mapM96844g = logViewConfig2.m96844g()) == null) {
                        return;
                    }
                    if (l11 == null || (string = l11.toString()) == null) {
                        string = "";
                    }
                    mapM96844g.put("load_duration", string);
                    if (str == null) {
                        str = "";
                    }
                    mapM96844g.put("ops", str);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C15210d(List list) {
            super(UGCHashTagFragment.this);
            this.f52897b = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public HashTagPageFragment createFragment(int i11) {
            String title;
            HashTagPageFragment.Companion c15199a = HashTagPageFragment.INSTANCE;
            String id2 = ((HashTagTab) this.f52897b.get(i11)).getId();
            String str = UGCHashTagFragment.this.fromOptId;
            UGCVideoHashTag uGCVideoHashTag = UGCHashTagFragment.this.mainHasTag;
            if (uGCVideoHashTag == null || (title = uGCVideoHashTag.getTitle()) == null) {
                title = "";
            }
            HashTagPageFragment hashTagPageFragmentM67847a = c15199a.m67847a(id2, str, title, UGCHashTagFragment.this.ugcVideoId);
            hashTagPageFragmentM67847a.m67845F0(new a(this.f52897b, UGCHashTagFragment.this));
            return hashTagPageFragmentM67847a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f52897b.size();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.UGCHashTagFragment$e */
    public static final class C15211e extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f52900a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ UGCHashTagFragment f52901b;

        C15211e(List list, UGCHashTagFragment uGCHashTagFragment) {
            this.f52900a = list;
            this.f52901b = uGCHashTagFragment;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            MagicIndicator magicIndicator;
            super.onPageScrollStateChanged(i11);
            C24694p mViewBinding = this.f52901b.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f75535c) == null) {
                return;
            }
            magicIndicator.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            MagicIndicator magicIndicator;
            super.onPageScrolled(i11, f11, i12);
            C24694p mViewBinding = this.f52901b.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f75535c) == null) {
                return;
            }
            magicIndicator.onPageScrolled(i11, f11, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            MagicIndicator magicIndicator;
            super.onPageSelected(i11);
            String id2 = ((HashTagTab) this.f52900a.get(i11)).getId();
            C26866a.a.m104898f(C26866a.f81698a, "/home/hashtag", "onPageSelected: position=" + i11 + ", filterId=" + id2, false, 4, null);
            this.f52901b.m67856i0().m68492w(id2);
            C24694p mViewBinding = this.f52901b.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f75535c) == null) {
                return;
            }
            magicIndicator.onPageSelected(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public final HashTagViewModel m67856i0() {
        return (HashTagViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    private final void m67857j0(List tabTitles) {
        MagicIndicator magicIndicator;
        CommonNavigator commonNavigator = new CommonNavigator(requireContext());
        commonNavigator.setAdapter(new C15209c(tabTitles, this));
        C24694p mViewBinding = getMViewBinding();
        if (mViewBinding == null || (magicIndicator = mViewBinding.f75535c) == null) {
            return;
        }
        magicIndicator.setNavigator(commonNavigator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m67858k0(UGCHashTagFragment uGCHashTagFragment) {
        MagicIndicator magicIndicator;
        C24694p mViewBinding = uGCHashTagFragment.getMViewBinding();
        if (mViewBinding == null || (magicIndicator = mViewBinding.f75535c) == null) {
            return;
        }
        magicIndicator.onPageSelected(0);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C24694p getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24694p c24694pM96989c = C24694p.m96989c(inflater);
        Intrinsics.m97801g(c24694pM96989c, "inflate(...)");
        return c24694pM96989c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        String string;
        String stringExtra;
        Intent intent;
        Intent intent2;
        Uri data;
        ViewPager2 viewPager2;
        UGCVideoHashTag uGCVideoHashTag;
        String tag;
        MagicIndicator magicIndicator;
        HashMap mapM96844g;
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("hashtag") : null;
        Bundle arguments2 = getArguments();
        String string3 = "";
        if (arguments2 == null || (string = arguments2.getString("fromOptId")) == null) {
            string = "";
        }
        this.fromOptId = string;
        Bundle arguments3 = getArguments();
        this.ugcVideoId = arguments3 != null ? arguments3.getString("UGCVideoId") : null;
        Bundle arguments4 = getArguments();
        this.tabId = arguments4 != null ? arguments4.getInt("tabId", 0) : 0;
        if (string2 == null || string2.length() == 0) {
            FragmentActivity activity = getActivity();
            if (activity == null || (intent2 = activity.getIntent()) == null || (data = intent2.getData()) == null || (stringExtra = data.getQueryParameter("hashtag")) == null) {
                FragmentActivity activity2 = getActivity();
                stringExtra = (activity2 == null || (intent = activity2.getIntent()) == null) ? null : intent.getStringExtra("hashtag");
            }
            if (stringExtra == null || stringExtra.length() == 0) {
                Bundle arguments5 = getArguments();
                this.mainHasTag = arguments5 != null ? (UGCVideoHashTag) arguments5.getParcelable("hash_tag") : null;
                Bundle arguments6 = getArguments();
                this.hasTagList = arguments6 != null ? arguments6.getParcelableArrayList("hash_tags") : null;
            } else {
                Pair pairM68494y = m67856i0().m68494y(stringExtra);
                this.mainHasTag = (UGCVideoHashTag) pairM68494y.getFirst();
                this.hasTagList = (List) pairM68494y.getSecond();
            }
        } else {
            Pair pairM68494y2 = m67856i0().m68494y(string2);
            this.mainHasTag = (UGCVideoHashTag) pairM68494y2.getFirst();
            this.hasTagList = (List) pairM68494y2.getSecond();
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            mapM96844g.put(WebConstants.PAGE_FROM, C24662i.f75350a.m96877i());
            mapM96844g.put("from_opt_id", this.fromOptId);
        }
        C26866a.a aVar = C26866a.f81698a;
        UGCVideoHashTag uGCVideoHashTag2 = this.mainHasTag;
        String title = uGCVideoHashTag2 != null ? uGCVideoHashTag2.getTitle() : null;
        List list = this.hasTagList;
        C26866a.a.m104898f(aVar, "/home/hashtag", "initView: hashTag=" + title + ", hashTags size=" + (list != null ? Integer.valueOf(list.size()) : null), false, 4, null);
        m67856i0().m68488r(this.mainHasTag, this.hasTagList, this.tabId, this.ugcVideoId);
        List listM68486m = m67856i0().m68486m();
        C26866a.a.m104898f(aVar, "/home/hashtag", "initView: filters size=" + listM68486m.size(), false, 4, null);
        C24694p mViewBinding = getMViewBinding();
        if (mViewBinding == null || (viewPager2 = mViewBinding.f75536d) == null) {
            return;
        }
        viewPager2.setAdapter(new C15210d(listM68486m));
        List list2 = listM68486m;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((HashTagTab) it.next()).getName());
        }
        m67857j0(arrayList);
        viewPager2.registerOnPageChangeCallback(new C15211e(listM68486m, this));
        viewPager2.setUserInputEnabled(true);
        viewPager2.setCurrentItem(0, false);
        C24694p mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (magicIndicator = mViewBinding2.f75535c) != null) {
            magicIndicator.post(new Runnable() { // from class: com.transsion.home.fragment.hashtag.n
                @Override // java.lang.Runnable
                public final void run() {
                    UGCHashTagFragment.m67858k0(this.f52919a);
                }
            });
        }
        UGCVideoHashTag uGCVideoHashTag3 = this.mainHasTag;
        if ((uGCVideoHashTag3 != null && (tag = uGCVideoHashTag3.getTitle()) != null) || ((uGCVideoHashTag = this.mainHasTag) != null && (tag = uGCVideoHashTag.getTag()) != null)) {
            string3 = tag;
        }
        if (!StringsKt.m98132c0(string3, Utils.SEPARATOR, false, 2, null)) {
            string3 = getString(R$string.ugc_hashtag_page_title, string3);
            Intrinsics.m97799e(string3);
        }
        InterfaceC15208b interfaceC15208b = this.titleUpdateCallback;
        if (interfaceC15208b != null) {
            interfaceC15208b.mo66703j(string3);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b("/home/hashtag", false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.m97802h(context, "context");
        super.onAttach(context);
        KeyEventDispatcher.Component activity = getActivity();
        this.titleUpdateCallback = activity instanceof InterfaceC15208b ? (InterfaceC15208b) activity : null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C26866a.a aVar = C26866a.f81698a;
        UGCVideoHashTag uGCVideoHashTag = this.mainHasTag;
        C26866a.a.m104898f(aVar, "/home/hashtag", "resume hashtag: " + (uGCVideoHashTag != null ? uGCVideoHashTag.getTitle() : null), false, 4, null);
    }
}
