package com.transsion.transfer.androidasync.util;

import com.transsion.transfer.androidasync.ByteBufferList;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.util.a */
/* JADX INFO: loaded from: classes6.dex */
public class C19950a {

    /* JADX INFO: renamed from: b */
    int f63589b = 0;

    /* JADX INFO: renamed from: c */
    int f63590c = 4096;

    /* JADX INFO: renamed from: a */
    final int f63588a = ByteBufferList.f63188f;

    /* JADX INFO: renamed from: a */
    public ByteBuffer m82889a() {
        return m82890b(this.f63589b);
    }

    /* JADX INFO: renamed from: b */
    public ByteBuffer m82890b(int i11) {
        return ByteBufferList.m82491t(Math.min(Math.max(i11, this.f63590c), this.f63588a));
    }

    /* JADX INFO: renamed from: c */
    public int m82891c() {
        return this.f63590c;
    }

    /* JADX INFO: renamed from: d */
    public C19950a m82892d(int i11) {
        this.f63590c = Math.max(0, i11);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m82893e(long j11) {
        this.f63589b = ((int) j11) * 2;
    }
}
