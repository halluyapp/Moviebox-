package com.transsion.baseui.widget;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.blankj.utilcode.util.AbstractC5806y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.baseui.widget.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C14582f {

    /* JADX INFO: renamed from: b */
    private Context f51222b;

    /* JADX INFO: renamed from: c */
    private View f51223c;

    /* JADX INFO: renamed from: e */
    private boolean f51225e;

    /* JADX INFO: renamed from: f */
    private boolean f51226f;

    /* JADX INFO: renamed from: g */
    private boolean f51227g;

    /* JADX INFO: renamed from: h */
    private GestureDetector f51228h;

    /* JADX INFO: renamed from: i */
    private a f51229i;

    /* JADX INFO: renamed from: j */
    private boolean f51230j;

    /* JADX INFO: renamed from: k */
    private View f51231k;

    /* JADX INFO: renamed from: a */
    private final String f51221a = C14582f.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private boolean f51224d = true;

    /* JADX INFO: renamed from: l */
    private final GestureDetector.OnGestureListener f51232l = new c();

    /* JADX INFO: renamed from: com.transsion.baseui.widget.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo65769a();

        /* JADX INFO: renamed from: b */
        void mo65770b(float f11, float f12);

        /* JADX INFO: renamed from: c */
        void mo65771c(float f11, float f12);

        /* JADX INFO: renamed from: d */
        void mo65772d(float f11, float f12);

        /* JADX INFO: renamed from: e */
        void mo65773e();

        void onDoubleTap(MotionEvent motionEvent);

        void onLongPress(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.transsion.baseui.widget.f$b */
    public static final class b implements GestureDetector.OnDoubleTapListener {
        b() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            a aVar = C14582f.this.f51229i;
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
            a aVar = C14582f.this.f51229i;
            if (aVar == null) {
                return false;
            }
            aVar.mo65769a();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.widget.f$c */
    public static final class c implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        private float f51234a;

        c() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            this.f51234a = e11.getX();
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
            a aVar = C14582f.this.f51229i;
            if (aVar != null) {
                aVar.onLongPress(e11);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e11, float f11, float f12) {
            Intrinsics.m97802h(e11, "e2");
            if (!C14582f.this.f51224d || motionEvent == null) {
                return false;
            }
            if (Math.abs(f11) <= Math.abs(f12)) {
                boolean unused = C14582f.this.f51225e;
            } else if (!C14582f.this.f51227g && !C14582f.this.f51226f) {
                C14582f.this.f51225e = true;
            }
            if (C14582f.this.f51225e) {
                a aVar = C14582f.this.f51229i;
                if (aVar != null) {
                    aVar.mo65770b(motionEvent.getX(), e11.getX());
                }
            } else if (C14582f.this.f51230j) {
                C14582f c14582f = C14582f.this;
                View view = c14582f.f51231k;
                Intrinsics.m97799e(view);
                if (c14582f.m65765p(view, (int) this.f51234a)) {
                    C14582f.this.f51227g = true;
                    a aVar2 = C14582f.this.f51229i;
                    if (aVar2 != null) {
                        aVar2.mo65771c(motionEvent.getY(), e11.getY());
                    }
                } else {
                    C14582f c14582f2 = C14582f.this;
                    View view2 = c14582f2.f51231k;
                    Intrinsics.m97799e(view2);
                    if (c14582f2.m65767r(view2, (int) this.f51234a)) {
                        C14582f.this.f51226f = true;
                        a aVar3 = C14582f.this.f51229i;
                        if (aVar3 != null) {
                            aVar3.mo65772d(motionEvent.getY(), e11.getY());
                        }
                    }
                }
            } else if (C14582f.this.m65764o((int) this.f51234a)) {
                C14582f.this.f51227g = true;
                a aVar4 = C14582f.this.f51229i;
                if (aVar4 != null) {
                    aVar4.mo65771c(motionEvent.getY(), e11.getY());
                }
            } else if (C14582f.this.m65766q((int) this.f51234a)) {
                C14582f.this.f51226f = true;
                a aVar5 = C14582f.this.f51229i;
                if (aVar5 != null) {
                    aVar5.mo65772d(motionEvent.getY(), e11.getY());
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

    public C14582f(Context context, View view) {
        this.f51222b = context;
        this.f51223c = view;
        m65761m();
    }

    /* JADX INFO: renamed from: m */
    private final void m65761m() {
        this.f51228h = new GestureDetector(this.f51222b, this.f51232l);
        View view = this.f51223c;
        Intrinsics.m97799e(view);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.baseui.widget.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return C14582f.m65762n(this.f51220a, view2, motionEvent);
            }
        });
        GestureDetector gestureDetector = this.f51228h;
        Intrinsics.m97799e(gestureDetector);
        gestureDetector.setOnDoubleTapListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final boolean m65762n(C14582f c14582f, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            a aVar = c14582f.f51229i;
            if (aVar != null) {
                aVar.mo65773e();
            }
            c14582f.f51227g = false;
            c14582f.f51226f = false;
            c14582f.f51225e = false;
        }
        GestureDetector gestureDetector = c14582f.f51228h;
        Intrinsics.m97799e(gestureDetector);
        return gestureDetector.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: l */
    public final void m65763l(boolean z11) {
        this.f51224d = z11;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m65764o(int i11) {
        return i11 < AbstractC5806y.m27489e() / 2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m65765p(View view, int i11) {
        Intrinsics.m97802h(view, "view");
        return i11 < view.getMeasuredWidth() / 2;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m65766q(int i11) {
        return i11 > AbstractC5806y.m27489e() / 2;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m65767r(View view, int i11) {
        Intrinsics.m97802h(view, "view");
        return i11 > view.getMeasuredWidth() / 2;
    }

    /* JADX INFO: renamed from: s */
    public final void m65768s(a aVar) {
        this.f51229i = aVar;
    }
}
