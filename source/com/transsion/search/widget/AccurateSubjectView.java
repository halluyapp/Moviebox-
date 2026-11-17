package com.transsion.search.widget;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5123t;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5780c0;
import com.blankj.utilcode.util.AbstractC5802u;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.CornerTextView;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.adapter.C18361a;
import com.transsion.search.bean.AccurateSubject;
import com.transsion.search.bean.SearchSubject;
import com.transsion.search.bean.Season;
import com.transsion.search.fragment.values.SearchValuesFragment;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.widget.DownloadView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C25825b;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p765s6.InterfaceC27566d;
import p832v6.AbstractC28078a;
import p881wq.C28428m;
import sh.C27621h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00103\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00105\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00107\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u0010,¨\u00068"}, m97100d2 = {"Lcom/transsion/search/widget/AccurateSubjectView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", CampaignEx.JSON_KEY_AD_K, "()V", "Landroid/text/SpannableStringBuilder;", TtmlNode.TAG_SPAN, "i", "(Landroid/text/SpannableStringBuilder;)V", "Landroid/view/ViewGroup;", "root", "Lcom/transsion/moviedetailapi/bean/Subject;", "subject", "j", "(Landroid/view/ViewGroup;Lcom/transsion/moviedetailapi/bean/Subject;)V", RequestParameters.POSITION, "Lcom/transsion/search/bean/SearchSubject;", "Lcom/transsion/search/bean/Season;", WebConstants.FIELD_ITEM, "l", "(ILcom/transsion/search/bean/SearchSubject;Lcom/transsion/search/bean/Season;)V", "Lcom/transsion/search/bean/AccurateSubject;", "accurateSubject", "setData", "(Lcom/transsion/search/bean/AccurateSubject;)V", "Lcom/transsion/search/adapter/a;", "a", "Lcom/transsion/search/adapter/a;", "seasonsAdapter", "Lwq/m;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lwq/m;", "mViewBinding", "c", "I", "movieDesignW", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "movieDesignH", "e", "size48", "f", "screenW", "g", "size16", "h", "showMaxSeasonsSize", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class AccurateSubjectView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C18361a seasonsAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C28428m mViewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int movieDesignW;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int movieDesignH;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int size48;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int screenW;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int size16;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int showMaxSeasonsSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccurateSubjectView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccurateSubjectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccurateSubjectView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.movieDesignW = AbstractC5776a0.m27313a(104.0f);
        this.movieDesignH = AbstractC5776a0.m27313a(149.0f);
        this.size48 = AbstractC5776a0.m27313a(48.0f);
        C27621h c27621h = C27621h.f84745a;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        this.screenW = c27621h.m107455e(applicationM27275a);
        this.size16 = AbstractC5776a0.m27313a(16.0f);
        this.showMaxSeasonsSize = 6;
        m78110k();
    }

    /* JADX INFO: renamed from: i */
    private final void m78108i(SpannableStringBuilder span) {
        if (span.length() > 0) {
            span.append(" / ");
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m78109j(ViewGroup root, Subject subject) {
        String[] strArrM27460a;
        if (root == null || subject == null || (strArrM27460a = AbstractC5802u.m27460a(subject.getGenre(), ",")) == null) {
            return;
        }
        for (String str : strArrM27460a) {
            View viewM109103a = AbstractC28078a.m109103a(this, R$layout.item_search_subject_tag);
            ((TextView) viewM109103a.findViewById(R$id.tagTV)).setText(str);
            root.addView(viewM109103a);
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m78110k() {
        this.mViewBinding = C28428m.m109843a(View.inflate(getContext(), R$layout.item_search_values_accurate_layout, this));
        setClipChildren(false);
    }

    /* JADX INFO: renamed from: l */
    private final void m78111l(int position, SearchSubject subject, Season item) {
        Integer subjectType;
        Integer se2 = item.getSe();
        Navigator.m61845x(TheRouter.m61773c("/movie/detail").m61852F("subject_type", (subject == null || (subjectType = subject.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue()).m61857K("id", subject != null ? subject.getSubjectId() : null).m61852F("season", position != this.showMaxSeasonsSize + (-1) ? se2 != null ? se2.intValue() : 0 : 0).m61857K("ops", subject != null ? subject.getOps() : null), getContext(), null, 2, null);
        SearchValuesFragment.Companion companion = SearchValuesFragment.INSTANCE;
        companion.m77956b("", subject != null ? subject.getSubjectId() : null, "", subject != null ? subject.getOps() : null, position, 4, companion.m77955a(), String.valueOf(item.getSe()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m78112m(AccurateSubjectView accurateSubjectView, SearchSubject searchSubject, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        C18361a c18361a = accurateSubjectView.seasonsAdapter;
        Season season = c18361a != null ? (Season) c18361a.getItem(i11) : null;
        if (season != null) {
            accurateSubjectView.m78111l(i11, searchSubject, season);
        }
    }

    public final void setData(AccurateSubject accurateSubject) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        DownloadView downloadView;
        C28428m c28428m;
        DownloadView downloadView2;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        CornerTextView cornerTextView;
        Intrinsics.m97802h(accurateSubject, "accurateSubject");
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i11 = this.size16;
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(-i11, 0, -i11, 0);
        final SearchSubject subject = accurateSubject.getSubject();
        C28428m c28428m2 = this.mViewBinding;
        ShapeableImageView shapeableImageView = c28428m2 != null ? c28428m2.f87213b : null;
        Cover cover = subject != null ? subject.getCover() : null;
        if (cover != null) {
            String url = cover.getUrl();
            if (url != null && shapeableImageView != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94468g = aVar.m94457m(context).m94468g(url);
                String thumbnail = cover.getThumbnail();
                if (thumbnail == null) {
                    thumbnail = "";
                }
                bVarM94468g.m94473l(thumbnail).m94465d(shapeableImageView);
            }
            C28428m c28428m3 = this.mViewBinding;
            if (c28428m3 != null && (cornerTextView = c28428m3.f87214c) != null) {
                cornerTextView.setTextWithType(subject.getCorner(), subject.getSubjectType());
            }
            C28428m c28428m4 = this.mViewBinding;
            if (c28428m4 != null && (appCompatTextView3 = c28428m4.f87219h) != null) {
                appCompatTextView3.setText(subject.getTitle());
            }
            C28428m c28428m5 = this.mViewBinding;
            if (c28428m5 != null && (appCompatTextView2 = c28428m5.f87220i) != null) {
                appCompatTextView2.setText(subject.getImdbRate());
            }
            C28428m c28428m6 = this.mViewBinding;
            if (c28428m6 != null && (appCompatTextView = c28428m6.f87221j) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append("  ");
                String releaseDate = subject.getReleaseDate();
                if (releaseDate != null && releaseDate.length() != 0) {
                    Date dateM27346l = AbstractC5780c0.m27346l(subject.getReleaseDate(), "yyyy-MM-dd");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(dateM27346l);
                    spannableStringBuilder.append((CharSequence) String.valueOf(calendar.get(1)));
                }
                String countryName = subject.getCountryName();
                if (countryName != null && countryName.length() != 0) {
                    m78108i(spannableStringBuilder);
                    spannableStringBuilder.append((CharSequence) subject.getCountryName());
                }
                Integer durationSeconds = subject.getDurationSeconds();
                if ((durationSeconds != null ? durationSeconds.intValue() : 0) > 0 && !subject.isEPType()) {
                    m78108i(spannableStringBuilder);
                    spannableStringBuilder.append((CharSequence) AbstractC14564j.m65681b(subject.getDurationSeconds()));
                }
                List<Staff> staffList = subject.getStaffList();
                if (staffList != null) {
                    int i12 = 2;
                    for (Staff staff : staffList) {
                        if (i12 != 0) {
                            i12--;
                            m78108i(spannableStringBuilder);
                            spannableStringBuilder.append((CharSequence) staff.getName());
                        }
                    }
                }
                String duration = subject.getDuration();
                if (!(duration == null || duration.length() == 0) && !subject.isSeries()) {
                    m78108i(spannableStringBuilder);
                    spannableStringBuilder.append((CharSequence) subject.getDuration());
                }
                int iM71009a = AbstractC16247h.m71009a(subject.getSubjectType());
                spannableStringBuilder.setSpan(Build.VERSION.SDK_INT >= 29 ? new ImageSpan(appCompatTextView.getContext(), iM71009a, 2) : new ImageSpan(appCompatTextView.getContext(), iM71009a, 1), 0, 1, 34);
                appCompatTextView.setText(spannableStringBuilder);
            }
            C28428m c28428m7 = this.mViewBinding;
            if (c28428m7 != null && (downloadView = c28428m7.f87216e) != null) {
                Integer subjectType = subject.getSubjectType();
                int value = SubjectType.SHORT_TV.getValue();
                if (subjectType != null && subjectType.intValue() == value) {
                    AbstractC26006c.m102058k(downloadView);
                }
                if (Intrinsics.m97797c(subject.getHasResource(), Boolean.TRUE)) {
                    AbstractC26006c.m102058k(downloadView);
                    if (C5123t.f17614a.m23960b()) {
                        downloadView.setShowPlayType();
                    } else {
                        List<ResourceDetectors> resourceDetectors = subject.getResourceDetectors();
                        if (resourceDetectors != null && !resourceDetectors.isEmpty() && (c28428m = this.mViewBinding) != null && (downloadView2 = c28428m.f87216e) != null) {
                            String subjectId = subject.getSubjectId();
                            String resourceId = resourceDetectors.get(0).getResourceId();
                            Integer type = resourceDetectors.get(0).getType();
                            DownloadView.setShowType$default(downloadView2, subjectId, resourceId, Boolean.valueOf(type != null && type.intValue() == 1), false, 0, 24, null);
                        }
                    }
                } else {
                    AbstractC26006c.m102055h(downloadView);
                }
            }
        }
        List<Season> seasons = accurateSubject.getSeasons();
        int size = seasons != null ? seasons.size() : 0;
        List<Season> seasons2 = accurateSubject.getSeasons();
        List listK0 = seasons2 != null ? CollectionsKt.m97333K0(seasons2, 6) : null;
        C28428m c28428m8 = this.mViewBinding;
        m78109j(c28428m8 != null ? c28428m8.f87218g : null, accurateSubject.getSubject());
        if (!(listK0 != null && (listK0.isEmpty() ^ true)) || listK0.size() <= 1) {
            C28428m c28428m9 = this.mViewBinding;
            if (c28428m9 != null && (recyclerView = c28428m9.f87217f) != null) {
                recyclerView.setVisibility(8);
            }
        } else {
            C28428m c28428m10 = this.mViewBinding;
            if (c28428m10 != null && (recyclerView3 = c28428m10.f87217f) != null) {
                recyclerView3.setVisibility(0);
            }
            C28428m c28428m11 = this.mViewBinding;
            if (c28428m11 != null && (recyclerView2 = c28428m11.f87217f) != null) {
                recyclerView2.setLayoutManager(new GridLayoutManager(recyclerView2.getContext(), 3));
                C18361a c18361a = new C18361a(0, 1, null);
                c18361a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search.widget.a
                    @Override // p765s6.InterfaceC27566d
                    /* JADX INFO: renamed from: a */
                    public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i13) {
                        AccurateSubjectView.m78112m(this.f60042a, subject, baseQuickAdapter, view, i13);
                    }
                });
                this.seasonsAdapter = c18361a;
                recyclerView2.setAdapter(c18361a);
                C18361a c18361a2 = this.seasonsAdapter;
                if (c18361a2 != null) {
                    c18361a2.mo36201n1(listK0);
                }
                C18361a c18361a3 = this.seasonsAdapter;
                if (c18361a3 != null) {
                    c18361a3.m77638C1(size >= 7);
                }
                recyclerView2.addItemDecoration(new C25825b(AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(8.0f), AbstractC5776a0.m27313a(8.0f)));
            }
        }
        SearchValuesFragment.INSTANCE.m77957d("", subject != null ? subject.getSubjectId() : null, "", subject != null ? subject.getOps() : null, 0, 4);
    }
}
