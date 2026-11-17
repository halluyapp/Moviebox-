package com.transsion.player.p303ui.longvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.cloud.config.utils.XLogUtil;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.ScaleMode;
import com.transsion.player.p303ui.ORPlayerView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import io.C24066e;
import io.InterfaceC24080n;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import no.C26053g0;
import no.InterfaceC26075z;
import p438go.C23619a;
import p438go.C23622d;
import p683po.C26905b;
import p683po.C26906c;
import p683po.C26907d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0012H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010,J\u0019\u00100\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0012H\u0016¢\u0006\u0004\b6\u0010)J\u0017\u00107\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020*H\u0016¢\u0006\u0004\b7\u0010,J\u0017\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0012H\u0016¢\u0006\u0004\b<\u0010)J\u000f\u0010=\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u0010)J\u000f\u0010>\u001a\u00020\u0012H\u0016¢\u0006\u0004\b>\u0010)J\u000f\u0010?\u001a\u00020\u0012H\u0016¢\u0006\u0004\b?\u0010)J\u000f\u0010@\u001a\u00020\u0012H\u0016¢\u0006\u0004\b@\u0010)J\u0019\u0010@\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\b@\u0010CJ\u000f\u0010D\u001a\u00020\u0012H\u0016¢\u0006\u0004\bD\u0010)J\u0017\u0010G\u001a\u00020\u00122\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020EH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\rH\u0016¢\u0006\u0004\bK\u0010\u000fJ\u000f\u0010L\u001a\u00020\rH\u0016¢\u0006\u0004\bL\u0010\u000fJ\u0017\u0010N\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\rH\u0016¢\u0006\u0004\bN\u0010'J\u000f\u0010O\u001a\u00020\rH\u0016¢\u0006\u0004\bO\u0010\u000fJ\u0017\u0010R\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u0011\u0010T\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\rH\u0016¢\u0006\u0004\bW\u0010'J\u0017\u0010X\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\bX\u0010'J\u001b\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0YH\u0016¢\u0006\u0004\bZ\u0010[J\u0011\u0010]\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\rH\u0016¢\u0006\u0004\b_\u0010\u000fJ\u0011\u0010a\u001a\u0004\u0018\u00010`H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020EH\u0016¢\u0006\u0004\bc\u0010JJ\u0011\u0010e\u001a\u0004\u0018\u00010dH\u0016¢\u0006\u0004\be\u0010fJ\u001f\u0010j\u001a\u00020\u00122\u0006\u0010h\u001a\u00020g2\u0006\u0010i\u001a\u00020\nH\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00122\u0006\u0010l\u001a\u00020PH\u0016¢\u0006\u0004\bm\u0010SJ\u0017\u0010p\u001a\u00020\u00122\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ\u001f\u0010t\u001a\u00020\u00122\u0006\u0010r\u001a\u00020\r2\u0006\u0010s\u001a\u00020\nH\u0016¢\u0006\u0004\bt\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010{R\u0016\u0010~\u001a\u00020|8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010}R\u0019\u0010\u0082\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0083\u0001"}, m97100d2 = {"Lcom/transsion/player/ui/longvideo/ORLongVodPlayerView;", "Landroid/widget/FrameLayout;", "Lcom/transsion/player/ui/longvideo/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()Z", "Landroid/view/View;", "gestureView", "", "c", "(Landroid/view/View;)V", "Lgo/a;", XLogUtil.TAG, "Lcom/transsion/player/ui/ORPlayerView;", "playerView", "initLongVodPlayer", "(Lgo/a;Lcom/transsion/player/ui/ORPlayerView;)V", "Lcom/transsion/player/orplayer/g;", "orPlayer", "setExistPlayer", "(Lgo/a;Lcom/transsion/player/orplayer/g;Lcom/transsion/player/ui/ORPlayerView;)V", "getOrPlayer", "()Lcom/transsion/player/orplayer/g;", "Lcom/transsion/player/ui/longvideo/a$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setGestureListener", "(Lcom/transsion/player/ui/longvideo/a$b;)V", OfflineConstantsKt.OFFLINE_CONFIG_ENABLE, "enableGesture", "(Z)V", "onAttachedToWindow", "()V", "Lcom/transsion/player/orplayer/f;", "addPlayerListener", "(Lcom/transsion/player/orplayer/f;)V", "removePlayerListener", "Landroid/view/SurfaceView;", "surfaceView", "setSurfaceView", "(Landroid/view/SurfaceView;)V", "Landroid/view/TextureView;", "textureView", "setTextureView", "(Landroid/view/TextureView;)V", "clearSurfaceOnly", "setPlayerListener", "Lfo/e;", "mediaSource", "setDataSource", "(Lfo/e;)V", "prepare", MediaItem.MUSIC_FLOAT_STATE_PLAY, "pause", "stop", "release", "", "id", "(Ljava/lang/String;)V", "reset", "", "mills", "seekTo", "(J)V", "getDuration", "()J", "isPlaying", "isComplete", "isLoop", "setLooping", "isMute", "", "volume", "setVolume", "(F)V", "getVolume", "()Ljava/lang/Float;", "isAutoPlay", "setAutoPlay", "enableHardwareDecoder", "Lkotlin/Pair;", "getBitrate", "()Lkotlin/Pair;", "", "getDownloadBitrate", "()Ljava/lang/Object;", "requestForce", "Lpo/c;", "getCurrentTracks", "()Lpo/c;", "getCurrentPosition", "Lpo/b;", "getCurrentVideoFormat", "()Lpo/b;", "Lpo/d;", "mediaTrackGroup", "index", "changeTrackSelection", "(Lpo/d;I)V", "speed", "setSpeed", "Lcom/transsion/player/enum/ScaleMode;", "scaleMode", "setScaleMode", "(Lcom/transsion/player/enum/ScaleMode;)V", "isVipSubscriber", "vipResolution", "setVipResolution", "(ZI)V", "a", "Lcom/transsion/player/ui/longvideo/a$b;", "gestureListener", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/player/orplayer/g;", "Lgo/a;", "Lio/e;", "Lio/e;", "gestureControl", "Lio/n;", "e", "Lio/n;", "volumeControl", "PlayerView_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ORLongVodPlayerView extends FrameLayout implements InterfaceC16676a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC16676a.b gestureListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private InterfaceC16634g orPlayer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C23619a config;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C24066e gestureControl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private InterfaceC24080n volumeControl;

    /* JADX INFO: renamed from: com.transsion.player.ui.longvideo.ORLongVodPlayerView$a */
    public static final class C16675a implements C24066e.a {

        /* JADX INFO: renamed from: a */
        private boolean f56068a;

        /* JADX INFO: renamed from: b */
        private boolean f56069b;

        /* JADX INFO: renamed from: c */
        private int f56070c;

        /* JADX INFO: renamed from: d */
        private float f56071d;

        C16675a() {
        }

        @Override // io.C24066e.a
        /* JADX INFO: renamed from: a */
        public void mo72605a() {
            InterfaceC16676a.b bVar = ORLongVodPlayerView.this.gestureListener;
            if (bVar != null) {
                bVar.mo72133a();
            }
        }

        @Override // io.C24066e.a
        /* JADX INFO: renamed from: b */
        public void mo72606b(float f11, float f12) {
            InterfaceC16676a.b bVar = ORLongVodPlayerView.this.gestureListener;
            if (bVar != null) {
                bVar.mo72134b(f11, f12);
            }
        }

        @Override // io.C24066e.a
        /* JADX INFO: renamed from: c */
        public void mo72607c(float f11, float f12) {
            InterfaceC24080n interfaceC24080n = null;
            if (!this.f56069b) {
                InterfaceC24080n interfaceC24080n2 = ORLongVodPlayerView.this.volumeControl;
                if (interfaceC24080n2 == null) {
                    Intrinsics.m97819y("volumeControl");
                    interfaceC24080n2 = null;
                }
                interfaceC24080n2.mo95033f(false);
                InterfaceC24080n interfaceC24080n3 = ORLongVodPlayerView.this.volumeControl;
                if (interfaceC24080n3 == null) {
                    Intrinsics.m97819y("volumeControl");
                    interfaceC24080n3 = null;
                }
                this.f56071d = interfaceC24080n3.mo95029b();
                this.f56069b = true;
            }
            float height = ((f11 - f12) * 2) / ORLongVodPlayerView.this.getHeight();
            InterfaceC24080n interfaceC24080n4 = ORLongVodPlayerView.this.volumeControl;
            if (interfaceC24080n4 == null) {
                Intrinsics.m97819y("volumeControl");
            } else {
                interfaceC24080n = interfaceC24080n4;
            }
            interfaceC24080n.mo95028a(this.f56071d, height);
        }

        @Override // io.C24066e.a
        /* JADX INFO: renamed from: d */
        public void mo72608d(float f11, float f12) {
            InterfaceC24080n interfaceC24080n = null;
            if (!this.f56068a) {
                InterfaceC24080n interfaceC24080n2 = ORLongVodPlayerView.this.volumeControl;
                if (interfaceC24080n2 == null) {
                    Intrinsics.m97819y("volumeControl");
                    interfaceC24080n2 = null;
                }
                interfaceC24080n2.mo95033f(false);
                InterfaceC24080n interfaceC24080n3 = ORLongVodPlayerView.this.volumeControl;
                if (interfaceC24080n3 == null) {
                    Intrinsics.m97819y("volumeControl");
                    interfaceC24080n3 = null;
                }
                this.f56070c = interfaceC24080n3.mo95030c();
                this.f56068a = true;
            }
            InterfaceC24080n interfaceC24080n4 = ORLongVodPlayerView.this.volumeControl;
            if (interfaceC24080n4 == null) {
                Intrinsics.m97819y("volumeControl");
            } else {
                interfaceC24080n = interfaceC24080n4;
            }
            interfaceC24080n.mo95031d(f11, f12, ORLongVodPlayerView.this.getHeight());
        }

        @Override // io.C24066e.a
        /* JADX INFO: renamed from: e */
        public void mo72609e() {
            InterfaceC16676a.b bVar = ORLongVodPlayerView.this.gestureListener;
            if (bVar != null) {
                bVar.mo72135c();
            }
            this.f56068a = false;
            this.f56069b = false;
        }

        @Override // io.C24066e.a
        public void onDoubleTap(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            InterfaceC16676a.b bVar = ORLongVodPlayerView.this.gestureListener;
            if (bVar != null) {
                bVar.onDoubleTap(e11);
            }
        }

        @Override // io.C24066e.a
        public void onLongPress(MotionEvent e11) {
            Intrinsics.m97802h(e11, "e");
            InterfaceC16676a.b bVar = ORLongVodPlayerView.this.gestureListener;
            if (bVar != null) {
                bVar.onLongPress(e11);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ORLongVodPlayerView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ORLongVodPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ORLongVodPlayerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        m72603c(this);
    }

    /* JADX INFO: renamed from: c */
    private final void m72603c(View gestureView) {
        InterfaceC24080n.a aVar = InterfaceC24080n.f73421a;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        this.volumeControl = aVar.m95036a(context, this);
        C24066e c24066e = new C24066e(getContext(), gestureView);
        this.gestureControl = c24066e;
        c24066e.m94974s(new C16675a());
    }

    /* JADX INFO: renamed from: d */
    private final boolean m72604d() {
        return getChildCount() == 0;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean addDataSource(C23403e c23403e) {
        return InterfaceC16676a.a.m72610a(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void addPlayerListener(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.addPlayerListener(listener);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void changeTrackSelection(C26907d mediaTrackGroup, int index) {
        Intrinsics.m97802h(mediaTrackGroup, "mediaTrackGroup");
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.changeTrackSelection(mediaTrackGroup, index);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void clearScreen() {
        InterfaceC16676a.a.m72611b(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void clearSurfaceOnly() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.clearSurfaceOnly();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public C23403e currentMediaSource() {
        return InterfaceC16676a.a.m72612c(this);
    }

    @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a
    public void enableGesture(boolean enable) {
        C24066e c24066e = this.gestureControl;
        if (c24066e == null) {
            Intrinsics.m97819y("gestureControl");
            c24066e = null;
        }
        c24066e.m94969l(enable);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void enableHardwareDecoder(boolean enable) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.enableHardwareDecoder(enable);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public Pair<Integer, Integer> getBitrate() {
        Pair<Integer, Integer> bitrate;
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        return (interfaceC16634g == null || (bitrate = interfaceC16634g.getBitrate()) == null) ? new Pair<>(0, 0) : bitrate;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public long getCurrentPosition() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.getCurrentPosition();
        }
        return 0L;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public C26906c getCurrentTracks() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.getCurrentTracks();
        }
        return null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public C26905b getCurrentVideoFormat() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.getCurrentVideoFormat();
        }
        return null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public Object getDownloadBitrate() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.getDownloadBitrate();
        }
        return null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public long getDuration() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.getDuration();
        }
        return 0L;
    }

    @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a
    public InterfaceC16634g getOrPlayer() {
        return this.orPlayer;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public int getVideoHeight() {
        return InterfaceC16676a.a.m72613d(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public int getVideoWidth() {
        return InterfaceC16676a.a.m72614e(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public Float getVolume() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.getVolume();
        }
        return null;
    }

    @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a
    public void initLongVodPlayer(C23619a config, ORPlayerView playerView) {
        Intrinsics.m97802h(config, "config");
        Intrinsics.m97802h(playerView, "playerView");
        this.config = config;
        InterfaceC16634g interfaceC16634gM102149s = C26053g0.f79567a.m102149s();
        interfaceC16634gM102149s.setSpeed(config.m93444b());
        interfaceC16634gM102149s.setScaleMode(config.m93443a());
        interfaceC16634gM102149s.setPlayerConfig(config.m93446d());
        interfaceC16634gM102149s.setVolume(1.0f);
        if (config.m93445c()) {
            interfaceC16634gM102149s.setSurfaceView(playerView.getSurface());
        } else {
            interfaceC16634gM102149s.setTextureView(playerView.getTextureView());
        }
        this.orPlayer = interfaceC16634gM102149s;
        InterfaceC24080n interfaceC24080n = this.volumeControl;
        if (interfaceC24080n == null) {
            Intrinsics.m97819y("volumeControl");
            interfaceC24080n = null;
        }
        interfaceC24080n.mo95032e(this.orPlayer);
        addView(playerView, 0);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isComplete() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.isComplete();
        }
        return false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isLoading() {
        return InterfaceC16676a.a.m72615f(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isMute() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.isMute();
        }
        return false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isPlaying() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.isPlaying();
        }
        return false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isPrepared() {
        return InterfaceC16676a.a.m72616g(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setFocusableInTouchMode(true);
        requestFocus();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void pause() {
        InterfaceC16634g interfaceC16634g;
        if (m72604d() || (interfaceC16634g = this.orPlayer) == null) {
            return;
        }
        interfaceC16634g.pause();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void play() {
        InterfaceC16634g interfaceC16634g;
        if (m72604d() || (interfaceC16634g = this.orPlayer) == null) {
            return;
        }
        interfaceC16634g.play();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void prepare() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.prepare();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void release() {
        InterfaceC16634g interfaceC16634g;
        if (!m72604d() && (interfaceC16634g = this.orPlayer) != null) {
            interfaceC16634g.release();
        }
        if (getChildAt(0) instanceof ORPlayerView) {
            removeViewAt(0);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void release(String id2) {
        InterfaceC16634g interfaceC16634g;
        InterfaceC16676a.a.m72617h(this, id2);
        if (!m72604d() && (interfaceC16634g = this.orPlayer) != null) {
            interfaceC16634g.release(id2);
        }
        if (getChildAt(0) instanceof ORPlayerView) {
            removeViewAt(0);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean removeDataSource(C23403e c23403e) {
        return InterfaceC16676a.a.m72618i(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void removePlayerListener(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.removePlayerListener(listener);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean requestForce() {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            return interfaceC16634g.requestForce();
        }
        return false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void reset() {
        InterfaceC16634g interfaceC16634g;
        if (m72604d() || (interfaceC16634g = this.orPlayer) == null) {
            return;
        }
        interfaceC16634g.reset();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void seekTo(long mills) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.seekTo(mills);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void seekTo(String str, long j11) {
        InterfaceC16676a.a.m72619j(this, str, j11);
    }

    public void seekToDefaultPosition() {
        InterfaceC16676a.a.m72620k(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setAutoPlay(boolean isAutoPlay) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setAutoPlay(isAutoPlay);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setDataSource(C23403e mediaSource) {
        Intrinsics.m97802h(mediaSource, "mediaSource");
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setDataSource(mediaSource);
        }
    }

    public void setErrorInterceptor(InterfaceC26075z interfaceC26075z) {
        InterfaceC16676a.a.m72621l(this, interfaceC26075z);
    }

    @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a
    public void setExistPlayer(C23619a config, InterfaceC16634g orPlayer, ORPlayerView playerView) {
        Intrinsics.m97802h(config, "config");
        Intrinsics.m97802h(orPlayer, "orPlayer");
        Intrinsics.m97802h(playerView, "playerView");
        this.orPlayer = orPlayer;
        if (config.m93445c()) {
            orPlayer.setSurfaceView(playerView.getSurface());
        } else {
            orPlayer.setTextureView(playerView.getTextureView());
        }
        InterfaceC24080n interfaceC24080n = this.volumeControl;
        if (interfaceC24080n == null) {
            Intrinsics.m97819y("volumeControl");
            interfaceC24080n = null;
        }
        interfaceC24080n.mo95032e(orPlayer);
        addView(playerView, 0);
    }

    @Override // com.transsion.player.p303ui.longvideo.InterfaceC16676a
    public void setGestureListener(InterfaceC16676a.b listener) {
        Intrinsics.m97802h(listener, "listener");
        this.gestureListener = listener;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setLooping(boolean isLoop) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setLooping(isLoop);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setMute(boolean z11) {
        InterfaceC16676a.a.m72622m(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setPlayerConfig(C23622d c23622d) {
        InterfaceC16676a.a.m72623n(this, c23622d);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setPlayerListener(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setPlayerListener(listener);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setScaleMode(ScaleMode scaleMode) {
        Intrinsics.m97802h(scaleMode, "scaleMode");
        InterfaceC16676a.a.m72624o(this, scaleMode);
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setScaleMode(scaleMode);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setSpeed(float speed) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setSpeed(speed);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setSurfaceView(SurfaceView surfaceView) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setSurfaceView(surfaceView);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setTextureView(TextureView textureView) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setTextureView(textureView);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setVipResolution(boolean isVipSubscriber, int vipResolution) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setVipResolution(isVipSubscriber, vipResolution);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setVolume(float volume) {
        InterfaceC16634g interfaceC16634g = this.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.setVolume(volume);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void stop() {
        InterfaceC16634g interfaceC16634g;
        if (m72604d() || (interfaceC16634g = this.orPlayer) == null) {
            return;
        }
        interfaceC16634g.stop();
    }
}
