package com.transsion.shorttv_pugc.base.widget;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.blankj.utilcode.util.AbstractC5806y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C19254e {

    /* JADX INFO: renamed from: b */
    private Context f61804b;

    /* JADX INFO: renamed from: c */
    private View f61805c;

    /* JADX INFO: renamed from: e */
    private boolean f61807e;

    /* JADX INFO: renamed from: f */
    private boolean f61808f;

    /* JADX INFO: renamed from: g */
    private boolean f61809g;

    /* JADX INFO: renamed from: h */
    private GestureDetector f61810h;

    /* JADX INFO: renamed from: i */
    private a f61811i;

    /* JADX INFO: renamed from: j */
    private boolean f61812j;

    /* JADX INFO: renamed from: k */
    private View f61813k;

    /* JADX INFO: renamed from: a */
    private final String f61803a = C19254e.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private boolean f61806d = true;

    /* JADX INFO: renamed from: l */
    private final GestureDetector.OnGestureListener f61814l = new c();

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo80627a();

        /* JADX INFO: renamed from: b */
        void mo80628b(float f11, float f12);

        /* JADX INFO: renamed from: c */
        void mo80629c(float f11, float f12);

        /* JADX INFO: renamed from: d */
        void mo80630d(float f11, float f12);

        /* JADX INFO: renamed from: e */
        void mo80631e();

        void onDoubleTap(MotionEvent motionEvent);

        void onLongPress(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.e$b */
    public static final class b implements GestureDetector.OnDoubleTapListener {
        b() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            a aVar = C19254e.this.f61811i;
            if (aVar == null) {
                return false;
            }
            aVar.onDoubleTap(e11);
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            a aVar = C19254e.this.f61811i;
            if (aVar == null) {
                return false;
            }
            aVar.mo80627a();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.e$c */
    public static final class c implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        private float f61816a;

        c() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            this.f61816a = e11.getX();
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent e11, float f11, float f12) {
            Intrinsics.m97802h(e11, "e2");
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            a aVar = C19254e.this.f61811i;
            if (aVar != null) {
                aVar.onLongPress(e11);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e11, float f11, float f12) {
            Intrinsics.m97802h(e11, "e2");
            if (!C19254e.this.f61806d || motionEvent == null) {
                return false;
            }
            if (Math.abs(f11) <= Math.abs(f12)) {
                boolean unused = C19254e.this.f61807e;
            } else if (!C19254e.this.f61809g && !C19254e.this.f61808f) {
                C19254e.this.f61807e = true;
            }
            if (C19254e.this.f61807e) {
                a aVar = C19254e.this.f61811i;
                if (aVar != null) {
                    aVar.mo80628b(motionEvent.getX(), e11.getX());
                }
            } else if (C19254e.this.f61812j) {
                C19254e c19254e = C19254e.this;
                View view = c19254e.f61813k;
                Intrinsics.m97799e(view);
                if (c19254e.m80623o(view, (int) this.f61816a)) {
                    C19254e.this.f61809g = true;
                    a aVar2 = C19254e.this.f61811i;
                    if (aVar2 != null) {
                        aVar2.mo80629c(motionEvent.getY(), e11.getY());
                    }
                } else {
                    C19254e c19254e2 = C19254e.this;
                    View view2 = c19254e2.f61813k;
                    Intrinsics.m97799e(view2);
                    if (c19254e2.m80625q(view2, (int) this.f61816a)) {
                        C19254e.this.f61808f = true;
                        a aVar3 = C19254e.this.f61811i;
                        if (aVar3 != null) {
                            aVar3.mo80630d(motionEvent.getY(), e11.getY());
                        }
                    }
                }
            } else if (C19254e.this.m80622n((int) this.f61816a)) {
                C19254e.this.f61809g = true;
                a aVar4 = C19254e.this.f61811i;
                if (aVar4 != null) {
                    aVar4.mo80629c(motionEvent.getY(), e11.getY());
                }
            } else if (C19254e.this.m80624p((int) this.f61816a)) {
                C19254e.this.f61808f = true;
                a aVar5 = C19254e.this.f61811i;
                if (aVar5 != null) {
                    aVar5.mo80630d(motionEvent.getY(), e11.getY());
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            return false;
        }
    }

    public C19254e(Context context, View view) {
        this.f61804b = context;
        this.f61805c = view;
        m80620l();
    }

    /* JADX INFO: renamed from: l */
    private final void m80620l() {
        this.f61810h = new GestureDetector(this.f61804b, this.f61814l);
        View view = this.f61805c;
        Intrinsics.m97799e(view);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.shorttv_pugc.base.widget.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return C19254e.m80621m(this.f61802a, view2, motionEvent);
            }
        });
        GestureDetector gestureDetector = this.f61810h;
        Intrinsics.m97799e(gestureDetector);
        gestureDetector.setOnDoubleTapListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final boolean m80621m(C19254e c19254e, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            a aVar = c19254e.f61811i;
            if (aVar != null) {
                aVar.mo80631e();
            }
            c19254e.f61809g = false;
            c19254e.f61808f = false;
            c19254e.f61807e = false;
        }
        GestureDetector gestureDetector = c19254e.f61810h;
        Intrinsics.m97799e(gestureDetector);
        return gestureDetector.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m80622n(int i11) {
        return i11 < AbstractC5806y.m27489e() / 2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m80623o(View view, int i11) {
        Intrinsics.m97802h(view, "view");
        return i11 < view.getMeasuredWidth() / 2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m80624p(int i11) {
        return i11 > AbstractC5806y.m27489e() / 2;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m80625q(View view, int i11) {
        Intrinsics.m97802h(view, "view");
        return i11 > view.getMeasuredWidth() / 2;
    }

    /* JADX INFO: renamed from: r */
    public final void m80626r(a aVar) {
        this.f61811i = aVar;
    }
}
