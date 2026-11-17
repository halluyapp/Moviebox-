package com.transsion.postdetail.shorttv.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.core.utils.C14752e;
import com.transsion.moviedetailapi.bean.PlayListDeepLink;
import com.transsion.postdetail.R$layout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p844vo.C28149f0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m97100d2 = {"Lcom/transsion/postdetail/shorttv/widget/ShortTvCategoryView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "g", "()V", "Lvo/f0;", "a", "Lvo/f0;", "viewBinding", "Companion", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTvCategoryView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28149f0 viewBinding;

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.widget.ShortTvCategoryView$b */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC16925b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC16925b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ShortTvCategoryView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int iMax = Math.max(ShortTvCategoryView.this.viewBinding.f86430b.getWidth(), AbstractC5776a0.m27313a(48.0f));
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, "ShortTVDiscoverCategoryView", "渲染结束获取的宽度为 " + iMax + ", 原始宽度为 " + ShortTvCategoryView.this.viewBinding.f86430b.getWidth(), false, 4, null);
            int iM66409f = (((C14752e.m66409f() - AbstractC5776a0.m27313a(32.0f)) - iMax) - AbstractC5776a0.m27313a(16.0f)) / 2;
            C26866a.a.m104898f(aVar, "ShortTVDiscoverCategoryView", "计算得出, ivAll.width = " + iMax + ", viewWidth = " + iM66409f, false, 4, null);
            AppCompatTextView appCompatTextView = ShortTvCategoryView.this.viewBinding.f86432d;
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iM66409f;
            }
            appCompatTextView.setLayoutParams(layoutParams);
            AppCompatTextView appCompatTextView2 = ShortTvCategoryView.this.viewBinding.f86431c;
            ViewGroup.LayoutParams layoutParams2 = appCompatTextView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = iM66409f;
            }
            appCompatTextView2.setLayoutParams(layoutParams2);
            AppCompatTextView appCompatTextView3 = ShortTvCategoryView.this.viewBinding.f86430b;
            ViewGroup.LayoutParams layoutParams3 = appCompatTextView3.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = iMax;
            }
            appCompatTextView3.setLayoutParams(layoutParams3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvCategoryView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvCategoryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvCategoryView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        View.inflate(context, R$layout.layout_short_tv_category, this);
        C28149f0 c28149f0M109307a = C28149f0.m109307a(this);
        Intrinsics.m97801g(c28149f0M109307a, "bind(...)");
        this.viewBinding = c28149f0M109307a;
        m73780g();
    }

    /* JADX INFO: renamed from: g */
    private final void m73780g() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16925b());
        this.viewBinding.f86432d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.shorttv.widget.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvCategoryView.m73781h(this.f56860a, view);
            }
        });
        this.viewBinding.f86431c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.shorttv.widget.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvCategoryView.m73782i(this.f56861a, view);
            }
        });
        this.viewBinding.f86430b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.shorttv.widget.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvCategoryView.m73783j(this.f56862a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m73781h(ShortTvCategoryView shortTvCategoryView, View view) {
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "ShortTVDiscoverCategoryView", "click Latest", false, 4, null);
        PlayListDeepLink playListDeepLinkM70975a = PlayListDeepLink.INSTANCE.m70975a("oneroom://com.community.oneroom?type=/home/playlist&category=TVSHOW&recType=OPT&label=fresh-releases-list");
        if (playListDeepLinkM70975a != null) {
            Navigator.m61845x(TheRouter.m61773c("/home/playlist").m61857K("label", playListDeepLinkM70975a.getLabel()).m61857K("category", playListDeepLinkM70975a.getCategory()).m61857K("recType", playListDeepLinkM70975a.getRecType()).m61857K("topIds", null), shortTvCategoryView.getContext(), null, 2, null);
        } else {
            C26866a.a.m104902m(aVar, "Invalid deeplink for oneroom://com.community.oneroom?type=/home/playlist&category=TVSHOW&recType=OPT&label=fresh-releases-list", false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m73782i(ShortTvCategoryView shortTvCategoryView, View view) {
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "ShortTVDiscoverCategoryView", "click Hottest", false, 4, null);
        PlayListDeepLink playListDeepLinkM70975a = PlayListDeepLink.INSTANCE.m70975a("oneroom://com.community.oneroom?type=/home/playlist&category=TVSHOW&recType=OPT&label=must-watch-list");
        if (playListDeepLinkM70975a != null) {
            Navigator.m61845x(TheRouter.m61773c("/home/playlist").m61857K("label", playListDeepLinkM70975a.getLabel()).m61857K("category", playListDeepLinkM70975a.getCategory()).m61857K("recType", playListDeepLinkM70975a.getRecType()).m61857K("topIds", null), shortTvCategoryView.getContext(), null, 2, null);
        } else {
            C26866a.a.m104902m(aVar, "Invalid deeplink for oneroom://com.community.oneroom?type=/home/playlist&category=TVSHOW&recType=OPT&label=must-watch-list", false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m73783j(ShortTvCategoryView shortTvCategoryView, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "ShortTVDiscoverCategoryView", "click All", false, 4, null);
        Navigator.m61845x(TheRouter.m61773c("/home/movieFilter").m61852F("tabId", 7).m61857K("tabCode", "ShortTV").m61872z("showViewPager", false), shortTvCategoryView.getContext(), null, 2, null);
    }
}
