package com.transsion.postdetail.shorttv.factory;

import android.content.Context;
import android.view.View;
import com.p282tn.lib.view.NoNetworkBigView;
import kotlin.jvm.internal.Intrinsics;
import p848vs.InterfaceC28221l;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv.factory.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C16899n implements InterfaceC28221l {
    @Override // p848vs.InterfaceC28221l
    /* JADX INFO: renamed from: a */
    public View mo73724a(Context context) {
        Intrinsics.m97802h(context, "context");
        return new NoNetworkBigView(context);
    }
}
