package com.transsion.transfer.androidasync.http;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.Field;
import java.util.Hashtable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.z */
/* JADX INFO: loaded from: classes6.dex */
public class C19929z implements InterfaceC19895m {

    /* JADX INFO: renamed from: a */
    Hashtable f63553a = new Hashtable();

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.z$a */
    private static class a implements InterfaceC19895m {

        /* JADX INFO: renamed from: a */
        Field f63554a;

        /* JADX INFO: renamed from: b */
        Field f63555b;

        /* JADX INFO: renamed from: c */
        Field f63556c;

        /* JADX INFO: renamed from: d */
        Field f63557d;

        /* JADX INFO: renamed from: e */
        boolean f63558e;

        public a(Class cls) {
            try {
                Field declaredField = cls.getSuperclass().getDeclaredField("peerHost");
                this.f63554a = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getSuperclass().getDeclaredField("peerPort");
                this.f63555b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("sslParameters");
                this.f63556c = declaredField3;
                declaredField3.setAccessible(true);
                Field declaredField4 = this.f63556c.getType().getDeclaredField("useSni");
                this.f63557d = declaredField4;
                declaredField4.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }

        @Override // com.transsion.transfer.androidasync.http.InterfaceC19895m
        /* JADX INFO: renamed from: a */
        public SSLEngine mo82759a(SSLContext sSLContext, String str, int i11) {
            return null;
        }

        @Override // com.transsion.transfer.androidasync.http.InterfaceC19895m
        /* JADX INFO: renamed from: b */
        public void mo82760b(SSLEngine sSLEngine, InterfaceC19889g.a aVar, String str, int i11) {
            if (this.f63557d == null || this.f63558e) {
                return;
            }
            try {
                this.f63554a.set(sSLEngine, str);
                this.f63555b.set(sSLEngine, Integer.valueOf(i11));
                this.f63557d.set(this.f63556c.get(sSLEngine), Boolean.TRUE);
            } catch (IllegalAccessException unused) {
            }
        }
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19895m
    /* JADX INFO: renamed from: a */
    public SSLEngine mo82759a(SSLContext sSLContext, String str, int i11) {
        ProviderInstaller.PROVIDER_NAME.equals(sSLContext.getProvider().getName());
        return sSLContext.createSSLEngine(str, i11);
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19895m
    /* JADX INFO: renamed from: b */
    public void mo82760b(SSLEngine sSLEngine, InterfaceC19889g.a aVar, String str, int i11) {
        m82864c(sSLEngine).mo82760b(sSLEngine, aVar, str, i11);
    }

    /* JADX INFO: renamed from: c */
    a m82864c(SSLEngine sSLEngine) {
        String canonicalName = sSLEngine.getClass().getCanonicalName();
        a aVar = (a) this.f63553a.get(canonicalName);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(sSLEngine.getClass());
        this.f63553a.put(canonicalName, aVar2);
        return aVar2;
    }
}
