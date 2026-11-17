package com.transsion.postdetail.p306ui.fragment.favorite;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
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
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.postdetail.bean.favorite.FeedFavorData;
import com.transsion.postdetail.bean.favorite.Pager;
import com.transsion.postdetail.p306ui.adapter.favorite.C16981b;
import com.transsion.postdetail.p306ui.adapter.favorite.InterfaceC16980a;
import com.transsion.postdetail.p306ui.fragment.favorite.UgcFavoriteFragment;
import com.transsion.postdetail.viewmodel.ugcfavorite.UgcFavoriteViewModel;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import p844vo.C28156j;
import p850vv.AbstractC28228b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u001d\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010)R\u0018\u0010B\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00102R\u0016\u0010D\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010=R\u0014\u0010F\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010)R\u0016\u0010H\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010)¨\u0006J"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/favorite/UgcFavoriteFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lvo/j;", "Lcom/transsion/postdetail/ui/adapter/favorite/a;", "<init>", "()V", "", "t0", "Lcom/transsion/postdetail/ui/adapter/favorite/b;", "w0", "()Lcom/transsion/postdetail/ui/adapter/favorite/b;", "C0", "u0", "", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "feedItems", "E0", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "inflater", "s0", "(Landroid/view/LayoutInflater;)Lvo/j;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "loadDefaultData", WebConstants.FIELD_ITEM, "a", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/postdetail/viewmodel/ugcfavorite/UgcFavoriteViewModel;", "Lcom/transsion/postdetail/viewmodel/ugcfavorite/UgcFavoriteViewModel;", "viewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "pageNext", "c", "userId", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "isLoadingFavoriteFeed", "e", "Ljava/lang/Boolean;", "hasMoreFeedFavorite", "f", "Lcom/transsion/postdetail/ui/adapter/favorite/b;", "sFeedAdapter", "Lvj/b;", "g", "Lvj/b;", "mExposureHelper", "", "h", "J", "firstLoadStartTimeMillis", "i", "durationLoad", "j", "isFirstFeedDataRequest", CampaignEx.JSON_KEY_AD_K, "loadStartTime", "l", "PAGE_NAME", "m", "pageFrom", "n", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class UgcFavoriteFragment extends PageStatusFragment<C28156j> implements InterfaceC16980a {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private UgcFavoriteViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String pageNext = "1";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String userId = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isLoadingFavoriteFeed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Boolean hasMoreFeedFavorite;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C16981b sFeedAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C28117b mExposureHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long firstLoadStartTimeMillis;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String durationLoad;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Boolean isFirstFeedDataRequest;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long loadStartTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String PAGE_NAME;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.favorite.UgcFavoriteFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UgcFavoriteFragment m74551a() {
            Bundle bundle = new Bundle();
            C26866a.a.m104898f(C26866a.f81698a, "UgcFavoriteListFragment", "favorite newInstance", false, 4, null);
            UgcFavoriteFragment ugcFavoriteFragment = new UgcFavoriteFragment();
            ugcFavoriteFragment.setArguments(bundle);
            return ugcFavoriteFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.favorite.UgcFavoriteFragment$b */
    public static final class C17137b implements InterfaceC28116a {
        C17137b() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            List<Object> data;
            C16981b c16981b = UgcFavoriteFragment.this.sFeedAdapter;
            if (c16981b == null || (data = c16981b.getData()) == null) {
                return;
            }
            int size = data.size();
            UgcFavoriteFragment ugcFavoriteFragment = UgcFavoriteFragment.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("曝光的位置position: ");
            sb2.append(i11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("曝光的位置duration: ");
            sb3.append(j11);
            if (i11 >= size) {
                return;
            }
            C16981b c16981b2 = ugcFavoriteFragment.sFeedAdapter;
            UGCVideo uGCVideo = c16981b2 != null ? (UGCVideo) c16981b2.getItem(i11) : null;
            HashMap map = new HashMap();
            map.put("module_name", WebConstants.FIELD_ITEM);
            map.put("ops", String.valueOf(uGCVideo != null ? uGCVideo.getOps() : null));
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            map.put("refer_subject_id", String.valueOf(uGCVideo != null ? uGCVideo.getSubjectId() : null));
            map.put("content_type", "ugc_video");
            map.put("browse_duration", String.valueOf(j11));
            C14450a.f50860a.m65142e(ugcFavoriteFragment.PAGE_NAME, map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.favorite.UgcFavoriteFragment$c */
    static final class C17138c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57348a;

        C17138c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57348a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57348a;
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
            this.f57348a.invoke(obj);
        }
    }

    public UgcFavoriteFragment() {
        Boolean bool = Boolean.FALSE;
        this.hasMoreFeedFavorite = bool;
        this.durationLoad = "0";
        this.isFirstFeedDataRequest = bool;
        this.loadStartTime = -1L;
        this.PAGE_NAME = "/ugc/favorite";
        this.pageFrom = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m74529A0(UgcFavoriteFragment ugcFavoriteFragment, View view) {
        FragmentActivity activity = ugcFavoriteFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final Unit m74530B0(UgcFavoriteFragment ugcFavoriteFragment, FeedFavorData feedFavorData) {
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        HashMap mapM96844g;
        C16981b c16981b;
        List<Object> data;
        C27941f c27941fM36186h3;
        C16981b c16981b2;
        C27941f c27941fM36186h4;
        Pager pager;
        Pager pager2;
        List<Object> data2;
        C27941f c27941fM36186h5;
        C16981b c16981b3 = ugcFavoriteFragment.sFeedAdapter;
        if (c16981b3 != null && (data2 = c16981b3.getData()) != null && !data2.isEmpty() && feedFavorData == null) {
            C26866a.a.m104898f(C26866a.f81698a, "UgcFavoriteListFragment", "feedFavoriteData is null,has no more data ", false, 4, null);
            C16981b c16981b4 = ugcFavoriteFragment.sFeedAdapter;
            if (c16981b4 != null && (c27941fM36186h5 = c16981b4.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h5, false, 1, null);
            }
            return Unit.f75682a;
        }
        ugcFavoriteFragment.hasMoreFeedFavorite = (feedFavorData == null || (pager2 = feedFavorData.getPager()) == null) ? null : Boolean.valueOf(pager2.getHasMore());
        ugcFavoriteFragment.pageNext = (feedFavorData == null || (pager = feedFavorData.getPager()) == null) ? null : pager.getNextPage();
        C16981b c16981b5 = ugcFavoriteFragment.sFeedAdapter;
        if (c16981b5 != null && (c27941fM36186h3 = c16981b5.m36186h0()) != null && c27941fM36186h3.m108666r() && (c16981b2 = ugcFavoriteFragment.sFeedAdapter) != null && (c27941fM36186h4 = c16981b2.m36186h0()) != null) {
            c27941fM36186h4.m108667s();
        }
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "favorite hasMore:" + ugcFavoriteFragment.hasMoreFeedFavorite, false, 4, null);
        C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "favorite pageNext:" + ugcFavoriteFragment.pageNext, false, 4, null);
        if ((feedFavorData != null ? feedFavorData.getItems() : null) != null) {
            List<UGCVideo> items = feedFavorData.getItems();
            Integer numValueOf = items != null ? Integer.valueOf(items.size()) : null;
            C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "ugcFavoriteBean: received " + numValueOf + " items, currentListSize=" + ugcFavoriteFragment.sFeedAdapter + "?.data?.size}, hasMore=" + feedFavorData.getPager().getHasMore(), false, 4, null);
            Boolean bool = ugcFavoriteFragment.hasMoreFeedFavorite;
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.m97797c(bool, bool2) || ugcFavoriteFragment.hasMoreFeedFavorite == null) {
                C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "ugcVideoFavoriteBean: no more data, load more end", false, 4, null);
                C16981b c16981b6 = ugcFavoriteFragment.sFeedAdapter;
                if (c16981b6 != null && (c27941fM36186h2 = c16981b6.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h2, false, 1, null);
                }
                C16981b c16981b7 = ugcFavoriteFragment.sFeedAdapter;
                if (c16981b7 != null && (c27941fM36186h1 = c16981b7.m36186h0()) != null) {
                    c27941fM36186h1.m108673z(false);
                }
                C16981b c16981b8 = ugcFavoriteFragment.sFeedAdapter;
                if (c16981b8 != null && (c27941fM36186h0 = c16981b8.m36186h0()) != null) {
                    c27941fM36186h0.m108672y(false);
                }
            }
            C16981b c16981b9 = ugcFavoriteFragment.sFeedAdapter;
            if (c16981b9 == null || (data = c16981b9.getData()) == null || !data.isEmpty() || numValueOf == null || numValueOf.intValue() != 0) {
                UgcFavoriteViewModel ugcFavoriteViewModel = ugcFavoriteFragment.viewModel;
                Boolean boolValueOf = ugcFavoriteViewModel != null ? Boolean.valueOf(ugcFavoriteViewModel.m75148g()) : null;
                if (numValueOf != null && numValueOf.intValue() == 0 && Intrinsics.m97797c(boolValueOf, bool2) && (c16981b = ugcFavoriteFragment.sFeedAdapter) != null) {
                    c16981b.m36171Y0(ugcFavoriteFragment.getEmptyView(false));
                }
                if (Intrinsics.m97797c(ugcFavoriteFragment.isFirstFeedDataRequest, bool2)) {
                    ugcFavoriteFragment.durationLoad = ugcFavoriteFragment.loadStartTime > 0 ? String.valueOf(System.currentTimeMillis() - ugcFavoriteFragment.loadStartTime) : "0";
                    ugcFavoriteFragment.isFirstFeedDataRequest = Boolean.FALSE;
                    C24655b logViewConfig = ugcFavoriteFragment.getLogViewConfig();
                    if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
                    }
                }
                List<UGCVideo> items2 = feedFavorData.getItems();
                Intrinsics.m97799e(items2);
                ugcFavoriteFragment.m74533E0(items2);
                C24655b logViewConfig2 = ugcFavoriteFragment.getLogViewConfig();
                if (logViewConfig2 != null) {
                    logViewConfig2.m96848k(true);
                }
            } else {
                C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "ugcFavoriteLikeBean: empty data", false, 4, null);
                C16981b c16981b10 = ugcFavoriteFragment.sFeedAdapter;
                if (c16981b10 != null) {
                    c16981b10.m36171Y0(ugcFavoriteFragment.getEmptyView(false));
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m74531C0() {
        ConstraintLayout root;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "favorite loadFavoriteFeedsData", false, 4, null);
        if (this.isLoadingFavoriteFeed) {
            return;
        }
        this.isLoadingFavoriteFeed = true;
        C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "favorite loadFavoriteFeedsData 11", false, 4, null);
        UgcFavoriteViewModel ugcFavoriteViewModel = this.viewModel;
        if (ugcFavoriteViewModel != null) {
            ugcFavoriteViewModel.m75147f(String.valueOf(this.pageNext), String.valueOf(this.userId));
        }
        C28156j mViewBinding = getMViewBinding();
        if (mViewBinding == null || (root = mViewBinding.getRoot()) == null) {
            return;
        }
        root.postDelayed(new Runnable() { // from class: ep.c
            @Override // java.lang.Runnable
            public final void run() {
                UgcFavoriteFragment.m74532D0(this.f70747a);
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m74532D0(UgcFavoriteFragment ugcFavoriteFragment) {
        SwipeRefreshLayout swipeRefreshLayout;
        C28156j mViewBinding = ugcFavoriteFragment.getMViewBinding();
        if (mViewBinding == null || (swipeRefreshLayout = mViewBinding.f86467e) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m74533E0(List feedItems) {
        List<Object> data;
        List<Object> data2;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "favorite updateData", false, 4, null);
        C16981b c16981b = this.sFeedAdapter;
        int size = 0;
        int size2 = (c16981b == null || (data2 = c16981b.getData()) == null) ? 0 : data2.size();
        UgcFavoriteViewModel ugcFavoriteViewModel = this.viewModel;
        Boolean boolValueOf = ugcFavoriteViewModel != null ? Boolean.valueOf(ugcFavoriteViewModel.m75148g()) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.m97797c(boolValueOf, bool) || size2 == 0) {
            C16981b c16981b2 = this.sFeedAdapter;
            if (c16981b2 != null) {
                c16981b2.mo36201n1(feedItems);
            }
            C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "updateData: refresh or first load, replace data. size: " + size2 + " -> " + feedItems.size(), false, 4, null);
        } else {
            C16981b c16981b3 = this.sFeedAdapter;
            if (c16981b3 != null) {
                c16981b3.mo36208q(feedItems);
            }
            C16981b c16981b4 = this.sFeedAdapter;
            if (c16981b4 != null && (data = c16981b4.getData()) != null) {
                size = data.size();
            }
            C26866a.a.m104898f(aVar, "UgcFavoriteListFragment", "updateData: load more, add " + feedItems.size() + " items, list size: " + size2 + " -> " + size, false, 4, null);
        }
        if ((Intrinsics.m97797c(boolValueOf, bool) || size2 == 0) && !feedItems.isEmpty()) {
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m74543t0() {
        RecyclerView recyclerView;
        if (this.mExposureHelper == null) {
            C28117b c28117b = new C28117b(0.6f, new C17137b(), false, 4, null);
            C28156j mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView = mViewBinding.f86469g) != null) {
                recyclerView.addOnScrollListener(c28117b);
            }
            this.mExposureHelper = c28117b;
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m74544u0() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        SwipeRefreshLayout swipeRefreshLayout;
        C26866a.a.m104898f(C26866a.f81698a, "UgcFavoriteListFragment", "favorite initFavoriteFeedRecyclerView", false, 4, null);
        C28156j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (swipeRefreshLayout = mViewBinding.f86467e) != null) {
            swipeRefreshLayout.setEnabled(true);
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: ep.d
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    UgcFavoriteFragment.m74545v0(this.f70748a);
                }
            });
        }
        m74543t0();
        C28117b c28117b = this.mExposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        C28156j mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f86469g) != null) {
            recyclerView2.setLayoutManager(staggeredGridLayoutManager);
        }
        C16981b c16981bM74546w0 = m74546w0();
        this.sFeedAdapter = c16981bM74546w0;
        if (c16981bM74546w0 != null) {
            c16981bM74546w0.m73911Q1(this);
        }
        C28156j mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (recyclerView = mViewBinding3.f86469g) == null) {
            return;
        }
        recyclerView.setAdapter(this.sFeedAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m74545v0(UgcFavoriteFragment ugcFavoriteFragment) {
        SwipeRefreshLayout swipeRefreshLayout;
        C26866a.a.m104898f(C26866a.f81698a, "UgcFavoriteListFragment", "initRecyclerView: user pull to refresh", false, 4, null);
        UgcFavoriteViewModel ugcFavoriteViewModel = ugcFavoriteFragment.viewModel;
        if (ugcFavoriteViewModel != null) {
            ugcFavoriteViewModel.m75150i();
        }
        C28156j mViewBinding = ugcFavoriteFragment.getMViewBinding();
        if (mViewBinding == null || (swipeRefreshLayout = mViewBinding.f86467e) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: w0 */
    private final C16981b m74546w0() {
        C26866a.a.m104898f(C26866a.f81698a, "UgcFavoriteListFragment", "favorite initFeedAdapter", false, 4, null);
        C16981b c16981b = new C16981b(new ArrayList(), this.mExposureHelper, false);
        c16981b.m36186h0().m108673z(true);
        c16981b.m36186h0().m108672y(true);
        c16981b.m36186h0().m108657E(1);
        c16981b.m36186h0().m108656D(new InterfaceC27568f() { // from class: ep.e
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                UgcFavoriteFragment.m74547x0(this.f70749a);
            }
        });
        c16981b.m36227w1(new InterfaceC27566d() { // from class: ep.f
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UgcFavoriteFragment.m74549z0(baseQuickAdapter, view, i11);
            }
        });
        this.sFeedAdapter = c16981b;
        Intrinsics.m97799e(c16981b);
        return c16981b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m74547x0(final UgcFavoriteFragment ugcFavoriteFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            C26866a.a.m104898f(C26866a.f81698a, "UgcFavoriteListFragment", "initUgcFavoriteListAdapter: trigger load more", false, 4, null);
            UgcFavoriteViewModel ugcFavoriteViewModel = ugcFavoriteFragment.viewModel;
            if (ugcFavoriteViewModel != null) {
                ugcFavoriteViewModel.m75149h(ugcFavoriteFragment.pageNext);
                return;
            }
            return;
        }
        C26866a.a.m104910z(C26866a.f81698a, "UgcFavoriteListFragment", "initUgcFavoriteListAdapter: no network, load more failed", false, 4, null);
        C28156j mViewBinding = ugcFavoriteFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f86469g) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: ep.g
            @Override // java.lang.Runnable
            public final void run() {
                UgcFavoriteFragment.m74548y0(this.f70750a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m74548y0(UgcFavoriteFragment ugcFavoriteFragment) {
        C27941f c27941fM36186h0;
        C16981b c16981b = ugcFavoriteFragment.sFeedAdapter;
        if (c16981b == null || (c27941fM36186h0 = c16981b.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m74549z0(BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (adapter.getItem(i11) instanceof UGCVideo) {
            new HashMap();
        }
    }

    @Override // com.transsion.postdetail.p306ui.adapter.favorite.InterfaceC16980a
    /* JADX INFO: renamed from: a */
    public void mo73910a(UGCVideo item) {
        Intrinsics.m97802h(item, "item");
        C26866a.a.m104898f(C26866a.f81698a, "UgcFavoriteListFragment", "favorite onClickVideoDetailItem", false, 4, null);
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
        ImageView imageView;
        this.firstLoadStartTimeMillis = SystemClock.elapsedRealtime();
        m74544u0();
        C28156j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (imageView = mViewBinding.f86465c) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ep.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UgcFavoriteFragment.m74529A0(this.f70746a, view);
                }
            });
        }
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
        C3187b0 c3187b0M75146e;
        UgcFavoriteViewModel ugcFavoriteViewModel = this.viewModel;
        if (ugcFavoriteViewModel == null || (c3187b0M75146e = ugcFavoriteViewModel.m75146e()) == null) {
            return;
        }
        c3187b0M75146e.m14851j(this, new C17138c(new Function1() { // from class: ep.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UgcFavoriteFragment.m74530B0(this.f70745a, (FeedFavorData) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        this.isFirstFeedDataRequest = Boolean.TRUE;
        this.loadStartTime = System.currentTimeMillis();
        m74531C0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(this.PAGE_NAME, false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m74531C0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C28156j getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.viewModel = (UgcFavoriteViewModel) new C3227v0(activity).m14969a(UgcFavoriteViewModel.class);
        }
        C26866a.a.m104898f(C26866a.f81698a, "UgcFavoriteListFragment", "favorite getViewBinding", false, 4, null);
        C28156j c28156jM109321c = C28156j.m109321c(getLayoutInflater());
        Intrinsics.m97801g(c28156jM109321c, "inflate(...)");
        return c28156jM109321c;
    }
}
