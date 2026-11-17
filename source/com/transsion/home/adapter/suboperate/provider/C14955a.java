package com.transsion.home.adapter.suboperate.provider;

import android.content.Context;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.trending.provider.AbstractC15028b;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import kotlin.jvm.internal.Intrinsics;
import p391ey.C23245b;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14955a extends AbstractC15028b {
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        C23245b c23245b = C23245b.f70802a;
        Context contextM36338k = m36338k();
        BiddingNativeManager nonAdDelegate = item.getNonAdDelegate();
        AbstractC13924r abstractC13924rM92309a = c23245b.m92309a(contextM36338k, nonAdDelegate != null ? nonAdDelegate.getMSceneId() : null);
        NativeWrapperAdView nativeWrapperAdView = (NativeWrapperAdView) helper.getViewOrNull(R$id.nativeView);
        if (nativeWrapperAdView != null) {
            BiddingNativeManager nonAdDelegate2 = item.getNonAdDelegate();
            BiddingNativeManager nonAdDelegate3 = item.getNonAdDelegate();
            nativeWrapperAdView.bindNativeView(nonAdDelegate2, abstractC13924rM92309a, nonAdDelegate3 != null ? nonAdDelegate3.m62848k0() : null);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.TRENDING_NATIVE_AD.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.post_list_item_native_ad_layout;
    }
}
