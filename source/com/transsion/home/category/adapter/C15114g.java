package com.transsion.home.category.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import ck.C5123t;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.view.CornerTextView;
import com.p282tn.lib.widget.R$color;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.moviedetailapi.bean.CategoryItemBean;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsnet.downloader.widget.DownloadView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.home.category.adapter.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C15114g extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final String f52632e;

    /* JADX INFO: renamed from: f */
    private final boolean f52633f;

    public C15114g(String pageName, boolean z11) {
        Intrinsics.m97802h(pageName, "pageName");
        this.f52632e = pageName;
        this.f52633f = z11;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 2;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.adapter_play_list_music;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, CategoryItemBean item) {
        List<Object> data;
        ResourceDetectors resourceDetector;
        String url;
        String thumbnail;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Subject subject = item.getSubject();
        if (subject != null) {
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
            int i11 = 0;
            int iM36184g0 = baseProviderMultiAdapterM36335g != null ? baseProviderMultiAdapterM36335g.m36184g0(item) : 0;
            AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getViewOrNull(R$id.tv_title);
            if (appCompatTextView != null) {
                appCompatTextView.setText(subject.getTitle());
            }
            ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getViewOrNull(R$id.iv_cover);
            if (shapeableImageView != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = subject.getCover();
                String str = "";
                if (cover == null || (url = cover.getUrl()) == null) {
                    url = "";
                }
                C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
                Cover cover2 = subject.getCover();
                if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
                    str = thumbnail;
                }
                bVarM94468g.m94473l(str).m94465d(shapeableImageView);
            }
            TextView textView = (TextView) helper.getViewOrNull(R$id.tvRankNum);
            if (textView != null) {
                textView.setVisibility(this.f52633f ? 0 : 8);
                if (this.f52633f) {
                    int i12 = iM36184g0 + 1;
                    textView.setText(String.valueOf(i12));
                    textView.setTextSize(i12 > 99 ? 14.0f : i12 > 9 ? 18.0f : 20.0f);
                }
            }
            DownloadView downloadView = (DownloadView) helper.getViewOrNull(R$id.ll_download);
            if (downloadView != null) {
                downloadView.setPageFrom(this.f52632e);
                if (C5123t.f17614a.m23960b()) {
                    AbstractC26006c.m102058k(downloadView);
                    downloadView.setShowPlayType();
                } else {
                    Subject subject2 = item.getSubject();
                    if (subject2 != null ? Intrinsics.m97797c(subject2.getHasResource(), Boolean.TRUE) : false) {
                        DownloadView downloadView2 = (DownloadView) helper.getViewOrNull(R$id.ll_download);
                        if (downloadView2 != null) {
                            AbstractC26006c.m102058k(downloadView2);
                            Subject subject3 = item.getSubject();
                            if (subject3 != null && (resourceDetector = subject3.getResourceDetector()) != null) {
                                Subject subject4 = item.getSubject();
                                String subjectId = subject4 != null ? subject4.getSubjectId() : null;
                                String resourceId = resourceDetector.getResourceId();
                                Integer type = resourceDetector.getType();
                                DownloadView.setShowType$default(downloadView2, subjectId, resourceId, Boolean.valueOf(type != null && type.intValue() == 1), false, 0, 24, null);
                            }
                        }
                    } else {
                        helper.setGone(R$id.ll_download, true);
                    }
                }
            }
            if (iM36184g0 == 0) {
                View viewOrNull = helper.getViewOrNull(R$id.divider);
                if (viewOrNull != null) {
                    AbstractC26006c.m102058k(viewOrNull);
                }
                View viewOrNull2 = helper.getViewOrNull(R$id.bg_gradient);
                if (viewOrNull2 != null) {
                    AbstractC26006c.m102058k(viewOrNull2);
                }
                View viewOrNull3 = helper.getViewOrNull(R$id.item_root);
                if (viewOrNull3 != null) {
                    viewOrNull3.setBackgroundResource(R$drawable.bg_category_first_item);
                }
            } else {
                View viewOrNull4 = helper.getViewOrNull(R$id.divider);
                if (viewOrNull4 != null) {
                    AbstractC26006c.m102054g(viewOrNull4);
                }
                View viewOrNull5 = helper.getViewOrNull(R$id.bg_gradient);
                if (viewOrNull5 != null) {
                    AbstractC26006c.m102054g(viewOrNull5);
                }
                View viewOrNull6 = helper.getViewOrNull(R$id.item_root);
                if (viewOrNull6 != null) {
                    viewOrNull6.setBackgroundColor(AbstractC2397b.getColor(m36338k(), R$color.bg_01));
                }
            }
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g2 = m36335g();
            if (baseProviderMultiAdapterM36335g2 != null && (data = baseProviderMultiAdapterM36335g2.getData()) != null) {
                for (Object obj : data) {
                    int i13 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.m97515u();
                    }
                    if (i11 < iM36184g0) {
                        subject.getNonAdDelegate();
                    }
                    i11 = i13;
                }
            }
            ((CornerTextView) helper.getView(R$id.iv_playlist_page_corner)).setTextWithType(subject.getCorner(), subject.getSubjectType());
        }
    }
}
