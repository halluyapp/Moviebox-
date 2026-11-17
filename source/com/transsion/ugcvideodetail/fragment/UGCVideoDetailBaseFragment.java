package com.transsion.ugcvideodetail.fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0256u;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.AbstractC3226v;
import co.InterfaceC5146a;
import com.blankj.utilcode.util.AbstractC5781d;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.p285ad.strategy.C14058c;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import com.transsion.ugcvideodetail.hepler.C20314e;
import com.transsion.ugcvideodetail.widget.UGCVideoDetailPlayListView;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.wrapperad.view.cardpage.NativeCardPageAdHelper;
import com.transsion.wrapperad.view.cardpage.NativeCardPageView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import jo.InterfaceC24450a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p550kj.C24662i;
import p553ko.C24715a;
import p723qx.C27136c;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p755rx.C27425a;
import p885wv.C28449i;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0006H$¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0006H$¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0006H$¢\u0006\u0004\b\u0018\u0010\u0005J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001e\u001a\u00020\u00062\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\u0006H\u0004¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0005J\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u0005J\u001b\u0010.\u001a\u00020\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010)J\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\u0005J\u0017\u00106\u001a\u00020\u001c2\u0006\u00105\u001a\u000204H\u0014¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H$¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010\u0005J\u0019\u0010=\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010\u0010H\u0004¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0004¢\u0006\u0004\b?\u0010\u0005R$\u0010D\u001a\u0004\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u0012\"\u0004\bC\u0010>R$\u0010H\u001a\u0004\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bE\u0010A\u001a\u0004\bF\u0010\u0012\"\u0004\bG\u0010>R$\u0010L\u001a\u0004\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010\u0012\"\u0004\bK\u0010>R\"\u0010T\u001a\u00020M8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010\\\u001a\u0004\u0018\u00010U8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010d\u001a\u0004\u0018\u00010]8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR*\u0010j\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010\u001fR\"\u0010n\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010A\u001a\u0004\bl\u0010\u0012\"\u0004\bm\u0010>R$\u0010r\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010A\u001a\u0004\bp\u0010\u0012\"\u0004\bq\u0010>R$\u0010v\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010A\u001a\u0004\bt\u0010\u0012\"\u0004\bu\u0010>R\u0016\u0010z\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u0010\u0081\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0083\u0001\u001a\u00020\u00108&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0012R\u0016\u0010\u0085\u0001\u001a\u00020\u00108&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u0012¨\u0006\u0086\u0001"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailBaseFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lwv/i;", "Lco/a;", "<init>", "()V", "", "I0", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "n0", "(Landroidx/fragment/app/FragmentManager;)V", "Landroid/view/LayoutInflater;", "inflater", "E0", "(Landroid/view/LayoutInflater;)Lwv/i;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "receiveArguments", "initViewData", "initListener", "F0", "H0", "q0", "w0", "B0", "Lkotlin/Function0;", "", "callback", "S", "(Lkotlin/jvm/functions/Function0;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "M0", "l0", "onResume", "onPause", "hidden", "onHiddenChanged", "(Z)V", "onStop", "L0", "Lko/a;", "bean", "o0", "(Lko/a;)V", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "onHomeClick", "onRecentClick", "Lcom/transsion/videofloat/bean/FloatActionType;", "actionType", "V0", "(Lcom/transsion/videofloat/bean/FloatActionType;)Z", "Lrx/a;", "u0", "()Lrx/a;", "onDestroy", "genre", "K0", "(Ljava/lang/String;)V", "m0", "a", "Ljava/lang/String;", "v0", "setLastPageFrom", "lastPageFrom", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "D0", "T0", "ugcVideoId", "c", "getUgcVideoType", "U0", "ugcVideoType", "Lcom/transsion/player/longvideo/ui/LongVodUiType;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/player/longvideo/ui/LongVodUiType;", "t0", "()Lcom/transsion/player/longvideo/ui/LongVodUiType;", "O0", "(Lcom/transsion/player/longvideo/ui/LongVodUiType;)V", "curPlayerUiType", "Ljo/a;", "e", "Ljo/a;", "y0", "()Ljo/a;", "P0", "(Ljo/a;)V", "playerControl", "Lcom/transsion/ugcvideodetail/hepler/e;", "f", "Lcom/transsion/ugcvideodetail/hepler/e;", "s0", "()Lcom/transsion/ugcvideodetail/hepler/e;", "N0", "(Lcom/transsion/ugcvideodetail/hepler/e;)V", "bottomRecHelper", "g", "Lkotlin/jvm/functions/Function0;", "r0", "()Lkotlin/jvm/functions/Function0;", "setBackCallback", "backCallback", "h", "C0", "S0", "trackId", "i", "A0", "R0", "previousTrackId", "j", "z0", "Q0", "previousPageVideoId", "", CampaignEx.JSON_KEY_AD_K, "J", "pageLoadStartTime", "Lcom/transsion/wrapperad/view/cardpage/NativeCardPageAdHelper;", "l", "Lcom/transsion/wrapperad/view/cardpage/NativeCardPageAdHelper;", "adHelper", "m", "Z", "isLoadedAd", "x0", "PAGE_NAME", "getTAG", "TAG", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class UGCVideoDetailBaseFragment extends PageStatusFragment<C28449i> implements InterfaceC5146a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String lastPageFrom;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String ugcVideoId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String ugcVideoType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LongVodUiType curPlayerUiType = LongVodUiType.MIDDLE;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private InterfaceC24450a playerControl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C20314e bottomRecHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function0 backCallback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String trackId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String previousTrackId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String previousPageVideoId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long pageLoadStartTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private NativeCardPageAdHelper adHelper;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isLoadedAd;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment$a */
    public static final class C20200a extends AbstractC0256u {
        C20200a() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            Function0 backCallback = UGCVideoDetailBaseFragment.this.getBackCallback();
            if (backCallback == null || !((Boolean) backCallback.invoke()).booleanValue()) {
                if (UGCVideoDetailBaseFragment.this.getPlayerControl() != null) {
                    InterfaceC24450a playerControl = UGCVideoDetailBaseFragment.this.getPlayerControl();
                    if (playerControl != null) {
                        playerControl.onBackPressed();
                        return;
                    }
                    return;
                }
                FragmentActivity activity = UGCVideoDetailBaseFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    public UGCVideoDetailBaseFragment() {
        String string = UUID.randomUUID().toString();
        Intrinsics.m97801g(string, "toString(...)");
        this.trackId = string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m83828G0(UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        FragmentActivity activity;
        if (uGCVideoDetailBaseFragment.playerControl != null) {
            if (uGCVideoDetailBaseFragment.mo83822V0(FloatActionType.BACK) || (activity = uGCVideoDetailBaseFragment.getActivity()) == null) {
                return;
            }
            activity.finish();
            return;
        }
        FragmentActivity activity2 = uGCVideoDetailBaseFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final void m83829I0() {
        ConstraintLayout constraintLayoutM109909b;
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayoutM109909b = mViewBinding.getRoot()) == null) {
            return;
        }
        constraintLayoutM109909b.post(new Runnable() { // from class: com.transsion.ugcvideodetail.fragment.j0
            @Override // java.lang.Runnable
            public final void run() {
                UGCVideoDetailBaseFragment.m83830J0(this.f64281a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m83830J0(UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment) {
        FragmentActivity activity = uGCVideoDetailBaseFragment.getActivity();
        if (activity != null) {
            InterfaceC27135b.f82245a.m105597c().mo86624e(activity, uGCVideoDetailBaseFragment.getSubjectId(), uGCVideoDetailBaseFragment.ugcVideoId, uGCVideoDetailBaseFragment.getPAGE_NAME(), uGCVideoDetailBaseFragment.getOps());
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final void m83833n0(FragmentManager fragmentManager) {
        try {
            List<Fragment> listM14574y0 = fragmentManager.m14574y0();
            Intrinsics.m97801g(listM14574y0, "getFragments(...)");
            for (Fragment fragment : listM14574y0) {
                if (fragment instanceof BaseBottomDialogFragment) {
                    BaseBottomDialogFragment.m71695m0((BaseBottomDialogFragment) fragment, false, 1, null);
                } else if ((fragment instanceof DialogFragment) && ((DialogFragment) fragment).isAdded()) {
                    ((DialogFragment) fragment).dismissAllowingStateLoss();
                }
            }
        } catch (Exception e11) {
            C26866a.a.m104900k(C26866a.f81698a, getTAG(), "dismissDialogsInFragmentManager error: " + e11.getMessage(), e11, false, 8, null);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m83834p0(UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, C24715a c24715a, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: feedback");
        }
        if ((i11 & 1) != 0) {
            c24715a = null;
        }
        uGCVideoDetailBaseFragment.m83853o0(c24715a);
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public String getPreviousTrackId() {
        return this.previousTrackId;
    }

    /* JADX INFO: renamed from: B0 */
    protected String getSubjectId() {
        return null;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    protected final String getUgcVideoId() {
        return this.ugcVideoId;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C28449i getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28449i c28449iM109907c = C28449i.m109907c(inflater);
        Intrinsics.m97801g(c28449iM109907c, "inflate(...)");
        return c28449iM109907c;
    }

    /* JADX INFO: renamed from: F0 */
    protected abstract void mo83820F0();

    /* JADX INFO: renamed from: H0 */
    protected abstract void mo83821H0();

    /* JADX INFO: renamed from: K0 */
    protected final void m83840K0(String genre) {
        C28449i mViewBinding;
        NativeCardPageView nativeCardPageView;
        NativeCardPageAdHelper nativeCardPageAdHelperM86951G;
        NativeCardPageAdHelper nativeCardPageAdHelperM86950F;
        if (this.isLoadedAd || (mViewBinding = getMViewBinding()) == null || (nativeCardPageView = mViewBinding.f87331m) == null) {
            return;
        }
        this.isLoadedAd = true;
        AbstractC26006c.m102054g(nativeCardPageView);
        NativeCardPageAdHelper nativeCardPageAdHelper = this.adHelper;
        if (nativeCardPageAdHelper == null || (nativeCardPageAdHelperM86951G = nativeCardPageAdHelper.m86951G("StreamingMediaContentScene")) == null || (nativeCardPageAdHelperM86950F = nativeCardPageAdHelperM86951G.m86950F(C14058c.f49742a.m63681a(genre))) == null) {
            return;
        }
        nativeCardPageAdHelperM86950F.m86953u(nativeCardPageView);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m83841L0() {
        InterfaceC24450a interfaceC24450a;
        C27136c c27136c = C27136c.f82250a;
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        if (!c27136c.m105602c(interfaceC24450a2 != null ? interfaceC24450a2.getPlayer() : null) && (interfaceC24450a = this.playerControl) != null) {
            interfaceC24450a.release();
        }
        InterfaceC24450a interfaceC24450a3 = this.playerControl;
        if (interfaceC24450a3 != null) {
            interfaceC24450a3.onPageDestroy();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m83842M0() {
        this.pageLoadStartTime = System.currentTimeMillis();
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "resetPageLoadStartTime: " + this.pageLoadStartTime, false, 4, null);
    }

    /* JADX INFO: renamed from: N0 */
    protected final void m83843N0(C20314e c20314e) {
        this.bottomRecHelper = c20314e;
    }

    /* JADX INFO: renamed from: O0 */
    protected final void m83844O0(LongVodUiType longVodUiType) {
        Intrinsics.m97802h(longVodUiType, "<set-?>");
        this.curPlayerUiType = longVodUiType;
    }

    /* JADX INFO: renamed from: P0 */
    protected final void m83845P0(InterfaceC24450a interfaceC24450a) {
        this.playerControl = interfaceC24450a;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m83846Q0(String str) {
        this.previousPageVideoId = str;
    }

    /* JADX INFO: renamed from: R0 */
    public void m83847R0(String str) {
        this.previousTrackId = str;
    }

    @Override // co.InterfaceC5146a
    /* JADX INFO: renamed from: S */
    public void mo24053S(Function0 callback) {
        this.backCallback = callback;
    }

    /* JADX INFO: renamed from: S0 */
    public void m83848S0(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.trackId = str;
    }

    /* JADX INFO: renamed from: T0 */
    protected final void m83849T0(String str) {
        this.ugcVideoId = str;
    }

    /* JADX INFO: renamed from: U0 */
    protected final void m83850U0(String str) {
        this.ugcVideoType = str;
    }

    /* JADX INFO: renamed from: V0 */
    protected boolean mo83822V0(FloatActionType actionType) {
        Intrinsics.m97802h(actionType, "actionType");
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    public abstract String getTAG();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatImageView = mViewBinding.f87327i) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailBaseFragment.m83828G0(this.f64278a, view);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        View view;
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (view = mViewBinding.f87336r) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).height = AbstractC5781d.m27351c();
            view.setLayoutParams(c2308b);
        }
        this.adHelper = new NativeCardPageAdHelper(AbstractC3226v.m14968a(this));
        requireActivity().getOnBackPressedDispatcher().m942i(this, new C20200a());
        mo83820F0();
        mo83821H0();
        mo83823q0();
        m83829I0();
    }

    /* JADX INFO: renamed from: l0 */
    protected final void m83851l0() {
        HashMap mapM96844g;
        if (this.pageLoadStartTime > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.pageLoadStartTime;
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
            }
            C26866a.a.m104898f(C26866a.f81698a, getTAG(), "load_duration: " + jCurrentTimeMillis + " ms", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    protected final void m83852m0() {
        FragmentManager supportFragmentManager;
        try {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            m83833n0(childFragmentManager);
            FragmentActivity activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            m83833n0(supportFragmentManager);
        } catch (Exception e11) {
            C26866a.a.m104900k(C26866a.f81698a, getTAG(), "dismissAllDialogs error: " + e11.getMessage(), e11, false, 8, null);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPAGE_NAME(), false, 2, null);
    }

    /* JADX INFO: renamed from: o0 */
    protected void m83853o0(C24715a bean) {
        Navigator.m61845x(TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SUBJECT_PLAY").m61857K("ugc_video_id", this.ugcVideoId), requireContext(), null, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        setMViewBinding(null);
        NativeCardPageAdHelper nativeCardPageAdHelper = this.adHelper;
        if (nativeCardPageAdHelper != null) {
            nativeCardPageAdHelper.m86956x();
        }
        this.adHelper = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        C28449i mViewBinding;
        UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
        super.onHiddenChanged(hidden);
        if (!hidden || (mViewBinding = getMViewBinding()) == null || (uGCVideoDetailPlayListView = mViewBinding.f87332n) == null) {
            return;
        }
        uGCVideoDetailPlayListView.clearExposureCache();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, com.transsion.baselib.utils.DeviceKeyMonitor.InterfaceC14502b
    public void onHomeClick() {
        super.onHomeClick();
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "StreamDetail onHomeClick", false, 4, null);
        mo83822V0(FloatActionType.HOME);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        UGCVideoDetailPlayListView uGCVideoDetailPlayListView;
        super.onPause();
        NativeCardPageAdHelper nativeCardPageAdHelper = this.adHelper;
        if (nativeCardPageAdHelper != null) {
            nativeCardPageAdHelper.m86949C();
        }
        C28449i mViewBinding = getMViewBinding();
        if (mViewBinding == null || (uGCVideoDetailPlayListView = mViewBinding.f87332n) == null) {
            return;
        }
        uGCVideoDetailPlayListView.clearExposureCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        InterfaceC24450a interfaceC24450a;
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        if (isInPictureInPictureMode) {
            FragmentActivity activity = getActivity();
            if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            C27425a c27425aMo83824u0 = mo83824u0();
            if (c27425aMo83824u0 != null && Build.VERSION.SDK_INT >= 31) {
                C26866a.a.m104898f(C26866a.f81698a, "VideoFloat-pip", "onPictureInPictureModeChanged stream--- updateData==2", false, 4, null);
                InterfaceC27138e.f82251a.m105606b().mo86572g(activity, c27425aMo83824u0);
            }
        }
        InterfaceC27138e.f82251a.m105606b().onPipModeChanged(isInPictureInPictureMode);
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        if (interfaceC24450a2 != null) {
            interfaceC24450a2.onPipModeChanged(isInPictureInPictureMode);
        }
        if (isInPictureInPictureMode || (interfaceC24450a = this.playerControl) == null) {
            return;
        }
        interfaceC24450a.exitFullScreen();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, com.transsion.baselib.utils.DeviceKeyMonitor.InterfaceC14502b
    public void onRecentClick() {
        super.onRecentClick();
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "StreamDetail onRecentClick", false, 4, null);
        mo83822V0(FloatActionType.HOME);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.onViewResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        InterfaceC24450a interfaceC24450a;
        super.onStop();
        InterfaceC24450a interfaceC24450a2 = this.playerControl;
        if (interfaceC24450a2 != null) {
            interfaceC24450a2.onSaveHistory();
        }
        C27136c c27136c = C27136c.f82250a;
        InterfaceC24450a interfaceC24450a3 = this.playerControl;
        if (c27136c.m105602c(interfaceC24450a3 != null ? interfaceC24450a3.getPlayer() : null) || (interfaceC24450a = this.playerControl) == null) {
            return;
        }
        interfaceC24450a.onViewPause();
    }

    /* JADX INFO: renamed from: q0 */
    protected abstract void mo83823q0();

    /* JADX INFO: renamed from: r0, reason: from getter */
    protected final Function0 getBackCallback() {
        return this.backCallback;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        C24655b logViewConfig;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        super.receiveArguments();
        this.pageLoadStartTime = System.currentTimeMillis();
        this.lastPageFrom = C24662i.f75350a.m96877i();
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null) {
            logViewConfig2.m96847j(this.lastPageFrom);
        }
        Bundle arguments = getArguments();
        m83847R0(arguments != null ? arguments.getString("parent_track_id") : null);
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g2 = logViewConfig3.m96844g()) != null) {
        }
        String previousTrackId = getPreviousTrackId();
        if (previousTrackId == null || (logViewConfig = getLogViewConfig()) == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    protected final C20314e getBottomRecHelper() {
        return this.bottomRecHelper;
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    protected final LongVodUiType getCurPlayerUiType() {
        return this.curPlayerUiType;
    }

    /* JADX INFO: renamed from: u0 */
    protected abstract C27425a mo83824u0();

    /* JADX INFO: renamed from: v0, reason: from getter */
    protected final String getLastPageFrom() {
        return this.lastPageFrom;
    }

    /* JADX INFO: renamed from: w0 */
    public String getOps() {
        return null;
    }

    /* JADX INFO: renamed from: x0 */
    public abstract String getPAGE_NAME();

    /* JADX INFO: renamed from: y0, reason: from getter */
    protected final InterfaceC24450a getPlayerControl() {
        return this.playerControl;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public String getPreviousPageVideoId() {
        return this.previousPageVideoId;
    }
}
