package com.transsion.postdetail.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.postdetail.util.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C17433c {

    /* JADX INFO: renamed from: a */
    public static final C17433c f57824a = new C17433c();

    private C17433c() {
    }

    /* JADX INFO: renamed from: a */
    public final void m74953a(Context context, String filePath) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(filePath, "filePath");
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(filePath)));
        context.sendBroadcast(intent);
    }
}
