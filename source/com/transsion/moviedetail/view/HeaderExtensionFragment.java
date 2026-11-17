package com.transsion.moviedetail.view;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.net.bean.BaseDto;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.AbstractC14558d;
import com.transsion.edcation.CourseManager;
import com.transsion.mbwidget.C15716d;
import com.transsion.moviedetail.R$string;
import com.transsion.moviedetail.p1001enum.SeenStatus;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.DownloadItem;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.pushapi.NoticePermissionFrom;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23615w;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24655b;
import p880wp.C28415e;
import p888wy.C28465b;
import p944yh.C28951b;
import p982zk.AbstractC29190a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010+R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010+R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, m97100d2 = {"Lcom/transsion/moviedetail/view/HeaderExtensionFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgn/w;", "<init>", "()V", "", "x0", "P0", "Lcom/transsion/moviedetailapi/bean/Staff;", "staff", "M0", "(Lcom/transsion/moviedetailapi/bean/Staff;)V", "I0", "", "L0", "()Z", "T0", "", "subjectId", "N0", "(Ljava/lang/String;)V", "", "addStatus", "O0", "(Ljava/lang/Integer;)V", "seeStatus", "S0", "Landroid/view/LayoutInflater;", "inflater", "K0", "(Landroid/view/LayoutInflater;)Lgn/w;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "receiveArguments", "Lcom/transsion/moviedetailapi/bean/Subject;", "a", "Lcom/transsion/moviedetailapi/bean/Subject;", "subject", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "moduleName", "c", "I", "curSeason", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "ops", "e", "pageName", "Lcom/transsion/share/share/ShareDialogFragment;", "f", "Lcom/transsion/share/share/ShareDialogFragment;", "mShareDialog", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "g", "Lkotlin/Lazy;", "J0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class HeaderExtensionFragment extends PageStatusFragment<C23615w> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Subject subject;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ShareDialogFragment mShareDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String pageName = "subjectdetail";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.view.HeaderExtensionFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.view.HeaderExtensionFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: com.transsion.moviedetail.view.HeaderExtensionFragment$a */
    static final class C16148a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54919a;

        C16148a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54919a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54919a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54919a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.view.HeaderExtensionFragment$b */
    public static final class C16150b implements InterfaceC18701a {
        C16150b() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
            InterfaceC18701a.a.m78648b(this, str);
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: c */
        public void mo70523c(String url, String fileName, String fileSize, String fileImage) {
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(fileName, "fileName");
            Intrinsics.m97802h(fileSize, "fileSize");
            Intrinsics.m97802h(fileImage, "fileImage");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: d */
        public void mo70524d(String id2) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: e */
        public void mo70525e(String str) {
            InterfaceC18701a.a.m78649c(this, str);
            C15716d.m69632s(C15716d.f54081a, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final Unit m70781A0(HeaderExtensionFragment headerExtensionFragment, BaseDto baseDto) {
        String subjectId;
        String subjectId2;
        Long wantToSeeCount;
        if (baseDto != null && Intrinsics.m97797c(baseDto.getCode(), "0")) {
            Subject subject = headerExtensionFragment.subject;
            long jLongValue = (subject == null || (wantToSeeCount = subject.getWantToSeeCount()) == null) ? 0L : wantToSeeCount.longValue();
            if (headerExtensionFragment.m70791L0()) {
                Subject subject2 = headerExtensionFragment.subject;
                if (subject2 != null) {
                    subject2.setSeenStatus(Integer.valueOf(SeenStatus.NOT_SEEN.ordinal()));
                }
                headerExtensionFragment.m70798S0(Integer.valueOf(SeenStatus.NOT_SEEN.ordinal()));
                Subject subject3 = headerExtensionFragment.subject;
                if (subject3 != null) {
                    subject3.setWantToSeeCount(Long.valueOf(jLongValue - 1));
                }
                Subject subject4 = headerExtensionFragment.subject;
                if (subject4 != null && (subjectId2 = subject4.getSubjectId()) != null) {
                    C28465b.f87467a.m109954a().m109953i(0, subjectId2);
                }
            } else {
                C15716d.m69632s(C15716d.f54081a, null, 1, null);
                Subject subject5 = headerExtensionFragment.subject;
                if (subject5 != null) {
                    subject5.setSeenStatus(Integer.valueOf(SeenStatus.WANT_TO_SEE.ordinal()));
                }
                headerExtensionFragment.m70798S0(Integer.valueOf(SeenStatus.WANT_TO_SEE.ordinal()));
                Subject subject6 = headerExtensionFragment.subject;
                if (subject6 != null) {
                    subject6.setWantToSeeCount(Long.valueOf(jLongValue + 1));
                }
                Subject subject7 = headerExtensionFragment.subject;
                if (subject7 != null && (subjectId = subject7.getSubjectId()) != null) {
                    C28465b.f87467a.m109954a().m109953i(1, subjectId);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m70782B0(final HeaderExtensionFragment headerExtensionFragment, View view) {
        AbstractC14558d.m65673b(0L, new Function0() { // from class: com.transsion.moviedetail.view.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HeaderExtensionFragment.m70783C0(this.f54948a);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m70783C0(HeaderExtensionFragment headerExtensionFragment) {
        CourseManager.m66444u(CourseManager.f51684a, headerExtensionFragment.subject, null, 2, null);
        AbstractC29190a.m112005b(headerExtensionFragment.subject, headerExtensionFragment.pageName, "opt_detail_addcourse");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m70784D0(final HeaderExtensionFragment headerExtensionFragment, View view) {
        AbstractC14558d.m65673b(0L, new Function0() { // from class: com.transsion.moviedetail.view.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HeaderExtensionFragment.m70785E0(this.f54947a);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final Unit m70785E0(HeaderExtensionFragment headerExtensionFragment) {
        headerExtensionFragment.m70799T0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m70786F0(HeaderExtensionFragment headerExtensionFragment, View view) {
        ResourceDetectors resourceDetector;
        List<DownloadItem> resolutionList;
        Subject subject;
        ResourceDetectors resourceDetector2;
        ResourceDetectors resourceDetector3;
        List<DownloadItem> resolutionList2;
        Subject subject2 = headerExtensionFragment.subject;
        if (subject2 != null && (resourceDetector = subject2.getResourceDetector()) != null && (resolutionList = resourceDetector.getResolutionList()) != null && (!resolutionList.isEmpty())) {
            Subject subject3 = headerExtensionFragment.subject;
            Integer numValueOf = (subject3 == null || (resourceDetector3 = subject3.getResourceDetector()) == null || (resolutionList2 = resourceDetector3.getResolutionList()) == null) ? null : Integer.valueOf(resolutionList2.size());
            Intrinsics.m97799e(numValueOf);
            if (numValueOf.intValue() > 1 && (subject = headerExtensionFragment.subject) != null && (resourceDetector2 = subject.getResourceDetector()) != null) {
                resourceDetector2.setType(1);
            }
        }
        headerExtensionFragment.m70789I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m70787G0(HeaderExtensionFragment headerExtensionFragment, View view) {
        C14450a c14450a = C14450a.f50860a;
        String str = headerExtensionFragment.pageName;
        Subject subject = headerExtensionFragment.subject;
        c14450a.m65145h(str, "view_download", "", subject != null ? subject.getSubjectId() : null, null, headerExtensionFragment.ops);
        Navigator.m61845x(TheRouter.m61773c("/download/panel_activity").m61852F("extra_page_index", 0), headerExtensionFragment.requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m70788H0(HeaderExtensionFragment headerExtensionFragment, Integer num) {
        Intrinsics.m97799e(num);
        headerExtensionFragment.curSeason = num.intValue();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: I0 */
    private final void m70789I0() {
        String str;
        boolean z11;
        List<ResourceDetectors> resourceDetectors;
        String resourceLink;
        if (getContext() == null) {
            return;
        }
        Subject subject = this.subject;
        String str2 = "";
        if (subject == null || (resourceDetectors = subject.getResourceDetectors()) == null) {
            str = "";
            z11 = false;
        } else {
            if (resourceDetectors.isEmpty()) {
                resourceLink = "";
            } else {
                resourceLink = resourceDetectors.get(0).getResourceLink();
                if (resourceLink == null) {
                    resourceLink = "";
                }
                String resourceId = resourceDetectors.get(0).getResourceId();
                str2 = resourceId != null ? resourceId : "";
                if (resourceDetectors.get(0).isMultiResolution()) {
                    z11 = true;
                }
                str = resourceLink;
            }
            z11 = false;
            str = resourceLink;
        }
        DownloadManagerApi.C21276a c21276a = DownloadManagerApi.f66480j;
        DownloadManagerApi downloadManagerApiM87093a = c21276a.m87093a();
        Subject subject2 = this.subject;
        String subjectId = subject2 != null ? subject2.getSubjectId() : null;
        Subject subject3 = this.subject;
        downloadManagerApiM87093a.m87091w0(subjectId, str2, subject3 != null && subject3.isSeries(), z11);
        Subject subject4 = this.subject;
        if (subject4 != null) {
            Integer subjectType = subject4.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                DownloadManagerApi downloadManagerApiM87093a2 = c21276a.m87093a();
                Context context = getContext();
                Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                String str3 = this.pageName;
                Subject subject5 = this.subject;
                downloadManagerApiM87093a2.m87086d0(fragmentActivity, str3, (384 & 4) != 0 ? "" : "", subject5 != null ? subject5.getOps() : null, (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : true, (384 & 64) != 0 ? null : this.subject, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                return;
            }
        }
        DownloadManagerApi downloadManagerApiM87093a3 = c21276a.m87093a();
        Context context2 = getContext();
        Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        DownloadManagerApi.m87025N(downloadManagerApiM87093a3, (FragmentActivity) context2, this.subject, this.pageName, "", "", str, null, this.moduleName, null, false, this.curSeason, false, 832, null);
    }

    /* JADX INFO: renamed from: J0 */
    private final MovieDetailViewModel m70790J0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: L0 */
    private final boolean m70791L0() {
        Subject subject = this.subject;
        if (subject == null) {
            return false;
        }
        Integer seenStatus = subject.getSeenStatus();
        return seenStatus != null && seenStatus.intValue() == SeenStatus.WANT_TO_SEE.ordinal();
    }

    /* JADX INFO: renamed from: M0 */
    private final void m70792M0(Staff staff) {
        Navigator.m61845x(TheRouter.m61773c("/movie/staff").m61856J("staff", staff), requireContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: N0 */
    private final void m70793N0(String subjectId) {
        ShareDialogFragment shareDialogFragment;
        Subject subject = this.subject;
        if (subject == null) {
            return;
        }
        C14450a.f50860a.m65145h(this.pageName, "share", (60 & 4) != 0 ? "" : "", (60 & 8) != 0 ? "" : subject != null ? subject.getSubjectId() : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : this.ops);
        if (this.mShareDialog == null) {
            ShareDialogFragment.Companion companion = ShareDialogFragment.INSTANCE;
            PostType postType = PostType.SUBJECT_TYPE;
            String value = ReportType.SUBJECT.getValue();
            Subject subject2 = this.subject;
            String title = subject2 != null ? subject2.getTitle() : null;
            Subject subject3 = this.subject;
            ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, subjectId, "", value, (3328 & 16) != 0 ? "" : title, (3328 & 32) != 0 ? "" : String.valueOf(subject3 != null ? subject3.getImdbRate() : null), (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : false, (3328 & 256) != 0 ? false : false, this.pageName, (3328 & 1024) != 0 ? "" : null, (3328 & 2048) != 0 ? "" : null);
            this.mShareDialog = shareDialogFragmentM78645a;
            if (shareDialogFragmentM78645a != null) {
                shareDialogFragmentM78645a.m78642G0(new C16150b());
            }
        }
        try {
            if (isAdded()) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.m14537g0();
                ShareDialogFragment shareDialogFragment2 = this.mShareDialog;
                if ((shareDialogFragment2 == null || !shareDialogFragment2.isAdded()) && childFragmentManager.m14547k0("share") == null && (shareDialogFragment = this.mShareDialog) != null) {
                    shareDialogFragment.show(childFragmentManager, "share");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public final void m70794O0(Integer addStatus) {
        AppCompatTextView appCompatTextView;
        C23615w mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatTextView = mViewBinding.f72107c) == null) {
            return;
        }
        appCompatTextView.setSelected(addStatus != null && SeenStatus.WANT_TO_SEE.ordinal() == addStatus.intValue());
    }

    /* JADX INFO: renamed from: P0 */
    private final void m70795P0() {
        List<Staff> staffList;
        ConstraintLayout constraintLayout;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        Subject subject = this.subject;
        if (subject == null || (staffList = subject.getStaffList()) == null) {
            return;
        }
        if (staffList.isEmpty()) {
            C23615w mViewBinding = getMViewBinding();
            if (mViewBinding == null || (constraintLayout = mViewBinding.f72111g) == null) {
                return;
            }
            AbstractC26006c.m102054g(constraintLayout);
            return;
        }
        final Staff staff = staffList.get(0);
        if (TextUtils.isEmpty(staff.getAvatarUrl())) {
            C23615w mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (constraintLayout3 = mViewBinding2.f72111g) == null) {
                return;
            }
            AbstractC26006c.m102054g(constraintLayout3);
            return;
        }
        C23615w mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (constraintLayout2 = mViewBinding3.f72111g) != null) {
            AbstractC26006c.m102058k(constraintLayout2);
        }
        C23615w mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (shapeableImageView2 = mViewBinding4.f72106b) != null) {
            C23860f.a aVar = C23860f.f72909a;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            C23860f.b bVarM94457m = aVar.m94457m(fragmentActivityRequireActivity);
            String avatarUrl = staff.getAvatarUrl();
            if (avatarUrl == null) {
                avatarUrl = "";
            }
            bVarM94457m.m94468g(avatarUrl).m94465d(shapeableImageView2);
        }
        C23615w mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (shapeableImageView = mViewBinding5.f72106b) != null) {
            shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.view.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HeaderExtensionFragment.m70796Q0(this.f54936a, staff, view);
                }
            });
        }
        C23615w mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (appCompatTextView2 = mViewBinding6.f72108d) != null) {
            appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.view.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HeaderExtensionFragment.m70797R0(this.f54938a, staff, view);
                }
            });
        }
        C23615w mViewBinding7 = getMViewBinding();
        if (mViewBinding7 == null || (appCompatTextView = mViewBinding7.f72108d) == null) {
            return;
        }
        appCompatTextView.setText(staff.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m70796Q0(HeaderExtensionFragment headerExtensionFragment, Staff staff, View view) {
        headerExtensionFragment.m70792M0(staff);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final void m70797R0(HeaderExtensionFragment headerExtensionFragment, Staff staff, View view) {
        headerExtensionFragment.m70792M0(staff);
    }

    /* JADX INFO: renamed from: S0 */
    private final void m70798S0(Integer seeStatus) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        int iOrdinal = SeenStatus.WANT_TO_SEE.ordinal();
        if (seeStatus != null && seeStatus.intValue() == iOrdinal) {
            C23615w mViewBinding = getMViewBinding();
            if (mViewBinding != null && (appCompatTextView4 = mViewBinding.f72112h) != null) {
                appCompatTextView4.setSelected(true);
            }
            C23615w mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (appCompatTextView3 = mViewBinding2.f72112h) == null) {
                return;
            }
            Context context = getContext();
            appCompatTextView3.setText(context != null ? context.getString(R$string.movie_detail_added) : null);
            return;
        }
        C23615w mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (appCompatTextView2 = mViewBinding3.f72112h) != null) {
            appCompatTextView2.setSelected(false);
        }
        C23615w mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (appCompatTextView = mViewBinding4.f72112h) == null) {
            return;
        }
        Context context2 = getContext();
        appCompatTextView.setText(context2 != null ? context2.getString(R$string.movie_detail_add_to_list) : null);
    }

    /* JADX INFO: renamed from: T0 */
    private final void m70799T0() {
        String subjectId;
        Subject subject = this.subject;
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            return;
        }
        if (m70791L0()) {
            m70790J0().m70920d0(subjectId, 0);
            C28951b.f88586a.m111454d(R$string.movie_detail_favorite_cancel_toast);
            C14450a.f50860a.m65145h(this.pageName, "want_to_see_cancel ", (60 & 4) != 0 ? "" : "", (60 & 8) != 0 ? "" : subjectId, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : this.ops);
        } else {
            m70790J0().m70920d0(subjectId, 1);
            C28951b.f88586a.m111454d(R$string.movie_detail_favorite_open_toast);
            C14450a.f50860a.m65145h(this.pageName, "want_to_see", (60 & 4) != 0 ? "" : "", (60 & 8) != 0 ? "" : subjectId, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : this.ops);
            C28415e.f87132a.m109794e(this, NoticePermissionFrom.WANT_TO_SEE);
        }
    }

    /* JADX INFO: renamed from: x0 */
    private final void m70814x0() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        AppCompatTextView appCompatTextView8;
        AppCompatTextView appCompatTextView9;
        AppCompatTextView appCompatTextView10;
        C23615w mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatTextView10 = mViewBinding.f72113i) != null) {
            appCompatTextView10.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.view.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HeaderExtensionFragment.m70815y0(this.f54935a, view);
                }
            });
        }
        Subject subject = this.subject;
        if (subject == null || !subject.isEduType()) {
            Subject subject2 = this.subject;
            if (subject2 == null || !subject2.isMusicType()) {
                C23615w mViewBinding2 = getMViewBinding();
                if (mViewBinding2 != null && (appCompatTextView = mViewBinding2.f72112h) != null) {
                    appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.view.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            HeaderExtensionFragment.m70784D0(this.f54941a, view);
                        }
                    });
                }
                Subject subject3 = this.subject;
                m70798S0(subject3 != null ? subject3.getSeenStatus() : null);
            } else {
                C23615w mViewBinding3 = getMViewBinding();
                if (mViewBinding3 != null && (appCompatTextView3 = mViewBinding3.f72107c) != null) {
                    AbstractC26006c.m102054g(appCompatTextView3);
                }
                C23615w mViewBinding4 = getMViewBinding();
                if (mViewBinding4 != null && (appCompatTextView2 = mViewBinding4.f72112h) != null) {
                    AbstractC26006c.m102054g(appCompatTextView2);
                }
                m70795P0();
            }
        } else {
            C23615w mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (appCompatTextView9 = mViewBinding5.f72107c) != null) {
                appCompatTextView9.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.view.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HeaderExtensionFragment.m70782B0(this.f54940a, view);
                    }
                });
            }
            AbstractC29190a.m112004a(this.subject, this.pageName, "opt_detail_addcourse");
            C23615w mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (appCompatTextView8 = mViewBinding6.f72107c) != null) {
                AbstractC26006c.m102058k(appCompatTextView8);
            }
            C23615w mViewBinding7 = getMViewBinding();
            if (mViewBinding7 != null && (appCompatTextView7 = mViewBinding7.f72112h) != null) {
                AbstractC26006c.m102054g(appCompatTextView7);
            }
            Subject subject4 = this.subject;
            m70794O0(subject4 != null ? subject4.getSeenStatus() : null);
        }
        C23615w mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (appCompatTextView6 = mViewBinding8.f72109e) != null) {
            Subject subject5 = this.subject;
            appCompatTextView6.setVisibility(subject5 != null ? Intrinsics.m97797c(subject5.getHasResource(), Boolean.TRUE) : false ? 0 : 8);
        }
        C23615w mViewBinding9 = getMViewBinding();
        if (mViewBinding9 != null && (appCompatTextView5 = mViewBinding9.f72109e) != null) {
            appCompatTextView5.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.view.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HeaderExtensionFragment.m70786F0(this.f54942a, view);
                }
            });
        }
        C23615w mViewBinding10 = getMViewBinding();
        if (mViewBinding10 != null && (appCompatTextView4 = mViewBinding10.f72110f) != null) {
            appCompatTextView4.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.view.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HeaderExtensionFragment.m70787G0(this.f54943a, view);
                }
            });
        }
        m70790J0().m70914K().m14851j(this, new C16148a(new Function1() { // from class: com.transsion.moviedetail.view.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeaderExtensionFragment.m70788H0(this.f54944a, (Integer) obj);
            }
        }));
        m70790J0().m70910F().m14851j(this, new C16148a(new Function1() { // from class: com.transsion.moviedetail.view.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeaderExtensionFragment.m70816z0(this.f54945a, (Pair) obj);
            }
        }));
        m70790J0().m70917Q().m14851j(this, new C16148a(new Function1() { // from class: com.transsion.moviedetail.view.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeaderExtensionFragment.m70781A0(this.f54946a, (BaseDto) obj);
            }
        }));
        Subject subject6 = this.subject;
        if (subject6 == null || !subject6.isEduType()) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new HeaderExtensionFragment$addListeners$9(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m70815y0(HeaderExtensionFragment headerExtensionFragment, View view) {
        String subjectId;
        C26866a.a.m104899g(C26866a.f81698a, "HeaderExtensionFragment click -- share", false, 2, null);
        Subject subject = headerExtensionFragment.subject;
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            return;
        }
        headerExtensionFragment.m70793N0(subjectId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final Unit m70816z0(HeaderExtensionFragment headerExtensionFragment, Pair pair) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        Subject subject = (Subject) pair.getSecond();
        C26866a.f81698a.m104912c(PageStatusFragment.TAG, "get movie detail data==" + pair, true);
        if (subject != null) {
            headerExtensionFragment.subject = subject;
            C24655b logViewConfig = headerExtensionFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            C24655b logViewConfig2 = headerExtensionFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96851n(headerExtensionFragment.ops);
            }
            C24655b logViewConfig3 = headerExtensionFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g2 = logViewConfig3.m96844g()) != null) {
                String subjectId = subject.getSubjectId();
                if (subjectId == null) {
                    subjectId = "";
                }
                mapM96844g2.put("subject_id", subjectId);
            }
            C24655b logViewConfig4 = headerExtensionFragment.getLogViewConfig();
            if (logViewConfig4 != null && (mapM96844g = logViewConfig4.m96844g()) != null) {
                mapM96844g.put("has_resource", String.valueOf(subject.getHasResource()));
            }
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public C23615w getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23615w c23615wM93434c = C23615w.m93434c(inflater);
        Intrinsics.m97801g(c23615wM93434c, "inflate(...)");
        return c23615wM93434c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        m70814x0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        Subject subject = this.subject;
        m70798S0(subject != null ? subject.getSeenStatus() : null);
        Subject subject2 = this.subject;
        m70794O0(subject2 != null ? subject2.getSeenStatus() : null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        String string;
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data_key_resource_detectors") : null;
        this.subject = serializable instanceof Subject ? (Subject) serializable : null;
        Bundle arguments2 = getArguments();
        this.moduleName = arguments2 != null ? arguments2.getString("module_name") : null;
        Bundle arguments3 = getArguments();
        this.curSeason = arguments3 != null ? arguments3.getInt("season") : 1;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string = arguments4.getString(WebConstants.PAGE_FROM)) == null) {
            string = "subjectdetail";
        }
        this.pageName = string;
        Bundle arguments5 = getArguments();
        this.ops = arguments5 != null ? arguments5.getString("ops") : null;
        if (this.curSeason <= 0) {
            this.curSeason = 1;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
