package com.transsion.usercenter.profile.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.StateView;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoList;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.profile.adapter.C20646c;
import com.transsion.usercenter.profile.viewmodel.UserProfileVideoViewModel;
import com.transsion.web.api.WebConstants;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import p441gz.InterfaceC23704a;
import p585lw.C25723n0;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p822uv.AbstractC28040c;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010(R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, m97100d2 = {"Lcom/transsion/usercenter/profile/fragment/UserProfileVideoFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llw/n0;", "<init>", "()V", "", "u0", "r0", "n0", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "video", "l0", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "Landroid/view/View;", "j0", "()Landroid/view/View;", "Landroid/view/LayoutInflater;", "inflater", "k0", "(Landroid/view/LayoutInflater;)Llw/n0;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "initData", "lazyLoadData", "onPause", "Lcom/transsion/usercenter/profile/adapter/c;", "a", "Lcom/transsion/usercenter/profile/adapter/c;", "mAdapter", "Lcom/transsion/usercenter/profile/viewmodel/UserProfileVideoViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "i0", "()Lcom/transsion/usercenter/profile/viewmodel/UserProfileVideoViewModel;", "mViewModel", "", "c", "Z", "isPendingRefresh", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "J", "firstLoadStartTimeMillis", "e", "hasRecordedFirstLoadDuration", "Lcom/transsion/usercenter/profile/fragment/UserProfileVideoFragment$b;", "f", "Lcom/transsion/usercenter/profile/fragment/UserProfileVideoFragment$b;", "getLoadDurationCallback", "()Lcom/transsion/usercenter/profile/fragment/UserProfileVideoFragment$b;", "m0", "(Lcom/transsion/usercenter/profile/fragment/UserProfileVideoFragment$b;)V", "loadDurationCallback", "Lvj/b;", "g", "Lvj/b;", "exposureHelper", "", "h", "Ljava/lang/String;", "targetUserId", "i", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UserProfileVideoFragment extends BaseFragment<C25723n0> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C20646c mAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isPendingRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long firstLoadStartTimeMillis;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean hasRecordedFirstLoadDuration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC20676b loadDurationCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String targetUserId;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileVideoFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UserProfileVideoFragment m85446a(String str) {
            UserProfileVideoFragment userProfileVideoFragment = new UserProfileVideoFragment();
            Bundle bundle = new Bundle();
            bundle.putString("userId", str);
            userProfileVideoFragment.setArguments(bundle);
            return userProfileVideoFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileVideoFragment$b */
    public interface InterfaceC20676b {
        /* JADX INFO: renamed from: a */
        void mo85412a(Long l11, String str, UGCVideo uGCVideo);
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileVideoFragment$c */
    static final class C20677c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65250a;

        C20677c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65250a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65250a;
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
            this.f65250a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.fragment.UserProfileVideoFragment$d */
    public static final class C20678d implements InterfaceC28116a {
        C20678d() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            UGCVideo uGCVideo;
            String collectionId;
            UserInfo userInfoMo90386h;
            C20646c c20646c = UserProfileVideoFragment.this.mAdapter;
            if (c20646c == null || (uGCVideo = (UGCVideo) CollectionsKt.m97362l0(c20646c.getData(), i11)) == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("browse_duration", String.valueOf(j11));
            map.put("module_name", WebConstants.FIELD_ITEM);
            map.put("page_tab_name", UserProfileVideoFragment.this.getString(R$string.profile_video));
            UGCVideoBelongToCollection belongToCollection = uGCVideo.getBelongToCollection();
            if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
                collectionId = "";
            }
            map.put("belong_to_collection_id", collectionId);
            String ugcVideoId = uGCVideo.getUgcVideoId();
            if (ugcVideoId == null) {
                ugcVideoId = "";
            }
            map.put("content_id", ugcVideoId);
            String subjectId = uGCVideo.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            map.put("refer_subject_id", subjectId);
            map.put("content_type", "ugc_video");
            String ops = uGCVideo.getOps();
            map.put("ops", ops != null ? ops : "");
            String str = UserProfileVideoFragment.this.targetUserId;
            InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
            map.put("uploader_type", Intrinsics.m97797c(str, (interfaceC23704a == null || (userInfoMo90386h = interfaceC23704a.mo90386h()) == null) ? null : userInfoMo90386h.getUserId()) ? "me" : "others");
            C14450a.f50860a.m65142e("Userpage", map);
        }
    }

    public UserProfileVideoFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.usercenter.profile.fragment.UserProfileVideoFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UserProfileVideoViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.usercenter.profile.fragment.UserProfileVideoFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.usercenter.profile.fragment.UserProfileVideoFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function0.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.targetUserId = "";
    }

    /* JADX INFO: renamed from: i0 */
    private final UserProfileVideoViewModel m85432i0() {
        return (UserProfileVideoViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    private final View m85433j0() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        StateView stateView = new StateView(contextRequireContext);
        stateView.showData(2, 1, false, "", "");
        return stateView;
    }

    /* JADX INFO: renamed from: l0 */
    private final void m85434l0(UGCVideo video) {
        C26866a.f81698a.m104912c("Userpage", "click item id=" + video.getUgcVideoId(), false);
        AbstractC28040c.m109012i(video, null, null, 3, null);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m85435n0() {
        m85432i0().m85552q().m14851j(this, new C20677c(new Function1() { // from class: com.transsion.usercenter.profile.fragment.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserProfileVideoFragment.m85438q0(this.f65282a, (UGCVideoList) obj);
            }
        }));
        m85432i0().m85553s().m14851j(this, new C20677c(new Function1() { // from class: com.transsion.usercenter.profile.fragment.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserProfileVideoFragment.m85436o0(this.f65253a, (Boolean) obj);
            }
        }));
        m85432i0().m85551p().m14851j(this, new C20677c(new Function1() { // from class: com.transsion.usercenter.profile.fragment.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserProfileVideoFragment.m85437p0(this.f65255a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final Unit m85436o0(UserProfileVideoFragment userProfileVideoFragment, Boolean bool) {
        SwipeRefreshLayout swipeRefreshLayout;
        C25723n0 mViewBinding = userProfileVideoFragment.getMViewBinding();
        if (mViewBinding != null && (swipeRefreshLayout = mViewBinding.f78324c) != null) {
            swipeRefreshLayout.setRefreshing(Intrinsics.m97797c(bool, Boolean.TRUE));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final Unit m85437p0(UserProfileVideoFragment userProfileVideoFragment, String str) {
        C20646c c20646c;
        C27941f c27941fM36186h0;
        if (str != null && (c20646c = userProfileVideoFragment.mAdapter) != null && (c27941fM36186h0 = c20646c.m36186h0()) != null) {
            c27941fM36186h0.m108669v();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m85438q0(UserProfileVideoFragment userProfileVideoFragment, UGCVideoList uGCVideoList) {
        List<UGCVideo> listL;
        String ops;
        List<UGCVideo> items;
        List<UGCVideo> items2;
        UGCVideo uGCVideo;
        Pager pager;
        C20646c c20646c = userProfileVideoFragment.mAdapter;
        if (c20646c == null) {
            return Unit.f75682a;
        }
        if (uGCVideoList == null || (listL = uGCVideoList.getItems()) == null) {
            listL = CollectionsKt.m97506l();
        }
        boolean zM97797c = (uGCVideoList == null || (pager = uGCVideoList.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE);
        boolean zIsEmpty = c20646c.getData().isEmpty();
        if (userProfileVideoFragment.isPendingRefresh && zIsEmpty && !userProfileVideoFragment.hasRecordedFirstLoadDuration && userProfileVideoFragment.firstLoadStartTimeMillis > 0) {
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - userProfileVideoFragment.firstLoadStartTimeMillis);
            userProfileVideoFragment.hasRecordedFirstLoadDuration = true;
            userProfileVideoFragment.firstLoadStartTimeMillis = 0L;
            if (uGCVideoList == null || (items2 = uGCVideoList.getItems()) == null || (uGCVideo = (UGCVideo) CollectionsKt.m97361k0(items2)) == null || (ops = uGCVideo.getOps()) == null) {
                ops = "";
            }
            InterfaceC20676b interfaceC20676b = userProfileVideoFragment.loadDurationCallback;
            if (interfaceC20676b != null) {
                interfaceC20676b.mo85412a(lValueOf, ops, (uGCVideoList == null || (items = uGCVideoList.getItems()) == null) ? null : (UGCVideo) CollectionsKt.m97361k0(items));
            }
        }
        if (userProfileVideoFragment.isPendingRefresh) {
            if (!listL.isEmpty()) {
                c20646c.mo36201n1(listL);
            } else if (c20646c.getData().isEmpty()) {
                c20646c.mo36201n1(null);
                c20646c.m36171Y0(userProfileVideoFragment.m85433j0());
            }
            userProfileVideoFragment.isPendingRefresh = false;
        } else {
            List<UGCVideo> list = listL;
            if (!list.isEmpty()) {
                c20646c.mo36208q(list);
            }
        }
        if (zM97797c) {
            c20646c.m36186h0().m108667s();
        } else {
            C27941f.m108652u(c20646c.m36186h0(), false, 1, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: r0 */
    private final void m85439r0() {
        RecyclerView recyclerView;
        C25723n0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f78323b) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext(), 1, false));
        C28117b c28117b = new C28117b(0.6f, new C20678d(), false, 4, null);
        c28117b.m109199n(2);
        this.exposureHelper = c28117b;
        final C20646c c20646c = new C20646c(new ArrayList(), this.exposureHelper);
        c20646c.m36227w1(new InterfaceC27566d() { // from class: com.transsion.usercenter.profile.fragment.w
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UserProfileVideoFragment.m85440s0(c20646c, this, baseQuickAdapter, view, i11);
            }
        });
        c20646c.m36186h0().m108672y(true);
        c20646c.m36186h0().m108657E(2);
        c20646c.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.usercenter.profile.fragment.x
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                UserProfileVideoFragment.m85441t0(this.f65280a);
            }
        });
        this.mAdapter = c20646c;
        recyclerView.setAdapter(c20646c);
        C28117b c28117b2 = this.exposureHelper;
        if (c28117b2 != null) {
            recyclerView.addOnScrollListener(c28117b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m85440s0(C20646c c20646c, UserProfileVideoFragment userProfileVideoFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String collectionId;
        UserInfo userInfoMo90386h;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        UGCVideo uGCVideo = (UGCVideo) CollectionsKt.m97362l0(c20646c.getData(), i11);
        if (uGCVideo != null) {
            HashMap map = new HashMap();
            map.put("module_name", WebConstants.FIELD_ITEM);
            map.put("page_tab_name", userProfileVideoFragment.getString(R$string.profile_video));
            UGCVideoBelongToCollection belongToCollection = uGCVideo.getBelongToCollection();
            if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
                collectionId = "";
            }
            map.put("belong_to_collection_id", collectionId);
            String ugcVideoId = uGCVideo.getUgcVideoId();
            if (ugcVideoId == null) {
                ugcVideoId = "";
            }
            map.put("content_id", ugcVideoId);
            String subjectId = uGCVideo.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            map.put("refer_subject_id", subjectId);
            map.put("content_type", "ugc_video");
            String ops = uGCVideo.getOps();
            map.put("ops", ops != null ? ops : "");
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            String str = userProfileVideoFragment.targetUserId;
            InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
            map.put("uploader_type", Intrinsics.m97797c(str, (interfaceC23704a == null || (userInfoMo90386h = interfaceC23704a.mo90386h()) == null) ? null : userInfoMo90386h.getUserId()) ? "me" : "others");
            C14450a.f50860a.m65143f("Userpage", map);
            userProfileVideoFragment.m85434l0(uGCVideo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m85441t0(UserProfileVideoFragment userProfileVideoFragment) {
        C26866a.f81698a.m104912c("Userpage", "onLoadMore", false);
        userProfileVideoFragment.isPendingRefresh = false;
        userProfileVideoFragment.m85432i0().m85555u();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m85442u0() {
        SwipeRefreshLayout swipeRefreshLayout;
        C25723n0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (swipeRefreshLayout = mViewBinding.f78324c) == null) {
            return;
        }
        Context context = swipeRefreshLayout.getContext();
        if (context != null) {
            swipeRefreshLayout.setProgressBackgroundColorSchemeColor(AbstractC2397b.getColor(context, R$color.bg_01));
            swipeRefreshLayout.setColorSchemeColors(AbstractC2397b.getColor(context, R$color.main_gradient_center), AbstractC2397b.getColor(context, R$color.main_gradient_start));
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.usercenter.profile.fragment.y
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
            /* JADX INFO: renamed from: a */
            public final void mo21823a() {
                UserProfileVideoFragment.m85443v0(this.f65281a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m85443v0(UserProfileVideoFragment userProfileVideoFragment) {
        C26866a.f81698a.m104912c("Userpage", "onRefresh", false);
        if (!userProfileVideoFragment.hasRecordedFirstLoadDuration && userProfileVideoFragment.firstLoadStartTimeMillis == 0) {
            userProfileVideoFragment.firstLoadStartTimeMillis = System.currentTimeMillis();
        }
        C28117b c28117b = userProfileVideoFragment.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
        userProfileVideoFragment.isPendingRefresh = true;
        userProfileVideoFragment.m85432i0().m85556w();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        String string;
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("userId")) == null) {
            string = "";
        }
        this.targetUserId = string;
        m85432i0().m85554t(this.targetUserId);
        m85435n0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        m85442u0();
        m85439r0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C25723n0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25723n0 c25723n0M101191c = C25723n0.m101191c(inflater);
        Intrinsics.m97801g(c25723n0M101191c, "inflate(...)");
        return c25723n0M101191c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        C26866a.f81698a.m104912c("Userpage", "lazyLoadData -> refresh", false);
        if (!this.hasRecordedFirstLoadDuration && this.firstLoadStartTimeMillis == 0) {
            this.firstLoadStartTimeMillis = System.currentTimeMillis();
        }
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
        this.isPendingRefresh = true;
        m85432i0().m85556w();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m85445m0(InterfaceC20676b interfaceC20676b) {
        this.loadDurationCallback = interfaceC20676b;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }
}
