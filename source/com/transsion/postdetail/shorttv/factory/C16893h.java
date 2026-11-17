package com.transsion.postdetail.shorttv.factory;

import android.content.Context;
import android.content.Intent;
import com.therouter.TheRouter;
import com.transsnet.loginapi.bean.UserInfo;
import kotlin.jvm.internal.Intrinsics;
import p441gz.InterfaceC23704a;
import p848vs.InterfaceC28218i;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv.factory.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16893h implements InterfaceC28218i {
    /* JADX INFO: renamed from: c */
    private final InterfaceC23704a m73686c() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    @Override // p848vs.InterfaceC28218i
    /* JADX INFO: renamed from: a */
    public boolean mo73687a() {
        InterfaceC23704a interfaceC23704aM73686c = m73686c();
        return interfaceC23704aM73686c != null && interfaceC23704aM73686c.mo90379a();
    }

    @Override // p848vs.InterfaceC28218i
    /* JADX INFO: renamed from: b */
    public Intent mo73688b(Context context) {
        Intrinsics.m97802h(context, "context");
        InterfaceC23704a interfaceC23704aM73686c = m73686c();
        if (interfaceC23704aM73686c != null) {
            return interfaceC23704aM73686c.mo90394p(context);
        }
        return null;
    }

    @Override // p848vs.InterfaceC28218i
    public String getUserId() {
        UserInfo userInfoMo90386h;
        InterfaceC23704a interfaceC23704aM73686c = m73686c();
        if (interfaceC23704aM73686c == null || (userInfoMo90386h = interfaceC23704aM73686c.mo90386h()) == null) {
            return null;
        }
        return userInfoMo90386h.getUserId();
    }
}
