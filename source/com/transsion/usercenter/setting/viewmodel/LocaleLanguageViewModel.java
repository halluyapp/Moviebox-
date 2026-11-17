package com.transsion.usercenter.setting.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;

/* JADX INFO: loaded from: classes7.dex */
public final class LocaleLanguageViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f65548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleLanguageViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f65548b = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.viewmodel.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocaleLanguageViewModel.m85830f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C3187b0 m85830f() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: d */
    public final void m85831d() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new LocaleLanguageViewModel$getList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m85832e() {
        return (C3187b0) this.f65548b.getValue();
    }
}
