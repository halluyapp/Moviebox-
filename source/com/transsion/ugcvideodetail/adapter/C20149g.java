package com.transsion.ugcvideodetail.adapter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.baseui.widget.C14579c;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.R$layout;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p648oj.InterfaceC26261i1;
import p801u6.AbstractC27943h;
import p801u6.AbstractC27946k;
import p801u6.C27941f;
import p801u6.C27942g;
import p801u6.InterfaceC27944i;
import p801u6.InterfaceC27947l;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.adapter.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/adapter/g;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Loj/i1;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "Lu6/l;", "", "isDialog", "<init>", "(Z)V", "holder", WebConstants.FIELD_ITEM, "isPlaying", "", "D1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Loj/i1;Z)V", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Loj/i1;)V", "", "", "payloads", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Loj/i1;Ljava/util/List;)V", "", "videoId", "previousVideoId", "E1", "(Ljava/lang/String;Ljava/lang/String;)V", "F", "Z", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C20149g extends BaseQuickAdapter implements InterfaceC27944i, InterfaceC27947l {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final boolean isDialog;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.adapter.g$a */
    public static final class a extends CustomTarget {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f64039a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f64040b;

        a(TextView textView, String str) {
            this.f64039a = textView;
            this.f64040b = str;
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Drawable resource, Transition transition) {
            Intrinsics.m97802h(resource, "resource");
            int iM92908b = AbstractC23384a.m92908b(12);
            resource.setBounds(0, 0, iM92908b, iM92908b);
            C14579c c14579c = new C14579c(resource, this.f64039a, 0, AbstractC23384a.m92908b(4));
            SpannableString spannableString = new SpannableString("\u200b" + this.f64040b);
            spannableString.setSpan(c14579c, 0, 1, 17);
            this.f64039a.setText(spannableString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
            if (drawable == 0 || !(drawable instanceof Animatable)) {
                return;
            }
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    public C20149g() {
        this(false, 1, null);
    }

    public C20149g(boolean z11) {
        super(z11 ? R$layout.item_ugc_video_detail_play_list_dialog_item : R$layout.item_ugc_video_detail_play_list, null, 2, null);
        this.isDialog = z11;
    }

    public /* synthetic */ C20149g(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    /* JADX INFO: renamed from: D1 */
    private final void m83610D1(BaseViewHolder holder, InterfaceC26261i1 item, boolean isPlaying) {
        String strVideoEpTitle = item.videoEpTitle();
        if (strVideoEpTitle == null) {
            strVideoEpTitle = item.videoTitle();
        } else {
            if (StringsKt.m98160q0(strVideoEpTitle)) {
                strVideoEpTitle = null;
            }
            if (strVideoEpTitle == null) {
                strVideoEpTitle = item.videoTitle();
            }
        }
        if (!isPlaying) {
            TextView textView = (TextView) holder.getView(R$id.tvTitle);
            AbstractC26006c.m102058k(textView);
            textView.setText(strVideoEpTitle);
            AbstractC26006c.m102054g(holder.getView(R$id.tvTitleGradient));
            return;
        }
        AbstractC26006c.m102054g(holder.getView(R$id.tvTitle));
        TextView textView2 = (TextView) holder.getView(R$id.tvTitleGradient);
        AbstractC26006c.m102058k(textView2);
        if (this.isDialog) {
            textView2.setText(strVideoEpTitle);
        } else {
            Intrinsics.m97799e(Glide.with(holder.itemView.getContext()).load2(Integer.valueOf(R$mipmap.base_ic_brand_color_playing)).into(new a(textView2, strVideoEpTitle)));
        }
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m83611F1(C20149g c20149g, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        c20149g.m83614E1(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, InterfaceC26261i1 item) {
        String strVideoUGCWatchNum;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
        String strVideoCoverUrl = item.videoCoverUrl();
        if (strVideoCoverUrl == null) {
            strVideoCoverUrl = "";
        }
        C23860f.b bVarM94464c = bVarM94457m.m94468g(strVideoCoverUrl).m94474m(AbstractC23384a.m92908b(120)).m94464c(AbstractC23384a.m92908b(68));
        String strVideoThumbnail = item.videoThumbnail();
        bVarM94464c.m94473l(strVideoThumbnail != null ? strVideoThumbnail : "").m94465d((ImageView) holder.getView(R$id.ivCover));
        String strVideoCorner = item.videoCorner();
        if (strVideoCorner == null || strVideoCorner.length() == 0) {
            holder.setVisible(R$id.tvTag, false);
        } else {
            holder.setVisible(R$id.tvTag, true);
            holder.setText(R$id.tvTag, item.videoCorner());
        }
        Long lVideoDuration = item.videoDuration();
        long jLongValue = lVideoDuration != null ? lVideoDuration.longValue() : 0L;
        if (jLongValue > 0) {
            holder.setVisible(R$id.vDurationBg, true);
            holder.setText(R$id.tvDuration, TimeUtilKt.m65666r(jLongValue));
            ImageView imageView = (ImageView) holder.getView(R$id.ivTypeIcon);
            if (item instanceof UGCVideo) {
                UGCVideoTypeKt.m83628i(imageView, (UGCVideo) item, null, 4, null);
            } else if (item instanceof DownloadBean) {
                DownloadBean downloadBean = (DownloadBean) item;
                UGCVideoTypeKt.m83629j(imageView, downloadBean.getUgcCateLev1Id(), downloadBean.getUgcCateLev2Id(), downloadBean.getUgcCateLev3Id(), downloadBean.getUgcCateLev4Id(), downloadBean.getUgcVideoType());
            } else {
                imageView.setImageResource(UGCVideoTypeKt.m83624e(item.videoUGCType()));
            }
        } else {
            holder.setVisible(R$id.vDurationBg, false);
        }
        if (this.isDialog && (strVideoUGCWatchNum = item.videoUGCWatchNum()) != null && strVideoUGCWatchNum.length() != 0) {
            holder.setText(R$id.tvVideoViews, AbstractC14564j.m65682c(item.videoUGCWatchNum(), getContext()));
        }
        m83610D1(holder, item, item.isVideoPlaying());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(BaseViewHolder holder, InterfaceC26261i1 item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36108G(holder, item, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        Object objV0 = CollectionsKt.m97372v0(payloads);
        if (objV0 instanceof Boolean) {
            m83610D1(holder, item, ((Boolean) objV0).booleanValue());
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m83614E1(String videoId, String previousVideoId) {
        if (videoId == null || videoId.length() == 0) {
            return;
        }
        int i11 = -1;
        int i12 = 0;
        if (previousVideoId == null || previousVideoId.length() == 0 || Intrinsics.m97797c(previousVideoId, videoId)) {
            int i13 = 0;
            for (Object obj : getData()) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.m97515u();
                }
                InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) obj;
                if (interfaceC26261i1.isVideoPlaying()) {
                    interfaceC26261i1.setVideoIsPlaying(false);
                    notifyItemChanged(i13, Boolean.FALSE);
                }
                i13 = i14;
            }
        } else {
            Iterator<Object> it = getData().iterator();
            int i15 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i15 = -1;
                    break;
                } else if (Intrinsics.m97797c(((InterfaceC26261i1) it.next()).videoUGCId(), previousVideoId)) {
                    break;
                } else {
                    i15++;
                }
            }
            Integer numValueOf = Integer.valueOf(i15);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                ((InterfaceC26261i1) getData().get(iIntValue)).setVideoIsPlaying(false);
                notifyItemChanged(iIntValue, Boolean.FALSE);
            }
        }
        Iterator<Object> it2 = getData().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.m97797c(((InterfaceC26261i1) it2.next()).videoUGCId(), videoId)) {
                i11 = i12;
                break;
            }
            i12++;
        }
        Integer numValueOf2 = Integer.valueOf(i11);
        Integer num = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
        if (num != null) {
            int iIntValue2 = num.intValue();
            ((InterfaceC26261i1) getData().get(iIntValue2)).setVideoIsPlaying(true);
            notifyItemChanged(iIntValue2, Boolean.TRUE);
        }
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }

    @Override // p801u6.InterfaceC27947l
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ C27942g mo80811f(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27946k.m108682a(this, baseQuickAdapter);
    }
}
