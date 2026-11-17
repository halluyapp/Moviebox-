package com.transsion.subroom.activity;

import android.view.View;
import com.transsion.home.bean.BottomTabItem;

/* JADX INFO: renamed from: com.transsion.subroom.activity.n */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ViewOnClickListenerC19626n implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f62688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f62689b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BottomTabItem f62690c;

    public /* synthetic */ ViewOnClickListenerC19626n(MainActivity mainActivity, int i11, BottomTabItem bottomTabItem) {
        this.f62688a = mainActivity;
        this.f62689b = i11;
        this.f62690c = bottomTabItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainActivity.m81627g0(this.f62688a, this.f62689b, this.f62690c, view);
    }
}
