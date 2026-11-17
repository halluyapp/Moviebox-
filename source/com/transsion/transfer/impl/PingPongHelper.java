package com.transsion.transfer.impl;

import com.cloud.tmc.kernel.constants.TmcConstants;
import com.transsion.transfer.androidasync.http.InterfaceC19875b0;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class PingPongHelper {

    /* JADX INFO: renamed from: a */
    private final String f63640a;

    /* JADX INFO: renamed from: b */
    private final boolean f63641b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC19875b0 f63642c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC19962a f63643d;

    /* JADX INFO: renamed from: e */
    private final Stack f63644e;

    /* JADX INFO: renamed from: f */
    private boolean f63645f;

    /* JADX INFO: renamed from: g */
    private int f63646g;

    /* JADX INFO: renamed from: h */
    private final int f63647h;

    /* JADX INFO: renamed from: i */
    private final Timer f63648i;

    /* JADX INFO: renamed from: j */
    private final PingPongHelper$task$1 f63649j;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.PingPongHelper$a */
    public interface InterfaceC19962a {
        /* JADX INFO: renamed from: a */
        void mo82963a(String str, InterfaceC19875b0 interfaceC19875b0);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.transsion.transfer.impl.PingPongHelper$task$1] */
    public PingPongHelper(String remoteIP, boolean z11, InterfaceC19875b0 socket, InterfaceC19962a pingPongListener) {
        Intrinsics.m97802h(remoteIP, "remoteIP");
        Intrinsics.m97802h(socket, "socket");
        Intrinsics.m97802h(pingPongListener, "pingPongListener");
        this.f63640a = remoteIP;
        this.f63641b = z11;
        this.f63642c = socket;
        this.f63643d = pingPongListener;
        this.f63644e = new Stack();
        this.f63647h = 2;
        socket.mo82696G(new InterfaceC19875b0.b() { // from class: com.transsion.transfer.impl.j
            @Override // com.transsion.transfer.androidasync.http.InterfaceC19875b0.b
            /* JADX INFO: renamed from: a */
            public final void mo82698a(String str) {
                PingPongHelper.m82949b(this.f63784a, str);
            }
        });
        this.f63648i = new Timer();
        this.f63649j = new TimerTask() { // from class: com.transsion.transfer.impl.PingPongHelper$task$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (this.this$0.f63646g >= this.this$0.f63647h) {
                    this.this$0.f63643d.mo82963a(this.this$0.f63640a, this.this$0.f63642c);
                    this.this$0.f63645f = true;
                }
                if (this.this$0.f63645f) {
                    return;
                }
                String strM82960m = this.this$0.m82960m();
                this.this$0.f63644e.push(strM82960m);
                this.this$0.f63642c.mo82695A(strM82960m);
                this.this$0.f63646g++;
                if (this.this$0.f63644e.size() > this.this$0.f63647h) {
                    this.this$0.f63644e.remove(0);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m82949b(PingPongHelper pingPongHelper, String str) {
        pingPongHelper.f63646g = 0;
        pingPongHelper.f63644e.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final String m82960m() {
        return (this.f63641b ? TmcConstants.CHANNEL_REQUEST_SERVER : "client") + "-" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: n */
    public final void m82961n() {
        this.f63648i.schedule(this.f63649j, 0L, 2000L);
    }

    /* JADX INFO: renamed from: o */
    public final void m82962o() {
        this.f63645f = true;
        cancel();
        this.f63648i.cancel();
    }
}
