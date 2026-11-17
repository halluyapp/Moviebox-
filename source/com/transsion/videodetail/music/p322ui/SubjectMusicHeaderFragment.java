package com.transsion.videodetail.music.p322ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.music.MusicLikedDbBean;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.AbstractC14558d;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetail.R$drawable;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.dialog.SubjectMusicInfoMoreDetailDialog;
import com.transsion.moviedetail.view.HeaderExtensionFragment;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.videodetail.R$string;
import com.transsion.videodetail.music.bean.LikeListActionEnum;
import com.transsion.videodetail.music.bean.MusicLikedRemoteItemBean;
import com.transsion.videodetail.music.data.MusicLikedFragmentViewModel;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23610r;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mx.C25917a;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p550kj.C24662i;
import p626nx.C26117b;
import p743rh.C27287m;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J!\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010#R\u0018\u0010+\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010#R\u0016\u0010-\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010#R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010#R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, m97100d2 = {"Lcom/transsion/videodetail/music/ui/SubjectMusicHeaderFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lgn/r;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "s0", "(Landroid/view/View;)V", "t0", "v0", "y0", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "z0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "Landroid/view/LayoutInflater;", "inflater", "l0", "(Landroid/view/LayoutInflater;)Lgn/r;", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "initData", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "a", "Lkotlin/Lazy;", "k0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "TAG", "c", "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "ops", "e", "mSubjectId", "f", "pageName", "", "g", "I", "curSeason", "h", "moduleName", "Lcom/transsion/videodetail/music/data/MusicLikedFragmentViewModel;", "i", "j0", "()Lcom/transsion/videodetail/music/data/MusicLikedFragmentViewModel;", "mViewModel", "", "j", "Z", "isInterceptDetail", "Lcom/transsion/moviedetail/view/HeaderExtensionFragment;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/moviedetail/view/HeaderExtensionFragment;", "headerExtensionFragment", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubjectMusicHeaderFragment extends BaseFragment<C23610r> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isInterceptDetail;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private HeaderExtensionFragment headerExtensionFragment;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.music.ui.SubjectMusicHeaderFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.music.ui.SubjectMusicHeaderFragment$special$$inlined$activityViewModels$default$2
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
    private final String TAG = "SubjectMusicHeaderFragment";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String pageName = "stream_detail";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MusicLikedFragmentViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.music.ui.SubjectMusicHeaderFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.music.ui.SubjectMusicHeaderFragment$special$$inlined$activityViewModels$default$4
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

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.SubjectMusicHeaderFragment$a */
    static final class C21010a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65875a;

        C21010a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65875a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65875a;
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
            this.f65875a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final MusicLikedFragmentViewModel m86446j0() {
        return (MusicLikedFragmentViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: k0 */
    private final MovieDetailViewModel m86447k0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m86448m0(final SubjectMusicHeaderFragment subjectMusicHeaderFragment, MovieDetailViewModel movieDetailViewModel, Pair pair) {
        Subject subject = (Subject) pair.getSecond();
        if (subject != null) {
            subjectMusicHeaderFragment.mMovieDetailBean = subject;
            C25917a.f79141a.m101735a(movieDetailViewModel.getClass().getSimpleName() + " --> initData() --> mMovieDetailBean = " + subjectMusicHeaderFragment.mMovieDetailBean);
            subjectMusicHeaderFragment.m86461z0(subject);
            subjectMusicHeaderFragment.m86455t0();
            subjectMusicHeaderFragment.m86446j0().m86234F(subjectMusicHeaderFragment.mSubjectId, new Function1() { // from class: com.transsion.videodetail.music.ui.t0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubjectMusicHeaderFragment.m86449n0(this.f65919a, ((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final Unit m86449n0(SubjectMusicHeaderFragment subjectMusicHeaderFragment, boolean z11) {
        Subject subject;
        Integer likeStatus;
        if (!z11 && (subject = subjectMusicHeaderFragment.mMovieDetailBean) != null && (likeStatus = subject.getLikeStatus()) != null && likeStatus.intValue() == 1) {
            MusicLikedFragmentViewModel musicLikedFragmentViewModelM86446j0 = subjectMusicHeaderFragment.m86446j0();
            Subject subject2 = subjectMusicHeaderFragment.mMovieDetailBean;
            musicLikedFragmentViewModelM86446j0.m86235G(subject2 != null ? subject2.getSubjectId() : null, LikeListActionEnum.REMOVE);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final Unit m86450o0(SubjectMusicHeaderFragment subjectMusicHeaderFragment, MusicLikedRemoteItemBean musicLikedRemoteItemBean) {
        Integer likeStatus;
        int i11;
        Resources resources;
        Resources resources2;
        String string = null;
        if (!TextUtils.equals(subjectMusicHeaderFragment.mSubjectId, musicLikedRemoteItemBean != null ? musicLikedRemoteItemBean.getSubjectId() : null)) {
            return Unit.f75682a;
        }
        Subject subject = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject != null) {
            if ((musicLikedRemoteItemBean != null ? musicLikedRemoteItemBean.getActionEnum() : null) == LikeListActionEnum.ADD) {
                C28951b.a aVar = C28951b.f88586a;
                Context context = subjectMusicHeaderFragment.getContext();
                if (context != null && (resources2 = context.getResources()) != null) {
                    string = resources2.getString(R$string.music_liked_success);
                }
                aVar.m111455e(string);
                i11 = 1;
            } else {
                C28951b.a aVar2 = C28951b.f88586a;
                Context context2 = subjectMusicHeaderFragment.getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    string = resources.getString(R$string.music_liked_remove_success);
                }
                aVar2.m111455e(string);
                i11 = 0;
            }
            subject.setLikeStatus(i11);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Subject subject2 = subjectMusicHeaderFragment.mMovieDetailBean;
        linkedHashMap.put("click_action", (subject2 == null || (likeStatus = subject2.getLikeStatus()) == null || likeStatus.intValue() != 0) ? "add" : "remove");
        C24662i.f75350a.m96881p("subject_music_header_fragment", linkedHashMap);
        subjectMusicHeaderFragment.m86455t0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m86451p0(final SubjectMusicHeaderFragment subjectMusicHeaderFragment, View view) {
        AbstractC14558d.m65672a(1000L, new Function0() { // from class: com.transsion.videodetail.music.ui.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubjectMusicHeaderFragment.m86452q0(this.f65914a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m86452q0(SubjectMusicHeaderFragment subjectMusicHeaderFragment) {
        Subject subject = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject != null) {
            subjectMusicHeaderFragment.m86446j0().m86236p(subject);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m86453r0(SubjectMusicHeaderFragment subjectMusicHeaderFragment, View view) {
        Intrinsics.m97799e(view);
        subjectMusicHeaderFragment.m86454s0(view);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m86454s0(View view) {
        Fragment parentFragment;
        if (this.isInterceptDetail || C14557c.f51100a.m65671a(view.getId(), 1000L) || (parentFragment = getParentFragment()) == null) {
            return;
        }
        SubjectMusicInfoMoreDetailDialog subjectMusicInfoMoreDetailDialog = new SubjectMusicInfoMoreDetailDialog();
        subjectMusicInfoMoreDetailDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("data_key_resource_detectors", this.mMovieDetailBean)));
        subjectMusicInfoMoreDetailDialog.m71697n0(parentFragment, R$id.fl_bottom_dialog_container);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m86455t0() {
        final AppCompatImageView appCompatImageView;
        C23610r mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatImageView = mViewBinding.f72049c) == null) {
            return;
        }
        m86446j0().m86234F(this.mSubjectId, new Function1() { // from class: com.transsion.videodetail.music.ui.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectMusicHeaderFragment.m86456u0(appCompatImageView, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m86456u0(AppCompatImageView appCompatImageView, boolean z11) {
        if (z11) {
            appCompatImageView.setImageResource(R$drawable.music_collection_1);
        } else {
            appCompatImageView.setImageResource(R$drawable.music_collection_0);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: v0 */
    private final void m86457v0() {
        if (C27287m.f83003a.m106330e()) {
            return;
        }
        m86446j0().m86231B(this.mSubjectId, new Function1() { // from class: com.transsion.videodetail.music.ui.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectMusicHeaderFragment.m86458w0(this.f65916a, (MusicLikedDbBean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m86458w0(final SubjectMusicHeaderFragment subjectMusicHeaderFragment, MusicLikedDbBean musicLikedDbBean) {
        Cover cover;
        if (musicLikedDbBean == null) {
            subjectMusicHeaderFragment.m86446j0().m86237v(subjectMusicHeaderFragment.mSubjectId, new Function1() { // from class: com.transsion.videodetail.music.ui.u0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubjectMusicHeaderFragment.m86459x0(this.f65921a, (DownloadBean) obj);
                }
            });
        } else {
            C25917a.f79141a.m101736b(subjectMusicHeaderFragment.TAG + " --> showNoNetworkLayout() --> liked = " + musicLikedDbBean);
            Subject subject = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -1, 67108863, null);
            subjectMusicHeaderFragment.mMovieDetailBean = subject;
            subject.setSubjectId(subjectMusicHeaderFragment.mSubjectId);
            Subject subject2 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject2 != null) {
                subject2.setCover(new Cover(null, null, null, null, null, null, null, null, null, 511, null));
            }
            Subject subject3 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject3 != null && (cover = subject3.getCover()) != null) {
                cover.setUrl(musicLikedDbBean.getCoverUrl());
            }
            Subject subject4 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject4 != null) {
                subject4.setSubjectType(6);
            }
            Subject subject5 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject5 != null) {
                subject5.setLikeStatus(1);
            }
            Subject subject6 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject6 != null) {
                subject6.setTitle(musicLikedDbBean.getTitle());
            }
            Subject subject7 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject7 != null) {
                subject7.setCountryName(musicLikedDbBean.getCountryName());
            }
            Subject subject8 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject8 != null) {
                subject8.setGenre(musicLikedDbBean.getGenre());
            }
            Subject subject9 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject9 != null) {
                subject9.setReleaseDate(musicLikedDbBean.getReleaseDate());
            }
            Subject subject10 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject10 != null) {
                subject10.setDurationSeconds(Integer.valueOf(musicLikedDbBean.getDurationSeconds()));
            }
            Staff staff = new Staff();
            staff.setAvatarUrl(musicLikedDbBean.getSingerAvatar());
            staff.setName(musicLikedDbBean.getSingerName());
            Subject subject11 = subjectMusicHeaderFragment.mMovieDetailBean;
            if (subject11 != null) {
                subject11.setStaffList(CollectionsKt.m97511q(staff));
            }
        }
        subjectMusicHeaderFragment.m86460y0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Unit m86459x0(SubjectMusicHeaderFragment subjectMusicHeaderFragment, DownloadBean downloadBean) {
        Long duration;
        Cover cover;
        String str = null;
        Subject subject = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, str, str, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -1, 67108863, null);
        subjectMusicHeaderFragment.mMovieDetailBean = subject;
        subject.setSubjectId(subjectMusicHeaderFragment.mSubjectId);
        Subject subject2 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject2 != null) {
            subject2.setCover(new Cover(null, null, null, null, null, null, null, null, null, 511, null));
        }
        Subject subject3 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject3 != null && (cover = subject3.getCover()) != null) {
            cover.setUrl(downloadBean != null ? downloadBean.getCover() : null);
        }
        Subject subject4 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject4 != null) {
            subject4.setSubjectType(6);
        }
        Subject subject5 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject5 != null) {
            subject5.setLikeStatus(0);
        }
        Subject subject6 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject6 != null) {
            subject6.setTitle(downloadBean != null ? downloadBean.getSubjectName() : null);
        }
        Subject subject7 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject7 != null) {
            subject7.setCountryName(downloadBean != null ? downloadBean.getUploadBy() : null);
        }
        Subject subject8 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject8 != null) {
            subject8.setGenre(downloadBean != null ? downloadBean.getGenre() : null);
        }
        Subject subject9 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject9 != null) {
            subject9.setReleaseDate("");
        }
        Subject subject10 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject10 != null) {
            subject10.setDurationSeconds(Integer.valueOf((int) (((downloadBean == null || (duration = downloadBean.getDuration()) == null) ? 0L : duration.longValue()) / ((long) 1000))));
        }
        Staff staff = new Staff();
        staff.setAvatarUrl("");
        staff.setName("");
        Subject subject11 = subjectMusicHeaderFragment.mMovieDetailBean;
        if (subject11 != null) {
            subject11.setStaffList(CollectionsKt.m97511q(staff));
        }
        subjectMusicHeaderFragment.m86460y0();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: y0 */
    private final void m86460y0() {
        Subject subject = this.mMovieDetailBean;
        if (subject != null) {
            m86461z0(subject);
            m86455t0();
        }
    }

    /* JADX INFO: renamed from: z0 */
    private final void m86461z0(Subject movieDetailBean) {
        FrameLayout frameLayout;
        Subject subject;
        HashMap mapM96844g;
        HashMap mapM96844g2;
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
        C23610r mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            Subject subject2 = this.mMovieDetailBean;
            String ops = subject2 != null ? subject2.getOps() : null;
            if ((ops == null || ops.length() == 0) && (subject = this.mMovieDetailBean) != null) {
                subject.setOps(this.ops);
            }
            mViewBinding.f72051e.setText(movieDetailBean.getTitle());
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
                C26117b c26117b = C26117b.f79713a;
                Integer durationSeconds2 = movieDetailBean.getDurationSeconds();
                spannableStringBuilder.append((CharSequence) c26117b.m102282a(((long) (durationSeconds2 != null ? durationSeconds2.intValue() : 0)) * 1000));
            }
            mViewBinding.f72052f.setText(spannableStringBuilder);
        }
        if (this.isInterceptDetail) {
            C23610r mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (frameLayout = mViewBinding2.f72048b) == null) {
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
    public void initData(View view, Bundle savedInstanceState) {
        String string;
        C23610r mViewBinding;
        AppCompatTextView appCompatTextView;
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data_key_resource_detectors") : null;
        this.mMovieDetailBean = serializable instanceof Subject ? (Subject) serializable : null;
        Bundle arguments2 = getArguments();
        this.ops = arguments2 != null ? arguments2.getString("ops") : null;
        Bundle arguments3 = getArguments();
        this.mSubjectId = arguments3 != null ? arguments3.getString("id") : null;
        Bundle arguments4 = getArguments();
        this.moduleName = arguments4 != null ? arguments4.getString("module_name") : null;
        Bundle arguments5 = getArguments();
        this.curSeason = arguments5 != null ? arguments5.getInt("season") : 1;
        Bundle arguments6 = getArguments();
        this.ops = arguments6 != null ? arguments6.getString("ops") : null;
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (string = arguments7.getString(WebConstants.PAGE_FROM)) == null) {
            string = "stream_detail";
        }
        this.pageName = string;
        Bundle arguments8 = getArguments();
        this.isInterceptDetail = arguments8 != null ? arguments8.getBoolean("is_Intercept_detail") : false;
        Subject subject = this.mMovieDetailBean;
        if (subject != null) {
            Intrinsics.m97799e(subject);
            m86461z0(subject);
        }
        if (this.isInterceptDetail && (mViewBinding = getMViewBinding()) != null && (appCompatTextView = mViewBinding.f72051e) != null) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        final MovieDetailViewModel movieDetailViewModelM86447k0 = m86447k0();
        movieDetailViewModelM86447k0.m70910F().m14851j(this, new C21010a(new Function1() { // from class: com.transsion.videodetail.music.ui.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectMusicHeaderFragment.m86448m0(this.f65906a, movieDetailViewModelM86447k0, (Pair) obj);
            }
        }));
        m86446j0().m86238w().m14851j(this, new C21010a(new Function1() { // from class: com.transsion.videodetail.music.ui.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectMusicHeaderFragment.m86450o0(this.f65908a, (MusicLikedRemoteItemBean) obj);
            }
        }));
        m86457v0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        View view2;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        Intrinsics.m97802h(view, "view");
        C23610r mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatTextView = mViewBinding.f72052f) != null) {
            Context context = getContext();
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(context != null ? context.getDrawable(com.transsion.baseui.R$drawable.ic_tag_music) : null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        C23610r mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f72049c) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SubjectMusicHeaderFragment.m86451p0(this.f65902a, view3);
                }
            });
        }
        C23610r mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (view2 = mViewBinding3.f72053g) == null) {
            return;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                SubjectMusicHeaderFragment.m86453r0(this.f65904a, view3);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C23610r getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23610r c23610rM93414c = C23610r.m93414c(inflater);
        Intrinsics.m97801g(c23610rM93414c, "inflate(...)");
        return c23610rM93414c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }
}
