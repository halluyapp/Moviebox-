package com.transsion.search_pugc.fragment.result.provider;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.R$plurals;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14565k;
import com.transsion.baseui.util.AbstractC14571q;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.R$string;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.bean.SearchResultItem;
import com.transsion.search_pugc.constant.AbstractC18568a;
import com.transsion.search_pugc.constant.SearchType;
import com.transsion.ugcvideodetail.api.UGCVideoType;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.provider.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C18642c extends BaseItemProvider implements InterfaceC18659t {

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ InterfaceC18659t f60230e;

    public C18642c(InterfaceC18659t reportable) {
        Intrinsics.m97802h(reportable, "reportable");
        this.f60230e = reportable;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, SearchResultItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (Intrinsics.m97797c(item.getTopicType(), "UGC_COLLECTION")) {
            m78424y(helper, item);
        } else {
            m78425z(helper, item);
        }
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: a */
    public void mo78412a(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60230e.mo78412a(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: c */
    public void mo78413c(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60230e.mo78413c(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: d */
    public void mo78414d(SearchResultItem item, int i11) {
        Intrinsics.m97802h(item, "item");
        this.f60230e.mo78414d(item, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: e */
    public void mo78415e(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60230e.mo78415e(ugcVideo, i11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return SearchType.UGC_VIDEO.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_result_common;
    }

    /* JADX INFO: renamed from: y */
    public final void m78424y(BaseViewHolder helper, SearchResultItem item) {
        List<UGCVideo> videos;
        UGCVideo uGCVideo;
        String url;
        String thumbnail;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        UGCCollection collection = item.getCollection();
        if (collection == null || (videos = collection.getVideos()) == null || (uGCVideo = (UGCVideo) CollectionsKt.m97361k0(videos)) == null) {
            return;
        }
        boolean zM97797c = Intrinsics.m97797c(uGCVideo.getCategory(), UGCVideoType.EDUCATION.getValue());
        boolean zM97797c2 = Intrinsics.m97797c(uGCVideo.getCategory(), UGCVideoType.SHORT_TV.getValue());
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
        Cover cover = uGCVideo.getCover();
        String str = "";
        if (cover == null || (url = cover.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
        Cover cover2 = uGCVideo.getCover();
        if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
            str = thumbnail;
        }
        bVarM94468g.m94473l(str).m94465d((ImageView) helper.getView(R$id.iv_cover));
        int i11 = R$id.tv_title;
        String title = collection.getTitle();
        helper.setText(i11, title != null ? AbstractC18568a.m78231d(title, m36338k(), C18670g.f60281h.m78520a(m36338k()).m78498e()) : null);
        Integer videoNum = collection.getVideoNum();
        if (videoNum != null) {
            int iIntValue = videoNum.intValue();
            helper.setText(R$id.tv_view_resource_tag, m36338k().getResources().getQuantityString(zM97797c2 ? R$plurals.episodes_count_text : R$plurals.videos_count_text, iIntValue, Integer.valueOf(iIntValue)));
        }
        if (zM97797c) {
            helper.setGone(R$id.iv_view_resource_tag, false);
        } else {
            UGCVideoTypeKt.m83628i((ImageView) helper.getView(R$id.iv_view_resource_tag), uGCVideo, null, 4, null);
        }
        helper.setVisible(R$id.v_corner, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String watchNum = collection.getWatchNum();
        String strM78239l = watchNum != null ? AbstractC18568a.m78239l(watchNum) : null;
        spannableStringBuilder.append((CharSequence) (strM78239l + " " + m36338k().getString(R$string.views)));
        String string = m36338k().getString(UGCVideoTypeKt.m83626g(uGCVideo.getCategory()));
        Intrinsics.m97801g(string, "getString(...)");
        helper.setText(R$id.tv_info, AbstractC14571q.m65710g(CollectionsKt.m97511q(new AbstractC14565k.b(string, Integer.valueOf(R$color.white_80)), new AbstractC14565k.b(AbstractC14564j.m65682c(uGCVideo.getWatchNum(), m36338k()), Integer.valueOf(R$color.white_60))), m36338k(), false, 4, null));
        UGCVideoTypeKt.m83628i((ImageView) helper.getView(R$id.ivInfoIcon), uGCVideo, null, 4, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m78425z(BaseViewHolder helper, SearchResultItem item) {
        String url;
        String watchNum;
        Long duration;
        String title;
        Cover cover;
        String thumbnail;
        Cover cover2;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        AppCompatImageView appCompatImageView = (AppCompatImageView) helper.getView(R$id.ivInfoIcon);
        UGCVideo video = item.getVideo();
        if (video != null) {
            AbstractC26006c.m102058k(appCompatImageView);
            UGCVideoTypeKt.m83628i(appCompatImageView, video, null, 4, null);
        } else {
            AbstractC26006c.m102054g(appCompatImageView);
        }
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
        UGCVideo video2 = item.getVideo();
        String str = "";
        if (video2 == null || (cover2 = video2.getCover()) == null || (url = cover2.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
        UGCVideo video3 = item.getVideo();
        if (video3 != null && (cover = video3.getCover()) != null && (thumbnail = cover.getThumbnail()) != null) {
            str = thumbnail;
        }
        bVarM94468g.m94473l(str).m94465d((ImageView) helper.getView(R$id.iv_cover));
        int i11 = R$id.tv_title;
        UGCVideo video4 = item.getVideo();
        helper.setText(i11, (video4 == null || (title = video4.getTitle()) == null) ? null : AbstractC18568a.m78231d(title, m36338k(), C18670g.f60281h.m78520a(m36338k()).m78498e()));
        int i12 = R$id.tv_view_resource_tag;
        UGCVideo video5 = item.getVideo();
        helper.setText(i12, (video5 == null || (duration = video5.getDuration()) == null) ? null : AbstractC18568a.m78237j(duration.longValue()));
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) helper.getView(R$id.iv_view_resource_tag);
        UGCVideo video6 = item.getVideo();
        appCompatImageView2.setVisibility(video6 != null ? video6.isVerticalImmStyle() : false ? 0 : 8);
        appCompatImageView2.setImageResource(R$drawable.ic_tag_ugc_shorts_search);
        int i13 = R$id.v_corner;
        UGCVideo video7 = item.getVideo();
        String corner = video7 != null ? video7.getCorner() : null;
        helper.setVisible(i13, !(corner == null || corner.length() == 0));
        int i14 = R$id.tv_view_resource_corner;
        UGCVideo video8 = item.getVideo();
        helper.setText(i14, video8 != null ? video8.getCorner() : null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        UGCVideo video9 = item.getVideo();
        String strM78239l = (video9 == null || (watchNum = video9.getWatchNum()) == null) ? null : AbstractC18568a.m78239l(watchNum);
        spannableStringBuilder.append((CharSequence) (strM78239l + " " + m36338k().getString(R$string.views)));
        Context contextM36338k = m36338k();
        UGCVideo video10 = item.getVideo();
        String string = contextM36338k.getString(UGCVideoTypeKt.m83626g(video10 != null ? video10.getCategory() : null));
        Intrinsics.m97801g(string, "getString(...)");
        AbstractC14565k.b bVar = new AbstractC14565k.b(string, Integer.valueOf(R$color.white_80));
        UGCVideo video11 = item.getVideo();
        helper.setText(R$id.tv_info, AbstractC14571q.m65710g(CollectionsKt.m97511q(bVar, new AbstractC14565k.b(AbstractC14564j.m65682c(video11 != null ? video11.getWatchNum() : null, m36338k()), Integer.valueOf(R$color.white_60))), m36338k(), false, 4, null));
    }
}
