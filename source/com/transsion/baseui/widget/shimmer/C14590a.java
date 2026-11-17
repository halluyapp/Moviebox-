package com.transsion.baseui.widget.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.transsion.baseui.R$styleable;

/* JADX INFO: renamed from: com.transsion.baseui.widget.shimmer.a */
/* JADX INFO: loaded from: classes5.dex */
public class C14590a {

    /* JADX INFO: renamed from: a */
    final float[] f51287a = new float[4];

    /* JADX INFO: renamed from: b */
    final int[] f51288b = new int[4];

    /* JADX INFO: renamed from: c */
    final RectF f51289c = new RectF();

    /* JADX INFO: renamed from: d */
    int f51290d = 0;

    /* JADX INFO: renamed from: e */
    int f51291e = -1;

    /* JADX INFO: renamed from: f */
    int f51292f = 1291845631;

    /* JADX INFO: renamed from: g */
    int f51293g = 0;

    /* JADX INFO: renamed from: h */
    int f51294h = 0;

    /* JADX INFO: renamed from: i */
    int f51295i = 0;

    /* JADX INFO: renamed from: j */
    float f51296j = 1.0f;

    /* JADX INFO: renamed from: k */
    float f51297k = 1.0f;

    /* JADX INFO: renamed from: l */
    float f51298l = 0.0f;

    /* JADX INFO: renamed from: m */
    float f51299m = 0.5f;

    /* JADX INFO: renamed from: n */
    float f51300n = 20.0f;

    /* JADX INFO: renamed from: o */
    boolean f51301o = true;

    /* JADX INFO: renamed from: p */
    boolean f51302p = true;

    /* JADX INFO: renamed from: q */
    boolean f51303q = true;

    /* JADX INFO: renamed from: r */
    int f51304r = -1;

    /* JADX INFO: renamed from: s */
    int f51305s = 1;

    /* JADX INFO: renamed from: t */
    long f51306t = 1000;

    /* JADX INFO: renamed from: u */
    long f51307u;

