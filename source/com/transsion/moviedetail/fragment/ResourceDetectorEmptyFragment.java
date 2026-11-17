package com.transsion.moviedetail.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.R$string;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.widget.DrawableCenterTextView;
import com.transsion.baseui.widget.ResourcesRequestView;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.publish.model.PostEntity;
import com.transsion.pushapi.NoticePermissionFrom;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23603k;
import java.io.Serializable;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p743rh.C27287m;
import p880wp.C28415e;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/ResourceDetectorEmptyFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgn/k;", "<init>", "()V", "", "v0", "receiveArguments", "", "isMonitorNetworkState", "()Z", "isAudioShowNoNetworkLayout", "Landroid/view/LayoutInflater;", "inflater", "p0", "(Landroid/view/LayoutInflater;)Lgn/k;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lcom/transsion/moviedetailapi/bean/Subject;", "a", "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "o0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "", "c", "Ljava/lang/Integer;", "count", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ResourceDetectorEmptyFragment extends PageStatusFragment<C23603k> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.fragment.ResourceDetectorEmptyFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.fragment.ResourceDetectorEmptyFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Integer count;

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.ResourceDetectorEmptyFragment$b */
    static final class C15959b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54579a;

        C15959b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54579a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54579a;
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
            this.f54579a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final MovieDetailViewModel m70391o0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m70392q0(ResourceDetectorEmptyFragment resourceDetectorEmptyFragment, View view) {
        List<ResourceDetectors> resourceDetectors;
        String title;
        Subject subject = resourceDetectorEmptyFragment.mMovieDetailBean;
        if (subject == null || (resourceDetectors = subject.getResourceDetectors()) == null || resourceDetectors.isEmpty()) {
            return;
        }
        ResourceDetectors resourceDetectors2 = resourceDetectors.get(0);
        ResourceDetectorDialogFragment.Companion companion = ResourceDetectorDialogFragment.INSTANCE;
        Subject subject2 = resourceDetectorEmptyFragment.mMovieDetailBean;
        if (subject2 == null || (title = subject2.getTitle()) == null) {
            title = "";
        }
        ResourceDetectorDialogFragment resourceDetectorDialogFragmentM70385a = companion.m70385a(title, resourceDetectors2);
        FragmentManager childFragmentManager = resourceDetectorEmptyFragment.getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        resourceDetectorDialogFragmentM70385a.show(childFragmentManager, "ResourceDetectorEmptyFragment --> ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m70393r0(ResourceDetectorEmptyFragment resourceDetectorEmptyFragment, View view) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_DETAIL");
        Subject subject = resourceDetectorEmptyFragment.mMovieDetailBean;
        Navigator.m61845x(navigatorM61857K.m61857K("subject_id", subject != null ? subject.getSubjectId() : null), resourceDetectorEmptyFragment.requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m70394s0(ResourceDetectorEmptyFragment resourceDetectorEmptyFragment, View view) {
        C28415e.f87132a.m109794e(resourceDetectorEmptyFragment, NoticePermissionFrom.DETAIL_NO_RES);
        resourceDetectorEmptyFragment.m70397v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m70395t0(ResourceDetectorEmptyFragment resourceDetectorEmptyFragment, View view) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_DETAIL");
        Subject subject = resourceDetectorEmptyFragment.mMovieDetailBean;
        Navigator.m61845x(navigatorM61857K.m61857K("subject_id", subject != null ? subject.getSubjectId() : null), resourceDetectorEmptyFragment.requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m70396u0(ResourceDetectorEmptyFragment resourceDetectorEmptyFragment, PostEntity postEntity) {
        int count;
        ResourcesRequestView resourcesRequestView;
        if (postEntity == null || !postEntity.getSuccess()) {
            C26866a.a.m104899g(C26866a.f81698a, "Submission fail", false, 2, null);
        } else {
            C26866a.a.m104899g(C26866a.f81698a, "Post request succeed " + postEntity, false, 2, null);
            if (resourceDetectorEmptyFragment.count == null) {
                if (postEntity == null || (count = postEntity.getCount()) == null) {
                    count = 0;
                }
                resourceDetectorEmptyFragment.count = count;
                C23603k mViewBinding = resourceDetectorEmptyFragment.getMViewBinding();
                if (mViewBinding != null && (resourcesRequestView = mViewBinding.f71987e) != null) {
                    Integer num = resourceDetectorEmptyFragment.count;
                    resourcesRequestView.setCount(num != null ? num.intValue() : 0, false);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: v0 */
    private final void m70397v0() {
        ResourcesRequestView resourcesRequestView;
        if (!C27287m.f83003a.m106330e()) {
            C13806h c13806h = C13806h.f49015a;
            c13806h.m62319f(16, 0, -AbstractC5776a0.m27313a(20.0f));
            c13806h.m62325l(getString(R$string.base_network_fail));
            return;
        }
        if (C14557c.f51100a.m65671a(R$id.id_request_request, 500L)) {
            return;
        }
        MovieDetailViewModel movieDetailViewModelM70391o0 = m70391o0();
        Subject subject = this.mMovieDetailBean;
        MovieDetailViewModel.m70882W(movieDetailViewModelM70391o0, subject != null ? subject.getSubjectId() : null, false, 2, null);
        Integer num = this.count;
        if (num != null) {
            Intrinsics.m97799e(num);
            this.count = Integer.valueOf(num.intValue() + 1);
            C23603k mViewBinding = getMViewBinding();
            if (mViewBinding == null || (resourcesRequestView = mViewBinding.f71987e) == null) {
                return;
            }
            Integer num2 = this.count;
            Intrinsics.m97799e(num2);
            ResourcesRequestView.setCount$default(resourcesRequestView, num2.intValue(), false, 2, null);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        ResourcesRequestView resourcesRequestView;
        DrawableCenterTextView ivCenterView;
        AppCompatImageView appCompatImageView2;
        AppCompatTextView appCompatTextView;
        C23603k mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatTextView = mViewBinding.f71985c) != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResourceDetectorEmptyFragment.m70392q0(this.f54703a, view);
                }
            });
        }
        C23603k mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView2 = mViewBinding2.f71984b) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResourceDetectorEmptyFragment.m70393r0(this.f54706a, view);
                }
            });
        }
        C23603k mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (resourcesRequestView = mViewBinding3.f71987e) != null && (ivCenterView = resourcesRequestView.getIvCenterView()) != null) {
            ivCenterView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ResourceDetectorEmptyFragment.m70394s0(this.f54709a, view);
                }
            });
        }
        C23603k mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (appCompatImageView = mViewBinding4.f71984b) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResourceDetectorEmptyFragment.m70395t0(this.f54716a, view);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        ResourcesRequestView resourcesRequestView;
        List<ResourceDetectors> resourceDetectors;
        AppCompatTextView appCompatTextView;
        Subject subject = this.mMovieDetailBean;
        if (subject != null && (resourceDetectors = subject.getResourceDetectors()) != null && !resourceDetectors.isEmpty()) {
            String string = getString(com.transsion.moviedetail.R$string.movie_detail_source, resourceDetectors.get(0).getSource());
            Intrinsics.m97801g(string, "getString(...)");
            C23603k mViewBinding = getMViewBinding();
            if (mViewBinding != null && (appCompatTextView = mViewBinding.f71985c) != null) {
                appCompatTextView.setText(string);
            }
        }
        C23603k mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (resourcesRequestView = mViewBinding2.f71987e) != null) {
            String string2 = getString(com.transsion.moviedetail.R$string.movie_detail_coming_soon);
            Intrinsics.m97801g(string2, "getString(...)");
            resourcesRequestView.set(string2);
        }
        MovieDetailViewModel movieDetailViewModelM70391o0 = m70391o0();
        Subject subject2 = this.mMovieDetailBean;
        movieDetailViewModelM70391o0.m70919V(subject2 != null ? subject2.getSubjectId() : null, true);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m70391o0().m70911H().m14851j(this, new C15959b(new Function1() { // from class: com.transsion.moviedetail.fragment.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResourceDetectorEmptyFragment.m70396u0(this.f54700a, (PostEntity) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C23603k getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23603k c23603kM93386c = C23603k.m93386c(inflater);
        Intrinsics.m97801g(c23603kM93386c, "inflate(...)");
        return c23603kM93386c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data_key_resource_detectors") : null;
        this.mMovieDetailBean = serializable instanceof Subject ? (Subject) serializable : null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
