package com.transsion.shorttv_pugc.p317ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.bean.Cover;
import com.transsion.shorttv_pugc.bean.OperateItem;
import com.transsion.shorttv_pugc.bean.Subject;
import com.transsion.shorttv_pugc.utils.ShortTvExtKt;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p550kj.C24662i;
import p558kt.C25429b;
import p623nt.AbstractC26101b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001fR\u0018\u0010'\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/adapter/ShortTvOpRankingAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/shorttv_pugc/bean/Subject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "tabId", "", "pageName", "", "isHorizontal", "isTablet", "<init>", "(IILjava/lang/String;ZZ)V", WebConstants.FIELD_ITEM, "pos", "", "C1", "(Lcom/transsion/shorttv_pugc/bean/Subject;I)V", "Lcom/transsion/shorttv_pugc/bean/OperateItem;", "D1", "(Lcom/transsion/shorttv_pugc/bean/OperateItem;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "y0", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/shorttv_pugc/bean/Subject;)V", "F", "I", "G", "Ljava/lang/String;", "H", "itemWidth", "itemHeight", "J", "Lcom/transsion/shorttv_pugc/bean/OperateItem;", "operateItem", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTvOpRankingAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int itemWidth;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int itemHeight;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private OperateItem operateItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvOpRankingAdapter(int i11, int i12, String pageName, boolean z11, boolean z12) {
        super(i11, null, 2, null);
        Intrinsics.m97802h(pageName, "pageName");
        this.tabId = i12;
        this.pageName = pageName;
        int i13 = z11 ? 2 : z12 ? 4 : 3;
        float f11 = z11 ? 0.56f : 1.39f;
        int iM27313a = AbstractC5776a0.m27313a(((((AbstractC5776a0.m27314b(RangesKt.m97938h(AbstractC5806y.m27489e(), AbstractC5806y.m27487c())) - 12) - (i13 * 8)) - 12) * 1.0f) / i13);
        this.itemWidth = iM27313a;
        this.itemHeight = (int) (iM27313a * f11);
    }

    public /* synthetic */ ShortTvOpRankingAdapter(int i11, int i12, String str, boolean z11, boolean z12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? R$layout.pugc_short_tv_op_item_movie_rank : i11, i12, str, z11, z12);
    }

    /* JADX INFO: renamed from: C1 */
    private final void m80799C1(Subject item, int pos) {
        HashMap map = new HashMap();
        map.put("event_type", "browse_rank_item");
        map.put("sequence", String.valueOf(pos));
        map.put("tabId", String.valueOf(this.tabId));
        OperateItem operateItem = this.operateItem;
        if (operateItem != null) {
            ShortTvExtKt.m81298a(operateItem, map);
        }
        ShortTvExtKt.m81300c(item, map);
        C24662i.f75350a.m96872D(this.pageName, map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, Subject item) {
        String thumbnail;
        String url;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        int iM102232a = AbstractC26101b.m102232a(getData(), item);
        mo36114z(holder, getItemViewType(iM102232a));
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.main_op_movie_rank_image);
        if (shapeableImageView != null) {
            if (item.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ShortTvOpRankingAdapter$convert$1$1(item, shapeableImageView, null), 3, null);
            } else {
                C25429b.a aVar = C25429b.f76999a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                Cover cover = item.getCover();
                String str = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
                int i11 = this.itemWidth;
                int i12 = this.itemHeight;
                Cover cover2 = item.getCover();
                aVar.m99980j(context, shapeableImageView, str, (8120 & 8) != 0 ? aVar.m99977c() : i11, (8120 & 16) != 0 ? aVar.m99976b() : i12, (8120 & 32) != 0, (8120 & 64) != 0 ? "" : (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail, (8120 & 128) != 0, (8120 & 256) != 0, (8120 & 512) != 0 ? false : false, (8120 & 1024) != 0 ? false : false, (8120 & 2048) != 0 ? false : false, (8120 & 4096) != 0 ? 25 : 0);
            }
            if (shapeableImageView.getLayoutParams().width != this.itemWidth || shapeableImageView.getLayoutParams().height != this.itemHeight) {
                shapeableImageView.getLayoutParams().width = this.itemWidth;
                shapeableImageView.getLayoutParams().height = this.itemHeight;
            }
        }
        if (mo36094P(iM102232a) == 100) {
            return;
        }
        TextView textView = (TextView) holder.getViewOrNull(R$id.main_op_movie_rank_title);
        if (textView != null) {
            textView.setText(item.getTitle());
            textView.setMaxWidth(this.itemWidth);
        }
        holder.setText(R$id.main_op_movie_rank_corner, item.getCorner());
        m80799C1(item, iM102232a);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m80801D1(OperateItem item) {
        Intrinsics.m97802h(item, "item");
        this.operateItem = item;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: y0 */
    protected BaseViewHolder mo36095y0(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        if (viewType != 100) {
            BaseViewHolder baseViewHolderMo36095y0 = super.mo36095y0(parent, viewType);
            ShapeableImageView shapeableImageView = (ShapeableImageView) baseViewHolderMo36095y0.getViewOrNull(R$id.main_op_movie_rank_image);
            if (shapeableImageView != null) {
                shapeableImageView.getLayoutParams().width = this.itemWidth;
                shapeableImageView.getLayoutParams().height = this.itemHeight;
            }
            return baseViewHolderMo36095y0;
        }
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.pugc_short_tv_op_item_movie_rank_more, parent, false);
        View viewFindViewById = viewInflate.findViewById(R$id.main_op_movie_rank_image);
        if (viewFindViewById != null) {
            viewFindViewById.getLayoutParams().width = this.itemWidth;
            viewFindViewById.getLayoutParams().height = this.itemHeight;
        }
        View viewFindViewById2 = viewInflate.findViewById(R$id.main_op_movie_rank_more_mask);
        viewFindViewById2.getLayoutParams().width = this.itemWidth;
        viewFindViewById2.getLayoutParams().height = this.itemHeight;
        Intrinsics.m97799e(viewInflate);
        return new BaseViewHolder(viewInflate);
    }
}
