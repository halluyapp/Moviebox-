package com.transsion.usercenter.p321me.adapter;

import android.content.Context;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.adapter.DownloadedHolderKt;
import com.transsnet.downloader.viewmodel.C22149a0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/usercenter/me/adapter/p;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "Lcom/transsion/baselib/db/video/VideoDetailPlayBean;", "it", "holder", "", "B1", "(Lcom/transsion/baselib/db/video/VideoDetailPlayBean;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "Lcom/transsion/baselib/db/video/UGCVideoDetailPlayBean;", "C1", "(Lcom/transsion/baselib/db/video/UGCVideoDetailPlayBean;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "", "pr", "total", "", "D1", "(Ljava/lang/Long;Ljava/lang/Long;)I", WebConstants.FIELD_ITEM, "F", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20586p extends BaseQuickAdapter {
    public C20586p() {
        super(R$layout.adapter_mine_historical_record_layout, null, 2, null);
    }

    /* JADX INFO: renamed from: B1 */
    private final void m85051B1(VideoDetailPlayBean it, BaseViewHolder holder) {
        if (it.getSubjectId().length() == 0) {
            ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getView(R$id.ivCore);
            C22149a0 c22149a0 = C22149a0.f68261a;
            String coverUrl = it.getCoverUrl();
            shapeableImageView.setImageBitmap(c22149a0.m89767d(coverUrl != null ? coverUrl : ""));
        } else {
            Context context = getContext();
            ImageView imageView = (ImageView) holder.getView(R$id.ivCore);
            String coverUrl2 = it.getCoverUrl();
            DownloadedHolderKt.m87190a(context, imageView, coverUrl2 != null ? coverUrl2 : "", it.getThumbnail());
        }
        ((AppCompatTextView) holder.getView(R$id.tvTitle)).setMaxLines(1);
        holder.setImageResource(R$id.ivCornerMark, AbstractC16247h.m71009a(it.getSubjectType()));
        holder.setText(R$id.tvTitle, it.getTitle());
        ((ProgressBar) holder.getView(R$id.progressBar)).setProgress(m85053D1(Long.valueOf(it.getProgress()), it.getTotalDuration()));
        ((ViewStub) holder.getView(R$id.viewStub)).setVisibility(8);
    }

    /* JADX INFO: renamed from: C1 */
    private final void m85052C1(UGCVideoDetailPlayBean it, BaseViewHolder holder) {
        Context context = getContext();
        ImageView imageView = (ImageView) holder.getView(R$id.ivCore);
        String coverUrl = it.getCoverUrl();
        if (coverUrl == null) {
            coverUrl = "";
        }
        DownloadedHolderKt.m87190a(context, imageView, coverUrl, it.getThumbnail());
        ((AppCompatTextView) holder.getView(R$id.tvTitle)).setMaxLines(1);
        UGCVideoTypeKt.m83629j((ImageView) holder.getView(R$id.ivCornerMark), it.getCateLev1Id(), it.getCateLev2Id(), it.getCateLev3Id(), it.getCateLev4Id(), it.getType());
        holder.setText(R$id.tvTitle, it.getTitle());
        ((ProgressBar) holder.getView(R$id.progressBar)).setProgress(m85053D1(Long.valueOf(it.getProgress()), it.getTotalDuration()));
        ((ViewStub) holder.getView(R$id.viewStub)).setVisibility(8);
    }

    /* JADX INFO: renamed from: D1 */
    private final int m85053D1(Long pr2, Long total) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (pr2 != null && total != null) {
                return (int) ((pr2.longValue() * ((long) 100)) / total.longValue());
            }
            Result.m112707constructorimpl(Unit.f75682a);
            return 0;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
            return 0;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: F */
    protected void mo36106F(BaseViewHolder holder, Object item) {
        Intrinsics.m97802h(holder, "holder");
        if (item instanceof VideoDetailPlayBean) {
            m85051B1((VideoDetailPlayBean) item, holder);
        } else if (item instanceof UGCVideoDetailPlayBean) {
            m85052C1((UGCVideoDetailPlayBean) item, holder);
        }
    }
}
