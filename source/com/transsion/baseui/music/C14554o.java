package com.transsion.baseui.music;

import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.baseui.music.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C14554o {

    /* JADX INFO: renamed from: a */
    public static final C14554o f51096a = new C14554o();

    private C14554o() {
    }

    /* JADX INFO: renamed from: a */
    public final String m65648a(int i11) {
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
