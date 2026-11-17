package com.transsion.search_pugc.fragment.result.provider;

import android.widget.ImageView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14565k;
import com.transsion.baseui.util.AbstractC14571q;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.search.R$drawable;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.R$string;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.bean.SearchResultItem;
import com.transsion.search_pugc.constant.AbstractC18568a;
import com.transsion.search_pugc.constant.SearchType;
import com.transsion.ugcvideodetail.api.bean.UGCVerticalRank;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25132j;
import ng.AbstractC26006c;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes6.dex */
public final class ResultVerticalRankType2Provider extends BaseItemProvider implements InterfaceC18659t {

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ InterfaceC18659t f60226e;

    public ResultVerticalRankType2Provider(InterfaceC18659t reportable) {
        Intrinsics.m97802h(reportable, "reportable");
        this.f60226e = reportable;
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: a */
    public void mo78412a(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60226e.mo78412a(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: c */
    public void mo78413c(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60226e.mo78413c(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: d */
    public void mo78414d(SearchResultItem item, int i11) {
        Intrinsics.m97802h(item, "item");
        this.f60226e.mo78414d(item, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: e */
    public void mo78415e(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60226e.mo78415e(ugcVideo, i11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return SearchType.VERTICAL_RANK_TYPE2.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_result_vertical_rank_type2;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, SearchResultItem item) {
        List<UGCVideo> videos;
        UGCVideo uGCVideo;
        String url;
        String thumbnail;
        UGCVideo uGCVideo2;
        String url2;
        String thumbnail2;
        UGCVideo uGCVideo3;
        String url3;
        String thumbnail3;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        UGCVerticalRank verticalRank = item.getVerticalRank();
        if (verticalRank == null || (videos = item.getVerticalRank().getVideos()) == null || (uGCVideo = (UGCVideo) CollectionsKt.m97361k0(videos)) == null) {
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        C23860f.b bVarM94457m = aVar.m94457m(m36338k());
        Cover cover = uGCVideo.getCover();
        String str = "";
        if (cover == null || (url = cover.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
        Cover cover2 = uGCVideo.getCover();
        if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
            thumbnail = "";
        }
        bVarM94468g.m94473l(thumbnail).m94465d((ImageView) helper.getView(R$id.iv_cover));
        List<UGCVideo> videos2 = verticalRank.getVideos();
        if (videos2 == null || (uGCVideo3 = (UGCVideo) CollectionsKt.m97362l0(videos2, 1)) == null) {
            AbstractC25132j.m99054b(null, new ResultVerticalRankType2Provider$convert$2(helper, null), 1, null);
        } else {
            helper.setVisible(R$id.iv_cover1, true);
            C23860f.b bVarM94457m2 = aVar.m94457m(m36338k());
            Cover cover3 = uGCVideo3.getCover();
            if (cover3 == null || (url3 = cover3.getUrl()) == null) {
                url3 = "";
            }
            C23860f.b bVarM94468g2 = bVarM94457m2.m94468g(url3);
            Cover cover4 = uGCVideo.getCover();
            if (cover4 == null || (thumbnail3 = cover4.getThumbnail()) == null) {
                thumbnail3 = "";
            }
            bVarM94468g2.m94473l(thumbnail3).m94465d((ImageView) helper.getView(R$id.iv_cover1));
        }
        List<UGCVideo> videos3 = verticalRank.getVideos();
        if (videos3 == null || (uGCVideo2 = (UGCVideo) CollectionsKt.m97362l0(videos3, 2)) == null) {
            AbstractC25132j.m99054b(null, new ResultVerticalRankType2Provider$convert$4(helper, null), 1, null);
        } else {
            helper.setVisible(R$id.iv_cover2, true);
            C23860f.b bVarM94457m3 = aVar.m94457m(m36338k());
            Cover cover5 = uGCVideo2.getCover();
            if (cover5 == null || (url2 = cover5.getUrl()) == null) {
                url2 = "";
            }
            C23860f.b bVarM94468g3 = bVarM94457m3.m94468g(url2);
            Cover cover6 = uGCVideo.getCover();
            if (cover6 != null && (thumbnail2 = cover6.getThumbnail()) != null) {
                str = thumbnail2;
            }
            bVarM94468g3.m94473l(str).m94465d((ImageView) helper.getView(R$id.iv_cover2));
        }
        int i11 = R$id.tv_title;
        String title = verticalRank.getTitle();
        helper.setText(i11, title != null ? AbstractC18568a.m78231d(title, m36338k(), C18670g.f60281h.m78520a(m36338k()).m78498e()) : null);
        Integer count = verticalRank.getCount();
        if (count != null) {
            int iIntValue = count.intValue();
            if (iIntValue > 1) {
                helper.setText(R$id.tv_view_resource_tag, m36338k().getString(R$string.videos, Integer.valueOf(iIntValue)));
            } else {
                helper.setText(R$id.tv_view_resource_tag, m36338k().getString(R$string.video, Integer.valueOf(iIntValue)));
            }
        }
        AbstractC26006c.m102054g(helper.getView(R$id.iv_view_resource_tag));
        AbstractC14565k.a aVar2 = new AbstractC14565k.a(R$drawable.ic_tag_collection);
        String string = m36338k().getString(com.transsion.baseui.R$string.ugc_video_tv_collection);
        Intrinsics.m97801g(string, "getString(...)");
        helper.setText(R$id.tv_info, AbstractC14571q.m65710g(CollectionsKt.m97511q(aVar2, new AbstractC14565k.b(string, Integer.valueOf(R$color.white_80)), new AbstractC14565k.b(AbstractC14564j.m65682c(uGCVideo.getWatchNum(), m36338k()), Integer.valueOf(R$color.white_60))), m36338k(), false, 4, null));
    }
}
