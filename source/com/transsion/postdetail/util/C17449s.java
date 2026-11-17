package com.transsion.postdetail.util;

import android.app.Activity;
import android.view.Window;

/* JADX INFO: renamed from: com.transsion.postdetail.util.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C17449s {

    /* JADX INFO: renamed from: a */
    public static final C17449s f57841a = new C17449s();

    private C17449s() {
    }

    /* JADX INFO: renamed from: a */
    public final String m74973a(Integer num) {
        int iIntValue = num != null ? num.intValue() : 0;
        if (1 > iIntValue || iIntValue >= 10) {
            return String.valueOf(iIntValue);
        }
        return "0" + iIntValue;
    }

    /* JADX INFO: renamed from: b */
    public final void m74974b(Activity activity, boolean z11) {
        Window window = activity != null ? activity.getWindow() : null;
        if (z11) {
            if (window != null) {
                window.addFlags(128);
            }
        } else if (window != null) {
            window.clearFlags(128);
        }
    }
}
