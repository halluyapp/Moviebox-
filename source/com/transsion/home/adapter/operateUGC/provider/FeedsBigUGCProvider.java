package com.transsion.home.adapter.operateUGC.provider;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.baseui.R$string;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14571q;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.trending.provider.AbstractC15028b;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCreator;
import com.transsion.wrapperad.R$color;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p462hj.C23860f;
import p579ll.C25648d;
import p822uv.AbstractC28040c;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedsBigUGCProvider extends AbstractC15028b {

    /* JADX INFO: renamed from: e */
    private final int f51984e;

    /* JADX INFO: renamed from: f */
    private final int f51985f = AbstractC5806y.m27489e() - (AbstractC5776a0.m27313a(12.0f) * 2);

    /* JADX INFO: renamed from: g */
    private final Lazy f51986g = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.operateUGC.provider.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FeedsBigUGCProvider.m66782I(this.f52033a);
        }
    });

    public FeedsBigUGCProvider(int i11) {
        this.f51984e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m66780G(OperateItem operateItem, FeedsBigUGCProvider feedsBigUGCProvider, BaseViewHolder baseViewHolder, View view) {
        UGCVideo feedsUGCVideo = operateItem.getFeedsUGCVideo();
        if (feedsUGCVideo != null) {
            Integer numValueOf = Integer.valueOf(feedsBigUGCProvider.f51984e);
            String opId = operateItem.getOpId();
            if (opId == null) {
                OperateItem originalOperateItem = operateItem.getOriginalOperateItem();
                opId = originalOperateItem != null ? originalOperateItem.getOpId() : null;
            }
            AbstractC28040c.m109011h(feedsUGCVideo, numValueOf, opId);
        }
        C25648d.f77807c.m100954c(baseViewHolder.getLayoutPosition(), operateItem, feedsBigUGCProvider.f51984e);
    }

    /* JADX INFO: renamed from: H */
    private final C25648d m66781H() {
        return (C25648d) this.f51986g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C25648d m66782I(FeedsBigUGCProvider feedsBigUGCProvider) {
        return new C25648d(SubTabFragment.INSTANCE.m68282a(feedsBigUGCProvider.f51984e));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0152  */
    /* JADX WARN: Code duplicated, block: B:54:0x0158  */
    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163  */
    /* JADX WARN: Code duplicated, block: B:59:0x0169  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, final OperateItem item) {
        String ugcVideoId;
        Long publishTime;
        long jLongValue;
        String strM65658j;
        List listQ;
        Long publishTime2;
        long jLongValue2;
        String nickname;
        String url;
        String thumbnail;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        helper.itemView.setTag("UGCFeedsBig");
        UGCVideo feedsUGCVideo = item.getFeedsUGCVideo();
        if (feedsUGCVideo == null || (ugcVideoId = feedsUGCVideo.getUgcVideoId()) == null || ugcVideoId.length() == 0) {
            return;
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getViewOrNull(R$id.main_op_trending_grid_image);
        String str = "";
        if (shapeableImageView != null) {
            if (feedsUGCVideo.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new FeedsBigUGCProvider$convert$1$1(feedsUGCVideo, shapeableImageView, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = feedsUGCVideo.getCover();
                if (cover == null || (url = cover.getUrl()) == null) {
                    url = "";
                }
                C23860f.b bVarM94474m = bVarM94457m.m94468g(url).m94474m(this.f51985f);
                Cover cover2 = feedsUGCVideo.getCover();
                if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                    thumbnail = "";
                }
                bVarM94474m.m94473l(thumbnail).m94470i(R$color.module_01).m94465d(shapeableImageView);
            }
        }
        TextView textView = (TextView) helper.getViewOrNull(R$id.main_op_trending_grid_title);
        if (textView != null) {
            textView.setText(feedsUGCVideo.getTitle());
        }
        helper.setText(R$id.main_op_trending_grid_corner, feedsUGCVideo.getCorner());
        ImageView imageView = (ImageView) helper.getViewOrNull(R$id.main_op_trending_grid_type_icon);
        if (imageView != null) {
            UGCVideoTypeKt.m83628i(imageView, feedsUGCVideo, null, 4, null);
        }
        helper.setText(R$id.main_op_trending_grid_time_text, feedsUGCVideo.getTimeOrCount(m36338k()));
        helper.setText(R$id.main_op_trending_grid_title, feedsUGCVideo.getTitle());
        if (feedsUGCVideo.isVerticalImmStyle()) {
            listQ = CollectionsKt.m97511q("special_#shorts_icon", Utils.m27275a().getString(R$string.ugc_video_shorts), AbstractC14564j.m65682c(feedsUGCVideo.getWatchNum(), m36338k()));
        } else if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.f51984e), false)) {
            UGCVideoCreator creator = feedsUGCVideo.getCreator();
            String nickname2 = creator != null ? creator.getNickname() : null;
            if (nickname2 == null || nickname2.length() == 0) {
                String strM65682c = AbstractC14564j.m65682c(feedsUGCVideo.getWatchNum(), m36338k());
                if (this.f51984e == HomeTabId.UGC_Trending.getValue()) {
                    publishTime2 = feedsUGCVideo.getPublishTime();
                    if (publishTime2 != null) {
                        jLongValue2 = publishTime2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    strM65658j = TimeUtilKt.m65659k(jLongValue2);
                } else {
                    publishTime = feedsUGCVideo.getPublishTime();
                    if (publishTime != null) {
                        jLongValue = publishTime.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    strM65658j = TimeUtilKt.m65658j(jLongValue);
                }
                listQ = CollectionsKt.m97511q(strM65682c, strM65658j);
            } else {
                String strM65682c2 = AbstractC14564j.m65682c(feedsUGCVideo.getWatchNum(), m36338k());
                UGCVideoCreator creator2 = feedsUGCVideo.getCreator();
                if (creator2 != null && (nickname = creator2.getNickname()) != null) {
                    str = nickname;
                }
                listQ = CollectionsKt.m97511q(strM65682c2, "special_#user_icon", str);
            }
        } else {
            String strM65682c3 = AbstractC14564j.m65682c(feedsUGCVideo.getWatchNum(), m36338k());
            if (this.f51984e == HomeTabId.UGC_Trending.getValue()) {
                publishTime2 = feedsUGCVideo.getPublishTime();
                if (publishTime2 != null) {
                    jLongValue2 = publishTime2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                strM65658j = TimeUtilKt.m65659k(jLongValue2);
            } else {
                publishTime = feedsUGCVideo.getPublishTime();
                if (publishTime != null) {
                    jLongValue = publishTime.longValue();
                } else {
                    jLongValue = 0;
                }
                strM65658j = TimeUtilKt.m65658j(jLongValue);
            }
            listQ = CollectionsKt.m97511q(strM65682c3, strM65658j);
        }
        helper.setText(R$id.main_op_trending_grid_subtitle, AbstractC14571q.m65708e(listQ, m36338k()));
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedsBigUGCProvider.m66780G(item, this, helper, view);
            }
        });
        if (this.f51984e != HomeTabId.UGC_Trending.getValue()) {
            m66781H().m100949a(item, helper.getLayoutPosition(), 0L);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.TRENDING_FEES_BIG.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_ugc_item_big;
    }
}
