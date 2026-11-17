package com.transsion.postdetail.shorttv_pugc.factory;

import android.app.Activity;
import android.view.MotionEvent;
import com.therouter.TheRouter;
import com.transsion.baseui.music.MusicFloatManager;
import com.transsion.player.mediasession.C16624h;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p415fq.InterfaceC23411b;
import p920xt.InterfaceC28662g;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv_pugc.factory.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C16946g implements InterfaceC28662g {
    @Override // p920xt.InterfaceC28662g
    /* JADX INFO: renamed from: a */
    public void mo73810a(WeakReference refer) {
        Intrinsics.m97802h(refer, "refer");
        InterfaceC23411b interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
        if (interfaceC23411b != null) {
            interfaceC23411b.mo23890g(refer);
        }
    }

    @Override // p920xt.InterfaceC28662g
    /* JADX INFO: renamed from: b */
    public void mo73811b() {
        InterfaceC23411b interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
        if (interfaceC23411b != null) {
            interfaceC23411b.mo23886c();
        }
    }

    @Override // p920xt.InterfaceC28662g
    /* JADX INFO: renamed from: c */
    public void mo73812c(Activity activity, MotionEvent event) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(event, "event");
        MusicFloatManager.f51050h.m65598b().m65584i(activity, event);
    }

    @Override // p920xt.InterfaceC28662g
    /* JADX INFO: renamed from: d */
    public void mo73813d() {
        MusicFloatManager.f51050h.m65598b().m65582B(null);
        C16624h.f55898a.m72387p();
    }

    @Override // p920xt.InterfaceC28662g
    /* JADX INFO: renamed from: e */
    public void mo73814e(WeakReference refer) {
        Intrinsics.m97802h(refer, "refer");
        InterfaceC23411b interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
        if (interfaceC23411b != null) {
            interfaceC23411b.mo23892i(refer);
        }
    }
}
