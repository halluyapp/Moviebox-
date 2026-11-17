package com.transsion.shorttv.base.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.NetworkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.shorttv.R$color;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p356ds.AbstractC23048b;
import rs.C27363r0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m97100d2 = {"Lcom/transsion/shorttv/base/widget/NoNetworkBigView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isShowTitleLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "(Landroid/content/Context;Z)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "marin", "", "setTopMargin", "(I)V", "visible", "", CampaignEx.JSON_KEY_TITLE, "showTitle", "(ZLjava/lang/String;)V", "Lkotlin/Function0;", "retryListener", "retry", "(Lkotlin/jvm/functions/Function0;)V", "setting", "goToSetting", "onBackClick", "()V", "Lrs/r0;", "a", "Lrs/r0;", "binding", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class NoNetworkBigView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C27363r0 binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoNetworkBigView(Context context) {
        this(context, (AttributeSet) null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoNetworkBigView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 8, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoNetworkBigView(final Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.binding = C27363r0.m106504b(LayoutInflater.from(context), this);
        setLayoutParams(new ConstraintLayout.C2308b(-1, -1));
        setBackgroundResource(R$color.short_tv_bg_01);
        C27363r0 c27363r0 = this.binding;
        if (c27363r0 != null) {
            if (z11) {
                AppCompatImageView ivBack = c27363r0.f83312c;
                Intrinsics.m97801g(ivBack, "ivBack");
                AbstractC23048b.m91694e(ivBack);
                TnTextView tvTitle = c27363r0.f83316g;
                Intrinsics.m97801g(tvTitle, "tvTitle");
                AbstractC23048b.m91694e(tvTitle);
            } else {
                AppCompatImageView ivBack2 = c27363r0.f83312c;
                Intrinsics.m97801g(ivBack2, "ivBack");
                AbstractC23048b.m91691b(ivBack2);
                TnTextView tvTitle2 = c27363r0.f83316g;
                Intrinsics.m97801g(tvTitle2, "tvTitle");
                AbstractC23048b.m91691b(tvTitle2);
            }
            c27363r0.f83312c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.base.widget.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NoNetworkBigView.m79168l(context, view);
                }
            });
        }
    }

    public /* synthetic */ NoNetworkBigView(Context context, AttributeSet attributeSet, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i11, (i12 & 8) != 0 ? true : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoNetworkBigView(Context context, boolean z11) {
        this(context, null, 0, z11);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m79167k(Function0 function0, View view) {
        NetworkUtils.m27175v();
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m79168l(Context context, View view) {
        if (context instanceof Activity) {
            ((Activity) context).onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m79169m(Function0 function0, View view) {
        function0.invoke();
    }

    public static /* synthetic */ void showTitle$default(NoNetworkBigView noNetworkBigView, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        noNetworkBigView.showTitle(z11, str);
    }

    public final void goToSetting(final Function0<Unit> setting) {
        TnTextView tnTextView;
        Intrinsics.m97802h(setting, "setting");
        C27363r0 c27363r0 = this.binding;
        if (c27363r0 == null || (tnTextView = c27363r0.f83311b) == null) {
            return;
        }
        tnTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.base.widget.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoNetworkBigView.m79167k(setting, view);
            }
        });
    }

    public final void onBackClick() {
    }

    public final void retry(final Function0<Unit> retryListener) {
        TnTextView tnTextView;
        Intrinsics.m97802h(retryListener, "retryListener");
        C27363r0 c27363r0 = this.binding;
        if (c27363r0 == null || (tnTextView = c27363r0.f83315f) == null) {
            return;
        }
        tnTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.base.widget.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoNetworkBigView.m79169m(retryListener, view);
            }
        });
    }

    public final void setTopMargin(int marin) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C27363r0 c27363r0 = this.binding;
        ViewGroup.LayoutParams layoutParams = (c27363r0 == null || (appCompatImageView2 = c27363r0.f83313d) == null) ? null : appCompatImageView2.getLayoutParams();
        ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
        if (c2308b == null) {
            c2308b = new ConstraintLayout.C2308b(0, -1);
        }
        ((ViewGroup.MarginLayoutParams) c2308b).topMargin = marin;
        C27363r0 c27363r1 = this.binding;
        if (c27363r1 == null || (appCompatImageView = c27363r1.f83313d) == null) {
            return;
        }
        appCompatImageView.setLayoutParams(c2308b);
    }

    public final void showTitle(boolean visible, String title) {
        Intrinsics.m97802h(title, "title");
        C27363r0 c27363r0 = this.binding;
        if (c27363r0 != null) {
            if (visible) {
                AppCompatImageView ivBack = c27363r0.f83312c;
                Intrinsics.m97801g(ivBack, "ivBack");
                AbstractC23048b.m91694e(ivBack);
                TnTextView tvTitle = c27363r0.f83316g;
                Intrinsics.m97801g(tvTitle, "tvTitle");
                AbstractC23048b.m91694e(tvTitle);
            } else {
                AppCompatImageView ivBack2 = c27363r0.f83312c;
                Intrinsics.m97801g(ivBack2, "ivBack");
                AbstractC23048b.m91691b(ivBack2);
                TnTextView tvTitle2 = c27363r0.f83316g;
                Intrinsics.m97801g(tvTitle2, "tvTitle");
                AbstractC23048b.m91691b(tvTitle2);
            }
            c27363r0.f83316g.setText(title);
        }
    }
}
