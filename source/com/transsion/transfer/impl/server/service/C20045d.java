package com.transsion.transfer.impl.server.service;

import com.transsion.transfer.androidasync.http.server.InterfaceC19905b;
import com.transsion.transfer.androidasync.http.server.InterfaceC19907d;
import com.transsion.transfer.androidasync.http.server.InterfaceC19920q;
import com.transsion.transfer.impl.InterfaceC20014g;
import com.transsion.transfer.impl.InterfaceC20018i;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p624nv.C26109c;

/* JADX INFO: renamed from: com.transsion.transfer.impl.server.service.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C20045d implements InterfaceC19920q {

    /* JADX INFO: renamed from: c */
    public static final a f63840c = new a(null);

    /* JADX INFO: renamed from: d */
    private static final String f63841d = "Transfer-" + C20045d.class.getName();

    /* JADX INFO: renamed from: a */
    private final InterfaceC20014g f63842a;

    /* JADX INFO: renamed from: b */
    private InterfaceC20018i f63843b;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.server.service.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C20045d(InterfaceC20014g fileHandler, InterfaceC20018i listener) {
        Intrinsics.m97802h(fileHandler, "fileHandler");
        Intrinsics.m97802h(listener, "listener");
        this.f63842a = fileHandler;
        this.f63843b = listener;
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19920q
    /* JADX INFO: renamed from: b */
    public void mo82825b(InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
        try {
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
            this.f63843b.mo83228d(str);
            String strM102252a = aVar.m102252a(0, "noitfy cliente server create success", "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("createResponseJsonObj: ");
            sb2.append(strM102252a);
            if (interfaceC19907d != null) {
                interfaceC19907d.send(strM102252a);
            }
        } catch (Exception e11) {
            if (interfaceC19907d != null) {
                interfaceC19907d.send(C26109c.f79671d.m102252a(500, "server error:" + e11.getMessage(), ""));
            }
        }
    }
}
