package com.transsion.subroom.activity;

import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.transsion.subroom.activity.o */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C19627o implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TabLayout.TabView f62691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainActivity f62692b;

    public /* synthetic */ C19627o(TabLayout.TabView tabView, MainActivity mainActivity) {
        this.f62691a = tabView;
        this.f62692b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return MainActivity.m81645p0(this.f62691a, this.f62692b, (Integer) obj);
    }
}
