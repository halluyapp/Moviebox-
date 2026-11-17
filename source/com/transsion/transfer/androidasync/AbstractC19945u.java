package com.transsion.transfer.androidasync;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.u */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19945u extends C19935n {
    public AbstractC19945u(InterfaceC19940s interfaceC19940s) {
        super(interfaceC19940s);
        m82873o(0);
    }

    @Override // com.transsion.transfer.androidasync.C19935n
    /* JADX INFO: renamed from: k */
    protected void mo82870k(ByteBufferList byteBufferList) {
        ByteBufferList byteBufferListMo82884s = mo82884s(byteBufferList);
        if (byteBufferListMo82884s != byteBufferList) {
            byteBufferList.m82493B();
            byteBufferListMo82884s.m82502f(byteBufferList);
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract ByteBufferList mo82884s(ByteBufferList byteBufferList);
}
