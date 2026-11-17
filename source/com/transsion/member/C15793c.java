package com.transsion.member;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.transsion.memberapi.MemberTaskSubmitCheckInRes;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p017an.InterfaceC0127a;
import p349dh.C22982c;
import p871wg.AbstractC28362a;
import p871wg.C28365d;

/* JADX INFO: renamed from: com.transsion.member.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C15793c extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f54239b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f54240c;

    /* JADX INFO: renamed from: com.transsion.member.c$a */
    public static final class a extends AbstractC28362a {
        a() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15793c.this.f54240c.mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MemberTaskSubmitCheckInRes memberTaskSubmitCheckInRes) {
            super.mo66458c(memberTaskSubmitCheckInRes);
            C15793c.this.f54240c.mo14858q(memberTaskSubmitCheckInRes);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15793c(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f54239b = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15793c.m69975h();
            }
        });
        this.f54240c = new C3187b0();
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC0127a m69974g() {
        return (InterfaceC0127a) this.f54239b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC0127a m69975h() {
        return (InterfaceC0127a) C22982c.f70163e.m91553a().m91552h(InterfaceC0127a.class);
    }

    /* JADX INFO: renamed from: e */
    public final void m69976e() {
        InterfaceC0127a.a.m591h(m69974g(), null, null, 3, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new a());
    }

    /* JADX INFO: renamed from: f */
    public final LiveData m69977f() {
        return this.f54240c;
    }
}
