package com.transsion.usercenter.profile;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.usercenter.profile.bean.ProfileNewMessage;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p349dh.C22982c;
import p871wg.AbstractC28362a;
import p871wg.C28365d;

/* JADX INFO: renamed from: com.transsion.usercenter.profile.f */
/* JADX INFO: loaded from: classes7.dex */
public final class C20664f extends AbstractC3223t0 {

    /* JADX INFO: renamed from: d */
    public static final a f65194d = new a(null);

    /* JADX INFO: renamed from: e */
    private static boolean f65195e;

    /* JADX INFO: renamed from: a */
    private final C3187b0 f65196a = new C3187b0();

    /* JADX INFO: renamed from: b */
    private final C3187b0 f65197b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private final Lazy f65198c = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C20664f.m85334i();
        }
    });

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.f$b */
    public static final class b extends AbstractC28362a {
        b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C20664f.f65195e = false;
            C20664f.this.m85337g().mo14855n(null);
            C20664f.this.m85338h().mo14858q(0);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(ProfileNewMessage profileNewMessage) {
            C20664f.f65195e = false;
            C20664f.this.m85337g().mo14855n(profileNewMessage);
            C20664f.this.m85338h().mo14858q(Integer.valueOf(profileNewMessage != null ? profileNewMessage.getSystemCnt() + profileNewMessage.getInteractiveCnt() : 0));
        }
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC20647b m85333f() {
        return (InterfaceC20647b) this.f65198c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC20647b m85334i() {
        return (InterfaceC20647b) C22982c.f70163e.m91553a().m91552h(InterfaceC20647b.class);
    }

    /* JADX INFO: renamed from: d */
    public final void m85335d() {
        if (f65195e) {
            return;
        }
        f65195e = true;
        InterfaceC20647b.a.m85291a(m85333f(), null, 1, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new b());
    }

    /* JADX INFO: renamed from: e */
    public final void m85336e() {
        this.f65196a.mo14858q(0);
    }

    /* JADX INFO: renamed from: g */
    public final C3187b0 m85337g() {
        return this.f65197b;
    }

    /* JADX INFO: renamed from: h */
    public final C3187b0 m85338h() {
        return this.f65196a;
    }
}
