package com.transsion.home.fragment.tab;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p552kl.C24689m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0004¨\u0006\u0014"}, m97100d2 = {"Lcom/transsion/home/fragment/tab/EmptyFragment;", "Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lkl/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "r0", "(Landroid/view/LayoutInflater;)Lkl/m;", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "lazyLoadData", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class EmptyFragment extends BaseHomeSubFragment<C24689m> {
    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: f0 */
    public RecyclerView mo67723f0() {
        return null;
    }

    @Override // com.transsion.home.fragment.tab.BaseHomeSubFragment
    /* JADX INFO: renamed from: l0 */
    public void mo67725l0(int lastAdPosition, BiddingNativeManager wrapperNativeManager) {
        Intrinsics.m97802h(wrapperNativeManager, "wrapperNativeManager");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C24689m getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24689m c24689mM96973c = C24689m.m96973c(inflater);
        Intrinsics.m97801g(c24689mM96973c, "inflate(...)");
        return c24689mM96973c;
    }
}
