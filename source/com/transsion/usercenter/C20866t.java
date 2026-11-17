package com.transsion.usercenter;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.usercenter.t */
/* JADX INFO: loaded from: classes7.dex */
public final class C20866t implements InputFilter {

    /* JADX INFO: renamed from: a */
    private final int f65553a;

    /* JADX INFO: renamed from: b */
    private a f65554b;

    /* JADX INFO: renamed from: com.transsion.usercenter.t$a */
    /* JADX INFO: loaded from: classes6.dex */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo84591a();
    }

    public C20866t(int i11) {
        this.f65553a = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m85833a(a aVar) {
        this.f65554b = aVar;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence source, int i11, int i12, Spanned dest, int i13, int i14) {
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(dest, "dest");
        int length = this.f65553a - (dest.length() - (i14 - i13));
        if (length > 0) {
            if (length >= i12 - i11) {
                return null;
            }
            int i15 = length + i11;
            return (Character.isHighSurrogate(source.charAt(i15 + (-1))) && (i15 = i15 + (-1)) == i11) ? "" : source.subSequence(i11, i15);
        }
        a aVar = this.f65554b;
        if (aVar == null) {
            return "";
        }
        aVar.mo84591a();
        return "";
    }
}
