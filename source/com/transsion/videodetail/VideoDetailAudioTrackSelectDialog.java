package com.transsion.videodetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.transsion.player.longvideo.helper.C16464n0;
import com.transsion.videodetail.adapter.C20938a;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p528ju.C24469a;
import p586lx.C25750c;
import p765s6.InterfaceC27566d;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\f\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0004R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R3\u00104\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m97100d2 = {"Lcom/transsion/videodetail/VideoDetailAudioTrackSelectDialog;", "Lcom/transsion/play/detail/fragment/BaseBottomDialogFragment;", "Llx/c;", "<init>", "()V", "Lkotlin/Function1;", "Lcom/transsion/moviedetailapi/bean/DubsInfo;", "Lkotlin/ParameterName;", "name", "info", "", "callback", "z0", "(Lkotlin/jvm/functions/Function1;)V", "", "subjectId", "A0", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "u0", "(Landroid/view/LayoutInflater;)Llx/c;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "mSubjectId", "Lcom/transsion/videodetail/adapter/a;", "c", "Lcom/transsion/videodetail/adapter/a;", "adapter", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "s0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "Lcom/transsion/player/longvideo/helper/n0;", "e", "t0", "()Lcom/transsion/player/longvideo/helper/n0;", "subtitleViewModel", "", "f", "J", "lastClickTime", "g", "Lkotlin/jvm/functions/Function1;", "audioSelectCallback", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class VideoDetailAudioTrackSelectDialog extends BaseBottomDialogFragment<C25750c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C20938a adapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.VideoDetailAudioTrackSelectDialog$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.VideoDetailAudioTrackSelectDialog$special$$inlined$activityViewModels$default$2
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
    private final Lazy subtitleViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C16464n0.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.VideoDetailAudioTrackSelectDialog$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.VideoDetailAudioTrackSelectDialog$special$$inlined$activityViewModels$default$4
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

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long lastClickTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function1 audioSelectCallback;

    /* JADX INFO: renamed from: com.transsion.videodetail.VideoDetailAudioTrackSelectDialog$a */
    static final class C20916a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65699a;

        C20916a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65699a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65699a;
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
            this.f65699a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final MovieDetailViewModel m86083s0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    private final C16464n0 m86084t0() {
        return (C16464n0) this.subtitleViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m86085v0(VideoDetailAudioTrackSelectDialog videoDetailAudioTrackSelectDialog, List list) {
        ProgressBar progressBar;
        C26866a.f81698a.m104912c("Audio_Subtitle", "AudioTrack ---- use subtitle " + (list != null ? Integer.valueOf(list.size()) : null), true);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C24469a c24469a = (C24469a) it.next();
                DubsInfo dubsInfo = new DubsInfo(null, c24469a.m96011b().getLanName(), c24469a.m96011b().getLan(), false, 9, null);
                dubsInfo.setSelected(c24469a.m96015f());
                dubsInfo.setSubtitle(true);
                arrayList.add(dubsInfo);
            }
        }
        C25750c c25750c = (C25750c) videoDetailAudioTrackSelectDialog.getMViewBinding();
        if (c25750c != null && (progressBar = c25750c.f78494d) != null) {
            AbstractC26006c.m102054g(progressBar);
        }
        C20938a c20938a = videoDetailAudioTrackSelectDialog.adapter;
        if (c20938a != null) {
            c20938a.mo36201n1(arrayList);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m86086w0(VideoDetailAudioTrackSelectDialog videoDetailAudioTrackSelectDialog, Pair pair) {
        List listL;
        ProgressBar progressBar;
        List<DubsInfo> dubs;
        Subject subject = (Subject) pair.getSecond();
        if (subject == null || (dubs = subject.getDubs()) == null) {
            listL = CollectionsKt.m97506l();
        } else {
            List<DubsInfo> list = dubs;
            listL = new ArrayList(CollectionsKt.m97516v(list, 10));
            for (DubsInfo dubsInfo : list) {
                C26866a.a.m104899g(C26866a.f81698a, "The dubsInfo.id is " + dubsInfo.getSubjectId() + ", the subjectId: $" + videoDetailAudioTrackSelectDialog.mSubjectId, false, 2, null);
                dubsInfo.setSelected(Intrinsics.m97797c(dubsInfo.getSubjectId(), videoDetailAudioTrackSelectDialog.mSubjectId));
                listL.add(dubsInfo);
            }
        }
        if (listL.size() > 1) {
            C25750c c25750c = (C25750c) videoDetailAudioTrackSelectDialog.getMViewBinding();
            if (c25750c != null && (progressBar = c25750c.f78494d) != null) {
                AbstractC26006c.m102054g(progressBar);
            }
            C20938a c20938a = videoDetailAudioTrackSelectDialog.adapter;
            if (c20938a != null) {
                c20938a.mo36201n1(listL);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m86087x0(VideoDetailAudioTrackSelectDialog videoDetailAudioTrackSelectDialog, View view) {
        BaseBottomDialogFragment.m71695m0(videoDetailAudioTrackSelectDialog, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m86088y0(VideoDetailAudioTrackSelectDialog videoDetailAudioTrackSelectDialog, C20938a c20938a, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        if (videoDetailAudioTrackSelectDialog.lastClickTime == 0 || System.currentTimeMillis() - videoDetailAudioTrackSelectDialog.lastClickTime > 1000) {
            videoDetailAudioTrackSelectDialog.lastClickTime = System.currentTimeMillis();
            DubsInfo dubsInfo = (DubsInfo) c20938a.getItem(i11);
            if (dubsInfo.getIsSubtitle()) {
                List<C24469a> list = (List) videoDetailAudioTrackSelectDialog.m86084t0().m71821c().m14847f();
                if (list != null) {
                    for (C24469a c24469a : list) {
                        if (Intrinsics.m97797c(c24469a.m96011b().getLan(), dubsInfo.getLanCode())) {
                            c24469a.m96021l(true);
                            C26866a.f81698a.m104912c("Audio_Subtitle", "详情页 字幕选择了, name:" + c24469a.m96011b().getLanName() + ", " + c24469a.m96011b().getLan() + ", " + c24469a.m96013d(), true);
                            videoDetailAudioTrackSelectDialog.m86084t0().m71820b().mo14855n(c24469a);
                        } else {
                            c24469a.m96021l(false);
                        }
                    }
                }
            } else {
                Function1 function1 = videoDetailAudioTrackSelectDialog.audioSelectCallback;
                if (function1 != null) {
                    function1.invoke(c20938a.getItem(i11));
                }
            }
            BaseBottomDialogFragment.m71695m0(videoDetailAudioTrackSelectDialog, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m86089A0(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        this.mSubjectId = subjectId;
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
        List<DubsInfo> dubs;
        C25750c c25750c = (C25750c) getMViewBinding();
        int size = 0;
        if (c25750c != null) {
            c25750c.f78493c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoDetailAudioTrackSelectDialog.m86087x0(this.f65949a, view);
                }
            });
            ProgressBar pbLoading = c25750c.f78494d;
            Intrinsics.m97801g(pbLoading, "pbLoading");
            AbstractC26006c.m102058k(pbLoading);
            RecyclerView recyclerView = c25750c.f78495e;
            Context context = getContext();
            recyclerView.setLayoutManager((context == null || !AbstractC14556b.m65670a(context)) ? new NpaLinearLayoutManager(requireContext(), 1, false) : new NpaGridLayoutManager(requireContext(), 2));
            RecyclerView recyclerView2 = c25750c.f78495e;
            final C20938a c20938a = new C20938a();
            this.adapter = c20938a;
            c20938a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.videodetail.t0
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    VideoDetailAudioTrackSelectDialog.m86088y0(this.f65952a, c20938a, baseQuickAdapter, view, i11);
                }
            });
            recyclerView2.setAdapter(c20938a);
        }
        MovieDetailViewModel movieDetailViewModelM86083s0 = m86083s0();
        movieDetailViewModelM86083s0.m70910F().m14851j(this, new C20916a(new Function1() { // from class: com.transsion.videodetail.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoDetailAudioTrackSelectDialog.m86086w0(this.f65955a, (Pair) obj);
            }
        }));
        Pair pair = (Pair) movieDetailViewModelM86083s0.m70910F().m14847f();
        if (pair != null) {
            Subject subject = (Subject) pair.getSecond();
            List<DubsInfo> dubs2 = subject != null ? subject.getDubs() : null;
            if (dubs2 != null && !dubs2.isEmpty()) {
                Subject subject2 = (Subject) pair.getSecond();
                if (subject2 != null && (dubs = subject2.getDubs()) != null) {
                    size = dubs.size();
                }
                if (size > 1) {
                    return;
                }
            }
        }
        C26866a.f81698a.m104912c("Audio_Subtitle", "AudioTrack try use subtitle~~~", true);
        m86084t0().m71821c().m14851j(this, new C20916a(new Function1() { // from class: com.transsion.videodetail.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoDetailAudioTrackSelectDialog.m86085v0(this.f65965a, (List) obj);
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
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C25750c getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25750c c25750cM101271c = C25750c.m101271c(inflater);
        Intrinsics.m97801g(c25750cM101271c, "inflate(...)");
        return c25750cM101271c;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m86091z0(Function1 callback) {
        this.audioSelectCallback = callback;
    }
}
