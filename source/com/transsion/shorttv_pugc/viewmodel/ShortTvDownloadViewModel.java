package com.transsion.shorttv_pugc.viewmodel;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.shorttv_pugc.bean.ShortTVFavInfo;
import com.transsion.shorttv_pugc.bean.Subject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p883wt.InterfaceC28436a;
import tt.C27850c;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvDownloadViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: k */
    public static final C19532a f62475k = new C19532a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f62476a = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.viewmodel.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvDownloadViewModel.m81357p();
        }
    });

    /* JADX INFO: renamed from: b */
    private final C3187b0 f62477b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private final C3187b0 f62478c = new C3187b0();

    /* JADX INFO: renamed from: d */
    private final C3187b0 f62479d = new C3187b0();

    /* JADX INFO: renamed from: e */
    private final C3187b0 f62480e = new C3187b0();

    /* JADX INFO: renamed from: f */
    private final C3187b0 f62481f = new C3187b0();

    /* JADX INFO: renamed from: g */
    private final C3187b0 f62482g = new C3187b0();

    /* JADX INFO: renamed from: h */
    private final C3187b0 f62483h = new C3187b0();

    /* JADX INFO: renamed from: i */
    private final C3187b0 f62484i = new C3187b0();

    /* JADX INFO: renamed from: j */
    private final C3187b0 f62485j = new C3187b0();

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.viewmodel.ShortTvDownloadViewModel$a */
    public static final class C19532a {
        private C19532a() {
        }

        public /* synthetic */ C19532a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC28436a m81356f() {
        return (InterfaceC28436a) this.f62476a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC28436a m81357p() {
        return (InterfaceC28436a) C22982c.f70163e.m91553a().m91552h(InterfaceC28436a.class);
    }

    /* JADX INFO: renamed from: d */
    public final void m81358d(Subject subject) {
        ShortTVFavInfo shortTVFavInfo;
        if (subject == null || (shortTVFavInfo = subject.getShortTVFavInfo()) == null) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvDownloadViewModel$favorite$1(subject, shortTVFavInfo.getHasFavorite(), this, shortTVFavInfo, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m81359e() {
        return this.f62477b;
    }

    /* JADX INFO: renamed from: g */
    public final void m81360g(String subjectId, int i11, int i12) {
        Intrinsics.m97802h(subjectId, "subjectId");
    }

    /* JADX INFO: renamed from: h */
    public final C3187b0 m81361h() {
        return this.f62481f;
    }

    /* JADX INFO: renamed from: i */
    public final C3187b0 m81362i() {
        return this.f62484i;
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m81363j() {
        return this.f62483h;
    }

    /* JADX INFO: renamed from: k */
    public final C3187b0 m81364k() {
        return this.f62485j;
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m81365l() {
        return this.f62478c;
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m81366m() {
        return this.f62479d;
    }

    /* JADX INFO: renamed from: n */
    public final C3187b0 m81367n() {
        return this.f62482g;
    }

    /* JADX INFO: renamed from: o */
    public final C3187b0 m81368o() {
        return this.f62480e;
    }

    /* JADX INFO: renamed from: q */
    public final void m81369q(C27850c item) {
        Intrinsics.m97802h(item, "item");
        Map linkedHashMap = (Map) this.f62478c.m14847f();
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (item.m108250d()) {
            linkedHashMap.remove(Integer.valueOf(item.m108247a()));
        } else {
            linkedHashMap.put(Integer.valueOf(item.m108247a()), item);
        }
        this.f62478c.mo14858q(linkedHashMap);
    }
}
