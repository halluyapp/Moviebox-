package com.transsion.rewardscenter.utils;

import com.transsion.rewardscenter.R$layout;
import kotlin.jvm.internal.Intrinsics;
import p944yh.C28951b;

/* JADX INFO: renamed from: com.transsion.rewardscenter.utils.p */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18021p {
    /* JADX INFO: renamed from: a */
    public static final void m76643a(boolean z11, String string) {
        Intrinsics.m97802h(string, "string");
        if (z11) {
            C28951b.f88586a.m111457g(R$layout.toast_success_layout, string, (24 & 4) != 0 ? 0 : 17, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
        } else {
            C28951b.f88586a.m111457g(R$layout.toast_warning_layout, string, (24 & 4) != 0 ? 0 : 17, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
        }
    }
}
