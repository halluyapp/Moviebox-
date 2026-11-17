package com.transsion.moviedetail.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
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
import com.transsion.moviedetail.dialog.SubjectInfoMoreDetailDialog;
import com.transsion.moviedetail.view.CustomTextViewGroup;
import com.transsion.moviedetail.view.HeaderExtensionFragment;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23611s;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Deprecated;
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
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p550kj.C24655b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\u0004J!\u0010#\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b#\u0010!R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u00106\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010.R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/SubjectMovieHeaderFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lgn/s;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "n0", "(Landroid/view/View;)V", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "q0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "", "releaseDate", "f0", "(Ljava/lang/String;)Ljava/lang/String;", "", "addStatus", "o0", "(Ljava/lang/Integer;)V", "seeStatus", "p0", "Landroid/view/LayoutInflater;", "inflater", "h0", "(Landroid/view/LayoutInflater;)Lgn/s;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "initData", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "a", "Lkotlin/Lazy;", "g0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", "c", "Ljava/lang/String;", "ops", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "mSubjectId", "e", "pageName", "f", "I", "curSeason", "g", "moduleName", "Lcom/transsion/moviedetail/view/HeaderExtensionFragment;", "h", "Lcom/transsion/moviedetail/view/HeaderExtensionFragment;", "headerExtensionFragment", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubjectMovieHeaderFragment extends BaseFragment<C23611s> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private HeaderExtensionFragment headerExtensionFragment;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.fragment.SubjectMovieHeaderFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.fragment.SubjectMovieHeaderFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String pageName = "subjectdetail";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.SubjectMovieHeaderFragment$a */
    static final class C15987a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54646a;

        C15987a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54646a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54646a;
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
            this.f54646a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: f0 */
    private final String m70542f0(String releaseDate) {
        if (releaseDate.length() < 4) {
            return releaseDate;
        }
        String strSubstring = releaseDate.substring(0, 4);
        Intrinsics.m97801g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: g0 */
    private final MovieDetailViewModel m70543g0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final Unit m70544i0(SubjectMovieHeaderFragment subjectMovieHeaderFragment, Pair pair) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        Subject subject = (Subject) pair.getSecond();
        C26866a.f81698a.m104912c("movie_detail", "get movie detail data==" + pair, true);
        if (subject != null) {
            subjectMovieHeaderFragment.m70552q0(subject);
            C24655b logViewConfig = subjectMovieHeaderFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            C24655b logViewConfig2 = subjectMovieHeaderFragment.getLogViewConfig();
            if (logViewConfig2 != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
                String subjectId = subject.getSubjectId();
                if (subjectId == null) {
                    subjectId = "";
                }
                mapM96844g2.put("subject_id", subjectId);
            }
            C24655b logViewConfig3 = subjectMovieHeaderFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
                mapM96844g.put("has_resource", String.valueOf(subject.getHasResource()));
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final Unit m70545j0(SubjectMovieHeaderFragment subjectMovieHeaderFragment, Integer num) {
        Intrinsics.m97799e(num);
        subjectMovieHeaderFragment.curSeason = num.intValue();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final Unit m70546k0(SubjectMovieHeaderFragment subjectMovieHeaderFragment, Integer num) {
        Intrinsics.m97799e(num);
        subjectMovieHeaderFragment.curSeason = num.intValue();
        subjectMovieHeaderFragment.hideLoading();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m70547l0(SubjectMovieHeaderFragment subjectMovieHeaderFragment, View view) {
        Intrinsics.m97799e(view);
        subjectMovieHeaderFragment.m70549n0(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final void m70548m0(SubjectMovieHeaderFragment subjectMovieHeaderFragment, View view) {
        Intrinsics.m97799e(view);
        subjectMovieHeaderFragment.m70549n0(view);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m70549n0(View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 1000L)) {
            return;
        }
        C26866a.a.m104899g(C26866a.f81698a, "Open the right to view more detail", false, 2, null);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            SubjectInfoMoreDetailDialog subjectInfoMoreDetailDialog = new SubjectInfoMoreDetailDialog();
            subjectInfoMoreDetailDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("data_key_resource_detectors", this.mMovieDetailBean), TuplesKt.m97108a("page_name", this.pageName)));
            subjectInfoMoreDetailDialog.m71697n0(parentFragment, R$id.fl_bottom_dialog_container);
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final void m70550o0(Integer addStatus) {
    }

    /* JADX INFO: renamed from: p0 */
    private final void m70551p0(Integer seeStatus) {
    }

    /* JADX INFO: renamed from: q0 */
    private final void m70552q0(Subject movieDetailBean) {
        Subject subject;
        CustomTextViewGroup customTextViewGroup;
        AppCompatTextView appCompatTextView;
        CustomTextViewGroup customTextViewGroup2;
        C23611s mViewBinding;
        CustomTextViewGroup customTextViewGroup3;
        C23611s mViewBinding2;
        CustomTextViewGroup customTextViewGroup4;
        C23611s mViewBinding3;
        CustomTextViewGroup customTextViewGroup5;
        C23611s mViewBinding4;
        CustomTextViewGroup customTextViewGroup6;
        CustomTextViewGroup customTextViewGroup7;
        C23611s mViewBinding5;
        CustomTextViewGroup customTextViewGroup8;
        AppCompatTextView appCompatTextView2;
        AppCompatImageView appCompatImageView;
        CustomTextViewGroup customTextViewGroup9;
        CustomTextViewGroup customTextViewGroup10;
        AppCompatTextView appCompatTextView3;
        AppCompatImageView appCompatImageView2;
        this.mMovieDetailBean = movieDetailBean;
        String ops = movieDetailBean != null ? movieDetailBean.getOps() : null;
        if ((ops == null || ops.length() == 0) && (subject = this.mMovieDetailBean) != null) {
            subject.setOps(this.ops);
        }
        int iM71009a = AbstractC16247h.m71009a(movieDetailBean.getSubjectType());
        C23611s mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (appCompatImageView2 = mViewBinding6.f72057c) != null) {
            appCompatImageView2.setImageResource(iM71009a);
        }
        C23611s mViewBinding7 = getMViewBinding();
        if (mViewBinding7 != null && (appCompatTextView3 = mViewBinding7.f72061g) != null) {
            appCompatTextView3.setText(movieDetailBean.getTitle());
        }
        if (movieDetailBean.isTvType()) {
            C23611s mViewBinding8 = getMViewBinding();
            if (mViewBinding8 != null && (customTextViewGroup10 = mViewBinding8.f72066l) != null) {
                AbstractC26006c.m102058k(customTextViewGroup10);
            }
            Integer seNum = movieDetailBean.getSeNum();
            if (seNum != null) {
                int iIntValue = seNum.intValue();
                Context context = getContext();
                String string = context != null ? context.getString(R$string.movie_detail_seasons, Integer.valueOf(iIntValue)) : null;
                C23611s mViewBinding9 = getMViewBinding();
                if (mViewBinding9 != null && (customTextViewGroup9 = mViewBinding9.f72066l) != null) {
                    if (string == null) {
                        string = "";
                    }
                    customTextViewGroup9.setText(string);
                }
            }
        } else {
            C23611s mViewBinding10 = getMViewBinding();
            if (mViewBinding10 != null && (customTextViewGroup = mViewBinding10.f72066l) != null) {
                AbstractC26006c.m102054g(customTextViewGroup);
            }
        }
        if (movieDetailBean.isMusicType()) {
            C23611s mViewBinding11 = getMViewBinding();
            if (mViewBinding11 != null && (appCompatImageView = mViewBinding11.f72058d) != null) {
                AbstractC26006c.m102054g(appCompatImageView);
            }
            C23611s mViewBinding12 = getMViewBinding();
            if (mViewBinding12 != null && (appCompatTextView2 = mViewBinding12.f72065k) != null) {
                AbstractC26006c.m102054g(appCompatTextView2);
            }
            String countryName = movieDetailBean.getCountryName();
            if (countryName != null && (mViewBinding5 = getMViewBinding()) != null && (customTextViewGroup8 = mViewBinding5.f72060f) != null) {
                customTextViewGroup8.setText(countryName);
            }
            String genre = movieDetailBean.getGenre();
            if (genre != null) {
                String string2 = StringsKt.m98155n1((String) StringsKt.m98117S0(genre, new String[]{","}, false, 0, 6, null).get(0)).toString();
                C23611s mViewBinding13 = getMViewBinding();
                if (mViewBinding13 != null && (customTextViewGroup7 = mViewBinding13.f72068n) != null) {
                    customTextViewGroup7.setText(string2);
                }
            }
            String releaseDate = movieDetailBean.getReleaseDate();
            if (releaseDate != null && (mViewBinding4 = getMViewBinding()) != null && (customTextViewGroup6 = mViewBinding4.f72067m) != null) {
                customTextViewGroup6.setText(m70542f0(releaseDate));
            }
        } else {
            String restrictLevel = movieDetailBean.getRestrictLevel();
            if (restrictLevel != null && (mViewBinding3 = getMViewBinding()) != null && (customTextViewGroup5 = mViewBinding3.f72063i) != null) {
                customTextViewGroup5.setText(restrictLevel);
            }
            String releaseDate2 = movieDetailBean.getReleaseDate();
            if (releaseDate2 != null && (mViewBinding2 = getMViewBinding()) != null && (customTextViewGroup4 = mViewBinding2.f72067m) != null) {
                customTextViewGroup4.setText(m70542f0(releaseDate2));
            }
            String countryName2 = movieDetailBean.getCountryName();
            if (countryName2 != null && (mViewBinding = getMViewBinding()) != null && (customTextViewGroup3 = mViewBinding.f72060f) != null) {
                customTextViewGroup3.setText(countryName2);
            }
            String genre2 = movieDetailBean.getGenre();
            if (genre2 != null) {
                String string3 = StringsKt.m98155n1((String) StringsKt.m98117S0(genre2, new String[]{","}, false, 0, 6, null).get(0)).toString();
                C23611s mViewBinding14 = getMViewBinding();
                if (mViewBinding14 != null && (customTextViewGroup2 = mViewBinding14.f72068n) != null) {
                    customTextViewGroup2.setText(string3);
                }
            }
            C23611s mViewBinding15 = getMViewBinding();
            if (mViewBinding15 != null && (appCompatTextView = mViewBinding15.f72065k) != null) {
                appCompatTextView.setText(movieDetailBean.getImdbRate());
            }
        }
        Subject subject2 = this.mMovieDetailBean;
        m70551p0(subject2 != null ? subject2.getSeenStatus() : null);
        Subject subject3 = this.mMovieDetailBean;
        m70550o0(subject3 != null ? subject3.getSeenStatus() : null);
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
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C23611s getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23611s c23611sM93418c = C23611s.m93418c(inflater);
        Intrinsics.m97801g(c23611sM93418c, "inflate(...)");
        return c23611sM93418c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.ops = arguments != null ? arguments.getString("ops") : null;
        Bundle arguments2 = getArguments();
        this.mSubjectId = arguments2 != null ? arguments2.getString("id") : null;
        MovieDetailViewModel movieDetailViewModelM70543g0 = m70543g0();
        movieDetailViewModelM70543g0.m70910F().m14851j(this, new C15987a(new Function1() { // from class: com.transsion.moviedetail.fragment.o2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectMovieHeaderFragment.m70544i0(this.f54744a, (Pair) obj);
            }
        }));
        movieDetailViewModelM70543g0.m70914K().m14851j(this, new C15987a(new Function1() { // from class: com.transsion.moviedetail.fragment.p2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectMovieHeaderFragment.m70545j0(this.f54748a, (Integer) obj);
            }
        }));
        m70543g0().m70914K().m14851j(this, new C15987a(new Function1() { // from class: com.transsion.moviedetail.fragment.q2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectMovieHeaderFragment.m70546k0(this.f54754a, (Integer) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        C23611s mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f72061g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.r2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubjectMovieHeaderFragment.m70547l0(this.f54759a, view2);
                }
            });
            mViewBinding.f72064j.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.s2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubjectMovieHeaderFragment.m70548m0(this.f54766a, view2);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data_key_resource_detectors") : null;
        this.mMovieDetailBean = serializable instanceof Subject ? (Subject) serializable : null;
        Bundle arguments2 = getArguments();
        this.moduleName = arguments2 != null ? arguments2.getString("module_name") : null;
        Bundle arguments3 = getArguments();
        this.curSeason = arguments3 != null ? arguments3.getInt("season") : 1;
        Bundle arguments4 = getArguments();
        this.ops = arguments4 != null ? arguments4.getString("ops") : null;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string = arguments5.getString(WebConstants.PAGE_FROM)) == null) {
            string = "subjectdetail";
        }
        this.pageName = string;
    }
}
