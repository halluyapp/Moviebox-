package com.transsion.transfer.androidasync;

import android.support.v4.media.session.PlaybackStateCompat;
import com.transsion.transfer.androidasync.util.C19950a;
import com.transsion.transfer.androidasync.util.C19953d;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;
import p439gv.InterfaceC23681e;
import p439gv.InterfaceC23686j;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0 */
/* JADX INFO: loaded from: classes6.dex */
public class C19809a0 {

    /* JADX INFO: renamed from: a */
    public static boolean f63197a;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0$a */
    class a implements InterfaceC23686j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC19940s f63198a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ByteBufferList f63199b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC23677a f63200c;

        a(InterfaceC19940s interfaceC19940s, ByteBufferList byteBufferList, InterfaceC23677a interfaceC23677a) {
            this.f63198a = interfaceC19940s;
            this.f63199b = byteBufferList;
            this.f63200c = interfaceC23677a;
        }

        @Override // p439gv.InterfaceC23686j
        /* JADX INFO: renamed from: a */
        public void mo82443a() {
            this.f63198a.mo82419m(this.f63199b);
            if (this.f63199b.m82494C() != 0 || this.f63200c == null) {
                return;
            }
            this.f63198a.mo82416i(null);
            this.f63200c.mo82442g(null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0$b */
    class b implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        boolean f63201a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC23677a f63202b;

        b(InterfaceC23677a interfaceC23677a) {
            this.f63202b = interfaceC23677a;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            if (this.f63201a) {
                return;
            }
            this.f63201a = true;
            this.f63202b.mo82442g(exc);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0$c */
    class c implements InterfaceC23686j {

        /* JADX INFO: renamed from: a */
        int f63203a = 0;

        /* JADX INFO: renamed from: b */
        ByteBufferList f63204b = new ByteBufferList();

        /* JADX INFO: renamed from: c */
        C19950a f63205c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC19940s f63206d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InputStream f63207e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ long f63208f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InterfaceC23677a f63209g;

        c(InterfaceC19940s interfaceC19940s, InputStream inputStream, long j11, InterfaceC23677a interfaceC23677a) {
            this.f63206d = interfaceC19940s;
            this.f63207e = inputStream;
            this.f63208f = j11;
            this.f63209g = interfaceC23677a;
            this.f63205c = new C19950a().m82892d((int) Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, j11));
        }

        /* JADX INFO: renamed from: b */
        private void m82528b() {
            this.f63206d.mo82422q(null);
            this.f63206d.mo82416i(null);
            this.f63204b.m82493B();
            C19953d.m82894a(this.f63207e);
        }

        @Override // p439gv.InterfaceC23686j
        /* JADX INFO: renamed from: a */
        public void mo82443a() {
            do {
                try {
                    if (!this.f63204b.m82513r()) {
                        ByteBuffer byteBufferM82889a = this.f63205c.m82889a();
                        int i11 = this.f63207e.read(byteBufferM82889a.array(), 0, (int) Math.min(this.f63208f - ((long) this.f63203a), byteBufferM82889a.capacity()));
                        if (i11 != -1 && this.f63203a != this.f63208f) {
                            this.f63205c.m82893e(i11);
                            this.f63203a += i11;
                            byteBufferM82889a.position(0);
                            byteBufferM82889a.limit(i11);
                            this.f63204b.m82498a(byteBufferM82889a);
                        }
                        m82528b();
                        this.f63209g.mo82442g(null);
                        return;
                    }
                    this.f63206d.mo82419m(this.f63204b);
                } catch (Exception e11) {
                    m82528b();
                    this.f63209g.mo82442g(e11);
                    return;
                }
            } while (!this.f63204b.m82513r());
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0$d */
    class d implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        boolean f63210a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC23677a f63211b;

        d(InterfaceC23677a interfaceC23677a) {
            this.f63211b = interfaceC23677a;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            if (this.f63210a) {
                return;
            }
            this.f63210a = true;
            this.f63211b.mo82442g(exc);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0$e */
    class e implements InterfaceC23686j {

        /* JADX INFO: renamed from: a */
        int f63212a = 0;

        /* JADX INFO: renamed from: b */
        ByteBufferList f63213b = new ByteBufferList();

        /* JADX INFO: renamed from: c */
        C19950a f63214c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC19940s f63215d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InputStream f63216e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ long f63217f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InterfaceC23677a f63218g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ InterfaceC23681e f63219h;

        e(InterfaceC19940s interfaceC19940s, InputStream inputStream, long j11, InterfaceC23677a interfaceC23677a, InterfaceC23681e interfaceC23681e) {
            this.f63215d = interfaceC19940s;
            this.f63216e = inputStream;
            this.f63217f = j11;
            this.f63218g = interfaceC23677a;
            this.f63219h = interfaceC23681e;
            this.f63214c = new C19950a().m82892d((int) Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, j11));
        }

        /* JADX INFO: renamed from: b */
        private void m82529b() {
            this.f63215d.mo82422q(null);
            this.f63215d.mo82416i(null);
            this.f63213b.m82493B();
            C19953d.m82894a(this.f63216e);
        }

        @Override // p439gv.InterfaceC23686j
        /* JADX INFO: renamed from: a */
        public void mo82443a() {
            do {
                try {
                    if (!this.f63213b.m82513r()) {
                        ByteBuffer byteBufferM82889a = this.f63214c.m82889a();
                        int i11 = this.f63216e.read(byteBufferM82889a.array(), 0, (int) Math.min(this.f63217f - ((long) this.f63212a), byteBufferM82889a.capacity()));
                        if (i11 != -1 && this.f63212a != this.f63217f) {
                            this.f63214c.m82893e(i11);
                            int i12 = this.f63212a + i11;
                            this.f63212a = i12;
                            InterfaceC23681e interfaceC23681e = this.f63219h;
                            if (interfaceC23681e != null) {
                                interfaceC23681e.mo83273a(i12, this.f63217f);
                            }
                            byteBufferM82889a.position(0);
                            byteBufferM82889a.limit(i11);
                            this.f63213b.m82498a(byteBufferM82889a);
                        }
                        m82529b();
                        this.f63218g.mo82442g(null);
                        InterfaceC23681e interfaceC23681e2 = this.f63219h;
                        if (interfaceC23681e2 != null) {
                            interfaceC23681e2.mo83274b(null);
                            return;
                        }
                        return;
                    }
                    this.f63215d.mo82419m(this.f63213b);
                } catch (Exception e11) {
                    m82529b();
                    this.f63218g.mo82442g(e11);
                    InterfaceC23681e interfaceC23681e3 = this.f63219h;
                    if (interfaceC23681e3 != null) {
                        interfaceC23681e3.mo83274b(e11);
                        return;
                    }
                    return;
                }
            } while (!this.f63213b.m82513r());
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0$f */
    class f implements InterfaceC23680d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC19940s f63220a;

        f(InterfaceC19940s interfaceC19940s) {
            this.f63220a = interfaceC19940s;
        }

        @Override // p439gv.InterfaceC23680d
        /* JADX INFO: renamed from: F */
        public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
            this.f63220a.mo82419m(byteBufferList);
            if (byteBufferList.m82494C() > 0) {
                interfaceC19937p.pause();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0$g */
    class g implements InterfaceC23686j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC19937p f63221a;

        g(InterfaceC19937p interfaceC19937p) {
            this.f63221a = interfaceC19937p;
        }

        @Override // p439gv.InterfaceC23686j
        /* JADX INFO: renamed from: a */
        public void mo82443a() {
            this.f63221a.resume();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0$h */
    class h implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        boolean f63222a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC19937p f63223b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC19940s f63224c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC23677a f63225d;

        h(InterfaceC19937p interfaceC19937p, InterfaceC19940s interfaceC19940s, InterfaceC23677a interfaceC23677a) {
            this.f63223b = interfaceC19937p;
            this.f63224c = interfaceC19940s;
            this.f63225d = interfaceC23677a;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            if (this.f63222a) {
                return;
            }
            this.f63222a = true;
            this.f63223b.mo82426v(null);
            this.f63223b.mo82428x(null);
            this.f63224c.mo82422q(null);
            this.f63224c.mo82416i(null);
            this.f63225d.mo82442g(exc);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.a0$i */
    class i implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC23677a f63226a;

        i(InterfaceC23677a interfaceC23677a) {
            this.f63226a = interfaceC23677a;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            if (exc == null) {
                exc = new IOException("sink was closed before emitter ended");
            }
            this.f63226a.mo82442g(exc);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m82520a(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
        int iM82494C;
        InterfaceC23680d interfaceC23680dMo82412I = null;
        while (!interfaceC19937p.isPaused() && (interfaceC23680dMo82412I = interfaceC19937p.mo82412I()) != null && (iM82494C = byteBufferList.m82494C()) > 0) {
            interfaceC23680dMo82412I.mo82444F(interfaceC19937p, byteBufferList);
            if (iM82494C == byteBufferList.m82494C() && interfaceC23680dMo82412I == interfaceC19937p.mo82412I() && !interfaceC19937p.isPaused()) {
                System.out.println("handler: " + interfaceC23680dMo82412I);
                byteBufferList.m82493B();
                if (!f63197a) {
                    throw new RuntimeException("mDataHandler failed to consume data, yet remains the mDataHandler.");
                }
                return;
            }
        }
        if (byteBufferList.m82494C() == 0 || interfaceC19937p.isPaused()) {
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("handler: " + interfaceC23680dMo82412I);
        printStream.println("emitter: " + interfaceC19937p);
        byteBufferList.m82493B();
    }

    /* JADX INFO: renamed from: b */
    public static void m82521b(InterfaceC23677a interfaceC23677a, Exception exc) {
        if (interfaceC23677a != null) {
            interfaceC23677a.mo82442g(exc);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m82522c(InterfaceC19937p interfaceC19937p, InterfaceC19940s interfaceC19940s, InterfaceC23677a interfaceC23677a) {
        interfaceC19937p.mo82426v(new f(interfaceC19940s));
        interfaceC19940s.mo82416i(new g(interfaceC19937p));
        h hVar = new h(interfaceC19937p, interfaceC19940s, interfaceC23677a);
        interfaceC19937p.mo82428x(hVar);
        interfaceC19940s.mo82422q(new i(hVar));
    }

    /* JADX INFO: renamed from: d */
    public static void m82523d(InputStream inputStream, long j11, InterfaceC19940s interfaceC19940s, InterfaceC23677a interfaceC23677a) {
        b bVar = new b(interfaceC23677a);
        c cVar = new c(interfaceC19940s, inputStream, j11, bVar);
        interfaceC19940s.mo82416i(cVar);
        interfaceC19940s.mo82422q(bVar);
        cVar.mo82443a();
    }

    /* JADX INFO: renamed from: e */
    public static void m82524e(InputStream inputStream, long j11, InterfaceC19940s interfaceC19940s, InterfaceC23677a interfaceC23677a, InterfaceC23681e interfaceC23681e) {
        d dVar = new d(interfaceC23677a);
        e eVar = new e(interfaceC19940s, inputStream, j11, dVar, interfaceC23681e);
        interfaceC19940s.mo82416i(eVar);
        interfaceC19940s.mo82422q(dVar);
        eVar.mo82443a();
    }

    /* JADX INFO: renamed from: f */
    public static void m82525f(InputStream inputStream, InterfaceC19940s interfaceC19940s, InterfaceC23677a interfaceC23677a) {
        m82523d(inputStream, 2147483647L, interfaceC19940s, interfaceC23677a);
    }

    /* JADX INFO: renamed from: g */
    public static void m82526g(InterfaceC19940s interfaceC19940s, ByteBufferList byteBufferList, InterfaceC23677a interfaceC23677a) {
        a aVar = new a(interfaceC19940s, byteBufferList, interfaceC23677a);
        interfaceC19940s.mo82416i(aVar);
        aVar.mo82443a();
    }

    /* JADX INFO: renamed from: h */
    public static void m82527h(InterfaceC19940s interfaceC19940s, byte[] bArr, InterfaceC23677a interfaceC23677a) {
        ByteBuffer byteBufferM82491t = ByteBufferList.m82491t(bArr.length);
        byteBufferM82491t.put(bArr);
        byteBufferM82491t.flip();
        ByteBufferList byteBufferList = new ByteBufferList();
        byteBufferList.m82498a(byteBufferM82491t);
        m82526g(interfaceC19940s, byteBufferList, interfaceC23677a);
    }
}
