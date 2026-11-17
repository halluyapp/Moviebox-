package com.transsion.ugcvideodetail.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.R$layout;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.adapter.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/adapter/f;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "<init>", "()V", "", "seconds", "", "C1", "(J)Ljava/lang/String;", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20148f extends BaseQuickAdapter implements InterfaceC27944i {
    public C20148f() {
        super(R$layout.item_ugc_detail_for_you_list, null, 2, null);
    }

    /* JADX INFO: renamed from: C1 */
    private final String m83608C1(long seconds) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(seconds);
        long j11 = 60;
        long minutes = timeUnit.toMinutes(seconds) % j11;
        long j12 = seconds % j11;
        if (hours > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(j12)}, 3));
            Intrinsics.m97801g(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.f75910a;
        String str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(j12)}, 2));
        Intrinsics.m97801g(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, UGCVideo item) {
        String url;
        String thumbnail;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        C23860f.b bVarM94464c = C23860f.f72909a.m94457m(getContext()).m94474m(AbstractC23384a.m92908b(120)).m94464c(AbstractC23384a.m92908b(68));
        Cover cover = item.getCover();
        String str = "";
        if (cover == null || (url = cover.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94468g = bVarM94464c.m94468g(url);
        Cover cover2 = item.getCover();
        if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
            str = thumbnail;
        }
        bVarM94468g.m94473l(str).m94465d((ImageView) holder.getView(R$id.ivVideoCover));
        Long duration = item.getDuration();
        long jLongValue = duration != null ? duration.longValue() : 0L;
        if (jLongValue > 0) {
            holder.setVisible(R$id.vDurationBg, true);
            holder.setText(R$id.tvVideoDuration, m83608C1(jLongValue));
            UGCVideoTypeKt.m83628i((ImageView) holder.getView(R$id.ivTypeIcon), item, null, 4, null);
        } else {
            holder.setVisible(R$id.vDurationBg, false);
        }
        holder.setText(R$id.tvVideoTitle, item.getTitle());
        holder.setText(R$id.tvVideoViews, AbstractC14564j.m65682c(item.getWatchNum(), getContext()));
        TextView textView = (TextView) holder.getView(R$id.tvVideoTime);
        Long publishTime = item.getPublishTime();
        textView.setText(TimeUtilKt.m65658j(publishTime != null ? publishTime.longValue() : 0L));
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
