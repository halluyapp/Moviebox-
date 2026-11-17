package com.transsion.home.fragment.bottom;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ck.C5110g;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.TnTextView;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.home.R$id;
import com.transsion.home.adapter.C14837c;
import com.transsion.home.adapter.C14838d;
import com.transsion.home.fragment.bottom.BottomOpFragment;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import ng.AbstractC26006c;
import p016ak.C0117a;
import p016ak.InterfaceC0118b;
import p550kj.C24655b;
import p552kl.C24683j;
import p710qk.InterfaceC27086e;
import p842vl.C28119a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004R\u0016\u0010#\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, m97100d2 = {"Lcom/transsion/home/fragment/bottom/BottomOpFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lkl/j;", "<init>", "()V", "", "k0", "j0", "f0", "e0", "i0", "Landroid/view/LayoutInflater;", "inflater", "d0", "(Landroid/view/LayoutInflater;)Lkl/j;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "c0", "()I", "lazyLoadData", "onResume", "a", "I", "tabId", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "tabCode", "c", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class BottomOpFragment extends BaseFragment<C24683j> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final int f52671d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int tabId = HomeTabId.INSTANCE.m67536e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String tabCode;

    /* JADX INFO: renamed from: com.transsion.home.fragment.bottom.BottomOpFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final BottomOpFragment m67552a(int i11, String str) {
            Bundle bundle = new Bundle();
            bundle.putInt("tab_id", i11);
            bundle.putString(WebConstants.TAB_CODE, str);
            BottomOpFragment bottomOpFragment = new BottomOpFragment();
            bottomOpFragment.setArguments(bundle);
            return bottomOpFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.bottom.BottomOpFragment$b */
    public static final class C15131b extends ViewPager2.OnPageChangeCallback {
        C15131b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m67554b(BottomOpFragment bottomOpFragment, int i11) {
            MagicIndicator magicIndicator;
            C24683j mViewBinding = bottomOpFragment.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f75471h) == null) {
                return;
            }
            magicIndicator.onPageSelected(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            MagicIndicator magicIndicator;
            super.onPageScrollStateChanged(i11);
            C24683j mViewBinding = BottomOpFragment.this.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f75471h) == null) {
                return;
            }
            magicIndicator.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            MagicIndicator magicIndicator;
            super.onPageScrolled(i11, f11, i12);
            C24683j mViewBinding = BottomOpFragment.this.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f75471h) == null) {
                return;
            }
            magicIndicator.onPageScrolled(i11, f11, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(final int i11) {
            View view;
            View view2;
            MagicIndicator magicIndicator;
            super.onPageSelected(i11);
            C24683j mViewBinding = BottomOpFragment.this.getMViewBinding();
            if (mViewBinding != null && (magicIndicator = mViewBinding.f75471h) != null) {
                final BottomOpFragment bottomOpFragment = BottomOpFragment.this;
                magicIndicator.post(new Runnable() { // from class: nl.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomOpFragment.C15131b.m67554b(bottomOpFragment, i11);
                    }
                });
            }
            if (i11 == 0) {
                C24683j mViewBinding2 = BottomOpFragment.this.getMViewBinding();
                if (mViewBinding2 == null || (view2 = mViewBinding2.f75473j) == null) {
                    return;
                }
                view2.setVisibility(8);
                return;
            }
            C24683j mViewBinding3 = BottomOpFragment.this.getMViewBinding();
            if (mViewBinding3 == null || (view = mViewBinding3.f75473j) == null) {
                return;
            }
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private final void m67543e0() {
        MagicIndicator magicIndicator;
        FrameLayout frameLayout;
        C24683j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (frameLayout = mViewBinding.f75465b) != null) {
            AbstractC26006c.m102055h(frameLayout);
        }
        CommonNavigator commonNavigator = new CommonNavigator(getContext());
        commonNavigator.setAdapter(new C14838d(getMViewBinding()));
        C24683j mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (magicIndicator = mViewBinding2.f75471h) == null) {
            return;
        }
        magicIndicator.setNavigator(commonNavigator);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m67544f0() {
        View view;
        MagicIndicator magicIndicator;
        ViewPager2 viewPager2;
        C24683j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (viewPager2 = mViewBinding.f75474k) != null) {
            AbstractC26006c.m102055h(viewPager2);
        }
        C24683j mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (magicIndicator = mViewBinding2.f75471h) != null) {
            AbstractC26006c.m102055h(magicIndicator);
        }
        C24683j mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (view = mViewBinding3.f75473j) != null) {
            AbstractC26006c.m102055h(view);
        }
        Bundle arguments = getArguments();
        getChildFragmentManager().m14557p().m14813s(R$id.bottom_op_container, SubTabFragment.INSTANCE.m68283b(this.tabId, arguments != null ? arguments.getString(WebConstants.TAB_CODE) : null)).mo14670i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m67545g0(BottomOpFragment bottomOpFragment, View view) {
        InterfaceC0118b interfaceC0118b = (InterfaceC0118b) C0117a.f402a.m550a(InterfaceC0118b.class);
        if (interfaceC0118b != null) {
            Context contextRequireContext = bottomOpFragment.requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            interfaceC0118b.mo553c("", contextRequireContext);
        }
        bottomOpFragment.m67549k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m67546h0(BottomOpFragment bottomOpFragment, View view) {
        Navigator.m61845x(TheRouter.m61773c("/commercial/playstore"), bottomOpFragment.requireContext(), null, 2, null);
        bottomOpFragment.m67548j0();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m67547i0() {
        ViewPager2 viewPager2;
        C24683j mViewBinding = getMViewBinding();
        C14837c c14837c = new C14837c(mViewBinding != null ? mViewBinding.f75474k : null, this.tabId, this.tabCode, this);
        C24683j mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null) {
            mViewBinding2.f75474k.setAdapter(c14837c);
        }
        C24683j mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (viewPager2 = mViewBinding3.f75474k) == null) {
            return;
        }
        viewPager2.registerOnPageChangeCallback(new C15131b());
    }

    /* JADX INFO: renamed from: j0 */
    private final void m67548j0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "app_center");
        C14450a.f50860a.m65146i(SubTabFragment.INSTANCE.m68282a(this.tabId), linkedHashMap);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m67549k0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "search");
        linkedHashMap.put("hot_search_word", "");
        C14450a.f50860a.m65146i(SubTabFragment.INSTANCE.m68282a(this.tabId), linkedHashMap);
    }

    /* JADX INFO: renamed from: c0 */
    public final int m67550c0() {
        int iM27313a = AbstractC5776a0.m27313a(56.0f) + AbstractC5781d.m27351c();
        return this.tabId == HomeTabId.INSTANCE.m67536e() ? iM27313a + AbstractC5776a0.m27313a(22.0f) : iM27313a;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C24683j getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24683j c24683jM96952c = C24683j.m96952c(inflater);
        Intrinsics.m97801g(c24683jM96952c, "inflate(...)");
        return c24683jM96952c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        C24683j mViewBinding;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        TnTextView tnTextView;
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        this.tabId = arguments != null ? arguments.getInt("tab_id") : this.tabId;
        Bundle arguments2 = getArguments();
        ViewGroup.LayoutParams layoutParams = null;
        this.tabCode = arguments2 != null ? arguments2.getString(WebConstants.TAB_CODE) : null;
        if (this.tabId != HomeTabId.INSTANCE.m67536e() || C5110g.f17601a.m23911b()) {
            m67544f0();
        } else {
            m67547i0();
            m67543e0();
        }
        C24683j mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (constraintLayout = mViewBinding2.f75469f) != null) {
            layoutParams = constraintLayout.getLayoutParams();
        }
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C2308b) layoutParams)).topMargin = AbstractC5781d.m27351c();
        C24683j mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (tnTextView = mViewBinding3.f75470g) != null) {
            tnTextView.setOnClickListener(new View.OnClickListener() { // from class: nl.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BottomOpFragment.m67545g0(this.f79513a, view2);
                }
            });
        }
        C24683j mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (appCompatImageView2 = mViewBinding4.f75467d) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: nl.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BottomOpFragment.m67546h0(this.f79514a, view2);
                }
            });
        }
        InterfaceC27086e interfaceC27086e = (InterfaceC27086e) TheRouter.m61774d(InterfaceC27086e.class, new Object[0]);
        if ((interfaceC27086e != null && interfaceC27086e.mo66015a() && !C28119a.f86297a.m109207a()) || (mViewBinding = getMViewBinding()) == null || (appCompatImageView = mViewBinding.f75467d) == null) {
            return;
        }
        AbstractC26006c.m102054g(appCompatImageView);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        String str = this.tabCode;
        if (str == null) {
            str = "BottomOpFragment: " + this.tabId;
        }
        return new C24655b(str, false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
