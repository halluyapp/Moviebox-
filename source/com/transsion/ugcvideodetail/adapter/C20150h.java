package com.transsion.ugcvideodetail.adapter;

import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.R$layout;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.adapter.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/adapter/h;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "data", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/String;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "F", "I", "C1", "()I", "D1", "(I)V", "selectedIndex", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20150h extends BaseQuickAdapter {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int selectedIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public C20150h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20150h(List<String> data) {
        super(R$layout.item_ugc_video_detail_play_list_tab, data);
        Intrinsics.m97802h(data, "data");
    }

    public /* synthetic */ C20150h(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, String item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        int adapterPosition = holder.getAdapterPosition();
        ((TextView) holder.getView(R$id.tvLabel)).setText(item);
        ((TextView) holder.getView(R$id.tvLabelSelected)).setText(item);
        boolean z11 = adapterPosition == this.selectedIndex;
        holder.itemView.setSelected(z11);
        ((TextView) holder.getView(R$id.tvLabel)).setVisibility(z11 ? 8 : 0);
        ((TextView) holder.getView(R$id.tvLabelSelected)).setVisibility(z11 ? 0 : 8);
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m83618D1(int i11) {
        int i12 = this.selectedIndex;
        if (i12 == i11) {
            return;
        }
        this.selectedIndex = i11;
        if (i12 >= 0 && i12 < getItemCount()) {
            notifyItemChanged(i12);
        }
        if (i11 < 0 || i11 >= getItemCount()) {
            return;
        }
        notifyItemChanged(i11);
    }
}
