package com.transsion.shorttv.base.widget.expand;

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
import com.transsion.shorttv.base.widget.TnTextView;
import kotlin.jvm.functions.Function0;
import p526js.C24464a;

/* JADX INFO: loaded from: classes6.dex */
public class ExpandView extends TnTextView {
    public static final int STATE_EXPAND = 1;
    public static final int STATE_SHRINK = 0;

    /* JADX INFO: renamed from: A */
    private String f60712A;

    /* JADX INFO: renamed from: B */
    private String f60713B;

    /* JADX INFO: renamed from: b */
    private String f60714b;

    /* JADX INFO: renamed from: c */
    private String f60715c;

    /* JADX INFO: renamed from: d */
    private String f60716d;

    /* JADX INFO: renamed from: e */
    private String f60717e;

    /* JADX INFO: renamed from: f */
    private String f60718f;

    /* JADX INFO: renamed from: g */
    private boolean f60719g;

    /* JADX INFO: renamed from: h */
    private boolean f60720h;

    /* JADX INFO: renamed from: i */
    private boolean f60721i;

    /* JADX INFO: renamed from: j */
    private boolean f60722j;

    /* JADX INFO: renamed from: k */
    private boolean f60723k;

    /* JADX INFO: renamed from: l */
    private int f60724l;

    /* JADX INFO: renamed from: m */
    private int f60725m;

    /* JADX INFO: renamed from: n */
    private int f60726n;

    /* JADX INFO: renamed from: o */
    private int f60727o;

    /* JADX INFO: renamed from: p */
    private int f60728p;

    /* JADX INFO: renamed from: q */
    private int f60729q;

    /* JADX INFO: renamed from: r */
    private int f60730r;

    /* JADX INFO: renamed from: s */
    private float f60731s;

    /* JADX INFO: renamed from: t */
    private boolean f60732t;

    /* JADX INFO: renamed from: u */
    private ClickableSpan f60733u;

    /* JADX INFO: renamed from: v */
    private C24464a f60734v;

    /* JADX INFO: renamed from: w */
    private C24464a f60735w;

    /* JADX INFO: renamed from: x */
    private Layout f60736x;

    /* JADX INFO: renamed from: y */
    private CharSequence f60737y;

    /* JADX INFO: renamed from: z */
    private InterfaceC18791c f60738z;

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.expand.ExpandView$a */
    class ViewTreeObserverOnGlobalLayoutListenerC18789a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC18789a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ExpandView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ExpandView expandView = ExpandView.this;
            expandView.setTitle(expandView.f60737y);
            ExpandView.this.f60723k = true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.expand.ExpandView$b */
    public interface InterfaceC18790b {
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.base.widget.expand.ExpandView$c */
    public interface InterfaceC18791c {
        /* JADX INFO: renamed from: a */
        void mo79218a(ExpandView expandView);

        /* JADX INFO: renamed from: b */
        void mo79219b(ExpandView expandView);
    }

    public ExpandView(Context context) {
        this(context, null);
    }

    public ExpandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60717e = "  ";
        this.f60718f = "  ";
        this.f60719g = false;
        this.f60720h = true;
        this.f60721i = true;
        this.f60722j = true;
        this.f60723k = false;
        this.f60724l = 1;
        this.f60725m = -1711276033;
        this.f60726n = -1711276033;
        this.f60727o = 872415231;
        this.f60728p = 872415231;
        this.f60729q = -1;
        this.f60730r = 0;
        this.f60732t = true;
        m79212k(context, attributeSet);
    }

