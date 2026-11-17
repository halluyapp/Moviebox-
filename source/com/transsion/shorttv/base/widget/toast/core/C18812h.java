package com.transsion.shorttv.base.widget.toast.core;

import android.app.Application;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import ls.InterfaceC25676b;
import ls.InterfaceC25677c;
import ms.C25904a;
import ms.C25905b;
import ms.C25906c;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C18812h {

    /* JADX INFO: renamed from: a */
    public static final C18812h f60816a = new C18812h();

    /* JADX INFO: renamed from: b */
    private static Application f60817b;

    /* JADX INFO: renamed from: c */
    private static InterfaceC25676b f60818c;

    /* JADX INFO: renamed from: d */
    private static InterfaceC25677c f60819d;

    private C18812h() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m79285b(C18812h c18812h, Application application, InterfaceC25677c interfaceC25677c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC25677c = f60819d;
        }
        c18812h.m79286a(application, interfaceC25677c);
    }

    /* JADX INFO: renamed from: a */
    public final void m79286a(Application application, InterfaceC25677c interfaceC25677c) {
        f60817b = application;
        if (f60818c == null) {
            m79289e(new HandlerC18811g());
        }
        if (interfaceC25677c == null) {
            interfaceC25677c = new C25904a();
        }
        f60816a.m79290f(interfaceC25677c);
    }

    /* JADX INFO: renamed from: c */
    public final void m79287c(int i11, int i12, int i13) {
        m79288d(i11, i12, i13, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m79288d(int i11, int i12, int i13, float f11, float f12) {
        InterfaceC25676b interfaceC25676b = f60818c;
        Intrinsics.m97799e(interfaceC25676b);
        InterfaceC25677c interfaceC25677c = f60819d;
        Intrinsics.m97799e(interfaceC25677c);
        interfaceC25676b.mo79283b(new C25905b(interfaceC25677c, i11, i12, i13, f11, f12));
    }

    /* JADX INFO: renamed from: e */
    public final void m79289e(InterfaceC25676b interfaceC25676b) {
        f60818c = interfaceC25676b;
        Intrinsics.m97799e(interfaceC25676b);
        interfaceC25676b.registerStrategy(f60817b);
    }

    /* JADX INFO: renamed from: f */
    public final void m79290f(InterfaceC25677c interfaceC25677c) {
        f60819d = interfaceC25677c;
        InterfaceC25676b interfaceC25676b = f60818c;
        Intrinsics.m97799e(interfaceC25676b);
        interfaceC25676b.mo79283b(interfaceC25677c);
    }

    /* JADX INFO: renamed from: g */
    public final void m79291g(int i11) {
        if (i11 <= 0) {
            return;
        }
        m79290f(new C25906c(i11, f60819d));
    }

    /* JADX INFO: renamed from: h */
    public final void m79292h(int i11) {
        try {
            Application application = f60817b;
            Intrinsics.m97799e(application);
            m79293i(application.getResources().getText(i11));
        } catch (Resources.NotFoundException unused) {
            m79293i(String.valueOf(i11));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m79293i(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        InterfaceC25676b interfaceC25676b = f60818c;
        Intrinsics.m97799e(interfaceC25676b);
        interfaceC25676b.mo79282a(charSequence);
    }
}
