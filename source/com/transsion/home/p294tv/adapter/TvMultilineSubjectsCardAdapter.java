package com.transsion.home.p294tv.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.base.report.athena.BrowseType;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.CustomData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.p294tv.fragment.TVChannelHomeFragment;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ml.AbstractC25888b;
import p462hj.C23860f;
import p550kj.C24662i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/home/tv/adapter/TvMultilineSubjectsCardAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/bean/BannerData;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "", "tabId", "<init>", "(Lcom/transsion/home/bean/OperateItem;I)V", WebConstants.FIELD_ITEM, RequestParameters.POSITION, "", "C1", "(Lcom/transsion/home/bean/BannerData;I)V", "holder", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/bean/BannerData;)V", "F", "Lcom/transsion/home/bean/OperateItem;", "G", "I", "H", "cardSize", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class TvMultilineSubjectsCardAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: I */
    public static final int f53408I = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final OperateItem operateItem;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int cardSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TvMultilineSubjectsCardAdapter(OperateItem operateItem, int i11) {
        super(R$layout.item_tv_multiline_subjects_card, null, 2, null);
        Intrinsics.m97802h(operateItem, "operateItem");
        this.operateItem = operateItem;
        this.tabId = i11;
        this.cardSize = AbstractC23384a.m92908b(73);
    }

    /* JADX INFO: renamed from: C1 */
    private final void m68571C1(BannerData item, int position) {
        String deepLink;
        HashMap map = new HashMap();
        map.put("event_type", "browse_custom_item");
        map.put(RequestParameters.POSITION, String.valueOf(position));
        CustomData customData = this.operateItem.getCustomData();
        map.put("rowCount", String.valueOf(customData != null ? Integer.valueOf(customData.getRowCount()) : null));
        map.put("tabId", String.valueOf(this.tabId));
        if (item == null || (deepLink = item.getDeepLink()) == null) {
            deepLink = "";
        }
        map.put("content_id", deepLink);
        if (item != null) {
            AbstractC25888b.m101684g(item, map);
        }
        AbstractC25888b.m101679b(this.operateItem, map);
        C24662i.f75350a.m96873E(TVChannelHomeFragment.INSTANCE.m68665a(this.tabId), map, BrowseType.CONTENT);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, BannerData item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        mo36114z(holder, getItemViewType(holder.getBindingAdapterPosition()));
        ImageView imageView = (ImageView) holder.getView(R$id.tvMultilineCover);
        imageView.setImageDrawable(null);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i11 = this.cardSize;
        layoutParams.width = i11;
        layoutParams.height = i11;
        imageView.setLayoutParams(layoutParams);
        if (item.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new TvMultilineSubjectsCardAdapter$convert$2(item, imageView, null), 3, null);
        } else {
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
            Image image = item.getImage();
            String url = image != null ? image.getUrl() : null;
            if (url == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            Image image2 = item.getImage();
            String thumbnail = image2 != null ? image2.getThumbnail() : null;
            bVarM94468g.m94473l(thumbnail != null ? thumbnail : "").m94465d(imageView);
        }
        Integer numValueOf = Integer.valueOf(holder.getBindingAdapterPosition());
        Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
        int iIntValue = num != null ? num.intValue() : getData().indexOf(item);
        if (iIntValue >= 0) {
            m68571C1(item, iIntValue);
        }
    }
}
