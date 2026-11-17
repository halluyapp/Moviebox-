package com.transsion.shorttv.base.widget.toast.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.miniapp.utils.toast.ToastStrategy;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import ls.InterfaceC25675a;

/* JADX INFO: loaded from: classes6.dex */
final class ToastImpl {

    /* JADX INFO: renamed from: g */
    private static final Handler f60790g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    private final InterfaceC25675a f60791a;

    /* JADX INFO: renamed from: b */
    private final C18813i f60792b;

    /* JADX INFO: renamed from: c */
    private final String f60793c;

    /* JADX INFO: renamed from: d */
    private boolean f60794d;

    /* JADX INFO: renamed from: e */
    private final Runnable f60795e = new RunnableC188031();

    /* JADX INFO: renamed from: f */
    private final Runnable f60796f = new Runnable() { // from class: com.transsion.shorttv.base.widget.toast.core.ToastImpl.2
        @Override // java.lang.Runnable
        public void run() {
            WindowManager windowManager;
            try {
                try {
                    Activity activityM79294a = ToastImpl.this.f60792b.m79294a();
                    if (activityM79294a != null && (windowManager = (WindowManager) activityM79294a.getSystemService("window")) != null) {
                        windowManager.removeViewImmediate(ToastImpl.this.f60791a.getView());
                    }
                } catch (IllegalArgumentException e11) {
                    e11.printStackTrace();
                }
            } finally {
                ToastImpl.this.f60792b.m79296c();
                ToastImpl.this.m79273g(false);
            }
        }
    };

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.toast.core.ToastImpl$1 */
    class RunnableC188031 implements Runnable {
        RunnableC188031() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            ToastImpl.this.m79271e();
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activityM79294a = ToastImpl.this.f60792b.m79294a();
            if (activityM79294a == null || activityM79294a.isFinishing() || activityM79294a.isDestroyed()) {
                return;
            }
            int iM27313a = (ToastImpl.this.f60791a.getView() == null || !(ToastImpl.this.f60791a.getView().getTag() instanceof Integer)) ? -2 : AbstractC5776a0.m27313a(((Integer) ToastImpl.this.f60791a.getView().getTag()).intValue());
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -2;
            layoutParams.width = iM27313a;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 16973828;
            if (ToastImpl.this.f60791a.mo79278a()) {
                layoutParams.flags = Sdk$SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
            } else {
                layoutParams.flags = 152;
            }
            layoutParams.packageName = ToastImpl.this.f60793c;
            layoutParams.gravity = ToastImpl.this.f60791a.getGravity();
            layoutParams.x = ToastImpl.this.f60791a.getXOffset();
            layoutParams.y = ToastImpl.this.f60791a.getYOffset();
            layoutParams.verticalMargin = ToastImpl.this.f60791a.getVerticalMargin();
            layoutParams.horizontalMargin = ToastImpl.this.f60791a.getHorizontalMargin();
            WindowManager windowManager = (WindowManager) activityM79294a.getSystemService("window");
            if (windowManager == null) {
                return;
            }
            try {
                windowManager.addView(ToastImpl.this.f60791a.getView(), layoutParams);
                ToastImpl.f60790g.postDelayed(new Runnable() { // from class: com.transsion.shorttv.base.widget.toast.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60810a.lambda$run$0();
                    }
                }, ToastImpl.this.f60791a.getDuration() == 1 ? ToastStrategy.LONG_DURATION_TIMEOUT : 2000L);
                ToastImpl.this.f60792b.m79295b(ToastImpl.this);
                ToastImpl.this.m79273g(true);
            } catch (WindowManager.BadTokenException | IllegalStateException e11) {
                e11.printStackTrace();
            }
        }
    }

    ToastImpl(Activity activity, InterfaceC25675a interfaceC25675a) {
        this.f60791a = interfaceC25675a;
        this.f60793c = activity.getPackageName();
        this.f60792b = new C18813i(activity);
    }

    /* JADX INFO: renamed from: e */
    void m79271e() {
        if (m79272f()) {
            Handler handler = f60790g;
            handler.removeCallbacks(this.f60796f);
            handler.post(this.f60796f);
        }
    }

    /* JADX INFO: renamed from: f */
    boolean m79272f() {
        return this.f60794d;
    }

    /* JADX INFO: renamed from: g */
    void m79273g(boolean z11) {
        this.f60794d = z11;
    }

    /* JADX INFO: renamed from: h */
    void m79274h() {
        if (m79272f()) {
            return;
        }
        Handler handler = f60790g;
        handler.removeCallbacks(this.f60795e);
        handler.post(this.f60795e);
    }
}
