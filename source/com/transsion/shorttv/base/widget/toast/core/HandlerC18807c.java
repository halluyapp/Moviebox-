package com.transsion.shorttv.base.widget.toast.core;

import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.c */
/* JADX INFO: loaded from: classes6.dex */
public final class HandlerC18807c extends Handler {

    /* JADX INFO: renamed from: a */
    private final Handler f60808a;

    public HandlerC18807c(Handler mHandler) {
        Intrinsics.m97802h(mHandler, "mHandler");
        this.f60808a = mHandler;
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        Intrinsics.m97802h(msg, "msg");
        try {
            this.f60808a.handleMessage(msg);
        } catch (WindowManager.BadTokenException e11) {
            e11.printStackTrace();
        } catch (IllegalStateException e12) {
            e12.printStackTrace();
        }
    }
}
