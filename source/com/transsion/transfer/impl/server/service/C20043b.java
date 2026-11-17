package com.transsion.transfer.impl.server.service;

import com.transsion.transfer.androidasync.http.server.InterfaceC19905b;
import com.transsion.transfer.androidasync.http.server.InterfaceC19907d;
import com.transsion.transfer.androidasync.http.server.InterfaceC19920q;
import com.transsion.transfer.impl.InterfaceC20014g;
import com.transsion.transfer.impl.InterfaceC20018i;
import com.transsion.transfer.impl.entity.FileData;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p624nv.C26109c;
import sv.C27657b;

/* JADX INFO: renamed from: com.transsion.transfer.impl.server.service.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C20043b implements InterfaceC19920q {

    /* JADX INFO: renamed from: c */
    public static final a f63832c = new a(null);

    /* JADX INFO: renamed from: d */
    private static final String f63833d = "Transfer-" + C20043b.class.getName();

    /* JADX INFO: renamed from: a */
    private final InterfaceC20014g f63834a;

    /* JADX INFO: renamed from: b */
    private InterfaceC20018i f63835b;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.server.service.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m83276a() {
            return C20043b.f63833d;
        }
    }

    public C20043b(InterfaceC20014g fileHandler, InterfaceC20018i listener) {
        Intrinsics.m97802h(fileHandler, "fileHandler");
        Intrinsics.m97802h(listener, "listener");
        this.f63834a = fileHandler;
        this.f63835b = listener;
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19920q
    /* JADX INFO: renamed from: b */
    public void mo82825b(InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
        C26109c.a aVar = C26109c.f79671d;
        Triple tripleM102253c = aVar.m102253c(interfaceC19905b != null ? interfaceC19905b.getHeaders() : null);
        int iIntValue = ((Number) tripleM102253c.getSecond()).intValue();
        String str = (String) tripleM102253c.getThird();
        if (iIntValue < 1) {
            if (interfaceC19907d != null) {
                interfaceC19907d.send(aVar.m102252a(-1, "protocol version compatible error", ""));
                return;
            }
            return;
        }
        List listM107594d = C27657b.f84826a.m107594d();
        String strM102252a = aVar.m102252a(0, "", listM107594d);
        Iterator it = listM107594d.iterator();
        while (it.hasNext()) {
            String fileRemotePath = ((FileData) it.next()).getFileRemotePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onRequest: ");
            sb2.append(fileRemotePath);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("createResponseJsonObj: ");
        sb3.append(strM102252a);
        if (interfaceC19907d != null) {
            interfaceC19907d.send(strM102252a);
        }
        this.f63835b.mo83231o(str, listM107594d);
    }
}
