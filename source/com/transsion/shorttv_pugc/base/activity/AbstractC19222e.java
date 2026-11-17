package com.transsion.shorttv_pugc.base.activity;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.activity.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19222e {
    /* JADX INFO: renamed from: a */
    public static final void m80447a(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onDestroy"}, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80448b(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m80447a(str, activity);
    }

    /* JADX INFO: renamed from: c */
    public static final void m80449c(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onPause"}, true);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m80450d(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m80449c(str, activity);
    }

    /* JADX INFO: renamed from: e */
    public static final void m80451e(String tag, Activity activity) {
        Intrinsics.m97802h(tag, "tag");
        Intrinsics.m97802h(activity, "activity");
        C26866a.f81698a.m104918p(tag, new String[]{activity.getLocalClassName() + " onResume"}, true);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m80452f(String str, Activity activity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "CommonInfo";
        }
        m80451e(str, activity);
    }
}
