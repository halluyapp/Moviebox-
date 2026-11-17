package com.transsion.usercenter.profile.report;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.gson.JsonObject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;

/* JADX INFO: loaded from: classes7.dex */
public final class ReportViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f65309b;

    /* JADX INFO: renamed from: c */
    private final Lazy f65310c;

    /* JADX INFO: renamed from: d */
    private final Lazy f65311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f65309b = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.report.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReportViewModel.m85469n();
            }
        });
        this.f65310c = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.report.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReportViewModel.m85468m();
            }
        });
        this.f65311d = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.report.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReportViewModel.m85466h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C3187b0 m85466h() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC20739b m85467k() {
        return (InterfaceC20739b) this.f65309b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C3187b0 m85468m() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC20739b m85469n() {
        return (InterfaceC20739b) C22982c.f70163e.m91553a().m91552h(InterfaceC20739b.class);
    }

    /* JADX INFO: renamed from: g */
    public final void m85470g(String userId) {
        Intrinsics.m97802h(userId, "userId");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userId", userId);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ReportViewModel$block$1(jsonObject, this, null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final C3187b0 m85471i() {
        return (C3187b0) this.f65311d.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m85472j() {
        return (C3187b0) this.f65310c.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final void m85473l(String str, String str2, String str3) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(NativeComponentConstants.KEY_COMPONENT_TYPE, str);
        jsonObject.addProperty("id", str2);
        jsonObject.addProperty("reason", str3);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ReportViewModel$report$1(jsonObject, this, null), 3, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m85474o(String userId) {
        Intrinsics.m97802h(userId, "userId");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userId", userId);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ReportViewModel$unBlock$1(jsonObject, this, null), 3, null);
    }
}
