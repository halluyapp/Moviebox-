package com.transsion.shorttv.base.locale;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import gs.InterfaceC23669a;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv.base.locale.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18774e implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d */
    public static final a f60635d = new a(null);

    /* JADX INFO: renamed from: a */
    private final SparseArray f60636a = new SparseArray(4);

    /* JADX INFO: renamed from: b */
    private int f60637b;

    /* JADX INFO: renamed from: c */
    private Integer f60638c;

    /* JADX INFO: renamed from: com.transsion.shorttv.base.locale.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.base.locale.e$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private final Activity f60639a;

        /* JADX INFO: renamed from: b */
        private Locale f60640b;

        /* JADX INFO: renamed from: c */
        private Locale f60641c;

        public b(Activity activity) {
            Intrinsics.m97802h(activity, "activity");
            this.f60639a = activity;
        }

        /* JADX INFO: renamed from: a */
        public final Activity m79129a() {
            return this.f60639a;
        }

        /* JADX INFO: renamed from: b */
        public final Locale m79130b() {
            return this.f60641c;
        }

        /* JADX INFO: renamed from: c */
        public final Locale m79131c() {
            return this.f60640b;
        }

        /* JADX INFO: renamed from: d */
        public final void m79132d(Locale locale) {
            this.f60641c = locale;
        }

        /* JADX INFO: renamed from: e */
        public final void m79133e(Locale locale) {
            this.f60640b = locale;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private final void m79124a(View view) {
        if (view instanceof InterfaceC23669a) {
            ((InterfaceC23669a) view).changeLocal();
        } else if (view instanceof ViewGroup) {
            Iterator f76053a = ViewGroupKt.getChildren((ViewGroup) view).getF76053a();
            while (f76053a.hasNext()) {
                m79124a((View) f76053a.next());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m79125b(Activity activity) {
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManagerCB", "notifyActivityChangedLocale()-> activity = " + activity + " , waitChangedCount = " + this.f60637b, false, 4, null);
        if (this.f60637b <= 0) {
            return;
        }
        b bVar = (b) this.f60636a.get(System.identityHashCode(activity));
        if ((bVar != null ? bVar.m79131c() : null) == null) {
            return;
        }
        this.f60637b--;
        boolean z11 = TextUtils.getLayoutDirectionFromLocale(bVar.m79130b()) == TextUtils.getLayoutDirectionFromLocale(bVar.m79131c());
        bVar.m79132d(bVar.m79131c());
        bVar.m79133e(null);
        if (z11) {
            return;
        }
        m79127d(activity);
    }

    /* JADX INFO: renamed from: c */
    private final void m79126c() {
        Integer num = this.f60638c;
        if (num == null) {
            return;
        }
        SparseArray sparseArray = this.f60636a;
        Intrinsics.m97799e(num);
        b bVar = (b) sparseArray.get(num.intValue());
        if (bVar == null) {
            return;
        }
        m79125b(bVar.m79129a());
    }

    /* JADX INFO: renamed from: d */
    private final void m79127d(Activity activity) {
        activity.finish();
        Intent intent = activity.getIntent();
        intent.putExtra("extra_language_activity_restart", true);
        activity.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX INFO: renamed from: e */
    public final void m79128e(Locale locale) {
        int i11;
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new UnsupportedOperationException();
        }
        int size = this.f60636a.size();
        boolean z11 = false;
        if (size <= 0) {
            this.f60637b = 0;
            return;
        }
        int i12 = this.f60637b;
        int i13 = 0;
        while (i13 < size) {
            b bVar = (b) this.f60636a.valueAt(i13);
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> localeState = " + bVar, false, 4, null);
            if (bVar == null) {
                i11 = size;
            } else {
                Activity activityM79129a = bVar.m79129a();
                boolean z12 = (activityM79129a.isFinishing() || activityM79129a.isDestroyed()) ? true : z11;
                boolean z13 = z12;
                C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> activityFinished = " + z12, false, 4, null);
                if (z13) {
                    i11 = size;
                } else {
                    Locale localeM79130b = bVar.m79130b();
                    Intrinsics.m97799e(localeM79130b);
                    String language = localeM79130b.getLanguage();
                    Intrinsics.m97799e(locale);
                    String language2 = locale.getLanguage();
                    Locale localeM79131c = bVar.m79131c();
                    boolean z14 = TextUtils.getLayoutDirectionFromLocale(localeM79130b) != TextUtils.getLayoutDirectionFromLocale(locale) ? z11 : true;
                    i11 = size;
                    C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> locale = " + locale + " , activityLocale = " + localeM79130b + " , expectLocale = " + localeM79131c + " , isSameDirection = " + z14, false, 4, null);
                    if (Intrinsics.m97797c(language, language2)) {
                        bVar.m79133e(null);
                        if (localeM79131c != null) {
                            i12--;
                            C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> waitChangedCount--", false, 4, null);
                        }
                    } else {
                        bVar.m79133e(locale);
                        if (localeM79131c == null) {
                            i12++;
                            C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> waitChangedCount++", false, 4, null);
                        }
                        if (z14) {
                            Configuration configuration = activityM79129a.getResources().getConfiguration();
                            Intrinsics.m97801g(configuration, "getConfiguration(...)");
                            Resources resources = activityM79129a.getResources();
                            Intrinsics.m97801g(resources, "getResources(...)");
                            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                            Intrinsics.m97801g(displayMetrics, "getDisplayMetrics(...)");
                            bVar.m79132d(locale);
                            bVar.m79133e(null);
                            configuration.setLocale(locale);
                            resources.updateConfiguration(configuration, displayMetrics);
                            View viewFindViewById = activityM79129a.getWindow().getDecorView().findViewById(R.id.content);
                            if (viewFindViewById != null) {
                                m79124a(viewFindViewById);
                            }
                        }
                    }
                }
            }
            i13++;
            size = i11;
            z11 = false;
        }
        this.f60637b = i12;
        m79126c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.m97802h(activity, "activity");
        int iIdentityHashCode = System.identityHashCode(activity);
        b bVar = new b(activity);
        bVar.m79132d(C18773d.f60624f.m79121d(activity));
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManagerCB", "onActivityCreated()-> " + activity + " , curLocale = " + bVar.m79130b(), false, 4, null);
        this.f60636a.put(iIdentityHashCode, bVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        int iIdentityHashCode = System.identityHashCode(activity);
        b bVar = (b) this.f60636a.get(iIdentityHashCode);
        if ((bVar != null ? bVar.m79131c() : null) != null) {
            bVar.m79133e(null);
            this.f60637b--;
        }
        this.f60636a.remove(iIdentityHashCode);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        int iIdentityHashCode = System.identityHashCode(activity);
        Integer num = this.f60638c;
        if (num == null || num == null || iIdentityHashCode != num.intValue()) {
            return;
        }
        this.f60638c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManagerCB", "onActivityResumed()-> " + activity, false, 4, null);
        this.f60638c = Integer.valueOf(System.identityHashCode(activity));
        m79125b(activity);
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
