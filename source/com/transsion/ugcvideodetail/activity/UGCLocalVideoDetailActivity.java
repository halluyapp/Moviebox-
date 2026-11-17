package com.transsion.ugcvideodetail.activity;

import android.os.Bundle;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.api.UGCVideoType;
import com.transsion.ugcvideodetail.fragment.UGCLocalVideoDetailFragment;
import com.transsion.videofloat.manager.InterfaceC21108c;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p723qx.InterfaceC27138e;
import p743rh.C27287m;
import p885wv.C28441a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0005R\u0018\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0018\u00100\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0018\u00102\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010)R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/activity/UGCLocalVideoDetailActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lwv/a;", "Lcom/transsion/videofloat/manager/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "category", "D0", "(Ljava/lang/String;)V", "C0", "()Lwv/a;", "q0", "retryLoadData", "getPageName", "()Ljava/lang/String;", "onPause", "onDestroy", "h", "", "isMusicFloatingAttach", "()Z", "isChangeStatusBar", "f0", "o0", "n0", "isTranslucent", "isStatusDark", "", "statusColor", "()I", "l0", "m0", "k0", "p0", "i", "Ljava/lang/String;", "videoId", "j", "resourceId", CampaignEx.JSON_KEY_AD_K, NativeComponentConstants.KEY_COMPONENT_TYPE, "l", "previousPageVideoId", "m", "previousPageTrackId", "Landroidx/fragment/app/Fragment;", "n", "Landroidx/fragment/app/Fragment;", "mFragment", "o", "Z", "hasHandledActivityLimit", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCLocalVideoDetailActivity extends BaseNewActivity<C28441a> implements InterfaceC21108c {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String videoId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String resourceId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String type;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public String previousPageVideoId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public String previousPageTrackId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private Fragment mFragment;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean hasHandledActivityLimit;

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C28441a getViewBinding() {
        C28441a c28441aM109877c = C28441a.m109877c(getLayoutInflater());
        Intrinsics.m97801g(c28441aM109877c, "inflate(...)");
        return c28441aM109877c;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m83582D0(String category) {
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

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "/ugc_video/local_detail";
    }

    @Override // com.transsion.videofloat.manager.InterfaceC21108c
    /* JADX INFO: renamed from: h */
    public void mo70151h() {
        Fragment fragment = this.mFragment;
        if (fragment instanceof UGCLocalVideoDetailFragment) {
            UGCLocalVideoDetailFragment uGCLocalVideoDetailFragment = fragment instanceof UGCLocalVideoDetailFragment ? (UGCLocalVideoDetailFragment) fragment : null;
            if (uGCLocalVideoDetailFragment != null) {
                uGCLocalVideoDetailFragment.m83841L0();
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
            Fragment fragment = this.mFragment;
            if (fragment instanceof UGCLocalVideoDetailFragment) {
                UGCLocalVideoDetailFragment uGCLocalVideoDetailFragment = fragment instanceof UGCLocalVideoDetailFragment ? (UGCLocalVideoDetailFragment) fragment : null;
                if (uGCLocalVideoDetailFragment != null) {
                    uGCLocalVideoDetailFragment.m83841L0();
                }
            }
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
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
                AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
                Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
                UGCLocalVideoDetailFragment uGCLocalVideoDetailFragmentM83827a = UGCLocalVideoDetailFragment.INSTANCE.m83827a();
                uGCLocalVideoDetailFragmentM83827a.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("id", this.videoId), TuplesKt.m97108a("resource_id", this.resourceId), TuplesKt.m97108a("ugcCategory", this.type), TuplesKt.m97108a("parent_video_id", this.previousPageVideoId), TuplesKt.m97108a("parent_track_id", this.previousPageTrackId)));
                abstractC3168wM14557p.m14814t(R$id.container, uGCLocalVideoDetailFragmentM83827a, "VideoDetailFragment");
                this.mFragment = uGCLocalVideoDetailFragmentM83827a;
                abstractC3168wM14557p.mo14671j();
            }
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        m65400w0();
        if (!C27287m.f83003a.m106330e()) {
            m65402y0();
        } else {
            m65398u0();
            mo65394p0();
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public int statusColor() {
        return R$color.black;
    }
}
