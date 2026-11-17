package com.transsion.home.fragment.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.os.AbstractC2411d;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.home.R$id;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.postdetail.shorttv.factory.C16886a;
import com.transsion.postdetail.shorttv.factory.C16894i;
import com.transsion.shorttv.p315ui.fragment.ShortTVDiscoverFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p357dt.C23049a;
import p552kl.C24702x;
import p717qr.C27124c;
import ws.InterfaceC28435a;
import yt.InterfaceC29008a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u0001/\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u001f\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, m97100d2 = {"Lcom/transsion/home/fragment/tab/SubShortTvFragment;", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lkl/x;", "<init>", "()V", "", "y0", "", "alpha", "E0", "(F)V", "z0", "()F", "Landroid/view/LayoutInflater;", "inflater", "A0", "(Landroid/view/LayoutInflater;)Lkl/x;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "p0", "", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "", "g", "Z", "mHasTranslateWindow", "h", "I", "mHeaderBgHeight", "i", "mIsFirstRender", "Lcom/transsion/shorttv/ui/fragment/ShortTVDiscoverFragment;", "j", "Lcom/transsion/shorttv/ui/fragment/ShortTVDiscoverFragment;", "shorTvFragment", "com/transsion/home/fragment/tab/SubShortTvFragment$b", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/home/fragment/tab/SubShortTvFragment$b;", "mRecycleScrollListener", "l", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SubShortTvFragment extends BaseHomeSubFragment<C24702x> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    public static final int f53125m = 8;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mHasTranslateWindow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mHeaderBgHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ShortTVDiscoverFragment shorTvFragment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean mIsFirstRender = true;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C15308b mRecycleScrollListener = new C15308b();

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.SubShortTvFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubShortTvFragment m68222a(int i11) {
            SubShortTvFragment subShortTvFragment = new SubShortTvFragment();
            subShortTvFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("tab_id", Integer.valueOf(i11))));
            return subShortTvFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.tab.SubShortTvFragment$b */
    public static final class C15308b extends RecyclerView.AbstractC4219r {
        C15308b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            if (SubShortTvFragment.this.mHasTranslateWindow) {
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                SubShortTvFragment subShortTvFragment = SubShortTvFragment.this;
                subShortTvFragment.m68211E0(RangesKt.m97937g((iComputeVerticalScrollOffset * 1.0f) / subShortTvFragment.mHeaderBgHeight, 1.0f));
                if (!SubShortTvFragment.this.getMIsWhite() && SubShortTvFragment.this.m68220z0() < 0.7f) {
                    SubShortTvFragment.this.m68100b0(true);
                } else {
                    if (!SubShortTvFragment.this.getMIsWhite() || SubShortTvFragment.this.m68220z0() < 0.7f) {
                        return;
                    }
                    SubShortTvFragment.this.m68100b0(false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final InterfaceC28435a m68208B0() {
        return new C16894i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final InterfaceC29008a m68209C0() {
        return new C16886a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m68210D0(SubShortTvFragment subShortTvFragment, boolean z11) {
        subShortTvFragment.mHasTranslateWindow = z11;
        if (subShortTvFragment.mIsFirstRender) {
            subShortTvFragment.m68219y0();
            subShortTvFragment.mIsFirstRender = false;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public final void m68211E0(float alpha) {
        View view;
        C24702x c24702x = (C24702x) getMViewBinding();
        if (c24702x == null || (view = c24702x.f75592c) == null) {
            return;
        }
        view.setAlpha(alpha);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    private final void m68219y0() {
        View view;
        FrameLayout frameLayout;
        C24702x c24702x = (C24702x) getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (c24702x == null || (frameLayout = c24702x.f75591b) == null) ? null : frameLayout.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (this.mHasTranslateWindow) {
            layoutParams2.topMargin = 0;
            m68211E0(0.0f);
            m68100b0(true);
        } else {
            C24702x c24702x2 = (C24702x) getMViewBinding();
            layoutParams2.topMargin = (c24702x2 == null || (view = c24702x2.f75592c) == null) ? 0 : view.getHeight();
            m68211E0(1.0f);
            m68100b0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final float m68220z0() {
        View view;
        C24702x c24702x = (C24702x) getMViewBinding();
        if (c24702x == null || (view = c24702x.f75592c) == null) {
            return 0.0f;
        }
        return view.getAlpha();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public C24702x getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24702x c24702xM97021c = C24702x.m97021c(inflater);
        Intrinsics.m97801g(c24702xM97021c, "inflate(...)");
        return c24702xM97021c;
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
        C27124c.f82233a.m105539a(new Function0() { // from class: com.transsion.home.fragment.tab.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubShortTvFragment.m68208B0();
            }
        });
        C23049a.f70283a.m91695a(new Function0() { // from class: com.transsion.home.fragment.tab.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubShortTvFragment.m68209C0();
            }
        });
        this.shorTvFragment = ShortTVDiscoverFragment.INSTANCE.m79813a(true, getArguments());
        this.mHeaderBgHeight = m68103h0();
        C24702x c24702x = (C24702x) getMViewBinding();
        if (c24702x != null && (view2 = c24702x.f75592c) != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = this.mHeaderBgHeight;
        }
        ShortTVDiscoverFragment shortTVDiscoverFragment = this.shorTvFragment;
        if (shortTVDiscoverFragment != null) {
            shortTVDiscoverFragment.m79802B1(this.mRecycleScrollListener, new Function1() { // from class: com.transsion.home.fragment.tab.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubShortTvFragment.m68210D0(this.f53321a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: l0 */
    public void mo67725l0(int lastAdPosition, BiddingNativeManager wrapperNativeManager) {
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        m68219y0();
        ShortTVDiscoverFragment shortTVDiscoverFragment = this.shorTvFragment;
        if (shortTVDiscoverFragment != null) {
            getChildFragmentManager().m14557p().m14813s(R$id.sub_shor_tv_container, shortTVDiscoverFragment).mo14670i();
        }
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: p0 */
    public void mo68108p0() {
        ShortTVDiscoverFragment shortTVDiscoverFragment = this.shorTvFragment;
        if (shortTVDiscoverFragment != null) {
            shortTVDiscoverFragment.m79810u1();
        }
    }
}
