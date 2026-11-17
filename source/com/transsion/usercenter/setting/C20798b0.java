package com.transsion.usercenter.setting;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import ax.C4717c;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.b0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C20798b0 extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final C3187b0 f65448b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f65449c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f65450d;

    /* JADX INFO: renamed from: e */
    private final Lazy f65451e;

    /* JADX INFO: renamed from: f */
    private InterfaceC24104c f65452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20798b0(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f65448b = new C3187b0();
        this.f65449c = new C3187b0();
        this.f65450d = new C3187b0();
        this.f65451e = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C20798b0.m85684d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C4717c m85684d() {
        return new C4717c();
    }

    /* JADX INFO: renamed from: e */
    private final void m85685e() {
        InterfaceC24104c interfaceC24104c;
        InterfaceC24104c interfaceC24104c2 = this.f65452f;
        if (interfaceC24104c2 == null || interfaceC24104c2.isDisposed() || (interfaceC24104c = this.f65452f) == null) {
            return;
        }
        interfaceC24104c.dispose();
    }

    /* JADX INFO: renamed from: f */
    public final LiveData m85686f() {
        return this.f65448b;
    }

    /* JADX INFO: renamed from: g */
    public final LiveData m85687g() {
        return this.f65449c;
    }

    /* JADX INFO: renamed from: h */
    public final LiveData m85688h() {
        return this.f65450d;
    }

    @Override // androidx.p1004lifecycle.AbstractC3223t0
    protected void onCleared() {
        super.onCleared();
        m85685e();
    }
}
