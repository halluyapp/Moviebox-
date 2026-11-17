package com.transsion.transfer.androidasync;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.Selector;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.x */
/* JADX INFO: loaded from: classes6.dex */
class C19957x implements Closeable {

    /* JADX INFO: renamed from: a */
    private Selector f63624a;

    /* JADX INFO: renamed from: b */
    public AtomicBoolean f63625b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    Semaphore f63626c = new Semaphore(0);

    public C19957x(Selector selector) {
        this.f63624a = selector;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63624a.close();
    }

    /* JADX INFO: renamed from: d */
    public Selector m82906d() {
        return this.f63624a;
    }

    /* JADX INFO: renamed from: h */
    public Set m82907h() {
        return this.f63624a.keys();
    }

    public boolean isOpen() {
        return this.f63624a.isOpen();
    }

    /* JADX INFO: renamed from: k */
    public void m82908k() {
        m82909l(0L);
    }

    /* JADX INFO: renamed from: l */
    public void m82909l(long j11) {
        try {
            this.f63626c.drainPermits();
            this.f63624a.select(j11);
        } finally {
            this.f63626c.release(Integer.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: m */
    public int m82910m() {
        return this.f63624a.selectNow();
    }

    /* JADX INFO: renamed from: n */
    public Set m82911n() {
        return this.f63624a.selectedKeys();
    }

    /* JADX INFO: renamed from: o */
    public boolean m82912o() {
        for (int i11 = 0; i11 < 100; i11++) {
            try {
                this.f63626c.tryAcquire(10L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m82913p() {
        boolean zTryAcquire = this.f63626c.tryAcquire();
        this.f63624a.wakeup();
        if (zTryAcquire) {
            if (this.f63625b.getAndSet(true)) {
                this.f63624a.wakeup();
                return;
            }
            try {
                m82912o();
                this.f63624a.wakeup();
            } finally {
                this.f63625b.set(false);
            }
        }
    }
}
