package com.transsion.postdetail.layer;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class SystemTimeManager {

    /* JADX INFO: renamed from: a */
    private Handler f56400a;

    /* JADX INFO: renamed from: b */
    private InterfaceC16779a f56401b;

    /* JADX INFO: renamed from: c */
    private boolean f56402c;

    /* JADX INFO: renamed from: d */
    private final HandlerThread f56403d;

    /* JADX INFO: renamed from: e */
    private final Runnable f56404e;

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.SystemTimeManager$a */
    public interface InterfaceC16779a {
        /* JADX INFO: renamed from: a */
        long mo73100a();
    }

    public SystemTimeManager(InterfaceC16779a interfaceC16779a) {
        HandlerThread handlerThread = new HandlerThread("SystemTimeManager");
        this.f56403d = handlerThread;
        this.f56404e = new Runnable() { // from class: com.transsion.postdetail.layer.SystemTimeManager$mTrackingRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.f56401b == null) {
                    this.this$0.m73099e();
                    return;
                }
                SystemTimeManager.InterfaceC16779a interfaceC16779a2 = this.this$0.f56401b;
                Long lValueOf = interfaceC16779a2 != null ? Long.valueOf(interfaceC16779a2.mo73100a()) : null;
                if (lValueOf != null) {
                    if (lValueOf.longValue() <= 0) {
                        this.this$0.m73099e();
                        return;
                    }
                    Handler handler = this.this$0.f56400a;
                    if (handler != null) {
                        handler.postDelayed(this, lValueOf.longValue());
                    }
                }
            }
        };
        handlerThread.start();
        this.f56400a = new Handler(handlerThread.getLooper());
        this.f56401b = interfaceC16779a;
    }

    /* JADX INFO: renamed from: c */
    public final void m73097c() {
        m73099e();
        this.f56402c = false;
        Handler handler = this.f56400a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f56400a = null;
        this.f56401b = null;
        this.f56403d.quitSafely();
    }

    /* JADX INFO: renamed from: d */
    public final void m73098d() {
        if (this.f56402c) {
            return;
        }
        this.f56402c = true;
        Handler handler = this.f56400a;
        if (handler != null) {
            handler.removeCallbacks(this.f56404e);
        }
        Handler handler2 = this.f56400a;
        if (handler2 != null) {
            handler2.post(this.f56404e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m73099e() {
        if (this.f56402c) {
            this.f56402c = false;
            Handler handler = this.f56400a;
            if (handler != null) {
                handler.removeCallbacks(this.f56404e);
            }
        }
    }
}
