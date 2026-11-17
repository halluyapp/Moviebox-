package com.transsion.shorttv.base.widget.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.transsion.shorttv.R$styleable;

/* JADX INFO: renamed from: com.transsion.shorttv.base.widget.shimmer.a */
/* JADX INFO: loaded from: classes6.dex */
public class C18801a {

    /* JADX INFO: renamed from: a */
    final float[] f60761a = new float[4];

    /* JADX INFO: renamed from: b */
    final int[] f60762b = new int[4];

    /* JADX INFO: renamed from: c */
    final RectF f60763c = new RectF();

    /* JADX INFO: renamed from: d */
    int f60764d = 0;

    /* JADX INFO: renamed from: e */
    int f60765e = -1;

    /* JADX INFO: renamed from: f */
    int f60766f = 1291845631;

    /* JADX INFO: renamed from: g */
    int f60767g = 0;

    /* JADX INFO: renamed from: h */
    int f60768h = 0;

    /* JADX INFO: renamed from: i */
    int f60769i = 0;

    /* JADX INFO: renamed from: j */
    float f60770j = 1.0f;

    /* JADX INFO: renamed from: k */
    float f60771k = 1.0f;

    /* JADX INFO: renamed from: l */
    float f60772l = 0.0f;

    /* JADX INFO: renamed from: m */
    float f60773m = 0.5f;

    /* JADX INFO: renamed from: n */
    float f60774n = 20.0f;

    /* JADX INFO: renamed from: o */
    boolean f60775o = true;

    /* JADX INFO: renamed from: p */
    boolean f60776p = true;

    /* JADX INFO: renamed from: q */
    boolean f60777q = true;

    /* JADX INFO: renamed from: r */
    int f60778r = -1;

    /* JADX INFO: renamed from: s */
    int f60779s = 1;

    /* JADX INFO: renamed from: t */
    long f60780t = 1000;

