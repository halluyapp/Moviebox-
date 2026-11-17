package com.transsion.shorttv.base.widget.toast.core;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import ls.InterfaceC25675a;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C18806b implements InterfaceC25675a {

    /* JADX INFO: renamed from: a */
    private ToastImpl f60799a;

    /* JADX INFO: renamed from: b */
    private View f60800b;

    /* JADX INFO: renamed from: c */
    private TextView f60801c;

    /* JADX INFO: renamed from: d */
    private int f60802d;

    /* JADX INFO: renamed from: e */
    private int f60803e;

    /* JADX INFO: renamed from: f */
    private int f60804f;

    /* JADX INFO: renamed from: g */
    private int f60805g;

    /* JADX INFO: renamed from: h */
    private float f60806h;

    /* JADX INFO: renamed from: i */
    private float f60807i;

    public C18806b(Activity activity) {
        this.f60799a = new ToastImpl(activity, this);
    }

    @Override // ls.InterfaceC25675a
    /* JADX INFO: renamed from: a */
    public boolean mo79278a() {
        return this.f60801c == null;
    }

    /* JADX INFO: renamed from: b */
    public TextView m79279b(View view) {
        return InterfaceC25675a.a.m101039a(this, view);
    }

    @Override // ls.InterfaceC25675a
    public void cancel() {
        ToastImpl toastImpl = this.f60799a;
        if (toastImpl != null) {
            toastImpl.m79271e();
        }
    }

    @Override // ls.InterfaceC25675a
    public int getDuration() {
        return this.f60803e;
    }

    @Override // ls.InterfaceC25675a
    public int getGravity() {
        return this.f60802d;
    }

    @Override // ls.InterfaceC25675a
    public float getHorizontalMargin() {
        return this.f60806h;
    }

    @Override // ls.InterfaceC25675a
    public float getVerticalMargin() {
        return this.f60807i;
    }

    @Override // ls.InterfaceC25675a
    public View getView() {
        return this.f60800b;
    }

    @Override // ls.InterfaceC25675a
    public int getXOffset() {
        return this.f60804f;
    }

    @Override // ls.InterfaceC25675a
    public int getYOffset() {
        return this.f60805g;
    }

    @Override // ls.InterfaceC25675a
    public void setDuration(int i11) {
        this.f60803e = i11;
    }

    @Override // ls.InterfaceC25675a
    public void setGravity(int i11, int i12, int i13) {
        this.f60802d = i11;
        this.f60804f = i12;
        this.f60805g = i13;
    }

    @Override // ls.InterfaceC25675a
    public void setMargin(float f11, float f12) {
        this.f60806h = f11;
        this.f60807i = f12;
    }

    @Override // ls.InterfaceC25675a
    public void setText(CharSequence charSequence) {
        TextView textView = this.f60801c;
        if (textView == null) {
            return;
        }
        Intrinsics.m97799e(textView);
        textView.setText(charSequence);
    }

    @Override // ls.InterfaceC25675a
    public void setView(View view) {
        this.f60800b = view;
        if (view == null) {
            this.f60801c = null;
        } else {
            Intrinsics.m97799e(view);
            this.f60801c = m79279b(view);
        }
    }

    @Override // ls.InterfaceC25675a
    public void show() {
        ToastImpl toastImpl = this.f60799a;
        if (toastImpl != null) {
            toastImpl.m79274h();
        }
    }
}
