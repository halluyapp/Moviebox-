package com.transsion.transfer.androidasync.future;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.future.l */
/* JADX INFO: loaded from: classes6.dex */
public class C19829l {
    /* JADX INFO: renamed from: c */
    public static InterfaceFutureC19823f m82545c(Iterable iterable, InterfaceC19843z interfaceC19843z) {
        C19840w c19840w = new C19840w();
        m82547e(iterable.iterator(), interfaceC19843z, c19840w, null);
        return c19840w;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceFutureC19823f m82546d(Object[] objArr, InterfaceC19843z interfaceC19843z) {
        return m82545c(Arrays.asList(objArr), interfaceC19843z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m82547e(final Iterator it, final InterfaceC19843z interfaceC19843z, final C19840w c19840w, Exception e11) {
        while (it.hasNext()) {
            try {
                InterfaceFutureC19823f interfaceFutureC19823fThen = interfaceC19843z.then(it.next());
                Objects.requireNonNull(c19840w);
                interfaceFutureC19823fThen.mo82541j(new InterfaceC19841x() { // from class: com.transsion.transfer.androidasync.future.j
                    @Override // com.transsion.transfer.androidasync.future.InterfaceC19841x
                    /* JADX INFO: renamed from: a */
                    public final void mo82542a(Object obj) {
                        c19840w.m82577J(obj);
                    }
                }).mo82538e(new InterfaceC19821d() { // from class: com.transsion.transfer.androidasync.future.k
                    @Override // com.transsion.transfer.androidasync.future.InterfaceC19821d
                    /* JADX INFO: renamed from: a */
                    public final void mo82535a(Exception exc) {
                        C19829l.m82547e(it, interfaceC19843z, c19840w, exc);
                    }
                });
                return;
            } catch (Exception e12) {
                e11 = e12;
            }
        }
        if (e11 == null) {
            c19840w.m82575G(new Exception("empty list"));
        } else {
            c19840w.m82575G(e11);
        }
    }
}
