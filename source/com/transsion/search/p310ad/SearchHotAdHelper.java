package com.transsion.search.p310ad;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.google.android.material.card.MaterialCardView;
import com.hisavana.common.bean.TAdErrorCode;
import com.transsion.p285ad.R$color;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.bidding.nativead.BiddingSspNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.wrapperad.R$drawable;
import com.transsion.wrapperad.R$id;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p391ey.C23245b;
import p391ey.C23266s;
import p461hi.AbstractC23854a;
import p928y0.AbstractC28698h;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchHotAdHelper {

    /* JADX INFO: renamed from: n */
    public static final C18356a f59682n = new C18356a(null);

    /* JADX INFO: renamed from: a */
    private final LifecycleCoroutineScope f59683a;

    /* JADX INFO: renamed from: b */
    private BiddingSspNativeManager f59684b;

    /* JADX INFO: renamed from: c */
    private List f59685c;

    /* JADX INFO: renamed from: d */
    private List f59686d;

    /* JADX INFO: renamed from: e */
    private BiddingNativeManager f59687e;

    /* JADX INFO: renamed from: f */
    private NativeWrapperAdView f59688f;

    /* JADX INFO: renamed from: g */
    private SearchHotAdContainerView f59689g;

    /* JADX INFO: renamed from: h */
    private Function1 f59690h;

    /* JADX INFO: renamed from: i */
    private boolean f59691i;

    /* JADX INFO: renamed from: j */
    private ObjectAnimator f59692j;

    /* JADX INFO: renamed from: k */
    private Runnable f59693k;

    /* JADX INFO: renamed from: l */
    private final C18358c f59694l;

    /* JADX INFO: renamed from: m */
    private final C18357b f59695m;

    /* JADX INFO: renamed from: com.transsion.search.ad.SearchHotAdHelper$a */
    public static final class C18356a {
        private C18356a() {
        }

        public /* synthetic */ C18356a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.ad.SearchHotAdHelper$b */
    public static final class C18357b extends AbstractC23854a {
        C18357b() {
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: j */
        public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
            super.mo62778j(biddingIntermediateMaterialBean);
            SearchHotAdHelper.this.m77624n(biddingIntermediateMaterialBean);
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.ad.SearchHotAdHelper$c */
    public static final class C18358c extends AbstractC23854a {
        C18358c() {
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: i */
        public void mo62846i(TAdErrorCode tAdErrorCode) {
            super.mo62846i(tAdErrorCode);
            SearchHotAdHelper.this.m77629t();
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: k */
        public void mo62847k(List list) {
            super.mo62847k(list);
            SearchHotAdHelper.this.m77625o(list);
        }
    }

    public SearchHotAdHelper(LifecycleCoroutineScope lifecycleScope) {
        Intrinsics.m97802h(lifecycleScope, "lifecycleScope");
        this.f59683a = lifecycleScope;
        this.f59694l = new C18358c();
        this.f59695m = new C18357b();
    }

    /* JADX INFO: renamed from: k */
    private final void m77622k() {
        Runnable runnable = new Runnable() { // from class: com.transsion.search.ad.a
            @Override // java.lang.Runnable
            public final void run() {
                SearchHotAdHelper.m77623l(this.f59698a);
            }
        };
        this.f59693k = runnable;
        NativeWrapperAdView nativeWrapperAdView = this.f59688f;
        if (nativeWrapperAdView != null) {
            nativeWrapperAdView.postDelayed(runnable, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m77623l(SearchHotAdHelper searchHotAdHelper) {
        NativeWrapperAdView nativeWrapperAdView = searchHotAdHelper.f59688f;
        AppCompatTextView appCompatTextView = nativeWrapperAdView != null ? (AppCompatTextView) nativeWrapperAdView.findViewById(R$id.native_ad_action) : null;
        if (appCompatTextView != null) {
            ObjectAnimator duration = ObjectAnimator.ofArgb(appCompatTextView, "textColor", appCompatTextView.getCurrentTextColor(), AbstractC2397b.getColor(appCompatTextView.getContext(), R$color.gray_dark_00)).setDuration(300L);
            Intrinsics.m97801g(duration, "setDuration(...)");
            Drawable background = appCompatTextView.getBackground();
            if (background == null) {
                background = AbstractC28698h.m110689e(appCompatTextView.getContext().getResources(), R.color.transparent, appCompatTextView.getContext().getTheme());
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{background, AbstractC28698h.m110689e(appCompatTextView.getContext().getResources(), R$drawable.bg_gradient_brand_4, appCompatTextView.getContext().getTheme())});
            appCompatTextView.setBackground(transitionDrawable);
            transitionDrawable.startTransition(300);
            duration.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m77624n(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
        NativeWrapperAdView nativeWrapperAdView;
        SearchHotAdContainerView searchHotAdContainerView = this.f59689g;
        if (searchHotAdContainerView == null || (nativeWrapperAdView = searchHotAdContainerView.getNativeWrapperAdView()) == null) {
            return;
        }
        this.f59688f = nativeWrapperAdView;
        C23245b c23245b = C23245b.f70802a;
        Context context = nativeWrapperAdView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        nativeWrapperAdView.bindNativeView(this.f59687e, c23245b.m92309a(context, "SearchHotNativeScene"), biddingIntermediateMaterialBean);
        m77633x();
        m77631v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m77625o(List list) {
        List list2;
        BiddingSspNativeManager biddingSspNativeManager;
        SearchHotAdContainerView searchHotAdContainerView = this.f59689g;
        if (searchHotAdContainerView == null) {
            return;
        }
        List<NativeWrapperAdView> hiNativeAdViews = searchHotAdContainerView.getHiNativeAdViews();
        this.f59685c = hiNativeAdViews;
        if (list != null) {
            this.f59686d = list;
        } else {
            list = null;
        }
        List<NativeWrapperAdView> list3 = hiNativeAdViews;
        if (list3 == null || list3.isEmpty() || (list2 = list) == null || list2.isEmpty() || (biddingSspNativeManager = this.f59684b) == null) {
            return;
        }
        int iMin = Math.min(hiNativeAdViews.size(), list.size());
        for (int i11 = 0; i11 < iMin; i11++) {
            Context context = searchHotAdContainerView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            NativeWrapperAdView.bindSspNativeView$default(hiNativeAdViews.get(i11), biddingSspNativeManager, null, new C23266s(context), (BiddingIntermediateMaterialBean) list.get(i11), 2, null);
        }
        m77633x();
    }

    /* JADX INFO: renamed from: q */
    private final void m77626q() {
        NativeWrapperAdView nativeWrapperAdView;
        ObjectAnimator objectAnimator = this.f59692j;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f59692j = null;
        Runnable runnable = this.f59693k;
        if (runnable != null && (nativeWrapperAdView = this.f59688f) != null) {
            nativeWrapperAdView.removeCallbacks(runnable);
        }
        this.f59693k = null;
    }

    /* JADX INFO: renamed from: r */
    private final void m77627r() {
        BiddingNativeManager biddingNativeManager = this.f59687e;
        if (biddingNativeManager != null) {
            biddingNativeManager.mo62775U();
        }
        this.f59687e = null;
        m77626q();
    }

    /* JADX INFO: renamed from: s */
    private final void m77628s() {
        List list = this.f59685c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((NativeWrapperAdView) it.next()).removeAllViews();
            }
        }
        this.f59685c = null;
        BiddingSspNativeManager biddingSspNativeManager = this.f59684b;
        if (biddingSspNativeManager != null) {
            biddingSspNativeManager.mo62775U();
        }
        this.f59684b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m77629t() {
        m77627r();
        AbstractC25136k.m99058d(this.f59683a, C25220y0.m99268b(), null, new SearchHotAdHelper$loadBiddingAd$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: u */
    private final void m77630u() {
        m77628s();
        AbstractC25136k.m99058d(this.f59683a, C25220y0.m99268b(), null, new SearchHotAdHelper$loadHiAd$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: v */
    private final void m77631v() {
        m77632w();
        m77622k();
    }

    /* JADX INFO: renamed from: w */
    private final void m77632w() {
        NativeWrapperAdView nativeWrapperAdView = this.f59688f;
        ImageView imageView = nativeWrapperAdView != null ? (ImageView) nativeWrapperAdView.findViewWithTag("adVolumeImage") : null;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
            int iM27313a = AbstractC5776a0.m27313a(8.0f);
            layoutParams2.setMarginStart(iM27313a);
            layoutParams2.bottomMargin = iM27313a;
            int iM27313a2 = AbstractC5776a0.m27313a(26.0f);
            layoutParams2.width = iM27313a2;
            layoutParams2.height = iM27313a2;
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m77633x() {
        this.f59691i = true;
        Function1 function1 = this.f59690h;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m77634m(SearchHotAdContainerView searchHotAdContainerView) {
        this.f59689g = searchHotAdContainerView;
        m77630u();
    }

    /* JADX INFO: renamed from: p */
    public final void m77635p() {
        m77628s();
        m77627r();
        this.f59690h = null;
        SearchHotAdContainerView searchHotAdContainerView = this.f59689g;
        if (searchHotAdContainerView != null) {
            searchHotAdContainerView.destroy();
        }
        this.f59689g = null;
    }

    /* JADX INFO: renamed from: y */
    public final void m77636y(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f59690h = callback;
        if (this.f59691i) {
            callback.invoke(Boolean.TRUE);
        }
    }
}
