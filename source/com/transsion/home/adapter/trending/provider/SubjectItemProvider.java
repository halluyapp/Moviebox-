package com.transsion.home.adapter.trending.provider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import ck.C5123t;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5780c0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.widget.R$color;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Trailer;
import com.transsnet.downloader.widget.DownloadView;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes5.dex */
public final class SubjectItemProvider extends AbstractC15028b {

    /* JADX INFO: renamed from: e */
    private final boolean f52485e;

    /* JADX INFO: renamed from: f */
    private final int f52486f = Math.min(AbstractC5806y.m27489e(), AbstractC5806y.m27487c());

    /* JADX INFO: renamed from: g */
    private final int f52487g;

    /* JADX INFO: renamed from: h */
    private BaseViewHolder f52488h;

    public SubjectItemProvider(boolean z11) {
        this.f52485e = z11;
        this.f52487g = AbstractC5776a0.m27313a(z11 ? 146.40001f : 122.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Unit m67259F(Subject subject, boolean z11, boolean z12, long j11) {
        subject.setLoadCoverSuccess(z11);
        subject.setCoverCache(z12);
        subject.setLoadCoverDuration(j11);
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0292  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        String subjectId;
        ResourceDetectors resourceDetector;
        Cover cover;
        Cover cover2;
        Cover cover3;
        Cover cover4;
        String url;
        String thumbnail;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        final Subject feedsSubject = item.getFeedsSubject();
        if (feedsSubject == null || (subjectId = feedsSubject.getSubjectId()) == null || subjectId.length() == 0) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) helper.getViewOrNull(R$id.cl_cover);
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            int i11 = this.f52487g;
            layoutParams.height = i11;
            layoutParams.width = (i11 / 4) * 3;
            constraintLayout.setLayoutParams(layoutParams);
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getViewOrNull(R$id.iv_cover);
        if (shapeableImageView != null) {
            if (feedsSubject.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new SubjectItemProvider$convert$2$1(feedsSubject, shapeableImageView, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover5 = feedsSubject.getCover();
                if (cover5 == null || (url = cover5.getUrl()) == null) {
                    url = "";
                }
                C23860f.b bVarM94470i = bVarM94457m.m94468g(url).m94474m(this.f52486f).m94470i(R$color.skeleton);
                Cover cover6 = feedsSubject.getCover();
                if (cover6 == null || (thumbnail = cover6.getThumbnail()) == null) {
                    thumbnail = "";
                }
                bVarM94470i.m94473l(thumbnail).m94463b(new Function3() { // from class: com.transsion.home.adapter.trending.provider.j0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SubjectItemProvider.m67259F(feedsSubject, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
                    }
                }).m94465d(shapeableImageView);
            }
        }
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) helper.getViewOrNull(R$id.iv_stills);
        if (shapeableImageView2 != null) {
            ViewGroup.LayoutParams layoutParams2 = shapeableImageView2.getLayoutParams();
            layoutParams2.height = this.f52487g;
            shapeableImageView2.setLayoutParams(layoutParams2);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Trailer trailer = feedsSubject.getTrailer();
            T url2 = (trailer == null || (cover4 = trailer.getCover()) == null) ? 0 : cover4.getUrl();
            objectRef.element = url2;
            CharSequence charSequence = (CharSequence) url2;
            if (charSequence == null || charSequence.length() == 0) {
                Cover stills = feedsSubject.getStills();
                String url3 = stills != null ? stills.getUrl() : null;
                objectRef.element = (url3 == null || url3.length() == 0 ? (cover = feedsSubject.getCover()) == null : (cover = feedsSubject.getStills()) == null) ? 0 : cover.getUrl();
            }
            Trailer trailer2 = feedsSubject.getTrailer();
            String thumbnail2 = (trailer2 == null || (cover3 = trailer2.getCover()) == null) ? null : cover3.getThumbnail();
            if (thumbnail2 == null || thumbnail2.length() == 0) {
                Cover stills2 = feedsSubject.getStills();
                String thumbnail3 = stills2 != null ? stills2.getThumbnail() : null;
                thumbnail2 = (thumbnail3 == null || thumbnail3.length() == 0 ? (cover2 = feedsSubject.getCover()) == null : (cover2 = feedsSubject.getStills()) == null) ? null : cover2.getThumbnail();
            }
            if (feedsSubject.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new SubjectItemProvider$convert$3$1(objectRef, shapeableImageView2, null), 3, null);
            } else {
                C23860f.a aVar2 = C23860f.f72909a;
                Context context2 = shapeableImageView2.getContext();
                Intrinsics.m97801g(context2, "getContext(...)");
                C23860f.b bVarM94457m2 = aVar2.m94457m(context2);
                String str = (String) objectRef.element;
                if (str == null) {
                    str = "";
                }
                bVarM94457m2.m94468g(str).m94470i(R$color.skeleton).m94473l(thumbnail2 != null ? thumbnail2 : "").m94465d(shapeableImageView2);
            }
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) helper.getViewOrNull(R$id.ic_player);
        if (appCompatImageView != null) {
            if (feedsSubject.getTrailer() == null) {
                AbstractC26006c.m102054g(appCompatImageView);
            } else {
                AbstractC26006c.m102058k(appCompatImageView);
            }
        }
        helper.setText(R$id.tv_subject, feedsSubject.getTitle());
        Date dateM27346l = AbstractC5780c0.m27346l(feedsSubject.getReleaseDate(), "yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateM27346l);
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getViewOrNull(R$id.tv_subject_year);
        if (appCompatTextView != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) String.valueOf(calendar.get(1)));
            String countryName = feedsSubject.getCountryName();
            if (countryName != null && countryName.length() != 0) {
                spannableStringBuilder.append((CharSequence) " • ").append((CharSequence) feedsSubject.getCountryName());
            }
            String genre = feedsSubject.getGenre();
            if (genre != null && genre.length() != 0) {
                SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) " • ");
                String genre2 = feedsSubject.getGenre();
                spannableStringBuilderAppend.append((CharSequence) (genre2 != null ? StringsKt.m98236Q(genre2, "，", " • ", false, 4, null) : null));
            }
            appCompatTextView.setText(spannableStringBuilder.toString());
            Drawable drawable = AbstractC2397b.getDrawable(appCompatTextView.getContext(), AbstractC16247h.m71009a(feedsSubject.getSubjectType()));
            if (drawable != null) {
                drawable.setTint(AbstractC2397b.getColor(appCompatTextView.getContext(), R$color.gray_40));
            }
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        helper.setText(com.transsion.baseui.R$id.tv_subject, feedsSubject.getTitle());
        if (Intrinsics.m97797c(feedsSubject.getHasResource(), Boolean.TRUE)) {
            DownloadView downloadView = (DownloadView) helper.getViewOrNull(R$id.ll_download);
            if (downloadView != null) {
                AbstractC26006c.m102058k(downloadView);
                if (C5123t.f17614a.m23960b()) {
                    Integer subjectType = feedsSubject.getSubjectType();
                    int value = SubjectType.SHORT_TV.getValue();
                    if (subjectType != null && subjectType.intValue() == value) {
                        resourceDetector = feedsSubject.getResourceDetector();
                        if (resourceDetector != null) {
                            String subjectId2 = feedsSubject.getSubjectId();
                            String resourceId = resourceDetector.getResourceId();
                            Integer type = resourceDetector.getType();
                            DownloadView.setShowType$default(downloadView, subjectId2, resourceId, Boolean.valueOf(type == null && type.intValue() == 1), false, 0, 24, null);
                        }
                    } else {
                        downloadView.setShowPlayType();
                    }
                } else {
                    resourceDetector = feedsSubject.getResourceDetector();
                    if (resourceDetector != null) {
                        String subjectId3 = feedsSubject.getSubjectId();
                        String resourceId2 = resourceDetector.getResourceId();
                        Integer type2 = resourceDetector.getType();
                        DownloadView.setShowType$default(downloadView, subjectId3, resourceId2, Boolean.valueOf(type2 == null && type2.intValue() == 1), false, 0, 24, null);
                    }
                }
            }
        } else {
            helper.setGone(R$id.ll_download, true);
        }
        this.f52488h = helper;
        m67274A(helper, feedsSubject);
    }

    /* JADX INFO: renamed from: G */
    public final View m67261G() {
        BaseViewHolder baseViewHolder = this.f52488h;
        if (baseViewHolder != null) {
            return (DownloadView) baseViewHolder.getViewOrNull(R$id.ll_download);
        }
        return null;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.SUBJECT.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.post_list_item_subject;
    }
}
