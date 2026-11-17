package com.transsion.home.view;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.widget.R$color;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p462hj.C23860f;
import sh.C27621h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m97100d2 = {"Lcom/transsion/home/view/RankingAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "datas", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Subject;)V", "Lkotlin/Pair;", "", "F", "Lkotlin/Pair;", "pairWH", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class RankingAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: G */
    public static final int f53540G = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Pair<Integer, Integer> pairWH;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankingAdapter(List<Subject> datas) {
        super(R$layout.item_ranking, datas);
        Intrinsics.m97802h(datas, "datas");
        this.pairWH = C27621h.f84745a.m107452b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, Subject item) {
        String string;
        String url;
        String thumbnail;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ConstraintLayout constraintLayout = (ConstraintLayout) holder.getViewOrNull(R$id.item_root);
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.width = this.pairWH.getFirst().intValue();
            layoutParams.height = -2;
            constraintLayout.setLayoutParams(layoutParams);
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.iv_cover);
        if (shapeableImageView != null) {
            ViewGroup.LayoutParams layoutParams2 = shapeableImageView.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = this.pairWH.getSecond().intValue();
            if (item.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new RankingAdapter$convert$2$1(item, shapeableImageView, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = item.getCover();
                String str = "";
                if (cover == null || (url = cover.getUrl()) == null) {
                    url = "";
                }
                C23860f.b bVarM94464c = bVarM94457m.m94468g(url).m94474m(this.pairWH.getFirst().intValue()).m94464c(this.pairWH.getSecond().intValue());
                Cover cover2 = item.getCover();
                if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
                    str = thumbnail;
                }
                bVarM94464c.m94473l(str).m94465d(shapeableImageView);
            }
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getViewOrNull(R$id.tv_score);
        if (appCompatTextView != null) {
            AbstractC26006c.m102058k(appCompatTextView);
            appCompatTextView.setText(item.getImdbRate());
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) holder.getViewOrNull(R$id.tv_title);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(item.getTitle());
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) holder.getViewOrNull(R$id.tv_tag);
        if (appCompatTextView3 != null) {
            String tag = item.getTag();
            if (tag == null || tag.length() == 0) {
                appCompatTextView3.setTextColor(AbstractC2397b.getColor(appCompatTextView3.getContext(), R$color.text_03));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(item.getCountryName());
                String genre = item.getGenre();
                List listS0 = genre != null ? StringsKt.m98117S0(genre, new String[]{","}, false, 0, 6, null) : null;
                if (listS0 != null && (!listS0.isEmpty())) {
                    sb2.append(" ");
                    sb2.append((String) listS0.get(0));
                }
                string = sb2.toString();
            } else {
                appCompatTextView3.setTextColor(AbstractC2397b.getColor(appCompatTextView3.getContext(), R$color.rank_tag_color));
                string = item.getTag();
            }
            appCompatTextView3.setText(string);
        }
    }
}
