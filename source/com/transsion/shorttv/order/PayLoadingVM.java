package com.transsion.shorttv.order;

import android.os.SystemClock;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.shorttv.order.bean.CreatePaynicornOrderReqBean;
import com.transsion.shorttv.order.bean.HttpErrorBodyBean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;

/* JADX INFO: loaded from: classes6.dex */
public final class PayLoadingVM extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private int f60865a;

    /* JADX INFO: renamed from: b */
    private long f60866b = 3000;

    /* JADX INFO: renamed from: c */
    private long f60867c = 3000;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f60868d = new C3187b0();

    /* JADX INFO: renamed from: e */
    private final C3187b0 f60869e = new C3187b0();

    /* JADX INFO: renamed from: f */
    private final C3187b0 f60870f = new C3187b0();

    /* JADX INFO: renamed from: k */
    private final String m79391k() {
        String simpleName = PayLoadingVM.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m79392o(String str, String str2, String str3, String str4, boolean z11) {
        int i11 = this.f60865a;
        if (i11 >= 3) {
            this.f60870f.mo14855n(new HttpErrorBodyBean(str2, str, null, 4, null));
            return;
        }
        this.f60865a = i11 + 1;
        C18861c.f60874a.m79435a(m79391k() + " --> retry() --> code = " + str + " -- msg = " + str2 + " --> retryCount = " + this.f60865a);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PayLoadingVM$retry$1(this, SystemClock.elapsedRealtime(), str3, str4, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m79393i(String str, String str2, boolean z11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PayLoadingVM$checkPayOrderId$1(str, str2, z11, this, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m79394j(CreatePaynicornOrderReqBean createPaynicornOrderReqBean) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PayLoadingVM$createPayOrderId$1(createPaynicornOrderReqBean, this, null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m79395l() {
        return this.f60868d;
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m79396m() {
        return this.f60869e;
    }

    /* JADX INFO: renamed from: n */
    public final C3187b0 m79397n() {
        return this.f60870f;
    }
}
