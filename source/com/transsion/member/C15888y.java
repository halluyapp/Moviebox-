package com.transsion.member;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.transsion.member.bean.request.MemberPromoCodeReq;
import com.transsion.member.bean.request.MemberPromoCodeRes;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p017an.InterfaceC0127a;
import p349dh.C22982c;
import p871wg.AbstractC28362a;
import p871wg.C28365d;

/* JADX INFO: renamed from: com.transsion.member.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C15888y extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f54416b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f54417c;

    /* JADX INFO: renamed from: com.transsion.member.y$a */
    public static final class a extends AbstractC28362a {
        a() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15888y.this.f54417c.mo14858q(new C15854i0(false, str, str2, null));
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MemberPromoCodeRes memberPromoCodeRes) {
            super.mo66458c(memberPromoCodeRes);
            C15888y.this.f54417c.mo14858q(new C15854i0(true, null, null, memberPromoCodeRes));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15888y(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f54416b = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15888y.m70120g();
            }
        });
        this.f54417c = new C3187b0();
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC0127a m70119f() {
        return (InterfaceC0127a) this.f54416b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC0127a m70120g() {
        return (InterfaceC0127a) C22982c.f70163e.m91553a().m91552h(InterfaceC0127a.class);
    }

    /* JADX INFO: renamed from: e */
    public final LiveData m70121e() {
        return this.f54417c;
    }

    /* JADX INFO: renamed from: h */
    public final void m70122h(String code) {
        Intrinsics.m97802h(code, "code");
        InterfaceC0127a.a.m590g(m70119f(), null, new MemberPromoCodeReq(code), 1, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new a());
    }
}
