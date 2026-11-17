package com.transsion.baseui.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.AbstractC2397b;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.R$styleable;

/* JADX INFO: loaded from: classes5.dex */
public class EditTextWithClear extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {

    /* JADX INFO: renamed from: a */
    private Drawable f51139a;

    /* JADX INFO: renamed from: b */
    private boolean f51140b;

    /* JADX INFO: renamed from: c */
    private boolean f51141c;

    /* JADX INFO: renamed from: com.transsion.baseui.widget.EditTextWithClear$a */
    public interface InterfaceC14575a {
    }

    public EditTextWithClear(Context context) {
        this(context, null);
    }

    public EditTextWithClear(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public EditTextWithClear(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f51140b = true;
        this.f51141c = false;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EditTextWithClear);
        this.f51139a = typedArrayObtainStyledAttributes.getDrawable(R$styleable.EditTextWithClear_et_clear_ic);
        this.f51141c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.EditTextWithClear_et_close_withoutfocus, false);
        if (this.f51139a == null) {
            this.f51139a = AbstractC2397b.getDrawable(context, R$mipmap.ic_input_close);
        }
        Drawable drawable = this.f51139a;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f51139a.getIntrinsicHeight());
        setClearIconVisible(false);
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    public void hideClear() {
        setClearIconVisible(false);
        this.f51140b = false;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z11) {
        if (z11) {
            setClearIconVisible(getText().length() > 0);
        } else {
            setClearIconVisible(false);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        setClearIconVisible(charSequence.length() > 0 && (hasFocus() || this.f51141c));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawables()[2] != null && motionEvent.getAction() == 1) {
            double width = ((double) (getWidth() - getPaddingRight())) - (((double) this.f51139a.getIntrinsicWidth()) * 1.5d);
            double width2 = ((double) (getWidth() - getPaddingRight())) + (((double) this.f51139a.getIntrinsicWidth()) * 0.5d);
            if (motionEvent.getX() > width && motionEvent.getX() < width2) {
                setText("");
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionListener(InterfaceC14575a interfaceC14575a) {
    }

    protected void setClearIconVisible(boolean z11) {
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], (z11 && this.f51140b) ? this.f51139a : null, getCompoundDrawables()[3]);
    }

    public void showClear() {
        this.f51140b = true;
        setClearIconVisible(false);
    }
}
