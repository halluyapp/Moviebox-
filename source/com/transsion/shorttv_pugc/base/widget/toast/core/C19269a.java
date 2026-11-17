package com.transsion.shorttv_pugc.base.widget.toast.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.toast.core.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C19269a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    public static final a f61902b = new a(null);

    /* JADX INFO: renamed from: a */
    private Activity f61903a;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.toast.core.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C19269a m80704a(Application application) {
            Intrinsics.m97802h(application, "application");
            C19269a c19269a = new C19269a();
            application.registerActivityLifecycleCallbacks(c19269a);
            return c19269a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Activity m80703a() {
        return this.f61903a;
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
        if (this.f61903a != activity) {
            return;
        }
        this.f61903a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        this.f61903a = activity;
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
