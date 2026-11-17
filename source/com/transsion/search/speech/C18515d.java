package com.transsion.search.speech;

import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search.speech.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18515d {

    /* JADX INFO: renamed from: a */
    public static final C18515d f59985a = new C18515d();

    private C18515d() {
    }

    /* JADX INFO: renamed from: a */
    public final String m78048a(int i11) {
        StringBuffer stringBuffer = new StringBuffer("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        StringBuffer stringBuffer2 = new StringBuffer();
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        int length = stringBuffer.length();
        for (int i12 = 0; i12 < i11; i12++) {
            stringBuffer2.append(stringBuffer.charAt(threadLocalRandomCurrent.nextInt(length)));
        }
        String string = stringBuffer2.toString();
        Intrinsics.m97801g(string, "toString(...)");
        return string;
    }
}
