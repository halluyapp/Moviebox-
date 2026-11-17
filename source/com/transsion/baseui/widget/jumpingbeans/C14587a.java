package com.transsion.baseui.widget.jumpingbeans;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.transsion.baseui.widget.jumpingbeans.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14587a {

    /* JADX INFO: renamed from: a */
    private final JumpingBeansSpan[] f51249a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f51250b;

    /* JADX INFO: renamed from: com.transsion.baseui.widget.jumpingbeans.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final TextView f51251a;

        /* JADX INFO: renamed from: b */
        private int f51252b;

        /* JADX INFO: renamed from: c */
        private int f51253c;

        /* JADX INFO: renamed from: d */
        private float f51254d = 0.65f;

        /* JADX INFO: renamed from: e */
        private int f51255e = 1300;

        /* JADX INFO: renamed from: f */
        private int f51256f = -1;

        /* JADX INFO: renamed from: g */
        private CharSequence f51257g;

        /* JADX INFO: renamed from: h */
        private boolean f51258h;

        a(TextView textView) {
            this.f51251a = textView;
        }

        /* JADX INFO: renamed from: b */
        private JumpingBeansSpan[] m65780b(SpannableStringBuilder spannableStringBuilder) {
            JumpingBeansSpan[] jumpingBeansSpanArr = {new JumpingBeansSpan(this.f51251a, this.f51255e, 0, 0, this.f51254d)};
            spannableStringBuilder.setSpan(jumpingBeansSpanArr[0], this.f51252b, this.f51253c, 33);
            return jumpingBeansSpanArr;
        }

        /* JADX INFO: renamed from: c */
        private JumpingBeansSpan[] m65781c(SpannableStringBuilder spannableStringBuilder) {
            if (this.f51256f == -1) {
                this.f51256f = this.f51255e / ((this.f51253c - this.f51252b) * 3);
            }
            int i11 = this.f51253c;
            int i12 = this.f51252b;
            JumpingBeansSpan[] jumpingBeansSpanArr = new JumpingBeansSpan[i11 - i12];
            while (i12 < this.f51253c) {
                JumpingBeansSpan jumpingBeansSpan = new JumpingBeansSpan(this.f51251a, this.f51255e, i12 - this.f51252b, this.f51256f, this.f51254d);
                int i13 = i12 + 1;
                spannableStringBuilder.setSpan(jumpingBeansSpan, i12, i13, 33);
                jumpingBeansSpanArr[i12 - this.f51252b] = jumpingBeansSpan;
                i12 = i13;
            }
            return jumpingBeansSpanArr;
        }

        /* JADX INFO: renamed from: d */
        private static CharSequence m65782d(int i11, int i12, CharSequence charSequence) {
            if (charSequence == null) {
                throw new NullPointerException("The textView text must not be null");
            }
            if (i12 < i11) {
                throw new IllegalArgumentException("The start position must be smaller than the end position");
            }
            if (i11 < 0) {
                throw new IndexOutOfBoundsException("The start position must be non-negative");
            }
            if (i12 <= charSequence.length()) {
                return charSequence;
            }
            throw new IndexOutOfBoundsException("The end position must be smaller than the text length");
        }

        /* JADX INFO: renamed from: a */
        public C14587a m65783a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f51257g);
            JumpingBeansSpan[] jumpingBeansSpanArrM65781c = this.f51258h ? m65781c(spannableStringBuilder) : m65780b(spannableStringBuilder);
            this.f51251a.setText(spannableStringBuilder);
            return new C14587a(jumpingBeansSpanArrM65781c, this.f51251a);
        }

        /* JADX INFO: renamed from: e */
        public a m65784e(int i11, int i12) {
            CharSequence text = this.f51251a.getText();
            m65782d(i11, i12, text);
            this.f51257g = text;
            this.f51258h = true;
            this.f51252b = i11;
            this.f51253c = i12;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m65785f(float f11) {
            if (f11 <= 0.0f || f11 > 1.0f) {
                throw new IllegalArgumentException("The animated range must be in the (0, 1] range");
            }
            this.f51254d = f11;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m65786g(boolean z11) {
            this.f51258h = z11;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m65787h(int i11) {
            if (i11 < 1) {
                throw new IllegalArgumentException("The loop duration must be bigger than zero");
            }
            this.f51255e = i11;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m65788i(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("The wave char offset must be non-negative");
            }
            this.f51256f = i11;
            return this;
        }
    }

    private C14587a(JumpingBeansSpan[] jumpingBeansSpanArr, TextView textView) {
        this.f51249a = jumpingBeansSpanArr;
        this.f51250b = new WeakReference(textView);
    }

    /* JADX INFO: renamed from: a */
    public static a m65779a(TextView textView) {
        return new a(textView);
    }
}
