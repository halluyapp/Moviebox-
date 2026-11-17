package com.transsion.postdetail.shorttv;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ck.C5127x;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5790i;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.GradientLinePagerIndicator;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.p306ui.fragment.ShortTvVideoFragment;
import com.transsion.postdetail.p306ui.fragment.VideoFragment;
import com.transsion.postdetail.shorttv.widget.ShortTVTabTitleView;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.R$id;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import p844vo.C28172r;
import p913xm.C28615f;
import p925xy.C28674d;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0004J!\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u0004J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b#\u0010\u0013J\u0017\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, m97100d2 = {"Lcom/transsion/postdetail/shorttv/ShortTVHomeFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lvo/r;", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "p0", "()Landroidx/fragment/app/Fragment;", "", "initViewPager", "k0", "", RequestParameters.POSITION, "", "isBanner", "o0", "(IZ)V", "isWhiteFont", "n0", "(Z)V", "isWhiteBg", "l0", "s0", "()Z", "Landroid/view/LayoutInflater;", "inflater", "q0", "(Landroid/view/LayoutInflater;)Lvo/r;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "m0", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "[Ljava/lang/Integer;", "tabs", "", "Lcom/transsion/postdetail/shorttv/widget/ShortTVTabTitleView;", "c", "Ljava/util/Map;", "tabTitleViewMap", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/CommonNavigator;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/CommonNavigator;", "commonNavigator", "e", "I", "defaultTabIndex", "f", "selectTabIndex", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "g", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "vpAdapter", "h", "Ljava/lang/Integer;", "selectedColor", "i", "normalColor", "j", "Z", CampaignEx.JSON_KEY_AD_K, "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTVHomeFragment extends BaseFragment<C28172r> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = ShortTVHomeFragment.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer[] tabs = {Integer.valueOf(R$string.discover), Integer.valueOf(R$string.title_for_you)};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map tabTitleViewMap = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private CommonNavigator commonNavigator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int defaultTabIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int selectTabIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private FragmentStateAdapter vpAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Integer selectedColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Integer normalColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isBanner;

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.ShortTVHomeFragment$b */
    public static final class C16862b extends AbstractC25775a {

        /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.ShortTVHomeFragment$b$a */
        public static final class a extends AbstractViewOnClickListenerC14560f {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ ShortTVHomeFragment f56733e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f56734f;

            a(ShortTVHomeFragment shortTVHomeFragment, int i11) {
                this.f56733e = shortTVHomeFragment;
                this.f56734f = i11;
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: c */
            public void mo64493c(View view) {
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: d */
            public void mo64494d(View view) {
                ViewPager2 viewPager2;
                C28172r mViewBinding = this.f56733e.getMViewBinding();
                if (mViewBinding != null && (viewPager2 = mViewBinding.f86609c) != null) {
                    viewPager2.setCurrentItem(this.f56734f, false);
                }
                if (this.f56734f == 0) {
                    this.f56733e.selectTabIndex = 0;
                }
            }
        }

        C16862b() {
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return ShortTVHomeFragment.this.tabs.length;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            Context contextRequireContext = ShortTVHomeFragment.this.requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            GradientLinePagerIndicator gradientLinePagerIndicator = new GradientLinePagerIndicator(contextRequireContext);
            ShortTVHomeFragment shortTVHomeFragment = ShortTVHomeFragment.this;
            gradientLinePagerIndicator.setMode(2);
            gradientLinePagerIndicator.setLineHeight(AbstractC5790i.m27411e(3.0f));
            gradientLinePagerIndicator.setLineWidth(AbstractC5790i.m27411e(24.0f));
            gradientLinePagerIndicator.setRoundRadius(AbstractC5790i.m27411e(1.5f));
            gradientLinePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
            gradientLinePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
            gradientLinePagerIndicator.setColors(AbstractC2397b.getColor(shortTVHomeFragment.requireContext(), R$color.brand_gradient_start), AbstractC2397b.getColor(shortTVHomeFragment.requireContext(), R$color.brand_gradient_center), AbstractC2397b.getColor(shortTVHomeFragment.requireContext(), R$color.brand_gradient_end));
            return gradientLinePagerIndicator;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, int i11) {
            Intrinsics.m97802h(context, "context");
            ShortTVTabTitleView shortTVTabTitleView = new ShortTVTabTitleView(context);
            ShortTVHomeFragment shortTVHomeFragment = ShortTVHomeFragment.this;
            shortTVTabTitleView.setTextById(shortTVHomeFragment.tabs[i11].intValue());
            shortTVTabTitleView.setOnClickListener(new a(shortTVHomeFragment, i11));
            shortTVHomeFragment.tabTitleViewMap.put(Integer.valueOf(i11), shortTVTabTitleView);
            return shortTVTabTitleView;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.ShortTVHomeFragment$c */
    public static final class C16863c extends ViewPager2.OnPageChangeCallback {
        C16863c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            MagicIndicator magicIndicator;
            super.onPageScrollStateChanged(i11);
            C28172r mViewBinding = ShortTVHomeFragment.this.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f86608b) == null) {
                return;
            }
            magicIndicator.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            MagicIndicator magicIndicator;
            super.onPageScrolled(i11, f11, i12);
            C28172r mViewBinding = ShortTVHomeFragment.this.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f86608b) == null) {
                return;
            }
            magicIndicator.onPageScrolled(i11, f11, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            MagicIndicator magicIndicator;
            super.onPageSelected(i11);
            C28172r mViewBinding = ShortTVHomeFragment.this.getMViewBinding();
            if (mViewBinding != null && (magicIndicator = mViewBinding.f86608b) != null) {
                magicIndicator.onPageSelected(i11);
            }
            int unused = ShortTVHomeFragment.this.selectTabIndex;
            ShortTVHomeFragment.this.m73579l0(true);
            ShortTVHomeFragment.this.m73580n0(true);
            ShortTVHomeFragment.this.selectTabIndex = i11;
            ShortTVHomeFragment shortTVHomeFragment = ShortTVHomeFragment.this;
            shortTVHomeFragment.m73585m0(shortTVHomeFragment.isBanner);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.ShortTVHomeFragment$d */
    public static final class C16864d extends FragmentStateAdapter {
        C16864d() {
            super(ShortTVHomeFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            C26866a.a aVar = C26866a.f81698a;
            String str = ShortTVHomeFragment.this.TAG;
            Intrinsics.m97801g(str, "access$getTAG$p(...)");
            C26866a.a.m104898f(aVar, str, "createFragment, position:" + i11, false, 4, null);
            return ShortTVHomeFragment.this.m73582p0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ShortTVHomeFragment.this.tabs.length;
        }
    }

    private final void initViewPager() {
        ViewPager2 viewPager2;
        this.vpAdapter = new C16864d();
        C28172r mViewBinding = getMViewBinding();
        if (mViewBinding != null && (viewPager2 = mViewBinding.f86609c) != null) {
            viewPager2.setAdapter(this.vpAdapter);
        }
        m73578k0();
        new Handler().postDelayed(new Runnable() { // from class: com.transsion.postdetail.shorttv.i
            @Override // java.lang.Runnable
            public final void run() {
                ShortTVHomeFragment.m73583r0(this.f56787a);
            }
        }, 10L);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m73578k0() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        MagicIndicator magicIndicator;
        CommonNavigator commonNavigator = new CommonNavigator(requireContext());
        commonNavigator.setFollowTouch(true);
        commonNavigator.setAdapter(new C16862b());
        this.commonNavigator = commonNavigator;
        C28172r mViewBinding = getMViewBinding();
        if (mViewBinding != null && (magicIndicator = mViewBinding.f86608b) != null) {
            magicIndicator.setNavigator(this.commonNavigator);
        }
        C28172r mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (viewPager3 = mViewBinding2.f86609c) != null) {
            viewPager3.registerOnPageChangeCallback(new C16863c());
        }
        C28172r mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (viewPager2 = mViewBinding3.f86609c) == null) {
            return;
        }
        viewPager2.setCurrentItem(this.selectTabIndex, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public final void m73579l0(boolean isWhiteBg) {
        if (isVisible()) {
            C28674d c28674d = new C28674d(isWhiteBg);
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C28674d.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c28674d, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final void m73580n0(boolean isWhiteFont) {
        ImmersionBar immersionBarWith = ImmersionBar.with(this);
        boolean z11 = false;
        if (!isWhiteFont && !C5127x.f17620a.m23969a()) {
            z11 = true;
        }
        immersionBarWith.statusBarDarkFont(z11);
        immersionBarWith.init();
    }

    /* JADX INFO: renamed from: o0 */
    private final void m73581o0(int position, boolean isBanner) {
        LinearLayout linearLayout;
        Context contextRequireContext = requireContext();
        Integer num = this.selectedColor;
        int color = AbstractC2397b.getColor(contextRequireContext, num != null ? num.intValue() : R$color.text_01);
        Context contextRequireContext2 = requireContext();
        Integer num2 = this.normalColor;
        int color2 = AbstractC2397b.getColor(contextRequireContext2, num2 != null ? num2.intValue() : com.transsion.postdetail.R$color.short_tv_top_title_gray_color);
        int color3 = AbstractC2397b.getColor(requireContext(), R$color.white);
        int color4 = AbstractC2397b.getColor(requireContext(), R$color.white_60);
        CommonNavigator commonNavigator = this.commonNavigator;
        if (commonNavigator != null) {
            LinearLayout linearLayout2 = (LinearLayout) commonNavigator.findViewById(R$id.title_container);
            View childAt = linearLayout2.getChildAt(0);
            View childAt2 = linearLayout2.getChildAt(1);
            if (position != 0) {
                if (position == 1) {
                    if (childAt instanceof ShortTVTabTitleView) {
                        ShortTVTabTitleView shortTVTabTitleView = (ShortTVTabTitleView) childAt;
                        shortTVTabTitleView.setNormalColor(color4);
                        shortTVTabTitleView.setTextColor(color4);
                    }
                    if (childAt2 instanceof ShortTVTabTitleView) {
                        ShortTVTabTitleView shortTVTabTitleView2 = (ShortTVTabTitleView) childAt2;
                        shortTVTabTitleView2.setSelectedColor(color3);
                        shortTVTabTitleView2.setTextColor(color3);
                    }
                }
            } else if (isBanner) {
                if (childAt instanceof ShortTVTabTitleView) {
                    ShortTVTabTitleView shortTVTabTitleView3 = (ShortTVTabTitleView) childAt;
                    shortTVTabTitleView3.setSelectedColor(color3);
                    shortTVTabTitleView3.setTextColor(color3);
                }
                if (childAt2 instanceof ShortTVTabTitleView) {
                    ShortTVTabTitleView shortTVTabTitleView4 = (ShortTVTabTitleView) childAt2;
                    shortTVTabTitleView4.setNormalColor(color4);
                    shortTVTabTitleView4.setTextColor(color4);
                }
            } else {
                if (childAt instanceof ShortTVTabTitleView) {
                    ShortTVTabTitleView shortTVTabTitleView5 = (ShortTVTabTitleView) childAt;
                    shortTVTabTitleView5.setSelectedColor(color);
                    shortTVTabTitleView5.setTextColor(color);
                }
                if (childAt2 instanceof ShortTVTabTitleView) {
                    ShortTVTabTitleView shortTVTabTitleView6 = (ShortTVTabTitleView) childAt2;
                    shortTVTabTitleView6.setNormalColor(color2);
                    shortTVTabTitleView6.setTextColor(color2);
                }
            }
            for (View view : CollectionsKt.m97509o(childAt, childAt2)) {
                ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
                Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                view.setLayoutParams(layoutParams2);
            }
        }
        CommonNavigator commonNavigator2 = this.commonNavigator;
        if (commonNavigator2 == null || (linearLayout = (LinearLayout) commonNavigator2.findViewById(R$id.indicator_container)) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            int childCount = linearLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt3 = linearLayout.getChildAt(i11);
                GradientLinePagerIndicator gradientLinePagerIndicator = childAt3 instanceof GradientLinePagerIndicator ? (GradientLinePagerIndicator) childAt3 : null;
                if (isBanner || this.selectTabIndex != 0) {
                    if (gradientLinePagerIndicator != null) {
                        gradientLinePagerIndicator.setColors(color3, color3, color3);
                    }
                } else if (gradientLinePagerIndicator != null) {
                    gradientLinePagerIndicator.setColors(AbstractC2397b.getColor(requireContext(), R$color.brand_gradient_start), AbstractC2397b.getColor(requireContext(), R$color.brand_gradient_center), AbstractC2397b.getColor(requireContext(), R$color.brand_gradient_end));
                }
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public final Fragment m73582p0() {
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_for_you_mode", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        if (value != null && value.length() != 0 && !Intrinsics.m97797c(value, "1")) {
            return VideoFragment.INSTANCE.m74528a(null, null, null, true, (704 & 16) != 0, (704 & 32) != 0 ? "" : null, (704 & 64) != 0 ? false : true, (704 & 128) != 0 ? "" : null, (704 & 256) != 0 ? null : null, (704 & 512) != 0 ? false : false, (704 & 1024) != 0 ? null : null, (704 & 2048) != 0 ? false : false, (704 & 4096) != 0 ? false : false);
        }
        ShortTvVideoFragment.Companion companion = ShortTvVideoFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        return companion.m74509a(contextRequireContext, null, null, null, true, (64 & 32) != 0, (64 & 64) != 0 ? "" : null, (64 & 128) != 0 ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m73583r0(ShortTVHomeFragment shortTVHomeFragment) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (shortTVHomeFragment.isAdded() && shortTVHomeFragment.getContext() != null) {
                shortTVHomeFragment.m73585m0(shortTVHomeFragment.isBanner);
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final boolean m73584s0() {
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("shorts_tab_in_for_you", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        if (value == null) {
            return false;
        }
        return Intrinsics.m97797c(value, "true");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        MagicIndicator magicIndicator;
        Intrinsics.m97802h(view, "view");
        C28172r mViewBinding = getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (mViewBinding == null || (magicIndicator = mViewBinding.f86608b) == null) ? null : magicIndicator.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = AbstractC5781d.m27351c();
        ?? M73584s0 = m73584s0();
        this.defaultTabIndex = M73584s0;
        int i11 = M73584s0;
        if (savedInstanceState != 0) {
            i11 = savedInstanceState.getInt("CURRENT_TAB", M73584s0);
        }
        this.selectTabIndex = i11;
        this.isBanner = savedInstanceState != 0 ? savedInstanceState.getBoolean("IS_BANNER", true) : true;
        initViewPager();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    /* JADX INFO: renamed from: m0 */
    public final void m73585m0(boolean isBanner) {
        this.isBanner = isBanner;
        m73581o0(this.selectTabIndex, isBanner);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("CURRENT_TAB", this.selectTabIndex);
        outState.putBoolean("IS_BANNER", this.isBanner);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C28172r getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28172r c28172rM109370c = C28172r.m109370c(inflater);
        Intrinsics.m97801g(c28172rM109370c, "inflate(...)");
        return c28172rM109370c;
    }
}
