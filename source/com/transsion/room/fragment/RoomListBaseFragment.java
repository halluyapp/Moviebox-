package com.transsion.room.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.LiveData;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.RoomJoinAnimationView;
import com.p282tn.lib.view.RoomJoinStatus;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.LazyFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.moviedetailapi.bean.RoomNet;
import com.transsion.publish.api.GroupBean;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.adapter.RoomListAdapter;
import com.transsion.room.adapter.RoomListFrom;
import com.transsion.room.helper.C18189l;
import com.transsion.room.viewmodel.RoomDetailViewModel;
import com.transsion.room.viewmodel.RoomViewModel;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23656r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p393f.C23284j;
import p441gz.InterfaceC23704a;
import p465hp.C23889b;
import p550kj.C24655b;
import p550kj.C24662i;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004J\u0019\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0004J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H&¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u0011H&¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001dH&¢\u0006\u0004\b5\u0010\u001fR$\u0010=\u001a\u0004\u0018\u0001068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010I\u001a\u0004\u0018\u00010B8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010X\u001a\u0004\u0018\u00010\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bT\u0010R\u001a\u0004\bU\u0010\u001f\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001d\u0010o\u001a\u0004\u0018\u00010j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\"\u0010u\u001a\u0010\u0012\f\u0012\n r*\u0004\u0018\u00010q0q0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010t¨\u0006v"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomListBaseFragment;", "Lcom/transsion/baseui/fragment/LazyFragment;", "Lgq/r;", "<init>", "()V", "", "initExposureHelper", "Lcom/transsion/moviedetailapi/bean/RoomItem;", WebConstants.FIELD_ITEM, "", RequestParameters.POSITION, "I0", "(Lcom/transsion/moviedetailapi/bean/RoomItem;I)V", "s0", "D0", "H0", "(Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "", "checkLogin", "()Z", "Landroid/view/LayoutInflater;", "inflater", "x0", "(Landroid/view/LayoutInflater;)Lgq/r;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "lazyLoadData", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isShowPageStateLayoutTitle", "isAudioShowNoNetworkLayout", "getEmptyDescText", "initViewData", "initViewModel", "retryLoadData", "t0", "Lcom/transsion/moviedetailapi/bean/RoomBean;", "bean", "J0", "(Lcom/transsion/moviedetailapi/bean/RoomBean;)V", "checkToShowEmptyView", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "Lcom/transsion/room/adapter/RoomListFrom;", "w0", "()Lcom/transsion/room/adapter/RoomListFrom;", "isRefresh", "E0", "(Z)V", "pageName", "Lcom/transsion/room/adapter/RoomListAdapter;", "a", "Lcom/transsion/room/adapter/RoomListAdapter;", "u0", "()Lcom/transsion/room/adapter/RoomListAdapter;", "setMAdapter", "(Lcom/transsion/room/adapter/RoomListAdapter;)V", "mAdapter", "Lvj/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lvj/b;", "mExposureHelper", "Lcom/transsion/room/viewmodel/RoomViewModel;", "c", "Lcom/transsion/room/viewmodel/RoomViewModel;", "v0", "()Lcom/transsion/room/viewmodel/RoomViewModel;", "setMViewModel", "(Lcom/transsion/room/viewmodel/RoomViewModel;)V", "mViewModel", "Lcom/transsion/room/viewmodel/RoomDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/room/viewmodel/RoomDetailViewModel;", "mDetailViewModel", "e", "Z", "isSelectRoom", "f", "Ljava/lang/String;", "mPageFrom", "g", "getMPage", "setMPage", "(Ljava/lang/String;)V", "mPage", "h", "I", "getMPerPage", "()I", "setMPerPage", "(I)V", "mPerPage", "i", "Ljava/lang/Integer;", "mCurJoinPosition", "Lcom/tn/lib/view/RoomJoinAnimationView;", "j", "Lcom/tn/lib/view/RoomJoinAnimationView;", "mCurJoinView", CampaignEx.JSON_KEY_AD_K, "Landroid/view/View;", "mLoadingView", "Lgz/a;", "l", "Lkotlin/Lazy;", "getMLoginApi", "()Lgz/a;", "mLoginApi", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "m", "Landroidx/activity/result/b;", "mLoginLaunch", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class RoomListBaseFragment extends LazyFragment<C23656r> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RoomListAdapter mAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C28117b mExposureHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private RoomViewModel mViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RoomDetailViewModel mDetailViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isSelectRoom;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String mPageFrom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String mPage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Integer mCurJoinPosition;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private RoomJoinAnimationView mCurJoinView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private View mLoadingView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final AbstractC0249b mLoginLaunch;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mPerPage = 12;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Lazy mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.fragment.h1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomListBaseFragment.mLoginApi_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomListBaseFragment$a */
    public static final class C18079a implements InterfaceC28116a {
        C18079a() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            RoomItem roomItem;
            RoomListBaseFragment roomListBaseFragment = RoomListBaseFragment.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                RoomListAdapter mAdapter = roomListBaseFragment.getMAdapter();
                if (mAdapter != null && (roomItem = (RoomItem) mAdapter.getItem(i11)) != null) {
                    C18189l.f59333a.m77101i(roomListBaseFragment.mPageFrom, roomListBaseFragment.pageName(), i11, j11, roomItem);
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomListBaseFragment$b */
    public static final class C18080b extends DiffUtil.AbstractC4174e {
        C18080b() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(RoomItem oldItem, RoomItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getGroupId(), newItem.getGroupId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(RoomItem oldItem, RoomItem newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getGroupId(), newItem.getGroupId());
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomListBaseFragment$c */
    static final class C18081c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59205a;

        C18081c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59205a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59205a;
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
            this.f59205a.invoke(obj);
        }
    }

    public RoomListBaseFragment() {
        AbstractC0249b abstractC0249bRegisterForActivityResult = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.room.fragment.i1
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                RoomListBaseFragment.m76985G0(this.f59260a, (ActivityResult) obj);
            }
        });
        Intrinsics.m97801g(abstractC0249bRegisterForActivityResult, "registerForActivityResult(...)");
        this.mLoginLaunch = abstractC0249bRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m76980A0(RoomListBaseFragment roomListBaseFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        RoomItem roomItem = item instanceof RoomItem ? (RoomItem) item : null;
        if (roomItem == null) {
            return;
        }
        if (Intrinsics.m97797c(roomItem.getHasJoin(), Boolean.TRUE)) {
            roomListBaseFragment.m76987I0(roomItem, i11);
            return;
        }
        roomListBaseFragment.mCurJoinPosition = Integer.valueOf(i11);
        roomListBaseFragment.mCurJoinView = (RoomJoinAnimationView) view;
        roomListBaseFragment.m76983D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m76981B0(RoomListBaseFragment roomListBaseFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        RoomItem roomItem = item instanceof RoomItem ? (RoomItem) item : null;
        if (roomItem == null) {
            return;
        }
        if (roomListBaseFragment.isSelectRoom) {
            roomListBaseFragment.m76986H0(roomItem);
        } else {
            roomListBaseFragment.m76987I0(roomItem, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m76982C0(RoomListBaseFragment roomListBaseFragment, RoomNet roomNet) {
        if (roomNet == null) {
            RoomJoinAnimationView roomJoinAnimationView = roomListBaseFragment.mCurJoinView;
            if (roomJoinAnimationView != null) {
                roomJoinAnimationView.setStatus(RoomJoinStatus.JOIN);
            }
        } else {
            RoomJoinAnimationView roomJoinAnimationView2 = roomListBaseFragment.mCurJoinView;
            if (roomJoinAnimationView2 != null) {
                roomJoinAnimationView2.setStatus(RoomJoinStatus.JOINED);
            }
        }
        roomListBaseFragment.mCurJoinView = null;
        roomListBaseFragment.mCurJoinPosition = null;
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: D0 */
    private final void m76983D0() {
        Integer num;
        RoomItem roomItem;
        String groupId;
        RoomJoinAnimationView roomJoinAnimationView = this.mCurJoinView;
        if ((roomJoinAnimationView == null || !roomJoinAnimationView.isLoading()) && checkLogin() && (num = this.mCurJoinPosition) != null) {
            Intrinsics.m97799e(num);
            if (num.intValue() < 0) {
                return;
            }
            RoomListAdapter roomListAdapter = this.mAdapter;
            if (roomListAdapter != null) {
                Integer num2 = this.mCurJoinPosition;
                Intrinsics.m97799e(num2);
                roomItem = (RoomItem) roomListAdapter.getItem(num2.intValue());
            } else {
                roomItem = null;
            }
            if (C14557c.f51100a.m65671a(1001, 2000L)) {
                return;
            }
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            if (roomItem == null || (groupId = roomItem.getGroupId()) == null) {
                return;
            }
            RoomJoinAnimationView roomJoinAnimationView2 = this.mCurJoinView;
            if (roomJoinAnimationView2 != null) {
                roomJoinAnimationView2.setStatus(RoomJoinStatus.LOADING);
            }
            RoomDetailViewModel roomDetailViewModel = this.mDetailViewModel;
            if (roomDetailViewModel != null) {
                roomDetailViewModel.m77398w(groupId);
            }
            C14450a.f50860a.m65145h(pageName(), "join", (60 & 4) != 0 ? "" : groupId, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m76984F0(RoomListBaseFragment roomListBaseFragment, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadData");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        roomListBaseFragment.mo76999E0(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m76985G0(RoomListBaseFragment roomListBaseFragment, ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        if (it.getResultCode() == -1) {
            roomListBaseFragment.m76983D0();
            return;
        }
        RoomJoinAnimationView roomJoinAnimationView = roomListBaseFragment.mCurJoinView;
        if (roomJoinAnimationView != null) {
            roomJoinAnimationView.setStatus(RoomJoinStatus.JOIN);
        }
        roomListBaseFragment.mCurJoinView = null;
        roomListBaseFragment.mCurJoinPosition = null;
    }

    /* JADX INFO: renamed from: H0 */
    private final void m76986H0(RoomItem item) {
        C26866a.a.m104898f(C26866a.f81698a, "RoomList", "onSelectRoom, name:" + item.getName() + ",id:" + item.getGroupId(), false, 4, null);
        GroupBean groupBean = new GroupBean();
        groupBean.setGroupId(item.getGroupId());
        groupBean.setName(item.getName());
        groupBean.setDes(item.getDescription());
        groupBean.setDescription(item.getDescription());
        groupBean.setPostCount(String.valueOf(item.getPostCount()));
        groupBean.setAvatar(item.getAvatar());
        groupBean.setNewPostCount(String.valueOf(item.getNewPostCount()));
        groupBean.setOps(item.getOps());
        C23889b c23889b = new C23889b();
        c23889b.m94631o(6);
        c23889b.m94630n(1);
        c23889b.m94629m(groupBean);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final void m76987I0(RoomItem item, int position) {
        if (item != null) {
            C18189l.f59333a.m77102j(this.mPageFrom, pageName(), position, item);
        }
        Navigator.m61845x(TheRouter.m61773c("/room/detail").m61855I(WebConstants.FIELD_ITEM, item).m61857K("id", item != null ? item.getGroupId() : null), requireContext(), null, 2, null);
        m76996s0(item, position);
    }

    private final boolean checkLogin() {
        InterfaceC23704a mLoginApi;
        InterfaceC23704a mLoginApi2 = getMLoginApi();
        if (mLoginApi2 != null && mLoginApi2.mo90379a()) {
            return true;
        }
        AbstractC0249b abstractC0249b = this.mLoginLaunch;
        Context context = getContext();
        Intent intentMo90394p = null;
        if (context != null && (mLoginApi = getMLoginApi()) != null) {
            intentMo90394p = mLoginApi.mo90394p(context);
        }
        abstractC0249b.m999a(intentMo90394p);
        return false;
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initExposureHelper() {
        RecyclerView recyclerView;
        C28117b c28117b = new C28117b(0.6f, new C18079a(), false, 4, null);
        c28117b.m109199n(2);
        C23656r c23656r = (C23656r) getMViewBinding();
        if (c23656r != null && (recyclerView = c23656r.f72303b) != null) {
            recyclerView.addOnScrollListener(c28117b);
        }
        this.mExposureHelper = c28117b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m76996s0(RoomItem item, int position) {
        if (item != null) {
            item.setNewPostCount(0L);
        }
        RoomListAdapter roomListAdapter = this.mAdapter;
        if (roomListAdapter != null) {
            roomListAdapter.notifyItemChanged(position, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m76997y0(RoomListBaseFragment roomListBaseFragment) {
        roomListBaseFragment.m77001t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m76998z0(RoomListBaseFragment roomListBaseFragment) {
        roomListBaseFragment.mo76999E0(false);
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo76999E0(boolean isRefresh);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J0 */
    public void m77000J0(RoomBean bean) {
        List<Object> arrayList;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        Pager pager;
        C27941f c27941fM36186h2;
        List<RoomItem> items;
        C27941f c27941fM36186h3;
        RoomListAdapter roomListAdapter;
        C27941f c27941fM36186h4;
        C27941f c27941fM36186h5;
        RoomListAdapter roomListAdapter2;
        C27941f c27941fM36186h6;
        SwipeRefreshLayout swipeRefreshLayout;
        C23656r c23656r;
        SwipeRefreshLayout swipeRefreshLayout2;
        C23656r c23656r2 = (C23656r) getMViewBinding();
        if (c23656r2 != null && (swipeRefreshLayout = c23656r2.f72304c) != null && swipeRefreshLayout.isRefreshing() && (c23656r = (C23656r) getMViewBinding()) != null && (swipeRefreshLayout2 = c23656r.f72304c) != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        showContentView();
        RoomListAdapter roomListAdapter3 = this.mAdapter;
        if (roomListAdapter3 == null || (arrayList = roomListAdapter3.getData()) == null) {
            arrayList = new ArrayList<>();
        }
        if (bean == null || (items = bean.getItems()) == null || items.isEmpty()) {
            if (arrayList.isEmpty()) {
                checkToShowEmptyView();
                return;
            }
            RoomListAdapter roomListAdapter4 = this.mAdapter;
            if ((roomListAdapter4 == null || (c27941fM36186h2 = roomListAdapter4.m36186h0()) == null || !c27941fM36186h2.m108666r()) ? false : true) {
                if ((bean == null || (pager = bean.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE)) {
                    RoomListAdapter roomListAdapter5 = this.mAdapter;
                    if (roomListAdapter5 == null || (c27941fM36186h0 = roomListAdapter5.m36186h0()) == null) {
                        return;
                    }
                    c27941fM36186h0.m108669v();
                    return;
                }
                RoomListAdapter roomListAdapter6 = this.mAdapter;
                if (roomListAdapter6 == null || (c27941fM36186h1 = roomListAdapter6.m36186h0()) == null) {
                    return;
                }
                C27941f.m108652u(c27941fM36186h1, false, 1, null);
                return;
            }
            return;
        }
        Pager pager2 = bean.getPager();
        this.mPage = pager2 != null ? pager2.getNextPage() : null;
        if (bean.getIsRefresh()) {
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            RoomListAdapter roomListAdapter7 = this.mAdapter;
            if (roomListAdapter7 != null) {
                roomListAdapter7.mo36201n1(bean.getItems());
            }
        } else {
            List<RoomItem> items2 = bean.getItems();
            if (items2 != null) {
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.addAll(items2);
                } else {
                    for (RoomItem roomItem : items2) {
                        if (!arrayList.contains(roomItem)) {
                            arrayList2.add(roomItem);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    RoomListAdapter roomListAdapter8 = this.mAdapter;
                    if (roomListAdapter8 != null && (c27941fM36186h3 = roomListAdapter8.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h3, false, 1, null);
                    }
                    if (arrayList.isEmpty()) {
                        checkToShowEmptyView();
                    }
                } else {
                    RoomListAdapter roomListAdapter9 = this.mAdapter;
                    if (roomListAdapter9 != null) {
                        roomListAdapter9.mo36208q(arrayList2);
                    }
                }
            }
        }
        RoomListAdapter roomListAdapter10 = this.mAdapter;
        if (roomListAdapter10 != null && (c27941fM36186h5 = roomListAdapter10.m36186h0()) != null && c27941fM36186h5.m108666r() && (roomListAdapter2 = this.mAdapter) != null && (c27941fM36186h6 = roomListAdapter2.m36186h0()) != null) {
            c27941fM36186h6.m108667s();
        }
        Pager pager3 = bean.getPager();
        if ((pager3 != null ? Intrinsics.m97797c(pager3.getHasMore(), Boolean.TRUE) : false) || (roomListAdapter = this.mAdapter) == null || (c27941fM36186h4 = roomListAdapter.m36186h0()) == null) {
            return;
        }
        C27941f.m108652u(c27941fM36186h4, false, 1, null);
    }

    public void checkToShowEmptyView() {
        if (C27287m.f83003a.m106330e()) {
            RoomListAdapter roomListAdapter = this.mAdapter;
            if (roomListAdapter != null) {
                roomListAdapter.m36171Y0(getEmptyView(false));
                return;
            }
            return;
        }
        RoomListAdapter roomListAdapter2 = this.mAdapter;
        if (roomListAdapter2 != null) {
            roomListAdapter2.m36171Y0(getLocalNoNetworkView(false));
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getEmptyDescText() {
        String string = getString(com.transsion.usercenter.R$string.profile_not_content);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        if (this.mLoadingView == null) {
            this.mLoadingView = LayoutInflater.from(requireContext()).inflate(R$layout.layout_room_list_loading, (ViewGroup) getFlStateView(), false);
        }
        return this.mLoadingView;
    }

    protected final String getMPage() {
        return this.mPage;
    }

    protected final int getMPerPage() {
        return this.mPerPage;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout;
        initExposureHelper();
        C23656r c23656r = (C23656r) getMViewBinding();
        if (c23656r != null && (swipeRefreshLayout = c23656r.f72304c) != null) {
            swipeRefreshLayout.setProgressBackgroundColorSchemeColor(AbstractC2397b.getColor(swipeRefreshLayout.getContext(), R$color.bg_01));
            swipeRefreshLayout.setColorSchemeColors(AbstractC2397b.getColor(swipeRefreshLayout.getContext(), R$color.main_gradient_center), AbstractC2397b.getColor(swipeRefreshLayout.getContext(), R$color.main_gradient_start));
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.room.fragment.j1
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    RoomListBaseFragment.m76997y0(this.f59262a);
                }
            });
        }
        RoomListAdapter roomListAdapter = new RoomListAdapter(mo77004w0(), this.isSelectRoom);
        roomListAdapter.m36186h0().m108673z(true);
        roomListAdapter.m36186h0().m108672y(true);
        roomListAdapter.m36186h0().m108657E(3);
        roomListAdapter.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.room.fragment.k1
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                RoomListBaseFragment.m76998z0(this.f59265a);
            }
        });
        roomListAdapter.m36158R0(new C18080b());
        roomListAdapter.m36193l(R$id.v_join);
        roomListAdapter.m36216s1(new InterfaceC27564b() { // from class: com.transsion.room.fragment.l1
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RoomListBaseFragment.m76980A0(this.f59268a, baseQuickAdapter, view, i11);
            }
        });
        roomListAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.room.fragment.m1
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RoomListBaseFragment.m76981B0(this.f59272a, baseQuickAdapter, view, i11);
            }
        });
        this.mAdapter = roomListAdapter;
        C23656r c23656r2 = (C23656r) getMViewBinding();
        if (c23656r2 == null || (recyclerView = c23656r2.f72303b) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.mAdapter);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        RoomListAdapter roomListAdapter;
        LiveData liveDataM77395s;
        RoomDetailViewModel roomDetailViewModel = this.mDetailViewModel;
        if (roomDetailViewModel != null && (liveDataM77395s = roomDetailViewModel.m77395s()) != null) {
            liveDataM77395s.m14851j(this, new C18081c(new Function1() { // from class: com.transsion.room.fragment.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomListBaseFragment.m76982C0(this.f59255a, (RoomNet) obj);
                }
            }));
        }
        if (C27287m.f83003a.m106330e() || (roomListAdapter = this.mAdapter) == null) {
            return;
        }
        roomListAdapter.m36171Y0(getLocalNoNetworkView(false));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        showLoadingView();
        m76984F0(this, false, 1, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.isSelectRoom = arguments != null ? arguments.getBoolean("is_select_room") : false;
        this.mViewModel = (RoomViewModel) new C3227v0(this).m14969a(RoomViewModel.class);
        this.mDetailViewModel = (RoomDetailViewModel) new C3227v0(this).m14969a(RoomDetailViewModel.class);
        this.mPageFrom = C24662i.f75350a.m96877i();
    }

    public abstract String pageName();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        showLoadingView();
        m76984F0(this, false, 1, null);
    }

    /* JADX INFO: renamed from: t0 */
    public void m77001t0() {
        this.mPage = null;
        m76984F0(this, false, 1, null);
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    protected final RoomListAdapter getMAdapter() {
        return this.mAdapter;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    protected final RoomViewModel getMViewModel() {
        return this.mViewModel;
    }

    /* JADX INFO: renamed from: w0 */
    public abstract RoomListFrom mo77004w0();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C23656r getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23656r c23656rM93574c = C23656r.m93574c(inflater);
        Intrinsics.m97801g(c23656rM93574c, "inflate(...)");
        return c23656rM93574c;
    }
}
