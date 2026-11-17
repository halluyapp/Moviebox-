package com.transsion.ugcvideodetail.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.therouter.router.Navigator;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.adapter.C20148f;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCContentList;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoDetailParams;
import com.transsion.ugcvideodetail.hepler.C20317h;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p550kj.C24655b;
import p561kx.InterfaceC25451b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p850vv.AbstractC28228b;
import p885wv.C28445e;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J%\u0010\u0014\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u001d\u0010\u0017\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0005J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\u0005J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010\u001bJ\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u0010\u001bJ\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010FR\u0018\u0010M\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010FR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010#¨\u0006U"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailForYouFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lwv/e;", "Lkx/b;", "<init>", "()V", "", "initExposureHelper", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", WebConstants.FIELD_ITEM, "", RequestParameters.POSITION, "A0", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;I)V", "z0", "C0", "", "items", "", "hasMore", "D0", "(Ljava/util/List;Z)V", "v0", "E0", "(Ljava/util/List;)V", "q0", "F0", "(Z)V", "r0", "Landroid/view/LayoutInflater;", "inflater", "u0", "(Landroid/view/LayoutInflater;)Lwv/e;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isShowPageStateLayoutTitle", "()Z", "receiveArguments", "initViewData", "initViewModel", "initListener", "retryLoadData", "onPause", "hidden", "onHiddenChanged", "fullscreen", "onScreenChange", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "a", "Lkotlin/Lazy;", "s0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "mViewModel", "Lcom/transsion/ugcvideodetail/adapter/f;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/ugcvideodetail/adapter/f;", "forYouAdapter", "Lvj/b;", "c", "Lvj/b;", "exposureHelper", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoDetailParams;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoDetailParams;", "videoParams", "e", "Ljava/lang/String;", "pageName", "f", "playFromType", "g", "outSideVideoName", "h", "fromOptId", "", "i", "J", "pageLoadStartTime", "t0", "ugcVideoId", "j", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCVideoDetailForYouFragment extends PageStatusFragment<C28445e> implements InterfaceC25451b {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDetailForYouFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDetailForYouFragment$special$$inlined$activityViewModels$default$2
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
    private C20148f forYouAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private UGCVideoDetailParams videoParams;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String playFromType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String outSideVideoName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String fromOptId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long pageLoadStartTime;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailForYouFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCVideoDetailForYouFragment m83894a() {
            return new UGCVideoDetailForYouFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailForYouFragment$b */
    public static final class C20206b implements InterfaceC28116a {
        C20206b() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            UGCVideo uGCVideo;
            String str;
            UGCVideoDetailForYouFragment uGCVideoDetailForYouFragment = UGCVideoDetailForYouFragment.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                C20148f c20148f = uGCVideoDetailForYouFragment.forYouAdapter;
                if (c20148f != null && (uGCVideo = (UGCVideo) c20148f.getItem(i11)) != null && (str = uGCVideoDetailForYouFragment.pageName) != null) {
                    Fragment parentFragment = uGCVideoDetailForYouFragment.getParentFragment();
                    UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = parentFragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) parentFragment : null;
                    C20317h.f64417a.m84104d(str, uGCVideo, i11, j11, uGCVideoDetailForYouFragment.m83887t0(), uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null);
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailForYouFragment$c */
    static final class C20207c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64198a;

        C20207c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64198a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64198a;
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
            this.f64198a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final void m83871A0(UGCVideo item, int position) {
        Fragment parentFragment = getParentFragment();
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = parentFragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) parentFragment : null;
        final String trackId = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null;
        AbstractC28228b.m109412a(item, new Function1() { // from class: com.transsion.ugcvideodetail.fragment.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDetailForYouFragment.m83872B0(this.f64305a, trackId, (Navigator) obj);
            }
        });
        String str = this.pageName;
        if (str != null) {
            C20317h.f64417a.m84103c(str, item, position, m83887t0(), uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final Navigator m83872B0(UGCVideoDetailForYouFragment uGCVideoDetailForYouFragment, String str, Navigator navigator) {
        Intrinsics.m97802h(navigator, "navigator");
        return navigator.m61857K("parent_video_id", uGCVideoDetailForYouFragment.m83887t0()).m61857K("parent_track_id", str);
    }

    /* JADX INFO: renamed from: C0 */
    private final void m83873C0() {
        m83886s0().m84275U(true, m83887t0(), this.outSideVideoName);
    }

    /* JADX INFO: renamed from: D0 */
    private final void m83874D0(List items, boolean hasMore) {
        List<Object> data;
        if (items.isEmpty()) {
            m83888v0();
            return;
        }
        C20148f c20148f = this.forYouAdapter;
        if (c20148f == null || (data = c20148f.getData()) == null || !data.isEmpty()) {
            m83884q0(items);
        } else {
            m83875E0(items);
        }
        m83876F0(hasMore);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m83875E0(List items) {
        C20148f c20148f = this.forYouAdapter;
        if (c20148f != null) {
            c20148f.mo36201n1(items);
        }
        showContentView();
    }

    /* JADX INFO: renamed from: F0 */
    private final void m83876F0(boolean hasMore) {
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        if (hasMore) {
            C20148f c20148f = this.forYouAdapter;
            if (c20148f == null || (c27941fM36186h1 = c20148f.m36186h0()) == null) {
                return;
            }
            c27941fM36186h1.m108667s();
            return;
        }
        C20148f c20148f2 = this.forYouAdapter;
        if (c20148f2 == null || (c27941fM36186h0 = c20148f2.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108668t(false);
    }

    private final void initExposureHelper() {
        RecyclerView recyclerView;
        C28117b c28117b = new C28117b(0.6f, new C20206b(), false, 4, null);
        c28117b.m109199n(2);
        C28445e mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f87284b) != null) {
            recyclerView.addOnScrollListener(c28117b);
        }
        this.exposureHelper = c28117b;
    }

    /* JADX INFO: renamed from: q0 */
    private final void m83884q0(List items) {
        C20148f c20148f = this.forYouAdapter;
        if (c20148f != null) {
            c20148f.mo36208q(items);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private final void m83885r0() {
        HashMap mapM96844g;
        if (this.pageLoadStartTime > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.pageLoadStartTime;
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final UGCVideoDetailViewModel m83886s0() {
        return (UGCVideoDetailViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final String m83887t0() {
        UGCVideoDetailParams uGCVideoDetailParams = this.videoParams;
        if (uGCVideoDetailParams != null) {
            return uGCVideoDetailParams.getUgcVideoId();
        }
        return null;
    }

    /* JADX INFO: renamed from: v0 */
    private final void m83888v0() {
        C27941f c27941fM36186h0;
        List<Object> data;
        C20148f c20148f = this.forYouAdapter;
        if (c20148f != null && (data = c20148f.getData()) != null && data.isEmpty()) {
            showContentView();
            C20148f c20148f2 = this.forYouAdapter;
            if (c20148f2 != null) {
                c20148f2.m36171Y0(getEmptyView(false));
            }
        }
        C20148f c20148f3 = this.forYouAdapter;
        if (c20148f3 == null || (c27941fM36186h0 = c20148f3.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108668t(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m83889w0(UGCVideoDetailForYouFragment uGCVideoDetailForYouFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        UGCVideo uGCVideo = item instanceof UGCVideo ? (UGCVideo) item : null;
        if (uGCVideo == null) {
            return;
        }
        uGCVideoDetailForYouFragment.m83871A0(uGCVideo, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m83890x0(UGCVideoDetailForYouFragment uGCVideoDetailForYouFragment) {
        uGCVideoDetailForYouFragment.m83892z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m83891y0(UGCVideoDetailForYouFragment uGCVideoDetailForYouFragment, UGCContentList uGCContentList) {
        ArrayList arrayList;
        Pager pager;
        List<UGCContent> items;
        uGCVideoDetailForYouFragment.m83885r0();
        C24655b logViewConfig = uGCVideoDetailForYouFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        if (uGCContentList == null || (items = uGCContentList.getItems()) == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                UGCVideo video = ((UGCContent) it.next()).getVideo();
                if (video != null) {
                    arrayList.add(video);
                }
            }
        }
        List listU0 = CollectionsKt.m97343U0(arrayList);
        String nextPage = (uGCContentList == null || (pager = uGCContentList.getPager()) == null) ? null : pager.getNextPage();
        uGCVideoDetailForYouFragment.m83874D0(listU0, !(nextPage == null || nextPage.length() == 0));
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: z0 */
    private final void m83892z0() {
        m83886s0().m84275U(false, m83887t0(), this.outSideVideoName);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        C24655b logViewConfig;
        HashMap mapM96844g;
        C24655b logViewConfig2;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        C24655b logViewConfig3;
        HashMap mapM96844g4;
        HashMap mapM96844g5;
        HashMap mapM96844g6;
        String subjectId;
        HashMap mapM96844g7;
        String collectionId;
        HashMap mapM96844g8;
        HashMap mapM96844g9;
        HashMap mapM96844g10;
        RecyclerView recyclerView;
        initExposureHelper();
        C20148f c20148f = new C20148f();
        c20148f.m36227w1(new InterfaceC27566d() { // from class: com.transsion.ugcvideodetail.fragment.o0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCVideoDetailForYouFragment.m83889w0(this.f64298a, baseQuickAdapter, view, i11);
            }
        });
        c20148f.m36186h0().m108673z(true);
        c20148f.m36186h0().m108672y(true);
        c20148f.m36186h0().m108657E(2);
        c20148f.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.ugcvideodetail.fragment.p0
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                UGCVideoDetailForYouFragment.m83890x0(this.f64302a);
            }
        });
        this.forYouAdapter = c20148f;
        C28445e mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f87284b) != null) {
            recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.forYouAdapter);
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g10 = logViewConfig4.m96844g()) != null) {
        }
        C24655b logViewConfig5 = getLogViewConfig();
        if (logViewConfig5 != null && (mapM96844g9 = logViewConfig5.m96844g()) != null) {
            UGCVideoDetailParams uGCVideoDetailParams = this.videoParams;
        }
        C24655b logViewConfig6 = getLogViewConfig();
        String str = "";
        if (logViewConfig6 != null && (mapM96844g8 = logViewConfig6.m96844g()) != null) {
            String strM83887t0 = m83887t0();
            if (strM83887t0 == null) {
                strM83887t0 = "";
            }
        }
        C24655b logViewConfig7 = getLogViewConfig();
        if (logViewConfig7 != null && (mapM96844g7 = logViewConfig7.m96844g()) != null) {
            UGCVideoDetailParams uGCVideoDetailParams2 = this.videoParams;
            if (uGCVideoDetailParams2 == null || (collectionId = uGCVideoDetailParams2.getCollectionId()) == null) {
                collectionId = "";
            }
        }
        C24655b logViewConfig8 = getLogViewConfig();
        if (logViewConfig8 != null && (mapM96844g6 = logViewConfig8.m96844g()) != null) {
            UGCVideoDetailParams uGCVideoDetailParams3 = this.videoParams;
            if (uGCVideoDetailParams3 != null && (subjectId = uGCVideoDetailParams3.getSubjectId()) != null) {
                str = subjectId;
            }
        }
        C24655b logViewConfig9 = getLogViewConfig();
        if (logViewConfig9 != null && (mapM96844g5 = logViewConfig9.m96844g()) != null) {
        }
        String str2 = this.fromOptId;
        if (str2 != null && (logViewConfig3 = getLogViewConfig()) != null && (mapM96844g4 = logViewConfig3.m96844g()) != null) {
        }
        Fragment parentFragment = getParentFragment();
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = parentFragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) parentFragment : null;
        if (uGCVideoDetailBaseFragment != null) {
            C24655b logViewConfig10 = getLogViewConfig();
            if (logViewConfig10 != null && (mapM96844g3 = logViewConfig10.m96844g()) != null) {
            }
            String previousTrackId = uGCVideoDetailBaseFragment.getPreviousTrackId();
            if (previousTrackId != null && (logViewConfig2 = getLogViewConfig()) != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
            }
            String previousPageVideoId = uGCVideoDetailBaseFragment.getPreviousPageVideoId();
            if (previousPageVideoId != null && (logViewConfig = getLogViewConfig()) != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            }
        }
        m83873C0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m83886s0().m84263I().m14851j(getViewLifecycleOwner(), new C20207c(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDetailForYouFragment.m83891y0(this.f64295a, (UGCContentList) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        String str = this.pageName;
        if (str == null) {
            str = "/ugc_video/detail";
        }
        return new C24655b(str, false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                C28117b c28117b = this.exposureHelper;
                if (c28117b != null) {
                    c28117b.m109195f();
                }
                logPause();
            } else {
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }

    @Override // p561kx.InterfaceC25451b
    public void onScreenChange(boolean fullscreen) {
        C27941f c27941fM36186h0;
        C20148f c20148f = this.forYouAdapter;
        if (c20148f == null || (c27941fM36186h0 = c20148f.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108672y(!fullscreen);
        C26866a.a aVar = C26866a.f81698a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onScreenChange: fullscreen=");
        sb2.append(fullscreen);
        sb2.append(", isAutoLoadMore=");
        sb2.append(!fullscreen);
        C26866a.a.m104898f(aVar, "UGCVideoDetailForYouFragment", sb2.toString(), false, 4, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        String string;
        this.pageLoadStartTime = System.currentTimeMillis();
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("video_params") : null;
        this.videoParams = serializable instanceof UGCVideoDetailParams ? (UGCVideoDetailParams) serializable : null;
        Bundle arguments2 = getArguments();
        this.pageName = arguments2 != null ? arguments2.getString("page_name") : null;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString(NativeComponentConstants.KEY_COMPONENT_TYPE)) == null) {
            string = "TYPE_ONLINE";
        }
        this.playFromType = string;
        Bundle arguments4 = getArguments();
        this.fromOptId = arguments4 != null ? arguments4.getString("from_opt_id") : null;
        if (Intrinsics.m97797c(this.playFromType, "TYPE_LOCAL_OUT")) {
            Bundle arguments5 = getArguments();
            this.outSideVideoName = arguments5 != null ? arguments5.getString("content_name") : null;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public C28445e getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28445e c28445eM109891c = C28445e.m109891c(inflater);
        Intrinsics.m97801g(c28445eM109891c, "inflate(...)");
        return c28445eM109891c;
    }
}
