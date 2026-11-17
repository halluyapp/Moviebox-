package com.transsion.home.adapter.operateUGC.provider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C4247n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.R$string;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14571q;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p579ll.C25648d;
import p822uv.AbstractC28040c;

/* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C14900s extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52074e;

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.s$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Integer f52075a;

        /* JADX INFO: renamed from: b */
        private List f52076b;

        public a(Integer num, List contentList) {
            Intrinsics.m97802h(contentList, "contentList");
            this.f52075a = num;
            this.f52076b = contentList;
        }

        /* JADX INFO: renamed from: a */
        public final List m66869a() {
            return this.f52076b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.m97797c(this.f52075a, aVar.f52075a) && Intrinsics.m97797c(this.f52076b, aVar.f52076b);
        }

        public int hashCode() {
            Integer num = this.f52075a;
            return ((num == null ? 0 : num.hashCode()) * 31) + this.f52076b.hashCode();
        }

        public String toString() {
            return "MusicRankData(index=" + this.f52075a + ", contentList=" + this.f52076b + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.s$b */
    @Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006$"}, m97100d2 = {"Lcom/transsion/home/adapter/operateUGC/provider/s$b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/adapter/operateUGC/provider/s$a;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "layoutResId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "tabId", "<init>", "(ILcom/transsion/home/bean/OperateItem;I)V", "Landroid/content/Context;", "context", "Lcom/transsion/ugcvideodetail/api/bean/UGCContent;", "ugcContent", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "E1", "(Landroid/content/Context;Lcom/transsion/ugcvideodetail/api/bean/UGCContent;Landroid/view/ViewGroup;)Landroid/view/View;", "rankListItem", RequestParameters.POSITION, "", "F1", "(Lcom/transsion/home/adapter/operateUGC/provider/s$a;I)V", "G1", "holder", WebConstants.FIELD_ITEM, "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/adapter/operateUGC/provider/s$a;)V", "F", "Lcom/transsion/home/bean/OperateItem;", "G", "I", "H", "perWidth", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @SourceDebugExtension
    public static final class b extends BaseQuickAdapter {

        /* JADX INFO: renamed from: I */
        public static final int f52077I = 8;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final OperateItem operateItem;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final int tabId;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private final int perWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, OperateItem operateItem, int i12) {
            super(i11, null, 2, null);
            Intrinsics.m97802h(operateItem, "operateItem");
            this.operateItem = operateItem;
            this.tabId = i12;
            this.perWidth = AbstractC5806y.m27489e() - AbstractC23384a.m92908b(68);
        }

        public /* synthetic */ b(int i11, OperateItem operateItem, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? R$layout.item_provider_ranklist : i11, operateItem, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: D1 */
        public static final void m66871D1(UGCContent uGCContent, b bVar, a aVar, int i11, View view) {
            AbstractC28040c.m109008e(uGCContent, Integer.valueOf(bVar.tabId), bVar.operateItem.getOpId());
            bVar.m66874G1(aVar, i11);
        }

        /* JADX INFO: renamed from: E1 */
        private final View m66872E1(Context context, UGCContent ugcContent, ViewGroup parent) {
            String url;
            String strM65658j;
            List listQ;
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.item_ugc_music_rank, parent, false);
            UGCVideo video = ugcContent.getVideo();
            if (video == null) {
                Intrinsics.m97799e(viewInflate);
                return viewInflate;
            }
            View viewFindViewById = viewInflate.findViewById(R$id.home_ugc_music_rank_image);
            Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
            ShapeableImageView shapeableImageView = (ShapeableImageView) viewFindViewById;
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(context);
            Cover cover = video.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            bVarM94457m.m94468g(url).m94474m(this.perWidth).m94465d(shapeableImageView);
            ((TextView) viewInflate.findViewById(R$id.home_ugc_music_rank_corner)).setText(video.getCorner());
            ImageView imageView = (ImageView) viewInflate.findViewById(R$id.home_ugc_music_rank_type_icon);
            Intrinsics.m97799e(imageView);
            UGCVideoTypeKt.m83628i(imageView, video, null, 4, null);
            TextView textView = (TextView) viewInflate.findViewById(R$id.home_ugc_music_rank_time_text);
            Long duration = video.getDuration();
            textView.setText(TimeUtilKt.m65649a(duration != null ? Integer.valueOf((int) duration.longValue()) : null));
            ((TextView) viewInflate.findViewById(R$id.home_ugc_music_rank_title)).setText(video.getTitle());
            if (video.isVerticalImmStyle()) {
                listQ = CollectionsKt.m97511q("special_#shorts_icon", Utils.m27275a().getString(R$string.ugc_video_shorts), AbstractC14564j.m65682c(video.getWatchNum(), context));
            } else {
                String strM65682c = AbstractC14564j.m65682c(video.getWatchNum(), context);
                if (this.tabId == HomeTabId.UGC_Trending.getValue()) {
                    Long publishTime = video.getPublishTime();
                    strM65658j = TimeUtilKt.m65659k(publishTime != null ? publishTime.longValue() : 0L);
                } else {
                    Long publishTime2 = video.getPublishTime();
                    strM65658j = TimeUtilKt.m65658j(publishTime2 != null ? publishTime2.longValue() : 0L);
                }
                listQ = CollectionsKt.m97511q(strM65682c, strM65658j);
            }
            ((TextView) viewInflate.findViewById(R$id.home_ugc_music_rank_subtitle)).setText(AbstractC14571q.m65708e(listQ, context));
            Intrinsics.m97799e(viewInflate);
            return viewInflate;
        }

        /* JADX INFO: renamed from: F1 */
        private final void m66873F1(a rankListItem, int position) {
            UGCVideo video;
            UGCContent uGCContent = (UGCContent) CollectionsKt.m97362l0(rankListItem.m66869a(), position);
            if (uGCContent == null || (video = uGCContent.getVideo()) == null) {
                return;
            }
            C25648d.a.m100950e(C25648d.f77807c, this.tabId, position, this.operateItem, video, null, 16, null);
        }

        /* JADX INFO: renamed from: G1 */
        private final void m66874G1(a rankListItem, int position) {
            C25648d.a.m100951g(C25648d.f77807c, this.tabId, position, this.operateItem, ((UGCContent) rankListItem.m66869a().get(position)).getVideo(), null, 16, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
        public void mo36106F(BaseViewHolder holder, final a item) {
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(item, "item");
            ViewGroup viewGroup = (LinearLayout) holder.getView(R$id.sub_operation_rankinglist_root);
            viewGroup.removeAllViews();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = this.perWidth;
            marginLayoutParams.rightMargin = AbstractC23384a.m92908b(8);
            viewGroup.setLayoutParams(marginLayoutParams);
            viewGroup.setBackground(null);
            final int i11 = 0;
            for (Object obj : item.m66869a()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                final UGCContent uGCContent = (UGCContent) obj;
                View viewM66872E1 = m66872E1(getContext(), uGCContent, viewGroup);
                viewGroup.addView(viewM66872E1);
                viewM66872E1.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C14900s.b.m66871D1(uGCContent, this, item, i11, view);
                    }
                });
                m66873F1(item, i11);
                i11 = i12;
            }
        }
    }

    public C14900s(int i11) {
        this.f52074e = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m66862B(OperateItem operateItem, C14900s c14900s, View view) {
        String deepLink = operateItem.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23924g(deepLink, "&filmListTitle=" + operateItem.getTitle());
        }
        c14900s.m66865E(operateItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m66863C(OperateItem operateItem, C14900s c14900s, View view) {
        String deepLink = operateItem.getDeepLink();
        if (deepLink != null) {
            AbstractC5114k.m23924g(deepLink, "&filmListTitle=" + operateItem.getTitle());
        }
        c14900s.m66865E(operateItem);
    }

    /* JADX INFO: renamed from: D */
    private final void m66864D(OperateItem operateItem) {
        List<Object> data;
        HashMap map = new HashMap();
        map.put("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        map.put(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        String title = operateItem.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put("tabId", String.valueOf(this.f52074e));
        AbstractC25888b.m101678a(operateItem, map);
        C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52074e), map);
    }

    /* JADX INFO: renamed from: E */
    private final void m66865E(OperateItem operateItem) {
        List<Object> data;
        HashMap map = new HashMap();
        map.put("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        map.put(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        String title = operateItem.getTitle();
        if (title == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        map.put("tabId", String.valueOf(this.f52074e));
        AbstractC25888b.m101678a(operateItem, map);
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52074e), map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        TextView textView = (TextView) helper.getView(R$id.provider_ugc_common_title);
        textView.setText(item.getTitle());
        TextView textView2 = (TextView) helper.getView(R$id.provider_ugc_common_more_text);
        String deepLink = item.getDeepLink();
        if (deepLink == null || deepLink.length() == 0) {
            AbstractC26006c.m102055h(textView2);
        } else {
            AbstractC26006c.m102058k(textView2);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14900s.m66862B(item, this, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C14900s.m66863C(item, this, view);
                }
            });
            m66864D(item);
        }
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.provider_ugc_common_recycler);
        b bVar = new b(0, item, this.f52074e, 1, null);
        recyclerView.setAdapter(bVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m36338k(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setOnFlingListener(null);
        new C4247n().attachToRecyclerView(recyclerView);
        ArrayList arrayList = new ArrayList();
        List<UGCContent> contentList = item.getContentList();
        if (contentList != null) {
            int iH = RangesKt.m97938h(contentList.size(), 9);
            a aVar = null;
            for (int i11 = 0; i11 < iH; i11++) {
                if (aVar == null) {
                    aVar = new a(Integer.valueOf(i11 / 3), new ArrayList());
                }
                aVar.m66869a().add(contentList.get(i11));
                if (aVar.m66869a().size() == 3) {
                    arrayList.add(aVar);
                    aVar = null;
                }
            }
            bVar.mo36201n1(arrayList);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.UGC_MUSIC_RANK.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_ugc_op_common;
    }
}
