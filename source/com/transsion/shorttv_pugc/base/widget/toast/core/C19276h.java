package com.transsion.shorttv_pugc.base.widget.toast.core;

import android.app.Application;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import p719qt.InterfaceC27127b;
import p719qt.InterfaceC27128c;
import p753rt.C27373a;
import p753rt.C27374b;
import p753rt.C27375c;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.toast.core.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C19276h {

    /* JADX INFO: renamed from: a */
    public static final C19276h f61921a = new C19276h();

    /* JADX INFO: renamed from: b */
    private static Application f61922b;

    /* JADX INFO: renamed from: c */
    private static InterfaceC27127b f61923c;

    /* JADX INFO: renamed from: d */
    private static InterfaceC27128c f61924d;

    private C19276h() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80712b(C19276h c19276h, Application application, InterfaceC27128c interfaceC27128c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC27128c = f61924d;
        }
        c19276h.m80713a(application, interfaceC27128c);
    }

    /* JADX INFO: renamed from: a */
    public final void m80713a(Application application, InterfaceC27128c interfaceC27128c) {
        f61922b = application;
        if (f61923c == null) {
            m80716e(new HandlerC19275g());
        }
        if (interfaceC27128c == null) {
            interfaceC27128c = new C27373a();
        }
        f61921a.m80717f(interfaceC27128c);
    }

    /* JADX INFO: renamed from: c */
    public final void m80714c(int i11, int i12, int i13) {
        m80715d(i11, i12, i13, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m80715d(int i11, int i12, int i13, float f11, float f12) {
        InterfaceC27127b interfaceC27127b = f61923c;
        Intrinsics.m97799e(interfaceC27127b);
        InterfaceC27128c interfaceC27128c = f61924d;
        Intrinsics.m97799e(interfaceC27128c);
        interfaceC27127b.mo80710b(new C27374b(interfaceC27128c, i11, i12, i13, f11, f12));
    }

    /* JADX INFO: renamed from: e */
    public final void m80716e(InterfaceC27127b interfaceC27127b) {
        f61923c = interfaceC27127b;
        Intrinsics.m97799e(interfaceC27127b);
        interfaceC27127b.registerStrategy(f61922b);
    }

    /* JADX INFO: renamed from: f */
    public final void m80717f(InterfaceC27128c interfaceC27128c) {
        f61924d = interfaceC27128c;
        InterfaceC27127b interfaceC27127b = f61923c;
        Intrinsics.m97799e(interfaceC27127b);
        interfaceC27127b.mo80710b(interfaceC27128c);
    }

    /* JADX INFO: renamed from: g */
    public final void m80718g(int i11) {
        if (i11 <= 0) {
            return;
        }
        m80717f(new C27375c(i11, f61924d));
    }

    /* JADX INFO: renamed from: h */
    public final void m80719h(int i11) {
        try {
            Application application = f61922b;
            Intrinsics.m97799e(application);
            m80720i(application.getResources().getText(i11));
        } catch (Resources.NotFoundException unused) {
            m80720i(String.valueOf(i11));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m80720i(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        InterfaceC27127b interfaceC27127b = f61923c;
        Intrinsics.m97799e(interfaceC27127b);
        interfaceC27127b.mo80709a(charSequence);
    }
}
