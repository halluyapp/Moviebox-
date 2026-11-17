package com.transsion.postdetail.shorttv_pugc.factory;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import p016ak.C0117a;
import p016ak.InterfaceC0119c;
import p920xt.InterfaceC28656a;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv_pugc.factory.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C16949j implements InterfaceC28656a {

    /* JADX INFO: renamed from: a */
    private final Lazy f56870a = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.shorttv_pugc.factory.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C16949j.m73819d();
        }
    });

    /* JADX INFO: renamed from: c */
    private final InterfaceC0119c m73818c() {
        return (InterfaceC0119c) this.f56870a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC0119c m73819d() {
        return (InterfaceC0119c) C0117a.f402a.m550a(InterfaceC0119c.class);
    }

    @Override // p920xt.InterfaceC28656a
    /* JADX INFO: renamed from: a */
    public void mo73820a(long j11) {
        InterfaceC0119c interfaceC0119cM73818c = m73818c();
        if (interfaceC0119cM73818c != null) {
            interfaceC0119cM73818c.mo556a(j11);
        }
    }
}
