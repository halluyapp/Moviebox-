package com.transsion.ugcvideodetail.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.AbstractC3226v;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.moviedetail.R$id;
import com.transsion.ugcvideodetail.api.UGCPageStyle;
import com.transsion.ugcvideodetail.api.UGCVideoType;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment;
import com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment;
import com.transsion.videofloat.manager.InterfaceC21108c;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import ng.AbstractC26006c;
import p349dh.C22982c;
import p356ds.AbstractC23048b;
import p723qx.InterfaceC27138e;
import p885wv.C28441a;
import p922xv.InterfaceC28667a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010$J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010$J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010$J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010$J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\u0005R\u0018\u00107\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0018\u0010;\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0018\u0010=\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0018\u0010?\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u00106R\u0018\u0010A\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u00106R\u0018\u0010C\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u00106R\u0018\u0010E\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u00106R\u0018\u0010G\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bF\u00106R\u0016\u0010J\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u00106R\u0018\u0010R\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010LR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y¨\u0006["}, m97100d2 = {"Lcom/transsion/ugcvideodetail/activity/UGCVideoDetailActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lwv/a;", "Lcom/transsion/videofloat/manager/c;", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "", "tag", "", "G0", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "K0", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "video", "", "M0", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "category", "L0", "(Ljava/lang/String;)V", "J0", "()Lwv/a;", "q0", "retryLoadData", "getPageName", "()Ljava/lang/String;", "onPause", "onDestroy", "h", "isMusicFloatingAttach", "()Z", "isChangeStatusBar", "f0", "o0", "n0", "isTranslucent", "isStatusDark", "", "statusColor", "()I", "Landroid/view/View;", "g0", "()Landroid/view/View;", "l0", "m0", "k0", "p0", "i", "Ljava/lang/String;", "videoId", "j", "collectionId", CampaignEx.JSON_KEY_AD_K, "subjectId", "l", NativeComponentConstants.KEY_COMPONENT_TYPE, "m", "ops", "n", "fromOptId", "o", "pageStyle", TtmlNode.TAG_P, "previousPageVideoId", CampaignEx.JSON_KEY_AD_Q, "previousPageTrackId", CampaignEx.JSON_KEY_AD_R, "I", "bottomFragmentSelected", "s", "Z", "withoutHistory", "t", "homeTabId", TmcStartParams.KEY_URL_SHORT, "Landroidx/fragment/app/Fragment;", "mFragment", "v", "hasHandledActivityLimit", "Lxv/a;", "w", "Lkotlin/Lazy;", "I0", "()Lxv/a;", "detailApi", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCVideoDetailActivity extends BaseNewActivity<C28441a> implements InterfaceC21108c {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String videoId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String collectionId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String subjectId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public String type;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public String ops;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public String fromOptId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public String pageStyle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public String previousPageVideoId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public String previousPageTrackId;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int bottomFragmentSelected;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean withoutHistory;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public String homeTabId;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Fragment mFragment;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean hasHandledActivityLimit;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Lazy detailApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.activity.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCVideoDetailActivity.m83588H0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public final void m83587G0(Fragment fragment, String tag) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        C26866a.a.m104901l(C26866a.f81698a, "UGCVideoDetailActivity", "createFragment: homeTabId:" + this.homeTabId, false, 4, null);
        fragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("id", this.videoId), TuplesKt.m97108a("ugcCategory", this.type), TuplesKt.m97108a("subject_id", this.subjectId), TuplesKt.m97108a("collection_id", this.collectionId), TuplesKt.m97108a("ops", this.ops), TuplesKt.m97108a("from_opt_id", this.fromOptId), TuplesKt.m97108a("parent_video_id", this.previousPageVideoId), TuplesKt.m97108a("parent_track_id", this.previousPageTrackId), TuplesKt.m97108a("ugc_bottom_fragment_selected", Integer.valueOf(this.bottomFragmentSelected)), TuplesKt.m97108a("ugc_without_history", Boolean.valueOf(this.withoutHistory)), TuplesKt.m97108a("tab_id", this.homeTabId)));
        abstractC3168wM14557p.m14814t(R$id.container, fragment, tag);
        this.mFragment = fragment;
        abstractC3168wM14557p.mo14671j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final InterfaceC28667a m83588H0() {
        return (InterfaceC28667a) C22982c.f70163e.m91553a().m91552h(InterfaceC28667a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public final InterfaceC28667a m83589I0() {
        return (InterfaceC28667a) this.detailApi.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K0 */
    private final void m83590K0() {
        ProgressBar ugcPbLoading = ((C28441a) getMViewBinding()).f87264c;
        Intrinsics.m97801g(ugcPbLoading, "ugcPbLoading");
        AbstractC26006c.m102058k(ugcPbLoading);
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new UGCVideoDetailActivity$requestVideoDetailAndCreateFragment$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public final boolean m83591M0(UGCVideo video) {
        return video.isVerticalImmStyle();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public C28441a getViewBinding() {
        C28441a c28441aM109877c = C28441a.m109877c(getLayoutInflater());
        Intrinsics.m97801g(c28441aM109877c, "inflate(...)");
        return c28441aM109877c;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m83593L0(String category) {
        if (this.hasHandledActivityLimit) {
            return;
        }
        C14492k.f50955a.m65329w(Intrinsics.m97797c(category, UGCVideoType.MUSIC.getValue()) ? 1 : 3, this);
        this.hasHandledActivityLimit = true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: g0 */
    public View mo65387g0() {
        View viewMo65387g0 = super.mo65387g0();
        AbstractC23048b.m91690a(viewMo65387g0);
        return viewMo65387g0;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "/ugc_video/detail";
    }

    @Override // com.transsion.videofloat.manager.InterfaceC21108c
    /* JADX INFO: renamed from: h */
    public void mo70151h() {
        Fragment fragment = this.mFragment;
        if (fragment instanceof UGCVideoDetailFragment) {
            UGCVideoDetailFragment uGCVideoDetailFragment = fragment instanceof UGCVideoDetailFragment ? (UGCVideoDetailFragment) fragment : null;
            if (uGCVideoDetailFragment != null) {
                uGCVideoDetailFragment.m83841L0();
                return;
            }
            return;
        }
        if (fragment instanceof UGCImmVideoDetailFragment) {
            UGCImmVideoDetailFragment uGCImmVideoDetailFragment = fragment instanceof UGCImmVideoDetailFragment ? (UGCImmVideoDetailFragment) fragment : null;
            if (uGCImmVideoDetailFragment != null) {
                uGCImmVideoDetailFragment.m83724Y0();
            }
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity
    public boolean isMusicFloatingAttach() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: k0 */
    public void mo65389k0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: n0 */
    public boolean mo65392n0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: o0 */
    public boolean mo65393o0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        if (Intrinsics.m97797c(this.type, UGCVideoType.SHORT_TV.getValue())) {
            this.pageStyle = UGCPageStyle.UGC_PAGE_STYLE_IMM_VERTICAL_VIDEO.getValue();
        }
        super.onCreate(savedInstanceState);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        mo70151h();
        InterfaceC27138e.f82251a.m105606b().mo86575j(this);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            mo70151h();
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: q0 */
    public void mo65395q0() {
        if (this.mFragment == null) {
            Fragment fragmentM14547k0 = getSupportFragmentManager().m14547k0("VideoDetailFragment");
            this.mFragment = fragmentM14547k0;
            if (fragmentM14547k0 == null) {
                String str = this.pageStyle;
                if (Intrinsics.m97797c(str, UGCPageStyle.UGC_PAGE_STYLE_HORIZONTAL_VIDEO.getValue())) {
                    m83587G0(UGCVideoDetailFragment.INSTANCE.m83930a(), "UGCVideoDetailFragment");
                } else if (!Intrinsics.m97797c(str, UGCPageStyle.UGC_PAGE_STYLE_IMM_VERTICAL_VIDEO.getValue())) {
                    m83590K0();
                } else {
                    C14492k.f50955a.m65329w(2, this);
                    m83587G0(UGCImmVideoDetailFragment.INSTANCE.m83727a(), "UGCImmVideoDetailFragment");
                }
            }
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public int statusColor() {
        return R$color.black;
    }
}
