package com.transsion.transfer.androidasync;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p439gv.InterfaceC23680d;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.v */
/* JADX INFO: loaded from: classes6.dex */
public class C19955v implements InterfaceC23680d {

    /* JADX INFO: renamed from: a */
    Charset f63595a;

    /* JADX INFO: renamed from: b */
    ByteBufferList f63596b;

    /* JADX INFO: renamed from: c */
    a f63597c;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.v$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo82767a(String str);
    }

    public C19955v() {
        this(null);
    }

    public C19955v(Charset charset) {
        this.f63596b = new ByteBufferList();
        this.f63595a = charset;
    }

    @Override // p439gv.InterfaceC23680d
    /* JADX INFO: renamed from: F */
    public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferList.m82494C());
        while (byteBufferList.m82494C() > 0) {
            byte bM82501e = byteBufferList.m82501e();
            if (bM82501e == 10) {
                byteBufferAllocate.flip();
                this.f63596b.m82498a(byteBufferAllocate);
                this.f63597c.mo82767a(this.f63596b.m82519z(this.f63595a));
                this.f63596b = new ByteBufferList();
                return;
            }
            byteBufferAllocate.put(bM82501e);
        }
        byteBufferAllocate.flip();
        this.f63596b.m82498a(byteBufferAllocate);
    }

    /* JADX INFO: renamed from: a */
    public void m82897a(a aVar) {
        this.f63597c = aVar;
    }
}
