package com.transsion.shorttv_pugc.base.widget.toast.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p719qt.InterfaceC27126a;
import p719qt.InterfaceC27127b;
import p719qt.InterfaceC27128c;
import p753rt.C27373a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.toast.core.g */
/* JADX INFO: loaded from: classes6.dex */
public class HandlerC19275g extends Handler implements InterfaceC27127b {

    /* JADX INFO: renamed from: e */
    public static final a f61916e = new a(null);

    /* JADX INFO: renamed from: a */
    private Application f61917a;

    /* JADX INFO: renamed from: b */
    private C19269a f61918b;

    /* JADX INFO: renamed from: c */
    private WeakReference f61919c;

    /* JADX INFO: renamed from: d */
    private InterfaceC27128c f61920d;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.toast.core.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HandlerC19275g() {
        super(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: d */
    private final int m80708d(CharSequence charSequence) {
        return charSequence.length() > 20 ? 1 : 0;
    }

    @Override // p719qt.InterfaceC27127b
    /* JADX INFO: renamed from: a */
    public void mo80709a(CharSequence charSequence) {
        removeMessages(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = charSequence;
        sendMessageDelayed(messageObtain, 200L);
    }

    @Override // p719qt.InterfaceC27127b
    /* JADX INFO: renamed from: b */
    public void mo80710b(InterfaceC27128c interfaceC27128c) {
        this.f61920d = interfaceC27128c;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX INFO: renamed from: c */
    public InterfaceC27126a m80711c(Application application) {
        InterfaceC27126a c19272d;
        C19269a c19269a = this.f61918b;
        Intrinsics.m97799e(c19269a);
        Activity activityM80703a = c19269a.m80703a();
        if (activityM80703a != null) {
            c19272d = new C19270b(activityM80703a);
        } else {
            c19272d = Build.VERSION.SDK_INT == 25 ? new C19272d(application) : new C19273e(application);
        }
        if ((c19272d instanceof C19270b) || Build.VERSION.SDK_INT < 30) {
            InterfaceC27128c interfaceC27128c = this.f61920d;
            Intrinsics.m97799e(interfaceC27128c);
            c19272d.setView(interfaceC27128c.createView(application));
            InterfaceC27128c interfaceC27128c2 = this.f61920d;
            Intrinsics.m97799e(interfaceC27128c2);
            int gravity = interfaceC27128c2.getGravity();
            InterfaceC27128c interfaceC27128c3 = this.f61920d;
            Intrinsics.m97799e(interfaceC27128c3);
            int xOffset = interfaceC27128c3.getXOffset();
            InterfaceC27128c interfaceC27128c4 = this.f61920d;
            Intrinsics.m97799e(interfaceC27128c4);
            c19272d.setGravity(gravity, xOffset, interfaceC27128c4.getYOffset());
            InterfaceC27128c interfaceC27128c5 = this.f61920d;
            Intrinsics.m97799e(interfaceC27128c5);
            float horizontalMargin = interfaceC27128c5.getHorizontalMargin();
            InterfaceC27128c interfaceC27128c6 = this.f61920d;
            Intrinsics.m97799e(interfaceC27128c6);
            c19272d.setMargin(horizontalMargin, interfaceC27128c6.getVerticalMargin());
        } else {
            Intrinsics.m97799e(application);
            if (application.getApplicationInfo().targetSdkVersion < 30) {
                InterfaceC27128c interfaceC27128c7 = this.f61920d;
                Intrinsics.m97799e(interfaceC27128c7);
                c19272d.setView(interfaceC27128c7.createView(application));
                InterfaceC27128c interfaceC27128c8 = this.f61920d;
                Intrinsics.m97799e(interfaceC27128c8);
                int gravity2 = interfaceC27128c8.getGravity();
                InterfaceC27128c interfaceC27128c9 = this.f61920d;
                Intrinsics.m97799e(interfaceC27128c9);
                int xOffset2 = interfaceC27128c9.getXOffset();
                InterfaceC27128c interfaceC27128c10 = this.f61920d;
                Intrinsics.m97799e(interfaceC27128c10);
                c19272d.setGravity(gravity2, xOffset2, interfaceC27128c10.getYOffset());
                InterfaceC27128c interfaceC27128c11 = this.f61920d;
                Intrinsics.m97799e(interfaceC27128c11);
                float horizontalMargin2 = interfaceC27128c11.getHorizontalMargin();
                InterfaceC27128c interfaceC27128c12 = this.f61920d;
                Intrinsics.m97799e(interfaceC27128c12);
                c19272d.setMargin(horizontalMargin2, interfaceC27128c12.getVerticalMargin());
            }
        }
        return c19272d;
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        InterfaceC27126a interfaceC27126a;
        Intrinsics.m97802h(msg, "msg");
        WeakReference weakReference = this.f61919c;
        if (weakReference != null) {
            Intrinsics.m97799e(weakReference);
            interfaceC27126a = (InterfaceC27126a) weakReference.get();
        } else {
            interfaceC27126a = null;
        }
        int i11 = msg.what;
        if (i11 != 1) {
            if (i11 == 2 && interfaceC27126a != null) {
                interfaceC27126a.cancel();
                return;
            }
            return;
        }
        Object obj = msg.obj;
        if (obj instanceof CharSequence) {
            Intrinsics.m97800f(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            CharSequence charSequence = (CharSequence) obj;
            if (interfaceC27126a != null) {
                interfaceC27126a.cancel();
            }
            InterfaceC27126a interfaceC27126aM80711c = m80711c(this.f61917a);
            this.f61919c = new WeakReference(interfaceC27126aM80711c);
            Intrinsics.m97799e(interfaceC27126aM80711c);
            interfaceC27126aM80711c.setDuration(m80708d(charSequence));
            interfaceC27126aM80711c.setText(charSequence);
            interfaceC27126aM80711c.show();
            mo80710b(new C27373a());
        }
    }

    @Override // p719qt.InterfaceC27127b
    public void registerStrategy(Application application) {
        this.f61917a = application;
        C19269a.a aVar = C19269a.f61902b;
        Intrinsics.m97799e(application);
        this.f61918b = aVar.m80704a(application);
    }
}
