package com.transsion.home.category.adapter;

import android.content.Context;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.moviedetailapi.bean.CategoryItemBean;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import kotlin.jvm.internal.Intrinsics;
import p391ey.C23245b;

/* JADX INFO: renamed from: com.transsion.home.category.adapter.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C15111d extends BaseItemProvider {
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 3;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_ad;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, CategoryItemBean item) {
        BiddingNativeManager nonAdDelegate;
        BiddingNativeManager nonAdDelegate2;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        C23245b c23245b = C23245b.f70802a;
        Context contextM36338k = m36338k();
        Subject subject = item.getSubject();
        BiddingIntermediateMaterialBean biddingIntermediateMaterialBeanM62848k0 = null;
        AbstractC13924r abstractC13924rM92309a = c23245b.m92309a(contextM36338k, (subject == null || (nonAdDelegate2 = subject.getNonAdDelegate()) == null) ? null : nonAdDelegate2.getMSceneId());
        NativeWrapperAdView nativeWrapperAdView = (NativeWrapperAdView) helper.getViewOrNull(R$id.ad_container);
        if (nativeWrapperAdView != null) {
            Subject subject2 = item.getSubject();
            BiddingNativeManager nonAdDelegate3 = subject2 != null ? subject2.getNonAdDelegate() : null;
            Subject subject3 = item.getSubject();
            if (subject3 != null && (nonAdDelegate = subject3.getNonAdDelegate()) != null) {
                biddingIntermediateMaterialBeanM62848k0 = nonAdDelegate.m62848k0();
            }
            nativeWrapperAdView.bindNativeView(nonAdDelegate3, abstractC13924rM92309a, biddingIntermediateMaterialBeanM62848k0);
        }
    }
}
