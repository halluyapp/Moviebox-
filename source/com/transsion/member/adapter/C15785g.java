package com.transsion.member.adapter;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.hisavana.sdk.common.util.AbstractC8117n0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.member.R$id;
import com.transsion.member.R$layout;
import com.transsion.member.R$string;
import com.transsion.memberapi.MemberDetail;
import com.transsion.memberapi.MembershipDetailType;
import com.transsion.memberapi.SkuCategory;
import com.transsion.memberapi.SkuItem;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.member.adapter.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0018\u001a\u00020\n2:\u0010\u0017\u001a6\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u0011j\u0002`\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&RN\u0010\u0017\u001a:\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010/\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m97100d2 = {"Lcom/transsion/member/adapter/g;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/memberapi/SkuItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "dataList", "<init>", "(Ljava/util/List;)V", "Lcom/transsion/memberapi/MemberDetail;", "detail", "", "G1", "(Lcom/transsion/memberapi/MemberDetail;)V", "holder", WebConstants.FIELD_ITEM, "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/memberapi/SkuItem;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/transsion/member/adapter/SkuItemCallback;", "clickCallback", "F1", "(Lkotlin/jvm/functions/Function2;)V", "", "getItemCount", "()I", "Landroidx/appcompat/widget/AppCompatTextView;", "F", "Landroidx/appcompat/widget/AppCompatTextView;", "redeemBtn", "Landroidx/constraintlayout/widget/ConstraintLayout;", "G", "Landroidx/constraintlayout/widget/ConstraintLayout;", "redeemContainer", "H", "Lcom/transsion/memberapi/SkuItem;", "I", "Lkotlin/jvm/functions/Function2;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "J", "Z", "E1", "(Z)V", "canRedeem", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C15785g extends BaseQuickAdapter {

    /* JADX INFO: renamed from: K */
    public static final int f54226K = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private AppCompatTextView redeemBtn;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private ConstraintLayout redeemContainer;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private SkuItem item;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private Function2<? super SkuItem, ? super View, Unit> clickCallback;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean canRedeem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15785g(List<SkuItem> dataList) {
        super(R$layout.item_sku, dataList);
        Intrinsics.m97802h(dataList, "dataList");
        this.canRedeem = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m69959D1(C15785g c15785g, SkuItem skuItem, View view) {
        C26866a.a.m104899g(C26866a.f81698a, "Should buy now", false, 2, null);
        Function2<? super SkuItem, ? super View, Unit> function2 = c15785g.clickCallback;
        if (function2 != null) {
            Intrinsics.m97799e(view);
            function2.invoke(skuItem, view);
        }
    }

    /* JADX INFO: renamed from: E1 */
    private final void m69960E1(boolean z11) {
        ConstraintLayout constraintLayout = this.redeemContainer;
        if (constraintLayout != null) {
            constraintLayout.setAlpha(z11 ? 1.0f : 0.4f);
        }
        AppCompatTextView appCompatTextView = this.redeemBtn;
        if (appCompatTextView != null) {
            appCompatTextView.setEnabled(z11);
        }
        this.canRedeem = z11;
    }

    /* JADX INFO: renamed from: G1 */
    private final void m69961G1(MemberDetail detail) {
        boolean z11 = true;
        if (detail != null && MembershipDetailType.INSTANCE.m70139a(detail.getMemberInfo()) == MembershipDetailType.SUBSCRIPTION_MEMBER) {
            SkuItem skuItem = this.item;
            if (Intrinsics.m97797c(skuItem != null ? skuItem.getCategory() : null, SkuCategory.AUTO_RENEW.getValue())) {
                z11 = false;
            }
        }
        m69960E1(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, final SkuItem item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        if (Intrinsics.m97797c(item.getCategory(), SkuCategory.AUTO_RENEW.getValue())) {
            ((AppCompatTextView) holder.getView(R$id.detail)).setText(getContext().getString(R$string.member_auto_renew));
        } else {
            AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getView(R$id.detail);
            appCompatTextView.setText(appCompatTextView.getContext().getString(R$string.member_sku_1_time_payment));
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) holder.getView(R$id.title);
        appCompatTextView2.setText(appCompatTextView2.getContext().getString(R$string.member_sku_set_title, item.getDurationCount(), item.getDurationUnitDesc()));
        ((AppCompatTextView) holder.getView(R$id.price)).setText(item.getCurrencySymbol() + AbstractC8117n0.m37956a(new BigDecimal(String.valueOf(item.getPrice()))).toPlainString());
        ((AppCompatTextView) holder.getView(R$id.btn_redeem)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.adapter.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15785g.m69959D1(this.f54224a, item, view);
            }
        });
        this.redeemBtn = (AppCompatTextView) holder.getView(R$id.btn_redeem);
        this.redeemContainer = (ConstraintLayout) holder.getView(R$id.iv_redeem_container);
        this.item = item;
        m69961G1(item.getMemberDetail());
    }

    /* JADX INFO: renamed from: F1 */
    public final void m69963F1(Function2<? super SkuItem, ? super View, Unit> clickCallback) {
        Intrinsics.m97802h(clickCallback, "clickCallback");
        this.clickCallback = clickCallback;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getData().size();
    }
}
