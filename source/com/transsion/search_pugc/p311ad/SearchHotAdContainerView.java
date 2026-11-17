package com.transsion.search_pugc.p311ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.push.PushConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p881wq.C28430o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m97100d2 = {"Lcom/transsion/search_pugc/ad/SearchHotAdContainerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "h", "()V", "i", "", "Lcom/transsion/ad/view/native_ad/NativeWrapperAdView;", "getHiNativeAdViews", "()Ljava/util/List;", "getNativeWrapperAdView", "()Lcom/transsion/ad/view/native_ad/NativeWrapperAdView;", PushConstants.PROVIDER_FIELD_DESTROY, "", "a", "Ljava/util/List;", "hiNativeAdViews", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/ad/view/native_ad/NativeWrapperAdView;", "nativeWrapperAdView", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SearchHotAdContainerView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List hiNativeAdViews;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private NativeWrapperAdView nativeWrapperAdView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchHotAdContainerView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchHotAdContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SearchHotAdContainerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
    }

    public /* synthetic */ SearchHotAdContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: h */
    private final void m78166h() {
        removeAllViews();
        this.hiNativeAdViews = new ArrayList();
        C28430o c28430oM109849c = C28430o.m109849c(LayoutInflater.from(getContext()), this, true);
        Intrinsics.m97801g(c28430oM109849c, "inflate(...)");
        List list = this.hiNativeAdViews;
        if (list != null) {
            NativeWrapperAdView nativeAdView1 = c28430oM109849c.f87245c;
            Intrinsics.m97801g(nativeAdView1, "nativeAdView1");
            list.add(nativeAdView1);
        }
        List list2 = this.hiNativeAdViews;
        if (list2 != null) {
            NativeWrapperAdView nativeAdView2 = c28430oM109849c.f87246d;
            Intrinsics.m97801g(nativeAdView2, "nativeAdView2");
            list2.add(nativeAdView2);
        }
        List list3 = this.hiNativeAdViews;
        if (list3 != null) {
            NativeWrapperAdView nativeAdView3 = c28430oM109849c.f87247e;
            Intrinsics.m97801g(nativeAdView3, "nativeAdView3");
            list3.add(nativeAdView3);
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m78167i() {
        removeAllViews();
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        NativeWrapperAdView nativeWrapperAdView = new NativeWrapperAdView(context, null, 2, null);
        nativeWrapperAdView.setId(View.generateViewId());
        this.nativeWrapperAdView = nativeWrapperAdView;
        ConstraintLayout.C2308b c2308b = new ConstraintLayout.C2308b(-1, -2);
        c2308b.f7990t = 0;
        c2308b.f7994v = 0;
        c2308b.f7968i = 0;
        c2308b.f7974l = 0;
        NativeWrapperAdView nativeWrapperAdView2 = this.nativeWrapperAdView;
        if (nativeWrapperAdView2 != null) {
            nativeWrapperAdView2.setLayoutParams(c2308b);
        }
        addView(this.nativeWrapperAdView);
    }

    public final void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        List list = this.hiNativeAdViews;
        if (list != null) {
            list.clear();
        }
        this.nativeWrapperAdView = null;
    }

    public final List<NativeWrapperAdView> getHiNativeAdViews() {
        List list = this.hiNativeAdViews;
        if (list == null || list.isEmpty()) {
            m78166h();
        }
        return this.hiNativeAdViews;
    }

    public final NativeWrapperAdView getNativeWrapperAdView() {
        if (this.nativeWrapperAdView == null) {
            m78167i();
        }
        return this.nativeWrapperAdView;
    }
}
