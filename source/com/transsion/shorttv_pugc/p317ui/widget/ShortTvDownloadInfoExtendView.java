package com.transsion.shorttv_pugc.p317ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hisavana.common.tracking.TrackingKey;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$mipmap;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv_pugc.bean.Subject;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rs.C27365s0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u001dR\u0016\u0010 \u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/widget/ShortTvDownloadInfoExtendView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "m", "()V", CampaignEx.JSON_KEY_AD_R, "", "l", "()Z", "o", CampaignEx.JSON_KEY_AD_K, "", "getNewTextByConfig", "()Ljava/lang/String;", "Lcom/transsion/shorttv_pugc/bean/Subject;", "bean", "showData", "(Lcom/transsion/shorttv_pugc/bean/Subject;)V", CampaignEx.JSON_KEY_DESC, "(Ljava/lang/String;)V", "a", "Z", "isExtend", "Lrs/s0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lrs/s0;", "mViewBinding", "c", "Ljava/lang/String;", TrackingKey.DESCRIPTION, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "mMaxLinesOnShrink", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTvDownloadInfoExtendView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isExtend;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C27365s0 mViewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int mMaxLinesOnShrink;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvDownloadInfoExtendView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvDownloadInfoExtendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvDownloadInfoExtendView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        m81202m();
        this.isExtend = true;
        this.mMaxLinesOnShrink = 3;
    }

    private final String getNewTextByConfig() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        C27365s0 c27365s0;
        AppCompatTextView appCompatTextView3;
        String str = this.description;
        if (str == null) {
            str = "";
        }
        C27365s0 c27365s1 = this.mViewBinding;
        if (c27365s1 == null || (appCompatTextView = c27365s1.f83326c) == null) {
            return str;
        }
        TextPaint paint = appCompatTextView.getPaint();
        Intrinsics.m97801g(paint, "getPaint(...)");
        StaticLayout staticLayoutBuild = Build.VERSION.SDK_INT > 23 ? StaticLayout.Builder.obtain(str, 0, str.length(), paint, appCompatTextView.getWidth()).build() : new StaticLayout(str, paint, appCompatTextView.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        Intrinsics.m97799e(staticLayoutBuild);
        if (staticLayoutBuild.getLineCount() <= this.mMaxLinesOnShrink) {
            if (m81201l() || (c27365s0 = this.mViewBinding) == null || (appCompatTextView3 = c27365s0.f83325b) == null) {
                return str;
            }
            appCompatTextView3.setVisibility(8);
            return str;
        }
        C27365s0 c27365s2 = this.mViewBinding;
        if (c27365s2 != null && (appCompatTextView2 = c27365s2.f83325b) != null) {
            appCompatTextView2.setVisibility(appCompatTextView.getVisibility());
        }
        return ((Object) str.subSequence(0, staticLayoutBuild.getLineEnd(this.mMaxLinesOnShrink - 1) - 3)) + "...";
    }

    /* JADX INFO: renamed from: k */
    private final void m81200k() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        this.isExtend = true;
        C27365s0 c27365s0 = this.mViewBinding;
        if (c27365s0 != null && (appCompatTextView2 = c27365s0.f83325b) != null) {
            appCompatTextView2.setText(appCompatTextView2.getContext().getString(R$string.short_tv_str_hide));
            Drawable drawable = appCompatTextView2.getContext().getDrawable(R$mipmap.short_tv_ic_up_hide);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            appCompatTextView2.setCompoundDrawables(null, null, drawable, null);
        }
        C27365s0 c27365s1 = this.mViewBinding;
        if (c27365s1 == null || (appCompatTextView = c27365s1.f83326c) == null) {
            return;
        }
        appCompatTextView.setText(this.description);
    }

    /* JADX INFO: renamed from: l */
    private final boolean m81201l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    private final void m81202m() {
        AppCompatTextView appCompatTextView;
        C27365s0 c27365s0M106507a = C27365s0.m106507a(View.inflate(getContext(), R$layout.short_tv_view_download_info_extend_layout, this));
        this.mViewBinding = c27365s0M106507a;
        if (c27365s0M106507a == null || (appCompatTextView = c27365s0M106507a.f83325b) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.widget.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvDownloadInfoExtendView.m81203n(this.f62420a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m81203n(ShortTvDownloadInfoExtendView shortTvDownloadInfoExtendView, View view) {
        if (shortTvDownloadInfoExtendView.isExtend) {
            shortTvDownloadInfoExtendView.m81204o();
        } else {
            shortTvDownloadInfoExtendView.m81200k();
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m81204o() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        this.isExtend = false;
        C27365s0 c27365s0 = this.mViewBinding;
        if (c27365s0 != null && (appCompatTextView2 = c27365s0.f83325b) != null) {
            appCompatTextView2.setText(appCompatTextView2.getContext().getString(R$string.short_tv_str_more));
            Drawable drawable = appCompatTextView2.getContext().getDrawable(R$mipmap.short_tv_ic_down_more);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            appCompatTextView2.setCompoundDrawables(null, null, drawable, null);
        }
        C27365s0 c27365s1 = this.mViewBinding;
        if (c27365s1 == null || (appCompatTextView = c27365s1.f83326c) == null) {
            return;
        }
        appCompatTextView.setText(getNewTextByConfig());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m81205p(ShortTvDownloadInfoExtendView shortTvDownloadInfoExtendView) {
        shortTvDownloadInfoExtendView.m81207r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m81206q(ShortTvDownloadInfoExtendView shortTvDownloadInfoExtendView) {
        shortTvDownloadInfoExtendView.m81207r();
    }

    /* JADX INFO: renamed from: r */
    private final void m81207r() {
        m81204o();
    }

    public final void showData(Subject bean) {
        String description;
        ConstraintLayout root;
        if (bean == null || (description = bean.getDescription()) == null) {
            description = "";
        }
        this.description = description;
        C27365s0 c27365s0 = this.mViewBinding;
        if (c27365s0 == null || (root = c27365s0.getRoot()) == null) {
            return;
        }
        root.post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.widget.l
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvDownloadInfoExtendView.m81205p(this.f62419a);
            }
        });
    }

    public final void showData(String desc) {
        ConstraintLayout root;
        if (desc == null) {
            desc = "";
        }
        this.description = desc;
        C27365s0 c27365s0 = this.mViewBinding;
        if (c27365s0 == null || (root = c27365s0.getRoot()) == null) {
            return;
        }
        root.post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.widget.k
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvDownloadInfoExtendView.m81206q(this.f62418a);
            }
        });
    }
}
