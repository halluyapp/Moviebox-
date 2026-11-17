package com.transsion.postdetail.util;

import android.app.Activity;
import android.view.OrientationEventListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.postdetail.util.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C17444n extends OrientationEventListener {

    /* JADX INFO: renamed from: a */
    private final Activity f57837a;

    /* JADX INFO: renamed from: b */
    private final Function1 f57838b;

    /* JADX INFO: renamed from: c */
    private int f57839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17444n(Activity activity, Function1 callback) {
        super(activity);
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(callback, "callback");
        this.f57837a = activity;
        this.f57838b = callback;
    }

    /* JADX INFO: renamed from: a */
    public final int m74970a() {
        return this.f57839c;
    }

    /* JADX INFO: renamed from: b */
    public final int m74971b(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        return activity.getWindowManager().getDefaultDisplay().getRotation();
    }

    /* JADX INFO: renamed from: c */
    public final void m74972c(int i11) {
        if (this.f57839c == i11) {
            return;
        }
        this.f57839c = i11;
        this.f57838b.invoke(Integer.valueOf(i11));
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i11) {
        if (71 <= i11 && i11 < 110) {
            if (this.f57839c != 3 && m74971b(this.f57837a) == 3) {
                m74972c(3);
                return;
            }
            return;
        }
        if (251 > i11 || i11 >= 290 || this.f57839c == 1 || m74971b(this.f57837a) != 1) {
            return;
        }
        m74972c(1);
    }
}
