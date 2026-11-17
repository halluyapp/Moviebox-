package com.transsion.search_pugc.speech;

import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search_pugc.speech.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18680d {

    /* JADX INFO: renamed from: a */
    public static final C18680d f60326a = new C18680d();

    private C18680d() {
    }

    /* JADX INFO: renamed from: a */
    public final String m78582a(int i11) {
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
