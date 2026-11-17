package com.transsion.videodetail.music.p322ui;

import android.os.Bundle;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import com.transsion.baselib.report.C14492k;
import com.transsion.moviedetail.R$id;
import com.transsion.videodetail.BaseDetailActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23592a;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.C25917a;
import p723qx.C27136c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, m97100d2 = {"Lcom/transsion/videodetail/music/ui/MusicDetailActivity;", "Lcom/transsion/videodetail/BaseDetailActivity;", "Lgn/a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "n0", "()Z", "G0", "()Lgn/a;", "q0", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MusicDetailActivity extends BaseDetailActivity<C23592a> {
    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C23592a getViewBinding() {
        C23592a c23592aM93346c = C23592a.m93346c(getLayoutInflater());
        Intrinsics.m97801g(c23592aM93346c, "inflate(...)");
        return c23592aM93346c;
    }

    @Override // com.transsion.videodetail.BaseDetailActivity, com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: n0 */
    public boolean mo65392n0() {
        return false;
    }

    @Override // com.transsion.videodetail.BaseDetailActivity, com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        super.onCreate(savedInstanceState);
        C14492k.f50955a.m65329w(1, this);
        C25917a.f79141a.m101737c("MusicDetailActivity --> onCreate() --> 音乐详情页单独处理");
        C27136c.f82250a.m105600a();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: q0 */
    public void mo65395q0() {
        super.mo65395q0();
        if (getMFragment() == null) {
            m85905E0(getSupportFragmentManager().m14547k0("MusicDetailFragment"));
            if (getMFragment() == null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
                AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
                Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
                MusicDetailFragment musicDetailFragmentM86402a = MusicDetailFragment.INSTANCE.m86402a();
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
                bundle.putBoolean("is_music_liked_fragment", this.isMusicLikedFragment);
                bundle.putBoolean("is_music_float_view_click", this.isMusicFloatViewClick);
                C25917a.f79141a.m101737c(musicDetailFragmentM86402a.getClassTag() + " --> loadDefaultData() --> isMusicLikedFragment = " + this.isMusicLikedFragment);
                musicDetailFragmentM86402a.setArguments(bundle);
                abstractC3168wM14557p.m14814t(R$id.container, musicDetailFragmentM86402a, "MusicDetailFragment");
                m85905E0(musicDetailFragmentM86402a);
                abstractC3168wM14557p.mo14671j();
            }
        }
    }
}
