package com.transsion.transfer.impl.server.service;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.transsion.transfer.androidasync.http.Headers;
import com.transsion.transfer.androidasync.http.Multimap;
import com.transsion.transfer.androidasync.http.server.InterfaceC19905b;
import com.transsion.transfer.androidasync.http.server.InterfaceC19907d;
import com.transsion.transfer.androidasync.http.server.InterfaceC19920q;
import com.transsion.transfer.androidasync.http.server.MalformedRangeException;
import com.transsion.transfer.impl.InterfaceC20014g;
import com.transsion.transfer.impl.InterfaceC20018i;
import com.transsion.transfer.impl.TaskState;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import p439gv.InterfaceC23681e;
import p624nv.C26109c;
import p662ov.AbstractC26736a;

/* JADX INFO: renamed from: com.transsion.transfer.impl.server.service.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C20042a implements InterfaceC19920q {

    /* JADX INFO: renamed from: c */
    public static final a f63822c = new a(null);

    /* JADX INFO: renamed from: d */
    private static final String f63823d = "Transfer-" + C20042a.class.getName();

    /* JADX INFO: renamed from: a */
    private final InterfaceC20014g f63824a;

    /* JADX INFO: renamed from: b */
    private InterfaceC20018i f63825b;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.server.service.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m83272a() {
            return C20042a.f63823d;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.server.service.a$b */
    public static final class b implements InterfaceC23681e {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f63827b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f63828c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Ref.LongRef f63829d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ long f63830e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Ref.LongRef f63831f;

        b(String str, String str2, Ref.LongRef longRef, long j11, Ref.LongRef longRef2) {
            this.f63827b = str;
            this.f63828c = str2;
            this.f63829d = longRef;
            this.f63830e = j11;
            this.f63831f = longRef2;
        }

        @Override // p439gv.InterfaceC23681e
        /* JADX INFO: renamed from: a */
        public void mo83273a(long j11, long j12) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Ref.LongRef longRef = this.f63831f;
            if (jCurrentTimeMillis - longRef.element < 2000) {
                return;
            }
            longRef.element = System.currentTimeMillis();
            InterfaceC20018i interfaceC20018i = C20042a.this.f63825b;
            String str = this.f63827b;
            String str2 = this.f63828c;
            long j13 = this.f63829d.element;
            interfaceC20018i.mo83229i(str, str2, j11 + j13, j12 + j13);
        }

        @Override // p439gv.InterfaceC23681e
        /* JADX INFO: renamed from: b */
        public void mo83274b(Exception exc) {
            C20042a.f63822c.m83272a();
            String message = exc != null ? exc.getMessage() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("transfer file onComplete: ");
            sb2.append(message);
            InterfaceC20018i interfaceC20018i = C20042a.this.f63825b;
            String str = this.f63827b;
            String str2 = this.f63828c;
            TaskState taskState = exc == null ? TaskState.FINISH : TaskState.ERROR;
            long j11 = this.f63830e;
            interfaceC20018i.mo83227L(str, str2, taskState, j11, j11);
        }
    }

    public C20042a(InterfaceC20014g fileHandler, InterfaceC20018i listener) {
        Intrinsics.m97802h(fileHandler, "fileHandler");
        Intrinsics.m97802h(listener, "listener");
        this.f63824a = fileHandler;
        this.f63825b = listener;
    }

    /* JADX INFO: renamed from: d */
    private final long m83271d(InterfaceC19905b interfaceC19905b) {
        String strM82635c;
        List listL;
        List listL2;
        Headers headers;
        if (interfaceC19905b == null || (headers = interfaceC19905b.getHeaders()) == null || (strM82635c = headers.m82635c("Range")) == null) {
            strM82635c = "";
        }
        if (strM82635c.length() <= 0) {
            return 0L;
        }
        List<String> listSplit = new Regex(UrlUtils.EQUAL_MARK).split(strM82635c, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listL = CollectionsKt.m97506l();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listL = CollectionsKt.m97333K0(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listL = CollectionsKt.m97506l();
            break;
        }
        String[] strArr = (String[]) listL.toArray(new String[0]);
        if (strArr.length != 2 || !Intrinsics.m97797c("bytes", strArr[0])) {
            return 0L;
        }
        List<String> listSplit2 = new Regex("-").split(strArr[1], 0);
        if (!listSplit2.isEmpty()) {
            ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listL2 = CollectionsKt.m97506l();
                    break;
                }
                if (listIterator2.previous().length() != 0) {
                    listL2 = CollectionsKt.m97333K0(listSplit2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listL2 = CollectionsKt.m97506l();
            break;
        }
        String[] strArr2 = (String[]) listL2.toArray(new String[0]);
        try {
            if (strArr2.length > 2) {
                throw new MalformedRangeException();
            }
            if (TextUtils.isEmpty(strArr2[0])) {
                return 0L;
            }
            return Long.parseLong(strArr2[0]);
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.transsion.transfer.androidasync.http.server.InterfaceC19920q
    /* JADX INFO: renamed from: b */
    public void mo82825b(InterfaceC19905b interfaceC19905b, InterfaceC19907d interfaceC19907d) {
        InterfaceC19907d interfaceC19907dMo82804c;
        Multimap multimapMo82788h;
        String string;
        Ref.LongRef longRef = new Ref.LongRef();
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
        String strM104532a = (interfaceC19905b == null || (multimapMo82788h = interfaceC19905b.mo82788h()) == null || (string = multimapMo82788h.getString(OfflineConstantsKt.OFFLINE_DOWNLOAD_SEARCH_MODE_FILE)) == null) ? null : AbstractC26736a.m104532a(string);
        File file = strM104532a != null ? new File(strM104532a) : null;
        long jM83271d = m83271d(interfaceC19905b);
        long jLongValue = (file != null ? Long.valueOf(file.length()) : Integer.MAX_VALUE).longValue();
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = jM83271d;
        if (file != null && file.exists()) {
            if (interfaceC19907d != null) {
                interfaceC19907d.mo82805p(file, new b(str, strM104532a, longRef2, jLongValue, longRef));
                return;
            }
            return;
        }
        if (strM104532a != null) {
            this.f63825b.mo83227L(str, strM104532a, TaskState.NO_FILE, 0L, jLongValue);
        }
        String strM102252a = aVar.m102252a(-1, "File not found," + strM104532a, "");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("createResponseJsonObj: ");
        sb2.append(strM102252a);
        if (interfaceC19907d == null || (interfaceC19907dMo82804c = interfaceC19907d.mo82804c(TTAdConstant.DEEPLINK_FALLBACK_CODE)) == null) {
            return;
        }
        interfaceC19907dMo82804c.send(strM102252a);
    }
}
