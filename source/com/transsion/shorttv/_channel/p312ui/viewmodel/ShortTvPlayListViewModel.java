package com.transsion.shorttv._channel.p312ui.viewmodel;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import sr.InterfaceC27643a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvPlayListViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC27643a f60467a = (InterfaceC27643a) C22982c.f70163e.m91553a().m91552h(InterfaceC27643a.class);

    /* JADX INFO: renamed from: b */
    private final Lazy f60468b = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv._channel.ui.viewmodel.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvPlayListViewModel.m78852h();
        }
    });

    /* JADX INFO: renamed from: c */
    private int f60469c = 1;

    /* JADX INFO: renamed from: d */
    private int f60470d = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C3187b0 m78852h() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: e */
    public final int m78853e() {
        return this.f60469c;
    }

    /* JADX INFO: renamed from: f */
    public final void m78854f(String label, String category, String recType, String topIds, int i11) {
        Intrinsics.m97802h(label, "label");
        Intrinsics.m97802h(category, "category");
        Intrinsics.m97802h(recType, "recType");
        Intrinsics.m97802h(topIds, "topIds");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvPlayListViewModel$getPlayList$1(this, label, category, recType, topIds, i11, null), 2, null);
    }

    /* JADX INFO: renamed from: g */
    public final C3187b0 m78855g() {
        return (C3187b0) this.f60468b.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m78856i(int i11) {
        this.f60469c = i11;
    }
}
