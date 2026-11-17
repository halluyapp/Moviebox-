package com.transsion.member.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.member.R$id;
import com.transsion.member.R$layout;
import com.transsion.member.bean.PointsHistoryItem;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.member.adapter.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m97100d2 = {"Lcom/transsion/member/adapter/b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/member/bean/PointsHistoryItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "layoutResId", "<init>", "(I)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/member/bean/PointsHistoryItem;)V", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C15780b extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F */
    public static final int f54214F = 8;

    public C15780b() {
        this(0, 1, null);
    }

    public C15780b(int i11) {
        super(i11, null, 2, null);
    }

    public /* synthetic */ C15780b(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? R$layout.item_points_history_layout : i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, PointsHistoryItem item) {
        Integer numV;
        Long lX;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        int i11 = R$id.tvTime;
        String createTime = item.getCreateTime();
        holder.setText(i11, TimeUtilKt.m65653e((createTime == null || (lX = StringsKt.m98218x(createTime)) == null) ? 0L : lX.longValue()));
        holder.setText(R$id.tvDes, item.getRemarks());
        String coin = item.getCoin();
        int iIntValue = (coin == null || (numV = StringsKt.m98216v(coin)) == null) ? 0 : numV.intValue();
        int i12 = R$id.tvCoin;
        String coin2 = item.getCoin();
        if (iIntValue > 0) {
            coin2 = "+" + coin2;
        }
        holder.setText(i12, coin2);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
