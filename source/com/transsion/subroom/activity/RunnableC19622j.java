package com.transsion.subroom.activity;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: com.transsion.subroom.activity.j */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC19622j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f62681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TabLayout.TabView f62682b;

    public /* synthetic */ RunnableC19622j(MainActivity mainActivity, TabLayout.TabView tabView) {
        this.f62681a = mainActivity;
        this.f62682b = tabView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity.m81657v0(this.f62681a, this.f62682b);
    }
}
