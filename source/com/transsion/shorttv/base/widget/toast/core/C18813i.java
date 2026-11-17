package com.transsion.shorttv.base.widget.toast.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C18813i implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    private Activity f60820a;

    /* JADX INFO: renamed from: b */
    private ToastImpl f60821b;

    public C18813i(Activity activity) {
        this.f60820a = activity;
    }

    /* JADX INFO: renamed from: a */
    public final Activity m79294a() {
        return this.f60820a;
    }

    /* JADX INFO: renamed from: b */
    public final void m79295b(ToastImpl toastImpl) {
        this.f60821b = toastImpl;
        Activity activity = this.f60820a;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Intrinsics.m97799e(activity);
            activity.registerActivityLifecycleCallbacks(this);
        } else {
            Intrinsics.m97799e(activity);
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m79296c() {
        this.f60821b = null;
        Activity activity = this.f60820a;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Intrinsics.m97799e(activity);
            activity.unregisterActivityLifecycleCallbacks(this);
        } else {
            Intrinsics.m97799e(activity);
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.m97802h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        if (this.f60820a != activity) {
            return;
        }
        ToastImpl toastImpl = this.f60821b;
        if (toastImpl != null) {
            Intrinsics.m97799e(toastImpl);
            toastImpl.m79271e();
        }
        m79296c();
        this.f60820a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ToastImpl toastImpl;
        Intrinsics.m97802h(activity, "activity");
        if (this.f60820a == activity && (toastImpl = this.f60821b) != null) {
            Intrinsics.m97799e(toastImpl);
            toastImpl.m79271e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
    }
}
