package com.transsion.subroom.p318ui;

import androidx.fragment.app.FragmentActivity;
import com.transsion.baselib.net.InterfaceC14479g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.subroom.ui.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C19648a implements InterfaceC14479g {
    @Override // com.transsion.baselib.net.InterfaceC14479g
    /* JADX INFO: renamed from: a */
    public void mo65262a(FragmentActivity activity, String message, String reason) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(message, "message");
        Intrinsics.m97802h(reason, "reason");
        WarningMessageDialog.INSTANCE.m81825a(message, reason).m65436k0(activity, "warning_message");
    }
}
