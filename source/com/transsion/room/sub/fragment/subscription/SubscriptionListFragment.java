package com.transsion.room.sub.fragment.subscription;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.room.sub.adapter.subscription.C18215s;
import com.transsion.room.sub.adapter.subscription.InterfaceC18198b;
import com.transsion.room.sub.bean.subscription.SubscriptionFollowingsData;
import com.transsion.room.sub.bean.subscription.UserInfoFollowings;
import com.transsion.room.sub.fragment.subscription.SubscriptionListFragment;
import com.transsion.room.sub.viewmodel.subscription.SubFollowingsViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23659u;
import java.util.ArrayList;
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
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u0019\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010?\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010/¨\u0006A"}, m97100d2 = {"Lcom/transsion/room/sub/fragment/subscription/SubscriptionListFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgq/u;", "Lcom/transsion/room/sub/adapter/subscription/b;", "<init>", "()V", "", "Lcom/transsion/room/sub/bean/subscription/UserInfoFollowings;", "userItem", "", "z0", "(Ljava/util/List;)V", "x0", "Lcom/transsion/room/sub/adapter/subscription/s;", "q0", "()Lcom/transsion/room/sub/adapter/subscription/s;", "t0", "Landroid/view/LayoutInflater;", "inflater", "p0", "(Landroid/view/LayoutInflater;)Lgq/u;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "loadDefaultData", "userId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Ljava/lang/String;)V", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "a", "Z", "isLoadingFollowings", "Lcom/transsion/room/sub/viewmodel/subscription/SubFollowingsViewModel;", "Lcom/transsion/room/sub/viewmodel/subscription/SubFollowingsViewModel;", "followingsViewModel", "c", "Ljava/lang/Boolean;", "hasMoreFollowings", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "cursorFollowings", "e", "Lcom/transsion/room/sub/adapter/subscription/s;", "sFollowingsAdapter", "Lvj/b;", "f", "Lvj/b;", "mExposureHelper", "", "g", "J", "firstLoadStartTimeMillis", "h", "durationMySubscriptionList", "i", "PAGE_NAME", "j", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SubscriptionListFragment extends PageStatusFragment<C23659u> implements InterfaceC18198b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isLoadingFollowings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private SubFollowingsViewModel followingsViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String cursorFollowings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C18215s sFollowingsAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C28117b mExposureHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long firstLoadStartTimeMillis;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long durationMySubscriptionList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Boolean hasMoreFollowings = Boolean.FALSE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String PAGE_NAME = "/subscription/my_subscription";

    /* JADX INFO: renamed from: com.transsion.room.sub.fragment.subscription.SubscriptionListFragment$b */
    static final class C18264b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59491a;

        C18264b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59491a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59491a;
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
            this.f59491a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final C18215s m77323q0() {
        C18215s c18215s = new C18215s(new ArrayList(), this.mExposureHelper, false);
        c18215s.m36186h0().m108673z(true);
        c18215s.m36186h0().m108672y(true);
        c18215s.m36186h0().m108657E(2);
        c18215s.m36186h0().m108656D(new InterfaceC27568f() { // from class: nq.q
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                SubscriptionListFragment.m77324r0(this.f79656a);
            }
        });
        this.sFollowingsAdapter = c18215s;
        Intrinsics.m97799e(c18215s);
        return c18215s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m77324r0(final SubscriptionListFragment subscriptionListFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e() && subscriptionListFragment.hasMoreFollowings != null) {
            C26866a.a.m104898f(C26866a.f81698a, "SubscriptionListFragment", "initSubscriptionListAdapter: trigger load more", false, 4, null);
            SubFollowingsViewModel subFollowingsViewModel = subscriptionListFragment.followingsViewModel;
            if (subFollowingsViewModel != null) {
                subFollowingsViewModel.m77348h(subscriptionListFragment.cursorFollowings);
                return;
            }
            return;
        }
        C26866a.a.m104910z(C26866a.f81698a, "SubscriptionListFragment", "initSubscriptionListAdapter: no network, load more failed", false, 4, null);
        C23659u mViewBinding = subscriptionListFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f72317c) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: nq.r
            @Override // java.lang.Runnable
            public final void run() {
                SubscriptionListFragment.m77325s0(this.f79657a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m77325s0(SubscriptionListFragment subscriptionListFragment) {
        C27941f c27941fM36186h0;
        C18215s c18215s = subscriptionListFragment.sFollowingsAdapter;
        if (c18215s == null || (c27941fM36186h0 = c18215s.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: renamed from: t0 */
    private final void m77326t0() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        SwipeRefreshLayout swipeRefreshLayout;
        C23659u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (swipeRefreshLayout = mViewBinding.f72320f) != null) {
            swipeRefreshLayout.setEnabled(true);
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: nq.p
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    SubscriptionListFragment.m77327u0(this.f79655a);
                }
            });
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        linearLayoutManager.setItemPrefetchEnabled(false);
        C23659u mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (recyclerView3 = mViewBinding2.f72317c) != null) {
            recyclerView3.setLayoutManager(linearLayoutManager);
        }
        C23659u mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (recyclerView2 = mViewBinding3.f72317c) != null) {
            recyclerView2.setHasFixedSize(true);
        }
        C18215s c18215sM77323q0 = m77323q0();
        this.sFollowingsAdapter = c18215sM77323q0;
        if (c18215sM77323q0 != null) {
            c18215sM77323q0.m77172Q1(this);
        }
        C23659u mViewBinding4 = getMViewBinding();
        if (mViewBinding4 == null || (recyclerView = mViewBinding4.f72317c) == null) {
            return;
        }
        recyclerView.setAdapter(this.sFollowingsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m77327u0(SubscriptionListFragment subscriptionListFragment) {
        C26866a.a.m104898f(C26866a.f81698a, "SubscriptionListFragment", "initRecyclerView: user pull to refresh", false, 4, null);
        SubFollowingsViewModel subFollowingsViewModel = subscriptionListFragment.followingsViewModel;
        if (subFollowingsViewModel != null) {
            subFollowingsViewModel.m77349i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m77328v0(SubscriptionListFragment subscriptionListFragment, View view) {
        FragmentActivity activity = subscriptionListFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m77329w0(SubscriptionListFragment subscriptionListFragment, SubscriptionFollowingsData subscriptionFollowingsData) {
        SwipeRefreshLayout swipeRefreshLayout;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        C18215s c18215s;
        List<Object> data;
        C27941f c27941fM36186h3;
        C27941f c27941fM36186h4;
        subscriptionListFragment.hasMoreFollowings = subscriptionFollowingsData != null ? Boolean.valueOf(subscriptionFollowingsData.getHasMore()) : null;
        subscriptionListFragment.cursorFollowings = subscriptionFollowingsData != null ? subscriptionFollowingsData.getNextCursor() : null;
        SubFollowingsViewModel subFollowingsViewModel = subscriptionListFragment.followingsViewModel;
        Boolean boolValueOf = subFollowingsViewModel != null ? Boolean.valueOf(subFollowingsViewModel.m77347g()) : null;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "SubscriptionListFragment", "Followings observe start", false, 4, null);
        subscriptionListFragment.showContentView();
        C18215s c18215s2 = subscriptionListFragment.sFollowingsAdapter;
        if (c18215s2 != null && (c27941fM36186h3 = c18215s2.m36186h0()) != null && c27941fM36186h3.m108666r()) {
            C18215s c18215s3 = subscriptionListFragment.sFollowingsAdapter;
            if (c18215s3 != null && (c27941fM36186h4 = c18215s3.m36186h0()) != null) {
                c27941fM36186h4.m108667s();
            }
            C26866a.a.m104898f(aVar, "SubscriptionListFragment", "Followings observe loadMoreComplete", false, 4, null);
        }
        if ((subscriptionFollowingsData != null ? subscriptionFollowingsData.getUsers() : null) != null) {
            List<UserInfoFollowings> users = subscriptionFollowingsData.getUsers();
            Integer numValueOf = users != null ? Integer.valueOf(users.size()) : null;
            C26866a.a.m104898f(aVar, "SubscriptionListFragment", "subscriptionFollowingsBean: received " + numValueOf + " items, currentListSize=" + subscriptionListFragment.sFollowingsAdapter + "?.data?.size}, hasMore=" + subscriptionFollowingsData.getHasMore(), false, 4, null);
            Boolean bool = subscriptionListFragment.hasMoreFollowings;
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.m97797c(bool, bool2) || subscriptionListFragment.hasMoreFollowings == null) {
                C26866a.a.m104898f(aVar, "SubscriptionListFragment", "ugcVideoFavoriteBean: no more data, load more end", false, 4, null);
                C18215s c18215s4 = subscriptionListFragment.sFollowingsAdapter;
                if (c18215s4 != null && (c27941fM36186h2 = c18215s4.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h2, false, 1, null);
                }
                C18215s c18215s5 = subscriptionListFragment.sFollowingsAdapter;
                if (c18215s5 != null && (c27941fM36186h1 = c18215s5.m36186h0()) != null) {
                    c27941fM36186h1.m108673z(false);
                }
                C18215s c18215s6 = subscriptionListFragment.sFollowingsAdapter;
                if (c18215s6 != null && (c27941fM36186h0 = c18215s6.m36186h0()) != null) {
                    c27941fM36186h0.m108672y(false);
                }
                C26866a.a.m104898f(aVar, "SubscriptionListFragment", "Followings observe loadMoreEnd", false, 4, null);
            }
            C18215s c18215s7 = subscriptionListFragment.sFollowingsAdapter;
            if (c18215s7 == null || (data = c18215s7.getData()) == null || !data.isEmpty() || numValueOf == null || numValueOf.intValue() != 0) {
                List<UserInfoFollowings> users2 = subscriptionFollowingsData.getUsers();
                Intrinsics.m97799e(users2);
                subscriptionListFragment.m77332z0(users2);
                if (numValueOf != null && numValueOf.intValue() == 0 && Intrinsics.m97797c(boolValueOf, bool2) && (c18215s = subscriptionListFragment.sFollowingsAdapter) != null) {
                    c18215s.m36171Y0(subscriptionListFragment.getEmptyView(false));
                }
                C26866a.a.m104898f(aVar, "SubscriptionListFragment", "Followings observe updateFollowingsData", false, 4, null);
            } else {
                C26866a.a.m104898f(aVar, "SubscriptionListFragment", "subscriptionFollowingsBean: empty data", false, 4, null);
                C26866a.a.m104898f(aVar, "SubscriptionListFragment", "Followings observe setEmptyView", false, 4, null);
                C18215s c18215s8 = subscriptionListFragment.sFollowingsAdapter;
                if (c18215s8 != null) {
                    c18215s8.m36171Y0(subscriptionListFragment.getEmptyView(false));
                }
            }
            C24655b logViewConfig = subscriptionListFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
        }
        C23659u mViewBinding = subscriptionListFragment.getMViewBinding();
        if (mViewBinding != null && (swipeRefreshLayout = mViewBinding.f72320f) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: x0 */
    private final void m77330x0() {
        ConstraintLayout root;
        showLoadingView();
        if (this.isLoadingFollowings) {
            return;
        }
        this.isLoadingFollowings = true;
        SubFollowingsViewModel subFollowingsViewModel = this.followingsViewModel;
        if (subFollowingsViewModel != null) {
            subFollowingsViewModel.m77346f("");
        }
        C23659u mViewBinding = getMViewBinding();
        if (mViewBinding == null || (root = mViewBinding.getRoot()) == null) {
            return;
        }
        root.postDelayed(new Runnable() { // from class: nq.o
            @Override // java.lang.Runnable
            public final void run() {
                SubscriptionListFragment.m77331y0(this.f79654a);
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m77331y0(SubscriptionListFragment subscriptionListFragment) {
        SwipeRefreshLayout swipeRefreshLayout;
        C23659u mViewBinding = subscriptionListFragment.getMViewBinding();
        if (mViewBinding == null || (swipeRefreshLayout = mViewBinding.f72320f) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: z0 */
    private final void m77332z0(List userItem) {
        List<Object> data;
        List<Object> data2;
        C18215s c18215s = this.sFollowingsAdapter;
        int size = 0;
        int size2 = (c18215s == null || (data2 = c18215s.getData()) == null) ? 0 : data2.size();
        SubFollowingsViewModel subFollowingsViewModel = this.followingsViewModel;
        Boolean boolValueOf = subFollowingsViewModel != null ? Boolean.valueOf(subFollowingsViewModel.m77347g()) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.m97797c(boolValueOf, bool) || size2 == 0) {
            C18215s c18215s2 = this.sFollowingsAdapter;
            if (c18215s2 != null) {
                c18215s2.mo36201n1(userItem);
            }
            C26866a.a.m104898f(C26866a.f81698a, "SubscriptionListFragment", "updateData: refresh or first load, replace data. size: " + size2 + " -> " + userItem.size(), false, 4, null);
        } else {
            C18215s c18215s3 = this.sFollowingsAdapter;
            if (c18215s3 != null) {
                c18215s3.mo36208q(userItem);
            }
            C18215s c18215s4 = this.sFollowingsAdapter;
            if (c18215s4 != null && (data = c18215s4.getData()) != null) {
                size = data.size();
            }
            C26866a.a.m104898f(C26866a.f81698a, "SubscriptionListFragment", "updateData: load more, add " + userItem.size() + " items, list size: " + size2 + " -> " + size, false, 4, null);
        }
        if ((Intrinsics.m97797c(boolValueOf, bool) || size2 == 0) && !userItem.isEmpty()) {
        }
    }

    @Override // com.transsion.room.sub.adapter.subscription.InterfaceC18198b
    /* JADX INFO: renamed from: b */
    public void mo77133b(String userId) {
        Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", userId), getContext(), null, 2, null);
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
        ImageView imageView;
        this.firstLoadStartTimeMillis = SystemClock.elapsedRealtime();
        m77326t0();
        C23659u mViewBinding = getMViewBinding();
        if (mViewBinding == null || (imageView = mViewBinding.f72318d) == null) {
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: nq.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubscriptionListFragment.m77328v0(this.f79653a, view);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        C3187b0 c3187b0M77345e;
        SubFollowingsViewModel subFollowingsViewModel = this.followingsViewModel;
        if (subFollowingsViewModel == null || (c3187b0M77345e = subFollowingsViewModel.m77345e()) == null) {
            return;
        }
        c3187b0M77345e.m14851j(this, new C18264b(new Function1() { // from class: nq.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubscriptionListFragment.m77329w0(this.f79652a, (SubscriptionFollowingsData) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        m77330x0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(this.PAGE_NAME, false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.firstLoadStartTimeMillis;
        this.durationMySubscriptionList = jElapsedRealtime;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("页面停留时长为: ");
        sb2.append(jElapsedRealtime);
        sb2.append(" ");
        C14450a.f50860a.m65147k(this.PAGE_NAME, C24662i.f75350a.m96877i(), String.valueOf(this.durationMySubscriptionList));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C23659u getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.followingsViewModel = (SubFollowingsViewModel) new C3227v0(activity).m14969a(SubFollowingsViewModel.class);
        }
        C23659u c23659uM93586c = C23659u.m93586c(getLayoutInflater());
        Intrinsics.m97801g(c23659uM93586c, "inflate(...)");
        return c23659uM93586c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m77330x0();
    }
}
