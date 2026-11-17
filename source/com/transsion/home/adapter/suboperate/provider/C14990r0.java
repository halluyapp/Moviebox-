package com.transsion.home.adapter.suboperate.provider;

import android.view.View;
import ck.AbstractC5114k;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.PostItemType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.provider.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14990r0 extends BaseItemProvider {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m67172B(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m67173C(OperateItem operateItem, View view) {
        String deepLink = operateItem.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23925h(deepLink, null, 1, null);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        helper.itemView.setTag("TrendingTitle");
        helper.setText(R$id.sub_operation_title_text, item.getTitle());
        helper.setGone(R$id.sub_operation_title_more, true);
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14990r0.m67172B(view);
            }
        });
        String deepLink = item.getDeepLink();
        if (deepLink == null || deepLink.length() == 0) {
            return;
        }
        helper.setVisible(R$id.sub_operation_title_more, true);
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.provider.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14990r0.m67173C(item, view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.FEEDS_TITLE.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_sub_operation_title;
    }
}
