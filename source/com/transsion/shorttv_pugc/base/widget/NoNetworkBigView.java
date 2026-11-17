package com.transsion.shorttv_pugc.base.widget;

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
import ht.AbstractC23896b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rs.C27348k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0004\b\u001d\u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m97100d2 = {"Lcom/transsion/shorttv_pugc/base/widget/NoNetworkBigView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isShowTitleLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "(Landroid/content/Context;Z)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "marin", "", "setTopMargin", "(I)V", "visible", "", CampaignEx.JSON_KEY_TITLE, "showTitle", "(ZLjava/lang/String;)V", "Lkotlin/Function0;", "retryListener", "retry", "(Lkotlin/jvm/functions/Function0;)V", "setting", "goToSetting", "Lrs/k;", "a", "Lrs/k;", "binding", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class NoNetworkBigView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C27348k binding;

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
        this.binding = C27348k.m106463b(LayoutInflater.from(context), this);
        setLayoutParams(new ConstraintLayout.C2308b(-1, -1));
        setBackgroundResource(R$color.short_tv_bg_01);
        C27348k c27348k = this.binding;
        if (c27348k != null) {
            if (z11) {
                AppCompatImageView ivBack = c27348k.f83219c;
                Intrinsics.m97801g(ivBack, "ivBack");
                AbstractC23896b.m94642d(ivBack);
                TnTextView tvTitle = c27348k.f83223g;
                Intrinsics.m97801g(tvTitle, "tvTitle");
                AbstractC23896b.m94642d(tvTitle);
            } else {
                AppCompatImageView ivBack2 = c27348k.f83219c;
                Intrinsics.m97801g(ivBack2, "ivBack");
                AbstractC23896b.m94640b(ivBack2);
                TnTextView tvTitle2 = c27348k.f83223g;
                Intrinsics.m97801g(tvTitle2, "tvTitle");
                AbstractC23896b.m94640b(tvTitle2);
            }
            c27348k.f83219c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.base.widget.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NoNetworkBigView.m80598l(context, view);
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
    public static final void m80597k(Function0 function0, View view) {
        NetworkUtils.m27175v();
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m80598l(Context context, View view) {
        if (context instanceof Activity) {
            ((Activity) context).onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m80599m(Function0 function0, View view) {
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
        C27348k c27348k = this.binding;
        if (c27348k == null || (tnTextView = c27348k.f83218b) == null) {
            return;
        }
        tnTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.base.widget.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoNetworkBigView.m80597k(setting, view);
            }
        });
    }

    public final void retry(final Function0<Unit> retryListener) {
        TnTextView tnTextView;
        Intrinsics.m97802h(retryListener, "retryListener");
        C27348k c27348k = this.binding;
        if (c27348k == null || (tnTextView = c27348k.f83222f) == null) {
            return;
        }
        tnTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.base.widget.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoNetworkBigView.m80599m(retryListener, view);
            }
        });
    }

    public final void setTopMargin(int marin) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C27348k c27348k = this.binding;
        ViewGroup.LayoutParams layoutParams = (c27348k == null || (appCompatImageView2 = c27348k.f83220d) == null) ? null : appCompatImageView2.getLayoutParams();
        ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
        if (c2308b == null) {
            c2308b = new ConstraintLayout.C2308b(0, -1);
        }
        ((ViewGroup.MarginLayoutParams) c2308b).topMargin = marin;
        C27348k c27348k2 = this.binding;
        if (c27348k2 == null || (appCompatImageView = c27348k2.f83220d) == null) {
            return;
        }
        appCompatImageView.setLayoutParams(c2308b);
    }

    public final void showTitle(boolean visible, String title) {
        Intrinsics.m97802h(title, "title");
        C27348k c27348k = this.binding;
        if (c27348k != null) {
            if (visible) {
                AppCompatImageView ivBack = c27348k.f83219c;
                Intrinsics.m97801g(ivBack, "ivBack");
                AbstractC23896b.m94642d(ivBack);
                TnTextView tvTitle = c27348k.f83223g;
                Intrinsics.m97801g(tvTitle, "tvTitle");
                AbstractC23896b.m94642d(tvTitle);
            } else {
                AppCompatImageView ivBack2 = c27348k.f83219c;
                Intrinsics.m97801g(ivBack2, "ivBack");
                AbstractC23896b.m94640b(ivBack2);
                TnTextView tvTitle2 = c27348k.f83223g;
                Intrinsics.m97801g(tvTitle2, "tvTitle");
                AbstractC23896b.m94640b(tvTitle2);
            }
            c27348k.f83223g.setText(title);
        }
    }
}
