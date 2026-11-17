package com.transsion.shorttv_pugc.p317ui.adapter.provider;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.bean.OperateItem;
import com.transsion.shorttv_pugc.bean.ShortTvItemType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C19355r extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final String f62074e;

    /* JADX INFO: renamed from: f */
    private final boolean f62075f;

    public C19355r(String pageName, boolean z11) {
        Intrinsics.m97802h(pageName, "pageName");
        this.f62074e = pageName;
        this.f62075f = z11;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return ShortTvItemType.TRENDING.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.pugc_short_tv_item_trending;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder holder, OperateItem data) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(data, "data");
    }
}
