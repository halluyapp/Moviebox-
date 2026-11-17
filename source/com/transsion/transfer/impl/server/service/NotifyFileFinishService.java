package com.transsion.transfer.impl.server.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.transsion.transfer.androidasync.http.server.InterfaceC19905b;
import com.transsion.transfer.androidasync.http.server.InterfaceC19907d;
import com.transsion.transfer.androidasync.http.server.InterfaceC19920q;
import com.transsion.transfer.impl.InterfaceC20014g;
import com.transsion.transfer.impl.InterfaceC20018i;
import com.transsion.transfer.impl.TaskState;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p468hv.C23904f;
import p624nv.C26109c;

/* JADX INFO: loaded from: classes6.dex */
public final class NotifyFileFinishService implements InterfaceC19920q {

    /* JADX INFO: renamed from: d */
    public static final C20041a f63817d = new C20041a(null);

    /* JADX INFO: renamed from: e */
    private static final String f63818e = "Transfer-" + NotifyFileFinishService.class.getName();

    /* JADX INFO: renamed from: a */
    private final InterfaceC20014g f63819a;

    /* JADX INFO: renamed from: b */
    private InterfaceC20018i f63820b;

    /* JADX INFO: renamed from: c */
    private final Lazy f63821c;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.server.service.NotifyFileFinishService$a */
    public static final class C20041a {
        private C20041a() {
        }

        public /* synthetic */ C20041a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NotifyFileFinishService(InterfaceC20014g fileHandler, InterfaceC20018i listener) {
        Intrinsics.m97802h(fileHandler, "fileHandler");
        Intrinsics.m97802h(listener, "listener");
        this.f63819a = fileHandler;
        this.f63820b = listener;
        this.f63821c = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.server.service.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotifyFileFinishService.m83268d();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    private final Gson m83267c() {
        return (Gson) this.f63821c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Gson m83268d() {
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
            List list = (List) m83267c().fromJson(c23904f != null ? c23904f.m94654a() : null, new TypeToken<List<String>>() { // from class: com.transsion.transfer.impl.server.service.NotifyFileFinishService$onRequest$array$1
            }.getType());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    File file = new File((String) it.next());
                    if (file.exists()) {
                        InterfaceC20018i interfaceC20018i = this.f63820b;
                        String absolutePath = file.getAbsolutePath();
                        Intrinsics.m97801g(absolutePath, "getAbsolutePath(...)");
                        interfaceC20018i.mo83227L(str, absolutePath, TaskState.FINISH, file.length(), file.length());
                    }
                }
            }
            String strM102252a = C26109c.f79671d.m102252a(0, "noitfy server success", "");
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
