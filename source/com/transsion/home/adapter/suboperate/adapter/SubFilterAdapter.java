package com.transsion.home.adapter.suboperate.adapter;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5789h;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.helper.C14451b;
import com.transsion.gslb.Utils;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.R$mipmap;
import com.transsion.home.bean.FilterItem;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ml.AbstractC25888b;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010%¨\u0006("}, m97100d2 = {"Lcom/transsion/home/adapter/suboperate/adapter/SubFilterAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/bean/FilterItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "tabId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "", "isTablet", "<init>", "(ILjava/lang/Integer;Lcom/transsion/home/bean/OperateItem;Z)V", "", TtmlNode.ATTR_TTS_COLOR, "Landroid/graphics/drawable/GradientDrawable;", "E1", "(Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;", WebConstants.FIELD_ITEM, RequestParameters.POSITION, "", "G1", "(Lcom/transsion/home/bean/FilterItem;I)V", "F1", "Landroid/view/ViewGroup;", "parent", "viewType", "z0", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/bean/FilterItem;)V", "F", "Ljava/lang/Integer;", "G", "Lcom/transsion/home/bean/OperateItem;", "H", "I", "itemWidth", "itemHeight", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SubFilterAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: J */
    public static final int f52172J = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Integer tabId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final OperateItem operateItem;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int itemWidth;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int itemHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubFilterAdapter(int i11, Integer num, OperateItem operateItem, boolean z11) {
        super(i11, null, 2, null);
        Intrinsics.m97802h(operateItem, "operateItem");
        this.tabId = num;
        this.operateItem = operateItem;
        int i12 = z11 ? 6 : 3;
        this.itemWidth = AbstractC5776a0.m27313a(((((AbstractC5776a0.m27314b(Math.min(AbstractC5806y.m27489e(), AbstractC5806y.m27487c())) - 12) - (i12 * 8)) - 12) * 1.0f) / i12);
        this.itemHeight = AbstractC5776a0.m27313a(40.0f);
    }

    public /* synthetic */ SubFilterAdapter(int i11, Integer num, OperateItem operateItem, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? R$layout.item_sub_operation_filter_item : i11, num, operateItem, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m66934D1(FilterItem filterItem, SubFilterAdapter subFilterAdapter, View view) {
        Uri uriM65157g = C14451b.f50862a.m65157g(Uri.parse(filterItem.getDeepLink()));
        if (uriM65157g != null) {
            AbstractC5114k.m23932o(uriM65157g);
        }
        subFilterAdapter.m66937G1(filterItem, subFilterAdapter.getData().indexOf(filterItem));
    }

    /* JADX INFO: renamed from: E1 */
    private final GradientDrawable m66935E1(String color) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{Color.parseColor(StringsKt.m98236Q(color, Utils.SEPARATOR, "#ff", false, 4, null)), Color.parseColor(StringsKt.m98236Q(color, Utils.SEPARATOR, "#ff", false, 4, null)), Color.parseColor(StringsKt.m98236Q(color, Utils.SEPARATOR, "#00", false, 4, null))});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: F1 */
    private final void m66936F1(FilterItem item, int position) {
        String title;
        HashMap map = new HashMap();
        map.put("event_type", "browse_filter");
        if (item == null || (title = item.getTitle()) == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put("sequence", String.valueOf(position));
        map.put("tabId", String.valueOf(this.tabId));
        AbstractC25888b.m101678a(this.operateItem, map);
        C14450a c14450a = C14450a.f50860a;
        SubTabFragment.Companion companion = SubTabFragment.INSTANCE;
        Integer num = this.tabId;
        c14450a.m65142e(companion.m68282a(num != null ? num.intValue() : 1), map);
    }

    /* JADX INFO: renamed from: G1 */
    private final void m66937G1(FilterItem item, int position) {
        String title;
        HashMap map = new HashMap();
        map.put("event_type", "click_filter");
        if (item == null || (title = item.getTitle()) == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put("sequence", String.valueOf(position));
        map.put("tabId", String.valueOf(this.tabId));
        AbstractC25888b.m101678a(this.operateItem, map);
        C14450a c14450a = C14450a.f50860a;
        SubTabFragment.Companion companion = SubTabFragment.INSTANCE;
        Integer num = this.tabId;
        c14450a.m65143f(companion.m68282a(num != null ? num.intValue() : 1), map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, final FilterItem item) {
        String url;
        String thumbnail;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        if (getData().indexOf(item) == 0) {
            holder.itemView.getLayoutParams().width = AbstractC5776a0.m27313a(40.0f);
        } else {
            holder.itemView.getLayoutParams().width = this.itemWidth;
        }
        TnTextView tnTextView = (TnTextView) holder.getView(R$id.sub_operation_filter_title);
        if (item.isAll()) {
            tnTextView.setTextById(R$string.all);
            ((ImageView) holder.getView(R$id.sub_operation_filter_icon)).setImageResource(R$mipmap.bg_op_filter_all);
        } else {
            String title = item.getTitle();
            String str = "";
            if (title == null) {
                title = "";
            }
            tnTextView.setText(title);
            tnTextView.setTextColor(AbstractC5789h.m27406a(R$color.white_80));
            ImageView imageView = (ImageView) holder.getView(R$id.sub_operation_filter_icon);
            if (item.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubFilterAdapter$convert$1(item, imageView, null), 3, null);
            } else {
                C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
                Cover image = item.getImage();
                if (image == null || (url = image.getUrl()) == null) {
                    url = "";
                }
                C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
                Cover image2 = item.getImage();
                if (image2 != null && (thumbnail = image2.getThumbnail()) != null) {
                    str = thumbnail;
                }
                bVarM94468g.m94473l(str).m94474m(this.itemWidth).m94465d(imageView);
            }
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.adapter.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubFilterAdapter.m66934D1(item, this, view);
            }
        });
        m66936F1(item, getData().indexOf(item));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z0 */
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        BaseViewHolder baseViewHolderOnCreateViewHolder = super.onCreateViewHolder(parent, viewType);
        baseViewHolderOnCreateViewHolder.itemView.getLayoutParams().height = this.itemHeight;
        return baseViewHolderOnCreateViewHolder;
    }
}
