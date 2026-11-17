package com.transsion.moviedetail.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.moviedetail.R$string;
import com.transsion.moviedetail.dialog.SubjectEduInfoMoreDetailDialog;
import com.transsion.moviedetail.view.CustomTextViewGroup;
import com.transsion.moviedetail.view.InfoExtendView;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23597e;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p000.AbstractC0000a;
import p550kj.C24655b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m97100d2 = {"Lcom/transsion/moviedetail/dialog/SubjectEduInfoMoreDetailDialog;", "Lcom/transsion/play/detail/fragment/BaseBottomDialogFragment;", "Lgn/e;", "<init>", "()V", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "", "s0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "subject", "r0", "Landroid/view/LayoutInflater;", "inflater", "p0", "(Landroid/view/LayoutInflater;)Lgn/e;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "", "hidden", "onHiddenChanged", "(Z)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", "c", "Ljava/lang/String;", "mSubjectId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubjectEduInfoMoreDetailDialog extends BaseBottomDialogFragment<C23597e> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m70223q0(SubjectEduInfoMoreDetailDialog subjectEduInfoMoreDetailDialog, View view) {
        BaseBottomDialogFragment.m71695m0(subjectEduInfoMoreDetailDialog, false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    private final void m70224r0(Subject subject) {
        InfoExtendView infoExtendView;
        InfoExtendView infoExtendView2;
        InfoExtendView infoExtendView3;
        String description = subject != null ? subject.getDescription() : null;
        if (description == null || description.length() == 0) {
            C23597e c23597e = (C23597e) getMViewBinding();
            if (c23597e == null || (infoExtendView = c23597e.f71927c) == null) {
                return;
            }
            AbstractC26006c.m102054g(infoExtendView);
            return;
        }
        C23597e c23597e2 = (C23597e) getMViewBinding();
        if (c23597e2 != null && (infoExtendView3 = c23597e2.f71927c) != null) {
            infoExtendView3.showData(subject);
        }
        C23597e c23597e3 = (C23597e) getMViewBinding();
        if (c23597e3 == null || (infoExtendView2 = c23597e3.f71927c) == null) {
            return;
        }
        AbstractC26006c.m102058k(infoExtendView2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    private final void m70225s0(Subject movieDetailBean) {
        C23597e c23597e;
        CustomTextViewGroup customTextViewGroup;
        C23597e c23597e2;
        CustomTextViewGroup customTextViewGroup2;
        C23597e c23597e3;
        CustomTextViewGroup customTextViewGroup3;
        C23597e c23597e4;
        CustomTextViewGroup customTextViewGroup4;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        this.mMovieDetailBean = movieDetailBean;
        C23597e c23597e5 = (C23597e) getMViewBinding();
        if (c23597e5 != null && (appCompatTextView = c23597e5.f71935k) != null) {
            appCompatTextView.setText(movieDetailBean.getTitle());
        }
        m70224r0(movieDetailBean);
        int iM71009a = AbstractC16247h.m71009a(movieDetailBean.getSubjectType());
        C23597e c23597e6 = (C23597e) getMViewBinding();
        if (c23597e6 != null && (appCompatImageView = c23597e6.f71928d) != null) {
            appCompatImageView.setImageResource(iM71009a);
        }
        String category = movieDetailBean.getCategory();
        if (category != null && (c23597e4 = (C23597e) getMViewBinding()) != null && (customTextViewGroup4 = c23597e4.f71930f) != null) {
            customTextViewGroup4.setText(category);
        }
        String genre = movieDetailBean.getGenre();
        if (genre != null && (c23597e3 = (C23597e) getMViewBinding()) != null && (customTextViewGroup3 = c23597e3.f71933i) != null) {
            customTextViewGroup3.setText(genre);
        }
        String strM0a = AbstractC0000a.m0a(this.mMovieDetailBean);
        if (strM0a != null && (c23597e2 = (C23597e) getMViewBinding()) != null && (customTextViewGroup2 = c23597e2.f71932h) != null) {
            customTextViewGroup2.setText(strM0a);
        }
        Context context = getContext();
        if (context != null) {
            int i11 = R$string.movie_detail_students;
            Long viewers = movieDetailBean.getViewers();
            String string = context.getString(i11, Long.valueOf(viewers != null ? viewers.longValue() : 0L));
            if (string == null || (c23597e = (C23597e) getMViewBinding()) == null || (customTextViewGroup = c23597e.f71936l) == null) {
                return;
            }
            customTextViewGroup.setText(string);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        C23597e c23597e = (C23597e) getMViewBinding();
        if (c23597e == null || (appCompatImageView = c23597e.f71931g) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: hn.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubjectEduInfoMoreDetailDialog.m70223q0(this.f72955a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        AppCompatTextView appCompatTextView;
        AppCompatImageView appCompatImageView;
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
        Subject subject5 = this.mMovieDetailBean;
        if (subject5 != null) {
            int iM71009a = AbstractC16247h.m71009a(subject5.getSubjectType());
            C23597e c23597e = (C23597e) getMViewBinding();
            if (c23597e != null && (appCompatImageView = c23597e.f71928d) != null) {
                appCompatImageView.setImageResource(iM71009a);
            }
            C23597e c23597e2 = (C23597e) getMViewBinding();
            if (c23597e2 != null && (appCompatTextView = c23597e2.f71935k) != null) {
                appCompatTextView.setText(subject5.getTitle());
            }
            m70225s0(subject5);
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
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C23597e getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23597e c23597eM93362c = C23597e.m93362c(inflater);
        Intrinsics.m97801g(c23597eM93362c, "inflate(...)");
        return c23597eM93362c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
