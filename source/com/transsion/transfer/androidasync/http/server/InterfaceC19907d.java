package com.transsion.transfer.androidasync.http.server;

import com.transsion.transfer.androidasync.InterfaceC19940s;
import com.transsion.transfer.androidasync.http.Headers;
import java.io.File;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23681e;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.server.d */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC19907d extends InterfaceC19940s, InterfaceC23677a {
    /* JADX INFO: renamed from: D */
    String mo82802D();

    /* JADX INFO: renamed from: b */
    int mo82803b();

    /* JADX INFO: renamed from: c */
    InterfaceC19907d mo82804c(int i11);

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: d */
    void mo82414d();

    Headers getHeaders();

    /* JADX INFO: renamed from: p */
    void mo82805p(File file, InterfaceC23681e interfaceC23681e);

    void send(String str);

    /* JADX INFO: renamed from: u */
    void mo82806u();
}
