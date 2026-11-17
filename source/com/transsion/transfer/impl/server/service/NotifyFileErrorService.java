package com.transsion.transfer.impl.server.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.transsion.transfer.androidasync.http.server.InterfaceC19905b;
import com.transsion.transfer.androidasync.http.server.InterfaceC19907d;
import com.transsion.transfer.androidasync.http.server.InterfaceC19920q;
import com.transsion.transfer.impl.InterfaceC20014g;
import com.transsion.transfer.impl.InterfaceC20018i;
import com.transsion.transfer.impl.entity.FileData;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p468hv.C23904f;
import p624nv.C26109c;

/* JADX INFO: loaded from: classes6.dex */
public final class NotifyFileErrorService implements InterfaceC19920q {

    /* JADX INFO: renamed from: d */
    public static final C20040a f63812d = new C20040a(null);

    /* JADX INFO: renamed from: e */
    private static final String f63813e = "Transfer-" + NotifyFileErrorService.class.getName();

    /* JADX INFO: renamed from: a */
    private final InterfaceC20014g f63814a;

    /* JADX INFO: renamed from: b */
    private InterfaceC20018i f63815b;

    /* JADX INFO: renamed from: c */
    private final Lazy f63816c;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.server.service.NotifyFileErrorService$a */
    public static final class C20040a {
        private C20040a() {
        }

        public /* synthetic */ C20040a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NotifyFileErrorService(InterfaceC20014g fileHandler, InterfaceC20018i listener) {
        Intrinsics.m97802h(fileHandler, "fileHandler");
        Intrinsics.m97802h(listener, "listener");
        this.f63814a = fileHandler;
        this.f63815b = listener;
        this.f63816c = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.server.service.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotifyFileErrorService.m83265d();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private final Gson m83264c() {
        return (Gson) this.f63816c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Gson m83265d() {
        return new Gson();
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
            C23904f c23904f = interfaceC19905b != null ? (C23904f) interfaceC19905b.mo82793C() : null;
            if (!(c23904f instanceof C23904f)) {
                c23904f = null;
            }
            List<Pair> list = (List) m83264c().fromJson(c23904f != null ? c23904f.m94654a() : null, new TypeToken<List<Pair<? extends String, ? extends Integer>>>() { // from class: com.transsion.transfer.impl.server.service.NotifyFileErrorService$onRequest$data$1
            }.getType());
            Intrinsics.m97799e(list);
            for (Pair pair : list) {
                this.f63815b.mo83227L(str, (String) pair.getFirst(), FileData.INSTANCE.m83214b(((Number) pair.getSecond()).intValue()), 0L, 0L);
            }
            String strM102252a = C26109c.f79671d.m102252a(0, "notify File Task change", "");
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
