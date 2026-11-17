package com.transsion.usercenter.setting.adapter;

import android.widget.TextView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import kotlin.jvm.internal.Intrinsics;
import p923xw.C28668a;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.adapter.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C20791c extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f65440e = 2;

    /* JADX INFO: renamed from: f */
    private final int f65441f = R$layout.dialog_locale_language_item;

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f65440e;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f65441f;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder holder, C28668a item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ((TextView) holder.getView(R$id.tv_language)).setText(item.m110478a());
    }
}