    public ExpandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f60717e = "  ";
        this.f60718f = "  ";
        this.f60719g = false;
        this.f60720h = true;
        this.f60721i = true;
        this.f60722j = true;
        this.f60723k = false;
        this.f60724l = 1;
        this.f60725m = -1711276033;
        this.f60726n = -1711276033;
        this.f60727o = 872415231;
        this.f60728p = 872415231;
        this.f60729q = -1;
        this.f60730r = 0;
        this.f60732t = true;
        m79212k(context, attributeSet);
    }

    private int getLayoutWidth() {
        Layout layout = getLayout();
        int width = layout != null ? layout.getWidth() : 0;
        return (width > 0 || getWidth() == 0) ? width : (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: h */
    private CharSequence m79209h(int i11) {
        String str;
        int i12;
        TextPaint paint = getPaint();
        if (this.f60737y != null) {
            str = "" + ((Object) this.f60737y);
        } else {
            str = "";
        }
        if (this.f60736x == null) {
            this.f60736x = new StaticLayout(str, paint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
        int lineCount = this.f60736x.getLineCount();
        int i13 = this.f60724l;
        if (lineCount <= i13) {
            CharSequence charSequence = this.f60737y;
            if (charSequence == null) {
                charSequence = " ";
            }
            return m79216o(new SpannableStringBuilder(charSequence));
        }
        int i14 = this.f60730r;
        if (i14 != 0) {
            if (i14 != 1 || !this.f60722j) {
                return m79216o(new SpannableStringBuilder(this.f60737y));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f60737y);
            spannableStringBuilder.append((CharSequence) this.f60718f).append((CharSequence) this.f60716d);
            int length = (spannableStringBuilder.length() - this.f60718f.length()) - this.f60716d.length();
            int length2 = spannableStringBuilder.length();
            i12 = length >= 0 ? length : 0;
            spannableStringBuilder.setSpan(this.f60733u, i12, length2, 33);
            spannableStringBuilder.setSpan(this.f60734v, i12, length2, 33);
            return m79216o(spannableStringBuilder);
        }
        int iM79210i = m79210i(str, paint, this.f60736x.getLineStart(this.f60724l - 1), this.f60736x.getLineEnd(i13 - 1), i11);
        CharSequence charSequence2 = this.f60737y;
        if (charSequence2 != null && charSequence2.length() <= iM79210i) {
            iM79210i = this.f60737y.length() - 1;
        }
        CharSequence charSequence3 = this.f60737y;
        if (charSequence3 == null || iM79210i <= 0) {
            return charSequence3;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence3.subSequence(0, iM79210i)).append((CharSequence) this.f60714b);
        if (this.f60721i) {
            spannableStringBuilderAppend.append((CharSequence) this.f60717e);
            spannableStringBuilderAppend.append((CharSequence) this.f60715c);
            int length3 = (spannableStringBuilderAppend.length() - this.f60717e.length()) - this.f60715c.length();
            int length4 = spannableStringBuilderAppend.length();
            i12 = length3 >= 0 ? length3 : 0;
            spannableStringBuilderAppend.setSpan(this.f60733u, i12, length4, 33);
            spannableStringBuilderAppend.setSpan(this.f60735w, i12, length4, 33);
        }
        return m79216o(spannableStringBuilderAppend);
    }

    /* JADX INFO: renamed from: i */
    private int m79210i(String str, TextPaint textPaint, int i11, int i12, int i13) {
        String str2;
        C24464a c24464a = this.f60735w;
        String str3 = this.f60714b;
        if (this.f60721i) {
            str2 = this.f60715c + this.f60717e;
        } else {
            str2 = "";
        }
        return textPaint.breakText(str, i11, i12, true, i13 - c24464a.m96008e(textPaint, str3, str2), null) + i11;
    }

    /* JADX INFO: renamed from: j */
    private void m79211j() {
        if (this.f60731s == 0.0f) {
            this.f60731s = getTextSize();
        }
        boolean z11 = getLayoutDirection() == 1;
        this.f60735w = new C24464a(getContext(), this.f60732t ? R$mipmap.short_tv_ic_down_more : -111, this.f60725m, this.f60727o, this.f60731s, 6, z11, 8);
        this.f60734v = new C24464a(getContext(), this.f60732t ? R$mipmap.short_tv_ic_up_hide : -111, this.f60726n, this.f60728p, this.f60731s, 6, z11, 8);
        setMovementMethod(new LinkMovementMethod());
        if (TextUtils.isEmpty(this.f60714b)) {
            this.f60714b = "...";
        }
        if (TextUtils.isEmpty(this.f60715c)) {
            this.f60715c = getResources().getString(R$string.short_tv_str_more);
        }
        if (TextUtils.isEmpty(this.f60716d)) {
            this.f60716d = getResources().getString(R$string.short_tv_str_hide);
        }
        if (this.f60717e == null) {
            this.f60717e = "  ";
        }
        if (this.f60718f == null) {
            this.f60718f = "  ";
        }
        setOnClickListener(new View.OnClickListener() { // from class: js.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74624a.m79213l(view);
            }
        });
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18789a());
    }

    /* JADX INFO: renamed from: k */
    private void m79212k(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            m79211j();
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ExpandView);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == R$styleable.ExpandView_pop_hint_text_size) {
                this.f60731s = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
            } else if (index == R$styleable.ExpandView_pop_reverse_Lines) {
                this.f60724l = typedArrayObtainStyledAttributes.getInteger(index, 1);
            } else if (index == R$styleable.ExpandView_pop_ellipsis) {
                this.f60714b = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_expand_hint) {
                this.f60715c = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_shrink_hint) {
                this.f60716d = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_toggle_enabled) {
                this.f60719g = typedArrayObtainStyledAttributes.getBoolean(index, this.f60719g);
            } else if (index == R$styleable.ExpandView_pop_show_expand_hint) {
                this.f60721i = typedArrayObtainStyledAttributes.getBoolean(index, this.f60721i);
            } else if (index == R$styleable.ExpandView_pop_show_shrink_hint) {
                this.f60722j = typedArrayObtainStyledAttributes.getBoolean(index, this.f60722j);
            } else if (index == R$styleable.ExpandView_pop_expand_hint_color) {
                this.f60725m = typedArrayObtainStyledAttributes.getInteger(index, -1711276033);
            } else if (index == R$styleable.ExpandView_pop_shrink_hint_color) {
                this.f60726n = typedArrayObtainStyledAttributes.getInteger(index, -1711276033);
            } else if (index == R$styleable.ExpandView_pop_expand_bg_Color) {
                this.f60727o = typedArrayObtainStyledAttributes.getInteger(index, 872415231);
            } else if (index == R$styleable.ExpandView_pop_shrink_bg_color) {
                this.f60728p = typedArrayObtainStyledAttributes.getInteger(index, 872415231);
            } else if (index == R$styleable.ExpandView_pop_Init_state) {
                this.f60730r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.ExpandView_pop_expand_gap) {
                this.f60717e = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_collapse_gap) {
                this.f60718f = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R$styleable.ExpandView_pop_hash_tag_color) {
                this.f60729q = typedArrayObtainStyledAttributes.getInteger(index, this.f60729q);
            } else if (index == R$styleable.ExpandView_pop_show_hint_icon) {
                this.f60732t = typedArrayObtainStyledAttributes.getBoolean(index, true);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        m79211j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m79213l(View view) {
        m79217p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m79214m(CharSequence charSequence) {
        if (this.f60723k) {
            setTitle(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ CharSequence m79215n(final CharSequence charSequence) {
        if (!this.f60720h) {
            return charSequence;
        }
        if (!TextUtils.equals(charSequence, this.f60737y)) {
            this.f60736x = null;
        }
        this.f60737y = charSequence;
        int layoutWidth = getLayoutWidth();
        if (layoutWidth > 0) {
            return this.f60737y == null ? charSequence : m79209h(layoutWidth);
        }
        postDelayed(new Runnable() { // from class: js.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f74625a.m79214m(charSequence);
            }
        }, 200L);
        return null;
    }

    /* JADX INFO: renamed from: o */
    private CharSequence m79216o(SpannableStringBuilder spannableStringBuilder) {
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: p */
    private void m79217p() {
        if (getText().toString().contains(this.f60715c) || getText().toString().contains(this.f60716d)) {
            int i11 = this.f60730r;
            if (i11 == 0) {
                this.f60730r = 1;
                InterfaceC18791c interfaceC18791c = this.f60738z;
                if (interfaceC18791c != null) {
                    interfaceC18791c.mo79218a(this);
                }
            } else if (i11 == 1) {
                this.f60730r = 0;
                InterfaceC18791c interfaceC18791c2 = this.f60738z;
                if (interfaceC18791c2 != null) {
                    interfaceC18791c2.mo79219b(this);
                }
            }
            setTitle(this.f60737y);
        }
    }

    public void addLegacyHashTag(String str, String str2) {
        this.f60713B = str;
        this.f60712A = str2;
    }

    @Override // com.transsion.shorttv.base.widget.TnTextView, gs.InterfaceC23669a
    public void changeLocal() {
        this.f60715c = getResources().getString(R$string.short_tv_str_more);
        this.f60716d = getResources().getString(R$string.short_tv_str_hide);
        super.changeLocal();
    }

    public int getExpandState() {
        return this.f60730r;
    }

    public boolean isOutLines() {
        Layout layout = this.f60736x;
        return layout != null && layout.getLineCount() > this.f60724l;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void reset() {
        this.f60730r = 0;
        InterfaceC18791c interfaceC18791c = this.f60738z;
        if (interfaceC18791c != null) {
            interfaceC18791c.mo79219b(this);
        }
        setTitle(this.f60737y);
    }

    public void setCollapseEnable(boolean z11) {
        this.f60720h = z11;
    }

    public void setExpandListener(InterfaceC18791c interfaceC18791c) {
        this.f60738z = interfaceC18791c;
    }

    public void setOnClickHashTagListener(InterfaceC18790b interfaceC18790b) {
    }

    public void setTitle(final CharSequence charSequence) {
        setTextAction(new Function0() { // from class: js.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f74622a.m79215n(charSequence);
            }
        });
    }
}
