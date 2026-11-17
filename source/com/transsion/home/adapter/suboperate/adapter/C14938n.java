package com.transsion.home.adapter.suboperate.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baselib.helper.C14450a;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.BffCommonOpData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import ml.AbstractC25888b;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.adapter.n */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00011B+\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010(R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010(¨\u00062"}, m97100d2 = {"Lcom/transsion/home/adapter/suboperate/adapter/n;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/bean/BffCommonOpData;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "tabId", "", "isTablet", "<init>", "(ILcom/transsion/home/bean/OperateItem;IZ)V", WebConstants.FIELD_ITEM, RequestParameters.POSITION, "", "D1", "(Lcom/transsion/home/bean/BffCommonOpData;I)V", "C1", "(Lcom/transsion/home/bean/BffCommonOpData;)Z", "newOperateItem", "E1", "(Lcom/transsion/home/bean/OperateItem;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "P", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "y0", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/bean/BffCommonOpData;)V", "F", "Lcom/transsion/home/bean/OperateItem;", "G", "I", "H", "Z", "itemWidth", "J", "itemHeight", "K", "titleAreaHeight", "L", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C14938n extends BaseQuickAdapter {

    /* JADX INFO: renamed from: M */
    public static final int f52227M = 8;

    /* JADX INFO: renamed from: N */
    public static final int f52228N = 100;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private OperateItem operateItem;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean isTablet;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int itemWidth;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int itemHeight;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private int titleAreaHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14938n(int i11, OperateItem operateItem, int i12, boolean z11) {
        super(i11, null, 2, null);
        Intrinsics.m97802h(operateItem, "operateItem");
        this.operateItem = operateItem;
        this.tabId = i12;
        this.isTablet = z11;
        this.titleAreaHeight = AbstractC5776a0.m27313a(28.0f);
        int i13 = z11 ? 4 : 3;
        int iM27313a = AbstractC5776a0.m27313a(((((AbstractC5776a0.m27314b(RangesKt.m97938h(AbstractC5806y.m27489e(), AbstractC5806y.m27487c())) - 12) - (i13 * 8)) - 24) * 1.0f) / i13);
        this.itemWidth = iM27313a;
        this.itemHeight = (int) (iM27313a * 1.39f);
    }

    public /* synthetic */ C14938n(int i11, OperateItem operateItem, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? R$layout.item_sub_post_list_card : i11, operateItem, i12, (i13 & 8) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: C1 */
    private final boolean m66976C1(BffCommonOpData item) {
        Integer postType = item.getPostType();
        return postType != null && postType.intValue() == 4;
    }

    /* JADX INFO: renamed from: D1 */
    private final void m66977D1(BffCommonOpData item, int position) {
        HashMap map = new HashMap();
        map.put("event_type", "browse_post_list_item");
        map.put("sequence", String.valueOf(position));
        map.put("tabId", String.valueOf(this.tabId));
        if (item != null) {
            AbstractC25888b.m101681d(item, map);
        }
        AbstractC25888b.m101678a(this.operateItem, map);
        C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.tabId), map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, BffCommonOpData item) {
        String url;
        String thumbnail;
        String url2;
        String thumbnail2;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        if (this.itemWidth < 10 || this.itemHeight < 10) {
            return;
        }
        String str = "";
        if (mo36094P(holder.getBindingAdapterPosition()) == 100) {
            int i11 = this.itemHeight + this.titleAreaHeight;
            ImageView imageView = (ImageView) holder.getViewOrNull(R$id.main_op_movie_rank_image);
            if (imageView != null) {
                Cover image = item.getImage();
                C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
                if (image == null || (url2 = image.getUrl()) == null) {
                    url2 = "";
                }
                C23860f.b bVarM94468g = bVarM94457m.m94468g(url2);
                if (image != null && (thumbnail2 = image.getThumbnail()) != null) {
                    str = thumbnail2;
                }
                bVarM94468g.m94473l(str).m94474m(this.itemWidth).m94464c(i11).m94465d(imageView);
                return;
            }
            return;
        }
        TextView textView = (TextView) holder.getView(R$id.postTitle);
        holder.getView(R$id.videoPlay).setVisibility(m66976C1(item) ? 0 : 8);
        ImageView imageView2 = (ImageView) holder.getView(R$id.postCover);
        imageView2.getLayoutParams().width = this.itemWidth;
        imageView2.getLayoutParams().height = this.itemHeight;
        textView.setMaxWidth(this.itemWidth);
        Cover image2 = item.getImage();
        C23860f.b bVarM94457m2 = C23860f.f72909a.m94457m(getContext());
        if (image2 == null || (url = image2.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94468g2 = bVarM94457m2.m94468g(url);
        if (image2 != null && (thumbnail = image2.getThumbnail()) != null) {
            str = thumbnail;
        }
        bVarM94468g2.m94473l(str).m94474m(this.itemWidth).m94464c(this.itemHeight).m94465d(imageView2);
        textView.setText(item.getContent());
        m66977D1(item, getData().indexOf(item));
    }

    /* JADX INFO: renamed from: E1 */
    public final void m66979E1(OperateItem newOperateItem) {
        Intrinsics.m97802h(newOperateItem, "newOperateItem");
        this.operateItem = newOperateItem;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: P */
    protected int mo36094P(int position) {
        BffCommonOpData bffCommonOpData = (BffCommonOpData) m36182f0(position);
        if (position == getItemCount() - 1) {
            if (Intrinsics.m97797c(bffCommonOpData != null ? bffCommonOpData.getId() : null, "0")) {
                return 100;
            }
        }
        return super.mo36094P(position);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.m97802h(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        View viewFindViewById = LayoutInflater.from(recyclerView.getContext()).inflate(R$layout.item_sub_post_list_card, (ViewGroup) recyclerView, false).findViewById(R$id.postTitle);
        viewFindViewById.measure(View.MeasureSpec.makeMeasureSpec(this.itemWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.titleAreaHeight = viewFindViewById.getMeasuredHeight();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: y0 */
    protected BaseViewHolder mo36095y0(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        if (viewType != 100) {
            BaseViewHolder baseViewHolderMo36095y0 = super.mo36095y0(parent, viewType);
            ImageView imageView = (ImageView) baseViewHolderMo36095y0.getViewOrNull(R$id.postCover);
            if (imageView != null) {
                imageView.getLayoutParams().width = this.itemWidth;
                imageView.getLayoutParams().height = this.itemHeight;
            }
            return baseViewHolderMo36095y0;
        }
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.item_main_operation_movie_rank_more, parent, false);
        int i11 = this.itemHeight + this.titleAreaHeight;
        View viewFindViewById = viewInflate.findViewById(R$id.main_op_movie_rank_image);
        if (viewFindViewById != null) {
            viewFindViewById.getLayoutParams().width = this.itemWidth;
            viewFindViewById.getLayoutParams().height = i11;
        }
        View viewFindViewById2 = viewInflate.findViewById(R$id.main_op_movie_rank_more_mask);
        if (viewFindViewById2 != null) {
            viewFindViewById2.getLayoutParams().width = this.itemWidth;
            viewFindViewById2.getLayoutParams().height = i11;
        }
        Intrinsics.m97799e(viewInflate);
        return new BaseViewHolder(viewInflate);
    }
}
