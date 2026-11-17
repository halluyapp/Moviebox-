package com.transsion.transfer.impl;

import android.app.Application;
import android.os.Environment;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.Utils;
import com.transsion.transfer.impl.client.TransferClient;
import com.transsion.transfer.impl.entity.FileData;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p662ov.C26737b;
import p721qv.C27131b;
import sv.C27656a;

/* JADX INFO: loaded from: classes6.dex */
public final class ClientViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Application f63629b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f63630c;

    /* JADX INFO: renamed from: d */
    private final C26737b f63631d;

    /* JADX INFO: renamed from: e */
    private final C26737b f63632e;

    /* JADX INFO: renamed from: f */
    private final C26737b f63633f;

    /* JADX INFO: renamed from: g */
    private final C26737b f63634g;

    /* JADX INFO: renamed from: h */
    private String f63635h;

    /* JADX INFO: renamed from: i */
    private final C19960a f63636i;

    /* JADX INFO: renamed from: j */
    private final C19961b f63637j;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.ClientViewModel$a */
    public static final class C19960a implements Function3 {
        C19960a() {
        }

        /* JADX INFO: renamed from: a */
        public void m82942a(String str, boolean z11, String str2) {
            ClientViewModel.this.f63635h = str;
            ClientViewModel.this.f63630c.mo14855n(Boolean.valueOf(z11));
            if (z11) {
                return;
            }
            C27131b.f82241a.m105567j(str2, TransferClient.f63694t.m83172k());
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m82942a((String) obj, ((Boolean) obj2).booleanValue(), (String) obj3);
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.ClientViewModel$b */
    public static final class C19961b implements InterfaceC20012f {
        C19961b() {
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: C */
        public void mo82943C(String remoteFilePath, long j11, long j12) {
            Intrinsics.m97802h(remoteFilePath, "remoteFilePath");
            ClientViewModel.this.f63633f.mo14855n(new Pair(remoteFilePath, new Triple(TaskState.TRANSFERRING, Long.valueOf(j11), Long.valueOf(j12))));
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: J */
        public void mo82944J(String remoteFilePath, TaskState state, long j11, long j12, long j13, String str) {
            Intrinsics.m97802h(remoteFilePath, "remoteFilePath");
            Intrinsics.m97802h(state, "state");
            if (state == TaskState.CONNECTING) {
                C27131b.f82241a.m105565h(remoteFilePath, j12, TransferClient.f63694t.m83172k());
            } else if (state == TaskState.FINISH) {
                C27131b.f82241a.m105564g(remoteFilePath, true, null, j12, j13, TransferClient.f63694t.m83172k());
            } else if (state == TaskState.ERROR || state == TaskState.NO_FILE) {
                C27131b.f82241a.m105564g(remoteFilePath, false, "file no found", j11, j13, TransferClient.f63694t.m83172k());
            }
            ClientViewModel.this.f63633f.mo14855n(new Pair(remoteFilePath, new Triple(state, Long.valueOf(j11), Long.valueOf(j12))));
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: N */
        public void mo82945N() {
            ClientViewModel.this.f63630c.mo14855n(Boolean.FALSE);
            C27131b.f82241a.m105567j("normal", TransferClient.f63694t.m83172k());
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: k */
        public void mo82946k(int i11) {
            ClientViewModel.this.f63632e.mo14855n(Integer.valueOf(i11));
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: p */
        public void mo82947p(String remoteFilePath) {
            Intrinsics.m97802h(remoteFilePath, "remoteFilePath");
            ClientViewModel.this.f63633f.mo14855n(new Pair(remoteFilePath, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f63629b = application;
        this.f63630c = new C3187b0();
        this.f63631d = new C26737b();
        this.f63632e = new C26737b();
        this.f63633f = new C26737b();
        this.f63634g = new C26737b();
        this.f63636i = new C19960a();
        this.f63637j = new C19961b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m82914A(Function1 function1, Exception exc) {
        String message = exc != null ? exc.getMessage() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sendServerCreateNotify:  ");
        sb2.append(message);
        function1.invoke(Boolean.valueOf(exc == null));
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Unit m82915D(List it) {
        Intrinsics.m97802h(it, "it");
        C27131b.f82241a.m105570m(it.size(), TransferClient.f63694t.m83172k());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Unit m82924l(ClientViewModel clientViewModel, Function2 function2, boolean z11, String error) {
        Intrinsics.m97802h(error, "error");
        clientViewModel.f63630c.mo14855n(Boolean.valueOf(z11));
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(clientViewModel), C25220y0.m99269c(), null, new ClientViewModel$connect$2$1(function2, z11, error, null), 2, null);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: m */
    private final File m82925m() {
        return new File(Utils.m27275a().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "transfer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m82926t(ClientViewModel clientViewModel, List list, Exception exc) {
        if (exc == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getTransferList: ");
            sb2.append(list);
            clientViewModel.f63631d.mo14855n(list);
        } else {
            exc.printStackTrace();
            String message = exc.getMessage();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getTransferList error: ");
            sb3.append(message);
            sb3.append(" ");
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: B */
    public final void m82927B(Function0 callback) {
        Intrinsics.m97802h(callback, "callback");
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        if (!c19983a.m83169g()) {
            callback.invoke();
            return;
        }
        InterfaceC20008e interfaceC20008eM83170i = c19983a.m83170i();
        interfaceC20008eM83170i.mo83159k(this.f63637j);
        interfaceC20008eM83170i.mo83150b(this.f63636i);
        interfaceC20008eM83170i.mo83151c(callback);
    }

    /* JADX INFO: renamed from: C */
    public final void m82928C(List files) {
        Intrinsics.m97802h(files, "files");
        if (files.isEmpty()) {
            return;
        }
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        if (c19983a.m83169g()) {
            InterfaceC20008e interfaceC20008eM83170i = c19983a.m83170i();
            interfaceC20008eM83170i.mo83159k(this.f63637j);
            interfaceC20008eM83170i.mo83150b(this.f63636i);
            String absolutePath = m82925m().getAbsolutePath();
            Intrinsics.m97801g(absolutePath, "getAbsolutePath(...)");
            interfaceC20008eM83170i.mo83157i(absolutePath, files, new Function1() { // from class: com.transsion.transfer.impl.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ClientViewModel.m82915D((List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m82929k(final Function2 function2) {
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        if (!c19983a.m83169g()) {
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, "no connect info");
            }
        } else {
            InterfaceC20008e interfaceC20008eM83170i = c19983a.m83170i();
            interfaceC20008eM83170i.mo83159k(this.f63637j);
            interfaceC20008eM83170i.mo83150b(this.f63636i);
            interfaceC20008eM83170i.mo83152d(new Function2() { // from class: com.transsion.transfer.impl.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ClientViewModel.m82924l(this.f63691a, function2, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final LiveData m82930n() {
        return this.f63632e;
    }

    /* JADX INFO: renamed from: o */
    public final LiveData m82931o() {
        return this.f63630c;
    }

    @Override // androidx.p1004lifecycle.AbstractC3223t0
    protected void onCleared() {
        super.onCleared();
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        if (c19983a.m83169g()) {
            InterfaceC20008e interfaceC20008eM83170i = c19983a.m83170i();
            interfaceC20008eM83170i.mo83155g(this.f63637j);
            interfaceC20008eM83170i.mo83150b(null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final String m82932p() {
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        if (!c19983a.m83169g()) {
            return "";
        }
        InterfaceC20008e interfaceC20008eM83170i = c19983a.m83170i();
        interfaceC20008eM83170i.mo83159k(this.f63637j);
        interfaceC20008eM83170i.mo83150b(this.f63636i);
        String strMo83158j = interfaceC20008eM83170i.mo83158j();
        if (strMo83158j != null) {
            this.f63635h = strMo83158j;
        }
        return strMo83158j;
    }

    /* JADX INFO: renamed from: q */
    public final LiveData m82933q() {
        return this.f63634g;
    }

    /* JADX INFO: renamed from: r */
    public final int m82934r() {
        return C27656a.f84824a.m107587e().size();
    }

    /* JADX INFO: renamed from: s */
    public final void m82935s(boolean z11) {
        C27656a c27656a = C27656a.f84824a;
        if (!c27656a.m107590h() && !z11) {
            this.f63631d.mo14855n(c27656a.m107586d());
            return;
        }
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        if (c19983a.m83169g()) {
            C27131b.f82241a.m105566i(c19983a.m83172k());
            InterfaceC20008e interfaceC20008eM83170i = c19983a.m83170i();
            interfaceC20008eM83170i.mo83159k(this.f63637j);
            interfaceC20008eM83170i.mo83150b(this.f63636i);
            String absolutePath = m82925m().getAbsolutePath();
            Intrinsics.m97801g(absolutePath, "getAbsolutePath(...)");
            interfaceC20008eM83170i.mo83153e(absolutePath, new Function2() { // from class: com.transsion.transfer.impl.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ClientViewModel.m82926t(this.f63689a, (List) obj, (Exception) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public final LiveData m82936u() {
        return this.f63631d;
    }

    /* JADX INFO: renamed from: v */
    public final LiveData m82937v() {
        return this.f63633f;
    }

    /* JADX INFO: renamed from: w */
    public final int m82938w() {
        C27656a c27656a = C27656a.f84824a;
        return c27656a.m107588f().size() + c27656a.m107589g().size();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m82939x() {
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        if (!c19983a.m83169g()) {
            return false;
        }
        InterfaceC20008e interfaceC20008eM83170i = c19983a.m83170i();
        interfaceC20008eM83170i.mo83159k(this.f63637j);
        interfaceC20008eM83170i.mo83150b(this.f63636i);
        return interfaceC20008eM83170i.mo83156h();
    }

    /* JADX INFO: renamed from: y */
    public final void m82940y(FileData fileData) {
        Intrinsics.m97802h(fileData, "fileData");
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        if (c19983a.m83169g()) {
            InterfaceC20008e interfaceC20008eM83170i = c19983a.m83170i();
            interfaceC20008eM83170i.mo83159k(this.f63637j);
            interfaceC20008eM83170i.mo83150b(this.f63636i);
            interfaceC20008eM83170i.mo83154f(fileData);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m82941z(final Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        if (c19983a.m83169g()) {
            InterfaceC20008e interfaceC20008eM83170i = c19983a.m83170i();
            interfaceC20008eM83170i.mo83159k(this.f63637j);
            interfaceC20008eM83170i.mo83150b(this.f63636i);
            interfaceC20008eM83170i.mo83149a(new Function1() { // from class: com.transsion.transfer.impl.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ClientViewModel.m82914A(callback, (Exception) obj);
                }
            });
        }
    }
}
