package com.transsion.transfer.androidasync.http;

import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.InterfaceC19940s;
import com.transsion.transfer.androidasync.future.InterfaceC19818a;
import com.transsion.transfer.androidasync.util.C19954e;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23678b;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC19889g {

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g$a */
    public static class a extends e {

        /* JADX INFO: renamed from: c */
        public InterfaceC23678b f63375c;

        /* JADX INFO: renamed from: d */
        public InterfaceC19818a f63376d;

        /* JADX INFO: renamed from: e */
        public String f63377e;
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g$b */
    public static class b extends d {

        /* JADX INFO: renamed from: j */
        public InterfaceC19937p f63378j;
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g$c */
    public static class c extends a {

        /* JADX INFO: renamed from: f */
        public InterfaceC19931j f63379f;

        /* JADX INFO: renamed from: g */
        public i f63380g;

        /* JADX INFO: renamed from: h */
        public InterfaceC23677a f63381h;

        /* JADX INFO: renamed from: i */
        public InterfaceC23677a f63382i;
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g$d */
    public static class d extends f {
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public C19954e f63383a = new C19954e();

        /* JADX INFO: renamed from: b */
        public C19892j f63384b;
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g$f */
    public static class f extends c {
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g$g */
    public static class g extends h {

        /* JADX INFO: renamed from: k */
        public Exception f63385k;
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g$h */
    public static class h extends b {
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.g$i */
    public interface i {
        /* JADX INFO: renamed from: H */
        InterfaceC19940s mo82721H();

        /* JADX INFO: renamed from: b */
        int mo82722b();

        /* JADX INFO: renamed from: c */
        i mo82723c(int i11);

        /* JADX INFO: renamed from: e */
        Headers mo82724e();

        /* JADX INFO: renamed from: f */
        i mo82725f(InterfaceC19940s interfaceC19940s);

        /* JADX INFO: renamed from: l */
        i mo82726l(String str);

        /* JADX INFO: renamed from: n */
        i mo82727n(InterfaceC19937p interfaceC19937p);

        String protocol();

        /* JADX INFO: renamed from: r */
        i mo82728r(String str);

        InterfaceC19931j socket();

        /* JADX INFO: renamed from: y */
        i mo82729y(Headers headers);
    }

    /* JADX INFO: renamed from: a */
    void mo82687a(e eVar);

    /* JADX INFO: renamed from: b */
    void mo82688b(g gVar);

    /* JADX INFO: renamed from: c */
    void mo82689c(f fVar);

    /* JADX INFO: renamed from: d */
    void mo82690d(b bVar);

    /* JADX INFO: renamed from: e */
    InterfaceC19818a mo82691e(a aVar);

    /* JADX INFO: renamed from: f */
    boolean mo82692f(c cVar);

    /* JADX INFO: renamed from: g */
    void mo82693g(d dVar);

    /* JADX INFO: renamed from: h */
    C19892j mo82694h(h hVar);
}
