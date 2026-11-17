package com.transsion.shorttv_pugc.base.widget.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.transsion.shorttv.R$styleable;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.shimmer.a */
/* JADX INFO: loaded from: classes6.dex */
public class C19265a {

    /* JADX INFO: renamed from: a */
    final float[] f61866a = new float[4];

    /* JADX INFO: renamed from: b */
    final int[] f61867b = new int[4];

    /* JADX INFO: renamed from: c */
    final RectF f61868c = new RectF();

    /* JADX INFO: renamed from: d */
    int f61869d = 0;

    /* JADX INFO: renamed from: e */
    int f61870e = -1;

    /* JADX INFO: renamed from: f */
    int f61871f = 1291845631;

    /* JADX INFO: renamed from: g */
    int f61872g = 0;

    /* JADX INFO: renamed from: h */
    int f61873h = 0;

    /* JADX INFO: renamed from: i */
    int f61874i = 0;

    /* JADX INFO: renamed from: j */
    float f61875j = 1.0f;

    /* JADX INFO: renamed from: k */
    float f61876k = 1.0f;

    /* JADX INFO: renamed from: l */
    float f61877l = 0.0f;

    /* JADX INFO: renamed from: m */
    float f61878m = 0.5f;

    /* JADX INFO: renamed from: n */
    float f61879n = 20.0f;

    /* JADX INFO: renamed from: o */
    boolean f61880o = true;

    /* JADX INFO: renamed from: p */
    boolean f61881p = true;

    /* JADX INFO: renamed from: q */
    boolean f61882q = true;

    /* JADX INFO: renamed from: r */
    int f61883r = -1;

    /* JADX INFO: renamed from: s */
    int f61884s = 1;

    /* JADX INFO: renamed from: t */
    long f61885t = 1000;

