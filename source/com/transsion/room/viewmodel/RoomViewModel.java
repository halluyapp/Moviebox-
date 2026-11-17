package com.transsion.room.viewmodel;

import android.app.Application;
import android.content.Context;
import android.location.Address;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.AbstractC5796o;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.moviedetailapi.bean.RoomTabBean;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import okio.Okio;
import p349dh.C22982c;
import p524jq.InterfaceC24462a;
import p751rq.C27317a;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes6.dex */
public final class RoomViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: l */
    public static final C18284a f59561l = new C18284a(null);

    /* JADX INFO: renamed from: b */
    private final Lazy f59562b;

    /* JADX INFO: renamed from: c */
    private final Lazy f59563c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f59564d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f59565e;

    /* JADX INFO: renamed from: f */
    private final Lazy f59566f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f59567g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f59568h;

    /* JADX INFO: renamed from: i */
    private final C3187b0 f59569i;

    /* JADX INFO: renamed from: j */
    private final C3187b0 f59570j;

    /* JADX INFO: renamed from: k */
    private final Lazy f59571k;

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomViewModel$a */
    public static final class C18284a {
        private C18284a() {
        }

        public /* synthetic */ C18284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomViewModel$b */
    public static final class C18285b extends AbstractC28362a {
        C18285b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            RoomViewModel.this.m77448y().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(RoomBean roomBean) {
            RoomViewModel.this.m77448y().mo14858q(roomBean);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomViewModel$c */
    public static final class C18286c extends AbstractC28362a {
        C18286c() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            RoomViewModel.this.m77422D().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(RoomBean roomBean) {
            RoomViewModel.this.m77422D().mo14858q(roomBean);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f59562b = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomViewModel.m77424L();
            }
        });
        this.f59563c = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomViewModel.m77427O();
            }
        });
        this.f59564d = new C3187b0();
        this.f59565e = new C3187b0();
        this.f59566f = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomViewModel.m77445r();
            }
        });
        this.f59567g = new C3187b0();
        this.f59568h = new C3187b0();
        this.f59569i = new C3187b0();
        this.f59570j = new C3187b0();
        this.f59571k = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomViewModel.m77429Q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final C3187b0 m77422D() {
        return (C3187b0) this.f59563c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final InterfaceC24462a m77423K() {
        return (InterfaceC24462a) this.f59571k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C3187b0 m77424L() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final String m77425M() {
        try {
            InputStream inputStreamOpen = Utils.m27275a().getAssets().open("room_top_tab.json");
            Intrinsics.m97799e(inputStreamOpen);
            return Okio.buffer(Okio.source(inputStreamOpen)).readUtf8();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m77426N() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RoomViewModel$loadRoomTabCache$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C3187b0 m77427O() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final void m77428P(RoomTabBean roomTabBean) {
        try {
            Result.Companion companion = Result.INSTANCE;
            C14496b c14496b = C14496b.f50966a;
            c14496b.m65344b().putString("k_room_tab_cache_version", roomTabBean.getVersion());
            Result.m112707constructorimpl(c14496b.m65344b().putString("k_room_tab_cache", AbstractC5796o.m27447j(roomTabBean)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final InterfaceC24462a m77429Q() {
        return (InterfaceC24462a) C22982c.f70163e.m91553a().m91552h(InterfaceC24462a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C27317a m77445r() {
        return new C27317a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final C27317a m77446s() {
        return (C27317a) this.f59566f.getValue();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m77447u(RoomViewModel roomViewModel, Context context, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = "1";
        }
        if ((i12 & 4) != 0) {
            i11 = 16;
        }
        roomViewModel.m77458t(context, str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final C3187b0 m77448y() {
        return (C3187b0) this.f59562b.getValue();
    }

    /* JADX INFO: renamed from: A */
    public final C3187b0 m77449A() {
        return this.f59565e;
    }

    /* JADX INFO: renamed from: B */
    public final void m77450B(String page, int i11, String str) {
        Intrinsics.m97802h(page, "page");
        if (str != null) {
            m77423K().m95999o(C29182a.f89053a.m111992a(), page, i11, str).m95079f(C28365d.f87067a.m109702c()).subscribe(new C18286c());
        }
    }

    /* JADX INFO: renamed from: C */
    public final LiveData m77451C() {
        return m77422D();
    }

    /* JADX INFO: renamed from: E */
    public final void m77452E() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomViewModel$getRoomFilterTabList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m77453F(boolean z11, int i11, String page, int i12, Double d11, Double d12, Address address) {
        Intrinsics.m97802h(page, "page");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomViewModel$getRoomList$1(d12, d11, address, page, i12, i11, this, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: G */
    public final C3187b0 m77454G() {
        return this.f59564d;
    }

    /* JADX INFO: renamed from: H */
    public final void m77455H() {
        m77426N();
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomViewModel$getRoomTabs$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: I */
    public final C3187b0 m77456I() {
        return this.f59568h;
    }

    /* JADX INFO: renamed from: J */
    public final C3187b0 m77457J() {
        return this.f59569i;
    }

    /* JADX INFO: renamed from: t */
    public final void m77458t(Context context, String page, int i11) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(page, "page");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomViewModel$getCommunityRooms$1(this, context, page, i11, null), 3, null);
    }

    /* JADX INFO: renamed from: v */
    public final C3187b0 m77459v() {
        return this.f59570j;
    }

    /* JADX INFO: renamed from: w */
    public final void m77460w(String page, int i11) {
        Intrinsics.m97802h(page, "page");
        m77423K().m95990f(C29182a.f89053a.m111992a(), page, i11).m95079f(C28365d.f87067a.m109702c()).subscribe(new C18285b());
    }

    /* JADX INFO: renamed from: x */
    public final LiveData m77461x() {
        return m77448y();
    }

    /* JADX INFO: renamed from: z */
    public final void m77462z(boolean z11, String str, int i11, String str2) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomViewModel$getMyRooms$1(this, str, i11, str2, z11, null), 3, null);
    }
}
