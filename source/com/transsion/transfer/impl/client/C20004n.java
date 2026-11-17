package com.transsion.transfer.impl.client;

import com.transsion.transfer.androidasync.http.AsyncHttpClient;
import com.transsion.transfer.androidasync.http.InterfaceC19893k;
import com.transsion.transfer.impl.InterfaceC20012f;
import com.transsion.transfer.impl.entity.FileData;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p662ov.AbstractC26736a;

/* JADX INFO: renamed from: com.transsion.transfer.impl.client.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C20004n {

    /* JADX INFO: renamed from: i */
    public static final a f63741i = new a(null);

    /* JADX INFO: renamed from: a */
    private final AsyncHttpClient f63742a;

    /* JADX INFO: renamed from: b */
    private final String f63743b;

    /* JADX INFO: renamed from: c */
    private final String f63744c;

    /* JADX INFO: renamed from: d */
    private final String f63745d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC20012f f63746e;

    /* JADX INFO: renamed from: f */
    private final List f63747f;

    /* JADX INFO: renamed from: g */
    private final List f63748g;

    /* JADX INFO: renamed from: h */
    private boolean f63749h;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.n$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.n$b */
    public static final class b extends AsyncHttpClient.AbstractC19855g {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ File f63751b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ File f63752c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ FileData f63753d;

        b(File file, File file2, FileData fileData) {
            this.f63751b = file;
            this.f63752c = file2;
            this.f63753d = fileData;
        }

        @Override // com.transsion.transfer.androidasync.http.AsyncHttpClient.AbstractC19857i, p496iv.InterfaceC24230b
        /* JADX INFO: renamed from: a */
        public void mo82630a(InterfaceC19893k interfaceC19893k, long j11, long j12) {
            super.mo82630a(interfaceC19893k, j11, j12);
        }

        @Override // com.transsion.transfer.androidasync.http.AsyncHttpClient.AbstractC19857i, p496iv.InterfaceC24230b
        /* JADX INFO: renamed from: b */
        public void mo82631b(InterfaceC19893k interfaceC19893k) {
        }

        @Override // p439gv.InterfaceC23683g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo83175c(Exception exc, InterfaceC19893k interfaceC19893k, File file) {
            Boolean boolValueOf = file != null ? Boolean.valueOf(file.exists()) : null;
            Long lValueOf = file != null ? Long.valueOf(file.length()) : null;
            String message = exc != null ? exc.getMessage() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCompleted: exist:");
            sb2.append(boolValueOf);
            sb2.append(" , length:");
            sb2.append(lValueOf);
            sb2.append(" , e:");
            sb2.append(message);
            C20004n.this.f63749h = false;
            if (exc == null) {
                this.f63751b.renameTo(this.f63752c);
                C20004n.this.f63746e.mo82947p(this.f63753d.getFileRemotePath());
            }
            C20004n.this.f63748g.remove(this.f63753d);
            C20004n.this.m83187f();
        }
    }

    public C20004n(AsyncHttpClient httpClient, String clientIp, String transferId, String urlPath, InterfaceC20012f listener) {
        Intrinsics.m97802h(httpClient, "httpClient");
        Intrinsics.m97802h(clientIp, "clientIp");
        Intrinsics.m97802h(transferId, "transferId");
        Intrinsics.m97802h(urlPath, "urlPath");
        Intrinsics.m97802h(listener, "listener");
        this.f63742a = httpClient;
        this.f63743b = clientIp;
        this.f63744c = transferId;
        this.f63745d = urlPath;
        this.f63746e = listener;
        this.f63747f = new ArrayList();
        this.f63748g = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m83187f() {
        Object objM112707constructorimpl;
        if (this.f63748g.isEmpty() && !this.f63747f.isEmpty()) {
            this.f63748g.add(this.f63747f.remove(0));
        }
        if (this.f63748g.isEmpty() || this.f63749h) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m83188g((FileData) this.f63748g.get(0));
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Result.m112706boximpl(objM112707constructorimpl);
    }

    /* JADX INFO: renamed from: g */
    private final void m83188g(FileData fileData) throws UnsupportedEncodingException {
        File tempCoverFile = fileData.getTempCoverFile();
        File coverFile = fileData.getCoverFile();
        if (!StringsKt.m98242W(fileData.getCoverUrl(), "/", false, 2, null) || coverFile.exists()) {
            this.f63746e.mo82947p(fileData.getFileRemotePath());
            this.f63748g.remove(fileData);
            m83187f();
            return;
        }
        this.f63749h = true;
        String coverUrl = fileData.getCoverUrl();
        String absolutePath = tempCoverFile.getAbsolutePath();
        this.f63742a.m82615t(TransferClient.f63694t.m83166c(this.f63745d + "/client/fetchFile?file=" + AbstractC26736a.m104533b(coverUrl), this.f63743b, this.f63744c), absolutePath, new b(tempCoverFile, coverFile, fileData));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m83189e(List files) {
        Intrinsics.m97802h(files, "files");
        this.f63747f.addAll(files);
        m83187f();
    }
}
