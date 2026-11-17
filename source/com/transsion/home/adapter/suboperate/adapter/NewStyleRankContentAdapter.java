package com.transsion.home.adapter.suboperate.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001eR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001e¨\u0006$"}, m97100d2 = {"Lcom/transsion/home/adapter/suboperate/adapter/NewStyleRankContentAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "tabId", "", "isHorizontal", "isTablet", "<init>", "(ILcom/transsion/home/bean/OperateItem;IZZ)V", RequestParameters.POSITION, "P", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "y0", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Subject;)V", "F", "Lcom/transsion/home/bean/OperateItem;", "G", "I", "H", "itemWidth", "itemHeight", "J", "descHeight", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class NewStyleRankContentAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: K */
    public static final int f52120K = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final OperateItem operateItem;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int itemWidth;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int itemHeight;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int descHeight;

    public NewStyleRankContentAdapter(int i11, OperateItem operateItem, int i12, boolean z11, boolean z12) {
        super(i11, null, 2, null);
        this.operateItem = operateItem;
        this.tabId = i12;
        int i13 = z11 ? 2 : z12 ? 4 : 3;
        float f11 = z11 ? 0.56f : 1.39f;
        int iM27313a = AbstractC5776a0.m27313a(((((AbstractC5776a0.m27314b(RangesKt.m97938h(AbstractC5806y.m27489e(), AbstractC5806y.m27487c())) - 12) - (i13 * 8)) - 24) * 1.0f) / i13);
        this.itemWidth = iM27313a;
        this.itemHeight = (int) (iM27313a * f11);
        this.descHeight = AbstractC5776a0.m27313a(27.0f);
    }

    public /* synthetic */ NewStyleRankContentAdapter(int i11, OperateItem operateItem, int i12, boolean z11, boolean z12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? R$layout.home_item_new_style_rank_content : i11, operateItem, i12, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, Subject item) {
        String url;
        String thumbnail;
        String url2;
        String thumbnail2;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.main_op_movie_rank_image);
        if (shapeableImageView != null) {
            if (item.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new NewStyleRankContentAdapter$convert$1$1(item, shapeableImageView, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = item.getCover();
                if (cover == null || (url2 = cover.getUrl()) == null) {
                    url2 = "";
                }
                C23860f.b bVarM94468g = bVarM94457m.m94468g(url2);
                Cover cover2 = item.getCover();
                if (cover2 == null || (thumbnail2 = cover2.getThumbnail()) == null) {
                    thumbnail2 = "";
                }
                bVarM94468g.m94473l(thumbnail2).m94474m(this.itemWidth).m94464c(this.itemHeight + this.descHeight).m94465d(shapeableImageView);
            }
            if (shapeableImageView.getLayoutParams().width != this.itemWidth || shapeableImageView.getLayoutParams().height != this.itemHeight + this.descHeight) {
                shapeableImageView.getLayoutParams().width = this.itemWidth;
                shapeableImageView.getLayoutParams().height = this.itemHeight + this.descHeight;
            }
        }
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) holder.getViewOrNull(R$id.mainOpMovieRankImage);
        if (shapeableImageView2 != null) {
            if (item.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new NewStyleRankContentAdapter$convert$2$1(item, shapeableImageView2, null), 3, null);
            } else {
                C23860f.a aVar2 = C23860f.f72909a;
                Context context2 = shapeableImageView2.getContext();
                Intrinsics.m97801g(context2, "getContext(...)");
                C23860f.b bVarM94457m2 = aVar2.m94457m(context2);
                Cover cover3 = item.getCover();
                if (cover3 == null || (url = cover3.getUrl()) == null) {
                    url = "";
                }
                C23860f.b bVarM94468g2 = bVarM94457m2.m94468g(url);
                Cover cover4 = item.getCover();
                if (cover4 == null || (thumbnail = cover4.getThumbnail()) == null) {
                    thumbnail = "";
                }
                bVarM94468g2.m94473l(thumbnail).m94474m(this.itemWidth).m94464c(this.itemHeight).m94465d(shapeableImageView2);
            }
            if (shapeableImageView2.getLayoutParams().width != this.itemWidth || shapeableImageView2.getLayoutParams().height != this.itemHeight) {
                shapeableImageView2.getLayoutParams().width = this.itemWidth;
                shapeableImageView2.getLayoutParams().height = this.itemHeight;
            }
        }
        if (mo36094P(AbstractC5114k.m23922e(getData(), item)) == 100) {
            return;
        }
        TextView textView = (TextView) holder.getViewOrNull(R$id.main_op_movie_rank_title);
        if (textView != null) {
            textView.setText(item.getTitle());
            textView.setMaxWidth(this.itemWidth);
        }
        TextView textView2 = (TextView) holder.getView(R$id.tvRank);
        int bindingAdapterPosition = holder.getBindingAdapterPosition() + 1;
        textView2.setText(String.valueOf(bindingAdapterPosition));
        if (bindingAdapterPosition == 1) {
            textView2.setBackgroundResource(R$drawable.bg_ranking_tl_no1);
        } else if (bindingAdapterPosition == 2) {
            textView2.setBackgroundResource(R$drawable.bg_ranking_tl_no2);
        } else if (bindingAdapterPosition != 3) {
            textView2.setBackgroundResource(R$drawable.bg_ranking_tl_normal);
        } else {
            textView2.setBackgroundResource(R$drawable.bg_ranking_tl_no3);
        }
        TextView textView3 = (TextView) holder.getView(R$id.main_op_movie_rank_corner);
        String corner = item.getCorner();
        String str = corner != null ? corner : "";
        if (str.length() <= 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(str);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: P */
    protected int mo36094P(int position) {
        if (position == getItemCount() - 1) {
            return 100;
        }
        return super.mo36094P(position);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: y0 */
    protected BaseViewHolder mo36095y0(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        if (viewType != 100) {
            BaseViewHolder baseViewHolderMo36095y0 = super.mo36095y0(parent, viewType);
            ShapeableImageView shapeableImageView = (ShapeableImageView) baseViewHolderMo36095y0.getViewOrNull(R$id.mainOpMovieRankImage);
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
            viewFindViewById.getLayoutParams().height = this.itemHeight + this.descHeight;
        }
        View viewFindViewById2 = viewInflate.findViewById(R$id.main_op_movie_rank_more_mask);
        viewFindViewById2.getLayoutParams().width = this.itemWidth;
        viewFindViewById2.getLayoutParams().height = this.itemHeight + this.descHeight;
        Intrinsics.m97799e(viewInflate);
        return new BaseViewHolder(viewInflate);
    }
}
