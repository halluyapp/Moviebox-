package com.transsion.transfer.impl.client;

import android.os.Build;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.transsion.transfer.androidasync.http.AsyncHttpClient;
import com.transsion.transfer.androidasync.http.C19890h;
import com.transsion.transfer.androidasync.http.C19891i;
import com.transsion.transfer.androidasync.http.InterfaceC19875b0;
import com.transsion.transfer.androidasync.http.InterfaceC19893k;
import com.transsion.transfer.impl.InterfaceC20008e;
import com.transsion.transfer.impl.InterfaceC20012f;
import com.transsion.transfer.impl.PingPongHelper;
import com.transsion.transfer.impl.TaskState;
import com.transsion.transfer.impl.entity.FileData;
import com.transsion.transfer.impl.entity.TransferResponse;
import com.transsion.transfer.impl.server.service.C20043b;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p439gv.InterfaceC23677a;
import p468hv.C23904f;
import p662ov.AbstractC26736a;
import p662ov.AbstractC26739d;
import sv.C27656a;

/* JADX INFO: loaded from: classes6.dex */
public final class TransferClient implements InterfaceC20008e {

    /* JADX INFO: renamed from: t */
    public static final C19983a f63694t = new C19983a(null);

    /* JADX INFO: renamed from: u */
    private static final String f63695u;

    /* JADX INFO: renamed from: v */
    private static volatile InterfaceC20008e f63696v;

    /* JADX INFO: renamed from: w */
    private static String f63697w;

    /* JADX INFO: renamed from: x */
    private static String f63698x;

    /* JADX INFO: renamed from: y */
    private static String f63699y;

    /* JADX INFO: renamed from: a */
    private final String f63700a;

    /* JADX INFO: renamed from: b */
    private final String f63701b;

    /* JADX INFO: renamed from: c */
    private final String f63702c;

    /* JADX INFO: renamed from: d */
    private final Lazy f63703d;

    /* JADX INFO: renamed from: e */
    private final Lazy f63704e;

    /* JADX INFO: renamed from: f */
    private final Lazy f63705f;

    /* JADX INFO: renamed from: g */
    private final Lazy f63706g;

    /* JADX INFO: renamed from: h */
    private volatile InterfaceC19875b0 f63707h;

    /* JADX INFO: renamed from: i */
    private boolean f63708i;

    /* JADX INFO: renamed from: j */
    private final Lazy f63709j;

    /* JADX INFO: renamed from: k */
    private PingPongHelper f63710k;

    /* JADX INFO: renamed from: l */
    private final Lazy f63711l;

    /* JADX INFO: renamed from: m */
    private String f63712m;

    /* JADX INFO: renamed from: n */
    private Function3 f63713n;

    /* JADX INFO: renamed from: o */
    private boolean f63714o;

    /* JADX INFO: renamed from: p */
    private final PingPongHelper.InterfaceC19962a f63715p;

    /* JADX INFO: renamed from: q */
    private final C19984b f63716q;

    /* JADX INFO: renamed from: r */
    private final CopyOnWriteArrayList f63717r;

    /* JADX INFO: renamed from: s */
    private final C19990h f63718s;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.TransferClient$a */
    public static final class C19983a {
        private C19983a() {
        }

        public /* synthetic */ C19983a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m83162f(Function0 function0) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f75682a;
        }

