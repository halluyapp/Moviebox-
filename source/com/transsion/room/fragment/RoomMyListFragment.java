package com.transsion.room.fragment;

import android.os.Bundle;
import androidx.core.os.AbstractC2411d;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.R$string;
import com.transsion.room.adapter.RoomListAdapter;
import com.transsion.room.adapter.RoomListFrom;
import com.transsion.room.viewmodel.RoomViewModel;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.JoinRoomEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import p550kj.C24655b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u000eR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomMyListFragment;", "Lcom/transsion/room/fragment/RoomListBaseFragment;", "<init>", "()V", "", "N0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initViewModel", "initListener", "", "getEmptyDescText", "()Ljava/lang/String;", "Lcom/transsion/room/adapter/RoomListFrom;", "w0", "()Lcom/transsion/room/adapter/RoomListFrom;", "", "isRefresh", "E0", "(Z)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "pageName", "n", "Ljava/lang/String;", "userId", "o", "a", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomMyListFragment extends RoomListBaseFragment {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String userId;

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomMyListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RoomMyListFragment m77045a(boolean z11, String str) {
            RoomMyListFragment roomMyListFragment = new RoomMyListFragment();
            roomMyListFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("is_select_room", Boolean.valueOf(z11)), TuplesKt.m97108a("user_id", str)));
            return roomMyListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomMyListFragment$b */
    static final class C18089b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59227a;

        C18089b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59227a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59227a;
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
            this.f59227a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final Unit m77042M0(RoomMyListFragment roomMyListFragment, RoomBean roomBean) {
        roomMyListFragment.m77000J0(roomBean);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: N0 */
    private final void m77043N0() {
        Function1 function1 = new Function1() { // from class: com.transsion.room.fragment.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomMyListFragment.m77044O0(this.f59309a, (JoinRoomEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = JoinRoomEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final Unit m77044O0(RoomMyListFragment roomMyListFragment, JoinRoomEvent value) {
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (value.getJoin()) {
                roomMyListFragment.m77001t0();
            } else {
                RoomListAdapter roomListAdapterM77002u0 = roomMyListFragment.getMAdapter();
                int i11 = -1;
                if (roomListAdapterM77002u0 != null && (data = roomListAdapterM77002u0.getData()) != null) {
                    Iterator<Object> it = data.iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        if (Intrinsics.m97797c(((RoomItem) it.next()).getGroupId(), value.getGroupId())) {
                            i11 = i12;
                            break;
                        }
                        i12++;
                    }
                }
                if (i11 < 0) {
                    return Unit.f75682a;
                }
                RoomListAdapter roomListAdapterM77002u1 = roomMyListFragment.getMAdapter();
                if (roomListAdapterM77002u1 != null) {
                    roomListAdapterM77002u1.mo36138G0(i11);
                }
                RoomListAdapter roomListAdapterM77002u2 = roomMyListFragment.getMAdapter();
                List<Object> data2 = roomListAdapterM77002u2 != null ? roomListAdapterM77002u2.getData() : null;
                if (data2 == null || data2.isEmpty()) {
                    roomMyListFragment.checkToShowEmptyView();
                }
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment
    /* JADX INFO: renamed from: E0 */
    public void mo76999E0(boolean isRefresh) {
        RoomViewModel roomViewModelM77003v0 = getMViewModel();
        if (roomViewModelM77003v0 != null) {
            roomViewModelM77003v0.m77462z(isRefresh, getMPage(), getMPerPage(), this.userId);
        }
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public String getEmptyDescText() {
        String string = getString(R$string.my_room_empty_tips);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        m77043N0();
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        C3187b0 c3187b0M77449A;
        super.initViewModel();
        RoomViewModel roomViewModelM77003v0 = getMViewModel();
        if (roomViewModelM77003v0 == null || (c3187b0M77449A = roomViewModelM77003v0.m77449A()) == null) {
            return;
        }
        c3187b0M77449A.m14851j(this, new C18089b(new Function1() { // from class: com.transsion.room.fragment.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomMyListFragment.m77042M0(this.f59311a, (RoomBean) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("my_room_list", false, 2, null);
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("user_id")) == null) {
            string = null;
        }
        this.userId = string;
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment
    public String pageName() {
        return "my_room_list";
    }

    @Override // com.transsion.room.fragment.RoomListBaseFragment
    /* JADX INFO: renamed from: w0 */
    public RoomListFrom mo77004w0() {
        return RoomListFrom.MY_ROOM;
    }
}
