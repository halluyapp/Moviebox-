package com.transsion.postdetail.util;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.postdetail.util.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C17442l {

    /* JADX INFO: renamed from: a */
    private View f57832a;

    /* JADX INFO: renamed from: b */
    private int f57833b;

    /* JADX INFO: renamed from: c */
    private a f57834c;

    /* JADX INFO: renamed from: d */
    private final ViewTreeObserver.OnGlobalLayoutListener f57835d = new b();

    /* JADX INFO: renamed from: com.transsion.postdetail.util.l$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo74041a(int i11);

        /* JADX INFO: renamed from: b */
        void mo74042b(int i11);
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.util.l$b */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (C17442l.this.f57832a == null) {
                View view = C17442l.this.f57832a;
                Intrinsics.m97799e(view);
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
            }
            Rect rect = new Rect();
            View view2 = C17442l.this.f57832a;
            Intrinsics.m97799e(view2);
            view2.getWindowVisibleDisplayFrame(rect);
            int iHeight = rect.height();
            if (C17442l.this.m74963c() == 0) {
                C17442l.this.m74965e(iHeight);
                return;
            }
            if (C17442l.this.m74963c() == iHeight) {
                return;
            }
            if (C17442l.this.m74963c() - iHeight > 200) {
                if (C17442l.this.f57834c != null) {
                    a aVar = C17442l.this.f57834c;
                    Intrinsics.m97799e(aVar);
                    aVar.mo74042b(C17442l.this.m74963c() - iHeight);
                }
                C17442l.this.m74965e(iHeight);
                return;
            }
            if (iHeight - C17442l.this.m74963c() > 200) {
                if (C17442l.this.f57834c != null) {
                    a aVar2 = C17442l.this.f57834c;
                    Intrinsics.m97799e(aVar2);
                    aVar2.mo74041a(iHeight - C17442l.this.m74963c());
                }
                C17442l.this.m74965e(iHeight);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m74963c() {
        return this.f57833b;
    }

    /* JADX INFO: renamed from: d */
    public final void m74964d(Activity activity, a aVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Window window;
        this.f57834c = aVar;
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        this.f57832a = decorView;
        if (aVar == null) {
            if (decorView == null || (viewTreeObserver2 = decorView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver2.removeOnGlobalLayoutListener(this.f57835d);
            return;
        }
        if (decorView == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.f57835d);
    }

    /* JADX INFO: renamed from: e */
    public final void m74965e(int i11) {
        this.f57833b = i11;
    }
}
