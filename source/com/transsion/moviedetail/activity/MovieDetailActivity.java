package com.transsion.moviedetail.activity;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.activity.MovieDetailActivity;
import com.transsion.moviedetail.fragment.MovieDetailFragment;
import com.transsion.videofloat.manager.InterfaceC21108c;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23592a;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p352dn.InterfaceC22998b;
import p723qx.InterfaceC27138e;
import p743rh.C27287m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0005R\u0018\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010+\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010%R\u0018\u00101\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010%R\u0016\u00104\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00108\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u00103R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, m97100d2 = {"Lcom/transsion/moviedetail/activity/MovieDetailActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lgn/a;", "Lcom/transsion/videofloat/manager/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "f0", "()Ljava/lang/String;", "", "o0", "()Z", "n0", "isMonitorNetworkState", "l0", "m0", "k0", "p0", "retryLoadData", "D0", "()Lgn/a;", "isTranslucent", "isStatusDark", "isChangeStatusBar", "", "statusColor", "()I", "getPageName", "isMusicFloatingAttach", "onPause", "h", "i", "Ljava/lang/String;", "id", "j", "ops", CampaignEx.JSON_KEY_AD_K, "Z", "autoDownload", "l", "autoPlay", "m", "autoPlayResourceId", "n", "moduleName", "o", "I", "preloadId", TtmlNode.TAG_P, "curSeason", CampaignEx.JSON_KEY_AD_Q, "subjectYpe", "Landroidx/fragment/app/Fragment;", CampaignEx.JSON_KEY_AD_R, "Landroidx/fragment/app/Fragment;", "mFragment", "s", "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MovieDetailActivity extends BaseNewActivity<C23592a> implements InterfaceC21108c {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String id;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String ops;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean autoDownload;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean autoPlay;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public String autoPlayResourceId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public String moduleName;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int preloadId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int curSeason = 1;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int subjectYpe = -1;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Fragment mFragment;

    /* JADX INFO: renamed from: com.transsion.moviedetail.activity.MovieDetailActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m70152a(String msg) {
            Intrinsics.m97802h(msg, "msg");
            Log.w("zxb_log_movie_detail", msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m70149E0() {
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69872z(0.0f);
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C23592a getViewBinding() {
        C23592a c23592aM93346c = C23592a.m93346c(getLayoutInflater());
        Intrinsics.m97801g(c23592aM93346c, "inflate(...)");
        return c23592aM93346c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "subjectdetail";
    }

    @Override // com.transsion.videofloat.manager.InterfaceC21108c
    /* JADX INFO: renamed from: h */
    public void mo70151h() {
        Fragment fragment = this.mFragment;
        if (fragment instanceof MovieDetailFragment) {
            MovieDetailFragment movieDetailFragment = fragment instanceof MovieDetailFragment ? (MovieDetailFragment) fragment : null;
            if (movieDetailFragment != null) {
                movieDetailFragment.m70366y1();
            }
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public boolean isMonitorNetworkState() {
        return true;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
        m65396s0();
        ((C23592a) getMViewBinding()).getRoot().post(new Runnable() { // from class: en.a
            @Override // java.lang.Runnable
            public final void run() {
                MovieDetailActivity.m70149E0();
            }
        });
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: n0 */
    public boolean mo65392n0() {
        return true;
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
        C14492k.f50955a.m65329w(3, this);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            Fragment fragment = this.mFragment;
            MovieDetailFragment movieDetailFragment = fragment instanceof MovieDetailFragment ? (MovieDetailFragment) fragment : null;
            if (movieDetailFragment != null) {
                movieDetailFragment.m70366y1();
            }
            InterfaceC27138e.f82251a.m105606b().mo86575j(this);
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
        if (this.mFragment == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            MovieDetailFragment movieDetailFragmentM70367a = MovieDetailFragment.INSTANCE.m70367a();
            Bundle bundle = new Bundle();
            bundle.putString("id", this.id);
            bundle.putString("ops", this.ops);
            bundle.putBoolean("auto_download", this.autoDownload);
            bundle.putBoolean("auto_play", this.autoPlay);
            bundle.putString("auto_play_resource_id", this.autoPlayResourceId);
            bundle.putString("module_name", this.moduleName);
            bundle.putInt("season", this.curSeason);
            bundle.putInt("subject_type", this.subjectYpe);
            bundle.putInt("yy_preload_id", this.preloadId);
            movieDetailFragmentM70367a.setArguments(bundle);
            abstractC3168wM14557p.m14813s(R$id.container, movieDetailFragmentM70367a);
            this.mFragment = movieDetailFragmentM70367a;
            abstractC3168wM14557p.mo14671j();
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
