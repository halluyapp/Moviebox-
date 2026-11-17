package com.transsion.shorttv.base.widget.toast.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18805a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    public static final a f60797b = new a(null);

    /* JADX INFO: renamed from: a */
    private Activity f60798a;

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C18805a m79277a(Application application) {
            Intrinsics.m97802h(application, "application");
            C18805a c18805a = new C18805a();
            application.registerActivityLifecycleCallbacks(c18805a);
            return c18805a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Activity m79276a() {
        return this.f60798a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.m97802h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        if (this.f60798a != activity) {
            return;
        }
        this.f60798a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        this.f60798a = activity;
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
