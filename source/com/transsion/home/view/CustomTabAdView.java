package com.transsion.home.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.home.bean.HomeTabItem;
import com.transsion.home.bean.NameImage;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m00.InterfaceC25776b;
import ng.AbstractC26004a;
import p462hj.C23860f;
import p873wi.C28384q;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010¢\u0006\u0004\b%\u0010\u0014J\u0015\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u001b\u00104\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001eR\u001b\u00107\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u0010\u001e¨\u00068"}, m97100d2 = {"Lcom/transsion/home/view/CustomTabAdView;", "Landroid/widget/FrameLayout;", "Lm00/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/transsion/home/bean/HomeTabItem;", "homeTabItem", "Landroidx/appcompat/widget/AppCompatImageView;", "imageView", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Lcom/transsion/home/bean/HomeTabItem;Landroidx/appcompat/widget/AppCompatImageView;)V", "g", "(Lcom/transsion/home/bean/HomeTabItem;)V", "", "p0", "p1", "onSelected", "(II)V", "onDeselected", "", "p2", "", "p3", "onEnter", "(IIFZ)V", "onLeave", "getContentLeft", "()I", "getContentTop", "getContentRight", "getContentBottom", "showData", "normalColor", "selectedColor", "changeTextColor", "textColor", "setTextColor", "(I)V", "Landroidx/appcompat/widget/AppCompatTextView;", "a", "Landroidx/appcompat/widget/AppCompatTextView;", "textView", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "mSelectedColor", "c", "mNormalColor", "Lkotlin/Lazy;", "getMLeftPadding", "mLeftPadding", "e", "getMRightPadding", "mRightPadding", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class CustomTabAdView extends FrameLayout implements InterfaceC25776b {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AppCompatTextView textView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mSelectedColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mNormalColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy mLeftPadding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy mRightPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabAdView(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        this.mSelectedColor = AbstractC2397b.getColor(context, R$color.text_01);
        this.mNormalColor = AbstractC2397b.getColor(context, R$color.text_02);
        this.mLeftPadding = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.view.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(CustomTabAdView.m68764e());
            }
        });
        this.mRightPadding = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.view.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(CustomTabAdView.m68765f());
            }
        });
    }

    /* JADX INFO: renamed from: d */
    private final void m68763d(HomeTabItem homeTabItem, AppCompatImageView imageView) {
        NameImage nameImage;
        Integer width;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((homeTabItem == null || (nameImage = homeTabItem.getNameImage()) == null || (width = nameImage.getWidth()) == null) ? -2 : AbstractC5776a0.m27313a(width.intValue()), AbstractC5776a0.m27313a(22.0f));
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = 20;
        layoutParams.topMargin = 20;
        removeAllViews();
        C28384q.f87086a.m109747a(imageView);
        addView(imageView, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final int m68764e() {
        return AbstractC5776a0.m27313a(12.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final int m68765f() {
        return AbstractC5776a0.m27313a(10.0f);
    }

    /* JADX INFO: renamed from: g */
    private final void m68766g(HomeTabItem homeTabItem) {
        removeAllViews();
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.textView = appCompatTextView;
        appCompatTextView.setText(homeTabItem != null ? homeTabItem.getName() : null);
        appCompatTextView.setTextSize(14.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        appCompatTextView.setPadding(getMLeftPadding(), 0, getMRightPadding(), 0);
        appCompatTextView.setGravity(17);
        layoutParams.gravity = 17;
        addView(appCompatTextView, layoutParams);
    }

    private final int getMLeftPadding() {
        return ((Number) this.mLeftPadding.getValue()).intValue();
    }

    private final int getMRightPadding() {
        return ((Number) this.mRightPadding.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m68767h(CustomTabAdView customTabAdView, AppCompatImageView appCompatImageView, HomeTabItem homeTabItem, boolean z11, boolean z12, long j11) {
        if (!z11) {
            customTabAdView.removeView(appCompatImageView);
            customTabAdView.m68766g(homeTabItem);
        }
        return Unit.f75682a;
    }

    public final void changeTextColor(int normalColor, int selectedColor) {
        this.mNormalColor = normalColor;
        this.mSelectedColor = selectedColor;
    }

    @Override // m00.InterfaceC25776b
    public int getContentBottom() {
        return 0;
    }

    @Override // m00.InterfaceC25776b
    public int getContentLeft() {
        return 0;
    }

    @Override // m00.InterfaceC25776b
    public int getContentRight() {
        return 0;
    }

    @Override // m00.InterfaceC25776b
    public int getContentTop() {
        return 0;
    }

    @Override // m00.InterfaceC25778d
    public void onDeselected(int p11, int p12) {
        TextPaint paint;
        AppCompatTextView appCompatTextView = this.textView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(this.mNormalColor);
        }
        AppCompatTextView appCompatTextView2 = this.textView;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextSize(14.0f);
        }
        AppCompatTextView appCompatTextView3 = this.textView;
        if (appCompatTextView3 != null && (paint = appCompatTextView3.getPaint()) != null) {
            paint.setFakeBoldText(false);
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            paint.setTypeface(AbstractC26004a.m102047d(context));
        }
        AppCompatTextView appCompatTextView4 = this.textView;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setPadding(getMLeftPadding(), 0, getMRightPadding(), 0);
        }
    }

    @Override // m00.InterfaceC25778d
    public void onEnter(int p11, int p12, float p13, boolean p14) {
        TextPaint paint;
        AppCompatTextView appCompatTextView = this.textView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(this.mSelectedColor);
        }
        AppCompatTextView appCompatTextView2 = this.textView;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextSize(16.0f);
        }
        AppCompatTextView appCompatTextView3 = this.textView;
        if (appCompatTextView3 == null || (paint = appCompatTextView3.getPaint()) == null) {
            return;
        }
        paint.setFakeBoldText(true);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // m00.InterfaceC25778d
    public void onLeave(int p11, int p12, float p13, boolean p14) {
        TextPaint paint;
        AppCompatTextView appCompatTextView = this.textView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(this.mNormalColor);
        }
        AppCompatTextView appCompatTextView2 = this.textView;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextSize(16.0f);
        }
        AppCompatTextView appCompatTextView3 = this.textView;
        if (appCompatTextView3 == null || (paint = appCompatTextView3.getPaint()) == null) {
            return;
        }
        paint.setFakeBoldText(false);
        paint.setTypeface(Typeface.DEFAULT);
    }

    @Override // m00.InterfaceC25778d
    public void onSelected(int p11, int p12) {
        TextPaint paint;
        AppCompatTextView appCompatTextView = this.textView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(this.mSelectedColor);
        }
        AppCompatTextView appCompatTextView2 = this.textView;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setTextSize(16.0f);
        }
        AppCompatTextView appCompatTextView3 = this.textView;
        if (appCompatTextView3 != null && (paint = appCompatTextView3.getPaint()) != null) {
            paint.setFakeBoldText(true);
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            paint.setTypeface(AbstractC26004a.m102044a(context));
        }
        AppCompatTextView appCompatTextView4 = this.textView;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setPadding(getMLeftPadding() - 2, 0, getMRightPadding() - 2, 0);
        }
    }

    public final void setTextColor(int textColor) {
        AppCompatTextView appCompatTextView = this.textView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(textColor);
        }
    }

    public final void showData(final HomeTabItem homeTabItem) {
        NameImage nameImage;
        String url;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CustomTabAdView --> showData() --> homeTabItem = ");
        sb2.append(homeTabItem);
        sb2.append(" ");
        final AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        m68763d(homeTabItem, appCompatImageView);
        if (homeTabItem == null || (nameImage = homeTabItem.getNameImage()) == null || (url = nameImage.getUrl()) == null) {
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        aVar.m94457m(context).m94468g(url).m94470i(R$color.transparent).m94463b(new Function3() { // from class: com.transsion.home.view.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CustomTabAdView.m68767h(this.f53557a, appCompatImageView, homeTabItem, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
            }
        }).m94465d(appCompatImageView);
    }
}
