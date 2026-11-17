package com.transsion.usercenter.setting.labelsfeedback;

import ax.InterfaceC4715a;
import ch.C5096b;
import com.google.gson.JsonObject;
import com.therouter.TheRouter;
import com.transsion.baselib.net.LaunchWithErrorHandlerKt;
import com.transsnet.loginapi.bean.UserInfo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p441gz.InterfaceC23704a;
import p497iw.AbstractC24232b;
import p497iw.C24233c;
import p706qg.C27076c;
import p742rg.C27272a;

/* JADX INFO: loaded from: classes7.dex */
public final class UploadInit {

    /* JADX INFO: renamed from: b */
    private static boolean f65493b;

    /* JADX INFO: renamed from: a */
    public static final UploadInit f65492a = new UploadInit();

    /* JADX INFO: renamed from: c */
    private static final Lazy f65494c = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.labelsfeedback.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UploadInit.m85761i();
        }
    });

    /* JADX INFO: renamed from: d */
    private static final Lazy f65495d = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.labelsfeedback.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UploadInit.m85760h();
        }
    });

    private UploadInit() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final InterfaceC23704a m85758e() {
        return (InterfaceC23704a) f65495d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC4715a m85759f() {
        return (InterfaceC4715a) f65494c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC23704a m85760h() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC4715a m85761i() {
        return (InterfaceC4715a) C22982c.f70163e.m91553a().m91552h(InterfaceC4715a.class);
    }

    /* JADX INFO: renamed from: g */
    public final void m85762g() {
        if (f65493b) {
            return;
        }
        f65493b = true;
        C24233c.f73744a.m95261e(new AbstractC24232b() { // from class: com.transsion.usercenter.setting.labelsfeedback.UploadInit$init$1
            @Override // p497iw.AbstractC24232b
            /* JADX INFO: renamed from: a */
            public String mo85763a() {
                return C5096b.f17579a.m23863c();
            }

            @Override // p497iw.AbstractC24232b
            /* JADX INFO: renamed from: b */
            public String mo85764b() {
                return new C27272a().mo96719a(0, System.currentTimeMillis());
            }

            @Override // p497iw.AbstractC24232b
            /* JADX INFO: renamed from: c */
            public List mo85765c() {
                return CollectionsKt.m97509o("oneroom-db", "oneroom-subtitle-db", "mb-ad-plans-db");
            }

            @Override // p497iw.AbstractC24232b
            /* JADX INFO: renamed from: d */
            public String mo85766d() {
                C27076c.a aVar = C27076c.f82165a;
                return aVar.m105436c(aVar.m105435b());
            }

            @Override // p497iw.AbstractC24232b
            /* JADX INFO: renamed from: e */
            public void mo85767e(Function1 callback) {
                Intrinsics.m97802h(callback, "callback");
                LaunchWithErrorHandlerKt.m65256d(AbstractC25153o0.m99079a(C25220y0.m99268b()), new UploadInit$init$1$getLogsConfig$1(callback, null), null, 2, null);
            }

            @Override // p497iw.AbstractC24232b
            /* JADX INFO: renamed from: f */
            public Object mo85768f(Function1 function1, Function1 function2, Continuation continuation) {
                LaunchWithErrorHandlerKt.m65255c(AbstractC25153o0.m99079a(C25220y0.m99268b()), new UploadInit$init$1$getTstToken$2(function1, function2, null), new UploadInit$init$1$getTstToken$3(function2, null));
                return Unit.f75682a;
            }

            @Override // p497iw.AbstractC24232b
            /* JADX INFO: renamed from: g */
            public String mo85769g() {
                UserInfo userInfoMo90386h;
                String userId;
                InterfaceC23704a interfaceC23704aM85758e = UploadInit.f65492a.m85758e();
                return (interfaceC23704aM85758e == null || (userInfoMo90386h = interfaceC23704aM85758e.mo90386h()) == null || (userId = userInfoMo90386h.getUserId()) == null) ? "" : userId;
            }

            @Override // p497iw.AbstractC24232b
            /* JADX INFO: renamed from: h */
            public void mo85770h(JsonObject json, Function1 callback) {
                Intrinsics.m97802h(json, "json");
                Intrinsics.m97802h(callback, "callback");
                LaunchWithErrorHandlerKt.m65255c(AbstractC25153o0.m99079a(C25220y0.m99268b()), new UploadInit$init$1$reportUploadLogsResult$1(json, callback, null), new UploadInit$init$1$reportUploadLogsResult$2(callback, null));
            }
        });
    }
}
