package com.transsion.subroom.activity;

import android.widget.ImageView;
import kotlin.jvm.functions.Function1;
import p390ex.C23242b;

/* JADX INFO: renamed from: com.transsion.subroom.activity.l */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C19624l implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f62685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageView f62686b;

    public /* synthetic */ C19624l(MainActivity mainActivity, ImageView imageView) {
        this.f62685a = mainActivity;
        this.f62686b = imageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return MainActivity.m81631i0(this.f62685a, this.f62686b, (C23242b) obj);
    }
}
