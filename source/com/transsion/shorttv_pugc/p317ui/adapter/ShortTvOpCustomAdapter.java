package com.transsion.shorttv_pugc.p317ui.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.bean.BannerData;
import com.transsion.shorttv_pugc.bean.CustomData;
import com.transsion.shorttv_pugc.bean.Image;
import com.transsion.shorttv_pugc.bean.OperateItem;
import com.transsion.shorttv_pugc.utils.ShortTvExtKt;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import ht.AbstractC23896b;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p550kj.C24662i;
import p558kt.C25429b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B5\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0018\u0010(\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/adapter/ShortTvOpCustomAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/shorttv_pugc/bean/BannerData;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "", "pageName", "Lcom/transsion/shorttv_pugc/bean/CustomData;", "customData", "firstItem", "", "isTablet", "<init>", "(ILjava/lang/String;Lcom/transsion/shorttv_pugc/bean/CustomData;Lcom/transsion/shorttv_pugc/bean/BannerData;Z)V", WebConstants.FIELD_ITEM, RequestParameters.POSITION, "", "C1", "(Lcom/transsion/shorttv_pugc/bean/BannerData;I)V", "Lcom/transsion/shorttv_pugc/bean/OperateItem;", "D1", "(Lcom/transsion/shorttv_pugc/bean/OperateItem;)V", "holder", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/shorttv_pugc/bean/BannerData;)V", "F", "Ljava/lang/String;", "G", "Lcom/transsion/shorttv_pugc/bean/CustomData;", "H", "Z", "I", "itemWidth", "J", "itemHeight", "K", "hiddenTitle", "L", "Lcom/transsion/shorttv_pugc/bean/OperateItem;", "operateItem", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTvOpCustomAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final CustomData customData;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean isTablet;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int itemWidth;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int itemHeight;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final boolean hiddenTitle;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private OperateItem operateItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    public ShortTvOpCustomAdapter(int i11, String pageName, CustomData customData, BannerData bannerData, boolean z11) {
        Boolean hiddenTitle;
        Image image;
        Integer width;
        Image image2;
        Integer height;
        List<BannerData> items;
        BannerData bannerData2;
        super(i11, null, 2, null);
        Intrinsics.m97802h(pageName, "pageName");
        String content = null;
        this.pageName = pageName;
        this.customData = customData;
        this.isTablet = z11;
        int iIntValue = 1;
        boolean zBooleanValue = false;
        int iE = RangesKt.m97935e(customData != null ? customData.getRowCount() : 1, 1) + (z11 ? 2 : 0);
        int iM27314b = AbstractC5776a0.m27314b(RangesKt.m97938h(AbstractC5806y.m27489e(), AbstractC5806y.m27487c()));
        List<BannerData> items2 = customData != null ? customData.getItems() : null;
        if (items2 != null && !items2.isEmpty()) {
            if (customData != null && (items = customData.getItems()) != null && (bannerData2 = items.get(0)) != null) {
                content = bannerData2.getContent();
            }
            if (content == null || content.length() == 0) {
                zBooleanValue = true;
            } else if (customData != null) {
                zBooleanValue = hiddenTitle.booleanValue();
            }
        } else if (customData != null && (hiddenTitle = customData.getHiddenTitle()) != null) {
            zBooleanValue = hiddenTitle.booleanValue();
        }
        this.hiddenTitle = zBooleanValue;
        int iM27313a = AbstractC5776a0.m27313a(((((iM27314b - 12) - (iE * 8)) - 12) * 1.0f) / iE);
        this.itemWidth = iM27313a;
        float fIntValue = ((bannerData == null || (image2 = bannerData.getImage()) == null || (height = image2.getHeight()) == null) ? 1 : height.intValue()) * 1.0f;
        if (bannerData != null && (image = bannerData.getImage()) != null && (width = image.getWidth()) != null) {
            iIntValue = width.intValue();
        }
        this.itemHeight = (int) ((fIntValue / iIntValue) * iM27313a);
    }

    public /* synthetic */ ShortTvOpCustomAdapter(int i11, String str, CustomData customData, BannerData bannerData, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? R$layout.pugc_short_tv_op_custom_item : i11, str, customData, bannerData, z11);
    }

    /* JADX INFO: renamed from: C1 */
    private final void m80796C1(BannerData item, int position) {
        HashMap map = new HashMap();
        map.put("event_type", "browse_custom_item");
        map.put("sequence", String.valueOf(position));
        CustomData customData = this.customData;
        map.put("rowCount", String.valueOf(customData != null ? Integer.valueOf(customData.getRowCount()) : null));
        if (item != null) {
            ShortTvExtKt.m81299b(item, map);
        }
        OperateItem operateItem = this.operateItem;
        if (operateItem != null) {
            ShortTvExtKt.m81298a(operateItem, map);
        }
        C24662i.f75350a.m96872D(this.pageName, map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, BannerData item) {
        String url;
        String thumbnail;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        if (this.itemWidth < 10 || this.itemHeight < 10) {
            return;
        }
        mo36114z(holder, getItemViewType(holder.getBindingAdapterPosition()));
        ImageView imageView = (ImageView) holder.getView(R$id.sub_operation_variable_image);
        TextView textView = (TextView) holder.getView(R$id.sub_operation_variable_item_title);
        imageView.getLayoutParams().width = this.itemWidth;
        imageView.getLayoutParams().height = this.itemHeight;
        textView.setMaxWidth(this.itemWidth);
        if (this.hiddenTitle) {
            AbstractC23896b.m94640b(textView);
        } else {
            AbstractC23896b.m94642d(textView);
        }
        if (item.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ShortTvOpCustomAdapter$convert$1(item, imageView, null), 3, null);
        } else {
            C25429b.a aVar = C25429b.f76999a;
            Context context = getContext();
            Image image = item.getImage();
            if (image == null || (url = image.getUrl()) == null) {
                url = "";
            }
            Image image2 = item.getImage();
            aVar.m99980j(context, imageView, url, (8120 & 8) != 0 ? aVar.m99977c() : 0, (8120 & 16) != 0 ? aVar.m99976b() : 0, (8120 & 32) != 0, (8120 & 64) != 0 ? "" : (image2 == null || (thumbnail = image2.getThumbnail()) == null) ? "" : thumbnail, (8120 & 128) != 0, (8120 & 256) != 0, (8120 & 512) != 0 ? false : false, (8120 & 1024) != 0 ? false : false, (8120 & 2048) != 0 ? false : false, (8120 & 4096) != 0 ? 25 : 0);
        }
        textView.setText(item.getContent());
        m80796C1(item, getData().indexOf(item));
    }

    /* JADX INFO: renamed from: D1 */
    public final void m80798D1(OperateItem item) {
        Intrinsics.m97802h(item, "item");
        this.operateItem = item;
    }
}
