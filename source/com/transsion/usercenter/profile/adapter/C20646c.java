package com.transsion.usercenter.profile.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p840vj.C28117b;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.usercenter.profile.adapter.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0017\u0018B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m97100d2 = {"Lcom/transsion/usercenter/profile/adapter/c;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "Lu6/i;", "", "data", "Lvj/b;", "exposureHelper", "<init>", "(Ljava/util/List;Lvj/b;)V", "", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Lvj/b;", "H", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20646c extends BaseProviderMultiAdapter<UGCVideo> implements InterfaceC27944i {

    /* JADX INFO: renamed from: I */
    private static final String f65174I = "UserProfileVideoAdapter";

    /* JADX INFO: renamed from: J */
    public static final int f65175J = 1;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28117b exposureHelper;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.adapter.c$b */
    public static final class b extends BaseItemProvider {
        /* JADX INFO: renamed from: y */
        private final void m85278y(BaseViewHolder baseViewHolder, UGCVideo uGCVideo) {
            String url;
            String thumbnail;
            UGCVideoHashTag uGCVideoHashTag;
            ShapeableImageView shapeableImageView = (ShapeableImageView) baseViewHolder.getView(R$id.iv_cover);
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
            Cover cover = uGCVideo.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94470i = bVarM94457m.m94468g(url).m94470i(R$color.cl37);
            Cover cover2 = uGCVideo.getCover();
            if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94470i.m94473l(thumbnail).m94465d(shapeableImageView);
            int i11 = R$id.tv_title;
            String title = uGCVideo.getTitle();
            if (title == null) {
                title = "";
            }
            baseViewHolder.setText(i11, title);
            baseViewHolder.setText(R$id.tv_views, AbstractC14564j.m65682c(uGCVideo.getWatchNum(), m36338k()));
            List<UGCVideoHashTag> hashTags = uGCVideo.getHashTags();
            String title2 = (hashTags == null || (uGCVideoHashTag = (UGCVideoHashTag) CollectionsKt.m97362l0(hashTags, 0)) == null) ? null : uGCVideoHashTag.getTitle();
            boolean z11 = true;
            if (title2 == null || title2.length() == 0) {
                baseViewHolder.setVisible(R$id.separator, false);
                baseViewHolder.setText(R$id.tv_type, "");
            } else {
                baseViewHolder.setVisible(R$id.separator, true);
                baseViewHolder.setText(R$id.tv_type, title2);
            }
            UGCVideoTypeKt.m83628i((ImageView) baseViewHolder.getView(R$id.iv_res_post_type), uGCVideo, null, 4, null);
            Long duration = uGCVideo.getDuration();
            baseViewHolder.setText(R$id.tv_duration, TimeUtilKt.m65666r(duration != null ? duration.longValue() : 0L));
            String corner = uGCVideo.getCorner();
            View view = baseViewHolder.getView(R$id.tag_audio);
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_audio_tag);
            if (corner != null && !StringsKt.m98160q0(corner)) {
                z11 = false;
            }
            view.setVisibility(z11 ? 8 : 0);
            String corner2 = uGCVideo.getCorner();
            textView.setText(corner2 != null ? corner2 : "");
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.user_profile_item_video;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder holder, UGCVideo data) {
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(data, "data");
            C26866a.a.m104898f(C26866a.f81698a, C20646c.f65174I, "convert position=" + holder.getLayoutPosition() + " id=" + data.getUgcVideoId(), false, 4, null);
            m85278y(holder, data);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20646c(List<UGCVideo> data, C28117b c28117b) {
        super(data);
        Intrinsics.m97802h(data, "data");
        this.exposureHelper = c28117b;
        mo36107F1(new b());
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        C28117b c28117b;
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (c28117b = this.exposureHelper) == null) {
            return;
        }
        c28117b.m109197i(layoutManager, bindingAdapterPosition, true, false);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends UGCVideo> data, int position) {
        Intrinsics.m97802h(data, "data");
        return 1;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
