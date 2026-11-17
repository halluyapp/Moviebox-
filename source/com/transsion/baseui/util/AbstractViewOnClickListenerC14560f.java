package com.transsion.baseui.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.baseui.util.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractViewOnClickListenerC14560f implements View.OnClickListener {

    /* JADX INFO: renamed from: c */
    public static final a f51107c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f51108d = 8;

    /* JADX INFO: renamed from: a */
    private int f51109a;

    /* JADX INFO: renamed from: b */
    private final Handler f51110b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.transsion.baseui.util.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    protected AbstractViewOnClickListenerC14560f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m65675b(AbstractViewOnClickListenerC14560f abstractViewOnClickListenerC14560f, View view) {
        int i11 = abstractViewOnClickListenerC14560f.f51109a;
        if (i11 == 1) {
            abstractViewOnClickListenerC14560f.mo64494d(view);
        } else if (i11 >= 2) {
            abstractViewOnClickListenerC14560f.mo64493c(view);
        }
        abstractViewOnClickListenerC14560f.f51110b.removeCallbacksAndMessages(null);
        abstractViewOnClickListenerC14560f.f51109a = 0;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo64493c(View view);

    /* JADX INFO: renamed from: d */
    public abstract void mo64494d(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(final View v11) {
        Intrinsics.m97802h(v11, "v");
        int i11 = this.f51109a + 1;
        this.f51109a = i11;
        if (i11 > 1) {
            return;
        }
        this.f51110b.postDelayed(new Runnable() { // from class: com.transsion.baseui.util.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractViewOnClickListenerC14560f.m65675b(this.f51105a, v11);
            }
        }, 300L);
    }
}
