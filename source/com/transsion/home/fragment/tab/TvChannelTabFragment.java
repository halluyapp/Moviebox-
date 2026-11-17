package com.transsion.home.fragment.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.AbstractC2411d;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.home.R$id;
import com.transsion.home.p294tv.fragment.TVChannelHomeFragment;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24655b;
import p552kl.C24668b0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m97100d2 = {"Lcom/transsion/home/fragment/tab/TvChannelTabFragment;", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lkl/b0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "r0", "(Landroid/view/LayoutInflater;)Lkl/b0;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "Lcom/transsion/home/tv/fragment/TVChannelHomeFragment;", "g", "Lcom/transsion/home/tv/fragment/TVChannelHomeFragment;", "tvChannelHomeFragment", "h", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class TvChannelTabFragment extends BaseHomeSubFragment<C24668b0> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static final int f53208i = 8;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private TVChannelHomeFragment tvChannelHomeFragment;

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.TvChannelTabFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final TvChannelTabFragment m68468a(int i11) {
            TvChannelTabFragment tvChannelTabFragment = new TvChannelTabFragment();
            tvChannelTabFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("tab_id", Integer.valueOf(i11))));
            return tvChannelTabFragment;
        }
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: f0 */
    public RecyclerView mo67723f0() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        View view2;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.m97802h(view, "view");
        super.initView(view, savedInstanceState);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96849l(false);
            logViewConfig.m96850m(false);
        }
        C24668b0 c24668b0 = (C24668b0) getMViewBinding();
        if (c24668b0 == null || (view2 = c24668b0.f75374c) == null || (layoutParams = view2.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = m68103h0();
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: l0 */
    public void mo67725l0(int lastAdPosition, BiddingNativeManager wrapperNativeManager) {
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        TVChannelHomeFragment tVChannelHomeFragment = this.tvChannelHomeFragment;
        if (tVChannelHomeFragment != null) {
            getChildFragmentManager().m14557p().m14813s(R$id.fl_container, tVChannelHomeFragment).mo14670i();
        }
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.tvChannelHomeFragment = TVChannelHomeFragment.INSTANCE.m68666b(arguments != null ? arguments.getInt("tab_id") : 0);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C24668b0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24668b0 c24668b0M96902c = C24668b0.m96902c(inflater);
        Intrinsics.m97801g(c24668b0M96902c, "inflate(...)");
        return c24668b0M96902c;
    }
}
