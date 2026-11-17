package com.transsion.player.shorttv.preload;

import androidx.media3.common.C3331t;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.AbstractC3334a;
import androidx.media3.common.util.AbstractC3336a1;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.datasource.cache.C3415a;
import androidx.media3.datasource.cache.C3423i;
import androidx.media3.exoplayer.offline.InterfaceC3802o;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p857w1.C28258h;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoProgressiveDownloader implements InterfaceC3802o {

    /* JADX INFO: renamed from: a */
    private final Executor f55993a;

    /* JADX INFO: renamed from: b */
    private final C28258h f55994b;

    /* JADX INFO: renamed from: c */
    private final C3415a f55995c;

    /* JADX INFO: renamed from: d */
    private final C3423i f55996d;

    /* JADX INFO: renamed from: e */
    private final PriorityTaskManager f55997e;

    /* JADX INFO: renamed from: f */
    private InterfaceC3802o.a f55998f;

    /* JADX INFO: renamed from: g */
    private volatile RunnableFutureTask f55999g;

    /* JADX INFO: renamed from: h */
    private volatile boolean f56000h;

    public VideoProgressiveDownloader(C3331t c3331t, C3415a.c cVar, Executor executor) {
        this.f55993a = (Executor) AbstractC3334a.m15629e(executor);
        AbstractC3334a.m15629e(c3331t.f10705b);
        C28258h c28258hM109471a = new C28258h.b().m109479i(c3331t.f10705b.f10797a).m109476f(c3331t.f10705b.f10801e).m109472b(4).m109471a();
        this.f55994b = c28258hM109471a;
        C3415a c3415aM16310c = cVar.m16310c();
        this.f55995c = c3415aM16310c;
        this.f55996d = new C3423i(c3415aM16310c, c28258hM109471a, null, new C3423i.a() { // from class: com.transsion.player.shorttv.preload.r
            @Override // androidx.media3.datasource.cache.C3423i.a
            /* JADX INFO: renamed from: a */
            public final void mo16339a(long j11, long j12, long j13) {
                this.f56040a.m72539d(j11, j12, j13);
            }
        });
        this.f55997e = cVar.m16314h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m72539d(long j11, long j12, long j13) {
        InterfaceC3802o.a aVar = this.f55998f;
        if (aVar == null) {
            return;
        }
        aVar.onProgress(j11, j12, (j11 == -1 || j11 == 0) ? -1.0f : (j12 * 100.0f) / j11);
    }

    @Override // androidx.media3.exoplayer.offline.InterfaceC3802o
    /* JADX INFO: renamed from: a */
    public void mo18385a(InterfaceC3802o.a aVar) {
        this.f55998f = aVar;
        PriorityTaskManager priorityTaskManager = this.f55997e;
        if (priorityTaskManager != null) {
            priorityTaskManager.m15132a(-4000);
        }
        boolean z11 = false;
        while (!z11) {
            try {
                if (this.f56000h) {
                    break;
                }
                this.f55999g = new RunnableFutureTask<Void, IOException>() { // from class: com.transsion.player.shorttv.preload.VideoProgressiveDownloader.1
                    @Override // androidx.media3.common.util.RunnableFutureTask
                    protected void cancelWork() {
                        VideoProgressiveDownloader.this.f55996d.m16338b();
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // androidx.media3.common.util.RunnableFutureTask
                    public Void doWork() throws IOException {
                        VideoProgressiveDownloader.this.f55996d.m16337a();
                        return null;
                    }
                };
                PriorityTaskManager priorityTaskManager2 = this.f55997e;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.m15133b(-4000);
                }
                this.f55993a.execute(this.f55999g);
                try {
                    this.f55999g.get();
                    z11 = true;
                } catch (ExecutionException e11) {
                    Throwable th2 = (Throwable) AbstractC3334a.m15629e(e11.getCause());
                    if (!(th2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        AbstractC3336a1.m15726m1(th2);
                    }
                }
            } catch (Throwable th3) {
                ((RunnableFutureTask) AbstractC3334a.m15629e(this.f55999g)).blockUntilFinished();
                PriorityTaskManager priorityTaskManager3 = this.f55997e;
                if (priorityTaskManager3 != null) {
                    priorityTaskManager3.m15135d(-4000);
                }
                throw th3;
            }
        }
        ((RunnableFutureTask) AbstractC3334a.m15629e(this.f55999g)).blockUntilFinished();
        PriorityTaskManager priorityTaskManager4 = this.f55997e;
        if (priorityTaskManager4 != null) {
            priorityTaskManager4.m15135d(-4000);
        }
    }

    @Override // androidx.media3.exoplayer.offline.InterfaceC3802o
    public void cancel() {
        this.f56000h = true;
        RunnableFutureTask runnableFutureTask = this.f55999g;
        if (runnableFutureTask != null) {
            runnableFutureTask.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.InterfaceC3802o
    public void remove() {
    }
}
