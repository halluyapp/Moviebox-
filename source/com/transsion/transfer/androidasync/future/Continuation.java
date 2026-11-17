package com.transsion.transfer.androidasync.future;

import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import p439gv.InterfaceC23677a;
import p439gv.InterfaceC23679c;

/* JADX INFO: loaded from: classes6.dex */
public class Continuation extends C19831n implements InterfaceC23679c, Runnable, InterfaceC19818a {
    InterfaceC23677a callback;
    Runnable cancelCallback;
    private boolean inNext;
    LinkedList<InterfaceC23679c> mCallbacks;
    boolean started;
    private boolean waiting;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.future.Continuation$a */
    class C19816a implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        boolean f63232a;

        C19816a() {
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            if (this.f63232a) {
                return;
            }
            this.f63232a = true;
            Continuation.this.waiting = false;
            if (exc == null) {
                Continuation.this.next();
            } else {
                Continuation.this.reportCompleted(exc);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.future.Continuation$b */
    class C19817b implements InterfaceC23679c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC19820c f63234a;

        C19817b(InterfaceC19820c interfaceC19820c) {
            this.f63234a = interfaceC19820c;
        }

        @Override // p439gv.InterfaceC23679c
        public void onContinue(Continuation continuation, InterfaceC23677a interfaceC23677a) throws ExecutionException, InterruptedException {
            this.f63234a.get();
            interfaceC23677a.mo82442g(null);
        }
    }

    public Continuation() {
        this(null);
    }

    public Continuation(InterfaceC23677a interfaceC23677a) {
        this(interfaceC23677a, null);
    }

    public Continuation(InterfaceC23677a interfaceC23677a, Runnable runnable) {
        this.mCallbacks = new LinkedList<>();
        this.cancelCallback = runnable;
        this.callback = interfaceC23677a;
    }

    private InterfaceC23679c hook(InterfaceC23679c interfaceC23679c) {
        if (interfaceC23679c instanceof InterfaceC19819b) {
            ((InterfaceC19819b) interfaceC23679c).setParent(this);
        }
        return interfaceC23679c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void next() {
        if (this.inNext) {
            return;
        }
        while (this.mCallbacks.size() > 0 && !this.waiting && !isDone() && !isCancelled()) {
            InterfaceC23679c interfaceC23679cRemove = this.mCallbacks.remove();
            try {
                try {
                    this.inNext = true;
                    this.waiting = true;
                    interfaceC23679cRemove.onContinue(this, wrap());
                } catch (Exception e11) {
                    reportCompleted(e11);
                }
                this.inNext = false;
            } catch (Throwable th2) {
                this.inNext = false;
                throw th2;
            }
        }
        if (this.waiting || isDone() || isCancelled()) {
            return;
        }
        reportCompleted(null);
    }

    private InterfaceC23677a wrap() {
        return new C19816a();
    }

    public Continuation add(InterfaceC19820c interfaceC19820c) {
        interfaceC19820c.setParent(this);
        add(new C19817b(interfaceC19820c));
        return this;
    }

    public Continuation add(InterfaceC23679c interfaceC23679c) {
        this.mCallbacks.add(hook(interfaceC23679c));
        return this;
    }

    @Override // com.transsion.transfer.androidasync.future.C19831n, com.transsion.transfer.androidasync.future.InterfaceC19818a
    public boolean cancel() {
        if (!super.cancel()) {
            return false;
        }
        Runnable runnable = this.cancelCallback;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    public InterfaceC23677a getCallback() {
        return this.callback;
    }

    public Runnable getCancelCallback() {
        return this.cancelCallback;
    }

    public Continuation insert(InterfaceC23679c interfaceC23679c) {
        this.mCallbacks.add(0, hook(interfaceC23679c));
        return this;
    }

    @Override // p439gv.InterfaceC23679c
    public void onContinue(Continuation continuation, InterfaceC23677a interfaceC23677a) throws Exception {
        setCallback(interfaceC23677a);
        start();
    }

    void reportCompleted(Exception exc) {
        InterfaceC23677a interfaceC23677a;
        if (setComplete() && (interfaceC23677a = this.callback) != null) {
            interfaceC23677a.mo82442g(exc);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        start();
    }

    public void setCallback(InterfaceC23677a interfaceC23677a) {
        this.callback = interfaceC23677a;
    }

    public void setCancelCallback(final InterfaceC19818a interfaceC19818a) {
        if (interfaceC19818a == null) {
            this.cancelCallback = null;
        } else {
            this.cancelCallback = new Runnable() { // from class: com.transsion.transfer.androidasync.future.Continuation.1
                @Override // java.lang.Runnable
                public void run() {
                    interfaceC19818a.cancel();
                }
            };
        }
    }

    public void setCancelCallback(Runnable runnable) {
        this.cancelCallback = runnable;
    }

    public Continuation start() {
        if (this.started) {
            throw new IllegalStateException("already started");
        }
        this.started = true;
        next();
        return this;
    }
}
