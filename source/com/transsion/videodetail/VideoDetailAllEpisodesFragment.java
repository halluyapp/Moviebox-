package com.transsion.videodetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.transsion.moviedetail.fragment.VideoDetailSeasonsSelectFragment;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.ResourcesSeason;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.transsion.videodetail.adapter.C20939b;
import com.transsion.videodetail.bean.VideoDetailMediaSource;
import com.transsion.videodetail.util.C21088d;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import mg.C25825b;
import ng.AbstractC26006c;
import p586lx.C25749b;
import p620nn.AbstractC26039f;
import p765s6.InterfaceC27566d;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J4\u0010'\u001a\u00020\u00052%\u0010&\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"¢\u0006\u0004\b'\u0010(R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR5\u0010G\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m97100d2 = {"Lcom/transsion/videodetail/VideoDetailAllEpisodesFragment;", "Lcom/transsion/play/detail/fragment/BaseBottomDialogFragment;", "Llx/b;", "<init>", "()V", "", "K0", "", "season", "G0", "(I)V", "Lcom/transsion/videodetail/bean/VideoDetailMediaSource;", "playingSource", "J0", "(Lcom/transsion/videodetail/bean/VideoDetailMediaSource;)V", "y0", "Landroid/view/LayoutInflater;", "inflater", "x0", "(Landroid/view/LayoutInflater;)Llx/b;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "Lcom/transsion/moviedetailapi/bean/Subject;", "mSubject", "curSeason", "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;", "seasonList", "H0", "(Lcom/transsion/moviedetailapi/bean/Subject;ILcom/transsion/moviedetailapi/bean/ResourcesSeasonList;)V", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", WebConstants.FIELD_ITEM, "callback", "I0", "(Lkotlin/jvm/functions/Function1;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/moviedetailapi/bean/Subject;", "c", "I", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;", "Lcom/transsion/videodetail/adapter/b;", "e", "Lcom/transsion/videodetail/adapter/b;", "videoDetailEpisodeAdapter", "Lcom/transsion/videodetail/VideoDetailViewModel;", "f", "Lkotlin/Lazy;", "w0", "()Lcom/transsion/videodetail/VideoDetailViewModel;", "videoDetailViewModel", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "g", "v0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "", "h", "J", "lastClickTime", "i", "Ljava/lang/Integer;", "seasonsCount", "j", "Lkotlin/jvm/functions/Function1;", "episodeSelectCallback", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class VideoDetailAllEpisodesFragment extends BaseBottomDialogFragment<C25749b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Subject mSubject;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ResourcesSeasonList seasonList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C20939b videoDetailEpisodeAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long lastClickTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Integer seasonsCount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Function1 episodeSelectCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy videoDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(VideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.VideoDetailAllEpisodesFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.VideoDetailAllEpisodesFragment$special$$inlined$activityViewModels$default$2
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
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.VideoDetailAllEpisodesFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.VideoDetailAllEpisodesFragment$special$$inlined$activityViewModels$default$4
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

    /* JADX INFO: renamed from: com.transsion.videodetail.VideoDetailAllEpisodesFragment$a */
    static final class C20911a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65692a;

        C20911a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65692a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65692a;
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
            this.f65692a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m86056A0(VideoDetailAllEpisodesFragment videoDetailAllEpisodesFragment, View view) {
        videoDetailAllEpisodesFragment.m71696l0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m86057B0(VideoDetailAllEpisodesFragment videoDetailAllEpisodesFragment, C20939b c20939b, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        if (videoDetailAllEpisodesFragment.lastClickTime == 0 || System.currentTimeMillis() - videoDetailAllEpisodesFragment.lastClickTime > 1000) {
            videoDetailAllEpisodesFragment.lastClickTime = System.currentTimeMillis();
            VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) c20939b.m36182f0(i11);
            Function1 function1 = videoDetailAllEpisodesFragment.episodeSelectCallback;
            if (function1 != null) {
                function1.invoke(videoDetailMediaSource);
            }
            BaseBottomDialogFragment.m71695m0(videoDetailAllEpisodesFragment, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m86058C0(final VideoDetailAllEpisodesFragment videoDetailAllEpisodesFragment, View view) {
        Integer seNum = videoDetailAllEpisodesFragment.seasonsCount;
        if (seNum == null) {
            Subject subject = videoDetailAllEpisodesFragment.mSubject;
            seNum = subject != null ? subject.getSeNum() : null;
        }
        if (seNum != null) {
            VideoDetailSeasonsSelectFragment.Companion companion = VideoDetailSeasonsSelectFragment.INSTANCE;
            ResourcesSeasonList resourcesSeasonList = videoDetailAllEpisodesFragment.seasonList;
            Subject subject2 = videoDetailAllEpisodesFragment.mSubject;
            VideoDetailSeasonsSelectFragment videoDetailSeasonsSelectFragmentM70605a = companion.m70605a(resourcesSeasonList, subject2 != null ? subject2.getSubjectType() : null);
            videoDetailSeasonsSelectFragmentM70605a.m70604x0(videoDetailAllEpisodesFragment.curSeason);
            videoDetailSeasonsSelectFragmentM70605a.m71697n0(videoDetailAllEpisodesFragment, R$id.fl_season_container);
            videoDetailSeasonsSelectFragmentM70605a.m70603w0(new Function1() { // from class: com.transsion.videodetail.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoDetailAllEpisodesFragment.m86059D0(this.f65946a, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m86059D0(VideoDetailAllEpisodesFragment videoDetailAllEpisodesFragment, int i11) {
        videoDetailAllEpisodesFragment.curSeason = i11;
        videoDetailAllEpisodesFragment.m86062G0(i11);
        videoDetailAllEpisodesFragment.m86064K0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public static final Unit m86060E0(VideoDetailAllEpisodesFragment videoDetailAllEpisodesFragment, ResourcesSeasonList resourcesSeasonList) {
        AppCompatTextView appCompatTextView;
        BLTextView bLTextView;
        AppCompatTextView appCompatTextView2;
        BLTextView bLTextView2;
        List<ResourcesSeason> seasons;
        Integer numValueOf = (resourcesSeasonList == null || (seasons = resourcesSeasonList.getSeasons()) == null) ? 1 : Integer.valueOf(seasons.size());
        videoDetailAllEpisodesFragment.seasonsCount = numValueOf;
        if (numValueOf.intValue() == 1) {
            C25749b c25749b = (C25749b) videoDetailAllEpisodesFragment.getMViewBinding();
            if (c25749b != null && (bLTextView2 = c25749b.f78490h) != null) {
                AbstractC26006c.m102055h(bLTextView2);
            }
            C25749b c25749b2 = (C25749b) videoDetailAllEpisodesFragment.getMViewBinding();
            if (c25749b2 != null && (appCompatTextView2 = c25749b2.f78489g) != null) {
                AbstractC26006c.m102058k(appCompatTextView2);
            }
        } else {
            C25749b c25749b3 = (C25749b) videoDetailAllEpisodesFragment.getMViewBinding();
            if (c25749b3 != null && (bLTextView = c25749b3.f78490h) != null) {
                AbstractC26006c.m102058k(bLTextView);
            }
            C25749b c25749b4 = (C25749b) videoDetailAllEpisodesFragment.getMViewBinding();
            if (c25749b4 != null && (appCompatTextView = c25749b4.f78489g) != null) {
                AbstractC26006c.m102055h(appCompatTextView);
            }
        }
        videoDetailAllEpisodesFragment.m86064K0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m86061F0(VideoDetailAllEpisodesFragment videoDetailAllEpisodesFragment, VideoDetailMediaSource videoDetailMediaSource) {
        videoDetailAllEpisodesFragment.m86063J0(videoDetailMediaSource);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: G0 */
    private final void m86062G0(int season) {
        this.curSeason = season;
        m86072v0().m70914K().mo14858q(Integer.valueOf(season));
        C20939b c20939b = this.videoDetailEpisodeAdapter;
        if (c20939b != null) {
            c20939b.mo36201n1(C21088d.f65963a.m86499a(m86073w0(), season));
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m86063J0(VideoDetailMediaSource playingSource) {
        int i11;
        List<ResourcesSeason> seasons;
        C20939b c20939b = this.videoDetailEpisodeAdapter;
        if (c20939b != null) {
            c20939b.m86183F1(playingSource);
        }
        C26866a.a.m104898f(C26866a.f81698a, "VideoDetailEpisode", "setPlayingItem,--------, se:" + (playingSource != null ? Integer.valueOf(playingSource.getSe()) : null) + ", ep:" + (playingSource != null ? Integer.valueOf(playingSource.getEp()) : null), false, 4, null);
        ResourcesSeasonList resourcesSeasonList = (ResourcesSeasonList) m86073w0().m86130y().m14847f();
        if (resourcesSeasonList == null || (seasons = resourcesSeasonList.getSeasons()) == null) {
            i11 = 0;
        } else {
            Iterator<ResourcesSeason> it = seasons.iterator();
            i11 = 0;
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
            this.curSeason = playingSource != null ? playingSource.getSe() : 1;
        }
        Map map = (Map) m86073w0().m86125t().m14847f();
        if (map != null) {
            int i12 = 0;
            for (Map.Entry entry : map.entrySet()) {
                if (!((Collection) entry.getValue()).isEmpty()) {
                    IntRange intRange = new IntRange(((VideoDetailMediaSource) CollectionsKt.m97359i0((List) entry.getValue())).getEp(), ((VideoDetailMediaSource) CollectionsKt.m97371u0((List) entry.getValue())).getEp());
                    Integer numValueOf = playingSource != null ? Integer.valueOf(playingSource.getEp()) : null;
                    if (numValueOf != null && intRange.m97911o(numValueOf.intValue())) {
                        C26866a.a.m104898f(C26866a.f81698a, "VideoDetailEpisode", "setPlayingItem,index:" + i12 + ", EpTabTitle:" + entry.getKey(), false, 4, null);
                    }
                }
                i12++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K0 */
    private final void m86064K0() {
        AppCompatTextView appCompatTextView;
        BLTextView bLTextView;
        AppCompatTextView appCompatTextView2;
        BLTextView bLTextView2;
        Subject subject = this.mSubject;
        if (subject != null) {
            Integer subjectType = subject.getSubjectType();
            int value = SubjectType.EDUCATION.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                C25749b c25749b = (C25749b) getMViewBinding();
                if (c25749b != null && (bLTextView2 = c25749b.f78490h) != null) {
                    Context context = getContext();
                    bLTextView2.setText(context != null ? context.getString(com.transsnet.downloader.R$string.download_video_detail_unit_index, AbstractC26039f.m102110a(this.curSeason)) : null);
                }
                C25749b c25749b2 = (C25749b) getMViewBinding();
                if (c25749b2 == null || (appCompatTextView2 = c25749b2.f78489g) == null) {
                    return;
                }
                appCompatTextView2.setText(Utils.m27275a().getString(com.transsnet.downloader.R$string.download_series_all_lessons));
                return;
            }
        }
        C25749b c25749b3 = (C25749b) getMViewBinding();
        if (c25749b3 != null && (bLTextView = c25749b3.f78490h) != null) {
            Context context2 = getContext();
            bLTextView.setText(context2 != null ? context2.getString(com.transsnet.downloader.R$string.download_video_detail_season_index, AbstractC26039f.m102110a(this.curSeason)) : null);
        }
        C25749b c25749b4 = (C25749b) getMViewBinding();
        if (c25749b4 == null || (appCompatTextView = c25749b4.f78489g) == null) {
            return;
        }
        appCompatTextView.setText(Utils.m27275a().getString(com.transsnet.downloader.R$string.download_series_all_episodes));
    }

    /* JADX INFO: renamed from: v0 */
    private final MovieDetailViewModel m86072v0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: w0 */
    private final VideoDetailViewModel m86073w0() {
        return (VideoDetailViewModel) this.videoDetailViewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    private final void m86074y0() {
        ProgressBar progressBar;
        C26866a.a.m104898f(C26866a.f81698a, "VideoDetailEpisode", "initFirstData,--------", false, 4, null);
        C25749b c25749b = (C25749b) getMViewBinding();
        if (c25749b != null && (progressBar = c25749b.f78487e) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        C20939b c20939b = this.videoDetailEpisodeAdapter;
        if (c20939b != null) {
            c20939b.mo36201n1(C21088d.f65963a.m86499a(m86073w0(), this.curSeason));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final Unit m86075z0(VideoDetailAllEpisodesFragment videoDetailAllEpisodesFragment, Integer num) {
        videoDetailAllEpisodesFragment.m86064K0();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m86076H0(Subject mSubject, int curSeason, ResourcesSeasonList seasonList) {
        Intrinsics.m97802h(mSubject, "mSubject");
        this.mSubject = mSubject;
        this.curSeason = curSeason;
        this.seasonList = seasonList;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m86077I0(Function1 callback) {
        this.episodeSelectCallback = callback;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        C25749b c25749b = (C25749b) getMViewBinding();
        if (c25749b != null) {
            c25749b.f78486d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoDetailAllEpisodesFragment.m86056A0(this.f65787a, view);
                }
            });
            BLTextView bLTextView = c25749b.f78490h;
            Context context = getContext();
            bLTextView.setText(context != null ? context.getString(com.transsnet.downloader.R$string.download_video_detail_season_index, AbstractC26039f.m102110a(this.curSeason)) : null);
            RecyclerView recyclerView = c25749b.f78488f;
            int iM27313a = AbstractC5776a0.m27313a(4.0f);
            recyclerView.setLayoutManager(new NpaGridLayoutManager(recyclerView.getContext(), 6));
            int i11 = iM27313a * 2;
            recyclerView.addItemDecoration(new C25825b(iM27313a, iM27313a, i11, i11));
            final C20939b c20939b = new C20939b(SubjectType.TV.getValue(), false, R$layout.item_video_detail_episode);
            c20939b.m36227w1(new InterfaceC27566d() { // from class: com.transsion.videodetail.m0
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                    VideoDetailAllEpisodesFragment.m86057B0(this.f65791a, c20939b, baseQuickAdapter, view, i12);
                }
            });
            this.videoDetailEpisodeAdapter = c20939b;
            c25749b.f78488f.setAdapter(c20939b);
            m86074y0();
            c25749b.f78490h.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoDetailAllEpisodesFragment.m86058C0(this.f65933a, view);
                }
            });
        }
        m86073w0().m86130y().m14851j(this, new C20911a(new Function1() { // from class: com.transsion.videodetail.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoDetailAllEpisodesFragment.m86060E0(this.f65937a, (ResourcesSeasonList) obj);
            }
        }));
        m86073w0().m86129x().m14851j(this, new C20911a(new Function1() { // from class: com.transsion.videodetail.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoDetailAllEpisodesFragment.m86061F0(this.f65940a, (VideoDetailMediaSource) obj);
            }
        }));
        m86072v0().m70914K().m14851j(this, new C20911a(new Function1() { // from class: com.transsion.videodetail.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoDetailAllEpisodesFragment.m86075z0(this.f65943a, (Integer) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C25749b getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25749b c25749bM101267c = C25749b.m101267c(inflater);
        Intrinsics.m97801g(c25749bM101267c, "inflate(...)");
        return c25749bM101267c;
    }
}
