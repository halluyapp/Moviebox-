package com.transsion.shorttv_pugc.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$drawable;
import com.transsion.shorttv.R$styleable;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import ht.AbstractC23896b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/base/widget/CornerTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Landroid/util/AttributeSet;)V", "", MimeTypes.BASE_TYPE_TEXT, "Landroid/widget/TextView$BufferType;", NativeComponentConstants.KEY_COMPONENT_TYPE, "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class CornerTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornerTextView(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        m80582b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornerTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m97802h(context, "context");
        m80582b(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CornerTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        m80582b(attributeSet);
    }

    /* JADX INFO: renamed from: b */
    private final void m80582b(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R$styleable.CornerTextView);
        Intrinsics.m97801g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CornerTextView_rectangleShape, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z11) {
            setBackgroundResource(R$drawable.short_tv_bg_corner_tips_rectangle_2);
            setTextColor(AbstractC2397b.getColor(getContext(), R$color.short_tv_white_80));
            setTextSize(2, 11.0f);
            int iM27313a = AbstractC5776a0.m27313a(6.0f);
            int iM27313a2 = AbstractC5776a0.m27313a(2.0f);
            setPadding(iM27313a, iM27313a2, iM27313a, iM27313a2);
        } else {
            setBackgroundResource(R$drawable.short_tv_bg_corner_tips_4);
            setTextColor(AbstractC2397b.getColor(getContext(), R$color.short_tv_text_01));
            setTextSize(2, 12.0f);
            int iM27313a3 = AbstractC5776a0.m27313a(4.0f);
            setPadding(iM27313a3, iM27313a3 / 2, iM27313a3, iM27313a3);
        }
        setMaxLines(1);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        if (text == null || text.length() == 0) {
            AbstractC23896b.m94641c(this);
        } else {
            AbstractC23896b.m94642d(this);
        }
        super.setText(text, type);
    }
}
