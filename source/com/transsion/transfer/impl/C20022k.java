package com.transsion.transfer.impl;

import android.app.Application;
import android.os.Build;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import p624nv.C26114h;
import p662ov.C26737b;
import p721qv.C27131b;
import sv.C27657b;

/* JADX INFO: renamed from: com.transsion.transfer.impl.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C20022k extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final C3187b0 f63785b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f63786c;

    /* JADX INFO: renamed from: d */
    private final C26737b f63787d;

    /* JADX INFO: renamed from: e */
    private final C26737b f63788e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f63789f;

    /* JADX INFO: renamed from: g */
    private InterfaceC20014g f63790g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC20014g f63791h;

    /* JADX INFO: renamed from: i */
    private final Function4 f63792i;

    /* JADX INFO: renamed from: j */
    private final c f63793j;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.k$a */
    public static final class a implements Function4 {
        a() {
        }

        /* JADX INFO: renamed from: a */
        public void m83260a(String clientIp, String transferId, boolean z11, String str) {
            Intrinsics.m97802h(clientIp, "clientIp");
            Intrinsics.m97802h(transferId, "transferId");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("invoke: clientIp:");
            sb2.append(clientIp);
            sb2.append(", transferId:");
            sb2.append(transferId);
            sb2.append(", isConnect:");
            sb2.append(z11);
            C20022k.this.f63785b.mo14855n(new Pair(clientIp, Boolean.valueOf(z11)));
            if (z11) {
                return;
            }
            C27131b.f82241a.m105576s(str, C20022k.this.m83253t());
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m83260a((String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (String) obj4);
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.k$b */
    public static final class b implements InterfaceC20014g {
        b() {
        }

        @Override // com.transsion.transfer.impl.InterfaceC20014g
        /* JADX INFO: renamed from: a */
        public void mo83079a(String clientIp, String clientDeviceName) {
            Intrinsics.m97802h(clientIp, "clientIp");
            Intrinsics.m97802h(clientDeviceName, "clientDeviceName");
            C20022k.this.f63786c.mo14855n(clientDeviceName);
            InterfaceC20014g interfaceC20014g = C20022k.this.f63790g;
            if (interfaceC20014g != null) {
                interfaceC20014g.mo83079a(clientIp, clientDeviceName);
            }
        }

        @Override // com.transsion.transfer.impl.InterfaceC20014g
        /* JADX INFO: renamed from: b */
        public String mo83080b() {
            return C20022k.this.m83240q();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.k$c */
    public static final class c implements InterfaceC20018i {
        c() {
        }

        @Override // com.transsion.transfer.impl.InterfaceC20018i
        /* JADX INFO: renamed from: L */
        public void mo83227L(String clientIp, String remoteFilePath, TaskState state, long j11, long j12) {
            Intrinsics.m97802h(clientIp, "clientIp");
            Intrinsics.m97802h(remoteFilePath, "remoteFilePath");
            Intrinsics.m97802h(state, "state");
            C20022k.this.f63787d.mo14855n(new Triple(clientIp, remoteFilePath, new Triple(state, Long.valueOf(j11), Long.valueOf(j12))));
        }

        @Override // com.transsion.transfer.impl.InterfaceC20018i
        /* JADX INFO: renamed from: d */
        public void mo83228d(String clientIp) {
            Intrinsics.m97802h(clientIp, "clientIp");
            C20022k.this.f63789f.mo14855n(clientIp);
        }

        @Override // com.transsion.transfer.impl.InterfaceC20018i
        /* JADX INFO: renamed from: i */
        public void mo83229i(String clientIp, String remoteFilePath, long j11, long j12) {
            Intrinsics.m97802h(clientIp, "clientIp");
            Intrinsics.m97802h(remoteFilePath, "remoteFilePath");
            C20022k.this.f63787d.mo14855n(new Triple(clientIp, remoteFilePath, new Triple(TaskState.TRANSFERRING, Long.valueOf(j11), Long.valueOf(j12))));
        }

        @Override // com.transsion.transfer.impl.InterfaceC20018i
        /* JADX INFO: renamed from: n */
        public void mo83230n(String clientIp) {
            Intrinsics.m97802h(clientIp, "clientIp");
        }

        @Override // com.transsion.transfer.impl.InterfaceC20018i
        /* JADX INFO: renamed from: o */
        public void mo83231o(String clientIp, List files) {
            Intrinsics.m97802h(clientIp, "clientIp");
            Intrinsics.m97802h(files, "files");
            C20022k.this.f63788e.mo14855n(new Pair(clientIp, files));
        }

        @Override // com.transsion.transfer.impl.InterfaceC20018i
        /* JADX INFO: renamed from: q */
        public void mo83232q(String clientIp) {
            Intrinsics.m97802h(clientIp, "clientIp");
            C20022k.this.f63785b.mo14855n(new Pair(clientIp, Boolean.FALSE));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20022k(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f63785b = new C3187b0();
        this.f63786c = new C3187b0();
        this.f63787d = new C26737b();
        this.f63788e = new C26737b();
        this.f63789f = new C3187b0();
        this.f63791h = new b();
        this.f63792i = new a();
        this.f63793j = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final String m83240q() {
        String MODEL = Build.MODEL;
        Intrinsics.m97801g(MODEL, "MODEL");
        return MODEL;
    }

    /* JADX INFO: renamed from: A */
    public final void m83241A() {
        InterfaceC20016h interfaceC20016hM102278b = C26114h.f79688s.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83217a(this.f63793j);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
        interfaceC20016hM102278b.open();
        C27131b.f82241a.m105575r();
    }

    /* JADX INFO: renamed from: B */
    public final void m83242B(InterfaceC20014g interfaceC20014g) {
        this.f63790g = interfaceC20014g;
    }

    /* JADX INFO: renamed from: C */
    public final void m83243C() {
        InterfaceC20016h interfaceC20016hM102278b = C26114h.f79688s.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83217a(this.f63793j);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
        interfaceC20016hM102278b.mo83220d();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m83244j() {
        InterfaceC20016h interfaceC20016hM102278b = C26114h.f79688s.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83217a(this.f63793j);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
        return !interfaceC20016hM102278b.mo83219c().isEmpty();
    }

    /* JADX INFO: renamed from: k */
    public final LiveData m83245k() {
        return this.f63786c;
    }

    /* JADX INFO: renamed from: l */
    public final List m83246l() {
        InterfaceC20016h interfaceC20016hM102278b = C26114h.f79688s.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83217a(this.f63793j);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
        return interfaceC20016hM102278b.mo83219c();
    }

    /* JADX INFO: renamed from: m */
    public final List m83247m() {
        InterfaceC20016h interfaceC20016hM102278b = C26114h.f79688s.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83217a(this.f63793j);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
        return interfaceC20016hM102278b.mo83225i();
    }

    /* JADX INFO: renamed from: n */
    public final LiveData m83248n() {
        return this.f63789f;
    }

    /* JADX INFO: renamed from: o */
    public final LiveData m83249o() {
        return this.f63785b;
    }

    @Override // androidx.p1004lifecycle.AbstractC3223t0
    protected void onCleared() {
        super.onCleared();
        C26114h.a aVar = C26114h.f79688s;
        aVar.m102278b(m14886b()).mo83223g(this.f63793j);
        aVar.m102278b(m14886b()).mo83224h(this.f63792i);
        aVar.m102278b(m14886b()).mo83221e(null);
    }

    /* JADX INFO: renamed from: p */
    public final String m83250p() {
        InterfaceC20016h interfaceC20016hM102278b = C26114h.f79688s.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83217a(this.f63793j);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
        List listMo83225i = interfaceC20016hM102278b.mo83225i();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getCurClientName: getCurClientName:");
        sb2.append(listMo83225i);
        if (listMo83225i.isEmpty()) {
            return null;
        }
        return (String) listMo83225i.get(0);
    }

    /* JADX INFO: renamed from: r */
    public final Function4 m83251r() {
        return this.f63792i;
    }

    /* JADX INFO: renamed from: s */
    public final int m83252s() {
        return C27657b.f84826a.m107596f().size();
    }

    /* JADX INFO: renamed from: t */
    public final String m83253t() {
        InterfaceC20016h interfaceC20016hM102278b = C26114h.f79688s.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
        return interfaceC20016hM102278b.mo83226j();
    }

    /* JADX INFO: renamed from: u */
    public final LiveData m83254u() {
        return this.f63788e;
    }

    /* JADX INFO: renamed from: v */
    public final LiveData m83255v() {
        return this.f63787d;
    }

    /* JADX INFO: renamed from: w */
    public final int m83256w() {
        C27657b c27657b = C27657b.f84826a;
        return c27657b.m107597g().size() + c27657b.m107598h().size();
    }

    /* JADX INFO: renamed from: x */
    public final void m83257x() {
        InterfaceC20016h interfaceC20016hM102278b = C26114h.f79688s.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83217a(this.f63793j);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m83258y() {
        InterfaceC20016h interfaceC20016hM102278b = C26114h.f79688s.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
        return interfaceC20016hM102278b.isRunning();
    }

    /* JADX INFO: renamed from: z */
    public final void m83259z(int i11) {
        C26114h.a aVar = C26114h.f79688s;
        List listMo83219c = aVar.m102278b(m14886b()).mo83219c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("notifyClientCMD: clientIps:");
        sb2.append(listMo83219c);
        if (listMo83219c.isEmpty()) {
            return;
        }
        InterfaceC20016h interfaceC20016hM102278b = aVar.m102278b(m14886b());
        interfaceC20016hM102278b.mo83221e(this.f63791h);
        interfaceC20016hM102278b.mo83217a(this.f63793j);
        interfaceC20016hM102278b.mo83218b(this.f63792i);
        interfaceC20016hM102278b.mo83222f((String) listMo83219c.get(0), i11);
    }
}
