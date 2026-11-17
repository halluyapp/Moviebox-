package com.transsion.shorttv_pugc.base.locale;

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
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lt.InterfaceC25678a;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.locale.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C19240e implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d */
    public static final a f61741d = new a(null);

    /* JADX INFO: renamed from: a */
    private final SparseArray f61742a = new SparseArray(4);

    /* JADX INFO: renamed from: b */
    private int f61743b;

    /* JADX INFO: renamed from: c */
    private Integer f61744c;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.locale.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.locale.e$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private final Activity f61745a;

        /* JADX INFO: renamed from: b */
        private Locale f61746b;

        /* JADX INFO: renamed from: c */
        private Locale f61747c;

        public b(Activity activity) {
            Intrinsics.m97802h(activity, "activity");
            this.f61745a = activity;
        }

        /* JADX INFO: renamed from: a */
        public final Activity m80559a() {
            return this.f61745a;
        }

        /* JADX INFO: renamed from: b */
        public final Locale m80560b() {
            return this.f61747c;
        }

        /* JADX INFO: renamed from: c */
        public final Locale m80561c() {
            return this.f61746b;
        }

        /* JADX INFO: renamed from: d */
        public final void m80562d(Locale locale) {
            this.f61747c = locale;
        }

        /* JADX INFO: renamed from: e */
        public final void m80563e(Locale locale) {
            this.f61746b = locale;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private final void m80554a(View view) {
        if (view instanceof InterfaceC25678a) {
            ((InterfaceC25678a) view).changeLocal();
        } else if (view instanceof ViewGroup) {
            Iterator f76053a = ViewGroupKt.getChildren((ViewGroup) view).getF76053a();
            while (f76053a.hasNext()) {
                m80554a((View) f76053a.next());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m80555b(Activity activity) {
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManagerCB", "notifyActivityChangedLocale()-> activity = " + activity + " , waitChangedCount = " + this.f61743b, false, 4, null);
        if (this.f61743b <= 0) {
            return;
        }
        b bVar = (b) this.f61742a.get(System.identityHashCode(activity));
        if ((bVar != null ? bVar.m80561c() : null) == null) {
            return;
        }
        this.f61743b--;
        boolean z11 = TextUtils.getLayoutDirectionFromLocale(bVar.m80560b()) == TextUtils.getLayoutDirectionFromLocale(bVar.m80561c());
        bVar.m80562d(bVar.m80561c());
        bVar.m80563e(null);
        if (z11) {
            return;
        }
        m80557d(activity);
    }

    /* JADX INFO: renamed from: c */
    private final void m80556c() {
        Integer num = this.f61744c;
        if (num == null) {
            return;
        }
        SparseArray sparseArray = this.f61742a;
        Intrinsics.m97799e(num);
        b bVar = (b) sparseArray.get(num.intValue());
        if (bVar == null) {
            return;
        }
        m80555b(bVar.m80559a());
    }

    /* JADX INFO: renamed from: d */
    private final void m80557d(Activity activity) {
        activity.finish();
        Intent intent = activity.getIntent();
        intent.putExtra("extra_language_activity_restart", true);
        activity.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX INFO: renamed from: e */
    public final void m80558e(Locale locale) {
        int i11;
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new UnsupportedOperationException();
        }
        int size = this.f61742a.size();
        boolean z11 = false;
        if (size <= 0) {
            this.f61743b = 0;
            return;
        }
        int i12 = this.f61743b;
        int i13 = 0;
        while (i13 < size) {
            b bVar = (b) this.f61742a.valueAt(i13);
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> localeState = " + bVar, false, 4, null);
            if (bVar == null) {
                i11 = size;
            } else {
                Activity activityM80559a = bVar.m80559a();
                boolean z12 = (activityM80559a.isFinishing() || activityM80559a.isDestroyed()) ? true : z11;
                boolean z13 = z12;
                C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> activityFinished = " + z12, false, 4, null);
                if (z13) {
                    i11 = size;
                } else {
                    Locale localeM80560b = bVar.m80560b();
                    Intrinsics.m97799e(localeM80560b);
                    String language = localeM80560b.getLanguage();
                    Intrinsics.m97799e(locale);
                    String language2 = locale.getLanguage();
                    Locale localeM80561c = bVar.m80561c();
                    boolean z14 = TextUtils.getLayoutDirectionFromLocale(localeM80560b) != TextUtils.getLayoutDirectionFromLocale(locale) ? z11 : true;
                    i11 = size;
                    C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> locale = " + locale + " , activityLocale = " + localeM80560b + " , expectLocale = " + localeM80561c + " , isSameDirection = " + z14, false, 4, null);
                    if (Intrinsics.m97797c(language, language2)) {
                        bVar.m80563e(null);
                        if (localeM80561c != null) {
                            i12--;
                            C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> waitChangedCount--", false, 4, null);
                        }
                    } else {
                        bVar.m80563e(locale);
                        if (localeM80561c == null) {
                            i12++;
                            C26866a.a.m104898f(aVar, "LocaleManagerCB", "setLocaleChanged()-> waitChangedCount++", false, 4, null);
                        }
                        if (z14) {
                            Configuration configuration = activityM80559a.getResources().getConfiguration();
                            Intrinsics.m97801g(configuration, "getConfiguration(...)");
                            Resources resources = activityM80559a.getResources();
                            Intrinsics.m97801g(resources, "getResources(...)");
                            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                            Intrinsics.m97801g(displayMetrics, "getDisplayMetrics(...)");
                            bVar.m80562d(locale);
                            bVar.m80563e(null);
                            configuration.setLocale(locale);
                            resources.updateConfiguration(configuration, displayMetrics);
                            View viewFindViewById = activityM80559a.getWindow().getDecorView().findViewById(R.id.content);
                            if (viewFindViewById != null) {
                                m80554a(viewFindViewById);
                            }
                        }
                    }
                }
            }
            i13++;
            size = i11;
            z11 = false;
        }
        this.f61743b = i12;
        m80556c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.m97802h(activity, "activity");
        int iIdentityHashCode = System.identityHashCode(activity);
        b bVar = new b(activity);
        bVar.m80562d(C19239d.f61730f.m80551d(activity));
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManagerCB", "onActivityCreated()-> " + activity + " , curLocale = " + bVar.m80560b(), false, 4, null);
        this.f61742a.put(iIdentityHashCode, bVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        int iIdentityHashCode = System.identityHashCode(activity);
        b bVar = (b) this.f61742a.get(iIdentityHashCode);
        if ((bVar != null ? bVar.m80561c() : null) != null) {
            bVar.m80563e(null);
            this.f61743b--;
        }
        this.f61742a.remove(iIdentityHashCode);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        int iIdentityHashCode = System.identityHashCode(activity);
        Integer num = this.f61744c;
        if (num == null || num == null || iIdentityHashCode != num.intValue()) {
            return;
        }
        this.f61744c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManagerCB", "onActivityResumed()-> " + activity, false, 4, null);
        this.f61744c = Integer.valueOf(System.identityHashCode(activity));
        m80555b(activity);
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
