package com.transsion.home.adapter.operateUGC.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.baseui.R$string;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14571q;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCreator;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p462hj.C23860f;
import p579ll.C25648d;
import p822uv.AbstractC28040c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001f¨\u0006#"}, m97100d2 = {"Lcom/transsion/home/adapter/operateUGC/adapter/MovieRankUGCAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/ugcvideodetail/api/bean/UGCContent;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "tabId", "", "isTablet", "<init>", "(ILcom/transsion/home/bean/OperateItem;IZ)V", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", WebConstants.FIELD_ITEM, "pos", "", "F1", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;I)V", "E1", "Landroid/view/ViewGroup;", "parent", "viewType", "y0", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/ugcvideodetail/api/bean/UGCContent;)V", "F", "Lcom/transsion/home/bean/OperateItem;", "G", "I", "H", "itemWidth", "itemHeight", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MovieRankUGCAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: J */
    public static final int f51934J = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final OperateItem operateItem;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int itemWidth;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int itemHeight;

    public MovieRankUGCAdapter(int i11, OperateItem operateItem, int i12, boolean z11) {
        super(i11, null, 2, null);
        this.operateItem = operateItem;
        this.tabId = i12;
        int i13 = z11 ? 3 : 2;
        int iM27313a = AbstractC5776a0.m27313a(((((AbstractC5776a0.m27314b(RangesKt.m97938h(AbstractC5806y.m27489e(), AbstractC5806y.m27487c())) - 12) - (i13 * 8)) - 12) * 1.0f) / i13);
        this.itemWidth = iM27313a;
        this.itemHeight = (int) (iM27313a * 0.56f);
    }

    public /* synthetic */ MovieRankUGCAdapter(int i11, OperateItem operateItem, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? R$layout.item_ugc_movie_rank : i11, operateItem, i12, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m66743D1(UGCVideo uGCVideo, MovieRankUGCAdapter movieRankUGCAdapter, int i11, View view) {
        Integer numValueOf = Integer.valueOf(movieRankUGCAdapter.tabId);
        OperateItem operateItem = movieRankUGCAdapter.operateItem;
        AbstractC28040c.m109011h(uGCVideo, numValueOf, operateItem != null ? operateItem.getOpId() : null);
        movieRankUGCAdapter.m66744E1(uGCVideo, i11);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m66744E1(UGCVideo item, int pos) {
        C25648d.a.m100951g(C25648d.f77807c, this.tabId, pos, this.operateItem, item, null, 16, null);
    }

    /* JADX INFO: renamed from: F1 */
    private final void m66745F1(UGCVideo item, int pos) {
        C25648d.a.m100950e(C25648d.f77807c, this.tabId, pos, this.operateItem, item, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0147  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0156  */
    /* JADX WARN: Code duplicated, block: B:54:0x015c  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x012f, please report this as an issue */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, UGCContent item) {
        String strM65658j;
        List listQ;
        String nickname;
        String url;
        String thumbnail;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        final int iM23922e = AbstractC5114k.m23922e(getData(), item);
        mo36114z(holder, getItemViewType(iM23922e));
        final UGCVideo video = item.getVideo();
        if (video == null) {
            return;
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.home_ugc_movie_rank_image);
        String str = "";
        if (shapeableImageView != null) {
            if (video.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new MovieRankUGCAdapter$convert$1$1(video, shapeableImageView, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = video.getCover();
                if (cover == null || (url = cover.getUrl()) == null) {
                    url = "";
                }
                C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
                Cover cover2 = video.getCover();
                if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                    thumbnail = "";
                }
                bVarM94468g.m94473l(thumbnail).m94474m(this.itemWidth).m94465d(shapeableImageView);
            }
        }
        TextView textView = (TextView) holder.getViewOrNull(R$id.home_ugc_movie_rank_title);
        if (textView != null) {
            textView.setText(video.getTitle());
        }
        holder.setText(R$id.home_ugc_movie_rank_corner, video.getCorner());
        ImageView imageView = (ImageView) holder.getViewOrNull(R$id.home_ugc_movie_rank_type_icon);
        if (imageView != null) {
            UGCVideoTypeKt.m83628i(imageView, video, null, 4, null);
        }
        holder.setText(R$id.home_ugc_movie_rank_time_text, video.getTimeOrCount(getContext()));
        holder.setText(R$id.home_ugc_movie_rank_title, video.getTitle());
        if (video.isVerticalImmStyle()) {
            listQ = CollectionsKt.m97511q("special_#shorts_icon", Utils.m27275a().getString(R$string.ugc_video_shorts), AbstractC14564j.m65682c(video.getWatchNum(), getContext()));
        } else if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.tabId), false)) {
            UGCVideoCreator creator = video.getCreator();
            String nickname2 = creator != null ? creator.getNickname() : null;
            if (nickname2 == null || nickname2.length() == 0) {
                String strM65682c = AbstractC14564j.m65682c(video.getWatchNum(), getContext());
                if (this.tabId == HomeTabId.UGC_Trending.getValue()) {
                    Long publishTime = video.getPublishTime();
                    strM65658j = TimeUtilKt.m65659k(publishTime != null ? publishTime.longValue() : 0L);
                } else {
                    Long publishTime2 = video.getPublishTime();
                    strM65658j = TimeUtilKt.m65658j(publishTime2 != null ? publishTime2.longValue() : 0L);
                }
                listQ = CollectionsKt.m97511q(strM65682c, strM65658j);
            } else {
                String strM65682c2 = AbstractC14564j.m65682c(video.getWatchNum(), getContext());
                UGCVideoCreator creator2 = video.getCreator();
                if (creator2 != null && (nickname = creator2.getNickname()) != null) {
                    str = nickname;
                }
                listQ = CollectionsKt.m97511q(strM65682c2, "special_#user_icon", str);
            }
        } else {
            String strM65682c3 = AbstractC14564j.m65682c(video.getWatchNum(), getContext());
            if (this.tabId == HomeTabId.UGC_Trending.getValue()) {
                Long publishTime3 = video.getPublishTime();
                strM65658j = TimeUtilKt.m65659k(publishTime3 != null ? publishTime3.longValue() : 0L);
            } else {
                Long publishTime4 = video.getPublishTime();
                strM65658j = TimeUtilKt.m65658j(publishTime4 != null ? publishTime4.longValue() : 0L);
            }
            listQ = CollectionsKt.m97511q(strM65682c3, strM65658j);
        }
        holder.setText(R$id.home_ugc_movie_rank_subtitle, AbstractC14571q.m65708e(listQ, getContext()));
        m66745F1(video, iM23922e);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.adapter.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MovieRankUGCAdapter.m66743D1(video, this, iM23922e, view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: y0 */
    protected BaseViewHolder mo36095y0(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        BaseViewHolder baseViewHolderMo36095y0 = super.mo36095y0(parent, viewType);
        ShapeableImageView shapeableImageView = (ShapeableImageView) baseViewHolderMo36095y0.getViewOrNull(R$id.home_ugc_movie_rank_image);
        if (shapeableImageView != null) {
            shapeableImageView.getLayoutParams().width = this.itemWidth;
            shapeableImageView.getLayoutParams().height = this.itemHeight;
        }
        return baseViewHolderMo36095y0;
    }
}
