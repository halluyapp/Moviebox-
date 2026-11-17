package com.transsion.shorttv_pugc.p317ui.adapter;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.bean.Cover;
import com.transsion.shorttv_pugc.bean.Subject;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p558kt.C25429b;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/adapter/ShortTVTrendingAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/shorttv_pugc/bean/Subject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "pageName", "", "isDownloadBtn", "<init>", "(Ljava/lang/String;Z)V", "Landroidx/appcompat/widget/AppCompatImageView;", WebConstants.FIELD_ITEM, "", "C1", "(Landroidx/appcompat/widget/AppCompatImageView;Lcom/transsion/shorttv_pugc/bean/Subject;)V", "D1", "holder", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/shorttv_pugc/bean/Subject;)V", "baseQuickAdapter", "Lu6/f;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lu6/f;", "F", "Ljava/lang/String;", "G", "Z", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTVTrendingAdapter extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final boolean isDownloadBtn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTVTrendingAdapter(String pageName, boolean z11) {
        super(R$layout.pugc_short_tv_item_trending, null, 2, null);
        Intrinsics.m97802h(pageName, "pageName");
        this.pageName = pageName;
        this.isDownloadBtn = z11;
    }

    /* JADX INFO: renamed from: C1 */
    private final void m80785C1(AppCompatImageView appCompatImageView, Subject subject) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ShortTVTrendingAdapter$loadBuiltInCover$1(subject, appCompatImageView, null), 3, null);
    }

    /* JADX INFO: renamed from: D1 */
    private final void m80786D1(AppCompatImageView appCompatImageView, Subject subject) {
        String thumbnail;
        String url;
        C25429b.a aVar = C25429b.f76999a;
        Context context = appCompatImageView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        Cover cover = subject.getCover();
        String str = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
        int i11 = R$color.short_tv_module_04;
        Cover cover2 = subject.getCover();
        aVar.m99980j(context, appCompatImageView, str, (8120 & 8) != 0 ? aVar.m99977c() : i11, (8120 & 16) != 0 ? aVar.m99976b() : 0, (8120 & 32) != 0, (8120 & 64) != 0 ? "" : (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail, (8120 & 128) != 0, (8120 & 256) != 0, (8120 & 512) != 0 ? false : false, (8120 & 1024) != 0 ? false : false, (8120 & 2048) != 0 ? false : false, (8120 & 4096) != 0 ? 25 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, Subject item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        Intrinsics.m97802h(baseQuickAdapter, "baseQuickAdapter");
        return new C27941f(baseQuickAdapter);
    }
}
