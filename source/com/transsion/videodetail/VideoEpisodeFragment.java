package com.transsion.videodetail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.amazonaws.services.p059s3.model.BucketVersioningConfiguration;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.moviedetail.fragment.ResourceDetectorDialogFragment;
import com.transsion.moviedetail.fragment.VideoDetailSeasonsSelectFragment;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.ResourcesSeason;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.player.longvideo.helper.C16464n0;
import com.transsion.videodetail.adapter.C20939b;
import com.transsion.videodetail.bean.VideoDetailMediaSource;
import com.transsion.videodetail.util.C21088d;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import mg.C25828e;
import ng.AbstractC26006c;
import p586lx.C25751d;
import p620nn.AbstractC26039f;
import p765s6.InterfaceC27566d;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u001f\u0010\u0012\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0016J\u0017\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010\u0004J2\u00103\u001a\u00020\u00072#\u00102\u001a\u001f\u0012\u0013\u0012\u00110.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u0007\u0018\u00010-¢\u0006\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00107\u001a\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR3\u0010Z\u001a\u001f\u0012\u0013\u0012\u00110.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u0007\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010NR\u0016\u0010a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010VR\u0016\u0010c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\\R\u0014\u0010e\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010\\¨\u0006g"}, m97100d2 = {"Lcom/transsion/videodetail/VideoEpisodeFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llx/d;", "<init>", "()V", "", "showGrid", "", "C0", "(Z)V", "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;", "seasonsList", "u0", "(Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;)V", "R0", "", "Lcom/transsion/videodetail/bean/VideoDetailMediaSource;", "list", "S0", "(Ljava/util/List;)V", WebConstants.FIELD_ITEM, "M0", "(Lcom/transsion/videodetail/bean/VideoDetailMediaSource;)V", "", RequestParameters.POSITION, "O0", "(I)V", "season", "N0", "playingSource", "Q0", "Landroid/view/LayoutInflater;", "inflater", "t0", "(Landroid/view/LayoutInflater;)Llx/d;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initData", "lazyLoadData", "Lkotlin/Function1;", "Lcom/transsion/moviedetailapi/bean/DubsInfo;", "Lkotlin/ParameterName;", "name", "info", "callback", "P0", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "a", "Lkotlin/Lazy;", "q0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "Lcom/transsion/videodetail/VideoDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "s0", "()Lcom/transsion/videodetail/VideoDetailViewModel;", "videoDetailViewModel", "Lcom/transsion/videodetail/adapter/b;", "c", "Lcom/transsion/videodetail/adapter/b;", "videoDetailEpisodeAdapter", "Lcom/transsion/moviedetailapi/bean/Subject;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", "", "e", "J", "lastClickTime", "", "f", "Ljava/lang/String;", "moduleName", "Lcom/transsion/player/longvideo/helper/n0;", "g", "r0", "()Lcom/transsion/player/longvideo/helper/n0;", "subtitleViewModel", "h", "Z", "isAudioDubs", "i", "Lkotlin/jvm/functions/Function1;", "audioSelectCallback", "j", "I", "curSeason", CampaignEx.JSON_KEY_AD_K, "curEpTabTitle", "l", "isSeasonTab", "m", "seasonsCount", "n", "scrollOffset", "o", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class VideoEpisodeFragment extends BaseFragment<C25751d> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C20939b videoDetailEpisodeAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long lastClickTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isAudioDubs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Function1 audioSelectCallback;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.VideoEpisodeFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.VideoEpisodeFragment$special$$inlined$activityViewModels$default$2
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
    private final Lazy videoDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(VideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.VideoEpisodeFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.VideoEpisodeFragment$special$$inlined$activityViewModels$default$4
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

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy subtitleViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C16464n0.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.VideoEpisodeFragment$special$$inlined$activityViewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.VideoEpisodeFragment$special$$inlined$activityViewModels$default$6
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

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String curEpTabTitle = "1-50";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isSeasonTab = true;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int seasonsCount = 1;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int scrollOffset = (AbstractC5806y.m27489e() / 2) - AbstractC5776a0.m27313a(88.0f);

    /* JADX INFO: renamed from: com.transsion.videodetail.VideoEpisodeFragment$b */
    static final class C20928b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65738a;

        C20928b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65738a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65738a;
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
            this.f65738a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final Unit m86131A0(VideoEpisodeFragment videoEpisodeFragment, Pair pair) {
        BLTextView bLTextView;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "VideoDetailEpisode", "字幕选择了, name:" + pair.getFirst() + ", " + pair.getSecond(), false, 4, null);
        if (videoEpisodeFragment.isAudioDubs) {
            C26866a.a.m104898f(aVar, "VideoDetailEpisode", "字幕选择了, 是多配音，不展示字幕", false, 4, null);
            return Unit.f75682a;
        }
        if (Intrinsics.m97797c(pair.getFirst(), BucketVersioningConfiguration.OFF)) {
            C26866a.a.m104898f(aVar, "VideoDetailEpisode", "关闭了字幕，文案不更改", false, 4, null);
            return Unit.f75682a;
        }
        C25751d mViewBinding = videoEpisodeFragment.getMViewBinding();
        if (mViewBinding != null && (bLTextView = mViewBinding.f78505i) != null) {
            bLTextView.setText((CharSequence) pair.getFirst());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final Unit m86132B0(VideoEpisodeFragment videoEpisodeFragment, List list) {
        BLTextView bLTextView;
        BLTextView bLTextView2;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            C25751d mViewBinding = videoEpisodeFragment.getMViewBinding();
            if (mViewBinding != null && (bLTextView = mViewBinding.f78505i) != null) {
                AbstractC26006c.m102054g(bLTextView);
            }
            return Unit.f75682a;
        }
        C25751d mViewBinding2 = videoEpisodeFragment.getMViewBinding();
        if (mViewBinding2 != null && (bLTextView2 = mViewBinding2.f78505i) != null) {
            AbstractC26006c.m102058k(bLTextView2);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m86133C0(boolean showGrid) {
        RecyclerView recyclerView;
        Integer subjectType;
        C25751d mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f78504h) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C25828e(8.0f, 0.0f, showGrid ? 0.0f : 4.0f, 12.0f, 2, null));
        Subject subject = this.mMovieDetailBean;
        final C20939b c20939b = new C20939b((subject == null || (subjectType = subject.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue(), showGrid, R$layout.item_video_detail_episode);
        c20939b.m36227w1(new InterfaceC27566d() { // from class: com.transsion.videodetail.h1
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                VideoEpisodeFragment.m86134D0(this.f65777a, c20939b, baseQuickAdapter, view, i11);
            }
        });
        this.videoDetailEpisodeAdapter = c20939b;
        recyclerView.setAdapter(c20939b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m86134D0(VideoEpisodeFragment videoEpisodeFragment, C20939b c20939b, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        if (videoEpisodeFragment.lastClickTime == 0 || System.currentTimeMillis() - videoEpisodeFragment.lastClickTime > 1000) {
            videoEpisodeFragment.lastClickTime = System.currentTimeMillis();
            videoEpisodeFragment.m86167s0().m86119B((VideoDetailMediaSource) c20939b.m36182f0(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m86135E0(final VideoEpisodeFragment videoEpisodeFragment, View view) {
        String subjectId;
        Fragment parentFragment;
        C26866a.a.m104898f(C26866a.f81698a, "VideoEpisodeFragment", "innerTvTitle click then switch audio track", false, 4, null);
        Subject subject = videoEpisodeFragment.mMovieDetailBean;
        if (subject == null || (subjectId = subject.getSubjectId()) == null || (parentFragment = videoEpisodeFragment.getParentFragment()) == null) {
            return;
        }
        VideoDetailAudioTrackSelectDialog videoDetailAudioTrackSelectDialog = new VideoDetailAudioTrackSelectDialog();
        videoDetailAudioTrackSelectDialog.m86089A0(subjectId);
        videoDetailAudioTrackSelectDialog.m71697n0(parentFragment, R$id.fl_bottom_dialog_container);
        videoDetailAudioTrackSelectDialog.m86091z0(new Function1() { // from class: com.transsion.videodetail.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoEpisodeFragment.m86136F0(this.f65780a, (DubsInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m86136F0(VideoEpisodeFragment videoEpisodeFragment, DubsInfo it) {
        Intrinsics.m97802h(it, "it");
        Function1 function1 = videoEpisodeFragment.audioSelectCallback;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m86137G0(final VideoEpisodeFragment videoEpisodeFragment, View view) {
        Fragment parentFragment = videoEpisodeFragment.getParentFragment();
        if (parentFragment != null) {
            VideoDetailSeasonsSelectFragment.Companion c15996a = VideoDetailSeasonsSelectFragment.INSTANCE;
            ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) videoEpisodeFragment.m86167s0().m86130y().m14847f();
            Subject subject = videoEpisodeFragment.mMovieDetailBean;
            VideoDetailSeasonsSelectFragment videoDetailSeasonsSelectFragmentM70605a = c15996a.m70605a(resourcesSeasonList, subject != null ? subject.getSubjectType() : null);
            videoDetailSeasonsSelectFragmentM70605a.m70604x0(videoEpisodeFragment.curSeason);
            videoDetailSeasonsSelectFragmentM70605a.m71697n0(parentFragment, R$id.fl_bottom_dialog_container);
            videoDetailSeasonsSelectFragmentM70605a.m70603w0(new Function1() { // from class: com.transsion.videodetail.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoEpisodeFragment.m86138H0(this.f65773a, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m86138H0(VideoEpisodeFragment videoEpisodeFragment, int i11) {
        C26866a.a.m104898f(C26866a.f81698a, "VideoDetailEpisode", "setSeasonSelectCallback, season:" + i11, false, 4, null);
        videoEpisodeFragment.curSeason = i11;
        videoEpisodeFragment.m86144N0(i11);
        videoEpisodeFragment.m86147R0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m86139I0(final VideoEpisodeFragment videoEpisodeFragment, View view) {
        Fragment parentFragment;
        Subject subject = videoEpisodeFragment.mMovieDetailBean;
        if (subject == null || (parentFragment = videoEpisodeFragment.getParentFragment()) == null) {
            return;
        }
        VideoDetailAllEpisodesFragment videoDetailAllEpisodesFragment = new VideoDetailAllEpisodesFragment();
        videoDetailAllEpisodesFragment.m86076H0(subject, videoEpisodeFragment.curSeason, (ResourcesSeasonList) videoEpisodeFragment.m86167s0().m86130y().m14847f());
        videoDetailAllEpisodesFragment.m71697n0(parentFragment, R$id.fl_bottom_dialog_container);
        videoDetailAllEpisodesFragment.m86077I0(new Function1() { // from class: com.transsion.videodetail.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoEpisodeFragment.m86140J0(this.f65770a, (VideoDetailMediaSource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final Unit m86140J0(VideoEpisodeFragment videoEpisodeFragment, VideoDetailMediaSource videoDetailMediaSource) {
        if (videoEpisodeFragment.lastClickTime == 0 || System.currentTimeMillis() - videoEpisodeFragment.lastClickTime > 1000) {
            videoEpisodeFragment.lastClickTime = System.currentTimeMillis();
            videoEpisodeFragment.m86143M0(videoDetailMediaSource);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m86141K0(VideoEpisodeFragment videoEpisodeFragment, View view) {
        List<ResourceDetectors> resourceDetectors;
        ResourceDetectors resourceDetectors2;
        String title;
        Subject subject = videoEpisodeFragment.mMovieDetailBean;
        if (subject == null || (resourceDetectors = subject.getResourceDetectors()) == null || (resourceDetectors2 = (ResourceDetectors) CollectionsKt.m97361k0(resourceDetectors)) == null) {
            return;
        }
        ResourceDetectorDialogFragment.Companion companion = ResourceDetectorDialogFragment.INSTANCE;
        Subject subject2 = videoEpisodeFragment.mMovieDetailBean;
        if (subject2 == null || (title = subject2.getTitle()) == null) {
            title = "";
        }
        ResourceDetectorDialogFragment resourceDetectorDialogFragmentM70385a = companion.m70385a(title, resourceDetectors2);
        FragmentManager childFragmentManager = videoEpisodeFragment.getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        resourceDetectorDialogFragmentM70385a.show(childFragmentManager, "ResourceDetectorFragment --> ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m86142L0(VideoEpisodeFragment videoEpisodeFragment, View view) {
        Navigator navigatorM61857K = TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_DETAIL");
        Subject subject = videoEpisodeFragment.mMovieDetailBean;
        Navigator.m61845x(navigatorM61857K.m61857K("subject_id", subject != null ? subject.getSubjectId() : null), videoEpisodeFragment.getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: M0 */
    private final void m86143M0(VideoDetailMediaSource item) {
        List<Object> data;
        m86167s0().m86119B(item);
        C20939b c20939b = this.videoDetailEpisodeAdapter;
        int i11 = -1;
        if (c20939b != null && (data = c20939b.getData()) != null) {
            Iterator<Object> it = data.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) it.next();
                if (item != null && videoDetailMediaSource.getSe() == item.getSe() && videoDetailMediaSource.getEp() == item.getEp()) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 >= 0) {
            C20939b c20939b2 = this.videoDetailEpisodeAdapter;
            if (i11 < (c20939b2 != null ? c20939b2.getItemCount() : 0)) {
                m86145O0(i11);
            }
        }
    }

    /* JADX INFO: renamed from: N0 */
    private final void m86144N0(int season) {
        this.curSeason = season;
        m86165q0().m70914K().mo14858q(Integer.valueOf(season));
        C20939b c20939b = this.videoDetailEpisodeAdapter;
        if (c20939b != null) {
            c20939b.mo36201n1(C21088d.f65963a.m86499a(m86167s0(), season));
        }
    }

    /* JADX INFO: renamed from: O0 */
    private final void m86145O0(int position) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (position < 0) {
            return;
        }
        try {
            C25751d mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView2 = mViewBinding.f78504h) != null) {
                recyclerView2.scrollToPosition(position);
            }
            C25751d mViewBinding2 = getMViewBinding();
            RecyclerView.AbstractC4214m layoutManager = (mViewBinding2 == null || (recyclerView = mViewBinding2.f78504h) == null) ? null : recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int i11 = this.scrollOffset;
                if (i11 <= 0) {
                    i11 = 0;
                }
                linearLayoutManager.scrollToPositionWithOffset(position, i11);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m86146Q0(VideoDetailMediaSource playingSource) {
        List<ResourcesSeason> seasons;
        C20939b c20939b = this.videoDetailEpisodeAdapter;
        if (c20939b != null) {
            c20939b.m86183F1(playingSource);
        }
        C26866a.a.m104898f(C26866a.f81698a, "VideoDetailEpisode", "setPlayingItem,--------, se:" + (playingSource != null ? Integer.valueOf(playingSource.getSe()) : null) + ", ep:" + (playingSource != null ? Integer.valueOf(playingSource.getEp()) : null), false, 4, null);
        int i11 = 0;
        if (!this.isSeasonTab) {
            Map map = (Map) m86167s0().m86125t().m14847f();
            if (map != null) {
                int i12 = 0;
                for (Map.Entry entry : map.entrySet()) {
                    if (!((Collection) entry.getValue()).isEmpty()) {
                        IntRange intRange = new IntRange(((VideoDetailMediaSource) CollectionsKt.m97359i0((List) entry.getValue())).getEp(), ((VideoDetailMediaSource) CollectionsKt.m97371u0((List) entry.getValue())).getEp());
                        Integer numValueOf = playingSource != null ? Integer.valueOf(playingSource.getEp()) : null;
                        if (numValueOf != null && intRange.m97911o(numValueOf.intValue())) {
                            String str = (String) entry.getKey();
                            this.curEpTabTitle = str;
                            C26866a.a.m104898f(C26866a.f81698a, "VideoDetailEpisode", "setPlayingItem,index:" + i12 + ", EpTabTitle:" + str, false, 4, null);
                        }
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m86167s0().m86130y().m14847f();
        if (resourcesSeasonList != null && (seasons = resourcesSeasonList.getSeasons()) != null) {
            Iterator<ResourcesSeason> it = seasons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                ResourcesSeason next = it.next();
                if (playingSource != null && next.getSe() == playingSource.getSe()) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (i11 > 0) {
            int se2 = playingSource != null ? playingSource.getSe() : 1;
            this.curSeason = se2;
            C26866a.a.m104898f(C26866a.f81698a, "VideoDetailEpisode", "setPlayingItem,  curSeason：" + se2, false, 4, null);
            m86144N0(this.curSeason);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private final void m86147R0() {
        C25751d mViewBinding;
        BLTextView bLTextView;
        BLTextView bLTextView2;
        Subject subject = this.mMovieDetailBean;
        if (subject != null && subject.isTvType()) {
            C25751d mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (bLTextView2 = mViewBinding2.f78502f) == null) {
                return;
            }
            Context context = getContext();
            bLTextView2.setText(context != null ? context.getString(com.transsnet.downloader.R$string.download_video_detail_season_index, AbstractC26039f.m102110a(this.curSeason)) : null);
            return;
        }
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 == null || !subject2.isEduType() || (mViewBinding = getMViewBinding()) == null || (bLTextView = mViewBinding.f78502f) == null) {
            return;
        }
        Context context2 = getContext();
        bLTextView.setText(context2 != null ? context2.getString(com.transsnet.downloader.R$string.download_video_detail_unit_index, AbstractC26039f.m102110a(this.curSeason)) : null);
    }

    /* JADX INFO: renamed from: S0 */
    private final void m86148S0(List list) {
        BLTextView bLTextView;
        Subject subject;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (list.size() > 1 && (subject = this.mMovieDetailBean) != null && subject.isMovieType()) {
            C25751d mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView2 = mViewBinding.f78504h) != null && recyclerView2.getItemDecorationCount() > 0) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    recyclerView2.removeItemDecorationAt(0);
                    Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
            }
            C25751d mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (recyclerView = mViewBinding2.f78504h) != null) {
                recyclerView.addItemDecoration(new C25828e(8.0f, 0.0f, 12.0f, list.size() > 6 ? 12.0f : 0.0f, 2, null));
            }
        }
        C25751d mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (bLTextView = mViewBinding3.f78506j) != null) {
            bLTextView.setVisibility(list.size() > 6 ? 0 : 8);
        }
        VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) CollectionsKt.m97361k0(list);
        if (videoDetailMediaSource != null && videoDetailMediaSource.getSe() == 0 && videoDetailMediaSource.getEp() == 0) {
            Subject subject2 = this.mMovieDetailBean;
            videoDetailMediaSource.setName(subject2 != null ? subject2.getTitle() : null);
        }
        C20939b c20939b = this.videoDetailEpisodeAdapter;
        if (c20939b != null) {
            c20939b.mo36201n1(C21088d.f65963a.m86499a(m86167s0(), this.curSeason));
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final MovieDetailViewModel m86165q0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    private final C16464n0 m86166r0() {
        return (C16464n0) this.subtitleViewModel.getValue();
    }

    /* JADX INFO: renamed from: s0 */
    private final VideoDetailViewModel m86167s0() {
        return (VideoDetailViewModel) this.videoDetailViewModel.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX INFO: renamed from: u0 */
    private final void m86168u0(ResourcesSeasonList seasonsList) {
        int se2;
        List<ResourcesSeason> seasons;
        List<ResourcesSeason> seasons2;
        if (seasonsList == null || (seasons2 = seasonsList.getSeasons()) == null || !seasons2.isEmpty()) {
            if (seasonsList == null || (seasons = seasonsList.getSeasons()) == null) {
                se2 = this.curSeason;
            } else {
                Iterator<T> it = seasons.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int se3 = ((ResourcesSeason) next).getSe();
                    do {
                        Object next2 = it.next();
                        int se4 = ((ResourcesSeason) next2).getSe();
                        if (se3 > se4) {
                            next = next2;
                            se3 = se4;
                        }
                    } while (it.hasNext());
                }
                ResourcesSeason resourcesSeason = (ResourcesSeason) next;
                if (resourcesSeason != null) {
                    se2 = resourcesSeason.getSe();
                } else {
                    se2 = this.curSeason;
                }
            }
            C26866a.a.m104898f(C26866a.f81698a, "VideoDetailEpisode", "initCurSeason, minSeason:" + se2 + "， curSeason：" + this.curSeason, false, 4, null);
            if (this.curSeason < se2) {
                this.curSeason = se2;
                m86147R0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m86169v0(VideoEpisodeFragment videoEpisodeFragment, ResourcesSeasonList resourcesSeasonList) {
        Subject subject;
        videoEpisodeFragment.m86168u0(resourcesSeasonList);
        videoEpisodeFragment.hideLoading();
        Subject subject2 = videoEpisodeFragment.mMovieDetailBean;
        boolean z11 = true;
        if ((subject2 == null || !subject2.isTvType()) && ((subject = videoEpisodeFragment.mMovieDetailBean) == null || !subject.isEduType())) {
            z11 = false;
        }
        videoEpisodeFragment.m86133C0(z11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m86170w0(VideoEpisodeFragment videoEpisodeFragment, List list) {
        videoEpisodeFragment.m86148S0(list);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Unit m86171x0(VideoEpisodeFragment videoEpisodeFragment, VideoDetailMediaSource videoDetailMediaSource) {
        videoEpisodeFragment.m86146Q0(videoDetailMediaSource);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m86172y0(VideoEpisodeFragment videoEpisodeFragment, Integer num) {
        videoEpisodeFragment.m86147R0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final Unit m86173z0(VideoEpisodeFragment videoEpisodeFragment, ResourcesSeasonList resourcesSeasonList) {
        BLTextView bLTextView;
        BLTextView bLTextView2;
        BLTextView bLTextView3;
        List<ResourcesSeason> seasons;
        int size = (resourcesSeasonList == null || (seasons = resourcesSeasonList.getSeasons()) == null) ? 1 : seasons.size();
        videoEpisodeFragment.seasonsCount = size;
        C25751d mViewBinding = videoEpisodeFragment.getMViewBinding();
        if (mViewBinding != null && (bLTextView = mViewBinding.f78502f) != null && bLTextView.getVisibility() == 0) {
            if (size == 1) {
                C25751d mViewBinding2 = videoEpisodeFragment.getMViewBinding();
                if (mViewBinding2 != null && (bLTextView3 = mViewBinding2.f78502f) != null) {
                    AbstractC26006c.m102054g(bLTextView3);
                }
            } else {
                C25751d mViewBinding3 = videoEpisodeFragment.getMViewBinding();
                if (mViewBinding3 != null && (bLTextView2 = mViewBinding3.f78502f) != null) {
                    AbstractC26006c.m102058k(bLTextView2);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m86174P0(Function1 callback) {
        this.audioSelectCallback = callback;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        Subject subject;
        BLTextView bLTextView;
        BLTextView bLTextView2;
        Object next;
        BLTextView bLTextView3;
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        m86167s0().m86130y().m14851j(this, new C20928b(new Function1() { // from class: com.transsion.videodetail.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoEpisodeFragment.m86169v0(this.f65934a, (ResourcesSeasonList) obj);
            }
        }));
        m86167s0().m86124s().m14851j(this, new C20928b(new Function1() { // from class: com.transsion.videodetail.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoEpisodeFragment.m86170w0(this.f65938a, (List) obj);
            }
        }));
        m86167s0().m86129x().m14851j(this, new C20928b(new Function1() { // from class: com.transsion.videodetail.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoEpisodeFragment.m86171x0(this.f65941a, (VideoDetailMediaSource) obj);
            }
        }));
        m86165q0().m70914K().m14851j(this, new C20928b(new Function1() { // from class: com.transsion.videodetail.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoEpisodeFragment.m86172y0(this.f65944a, (Integer) obj);
            }
        }));
        m86167s0().m86130y().m14851j(this, new C20928b(new Function1() { // from class: com.transsion.videodetail.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoEpisodeFragment.m86173z0(this.f65947a, (ResourcesSeasonList) obj);
            }
        }));
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 != null) {
            String subjectId = subject2.getSubjectId();
            List<DubsInfo> dubs = subject2.getDubs();
            this.isAudioDubs = dubs != null && (dubs.isEmpty() ^ true) && dubs.size() > 1;
            if (dubs != null) {
                Iterator<T> it = dubs.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.m97797c(((DubsInfo) next).getSubjectId(), subjectId));
                DubsInfo dubsInfo = (DubsInfo) next;
                if (dubsInfo != null && this.isAudioDubs) {
                    dubsInfo.setSelected(true);
                    C25751d mViewBinding = getMViewBinding();
                    if (mViewBinding != null && (bLTextView3 = mViewBinding.f78505i) != null) {
                        bLTextView3.setText(dubsInfo.getLanName());
                    }
                }
            }
        }
        Subject subject3 = this.mMovieDetailBean;
        if ((subject3 == null || !subject3.isMovieType()) && ((subject = this.mMovieDetailBean) == null || !subject.isTvType())) {
            C25751d mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (bLTextView = mViewBinding2.f78505i) != null) {
                AbstractC26006c.m102054g(bLTextView);
            }
        } else {
            C25751d mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (bLTextView2 = mViewBinding3.f78505i) != null) {
                bLTextView2.setVisibility(this.isAudioDubs ? 0 : 8);
            }
        }
        m86166r0().m71822d().m14851j(this, new C20928b(new Function1() { // from class: com.transsion.videodetail.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoEpisodeFragment.m86131A0(this.f65760a, (Pair) obj);
            }
        }));
        m86166r0().m71821c().m14851j(this, new C20928b(new Function1() { // from class: com.transsion.videodetail.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoEpisodeFragment.m86132B0(this.f65766a, (List) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        BLTextView bLTextView;
        BLTextView bLTextView2;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        List<ResourceDetectors> resourceDetectors;
        ResourceDetectors resourceDetectors2;
        C25751d mViewBinding;
        AppCompatTextView appCompatTextView3;
        BLTextView bLTextView3;
        Intrinsics.m97802h(view, "view");
        C25751d mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (bLTextView3 = mViewBinding2.f78506j) != null) {
            bLTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VideoEpisodeFragment.m86139I0(this.f65757a, view2);
                }
            });
        }
        Subject subject = this.mMovieDetailBean;
        if (subject != null && (resourceDetectors = subject.getResourceDetectors()) != null && (resourceDetectors2 = (ResourceDetectors) CollectionsKt.m97361k0(resourceDetectors)) != null && (mViewBinding = getMViewBinding()) != null && (appCompatTextView3 = mViewBinding.f78500d) != null) {
            appCompatTextView3.setText(resourceDetectors2.getUploadBy());
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.transsion.videodetail.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VideoEpisodeFragment.m86141K0(this.f65782a, view2);
            }
        };
        C25751d mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (appCompatTextView2 = mViewBinding3.f78499c) != null) {
            appCompatTextView2.setOnClickListener(onClickListener);
        }
        C25751d mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (appCompatTextView = mViewBinding4.f78500d) != null) {
            appCompatTextView.setOnClickListener(onClickListener);
        }
        C25751d mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (appCompatImageView = mViewBinding5.f78498b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VideoEpisodeFragment.m86142L0(this.f65785a, view2);
                }
            });
        }
        C25751d mViewBinding6 = getMViewBinding();
        if (mViewBinding6 != null && (bLTextView2 = mViewBinding6.f78505i) != null) {
            bLTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.l1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VideoEpisodeFragment.m86135E0(this.f65788a, view2);
                }
            });
        }
        C25751d mViewBinding7 = getMViewBinding();
        if (mViewBinding7 != null && (bLTextView = mViewBinding7.f78502f) != null) {
            bLTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.m1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VideoEpisodeFragment.m86137G0(this.f65793a, view2);
                }
            });
        }
        C25751d mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null) {
            Subject subject2 = this.mMovieDetailBean;
            if (subject2 != null && subject2.isTvType()) {
                BLTextView ivSeasons = mViewBinding8.f78502f;
                Intrinsics.m97801g(ivSeasons, "ivSeasons");
                AbstractC26006c.m102058k(ivSeasons);
                BLTextView bLTextView4 = mViewBinding8.f78502f;
                Context context = getContext();
                bLTextView4.setText(context != null ? context.getString(com.transsnet.downloader.R$string.download_video_detail_season_index, AbstractC26039f.m102110a(this.curSeason)) : null);
                return;
            }
            Subject subject3 = this.mMovieDetailBean;
            if (subject3 == null || !subject3.isEduType()) {
                BLTextView ivSeasons2 = mViewBinding8.f78502f;
                Intrinsics.m97801g(ivSeasons2, "ivSeasons");
                AbstractC26006c.m102054g(ivSeasons2);
            } else {
                BLTextView ivSeasons3 = mViewBinding8.f78502f;
                Intrinsics.m97801g(ivSeasons3, "ivSeasons");
                AbstractC26006c.m102058k(ivSeasons3);
                BLTextView bLTextView5 = mViewBinding8.f78502f;
                Context context2 = getContext();
                bLTextView5.setText(context2 != null ? context2.getString(com.transsnet.downloader.R$string.download_video_detail_unit_index, AbstractC26039f.m102110a(this.curSeason)) : null);
            }
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data_key_resource_detectors") : null;
        this.mMovieDetailBean = serializable instanceof Subject ? (Subject) serializable : null;
        Bundle arguments2 = getArguments();
        this.moduleName = arguments2 != null ? arguments2.getString("module_name") : null;
        Bundle arguments3 = getArguments();
        this.curSeason = arguments3 != null ? arguments3.getInt("season") : 1;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C25751d getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25751d c25751dM101275c = C25751d.m101275c(inflater);
        Intrinsics.m97801g(c25751dM101275c, "inflate(...)");
        return c25751dM101275c;
    }
}
