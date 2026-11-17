package com.transsion.transfer.androidasync;

import android.support.v4.media.session.AbstractC0190c;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncDatagramSocket extends AsyncNetworkSocket {
    /* JADX INFO: renamed from: F */
    public void m82407F(final String str, final int i11, final ByteBuffer byteBuffer) {
        if (mo82413a().m82481o() != Thread.currentThread()) {
            mo82413a().m82474H(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncDatagramSocket.1
                @Override // java.lang.Runnable
                public void run() {
                    AsyncDatagramSocket.this.m82407F(str, i11, byteBuffer);
                }
            });
        } else {
            try {
                AbstractC0190c.m883a(m82418k());
                throw null;
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m82408H(final InetSocketAddress inetSocketAddress, final ByteBuffer byteBuffer) {
        if (mo82413a().m82481o() != Thread.currentThread()) {
            mo82413a().m82474H(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncDatagramSocket.2
                @Override // java.lang.Runnable
                public void run() {
                    AsyncDatagramSocket.this.m82408H(inetSocketAddress, byteBuffer);
                }
            });
        } else {
            try {
                AbstractC0190c.m883a(m82418k());
                throw null;
            } catch (IOException unused) {
            }
        }
    }
}
