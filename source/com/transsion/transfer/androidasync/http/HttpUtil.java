package com.transsion.transfer.androidasync.http;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.cloud.tmc.integration.utils.share.config.ShareConstant;
import com.transsion.transfer.androidasync.AsyncServer;
import com.transsion.transfer.androidasync.C19944t;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.http.filter.ChunkedInputFilter;
import p439gv.InterfaceC23677a;
import p468hv.C23900b;
import p468hv.C23901c;
import p468hv.C23904f;
import p468hv.C23906h;
import p468hv.InterfaceC23899a;
import p529jv.C24471b;
import p529jv.C24472c;
import p529jv.C24473d;

/* JADX INFO: loaded from: classes6.dex */
public class HttpUtil {

    static class EndEmitter extends C19944t {
        private EndEmitter() {
        }

        /* JADX INFO: renamed from: P */
        public static EndEmitter m82647P(AsyncServer asyncServer, final Exception exc) {
            EndEmitter endEmitter = new EndEmitter();
            asyncServer.m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.http.HttpUtil.EndEmitter.1
                @Override // java.lang.Runnable
                public void run() {
                    EndEmitter.this.mo82624M(exc);
                }
            });
            return endEmitter;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m82641a(Headers headers) {
        String strM82635c = headers.m82635c(HttpHeaders.CONTENT_LENGTH);
        if (strM82635c == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM82635c);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC23899a m82642b(InterfaceC19937p interfaceC19937p, InterfaceC23677a interfaceC23677a, Headers headers) {
        String strM82635c = headers.m82635c(HttpHeaders.CONTENT_TYPE);
        if (strM82635c == null) {
            return null;
        }
        String[] strArrSplit = strM82635c.split(";");
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            strArrSplit[i11] = strArrSplit[i11].trim();
        }
        for (String str : strArrSplit) {
            if ("application/x-www-form-urlencoded".equals(str)) {
                return new C23906h();
            }
            if ("application/json".equals(str)) {
                return new C23900b();
            }
            if (ShareConstant.SHARE_TYPE_TEXT.equals(str)) {
                return new C23904f();
            }
            if (str != null && str.startsWith("multipart/")) {
                return new C23901c(strM82635c);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static InterfaceC19937p m82643c(InterfaceC19937p interfaceC19937p, Protocol protocol, Headers headers, boolean z11) {
        long j11;
        C19944t chunkedInputFilter;
        C19944t c24473d;
        try {
            String strM82635c = headers.m82635c(HttpHeaders.CONTENT_LENGTH);
            j11 = strM82635c != null ? Long.parseLong(strM82635c) : -1L;
        } catch (NumberFormatException unused) {
        }
        if (-1 == j11) {
            if ("chunked".equalsIgnoreCase(headers.m82635c("Transfer-Encoding"))) {
                chunkedInputFilter = new ChunkedInputFilter();
                chunkedInputFilter.mo82625N(interfaceC19937p);
            } else if (z11) {
                EndEmitter endEmitterM82647P = EndEmitter.m82647P(interfaceC19937p.mo82413a(), null);
                endEmitterM82647P.mo82625N(interfaceC19937p);
                return endEmitterM82647P;
            }
            if ("gzip".equals(headers.m82635c(HttpHeaders.CONTENT_ENCODING))) {
                c24473d = new C24472c();
                c24473d.mo82625N(interfaceC19937p);
            } else {
                if ("deflate".equals(headers.m82635c(HttpHeaders.CONTENT_ENCODING))) {
                    return interfaceC19937p;
                }
                c24473d = new C24473d();
                c24473d.mo82625N(interfaceC19937p);
            }
            return c24473d;
        }
        if (j11 < 0) {
            EndEmitter endEmitterM82647P2 = EndEmitter.m82647P(interfaceC19937p.mo82413a(), new BodyDecoderException("not using chunked encoding, and no content-length found."));
            endEmitterM82647P2.mo82625N(interfaceC19937p);
            return endEmitterM82647P2;
        }
        if (j11 == 0) {
            EndEmitter endEmitterM82647P3 = EndEmitter.m82647P(interfaceC19937p.mo82413a(), null);
            endEmitterM82647P3.mo82625N(interfaceC19937p);
            return endEmitterM82647P3;
        }
        chunkedInputFilter = new C24471b(j11);
        chunkedInputFilter.mo82625N(interfaceC19937p);
        interfaceC19937p = chunkedInputFilter;
        if ("gzip".equals(headers.m82635c(HttpHeaders.CONTENT_ENCODING))) {
            c24473d = new C24472c();
            c24473d.mo82625N(interfaceC19937p);
        } else {
            if ("deflate".equals(headers.m82635c(HttpHeaders.CONTENT_ENCODING))) {
                return interfaceC19937p;
            }
            c24473d = new C24473d();
            c24473d.mo82625N(interfaceC19937p);
        }
        return c24473d;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m82644d(Protocol protocol, Headers headers) {
        String strM82635c = headers.m82635c("Connection");
        if (strM82635c == null) {
            return protocol == Protocol.HTTP_1_1;
        }
        return "keep-alive".equalsIgnoreCase(strM82635c);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m82645e(String str, Headers headers) {
        String strM82635c = headers.m82635c("Connection");
        if (strM82635c == null) {
            return Protocol.get(str) == Protocol.HTTP_1_1;
        }
        return "keep-alive".equalsIgnoreCase(strM82635c);
    }
}