    /* JADX INFO: renamed from: u */
    long f60781u;

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.shimmer.a$a */
    public static class a extends b {
        public a() {
            this.f60782a.f60777q = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.transsion.shorttv.base.widget.shimmer.C18801a.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public a mo79231d() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.shimmer.a$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        final C18801a f60782a = new C18801a();

        /* JADX INFO: renamed from: b */
        private static float m79233b(float f11, float f12, float f13) {
            return Math.min(f12, Math.max(f11, f13));
        }

        /* JADX INFO: renamed from: a */
        public C18801a m79234a() {
            this.f60782a.m79228b();
            this.f60782a.m79229c();
            return this.f60782a;
        }

        /* JADX INFO: renamed from: c */
        b mo79235c(TypedArray typedArray) {
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_clip_to_children)) {
                m79238g(typedArray.getBoolean(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_clip_to_children, this.f60782a.f60775o));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_auto_start)) {
                m79236e(typedArray.getBoolean(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_auto_start, this.f60782a.f60776p));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_base_alpha)) {
                m79237f(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_base_alpha, 0.3f));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_highlight_alpha)) {
                m79245n(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_highlight_alpha, 1.0f));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_duration)) {
                m79241j(typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_duration, (int) this.f60782a.f60780t));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_count)) {
                m79247p(typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_count, this.f60782a.f60778r));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_delay)) {
                m79248q(typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_delay, (int) this.f60782a.f60781u));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_mode)) {
                m79249r(typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_repeat_mode, this.f60782a.f60779s));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_direction)) {
                int i11 = typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_direction, this.f60782a.f60764d);
                if (i11 == 1) {
                    m79239h(1);
                } else if (i11 == 2) {
                    m79239h(2);
                } else if (i11 != 3) {
                    m79239h(0);
                } else {
                    m79239h(3);
                }
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_shape)) {
                if (typedArray.getInt(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_shape, this.f60782a.f60767g) != 1) {
                    m79250s(0);
                } else {
                    m79250s(1);
                }
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_dropoff)) {
                m79240i(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_dropoff, this.f60782a.f60773m));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_fixed_width)) {
                m79243l(typedArray.getDimensionPixelSize(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_fixed_width, this.f60782a.f60768h));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_fixed_height)) {
                m79242k(typedArray.getDimensionPixelSize(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_fixed_height, this.f60782a.f60769i));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_intensity)) {
                m79246o(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_intensity, this.f60782a.f60772l));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_width_ratio)) {
                m79252u(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_width_ratio, this.f60782a.f60770j));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_height_ratio)) {
                m79244m(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_height_ratio, this.f60782a.f60771k));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_tilt)) {
                m79251t(typedArray.getFloat(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_tilt, this.f60782a.f60774n));
            }
            return mo79231d();
        }

        /* JADX INFO: renamed from: d */
        protected abstract b mo79231d();

        /* JADX INFO: renamed from: e */
        public b m79236e(boolean z11) {
            this.f60782a.f60776p = z11;
            return mo79231d();
        }

        /* JADX INFO: renamed from: f */
        public b m79237f(float f11) {
            int iM79233b = (int) (m79233b(0.0f, 1.0f, f11) * 255.0f);
            C18801a c18801a = this.f60782a;
            c18801a.f60766f = (iM79233b << 24) | (c18801a.f60766f & 16777215);
            return mo79231d();
        }

        /* JADX INFO: renamed from: g */
        public b m79238g(boolean z11) {
            this.f60782a.f60775o = z11;
            return mo79231d();
        }

        /* JADX INFO: renamed from: h */
        public b m79239h(int i11) {
            this.f60782a.f60764d = i11;
            return mo79231d();
        }

        /* JADX INFO: renamed from: i */
        public b m79240i(float f11) {
            if (f11 >= 0.0f) {
                this.f60782a.f60773m = f11;
                return mo79231d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f11);
        }

        /* JADX INFO: renamed from: j */
        public b m79241j(long j11) {
            if (j11 >= 0) {
                this.f60782a.f60780t = j11;
                return mo79231d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j11);
        }

        /* JADX INFO: renamed from: k */
        public b m79242k(int i11) {
            if (i11 >= 0) {
                this.f60782a.f60769i = i11;
                return mo79231d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i11);
        }

        /* JADX INFO: renamed from: l */
        public b m79243l(int i11) {
            if (i11 >= 0) {
                this.f60782a.f60768h = i11;
                return mo79231d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i11);
        }

        /* JADX INFO: renamed from: m */
        public b m79244m(float f11) {
            if (f11 >= 0.0f) {
                this.f60782a.f60771k = f11;
                return mo79231d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f11);
        }

        /* JADX INFO: renamed from: n */
        public b m79245n(float f11) {
            int iM79233b = (int) (m79233b(0.0f, 1.0f, f11) * 255.0f);
            C18801a c18801a = this.f60782a;
            c18801a.f60765e = (iM79233b << 24) | (c18801a.f60765e & 16777215);
            return mo79231d();
        }

        /* JADX INFO: renamed from: o */
        public b m79246o(float f11) {
            if (f11 >= 0.0f) {
                this.f60782a.f60772l = f11;
                return mo79231d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f11);
        }

        /* JADX INFO: renamed from: p */
        public b m79247p(int i11) {
            this.f60782a.f60778r = i11;
            return mo79231d();
        }

        /* JADX INFO: renamed from: q */
        public b m79248q(long j11) {
            if (j11 >= 0) {
                this.f60782a.f60781u = j11;
                return mo79231d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j11);
        }

        /* JADX INFO: renamed from: r */
        public b m79249r(int i11) {
            this.f60782a.f60779s = i11;
            return mo79231d();
        }

        /* JADX INFO: renamed from: s */
        public b m79250s(int i11) {
            this.f60782a.f60767g = i11;
            return mo79231d();
        }

        /* JADX INFO: renamed from: t */
        public b m79251t(float f11) {
            this.f60782a.f60774n = f11;
            return mo79231d();
        }

        /* JADX INFO: renamed from: u */
        public b m79252u(float f11) {
            if (f11 >= 0.0f) {
                this.f60782a.f60770j = f11;
                return mo79231d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.shimmer.a$c */
    public static class c extends b {
        public c() {
            this.f60782a.f60777q = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.transsion.shorttv.base.widget.shimmer.C18801a.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public c mo79235c(TypedArray typedArray) {
            super.mo79235c(typedArray);
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_base_color)) {
                m79255x(typedArray.getColor(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_base_color, this.f60782a.f60766f));
            }
            if (typedArray.hasValue(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_highlight_color)) {
                m79256y(typedArray.getColor(R$styleable.ShortTvShimmerFrameLayout_short_tv_shimmer_highlight_color, this.f60782a.f60765e));
            }
            return mo79231d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.transsion.shorttv.base.widget.shimmer.C18801a.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public c mo79231d() {
            return this;
        }

        /* JADX INFO: renamed from: x */
        public c m79255x(int i11) {
            C18801a c18801a = this.f60782a;
            c18801a.f60766f = (i11 & 16777215) | (c18801a.f60766f & ViewCompat.MEASURED_STATE_MASK);
            return mo79231d();
        }

        /* JADX INFO: renamed from: y */
        public c m79256y(int i11) {
            this.f60782a.f60765e = i11;
            return mo79231d();
        }
    }

    C18801a() {
    }

    /* JADX INFO: renamed from: a */
    int m79227a(int i11) {
        int i12 = this.f60769i;
        return i12 > 0 ? i12 : Math.round(this.f60771k * i11);
    }

    /* JADX INFO: renamed from: b */
    void m79228b() {
        if (this.f60767g != 1) {
            int[] iArr = this.f60762b;
            int i11 = this.f60766f;
            iArr[0] = i11;
            int i12 = this.f60765e;
            iArr[1] = i12;
            iArr[2] = i12;
            iArr[3] = i11;
            return;
        }
        int[] iArr2 = this.f60762b;
        int i13 = this.f60765e;
        iArr2[0] = i13;
        iArr2[1] = i13;
        int i14 = this.f60766f;
        iArr2[2] = i14;
        iArr2[3] = i14;
    }

    /* JADX INFO: renamed from: c */
    void m79229c() {
        if (this.f60767g != 1) {
            this.f60761a[0] = Math.max(((1.0f - this.f60772l) - this.f60773m) / 2.0f, 0.0f);
            this.f60761a[1] = Math.max(((1.0f - this.f60772l) - 0.001f) / 2.0f, 0.0f);
            this.f60761a[2] = Math.min(((this.f60772l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f60761a[3] = Math.min(((this.f60772l + 1.0f) + this.f60773m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f60761a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f60772l, 1.0f);
        this.f60761a[2] = Math.min(this.f60772l + this.f60773m, 1.0f);
        this.f60761a[3] = 1.0f;
    }

    /* JADX INFO: renamed from: d */
    int m79230d(int i11) {
        int i12 = this.f60768h;
        return i12 > 0 ? i12 : Math.round(this.f60770j * i11);
    }
}
