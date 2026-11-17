package com.transsion.postdetail.shorttv.factory;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import p016ak.C0117a;
import p016ak.InterfaceC0119c;
import p848vs.InterfaceC28210a;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv.factory.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C16898m implements InterfaceC28210a {

    /* JADX INFO: renamed from: a */
    private final Lazy f56784a = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.shorttv.factory.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C16898m.m73721e();
        }
    });

    /* JADX INFO: renamed from: d */
    private final InterfaceC0119c m73720d() {
        return (InterfaceC0119c) this.f56784a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC0119c m73721e() {
        return (InterfaceC0119c) C0117a.f402a.m550a(InterfaceC0119c.class);
    }

    @Override // p848vs.InterfaceC28210a
    /* JADX INFO: renamed from: a */
    public void mo73722a(long j11) {
        InterfaceC0119c interfaceC0119cM73720d = m73720d();
        if (interfaceC0119cM73720d != null) {
            interfaceC0119cM73720d.mo556a(j11);
        }
    }

    @Override // p848vs.InterfaceC28210a
    /* JADX INFO: renamed from: b */
    public void mo73723b(long j11) {
        InterfaceC0119c interfaceC0119cM73720d = m73720d();
        if (interfaceC0119cM73720d != null) {
            interfaceC0119cM73720d.mo557b(j11);
        }
    }
}
