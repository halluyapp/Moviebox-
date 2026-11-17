package com.transsion.subroom.activity;

import android.view.View;

/* JADX INFO: renamed from: com.transsion.subroom.activity.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ViewOnClickListenerC19623k implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f62683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f62684b;

    public /* synthetic */ ViewOnClickListenerC19623k(MainActivity mainActivity, int i11) {
        this.f62683a = mainActivity;
        this.f62684b = i11;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity.m81653t0(this.f62683a, this.f62684b, view);
    }
}
