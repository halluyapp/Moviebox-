package com.transsion.shorttv.p313ad.common;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewGroupKt;
import com.cloud.hisavana.sdk.api.view.TNativeView;
import com.hisavana.mediation.p276ad.TAdNativeView;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.shorttv.R$id;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.InterfaceC25149n0;
import p988zr.C29238a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.ad.common.STCommonNativeAdHelper$showAd$1", m97637f = "STCommonNativeAdHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class STCommonNativeAdHelper$showAd$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC13924r $layoutProvider;
    final /* synthetic */ NativeWrapperAdView $nativeAdView;
    final /* synthetic */ Function1<Boolean, Unit> $showCallback;
    int label;
    final /* synthetic */ STCommonNativeAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    STCommonNativeAdHelper$showAd$1(STCommonNativeAdHelper sTCommonNativeAdHelper, Function1<? super Boolean, Unit> function1, NativeWrapperAdView nativeWrapperAdView, AbstractC13924r abstractC13924r, Continuation<? super STCommonNativeAdHelper$showAd$1> continuation) {
        super(2, continuation);
        this.this$0 = sTCommonNativeAdHelper;
        this.$showCallback = function1;
        this.$nativeAdView = nativeWrapperAdView;
        this.$layoutProvider = abstractC13924r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m78921d(NativeWrapperAdView nativeWrapperAdView) {
        Object next;
        View view;
        Sequence<View> children;
        Object next2;
        try {
            Result.Companion companion = Result.INSTANCE;
            ImageView imageView = (ImageView) nativeWrapperAdView.findViewById(R$id.ad_blur_view);
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor("#E6000000"));
            }
            Iterator f76053a = ViewGroupKt.getChildren(nativeWrapperAdView).getF76053a();
            do {
                if (!f76053a.hasNext()) {
                    next = null;
                    break;
                }
                next = f76053a.next();
            } while (!(((View) next) instanceof TAdNativeView));
            RelativeLayout relativeLayout = next instanceof RelativeLayout ? (RelativeLayout) next : null;
            if (relativeLayout == null || (children = ViewGroupKt.getChildren(relativeLayout)) == null) {
                view = null;
            } else {
                Iterator f76053a2 = children.getF76053a();
                do {
                    if (!f76053a2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = f76053a2.next();
                } while (!(((View) next2) instanceof TNativeView));
                view = (View) next2;
            }
            FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
            if (relativeLayout != null && frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                frameLayout.setLayoutParams(layoutParams2);
                frameLayout.requestLayout();
                Result.m112707constructorimpl(Unit.f75682a);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new STCommonNativeAdHelper$showAd$1(this.this$0, this.$showCallback, this.$nativeAdView, this.$layoutProvider, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((STCommonNativeAdHelper$showAd$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        STCommonNativeAdHelper sTCommonNativeAdHelper = this.this$0;
        Function1<Boolean, Unit> function1 = this.$showCallback;
        final NativeWrapperAdView nativeWrapperAdView = this.$nativeAdView;
        AbstractC13924r abstractC13924r = this.$layoutProvider;
        try {
            Result.Companion companion = Result.INSTANCE;
            C29238a c29238a = C29238a.f89219a;
            String strM78915o = sTCommonNativeAdHelper.m78915o();
            BiddingNativeManager biddingNativeManager = sTCommonNativeAdHelper.f60515c;
            c29238a.m112118b(strM78915o, "trigger show ad", biddingNativeManager != null ? biddingNativeManager.getMSceneId() : null);
            sTCommonNativeAdHelper.f60518f = function1;
            sTCommonNativeAdHelper.f60519g = new WeakReference(nativeWrapperAdView);
            nativeWrapperAdView.bindNativeView(sTCommonNativeAdHelper.f60515c, abstractC13924r, sTCommonNativeAdHelper.f60516d);
            objM112707constructorimpl = Result.m112707constructorimpl(Boxing.m97631a(nativeWrapperAdView.post(new Runnable() { // from class: com.transsion.shorttv.ad.common.a
                @Override // java.lang.Runnable
                public final void run() {
                    STCommonNativeAdHelper$showAd$1.m78921d(nativeWrapperAdView);
                }
            })));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Function1<Boolean, Unit> function2 = this.$showCallback;
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null && function2 != null) {
            function2.invoke(Boxing.m97631a(false));
        }
        return Unit.f75682a;
    }
}
