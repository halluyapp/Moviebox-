package com.transsion.usercenter.p321me.adapter;

import android.view.View;
import android.widget.TextView;
import com.blankj.utilcode.util.AbstractC5787g;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.share.R$string;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.p321me.C20606k;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import com.transsion.usercenter.profile.bean.MineNoticeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.b */
/* JADX INFO: loaded from: classes7.dex */
public final class C20567b extends BaseItemProvider {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m85008A(MineNoticeConfig mineNoticeConfig, View it) {
        Intrinsics.m97802h(it, "it");
        AbstractC5787g.m27403a(mineNoticeConfig.getLink());
        C13806h.f49015a.m62324k(R$string.player_copy_link_success);
        C20606k.f65059a.m85071b("copy_link");
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 9;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.mine_item_bottom_layout;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, MeItemInfo item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Object data = item.getData();
        final MineNoticeConfig mineNoticeConfig = data instanceof MineNoticeConfig ? (MineNoticeConfig) data : null;
        if (mineNoticeConfig == null) {
            return;
        }
        View itemView = helper.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        String bottomContent = mineNoticeConfig.getBottomContent();
        boolean z11 = true;
        itemView.setVisibility(!(bottomContent == null || bottomContent.length() == 0) ? 0 : 8);
        ((TextView) helper.getView(R$id.titleTv)).setText(mineNoticeConfig.getBottomContent());
        TextView textView = (TextView) helper.getView(R$id.copyTv);
        String link = mineNoticeConfig.getLink();
        if (link != null && link.length() != 0) {
            z11 = false;
        }
        textView.setVisibility(z11 ? 8 : 0);
        AbstractC26006c.m102050c(textView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20567b.m85008A(mineNoticeConfig, (View) obj);
            }
        }, 1, null);
    }
}
