package com.transsion.transfer.androidasync.util;

import java.io.Closeable;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.util.d */
/* JADX INFO: loaded from: classes6.dex */
public class C19953d {
    /* JADX INFO: renamed from: a */
    public static void m82894a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception unused) {
                }
            }
        }
    }
}
