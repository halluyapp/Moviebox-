package com.transsion.transfer.androidasync.stream;

import com.transsion.transfer.androidasync.ByteBufferList;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23680d;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.stream.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19943a implements InterfaceC23680d, InterfaceC23677a {

    /* JADX INFO: renamed from: a */
    private OutputStream f63575a;

    public AbstractC19943a(OutputStream outputStream) {
        this.f63575a = outputStream;
    }

    @Override // p439gv.InterfaceC23680d
    /* JADX INFO: renamed from: F */
    public void mo82444F(InterfaceC19937p interfaceC19937p, ByteBufferList byteBufferList) {
        while (byteBufferList.m82496E() > 0) {
            try {
                try {
                    ByteBuffer byteBufferM82495D = byteBufferList.m82495D();
                    this.f63575a.write(byteBufferM82495D.array(), byteBufferM82495D.arrayOffset() + byteBufferM82495D.position(), byteBufferM82495D.remaining());
                    ByteBufferList.m82488A(byteBufferM82495D);
                } catch (Exception e11) {
                    mo82442g(e11);
                }
            } catch (Throwable th2) {
                byteBufferList.m82493B();
                throw th2;
            }
        }
        byteBufferList.m82493B();
    }

    @Override // p439gv.InterfaceC23677a
    /* JADX INFO: renamed from: g */
    public void mo82442g(Exception exc) {
        exc.printStackTrace();
    }
}
