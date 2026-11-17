package com.transsion.search.speech;

import com.blankj.utilcode.util.Utils;
import com.transsion.search.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search.speech.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18516e {

    /* JADX INFO: renamed from: a */
    public static final C18516e f59986a = new C18516e();

    private C18516e() {
    }

    /* JADX INFO: renamed from: a */
    public final String m78049a(int i11) {
        if (i11 == 1 || i11 == 2) {
            String string = Utils.m27275a().getResources().getString(R$string.search_sr_try_again);
            Intrinsics.m97799e(string);
            return string;
        }
        if (i11 == 6 || i11 == 7) {
            String string2 = Utils.m27275a().getResources().getString(R$string.search_sr_try_speaking_again);
            Intrinsics.m97799e(string2);
            return string2;
        }
        if (i11 != 16) {
            String string3 = Utils.m27275a().getResources().getString(R$string.search_sr_wrong_try_again);
            Intrinsics.m97799e(string3);
            return string3;
        }
        String string4 = Utils.m27275a().getResources().getString(R$string.search_sr_cancelled);
        Intrinsics.m97799e(string4);
        return string4;
    }
}
