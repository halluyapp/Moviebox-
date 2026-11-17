package com.transsion.ugcvideodetail.fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.viewpager2.widget.ViewPager2;
import ck.C5118o;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.report.C14486e;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.player.longvideo.constants.LongVodContentType;
import com.transsion.player.longvideo.constants.LongVodPageType;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.R$layout;
import com.transsion.ugcvideodetail.activity.UGCVideoDetailActivity;
import com.transsion.ugcvideodetail.api.UGCVideoType;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.ugcvideodetail.api.bean.UGCVideoList;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayInfo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
import com.transsion.ugcvideodetail.hepler.C20314e;
import com.transsion.ugcvideodetail.hepler.UGCVideoFloatManager;
import com.transsion.ugcvideodetail.hepler.UGCVideoPlayFrom;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import com.transsion.ugcvideodetail.widget.UGCLocalVideoDetailInfoView;
import com.transsion.ugcvideodetail.widget.UGCVideoDetailAboutCourseView;
import com.transsion.ugcvideodetail.widget.UGCVideoDetailInfoView;
import com.transsion.ugcvideodetail.widget.UGCVideoDetailPlayListView;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.videofloat.bean.FloatPlayType;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jo.InterfaceC24450a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mo.C25894a;
import net.lucode.hackware.magicindicator.MagicIndicator;
import ng.AbstractC26006c;
import p356ds.AbstractC23048b;
import p550kj.C24655b;
import p553ko.C24715a;
import p553ko.C24717c;
import p648oj.InterfaceC26261i1;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p743rh.C27287m;
import p755rx.C27425a;
import p824ux.InterfaceC28047a;
import p885wv.C28449i;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 t2\u00020\u0001:\u0001uB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u0019\u0010\u001f\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J%\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0006H\u0014¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010,J\u0011\u0010-\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b-\u0010.J\u0011\u0010/\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\u0003J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\u0003J\u000f\u00102\u001a\u00020\u0006H\u0014¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\u0003J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002042\u0006\u00107\u001a\u00020\u001aH\u0016¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b:\u00106J\u0017\u0010=\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020;H\u0014¢\u0006\u0004\b=\u0010>J\u0011\u0010@\u001a\u0004\u0018\u00010?H\u0014¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010\u0003J\u000f\u0010C\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010\u0003R\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010KR\u0018\u0010R\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010KR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010XR\u0018\u0010`\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010KR\u001a\u0010c\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\ba\u0010K\u001a\u0004\bb\u0010.R\u001a\u0010f\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\bd\u0010K\u001a\u0004\be\u0010.R\u001c\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u0010m\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010jR\u001c\u0010o\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010jR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006v"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailFragment;", "Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailBaseFragment;", "<init>", "()V", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "video", "", "E1", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "previousVideo", "w1", "detail", "D1", "C1", "loadData", "", "errorMsg", "x1", "(Ljava/lang/String;)V", "r1", "A1", "l1", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoPlayInfo;", "playInfo", "p1", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideoPlayInfo;)V", "", "i1", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideoPlayInfo;)Z", "B1", "j1", "v1", "", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoPlayStream;", "videoDetailStream", "", "Lko/c;", "o1", "(Ljava/util/List;)Ljava/util/List;", "receiveArguments", "initViewData", "F0", "H0", "isAudioShowNoNetworkLayout", "()Z", "w0", "()Ljava/lang/String;", "B0", "initViewModel", TmcConstants.NAVIGATION_ON_START, "q0", "retryLoadData", "Landroid/view/View;", "getNoNetworkView", "()Landroid/view/View;", "isShowTitleLayout", "getEmptyView", "(Z)Landroid/view/View;", "getLoadingView", "Lcom/transsion/videofloat/bean/FloatActionType;", "actionType", "V0", "(Lcom/transsion/videofloat/bean/FloatActionType;)Z", "Lrx/a;", "u0", "()Lrx/a;", "logResume", "logPause", "Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "n", "Lkotlin/Lazy;", "m1", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "detailViewModel", "o", "Ljava/lang/String;", "ops", TtmlNode.TAG_P, "collectionId", CampaignEx.JSON_KEY_AD_Q, "subjectId", CampaignEx.JSON_KEY_AD_R, "fromOptId", "", "s", "I", "bottomFragmentSelected", "t", "Z", "withoutHistory", TmcStartParams.KEY_URL_SHORT, "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "ugcVideo", "v", "showNetErr", "w", "previousUgcVideoId", "x", "x0", "PAGE_NAME", "y", "getTAG", "TAG", "Landroidx/lifecycle/c0;", "Lcom/transsion/baselib/db/video/UGCVideoDetailPlayBean;", "z", "Landroidx/lifecycle/c0;", "historyObserver", "A", "detailObserver", "B", "playInfoObserver", "", "C", "J", "resumeTimeStamp", "D", "a", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCVideoDetailFragment extends UGCVideoDetailBaseFragment {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String collectionId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private String fromOptId;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int bottomFragmentSelected;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean withoutHistory;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private UGCVideo ugcVideo;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean showNetErr;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private String previousUgcVideoId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Lazy detailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String PAGE_NAME = "/ugc_video/detail";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String TAG = "UGCVideoDetail";

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC3189c0 historyObserver = new InterfaceC3189c0() { // from class: com.transsion.ugcvideodetail.fragment.w0
        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final void onChanged(Object obj) {
            UGCVideoDetailFragment.m83920q1(this.f64329a, (UGCVideoDetailPlayBean) obj);
        }
    };

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final InterfaceC3189c0 detailObserver = new InterfaceC3189c0() { // from class: com.transsion.ugcvideodetail.fragment.x0
        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final void onChanged(Object obj) {
            UGCVideoDetailFragment.m83914k1(this.f64332a, (UGCVideo) obj);
        }
    };

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final InterfaceC3189c0 playInfoObserver = new InterfaceC3189c0() { // from class: com.transsion.ugcvideodetail.fragment.y0
        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final void onChanged(Object obj) {
            UGCVideoDetailFragment.m83924u1(this.f64334a, (UGCVideoPlayInfo) obj);
        }
    };

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCVideoDetailFragment m83930a() {
            return new UGCVideoDetailFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment$b */
    static final class C20211b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64216a;

        C20211b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64216a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64216a;
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
            this.f64216a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment$c */
    public static final class C20212c implements InterfaceC28047a {
        C20212c() {
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: a */
        public boolean mo70368a(C27425a c27425a) {
            return UGCVideoFloatManager.f64340b.m84044q(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: b */
        public void mo70369b(C27425a c27425a) {
            UGCVideoFloatManager uGCVideoFloatManager = UGCVideoFloatManager.f64340b;
            uGCVideoFloatManager.m84042o();
            uGCVideoFloatManager.m84045s(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: c */
        public void mo70370c(C27425a c27425a) {
            InterfaceC28047a.a.m109026a(this, c27425a);
            UGCVideoFloatManager.f64340b.m84043p(c27425a);
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment$d */
    public static final class C20213d implements InterfaceC24450a.b {
        C20213d() {
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: a */
        public void mo70371a() {
            UGCVideoDetailFragment.this.m83913j1();
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: b */
        public boolean mo70372b() {
            String ugcVideoId;
            if (UGCVideoDetailFragment.this.showNetErr && C27287m.f83003a.m106330e() && (ugcVideoId = UGCVideoDetailFragment.this.getUgcVideoId()) != null) {
                UGCVideoDetailFragment uGCVideoDetailFragment = UGCVideoDetailFragment.this;
                uGCVideoDetailFragment.m83916m1().m84280c0(ugcVideoId, uGCVideoDetailFragment.collectionId);
            }
            return UGCVideoDetailFragment.this.showNetErr;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: c */
        public boolean mo70373c(FloatActionType actionType) {
            Intrinsics.m97802h(actionType, "actionType");
            return UGCVideoDetailFragment.this.mo83822V0(actionType);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: d */
        public void mo70374d(LongVodUiType uiType) {
            UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
            Intrinsics.m97802h(uiType, "uiType");
            UGCVideoDetailFragment.this.m83844O0(uiType);
            boolean z11 = uiType != LongVodUiType.MIDDLE;
            C20314e bottomRecHelper = UGCVideoDetailFragment.this.getBottomRecHelper();
            if (bottomRecHelper != null) {
                bottomRecHelper.m84094s(z11);
            }
            UGCVideoDetailFragment.this.m83852m0();
            C28449i mViewBinding = UGCVideoDetailFragment.this.getMViewBinding();
            if (mViewBinding == null || (uGCVideoDetailPlayListView = mViewBinding.f87332n) == null) {
                return;
            }
            uGCVideoDetailPlayListView.pauseAnimatedImageSpans(z11);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: e */
        public View mo70375e() {
            return null;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: f */
        public void mo70376f(boolean z11) {
            AppCompatImageView appCompatImageView;
            C28449i mViewBinding = UGCVideoDetailFragment.this.getMViewBinding();
            if (mViewBinding == null || (appCompatImageView = mViewBinding.f87327i) == null) {
                return;
            }
            appCompatImageView.setVisibility(z11 ? 0 : 8);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: g */
        public void mo70377g(C24715a c24715a) {
            UGCVideoDetailBaseFragment.m83834p0(UGCVideoDetailFragment.this, null, 1, null);
        }

        @Override // jo.InterfaceC24450a.b
        public void onCompletion() {
            UGCVideoDetailFragment.this.m83913j1();
        }
    }

    /* JADX INFO: renamed from: A1 */
    private final void m83895A1() {
        InterfaceC24450a playerControl = getPlayerControl();
        if (playerControl != null) {
            playerControl.showNoNetError();
        }
        this.showNetErr = true;
    }

    /* JADX INFO: renamed from: B1 */
    private final void m83896B1() {
        Context context;
        String value;
        List<UGCVideoHashTag> hashTags;
        UGCVideoHashTag uGCVideoHashTag;
        if (getPlayerControl() == null && (context = getContext()) != null) {
            UGCVideo uGCVideo = this.ugcVideo;
            if (uGCVideo == null || (value = uGCVideo.getCategory()) == null) {
                value = UGCVideoType.MOVIE.getValue();
            }
            LongVodPageType longVodPageType = Intrinsics.m97797c(value, UGCVideoType.MUSIC.getValue()) ? LongVodPageType.MUSIC : LongVodPageType.STREAM;
            C28449i c28449i = (C28449i) getMViewBinding();
            if (c28449i != null) {
                LongVodPlayerView longVodPlayerView = new LongVodPlayerView(context);
                String page_name = getPAGE_NAME();
                String strName = longVodPageType.name();
                UGCVideo uGCVideo2 = this.ugcVideo;
                String title = null;
                longVodPlayerView.init(page_name, longVodPageType, strName + (uGCVideo2 != null ? uGCVideo2.getUgcVideoId() : null), null, null, CollectionsKt.m97506l(), LongVodContentType.UGC_VIDEO_ONLINE);
                UGCVideo uGCVideo3 = this.ugcVideo;
                if (uGCVideo3 != null && (hashTags = uGCVideo3.getHashTags()) != null && (uGCVideoHashTag = (UGCVideoHashTag) CollectionsKt.m97361k0(hashTags)) != null) {
                    title = uGCVideoHashTag.getTitle();
                }
                longVodPlayerView.initAdHelper(title);
                longVodPlayerView.setFeedBackVisible(true);
                c28449i.f87325g.addView(longVodPlayerView);
                m83845P0(longVodPlayerView);
            }
            InterfaceC24450a playerControl = getPlayerControl();
            if (playerControl != null) {
                playerControl.setCallback(new C20213d());
            }
        }
    }

    /* JADX INFO: renamed from: C1 */
    private final void m83897C1() {
        LinearLayout linearLayout;
        UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
        boolean zM23948i = C5118o.f17608a.m23948i();
        C28449i mViewBinding = getMViewBinding();
        boolean z11 = false;
        if (mViewBinding != null && (uGCVideoDetailPlayListView = mViewBinding.f87332n) != null && uGCVideoDetailPlayListView.getVisibility() == 0) {
            z11 = true;
        }
        C28449i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (linearLayout = mViewBinding2.f87328j) == null) {
            return;
        }
        int iM92908b = (!zM23948i || z11) ? AbstractC23384a.m92908b(20) : AbstractC23384a.m92908b(8);
        if (linearLayout.getPaddingBottom() != iM92908b) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), iM92908b);
        }
    }

    /* JADX INFO: renamed from: D1 */
    private final void m83898D1(UGCVideo detail) {
        UGCVideoDetailAboutCourseView uGCVideoDetailAboutCourseView;
        UGCVideoDetailInfoView uGCVideoDetailInfoView;
        detail.setOps(this.ops);
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (uGCVideoDetailInfoView = mViewBinding.f87323e) != null) {
            uGCVideoDetailInfoView.setData(detail);
        }
        C28449i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (uGCVideoDetailAboutCourseView = mViewBinding2.f87320b) != null) {
            uGCVideoDetailAboutCourseView.setData(detail);
        }
        m83897C1();
    }

    /* JADX INFO: renamed from: E1 */
    private final void m83899E1(UGCVideo video) {
        C24655b logViewConfig;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        C24655b logViewConfig2;
        HashMap mapM96844g3;
        C24655b logViewConfig3;
        HashMap mapM96844g4;
        HashMap mapM96844g5;
        HashMap mapM96844g6;
        HashMap mapM96844g7;
        String collectionId;
        HashMap mapM96844g8;
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null) {
            String ops = video.getOps();
            if (ops == null) {
                ops = this.ops;
            }
            logViewConfig4.m96851n(ops);
        }
        C24655b logViewConfig5 = getLogViewConfig();
        if (logViewConfig5 != null && (mapM96844g8 = logViewConfig5.m96844g()) != null) {
            String ugcVideoId = video.getUgcVideoId();
            if (ugcVideoId == null) {
                ugcVideoId = "";
            }
        }
        C24655b logViewConfig6 = getLogViewConfig();
        if (logViewConfig6 != null && (mapM96844g7 = logViewConfig6.m96844g()) != null) {
            UGCVideoBelongToCollection belongToCollection = video.getBelongToCollection();
            if ((belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) && (collectionId = this.collectionId) == null) {
                collectionId = "";
            }
        }
        C24655b logViewConfig7 = getLogViewConfig();
        if (logViewConfig7 != null && (mapM96844g6 = logViewConfig7.m96844g()) != null) {
            String subjectId = video.getSubjectId();
        }
        C24655b logViewConfig8 = getLogViewConfig();
        if (logViewConfig8 != null && (mapM96844g5 = logViewConfig8.m96844g()) != null) {
        }
        String str = this.fromOptId;
        if (str != null && (logViewConfig3 = getLogViewConfig()) != null && (mapM96844g4 = logViewConfig3.m96844g()) != null) {
        }
        String previousPageVideoId = getPreviousPageVideoId();
        if (previousPageVideoId != null && (logViewConfig2 = getLogViewConfig()) != null && (mapM96844g3 = logViewConfig2.m96844g()) != null) {
        }
        C24655b logViewConfig9 = getLogViewConfig();
        if (logViewConfig9 != null && (mapM96844g2 = logViewConfig9.m96844g()) != null) {
        }
        String previousTrackId = getPreviousTrackId();
        if (previousTrackId != null && (logViewConfig = getLogViewConfig()) != null && (mapM96844g = logViewConfig.m96844g()) != null) {
        }
        C24655b logViewConfig10 = getLogViewConfig();
        if (logViewConfig10 != null) {
            logViewConfig10.m96848k(true);
        }
    }

    /* JADX INFO: renamed from: i1 */
    private final boolean m83912i1(UGCVideoPlayInfo playInfo) {
        ArrayList arrayList;
        Object next;
        UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
        List<InterfaceC26261i1> playListData;
        C28449i mViewBinding = getMViewBinding();
        Object obj = null;
        if (mViewBinding == null || (uGCVideoDetailPlayListView = mViewBinding.f87332n) == null || (playListData = uGCVideoDetailPlayListView.getPlayListData()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (InterfaceC26261i1 interfaceC26261i1 : playListData) {
                UGCVideo uGCVideo = interfaceC26261i1 instanceof UGCVideo ? (UGCVideo) interfaceC26261i1 : null;
                if (uGCVideo != null) {
                    arrayList.add(uGCVideo);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "checkHasNext 是剧集，判断下一集还是完成 ", false, 4, null);
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(((UGCVideo) next).getUgcVideoId(), playInfo.getUgcVideoId()));
        UGCVideo uGCVideo2 = (UGCVideo) next;
        if (uGCVideo2 == null) {
            return false;
        }
        int iVideoUGCPosition = uGCVideo2.videoUGCPosition() + 1;
        for (Object obj2 : arrayList) {
            if (((UGCVideo) obj2).videoUGCPosition() == iVideoUGCPosition) {
                obj = obj2;
                break;
            }
        }
        UGCVideo uGCVideo3 = (UGCVideo) obj;
        if (uGCVideo3 != null) {
            return !Intrinsics.m97797c(uGCVideo3.getUgcVideoId(), playInfo.getUgcVideoId());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public final void m83913j1() {
        ArrayList arrayList;
        Object next;
        String ugcVideoId;
        String ugcVideoId2;
        UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
        List<InterfaceC26261i1> playListData;
        UGCVideoPlayInfo uGCVideoPlayInfo = (UGCVideoPlayInfo) m83916m1().m84266L().m14847f();
        if (!(uGCVideoPlayInfo != null ? m83912i1(uGCVideoPlayInfo) : false)) {
            C26866a.a.m104898f(C26866a.f81698a, getTAG(), "checkPlayInfo 没有下一集", false, 4, null);
            InterfaceC24450a playerControl = getPlayerControl();
            if (playerControl != null) {
                playerControl.showReplay();
                return;
            }
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "checkPlayNextOrReplay 是剧集，判断下一集还是完成 ", false, 4, null);
        C28449i mViewBinding = getMViewBinding();
        Object obj = null;
        if (mViewBinding == null || (uGCVideoDetailPlayListView = mViewBinding.f87332n) == null || (playListData = uGCVideoDetailPlayListView.getPlayListData()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (InterfaceC26261i1 interfaceC26261i1 : playListData) {
                UGCVideo uGCVideo = interfaceC26261i1 instanceof UGCVideo ? (UGCVideo) interfaceC26261i1 : null;
                if (uGCVideo != null) {
                    arrayList.add(uGCVideo);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "checkHasNext 是剧集，判断下一集还是完成 ", false, 4, null);
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                ugcVideoId2 = ((UGCVideo) next).getUgcVideoId();
                Intrinsics.m97799e(uGCVideoPlayInfo);
            }
        } while (!Intrinsics.m97797c(ugcVideoId2, uGCVideoPlayInfo.getUgcVideoId()));
        UGCVideo uGCVideo2 = (UGCVideo) next;
        if (uGCVideo2 != null) {
            int iVideoUGCPosition = uGCVideo2.videoUGCPosition() + 1;
            for (Object obj2 : arrayList) {
                if (((UGCVideo) obj2).videoUGCPosition() == iVideoUGCPosition) {
                    obj = obj2;
                    break;
                }
            }
            UGCVideo uGCVideo3 = (UGCVideo) obj;
            if (uGCVideo3 == null || (ugcVideoId = uGCVideo3.getUgcVideoId()) == null) {
                return;
            }
            m83916m1().m84280c0(ugcVideoId, this.collectionId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m83914k1(UGCVideoDetailFragment uGCVideoDetailFragment, UGCVideo uGCVideo) {
        UGCVideo uGCVideo2;
        C26866a.a.m104898f(C26866a.f81698a, uGCVideoDetailFragment.getTAG(), "detailObserver: " + uGCVideo, false, 4, null);
        if (uGCVideo == null) {
            uGCVideoDetailFragment.m83927x1("视频信息为空");
            return;
        }
        String ugcVideoId = uGCVideo.getUgcVideoId();
        String str = uGCVideoDetailFragment.previousUgcVideoId;
        boolean z11 = (str == null || Intrinsics.m97797c(str, ugcVideoId) || ugcVideoId == null) ? false : true;
        if (z11 && (uGCVideo2 = uGCVideoDetailFragment.ugcVideo) != null) {
            uGCVideoDetailFragment.m83926w1(uGCVideo2);
        }
        uGCVideoDetailFragment.m83851l0();
        uGCVideoDetailFragment.ugcVideo = uGCVideo;
        uGCVideoDetailFragment.m83849T0(ugcVideoId);
        uGCVideoDetailFragment.m83916m1().m84259D().mo14858q(uGCVideoDetailFragment.getUgcVideoId());
        String str2 = uGCVideoDetailFragment.collectionId;
        if (str2 == null || str2.length() == 0) {
            UGCVideoBelongToCollection belongToCollection = uGCVideo.getBelongToCollection();
            uGCVideoDetailFragment.collectionId = belongToCollection != null ? belongToCollection.getCollectionId() : null;
            uGCVideoDetailFragment.m83916m1().m84257B().mo14858q(uGCVideoDetailFragment.collectionId);
        }
        uGCVideoDetailFragment.m83840K0(uGCVideo.getCategory());
        uGCVideoDetailFragment.m83921r1();
        uGCVideoDetailFragment.m83898D1(uGCVideo);
        uGCVideoDetailFragment.showContentView();
        if (z11) {
            uGCVideoDetailFragment.m83846Q0(uGCVideoDetailFragment.previousUgcVideoId);
            uGCVideoDetailFragment.m83847R0(uGCVideoDetailFragment.getTrackId());
            String string = UUID.randomUUID().toString();
            Intrinsics.m97801g(string, "toString(...)");
            uGCVideoDetailFragment.m83848S0(string);
        }
        uGCVideoDetailFragment.m83899E1(uGCVideo);
        FragmentActivity activity = uGCVideoDetailFragment.getActivity();
        UGCVideoDetailActivity uGCVideoDetailActivity = activity instanceof UGCVideoDetailActivity ? (UGCVideoDetailActivity) activity : null;
        if (uGCVideoDetailActivity != null) {
            uGCVideoDetailActivity.m83593L0(uGCVideo.getCategory());
        }
        uGCVideoDetailFragment.previousUgcVideoId = ugcVideoId;
    }

    /* JADX INFO: renamed from: l1 */
    private final void m83915l1() {
        InterfaceC24450a playerControl = getPlayerControl();
        if (playerControl != null) {
            playerControl.removeNoNetError();
        }
        this.showNetErr = false;
    }

    private final void loadData() {
        String ugcVideoId = getUgcVideoId();
        if (ugcVideoId != null) {
            if (StringsKt.m98160q0(ugcVideoId)) {
                ugcVideoId = null;
            }
            if (ugcVideoId != null) {
                m83916m1().m84280c0(ugcVideoId, this.collectionId);
                return;
            }
        }
        String str = this.subjectId;
        if (str != null) {
            String str2 = StringsKt.m98160q0(str) ? null : str;
            if (str2 != null) {
                m83916m1().m84281d0(str2);
                return;
            }
        }
        m83927x1("视频ID不能为空");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public final UGCVideoDetailViewModel m83916m1() {
        return (UGCVideoDetailViewModel) this.detailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final void m83917n1(UGCVideoDetailFragment uGCVideoDetailFragment, View view) {
        uGCVideoDetailFragment.requireActivity().finish();
    }

    /* JADX INFO: renamed from: o1 */
    private final List m83918o1(List videoDetailStream) {
        ArrayList arrayList = new ArrayList();
        if (videoDetailStream != null) {
            Iterator it = videoDetailStream.iterator();
            while (it.hasNext()) {
                UGCVideoPlayStream uGCVideoPlayStream = (UGCVideoPlayStream) it.next();
                C24717c c24717c = new C24717c(UGCVideoFloatManager.f64340b.m84041i(uGCVideoPlayStream.getFormat()), uGCVideoPlayStream.getId(), uGCVideoPlayStream.getUrl(), uGCVideoPlayStream.getResolutions(), uGCVideoPlayStream.getSize(), uGCVideoPlayStream.getDuration(), uGCVideoPlayStream.getSignCookie(), null, 128, null);
                c24717c.m97088l(uGCVideoPlayStream.getIdType());
                arrayList.add(c24717c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p1 */
    private final void m83919p1(UGCVideoPlayInfo playInfo) {
        if (this.ugcVideo == null) {
            C26866a.a.m104898f(C26866a.f81698a, getTAG(), "handlePlayInfo, ugcVideo is null", false, 4, null);
            return;
        }
        InterfaceC24450a playerControl = getPlayerControl();
        if (playerControl != null) {
            playerControl.hasNextEpisode(m83912i1(playInfo));
        }
        m83925v1(playInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final void m83920q1(UGCVideoDetailFragment uGCVideoDetailFragment, UGCVideoDetailPlayBean uGCVideoDetailPlayBean) {
        C26866a.a.m104898f(C26866a.f81698a, uGCVideoDetailFragment.getTAG(), "historyObserver: " + uGCVideoDetailPlayBean + ", withoutHistory=" + uGCVideoDetailFragment.withoutHistory, false, 4, null);
        if (uGCVideoDetailPlayBean != null && !uGCVideoDetailFragment.withoutHistory) {
            uGCVideoDetailFragment.m83849T0(uGCVideoDetailPlayBean.getUgcVideoId());
            uGCVideoDetailFragment.m83916m1().m84259D().mo14858q(uGCVideoDetailFragment.getUgcVideoId());
        }
        uGCVideoDetailFragment.loadData();
    }

    /* JADX INFO: renamed from: r1 */
    private final void m83921r1() {
        UGCVideoDetailViewModel uGCVideoDetailViewModelM83916m1 = m83916m1();
        UGCVideo uGCVideo = this.ugcVideo;
        C28449i mViewBinding = getMViewBinding();
        MagicIndicator magicIndicator = mViewBinding != null ? mViewBinding.f87330l : null;
        C28449i mViewBinding2 = getMViewBinding();
        ViewPager2 viewPager2 = mViewBinding2 != null ? mViewBinding2.f87337s : null;
        String page_name = getPAGE_NAME();
        UGCVideoPlayFrom uGCVideoPlayFrom = UGCVideoPlayFrom.ON_LINE_VIDEO;
        String str = this.fromOptId;
        int i11 = this.bottomFragmentSelected;
        C28449i mViewBinding3 = getMViewBinding();
        m83843N0(new C20314e(this, uGCVideoDetailViewModelM83916m1, uGCVideo, null, magicIndicator, viewPager2, page_name, uGCVideoPlayFrom, str, i11, mViewBinding3 != null ? mViewBinding3.f87321c : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final Unit m83922s1(UGCVideoDetailFragment uGCVideoDetailFragment, UGCVideoDetailViewModel.C20363b c20363b) {
        List<InterfaceC26261i1> listL;
        if (c20363b != null) {
            String strM84293a = c20363b.m84293a();
            List<? extends InterfaceC26261i1> listM84294b = c20363b.m84294b();
            C28449i mViewBinding = uGCVideoDetailFragment.getMViewBinding();
            UGCVideoDetailPlayListView uGCVideoDetailPlayListView = mViewBinding != null ? mViewBinding.f87332n : null;
            if (uGCVideoDetailPlayListView == null || (listL = uGCVideoDetailPlayListView.getPlayListData()) == null) {
                listL = CollectionsKt.m97506l();
            }
            List<InterfaceC26261i1> list = listL;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.m97797c(((InterfaceC26261i1) it.next()).videoUGCId(), strM84293a)) {
                        C26866a.a.m104898f(C26866a.f81698a, uGCVideoDetailFragment.getTAG(), "replacePlayListDataLiveData: Video " + strM84293a + " already exists in detail play list, skipping replace", false, 4, null);
                        return Unit.f75682a;
                    }
                }
            }
            C26866a.a.m104898f(C26866a.f81698a, uGCVideoDetailFragment.getTAG(), "replacePlayListDataLiveData: Received " + listM84294b.size() + " items to replace play list for video " + strM84293a, false, 4, null);
            if (uGCVideoDetailPlayListView != null) {
                uGCVideoDetailPlayListView.replacePlayListData(listM84294b);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final Unit m83923t1(UGCVideoDetailFragment uGCVideoDetailFragment, UGCVideoList uGCVideoList) {
        uGCVideoDetailFragment.m83897C1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final void m83924u1(UGCVideoDetailFragment uGCVideoDetailFragment, UGCVideoPlayInfo uGCVideoPlayInfo) {
        C26866a.a.m104898f(C26866a.f81698a, uGCVideoDetailFragment.getTAG(), "playInfoObserver: " + uGCVideoPlayInfo, false, 4, null);
        if (uGCVideoPlayInfo != null) {
            uGCVideoDetailFragment.m83919p1(uGCVideoPlayInfo);
        }
        if (uGCVideoPlayInfo != null || C27287m.f83003a.m106330e()) {
            uGCVideoDetailFragment.m83915l1();
        } else {
            uGCVideoDetailFragment.m83895A1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX INFO: renamed from: v1 */
    private final void m83925v1(UGCVideoPlayInfo playInfo) {
        long progress;
        String format;
        String averageHueLight;
        String thumbnail;
        String url;
        UGCVideo uGCVideo = this.ugcVideo;
        if (uGCVideo == null || !uGCVideo.isFamilyModeIntercept()) {
            if (playInfo == null || playInfo.getResources().isEmpty()) {
                C26866a.a.m104901l(C26866a.f81698a, getTAG(), "空返回", false, 4, null);
                return;
            }
            UGCVideoDetailPlayBean uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) m83916m1().m84264J().m14847f();
            if (this.withoutHistory) {
                progress = 0;
            } else {
                if (!Intrinsics.m97797c(uGCVideoDetailPlayBean != null ? uGCVideoDetailPlayBean.getUgcVideoId() : null, playInfo.getUgcVideoId()) || uGCVideoDetailPlayBean == null) {
                    progress = 0;
                } else {
                    progress = uGCVideoDetailPlayBean.getProgress();
                }
            }
            UGCVideoFloatManager uGCVideoFloatManager = UGCVideoFloatManager.f64340b;
            UGCVideoPlayStream uGCVideoPlayStream = (UGCVideoPlayStream) CollectionsKt.m97361k0(playInfo.getResources());
            if (uGCVideoPlayStream == null || (format = uGCVideoPlayStream.getFormat()) == null) {
                format = "";
            }
            PlayMimeType playMimeTypeM84041i = uGCVideoFloatManager.m84041i(format);
            C26866a.a aVar = C26866a.f81698a;
            String tag = getTAG();
            String ugcVideoId = playInfo.getUgcVideoId();
            UGCVideo uGCVideo2 = this.ugcVideo;
            String ugcVideoId2 = uGCVideo2 != null ? uGCVideo2.getUgcVideoId() : null;
            aVar.m104912c(tag, "playVideo  playInfo:" + ugcVideoId + "  ugcVideo:" + ugcVideoId2 + ", historyProgress:" + progress + ", withoutHistory:" + this.withoutHistory, true);
            UGCVideo uGCVideo3 = this.ugcVideo;
            if (uGCVideo3 != null) {
                String title = uGCVideo3.getTitle();
                String str = title == null ? "" : title;
                String title2 = uGCVideo3.getTitle();
                String lastPageFrom = getLastPageFrom();
                String str2 = lastPageFrom == null ? "" : lastPageFrom;
                String page_name = getPAGE_NAME();
                List listM83918o1 = m83918o1(playInfo.getResources());
                Cover cover = uGCVideo3.getCover();
                String str3 = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
                Cover cover2 = uGCVideo3.getCover();
                String str4 = (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail;
                Cover cover3 = uGCVideo3.getCover();
                String str5 = (cover3 == null || (averageHueLight = cover3.getAverageHueLight()) == null) ? "" : averageHueLight;
                Long duration = uGCVideo3.getDuration();
                C24715a c24715a = new C24715a("", playMimeTypeM84041i, progress, 0, 0, str, title2, str2, page_name, listM83918o1, str3, str4, str5, (int) (duration != null ? duration.longValue() : 0L), null, false, uGCVideo3.getTitle(), uGCVideo3.getOps(), 49152, null);
                c24715a.m97044A(uGCVideo3);
                m83896B1();
                InterfaceC24450a playerControl = getPlayerControl();
                if (playerControl != null) {
                    playerControl.updateReportId(getPreviousPageVideoId(), getTrackId(), getPreviousTrackId());
                }
                InterfaceC24450a playerControl2 = getPlayerControl();
                if (playerControl2 != null) {
                    playerControl2.setDataSource(c24715a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: w1 */
    private final void m83926w1(UGCVideo previousVideo) {
        if (previousVideo == null) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "reportVideoSwitch: previousVideo=" + previousVideo.getUgcVideoId(), false, 4, null);
        logPause();
        logResume();
    }

    /* JADX INFO: renamed from: x1 */
    private final void m83927x1(String errorMsg) {
        C26866a.a.m104901l(C26866a.f81698a, getTAG(), "showErrorView: " + errorMsg, false, 4, null);
        if (C27287m.f83003a.m106330e()) {
            PageStatusFragment.showEmptyView$default(this, false, 1, null);
        } else {
            PageStatusFragment.showNoNetworkView$default(this, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final void m83928y1(FragmentActivity fragmentActivity, C27425a c27425a, FloatActionType floatActionType, UGCVideoDetailFragment uGCVideoDetailFragment) {
        InterfaceC27138e.f82251a.m105606b().mo86574i(fragmentActivity, c27425a, floatActionType, uGCVideoDetailFragment.getCurPlayerUiType() == LongVodUiType.LAND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final Unit m83929z1(UGCVideoDetailFragment uGCVideoDetailFragment, FragmentActivity fragmentActivity, boolean z11) {
        InterfaceC24450a playerControl;
        if (z11 && (playerControl = uGCVideoDetailFragment.getPlayerControl()) != null) {
            playerControl.exitFullScreen();
        }
        InterfaceC24450a playerControl2 = uGCVideoDetailFragment.getPlayerControl();
        if (playerControl2 != null) {
            playerControl2.setFloatIsShow(z11);
        }
        if (z11) {
            fragmentActivity.finish();
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: B0, reason: from getter */
    protected String getSubjectId() {
        return this.subjectId;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: F0 */
    protected void mo83820F0() {
        UGCVideoDetailInfoView uGCVideoDetailInfoView;
        UGCVideoDetailInfoView uGCVideoDetailInfoView2;
        UGCLocalVideoDetailInfoView uGCLocalVideoDetailInfoView;
        UGCVideoDetailInfoView uGCVideoDetailInfoView3;
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (uGCVideoDetailInfoView3 = mViewBinding.f87323e) != null) {
            AbstractC26006c.m102058k(uGCVideoDetailInfoView3);
        }
        C28449i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (uGCLocalVideoDetailInfoView = mViewBinding2.f87329k) != null) {
            AbstractC26006c.m102054g(uGCLocalVideoDetailInfoView);
        }
        C28449i mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (uGCVideoDetailInfoView2 = mViewBinding3.f87323e) != null) {
            uGCVideoDetailInfoView2.setParentFragment(this);
        }
        C28449i mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (uGCVideoDetailInfoView = mViewBinding4.f87323e) == null) {
            return;
        }
        uGCVideoDetailInfoView.setPageName(getPAGE_NAME());
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: H0 */
    protected void mo83821H0() {
        UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (uGCVideoDetailPlayListView = mViewBinding.f87332n) == null) {
            return;
        }
        uGCVideoDetailPlayListView.setParentFragment(this, UGCVideoPlayFrom.ON_LINE_VIDEO);
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: V0 */
    protected boolean mo83822V0(final FloatActionType actionType) {
        String value;
        ConstraintLayout constraintLayoutM109909b;
        Intrinsics.m97802h(actionType, "actionType");
        UGCVideo uGCVideo = this.ugcVideo;
        if (uGCVideo == null || (value = uGCVideo.getCategory()) == null) {
            value = UGCVideoType.MOVIE.getValue();
        }
        if (Intrinsics.m97797c(value, UGCVideoType.MUSIC.getValue())) {
            C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "showFloat2Window----music return", false, 4, null);
            return false;
        }
        final FragmentActivity activity = getActivity();
        if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
            FloatActionType floatActionType = FloatActionType.ICON;
            if (actionType != floatActionType && !C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
                C26866a.f81698a.m104912c("VideoFloat", "设置页pip开关被关闭了", true);
                return false;
            }
            final C27425a c27425aMo83824u0 = mo83824u0();
            if (c27425aMo83824u0 != null) {
                if (actionType != floatActionType && !c27425aMo83824u0.m106622f().isPlaying()) {
                    C26866a.f81698a.m104912c("VideoFloat-pip", "stream 视频暂停，无需触发画中画", true);
                    return false;
                }
                InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
                if (aVar.m105606b().mo86568c()) {
                    InterfaceC24450a playerControl = getPlayerControl();
                    if (playerControl != null) {
                        playerControl.hideBottomController(true);
                    }
                    C26866a.f81698a.m104912c("VideoFloat-pip", "stream 当前可用画中画，使用画中画播放", true);
                    if (Build.VERSION.SDK_INT < 31 || actionType != FloatActionType.HOME) {
                        aVar.m105606b().mo86574i(activity, c27425aMo83824u0, actionType, getCurPlayerUiType() == LongVodUiType.LAND);
                    } else {
                        C28449i mViewBinding = getMViewBinding();
                        if (mViewBinding != null && (constraintLayoutM109909b = mViewBinding.getRoot()) != null) {
                            constraintLayoutM109909b.postDelayed(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.u0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    UGCVideoDetailFragment.m83928y1(activity, c27425aMo83824u0, actionType, this);
                                }
                            }, 1000L);
                        }
                    }
                    return true;
                }
                C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "checkShowFloatView----actionType:" + actionType, false, 4, null);
                InterfaceC27135b.f82245a.m105597c().mo86626g(activity, c27425aMo83824u0, actionType == floatActionType, getCurPlayerUiType() == LongVodUiType.LAND, new Function1() { // from class: com.transsion.ugcvideodetail.fragment.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UGCVideoDetailFragment.m83929z1(this.f64325a, activity, ((Boolean) obj).booleanValue());
                    }
                }, new C20212c());
            }
        }
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getEmptyView(boolean isShowTitleLayout) {
        View emptyView = super.getEmptyView(isShowTitleLayout);
        AbstractC23048b.m91690a(emptyView);
        return emptyView;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.layout_ugc_video_detail_default_skeleton, (ViewGroup) getFlStateView(), false);
        ((AppCompatImageView) viewInflate.findViewById(R$id.ivBack)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailFragment.m83917n1(this.f64309a, view);
            }
        });
        return viewInflate;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getNoNetworkView() {
        View noNetworkView = super.getNoNetworkView();
        AbstractC23048b.m91690a(noNetworkView);
        return noNetworkView;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    public String getTAG() {
        return this.TAG;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        showLoadingView();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m83916m1().m84259D().mo14858q(getUgcVideoId());
        m83916m1().m84257B().mo14858q(this.collectionId);
        m83916m1().m84264J().m14851j(this, this.historyObserver);
        m83916m1().m84261G().m14851j(this, this.detailObserver);
        m83916m1().m84266L().m14851j(this, this.playInfoObserver);
        m83916m1().m84271Q().m14851j(this, new C20211b(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDetailFragment.m83922s1(this.f64312a, (UGCVideoDetailViewModel.C20363b) obj);
            }
        }));
        m83916m1().m84267M().m14851j(this, new C20211b(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDetailFragment.m83923t1(this.f64316a, (UGCVideoList) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return true;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void logPause() {
        super.logPause();
        if (this.resumeTimeStamp != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.resumeTimeStamp;
            C26866a.a.m104905r(C26866a.f81698a, "Report", new String[]{"UGCNormalVideoDetailFragment fb log duration:" + jElapsedRealtime}, false, 4, null);
            C14486e.f50941a.m65288n("UGCNormalVideoDetailFragment", Long.valueOf(jElapsedRealtime), getContext());
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void logResume() {
        super.logResume();
        this.resumeTimeStamp = SystemClock.elapsedRealtime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        UGCVideoDetailInfoView uGCVideoDetailInfoView;
        UGCVideoDetailInfoView uGCVideoDetailInfoView2;
        super.onStart();
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (uGCVideoDetailInfoView = mViewBinding.f87323e) == null || !uGCVideoDetailInfoView.isAutoPlayShowing() || !C14496b.f50966a.m65344b().getBoolean("k_UGC_VIDEO_AUTO_PLAY", false)) {
            return;
        }
        C28449i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (uGCVideoDetailInfoView2 = mViewBinding2.f87323e) != null) {
            uGCVideoDetailInfoView2.removeAutoPlay();
        }
        InterfaceC24450a playerControl = getPlayerControl();
        if (playerControl != null) {
            playerControl.ugcAutoPause2PlayVideo();
        }
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: q0 */
    protected void mo83823q0() {
        String ugcVideoId = getUgcVideoId();
        if (ugcVideoId != null) {
            if (StringsKt.m98160q0(ugcVideoId)) {
                ugcVideoId = null;
            }
            if (ugcVideoId != null) {
                m83916m1().m84279b0(ugcVideoId);
                return;
            }
        }
        String str = this.subjectId;
        if (str != null) {
            String str2 = StringsKt.m98160q0(str) ? null : str;
            if (str2 != null) {
                m83916m1().m84281d0(str2);
                return;
            }
        }
        m83927x1("--视频ID不能为空");
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        super.receiveArguments();
        Bundle arguments = getArguments();
        m83849T0(arguments != null ? arguments.getString("id") : null);
        Bundle arguments2 = getArguments();
        this.collectionId = arguments2 != null ? arguments2.getString("collection_id") : null;
        Bundle arguments3 = getArguments();
        this.subjectId = arguments3 != null ? arguments3.getString("subject_id") : null;
        Bundle arguments4 = getArguments();
        m83850U0(arguments4 != null ? arguments4.getString("ugcCategory") : null);
        Bundle arguments5 = getArguments();
        this.ops = arguments5 != null ? arguments5.getString("ops") : null;
        Bundle arguments6 = getArguments();
        this.fromOptId = arguments6 != null ? arguments6.getString("from_opt_id") : null;
        Bundle arguments7 = getArguments();
        m83846Q0(arguments7 != null ? arguments7.getString("parent_video_id") : null);
        Bundle arguments8 = getArguments();
        this.bottomFragmentSelected = arguments8 != null ? arguments8.getInt("ugc_bottom_fragment_selected", 0) : 0;
        Bundle arguments9 = getArguments();
        this.withoutHistory = arguments9 != null ? arguments9.getBoolean("ugc_without_history", false) : false;
        super.m83846Q0(getPreviousPageVideoId());
        C26866a.f81698a.m104912c(getTAG(), "receiveArguments: ugcVideoId=" + getUgcVideoId() + ", collectionId:" + this.collectionId + " subjectId:" + this.subjectId + ", ops=" + this.ops + ", fromOptId=" + this.fromOptId + ", previousPageVideoId=" + getPreviousPageVideoId() + ", bottomFragmentSelected=" + this.bottomFragmentSelected + ", withoutHistory=" + this.withoutHistory, true);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        showLoadingView();
        loadData();
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: u0 */
    protected C27425a mo83824u0() {
        ArrayList<UGCVideo> arrayList;
        String format;
        ArrayList arrayList2;
        String str;
        String ops;
        String averageHueLight;
        String thumbnail;
        String url;
        UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
        List<InterfaceC26261i1> playListData;
        UGCVideoPlayInfo uGCVideoPlayInfo = (UGCVideoPlayInfo) m83916m1().m84266L().m14847f();
        if (uGCVideoPlayInfo == null) {
            return null;
        }
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (uGCVideoDetailPlayListView = mViewBinding.f87332n) == null || (playListData = uGCVideoDetailPlayListView.getPlayListData()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (InterfaceC26261i1 interfaceC26261i1 : playListData) {
                UGCVideo uGCVideo = interfaceC26261i1 instanceof UGCVideo ? (UGCVideo) interfaceC26261i1 : null;
                if (uGCVideo != null) {
                    arrayList.add(uGCVideo);
                }
            }
        }
        InterfaceC24450a playerControl = getPlayerControl();
        InterfaceC16634g player = playerControl != null ? playerControl.getPlayer() : null;
        InterfaceC24450a playerControl2 = getPlayerControl();
        ORPlayerView playerView = playerControl2 != null ? playerControl2.getOrPlayerView() : null;
        InterfaceC24450a playerControl3 = getPlayerControl();
        SimpleSubtitleView subtitleView = playerControl3 != null ? playerControl3.getSubtitleView() : null;
        InterfaceC24450a playerControl4 = getPlayerControl();
        ViewGroup subtitleViewGroup = playerControl4 != null ? playerControl4.getSubtitleViewGroup() : null;
        if (playerView == null || player == null || this.ugcVideo == null || subtitleView == null) {
            return null;
        }
        UGCVideoFloatManager uGCVideoFloatManager = UGCVideoFloatManager.f64340b;
        UGCVideoPlayStream uGCVideoPlayStream = (UGCVideoPlayStream) CollectionsKt.m97361k0(uGCVideoPlayInfo.getResources());
        if (uGCVideoPlayStream == null || (format = uGCVideoPlayStream.getFormat()) == null) {
            format = "";
        }
        PlayMimeType playMimeTypeM84041i = uGCVideoFloatManager.m84041i(format);
        UGCVideo uGCVideo2 = this.ugcVideo;
        if (uGCVideo2 == null) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null) {
            String strM101694a = "";
            for (UGCVideo uGCVideo3 : arrayList) {
                String title = uGCVideo2.getTitle();
                String str2 = title == null ? "" : title;
                String lastPageFrom = getLastPageFrom();
                String str3 = lastPageFrom == null ? "" : lastPageFrom;
                String page_name = getPAGE_NAME();
                Cover cover = uGCVideo2.getCover();
                String str4 = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
                Cover cover2 = uGCVideo2.getCover();
                String str5 = (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail;
                Cover cover3 = uGCVideo2.getCover();
                String str6 = (cover3 == null || (averageHueLight = cover3.getAverageHueLight()) == null) ? "" : averageHueLight;
                Long duration = uGCVideo2.getDuration();
                ArrayList arrayList4 = arrayList3;
                C24715a c24715a = new C24715a("", playMimeTypeM84041i, 0L, 0, 0, str2, null, str3, page_name, null, str4, str5, str6, (int) (duration != null ? duration.longValue() : 0L), null, false, uGCVideo2.getTitle(), uGCVideo2.getOps(), 49728, null);
                strM101694a = C25894a.f79115a.m101694a(c24715a);
                c24715a.m97044A(uGCVideo2);
                arrayList4.add(c24715a);
                arrayList3 = arrayList4;
            }
            arrayList2 = arrayList3;
            str = strM101694a;
        } else {
            arrayList2 = arrayList3;
            str = "";
        }
        C26866a.a aVar = C26866a.f81698a;
        UGCVideo uGCVideo4 = this.ugcVideo;
        aVar.m104912c("VideoFloat", "stream-----showFloat, title:" + (uGCVideo4 != null ? uGCVideo4.getTitle() : null), true);
        UGCVideoFloatManager.f64340b.m84046u(arrayList2);
        InterfaceC24450a playerControl5 = getPlayerControl();
        C24717c playingStream = playerControl5 != null ? playerControl5.getPlayingStream() : null;
        C27425a c27425a = new C27425a(playerView, player, subtitleViewGroup, FloatPlayType.STREAM, "", 0, 0, playingStream != null ? playingStream.m97081e() : null, getPAGE_NAME());
        c27425a.m106614I(playMimeTypeM84041i);
        c27425a.m106608C(str);
        String str7 = this.ops;
        if (str7 == null) {
            UGCVideo uGCVideo5 = this.ugcVideo;
            ops = uGCVideo5 != null ? uGCVideo5.getOps() : null;
        } else {
            ops = str7;
        }
        c27425a.m106606A(ops);
        c27425a.m106617L(this.ugcVideo);
        c27425a.m106607B(getLastPageFrom());
        return c27425a;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: w0, reason: from getter */
    public String getOps() {
        return this.ops;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: x0, reason: from getter */
    public String getPAGE_NAME() {
        return this.PAGE_NAME;
    }
}
