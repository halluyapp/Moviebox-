package com.transsion.shorttv_pugc.utils;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.utils.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C19526e {

    /* JADX INFO: renamed from: c */
    public static final a f62461c = new a(null);

    /* JADX INFO: renamed from: d */
    private static final Lazy f62462d = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.utils.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C19526e.m81336g();
        }
    });

    /* JADX INFO: renamed from: a */
    private List f62463a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private int f62464b;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.utils.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C19526e m81339a() {
            return (C19526e) C19526e.f62462d.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m81335f(FragmentActivity fragmentActivity, C19526e c19526e) {
        View decorView;
        WindowInsets rootWindowInsets;
        if (fragmentActivity.isFinishing()) {
            return;
        }
        Window window = fragmentActivity.getWindow();
        Insets mandatorySystemGestureInsets = (window == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null) ? null : rootWindowInsets.getMandatorySystemGestureInsets();
        if (mandatorySystemGestureInsets == null || mandatorySystemGestureInsets.bottom > AbstractC5776a0.m27313a(40.0f)) {
            C26866a.a.m104898f(C26866a.f81698a, "ImmVideoHelper", "is open navigation bar 2", false, 4, null);
            return;
        }
        int i11 = mandatorySystemGestureInsets.bottom;
        c19526e.f62464b = i11;
        C26866a.a.m104898f(C26866a.f81698a, "ImmVideoHelper", "on get navigation gesture height = " + i11, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C19526e m81336g() {
        return new C19526e();
    }

    /* JADX INFO: renamed from: d */
    public final List m81337d() {
        return this.f62463a;
    }

    /* JADX INFO: renamed from: e */
    public final void m81338e(final FragmentActivity activity) {
        Intrinsics.m97802h(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            this.f62464b = 0;
            return;
        }
        if (AbstractC5781d.m27349a() > 50) {
            C26866a.a.m104898f(C26866a.f81698a, "ImmVideoHelper", "is open navigation bar", false, 4, null);
            this.f62464b = 0;
            return;
        }
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (decorView != null) {
            decorView.post(new Runnable() { // from class: com.transsion.shorttv_pugc.utils.d
                @Override // java.lang.Runnable
                public final void run() {
                    C19526e.m81335f(activity, this);
                }
            });
        }
    }
}
