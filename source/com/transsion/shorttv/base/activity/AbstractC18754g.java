package com.transsion.shorttv.base.activity;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv.base.activity.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18754g {
    /* JADX INFO: renamed from: a */
    public static final void m79003a(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onDestroy"}, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m79004b(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m79003a(str, activity);
    }

    /* JADX INFO: renamed from: c */
    public static final void m79005c(String tag, Fragment fragment, boolean z11, String other) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(other, "other");
        C26866a.f81698a.m104918p(tag, new String[]{fragment.getClass().getSimpleName() + " hidden=" + z11 + " " + other}, true);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79006d(String str, Fragment fragment, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        if ((i11 & 8) != 0) {
            str2 = "";
        }
        m79005c(str, fragment, z11, str2);
    }

    /* JADX INFO: renamed from: e */
    public static final void m79007e(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onPause"}, true);
    }

    /* JADX INFO: renamed from: f */
    public static final void m79008f(String tag, Fragment fragment, String other) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(other, "other");
        C26866a.f81698a.m104918p(tag, new String[]{fragment.getClass().getSimpleName() + " onPause " + other}, true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m79009g(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m79007e(str, activity);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m79010h(String str, Fragment fragment, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        m79008f(str, fragment, str2);
    }

    /* JADX INFO: renamed from: i */
    public static final void m79011i(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onResume"}, true);
    }

    /* JADX INFO: renamed from: j */
    public static final void m79012j(String tag, Fragment fragment, String other) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(other, "other");
        C26866a.f81698a.m104918p(tag, new String[]{fragment.getClass().getSimpleName() + " onResume " + other}, true);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m79013k(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m79011i(str, activity);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m79014l(String str, Fragment fragment, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        m79012j(str, fragment, str2);
    }
}
