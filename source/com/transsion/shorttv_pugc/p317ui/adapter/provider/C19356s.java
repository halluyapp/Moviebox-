package com.transsion.shorttv_pugc.p317ui.adapter.provider;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.bean.OperateItem;
import com.transsion.shorttv_pugc.bean.ShortTvItemType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.provider.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C19356s extends BaseItemProvider {
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return ShortTvItemType.TRENDING_TITLE.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.short_tv_item_trending_title;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder holder, OperateItem data) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(data, "data");
        holder.itemView.setTag("TrendingTitle");
        holder.setText(R$id.sub_operation_title_text, data.getTitle());
    }
}