    /* JADX INFO: renamed from: u */
    long f61886u;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.shimmer.a$a */
    public static class a extends b {
        public a() {
            this.f61887a.f61882q = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.transsion.shorttv_pugc.base.widget.shimmer.C19265a.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a mo80658d() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.shimmer.a$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        final C19265a f61887a = new C19265a();

        /* JADX INFO: renamed from: b */
        private static float m80660b(float f11, float f12, float f13) {
            return Math.min(f12, Math.max(f11, f13));
        }

        /* JADX INFO: renamed from: a */
        public C19265a m80661a() {
            this.f61887a.m80655b();
            this.f61887a.m80656c();
            return this.f61887a;
        }

        /* JADX INFO: renamed from: c */
        b mo80662c(TypedArray typedArray) {
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_clip_to_children)) {
                m80665g(typedArray.getBoolean(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_clip_to_children, this.f61887a.f61880o));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_auto_start)) {
                m80663e(typedArray.getBoolean(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_auto_start, this.f61887a.f61881p));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_base_alpha)) {
                m80664f(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_base_alpha, 0.3f));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_highlight_alpha)) {
                m80672n(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_highlight_alpha, 1.0f));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_duration)) {
                m80668j(typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_duration, (int) this.f61887a.f61885t));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_count)) {
                m80674p(typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_count, this.f61887a.f61883r));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_delay)) {
                m80675q(typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_delay, (int) this.f61887a.f61886u));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_mode)) {
                m80676r(typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_mode, this.f61887a.f61884s));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_direction)) {
                int i11 = typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_direction, this.f61887a.f61869d);
                if (i11 == 1) {
                    m80666h(1);
                } else if (i11 == 2) {
                    m80666h(2);
                } else if (i11 != 3) {
                    m80666h(0);
                } else {
                    m80666h(3);
                }
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_shape)) {
                if (typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_shape, this.f61887a.f61872g) != 1) {
                    m80677s(0);
                } else {
                    m80677s(1);
                }
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_dropoff)) {
                m80667i(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_dropoff, this.f61887a.f61878m));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_fixed_width)) {
                m80670l(typedArray.getDimensionPixelSize(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_fixed_width, this.f61887a.f61873h));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_fixed_height)) {
                m80669k(typedArray.getDimensionPixelSize(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_fixed_height, this.f61887a.f61874i));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_intensity)) {
                m80673o(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_intensity, this.f61887a.f61877l));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_width_ratio)) {
                m80679u(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_width_ratio, this.f61887a.f61875j));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_height_ratio)) {
                m80671m(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_height_ratio, this.f61887a.f61876k));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_tilt)) {
                m80678t(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_tilt, this.f61887a.f61879n));
            }
            return mo80658d();
        }

        /* JADX INFO: renamed from: d */
        protected abstract b mo80658d();

        /* JADX INFO: renamed from: e */
        public b m80663e(boolean z11) {
            this.f61887a.f61881p = z11;
            return mo80658d();
        }

        /* JADX INFO: renamed from: f */
        public b m80664f(float f11) {
            int iM80660b = (int) (m80660b(0.0f, 1.0f, f11) * 255.0f);
            C19265a c19265a = this.f61887a;
            c19265a.f61871f = (iM80660b << 24) | (c19265a.f61871f & 16777215);
            return mo80658d();
        }

        /* JADX INFO: renamed from: g */
        public b m80665g(boolean z11) {
            this.f61887a.f61880o = z11;
            return mo80658d();
        }

        /* JADX INFO: renamed from: h */
        public b m80666h(int i11) {
            this.f61887a.f61869d = i11;
            return mo80658d();
        }

        /* JADX INFO: renamed from: i */
        public b m80667i(float f11) {
            if (f11 >= 0.0f) {
                this.f61887a.f61878m = f11;
                return mo80658d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f11);
        }

        /* JADX INFO: renamed from: j */
        public b m80668j(long j11) {
            if (j11 >= 0) {
                this.f61887a.f61885t = j11;
                return mo80658d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j11);
        }

        /* JADX INFO: renamed from: k */
        public b m80669k(int i11) {
            if (i11 >= 0) {
                this.f61887a.f61874i = i11;
                return mo80658d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i11);
        }

        /* JADX INFO: renamed from: l */
        public b m80670l(int i11) {
            if (i11 >= 0) {
                this.f61887a.f61873h = i11;
                return mo80658d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i11);
        }

        /* JADX INFO: renamed from: m */
        public b m80671m(float f11) {
            if (f11 >= 0.0f) {
                this.f61887a.f61876k = f11;
                return mo80658d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f11);
        }

        /* JADX INFO: renamed from: n */
        public b m80672n(float f11) {
            int iM80660b = (int) (m80660b(0.0f, 1.0f, f11) * 255.0f);
            C19265a c19265a = this.f61887a;
            c19265a.f61870e = (iM80660b << 24) | (c19265a.f61870e & 16777215);
            return mo80658d();
        }

        /* JADX INFO: renamed from: o */
        public b m80673o(float f11) {
            if (f11 >= 0.0f) {
                this.f61887a.f61877l = f11;
                return mo80658d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f11);
        }

        /* JADX INFO: renamed from: p */
        public b m80674p(int i11) {
            this.f61887a.f61883r = i11;
            return mo80658d();
        }

        /* JADX INFO: renamed from: q */
        public b m80675q(long j11) {
            if (j11 >= 0) {
                this.f61887a.f61886u = j11;
                return mo80658d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j11);
        }

        /* JADX INFO: renamed from: r */
        public b m80676r(int i11) {
            this.f61887a.f61884s = i11;
            return mo80658d();
        }

        /* JADX INFO: renamed from: s */
        public b m80677s(int i11) {
            this.f61887a.f61872g = i11;
            return mo80658d();
        }

        /* JADX INFO: renamed from: t */
        public b m80678t(float f11) {
            this.f61887a.f61879n = f11;
            return mo80658d();
        }

        /* JADX INFO: renamed from: u */
        public b m80679u(float f11) {
            if (f11 >= 0.0f) {
                this.f61887a.f61875j = f11;
                return mo80658d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.shimmer.a$c */
    public static class c extends b {
        public c() {
            this.f61887a.f61882q = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.transsion.shorttv_pugc.base.widget.shimmer.C19265a.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public c mo80662c(TypedArray typedArray) {
            super.mo80662c(typedArray);
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_base_color)) {
                m80682x(typedArray.getColor(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_base_color, this.f61887a.f61871f));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_highlight_color)) {
                m80683y(typedArray.getColor(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_highlight_color, this.f61887a.f61870e));
            }
            return mo80658d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.transsion.shorttv_pugc.base.widget.shimmer.C19265a.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public c mo80658d() {
            return this;
        }

        /* JADX INFO: renamed from: x */
        public c m80682x(int i11) {
            C19265a c19265a = this.f61887a;
            c19265a.f61871f = (i11 & 16777215) | (c19265a.f61871f & ViewCompat.MEASURED_STATE_MASK);
            return mo80658d();
        }

        /* JADX INFO: renamed from: y */
        public c m80683y(int i11) {
            this.f61887a.f61870e = i11;
            return mo80658d();
        }
    }

    C19265a() {
    }

    /* JADX INFO: renamed from: a */
    int m80654a(int i11) {
        int i12 = this.f61874i;
        return i12 > 0 ? i12 : Math.round(this.f61876k * i11);
    }

    /* JADX INFO: renamed from: b */
    void m80655b() {
        if (this.f61872g != 1) {
            int[] iArr = this.f61867b;
            int i11 = this.f61871f;
            iArr[0] = i11;
            int i12 = this.f61870e;
            iArr[1] = i12;
            iArr[2] = i12;
            iArr[3] = i11;
            return;
        }
        int[] iArr2 = this.f61867b;
        int i13 = this.f61870e;
        iArr2[0] = i13;
        iArr2[1] = i13;
        int i14 = this.f61871f;
        iArr2[2] = i14;
        iArr2[3] = i14;
    }

    /* JADX INFO: renamed from: c */
    void m80656c() {
        if (this.f61872g != 1) {
            this.f61866a[0] = Math.max(((1.0f - this.f61877l) - this.f61878m) / 2.0f, 0.0f);
            this.f61866a[1] = Math.max(((1.0f - this.f61877l) - 0.001f) / 2.0f, 0.0f);
            this.f61866a[2] = Math.min(((this.f61877l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f61866a[3] = Math.min(((this.f61877l + 1.0f) + this.f61878m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f61866a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f61877l, 1.0f);
        this.f61866a[2] = Math.min(this.f61877l + this.f61878m, 1.0f);
        this.f61866a[3] = 1.0f;
    }

    /* JADX INFO: renamed from: d */
    int m80657d(int i11) {
        int i12 = this.f61873h;
        return i12 > 0 ? i12 : Math.round(this.f61875j * i11);
    }
}
