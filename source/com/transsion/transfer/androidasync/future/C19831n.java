package com.transsion.transfer.androidasync.future;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.future.n */
/* JADX INFO: loaded from: classes6.dex */
public class C19831n implements InterfaceC19819b {
    boolean cancelled;
    boolean complete;
    private InterfaceC19818a parent;
    public static final InterfaceC19818a COMPLETED = new a();
    public static final InterfaceC19818a CANCELLED = new b();

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.future.n$a */
    class a extends C19831n {
        a() {
            setComplete();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.future.n$b */
    class b extends C19831n {
        b() {
            cancel();
        }
    }

    @Override // com.transsion.transfer.androidasync.future.InterfaceC19818a
    public boolean cancel() {
        synchronized (this) {
            try {
                if (this.complete) {
                    return false;
                }
                if (this.cancelled) {
                    return true;
                }
                this.cancelled = true;
                InterfaceC19818a interfaceC19818a = this.parent;
                this.parent = null;
                if (interfaceC19818a != null) {
                    interfaceC19818a.cancel();
                }
                cancelCleanup();
                cleanup();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void cancelCleanup() {
    }

    protected void cleanup() {
    }

    protected void completeCleanup() {
    }

    @Override // com.transsion.transfer.androidasync.future.InterfaceC19818a
    public boolean isCancelled() {
        boolean z11;
        InterfaceC19818a interfaceC19818a;
        synchronized (this) {
            try {
                z11 = this.cancelled || ((interfaceC19818a = this.parent) != null && interfaceC19818a.isCancelled());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public boolean isDone() {
        return this.complete;
    }

    public InterfaceC19818a reset() {
        cancel();
        this.complete = false;
        this.cancelled = false;
        return this;
    }

    public boolean setComplete() {
        synchronized (this) {
            try {
                if (this.cancelled) {
                    return false;
                }
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.parent = null;
                completeCleanup();
                cleanup();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.transsion.transfer.androidasync.future.InterfaceC19819b
    public boolean setParent(InterfaceC19818a interfaceC19818a) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.parent = interfaceC19818a;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
