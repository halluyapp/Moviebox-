package com.transsion.moviedetail.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.Utils;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baselib.helper.C14450a;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$string;
import com.transsion.moviedetail.dialog.SubjectInfoMoreDetailDialog;
import com.transsion.moviedetail.fragment.StarringFragment;
import com.transsion.moviedetail.view.CustomTextViewGroup;
import com.transsion.moviedetail.view.InfoExtendView;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.ninegridview.ImageInfo;
import com.transsion.ninegridview.preview.ImagePreviewActivity;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23608p;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24655b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m97100d2 = {"Lcom/transsion/moviedetail/dialog/SubjectInfoMoreDetailDialog;", "Lcom/transsion/play/detail/fragment/BaseBottomDialogFragment;", "Lgn/p;", "<init>", "()V", "Lcom/transsion/moviedetailapi/bean/Subject;", "subject", "", "u0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "mMovieDetailBean", "v0", "", "releaseDate", "q0", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "r0", "(Landroid/view/LayoutInflater;)Lgn/p;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "retryLoadData", "initListener", "", "hidden", "onHiddenChanged", "(Z)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/moviedetailapi/bean/Subject;", "c", "Ljava/lang/String;", "mSubjectId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubjectInfoMoreDetailDialog extends BaseBottomDialogFragment<C23608p> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: q0 */
    private final String m70229q0(String releaseDate) {
        if (releaseDate.length() < 4) {
            return releaseDate;
        }
        String strSubstring = releaseDate.substring(0, 4);
        Intrinsics.m97801g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m70230s0(SubjectInfoMoreDetailDialog subjectInfoMoreDetailDialog, View view) {
        Cover cover;
        Subject subject = subjectInfoMoreDetailDialog.mMovieDetailBean;
        if (subject == null || (cover = subject.getCover()) == null) {
            return;
        }
        C14450a.f50860a.m65145h("detail_info", "preview", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.bigImageUrl = cover.getUrl();
        imageInfo.thumbnailUrl = cover.getThumbnail();
        Integer height = cover.getHeight();
        imageInfo.imageViewHeight = height != null ? height.intValue() : 0.0f;
        Integer width = cover.getWidth();
        imageInfo.imageViewWidth = width != null ? width.intValue() : 0.0f;
        List listQ = CollectionsKt.m97511q(imageInfo);
        ImagePreviewActivity.Companion companion = ImagePreviewActivity.INSTANCE;
        Context context = view.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        companion.m71396a(context, 0, listQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m70231t0(SubjectInfoMoreDetailDialog subjectInfoMoreDetailDialog, View view) {
        BaseBottomDialogFragment.m71695m0(subjectInfoMoreDetailDialog, false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    private final void m70232u0(Subject subject) {
        InfoExtendView infoExtendView;
        InfoExtendView infoExtendView2;
        InfoExtendView infoExtendView3;
        String description = subject != null ? subject.getDescription() : null;
        if (description == null || description.length() == 0) {
            C23608p c23608p = (C23608p) getMViewBinding();
            if (c23608p == null || (infoExtendView = c23608p.f72018d) == null) {
                return;
            }
            AbstractC26006c.m102054g(infoExtendView);
            return;
        }
        C23608p c23608p2 = (C23608p) getMViewBinding();
        if (c23608p2 != null && (infoExtendView3 = c23608p2.f72018d) != null) {
            infoExtendView3.showData(subject);
        }
        C23608p c23608p3 = (C23608p) getMViewBinding();
        if (c23608p3 == null || (infoExtendView2 = c23608p3.f72018d) == null) {
            return;
        }
        AbstractC26006c.m102058k(infoExtendView2);
    }

    /* JADX INFO: renamed from: v0 */
    private final void m70233v0(Subject mMovieDetailBean) {
        Integer subjectType;
        if (mMovieDetailBean != null && (subjectType = mMovieDetailBean.getSubjectType()) != null) {
            int iIntValue = subjectType.intValue();
            int value = SubjectType.AUDIO.getValue();
            if (iIntValue <= SubjectType.MUSIC.getValue() && value <= iIntValue) {
                return;
            }
        }
        List<Staff> staffList = mMovieDetailBean != null ? mMovieDetailBean.getStaffList() : null;
        if (staffList == null || staffList.isEmpty()) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        abstractC3168wM14557p.m14813s(R$id.fl_starring, new StarringFragment());
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        ShapeableImageView shapeableImageView;
        C23608p c23608p = (C23608p) getMViewBinding();
        if (c23608p != null && (shapeableImageView = c23608p.f72020f) != null) {
            shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: hn.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubjectInfoMoreDetailDialog.m70230s0(this.f72956a, view);
                }
            });
        }
        C23608p c23608p2 = (C23608p) getMViewBinding();
        if (c23608p2 == null || (appCompatImageView = c23608p2.f72024j) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: hn.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubjectInfoMoreDetailDialog.m70231t0(this.f72957a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        AppCompatTextView appCompatTextView;
        CustomTextViewGroup customTextViewGroup;
        C23608p c23608p;
        CustomTextViewGroup customTextViewGroup2;
        C23608p c23608p2;
        CustomTextViewGroup customTextViewGroup3;
        C23608p c23608p3;
        CustomTextViewGroup customTextViewGroup4;
        C23608p c23608p4;
        CustomTextViewGroup customTextViewGroup5;
        CustomTextViewGroup customTextViewGroup6;
        C23608p c23608p5;
        CustomTextViewGroup customTextViewGroup7;
        AppCompatTextView appCompatTextView2;
        AppCompatImageView appCompatImageView;
        View view;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        List listS0;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        AppCompatImageView appCompatImageView2;
        ShapeableImageView shapeableImageView;
        String url;
        String thumbnail;
        Cover cover;
        Cover cover2;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        String subjectId;
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data_key_resource_detectors") : null;
        Subject subject = serializable instanceof Subject ? (Subject) serializable : null;
        this.mMovieDetailBean = subject;
        this.mSubjectId = subject != null ? subject.getSubjectId() : null;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g3 = logViewConfig2.m96844g()) != null) {
            Subject subject2 = this.mMovieDetailBean;
            if (subject2 == null || (subjectId = subject2.getSubjectId()) == null) {
                subjectId = "";
            }
            mapM96844g3.put("subject_id", subjectId);
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g2 = logViewConfig3.m96844g()) != null) {
            Subject subject3 = this.mMovieDetailBean;
            mapM96844g2.put("subject_type", String.valueOf(subject3 != null ? subject3.getSubjectType() : null));
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g = logViewConfig4.m96844g()) != null) {
            Subject subject4 = this.mMovieDetailBean;
            mapM96844g.put("has_resource", String.valueOf(subject4 != null ? subject4.getHasResource() : null));
        }
        C23608p c23608p6 = (C23608p) getMViewBinding();
        if (c23608p6 != null && (shapeableImageView = c23608p6.f72020f) != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(contextRequireContext);
            Subject subject5 = this.mMovieDetailBean;
            if (subject5 == null || (cover2 = subject5.getCover()) == null || (url = cover2.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            Subject subject6 = this.mMovieDetailBean;
            if (subject6 == null || (cover = subject6.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94468g.m94473l(thumbnail).m94465d(shapeableImageView);
        }
        Subject subject7 = this.mMovieDetailBean;
        if (subject7 != null) {
            int iM71009a = AbstractC16247h.m71009a(subject7.getSubjectType());
            C23608p c23608p7 = (C23608p) getMViewBinding();
            if (c23608p7 != null && (appCompatImageView2 = c23608p7.f72019e) != null) {
                appCompatImageView2.setImageResource(iM71009a);
            }
            C23608p c23608p8 = (C23608p) getMViewBinding();
            if (c23608p8 != null && (appCompatTextView7 = c23608p8.f72027m) != null) {
                appCompatTextView7.setText(subject7.getTitle());
            }
            Integer seNum = subject7.getSeNum();
            if (seNum != null) {
                int iIntValue = seNum.intValue();
                if (iIntValue > 1) {
                    Context context = getContext();
                    String string = context != null ? context.getString(R$string.movie_detail_seasons, Integer.valueOf(iIntValue)) : null;
                    C23608p c23608p9 = (C23608p) getMViewBinding();
                    if (c23608p9 != null && (appCompatTextView6 = c23608p9.f72030p) != null) {
                        appCompatTextView6.setText(string != null ? string : "");
                    }
                } else {
                    String subtitles = subject7.getSubtitles();
                    int size = (subtitles == null || (listS0 = StringsKt.m98117S0(subtitles, new String[]{","}, false, 0, 6, null)) == null) ? 0 : listS0.size();
                    if (size > 10) {
                        C23608p c23608p10 = (C23608p) getMViewBinding();
                        if (c23608p10 != null && (appCompatTextView5 = c23608p10.f72030p) != null) {
                            appCompatTextView5.setText(Utils.m27275a().getString(R$string.movie_detail_subtitles_count, "10+"));
                        }
                    } else if (size > 1) {
                        C23608p c23608p11 = (C23608p) getMViewBinding();
                        if (c23608p11 != null && (appCompatTextView4 = c23608p11.f72030p) != null) {
                            appCompatTextView4.setText(Utils.m27275a().getString(R$string.movie_detail_subtitles_count, String.valueOf(size)));
                        }
                    } else {
                        C23608p c23608p12 = (C23608p) getMViewBinding();
                        if (c23608p12 != null && (appCompatTextView3 = c23608p12.f72030p) != null) {
                            AbstractC26006c.m102054g(appCompatTextView3);
                        }
                        C23608p c23608p13 = (C23608p) getMViewBinding();
                        if (c23608p13 != null && (view = c23608p13.f72033s) != null) {
                            AbstractC26006c.m102054g(view);
                        }
                    }
                }
            }
            if (subject7.isMusicType()) {
                C23608p c23608p14 = (C23608p) getMViewBinding();
                if (c23608p14 != null && (appCompatImageView = c23608p14.f72022h) != null) {
                    AbstractC26006c.m102054g(appCompatImageView);
                }
                C23608p c23608p15 = (C23608p) getMViewBinding();
                if (c23608p15 != null && (appCompatTextView2 = c23608p15.f72029o) != null) {
                    AbstractC26006c.m102054g(appCompatTextView2);
                }
                String countryName = subject7.getCountryName();
                if (countryName != null && (c23608p5 = (C23608p) getMViewBinding()) != null && (customTextViewGroup7 = c23608p5.f72025k) != null) {
                    customTextViewGroup7.setText(countryName);
                }
                String genre = subject7.getGenre();
                if (genre != null) {
                    String string2 = StringsKt.m98155n1((String) StringsKt.m98117S0(genre, new String[]{","}, false, 0, 6, null).get(0)).toString();
                    C23608p c23608p16 = (C23608p) getMViewBinding();
                    if (c23608p16 != null && (customTextViewGroup6 = c23608p16.f72032r) != null) {
                        customTextViewGroup6.setText(string2);
                    }
                }
                String releaseDate = subject7.getReleaseDate();
                if (releaseDate != null && (c23608p4 = (C23608p) getMViewBinding()) != null && (customTextViewGroup5 = c23608p4.f72031q) != null) {
                    customTextViewGroup5.setText(m70229q0(releaseDate));
                }
            } else {
                String restrictLevel = subject7.getRestrictLevel();
                if (restrictLevel != null && (c23608p3 = (C23608p) getMViewBinding()) != null && (customTextViewGroup4 = c23608p3.f72028n) != null) {
                    customTextViewGroup4.setText(restrictLevel);
                }
                String releaseDate2 = subject7.getReleaseDate();
                if (releaseDate2 != null && (c23608p2 = (C23608p) getMViewBinding()) != null && (customTextViewGroup3 = c23608p2.f72031q) != null) {
                    customTextViewGroup3.setText(m70229q0(releaseDate2));
                }
                String countryName2 = subject7.getCountryName();
                if (countryName2 != null && (c23608p = (C23608p) getMViewBinding()) != null && (customTextViewGroup2 = c23608p.f72025k) != null) {
                    customTextViewGroup2.setText(countryName2);
                }
                String genre2 = subject7.getGenre();
                if (genre2 != null) {
                    String string3 = StringsKt.m98155n1((String) StringsKt.m98117S0(genre2, new String[]{","}, false, 0, 6, null).get(0)).toString();
                    C23608p c23608p17 = (C23608p) getMViewBinding();
                    if (c23608p17 != null && (customTextViewGroup = c23608p17.f72032r) != null) {
                        customTextViewGroup.setText(string3);
                    }
                }
                C23608p c23608p18 = (C23608p) getMViewBinding();
                if (c23608p18 != null && (appCompatTextView = c23608p18.f72029o) != null) {
                    appCompatTextView.setText(subject7.getImdbRate());
                }
            }
            m70232u0(this.mMovieDetailBean);
            m70233v0(this.mMovieDetailBean);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("detail_info", false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C23608p getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23608p c23608pM93406c = C23608p.m93406c(inflater);
        Intrinsics.m97801g(c23608pM93406c, "inflate(...)");
        return c23608pM93406c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
