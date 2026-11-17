package com.transsion.usercenter;

import android.widget.TextView;
import androidx.core.content.AbstractC2397b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.usercenter.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m97100d2 = {"Lcom/transsion/usercenter/g;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "followType", "<init>", "(I)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/String;)V", "F", "I", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20472g extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int followType;

    public C20472g(int i11) {
        super(R$layout.adapter_item_follow, null, 2, null);
        this.followType = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, String item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        if (this.followType == 1) {
            TextView textView = (TextView) holder.getView(R$id.btnFollow);
            textView.setText(holder.itemView.getContext().getString(R$string.user_center_follow_following));
            textView.setTextColor(AbstractC2397b.getColor(holder.itemView.getContext(), com.transsion.baseui.R$color.base_color_white));
            textView.setBackgroundResource(R$drawable.btn_bg_following);
            return;
        }
        TextView textView2 = (TextView) holder.getView(R$id.btnFollow);
        textView2.setText(holder.itemView.getContext().getString(R$string.user_center_follow_followers));
        textView2.setTextColor(AbstractC2397b.getColor(holder.itemView.getContext(), com.transsion.baseui.R$color.base_color_333333));
        textView2.setBackgroundResource(R$drawable.btn_bg_followers);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
