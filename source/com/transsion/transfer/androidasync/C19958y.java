package com.transsion.transfer.androidasync;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.y */
/* JADX INFO: loaded from: classes6.dex */
class C19958y extends AbstractC19936o {

    /* JADX INFO: renamed from: b */
    ServerSocketChannel f63627b;

    C19958y(ServerSocketChannel serverSocketChannel) {
        super(serverSocketChannel);
        this.f63627b = serverSocketChannel;
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19936o
    /* JADX INFO: renamed from: h */
    public boolean mo82875h() {
        return false;
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19936o
    /* JADX INFO: renamed from: i */
    public SelectionKey mo82876i(Selector selector) {
        return this.f63627b.register(selector, 16);
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19936o
    /* JADX INFO: renamed from: k */
    public void mo82878k() {
    }

    @Override // com.transsion.transfer.androidasync.AbstractC19936o
    /* JADX INFO: renamed from: l */
    public int mo82879l(ByteBuffer[] byteBufferArr) throws IOException {
        throw new IOException("Can't write ServerSocketChannel");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        throw new IOException("Can't read ServerSocketChannel");
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] byteBufferArr) throws IOException {
        throw new IOException("Can't read ServerSocketChannel");
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] byteBufferArr, int i11, int i12) throws IOException {
        throw new IOException("Can't read ServerSocketChannel");
    }
}
