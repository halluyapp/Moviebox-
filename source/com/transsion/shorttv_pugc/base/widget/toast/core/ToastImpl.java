package com.transsion.shorttv_pugc.base.widget.toast.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.miniapp.utils.toast.ToastStrategy;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import p719qt.InterfaceC27126a;

/* JADX INFO: loaded from: classes6.dex */
final class ToastImpl {

    /* JADX INFO: renamed from: g */
    private static final Handler f61895g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    private final InterfaceC27126a f61896a;

    /* JADX INFO: renamed from: b */
    private final C19277i f61897b;

    /* JADX INFO: renamed from: c */
    private final String f61898c;

    /* JADX INFO: renamed from: d */
    private boolean f61899d;

    /* JADX INFO: renamed from: e */
    private final Runnable f61900e = new RunnableC192671();

    /* JADX INFO: renamed from: f */
    private final Runnable f61901f = new Runnable() { // from class: com.transsion.shorttv_pugc.base.widget.toast.core.ToastImpl.2
        @Override // java.lang.Runnable
        public void run() {
            WindowManager windowManager;
            try {
                try {
                    Activity activityM80721a = ToastImpl.this.f61897b.m80721a();
                    if (activityM80721a != null && (windowManager = (WindowManager) activityM80721a.getSystemService("window")) != null) {
                        windowManager.removeViewImmediate(ToastImpl.this.f61896a.getView());
                    }
                } catch (IllegalArgumentException e11) {
                    e11.printStackTrace();
                }
            } finally {
                ToastImpl.this.f61897b.m80723c();
                ToastImpl.this.m80700g(false);
            }
        }
    };

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.toast.core.ToastImpl$1 */
    class RunnableC192671 implements Runnable {
        RunnableC192671() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            ToastImpl.this.m80698e();
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activityM80721a = ToastImpl.this.f61897b.m80721a();
            if (activityM80721a == null || activityM80721a.isFinishing() || activityM80721a.isDestroyed()) {
                return;
            }
            int iM27313a = (ToastImpl.this.f61896a.getView() == null || !(ToastImpl.this.f61896a.getView().getTag() instanceof Integer)) ? -2 : AbstractC5776a0.m27313a(((Integer) ToastImpl.this.f61896a.getView().getTag()).intValue());
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -2;
            layoutParams.width = iM27313a;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 16973828;
            if (ToastImpl.this.f61896a.mo80705a()) {
                layoutParams.flags = Sdk$SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
            } else {
                layoutParams.flags = 152;
            }
            layoutParams.packageName = ToastImpl.this.f61898c;
            layoutParams.gravity = ToastImpl.this.f61896a.getGravity();
            layoutParams.x = ToastImpl.this.f61896a.getXOffset();
            layoutParams.y = ToastImpl.this.f61896a.getYOffset();
            layoutParams.verticalMargin = ToastImpl.this.f61896a.getVerticalMargin();
            layoutParams.horizontalMargin = ToastImpl.this.f61896a.getHorizontalMargin();
            WindowManager windowManager = (WindowManager) activityM80721a.getSystemService("window");
            if (windowManager == null) {
                return;
            }
            try {
                windowManager.addView(ToastImpl.this.f61896a.getView(), layoutParams);
                ToastImpl.f61895g.postDelayed(new Runnable() { // from class: com.transsion.shorttv_pugc.base.widget.toast.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f61915a.lambda$run$0();
                    }
                }, ToastImpl.this.f61896a.getDuration() == 1 ? ToastStrategy.LONG_DURATION_TIMEOUT : 2000L);
                ToastImpl.this.f61897b.m80722b(ToastImpl.this);
                ToastImpl.this.m80700g(true);
            } catch (WindowManager.BadTokenException | IllegalStateException e11) {
                e11.printStackTrace();
            }
        }
    }

    ToastImpl(Activity activity, InterfaceC27126a interfaceC27126a) {
        this.f61896a = interfaceC27126a;
        this.f61898c = activity.getPackageName();
        this.f61897b = new C19277i(activity);
    }

    /* JADX INFO: renamed from: e */
    void m80698e() {
        if (m80699f()) {
            Handler handler = f61895g;
            handler.removeCallbacks(this.f61901f);
            handler.post(this.f61901f);
        }
    }

    /* JADX INFO: renamed from: f */
    boolean m80699f() {
        return this.f61899d;
    }

    /* JADX INFO: renamed from: g */
    void m80700g(boolean z11) {
        this.f61899d = z11;
    }

    /* JADX INFO: renamed from: h */
    void m80701h() {
        if (m80699f()) {
            return;
        }
        Handler handler = f61895g;
        handler.removeCallbacks(this.f61900e);
        handler.post(this.f61900e);
    }
}
