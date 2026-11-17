package com.transsion.moviedetail.adapter;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.edcation.CourseManager;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p000.AbstractC0000a;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015¨\u0006\u001d"}, m97100d2 = {"Lcom/transsion/moviedetail/adapter/ForYouEduAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "data", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "E1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Subject;)V", "C1", "", "", "payloads", "D1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Subject;Ljava/util/List;)V", "", "F", "I", "width", "", "G", "coverW", "H", "coverH", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ForYouEduAdapter extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final float coverW;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final float coverH;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForYouEduAdapter(List<Subject> data) {
        super(R$layout.movie_detail_item_for_you_edu, data);
        Intrinsics.m97802h(data, "data");
        int iM27489e = AbstractC5806y.m27489e();
        this.width = iM27489e;
        float fM27313a = (iM27489e - AbstractC5776a0.m27313a(40.0f)) / 3.0f;
        this.coverW = fM27313a;
        this.coverH = (fM27313a * 149.0f) / 107.0f;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX INFO: renamed from: E1 */
    private final void m70177E1(BaseViewHolder holder, final Subject item) {
        boolean z11;
        AppCompatImageView appCompatImageView = (AppCompatImageView) holder.getViewOrNull(R$id.ivAdd);
        if (appCompatImageView != null) {
            Integer seenStatus = item.getSeenStatus();
            if (seenStatus != null) {
                z11 = seenStatus.intValue() == 1;
            }
            appCompatImageView.setSelected(z11);
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.adapter.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ForYouEduAdapter.m70178F1(item, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m70178F1(Subject subject, View view) {
        CourseManager.m66444u(CourseManager.f51684a, subject, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, Subject item) {
        String thumbnail;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.iv_cover);
        if (shapeableImageView != null) {
            if (item.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ForYouEduAdapter$convert$1$1(item, shapeableImageView, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = item.getCover();
                C23860f.b bVarM94464c = bVarM94457m.m94468g(cover != null ? cover.getUrl() : null).m94474m((int) this.coverW).m94464c((int) this.coverH);
                Cover cover2 = item.getCover();
                if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                    thumbnail = "";
                }
                bVarM94464c.m94473l(thumbnail).m94465d(shapeableImageView);
            }
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getViewOrNull(R$id.tv_title);
        if (appCompatTextView != null) {
            appCompatTextView.setText(item.getTitle());
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) holder.getViewOrNull(R$id.tvTag);
        if (appCompatTextView2 != null) {
            Context context2 = appCompatTextView2.getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            appCompatTextView2.setText(AbstractC0000a.m1b(context2, item));
        }
        m70177E1(holder, item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(BaseViewHolder holder, Subject item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        if (!payloads.isEmpty() && (payloads.get(payloads.size() - 1) instanceof Integer)) {
            m70177E1(holder, item);
        }
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
