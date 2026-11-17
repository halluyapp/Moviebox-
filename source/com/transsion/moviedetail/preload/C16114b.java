package com.transsion.moviedetail.preload;

import androidx.p1004lifecycle.C3187b0;
import com.transsion.moviedetailapi.bean.Subject;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p349dh.C22982c;
import p523jn.InterfaceC24449a;
import p843vm.AbstractC28132b;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import p978zg.C29182a;

/* JADX INFO: renamed from: com.transsion.moviedetail.preload.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16114b extends AbstractC28132b {

    /* JADX INFO: renamed from: f */
    private String f54818f;

    /* JADX INFO: renamed from: g */
    private Integer f54819g;

    /* JADX INFO: renamed from: h */
    private boolean f54820h;

    /* JADX INFO: renamed from: i */
    private final Lazy f54821i;

    /* JADX INFO: renamed from: com.transsion.moviedetail.preload.b$a */
    public static final class a extends AbstractC28362a {
        a() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C16114b.this.m109260c(new Pair(str, null));
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(Subject subject) {
            if (subject != null) {
                subject.setRefreshViewOnly(C16114b.this.m70661m());
            }
            C16114b.this.m109261d(new Pair("0", subject));
        }

        @Override // p871wg.AbstractC28362a, io.reactivex.rxjava3.core.InterfaceC24098o
        public void onSubscribe(InterfaceC24104c d11) {
            Intrinsics.m97802h(d11, "d");
            super.onSubscribe(d11);
            C16114b.this.m109263i(d11);
        }
    }

    public C16114b(String subjectId, Integer num, boolean z11) {
        Intrinsics.m97802h(subjectId, "subjectId");
        this.f54818f = subjectId;
        this.f54819g = num;
        this.f54820h = z11;
        this.f54821i = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.moviedetail.preload.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C16114b.m70660n();
            }
        });
    }

    public /* synthetic */ C16114b(String str, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC24449a m70659l() {
        return (InterfaceC24449a) this.f54821i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC24449a m70660n() {
        return (InterfaceC24449a) C22982c.f70163e.m91553a().m91552h(InterfaceC24449a.class);
    }

    @Override // p843vm.AbstractC28132b
    /* JADX INFO: renamed from: h */
    public void mo70647h(C3187b0 c3187b0) {
        m70659l().m95938g(C29182a.f89053a.m111992a(), this.f54818f, this.f54819g).m95079f(C28365d.f87067a.m109702c()).subscribe(new a());
    }

    /* JADX INFO: renamed from: m */
    public final boolean m70661m() {
        return this.f54820h;
    }

    /* JADX INFO: renamed from: o */
    public final void m70662o(boolean z11) {
        this.f54820h = z11;
    }

    /* JADX INFO: renamed from: p */
    public final void m70663p(Integer num) {
        this.f54819g = num;
    }

    /* JADX INFO: renamed from: q */
    public final void m70664q(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f54818f = str;
    }
}
