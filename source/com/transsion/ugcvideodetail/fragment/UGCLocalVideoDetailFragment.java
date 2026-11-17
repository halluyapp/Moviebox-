package com.transsion.ugcvideodetail.fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.viewpager2.widget.ViewPager2;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.player.longvideo.constants.LongVodContentType;
import com.transsion.player.longvideo.constants.LongVodPageType;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.player.p303ui.ORPlayerView;
import com.transsion.ugcvideodetail.activity.UGCLocalVideoDetailActivity;
import com.transsion.ugcvideodetail.api.UGCVideoType;
import com.transsion.ugcvideodetail.hepler.C20314e;
import com.transsion.ugcvideodetail.hepler.UGCLocalVideoFloatManager;
import com.transsion.ugcvideodetail.hepler.UGCVideoPlayFrom;
import com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel;
import com.transsion.ugcvideodetail.widget.UGCLocalVideoDetailInfoView;
import com.transsion.ugcvideodetail.widget.UGCVideoDetailInfoView;
import com.transsion.ugcvideodetail.widget.UGCVideoDetailPlayListView;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.videofloat.bean.FloatPlayType;
import com.transsnet.downloader.manager.C21851p;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jo.InterfaceC24450a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mo.C25894a;
import net.lucode.hackware.magicindicator.MagicIndicator;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p553ko.C24715a;
import p553ko.C24717c;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p755rx.C27425a;
import p824ux.InterfaceC28047a;
import p885wv.C28449i;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 F2\u00020\u0001:\u0001GB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010#\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0003J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b'\u0010\u001bJ\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u001a\u0010>\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010\rR\u001a\u0010A\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010\rR\u001c\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006H"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCLocalVideoDetailFragment;", "Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailBaseFragment;", "<init>", "()V", "", "receiveArguments", "F0", "H0", "", "isAudioShowNoNetworkLayout", "()Z", "", "w0", "()Ljava/lang/String;", "q0", "initViewModel", "retryLoadData", "Lcom/transsion/videofloat/bean/FloatActionType;", "actionType", "V0", "(Lcom/transsion/videofloat/bean/FloatActionType;)Z", "Lrx/a;", "u0", "()Lrx/a;", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", "o1", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "previousDownloadBean", "j1", "detail", "n1", "g1", "playInfo", "f1", "a1", "(Lcom/transsion/baselib/db/download/DownloadBean;)Z", "m1", "b1", "i1", "bean", "", "Lko/c;", "e1", "(Lcom/transsion/baselib/db/download/DownloadBean;)Ljava/util/List;", "d1", "(Lcom/transsion/baselib/db/download/DownloadBean;)Ljava/lang/String;", "Lcom/transsion/ugcvideodetail/viewmodel/UGCLocalVideoDetailViewModel;", "n", "Lkotlin/Lazy;", "c1", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCLocalVideoDetailViewModel;", "detailViewModel", "o", "Ljava/lang/String;", "resourceId", TtmlNode.TAG_P, "Lcom/transsion/baselib/db/download/DownloadBean;", CampaignEx.JSON_KEY_AD_Q, "previousUgcVideoId", CampaignEx.JSON_KEY_AD_R, "x0", "PAGE_NAME", "s", "getTAG", "TAG", "Landroidx/lifecycle/c0;", "t", "Landroidx/lifecycle/c0;", "playInfoObserver", TmcStartParams.KEY_URL_SHORT, "a", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCLocalVideoDetailFragment extends UGCVideoDetailBaseFragment {

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String resourceId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private String previousUgcVideoId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Lazy detailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCLocalVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCLocalVideoDetailFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCLocalVideoDetailFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final String PAGE_NAME = "/ugc_video/local_detail";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final String TAG = "UGCLocalVideoDetail";

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final InterfaceC3189c0 playInfoObserver = new InterfaceC3189c0() { // from class: com.transsion.ugcvideodetail.fragment.f0
        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final void onChanged(Object obj) {
            UGCLocalVideoDetailFragment.m83812h1(this.f64264a, (DownloadBean) obj);
        }
    };

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCLocalVideoDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCLocalVideoDetailFragment m83827a() {
            return new UGCLocalVideoDetailFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCLocalVideoDetailFragment$b */
    public static final class C20196b implements InterfaceC28047a {
        C20196b() {
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: a */
        public boolean mo70368a(C27425a c27425a) {
            return UGCLocalVideoFloatManager.f64337b.m84022j(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: b */
        public void mo70369b(C27425a c27425a) {
            UGCLocalVideoFloatManager uGCLocalVideoFloatManager = UGCLocalVideoFloatManager.f64337b;
            uGCLocalVideoFloatManager.m84020h();
            uGCLocalVideoFloatManager.m84023l(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: c */
        public void mo70370c(C27425a c27425a) {
            InterfaceC28047a.a.m109026a(this, c27425a);
            UGCLocalVideoFloatManager.f64337b.m84021i(c27425a);
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCLocalVideoDetailFragment$c */
    public static final class C20197c implements InterfaceC24450a.b {
        C20197c() {
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: a */
        public void mo70371a() {
            UGCLocalVideoDetailFragment.this.m83806b1();
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: b */
        public boolean mo70372b() {
            return false;
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: c */
        public boolean mo70373c(FloatActionType actionType) {
            Intrinsics.m97802h(actionType, "actionType");
            return UGCLocalVideoDetailFragment.this.mo83822V0(actionType);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: d */
        public void mo70374d(LongVodUiType uiType) {
            UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
            Intrinsics.m97802h(uiType, "uiType");
            UGCLocalVideoDetailFragment.this.m83844O0(uiType);
            boolean z11 = uiType != LongVodUiType.MIDDLE;
            C20314e c20314eM83855s0 = UGCLocalVideoDetailFragment.this.getBottomRecHelper();
            if (c20314eM83855s0 != null) {
                c20314eM83855s0.m84094s(z11);
            }
            UGCLocalVideoDetailFragment.this.m83852m0();
            C28449i mViewBinding = UGCLocalVideoDetailFragment.this.getMViewBinding();
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
            C28449i mViewBinding = UGCLocalVideoDetailFragment.this.getMViewBinding();
            if (mViewBinding == null || (appCompatImageView = mViewBinding.f87327i) == null) {
                return;
            }
            appCompatImageView.setVisibility(z11 ? 0 : 8);
        }

        @Override // jo.InterfaceC24450a.b
        /* JADX INFO: renamed from: g */
        public void mo70377g(C24715a c24715a) {
            UGCLocalVideoDetailFragment.this.m83853o0(c24715a);
        }

        @Override // jo.InterfaceC24450a.b
        public void onCompletion() {
            UGCLocalVideoDetailFragment.this.m83806b1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    private final boolean m83805a1(DownloadBean playInfo) {
        List list = (List) m83807c1().m84225k().m14847f();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "checkHasNext 是剧集，判断下一集还是完成 ", false, 4, null);
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            DownloadBean downloadBean = (DownloadBean) it.next();
            if (Intrinsics.m97797c(downloadBean != null ? downloadBean.getUgcVideoId() : null, playInfo.getUgcVideoId())) {
                break;
            }
            i11++;
        }
        if (i11 < 0 || i11 >= list.size() - 1) {
            return false;
        }
        DownloadBean downloadBean2 = (DownloadBean) list.get(i11 + 1);
        return !Intrinsics.m97797c(downloadBean2 != null ? downloadBean2.getUgcVideoId() : null, playInfo.getUgcVideoId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public final void m83806b1() {
        DownloadBean downloadBean;
        DownloadBean downloadBean2 = (DownloadBean) m83807c1().m84223i().m14847f();
        int i11 = 0;
        if (!(downloadBean2 != null ? m83805a1(downloadBean2) : false)) {
            C26866a.a.m104898f(C26866a.f81698a, getTAG(), "checkPlayInfo 没有下一集", false, 4, null);
            InterfaceC24450a interfaceC24450aM83858y0 = getPlayerControl();
            if (interfaceC24450aM83858y0 != null) {
                interfaceC24450aM83858y0.showReplay();
                return;
            }
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, getTAG(), "checkPlayNextOrReplay 是剧集，判断下一集还是完成 ", false, 4, null);
        List list = (List) m83807c1().m84225k().m14847f();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        C26866a.a.m104898f(aVar, getTAG(), "checkHasNext 是剧集，判断下一集还是完成 ", false, 4, null);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            DownloadBean downloadBean3 = (DownloadBean) it.next();
            String ugcVideoId = downloadBean3 != null ? downloadBean3.getUgcVideoId() : null;
            Intrinsics.m97799e(downloadBean2);
            if (Intrinsics.m97797c(ugcVideoId, downloadBean2.getUgcVideoId())) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= list.size() - 1 || (downloadBean = (DownloadBean) list.get(i11 + 1)) == null) {
            return;
        }
        m83807c1().m84223i().mo14858q(downloadBean);
    }

    /* JADX INFO: renamed from: c1 */
    private final UGCLocalVideoDetailViewModel m83807c1() {
        return (UGCLocalVideoDetailViewModel) this.detailViewModel.getValue();
    }

    /* JADX INFO: renamed from: d1 */
    private final String m83808d1(DownloadBean bean) {
        if (!bean.isInnerRes()) {
            String path = bean.getPath();
            return path == null ? "" : path;
        }
        if (!bean.isCompleted()) {
            return C21851p.f67672a.m88759a(Utils.m27275a()).mo88676h(bean);
        }
        String path2 = bean.getPath();
        return path2 == null ? "" : path2;
    }

    /* JADX INFO: renamed from: e1 */
    private final List m83809e1(DownloadBean bean) {
        ArrayList arrayList = new ArrayList();
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        String ugcVideoId = bean.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        arrayList.add(new C24717c(playMimeType, ugcVideoId, m83808d1(bean), String.valueOf(bean.getResolution()), String.valueOf(bean.getSize()), String.valueOf(bean.getDuration()), "", null, 128, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: f1 */
    private final void m83810f1(DownloadBean playInfo) {
        InterfaceC24450a interfaceC24450aM83858y0 = getPlayerControl();
        if (interfaceC24450aM83858y0 != null) {
            interfaceC24450aM83858y0.hasNextEpisode(m83805a1(playInfo));
        }
        m83813i1(playInfo);
    }

    /* JADX INFO: renamed from: g1 */
    private final void m83811g1() {
        MagicIndicator magicIndicator;
        View view;
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (view = mViewBinding.f87335q) != null) {
            AbstractC26006c.m102054g(view);
        }
        DownloadBean downloadBean = this.downloadBean;
        if (downloadBean == null || !downloadBean.isInnerRes()) {
            C28449i mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (magicIndicator = mViewBinding2.f87330l) == null) {
                return;
            }
            AbstractC26006c.m102054g(magicIndicator);
            return;
        }
        DownloadBean downloadBean2 = this.downloadBean;
        C28449i mViewBinding3 = getMViewBinding();
        MagicIndicator magicIndicator2 = mViewBinding3 != null ? mViewBinding3.f87330l : null;
        C28449i mViewBinding4 = getMViewBinding();
        ViewPager2 viewPager2 = mViewBinding4 != null ? mViewBinding4.f87337s : null;
        String page_name = getPAGE_NAME();
        UGCVideoPlayFrom uGCVideoPlayFrom = UGCVideoPlayFrom.LOCAL_VIDEO;
        C28449i mViewBinding5 = getMViewBinding();
        m83843N0(new C20314e(this, null, null, downloadBean2, magicIndicator2, viewPager2, page_name, uGCVideoPlayFrom, null, 0, mViewBinding5 != null ? mViewBinding5.f87321c : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final void m83812h1(UGCLocalVideoDetailFragment uGCLocalVideoDetailFragment, DownloadBean downloadBean) {
        DownloadBean downloadBean2;
        C26866a.a.m104898f(C26866a.f81698a, uGCLocalVideoDetailFragment.getTAG(), "playInfoObserver: " + downloadBean, false, 4, null);
        if (downloadBean != null) {
            String ugcVideoId = downloadBean.getUgcVideoId();
            String str = uGCLocalVideoDetailFragment.previousUgcVideoId;
            boolean z11 = (str == null || Intrinsics.m97797c(str, ugcVideoId) || ugcVideoId == null) ? false : true;
            if (z11 && (downloadBean2 = uGCLocalVideoDetailFragment.downloadBean) != null) {
                uGCLocalVideoDetailFragment.m83814j1(downloadBean2);
            }
            uGCLocalVideoDetailFragment.m83851l0();
            uGCLocalVideoDetailFragment.downloadBean = downloadBean;
            uGCLocalVideoDetailFragment.resourceId = downloadBean.getResourceId();
            uGCLocalVideoDetailFragment.m83849T0(ugcVideoId);
            uGCLocalVideoDetailFragment.m83807c1().m84221f().mo14858q(uGCLocalVideoDetailFragment.getUgcVideoId());
            uGCLocalVideoDetailFragment.m83807c1().m84220e().mo14858q(downloadBean.getUgcVideoCollectionId());
            uGCLocalVideoDetailFragment.m83818n1(downloadBean);
            uGCLocalVideoDetailFragment.m83811g1();
            uGCLocalVideoDetailFragment.m83810f1(downloadBean);
            if (z11) {
                uGCLocalVideoDetailFragment.m83846Q0(uGCLocalVideoDetailFragment.previousUgcVideoId);
                uGCLocalVideoDetailFragment.m83847R0(uGCLocalVideoDetailFragment.getTrackId());
                String string = UUID.randomUUID().toString();
                Intrinsics.m97801g(string, "toString(...)");
                uGCLocalVideoDetailFragment.m83848S0(string);
            }
            uGCLocalVideoDetailFragment.m83819o1(downloadBean);
            FragmentActivity activity = uGCLocalVideoDetailFragment.getActivity();
            UGCLocalVideoDetailActivity uGCLocalVideoDetailActivity = activity instanceof UGCLocalVideoDetailActivity ? (UGCLocalVideoDetailActivity) activity : null;
            if (uGCLocalVideoDetailActivity != null) {
                uGCLocalVideoDetailActivity.m83582D0(downloadBean.getUgcVideoType());
            }
            uGCLocalVideoDetailFragment.previousUgcVideoId = ugcVideoId;
        }
    }

    /* JADX INFO: renamed from: i1 */
    private final void m83813i1(DownloadBean playInfo) {
        long readProgress = playInfo.getReadProgress();
        C26866a.f81698a.m104912c(getTAG(), "localVideo  playVideo， historyProgress:" + readProgress, true);
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        String ugcVideoCollectionName = playInfo.getUgcVideoCollectionName();
        String str = ugcVideoCollectionName == null ? "" : ugcVideoCollectionName;
        String ugcVideoName = playInfo.getUgcVideoName();
        String strM83857v0 = getLastPageFrom();
        String str2 = strM83857v0 == null ? "" : strM83857v0;
        String page_name = getPAGE_NAME();
        List listM83809e1 = m83809e1(playInfo);
        String cover = playInfo.getCover();
        String str3 = cover == null ? "" : cover;
        String thumbnail = playInfo.getThumbnail();
        String str4 = thumbnail == null ? "" : thumbnail;
        Long duration = playInfo.getDuration();
        C24715a c24715a = new C24715a("", playMimeType, readProgress, 0, 0, str, ugcVideoName, str2, page_name, listM83809e1, str3, str4, "", (int) (duration != null ? duration.longValue() : 0L), null, false, playInfo.getUgcVideoName(), playInfo.getOps(), 49152, null);
        c24715a.m97068x(playInfo);
        m83817m1();
        InterfaceC24450a interfaceC24450aM83858y0 = getPlayerControl();
        if (interfaceC24450aM83858y0 != null) {
            interfaceC24450aM83858y0.updateReportId(getPreviousPageVideoId(), getTrackId(), getPreviousTrackId());
        }
        InterfaceC24450a interfaceC24450aM83858y1 = getPlayerControl();
        if (interfaceC24450aM83858y1 != null) {
            interfaceC24450aM83858y1.setDataSource(c24715a);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private final void m83814j1(DownloadBean previousDownloadBean) {
        if (previousDownloadBean == null) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "reportVideoSwitch: previousVideo=" + previousDownloadBean.getUgcVideoId(), false, 4, null);
        logPause();
        logResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m83815k1(FragmentActivity fragmentActivity, C27425a c27425a, FloatActionType floatActionType, UGCLocalVideoDetailFragment uGCLocalVideoDetailFragment) {
        InterfaceC27138e.f82251a.m105606b().mo86574i(fragmentActivity, c27425a, floatActionType, uGCLocalVideoDetailFragment.getCurPlayerUiType() == LongVodUiType.LAND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final Unit m83816l1(UGCLocalVideoDetailFragment uGCLocalVideoDetailFragment, FragmentActivity fragmentActivity, boolean z11) {
        InterfaceC24450a interfaceC24450aM83858y0;
        if (z11 && (interfaceC24450aM83858y0 = uGCLocalVideoDetailFragment.getPlayerControl()) != null) {
            interfaceC24450aM83858y0.exitFullScreen();
        }
        InterfaceC24450a interfaceC24450aM83858y1 = uGCLocalVideoDetailFragment.getPlayerControl();
        if (interfaceC24450aM83858y1 != null) {
            interfaceC24450aM83858y1.setFloatIsShow(z11);
        }
        if (z11) {
            fragmentActivity.finish();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: m1 */
    private final void m83817m1() {
        Context context;
        LongVodPageType longVodPageType;
        String value;
        if (getPlayerControl() == null && (context = getContext()) != null) {
            DownloadBean downloadBean = (DownloadBean) m83807c1().m84223i().m14847f();
            String ugcVideoId = downloadBean != null ? downloadBean.getUgcVideoId() : null;
            if (ugcVideoId == null || ugcVideoId.length() == 0) {
                longVodPageType = (downloadBean != null ? downloadBean.getSubjectType() : SubjectType.MOVIE.getValue()) == SubjectType.MUSIC.getValue() ? LongVodPageType.MUSIC : LongVodPageType.STREAM;
            } else {
                if (downloadBean == null || (value = downloadBean.getUgcVideoType()) == null) {
                    value = UGCVideoType.MOVIE.getValue();
                }
                longVodPageType = Intrinsics.m97797c(value, UGCVideoType.MUSIC.getValue()) ? LongVodPageType.MUSIC : LongVodPageType.STREAM;
            }
            LongVodPageType longVodPageType2 = longVodPageType;
            C28449i c28449i = (C28449i) getMViewBinding();
            if (c28449i != null) {
                LongVodPlayerView longVodPlayerView = new LongVodPlayerView(context);
                longVodPlayerView.init(getPAGE_NAME(), longVodPageType2, longVodPageType2.name() + (downloadBean != null ? downloadBean.getUgcVideoId() : null), null, null, CollectionsKt.m97506l(), LongVodContentType.UGC_VIDEO_LOCAL);
                DownloadBean downloadBean2 = this.downloadBean;
                longVodPlayerView.initAdHelper(downloadBean2 != null ? downloadBean2.getGenre() : null);
                longVodPlayerView.setFeedBackVisible(true);
                c28449i.f87325g.addView(longVodPlayerView);
                m83845P0(longVodPlayerView);
            }
            InterfaceC24450a interfaceC24450aM83858y0 = getPlayerControl();
            if (interfaceC24450aM83858y0 != null) {
                interfaceC24450aM83858y0.setCallback(new C20197c());
            }
        }
    }

    /* JADX INFO: renamed from: n1 */
    private final void m83818n1(DownloadBean detail) {
        UGCLocalVideoDetailInfoView uGCLocalVideoDetailInfoView;
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (uGCLocalVideoDetailInfoView = mViewBinding.f87329k) == null) {
            return;
        }
        uGCLocalVideoDetailInfoView.setData(detail);
    }

    /* JADX INFO: renamed from: o1 */
    private final void m83819o1(DownloadBean downloadBean) {
        C24655b logViewConfig;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        C24655b logViewConfig2;
        HashMap mapM96844g3;
        HashMap mapM96844g4;
        HashMap mapM96844g5;
        HashMap mapM96844g6;
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null) {
            String ops = downloadBean.getOps();
            if (ops == null) {
                ops = "";
            }
            logViewConfig3.m96851n(ops);
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g6 = logViewConfig4.m96844g()) != null) {
            String ugcVideoId = downloadBean.getUgcVideoId();
            if (ugcVideoId == null) {
                ugcVideoId = "";
            }
        }
        C24655b logViewConfig5 = getLogViewConfig();
        if (logViewConfig5 != null && (mapM96844g5 = logViewConfig5.m96844g()) != null) {
            String ugcVideoCollectionId = downloadBean.getUgcVideoCollectionId();
        }
        C24655b logViewConfig6 = getLogViewConfig();
        if (logViewConfig6 != null && (mapM96844g4 = logViewConfig6.m96844g()) != null) {
        }
        String strM83859z0 = getPreviousPageVideoId();
        if (strM83859z0 != null && (logViewConfig2 = getLogViewConfig()) != null && (mapM96844g3 = logViewConfig2.m96844g()) != null) {
        }
        C24655b logViewConfig7 = getLogViewConfig();
        if (logViewConfig7 != null && (mapM96844g2 = logViewConfig7.m96844g()) != null) {
        }
        String strM83835A0 = getPreviousTrackId();
        if (strM83835A0 == null || (logViewConfig = getLogViewConfig()) == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: F0 */
    protected void mo83820F0() {
        UGCLocalVideoDetailInfoView uGCLocalVideoDetailInfoView;
        UGCLocalVideoDetailInfoView uGCLocalVideoDetailInfoView2;
        UGCLocalVideoDetailInfoView uGCLocalVideoDetailInfoView3;
        UGCVideoDetailInfoView uGCVideoDetailInfoView;
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (uGCVideoDetailInfoView = mViewBinding.f87323e) != null) {
            AbstractC26006c.m102054g(uGCVideoDetailInfoView);
        }
        C28449i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (uGCLocalVideoDetailInfoView3 = mViewBinding2.f87329k) != null) {
            AbstractC26006c.m102058k(uGCLocalVideoDetailInfoView3);
        }
        C28449i mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (uGCLocalVideoDetailInfoView2 = mViewBinding3.f87329k) != null) {
            uGCLocalVideoDetailInfoView2.setPageName(getPAGE_NAME());
        }
        C28449i mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (uGCLocalVideoDetailInfoView = mViewBinding4.f87329k) == null) {
            return;
        }
        uGCLocalVideoDetailInfoView.setParentFragment(this);
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: H0 */
    protected void mo83821H0() {
        UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (uGCVideoDetailPlayListView = mViewBinding.f87332n) == null) {
            return;
        }
        uGCVideoDetailPlayListView.setParentFragment(this, UGCVideoPlayFrom.LOCAL_VIDEO);
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: V0 */
    protected boolean mo83822V0(final FloatActionType actionType) {
        final FragmentActivity activity;
        ConstraintLayout constraintLayoutM109909b;
        Intrinsics.m97802h(actionType, "actionType");
        DownloadBean downloadBean = (DownloadBean) m83807c1().m84223i().m14847f();
        if (downloadBean == null) {
            return false;
        }
        C26866a.a aVar = C26866a.f81698a;
        aVar.m104912c("VideoFloat", "showFloat2Window， " + downloadBean.getUgcVideoType() + ", " + downloadBean.getUgcVideoId(), true);
        if (!downloadBean.isMusic() && (activity = getActivity()) != null && !activity.isDestroyed() && !activity.isFinishing()) {
            FloatActionType floatActionType = FloatActionType.ICON;
            if (actionType != floatActionType && !C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
                aVar.m104912c("VideoFloat", "设置页pip开关被关闭了", true);
                return false;
            }
            final C27425a c27425aMo83824u0 = mo83824u0();
            if (c27425aMo83824u0 != null) {
                if (actionType != floatActionType && !c27425aMo83824u0.m106622f().isPlaying()) {
                    aVar.m104912c("VideoFloat-pip", "stream 视频暂停，无需触发画中画", true);
                    return false;
                }
                InterfaceC27138e.a aVar2 = InterfaceC27138e.f82251a;
                if (aVar2.m105606b().mo86568c()) {
                    InterfaceC24450a interfaceC24450aM83858y0 = getPlayerControl();
                    if (interfaceC24450aM83858y0 != null) {
                        interfaceC24450aM83858y0.hideBottomController(true);
                    }
                    aVar.m104912c("VideoFloat-pip", "stream 当前可用画中画，使用画中画播放", true);
                    if (Build.VERSION.SDK_INT < 31 || actionType != FloatActionType.HOME) {
                        aVar2.m105606b().mo86574i(activity, c27425aMo83824u0, actionType, getCurPlayerUiType() == LongVodUiType.LAND);
                    } else {
                        C28449i mViewBinding = getMViewBinding();
                        if (mViewBinding != null && (constraintLayoutM109909b = mViewBinding.getRoot()) != null) {
                            constraintLayoutM109909b.postDelayed(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.g0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    UGCLocalVideoDetailFragment.m83815k1(activity, c27425aMo83824u0, actionType, this);
                                }
                            }, 1000L);
                        }
                    }
                    return true;
                }
                InterfaceC27135b.f82245a.m105597c().mo86626g(activity, c27425aMo83824u0, actionType == floatActionType, getCurPlayerUiType() == LongVodUiType.LAND, new Function1() { // from class: com.transsion.ugcvideodetail.fragment.h0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UGCLocalVideoDetailFragment.m83816l1(this.f64274a, activity, ((Boolean) obj).booleanValue());
                    }
                }, new C20196b());
            }
        }
        return false;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    public String getTAG() {
        return this.TAG;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m83807c1().m84223i().m14851j(this, this.playInfoObserver);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: q0 */
    protected void mo83823q0() {
        String str = this.resourceId;
        if (str != null) {
            m83807c1().m84222h(str);
            m83807c1().m84224j(str);
        }
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        super.receiveArguments();
        Bundle arguments = getArguments();
        m83849T0(arguments != null ? arguments.getString("id") : null);
        Bundle arguments2 = getArguments();
        this.resourceId = arguments2 != null ? arguments2.getString("resource_id") : null;
        Bundle arguments3 = getArguments();
        m83850U0(arguments3 != null ? arguments3.getString("ugcCategory") : null);
        Bundle arguments4 = getArguments();
        m83846Q0(arguments4 != null ? arguments4.getString("parent_video_id") : null);
        super.m83846Q0(getPreviousPageVideoId());
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "receiveArguments: resourceId:" + this.resourceId + ", ugcVideoId=" + getUgcVideoId() + ", previousPageVideoId=" + getPreviousPageVideoId(), false, 4, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: u0 */
    protected C27425a mo83824u0() {
        String str;
        DownloadBean downloadBean = (DownloadBean) m83807c1().m84223i().m14847f();
        if (downloadBean == null) {
            return null;
        }
        List<DownloadBean> list = (List) m83807c1().m84225k().m14847f();
        InterfaceC24450a interfaceC24450aM83858y0 = getPlayerControl();
        InterfaceC16634g player = interfaceC24450aM83858y0 != null ? interfaceC24450aM83858y0.getPlayer() : null;
        InterfaceC24450a interfaceC24450aM83858y1 = getPlayerControl();
        ORPlayerView playerView = interfaceC24450aM83858y1 != null ? interfaceC24450aM83858y1.getOrPlayerView() : null;
        InterfaceC24450a interfaceC24450aM83858y2 = getPlayerControl();
        SimpleSubtitleView subtitleView = interfaceC24450aM83858y2 != null ? interfaceC24450aM83858y2.getSubtitleView() : null;
        InterfaceC24450a interfaceC24450aM83858y3 = getPlayerControl();
        ViewGroup subtitleViewGroup = interfaceC24450aM83858y3 != null ? interfaceC24450aM83858y3.getSubtitleViewGroup() : null;
        if (playerView == null || player == null || subtitleView == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            String str2 = "";
            for (DownloadBean downloadBean2 : list) {
                PlayMimeType playMimeType = PlayMimeType.DEFAULT;
                String ugcVideoCollectionName = downloadBean.getUgcVideoCollectionName();
                String str3 = ugcVideoCollectionName == null ? "" : ugcVideoCollectionName;
                String strM83857v0 = getLastPageFrom();
                String str4 = strM83857v0 == null ? "" : strM83857v0;
                String page_name = getPAGE_NAME();
                String cover = downloadBean.getCover();
                String str5 = cover == null ? "" : cover;
                String thumbnail = downloadBean.getThumbnail();
                C24715a c24715a = new C24715a("", playMimeType, 0L, 0, 0, str3, null, str4, page_name, null, str5, thumbnail == null ? "" : thumbnail, "", 0, null, false, downloadBean.getUgcVideoName(), downloadBean.getOps(), 49728, null);
                String strM101694a = C25894a.f79115a.m101694a(c24715a);
                c24715a.m97068x(downloadBean);
                arrayList.add(c24715a);
                str2 = strM101694a;
            }
            str = str2;
        } else {
            str = "";
        }
        C26866a.f81698a.m104912c("VideoFloat", "stream-----showFloat, title:" + downloadBean.getUgcVideoName(), true);
        UGCLocalVideoFloatManager.f64337b.m84024n(arrayList);
        InterfaceC24450a interfaceC24450aM83858y4 = getPlayerControl();
        C24717c playingStream = interfaceC24450aM83858y4 != null ? interfaceC24450aM83858y4.getPlayingStream() : null;
        C27425a c27425a = new C27425a(playerView, player, subtitleViewGroup, FloatPlayType.STREAM, "", 0, 0, playingStream != null ? playingStream.m97081e() : null, getPAGE_NAME());
        c27425a.m106614I(PlayMimeType.DEFAULT);
        c27425a.m106608C(str);
        DownloadBean downloadBean3 = this.downloadBean;
        c27425a.m106606A(downloadBean3 != null ? downloadBean3.getOps() : null);
        c27425a.m106641y(this.downloadBean);
        c27425a.m106607B(getLastPageFrom());
        return c27425a;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: w0 */
    public String getOps() {
        DownloadBean downloadBean = this.downloadBean;
        if (downloadBean != null) {
            return downloadBean.getOps();
        }
        return null;
    }

    @Override // com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment
    /* JADX INFO: renamed from: x0, reason: from getter */
    public String getPAGE_NAME() {
        return this.PAGE_NAME;
    }
}
