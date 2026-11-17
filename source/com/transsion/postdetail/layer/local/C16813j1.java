package com.transsion.postdetail.layer.local;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.local.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16813j1 {

    /* JADX INFO: renamed from: a */
    private final TextView f56635a;

    /* JADX INFO: renamed from: b */
    private final TextView f56636b;

    /* JADX INFO: renamed from: c */
    private long f56637c;

    /* JADX INFO: renamed from: d */
    private int f56638d = 1;

    /* JADX INFO: renamed from: e */
    private final Runnable f56639e = new Runnable() { // from class: com.transsion.postdetail.layer.local.h1
        @Override // java.lang.Runnable
        public final void run() {
            C16813j1.m73483e(this.f56608a);
        }
    };

    /* JADX INFO: renamed from: f */
    private final Runnable f56640f = new Runnable() { // from class: com.transsion.postdetail.layer.local.i1
        @Override // java.lang.Runnable
        public final void run() {
            C16813j1.m73484f(this.f56633a);
        }
    };

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.j1$a */
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f56642b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f56643c;

        a(TextView textView, String str) {
            this.f56642b = textView;
            this.f56643c = str;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.m97802h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.m97802h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.m97802h(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.m97802h(animation, "animation");
            C16813j1.this.f56637c = System.currentTimeMillis();
            TextView textView = this.f56642b;
            if (textView != null) {
                AbstractC26006c.m102058k(textView);
            }
            TextView textView2 = this.f56642b;
            if (textView2 != null) {
                textView2.setText(this.f56643c);
            }
        }
    }

    public C16813j1(TextView textView, TextView textView2) {
        this.f56635a = textView;
        this.f56636b = textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m73483e(C16813j1 c16813j1) {
        TextView textView = c16813j1.f56635a;
        if (textView != null) {
            AbstractC26006c.m102054g(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m73484f(C16813j1 c16813j1) {
        TextView textView = c16813j1.f56636b;
        if (textView != null) {
            AbstractC26006c.m102054g(textView);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m73485g(String str, long j11, TextView textView, long j12, Runnable runnable) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        if (textView != null) {
            AbstractC26006c.m102054g(textView);
        }
        objectAnimatorOfFloat.addListener(new a(textView, str));
        objectAnimatorOfFloat.setStartDelay(j11);
        objectAnimatorOfFloat.start();
        if (j12 <= 0 || textView == null) {
            return;
        }
        textView.postDelayed(runnable, j12);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m73486i(C16813j1 c16813j1, String str, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 3000;
        }
        c16813j1.m73488h(str, j11);
    }

    /* JADX INFO: renamed from: d */
    public final void m73487d() {
        TextView textView = this.f56635a;
        if (textView != null) {
            AbstractC26006c.m102054g(textView);
        }
        TextView textView2 = this.f56636b;
        if (textView2 != null) {
            AbstractC26006c.m102054g(textView2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m73488h(String content, long j11) {
        TextView textView;
        Intrinsics.m97802h(content, "content");
        TextView textView2 = this.f56635a;
        if (textView2 != null && AbstractC26006c.m102056i(textView2) && (textView = this.f56636b) != null && AbstractC26006c.m102056i(textView)) {
            int i11 = this.f56638d;
            TextView textView3 = i11 == 1 ? this.f56636b : this.f56635a;
            Runnable runnable = i11 == 1 ? this.f56640f : this.f56639e;
            textView3.removeCallbacks(runnable);
            m73485g(content, 0L, textView3, j11, runnable);
            this.f56638d = this.f56638d != 1 ? 1 : 2;
            return;
        }
        TextView textView4 = this.f56635a;
        if (textView4 == null || !AbstractC26006c.m102056i(textView4)) {
            this.f56638d = 1;
            m73485g(content, 0L, this.f56635a, j11, this.f56639e);
        } else {
            long j12 = System.currentTimeMillis() - this.f56637c < 500 ? 500L : 0L;
            this.f56638d = 2;
            m73485g(content, j12, this.f56636b, j11, this.f56640f);
        }
    }
}
