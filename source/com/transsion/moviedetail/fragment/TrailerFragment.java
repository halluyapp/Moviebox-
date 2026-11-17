package com.transsion.moviedetail.fragment;

import android.graphics.drawable.BitmapDrawable;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.util.networkinfo.NetworkType;
import com.p282tn.lib.view.InterfaceC13776s;
import com.p282tn.lib.view.SecondariesSeekBar;
import com.therouter.TheRouter;
import com.transsion.base.image.blurhash.C14291e;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.core.utils.C14752e;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PreVideoAddress;
import com.transsion.moviedetailapi.bean.Trailer;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.postdetail.R$drawable;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.util.AbstractC17443m;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import gn.C23613u;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import no.C26053g0;
import p415fq.InterfaceC23410a;
import p438go.C23622d;
import p462hj.C23860f;
import p683po.C26906c;
import p683po.C26907d;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u0083\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001IB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0006J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010\u0006J\u0019\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b0\u0010/J\u0019\u00101\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b1\u0010/J\u0019\u00102\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b2\u0010/J!\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b6\u0010/J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010\u0006J!\u00108\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b8\u00105J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u0010\u0006J!\u0010>\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u0010\u0006J\u001f\u0010E\u001a\u00020\u00072\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0007H\u0016¢\u0006\u0004\bG\u0010\u0006R\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010QR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082D¢\u0006\u0006\n\u0004\b[\u0010\\R\u001d\u0010c\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010`\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010`\u001a\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010MR\u0016\u0010q\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010MR\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020Z0r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010TR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010z¨\u0006\u0084\u0001"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/TrailerFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lgn/u;", "Lcom/transsion/player/orplayer/f;", "Lrh/n;", "<init>", "()V", "", "z0", "x0", "y0", "r0", "Lcom/transsion/moviedetailapi/bean/Trailer;", "trailer", "B0", "(Lcom/transsion/moviedetailapi/bean/Trailer;)V", "Lcom/transsion/moviedetailapi/bean/Cover;", "cover", "D0", "(Lcom/transsion/moviedetailapi/bean/Cover;)V", "t0", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "F0", "(I)V", "A0", "", "delay", "G0", "(J)V", "I0", "n0", "C0", "Landroid/view/LayoutInflater;", "inflater", "q0", "(Landroid/view/LayoutInflater;)Lgn/u;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "Lfo/e;", "mediaSource", "onCompletion", "(Lfo/e;)V", "onVideoStart", "onVideoPause", "onLoadingBegin", NotificationCompat.CATEGORY_PROGRESS, "onBufferedPosition", "(JLfo/e;)V", "onLoadingEnd", "onRenderFirstFrame", "onProgress", "onPause", "onResume", "onDestroy", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onDisconnected", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", TmcConstants.NAVIGATION_ON_START, "Lcom/transsion/moviedetailapi/bean/PreVideoAddress;", "a", "Lcom/transsion/moviedetailapi/bean/PreVideoAddress;", "videoAddress", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "J", "duration", "", "c", "Z", "formUserSeek", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "playState", "e", "isShowFirstFrame", "f", "Lcom/transsion/moviedetailapi/bean/Trailer;", "", "g", "Ljava/lang/String;", "TAG", "Lfq/a;", "h", "Lkotlin/Lazy;", "getMAudioApi", "()Lfq/a;", "mAudioApi", "Landroid/os/Handler;", "i", "o0", "()Landroid/os/Handler;", "loadingHandler", "Lcom/transsion/player/orplayer/g;", "j", "p0", "()Lcom/transsion/player/orplayer/g;", "mOrPlayer", CampaignEx.JSON_KEY_AD_K, "bufferPosition", "l", "currentPosition", "", "m", "[Ljava/lang/String;", "loadingDot", "n", "loadingDotIndex", "Ljava/lang/Runnable;", "o", "Ljava/lang/Runnable;", "loadingRunnable", TtmlNode.TAG_P, "Lcom/transsion/player/orplayer/PlayError;", CampaignEx.JSON_KEY_AD_Q, "Landroid/view/View;", "errorLayout", CampaignEx.JSON_KEY_AD_R, "showErrorRunnable", "s", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class TrailerFragment extends BaseFragment<C23613u> implements InterfaceC16633f, InterfaceC27288n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private PreVideoAddress videoAddress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long duration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean formUserSeek;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int playState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isShowFirstFrame;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Trailer trailer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long bufferPosition;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long currentPosition;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int loadingDotIndex;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private PlayError errorInfo;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private View errorLayout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String TAG = "TrailerFragment";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy mAudioApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.u2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrailerFragment.mAudioApi_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy loadingHandler = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.v2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrailerFragment.m70588u0();
        }
    });

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy mOrPlayer = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.fragment.w2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrailerFragment.m70590w0(this.f54779a);
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String[] loadingDot = {".", "..", "..."};

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Runnable loadingRunnable = new Runnable() { // from class: com.transsion.moviedetail.fragment.x2
        @Override // java.lang.Runnable
        public final void run() {
            TrailerFragment.m70589v0(this.f54783a);
        }
    };

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Runnable showErrorRunnable = new Runnable() { // from class: com.transsion.moviedetail.fragment.y2
        @Override // java.lang.Runnable
        public final void run() {
            TrailerFragment.m70567H0(this.f54787a);
        }
    };

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.TrailerFragment$b */
    public static final class C15994b implements InterfaceC13776s {

        /* JADX INFO: renamed from: a */
        private long f54672a;

        C15994b() {
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: a */
        public void mo62236a(SecondariesSeekBar seekBar) {
            Intrinsics.m97802h(seekBar, "seekBar");
            TrailerFragment.this.formUserSeek = false;
            TrailerFragment.this.m70584p0().seekTo((this.f54672a * TrailerFragment.this.duration) / ((long) 100));
            if (TrailerFragment.this.m70584p0().isPlaying()) {
                return;
            }
            TrailerFragment.this.m70584p0().play();
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: b */
        public void mo62237b(SecondariesSeekBar seekBar, long j11, boolean z11) {
            Intrinsics.m97802h(seekBar, "seekBar");
            if (z11) {
                this.f54672a = j11;
            }
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: c */
        public void mo62238c(SecondariesSeekBar seekBar) {
            Intrinsics.m97802h(seekBar, "seekBar");
            TrailerFragment.this.formUserSeek = true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.TrailerFragment$c */
    public static final class ViewOnClickListenerC15995c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        private long f54674a;

        ViewOnClickListenerC15995c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TrailerFragment.this.playState != 10) {
                TrailerFragment.this.m70593z0();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = this.f54674a;
            if (j11 == 0 || jCurrentTimeMillis - j11 > 500) {
                this.f54674a = jCurrentTimeMillis;
            } else {
                this.f54674a = 0L;
                TrailerFragment.this.m70591x0();
            }
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final void m70560A0() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "video error，reload~~", false, 4, null);
        this.bufferPosition = 0L;
        m70584p0().stop();
        m70584p0().reset();
        m70584p0().prepare();
        m70584p0().seekTo(this.currentPosition);
        m70568I0();
    }

    /* JADX INFO: renamed from: B0 */
    private final void m70561B0(Trailer trailer) {
        String url;
        TextView textView;
        Integer duration;
        SecondariesSeekBar secondariesSeekBar;
        m70563D0(trailer.getCover());
        this.videoAddress = trailer.getVideoAddress();
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (secondariesSeekBar = mViewBinding.f72095l) != null) {
            secondariesSeekBar.setMax(100L);
        }
        PreVideoAddress preVideoAddress = this.videoAddress;
        long jIntValue = (preVideoAddress == null || (duration = preVideoAddress.getDuration()) == null) ? 0L : duration.intValue() * 1000;
        this.duration = jIntValue;
        if (jIntValue > 0) {
            String str = "00:00/" + AbstractC17443m.m74969d(jIntValue);
            C23613u mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (textView = mViewBinding2.f72096m) != null) {
                textView.setText(str);
            }
        }
        PreVideoAddress preVideoAddress2 = this.videoAddress;
        if (preVideoAddress2 == null || (url = preVideoAddress2.getUrl()) == null) {
            return;
        }
        m70584p0().setDataSource(new C23403e(url, url, 0, null, null, 28, null));
    }

    /* JADX INFO: renamed from: C0 */
    private final void m70562C0() {
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (shapeableImageView2 = mViewBinding.f72088e) != null) {
            AbstractC26006c.m102058k(shapeableImageView2);
        }
        C23613u mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (shapeableImageView = mViewBinding2.f72087d) == null) {
            return;
        }
        AbstractC26006c.m102058k(shapeableImageView);
    }

    /* JADX INFO: renamed from: D0 */
    private final void m70563D0(Cover cover) {
        final C23613u mViewBinding;
        if (cover == null || (mViewBinding = getMViewBinding()) == null) {
            return;
        }
        int iM66409f = C14752e.m66409f();
        C23860f.a aVar = C23860f.f72909a;
        String url = cover.getUrl();
        if (url == null) {
            url = "";
        }
        String strM94447e = C23860f.a.m94447e(aVar, url, iM66409f, false, false, 12, null);
        String thumbnail = cover.getThumbnail();
        C14291e.m64747d(C14291e.f50565a, thumbnail == null ? "" : thumbnail, 0, 0, new Function1() { // from class: com.transsion.moviedetail.fragment.a3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrailerFragment.m70564E0(mViewBinding, (BitmapDrawable) obj);
            }
        }, 6, null);
        Glide.with(requireContext()).load2(strM94447e).into(mViewBinding.f72088e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final Unit m70564E0(C23613u c23613u, BitmapDrawable it) {
        Intrinsics.m97802h(it, "it");
        c23613u.f72087d.setImageDrawable(it);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: F0 */
    private final void m70565F0(int type) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        Group group;
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        ViewStub viewStub;
        if (this.errorLayout == null) {
            C23613u mViewBinding = getMViewBinding();
            this.errorLayout = (mViewBinding == null || (viewStub = mViewBinding.f72097n) == null) ? null : viewStub.inflate();
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
        m70584p0().pause();
        C23613u mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (shapeableImageView2 = mViewBinding2.f72087d) != null) {
            AbstractC26006c.m102058k(shapeableImageView2);
        }
        C23613u mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (shapeableImageView = mViewBinding3.f72088e) != null) {
            AbstractC26006c.m102054g(shapeableImageView);
        }
        C23613u mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (group = mViewBinding4.f72085b) != null) {
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
        C23613u mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (appCompatImageView2 = mViewBinding5.f72094k) != null) {
            appCompatImageView2.setImageResource(R$drawable.post_icon_play);
        }
        C23613u mViewBinding6 = getMViewBinding();
        if (mViewBinding6 == null || (appCompatImageView = mViewBinding6.f72094k) == null) {
            return;
        }
        appCompatImageView.setKeepScreenOn(false);
    }

    /* JADX INFO: renamed from: G0 */
    private final void m70566G0(long delay) {
        m70583o0().removeCallbacks(this.showErrorRunnable);
        m70583o0().postDelayed(this.showErrorRunnable, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m70567H0(TrailerFragment trailerFragment) {
        trailerFragment.m70565F0(0);
    }

    /* JADX INFO: renamed from: I0 */
    private final void m70568I0() {
        AppCompatImageView appCompatImageView;
        Group group;
        AppCompatImageView appCompatImageView2;
        InterfaceC23410a mAudioApi = getMAudioApi();
        if (mAudioApi != null) {
            mAudioApi.pause();
        }
        this.playState = 10;
        this.errorInfo = null;
        m70584p0().play();
        View view = this.errorLayout;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView2 = mViewBinding.f72089f) != null) {
            AbstractC26006c.m102054g(appCompatImageView2);
        }
        C23613u mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (group = mViewBinding2.f72086c) != null) {
            AbstractC26006c.m102058k(group);
        }
        C23613u mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (appCompatImageView = mViewBinding3.f72094k) != null) {
            appCompatImageView.setImageResource(R$drawable.post_icon_pause);
        }
        m70583o0().removeCallbacks(this.showErrorRunnable);
        Trailer trailer = this.trailer;
        if (trailer == null || trailer.getSubjectType() != SubjectType.MUSIC.getValue()) {
            m70582n0();
        } else {
            m70562C0();
        }
    }

    private final InterfaceC23410a getMAudioApi() {
        return (InterfaceC23410a) this.mAudioApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23410a mAudioApi_delegate$lambda$0() {
        return (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m70582n0() {
        ShapeableImageView shapeableImageView;
        ShapeableImageView shapeableImageView2;
        if (this.isShowFirstFrame) {
            Trailer trailer = this.trailer;
            if (trailer == null || trailer.getSubjectType() != SubjectType.MUSIC.getValue()) {
                C23613u mViewBinding = getMViewBinding();
                if (mViewBinding != null && (shapeableImageView2 = mViewBinding.f72088e) != null) {
                    AbstractC26006c.m102054g(shapeableImageView2);
                }
                C23613u mViewBinding2 = getMViewBinding();
                if (mViewBinding2 == null || (shapeableImageView = mViewBinding2.f72087d) == null) {
                    return;
                }
                AbstractC26006c.m102054g(shapeableImageView);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final Handler m70583o0() {
        return (Handler) this.loadingHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public final InterfaceC16634g m70584p0() {
        return (InterfaceC16634g) this.mOrPlayer.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    private final void m70585r0() {
        SecondariesSeekBar secondariesSeekBar;
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding == null || (secondariesSeekBar = mViewBinding.f72095l) == null) {
            return;
        }
        secondariesSeekBar.setOnSeekBarChangeListener(new C15994b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m70586s0(TrailerFragment trailerFragment, View view) {
        trailerFragment.m70593z0();
    }

    /* JADX INFO: renamed from: t0 */
    private final void m70587t0() {
        m70583o0().postDelayed(this.loadingRunnable, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Handler m70588u0() {
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.m97799e(looperMyLooper);
        return new Handler(looperMyLooper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m70589v0(TrailerFragment trailerFragment) {
        TextView textView;
        int i11 = trailerFragment.loadingDotIndex;
        if (i11 >= 2) {
            trailerFragment.loadingDotIndex = 0;
        } else {
            trailerFragment.loadingDotIndex = i11 + 1;
        }
        C23613u mViewBinding = trailerFragment.getMViewBinding();
        if (mViewBinding != null && (textView = mViewBinding.f72092i) != null) {
            textView.setText(Utils.m27275a().getString(R$string.play_loading) + trailerFragment.loadingDot[trailerFragment.loadingDotIndex]);
        }
        trailerFragment.m70587t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final InterfaceC16634g m70590w0(TrailerFragment trailerFragment) {
        InterfaceC16634g interfaceC16634gM102149s = C26053g0.f79567a.m102149s();
        interfaceC16634gM102149s.setPlayerConfig(new C23622d(null, false, 0, 0, 0, 0, 0, 0, 0L, 0, 0, false, false, false, false, false, null, 126975, null));
        C23613u mViewBinding = trailerFragment.getMViewBinding();
        interfaceC16634gM102149s.setTextureView(mViewBinding != null ? mViewBinding.f72091h : null);
        interfaceC16634gM102149s.setLooping(false);
        interfaceC16634gM102149s.setPlayerListener(trailerFragment);
        return interfaceC16634gM102149s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public final void m70591x0() {
        this.playState = 20;
        m70584p0().pause();
    }

    /* JADX INFO: renamed from: y0 */
    private final void m70592y0() {
        this.playState = 10;
        m70568I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public final void m70593z0() {
        C23613u mViewBinding;
        Group group;
        C23613u mViewBinding2;
        Group group2;
        int i11 = this.playState;
        if (i11 == -1) {
            m70560A0();
            return;
        }
        if (i11 == 0) {
            m70584p0().prepare();
            m70584p0().seekTo(0L);
            m70592y0();
            if (this.playState != 10 || (mViewBinding = getMViewBinding()) == null || (group = mViewBinding.f72085b) == null) {
                return;
            }
            AbstractC26006c.m102058k(group);
            return;
        }
        if (i11 == 10) {
            m70591x0();
            return;
        }
        if (i11 == 20 || i11 == 22) {
            m70592y0();
            return;
        }
        if (i11 != 30) {
            return;
        }
        m70584p0().seekTo(0L);
        m70592y0();
        if (this.playState != 10 || (mViewBinding2 = getMViewBinding()) == null || (group2 = mViewBinding2.f72085b) == null) {
            return;
        }
        AbstractC26006c.m102058k(group2);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.z2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TrailerFragment.m70586s0(this.f54791a, view2);
                }
            };
            mViewBinding.f72089f.setOnClickListener(onClickListener);
            mViewBinding.f72094k.setOnClickListener(onClickListener);
            mViewBinding.f72093j.setOnClickListener(new ViewOnClickListenerC15995c());
        }
        m70585r0();
        C27287m.f83003a.m106336l(this);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        Bundle arguments = getArguments();
        Trailer trailer = null;
        Trailer trailer2 = (Trailer) (arguments != null ? arguments.getSerializable("trailer") : null);
        if (trailer2 != null) {
            m70561B0(trailer2);
            if (NetworkType.NETWORK_WIFI == C27287m.f83003a.m106329d() && trailer2.getSubjectType() < SubjectType.AUDIO.getValue()) {
                m70593z0();
            }
            trailer = trailer2;
        }
        this.trailer = trailer;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long progress, C23403e mediaSource) {
        SecondariesSeekBar secondariesSeekBar;
        InterfaceC16633f.a.m72426d(this, progress, mediaSource);
        if (this.bufferPosition < progress) {
            this.bufferPosition = progress;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(0, Integer.valueOf((int) ((progress * ((long) 100)) / this.duration)));
            C23613u mViewBinding = getMViewBinding();
            if (mViewBinding == null || (secondariesSeekBar = mViewBinding.f72095l) == null) {
                return;
            }
            secondariesSeekBar.setSecondariesProgress(linkedHashMap);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        InterfaceC16633f.a.m72427e(this, mediaSource);
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            this.currentPosition = 0L;
            this.playState = 30;
            AppCompatImageView ivPlay = mViewBinding.f72089f;
            Intrinsics.m97801g(ivPlay, "ivPlay");
            AbstractC26006c.m102058k(ivPlay);
            mViewBinding.f72094k.setImageResource(R$drawable.post_icon_play);
            Group groupProgress = mViewBinding.f72086c;
            Intrinsics.m97801g(groupProgress, "groupProgress");
            AbstractC26006c.m102054g(groupProgress);
            ShapeableImageView ivMovieCover = mViewBinding.f72088e;
            Intrinsics.m97801g(ivMovieCover, "ivMovieCover");
            AbstractC26006c.m102058k(ivMovieCover);
            ShapeableImageView ivMovieBlurCover = mViewBinding.f72087d;
            Intrinsics.m97801g(ivMovieBlurCover, "ivMovieBlurCover");
            AbstractC26006c.m102058k(ivMovieBlurCover);
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onCompletion", false, 4, null);
        }
    }

    @Override // p743rh.InterfaceC27288n
    public void onConnected() {
        InterfaceC27288n.a.m106338a(this);
    }

    @Override // p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        int i11;
        Integer errorCode;
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onConnected~~", false, 4, null);
        View view = this.errorLayout;
        if (view == null || view.getVisibility() != 0 || (i11 = this.playState) == 20 || i11 == 21) {
            return;
        }
        View view2 = this.errorLayout;
        if (!(view2 != null ? Intrinsics.m97797c(view2.getTag(), 1) : false)) {
            PlayError playError = this.errorInfo;
            if (!((playError == null || (errorCode = playError.getErrorCode()) == null || errorCode.intValue() != 537067524) ? false : true)) {
                m70568I0();
                return;
            }
        }
        m70560A0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m70583o0().removeCallbacks(this.loadingRunnable);
        C27287m.f83003a.m106337m(this);
    }

    @Override // p743rh.InterfaceC27288n
    public void onDisconnected() {
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onDisconnected~~", false, 4, null);
        if (this.playState != 10 || m70584p0().isPlaying()) {
            return;
        }
        m70566G0(500L);
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
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onLoadingBegin", false, 4, null);
        if (!C27287m.f83003a.m106330e()) {
            m70566G0(1000L);
            return;
        }
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (group = mViewBinding.f72085b) != null) {
            AbstractC26006c.m102058k(group);
        }
        m70583o0().post(this.loadingRunnable);
        View view = this.errorLayout;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e mediaSource) {
        Group group;
        InterfaceC16633f.a.m72433k(this, mediaSource);
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (group = mViewBinding.f72085b) != null) {
            AbstractC26006c.m102054g(group);
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onLoadingEnd", false, 4, null);
        View view = this.errorLayout;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        m70583o0().removeCallbacks(this.loadingRunnable);
        m70583o0().removeCallbacks(this.showErrorRunnable);
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

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            m70584p0().release();
        } else if (this.playState == 10) {
            this.playState = 21;
            m70584p0().pause();
        }
        InterfaceC23410a mAudioApi = getMAudioApi();
        if (mAudioApi != null) {
            mAudioApi.start();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e mediaSource) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        InterfaceC16633f.a.m72439q(this, errorInfo, mediaSource);
        Integer errorCode = errorInfo.getErrorCode();
        if (errorCode != null && errorCode.intValue() == 537067524) {
            if (C27287m.f83003a.m106330e()) {
                m70565F0(1);
            } else {
                m70566G0(500L);
            }
        }
        this.errorInfo = errorInfo;
        C26866a.f81698a.m104915i("i_media", this.TAG + " --> IPlayerListener --> onPlayError()  errorCode:" + errorInfo.getErrorCode() + " errorMessage:" + errorInfo.getErrorMessage() + " url:" + (mediaSource != null ? mediaSource.m92935k() : null) + " --> 预告片播放失败了", true);
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
    public void onPrepare(C23403e c23403e) {
        InterfaceC16633f.a.m72445w(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long progress, C23403e mediaSource) {
        SecondariesSeekBar secondariesSeekBar;
        TextView textView;
        InterfaceC16633f.a.m72447y(this, progress, mediaSource);
        if (this.formUserSeek) {
            return;
        }
        this.currentPosition = progress;
        if (this.duration <= 0) {
            this.duration = m70584p0().getDuration();
        }
        String str = AbstractC17443m.m74969d(progress) + "/" + AbstractC17443m.m74969d(this.duration);
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (textView = mViewBinding.f72096m) != null) {
            textView.setText(str);
        }
        C23613u mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (secondariesSeekBar = mViewBinding2.f72095l) == null) {
            return;
        }
        secondariesSeekBar.setProgress((progress * ((long) 100)) / this.duration);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
        this.isShowFirstFrame = true;
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onRenderFirstFrame", false, 4, null);
        m70582n0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PreVideoAddress preVideoAddress = this.videoAddress;
        if ((preVideoAddress != null ? preVideoAddress.getUrl() : null) != null) {
            if (m70584p0().requestForce()) {
                m70584p0().prepare();
                m70584p0().seekTo(this.currentPosition);
            }
            if (this.playState == 21) {
                this.playState = 10;
                m70584p0().play();
                InterfaceC23410a mAudioApi = getMAudioApi();
                if (mAudioApi != null) {
                    mAudioApi.pause();
                }
            }
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onStart~~", false, 4, null);
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
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView2 = mViewBinding.f72094k) != null) {
            appCompatImageView2.setImageResource(R$drawable.post_icon_play);
        }
        C23613u mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f72094k) != null) {
            appCompatImageView.setKeepScreenOn(false);
        }
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onVideoPause", false, 4, null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        InterfaceC16633f.a.m72420I(this, mediaSource);
        C23613u mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            Group groupLoading = mViewBinding.f72085b;
            Intrinsics.m97801g(groupLoading, "groupLoading");
            AbstractC26006c.m102054g(groupLoading);
            mViewBinding.f72094k.setImageResource(R$drawable.post_icon_pause);
            mViewBinding.f72094k.setKeepScreenOn(true);
            m70582n0();
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "onVideoStart", false, 4, null);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C23613u getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23613u c23613uM93426c = C23613u.m93426c(inflater);
        Intrinsics.m97801g(c23613uM93426c, "inflate(...)");
        return c23613uM93426c;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }
}
