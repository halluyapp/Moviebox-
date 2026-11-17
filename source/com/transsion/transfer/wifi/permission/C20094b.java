package com.transsion.transfer.wifi.permission;

import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.transfer.R$id;
import com.transsion.transfer.R$layout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.permission.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C20094b extends BaseItemProvider {
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 0;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_permission_layout;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, PermissionsBean item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ((ImageView) helper.itemView.findViewById(R$id.ivIcon)).setImageResource(item.getIcon());
        ((TextView) helper.itemView.findViewById(R$id.tvTitle)).setText(item.getTitle());
        ((TextView) helper.itemView.findViewById(R$id.tvContent)).setText(item.getContent());
        boolean zM83432f = C20096d.f63935a.m83432f(item.getPermission());
        TextView textView = (TextView) helper.itemView.findViewById(R$id.tvAction);
        textView.setText(item.getBtnName());
        if (zM83432f) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }
}
