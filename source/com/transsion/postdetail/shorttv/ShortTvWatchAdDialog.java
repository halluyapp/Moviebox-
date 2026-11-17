package com.transsion.postdetail.shorttv;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.hisavana.common.bean.TAdErrorCode;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.dialog.BaseDialog;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.interstitial.BiddingInterstitialManager;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.R$style;
import com.transsnet.downloader.util.C22085a0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import p461hi.AbstractC23854a;
import sh.C27620g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0005*\u0002$(\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0010R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m97100d2 = {"Lcom/transsion/postdetail/shorttv/ShortTvWatchAdDialog;", "Lcom/tn/lib/dialog/BaseDialog;", "<init>", "()V", "", "h0", "g0", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "onResume", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onDismiss", "Lcom/transsion/postdetail/shorttv/ShortTvPlayListViewModel;", "a", "Lkotlin/Lazy;", "f0", "()Lcom/transsion/postdetail/shorttv/ShortTvPlayListViewModel;", "shortTvPlayListViewModel", "Lcom/transsion/ad/bidding/video/BiddingVideoManager;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/ad/bidding/video/BiddingVideoManager;", "videoManager", "Lcom/transsion/ad/bidding/interstitial/BiddingInterstitialManager;", "c", "Lcom/transsion/ad/bidding/interstitial/BiddingInterstitialManager;", "interstitialManager", "com/transsion/postdetail/shorttv/ShortTvWatchAdDialog$videoListener$1", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/postdetail/shorttv/ShortTvWatchAdDialog$videoListener$1;", "videoListener", "com/transsion/postdetail/shorttv/ShortTvWatchAdDialog$interstitialListener$1", "e", "Lcom/transsion/postdetail/shorttv/ShortTvWatchAdDialog$interstitialListener$1;", "interstitialListener", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvWatchAdDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy shortTvPlayListViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private BiddingVideoManager videoManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private BiddingInterstitialManager interstitialManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ShortTvWatchAdDialog$videoListener$1 videoListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ShortTvWatchAdDialog$interstitialListener$1 interstitialListener;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.transsion.postdetail.shorttv.ShortTvWatchAdDialog$videoListener$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.transsion.postdetail.shorttv.ShortTvWatchAdDialog$interstitialListener$1] */
    public ShortTvWatchAdDialog() {
        super(R$layout.dialog_short_tv_unlock_tips);
        this.shortTvPlayListViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ShortTvPlayListViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.shorttv.ShortTvWatchAdDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.shorttv.ShortTvWatchAdDialog$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.videoListener = new AbstractC23854a() { // from class: com.transsion.postdetail.shorttv.ShortTvWatchAdDialog$videoListener$1

            /* JADX INFO: renamed from: d */
            private boolean f56756d;

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: i */
            public void mo62846i(TAdErrorCode tAdErrorCode) {
                super.mo62846i(tAdErrorCode);
                this.f56757e.m73603g0();
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: j */
            public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62778j(biddingIntermediateMaterialBean);
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f56757e), null, null, new ShortTvWatchAdDialog$videoListener$1$onBiddingLoad$1(this.f56757e, biddingIntermediateMaterialBean, null), 3, null);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: m */
            public void mo62851m(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62851m(biddingIntermediateMaterialBean);
                if (this.f56756d) {
                    this.f56757e.m73602f0().m73594i("ad_success");
                } else {
                    this.f56757e.m73602f0().m73594i("ad_cancel");
                }
                this.f56757e.dismissAllowingStateLoss();
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: o */
            public void mo62854o(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62854o(biddingIntermediateMaterialBean);
                this.f56756d = true;
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: p */
            public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62855p(biddingIntermediateMaterialBean);
                this.f56757e.m73603g0();
            }
        };
        this.interstitialListener = new AbstractC23854a() { // from class: com.transsion.postdetail.shorttv.ShortTvWatchAdDialog$interstitialListener$1
            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: i */
            public void mo62846i(TAdErrorCode tAdErrorCode) {
                super.mo62846i(tAdErrorCode);
                this.f56755d.m73602f0().m73594i("ad_load_fail");
                this.f56755d.dismissAllowingStateLoss();
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: j */
            public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62778j(biddingIntermediateMaterialBean);
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f56755d), null, null, new ShortTvWatchAdDialog$interstitialListener$1$onBiddingLoad$1(this.f56755d, biddingIntermediateMaterialBean, null), 3, null);
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: m */
            public void mo62851m(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62851m(biddingIntermediateMaterialBean);
                this.f56755d.m73602f0().m73594i("ad_success");
                this.f56755d.dismissAllowingStateLoss();
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: p */
            public void mo62855p(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62855p(biddingIntermediateMaterialBean);
                this.f56755d.m73602f0().m73594i("ad_load_fail");
                this.f56755d.dismissAllowingStateLoss();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final ShortTvPlayListViewModel m73602f0() {
        return (ShortTvPlayListViewModel) this.shortTvPlayListViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public final void m73603g0() {
        BiddingInterstitialManager biddingInterstitialManager = this.interstitialManager;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
        BiddingInterstitialManager biddingInterstitialManager2 = new BiddingInterstitialManager();
        this.interstitialManager = biddingInterstitialManager2;
        biddingInterstitialManager2.m62830L0("ShortTvInterstitialScene");
        BiddingInterstitialManager biddingInterstitialManager3 = this.interstitialManager;
        if (biddingInterstitialManager3 != null) {
            biddingInterstitialManager3.m62829K0(this.interstitialListener);
        }
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new ShortTvWatchAdDialog$loadInterstitialAd$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: h0 */
    private final void m73604h0() {
        BiddingVideoManager biddingVideoManager = this.videoManager;
        if (biddingVideoManager != null) {
            biddingVideoManager.mo62775U();
        }
        BiddingVideoManager biddingVideoManager2 = new BiddingVideoManager();
        this.videoManager = biddingVideoManager2;
        biddingVideoManager2.m62830L0("ShortTvVideoScene");
        BiddingVideoManager biddingVideoManager3 = this.videoManager;
        if (biddingVideoManager3 != null) {
            biddingVideoManager3.m62829K0(this.videoListener);
        }
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new ShortTvWatchAdDialog$loadVideoAd$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m73605i0(ShortTvWatchAdDialog shortTvWatchAdDialog, View view) {
        shortTvWatchAdDialog.dismissAllowingStateLoss();
        shortTvWatchAdDialog.m73602f0().m73595j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m73606j0(ShortTvWatchAdDialog shortTvWatchAdDialog, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 1000L)) {
            return;
        }
        C27620g c27620g = C27620g.f84744a;
        Context contextRequireContext = shortTvWatchAdDialog.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        if (!c27620g.m107450a(contextRequireContext)) {
            C13806h.f49015a.m62324k(R$string.player_no_network_tip2);
            return;
        }
        Subject subject = (Subject) shortTvWatchAdDialog.m73602f0().m73593h().m14847f();
        if (subject == null) {
            return;
        }
        C16904k.m73727b(C16904k.f56790a, subject.getSubjectId(), subject.getOps(), "dialog_minitv_unlock", "1", null, 16, null);
        shortTvWatchAdDialog.m73604h0();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        super.onCancel(dialog);
        m73602f0().m73595j();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DialogC10016c dialogC10016c = new DialogC10016c(requireContext(), R$style.BottomDialogTheme);
        dialogC10016c.setCanceledOnTouchOutside(false);
        return dialogC10016c;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        super.onDismiss(dialog);
        BiddingVideoManager biddingVideoManager = this.videoManager;
        if (biddingVideoManager != null) {
            biddingVideoManager.mo62775U();
        }
        BiddingInterstitialManager biddingInterstitialManager = this.interstitialManager;
        if (biddingInterstitialManager != null) {
            biddingInterstitialManager.mo62775U();
        }
    }

    @Override // com.p282tn.lib.dialog.BaseDialog, androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        View viewFindViewById;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (viewFindViewById = window.findViewById(R$id.design_bottom_sheet)) == null) {
            return;
        }
        viewFindViewById.setBackgroundResource(R.color.transparent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String subjectId;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(com.transsion.postdetail.R$id.iv_close).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.shorttv.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ShortTvWatchAdDialog.m73605i0(this.f56791a, view2);
            }
        });
        TextView textView = (TextView) view.findViewById(com.transsion.postdetail.R$id.tv_episode);
        Subject subject = (Subject) m73602f0().m73593h().m14847f();
        int totalEpisode = subject != null ? subject.getTotalEpisode() : 0;
        C22085a0 c22085a0 = C22085a0.f68095a;
        int iM89429e = c22085a0.m89429e();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        textView.setText(iM89429e + c22085a0.m89428c(subjectId) >= totalEpisode ? getString(R$string.short_tv_watch_ad_tips, getString(R$string.short_tv_all)) : getString(R$string.short_tv_watch_ad_tips, String.valueOf(c22085a0.m89429e())));
        view.findViewById(com.transsion.postdetail.R$id.tv_unlock).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.shorttv.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ShortTvWatchAdDialog.m73606j0(this.f56792a, view2);
            }
        });
    }
}
