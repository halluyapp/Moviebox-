package com.transsion.transfer.androidasync;

import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.z */
/* JADX INFO: loaded from: classes6.dex */
class C19959z extends AbstractC19936o {

    /* JADX INFO: renamed from: b */
    SocketChannel f63628b;

    C19959z(SocketChannel socketChannel) {
        super(socketChannel);
        this.f63628b = socketChannel;
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19936o
    /* JADX INFO: renamed from: h */
    public boolean mo82875h() {
        return this.f63628b.isConnected();
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19936o
    /* JADX INFO: renamed from: i */
    public SelectionKey mo82876i(Selector selector) {
        return m82877j(selector, 8);
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19936o
    /* JADX INFO: renamed from: k */
    public void mo82878k() {
        try {
            this.f63628b.socket().shutdownOutput();
        } catch (Exception unused) {
        }
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19936o
    /* JADX INFO: renamed from: l */
    public int mo82879l(ByteBuffer[] byteBufferArr) {
        return (int) this.f63628b.write(byteBufferArr);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f63628b.read(byteBuffer);
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] byteBufferArr) {
        return this.f63628b.read(byteBufferArr);
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] byteBufferArr, int i11, int i12) {
        return this.f63628b.read(byteBufferArr, i11, i12);
    }
}
