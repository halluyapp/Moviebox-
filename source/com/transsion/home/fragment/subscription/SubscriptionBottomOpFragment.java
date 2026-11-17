package com.transsion.home.fragment.subscription;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC5781d;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.home.R$id;
import com.transsion.home.fragment.subscription.SubscriptionBottomOpFragment;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.room.sub.fragment.subscription.SubscriptionFragment;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p016ak.C0117a;
import p016ak.InterfaceC0118b;
import p552kl.C24685k;
import p710qk.InterfaceC27086e;
import p842vl.C28119a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m97100d2 = {"Lcom/transsion/home/fragment/subscription/SubscriptionBottomOpFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lkl/k;", "<init>", "()V", "", "h0", "g0", "d0", "Landroid/view/LayoutInflater;", "inflater", "c0", "(Landroid/view/LayoutInflater;)Lkl/k;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "lazyLoadData", "onResume", "", "a", "I", "tabId", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "tabCode", "c", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SubscriptionBottomOpFragment extends BaseFragment<C24685k> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final int f53079d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int tabId = HomeTabId.INSTANCE.m67536e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String tabCode;

    /* JADX INFO: renamed from: com.transsion.home.fragment.subscription.SubscriptionBottomOpFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubscriptionBottomOpFragment m68096a(int i11, String str) {
            Bundle bundle = new Bundle();
            bundle.putInt("tab_id", i11);
            bundle.putString(WebConstants.TAB_CODE, str);
            SubscriptionBottomOpFragment subscriptionBottomOpFragment = new SubscriptionBottomOpFragment();
            subscriptionBottomOpFragment.setArguments(bundle);
            return subscriptionBottomOpFragment;
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m68090d0() {
        getChildFragmentManager().m14557p().m14813s(R$id.bottom_op_container, SubscriptionFragment.INSTANCE.m77316a()).mo14670i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m68091e0(SubscriptionBottomOpFragment subscriptionBottomOpFragment, View view) {
        InterfaceC0118b interfaceC0118b = (InterfaceC0118b) C0117a.f402a.m550a(InterfaceC0118b.class);
        if (interfaceC0118b != null) {
            Context contextRequireContext = subscriptionBottomOpFragment.requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            interfaceC0118b.mo553c("", contextRequireContext);
        }
        subscriptionBottomOpFragment.m68094h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m68092f0(SubscriptionBottomOpFragment subscriptionBottomOpFragment, View view) {
        Navigator.m61845x(TheRouter.m61773c("/commercial/playstore"), subscriptionBottomOpFragment.requireContext(), null, 2, null);
        subscriptionBottomOpFragment.m68093g0();
    }

    /* JADX INFO: renamed from: g0 */
    private final void m68093g0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "app_center");
        C14450a.f50860a.m65146i(SubTabFragment.INSTANCE.m68282a(this.tabId), linkedHashMap);
    }

    /* JADX INFO: renamed from: h0 */
    private final void m68094h0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "search");
        linkedHashMap.put("hot_search_word", "");
        C14450a.f50860a.m65146i(SubTabFragment.INSTANCE.m68282a(this.tabId), linkedHashMap);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C24685k getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24685k c24685kM96959c = C24685k.m96959c(inflater);
        Intrinsics.m97801g(c24685kM96959c, "inflate(...)");
        return c24685kM96959c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        C24685k mViewBinding;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        this.tabId = arguments != null ? arguments.getInt("tab_id") : this.tabId;
        Bundle arguments2 = getArguments();
        ViewGroup.LayoutParams layoutParams = null;
        this.tabCode = arguments2 != null ? arguments2.getString(WebConstants.TAB_CODE) : null;
        m68090d0();
        C24685k mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (constraintLayout = mViewBinding2.f75483f) != null) {
            layoutParams = constraintLayout.getLayoutParams();
        }
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C2308b) layoutParams)).topMargin = AbstractC5781d.m27351c();
        C24685k mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (appCompatImageView3 = mViewBinding3.f75480c) != null) {
            appCompatImageView3.setOnClickListener(new View.OnClickListener() { // from class: ql.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubscriptionBottomOpFragment.m68091e0(this.f82175a, view2);
                }
            });
        }
        C24685k mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (appCompatImageView2 = mViewBinding4.f75481d) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: ql.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubscriptionBottomOpFragment.m68092f0(this.f82176a, view2);
                }
            });
        }
        InterfaceC27086e interfaceC27086e = (InterfaceC27086e) TheRouter.m61774d(InterfaceC27086e.class, new Object[0]);
        if ((interfaceC27086e != null && interfaceC27086e.mo66015a() && !C28119a.f86297a.m109207a()) || (mViewBinding = getMViewBinding()) == null || (appCompatImageView = mViewBinding.f75481d) == null) {
            return;
        }
        AbstractC26006c.m102054g(appCompatImageView);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
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
