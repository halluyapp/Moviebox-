package com.transsion.moviedetail.music;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC5775a;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.util.networkinfo.NetworkType;
import com.p282tn.lib.view.InterfaceC13776s;
import com.p282tn.lib.view.SecondariesSeekBar;
import com.therouter.TheRouter;
import com.transsion.base.image.blurhash.C14291e;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.core.utils.C14752e;
import com.transsion.moviedetail.music.MusicTrailerV2Fragment;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PreVideoAddress;
import com.transsion.moviedetailapi.bean.Trailer;
import com.transsion.player.mediasession.C16625i;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.postdetail.R$drawable;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.util.AbstractC17443m;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import gn.C23602j;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import no.C26053g0;
import org.mvel2.ast.ASTNode;
import p393f.C23283i;
import p462hj.C23860f;
import p683po.C26906c;
import p683po.C26907d;
import p743rh.C27287m;
import p750rp.InterfaceC27316b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001MB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0019\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0019\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0005J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u0005J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0005J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\u0005J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\u0005J\u000f\u00108\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\u0005J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0005J\u0019\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b>\u0010=J!\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u001f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bB\u0010=J\u000f\u0010C\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010\u0005J!\u0010D\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u001f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bD\u0010AJ\u0019\u0010E\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bE\u0010=J\u0019\u0010F\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bF\u0010=J\u0019\u0010G\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bG\u0010=J!\u0010J\u001a\u00020\u00062\u0006\u0010I\u001a\u00020H2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010QR\u0016\u0010\\\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010QR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001b\u0010l\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001c\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00120q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010v\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010WR\u0014\u0010x\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010oR\"\u0010}\u001a\u0010\u0012\f\u0012\n z*\u0004\u0018\u00010\u00120\u00120y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006\u007f"}, m97100d2 = {"Lcom/transsion/moviedetail/music/MusicTrailerV2Fragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgn/j;", "Lcom/transsion/player/orplayer/f;", "<init>", "()V", "", "Q0", "D0", "K0", "H0", "", "isPlay", "I0", "(Z)V", "Lcom/transsion/player/mediasession/MediaItem;", "y0", "()Lcom/transsion/player/mediasession/MediaItem;", "", "pageName", "Landroid/content/Intent;", "w0", "(Ljava/lang/String;)Landroid/content/Intent;", "Landroid/app/PendingIntent;", "z0", "()Landroid/app/PendingIntent;", "", "A0", "()I", "L0", "S0", "", "delay", "O0", "(J)V", "E0", NativeComponentConstants.KEY_COMPONENT_TYPE, "N0", "(I)V", "v0", "receiveArguments", "Landroid/view/LayoutInflater;", "inflater", "B0", "(Landroid/view/LayoutInflater;)Lgn/j;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isShowPageStateLayoutTitle", "()Z", "initViewData", "initViewModel", "initListener", "loadDefaultData", "onDestroy", "onResume", "onStop", "retryLoadData", "onDisconnected", "Lfo/e;", "mediaSource", "onPrepare", "(Lfo/e;)V", "onLoadingBegin", NotificationCompat.CATEGORY_PROGRESS, "onBufferedPosition", "(JLfo/e;)V", "onLoadingEnd", "onRenderFirstFrame", "onProgress", "onVideoStart", "onVideoPause", "onCompletion", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "Lcom/transsion/moviedetailapi/bean/Trailer;", "a", "Lcom/transsion/moviedetailapi/bean/Trailer;", "trailer", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "J", "duration", "c", "Z", "formUserSeek", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "playState", "e", "bufferPosition", "f", "currentPosition", "g", "Lcom/transsion/player/orplayer/PlayError;", "Landroid/view/View;", "h", "Landroid/view/View;", "errorLayout", "Lcom/transsion/player/orplayer/g;", "i", "Lcom/transsion/player/orplayer/g;", "orPlayer", "Landroid/os/Handler;", "j", "Lkotlin/Lazy;", "x0", "()Landroid/os/Handler;", "loadingHandler", "Ljava/lang/Runnable;", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/Runnable;", "showErrorRunnable", "", "l", "[Ljava/lang/String;", "loadingDot", "m", "loadingDotIndex", "n", "loadingRunnable", "Landroidx/activity/result/b;", "kotlin.jvm.PlatformType", "o", "Landroidx/activity/result/b;", "requestPermissionLauncher", TtmlNode.TAG_P, "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@Deprecated
@SourceDebugExtension
public final class MusicTrailerV2Fragment extends PageStatusFragment<C23602j> implements InterfaceC16633f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Trailer trailer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long duration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean formUserSeek;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int playState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long bufferPosition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long currentPosition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private PlayError errorInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private View errorLayout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private InterfaceC16634g orPlayer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int loadingDotIndex;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final AbstractC0249b requestPermissionLauncher;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy loadingHandler = LazyKt.m97097b(new Function0() { // from class: in.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicTrailerV2Fragment.m70610F0();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Runnable showErrorRunnable = new Runnable() { // from class: in.c
        @Override // java.lang.Runnable
        public final void run() {
            MusicTrailerV2Fragment.m70620P0(this.f73340a);
        }
    };

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String[] loadingDot = {".", "..", "..."};

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Runnable loadingRunnable = new Runnable() { // from class: in.d
        @Override // java.lang.Runnable
        public final void run() {
            MusicTrailerV2Fragment.m70611G0(this.f73341a);
        }
    };

    /* JADX INFO: renamed from: com.transsion.moviedetail.music.MusicTrailerV2Fragment$b */
    public static final class ViewOnClickListenerC16105b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        private long f54808a;

        ViewOnClickListenerC16105b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MusicTrailerV2Fragment.this.playState != 10) {
                MusicTrailerV2Fragment.this.m70615K0();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = this.f54808a;
            if (j11 == 0 || jCurrentTimeMillis - j11 > 500) {
                this.f54808a = jCurrentTimeMillis;
            } else {
                this.f54808a = 0L;
                MusicTrailerV2Fragment.this.m70612H0();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.music.MusicTrailerV2Fragment$c */
    public static final class C16106c implements InterfaceC13776s {

        /* JADX INFO: renamed from: a */
        private long f54810a;

        C16106c() {
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: a */
        public void mo62236a(SecondariesSeekBar seekBar) {
            Group group;
            Intrinsics.m97802h(seekBar, "seekBar");
            MusicTrailerV2Fragment.this.formUserSeek = false;
            C23602j mViewBinding = MusicTrailerV2Fragment.this.getMViewBinding();
            if (mViewBinding != null && (group = mViewBinding.f71971b) != null) {
                group.setVisibility(0);
            }
            InterfaceC16634g interfaceC16634g = MusicTrailerV2Fragment.this.orPlayer;
            if (interfaceC16634g != null) {
                interfaceC16634g.seekTo((this.f54810a * MusicTrailerV2Fragment.this.duration) / ((long) 100));
            }
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: b */
        public void mo62237b(SecondariesSeekBar seekBar, long j11, boolean z11) {
            Intrinsics.m97802h(seekBar, "seekBar");
            if (z11) {
                this.f54810a = j11;
            }
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: c */
        public void mo62238c(SecondariesSeekBar seekBar) {
            Intrinsics.m97802h(seekBar, "seekBar");
            MusicTrailerV2Fragment.this.formUserSeek = true;
        }
    }

    public MusicTrailerV2Fragment() {
        AbstractC0249b abstractC0249bRegisterForActivityResult = registerForActivityResult(new C23283i(), new InterfaceC0248a() { // from class: in.e
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                MusicTrailerV2Fragment.m70617M0((Boolean) obj);
            }
        });
        Intrinsics.m97801g(abstractC0249bRegisterForActivityResult, "registerForActivityResult(...)");
        this.requestPermissionLauncher = abstractC0249bRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: A0 */
    private final int m70606A0() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 67108864;
        }
        return ASTNode.NOJIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m70607C0(MusicTrailerV2Fragment musicTrailerV2Fragment, View view) {
        musicTrailerV2Fragment.m70615K0();
    }

    /* JADX INFO: renamed from: D0 */
    private final void m70608D0() {
        SecondariesSeekBar secondariesSeekBar;
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding == null || (secondariesSeekBar = mViewBinding.f71980k) == null) {
            return;
        }
        secondariesSeekBar.setOnSeekBarChangeListener(new C16106c());
    }

    /* JADX INFO: renamed from: E0 */
    private final void m70609E0() {
        m70638x0().postDelayed(this.loadingRunnable, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Handler m70610F0() {
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        return new Handler(looperMyLooper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m70611G0(MusicTrailerV2Fragment musicTrailerV2Fragment) {
        TextView textView;
        int i11 = musicTrailerV2Fragment.loadingDotIndex;
        if (i11 >= 2) {
            musicTrailerV2Fragment.loadingDotIndex = 0;
        } else {
            musicTrailerV2Fragment.loadingDotIndex = i11 + 1;
        }
        C23602j mViewBinding = musicTrailerV2Fragment.getMViewBinding();
        if (mViewBinding != null && (textView = mViewBinding.f71977h) != null) {
            textView.setText(Utils.m27275a().getString(R$string.play_loading) + musicTrailerV2Fragment.loadingDot[musicTrailerV2Fragment.loadingDotIndex]);
        }
        musicTrailerV2Fragment.m70609E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final void m70612H0() {
        this.playState = 20;
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.pause();
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final void m70613I0(boolean isPlay) {
        this.playState = 10;
        m70623S0(isPlay);
    }

    /* JADX INFO: renamed from: J0 */
    static /* synthetic */ void m70614J0(MusicTrailerV2Fragment musicTrailerV2Fragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        musicTrailerV2Fragment.m70613I0(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public final void m70615K0() {
        PreVideoAddress videoAddress;
        String url;
        int i11 = this.playState;
        if (i11 == -1) {
            m70616L0();
            return;
        }
        if (i11 != 0) {
            if (i11 == 10) {
                m70612H0();
                return;
            } else if (i11 == 20 || i11 == 22) {
                m70614J0(this, false, 1, null);
                return;
            } else if (i11 != 30) {
                return;
            }
        }
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            Trailer trailer = this.trailer;
            if (trailer != null && (videoAddress = trailer.getVideoAddress()) != null && (url = videoAddress.getUrl()) != null) {
                Trailer trailer2 = this.trailer;
                interfaceC16634g.setDataSource(new C23403e(trailer2 != null ? trailer2.getSubjectId() : null, url, 0, null, m70639y0(), 12, null));
            }
            interfaceC16634g.prepare();
        }
        m70613I0(false);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m70616L0() {
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> reloadVideo() --> video error，reload~~", false, 2, null);
        this.bufferPosition = 0L;
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.stop();
            interfaceC16634g.reset();
            interfaceC16634g.prepare();
        }
        InterfaceC16634g interfaceC16634g2 = this.orPlayer;
        if (interfaceC16634g2 != null) {
            interfaceC16634g2.seekTo(this.currentPosition);
        }
        m70624T0(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m70617M0(Boolean granted) {
        Intrinsics.m97802h(granted, "granted");
        if (granted.booleanValue()) {
            C26866a.a.m104899g(C26866a.f81698a, "User allow the permission.", false, 2, null);
        } else {
            C26866a.a.m104899g(C26866a.f81698a, "User deny the permission.", false, 2, null);
        }
    }

    /* JADX INFO: renamed from: N0 */
    private final void m70618N0(int type) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        Group group;
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        ViewStub viewStub;
        if (this.errorLayout == null) {
            C23602j mViewBinding = getMViewBinding();
            this.errorLayout = (mViewBinding == null || (viewStub = mViewBinding.f71982m) == null) ? null : viewStub.inflate();
        }
        if (type == 1) {
            Intrinsics.m97801g(Utils.m27275a().getString(R$string.downloading_play_timeout), "getString(...)");
            Intrinsics.m97801g(Utils.m27275a().getString(R$string.downloading_play_timeout_reload), "getString(...)");
            this.playState = -1;
        } else {
            Intrinsics.m97801g(Utils.m27275a().getString(R$string.downloading_play_load_failed), "getString(...)");
            Intrinsics.m97801g(Utils.m27275a().getString(R$string.turn_on_network), "getString(...)");
            this.playState = 22;
        }
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.pause();
        }
        C23602j mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (shapeableImageView2 = mViewBinding2.f71973d) != null) {
            AbstractC26006c.m102058k(shapeableImageView2);
        }
        C23602j mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (shapeableImageView = mViewBinding3.f71974e) != null) {
            AbstractC26006c.m102054g(shapeableImageView);
        }
        C23602j mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (group = mViewBinding4.f71971b) != null) {
            AbstractC26006c.m102054g(group);
        }
        View view = this.errorLayout;
        if (view != null) {
            AbstractC26006c.m102058k(view);
        }
        View view2 = this.errorLayout;
        if (view2 != null) {
            view2.setTag(Integer.valueOf(type));
        }
        C23602j mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (appCompatImageView2 = mViewBinding5.f71979j) != null) {
            appCompatImageView2.setImageResource(R$drawable.post_icon_play);
        }
        C23602j mViewBinding6 = getMViewBinding();
        if (mViewBinding6 == null || (appCompatImageView = mViewBinding6.f71979j) == null) {
            return;
        }
        appCompatImageView.setKeepScreenOn(false);
    }

    /* JADX INFO: renamed from: O0 */
    private final void m70619O0(long delay) {
        m70638x0().removeCallbacks(this.showErrorRunnable);
        m70638x0().postDelayed(this.showErrorRunnable, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m70620P0(MusicTrailerV2Fragment musicTrailerV2Fragment) {
        musicTrailerV2Fragment.m70618N0(0);
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m70621Q0() {
        ShapeableImageView shapeableImageView;
        String url;
        Cover cover;
        Cover cover2;
        String thumbnail;
        TextView textView;
        PreVideoAddress videoAddress;
        Integer duration;
        SecondariesSeekBar secondariesSeekBar;
        if (!isAdded() || getActivity() == null) {
            return;
        }
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (secondariesSeekBar = mViewBinding.f71980k) != null) {
            secondariesSeekBar.setMax(100L);
        }
        Trailer trailer = this.trailer;
        long jIntValue = (trailer == null || (videoAddress = trailer.getVideoAddress()) == null || (duration = videoAddress.getDuration()) == null) ? 0L : duration.intValue() * 1000;
        this.duration = jIntValue;
        if (jIntValue > 0) {
            String str = "00:00/" + AbstractC17443m.m74969d(jIntValue);
            C23602j mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (textView = mViewBinding2.f71981l) != null) {
                textView.setText(str);
            }
        }
        Trailer trailer2 = this.trailer;
        C14291e.m64747d(C14291e.f50565a, (trailer2 == null || (cover2 = trailer2.getCover()) == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail, 0, 0, new Function1() { // from class: in.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicTrailerV2Fragment.m70622R0(this.f73339a, (BitmapDrawable) obj);
            }
        }, 6, null);
        C23602j mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (shapeableImageView = mViewBinding3.f71974e) == null) {
            return;
        }
        shapeableImageView.setVisibility(0);
        RequestManager requestManagerWith = Glide.with(requireContext());
        C23860f.a aVar = C23860f.f72909a;
        Trailer trailer3 = this.trailer;
        if (trailer3 == null || (cover = trailer3.getCover()) == null || (url = cover.getUrl()) == null) {
            url = "";
        }
        requestManagerWith.load2(C23860f.a.m94447e(aVar, url, C14752e.m66409f(), false, false, 12, null)).into(shapeableImageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m70622R0(MusicTrailerV2Fragment musicTrailerV2Fragment, BitmapDrawable it) {
        ShapeableImageView shapeableImageView;
        Intrinsics.m97802h(it, "it");
        C23602j mViewBinding = musicTrailerV2Fragment.getMViewBinding();
        if (mViewBinding != null && (shapeableImageView = mViewBinding.f71973d) != null) {
            shapeableImageView.setImageDrawable(it);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: S0 */
    private final void m70623S0(boolean isPlay) {
        AppCompatImageView appCompatImageView;
        Group group;
        AppCompatImageView appCompatImageView2;
        Group group2;
        InterfaceC16634g interfaceC16634g;
        this.playState = 10;
        this.errorInfo = null;
        if (isPlay && (interfaceC16634g = this.orPlayer) != null) {
            interfaceC16634g.play();
        }
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (group2 = mViewBinding.f71971b) != null) {
            AbstractC26006c.m102058k(group2);
        }
        View view = this.errorLayout;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        C23602j mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView2 = mViewBinding2.f71975f) != null) {
            AbstractC26006c.m102054g(appCompatImageView2);
        }
        C23602j mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (group = mViewBinding3.f71972c) != null) {
            AbstractC26006c.m102058k(group);
        }
        C23602j mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (appCompatImageView = mViewBinding4.f71979j) != null) {
            appCompatImageView.setImageResource(R$drawable.post_icon_pause);
        }
        m70638x0().removeCallbacks(this.showErrorRunnable);
        m70621Q0();
    }

    /* JADX INFO: renamed from: T0 */
    static /* synthetic */ void m70624T0(MusicTrailerV2Fragment musicTrailerV2Fragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        musicTrailerV2Fragment.m70623S0(z11);
    }

    /* JADX INFO: renamed from: w0 */
    private final Intent m70637w0(String pageName) {
        InterfaceC27316b interfaceC27316b = (InterfaceC27316b) TheRouter.m61774d(InterfaceC27316b.class, new Object[0]);
        StringBuilder sb2 = new StringBuilder("oneroom://com.community.oneroom?type=");
        sb2.append("/movie/detail");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("id");
        sb2.append(UrlUtils.EQUAL_MARK);
        Trailer trailer = this.trailer;
        sb2.append(trailer != null ? trailer.getSubjectId() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("subject_type");
        sb2.append(UrlUtils.EQUAL_MARK);
        Trailer trailer2 = this.trailer;
        sb2.append(trailer2 != null ? Integer.valueOf(trailer2.getSubjectType()) : null);
        sb2.append("extra_page_from");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(pageName);
        if (interfaceC27316b == null) {
            return null;
        }
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        Intent intentMo94643a = interfaceC27316b.mo94643a(applicationM27275a);
        if (intentMo94643a == null) {
            return null;
        }
        intentMo94643a.addFlags(603979776);
        intentMo94643a.setData(Uri.parse(sb2.toString()));
        return intentMo94643a;
    }

    /* JADX INFO: renamed from: x0 */
    private final Handler m70638x0() {
        return (Handler) this.loadingHandler.getValue();
    }

    /* JADX INFO: renamed from: y0 */
    private final MediaItem m70639y0() {
        PreVideoAddress videoAddress;
        Cover cover;
        Trailer trailer = this.trailer;
        String url = null;
        String musicName = trailer != null ? trailer.getMusicName() : null;
        Trailer trailer2 = this.trailer;
        String url2 = (trailer2 == null || (cover = trailer2.getCover()) == null) ? null : cover.getUrl();
        Trailer trailer3 = this.trailer;
        if (trailer3 != null && (videoAddress = trailer3.getVideoAddress()) != null) {
            url = videoAddress.getUrl();
        }
        return new MediaItem(musicName, "", url2, null, null, null, m70640z0(), m70637w0("media_music_float_notification"), null, url, Boolean.TRUE, null, null, null, 14648, null);
    }

    /* JADX INFO: renamed from: z0 */
    private final PendingIntent m70640z0() {
        return PendingIntent.getActivity(Utils.m27275a(), 0, m70637w0("media_notification"), m70606A0());
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C23602j getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23602j c23602jM93382c = C23602j.m93382c(inflater);
        Intrinsics.m97801g(c23602jM93382c, "inflate(...)");
        return c23602jM93382c;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        InterfaceC16634g interfaceC16634g;
        m70608D0();
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: in.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicTrailerV2Fragment.m70607C0(this.f73342a, view);
                }
            };
            mViewBinding.f71975f.setOnClickListener(onClickListener);
            mViewBinding.f71979j.setOnClickListener(onClickListener);
            mViewBinding.f71978i.setOnClickListener(new ViewOnClickListenerC16105b());
            if (NetworkType.NETWORK_WIFI != C27287m.f83003a.m106329d() || (interfaceC16634g = this.orPlayer) == null || interfaceC16634g.isPlaying()) {
                return;
            }
            m70615K0();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        String subjectId;
        m70642v0();
        Trailer trailer = this.trailer;
        if (trailer == null || (subjectId = trailer.getSubjectId()) == null) {
            return;
        }
        C26053g0 c26053g0 = C26053g0.f79567a;
        InterfaceC16634g interfaceC16634gM102141f = c26053g0.m102141f(subjectId);
        if (interfaceC16634gM102141f == null) {
            interfaceC16634gM102141f = c26053g0.m102149s();
        } else if (interfaceC16634gM102141f.isPlaying()) {
            m70623S0(false);
        }
        interfaceC16634gM102141f.addPlayerListener(this);
        this.orPlayer = interfaceC16634gM102141f;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        super.loadDefaultData();
        m70621Q0();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long progress, C23403e mediaSource) {
        SecondariesSeekBar secondariesSeekBar;
        InterfaceC16633f.a.m72426d(this, progress, mediaSource);
        if (this.bufferPosition >= progress || this.duration <= 0) {
            return;
        }
        this.bufferPosition = progress;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, Integer.valueOf((int) ((progress * ((long) 100)) / this.duration)));
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding == null || (secondariesSeekBar = mViewBinding.f71980k) == null) {
            return;
        }
        secondariesSeekBar.setSecondariesProgress(linkedHashMap);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        InterfaceC16633f.a.m72427e(this, mediaSource);
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> onCompletion()", false, 2, null);
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            this.currentPosition = 0L;
            this.playState = 30;
            AppCompatImageView ivPlay = mViewBinding.f71975f;
            Intrinsics.m97801g(ivPlay, "ivPlay");
            AbstractC26006c.m102058k(ivPlay);
            mViewBinding.f71979j.setImageResource(R$drawable.post_icon_play);
            Group groupProgress = mViewBinding.f71972c;
            Intrinsics.m97801g(groupProgress, "groupProgress");
            AbstractC26006c.m102054g(groupProgress);
            ShapeableImageView ivMovieCover = mViewBinding.f71974e;
            Intrinsics.m97801g(ivMovieCover, "ivMovieCover");
            AbstractC26006c.m102058k(ivMovieCover);
            ShapeableImageView ivMovieBlurCover = mViewBinding.f71973d;
            Intrinsics.m97801g(ivMovieBlurCover, "ivMovieBlurCover");
            AbstractC26006c.m102058k(ivMovieBlurCover);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.removePlayerListener(this);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onDisconnected() {
        InterfaceC16634g interfaceC16634g;
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> onDisconnected()", false, 2, null);
        if (this.playState != 10 || (interfaceC16634g = this.orPlayer) == null || interfaceC16634g.isPlaying()) {
            return;
        }
        m70619O0(500L);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        InterfaceC16633f.a.m72430h(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e mediaSource) {
        Group group;
        InterfaceC16633f.a.m72431i(this, mediaSource);
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> onLoadingBegin()", false, 2, null);
        if (!C27287m.f83003a.m106330e()) {
            m70619O0(1000L);
            return;
        }
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (group = mViewBinding.f71971b) != null) {
            AbstractC26006c.m102058k(group);
        }
        m70638x0().post(this.loadingRunnable);
        View view = this.errorLayout;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e mediaSource) {
        Group group;
        InterfaceC16633f.a.m72433k(this, mediaSource);
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> onLoadingEnd()", false, 2, null);
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (group = mViewBinding.f71971b) != null) {
            AbstractC26006c.m102054g(group);
        }
        View view = this.errorLayout;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        m70638x0().removeCallbacks(this.loadingRunnable);
        m70638x0().removeCallbacks(this.showErrorRunnable);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
        InterfaceC16633f.a.m72437o(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e mediaSource) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        InterfaceC16633f.a.m72439q(this, errorInfo, mediaSource);
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> onPlayError() --> errorInfo.errorCode = " + errorInfo.getErrorCode(), false, 2, null);
        Integer errorCode = errorInfo.getErrorCode();
        if (errorCode != null && errorCode.intValue() == 537067524) {
            if (C27287m.f83003a.m106330e()) {
                m70618N0(1);
            } else {
                m70619O0(500L);
            }
        }
        this.errorInfo = errorInfo;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerRelease(C23403e c23403e) {
        InterfaceC16633f.a.m72442t(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerReset() {
        InterfaceC16633f.a.m72444v(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e mediaSource) {
        InterfaceC16633f.a.m72445w(this, mediaSource);
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.play();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long progress, C23403e mediaSource) {
        SecondariesSeekBar secondariesSeekBar;
        TextView textView;
        InterfaceC16634g interfaceC16634g;
        Group group;
        InterfaceC16633f.a.m72447y(this, progress, mediaSource);
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (group = mViewBinding.f71971b) != null) {
            group.setVisibility(8);
        }
        if (this.formUserSeek) {
            return;
        }
        this.currentPosition = progress;
        if (this.duration <= 0 && (interfaceC16634g = this.orPlayer) != null) {
            this.duration = interfaceC16634g.getDuration();
        }
        String str = AbstractC17443m.m74969d(progress) + "/" + AbstractC17443m.m74969d(this.duration);
        C23602j mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (textView = mViewBinding2.f71981l) != null) {
            textView.setText(str);
        }
        C23602j mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (secondariesSeekBar = mViewBinding3.f71980k) == null) {
            return;
        }
        secondariesSeekBar.setProgress((progress * ((long) 100)) / this.duration);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> onRenderFirstFrame()", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        super.onStop();
        Activity activityM27311b = AbstractC5775a.m27311b();
        C26866a.a.m104899g(C26866a.f81698a, "zxb_lob --> topActivity = " + activityM27311b, false, 2, null);
        if (activityM27311b != null) {
            String simpleName = activityM27311b.getClass().getSimpleName();
            Intrinsics.m97801g(simpleName, "getSimpleName(...)");
            if (StringsKt.m98132c0(simpleName, "LocalVideoDetailActivity", false, 2, null)) {
                this.playState = 0;
                C23602j mViewBinding = getMViewBinding();
                if (mViewBinding != null && (appCompatImageView2 = mViewBinding.f71979j) != null) {
                    appCompatImageView2.setImageResource(R$drawable.post_icon_play);
                }
                C23602j mViewBinding2 = getMViewBinding();
                if (mViewBinding2 == null || (appCompatImageView = mViewBinding2.f71979j) == null) {
                    return;
                }
                appCompatImageView.setKeepScreenOn(false);
            }
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksAudioBitrateChange(int i11) {
        InterfaceC16633f.a.m72414C(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksChange(C26906c c26906c) {
        InterfaceC16633f.a.m72415D(this, c26906c);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksVideoBitrateChange(int i11) {
        InterfaceC16633f.a.m72416E(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e mediaSource) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        InterfaceC16633f.a.m72417F(this, mediaSource);
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> onVideoPause()", false, 2, null);
        this.playState = 20;
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView2 = mViewBinding.f71979j) != null) {
            appCompatImageView2.setImageResource(R$drawable.post_icon_play);
        }
        C23602j mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (appCompatImageView = mViewBinding2.f71979j) == null) {
            return;
        }
        appCompatImageView.setKeepScreenOn(false);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        InterfaceC16633f.a.m72420I(this, mediaSource);
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> onVideoStart()", false, 2, null);
        C23602j mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            Group groupLoading = mViewBinding.f71971b;
            Intrinsics.m97801g(groupLoading, "groupLoading");
            AbstractC26006c.m102054g(groupLoading);
            mViewBinding.f71979j.setImageResource(R$drawable.post_icon_pause);
            mViewBinding.f71979j.setKeepScreenOn(true);
            m70623S0(false);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        Bundle arguments = getArguments();
        Trailer trailer = (Trailer) (arguments != null ? arguments.getSerializable("trailer") : null);
        this.trailer = trailer;
        C16625i.f55907a.m72389a("MusicTrailerV2Fragment --> receiveArguments() --> trailer = " + trailer);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        int i11;
        C26866a.a.m104899g(C26866a.f81698a, "MusicTrailerV2Fragment --> retryLoadData()", false, 2, null);
        m70621Q0();
        View view = this.errorLayout;
        if (view == null || view.getVisibility() != 0 || (i11 = this.playState) == 20 || i11 == 21) {
            return;
        }
        m70624T0(this, false, 1, null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m70642v0() {
    }
}
