package com.transsion.search_pugc.fragment.hot.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import ck.C5111h;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.search.R$drawable;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.R$string;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.constant.AbstractC18568a;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.hot.adapter.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, m97100d2 = {"Lcom/transsion/search_pugc/fragment/hot/adapter/g;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "parentName", "", "parentIndex", "", "showRank", "<init>", "(Ljava/lang/String;IZ)V", "video", RequestParameters.POSITION, "", "F1", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;I)V", "E1", "()I", "holder", WebConstants.FIELD_ITEM, "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "F", "Ljava/lang/String;", "G", "I", "H", "Z", "mIsLowDevice", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18608g extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String parentName;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int parentIndex;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean showRank;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final boolean mIsLowDevice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18608g(String parentName, int i11, boolean z11) {
        super(R$layout.item_search_rank_item, null, 2, null);
        Intrinsics.m97802h(parentName, "parentName");
        this.parentName = parentName;
        this.parentIndex = i11;
        this.showRank = z11;
        this.mIsLowDevice = C5111h.f17603a.m23913a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m78341D1(C18608g c18608g, UGCVideo uGCVideo, int i11, View view) {
        c18608g.m78343F1(uGCVideo, i11);
    }

    /* JADX INFO: renamed from: E1 */
    private final int m78342E1() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? GravityCompat.END : GravityCompat.START;
    }

    /* JADX INFO: renamed from: F1 */
    private final void m78343F1(UGCVideo video, int position) {
        C18670g.f60281h.m78520a(getContext()).m78512t(video, position, this.parentName, this.parentIndex);
        if (getContext() instanceof Activity) {
            Context context = getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
            if (KeyboardUtils.m27133g((Activity) context)) {
                Context context2 = getContext();
                Intrinsics.m97800f(context2, "null cannot be cast to non-null type android.app.Activity");
                KeyboardUtils.m27130d((Activity) context2);
            }
        }
        AbstractC18568a.m78235h(video, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, final UGCVideo item) {
        String url;
        String thumbnail;
        UGCVideoHashTag uGCVideoHashTag;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        final int iM36184g0 = m36184g0(item);
        boolean z11 = true;
        if (this.showRank) {
            holder.setVisible(R$id.search_hot_rank_item_index_text, false);
        } else {
            int i11 = R$drawable.bg_hot_subject_no4;
            if (iM36184g0 == 0) {
                i11 = R$drawable.bg_hot_subject_no1;
            } else if (iM36184g0 == 1) {
                i11 = R$drawable.bg_hot_subject_no2;
            } else if (iM36184g0 == 2) {
                i11 = R$drawable.bg_hot_subject_no3;
            }
            holder.setText(R$id.search_hot_rank_item_index_text, String.valueOf(iM36184g0 + 1));
            holder.setBackgroundResource(R$id.search_hot_rank_item_index_text, i11);
        }
        if (this.mIsLowDevice) {
            holder.setGone(R$id.search_hot_rank_item_image_linear, true);
        } else {
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
            Cover cover = item.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            Cover cover2 = item.getCover();
            if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94468g.m94473l(thumbnail).m94474m(AbstractC5776a0.m27313a(50.0f)).m94465d((ImageView) holder.getView(R$id.search_hot_rank_item_image));
        }
        int i12 = R$id.search_hot_rank_item_title_text;
        String title = item.getTitle();
        if (title == null) {
            title = "";
        }
        holder.setText(i12, title);
        ((TextView) holder.getView(R$id.search_hot_rank_item_title_text)).setGravity(m78342E1());
        ((TextView) holder.getView(R$id.search_hot_rank_item_subtitle_text)).setGravity(m78342E1());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search_pugc.fragment.hot.adapter.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18608g.m78341D1(this.f60156a, item, iM36184g0, view);
            }
        });
        int i13 = R$id.search_hot_rank_item_corner;
        String corner = item.getCorner();
        if (corner != null && corner.length() != 0) {
            z11 = false;
        }
        holder.setGone(i13, z11);
        int i14 = R$id.search_hot_rank_item_corner;
        String corner2 = item.getCorner();
        holder.setText(i14, corner2 != null ? corner2 : "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String watchNum = item.getWatchNum();
        String strM78239l = watchNum != null ? AbstractC18568a.m78239l(watchNum) : null;
        spannableStringBuilder.append((CharSequence) (strM78239l + " " + getContext().getString(R$string.views)));
        List<UGCVideoHashTag> hashTags = item.getHashTags();
        if (hashTags != null && (uGCVideoHashTag = (UGCVideoHashTag) CollectionsKt.m97362l0(hashTags, 0)) != null) {
            spannableStringBuilder.append((CharSequence) "￼");
            spannableStringBuilder.append((CharSequence) uGCVideoHashTag.getTitle());
        }
        ((TextView) holder.getView(R$id.search_hot_rank_item_subtitle_text)).setText(spannableStringBuilder);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
