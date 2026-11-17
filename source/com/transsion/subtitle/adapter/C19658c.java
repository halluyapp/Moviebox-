package com.transsion.subtitle.adapter;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.subtitle.R$drawable;
import com.transsion.subtitle.R$id;
import com.transsion.subtitle.R$layout;
import com.transsion.subtitle.R$mipmap;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p528ju.C24469a;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import sh.AbstractC27615b;
import th.C27819c;

/* JADX INFO: renamed from: com.transsion.subtitle.adapter.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/subtitle/adapter/c;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lju/a;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "isSearchDownload", "", "dataList", "<init>", "(ZLjava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "D1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lju/a;)V", "", "", "payloads", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lju/a;Ljava/util/List;)V", "B1", "F", "Z", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C19658c extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final boolean isSearchDownload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19658c(boolean z11, List<C24469a> dataList) {
        super(z11 ? R$layout.dialog_subtitle_list_item : R$layout.dialog_subtitle_lan_list_item, dataList);
        Intrinsics.m97802h(dataList, "dataList");
        this.isSearchDownload = z11;
    }

    /* JADX INFO: renamed from: D1 */
    private final void m81968D1(BaseViewHolder holder, C24469a item) {
        ImageView imageView = (ImageView) holder.getView(R$id.iv_check);
        ProgressBar progressBar = (ProgressBar) holder.getView(R$id.progress);
        int status = item.m96011b().getStatus();
        if (status != 0) {
            if (status == 2) {
                AbstractC26006c.m102054g(imageView);
                AbstractC26006c.m102058k(progressBar);
                return;
            } else {
                if (status == 5) {
                    imageView.setImageResource(R$mipmap.ic_subtitle_downloaded);
                    if (item.m96015f()) {
                        AbstractC26006c.m102058k(imageView);
                    } else {
                        AbstractC26006c.m102055h(imageView);
                    }
                    AbstractC26006c.m102054g(progressBar);
                    return;
                }
                if (status != 6) {
                    return;
                }
            }
        }
        imageView.setImageResource(R$drawable.subtitle_download_green);
        AbstractC26006c.m102058k(imageView);
        AbstractC26006c.m102054g(progressBar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, C24469a item) {
        String lanName;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        if (!this.isSearchDownload) {
            ((TextView) holder.getView(R$id.tv_subtitle)).setText(item.m96011b().getName());
            ((ImageView) holder.getView(R$id.iv_check)).setSelected(item.m96015f());
            return;
        }
        Long size = item.m96011b().getSize();
        if ((size != null ? size.longValue() : 0L) > 100) {
            String lanName2 = item.m96011b().getLanName();
            Long size2 = item.m96011b().getSize();
            lanName = lanName2 + ", " + AbstractC27615b.m107445a(size2 != null ? size2.longValue() : 1L, 1);
        } else {
            lanName = item.m96011b().getLanName();
        }
        C27819c.a aVarM108151c = C27819c.m108144e().m108153e(item.m96011b().getSubtitleName() + " ").m108151c(-1).m108153e(lanName).m108152d(12).m108151c(AbstractC2397b.getColor(Utils.m27275a(), R$color.white_40));
        Intrinsics.m97801g(aVarM108151c, "color(...)");
        ((TextView) holder.getView(R$id.tv_subtitle)).setText(aVarM108151c.m108150b());
        m81968D1(holder, item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(BaseViewHolder holder, C24469a item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36108G(holder, item, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        Object obj = payloads.get(0);
        if (obj instanceof C24469a) {
            item.m96011b().setStatus(((C24469a) obj).m96011b().getStatus());
            if (this.isSearchDownload) {
                m81968D1(holder, item);
            }
        }
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
