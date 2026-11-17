package com.transsion.room.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.BaseListFragment;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.R$string;
import com.transsion.room.adapter.C18036a;
import com.transsion.room.viewmodel.RoomViewModel;
import com.transsion.web.api.WebConstants;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22989b;
import hk.C23862a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import p441gz.InterfaceC23704a;
import p441gz.InterfaceC23705b;
import p466hq.C23890a;
import p550kj.C24655b;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u000eR\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u00106\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010<\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006?"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomsFragment;", "Lcom/transsion/baseui/fragment/BaseListFragment;", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "Lgz/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "s0", "()Ljava/lang/String;", "getPageStateLayoutTitle", "", "isAudioShowNoNetworkLayout", "()Z", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "m0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "initViewData", "initViewModel", "x0", "G0", "loadMore", "lazyLoadData", "loadDefaultData", "retryLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsnet/loginapi/bean/UserInfo;", "user", "onLogin", "(Lcom/transsnet/loginapi/bean/UserInfo;)V", "getEmptyDescText", "Lcom/transsion/room/viewmodel/RoomViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/room/viewmodel/RoomViewModel;", "mRoomViewModel", "c", "Ljava/lang/String;", "mPageNum", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "mPerPage", "e", "mUserId", "f", "Z", "isSelf", "Lgz/a;", "g", "Lkotlin/Lazy;", "getMLoginApi", "()Lgz/a;", "mLoginApi", "h", "a", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class RoomsFragment extends BaseListFragment<RoomItem> implements InterfaceC23705b {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RoomViewModel mRoomViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isSelf;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String mPageNum = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mPerPage = 10;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mUserId = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.fragment.a2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomsFragment.mLoginApi_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomsFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RoomsFragment m77051a(String str, boolean z11) {
            RoomsFragment roomsFragment = new RoomsFragment();
            Bundle bundle = new Bundle();
            bundle.putString("m_User_Id", str);
            bundle.putBoolean("is_Self", z11);
            roomsFragment.setArguments(bundle);
            return roomsFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomsFragment$b */
    static final class C18091b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59235a;

        C18091b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59235a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59235a;
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
            this.f59235a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final void m77049R0(C18036a c18036a, RoomsFragment roomsFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        Navigator.m61845x(TheRouter.m61773c("/room/detail").m61855I(WebConstants.FIELD_ITEM, (Parcelable) c18036a.getItem(i11)), roomsFragment.requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final Unit m77050S0(RoomsFragment roomsFragment, RoomBean roomBean) {
        List<RoomItem> items;
        Pager pager;
        if (roomBean != null && (pager = roomBean.getPager()) != null) {
            if (Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE)) {
                String nextPage = pager.getNextPage();
                if (nextPage == null) {
                    nextPage = "";
                }
                roomsFragment.mPageNum = nextPage;
                Integer perPage = pager.getPerPage();
                roomsFragment.mPerPage = perPage != null ? perPage.intValue() : 10;
                roomsFragment.m65530B0();
            } else {
                BaseListFragment.m65522D0(roomsFragment, false, 1, null);
            }
        }
        if (roomBean == null || (items = roomBean.getItems()) == null) {
            roomsFragment.m65539N0();
        } else if (roomsFragment.m65529A0()) {
            roomsFragment.m65536I0(false);
            BaseQuickAdapter mBaseAdapter = roomsFragment.getMBaseAdapter();
            if (mBaseAdapter != null) {
                mBaseAdapter.mo36201n1(items);
            }
            if (items.isEmpty()) {
                BaseListFragment.m65523K0(roomsFragment, null, 1, null);
            }
        } else {
            BaseQuickAdapter mBaseAdapter2 = roomsFragment.getMBaseAdapter();
            if (mBaseAdapter2 != null) {
                mBaseAdapter2.mo36208q(items);
            }
        }
        return Unit.f75682a;
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: G0 */
    public void mo65534G0() {
        this.mPageNum = "";
        m65536I0(true);
        loadDefaultData();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getEmptyDescText() {
        String string = getString(R$string.not_in_any_rooms);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        m65536I0(true);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        RoomViewModel roomViewModel = (RoomViewModel) new C3227v0(this).m14969a(RoomViewModel.class);
        roomViewModel.m77451C().m14851j(this, new C18091b(new Function1() { // from class: com.transsion.room.fragment.c2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomsFragment.m77050S0(this.f59244a, (RoomBean) obj);
            }
        }));
        this.mRoomViewModel = roomViewModel;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        RoomViewModel roomViewModel = this.mRoomViewModel;
        if (roomViewModel != null) {
            roomViewModel.m77450B(this.mPageNum, this.mPerPage, this.mUserId);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    public void loadMore() {
        if (TextUtils.isEmpty(this.mPageNum) || TextUtils.equals("0", this.mPageNum)) {
            BaseListFragment.m65522D0(this, false, 1, null);
        } else {
            loadDefaultData();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: m0 */
    public BaseQuickAdapter mo65540m0() {
        return null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("myrooms", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        UserInfo userInfoMo90386h;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mUserId = arguments.getString("m_User_Id");
            this.isSelf = arguments.getBoolean("is_Self", false);
            if (TextUtils.isEmpty(this.mUserId)) {
                InterfaceC23704a mLoginApi = getMLoginApi();
                this.mUserId = (mLoginApi == null || (userInfoMo90386h = mLoginApi.mo90386h()) == null) ? null : userInfoMo90386h.getUserId();
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC23704a mLoginApi = getMLoginApi();
        if (mLoginApi != null) {
            mLoginApi.mo90391m(this);
        }
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogin(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        InterfaceC23705b.a.m93655a(this, user);
        this.mUserId = user.getUserId();
        mo65534G0();
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogout() {
        InterfaceC23705b.a.m93656b(this);
    }

    @Override // p441gz.InterfaceC23705b
    public void onUpdateUserInfo(UserInfo userInfo) {
        InterfaceC23705b.a.m93657c(this, userInfo);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m65533F0();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: s0 */
    public String mo65546s0() {
        String string = getString(R$string.str_room_title);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: x0 */
    public void mo65549x0() {
        RecyclerView recyclerView;
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b == null || (recyclerView = c22989b.f70181d) == null) {
            return;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3, 1, false));
        int iM27313a = AbstractC5776a0.m27313a(8.0f);
        int i11 = iM27313a / 2;
        recyclerView.addItemDecoration(new C23890a(iM27313a, i11, i11));
        final C18036a c18036a = new C18036a(new ArrayList());
        c18036a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.room.fragment.b2
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                RoomsFragment.m77049R0(c18036a, this, baseQuickAdapter, view, i12);
            }
        });
        m65535H0(c18036a);
        recyclerView.setAdapter(getMBaseAdapter());
        if (m65550y0()) {
            BaseQuickAdapter mBaseAdapter = getMBaseAdapter();
            recyclerView.addOnScrollListener(new C23862a(mBaseAdapter != null ? mBaseAdapter.m36186h0() : null));
        }
    }
}
