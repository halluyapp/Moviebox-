package com.transsion.shorttv_pugc.base.widget.expand;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.transsion.shorttv.R$mipmap;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.R$styleable;
import com.transsion.shorttv_pugc.base.widget.TnTextView;
import kotlin.jvm.functions.Function0;
import p660ot.C26727a;

/* JADX INFO: loaded from: classes6.dex */
public class ExpandView extends TnTextView {
    public static final int STATE_EXPAND = 1;
    public static final int STATE_SHRINK = 0;

    /* JADX INFO: renamed from: A */
    private String f61818A;

    /* JADX INFO: renamed from: B */
    private String f61819B;

    /* JADX INFO: renamed from: C */
    private boolean f61820C;

    /* JADX INFO: renamed from: b */
    private String f61821b;

    /* JADX INFO: renamed from: c */
    private String f61822c;

    /* JADX INFO: renamed from: d */
    private String f61823d;

    /* JADX INFO: renamed from: e */
    private String f61824e;

    /* JADX INFO: renamed from: f */
    private String f61825f;

    /* JADX INFO: renamed from: g */
    private boolean f61826g;

    /* JADX INFO: renamed from: h */
    private boolean f61827h;

    /* JADX INFO: renamed from: i */
    private boolean f61828i;

    /* JADX INFO: renamed from: j */
    private boolean f61829j;

    /* JADX INFO: renamed from: k */
    private boolean f61830k;

    /* JADX INFO: renamed from: l */
    private int f61831l;

    /* JADX INFO: renamed from: m */
    private int f61832m;

    /* JADX INFO: renamed from: n */
    private int f61833n;

    /* JADX INFO: renamed from: o */
    private int f61834o;

    /* JADX INFO: renamed from: p */
    private int f61835p;

    /* JADX INFO: renamed from: q */
    private int f61836q;

    /* JADX INFO: renamed from: r */
    private int f61837r;

    /* JADX INFO: renamed from: s */
    private float f61838s;

    /* JADX INFO: renamed from: t */
    private boolean f61839t;

    /* JADX INFO: renamed from: u */
    private ClickableSpan f61840u;

    /* JADX INFO: renamed from: v */
    private C26727a f61841v;

    /* JADX INFO: renamed from: w */
    private C26727a f61842w;

    /* JADX INFO: renamed from: x */
    private Layout f61843x;

    /* JADX INFO: renamed from: y */
    private CharSequence f61844y;

    /* JADX INFO: renamed from: z */
    private InterfaceC19257c f61845z;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.expand.ExpandView$a */
    class ViewTreeObserverOnGlobalLayoutListenerC19255a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC19255a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ExpandView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ExpandView expandView = ExpandView.this;
            expandView.m80641l(expandView.f61844y);
            ExpandView.this.f61830k = true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.expand.ExpandView$b */
    public interface InterfaceC19256b {
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.widget.expand.ExpandView$c */
    public interface InterfaceC19257c {
        /* JADX INFO: renamed from: a */
        void mo80645a(ExpandView expandView);

        /* JADX INFO: renamed from: b */
        void mo80646b(ExpandView expandView);
    }

    public ExpandView(Context context) {
        this(context, null);
    }

    public ExpandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61824e = "  ";
        this.f61825f = "  ";
        this.f61826g = false;
        this.f61827h = true;
        this.f61828i = true;
        this.f61829j = true;
        this.f61830k = false;
        this.f61831l = 1;
        this.f61832m = -1711276033;
        this.f61833n = -1711276033;
        this.f61834o = 0;
        this.f61835p = 0;
        this.f61836q = -1;
        this.f61837r = 0;
        this.f61839t = true;
        this.f61820C = false;
        m80639j(context, attributeSet);
    }

