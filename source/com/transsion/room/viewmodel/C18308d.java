package com.transsion.room.viewmodel;

import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.moviedetailapi.bean.RoomNet;
import com.transsion.room.bean.CheckNameBean;
import com.transsion.room.bean.CreateRoomRequestEntity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p349dh.C22982c;
import p524jq.InterfaceC24462a;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import p978zg.C29182a;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.room.viewmodel.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18308d {

    /* JADX INFO: renamed from: d */
    public static final a f59583d = new a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f59584a = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18308d.m77479m();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f59585b = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18308d.m77475f();
        }
    });

    /* JADX INFO: renamed from: c */
    private final Lazy f59586c = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.viewmodel.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18308d.m77480n();
        }
    });

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.d$b */
    public static final class b extends AbstractC28362a {
        b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C18308d.this.m77483h().mo14858q(null);
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "onFailure message.." + str2, false, 4, null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(CheckNameBean checkNameBean) {
            C18308d.this.m77483h().mo14858q(checkNameBean);
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "onSuccess groupId.." + (checkNameBean != null ? checkNameBean.getGroupId() : null), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.d$c */
    public static final class c extends AbstractC28362a {
        c() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C18308d.this.m77477k().mo14858q(null);
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "onFailure message.." + str2, false, 4, null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(RoomNet roomNet) {
            C18308d.this.m77477k().mo14858q(roomNet);
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "onSuccess groupId.." + (roomNet != null ? roomNet.getGroupId() : null), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.d$d */
    public static final class d extends AbstractC28362a {
        d() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C18308d.this.m77477k().mo14858q(null);
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "onFailure message.." + str2, false, 4, null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(RoomNet roomNet) {
            C18308d.this.m77477k().mo14858q(new RoomNet("update"));
            C26866a.a.m104898f(C26866a.f81698a, "RoomModel", "onSuccess groupId.." + (roomNet != null ? roomNet.getGroupId() : null), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C3187b0 m77475f() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: i */
    private final RequestBody m77476i(String str) {
        return RequestBody.INSTANCE.create(str, MediaType.INSTANCE.parse("application/json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final C3187b0 m77477k() {
        return (C3187b0) this.f59584a.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC24462a m77478l() {
        return (InterfaceC24462a) this.f59586c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C3187b0 m77479m() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC24462a m77480n() {
        return (InterfaceC24462a) C22982c.f70163e.m91553a().m91552h(InterfaceC24462a.class);
    }

    /* JADX INFO: renamed from: e */
    public final void m77481e(String name) {
        Intrinsics.m97802h(name, "name");
        m77478l().m95989e(C29182a.f89053a.m111992a(), name).m95079f(C28365d.f87067a.m109702c()).subscribe(new b());
    }

    /* JADX INFO: renamed from: g */
    public final void m77482g(String name, String avator, String desc, String str) {
        Intrinsics.m97802h(name, "name");
        Intrinsics.m97802h(avator, "avator");
        Intrinsics.m97802h(desc, "desc");
        CreateRoomRequestEntity createRoomRequestEntity = new CreateRoomRequestEntity("", name, avator, desc, str);
        InterfaceC24462a interfaceC24462aM77478l = m77478l();
        String strM111992a = C29182a.f89053a.m111992a();
        String strM27447j = AbstractC5796o.m27447j(createRoomRequestEntity);
        Intrinsics.m97801g(strM27447j, "toJson(...)");
        interfaceC24462aM77478l.m95991g(strM111992a, m77476i(strM27447j)).m95079f(C28365d.f87067a.m109702c()).subscribe(new c());
    }

    /* JADX INFO: renamed from: h */
    public final C3187b0 m77483h() {
        return (C3187b0) this.f59585b.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final LiveData m77484j() {
        return m77477k();
    }

    /* JADX INFO: renamed from: o */
    public final void m77485o(String groupId, String name, String avator, String desc, String str) {
        Intrinsics.m97802h(groupId, "groupId");
        Intrinsics.m97802h(name, "name");
        Intrinsics.m97802h(avator, "avator");
        Intrinsics.m97802h(desc, "desc");
        CreateRoomRequestEntity createRoomRequestEntity = new CreateRoomRequestEntity(groupId, name, avator, desc, str);
        InterfaceC24462a interfaceC24462aM77478l = m77478l();
        String strM111992a = C29182a.f89053a.m111992a();
        String strM27447j = AbstractC5796o.m27447j(createRoomRequestEntity);
        Intrinsics.m97801g(strM27447j, "toJson(...)");
        interfaceC24462aM77478l.m95986b(strM111992a, m77476i(strM27447j)).m95079f(C28365d.f87067a.m109702c()).subscribe(new d());
    }
}
