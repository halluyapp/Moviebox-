package com.transsion.shorttv.base.widget.toast.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ls.InterfaceC25675a;
import ls.InterfaceC25676b;
import ls.InterfaceC25677c;
import ms.C25904a;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.g */
/* JADX INFO: loaded from: classes6.dex */
public class HandlerC18811g extends Handler implements InterfaceC25676b {

    /* JADX INFO: renamed from: e */
    public static final a f60811e = new a(null);

    /* JADX INFO: renamed from: a */
    private Application f60812a;

    /* JADX INFO: renamed from: b */
    private C18805a f60813b;

    /* JADX INFO: renamed from: c */
    private WeakReference f60814c;

    /* JADX INFO: renamed from: d */
    private InterfaceC25677c f60815d;

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HandlerC18811g() {
        super(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: d */
    private final int m79281d(CharSequence charSequence) {
        return charSequence.length() > 20 ? 1 : 0;
    }

    @Override // ls.InterfaceC25676b
    /* JADX INFO: renamed from: a */
    public void mo79282a(CharSequence charSequence) {
        removeMessages(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = charSequence;
        sendMessageDelayed(messageObtain, 200L);
    }

    @Override // ls.InterfaceC25676b
    /* JADX INFO: renamed from: b */
    public void mo79283b(InterfaceC25677c interfaceC25677c) {
        this.f60815d = interfaceC25677c;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX INFO: renamed from: c */
    public InterfaceC25675a m79284c(Application application) {
        InterfaceC25675a c18808d;
        C18805a c18805a = this.f60813b;
        Intrinsics.m97799e(c18805a);
        Activity activityM79276a = c18805a.m79276a();
        if (activityM79276a != null) {
            c18808d = new C18806b(activityM79276a);
        } else {
            c18808d = Build.VERSION.SDK_INT == 25 ? new C18808d(application) : new C18809e(application);
        }
        if ((c18808d instanceof C18806b) || Build.VERSION.SDK_INT < 30) {
            InterfaceC25677c interfaceC25677c = this.f60815d;
            Intrinsics.m97799e(interfaceC25677c);
            c18808d.setView(interfaceC25677c.createView(application));
            InterfaceC25677c interfaceC25677c2 = this.f60815d;
            Intrinsics.m97799e(interfaceC25677c2);
            int gravity = interfaceC25677c2.getGravity();
            InterfaceC25677c interfaceC25677c3 = this.f60815d;
            Intrinsics.m97799e(interfaceC25677c3);
            int xOffset = interfaceC25677c3.getXOffset();
            InterfaceC25677c interfaceC25677c4 = this.f60815d;
            Intrinsics.m97799e(interfaceC25677c4);
            c18808d.setGravity(gravity, xOffset, interfaceC25677c4.getYOffset());
            InterfaceC25677c interfaceC25677c5 = this.f60815d;
            Intrinsics.m97799e(interfaceC25677c5);
            float horizontalMargin = interfaceC25677c5.getHorizontalMargin();
            InterfaceC25677c interfaceC25677c6 = this.f60815d;
            Intrinsics.m97799e(interfaceC25677c6);
            c18808d.setMargin(horizontalMargin, interfaceC25677c6.getVerticalMargin());
        } else {
            Intrinsics.m97799e(application);
            if (application.getApplicationInfo().targetSdkVersion < 30) {
                InterfaceC25677c interfaceC25677c7 = this.f60815d;
                Intrinsics.m97799e(interfaceC25677c7);
                c18808d.setView(interfaceC25677c7.createView(application));
                InterfaceC25677c interfaceC25677c8 = this.f60815d;
                Intrinsics.m97799e(interfaceC25677c8);
                int gravity2 = interfaceC25677c8.getGravity();
                InterfaceC25677c interfaceC25677c9 = this.f60815d;
                Intrinsics.m97799e(interfaceC25677c9);
                int xOffset2 = interfaceC25677c9.getXOffset();
                InterfaceC25677c interfaceC25677c10 = this.f60815d;
                Intrinsics.m97799e(interfaceC25677c10);
                c18808d.setGravity(gravity2, xOffset2, interfaceC25677c10.getYOffset());
                InterfaceC25677c interfaceC25677c11 = this.f60815d;
                Intrinsics.m97799e(interfaceC25677c11);
                float horizontalMargin2 = interfaceC25677c11.getHorizontalMargin();
                InterfaceC25677c interfaceC25677c12 = this.f60815d;
                Intrinsics.m97799e(interfaceC25677c12);
                c18808d.setMargin(horizontalMargin2, interfaceC25677c12.getVerticalMargin());
            }
        }
        return c18808d;
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        InterfaceC25675a interfaceC25675a;
        Intrinsics.m97802h(msg, "msg");
        WeakReference weakReference = this.f60814c;
        if (weakReference != null) {
            Intrinsics.m97799e(weakReference);
            interfaceC25675a = (InterfaceC25675a) weakReference.get();
        } else {
            interfaceC25675a = null;
        }
        int i11 = msg.what;
        if (i11 != 1) {
            if (i11 == 2 && interfaceC25675a != null) {
                interfaceC25675a.cancel();
                return;
            }
            return;
        }
        Object obj = msg.obj;
        if (obj instanceof CharSequence) {
            Intrinsics.m97800f(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            CharSequence charSequence = (CharSequence) obj;
            if (interfaceC25675a != null) {
                interfaceC25675a.cancel();
            }
            InterfaceC25675a interfaceC25675aM79284c = m79284c(this.f60812a);
            this.f60814c = new WeakReference(interfaceC25675aM79284c);
            Intrinsics.m97799e(interfaceC25675aM79284c);
            interfaceC25675aM79284c.setDuration(m79281d(charSequence));
            interfaceC25675aM79284c.setText(charSequence);
            interfaceC25675aM79284c.show();
            mo79283b(new C25904a());
        }
    }

    @Override // ls.InterfaceC25676b
    public void registerStrategy(Application application) {
        this.f60812a = application;
        C18805a.a aVar = C18805a.f60797b;
        Intrinsics.m97799e(application);
        this.f60813b = aVar.m79277a(application);
    }
}
