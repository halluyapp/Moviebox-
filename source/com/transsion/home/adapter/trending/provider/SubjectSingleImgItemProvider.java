package com.transsion.home.adapter.trending.provider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import ck.C5123t;
import com.blankj.utilcode.util.AbstractC5780c0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.view.CornerTextView;
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
import com.transsnet.downloader.widget.DownloadView;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import fk.AbstractC23384a;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes5.dex */
public final class SubjectSingleImgItemProvider extends AbstractC15028b {

    /* JADX INFO: renamed from: e */
    private final boolean f52491e;

    /* JADX INFO: renamed from: f */
    private final int f52492f;

    /* JADX INFO: renamed from: g */
    private final double f52493g;

    /* JADX INFO: renamed from: h */
    private BaseViewHolder f52494h;

    public SubjectSingleImgItemProvider(boolean z11) {
        this.f52491e = z11;
        int iMin = Math.min(AbstractC5806y.m27489e(), AbstractC5806y.m27487c());
        this.f52492f = iMin;
        this.f52493g = ((double) iMin) * 0.5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Unit m67265F(Subject subject, boolean z11, boolean z12, long j11) {
        subject.setLoadCoverSuccess(z11);
        subject.setCoverCache(z12);
        subject.setLoadCoverDuration(j11);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: G */
    private final String m67266G(int i11) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11 / 3600), Integer.valueOf((i11 % 3600) / 60), Integer.valueOf(i11 % 60)}, 3));
        Intrinsics.m97801g(str, "format(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x021c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0222  */
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        String subjectId;
        ResourceDetectors resourceDetector;
        Integer type;
        Integer durationSeconds;
        int iIntValue;
        String url;
        String thumbnail;
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        final Subject feedsSubject = item.getFeedsSubject();
        if (feedsSubject == null || (subjectId = feedsSubject.getSubjectId()) == null || subjectId.length() == 0) {
            return;
        }
        if (this.f52491e && (constraintLayout = (ConstraintLayout) helper.getViewOrNull(R$id.cl_cover)) != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.height = AbstractC23384a.m92908b(Sdk$SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            layoutParams.width = ((int) this.f52493g) - AbstractC23384a.m92908b(36);
            constraintLayout.setLayoutParams(layoutParams);
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getViewOrNull(R$id.iv_cover);
        if (shapeableImageView != null) {
            if (feedsSubject.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new SubjectSingleImgItemProvider$convert$2$1(feedsSubject, shapeableImageView, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = feedsSubject.getCover();
                String str = "";
                if (cover == null || (url = cover.getUrl()) == null) {
                    url = "";
                }
                C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
                Cover cover2 = feedsSubject.getCover();
                if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
                    str = thumbnail;
                }
                bVarM94468g.m94473l(str).m94470i(R$color.skeleton).m94474m(this.f52492f).m94463b(new Function3() { // from class: com.transsion.home.adapter.trending.provider.k0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SubjectSingleImgItemProvider.m67265F(feedsSubject, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
                    }
                }).m94465d(shapeableImageView);
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
        Integer subjectType = feedsSubject.getSubjectType();
        int value = SubjectType.MUSIC.getValue();
        boolean z11 = false;
        if (subjectType != null && subjectType.intValue() == value) {
            AbstractC26006c.m102055h(helper.getView(R$id.tv_score));
            TextView textView = (TextView) helper.getView(R$id.tv_duration);
            AbstractC26006c.m102058k(textView);
            durationSeconds = feedsSubject.getDurationSeconds();
            if (durationSeconds != null) {
                iIntValue = durationSeconds.intValue();
            } else {
                iIntValue = 0;
            }
            textView.setText(m67266G(iIntValue));
        } else {
            Integer subjectType2 = feedsSubject.getSubjectType();
            int value2 = SubjectType.AUDIO.getValue();
            if (subjectType2 != null && subjectType2.intValue() == value2) {
                AbstractC26006c.m102055h(helper.getView(R$id.tv_score));
                TextView textView2 = (TextView) helper.getView(R$id.tv_duration);
                AbstractC26006c.m102058k(textView2);
                durationSeconds = feedsSubject.getDurationSeconds();
                if (durationSeconds != null) {
                    iIntValue = durationSeconds.intValue();
                } else {
                    iIntValue = 0;
                }
                textView2.setText(m67266G(iIntValue));
            } else {
                Integer subjectType3 = feedsSubject.getSubjectType();
                int value3 = SubjectType.EDUCATION.getValue();
                if (subjectType3 != null && subjectType3.intValue() == value3) {
                    AbstractC26006c.m102055h(helper.getView(R$id.tv_score));
                    TextView textView3 = (TextView) helper.getView(R$id.tv_duration);
                    AbstractC26006c.m102058k(textView3);
                    durationSeconds = feedsSubject.getDurationSeconds();
                    if (durationSeconds != null) {
                        iIntValue = durationSeconds.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    textView3.setText(m67266G(iIntValue));
                }
            }
        }
        ((CornerTextView) helper.getView(R$id.tv_tips)).setTextWithType(feedsSubject.getCorner(), feedsSubject.getSubjectType());
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
        if (Intrinsics.m97797c(feedsSubject.getHasResource(), Boolean.TRUE)) {
            DownloadView downloadView = (DownloadView) helper.getViewOrNull(R$id.ll_download);
            if (downloadView != null) {
                AbstractC26006c.m102058k(downloadView);
                if (C5123t.f17614a.m23960b()) {
                    Integer subjectType4 = feedsSubject.getSubjectType();
                    int value4 = SubjectType.SHORT_TV.getValue();
                    if (subjectType4 != null && subjectType4.intValue() == value4) {
                        resourceDetector = feedsSubject.getResourceDetector();
                        if (resourceDetector != null) {
                            String subjectId2 = feedsSubject.getSubjectId();
                            String resourceId = resourceDetector.getResourceId();
                            type = resourceDetector.getType();
                            if (type != null && type.intValue() == 1) {
                                z11 = true;
                            }
                            DownloadView.setShowType$default(downloadView, subjectId2, resourceId, Boolean.valueOf(z11), false, 0, 24, null);
                        }
                    } else {
                        downloadView.setShowPlayType();
                    }
                } else {
                    resourceDetector = feedsSubject.getResourceDetector();
                    if (resourceDetector != null) {
                        String subjectId3 = feedsSubject.getSubjectId();
                        String resourceId2 = resourceDetector.getResourceId();
                        type = resourceDetector.getType();
                        if (type != null) {
                            z11 = true;
                        }
                        DownloadView.setShowType$default(downloadView, subjectId3, resourceId2, Boolean.valueOf(z11), false, 0, 24, null);
                    }
                }
            }
        } else {
            helper.setGone(R$id.ll_download, true);
        }
        this.f52494h = helper;
        m67274A(helper, feedsSubject);
    }

    /* JADX INFO: renamed from: H */
    public final View m67268H() {
        BaseViewHolder baseViewHolder = this.f52494h;
        if (baseViewHolder != null) {
            return (DownloadView) baseViewHolder.getViewOrNull(R$id.ll_download);
        }
        return null;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.SINGLE_SUBJECT.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.post_list_item_subject_single_img;
    }
}