        /* JADX INFO: renamed from: h */
        private final String m83163h() {
            return AbstractC26739d.m104535b(System.currentTimeMillis() + "&1000&" + Build.BRAND + UrlUtils.AND_MARK + Build.MODEL + UrlUtils.AND_MARK + Build.PRODUCT);
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ void m83164m(C19983a c19983a, String str, String str2, String str3, Function0 function0, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str3 = c19983a.m83163h();
            }
            c19983a.m83173l(str, str2, str3, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static final Unit m83165n(Function0 function0) {
            function0.invoke();
            TransferClient.f63696v = null;
            return Unit.f75682a;
        }

        /* JADX INFO: renamed from: c */
        public final C19890h m83166c(String url, String clientIp, String transferId) {
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(clientIp, "clientIp");
            Intrinsics.m97802h(transferId, "transferId");
            C19890h c19890h = new C19890h(url);
            c19890h.m82735c("clientIp", clientIp);
            c19890h.m82735c("transferId", transferId);
            c19890h.m82735c("transferProtocolVersion", "1");
            c19890h.m82754y(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
            return c19890h;
        }

        /* JADX INFO: renamed from: d */
        public final C19891i m83167d(String url, String clientIp, String transferId) {
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(clientIp, "clientIp");
            Intrinsics.m97802h(transferId, "transferId");
            C19891i c19891i = new C19891i(url);
            c19891i.m82735c("clientIp", clientIp);
            c19891i.m82735c("transferId", transferId);
            c19891i.m82735c("transferProtocolVersion", "1");
            c19891i.m82754y(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
            return c19891i;
        }

        /* JADX INFO: renamed from: e */
        public final void m83168e(final Function0 function0) {
            TransferClient.f63697w = null;
            TransferClient.f63698x = null;
            TransferClient.f63699y = null;
            C27656a.f84824a.m107585b();
            if (TransferClient.f63696v == null) {
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                InterfaceC20008e interfaceC20008e = TransferClient.f63696v;
                if (interfaceC20008e != null) {
                    interfaceC20008e.mo83151c(new Function0() { // from class: com.transsion.transfer.impl.client.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TransferClient.C19983a.m83162f(function0);
                        }
                    });
                }
                TransferClient.f63696v = null;
            }
        }

        /* JADX INFO: renamed from: g */
        public final boolean m83169g() {
            String str;
            String str2;
            String str3 = TransferClient.f63697w;
            if (str3 == null) {
                return false;
            }
            if (!(!(str3.length() == 0)) || (str = TransferClient.f63698x) == null) {
                return false;
            }
            if (!(!(str.length() == 0)) || (str2 = TransferClient.f63699y) == null) {
                return false;
            }
            return (str2.length() == 0) ^ true;
        }

        /* JADX INFO: renamed from: i */
        public final InterfaceC20008e m83170i() {
            InterfaceC20008e transferClient = TransferClient.f63696v;
            if (transferClient == null) {
                synchronized (this) {
                    String str = TransferClient.f63697w;
                    Intrinsics.m97799e(str);
                    String str2 = TransferClient.f63698x;
                    Intrinsics.m97799e(str2);
                    String str3 = TransferClient.f63699y;
                    Intrinsics.m97799e(str3);
                    transferClient = new TransferClient(str, str2, str3, null);
                    TransferClient.f63696v = transferClient;
                }
            }
            return transferClient;
        }

        /* JADX INFO: renamed from: j */
        public final String m83171j() {
            return TransferClient.f63695u;
        }

        /* JADX INFO: renamed from: k */
        public final String m83172k() {
            return TransferClient.f63699y;
        }

        /* JADX INFO: renamed from: l */
        public final void m83173l(String serverIpNew, String clientIpNew, String transferIdNew, final Function0 callback) {
            Intrinsics.m97802h(serverIpNew, "serverIpNew");
            Intrinsics.m97802h(clientIpNew, "clientIpNew");
            Intrinsics.m97802h(transferIdNew, "transferIdNew");
            Intrinsics.m97802h(callback, "callback");
            TransferClient.f63697w = serverIpNew;
            TransferClient.f63698x = clientIpNew;
            TransferClient.f63699y = transferIdNew;
            if (TransferClient.f63696v == null) {
                callback.invoke();
                return;
            }
            InterfaceC20008e interfaceC20008e = TransferClient.f63696v;
            if (interfaceC20008e != null) {
                interfaceC20008e.mo83151c(new Function0() { // from class: com.transsion.transfer.impl.client.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransferClient.C19983a.m83165n(callback);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.TransferClient$b */
    public static final class C19984b implements Function2 {
        C19984b() {
        }

        /* JADX INFO: renamed from: a */
        public void m83174a(List list, boolean z11) {
            Intrinsics.m97802h(list, "list");
            TransferClient.this.m83137o0(list);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m83174a((List) obj, ((Boolean) obj2).booleanValue());
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.TransferClient$c */
    public static final class C19985c extends AsyncHttpClient.AbstractC19858j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function0 f63720a;

        C19985c(Function0 function0) {
            this.f63720a = function0;
        }

        @Override // p439gv.InterfaceC23683g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo83175c(Exception exc, InterfaceC19893k interfaceC19893k, String str) {
            this.f63720a.invoke();
            TransferClient.f63694t.m83171j();
            String message = exc != null ? exc.getMessage() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCompleted: notifyServerClientClose ,");
            sb2.append(message);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.TransferClient$d */
    public static final class C19986d extends AsyncHttpClient.AbstractC19858j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f63721a;

        C19986d(Function1 function1) {
            this.f63721a = function1;
        }

        @Override // p439gv.InterfaceC23683g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo83175c(Exception exc, InterfaceC19893k interfaceC19893k, String str) {
            TransferClient.f63694t.m83171j();
            String message = exc != null ? exc.getMessage() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCompleted: sendServerCreateNotify , e:");
            sb2.append(message);
            this.f63721a.invoke(exc);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.TransferClient$e */
    public static final class C19987e extends AsyncHttpClient.AbstractC19858j {
        C19987e() {
        }

        @Override // p439gv.InterfaceC23683g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo83175c(Exception exc, InterfaceC19893k interfaceC19893k, String str) {
            TransferClient.f63694t.m83171j();
            String message = exc != null ? exc.getMessage() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCompleted: notifyServerClientSpaceLimit ,");
            sb2.append(message);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.TransferClient$f */
    public static final class C19988f extends AsyncHttpClient.AbstractC19858j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f63722a;

        C19988f(List list) {
            this.f63722a = list;
        }

        @Override // p439gv.InterfaceC23683g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo83175c(Exception exc, InterfaceC19893k interfaceC19893k, String str) {
            TransferClient.f63694t.m83171j();
            List list = this.f63722a;
            String message = exc != null ? exc.getMessage() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCompleted: notifyServerTaskFinish:");
            sb2.append(list);
            sb2.append(" ,");
            sb2.append(message);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.TransferClient$g */
    public static final class C19989g implements PingPongHelper.InterfaceC19962a {
        C19989g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final Unit m83182c(TransferClient transferClient, boolean z11, String error) {
            Intrinsics.m97802h(error, "error");
            if (z11) {
                TransferClient.f63694t.m83171j();
            } else {
                TransferClient.f63694t.m83171j();
                transferClient.f63707h = null;
                transferClient.f63718s.mo82945N();
                transferClient.m83123e0().m83209q();
                transferClient.f63712m = null;
            }
            return Unit.f75682a;
        }

        @Override // com.transsion.transfer.impl.PingPongHelper.InterfaceC19962a
        /* JADX INFO: renamed from: a */
        public void mo82963a(String remoteIp, InterfaceC19875b0 socket) throws UnsupportedEncodingException {
            Intrinsics.m97802h(remoteIp, "remoteIp");
            Intrinsics.m97802h(socket, "socket");
            TransferClient.f63694t.m83171j();
            boolean z11 = TransferClient.this.f63714o;
            String str = TransferClient.this.f63700a;
            String str2 = TransferClient.this.f63701b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("client detach socket has closed, disconnectByUser:");
            sb2.append(z11);
            sb2.append(", serverIp: ");
            sb2.append(str);
            sb2.append(", clientIp: ");
            sb2.append(str2);
            sb2.append(", start auto connect");
            socket.close();
            PingPongHelper pingPongHelper = TransferClient.this.f63710k;
            if (pingPongHelper != null) {
                pingPongHelper.m82962o();
            }
            TransferClient.this.f63710k = null;
            if (TransferClient.this.f63714o) {
                return;
            }
            final TransferClient transferClient = TransferClient.this;
            transferClient.m83115W(new Function2() { // from class: com.transsion.transfer.impl.client.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferClient.C19989g.m83182c(transferClient, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.TransferClient$h */
    public static final class C19990h implements InterfaceC20012f {
        C19990h() {
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: C */
        public void mo82943C(String remoteFilePath, long j11, long j12) {
            Object next;
            Intrinsics.m97802h(remoteFilePath, "remoteFilePath");
            Iterator it = C27656a.f84824a.m107586d().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(remoteFilePath, ((FileData) next).getFileRemotePath()));
            FileData fileData = (FileData) next;
            if (fileData != null) {
                fileData.setState(2);
                fileData.setDownloadSize(j11);
                fileData.setFileSize(j12);
            }
            Iterator it2 = TransferClient.this.f63717r.iterator();
            while (it2.hasNext()) {
                ((InterfaceC20012f) it2.next()).mo82943C(remoteFilePath, j11, j12);
            }
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: J */
        public void mo82944J(String remoteFilePath, TaskState state, long j11, long j12, long j13, String str) {
            Object next;
            Intrinsics.m97802h(remoteFilePath, "remoteFilePath");
            Intrinsics.m97802h(state, "state");
            Iterator it = C27656a.f84824a.m107586d().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(remoteFilePath, ((FileData) next).getFileRemotePath()));
            FileData fileData = (FileData) next;
            if (fileData != null && fileData.getState() != 5 && fileData.getState() != 6 && fileData.getState() != 3 && fileData.getState() != 4 && fileData.getState() != 7) {
                fileData.setState(FileData.INSTANCE.m83213a(state));
                fileData.setDownloadSize(j11);
                fileData.setFileSize(j12);
            }
            Iterator it2 = TransferClient.this.f63717r.iterator();
            while (it2.hasNext()) {
                ((InterfaceC20012f) it2.next()).mo82944J(remoteFilePath, state, j11, j12, j13, str);
            }
            if (state == TaskState.SPACE_LIMIT) {
                TransferClient.this.m83135n0(remoteFilePath, 7);
            }
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: N */
        public void mo82945N() {
            for (FileData fileData : C27656a.f84824a.m107586d()) {
                if (fileData.getState() != 4 && fileData.getState() != 3 && fileData.getState() != 7) {
                    fileData.setState(5);
                }
            }
            Iterator it = TransferClient.this.f63717r.iterator();
            while (it.hasNext()) {
                ((InterfaceC20012f) it.next()).mo82945N();
            }
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: k */
        public void mo82946k(int i11) {
            Iterator it = TransferClient.this.f63717r.iterator();
            while (it.hasNext()) {
                ((InterfaceC20012f) it.next()).mo82946k(i11);
            }
        }

        @Override // com.transsion.transfer.impl.InterfaceC20012f
        /* JADX INFO: renamed from: p */
        public void mo82947p(String remoteFilePath) {
            Intrinsics.m97802h(remoteFilePath, "remoteFilePath");
            Iterator it = TransferClient.this.f63717r.iterator();
            while (it.hasNext()) {
                ((InterfaceC20012f) it.next()).mo82947p(remoteFilePath);
            }
        }
    }

    static {
        String name = TransferClient.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        f63695u = name;
    }

    private TransferClient(String str, String str2, String str3) {
        this.f63700a = str;
        this.f63701b = str2;
        this.f63702c = str3;
        this.f63703d = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.client.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferClient.m83113U();
            }
        });
        this.f63704e = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.client.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferClient.m83111S();
            }
        });
        this.f63705f = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.client.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferClient.m83119a0(this.f63728a);
            }
        });
        this.f63706g = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.client.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferClient.m83112T(this.f63729a);
            }
        });
        this.f63709j = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.client.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferClient.m83127i0();
            }
        });
        this.f63711l = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.client.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferClient.m83131l0(this.f63730a);
            }
        });
        this.f63715p = new C19989g();
        this.f63716q = new C19984b();
        this.f63717r = new CopyOnWriteArrayList();
        this.f63718s = new C19990h();
    }

    public /* synthetic */ TransferClient(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final AsyncHttpClient m83111S() {
        return AsyncHttpClient.m82608w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C20004n m83112T(TransferClient transferClient) {
        AsyncHttpClient asyncHttpClientM83120b0 = transferClient.m83120b0();
        Intrinsics.m97801g(asyncHttpClientM83120b0, "<get-client>(...)");
        return new C20004n(asyncHttpClientM83120b0, transferClient.f63701b, transferClient.f63702c, transferClient.m83125g0(), transferClient.f63718s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final String m83113U() {
        return Build.MODEL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final Unit m83114V(TransferClient transferClient, Function0 function0) {
        InterfaceC19875b0 interfaceC19875b0 = transferClient.f63707h;
        if (interfaceC19875b0 != null) {
            interfaceC19875b0.close();
        }
        transferClient.f63708i = false;
        PingPongHelper pingPongHelper = transferClient.f63710k;
        if (pingPongHelper != null) {
            pingPongHelper.m82962o();
        }
        function0.invoke();
        transferClient.m83123e0().m83209q();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final void m83115W(final Function2 function2) throws UnsupportedEncodingException {
        this.f63714o = false;
        AsyncHttpClient asyncHttpClientM83120b0 = m83120b0();
        String str = this.f63701b;
        String str2 = this.f63702c;
        String strM83122d0 = m83122d0();
        Intrinsics.m97801g(strM83122d0, "<get-deviceName>(...)");
        asyncHttpClientM83120b0.m82612L(m83126h0("/pingpong?clientIp=" + str + "&transferId=" + str2 + "&deviceName=" + AbstractC26736a.m104533b(strM83122d0)), "socket_connect", new AsyncHttpClient.InterfaceC19859k() { // from class: com.transsion.transfer.impl.client.h
            @Override // com.transsion.transfer.androidasync.http.AsyncHttpClient.InterfaceC19859k
            /* JADX INFO: renamed from: a */
            public final void mo82632a(Exception exc, InterfaceC19875b0 interfaceC19875b0) {
                TransferClient.m83116X(this.f63733a, function2, exc, interfaceC19875b0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m83116X(final TransferClient transferClient, Function2 function2, Exception exc, final InterfaceC19875b0 interfaceC19875b0) {
        boolean z11 = false;
        transferClient.f63708i = false;
        if (exc == null) {
            transferClient.f63707h = interfaceC19875b0;
            InterfaceC19875b0 interfaceC19875b1 = transferClient.f63707h;
            if (interfaceC19875b1 != null) {
                interfaceC19875b1.mo82697J(new InterfaceC19875b0.c() { // from class: com.transsion.transfer.impl.client.i
                    @Override // com.transsion.transfer.androidasync.http.InterfaceC19875b0.c
                    /* JADX INFO: renamed from: a */
                    public final void mo82699a(String str) {
                        TransferClient.m83117Y(this.f63735a, str);
                    }
                });
            }
            InterfaceC19875b0 interfaceC19875b2 = transferClient.f63707h;
            if (interfaceC19875b2 != null) {
                interfaceC19875b2.mo82422q(new InterfaceC23677a() { // from class: com.transsion.transfer.impl.client.j
                    @Override // p439gv.InterfaceC23677a
                    /* JADX INFO: renamed from: g */
                    public final void mo82442g(Exception exc2) {
                        TransferClient.m83118Z(this.f63736a, interfaceC19875b0, exc2);
                    }
                });
            }
            String str = transferClient.f63700a;
            Intrinsics.m97799e(interfaceC19875b0);
            PingPongHelper pingPongHelper = new PingPongHelper(str, false, interfaceC19875b0, transferClient.f63715p);
            pingPongHelper.m82961n();
            transferClient.f63710k = pingPongHelper;
        } else {
            exc.printStackTrace();
            String str2 = transferClient.f63700a;
            String message = exc.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("serverIP:");
            sb2.append(str2);
            sb2.append(" connect error: ");
            sb2.append(message);
            sb2.append(" ");
        }
        if (exc == null && interfaceC19875b0 != null) {
            z11 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z11);
        String message2 = exc.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        function2.invoke(boolValueOf, message2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m83117Y(TransferClient transferClient, String str) {
        Intrinsics.m97799e(str);
        transferClient.m83128j0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m83118Z(TransferClient transferClient, InterfaceC19875b0 interfaceC19875b0, Exception exc) {
        PingPongHelper pingPongHelper = transferClient.f63710k;
        if (pingPongHelper != null) {
            pingPongHelper.m82962o();
        }
        PingPongHelper.InterfaceC19962a interfaceC19962a = transferClient.f63715p;
        String str = transferClient.f63700a;
        Intrinsics.m97799e(interfaceC19875b0);
        interfaceC19962a.mo82963a(str, interfaceC19875b0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C20005o m83119a0(TransferClient transferClient) {
        AsyncHttpClient asyncHttpClientM83120b0 = transferClient.m83120b0();
        Intrinsics.m97801g(asyncHttpClientM83120b0, "<get-client>(...)");
        return new C20005o(asyncHttpClientM83120b0, transferClient.f63701b, transferClient.f63702c, transferClient.m83125g0(), transferClient.f63718s, transferClient.f63716q);
    }

    /* JADX INFO: renamed from: b0 */
    private final AsyncHttpClient m83120b0() {
        return (AsyncHttpClient) this.f63704e.getValue();
    }

    /* JADX INFO: renamed from: c0 */
    private final C20004n m83121c0() {
        return (C20004n) this.f63706g.getValue();
    }

    /* JADX INFO: renamed from: d0 */
    private final String m83122d0() {
        return (String) this.f63703d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final C20005o m83123e0() {
        return (C20005o) this.f63705f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final Gson m83124f0() {
        return (Gson) this.f63709j.getValue();
    }

    /* JADX INFO: renamed from: g0 */
    private final String m83125g0() {
        return (String) this.f63711l.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private final String m83126h0(String str) {
        String str2 = m83125g0() + str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getUrl baseUrl: ");
        sb2.append(str2);
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final Gson m83127i0() {
        return new Gson();
    }

    /* JADX INFO: renamed from: j0 */
    private final boolean m83128j0(String str) {
        if (!StringsKt.m98242W(str, "cmd", false, 2, null)) {
            return false;
        }
        try {
            List listS0 = StringsKt.m98117S0(str, new String[]{UrlUtils.QUESTION_MARK}, false, 0, 6, null);
            int i11 = Integer.parseInt((String) StringsKt.m98117S0((CharSequence) listS0.get(0), new String[]{UrlUtils.EQUAL_MARK}, false, 0, 6, null).get(1));
            List listS1 = listS0.size() > 1 ? StringsKt.m98117S0((CharSequence) listS0.get(1), new String[]{UrlUtils.AND_MARK}, false, 0, 6, null) : new ArrayList();
            if (i11 < 0) {
                m83129k0(i11, listS1);
            } else {
                this.f63718s.mo82946k(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    private final void m83129k0(int i11, List list) {
        InterfaceC19875b0 interfaceC19875b0;
        if (i11 != -2) {
            if (i11 == -1 && (interfaceC19875b0 = this.f63707h) != null) {
                interfaceC19875b0.close();
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List listS0 = StringsKt.m98117S0((String) it.next(), new String[]{UrlUtils.EQUAL_MARK}, false, 0, 6, null);
            linkedHashMap.put(listS0.get(0), AbstractC26736a.m104532a((String) listS0.get(1)));
        }
        String str = (String) linkedHashMap.get("deviceName");
        this.f63712m = str;
        Function3 function3 = this.f63713n;
        if (function3 != null) {
            function3.invoke(str, Boolean.TRUE, "client");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final String m83131l0(TransferClient transferClient) {
        return "http://" + transferClient.f63700a + ":9890";
    }

    /* JADX INFO: renamed from: m0 */
    private final void m83133m0(Function0 function0) {
        m83120b0().m82616v(f63694t.m83166c(m83126h0("/client/notifyClientClose"), this.f63701b, this.f63702c), new C19985c(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final void m83135n0(String str, int i11) {
        AsyncHttpClient asyncHttpClientM83120b0 = m83120b0();
        C19891i c19891iM83167d = f63694t.m83167d(m83126h0("/client/notifyFileTaskError"), this.f63701b, this.f63702c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(str, Integer.valueOf(i11)));
        c19891iM83167d.m82753w(new C23904f(m83124f0().toJson(arrayList)));
        asyncHttpClientM83120b0.m82616v(c19891iM83167d, new C19987e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final void m83137o0(List list) {
        if (list.isEmpty()) {
            return;
        }
        AsyncHttpClient asyncHttpClientM83120b0 = m83120b0();
        C19891i c19891iM83167d = f63694t.m83167d(m83126h0("/client/notifyFileTaskFinish"), this.f63701b, this.f63702c);
        c19891iM83167d.m82753w(new C23904f(m83124f0().toJson(list)));
        asyncHttpClientM83120b0.m82616v(c19891iM83167d, new C19988f(list));
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: a */
    public void mo83149a(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        m83120b0().m82616v(f63694t.m83166c(m83126h0("/client/notifyServerCreate"), this.f63701b, this.f63702c), new C19986d(callback));
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: b */
    public void mo83150b(Function3 function3) {
        this.f63713n = function3;
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: c */
    public void mo83151c(final Function0 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f63714o = true;
        m83133m0(new Function0() { // from class: com.transsion.transfer.impl.client.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferClient.m83114V(this.f63731a, callback);
            }
        });
        this.f63717r.clear();
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: d */
    public void mo83152d(Function2 listener) throws UnsupportedEncodingException {
        InterfaceC19875b0 interfaceC19875b0;
        InterfaceC19875b0 interfaceC19875b1;
        Intrinsics.m97802h(listener, "listener");
        if ((this.f63707h == null || (interfaceC19875b1 = this.f63707h) == null || !interfaceC19875b1.isOpen()) && !this.f63708i) {
            this.f63708i = true;
            m83115W(listener);
            return;
        }
        InterfaceC19875b0 interfaceC19875b2 = this.f63707h;
        InterfaceC19875b0 interfaceC19875b3 = this.f63707h;
        Boolean boolValueOf = interfaceC19875b3 != null ? Boolean.valueOf(interfaceC19875b3.isOpen()) : null;
        boolean z11 = this.f63708i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("connect: socket:");
        sb2.append(interfaceC19875b2);
        sb2.append(", socket#isOpen:");
        sb2.append(boolValueOf);
        sb2.append(", socketConnecting:");
        sb2.append(z11);
        listener.invoke(Boolean.valueOf((this.f63707h == null || (interfaceC19875b0 = this.f63707h) == null || !interfaceC19875b0.isOpen()) ? false : true), "connect is process");
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: e */
    public void mo83153e(final String root, final Function2 callback) {
        Intrinsics.m97802h(root, "root");
        Intrinsics.m97802h(callback, "callback");
        m83120b0().m82616v(f63694t.m83166c(m83126h0("/client/getTransferFilesList"), this.f63701b, this.f63702c), new AsyncHttpClient.AbstractC19858j() { // from class: com.transsion.transfer.impl.client.TransferClient$fetchList$1
            @Override // p439gv.InterfaceC23683g
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void mo83175c(Exception exc, InterfaceC19893k interfaceC19893k, String str) {
                Object objM112707constructorimpl;
                TransferClient.f63694t.m83171j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fetchList onCompleted: result:");
                sb2.append(str);
                sb2.append(" and e:");
                sb2.append(exc);
                if (exc != null) {
                    callback.invoke(null, exc);
                    return;
                }
                TransferClient transferClient = this;
                Function2 function2 = callback;
                String str2 = root;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    TransferResponse transferResponse = (TransferResponse) transferClient.m83124f0().fromJson(str, new TypeToken<TransferResponse<List<FileData>>>() { // from class: com.transsion.transfer.impl.client.TransferClient$fetchList$1$onCompleted$1$data$1
                    }.getType());
                    if (transferResponse.getCode() == 0) {
                        for (FileData fileData : (Iterable) transferResponse.getData()) {
                            C20043b.f63832c.m83276a();
                            String fileRemotePath = fileData.getFileRemotePath();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("fetchList#onCompleted: ");
                            sb3.append(fileRemotePath);
                            if (fileData.getFileReceiveCachePath().length() == 0 || new File(fileData.getFileReceiveCachePath()).isDirectory()) {
                                String absolutePath = new File(str2, fileData.getFileName()).getAbsolutePath();
                                Intrinsics.m97801g(absolutePath, "getAbsolutePath(...)");
                                fileData.setFileReceiveCachePath(absolutePath);
                            }
                        }
                        C27656a.f84824a.m107584a((List) transferResponse.getData());
                        function2.invoke(transferResponse.getData(), null);
                    } else {
                        function2.invoke(null, null);
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
                Result.m112706boximpl(objM112707constructorimpl);
            }
        });
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: f */
    public void mo83154f(FileData fileData) {
        Intrinsics.m97802h(fileData, "fileData");
        m83123e0().m83210t(fileData);
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: g */
    public void mo83155g(InterfaceC20012f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f63717r.remove(listener);
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: h */
    public boolean mo83156h() {
        InterfaceC19875b0 interfaceC19875b0 = this.f63707h;
        return interfaceC19875b0 != null && interfaceC19875b0.isOpen();
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: i */
    public void mo83157i(String root, List files, Function1 notifyFileListener) {
        Intrinsics.m97802h(root, "root");
        Intrinsics.m97802h(files, "files");
        Intrinsics.m97802h(notifyFileListener, "notifyFileListener");
        ArrayList arrayList = new ArrayList();
        m83121c0().m83189e(files);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : files) {
            FileData fileData = (FileData) obj;
            boolean zVerifyFile = fileData.verifyFile();
            if (zVerifyFile) {
                this.f63718s.mo82944J(fileData.getFileRemotePath(), TaskState.FINISH, fileData.getFileSize(), fileData.getFileSize(), -1L, null);
                arrayList.add(fileData.getFileRemotePath());
            }
            if (!zVerifyFile) {
                arrayList2.add(obj);
            }
        }
        List listU0 = CollectionsKt.m97343U0(arrayList2);
        notifyFileListener.invoke(CollectionsKt.m97343U0(arrayList));
        m83137o0(arrayList);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("transferFiles: ");
        sb2.append(listU0);
        m83123e0().m83208p(listU0);
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: j */
    public String mo83158j() {
        return this.f63712m;
    }

    @Override // com.transsion.transfer.impl.InterfaceC20008e
    /* JADX INFO: renamed from: k */
    public void mo83159k(InterfaceC20012f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f63717r.remove(listener);
        this.f63717r.add(listener);
    }
}
