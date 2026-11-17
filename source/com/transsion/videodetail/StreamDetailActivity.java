package com.transsion.videodetail;

import android.os.Bundle;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.transsion.baselib.report.C14492k;
import com.transsion.videofloat.manager.InterfaceC21108c;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23592a;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p723qx.InterfaceC27138e;
import p743rh.C27287m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m97100d2 = {"Lcom/transsion/videodetail/StreamDetailActivity;", "Lcom/transsion/videodetail/BaseDetailActivity;", "Lgn/a;", "Lcom/transsion/videofloat/manager/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "p0", "retryLoadData", "G0", "()Lgn/a;", "", "getPageName", "()Ljava/lang/String;", "onResume", "onPause", "h", "", "isChangeStatusBar", "()Z", TmcStartParams.KEY_URL_SHORT, "a", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class StreamDetailActivity extends BaseDetailActivity<C23592a> implements InterfaceC21108c {
    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C23592a getViewBinding() {
        C23592a c23592aM93346c = C23592a.m93346c(getLayoutInflater());
        Intrinsics.m97801g(c23592aM93346c, "inflate(...)");
        return c23592aM93346c;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "subjectdetail";
    }

    @Override // com.transsion.videofloat.manager.InterfaceC21108c
    /* JADX INFO: renamed from: h */
    public void mo70151h() {
        Fragment mFragment = getMFragment();
        StreamDetailFragment streamDetailFragment = mFragment instanceof StreamDetailFragment ? (StreamDetailFragment) mFragment : null;
        if (streamDetailFragment != null) {
            streamDetailFragment.m86020Z1();
        }
    }

    @Override // com.transsion.videodetail.BaseDetailActivity, com.transsion.baseui.activity.BaseNewActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.videodetail.BaseDetailActivity, com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        super.onCreate(savedInstanceState);
        C14492k.f50955a.m65329w(3, this);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            Fragment mFragment = getMFragment();
            StreamDetailFragment streamDetailFragment = mFragment instanceof StreamDetailFragment ? (StreamDetailFragment) mFragment : null;
            if (streamDetailFragment != null) {
                streamDetailFragment.m86020Z1();
            }
            InterfaceC27138e.f82251a.m105606b().mo86575j(this);
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.transsion.videodetail.BaseDetailActivity, com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
        if (getMFragment() == null) {
            m85905E0(getSupportFragmentManager().m14547k0("VideoDetailFragment"));
            if (getMFragment() == null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
                AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
                Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
                StreamDetailFragment streamDetailFragmentM86022a = StreamDetailFragment.INSTANCE.m86022a();
                Bundle bundle = new Bundle();
                bundle.putString("id", this.id);
                bundle.putString("ops", this.ops);
                bundle.putBoolean("auto_download", this.autoDownload);
                bundle.putBoolean("auto_play", this.autoPlay);
                bundle.putString("auto_play_resource_id", this.autoPlayResourceId);
                bundle.putString("module_name", this.moduleName);
                bundle.putInt("yy_preload_id", this.preloadId);
                bundle.putInt("season", this.curSeason);
                bundle.putInt("episode", this.targetEp);
                streamDetailFragmentM86022a.setArguments(bundle);
                abstractC3168wM14557p.m14814t(com.transsion.moviedetail.R$id.container, streamDetailFragmentM86022a, "VideoDetailFragment");
                m85905E0(streamDetailFragmentM86022a);
                abstractC3168wM14557p.mo14671j();
            }
        }
    }

    @Override // com.transsion.videodetail.BaseDetailActivity, com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        m65400w0();
        if (!C27287m.f83003a.m106330e()) {
            m65402y0();
        } else {
            m65398u0();
            mo65394p0();
        }
    }
}
