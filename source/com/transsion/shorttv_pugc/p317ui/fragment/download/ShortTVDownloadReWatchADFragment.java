package com.transsion.shorttv_pugc.p317ui.fragment.download;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.Utils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv_pugc.utils.C19523b;
import com.transsion.shorttv_pugc.utils.C19529h;
import com.transsion.shorttv_pugc.viewmodel.ShortTvDownloadViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p623nt.C26102c;
import rs.C27371y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J!\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/fragment/download/ShortTVDownloadReWatchADFragment;", "Lcom/transsion/shorttv_pugc/ui/fragment/download/ShortTvDownloadReBaseFragment;", "Lrs/y;", "<init>", "()V", "", "r0", "p0", "onDestroy", "initViewData", "Landroid/view/LayoutInflater;", "inflater", "m0", "(Landroid/view/LayoutInflater;)Lrs/y;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewModel", "initListener", "retryLoadData", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "Lcom/transsion/shorttv_pugc/utils/b;", "m", "Lkotlin/Lazy;", "l0", "()Lcom/transsion/shorttv_pugc/utils/b;", "shortTVReporter", "Lcom/transsion/ad/bidding/video/BiddingVideoManager;", "n", "Lcom/transsion/ad/bidding/video/BiddingVideoManager;", "videoManager", "Lcom/transsion/ad/bidding/interstitial/BiddingInterstitialManager;", "o", "Lcom/transsion/ad/bidding/interstitial/BiddingInterstitialManager;", "interstitialManager", TtmlNode.TAG_P, "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public class ShortTVDownloadReWatchADFragment extends ShortTvDownloadReBaseFragment<C27371y> {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy shortTVReporter = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVDownloadReWatchADFragment.m81161q0();
        }
    });

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private BiddingVideoManager videoManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private BiddingInterstitialManager interstitialManager;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.download.ShortTVDownloadReWatchADFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTVDownloadReWatchADFragment m81164a() {
            return new ShortTVDownloadReWatchADFragment();
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final C19523b m81157l0() {
        return (C19523b) this.shortTVReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m81158n0(ShortTVDownloadReWatchADFragment shortTVDownloadReWatchADFragment, View view) {
        C3187b0 c3187b0M81359e;
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = shortTVDownloadReWatchADFragment.getViewModel();
        if (shortTvDownloadViewModelM81167h0 == null || (c3187b0M81359e = shortTvDownloadViewModelM81167h0.m81359e()) == null) {
            return;
        }
        c3187b0M81359e.mo14858q("download_short_tv");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m81159o0(ShortTVDownloadReWatchADFragment shortTVDownloadReWatchADFragment, View view) {
        C3187b0 c3187b0M81367n;
        String str;
        if (C26102c.f79666a.m102236a(view.getId(), 1000L)) {
            return;
        }
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = shortTVDownloadReWatchADFragment.getViewModel();
        if (shortTvDownloadViewModelM81167h0 != null && (c3187b0M81367n = shortTvDownloadViewModelM81167h0.m81367n()) != null && (str = (String) c3187b0M81367n.m14847f()) != null) {
            C19523b.m81323b(shortTVDownloadReWatchADFragment.m81157l0(), str, "dialog_minitv_download_unlock", "1", null, 8, null);
        }
        shortTVDownloadReWatchADFragment.m81160p0();
    }

    /* JADX INFO: renamed from: p0 */
    private final void m81160p0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C19523b m81161q0() {
        return new C19523b();
    }

    /* JADX INFO: renamed from: r0 */
    private final void m81162r0() {
        AppCompatTextView appCompatTextView;
        C3187b0 c3187b0M81361h;
        ShortTvDownloadViewModel shortTvDownloadViewModelM81167h0 = getViewModel();
        String strValueOf = (shortTvDownloadViewModelM81167h0 == null || (c3187b0M81361h = shortTvDownloadViewModelM81167h0.m81361h()) == null) ? null : (String) c3187b0M81361h.m14847f();
        if (strValueOf == null || strValueOf.length() == 0) {
            strValueOf = String.valueOf(C19529h.f62465a.m81349h());
        }
        C27371y c27371y = (C27371y) getMViewBinding();
        if (c27371y == null || (appCompatTextView = c27371y.f83358d) == null) {
            return;
        }
        appCompatTextView.setText(Utils.m27275a().getString(R$string.short_tv_download_watch_ad_ep, strValueOf));
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewData() {
        AppCompatTextView appCompatTextView;
        AppCompatImageView appCompatImageView;
        m81162r0();
        C27371y c27371y = (C27371y) getMViewBinding();
        if (c27371y != null && (appCompatImageView = c27371y.f83357c) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTVDownloadReWatchADFragment.m81158n0(this.f62263a, view);
                }
            });
        }
        C27371y c27371y2 = (C27371y) getMViewBinding();
        if (c27371y2 == null || (appCompatTextView = c27371y2.f83359e) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.fragment.download.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVDownloadReWatchADFragment.m81159o0(this.f62264a, view);
            }
        });
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewModel() {
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C27371y getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27371y c27371yM106526c = C27371y.m106526c(inflater);
        Intrinsics.m97801g(c27371yM106526c, "inflate(...)");
        return c27371yM106526c;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BiddingVideoManager biddingVideoManager = this.videoManager;
        if (biddingVideoManager != null) {
            biddingVideoManager.mo62775U();
        }
        BiddingInterstitialManager biddingInterstitialManager = this.interstitialManager;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        m81162r0();
    }

    @Override // com.transsion.shorttv_pugc.p317ui.fragment.download.ShortTvDownloadReBaseFragment, com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
