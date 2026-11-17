package com.transsion.room.sub.fragment.likes;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.room.sub.adapter.likes.C18195c;
import com.transsion.room.sub.adapter.likes.InterfaceC18193a;
import com.transsion.room.sub.bean.likes.GetUgcVideoLikesBean;
import com.transsion.room.sub.bean.likes.PagerInfoLikes;
import com.transsion.room.sub.fragment.likes.UgcLikesFragment;
import com.transsion.room.sub.viewmodel.likes.UgcLikesViewModel;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23650l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24655b;
import p550kj.C24662i;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p850vv.AbstractC28228b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010/R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010)R\u0018\u0010D\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010/R\u0016\u0010F\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010)¨\u0006H"}, m97100d2 = {"Lcom/transsion/room/sub/fragment/likes/UgcLikesFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgq/l;", "Lcom/transsion/room/sub/adapter/likes/a;", "<init>", "()V", "", "r0", "z0", "", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "feedItems", "B0", "(Ljava/util/List;)V", "w0", "Lcom/transsion/room/sub/adapter/likes/c;", "s0", "()Lcom/transsion/room/sub/adapter/likes/c;", "Landroid/view/LayoutInflater;", "inflater", "q0", "(Landroid/view/LayoutInflater;)Lgq/l;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "loadDefaultData", WebConstants.FIELD_ITEM, "a", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/room/sub/viewmodel/likes/UgcLikesViewModel;", "Lcom/transsion/room/sub/viewmodel/likes/UgcLikesViewModel;", "viewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "pageNext", "c", "userId", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/Boolean;", "hasMoreLikes", "Lvj/b;", "e", "Lvj/b;", "mExposureHelper", "f", "Lcom/transsion/room/sub/adapter/likes/c;", "sFeedAdapter", "g", "Z", "isLoadingLikesFeed", "h", "hasMoreFeedLikes", "", "i", "J", "loadStartTime", "j", "durationLoad", CampaignEx.JSON_KEY_AD_K, "isFirstFeedDataRequest", "l", "pageFrom", "m", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class UgcLikesFragment extends PageStatusFragment<C23650l> implements InterfaceC18193a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private UgcLikesViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String pageNext = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String userId = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Boolean hasMoreLikes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C28117b mExposureHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C18195c sFeedAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isLoadingLikesFeed;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Boolean hasMoreFeedLikes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long loadStartTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String durationLoad;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Boolean isFirstFeedDataRequest;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: com.transsion.room.sub.fragment.likes.UgcLikesFragment$b */
    public static final class C18256b implements InterfaceC28116a {
        C18256b() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            List<Object> data;
            C18195c c18195c = UgcLikesFragment.this.sFeedAdapter;
            if (c18195c == null || (data = c18195c.getData()) == null) {
                return;
            }
            int size = data.size();
            UgcLikesFragment ugcLikesFragment = UgcLikesFragment.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("曝光的位置position: ");
            sb2.append(i11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("曝光的位置duration: ");
            sb3.append(j11);
            if (i11 >= size) {
                return;
            }
            C18195c c18195c2 = ugcLikesFragment.sFeedAdapter;
            UGCVideo uGCVideo = c18195c2 != null ? (UGCVideo) c18195c2.getItem(i11) : null;
            HashMap map = new HashMap();
            map.put("module_name", WebConstants.FIELD_ITEM);
            map.put("ops", String.valueOf(uGCVideo != null ? uGCVideo.getOps() : null));
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            map.put("refer_subject_id", String.valueOf(uGCVideo != null ? uGCVideo.getSubjectId() : null));
            map.put("content_type", "ugc_video");
            map.put("browse_duration", String.valueOf(j11));
            C14450a.f50860a.m65142e("/ugc/likes", map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.sub.fragment.likes.UgcLikesFragment$c */
    static final class C18257c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59451a;

        C18257c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59451a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59451a;
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
            this.f59451a.invoke(obj);
        }
    }

    public UgcLikesFragment() {
        Boolean bool = Boolean.FALSE;
        this.hasMoreLikes = bool;
        this.hasMoreFeedLikes = bool;
        this.loadStartTime = -1L;
        this.durationLoad = "0";
        this.isFirstFeedDataRequest = bool;
        this.pageFrom = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m77253A0(UgcLikesFragment ugcLikesFragment) {
        SwipeRefreshLayout swipeRefreshLayout;
        C23650l mViewBinding = ugcLikesFragment.getMViewBinding();
        if (mViewBinding == null || (swipeRefreshLayout = mViewBinding.f72236b) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: B0 */
    private final void m77254B0(List feedItems) {
        List<Object> data;
        List<Object> data2;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UgcLikesListFragment", "Likes updateData", false, 4, null);
        C18195c c18195c = this.sFeedAdapter;
        int size = 0;
        int size2 = (c18195c == null || (data2 = c18195c.getData()) == null) ? 0 : data2.size();
        UgcLikesViewModel ugcLikesViewModel = this.viewModel;
        if (Intrinsics.m97797c(ugcLikesViewModel != null ? Boolean.valueOf(ugcLikesViewModel.m77339h()) : null, Boolean.TRUE) || size2 == 0) {
            C18195c c18195c2 = this.sFeedAdapter;
            if (c18195c2 != null) {
                c18195c2.mo36201n1(feedItems);
            }
            C26866a.a.m104898f(aVar, "UgcLikesListFragment", "updateData: refresh or first load, replace data. size: " + size2 + " -> " + feedItems.size(), false, 4, null);
            return;
        }
        C18195c c18195c3 = this.sFeedAdapter;
        if (c18195c3 != null) {
            c18195c3.mo36208q(feedItems);
        }
        C18195c c18195c4 = this.sFeedAdapter;
        if (c18195c4 != null && (data = c18195c4.getData()) != null) {
            size = data.size();
        }
        C26866a.a.m104898f(aVar, "UgcLikesListFragment", "updateData: load more, add " + feedItems.size() + " items, list size: " + size2 + " -> " + size, false, 4, null);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m77262r0() {
        RecyclerView recyclerView;
        if (this.mExposureHelper == null) {
            C28117b c28117b = new C28117b(0.6f, new C18256b(), false, 4, null);
            C23650l mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView = mViewBinding.f72237c) != null) {
                recyclerView.addOnScrollListener(c28117b);
            }
            this.mExposureHelper = c28117b;
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final C18195c m77263s0() {
        C26866a.a.m104898f(C26866a.f81698a, "UgcLikesListFragment", "Likes initFeedAdapter", false, 4, null);
        C18195c c18195c = new C18195c(new ArrayList(), this.mExposureHelper, false);
        c18195c.m36186h0().m108673z(true);
        c18195c.m36186h0().m108672y(true);
        c18195c.m36186h0().m108656D(new InterfaceC27568f() { // from class: mq.d
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                UgcLikesFragment.m77264t0(this.f79121a);
            }
        });
        c18195c.m36227w1(new InterfaceC27566d() { // from class: mq.e
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UgcLikesFragment.m77266v0(this.f79122a, baseQuickAdapter, view, i11);
            }
        });
        this.sFeedAdapter = c18195c;
        return c18195c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m77264t0(final UgcLikesFragment ugcLikesFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            UgcLikesViewModel ugcLikesViewModel = ugcLikesFragment.viewModel;
            if (ugcLikesViewModel != null) {
                ugcLikesViewModel.m77340i(ugcLikesFragment.pageNext);
                return;
            }
            return;
        }
        C26866a.a.m104910z(C26866a.f81698a, "UgcLikesListFragment", "initFilmListAdapter: no network, load more failed", false, 4, null);
        C23650l mViewBinding = ugcLikesFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f72237c) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: mq.f
            @Override // java.lang.Runnable
            public final void run() {
                UgcLikesFragment.m77265u0(this.f79123a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m77265u0(UgcLikesFragment ugcLikesFragment) {
        C27941f c27941fM36186h0;
        C18195c c18195c = ugcLikesFragment.sFeedAdapter;
        if (c18195c == null || (c27941fM36186h0 = c18195c.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m77266v0(UgcLikesFragment ugcLikesFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        if (item instanceof UGCVideo) {
            UGCVideo uGCVideo = (UGCVideo) item;
            Navigator navigatorM61857K = TheRouter.m61773c("/ugc_video/detail").m61857K("id", uGCVideo.getUgcVideoId());
            UGCVideoBelongToCollection belongToCollection = uGCVideo.getBelongToCollection();
            Navigator.m61845x(navigatorM61857K.m61857K("collection_id", belongToCollection != null ? belongToCollection.getCollectionId() : null).m61857K("ops", uGCVideo.getOps()).m61857K(WebConstants.PAGE_FROM, "UgcLike Page"), ugcLikesFragment.getActivity(), null, 2, null);
            new HashMap();
        }
    }

    /* JADX INFO: renamed from: w0 */
    private final void m77267w0() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        SwipeRefreshLayout swipeRefreshLayout;
        C26866a.a.m104898f(C26866a.f81698a, "UgcLikesListFragment", "Likes initLikesFeedRecyclerView", false, 4, null);
        C23650l mViewBinding = getMViewBinding();
        if (mViewBinding != null && (swipeRefreshLayout = mViewBinding.f72236b) != null) {
            swipeRefreshLayout.setEnabled(true);
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: mq.b
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    UgcLikesFragment.m77268x0(this.f79119a);
                }
            });
        }
        m77262r0();
        C28117b c28117b = this.mExposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        C23650l mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f72237c) != null) {
            recyclerView2.setLayoutManager(staggeredGridLayoutManager);
        }
        C18195c c18195cM77263s0 = m77263s0();
        this.sFeedAdapter = c18195cM77263s0;
        if (c18195cM77263s0 != null) {
            c18195cM77263s0.m77121Q1(this);
        }
        C23650l mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (recyclerView = mViewBinding3.f72237c) == null) {
            return;
        }
        recyclerView.setAdapter(this.sFeedAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m77268x0(UgcLikesFragment ugcLikesFragment) {
        C26866a.a.m104898f(C26866a.f81698a, "UgcLikesListFragment", "initRecyclerView: user pull to refresh", false, 4, null);
        UgcLikesViewModel ugcLikesViewModel = ugcLikesFragment.viewModel;
        if (ugcLikesViewModel != null) {
            ugcLikesViewModel.m77342k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m77269y0(UgcLikesFragment ugcLikesFragment, GetUgcVideoLikesBean getUgcVideoLikesBean) {
        C18195c c18195c;
        List<Object> data;
        SwipeRefreshLayout swipeRefreshLayout;
        HashMap mapM96844g;
        List<Object> data2;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C18195c c18195c2;
        C27941f c27941fM36186h2;
        PagerInfoLikes pager;
        PagerInfoLikes pager2;
        C18195c c18195c3;
        List<Object> data3;
        C27941f c27941fM36186h3;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UgcLikesListFragment", "ugcVideoLikeBean:: " + getUgcVideoLikesBean, false, 4, null);
        UgcLikesViewModel ugcLikesViewModel = ugcLikesFragment.viewModel;
        Boolean boolValueOf = ugcLikesViewModel != null ? Boolean.valueOf(ugcLikesViewModel.m77339h()) : null;
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.m97797c(boolValueOf, bool) && (c18195c3 = ugcLikesFragment.sFeedAdapter) != null && (data3 = c18195c3.getData()) != null && !data3.isEmpty() && getUgcVideoLikesBean == null) {
            C26866a.a.m104898f(aVar, "UgcLikesListFragment", "ugcVideoLikeBean is null,has no more data ", false, 4, null);
            C18195c c18195c4 = ugcLikesFragment.sFeedAdapter;
            if (c18195c4 != null && (c27941fM36186h3 = c18195c4.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h3, false, 1, null);
            }
            return Unit.f75682a;
        }
        ugcLikesFragment.hasMoreFeedLikes = (getUgcVideoLikesBean == null || (pager2 = getUgcVideoLikesBean.getPager()) == null) ? null : Boolean.valueOf(pager2.getHasMore());
        ugcLikesFragment.pageNext = (getUgcVideoLikesBean == null || (pager = getUgcVideoLikesBean.getPager()) == null) ? null : pager.getNextPage();
        C26866a.a.m104898f(aVar, "UgcLikesListFragment", "hasMoreFeedLikes " + ugcLikesFragment.hasMoreFeedLikes, false, 4, null);
        C18195c c18195c5 = ugcLikesFragment.sFeedAdapter;
        if (c18195c5 != null && (c27941fM36186h1 = c18195c5.m36186h0()) != null && c27941fM36186h1.m108666r() && (c18195c2 = ugcLikesFragment.sFeedAdapter) != null && (c27941fM36186h2 = c18195c2.m36186h0()) != null) {
            c27941fM36186h2.m108667s();
        }
        if ((getUgcVideoLikesBean != null ? getUgcVideoLikesBean.getItems() : null) != null) {
            List<UGCVideo> items = getUgcVideoLikesBean.getItems();
            Integer numValueOf = items != null ? Integer.valueOf(items.size()) : null;
            C26866a.a.m104898f(aVar, "UgcLikesListFragment", "ugcVideoLikeBean: received " + numValueOf + " items, currentListSize=" + ugcLikesFragment.sFeedAdapter + "?.data?.size}, hasMore=" + getUgcVideoLikesBean.getPager().getHasMore(), false, 4, null);
            Boolean bool2 = ugcLikesFragment.hasMoreLikes;
            Boolean bool3 = Boolean.TRUE;
            if (!Intrinsics.m97797c(bool2, bool3)) {
                C26866a.a.m104898f(aVar, "UgcLikesListFragment", "ugcVideoLikeBean: no more data, load more end", false, 4, null);
                C18195c c18195c6 = ugcLikesFragment.sFeedAdapter;
                if (c18195c6 != null && (c27941fM36186h0 = c18195c6.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h0, false, 1, null);
                }
            }
            C18195c c18195c7 = ugcLikesFragment.sFeedAdapter;
            if (c18195c7 == null || (data2 = c18195c7.getData()) == null || !data2.isEmpty() || numValueOf == null || numValueOf.intValue() != 0) {
                if (Intrinsics.m97797c(ugcLikesFragment.isFirstFeedDataRequest, bool3)) {
                    ugcLikesFragment.durationLoad = ugcLikesFragment.loadStartTime > 0 ? String.valueOf(System.currentTimeMillis() - ugcLikesFragment.loadStartTime) : "0";
                    ugcLikesFragment.isFirstFeedDataRequest = bool;
                    C24655b logViewConfig = ugcLikesFragment.getLogViewConfig();
                    if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
                    }
                }
                List<UGCVideo> items2 = getUgcVideoLikesBean.getItems();
                Intrinsics.m97799e(items2);
                ugcLikesFragment.m77254B0(items2);
                C24655b logViewConfig2 = ugcLikesFragment.getLogViewConfig();
                if (logViewConfig2 != null) {
                    logViewConfig2.m96848k(true);
                }
            } else {
                C26866a.a.m104898f(aVar, "UgcLikesListFragment", "ugcVideoLikeBean: empty data", false, 4, null);
                C18195c c18195c8 = ugcLikesFragment.sFeedAdapter;
                if (c18195c8 != null) {
                    c18195c8.m36171Y0(ugcLikesFragment.getEmptyView(false));
                }
            }
        } else if (Intrinsics.m97797c(boolValueOf, Boolean.TRUE) || ((c18195c = ugcLikesFragment.sFeedAdapter) != null && (data = c18195c.getData()) != null && data.isEmpty())) {
            C26866a.a.m104898f(aVar, "UgcLikesListFragment", "ugcVideoLikeBean: empty data", false, 4, null);
            C18195c c18195c9 = ugcLikesFragment.sFeedAdapter;
            if (c18195c9 != null) {
                c18195c9.m36171Y0(ugcLikesFragment.getEmptyView(false));
            }
            C18195c c18195c10 = ugcLikesFragment.sFeedAdapter;
            if (c18195c10 != null) {
                c18195c10.mo36201n1(null);
            }
        }
        C23650l mViewBinding = ugcLikesFragment.getMViewBinding();
        if (mViewBinding != null && (swipeRefreshLayout = mViewBinding.f72236b) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: z0 */
    private final void m77270z0() {
        ConstraintLayout root;
        C26866a.a.m104898f(C26866a.f81698a, "UgcLikesListFragment", "Likes loadLikesFeedsData", false, 4, null);
        if (this.isLoadingLikesFeed) {
            return;
        }
        this.isLoadingLikesFeed = true;
        UgcLikesViewModel ugcLikesViewModel = this.viewModel;
        if (ugcLikesViewModel != null) {
            ugcLikesViewModel.m77338g("1", String.valueOf(this.userId));
        }
        C23650l mViewBinding = getMViewBinding();
        if (mViewBinding == null || (root = mViewBinding.getRoot()) == null) {
            return;
        }
        root.postDelayed(new Runnable() { // from class: mq.a
            @Override // java.lang.Runnable
            public final void run() {
                UgcLikesFragment.m77253A0(this.f79118a);
            }
        }, 2000L);
    }

    @Override // com.transsion.room.sub.adapter.likes.InterfaceC18193a
    /* JADX INFO: renamed from: a */
    public void mo77116a(UGCVideo item) {
        Intrinsics.m97802h(item, "item");
        C26866a.a.m104898f(C26866a.f81698a, "UgcLikesListFragment", " Likes lazyLoadData", false, 4, null);
        AbstractC28228b.m109413b(item, null, 1, null);
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
        HashMap mapM96844g;
        m77267w0();
        if (this.pageFrom.length() == 0) {
            this.pageFrom = C24662i.f75350a.m96877i();
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        C3187b0 c3187b0M77337f;
        UgcLikesViewModel ugcLikesViewModel = this.viewModel;
        if (ugcLikesViewModel == null || (c3187b0M77337f = ugcLikesViewModel.m77337f()) == null) {
            return;
        }
        c3187b0M77337f.m14851j(this, new C18257c(new Function1() { // from class: mq.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UgcLikesFragment.m77269y0(this.f79120a, (GetUgcVideoLikesBean) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        this.isFirstFeedDataRequest = Boolean.TRUE;
        this.loadStartTime = System.currentTimeMillis();
        m77270z0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("/ugc/likes", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C23650l getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C26866a.a.m104898f(C26866a.f81698a, "UgcLikesListFragment", "Likes getViewBinding", false, 4, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.viewModel = (UgcLikesViewModel) new C3227v0(activity).m14969a(UgcLikesViewModel.class);
        }
        C23650l c23650lM93550c = C23650l.m93550c(getLayoutInflater());
        Intrinsics.m97801g(c23650lM93550c, "inflate(...)");
        return c23650lM93550c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m77270z0();
    }
}
