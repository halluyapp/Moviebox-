package com.transsion.home.adapter.operateUGC.adapter;

import android.content.res.ColorStateList;
import android.widget.TextView;
import androidx.core.content.AbstractC2397b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.RankingListItem;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26004a;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.adapter.e */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m97100d2 = {"Lcom/transsion/home/adapter/operateUGC/adapter/e;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/bean/RankingListItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "<init>", "(I)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/bean/RankingListItem;)V", "index", "C1", "F", "I", "currentSelectIndex", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C14859e extends BaseQuickAdapter {

    /* JADX INFO: renamed from: G */
    public static final int f51965G = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int currentSelectIndex;

    public C14859e() {
        this(0, 1, null);
    }

    public C14859e(int i11) {
        super(i11, null, 2, null);
    }

    public /* synthetic */ C14859e(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? R$layout.item_ugc_provider_ranklist_tab : i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, RankingListItem item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        TextView textView = (TextView) holder.getView(R$id.home_ugc_rankinglist_tab_text);
        textView.setText(item.getTitle());
        if (getData().indexOf(item) == this.currentSelectIndex) {
            textView.setTypeface(AbstractC26004a.m102044a(getContext()));
            textView.setBackgroundTintList(ColorStateList.valueOf(AbstractC2397b.getColor(getContext(), R$color.white_10)));
        } else {
            textView.setTypeface(AbstractC26004a.m102047d(getContext()));
            textView.setBackgroundTintList(ColorStateList.valueOf(AbstractC2397b.getColor(getContext(), R$color.transparent)));
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m66771C1(int index) {
        this.currentSelectIndex = index;
        notifyDataSetChanged();
    }
}