    public ExpandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f61824e = "  ";
        this.f61825f = "  ";
        this.f61826g = false;
        this.f61827h = true;
        this.f61828i = true;
        this.f61829j = true;
        this.f61830k = false;
        this.f61831l = 1;
        this.f61832m = -1711276033;
        this.f61833n = -1711276033;
        this.f61834o = 0;
        this.f61835p = 0;
        this.f61836q = -1;
        this.f61837r = 0;
        this.f61839t = true;
        this.f61820C = false;
        m80639j(context, attributeSet);
    }

    private int getLayoutWidth() {
        Layout layout = getLayout();
        int width = layout != null ? layout.getWidth() : 0;
        return (width > 0 || getWidth() == 0) ? width : (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: h */
    private CharSequence m80637h(int i11) {
        int i12;
        TextPaint paint = getPaint();
        String str = "";
        if (this.f61844y != null) {
            str = "" + ((Object) this.f61844y);
        }
        if (this.f61843x == null) {
            this.f61843x = new StaticLayout(str, paint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
        int lineCount = this.f61843x.getLineCount();
        int i13 = this.f61831l;
        if (lineCount <= i13) {
            CharSequence charSequence = this.f61844y;
            if (charSequence == null) {
                charSequence = " ";
            }
            return m80643n(new SpannableStringBuilder(charSequence));
        }
        int i14 = this.f61837r;
        if (i14 != 0) {
            if (i14 != 1 || !this.f61829j) {
                return m80643n(new SpannableStringBuilder(this.f61844y));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f61844y);
            spannableStringBuilder.append((CharSequence) this.f61825f).append((CharSequence) this.f61823d);
            int length = (spannableStringBuilder.length() - this.f61825f.length()) - this.f61823d.length();
            int length2 = spannableStringBuilder.length();
            i12 = length >= 0 ? length : 0;
            spannableStringBuilder.setSpan(this.f61840u, i12, length2, 33);
            spannableStringBuilder.setSpan(this.f61841v, i12, length2, 33);
            return m80643n(spannableStringBuilder);
        }
        int lineEnd = this.f61843x.getLineEnd(i13 - 1);
        this.f61843x.getLineStart(this.f61831l - 1);
        CharSequence charSequence2 = this.f61844y;
        if (charSequence2 != null && charSequence2.length() <= lineEnd) {
            lineEnd = this.f61844y.length() - 1;
        }
        CharSequence charSequence3 = this.f61844y;
        if (charSequence3 == null || lineEnd <= 0) {
            return charSequence3;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder((charSequence3.subSequence(0, Math.max(0, lineEnd - 3)).toString() + this.f61821b).replace("\n\n", "\n"));
        if (this.f61828i) {
            spannableStringBuilder2.append((CharSequence) this.f61824e);
            spannableStringBuilder2.append((CharSequence) this.f61822c);
            int length3 = (spannableStringBuilder2.length() - this.f61824e.length()) - this.f61822c.length();
            int length4 = spannableStringBuilder2.length();
            i12 = length3 >= 0 ? length3 : 0;
            spannableStringBuilder2.setSpan(this.f61840u, i12, length4, 33);
            spannableStringBuilder2.setSpan(this.f61842w, i12, length4, 33);
        }
        return m80643n(spannableStringBuilder2);
    }

    /* JADX INFO: renamed from: i */
    private void m80638i() {
        if (this.f61838s == 0.0f) {
            this.f61838s = getTextSize();
        }
        boolean z11 = getLayoutDirection() == 1;
        this.f61842w = new C26727a(getContext(), this.f61839t ? R$mipmap.short_tv_ic_down_more : -111, this.f61832m, this.f61834o, this.f61838s, 0, z11);
        this.f61841v = new C26727a(getContext(), this.f61839t ? R$mipmap.short_tv_ic_up_hide : -111, this.f61833n, this.f61835p, this.f61838s, 0, z11);
        setMovementMethod(new LinkMovementMethod());
        if (TextUtils.isEmpty(this.f61821b)) {
            this.f61821b = "...";
        }
        if (TextUtils.isEmpty(this.f61822c)) {
            this.f61822c = getResources().getString(R$string.short_tv_str_more);
        }
        if (TextUtils.isEmpty(this.f61823d)) {
            this.f61823d = "\n" + getResources().getString(R$string.short_tv_str_hide);
        }
        if (this.f61824e == null) {
            this.f61824e = "  ";
        }
        if (this.f61825f == null) {
            this.f61825f = "  ";
        }
        setOnClickListener(new View.OnClickListener() { // from class: ot.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81188a.m80640k(view);
            }
        });
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC19255a());
    }

    /* JADX INFO: renamed from: j */
    private void m80639j(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            m80638i();
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExpandView);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == R$styleable.ExpandView_pop_hint_text_size) {
                this.f61838s = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
            } else if (index == R$styleable.ExpandView_pop_reverse_Lines) {
                this.f61831l = typedArrayObtainStyledAttributes.getInteger(index, 1);
            } else if (index == R$styleable.ExpandView_pop_ellipsis) {
                this.f61821b = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_expand_hint) {
                this.f61822c = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_shrink_hint) {
                this.f61823d = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_toggle_enabled) {
                this.f61826g = typedArrayObtainStyledAttributes.getBoolean(index, this.f61826g);
            } else if (index == R$styleable.ExpandView_pop_show_expand_hint) {
                this.f61828i = typedArrayObtainStyledAttributes.getBoolean(index, this.f61828i);
            } else if (index == R$styleable.ExpandView_pop_show_shrink_hint) {
                this.f61829j = typedArrayObtainStyledAttributes.getBoolean(index, this.f61829j);
            } else if (index == R$styleable.ExpandView_pop_expand_hint_color) {
                this.f61832m = typedArrayObtainStyledAttributes.getInteger(index, -1711276033);
            } else if (index == R$styleable.ExpandView_pop_shrink_hint_color) {
                this.f61833n = typedArrayObtainStyledAttributes.getInteger(index, -1711276033);
            } else if (index == R$styleable.ExpandView_pop_expand_bg_Color) {
                this.f61834o = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.ExpandView_pop_shrink_bg_color) {
                this.f61835p = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.ExpandView_pop_Init_state) {
                this.f61837r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.ExpandView_pop_expand_gap) {
                this.f61824e = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_collapse_gap) {
                this.f61825f = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_hash_tag_color) {
                this.f61836q = typedArrayObtainStyledAttributes.getInteger(index, this.f61836q);
            } else if (index == R$styleable.ExpandView_pop_show_hint_icon) {
                this.f61839t = typedArrayObtainStyledAttributes.getBoolean(index, true);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        m80638i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m80640k(View view) {
        m80644o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ CharSequence m80642m(final CharSequence charSequence) {
        if (!this.f61827h) {
            return charSequence;
        }
        if (!TextUtils.equals(charSequence, this.f61844y)) {
            this.f61843x = null;
        }
        this.f61844y = charSequence;
        int layoutWidth = getLayoutWidth();
        if (layoutWidth > 0) {
            this.f61820C = true;
            return this.f61844y == null ? charSequence : m80637h(layoutWidth);
        }
        if (this.f61830k) {
            postDelayed(new Runnable() { // from class: ot.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81191a.m80641l(charSequence);
                }
            }, 100L);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private CharSequence m80643n(SpannableStringBuilder spannableStringBuilder) {
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o */
    private void m80644o() {
        if (getText().toString().contains(this.f61822c) || getText().toString().contains(this.f61823d)) {
            int i11 = this.f61837r;
            if (i11 == 0) {
                this.f61837r = 1;
                InterfaceC19257c interfaceC19257c = this.f61845z;
                if (interfaceC19257c != null) {
                    interfaceC19257c.mo80645a(this);
                }
            } else if (i11 == 1) {
                this.f61837r = 0;
                InterfaceC19257c interfaceC19257c2 = this.f61845z;
                if (interfaceC19257c2 != null) {
                    interfaceC19257c2.mo80646b(this);
                }
            }
            m80641l(this.f61844y);
        }
    }

    public void addLegacyHashTag(String str, String str2) {
        this.f61819B = str;
        this.f61818A = str2;
    }

    @Override // com.transsion.shorttv_pugc.base.widget.TnTextView, lt.InterfaceC25678a
    public void changeLocal() {
        this.f61822c = getResources().getString(R$string.short_tv_str_more);
        this.f61823d = getResources().getString(R$string.short_tv_str_hide);
        super.changeLocal();
    }

    public int getExpandState() {
        return this.f61837r;
    }

    public boolean isOutLines() {
        Layout layout = this.f61843x;
        return layout != null && layout.getLineCount() > this.f61831l;
    }

    public boolean isSetTitleSuccess() {
        return this.f61820C;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void reset() {
        this.f61837r = 0;
        InterfaceC19257c interfaceC19257c = this.f61845z;
        if (interfaceC19257c != null) {
            interfaceC19257c.mo80646b(this);
        }
        m80641l(this.f61844y);
    }

    public void setCollapseEnable(boolean z11) {
        this.f61827h = z11;
    }

    public void setExpandListener(InterfaceC19257c interfaceC19257c) {
        this.f61845z = interfaceC19257c;
    }

    public void setOnClickHashTagListener(InterfaceC19256b interfaceC19256b) {
    }

    /* JADX INFO: renamed from: setTitle, reason: merged with bridge method [inline-methods] */
    public void m80641l(final CharSequence charSequence) {
        setTextAction(new Function0() { // from class: ot.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f81189a.m80642m(charSequence);
            }
        });
    }
}