    /* JADX INFO: renamed from: com.transsion.baseui.widget.shimmer.a$a */
    public static class a extends b {
        public a() {
            this.f51308a.f51303q = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.transsion.baseui.widget.shimmer.C14590a.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a mo65798d() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.widget.shimmer.a$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        final C14590a f51308a = new C14590a();

        /* JADX INFO: renamed from: b */
        private static float m65800b(float f11, float f12, float f13) {
            return Math.min(f12, Math.max(f11, f13));
        }

        /* JADX INFO: renamed from: a */
        public C14590a m65801a() {
            this.f51308a.m65795b();
            this.f51308a.m65796c();
            return this.f51308a;
        }

        /* JADX INFO: renamed from: c */
        b mo65802c(TypedArray typedArray) {
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_clip_to_children)) {
                m65805g(typedArray.getBoolean(R$styleable.ShimmerFrameLayout_shimmer_clip_to_children, this.f51308a.f51301o));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_auto_start)) {
                m65803e(typedArray.getBoolean(R$styleable.ShimmerFrameLayout_shimmer_auto_start, this.f51308a.f51302p));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_base_alpha)) {
                m65804f(typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha)) {
                m65812n(typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_duration)) {
                m65808j(typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_duration, (int) this.f51308a.f51306t));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_repeat_count)) {
                m65814p(typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_repeat_count, this.f51308a.f51304r));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_repeat_delay)) {
                m65815q(typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_repeat_delay, (int) this.f51308a.f51307u));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_repeat_mode)) {
                m65816r(typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_repeat_mode, this.f51308a.f51305s));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_direction)) {
                int i11 = typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_direction, this.f51308a.f51290d);
                if (i11 == 1) {
                    m65806h(1);
                } else if (i11 == 2) {
                    m65806h(2);
                } else if (i11 != 3) {
                    m65806h(0);
                } else {
                    m65806h(3);
                }
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_shape)) {
                if (typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_shape, this.f51308a.f51293g) != 1) {
                    m65817s(0);
                } else {
                    m65817s(1);
                }
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_dropoff)) {
                m65807i(typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_dropoff, this.f51308a.f51299m));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_fixed_width)) {
                m65810l(typedArray.getDimensionPixelSize(R$styleable.ShimmerFrameLayout_shimmer_fixed_width, this.f51308a.f51294h));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_fixed_height)) {
                m65809k(typedArray.getDimensionPixelSize(R$styleable.ShimmerFrameLayout_shimmer_fixed_height, this.f51308a.f51295i));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_intensity)) {
                m65813o(typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_intensity, this.f51308a.f51298l));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_width_ratio)) {
                m65819u(typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_width_ratio, this.f51308a.f51296j));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_height_ratio)) {
                m65811m(typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_height_ratio, this.f51308a.f51297k));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_tilt)) {
                m65818t(typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_tilt, this.f51308a.f51300n));
            }
            return mo65798d();
        }

        /* JADX INFO: renamed from: d */
        protected abstract b mo65798d();

        /* JADX INFO: renamed from: e */
        public b m65803e(boolean z11) {
            this.f51308a.f51302p = z11;
            return mo65798d();
        }

        /* JADX INFO: renamed from: f */
        public b m65804f(float f11) {
            int iM65800b = (int) (m65800b(0.0f, 1.0f, f11) * 255.0f);
            C14590a c14590a = this.f51308a;
            c14590a.f51292f = (iM65800b << 24) | (c14590a.f51292f & 16777215);
            return mo65798d();
        }

        /* JADX INFO: renamed from: g */
        public b m65805g(boolean z11) {
            this.f51308a.f51301o = z11;
            return mo65798d();
        }

        /* JADX INFO: renamed from: h */
        public b m65806h(int i11) {
            this.f51308a.f51290d = i11;
            return mo65798d();
        }

        /* JADX INFO: renamed from: i */
        public b m65807i(float f11) {
            if (f11 >= 0.0f) {
                this.f51308a.f51299m = f11;
                return mo65798d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f11);
        }

        /* JADX INFO: renamed from: j */
        public b m65808j(long j11) {
            if (j11 >= 0) {
                this.f51308a.f51306t = j11;
                return mo65798d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j11);
        }

        /* JADX INFO: renamed from: k */
        public b m65809k(int i11) {
            if (i11 >= 0) {
                this.f51308a.f51295i = i11;
                return mo65798d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i11);
        }

        /* JADX INFO: renamed from: l */
        public b m65810l(int i11) {
            if (i11 >= 0) {
                this.f51308a.f51294h = i11;
                return mo65798d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i11);
        }

        /* JADX INFO: renamed from: m */
        public b m65811m(float f11) {
            if (f11 >= 0.0f) {
                this.f51308a.f51297k = f11;
                return mo65798d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f11);
        }

        /* JADX INFO: renamed from: n */
        public b m65812n(float f11) {
            int iM65800b = (int) (m65800b(0.0f, 1.0f, f11) * 255.0f);
            C14590a c14590a = this.f51308a;
            c14590a.f51291e = (iM65800b << 24) | (c14590a.f51291e & 16777215);
            return mo65798d();
        }

        /* JADX INFO: renamed from: o */
        public b m65813o(float f11) {
            if (f11 >= 0.0f) {
                this.f51308a.f51298l = f11;
                return mo65798d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f11);
        }

        /* JADX INFO: renamed from: p */
        public b m65814p(int i11) {
            this.f51308a.f51304r = i11;
            return mo65798d();
        }

        /* JADX INFO: renamed from: q */
        public b m65815q(long j11) {
            if (j11 >= 0) {
                this.f51308a.f51307u = j11;
                return mo65798d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j11);
        }

        /* JADX INFO: renamed from: r */
        public b m65816r(int i11) {
            this.f51308a.f51305s = i11;
            return mo65798d();
        }

        /* JADX INFO: renamed from: s */
        public b m65817s(int i11) {
            this.f51308a.f51293g = i11;
            return mo65798d();
        }

        /* JADX INFO: renamed from: t */
        public b m65818t(float f11) {
            this.f51308a.f51300n = f11;
            return mo65798d();
        }

        /* JADX INFO: renamed from: u */
        public b m65819u(float f11) {
            if (f11 >= 0.0f) {
                this.f51308a.f51296j = f11;
                return mo65798d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.widget.shimmer.a$c */
    public static class c extends b {
        public c() {
            this.f51308a.f51303q = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.transsion.baseui.widget.shimmer.C14590a.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public c mo65802c(TypedArray typedArray) {
            super.mo65802c(typedArray);
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_base_color)) {
                m65822x(typedArray.getColor(R$styleable.ShimmerFrameLayout_shimmer_base_color, this.f51308a.f51292f));
            }
            if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_highlight_color)) {
                m65823y(typedArray.getColor(R$styleable.ShimmerFrameLayout_shimmer_highlight_color, this.f51308a.f51291e));
            }
            return mo65798d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.transsion.baseui.widget.shimmer.C14590a.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public c mo65798d() {
            return this;
        }

        /* JADX INFO: renamed from: x */
        public c m65822x(int i11) {
            C14590a c14590a = this.f51308a;
            c14590a.f51292f = (i11 & 16777215) | (c14590a.f51292f & ViewCompat.MEASURED_STATE_MASK);
            return mo65798d();
        }

        /* JADX INFO: renamed from: y */
        public c m65823y(int i11) {
            this.f51308a.f51291e = i11;
            return mo65798d();
        }
    }

    C14590a() {
    }

    /* JADX INFO: renamed from: a */
    int m65794a(int i11) {
        int i12 = this.f51295i;
        return i12 > 0 ? i12 : Math.round(this.f51297k * i11);
    }

    /* JADX INFO: renamed from: b */
    void m65795b() {
        if (this.f51293g != 1) {
            int[] iArr = this.f51288b;
            int i11 = this.f51292f;
            iArr[0] = i11;
            int i12 = this.f51291e;
            iArr[1] = i12;
            iArr[2] = i12;
            iArr[3] = i11;
            return;
        }
        int[] iArr2 = this.f51288b;
        int i13 = this.f51291e;
        iArr2[0] = i13;
        iArr2[1] = i13;
        int i14 = this.f51292f;
        iArr2[2] = i14;
        iArr2[3] = i14;
    }

    /* JADX INFO: renamed from: c */
    void m65796c() {
        if (this.f51293g != 1) {
            this.f51287a[0] = Math.max(((1.0f - this.f51298l) - this.f51299m) / 2.0f, 0.0f);
            this.f51287a[1] = Math.max(((1.0f - this.f51298l) - 0.001f) / 2.0f, 0.0f);
            this.f51287a[2] = Math.min(((this.f51298l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f51287a[3] = Math.min(((this.f51298l + 1.0f) + this.f51299m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f51287a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f51298l, 1.0f);
        this.f51287a[2] = Math.min(this.f51298l + this.f51299m, 1.0f);
        this.f51287a[3] = 1.0f;
    }

    /* JADX INFO: renamed from: d */
    int m65797d(int i11) {
        int i12 = this.f51294h;
        return i12 > 0 ? i12 : Math.round(this.f51296j * i11);
    }
}
