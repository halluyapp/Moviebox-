package com.transsion.moviedetail.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.moviedetail.dialog.SubjectMusicInfoMoreDetailDialog;
import com.transsion.moviedetail.view.InfoExtendView;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23601i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p424g.AbstractC23455a;
import p462hj.C23860f;
import p550kj.C24655b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m97100d2 = {"Lcom/transsion/moviedetail/dialog/SubjectMusicInfoMoreDetailDialog;", "Lcom/transsion/play/detail/fragment/BaseBottomDialogFragment;", "Lgn/i;", "<init>", "()V", "Lcom/transsion/moviedetailapi/bean/Subject;", "subject", "", "u0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "movieDetailBean", "v0", "Lcom/transsion/moviedetailapi/bean/Staff;", "staff", "t0", "(Lcom/transsion/moviedetailapi/bean/Staff;)V", "Landroid/view/LayoutInflater;", "inflater", "r0", "(Landroid/view/LayoutInflater;)Lgn/i;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "", "hidden", "onHiddenChanged", "(Z)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", "c", "Ljava/lang/String;", "mSubjectId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SubjectMusicInfoMoreDetailDialog extends BaseBottomDialogFragment<C23601i> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m70238s0(SubjectMusicInfoMoreDetailDialog subjectMusicInfoMoreDetailDialog, View view) {
        BaseBottomDialogFragment.m71695m0(subjectMusicInfoMoreDetailDialog, false, 1, null);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m70239t0(Staff staff) {
        Navigator navigatorM61856J = TheRouter.m61773c("/movie/staff").m61856J("staff", staff);
        Context context = getContext();
        if (context == null) {
            return;
        }
        Navigator.m61845x(navigatorM61856J, context, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    private final void m70240u0(Subject subject) {
        InfoExtendView infoExtendView;
        InfoExtendView infoExtendView2;
        InfoExtendView infoExtendView3;
        String description = subject != null ? subject.getDescription() : null;
        if (description == null || description.length() == 0) {
            C23601i c23601i = (C23601i) getMViewBinding();
            if (c23601i == null || (infoExtendView = c23601i.f71962b) == null) {
                return;
            }
            AbstractC26006c.m102054g(infoExtendView);
            return;
        }
        C23601i c23601i2 = (C23601i) getMViewBinding();
        if (c23601i2 != null && (infoExtendView3 = c23601i2.f71962b) != null) {
            infoExtendView3.showData(subject);
        }
        C23601i c23601i3 = (C23601i) getMViewBinding();
        if (c23601i3 == null || (infoExtendView2 = c23601i3.f71962b) == null) {
            return;
        }
        AbstractC26006c.m102058k(infoExtendView2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    private final void m70241v0(Subject movieDetailBean) {
        this.mMovieDetailBean = movieDetailBean;
        m70240u0(movieDetailBean);
        C23601i c23601i = (C23601i) getMViewBinding();
        if (c23601i != null) {
            c23601i.f71967g.setText(movieDetailBean.getTitle());
            AbstractC16247h.m71009a(movieDetailBean.getSubjectType());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) " | ");
            if (!TextUtils.isEmpty(movieDetailBean.getCountryName())) {
                spannableStringBuilder.append((CharSequence) movieDetailBean.getCountryName());
            }
            if (!TextUtils.isEmpty(movieDetailBean.getGenre())) {
                if (spannableStringBuilder.length() > 2) {
                    spannableStringBuilder.append((CharSequence) " | ");
                }
                spannableStringBuilder.append((CharSequence) movieDetailBean.getGenre());
            }
            if (!TextUtils.isEmpty(movieDetailBean.getReleaseDate())) {
                if (spannableStringBuilder.length() > 2) {
                    spannableStringBuilder.append((CharSequence) " | ");
                }
                String releaseDate = movieDetailBean.getReleaseDate();
                spannableStringBuilder.append((CharSequence) (releaseDate != null ? StringsKt.m98249y1(releaseDate, 4) : null));
            }
            Integer durationSeconds = movieDetailBean.getDurationSeconds();
            if ((durationSeconds != null ? durationSeconds.intValue() : 0) > 0) {
                spannableStringBuilder.append((CharSequence) " | ");
                Integer durationSeconds2 = movieDetailBean.getDurationSeconds();
                spannableStringBuilder.append((CharSequence) TimeUtilKt.m65663o(((long) (durationSeconds2 != null ? durationSeconds2.intValue() : 0)) * 1000));
            }
            c23601i.f71969i.setText(spannableStringBuilder);
            List<Staff> staffList = movieDetailBean.getStaffList();
            if (staffList != null) {
                if (staffList.isEmpty()) {
                    c23601i.f71963c.setVisibility(8);
                    c23601i.f71965e.setVisibility(8);
                    return;
                }
                final Staff staff = staffList.get(0);
                if (TextUtils.isEmpty(staff.getAvatarUrl())) {
                    c23601i.f71963c.setVisibility(8);
                    c23601i.f71965e.setVisibility(8);
                    return;
                }
                C23860f.a aVar = C23860f.f72909a;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
                C23860f.b bVarM94457m = aVar.m94457m(fragmentActivityRequireActivity);
                String avatarUrl = staff.getAvatarUrl();
                if (avatarUrl == null) {
                    avatarUrl = "";
                }
                C23860f.b bVarM94468g = bVarM94457m.m94468g(avatarUrl);
                ShapeableImageView ivAvatar = c23601i.f71963c;
                Intrinsics.m97801g(ivAvatar, "ivAvatar");
                bVarM94468g.m94465d(ivAvatar);
                c23601i.f71963c.setOnClickListener(new View.OnClickListener() { // from class: hn.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SubjectMusicInfoMoreDetailDialog.m70242w0(this.f72959a, staff, view);
                    }
                });
                c23601i.f71965e.setOnClickListener(new View.OnClickListener() { // from class: hn.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SubjectMusicInfoMoreDetailDialog.m70243x0(this.f72961a, staff, view);
                    }
                });
                c23601i.f71965e.setText(staff.getName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m70242w0(SubjectMusicInfoMoreDetailDialog subjectMusicInfoMoreDetailDialog, Staff staff, View view) {
        subjectMusicInfoMoreDetailDialog.m70239t0(staff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m70243x0(SubjectMusicInfoMoreDetailDialog subjectMusicInfoMoreDetailDialog, Staff staff, View view) {
        subjectMusicInfoMoreDetailDialog.m70239t0(staff);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        C23601i c23601i = (C23601i) getMViewBinding();
        if (c23601i == null || (appCompatImageView = c23601i.f71964d) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: hn.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubjectMusicInfoMoreDetailDialog.m70238s0(this.f72958a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
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
        C23601i c23601i = (C23601i) getMViewBinding();
        if (c23601i != null && (appCompatTextView2 = c23601i.f71969i) != null) {
            Context context = getContext();
            appCompatTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(context != null ? AbstractC23455a.m93074b(context, R$drawable.ic_tag_music) : null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        Subject subject5 = this.mMovieDetailBean;
        if (subject5 != null) {
            AbstractC16247h.m71009a(subject5.getSubjectType());
            C23601i c23601i2 = (C23601i) getMViewBinding();
            if (c23601i2 != null && (appCompatTextView = c23601i2.f71967g) != null) {
                appCompatTextView.setText(subject5.getTitle());
            }
            m70241v0(subject5);
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
    public C23601i getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23601i c23601iM93378c = C23601i.m93378c(inflater);
        Intrinsics.m97801g(c23601iM93378c, "inflate(...)");
        return c23601iM93378c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
