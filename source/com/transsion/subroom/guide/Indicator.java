package com.transsion.subroom.guide;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.subroom.R$drawable;
import com.transsion.subroom.R$styleable;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0017"}, m97100d2 = {"Lcom/transsion/subroom/guide/Indicator;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "selectIndex", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(I)V", "select", "a", "I", "size", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "horizontalMargin", "app_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class Indicator extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int selectIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int horizontalMargin;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Indicator(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Indicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Indicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Indicator);
        Intrinsics.m97801g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.size = typedArrayObtainStyledAttributes.getInteger(R$styleable.Indicator_CustomIndicatorSize, 0);
        this.horizontalMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.Indicator_CustomHorizontalMargin, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.Indicator_CustomSelectedIndex, 0);
        this.selectIndex = integer;
        int i12 = this.size;
        if (integer >= i12) {
            this.selectIndex = 0;
        }
        int i13 = 0;
        while (i13 < i12) {
            View view = new View(context);
            LinearLayoutCompat.C0419a c0419a = new LinearLayoutCompat.C0419a(AbstractC5776a0.m27313a(6.0f), AbstractC5776a0.m27313a(6.0f));
            c0419a.setMarginStart(i13 == 0 ? 0 : this.horizontalMargin);
            view.setLayoutParams(c0419a);
            if (i13 == this.selectIndex) {
                view.setBackgroundResource(R$drawable.guide_selected_dot);
            } else {
                view.setBackgroundResource(R$drawable.guide_unselected_dot);
            }
            addView(view);
            i13++;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: d */
    private final void m81822d(int selectIndex) {
        if (selectIndex >= getChildCount()) {
            return;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (i11 == selectIndex) {
                childAt.setBackgroundResource(R$drawable.guide_selected_dot);
            } else {
                childAt.setBackgroundResource(R$drawable.guide_unselected_dot);
            }
        }
    }

    public final void select(int selectIndex) {
        m81822d(selectIndex);
    }
}
