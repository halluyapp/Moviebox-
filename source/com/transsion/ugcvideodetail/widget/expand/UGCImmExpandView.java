package com.transsion.ugcvideodetail.widget.expand;

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
import aw.C4711a;
import com.transsion.shorttv.R$mipmap;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.R$styleable;
import com.transsion.shorttv_pugc.base.widget.TnTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class UGCImmExpandView extends TnTextView {
    public static final int STATE_EXPAND = 1;
    public static final int STATE_SHRINK = 0;

    /* JADX INFO: renamed from: A */
    private String f64651A;

    /* JADX INFO: renamed from: B */
    private boolean f64652B;

    /* JADX INFO: renamed from: b */
    private String f64653b;

    /* JADX INFO: renamed from: c */
    private String f64654c;

    /* JADX INFO: renamed from: d */
    private String f64655d;

    /* JADX INFO: renamed from: e */
    private String f64656e;

    /* JADX INFO: renamed from: f */
    private String f64657f;

    /* JADX INFO: renamed from: g */
    private boolean f64658g;

    /* JADX INFO: renamed from: h */
    private boolean f64659h;

    /* JADX INFO: renamed from: i */
    private boolean f64660i;

    /* JADX INFO: renamed from: j */
    private boolean f64661j;

    /* JADX INFO: renamed from: k */
    private boolean f64662k;

    /* JADX INFO: renamed from: l */
    private int f64663l;

    /* JADX INFO: renamed from: m */
    private int f64664m;

    /* JADX INFO: renamed from: n */
    private int f64665n;

    /* JADX INFO: renamed from: o */
    private int f64666o;

    /* JADX INFO: renamed from: p */
    private int f64667p;

    /* JADX INFO: renamed from: q */
    private int f64668q;

    /* JADX INFO: renamed from: r */
    private int f64669r;

    /* JADX INFO: renamed from: s */
    private float f64670s;

    /* JADX INFO: renamed from: t */
    private boolean f64671t;

    /* JADX INFO: renamed from: u */
    private ClickableSpan f64672u;

    /* JADX INFO: renamed from: v */
    private C4711a f64673v;

    /* JADX INFO: renamed from: w */
    private C4711a f64674w;

    /* JADX INFO: renamed from: x */
    private Layout f64675x;

    /* JADX INFO: renamed from: y */
    private CharSequence f64676y;

    /* JADX INFO: renamed from: z */
    private String f64677z;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.expand.UGCImmExpandView$a */
    class ViewTreeObserverOnGlobalLayoutListenerC20399a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC20399a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            UGCImmExpandView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            UGCImmExpandView uGCImmExpandView = UGCImmExpandView.this;
            uGCImmExpandView.m84507l(uGCImmExpandView.f64676y);
            UGCImmExpandView.this.f64662k = true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.expand.UGCImmExpandView$b */
    public interface InterfaceC20400b {
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.expand.UGCImmExpandView$c */
    public interface InterfaceC20401c {
    }

    public UGCImmExpandView(Context context) {
        this(context, null);
    }

    public UGCImmExpandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64656e = "  ";
        this.f64657f = "  ";
        this.f64658g = false;
        this.f64659h = true;
        this.f64660i = true;
        this.f64661j = true;
        this.f64662k = false;
        this.f64663l = 1;
        this.f64664m = -1711276033;
        this.f64665n = -1711276033;
        this.f64666o = 0;
        this.f64667p = 0;
        this.f64668q = -1;
        this.f64669r = 0;
        this.f64671t = true;
        this.f64652B = false;
        m84505j(context, attributeSet);
    }

    public UGCImmExpandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f64656e = "  ";
        this.f64657f = "  ";
        this.f64658g = false;
        this.f64659h = true;
        this.f64660i = true;
        this.f64661j = true;
        this.f64662k = false;
        this.f64663l = 1;
        this.f64664m = -1711276033;
        this.f64665n = -1711276033;
        this.f64666o = 0;
        this.f64667p = 0;
        this.f64668q = -1;
        this.f64669r = 0;
        this.f64671t = true;
        this.f64652B = false;
        m84505j(context, attributeSet);
    }

    private int getLayoutWidth() {
        Layout layout = getLayout();
        int width = layout != null ? layout.getWidth() : 0;
        return (width > 0 || getWidth() == 0) ? width : (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: h */
    private CharSequence m84503h(int i11) {
        int i12;
        TextPaint paint = getPaint();
        String str = "";
        if (this.f64676y != null) {
            str = "" + ((Object) this.f64676y);
        }
        if (this.f64675x == null) {
            this.f64675x = new StaticLayout(str, paint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
        int lineCount = this.f64675x.getLineCount();
        int i13 = this.f64663l;
        if (lineCount <= i13) {
            CharSequence charSequence = this.f64676y;
            if (charSequence == null) {
                charSequence = " ";
            }
            return m84509n(new SpannableStringBuilder(charSequence));
        }
        int i14 = this.f64669r;
        if (i14 != 0) {
            if (i14 != 1 || !this.f64661j) {
                return m84509n(new SpannableStringBuilder(this.f64676y));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f64676y);
            spannableStringBuilder.append((CharSequence) this.f64657f).append((CharSequence) this.f64655d);
            int length = (spannableStringBuilder.length() - this.f64657f.length()) - this.f64655d.length();
            int length2 = spannableStringBuilder.length();
            i12 = length >= 0 ? length : 0;
            spannableStringBuilder.setSpan(this.f64672u, i12, length2, 33);
            spannableStringBuilder.setSpan(this.f64673v, i12, length2, 33);
            return m84509n(spannableStringBuilder);
        }
        int lineEnd = this.f64675x.getLineEnd(i13 - 1);
        this.f64675x.getLineStart(this.f64663l - 1);
        CharSequence charSequence2 = this.f64676y;
        if (charSequence2 != null && charSequence2.length() <= lineEnd) {
            lineEnd = this.f64676y.length() - 1;
        }
        CharSequence charSequence3 = this.f64676y;
        if (charSequence3 == null || lineEnd <= 0) {
            return charSequence3;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder((charSequence3.subSequence(0, Math.max(0, lineEnd - 3)).toString() + this.f64653b).replace("\n\n", "\n"));
        if (this.f64660i) {
            spannableStringBuilder2.append((CharSequence) this.f64656e);
            spannableStringBuilder2.append((CharSequence) this.f64654c);
            int length3 = (spannableStringBuilder2.length() - this.f64656e.length()) - this.f64654c.length();
            int length4 = spannableStringBuilder2.length();
            i12 = length3 >= 0 ? length3 : 0;
            spannableStringBuilder2.setSpan(this.f64672u, i12, length4, 33);
            spannableStringBuilder2.setSpan(this.f64674w, i12, length4, 33);
        }
        return m84509n(spannableStringBuilder2);
    }

    /* JADX INFO: renamed from: i */
    private void m84504i() {
        if (this.f64670s == 0.0f) {
            this.f64670s = getTextSize();
        }
        boolean z11 = getLayoutDirection() == 1;
        this.f64674w = new C4711a(getContext(), this.f64671t ? R$mipmap.short_tv_ic_down_more : -111, this.f64664m, this.f64666o, this.f64670s, 0, z11);
        this.f64673v = new C4711a(getContext(), this.f64671t ? R$mipmap.short_tv_ic_up_hide : -111, this.f64665n, this.f64667p, this.f64670s, 0, z11);
        setMovementMethod(new LinkMovementMethod());
        if (TextUtils.isEmpty(this.f64653b)) {
            this.f64653b = "...";
        }
        if (TextUtils.isEmpty(this.f64654c)) {
            this.f64654c = getResources().getString(R$string.short_tv_str_more);
        }
        if (TextUtils.isEmpty(this.f64655d)) {
            this.f64655d = "\n" + getResources().getString(R$string.short_tv_str_hide);
        }
        if (this.f64656e == null) {
            this.f64656e = "  ";
        }
        if (this.f64657f == null) {
            this.f64657f = "  ";
        }
        setOnClickListener(new View.OnClickListener() { // from class: aw.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16775a.m84506k(view);
            }
        });
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC20399a());
    }

    /* JADX INFO: renamed from: j */
    private void m84505j(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            m84504i();
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExpandView);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == R$styleable.ExpandView_pop_hint_text_size) {
                this.f64670s = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
            } else if (index == R$styleable.ExpandView_pop_reverse_Lines) {
                this.f64663l = typedArrayObtainStyledAttributes.getInteger(index, 1);
            } else if (index == R$styleable.ExpandView_pop_ellipsis) {
                this.f64653b = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_expand_hint) {
                this.f64654c = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_shrink_hint) {
                this.f64655d = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_toggle_enabled) {
                this.f64658g = typedArrayObtainStyledAttributes.getBoolean(index, this.f64658g);
            } else if (index == R$styleable.ExpandView_pop_show_expand_hint) {
                this.f64660i = typedArrayObtainStyledAttributes.getBoolean(index, this.f64660i);
            } else if (index == R$styleable.ExpandView_pop_show_shrink_hint) {
                this.f64661j = typedArrayObtainStyledAttributes.getBoolean(index, this.f64661j);
            } else if (index == R$styleable.ExpandView_pop_expand_hint_color) {
                this.f64664m = typedArrayObtainStyledAttributes.getInteger(index, -1711276033);
            } else if (index == R$styleable.ExpandView_pop_shrink_hint_color) {
                this.f64665n = typedArrayObtainStyledAttributes.getInteger(index, -1711276033);
            } else if (index == R$styleable.ExpandView_pop_expand_bg_Color) {
                this.f64666o = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.ExpandView_pop_shrink_bg_color) {
                this.f64667p = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.ExpandView_pop_Init_state) {
                this.f64669r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.ExpandView_pop_expand_gap) {
                this.f64656e = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_collapse_gap) {
                this.f64657f = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_hash_tag_color) {
                this.f64668q = typedArrayObtainStyledAttributes.getInteger(index, this.f64668q);
            } else if (index == R$styleable.ExpandView_pop_show_hint_icon) {
                this.f64671t = typedArrayObtainStyledAttributes.getBoolean(index, true);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        m84504i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m84506k(View view) {
        m84510o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ CharSequence m84508m(final CharSequence charSequence) {
        if (!this.f64659h) {
            return charSequence;
        }
        if (!TextUtils.equals(charSequence, this.f64676y)) {
            this.f64675x = null;
        }
        this.f64676y = charSequence;
        int layoutWidth = getLayoutWidth();
        if (layoutWidth > 0) {
            this.f64652B = true;
            return this.f64676y == null ? charSequence : m84503h(layoutWidth);
        }
        if (this.f64662k) {
            postDelayed(new Runnable() { // from class: aw.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16776a.m84507l(charSequence);
                }
            }, 100L);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private CharSequence m84509n(SpannableStringBuilder spannableStringBuilder) {
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: o */
    private void m84510o() {
        if (getText().toString().contains(this.f64654c) || getText().toString().contains(this.f64655d)) {
            int i11 = this.f64669r;
            if (i11 == 0) {
                this.f64669r = 1;
            } else if (i11 == 1) {
                this.f64669r = 0;
            }
            m84507l(this.f64676y);
        }
    }

    public void addLegacyHashTag(String str, String str2) {
        this.f64651A = str;
        this.f64677z = str2;
    }

    @Override // com.transsion.shorttv_pugc.base.widget.TnTextView, lt.InterfaceC25678a
    public void changeLocal() {
        this.f64654c = getResources().getString(R$string.short_tv_str_more);
        this.f64655d = getResources().getString(R$string.short_tv_str_hide);
        super.changeLocal();
    }

    public int getExpandState() {
        return this.f64669r;
    }

    public boolean isOutLines() {
        Layout layout = this.f64675x;
        return layout != null && layout.getLineCount() > this.f64663l;
    }

    public boolean isSetTitleSuccess() {
        return this.f64652B;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void reset() {
        this.f64669r = 0;
        m84507l(this.f64676y);
    }

    public void setCollapseEnable(boolean z11) {
        this.f64659h = z11;
    }

    public void setExpandListener(InterfaceC20401c interfaceC20401c) {
    }

    public void setOnClickHashTagListener(InterfaceC20400b interfaceC20400b) {
    }

    /* JADX INFO: renamed from: setTitle, reason: merged with bridge method [inline-methods] */
    public void m84507l(final CharSequence charSequence) {
        setTextAction(new Function0() { // from class: aw.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f16773a.m84508m(charSequence);
            }
        });
    }
}
