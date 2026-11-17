package com.transsion.home.adapter.trending.provider;

import android.view.View;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p391ey.C23245b;
import p391ey.C23246b0;
import p391ey.C23250d0;
import p391ey.C23272y;
import p461hi.AbstractC23854a;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15053n0 extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final WeakHashMap f52589e = new WeakHashMap();

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.n0$a */
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function0 f52590a;

        a(Function0 function0) {
            this.f52590a = function0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            Intrinsics.m97802h(v11, "v");
            this.f52590a.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            Intrinsics.m97802h(v11, "v");
        }
    }

    /* JADX INFO: renamed from: A */
    private final void m67342A(NativeWrapperAdView nativeWrapperAdView, OperateItem operateItem, Function0 function0) {
        if (nativeWrapperAdView.getTag(R$id.tag_attach_listener_item) == operateItem) {
            return;
        }
        nativeWrapperAdView.setTag(R$id.tag_attach_listener_item, operateItem);
        nativeWrapperAdView.addOnAttachStateChangeListener(new a(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m67343C(AbstractC13924r abstractC13924r, NativeWrapperAdView nativeWrapperAdView) {
        ((C23246b0) abstractC13924r).m92321J(nativeWrapperAdView);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Unit m67344D(AbstractC13924r abstractC13924r, NativeWrapperAdView nativeWrapperAdView) {
        ((C23250d0) abstractC13924r).m92331I(nativeWrapperAdView);
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        BiddingNativeManager nonAdDelegate = item.getNonAdDelegate();
        String mSceneId = nonAdDelegate != null ? nonAdDelegate.getMSceneId() : null;
        Object objM92309a = this.f52589e.get(item);
        if (objM92309a == null) {
            objM92309a = C23245b.f70802a.m92309a(m36338k(), mSceneId);
            if (objM92309a == null) {
                return;
            } else {
                this.f52589e.put(item, objM92309a);
            }
        }
        final AbstractC13924r abstractC13924r = (AbstractC13924r) objM92309a;
        final NativeWrapperAdView nativeWrapperAdView = (NativeWrapperAdView) helper.getViewOrNull(R$id.nativeView);
        if (nativeWrapperAdView == null) {
            return;
        }
        BiddingNativeManager nonAdDelegate2 = item.getNonAdDelegate();
        BiddingNativeManager nonAdDelegate3 = item.getNonAdDelegate();
        nativeWrapperAdView.bindNativeView(nonAdDelegate2, abstractC13924r, nonAdDelegate3 != null ? nonAdDelegate3.m62848k0() : null);
        if (abstractC13924r instanceof C23272y) {
            return;
        }
        if (abstractC13924r instanceof C23246b0) {
            C23246b0 c23246b0 = (C23246b0) abstractC13924r;
            c23246b0.m92319H(nativeWrapperAdView);
            AbstractC23854a abstractC23854aM92320I = c23246b0.m92320I(nativeWrapperAdView);
            BiddingNativeManager nonAdDelegate4 = item.getNonAdDelegate();
            if (nonAdDelegate4 != null) {
                nonAdDelegate4.m62829K0(abstractC23854aM92320I);
            }
            m67342A(nativeWrapperAdView, item, new Function0() { // from class: com.transsion.home.adapter.trending.provider.l0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C15053n0.m67343C(abstractC13924r, nativeWrapperAdView);
                }
            });
            return;
        }
        if (abstractC13924r instanceof C23250d0) {
            C23250d0 c23250d0 = (C23250d0) abstractC13924r;
            c23250d0.m92329G(nativeWrapperAdView);
            AbstractC23854a abstractC23854aM92330H = c23250d0.m92330H(nativeWrapperAdView);
            BiddingNativeManager nonAdDelegate5 = item.getNonAdDelegate();
            if (nonAdDelegate5 != null) {
                nonAdDelegate5.m62829K0(abstractC23854aM92330H);
            }
            m67342A(nativeWrapperAdView, item, new Function0() { // from class: com.transsion.home.adapter.trending.provider.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C15053n0.m67344D(abstractC13924r, nativeWrapperAdView);
                }
            });
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.TRENDING_NATIVE_AD.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.post_list_item_native_ad_layout;
    }
}
