package com.transsion.shorttv_pugc.base.widget.toast.core;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import p719qt.InterfaceC27126a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.toast.core.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C19270b implements InterfaceC27126a {

    /* JADX INFO: renamed from: a */
    private ToastImpl f61904a;

    /* JADX INFO: renamed from: b */
    private View f61905b;

    /* JADX INFO: renamed from: c */
    private TextView f61906c;

    /* JADX INFO: renamed from: d */
    private int f61907d;

    /* JADX INFO: renamed from: e */
    private int f61908e;

    /* JADX INFO: renamed from: f */
    private int f61909f;

    /* JADX INFO: renamed from: g */
    private int f61910g;

    /* JADX INFO: renamed from: h */
    private float f61911h;

    /* JADX INFO: renamed from: i */
    private float f61912i;

    public C19270b(Activity activity) {
        this.f61904a = new ToastImpl(activity, this);
    }

    @Override // p719qt.InterfaceC27126a
    /* JADX INFO: renamed from: a */
    public boolean mo80705a() {
        return this.f61906c == null;
    }

    /* JADX INFO: renamed from: b */
    public TextView m80706b(View view) {
        return InterfaceC27126a.a.m105547a(this, view);
    }

    @Override // p719qt.InterfaceC27126a
    public void cancel() {
        ToastImpl toastImpl = this.f61904a;
        if (toastImpl != null) {
            toastImpl.m80698e();
        }
    }

    @Override // p719qt.InterfaceC27126a
    public int getDuration() {
        return this.f61908e;
    }

    @Override // p719qt.InterfaceC27126a
    public int getGravity() {
        return this.f61907d;
    }

    @Override // p719qt.InterfaceC27126a
    public float getHorizontalMargin() {
        return this.f61911h;
    }

    @Override // p719qt.InterfaceC27126a
    public float getVerticalMargin() {
        return this.f61912i;
    }

    @Override // p719qt.InterfaceC27126a
    public View getView() {
        return this.f61905b;
    }

    @Override // p719qt.InterfaceC27126a
    public int getXOffset() {
        return this.f61909f;
    }

    @Override // p719qt.InterfaceC27126a
    public int getYOffset() {
        return this.f61910g;
    }

    @Override // p719qt.InterfaceC27126a
    public void setDuration(int i11) {
        this.f61908e = i11;
    }

    @Override // p719qt.InterfaceC27126a
    public void setGravity(int i11, int i12, int i13) {
        this.f61907d = i11;
        this.f61909f = i12;
        this.f61910g = i13;
    }

    @Override // p719qt.InterfaceC27126a
    public void setMargin(float f11, float f12) {
        this.f61911h = f11;
        this.f61912i = f12;
    }

    @Override // p719qt.InterfaceC27126a
    public void setText(CharSequence charSequence) {
        TextView textView = this.f61906c;
        if (textView == null) {
            return;
        }
        Intrinsics.m97799e(textView);
        textView.setText(charSequence);
    }

    @Override // p719qt.InterfaceC27126a
    public void setView(View view) {
        this.f61905b = view;
        if (view == null) {
            this.f61906c = null;
        } else {
            Intrinsics.m97799e(view);
            this.f61906c = m80706b(view);
        }
    }

    @Override // p719qt.InterfaceC27126a
    public void show() {
        ToastImpl toastImpl = this.f61904a;
        if (toastImpl != null) {
            toastImpl.m80701h();
        }
    }
}
