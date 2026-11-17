package com.transsion.transfer.androidasync.http;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.transsion.transfer.androidasync.C19809a0;
import com.transsion.transfer.androidasync.C19935n;
import com.transsion.transfer.androidasync.C19955v;
import com.transsion.transfer.androidasync.InterfaceC19931j;
import com.transsion.transfer.androidasync.InterfaceC19937p;
import com.transsion.transfer.androidasync.InterfaceC19940s;
import java.io.IOException;
import p439gv.InterfaceC23677a;
import p468hv.InterfaceC23899a;
import p529jv.C24470a;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.v */
/* JADX INFO: loaded from: classes6.dex */
public class C19925v extends C19873a0 {

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.v$a */
    class a implements InterfaceC23677a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC23677a f63546a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C19935n f63547b;

        a(InterfaceC23677a interfaceC23677a, C19935n c19935n) {
            this.f63546a = interfaceC23677a;
            this.f63547b = c19935n;
        }

        @Override // p439gv.InterfaceC23677a
        /* JADX INFO: renamed from: g */
        public void mo82442g(Exception exc) {
            C19809a0.m82521b(this.f63546a, exc);
            C19935n c19935n = this.f63547b;
            if (c19935n != null) {
                c19935n.m82868g(false);
                this.f63547b.m82873o(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.v$b */
    class b implements C19955v.a {

        /* JADX INFO: renamed from: a */
        Headers f63549a = new Headers();

        /* JADX INFO: renamed from: b */
        String f63550b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC19889g.c f63551c;

        b(InterfaceC19889g.c cVar) {
            this.f63551c = cVar;
        }

        @Override // com.transsion.transfer.androidasync.C19955v.a
        /* JADX INFO: renamed from: a */
        public void mo82767a(String str) {
            try {
                String strTrim = str.trim();
                if (this.f63550b == null) {
                    this.f63550b = strTrim;
                    return;
                }
                if (!TextUtils.isEmpty(strTrim)) {
                    this.f63549a.m82634b(strTrim);
                    return;
                }
                String[] strArrSplit = this.f63550b.split(" ", 3);
                if (strArrSplit.length < 2) {
                    throw new Exception(new IOException("Not HTTP"));
                }
                this.f63551c.f63380g.mo82729y(this.f63549a);
                String str2 = strArrSplit[0];
                this.f63551c.f63380g.mo82726l(str2);
                this.f63551c.f63380g.mo82723c(Integer.parseInt(strArrSplit[1]));
                this.f63551c.f63380g.mo82728r(strArrSplit.length == 3 ? strArrSplit[2] : "");
                this.f63551c.f63382i.mo82442g(null);
                InterfaceC19931j interfaceC19931jSocket = this.f63551c.f63380g.socket();
                if (interfaceC19931jSocket == null) {
                    return;
                }
                InterfaceC19937p interfaceC19937pM82643c = (this.f63551c.f63384b.m82747q() && !C19925v.m82863i(this.f63551c.f63380g.mo82722b())) ? HttpUtil.m82643c(interfaceC19931jSocket, Protocol.get(str2), this.f63549a, false) : HttpUtil.EndEmitter.m82647P(interfaceC19931jSocket.mo82413a(), null);
                this.f63551c.f63380g.mo82727n(interfaceC19937pM82643c);
            } catch (Exception e11) {
                this.f63551c.f63382i.mo82442g(e11);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    static boolean m82863i(int i11) {
        return (i11 >= 100 && i11 <= 199) || i11 == 204 || i11 == 304;
    }

    @Override // com.transsion.transfer.androidasync.http.C19873a0, com.transsion.transfer.androidasync.http.InterfaceC19889g
    /* JADX INFO: renamed from: c */
    public void mo82689c(InterfaceC19889g.f fVar) {
        Protocol protocol = Protocol.get(fVar.f63377e);
        if ((protocol == null || protocol == Protocol.HTTP_1_0 || protocol == Protocol.HTTP_1_1) && (fVar.f63380g.mo82721H() instanceof C24470a)) {
            fVar.f63380g.mo82721H().mo82414d();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.transsion.transfer.androidasync.http.C19873a0, com.transsion.transfer.androidasync.http.InterfaceC19889g
    /* JADX INFO: renamed from: f */
    public boolean mo82692f(InterfaceC19889g.c cVar) {
        C19935n c19935n;
        InterfaceC19940s interfaceC19940s;
        Protocol protocol = Protocol.get(cVar.f63377e);
        if (protocol != null && protocol != Protocol.HTTP_1_0 && protocol != Protocol.HTTP_1_1) {
            return super.mo82692f(cVar);
        }
        C19892j c19892j = cVar.f63384b;
        InterfaceC23899a interfaceC23899aM82737e = c19892j.m82737e();
        if (interfaceC23899aM82737e != null) {
            if (interfaceC23899aM82737e.length() >= 0) {
                c19892j.m82739h().m82638f(HttpHeaders.CONTENT_LENGTH, String.valueOf(interfaceC23899aM82737e.length()));
                cVar.f63380g.mo82725f(cVar.f63379f);
            } else if ("close".equals(c19892j.m82739h().m82635c("Connection"))) {
                cVar.f63380g.mo82725f(cVar.f63379f);
            } else {
                c19892j.m82739h().m82638f("Transfer-Encoding", "Chunked");
                cVar.f63380g.mo82725f(new C24470a(cVar.f63379f));
            }
        }
        String strM82639g = c19892j.m82739h().m82639g(c19892j.m82744n().toString());
        byte[] bytes = strM82639g.getBytes();
        if (interfaceC23899aM82737e == null || interfaceC23899aM82737e.length() < 0 || interfaceC23899aM82737e.length() + bytes.length >= 1024) {
            c19935n = null;
            interfaceC19940s = cVar.f63379f;
        } else {
            C19935n c19935n2 = new C19935n(cVar.f63380g.mo82721H());
            c19935n2.m82868g(true);
            cVar.f63380g.mo82725f(c19935n2);
            c19935n = c19935n2;
            interfaceC19940s = c19935n2;
        }
        c19892j.m82751u("\n" + strM82639g);
        C19809a0.m82527h(interfaceC19940s, bytes, new a(cVar.f63381h, c19935n));
        b bVar = new b(cVar);
        C19955v c19955v = new C19955v();
        cVar.f63379f.mo82426v(c19955v);
        c19955v.m82897a(bVar);
        return true;
    }
}
