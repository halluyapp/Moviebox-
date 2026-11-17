package com.transsion.room.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.AbstractC5796o;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.moviedetailapi.bean.RoomNet;
import com.transsion.room.R$string;
import com.transsion.room.bean.CheckInEntity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p349dh.C22982c;
import p524jq.InterfaceC24462a;
import p812uj.InterfaceC28013a;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import p888wy.C28465b;
import p944yh.C28951b;
import p978zg.C29182a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class RoomDetailViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: f */
    public static final C18274a f59543f = new C18274a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f59544a = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.room.viewmodel.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomDetailViewModel.m77373D();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f59545b = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomDetailViewModel.m77371A();
        }
    });

    /* JADX INFO: renamed from: c */
    private final Lazy f59546c = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomDetailViewModel.m77372B();
        }
    });

    /* JADX INFO: renamed from: d */
    private final Lazy f59547d = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomDetailViewModel.m77390y();
        }
    });

    /* JADX INFO: renamed from: e */
    private final Lazy f59548e = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomDetailViewModel.m77391z();
        }
    });

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomDetailViewModel$a */
    public static final class C18274a {
        private C18274a() {
        }

        public /* synthetic */ C18274a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomDetailViewModel$b */
    public static final class C18275b extends AbstractC28362a {
        C18275b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            RoomDetailViewModel.this.m77388r().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(RoomItem roomItem) {
            RoomDetailViewModel.this.m77388r().mo14858q(roomItem);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomDetailViewModel$c */
    public static final class C18276c extends AbstractC28362a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f59550d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ RoomDetailViewModel f59551e;

        C18276c(String str, RoomDetailViewModel roomDetailViewModel) {
            this.f59550d = str;
            this.f59551e = roomDetailViewModel;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            this.f59551e.m77385m().mo14858q(null);
            C28951b.f88586a.m111454d(R$string.join_room_fail);
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "onFailure message.." + str2, false, 4, null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(RoomNet roomNet) {
            C28951b.f88586a.m111454d(R$string.join_room_success);
            C28465b.f87467a.m109954a().m109950f(1, this.f59550d);
            this.f59551e.m77385m().mo14858q(new RoomNet(NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS));
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "onSuccess groupId.." + (roomNet != null ? roomNet.getGroupId() : null), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomDetailViewModel$d */
    public static final class C18277d extends AbstractC28362a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f59552d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ RoomDetailViewModel f59553e;

        C18277d(String str, RoomDetailViewModel roomDetailViewModel) {
            this.f59552d = str;
            this.f59553e = roomDetailViewModel;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            this.f59553e.m77386n().mo14858q(null);
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "checkOutRoom onFailure message.." + str2, false, 4, null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(RoomNet roomNet) {
            C28465b.f87467a.m109954a().m109950f(0, this.f59552d);
            this.f59553e.m77386n().mo14858q(new RoomNet(NativeComponentConstants.KEY_COMPONENT_RESULT_SUCCESS));
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "checkOutRoom onSuccess groupId.." + (roomNet != null ? roomNet.getGroupId() : null), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final InterfaceC28013a m77371A() {
        Application applicationM27275a = Utils.m27275a();
        if (applicationM27275a != null) {
            return AppDatabase.INSTANCE.m64881b(applicationM27275a).mo64874u1();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C3187b0 m77372B() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC24462a m77373D() {
        return (InterfaceC24462a) C22982c.f70163e.m91553a().m91552h(InterfaceC24462a.class);
    }

    /* JADX INFO: renamed from: l */
    private final RequestBody m77384l(String str) {
        return RequestBody.INSTANCE.create(str, MediaType.INSTANCE.parse("application/json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C3187b0 m77385m() {
        return (C3187b0) this.f59547d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final C3187b0 m77386n() {
        return (C3187b0) this.f59548e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC28013a m77387o() {
        return (InterfaceC28013a) this.f59545b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final C3187b0 m77388r() {
        return (C3187b0) this.f59546c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC24462a m77389u() {
        return (InterfaceC24462a) this.f59544a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C3187b0 m77390y() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C3187b0 m77391z() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: C */
    public final void m77392C(String groupId) {
        Intrinsics.m97802h(groupId, "groupId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomDetailViewModel$roomVisit$1(groupId, this, null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m77393p(String groupId) {
        Intrinsics.m97802h(groupId, "groupId");
        InterfaceC24462a.a.m96001b(m77389u(), C29182a.f89053a.m111992a(), groupId, 0, 4, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new C18275b());
    }

    /* JADX INFO: renamed from: q */
    public final LiveData m77394q() {
        return m77388r();
    }

    /* JADX INFO: renamed from: s */
    public final LiveData m77395s() {
        return m77385m();
    }

    /* JADX INFO: renamed from: t */
    public final LiveData m77396t() {
        return m77386n();
    }

    /* JADX INFO: renamed from: v */
    public final void m77397v(RoomItem roomItem) {
        Intrinsics.m97802h(roomItem, "roomItem");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomDetailViewModel$insertRecentlyRoom$1(roomItem, this, null), 3, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m77398w(String groupId) {
        Intrinsics.m97802h(groupId, "groupId");
        InterfaceC24462a interfaceC24462aM77389u = m77389u();
        String strM111992a = C29182a.f89053a.m111992a();
        String strM27447j = AbstractC5796o.m27447j(new CheckInEntity(groupId));
        Intrinsics.m97801g(strM27447j, "toJson(...)");
        interfaceC24462aM77389u.m95993i(strM111992a, m77384l(strM27447j)).m95079f(C28365d.f87067a.m109702c()).subscribe(new C18276c(groupId, this));
    }

    /* JADX INFO: renamed from: x */
    public final void m77399x(String groupId) {
        Intrinsics.m97802h(groupId, "groupId");
        InterfaceC24462a interfaceC24462aM77389u = m77389u();
        String strM111992a = C29182a.f89053a.m111992a();
        String strM27447j = AbstractC5796o.m27447j(new CheckInEntity(groupId));
        Intrinsics.m97801g(strM27447j, "toJson(...)");
        interfaceC24462aM77389u.m95995k(strM111992a, m77384l(strM27447j)).m95079f(C28365d.f87067a.m109702c()).subscribe(new C18277d(groupId, this));
    }
}
