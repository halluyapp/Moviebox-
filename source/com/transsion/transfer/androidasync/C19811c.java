package com.transsion.transfer.androidasync;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.c */
/* JADX INFO: loaded from: classes6.dex */
public class C19811c {

    /* JADX INFO: renamed from: a */
    Semaphore f63227a = new Semaphore(0);

    /* JADX INFO: renamed from: a */
    public void m82530a() {
        ThreadQueue orCreateThreadQueue = ThreadQueue.getOrCreateThreadQueue(Thread.currentThread());
        C19811c c19811c = orCreateThreadQueue.waiter;
        orCreateThreadQueue.waiter = this;
        Semaphore semaphore = orCreateThreadQueue.queueSemaphore;
        try {
            if (this.f63227a.tryAcquire()) {
                return;
            }
            while (true) {
                Runnable runnableRemove = orCreateThreadQueue.remove();
                if (runnableRemove == null) {
                    semaphore.acquire(Math.max(1, semaphore.availablePermits()));
                    if (this.f63227a.tryAcquire()) {
                        return;
                    }
                } else {
                    runnableRemove.run();
                }
            }
        } finally {
            orCreateThreadQueue.waiter = c19811c;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82531b() {
        this.f63227a.release();
        ThreadQueue.release(this);
    }

    /* JADX INFO: renamed from: c */
    public boolean m82532c(long j11, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j11, timeUnit);
        ThreadQueue orCreateThreadQueue = ThreadQueue.getOrCreateThreadQueue(Thread.currentThread());
        C19811c c19811c = orCreateThreadQueue.waiter;
        orCreateThreadQueue.waiter = this;
        Semaphore semaphore = orCreateThreadQueue.queueSemaphore;
        try {
            if (this.f63227a.tryAcquire()) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (true) {
                Runnable runnableRemove = orCreateThreadQueue.remove();
                if (runnableRemove != null) {
                    runnableRemove.run();
                } else {
                    if (!semaphore.tryAcquire(Math.max(1, semaphore.availablePermits()), jConvert, TimeUnit.MILLISECONDS)) {
                        return false;
                    }
                    if (this.f63227a.tryAcquire()) {
                        return true;
                    }
                    if (System.currentTimeMillis() - jCurrentTimeMillis >= jConvert) {
                        return false;
                    }
                }
            }
        } finally {
            orCreateThreadQueue.waiter = c19811c;
        }
    }
}
