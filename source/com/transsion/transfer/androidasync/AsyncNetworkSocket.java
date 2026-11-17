package com.transsion.transfer.androidasync;

import android.util.Log;
import com.transsion.transfer.androidasync.util.C19950a;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;
import p439gv.InterfaceC23686j;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncNetworkSocket implements InterfaceC19931j {

    /* JADX INFO: renamed from: a */
    InetSocketAddress f63115a;

    /* JADX INFO: renamed from: b */
    private AbstractC19936o f63116b;

    /* JADX INFO: renamed from: c */
    private SelectionKey f63117c;

    /* JADX INFO: renamed from: d */
    private AsyncServer f63118d;

    /* JADX INFO: renamed from: f */
    C19950a f63120f;

    /* JADX INFO: renamed from: g */
    boolean f63121g;

    /* JADX INFO: renamed from: h */
    InterfaceC23686j f63122h;

    /* JADX INFO: renamed from: i */
    InterfaceC23680d f63123i;

    /* JADX INFO: renamed from: j */
    InterfaceC23677a f63124j;

    /* JADX INFO: renamed from: k */
    boolean f63125k;

    /* JADX INFO: renamed from: l */
    Exception f63126l;

    /* JADX INFO: renamed from: m */
    private InterfaceC23677a f63127m;

    /* JADX INFO: renamed from: e */
    private ByteBufferList f63119e = new ByteBufferList();

    /* JADX INFO: renamed from: n */
    boolean f63128n = false;

    AsyncNetworkSocket() {
    }

    /* JADX INFO: renamed from: E */
    private void m82409E() {
        if (this.f63119e.m82513r()) {
            C19809a0.m82520a(this, this.f63119e);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m82410g() {
        this.f63117c.cancel();
        try {
            this.f63116b.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    private void m82411l(int i11) throws IOException {
        if (!this.f63117c.isValid()) {
            throw new IOException(new CancelledKeyException());
        }
        if (i11 > 0) {
            SelectionKey selectionKey = this.f63117c;
            selectionKey.interestOps(selectionKey.interestOps() | 4);
        } else {
            SelectionKey selectionKey2 = this.f63117c;
            selectionKey2.interestOps(selectionKey2.interestOps() & (-5));
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: I */
    public InterfaceC23680d mo82412I() {
        return this.f63123i;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19931j, com.transsion.transfer.androidasync.InterfaceC19937p, com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: a */
    public AsyncServer mo82413a() {
        return this.f63118d;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void close() {
        m82410g();
        m82423r(null);
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: d */
    public void mo82414d() {
        this.f63116b.mo82878k();
    }

    /* JADX INFO: renamed from: f */
    void m82415f(SocketChannel socketChannel, InetSocketAddress inetSocketAddress) {
        this.f63115a = inetSocketAddress;
        this.f63120f = new C19950a();
        this.f63116b = new C19959z(socketChannel);
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: i */
    public void mo82416i(InterfaceC23686j interfaceC23686j) {
        this.f63122h = interfaceC23686j;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    public boolean isOpen() {
        return this.f63116b.mo82875h() && this.f63117c.isValid();
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public boolean isPaused() {
        return this.f63128n;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: j */
    public InterfaceC23686j mo82417j() {
        return this.f63122h;
    }

    /* JADX INFO: renamed from: k */
    AbstractC19936o m82418k() {
        return this.f63116b;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: m */
    public void mo82419m(final ByteBufferList byteBufferList) {
        if (this.f63118d.m82481o() != Thread.currentThread()) {
            this.f63118d.m82474H(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncNetworkSocket.1
                @Override // java.lang.Runnable
                public void run() {
                    AsyncNetworkSocket.this.mo82419m(byteBufferList);
                }
            });
            return;
        }
        if (this.f63116b.mo82875h()) {
            try {
                int iM82494C = byteBufferList.m82494C();
                ByteBuffer[] byteBufferArrM82507k = byteBufferList.m82507k();
                this.f63116b.mo82879l(byteBufferArrM82507k);
                byteBufferList.m82499b(byteBufferArrM82507k);
                m82411l(byteBufferList.m82494C());
                this.f63118d.m82471C(iM82494C - byteBufferList.m82494C());
            } catch (IOException e11) {
                m82410g();
                m82427w(e11);
                m82423r(e11);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m82420n() {
        if (!this.f63116b.m82874d()) {
            SelectionKey selectionKey = this.f63117c;
            selectionKey.interestOps(selectionKey.interestOps() & (-5));
        }
        InterfaceC23686j interfaceC23686j = this.f63122h;
        if (interfaceC23686j != null) {
            interfaceC23686j.mo82443a();
        }
    }

    /* JADX INFO: renamed from: o */
    int m82421o() {
        long j11;
        int i11;
        m82409E();
        boolean z11 = false;
        if (this.f63128n) {
            return 0;
        }
        ByteBuffer byteBufferM82889a = this.f63120f.m82889a();
        try {
            j11 = this.f63116b.read(byteBufferM82889a);
        } catch (Exception e11) {
            m82410g();
            m82427w(e11);
            m82423r(e11);
            j11 = -1;
        }
        if (j11 < 0) {
            m82410g();
            i11 = 0;
            z11 = true;
        } else {
            i11 = (int) (((long) 0) + j11);
        }
        if (j11 > 0) {
            this.f63120f.m82893e(j11);
            byteBufferM82889a.flip();
            this.f63119e.m82498a(byteBufferM82889a);
            C19809a0.m82520a(this, this.f63119e);
        } else {
            ByteBufferList.m82488A(byteBufferM82889a);
        }
        if (z11) {
            m82427w(null);
            m82423r(null);
        }
        return i11;
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void pause() {
        if (this.f63118d.m82481o() != Thread.currentThread()) {
            this.f63118d.m82474H(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncNetworkSocket.2
                @Override // java.lang.Runnable
                public void run() {
                    AsyncNetworkSocket.this.pause();
                }
            });
        } else {
            if (this.f63128n) {
                return;
            }
            this.f63128n = true;
            try {
                SelectionKey selectionKey = this.f63117c;
                selectionKey.interestOps(selectionKey.interestOps() & (-2));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19940s
    /* JADX INFO: renamed from: q */
    public void mo82422q(InterfaceC23677a interfaceC23677a) {
        this.f63124j = interfaceC23677a;
    }

    /* JADX INFO: renamed from: r */
    protected void m82423r(Exception exc) {
        if (this.f63121g) {
            return;
        }
        this.f63121g = true;
        InterfaceC23677a interfaceC23677a = this.f63124j;
        if (interfaceC23677a != null) {
            interfaceC23677a.mo82442g(exc);
            this.f63124j = null;
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    public void resume() {
        if (this.f63118d.m82481o() != Thread.currentThread()) {
            this.f63118d.m82474H(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncNetworkSocket.3
                @Override // java.lang.Runnable
                public void run() {
                    AsyncNetworkSocket.this.resume();
                }
            });
            return;
        }
        if (this.f63128n) {
            this.f63128n = false;
            try {
                SelectionKey selectionKey = this.f63117c;
                selectionKey.interestOps(selectionKey.interestOps() | 1);
            } catch (Exception unused) {
            }
            m82409E();
            if (isOpen()) {
                return;
            }
            m82427w(this.f63126l);
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: s */
    public String mo82424s() {
        return null;
    }

    /* JADX INFO: renamed from: t */
    void m82425t(Exception exc) {
        if (this.f63125k) {
            return;
        }
        this.f63125k = true;
        InterfaceC23677a interfaceC23677a = this.f63127m;
        if (interfaceC23677a != null) {
            interfaceC23677a.mo82442g(exc);
        } else if (exc != null) {
            Log.e("NIO", "Unhandled exception", exc);
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: v */
    public void mo82426v(InterfaceC23680d interfaceC23680d) {
        this.f63123i = interfaceC23680d;
    }

    /* JADX INFO: renamed from: w */
    void m82427w(Exception exc) {
        if (this.f63119e.m82513r()) {
            this.f63126l = exc;
        } else {
            m82425t(exc);
        }
    }

    @Override // com.transsion.transfer.androidasync.InterfaceC19937p
    /* JADX INFO: renamed from: x */
    public void mo82428x(InterfaceC23677a interfaceC23677a) {
        this.f63127m = interfaceC23677a;
    }

    /* JADX INFO: renamed from: y */
    void m82429y(AsyncServer asyncServer, SelectionKey selectionKey) {
        this.f63118d = asyncServer;
        this.f63117c = selectionKey;
    }
}
