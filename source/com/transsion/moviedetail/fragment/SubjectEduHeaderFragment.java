package com.transsion.moviedetail.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$string;
import com.transsion.moviedetail.dialog.SubjectEduInfoMoreDetailDialog;
import com.transsion.moviedetail.view.CustomTextViewGroup;
import com.transsion.moviedetail.view.HeaderExtensionFragment;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23609q;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p000.AbstractC0000a;
import p550kj.C24655b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\u0018\u0010(\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010 R\u0016\u0010*\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010 R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010 R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/SubjectEduHeaderFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lgn/q;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "i0", "(Landroid/view/View;)V", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "j0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "Landroid/view/LayoutInflater;", "inflater", "e0", "(Landroid/view/LayoutInflater;)Lgn/q;", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "initData", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "a", "Lkotlin/Lazy;", "d0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "TAG", "c", "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "ops", "e", "mSubjectId", "f", "pageName", "", "g", "I", "curSeason", "h", "moduleName", "", "i", "Z", "isInterceptDetail", "Lcom/transsion/moviedetail/view/HeaderExtensionFragment;", "j", "Lcom/transsion/moviedetail/view/HeaderExtensionFragment;", "headerExtensionFragment", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubjectEduHeaderFragment extends BaseFragment<C23609q> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isInterceptDetail;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private HeaderExtensionFragment headerExtensionFragment;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.fragment.SubjectEduHeaderFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.fragment.SubjectEduHeaderFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String TAG = "SubjectEduHeaderFragment";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String pageName = "subjectdetail";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectEduHeaderFragment$a */
    static final class C15975a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54624a;

        C15975a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54624a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54624a;
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
            this.f54624a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final MovieDetailViewModel m70488d0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final Unit m70489f0(SubjectEduHeaderFragment subjectEduHeaderFragment, Pair pair) {
        Subject subject = (Subject) pair.getSecond();
        C26866a.f81698a.m104912c(subjectEduHeaderFragment.TAG, "get movie detail data==" + pair, true);
        if (subject != null && subjectEduHeaderFragment.mMovieDetailBean == null) {
            subjectEduHeaderFragment.m70493j0(subject);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final Unit m70490g0(SubjectEduHeaderFragment subjectEduHeaderFragment, Integer num) {
        Intrinsics.m97799e(num);
        subjectEduHeaderFragment.curSeason = num.intValue();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m70491h0(SubjectEduHeaderFragment subjectEduHeaderFragment, View view) {
        Intrinsics.m97799e(view);
        subjectEduHeaderFragment.m70492i0(view);
    }

    /* JADX INFO: renamed from: i0 */
    private final void m70492i0(View view) {
        if (this.isInterceptDetail || C14557c.f51100a.m65671a(view.getId(), 1000L)) {
            return;
        }
        C26866a.a.m104899g(C26866a.f81698a, "Open the right to view more detail", false, 2, null);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            SubjectEduInfoMoreDetailDialog subjectEduInfoMoreDetailDialog = new SubjectEduInfoMoreDetailDialog();
            subjectEduInfoMoreDetailDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("data_key_resource_detectors", this.mMovieDetailBean)));
            subjectEduInfoMoreDetailDialog.m71697n0(parentFragment, R$id.fl_bottom_dialog_container);
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final void m70493j0(Subject movieDetailBean) {
        Subject subject;
        AppCompatTextView appCompatTextView;
        FrameLayout frameLayout;
        C23609q mViewBinding;
        CustomTextViewGroup customTextViewGroup;
        C23609q mViewBinding2;
        CustomTextViewGroup customTextViewGroup2;
        C23609q mViewBinding3;
        CustomTextViewGroup customTextViewGroup3;
        C23609q mViewBinding4;
        CustomTextViewGroup customTextViewGroup4;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        this.mMovieDetailBean = movieDetailBean;
        String ops = movieDetailBean != null ? movieDetailBean.getOps() : null;
        if ((ops == null || ops.length() == 0) && (subject = this.mMovieDetailBean) != null) {
            subject.setOps(this.ops);
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null) {
            logViewConfig2.m96851n(this.ops);
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g2 = logViewConfig3.m96844g()) != null) {
            String subjectId = movieDetailBean.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            mapM96844g2.put("subject_id", subjectId);
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g = logViewConfig4.m96844g()) != null) {
            mapM96844g.put("has_resource", String.valueOf(movieDetailBean.getHasResource()));
        }
        C23609q mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (appCompatTextView4 = mViewBinding5.f72044j) != null) {
            appCompatTextView4.setText(movieDetailBean.getTitle());
        }
        String description = movieDetailBean.getDescription();
        if (description == null || description.length() <= 0) {
            C23609q mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (appCompatTextView = mViewBinding6.f72040f) != null) {
                AbstractC26006c.m102054g(appCompatTextView);
            }
        } else {
            C23609q mViewBinding7 = getMViewBinding();
            if (mViewBinding7 != null && (appCompatTextView3 = mViewBinding7.f72040f) != null) {
                appCompatTextView3.setText(movieDetailBean.getDescription());
            }
            C23609q mViewBinding8 = getMViewBinding();
            if (mViewBinding8 != null && (appCompatTextView2 = mViewBinding8.f72040f) != null) {
                AbstractC26006c.m102058k(appCompatTextView2);
            }
        }
        int iM71009a = AbstractC16247h.m71009a(movieDetailBean.getSubjectType());
        C23609q mViewBinding9 = getMViewBinding();
        if (mViewBinding9 != null && (appCompatImageView = mViewBinding9.f72037c) != null) {
            appCompatImageView.setImageResource(iM71009a);
        }
        String category = movieDetailBean.getCategory();
        if (category != null && (mViewBinding4 = getMViewBinding()) != null && (customTextViewGroup4 = mViewBinding4.f72039e) != null) {
            customTextViewGroup4.setText(category);
        }
        String genre = movieDetailBean.getGenre();
        if (genre != null && (mViewBinding3 = getMViewBinding()) != null && (customTextViewGroup3 = mViewBinding3.f72042h) != null) {
            customTextViewGroup3.setText(genre);
        }
        String strM0a = AbstractC0000a.m0a(this.mMovieDetailBean);
        if (strM0a != null && (mViewBinding2 = getMViewBinding()) != null && (customTextViewGroup2 = mViewBinding2.f72041g) != null) {
            customTextViewGroup2.setText(strM0a);
        }
        Context context = getContext();
        if (context != null) {
            int i11 = R$string.movie_detail_students;
            Long viewers = movieDetailBean.getViewers();
            String string = context.getString(i11, Long.valueOf(viewers != null ? viewers.longValue() : 0L));
            if (string != null && (mViewBinding = getMViewBinding()) != null && (customTextViewGroup = mViewBinding.f72045k) != null) {
                customTextViewGroup.setText(string);
            }
        }
        if (this.isInterceptDetail) {
            C23609q mViewBinding10 = getMViewBinding();
            if (mViewBinding10 == null || (frameLayout = mViewBinding10.f72036b) == null) {
                return;
            }
            AbstractC26006c.m102054g(frameLayout);
            return;
        }
        if (this.headerExtensionFragment == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            HeaderExtensionFragment headerExtensionFragment = new HeaderExtensionFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("data_key_resource_detectors", this.mMovieDetailBean);
            bundle.putString("module_name", this.moduleName);
            bundle.putInt("season", this.curSeason);
            bundle.putString("ops", this.ops);
            bundle.putString(WebConstants.PAGE_FROM, this.pageName);
            headerExtensionFragment.setArguments(bundle);
            abstractC3168wM14557p.m14813s(R$id.extension_container, headerExtensionFragment);
            this.headerExtensionFragment = headerExtensionFragment;
            abstractC3168wM14557p.mo14671j();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C23609q getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23609q c23609qM93410c = C23609q.m93410c(inflater);
        Intrinsics.m97801g(c23609qM93410c, "inflate(...)");
        return c23609qM93410c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        String string;
        View view2;
        C23609q mViewBinding;
        AppCompatTextView appCompatTextView;
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data_key_resource_detectors") : null;
        this.mMovieDetailBean = serializable instanceof Subject ? (Subject) serializable : null;
        Bundle arguments2 = getArguments();
        this.ops = arguments2 != null ? arguments2.getString("ops") : null;
        Bundle arguments3 = getArguments();
        this.isInterceptDetail = arguments3 != null ? arguments3.getBoolean("is_Intercept_detail") : false;
        Bundle arguments4 = getArguments();
        this.mSubjectId = arguments4 != null ? arguments4.getString("id") : null;
        Bundle arguments5 = getArguments();
        this.moduleName = arguments5 != null ? arguments5.getString("module_name") : null;
        Bundle arguments6 = getArguments();
        this.curSeason = arguments6 != null ? arguments6.getInt("season") : 1;
        Bundle arguments7 = getArguments();
        this.ops = arguments7 != null ? arguments7.getString("ops") : null;
        Bundle arguments8 = getArguments();
        if (arguments8 == null || (string = arguments8.getString(WebConstants.PAGE_FROM)) == null) {
            string = "subjectdetail";
        }
        this.pageName = string;
        Subject subject = this.mMovieDetailBean;
        if (subject != null) {
            Intrinsics.m97799e(subject);
            m70493j0(subject);
        }
        if (this.isInterceptDetail && (mViewBinding = getMViewBinding()) != null && (appCompatTextView = mViewBinding.f72044j) != null) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        MovieDetailViewModel movieDetailViewModelM70488d0 = m70488d0();
        movieDetailViewModelM70488d0.m70910F().m14851j(this, new C15975a(new Function1() { // from class: com.transsion.moviedetail.fragment.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectEduHeaderFragment.m70489f0(this.f54729a, (Pair) obj);
            }
        }));
        movieDetailViewModelM70488d0.m70914K().m14851j(this, new C15975a(new Function1() { // from class: com.transsion.moviedetail.fragment.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectEduHeaderFragment.m70490g0(this.f54732a, (Integer) obj);
            }
        }));
        C23609q mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (view2 = mViewBinding2.f72046l) == null) {
            return;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                SubjectEduHeaderFragment.m70491h0(this.f54736a, view3);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }
}
