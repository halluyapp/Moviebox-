package com.transsion.transfer.wifi.util;

import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.util.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C20133d {

    /* JADX INFO: renamed from: a */
    public static final C20133d f63994a = new C20133d();

    private C20133d() {
    }

    /* JADX INFO: renamed from: a */
    public final String m83561a(int i11) {
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
