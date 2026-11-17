package com.transsion.home.adapter.filter;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.home.R$id;
import com.transsion.home.bean.LayoutStyle;
import com.transsion.home.bean.UGCFilterVideoItem;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gl.C23581a;
import gl.C23582b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p579ll.C25646b;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.home.adapter.filter.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B;\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010\r\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, m97100d2 = {"Lcom/transsion/home/adapter/filter/a;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/home/bean/UGCFilterVideoItem;", "Lu6/i;", "", "dataList", "Lll/b;", "listExposureHelper", "Lcom/transsion/home/bean/LayoutStyle;", TtmlNode.TAG_STYLE, "", "rowCount", "", "isEducationList", "<init>", "(Ljava/util/List;Lll/b;Lcom/transsion/home/bean/LayoutStyle;IZ)V", "", "data", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "T1", "G", "Lll/b;", "H", "Lcom/transsion/home/bean/LayoutStyle;", "R1", "()Lcom/transsion/home/bean/LayoutStyle;", "V1", "(Lcom/transsion/home/bean/LayoutStyle;)V", "I", "Q1", "()I", "Lgl/b;", "J", "Lgl/b;", "videoProvider", AppMeasurementSdk.ConditionalUserProperty.VALUE, "K", "Z", "S1", "()Z", "U1", "(Z)V", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C14841a extends BaseProviderMultiAdapter<UGCFilterVideoItem> implements InterfaceC27944i {

    /* JADX INFO: renamed from: L */
    public static final int f51915L = 8;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C25646b listExposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private LayoutStyle style;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int rowCount;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private C23582b videoProvider;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean isEducationList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14841a(List<UGCFilterVideoItem> dataList, C25646b c25646b, LayoutStyle layoutStyle, int i11, boolean z11) {
        super(dataList);
        Intrinsics.m97802h(dataList, "dataList");
        this.listExposureHelper = c25646b;
        this.style = layoutStyle;
        this.rowCount = i11;
        this.isEducationList = z11;
        C23582b c23582b = new C23582b(c25646b, this.style, i11, z11);
        this.videoProvider = c23582b;
        mo36107F1(c23582b);
        mo36107F1(new C23581a(c25646b));
    }

    public /* synthetic */ C14841a(List list, C25646b c25646b, LayoutStyle layoutStyle, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, c25646b, layoutStyle, i11, (i12 & 16) != 0 ? false : z11);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        C25646b c25646b = this.listExposureHelper;
        if (c25646b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            c25646b.m100944h((GridLayoutManager) layoutManager, bindingAdapterPosition, true);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends UGCFilterVideoItem> data, int position) {
        Intrinsics.m97802h(data, "data");
        UGCFilterVideoItem uGCFilterVideoItem = data.get(position);
        if (uGCFilterVideoItem.isAd()) {
            return 4;
        }
        Intrinsics.m97797c(uGCFilterVideoItem.getContent().getTopicType(), "UGC_VIDEO");
        return 1;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final int getRowCount() {
        return this.rowCount;
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final LayoutStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final boolean getIsEducationList() {
        return this.isEducationList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: T1, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewRecycled(holder);
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.iv_cover);
        if (shapeableImageView == null || shapeableImageView.getContext() == null) {
            return;
        }
        Context context = shapeableImageView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || !activity.isDestroyed()) {
            Context context2 = shapeableImageView.getContext();
            Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
            if (activity2 == null || !activity2.isFinishing()) {
                Glide.with(shapeableImageView.getContext()).clear(shapeableImageView);
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final void m66732U1(boolean z11) {
        this.isEducationList = z11;
        C23582b c23582b = this.videoProvider;
        if (c23582b != null) {
            c23582b.m93322z(z11);
        }
        notifyItemRangeChanged(0, getData().size());
    }

    /* JADX INFO: renamed from: V1 */
    public final void m66733V1(LayoutStyle layoutStyle) {
        this.style = layoutStyle;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
