package com.transsion.shorttv.base.widget;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.blankj.utilcode.util.AbstractC5806y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18788e {

    /* JADX INFO: renamed from: b */
    private Context f60698b;

    /* JADX INFO: renamed from: c */
    private View f60699c;

    /* JADX INFO: renamed from: e */
    private boolean f60701e;

    /* JADX INFO: renamed from: f */
    private boolean f60702f;

    /* JADX INFO: renamed from: g */
    private boolean f60703g;

    /* JADX INFO: renamed from: h */
    private GestureDetector f60704h;

    /* JADX INFO: renamed from: i */
    private a f60705i;

    /* JADX INFO: renamed from: j */
    private boolean f60706j;

    /* JADX INFO: renamed from: k */
    private View f60707k;

    /* JADX INFO: renamed from: a */
    private final String f60697a = C18788e.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private boolean f60700d = true;

    /* JADX INFO: renamed from: l */
    private final GestureDetector.OnGestureListener f60708l = new c();

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo79199a();

        /* JADX INFO: renamed from: b */
        void mo79200b(float f11, float f12);

        /* JADX INFO: renamed from: c */
        void mo79201c(float f11, float f12);

        /* JADX INFO: renamed from: d */
        void mo79202d(float f11, float f12);

        /* JADX INFO: renamed from: e */
        void mo79203e();

        void onDoubleTap(MotionEvent motionEvent);

        void onLongPress(MotionEvent motionEvent);
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.e$b */
    public static final class b implements GestureDetector.OnDoubleTapListener {
        b() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            a aVar = C18788e.this.f60705i;
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
            a aVar = C18788e.this.f60705i;
            if (aVar == null) {
                return false;
            }
            aVar.mo79199a();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.e$c */
    public static final class c implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        private float f60710a;

        c() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            this.f60710a = e11.getX();
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
            a aVar = C18788e.this.f60705i;
            if (aVar != null) {
                aVar.onLongPress(e11);
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent e11, float f11, float f12) {
            Intrinsics.m97802h(e11, "e2");
            if (!C18788e.this.f60700d || motionEvent == null) {
                return false;
            }
            if (Math.abs(f11) <= Math.abs(f12)) {
                boolean unused = C18788e.this.f60701e;
            } else if (!C18788e.this.f60703g && !C18788e.this.f60702f) {
                C18788e.this.f60701e = true;
            }
            if (C18788e.this.f60701e) {
                a aVar = C18788e.this.f60705i;
                if (aVar != null) {
                    aVar.mo79200b(motionEvent.getX(), e11.getX());
                }
            } else if (C18788e.this.f60706j) {
                C18788e c18788e = C18788e.this;
                View view = c18788e.f60707k;
                Intrinsics.m97799e(view);
                if (c18788e.m79195o(view, (int) this.f60710a)) {
                    C18788e.this.f60703g = true;
                    a aVar2 = C18788e.this.f60705i;
                    if (aVar2 != null) {
                        aVar2.mo79201c(motionEvent.getY(), e11.getY());
                    }
                } else {
                    C18788e c18788e2 = C18788e.this;
                    View view2 = c18788e2.f60707k;
                    Intrinsics.m97799e(view2);
                    if (c18788e2.m79197q(view2, (int) this.f60710a)) {
                        C18788e.this.f60702f = true;
                        a aVar3 = C18788e.this.f60705i;
                        if (aVar3 != null) {
                            aVar3.mo79202d(motionEvent.getY(), e11.getY());
                        }
                    }
                }
            } else if (C18788e.this.m79194n((int) this.f60710a)) {
                C18788e.this.f60703g = true;
                a aVar4 = C18788e.this.f60705i;
                if (aVar4 != null) {
                    aVar4.mo79201c(motionEvent.getY(), e11.getY());
                }
            } else if (C18788e.this.m79196p((int) this.f60710a)) {
                C18788e.this.f60702f = true;
                a aVar5 = C18788e.this.f60705i;
                if (aVar5 != null) {
                    aVar5.mo79202d(motionEvent.getY(), e11.getY());
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

    public C18788e(Context context, View view) {
        this.f60698b = context;
        this.f60699c = view;
        m79192l();
    }

    /* JADX INFO: renamed from: l */
    private final void m79192l() {
        this.f60704h = new GestureDetector(this.f60698b, this.f60708l);
        View view = this.f60699c;
        Intrinsics.m97799e(view);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.shorttv.base.widget.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return C18788e.m79193m(this.f60696a, view2, motionEvent);
            }
        });
        GestureDetector gestureDetector = this.f60704h;
        Intrinsics.m97799e(gestureDetector);
        gestureDetector.setOnDoubleTapListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final boolean m79193m(C18788e c18788e, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            a aVar = c18788e.f60705i;
            if (aVar != null) {
                aVar.mo79203e();
            }
            c18788e.f60703g = false;
            c18788e.f60702f = false;
            c18788e.f60701e = false;
        }
        GestureDetector gestureDetector = c18788e.f60704h;
        Intrinsics.m97799e(gestureDetector);
        return gestureDetector.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m79194n(int i11) {
        return i11 < AbstractC5806y.m27489e() / 2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m79195o(View view, int i11) {
        Intrinsics.m97802h(view, "view");
        return i11 < view.getMeasuredWidth() / 2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m79196p(int i11) {
        return i11 > AbstractC5806y.m27489e() / 2;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m79197q(View view, int i11) {
        Intrinsics.m97802h(view, "view");
        return i11 > view.getMeasuredWidth() / 2;
    }

    /* JADX INFO: renamed from: r */
    public final void m79198r(a aVar) {
        this.f60705i = aVar;
    }
}
