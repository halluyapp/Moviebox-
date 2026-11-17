package com.transsion.home.adapter.operateUGC.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14571q;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RankingListItem;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCreator;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p462hj.C23860f;
import p579ll.C25648d;
import p822uv.AbstractC28040c;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.adapter.d */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006'"}, m97100d2 = {"Lcom/transsion/home/adapter/operateUGC/adapter/d;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/bean/RankingListItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "tabId", "<init>", "(ILcom/transsion/home/bean/OperateItem;I)V", "Landroid/content/Context;", "context", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "ugcVideo", "Landroid/view/ViewGroup;", "parent", RequestParameters.POSITION, "Landroid/view/View;", "F1", "(Landroid/content/Context;Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;Landroid/view/ViewGroup;I)Landroid/view/View;", "pos", "E1", "(I)I", "rankListItem", "", "G1", "(Lcom/transsion/home/bean/RankingListItem;I)V", "H1", "holder", WebConstants.FIELD_ITEM, "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/bean/RankingListItem;)V", "F", "Lcom/transsion/home/bean/OperateItem;", "G", "I", "H", "perWidth", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C14858d extends BaseQuickAdapter {

    /* JADX INFO: renamed from: I */
    public static final int f51961I = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final OperateItem operateItem;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int perWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14858d(int i11, OperateItem operateItem, int i12) {
        super(i11, null, 2, null);
        Intrinsics.m97802h(operateItem, "operateItem");
        this.operateItem = operateItem;
        this.tabId = i12;
        this.perWidth = Math.min(AbstractC5806y.m27489e(), AbstractC5806y.m27487c()) - AbstractC5776a0.m27313a(54.0f);
    }

    public /* synthetic */ C14858d(int i11, OperateItem operateItem, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? R$layout.item_ugc_provider_ranklist : i11, operateItem, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m66764D1(UGCContent uGCContent, C14858d c14858d, RankingListItem rankingListItem, int i11, View view) {
        AbstractC28040c.m109011h(uGCContent.getVideo(), Integer.valueOf(c14858d.tabId), c14858d.operateItem.getOpId());
        c14858d.m66768H1(rankingListItem, i11);
    }

    /* JADX INFO: renamed from: E1 */
    private final int m66765E1(int pos) {
        if (pos == 0) {
            return R$drawable.ic_ugc_rank_01;
        }
        if (pos != 1) {
            return pos != 2 ? R$drawable.ic_ugc_rank_default : R$drawable.ic_ugc_rank_03;
        }
        return R$drawable.ic_ugc_rank_02;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    /* JADX INFO: renamed from: F1 */
    private final View m66766F1(Context context, UGCVideo ugcVideo, ViewGroup parent, int position) {
        String url;
        String corner;
        String timeOrCount;
        long jLongValue;
        String strM65658j;
        Long publishTime;
        List listQ;
        Long publishTime2;
        String strValueOf;
        String nickname;
        UGCVideoCreator creator;
        UGCVideoCreator creator2;
        Cover cover;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.item_ugc_provider_ranklist_items, parent, false);
        View viewFindViewById = viewInflate.findViewById(R$id.home_ugc_rankinglist_cover);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        ShapeableImageView shapeableImageView = (ShapeableImageView) viewFindViewById;
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(context);
        if (ugcVideo == null || (cover = ugcVideo.getCover()) == null || (url = cover.getUrl()) == null) {
            url = "";
        }
        bVarM94457m.m94468g(url).m94465d(shapeableImageView);
        ((TextView) viewInflate.findViewById(R$id.home_ugc_rankinglist_title)).setText(ugcVideo != null ? ugcVideo.getTitle() : null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.home_ugc_rankinglist_corner_text);
        if (ugcVideo == null || (corner = ugcVideo.getCorner()) == null) {
            corner = "";
        }
        textView.setText(corner);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.home_ugc_ranklist_time_text);
        if (ugcVideo == null || (timeOrCount = ugcVideo.getTimeOrCount(context)) == null) {
            timeOrCount = "";
        }
        textView2.setText(timeOrCount);
        if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.tabId), false)) {
            String nickname2 = (ugcVideo == null || (creator2 = ugcVideo.getCreator()) == null) ? null : creator2.getNickname();
            if (nickname2 == null || nickname2.length() == 0) {
                String strM65682c = AbstractC14564j.m65682c(ugcVideo != null ? ugcVideo.getWatchNum() : null, context);
                jLongValue = 0;
                if (this.tabId == HomeTabId.UGC_Trending.getValue()) {
                    if (ugcVideo != null) {
                        jLongValue = publishTime2.longValue();
                    }
                    strM65658j = TimeUtilKt.m65659k(jLongValue);
                } else {
                    if (ugcVideo != null) {
                        jLongValue = publishTime.longValue();
                    }
                    strM65658j = TimeUtilKt.m65658j(jLongValue);
                }
                listQ = CollectionsKt.m97511q(strM65682c, strM65658j);
            } else {
                String strM65682c2 = AbstractC14564j.m65682c(ugcVideo != null ? ugcVideo.getWatchNum() : null, context);
                if (ugcVideo == null || (creator = ugcVideo.getCreator()) == null || (nickname = creator.getNickname()) == null) {
                    nickname = "";
                }
                listQ = CollectionsKt.m97511q(strM65682c2, "special_#user_icon", nickname);
            }
        } else {
            String strM65682c3 = AbstractC14564j.m65682c(ugcVideo != null ? ugcVideo.getWatchNum() : null, context);
            jLongValue = 0;
            if (this.tabId == HomeTabId.UGC_Trending.getValue()) {
                if (ugcVideo != null && (publishTime2 = ugcVideo.getPublishTime()) != null) {
                    jLongValue = publishTime2.longValue();
                }
                strM65658j = TimeUtilKt.m65659k(jLongValue);
            } else {
                if (ugcVideo != null && (publishTime = ugcVideo.getPublishTime()) != null) {
                    jLongValue = publishTime.longValue();
                }
                strM65658j = TimeUtilKt.m65658j(jLongValue);
            }
            listQ = CollectionsKt.m97511q(strM65682c3, strM65658j);
        }
        ((TextView) viewInflate.findViewById(R$id.home_ugc_rankinglist_tag)).setText(AbstractC14571q.m65708e(listQ, context));
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R$id.home_ugc_rankinglist_rank);
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(m66765E1(position));
        }
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.home_ugc_rankinglist_text);
        if (position > 2) {
            if (position < 9) {
                strValueOf = "0" + (position + 1);
            } else {
                strValueOf = String.valueOf(position + 1);
            }
            textView3.setText(strValueOf);
        } else {
            textView3.setText("");
        }
        Intrinsics.m97799e(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: G1 */
    private final void m66767G1(RankingListItem rankListItem, int position) {
        UGCContent uGCContent;
        List<UGCContent> contentList = rankListItem.getContentList();
        UGCVideo video = (contentList == null || (uGCContent = contentList.get(position)) == null) ? null : uGCContent.getVideo();
        C25648d.a aVar = C25648d.f77807c;
        int i11 = this.tabId;
        OperateItem operateItem = this.operateItem;
        String title = rankListItem.getTitle();
        if (title == null) {
            title = "";
        }
        aVar.m100955d(i11, position, operateItem, video, MapsKt.m97551f(TuplesKt.m97108a("page_tab_name", title)));
    }

    /* JADX INFO: renamed from: H1 */
    private final void m66768H1(RankingListItem rankListItem, int position) {
        UGCContent uGCContent;
        List<UGCContent> contentList = rankListItem.getContentList();
        UGCVideo video = (contentList == null || (uGCContent = contentList.get(position)) == null) ? null : uGCContent.getVideo();
        C25648d.a aVar = C25648d.f77807c;
        int i11 = this.tabId;
        OperateItem operateItem = this.operateItem;
        String title = rankListItem.getTitle();
        if (title == null) {
            title = "";
        }
        aVar.m100956f(i11, position, operateItem, video, MapsKt.m97551f(TuplesKt.m97108a("page_tab_name", title)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, final RankingListItem item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        LinearLayout linearLayout = (LinearLayout) holder.getView(R$id.home_ugc_rankinglist_liner);
        linearLayout.removeAllViews();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = this.perWidth;
        linearLayout.setLayoutParams(layoutParams);
        List<UGCContent> contentList = item.getContentList();
        if (contentList != null) {
            final int i11 = 0;
            for (Object obj : contentList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                final UGCContent uGCContent = (UGCContent) obj;
                View viewM66766F1 = m66766F1(getContext(), uGCContent.getVideo(), linearLayout, i11);
                linearLayout.addView(viewM66766F1);
                viewM66766F1.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.adapter.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C14858d.m66764D1(uGCContent, this, item, i11, view);
                    }
                });
                m66767G1(item, i11);
                i11 = i12;
            }
        }
    }
}
