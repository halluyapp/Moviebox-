package com.transsion.shorttv.p315ui.adapter;

import android.content.Context;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import kotlin.jvm.internal.Intrinsics;
import p659os.AbstractC26725k;
import p659os.C26717c;
import p988zr.C29239b;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C18907f extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f60976e = R$layout.short_tv_item_immersion_ad;

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 2;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f60976e;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, AbstractC26725k item) {
        NativeWrapperAdView nativeWrapperAdView;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (!(item instanceof C26717c) || (nativeWrapperAdView = (NativeWrapperAdView) helper.getViewOrNull(R$id.flRoot)) == null) {
            return;
        }
        C29239b c29239b = C29239b.f89220a;
        Context contextM36338k = m36338k();
        C26717c c26717c = (C26717c) item;
        BiddingNativeManager biddingNativeManagerM104501a = c26717c.m104501a();
        AbstractC13924r abstractC13924rM112121a = c29239b.m112121a(contextM36338k, biddingNativeManagerM104501a != null ? biddingNativeManagerM104501a.getMSceneId() : null);
        BiddingNativeManager biddingNativeManagerM104501a2 = c26717c.m104501a();
        BiddingNativeManager biddingNativeManagerM104501a3 = c26717c.m104501a();
        nativeWrapperAdView.bindNativeView(biddingNativeManagerM104501a2, abstractC13924rM112121a, biddingNativeManagerM104501a3 != null ? biddingNativeManagerM104501a3.m62848k0() : null);
    }
}
