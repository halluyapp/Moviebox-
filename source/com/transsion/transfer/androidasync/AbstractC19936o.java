package com.transsion.transfer.androidasync;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelectableChannel;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.o */
/* JADX INFO: loaded from: classes6.dex */
abstract class AbstractC19936o implements ReadableByteChannel, ScatteringByteChannel {

    /* JADX INFO: renamed from: a */
    private AbstractSelectableChannel f63568a;

    AbstractC19936o(AbstractSelectableChannel abstractSelectableChannel) throws IOException {
        abstractSelectableChannel.configureBlocking(false);
        this.f63568a = abstractSelectableChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f63568a.close();
    }

    /* JADX INFO: renamed from: d */
    public boolean m82874d() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo82875h();

    /* JADX INFO: renamed from: i */
    public abstract SelectionKey mo82876i(Selector selector);

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f63568a.isOpen();
    }

    /* JADX INFO: renamed from: j */
    public SelectionKey m82877j(Selector selector, int i11) {
        return this.f63568a.register(selector, i11);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo82878k();

    /* JADX INFO: renamed from: l */
    public abstract int mo82879l(ByteBuffer[] byteBufferArr);
}
