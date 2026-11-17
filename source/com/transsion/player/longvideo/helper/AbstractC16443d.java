package com.transsion.player.longvideo.helper;

import jo.InterfaceC24450a;
import kotlin.jvm.internal.Intrinsics;
import p582lo.C25661j;

/* JADX INFO: renamed from: com.transsion.player.longvideo.helper.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC16443d {

    /* JADX INFO: renamed from: a */
    private C25661j f55526a;

    /* JADX INFO: renamed from: b */
    private String f55527b;

    /* JADX INFO: renamed from: c */
    private InterfaceC24450a.b f55528c;

    /* JADX INFO: renamed from: a */
    protected final InterfaceC24450a.b m71803a() {
        return this.f55528c;
    }

    /* JADX INFO: renamed from: b */
    protected final C25661j m71804b() {
        return this.f55526a;
    }

    /* JADX INFO: renamed from: c */
    public void mo71805c(String str, C25661j viewBinding) {
        Intrinsics.m97802h(viewBinding, "viewBinding");
        this.f55527b = str;
        this.f55526a = viewBinding;
    }

    /* JADX INFO: renamed from: d */
    public final void m71806d(InterfaceC24450a.b bVar) {
        this.f55528c = bVar;
    }
}
