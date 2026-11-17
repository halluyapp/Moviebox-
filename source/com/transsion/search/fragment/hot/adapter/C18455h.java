package com.transsion.search.fragment.hot.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import ck.C5111h;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5789h;
import com.blankj.utilcode.util.KeyboardUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mbridge.msdk.MBridgeConstans;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.search.AbstractC18381f;
import com.transsion.search.R$drawable;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.bean.HotCover;
import com.transsion.search.bean.HotSubject;
import com.transsion.search.fragment.hot.SearchHotFragment;
import com.transsion.search.widget.C18541d;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.search.fragment.hot.adapter.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\"\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, m97100d2 = {"Lcom/transsion/search/fragment/hot/adapter/h;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/search/bean/HotSubject;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "parentCategory", "", "parentIndex", "", "isTabLayout", "sugSource", "<init>", "(Ljava/lang/String;IZLjava/lang/String;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "subject", RequestParameters.POSITION, "", "F1", "(Landroid/view/View;Lcom/transsion/search/bean/HotSubject;I)V", "E1", "()I", "holder", WebConstants.FIELD_ITEM, "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/search/bean/HotSubject;)V", "F", "Ljava/lang/String;", "G", "I", "H", "Z", "J", "mIsLowDevice", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18455h extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String parentCategory;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int parentIndex;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean isTabLayout;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String sugSource;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final boolean mIsLowDevice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18455h(String parentCategory, int i11, boolean z11, String sugSource) {
        super(R$layout.item_search_hot_rank_inner, null, 2, null);
        Intrinsics.m97802h(parentCategory, "parentCategory");
        Intrinsics.m97802h(sugSource, "sugSource");
        this.parentCategory = parentCategory;
        this.parentIndex = i11;
        this.isTabLayout = z11;
        this.sugSource = sugSource;
        this.mIsLowDevice = C5111h.f17603a.m23913a();
    }

    public /* synthetic */ C18455h(String str, int i11, boolean z11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, z11, (i12 & 8) != 0 ? "mb_sug" : str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m77828D1(C18455h c18455h, HotSubject hotSubject, int i11, View view) {
        Intrinsics.m97799e(view);
        c18455h.m77830F1(view, hotSubject, i11);
    }

    /* JADX INFO: renamed from: E1 */
    private final int m77829E1() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? GravityCompat.END : GravityCompat.START;
    }

    /* JADX INFO: renamed from: F1 */
    private final void m77830F1(View view, HotSubject subject, int position) {
        C18541d.f60046a.m78135o(subject, position, this.parentCategory, this.parentIndex, this.mIsLowDevice, this.sugSource);
        if (getContext() instanceof Activity) {
            Context context = getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type android.app.Activity");
            if (KeyboardUtils.m27133g((Activity) context)) {
                Context context2 = getContext();
                Intrinsics.m97800f(context2, "null cannot be cast to non-null type android.app.Activity");
                KeyboardUtils.m27130d((Activity) context2);
            }
        }
        Integer subjectType = subject.getSubjectType();
        int value = SubjectType.SHORT_TV.getValue();
        if (subjectType == null || subjectType.intValue() != value) {
            Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
            Integer subjectType2 = subject.getSubjectType();
            Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType2 != null ? subjectType2.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", subject.getSubjectId()).m61857K("ops", subject.getOps()), view.getContext(), null, 2, null);
        } else {
            DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
            Context context3 = getContext();
            Intrinsics.m97800f(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            downloadManagerApiM87093a.m87086d0((FragmentActivity) context3, SearchHotFragment.PAGE_NAME, (384 & 4) != 0 ? "" : "", subject.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : null, (384 & 128) != 0 ? null : subject.getSubjectId(), (384 & 256) != 0 ? Boolean.FALSE : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, final HotSubject item) {
        String url;
        String thumbnail;
        List listL;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        final int iM36184g0 = m36184g0(item);
        if (item.isMusicType()) {
            View view = holder.getView(R$id.search_hot_rank_item_image_linear);
            float f11 = this.isTabLayout ? 2 : 1;
            view.getLayoutParams().width = AbstractC5776a0.m27313a(80.0f * f11);
            view.getLayoutParams().height = AbstractC5776a0.m27313a(f11 * 45.0f);
            view.setLayoutParams(view.getLayoutParams());
            ((TextView) holder.getView(R$id.search_hot_rank_item_title_text)).setMaxLines(1);
        }
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
        if (this.mIsLowDevice) {
            holder.setGone(R$id.search_hot_rank_item_image_linear, true);
        } else {
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
            HotCover cover = item.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            HotCover cover2 = item.getCover();
            if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94468g.m94473l(thumbnail).m94474m(AbstractC5776a0.m27313a(50.0f)).m94465d((ImageView) holder.getView(R$id.search_hot_rank_item_image));
        }
        holder.setText(R$id.search_hot_rank_item_title_text, item.getTitle());
        ((TextView) holder.getView(R$id.search_hot_rank_item_title_text)).setGravity(m77829E1());
        ((TextView) holder.getView(R$id.search_hot_rank_item_subtitle_text)).setGravity(m77829E1());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.hot.adapter.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C18455h.m77828D1(this.f59830a, item, iM36184g0, view2);
            }
        });
        int i12 = R$id.search_hot_rank_item_corner;
        String corner = item.getCorner();
        holder.setGone(i12, corner == null || corner.length() == 0);
        int i13 = R$id.search_hot_rank_item_corner;
        String corner2 = item.getCorner();
        if (corner2 == null) {
            corner2 = "";
        }
        holder.setText(i13, corner2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ImageSpan imageSpanM77672a = AbstractC18381f.m77672a(getContext(), AbstractC16247h.m71009a(item.getSubjectType()));
        spannableStringBuilder.append((CharSequence) "￼");
        spannableStringBuilder.setSpan(imageSpanM77672a, 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "￼");
        spannableStringBuilder.setSpan(AbstractC18381f.m77673b(getContext()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        if (item.getImdbRatingValue() != null && !item.isMusicType()) {
            ImageSpan imageSpanM77672a2 = AbstractC18381f.m77672a(getContext(), R$drawable.ic_search_result_star);
            spannableStringBuilder.append((CharSequence) "￼");
            spannableStringBuilder.setSpan(imageSpanM77672a2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) item.getImdbRatingValue());
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AbstractC5789h.m27406a(R$color.yellow_60));
            String imdbRatingValue = item.getImdbRatingValue();
            spannableStringBuilder.setSpan(foregroundColorSpan, spannableStringBuilder.length() - (imdbRatingValue != null ? imdbRatingValue.length() : 0), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "￼");
            spannableStringBuilder.setSpan(AbstractC18381f.m77673b(getContext()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        if (item.getReleaseDate() != null) {
            String releaseDate = item.getReleaseDate();
            String strSubstring = releaseDate != null ? releaseDate : "";
            if (strSubstring.length() >= 4) {
                strSubstring = strSubstring.substring(0, 4);
                Intrinsics.m97801g(strSubstring, "substring(...)");
            }
            spannableStringBuilder.append((CharSequence) strSubstring);
            spannableStringBuilder.append((CharSequence) "￼");
            spannableStringBuilder.setSpan(AbstractC18381f.m77673b(getContext()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        if (item.getCountryName() != null) {
            spannableStringBuilder.append((CharSequence) item.getCountryName());
            spannableStringBuilder.append((CharSequence) "￼");
            spannableStringBuilder.setSpan(AbstractC18381f.m77673b(getContext()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        if (item.getGenre() != null) {
            String genre = item.getGenre();
            if (genre == null || (listL = StringsKt.m98117S0(genre, new String[]{","}, false, 0, 6, null)) == null) {
                listL = CollectionsKt.m97506l();
            }
            if (!listL.isEmpty()) {
                spannableStringBuilder.append((CharSequence) listL.get(0));
            }
        }
        ((TextView) holder.getView(R$id.search_hot_rank_item_subtitle_text)).setText(spannableStringBuilder);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
