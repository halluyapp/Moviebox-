package com.transsion.room.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.RoomJoinAnimationView;
import com.p282tn.lib.view.RoomJoinStatus;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.moviedetailapi.bean.RoomNet;
import com.transsion.room.R$id;
import com.transsion.room.adapter.RecommendRoomsAdapter;
import com.transsion.room.helper.C18189l;
import com.transsion.room.viewmodel.RoomDetailViewModel;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.JoinRoomEvent;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import p415fq.InterfaceC23414e;
import p429g4.InterfaceC23498a;
import p441gz.InterfaceC23704a;
import p441gz.InterfaceC23705b;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020*H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0004¢\u0006\u0004\b2\u0010\u0010J\u000f\u00103\u001a\u00020\u000eH\u0004¢\u0006\u0004\b3\u0010\u0010J\u001f\u00106\u001a\u00020\u000e2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020\nH\u0004¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH&¢\u0006\u0004\b8\u0010\u0010J\u0011\u0010:\u001a\u0004\u0018\u000109H&¢\u0006\u0004\b:\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010<H&¢\u0006\u0004\b=\u0010>R$\u0010E\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\n0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001d\u0010[\u001a\u0004\u0018\u00010V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006i"}, m97100d2 = {"Lcom/transsion/room/widget/RoomsBaseView;", "Lg4/a;", "T", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lfq/e;", "Lgz/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", CampaignEx.JSON_KEY_AD_R, "()V", CampaignEx.JSON_KEY_AD_Q, RequestParameters.POSITION, "C", "(I)V", "s", "", TtmlNode.TAG_P, "()Z", "Landroidx/fragment/app/FragmentActivity;", "activity", "x", "(Landroidx/fragment/app/FragmentActivity;)V", "Lcom/transsnet/loginapi/bean/UserInfo;", "user", "onLogin", "(Lcom/transsnet/loginapi/bean/UserInfo;)V", "onAttachedToWindow", "onDetachedFromWindow", "getView", "()Lcom/transsion/room/widget/RoomsBaseView;", "", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "dataList", "setList", "(Ljava/util/List;)V", "", "pageName", "moduleName", "setReportName", "(Ljava/lang/String;Ljava/lang/String;)V", CampaignEx.JSON_KEY_TITLE, "updateTitle", "(Ljava/lang/String;)V", "B", "A", WebConstants.FIELD_ITEM, "index", "z", "(Lcom/transsion/moviedetailapi/bean/RoomItem;I)V", "initRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "a", "Lg4/a;", "getMViewBinding", "()Lg4/a;", "setMViewBinding", "(Lg4/a;)V", "mViewBinding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/Integer;", "mCurJoinPosition", "Lcom/tn/lib/view/RoomJoinAnimationView;", "c", "Lcom/tn/lib/view/RoomJoinAnimationView;", "mCurJoinView", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "mPageName", "e", "mModuleName", "", "f", "Ljava/util/Set;", "mExposedItems", "Lgz/a;", "g", "Lkotlin/Lazy;", "getMLoginApi", "()Lgz/a;", "mLoginApi", "Lcom/transsion/room/viewmodel/RoomDetailViewModel;", "h", "getMDetailViewModel", "()Lcom/transsion/room/viewmodel/RoomDetailViewModel;", "mDetailViewModel", "Lcom/transsion/room/adapter/RecommendRoomsAdapter;", "i", "Lcom/transsion/room/adapter/RecommendRoomsAdapter;", "getMAdapter", "()Lcom/transsion/room/adapter/RecommendRoomsAdapter;", "setMAdapter", "(Lcom/transsion/room/adapter/RecommendRoomsAdapter;)V", "mAdapter", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class RoomsBaseView<T extends InterfaceC23498a> extends ConstraintLayout implements InterfaceC23414e, InterfaceC23705b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC23498a mViewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Integer mCurJoinPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private RoomJoinAnimationView mCurJoinView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String mPageName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mModuleName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Set mExposedItems;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy mLoginApi;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy mDetailViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private RecommendRoomsAdapter mAdapter;

    /* JADX INFO: renamed from: com.transsion.room.widget.RoomsBaseView$a */
    public static final class C18321a extends RecyclerView.AbstractC4219r {
        C18321a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 == 0) {
                RoomsBaseView.this.m77510q();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
            RoomsBaseView.this.m77510q();
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.widget.RoomsBaseView$b */
    static final class C18322b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59603a;

        C18322b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59603a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59603a;
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
            this.f59603a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomsBaseView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomsBaseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomsBaseView(final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.mExposedItems = new LinkedHashSet();
        this.mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.widget.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomsBaseView.m77516w();
            }
        });
        this.mDetailViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.widget.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomsBaseView.m77515v(context);
            }
        });
        RecommendRoomsAdapter recommendRoomsAdapter = new RecommendRoomsAdapter();
        recommendRoomsAdapter.m36193l(R$id.v_join);
        recommendRoomsAdapter.m36216s1(new InterfaceC27564b() { // from class: com.transsion.room.widget.f
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                RoomsBaseView.m77513t(this.f59619a, baseQuickAdapter, view, i12);
            }
        });
        recommendRoomsAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.room.widget.g
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                RoomsBaseView.m77514u(this.f59620a, baseQuickAdapter, view, i12);
            }
        });
        this.mAdapter = recommendRoomsAdapter;
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        getMDetailViewModel().m77395s().m14851j(fragmentActivity, new C18322b(new Function1() { // from class: com.transsion.room.widget.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomsBaseView.m77508o(this.f59621a, (RoomNet) obj);
            }
        }));
        m77517x(fragmentActivity);
        m77511r();
    }

    public /* synthetic */ RoomsBaseView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: C */
    private final void m77500C(int position) {
        String str;
        if (this.mExposedItems.contains(Integer.valueOf(position))) {
            return;
        }
        this.mExposedItems.add(Integer.valueOf(position));
        RoomItem roomItem = (RoomItem) this.mAdapter.getItem(position);
        String str2 = this.mPageName;
        if (str2 == null || (str = this.mModuleName) == null) {
            return;
        }
        C18189l.f59333a.m77097e(str2, str, roomItem);
    }

    private final RoomDetailViewModel getMDetailViewModel() {
        return (RoomDetailViewModel) this.mDetailViewModel.getValue();
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Unit m77508o(RoomsBaseView roomsBaseView, RoomNet roomNet) {
        if (roomNet == null) {
            RoomJoinAnimationView roomJoinAnimationView = roomsBaseView.mCurJoinView;
            if (roomJoinAnimationView != null) {
                roomJoinAnimationView.setStatus(RoomJoinStatus.JOIN);
            }
        } else {
            RoomJoinAnimationView roomJoinAnimationView2 = roomsBaseView.mCurJoinView;
            if (roomJoinAnimationView2 != null) {
                roomJoinAnimationView2.setStatus(RoomJoinStatus.JOINED);
            }
        }
        roomsBaseView.mCurJoinView = null;
        roomsBaseView.mCurJoinPosition = null;
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p */
    private final boolean m77509p() {
        InterfaceC23704a mLoginApi = getMLoginApi();
        if (mLoginApi != null && mLoginApi.mo90379a()) {
            return true;
        }
        InterfaceC23704a mLoginApi2 = getMLoginApi();
        if (mLoginApi2 == null) {
            return false;
        }
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        mLoginApi2.mo90387i(context);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m77510q() {
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        RecyclerView recyclerView = getRecyclerView();
        RecyclerView.AbstractC4214m layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof GridLayoutManager) {
            iFindFirstVisibleItemPosition = ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
        } else if (!(layoutManager instanceof LinearLayoutManager)) {
            return;
        } else {
            iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager instanceof GridLayoutManager) {
            iFindLastVisibleItemPosition = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (!(linearLayoutManager instanceof LinearLayoutManager)) {
            return;
        } else {
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        }
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            m77500C(iFindFirstVisibleItemPosition);
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m77511r() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new C18321a());
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m77512s() {
        Integer num;
        RoomJoinAnimationView roomJoinAnimationView = this.mCurJoinView;
        if ((roomJoinAnimationView == null || !roomJoinAnimationView.isLoading()) && m77509p() && (num = this.mCurJoinPosition) != null) {
            Intrinsics.m97799e(num);
            if (num.intValue() < 0) {
                return;
            }
            RecommendRoomsAdapter recommendRoomsAdapter = this.mAdapter;
            Integer num2 = this.mCurJoinPosition;
            Intrinsics.m97799e(num2);
            RoomItem roomItem = (RoomItem) recommendRoomsAdapter.getItem(num2.intValue());
            if (C14557c.f51100a.m65671a(1001, 2000L)) {
                return;
            }
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            String groupId = roomItem.getGroupId();
            if (groupId != null) {
                RoomJoinAnimationView roomJoinAnimationView2 = this.mCurJoinView;
                if (roomJoinAnimationView2 != null) {
                    roomJoinAnimationView2.setStatus(RoomJoinStatus.LOADING);
                }
                getMDetailViewModel().m77398w(groupId);
                String str = this.mPageName;
                if (str != null) {
                    C14450a.f50860a.m65145h(str, "join", (60 & 4) != 0 ? "" : groupId, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m77513t(RoomsBaseView roomsBaseView, BaseQuickAdapter adapter, View view, int i11) {
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
            roomsBaseView.m77521z(roomItem, i11);
            return;
        }
        roomsBaseView.mCurJoinPosition = Integer.valueOf(i11);
        roomsBaseView.mCurJoinView = (RoomJoinAnimationView) view;
        roomsBaseView.m77512s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m77514u(RoomsBaseView roomsBaseView, BaseQuickAdapter adapter, View view, int i11) {
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
        roomsBaseView.m77521z(roomItem, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final RoomDetailViewModel m77515v(Context context) {
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (RoomDetailViewModel) new C3227v0((FragmentActivity) context).m14969a(RoomDetailViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC23704a m77516w() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: x */
    private final void m77517x(FragmentActivity activity) {
        Function1 function1 = new Function1() { // from class: com.transsion.room.widget.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomsBaseView.m77518y(this.f59623a, (JoinRoomEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = JoinRoomEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(activity, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Unit m77518y(RoomsBaseView roomsBaseView, JoinRoomEvent value) {
        Intrinsics.m97802h(value, "value");
        Iterator<Object> it = roomsBaseView.mAdapter.getData().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.m97797c(value.getGroupId(), ((RoomItem) it.next()).getGroupId())) {
                break;
            }
            i11++;
        }
        if (i11 >= 0) {
            RoomItem roomItem = (RoomItem) roomsBaseView.mAdapter.m36182f0(i11);
            if (roomItem != null) {
                roomItem.setHasJoin(Boolean.valueOf(value.getJoin()));
            }
            roomsBaseView.mAdapter.notifyItemChanged(i11, Boolean.valueOf(value.getJoin()));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: A */
    protected final void m77519A() {
        String str = this.mPageName;
        if (str != null) {
            C18189l.f59333a.m77098f(str, this.mModuleName);
        }
        Navigator.m61845x(TheRouter.m61773c("/room/home"), getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: B */
    protected final void m77520B() {
        String str = this.mPageName;
        if (str != null) {
            C18189l.f59333a.m77096d(str, this.mModuleName);
        }
        Navigator.m61845x(TheRouter.m61773c("/room/list").m61852F("index", 1), getContext(), null, 2, null);
    }

    protected final RecommendRoomsAdapter getMAdapter() {
        return this.mAdapter;
    }

    protected final T getMViewBinding() {
        return (T) this.mViewBinding;
    }

    public abstract RecyclerView getRecyclerView();

    public abstract TextView getTitleView();

    @Override // p415fq.InterfaceC23414e
    public RoomsBaseView<T> getView() {
        return this;
    }

    public abstract void initRecyclerView();

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC23704a mLoginApi = getMLoginApi();
        if (mLoginApi != null) {
            mLoginApi.mo90392n(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC23704a mLoginApi = getMLoginApi();
        if (mLoginApi != null) {
            mLoginApi.mo90391m(this);
        }
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogin(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        InterfaceC23705b.a.m93655a(this, user);
        m77512s();
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogout() {
        InterfaceC23705b.a.m93656b(this);
    }

    @Override // p441gz.InterfaceC23705b
    public void onUpdateUserInfo(UserInfo userInfo) {
        InterfaceC23705b.a.m93657c(this, userInfo);
    }

    public void setList(List<RoomItem> dataList) {
        Intrinsics.m97802h(dataList, "dataList");
        this.mAdapter.mo36201n1(dataList);
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.post(new Runnable() { // from class: com.transsion.room.widget.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59622a.m77510q();
                }
            });
        }
    }

    protected final void setMAdapter(RecommendRoomsAdapter recommendRoomsAdapter) {
        Intrinsics.m97802h(recommendRoomsAdapter, "<set-?>");
        this.mAdapter = recommendRoomsAdapter;
    }

    protected final void setMViewBinding(T t11) {
        this.mViewBinding = t11;
    }

    @Override // p415fq.InterfaceC23414e
    public void setReportName(String pageName, String moduleName) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(moduleName, "moduleName");
        this.mPageName = pageName;
        this.mModuleName = moduleName;
    }

    @Override // p415fq.InterfaceC23414e
    public void updateTitle(String title) {
        Intrinsics.m97802h(title, "title");
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText(title);
        }
    }

    /* JADX INFO: renamed from: z */
    protected final void m77521z(RoomItem item, int index) {
        Intrinsics.m97802h(item, "item");
        item.setNewPostCount(0L);
        this.mAdapter.notifyItemChanged(index, 0L);
        String str = this.mPageName;
        if (str != null) {
            C18189l.f59333a.m77099g(str, this.mModuleName, item);
        }
        Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", item.getGroupId()).m61872z("need_start_room_home", this instanceof TrendingRoomsView), getContext(), null, 2, null);
    }
}
