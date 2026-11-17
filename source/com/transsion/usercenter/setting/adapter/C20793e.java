package com.transsion.usercenter.setting.adapter;

import android.view.View;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.baseui.widget.text.GradientTextView;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p923xw.C28669b;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.adapter.e */
/* JADX INFO: loaded from: classes7.dex */
public final class C20793e extends BaseItemProvider {
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.user_item_setting;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, C28669b item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ((TnTextView) helper.getView(R$id.tv_title)).setTextById(item.m110491i());
        helper.setText(R$id.tv_content, item.m110484b()).setGone(R$id.progress_bar, !item.m110485c()).setGone(R$id.tv_content, item.m110485c());
        View viewOrNull = helper.getViewOrNull(R$id.divider);
        if (viewOrNull != null) {
            AbstractC26006c.m102057j(viewOrNull, item.m110486d());
        }
        View viewOrNull2 = helper.getViewOrNull(R$id.bgView);
        if (viewOrNull2 != null) {
            Integer numM110483a = item.m110483a();
            viewOrNull2.setBackgroundResource(numM110483a != null ? numM110483a.intValue() : 0);
        }
        GradientTextView gradientTextView = (GradientTextView) helper.getView(R$id.tv_tips);
        gradientTextView.setEnableGradientColor(item.m110490h());
        gradientTextView.setTextColor(m36338k().getResources().getColor(R$color.white_60));
        String strM110489g = item.m110489g();
        if (strM110489g == null) {
            strM110489g = "";
        }
        gradientTextView.setText(strM110489g);
        String strM110489g2 = item.m110489g();
        gradientTextView.setVisibility(strM110489g2 != null && strM110489g2.length() > 0 ? 0 : 8);
    }
}
