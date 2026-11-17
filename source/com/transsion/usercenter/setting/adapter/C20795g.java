package com.transsion.usercenter.setting.adapter;

import android.view.View;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.view.SwitchButton;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p923xw.C28669b;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.adapter.g */
/* JADX INFO: loaded from: classes7.dex */
public final class C20795g extends BaseItemProvider {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m85678B(BaseViewHolder baseViewHolder, View view) {
        baseViewHolder.getView(R$id.llRoot).performClick();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo36334f(BaseViewHolder helper, C28669b item, List payloads) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36334f(helper, item, payloads);
        SwitchButton switchButton = (SwitchButton) helper.getViewOrNull(R$id.switchBtn);
        if (switchButton != null) {
            switchButton.setChecked(item.m110488f());
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 3;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.user_item_switch_setting;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, C28669b item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ((TnTextView) helper.getView(R$id.tvTitle)).setTextById(item.m110491i());
        TnTextView tnTextView = (TnTextView) helper.getView(R$id.tvDes);
        String strM110484b = item.m110484b();
        tnTextView.setVisibility(!(strM110484b == null || strM110484b.length() == 0) ? 0 : 8);
        if (tnTextView.getVisibility() == 0) {
            tnTextView.setText(item.m110484b());
        }
        helper.getView(R$id.divider).setVisibility(item.m110486d() ? 0 : 8);
        helper.getView(R$id.tvNew).setVisibility(item.m110487e() ? 0 : 8);
        SwitchButton switchButton = (SwitchButton) helper.getView(R$id.switchBtn);
        switchButton.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.setting.adapter.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20795g.m85678B(helper, view);
            }
        });
        switchButton.setChecked(item.m110488f());
        View viewOrNull = helper.getViewOrNull(R$id.bgView);
        if (viewOrNull != null) {
            Integer numM110483a = item.m110483a();
            viewOrNull.setBackgroundResource(numM110483a != null ? numM110483a.intValue() : 0);
        }
    }
}
