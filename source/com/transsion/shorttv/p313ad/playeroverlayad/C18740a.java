package com.transsion.shorttv.p313ad.playeroverlayad;

import com.transsion.shorttv.p313ad.AdLoadState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.ad.playeroverlayad.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18740a {

    /* JADX INFO: renamed from: a */
    private AdLoadState f60548a = AdLoadState.IDLE;

    /* JADX INFO: renamed from: b */
    private C18744e f60549b;

    /* JADX INFO: renamed from: c */
    private boolean f60550c;

    /* JADX INFO: renamed from: d */
    private boolean f60551d;

    /* JADX INFO: renamed from: a */
    public final void m78953a() {
        this.f60548a = AdLoadState.DESTROYED;
        C18744e c18744e = this.f60549b;
        if (c18744e != null) {
            c18744e.m78972f();
        }
        this.f60549b = null;
        this.f60550c = false;
    }

    /* JADX INFO: renamed from: b */
    public final C18744e m78954b() {
        return this.f60549b;
    }

    /* JADX INFO: renamed from: c */
    public final AdLoadState m78955c() {
        return this.f60548a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m78956d() {
        return this.f60551d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m78957e() {
        return this.f60550c;
    }

    /* JADX INFO: renamed from: f */
    public final void m78958f(C18744e c18744e) {
        this.f60549b = c18744e;
    }

    /* JADX INFO: renamed from: g */
    public final void m78959g(AdLoadState adLoadState) {
        Intrinsics.m97802h(adLoadState, "<set-?>");
        this.f60548a = adLoadState;
    }

    /* JADX INFO: renamed from: h */
    public final void m78960h(boolean z11) {
        this.f60551d = z11;
    }

    /* JADX INFO: renamed from: i */
    public final void m78961i(boolean z11) {
        this.f60550c = z11;
    }
}
