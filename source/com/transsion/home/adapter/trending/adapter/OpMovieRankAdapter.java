package com.transsion.home.adapter.trending.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.baselib.helper.C14450a;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
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
import ml.AbstractC25888b;
import p462hj.C23860f;
import p842vl.C28121c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006%"}, m97100d2 = {"Lcom/transsion/home/adapter/trending/adapter/OpMovieRankAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "", "isSubTab", "tabId", "isHorizontal", "isTablet", "<init>", "(ILcom/transsion/home/bean/OperateItem;ZIZZ)V", WebConstants.FIELD_ITEM, "pos", "", "C1", "(Lcom/transsion/moviedetailapi/bean/Subject;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "y0", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Subject;)V", "F", "Lcom/transsion/home/bean/OperateItem;", "G", "Z", "H", "I", "itemWidth", "J", "itemHeight", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class OpMovieRankAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: K */
    public static final int f52420K = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final OperateItem operateItem;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final boolean isSubTab;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int itemWidth;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int itemHeight;

    public OpMovieRankAdapter(int i11, OperateItem operateItem, boolean z11, int i12, boolean z12, boolean z13) {
        super(i11, null, 2, null);
        this.operateItem = operateItem;
        this.isSubTab = z11;
        this.tabId = i12;
        int i13 = z12 ? 2 : z13 ? 4 : 3;
        float f11 = z12 ? 0.56f : 1.39f;
        int iM27313a = AbstractC5776a0.m27313a(((((AbstractC5776a0.m27314b(RangesKt.m97938h(AbstractC5806y.m27489e(), AbstractC5806y.m27487c())) - 12) - (i13 * 8)) - 24) * 1.0f) / i13);
        this.itemWidth = iM27313a;
        this.itemHeight = (int) (iM27313a * f11);
    }

    public /* synthetic */ OpMovieRankAdapter(int i11, OperateItem operateItem, boolean z11, int i12, boolean z12, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? R$layout.item_main_operation_movie_rank : i11, operateItem, z11, i12, z12, z13);
    }

    /* JADX INFO: renamed from: C1 */
    private final void m67195C1(Subject item, int pos) {
        HashMap map = new HashMap();
        map.put("event_type", "browse_rank_item");
        map.put("sequence", String.valueOf(pos));
        map.put("tabId", String.valueOf(this.tabId));
        OperateItem operateItem = this.operateItem;
        if (operateItem != null) {
            AbstractC25888b.m101678a(operateItem, map);
        }
        AbstractC25888b.m101682e(item, map);
        C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.tabId), map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, Subject item) {
        String url;
        String thumbnail;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        int iM23922e = AbstractC5114k.m23922e(getData(), item);
        mo36114z(holder, getItemViewType(iM23922e));
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.main_op_movie_rank_image);
        if (shapeableImageView != null) {
            if (item.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new OpMovieRankAdapter$convert$1$1(item, shapeableImageView, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = item.getCover();
                String str = "";
                if (cover == null || (url = cover.getUrl()) == null) {
                    url = "";
                }
                C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
                Cover cover2 = item.getCover();
                if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
                    str = thumbnail;
                }
                bVarM94468g.m94473l(str).m94474m(this.itemWidth).m94464c(this.itemHeight).m94465d(shapeableImageView);
            }
            if (shapeableImageView.getLayoutParams().width != this.itemWidth || shapeableImageView.getLayoutParams().height != this.itemHeight) {
                shapeableImageView.getLayoutParams().width = this.itemWidth;
                shapeableImageView.getLayoutParams().height = this.itemHeight;
            }
        }
        if (mo36094P(iM23922e) == 100) {
            return;
        }
        TextView textView = (TextView) holder.getViewOrNull(R$id.main_op_movie_rank_title);
        if (textView != null) {
            textView.setText(item.getTitle());
            textView.setMaxWidth(this.itemWidth);
        }
        holder.setText(R$id.main_op_movie_rank_corner, item.getCorner());
        if (this.isSubTab) {
            m67195C1(item, iM23922e);
        } else {
            C28121c.f86299a.m109217g(item, iM23922e, this.operateItem);
        }
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
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_main_operation_movie_rank_more, parent, false);
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
