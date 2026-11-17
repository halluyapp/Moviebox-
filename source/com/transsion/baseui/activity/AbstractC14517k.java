package com.transsion.baseui.activity;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.baseui.activity.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14517k {
    /* JADX INFO: renamed from: a */
    public static final void m65403a(String tag) {
        Intrinsics.m97802h(tag, "tag");
        C26866a.f81698a.m104918p(tag, new String[]{"Application onCreate"}, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m65404b(String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m65403a(str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m65405c(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onCreate"}, true);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m65406d(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m65405c(str, activity);
    }

    /* JADX INFO: renamed from: e */
    public static final void m65407e(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onDestroy"}, true);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m65408f(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m65407e(str, activity);
    }

    /* JADX INFO: renamed from: g */
    public static final void m65409g(String tag, Fragment fragment, boolean z11, String other) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(other, "other");
        C26866a.f81698a.m104918p(tag, new String[]{fragment.getClass().getSimpleName() + " hidden=" + z11 + " " + other}, true);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m65410h(String str, Fragment fragment, boolean z11, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        if ((i11 & 8) != 0) {
            str2 = "";
        }
        m65409g(str, fragment, z11, str2);
    }

    /* JADX INFO: renamed from: i */
    public static final void m65411i(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onPause"}, true);
    }

    /* JADX INFO: renamed from: j */
    public static final void m65412j(String tag, Fragment fragment, String other) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(other, "other");
        C26866a.f81698a.m104918p(tag, new String[]{fragment.getClass().getSimpleName() + " onPause " + other}, true);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m65413k(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m65411i(str, activity);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m65414l(String str, Fragment fragment, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        m65412j(str, fragment, str2);
    }

    /* JADX INFO: renamed from: m */
    public static final void m65415m(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onResume"}, true);
    }

    /* JADX INFO: renamed from: n */
    public static final void m65416n(String tag, Fragment fragment, String other) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(other, "other");
        C26866a.f81698a.m104918p(tag, new String[]{fragment.getClass().getSimpleName() + " onResume " + other}, true);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m65417o(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m65415m(str, activity);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m65418p(String str, Fragment fragment, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        m65416n(str, fragment, str2);
    }
}
