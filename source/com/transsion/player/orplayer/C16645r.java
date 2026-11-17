package com.transsion.player.orplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.collection.AbstractC0585s;
import com.aliyun.player.AliPlayer;
import com.aliyun.player.AliPlayerFactory;
import com.aliyun.player.AliPlayerGlobalSettings;
import com.aliyun.player.IPlayer;
import com.aliyun.player.bean.ErrorCode;
import com.aliyun.player.bean.ErrorInfo;
import com.aliyun.player.bean.InfoBean;
import com.aliyun.player.bean.InfoCode;
import com.aliyun.player.nativeclass.CacheConfig;
import com.aliyun.player.nativeclass.MediaInfo;
import com.aliyun.player.nativeclass.PlayerConfig;
import com.aliyun.player.nativeclass.TrackInfo;
import com.aliyun.player.source.UrlSource;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.p1003enum.ScaleMode;
import fo.C23403e;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import p438go.C23620b;
import p438go.C23622d;
import p683po.C26905b;
import p683po.C26906c;
import p683po.C26907d;
import ro.C27310d;
import ro.C27311e;

/* JADX INFO: renamed from: com.transsion.player.orplayer.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C16645r implements InterfaceC16634g {

    /* JADX INFO: renamed from: A */
    private long f55939A;

    /* JADX INFO: renamed from: B */
    private long f55940B;

    /* JADX INFO: renamed from: C */
    private boolean f55941C;

    /* JADX INFO: renamed from: D */
    private volatile boolean f55942D;

    /* JADX INFO: renamed from: E */
    private Handler f55943E;

    /* JADX INFO: renamed from: F */
    private final f f55944F;

    /* JADX INFO: renamed from: G */
    private TextureView f55945G;

    /* JADX INFO: renamed from: H */
    private SurfaceView f55946H;

    /* JADX INFO: renamed from: I */
    private final g f55947I;

    /* JADX INFO: renamed from: a */
    private final String f55948a;

    /* JADX INFO: renamed from: b */
    private AliPlayer f55949b;

    /* JADX INFO: renamed from: c */
    private C16630c f55950c;

    /* JADX INFO: renamed from: d */
    private InterfaceC16633f f55951d;

    /* JADX INFO: renamed from: e */
    private InterfaceC16632e f55952e;

    /* JADX INFO: renamed from: f */
    private String f55953f;

    /* JADX INFO: renamed from: g */
    private C23403e f55954g;

    /* JADX INFO: renamed from: h */
    private boolean f55955h;

    /* JADX INFO: renamed from: i */
    private boolean f55956i;

    /* JADX INFO: renamed from: j */
    private boolean f55957j;

    /* JADX INFO: renamed from: k */
    private boolean f55958k;

    /* JADX INFO: renamed from: l */
    private boolean f55959l;

    /* JADX INFO: renamed from: m */
    private Double f55960m;

    /* JADX INFO: renamed from: n */
    private CopyOnWriteArrayList f55961n;

    /* JADX INFO: renamed from: o */
    private Context f55962o;

    /* JADX INFO: renamed from: p */
    private long f55963p;

    /* JADX INFO: renamed from: q */
    private int f55964q;

    /* JADX INFO: renamed from: r */
    private int f55965r;

    /* JADX INFO: renamed from: s */
    private long f55966s;

    /* JADX INFO: renamed from: t */
    private final long f55967t;

    /* JADX INFO: renamed from: u */
    private long f55968u;

    /* JADX INFO: renamed from: v */
    private long f55969v;

    /* JADX INFO: renamed from: w */
    private long f55970w;

    /* JADX INFO: renamed from: x */
    private long f55971x;

    /* JADX INFO: renamed from: y */
    private long f55972y;

    /* JADX INFO: renamed from: z */
    private final CopyOnWriteArrayList f55973z;

    /* JADX INFO: renamed from: com.transsion.player.orplayer.r$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final long f55974a;

        /* JADX INFO: renamed from: b */
        private final long f55975b;

        /* JADX INFO: renamed from: c */
        private final Double f55976c;

        public a(long j11, long j12, Double d11) {
            this.f55974a = j11;
            this.f55975b = j12;
            this.f55976c = d11;
        }

        /* JADX INFO: renamed from: a */
        public final long m72520a() {
            return this.f55975b;
        }

        /* JADX INFO: renamed from: b */
        public final long m72521b() {
            return this.f55974a;
        }

        /* JADX INFO: renamed from: c */
        public final Double m72522c() {
            return this.f55976c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f55974a == aVar.f55974a && this.f55975b == aVar.f55975b && Intrinsics.m97797c(this.f55976c, aVar.f55976c);
        }

        public int hashCode() {
            int iM2633a = ((AbstractC0585s.m2633a(this.f55974a) * 31) + AbstractC0585s.m2633a(this.f55975b)) * 31;
            Double d11 = this.f55976c;
            return iM2633a + (d11 == null ? 0 : d11.hashCode());
        }

        public String toString() {
            return "BandwidthStats(downloadBytes=" + this.f55974a + ", consumedBytesEstimated=" + this.f55975b + ", redundancyRate=" + this.f55976c + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.orplayer.r$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private final long f55977a;

        /* JADX INFO: renamed from: b */
        private final long f55978b;

        public b(long j11, long j12) {
            this.f55977a = j11;
            this.f55978b = j12;
        }

        /* JADX INFO: renamed from: a */
        public final long m72523a() {
            return this.f55978b;
        }

        /* JADX INFO: renamed from: b */
        public final long m72524b() {
            return this.f55977a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f55977a == bVar.f55977a && this.f55978b == bVar.f55978b;
        }

        public int hashCode() {
            return (AbstractC0585s.m2633a(this.f55977a) * 31) + AbstractC0585s.m2633a(this.f55978b);
        }

        public String toString() {
            return "WatchRange(startMs=" + this.f55977a + ", endMs=" + this.f55978b + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.orplayer.r$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55979a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f55980b;

        static {
            int[] iArr = new int[TrackInfo.Type.values().length];
            try {
                iArr[TrackInfo.Type.TYPE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrackInfo.Type.TYPE_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55979a = iArr;
            int[] iArr2 = new int[ScaleMode.values().length];
            try {
                iArr2[ScaleMode.SCALE_ASPECT_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ScaleMode.SCALE_TO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScaleMode.SCALE_ASPECT_FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f55980b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.orplayer.r$d */
    public static final class d implements InterfaceC16631d {
        d() {
        }

        @Override // com.transsion.player.orplayer.InterfaceC16631d
        public boolean isMute() {
            AliPlayer aliPlayer = C16645r.this.f55949b;
            if (aliPlayer != null) {
                return aliPlayer.isMute();
            }
            return false;
        }

        @Override // com.transsion.player.orplayer.InterfaceC16631d
        public void pause() {
            AliPlayer aliPlayer = C16645r.this.f55949b;
            if (aliPlayer != null) {
                aliPlayer.pause();
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16631d
        public void play() {
            AliPlayer aliPlayer = C16645r.this.f55949b;
            if (aliPlayer != null) {
                aliPlayer.start();
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16631d
        public void setVolume(float f11) {
            AliPlayer aliPlayer = C16645r.this.f55949b;
            if (aliPlayer != null) {
                aliPlayer.setVolume(f11);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.orplayer.r$e */
    public static final class e implements IPlayer.OnLoadingStatusListener {
        e() {
        }

        @Override // com.aliyun.player.IPlayer.OnLoadingStatusListener
        public void onLoadingBegin() {
            if (C16645r.this.f55942D) {
                return;
            }
            String unused = C16645r.this.f55948a;
            C16645r.this.f55956i = true;
            InterfaceC16633f interfaceC16633f = C16645r.this.f55951d;
            if (interfaceC16633f != null) {
                interfaceC16633f.onLoadingBegin(C16645r.this.f55954g);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = C16645r.this.f55961n;
            C16645r c16645r = C16645r.this;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC16633f) it.next()).onLoadingBegin(c16645r.f55954g);
            }
        }

        @Override // com.aliyun.player.IPlayer.OnLoadingStatusListener
        public void onLoadingEnd() {
            if (C16645r.this.f55942D) {
                return;
            }
            String unused = C16645r.this.f55948a;
            C16645r.this.f55956i = false;
            InterfaceC16633f interfaceC16633f = C16645r.this.f55951d;
            if (interfaceC16633f != null) {
                interfaceC16633f.onLoadingEnd(C16645r.this.f55954g);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = C16645r.this.f55961n;
            C16645r c16645r = C16645r.this;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC16633f) it.next()).onLoadingEnd(c16645r.f55954g);
            }
        }

        @Override // com.aliyun.player.IPlayer.OnLoadingStatusListener
        public void onLoadingProgress(int i11, float f11) {
            String unused = C16645r.this.f55948a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onLoadingProgress percent:");
            sb2.append(i11);
            sb2.append(",netSpeed:");
            sb2.append(f11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.orplayer.r$f */
    public static final class f implements SurfaceHolder.Callback {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final Unit m72528d(C16645r c16645r) {
            AliPlayer aliPlayer = c16645r.f55949b;
            if (aliPlayer != null) {
                aliPlayer.surfaceChanged();
            }
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final void m72529e(SurfaceHolder surfaceHolder, C16645r c16645r) {
            AliPlayer aliPlayer;
            Surface surface = surfaceHolder.getSurface();
            if (!surface.isValid() || (aliPlayer = c16645r.f55949b) == null) {
                return;
            }
            aliPlayer.setSurface(surface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m72530f(C16645r c16645r) {
            AliPlayer aliPlayer = c16645r.f55949b;
            if (aliPlayer != null) {
                aliPlayer.setSurface(null);
            }
            return Unit.f75682a;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int i11, int i12, int i13) {
            Intrinsics.m97802h(holder, "holder");
            final C16645r c16645r = C16645r.this;
            c16645r.m72488N(new Function0() { // from class: com.transsion.player.orplayer.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C16645r.f.m72528d(c16645r);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(final SurfaceHolder holder) {
            Intrinsics.m97802h(holder, "holder");
            Handler handler = C16645r.this.f55943E;
            if (handler != null) {
                final C16645r c16645r = C16645r.this;
                handler.post(new Runnable() { // from class: com.transsion.player.orplayer.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16645r.f.m72529e(holder, c16645r);
                    }
                });
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            Intrinsics.m97802h(holder, "holder");
            final C16645r c16645r = C16645r.this;
            c16645r.m72488N(new Function0() { // from class: com.transsion.player.orplayer.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C16645r.f.m72530f(c16645r);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.orplayer.r$g */
    public static final class g implements TextureView.SurfaceTextureListener {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final Unit m72534d(SurfaceTexture surfaceTexture, C16645r c16645r) {
            AliPlayer aliPlayer;
            Surface surface = new Surface(surfaceTexture);
            if (surface.isValid() && (aliPlayer = c16645r.f55949b) != null) {
                aliPlayer.setSurface(surface);
            }
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final Unit m72535e(C16645r c16645r) {
            AliPlayer aliPlayer = c16645r.f55949b;
            if (aliPlayer != null) {
                aliPlayer.setSurface(null);
            }
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m72536f(C16645r c16645r) {
            AliPlayer aliPlayer = c16645r.f55949b;
            if (aliPlayer != null) {
                aliPlayer.surfaceChanged();
            }
            return Unit.f75682a;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, int i11, int i12) {
            Intrinsics.m97802h(surfaceTexture, "surfaceTexture");
            final C16645r c16645r = C16645r.this;
            c16645r.m72488N(new Function0() { // from class: com.transsion.player.orplayer.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C16645r.g.m72534d(surfaceTexture, c16645r);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
            Intrinsics.m97802h(surface, "surface");
            final C16645r c16645r = C16645r.this;
            c16645r.m72488N(new Function0() { // from class: com.transsion.player.orplayer.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C16645r.g.m72535e(c16645r);
                }
            });
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i11, int i12) {
            Intrinsics.m97802h(surface, "surface");
            final C16645r c16645r = C16645r.this;
            c16645r.m72488N(new Function0() { // from class: com.transsion.player.orplayer.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C16645r.g.m72536f(c16645r);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surface) {
            Intrinsics.m97802h(surface, "surface");
        }
    }

    public C16645r(Context context, C23622d c23622d) {
        Intrinsics.m97802h(context, "context");
        this.f55948a = "ORPlayerImpl";
        this.f55953f = "";
        this.f55961n = new CopyOnWriteArrayList();
        this.f55966s = 50000L;
        this.f55967t = 500L;
        this.f55970w = -1L;
        this.f55971x = -1L;
        this.f55973z = new CopyOnWriteArrayList();
        this.f55939A = -1L;
        this.f55944F = new f();
        this.f55947I = new g();
        this.f55962o = context;
        AliPlayer aliPlayerCreateAliPlayer = AliPlayerFactory.createAliPlayer(context);
        aliPlayerCreateAliPlayer.setTraceId(c23622d != null ? c23622d.m93466o() : null);
        aliPlayerCreateAliPlayer.enableHardwareDecoder(c23622d != null ? c23622d.m93456e() : true);
        this.f55949b = aliPlayerCreateAliPlayer;
        if (c23622d == null || c23622d.m93460i()) {
            m72475A();
        }
        setPlayerConfig(c23622d == null ? C23620b.f72130a.m93447a() : c23622d);
        m72477C(c23622d != null ? c23622d.m93461j() : true);
    }

    /* JADX INFO: renamed from: A */
    private final void m72475A() {
        this.f55950c = new C16630c(new d(), new Function1() { // from class: com.transsion.player.orplayer.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C16645r.m72476B(this.f55930a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m72476B(C16645r c16645r, boolean z11) {
        InterfaceC16633f interfaceC16633f = c16645r.f55951d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onFocusChange(z11);
        }
        Iterator it = c16645r.f55961n.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onFocusChange(z11);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: C */
    private final void m72477C(boolean z11) {
        C23620b c23620b = C23620b.f72130a;
        m72491R(c23620b.m93447a(), c23620b.m93449c() && z11);
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setOnRenderingStartListener(new IPlayer.OnRenderingStartListener() { // from class: com.transsion.player.orplayer.i
                @Override // com.aliyun.player.IPlayer.OnRenderingStartListener
                public final void onRenderingStart() {
                    C16645r.m72483I(this.f55931a);
                }
            });
        }
        AliPlayer aliPlayer2 = this.f55949b;
        if (aliPlayer2 != null) {
            aliPlayer2.setOnVideoSizeChangedListener(new IPlayer.OnVideoSizeChangedListener() { // from class: com.transsion.player.orplayer.j
                @Override // com.aliyun.player.IPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(int i11, int i12) {
                    C16645r.m72484J(this.f55932a, i11, i12);
                }
            });
        }
        AliPlayer aliPlayer3 = this.f55949b;
        if (aliPlayer3 != null) {
            aliPlayer3.setOnErrorListener(new IPlayer.OnErrorListener() { // from class: com.transsion.player.orplayer.k
                @Override // com.aliyun.player.IPlayer.OnErrorListener
                public final void onError(ErrorInfo errorInfo) {
                    C16645r.m72478D(this.f55933a, errorInfo);
                }
            });
        }
        AliPlayer aliPlayer4 = this.f55949b;
        if (aliPlayer4 != null) {
            aliPlayer4.setOnLoadingStatusListener(new e());
        }
        AliPlayer aliPlayer5 = this.f55949b;
        if (aliPlayer5 != null) {
            aliPlayer5.setOnPreparedListener(new IPlayer.OnPreparedListener() { // from class: com.transsion.player.orplayer.l
                @Override // com.aliyun.player.IPlayer.OnPreparedListener
                public final void onPrepared() {
                    C16645r.m72479E(this.f55934a);
                }
            });
        }
        AliPlayer aliPlayer6 = this.f55949b;
        if (aliPlayer6 != null) {
            aliPlayer6.setOnInfoListener(new IPlayer.OnInfoListener() { // from class: com.transsion.player.orplayer.m
                @Override // com.aliyun.player.IPlayer.OnInfoListener
                public final void onInfo(InfoBean infoBean) {
                    C16645r.m72480F(this.f55935a, infoBean);
                }
            });
        }
        AliPlayer aliPlayer7 = this.f55949b;
        if (aliPlayer7 != null) {
            aliPlayer7.setOnStateChangedListener(new IPlayer.OnStateChangedListener() { // from class: com.transsion.player.orplayer.n
                @Override // com.aliyun.player.IPlayer.OnStateChangedListener
                public final void onStateChanged(int i11) {
                    C16645r.m72481G(this.f55936a, i11);
                }
            });
        }
        AliPlayer aliPlayer8 = this.f55949b;
        if (aliPlayer8 != null) {
            aliPlayer8.setOnSeekCompleteListener(new IPlayer.OnSeekCompleteListener() { // from class: com.transsion.player.orplayer.o
                @Override // com.aliyun.player.IPlayer.OnSeekCompleteListener
                public final void onSeekComplete() {
                    C16645r.m72482H(this.f55937a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m72478D(C16645r c16645r, ErrorInfo errorInfo) {
        if (c16645r.f55942D) {
            return;
        }
        ErrorCode code = errorInfo.getCode();
        String msg = errorInfo.getMsg();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onError code:");
        sb2.append(code);
        sb2.append(",msg:");
        sb2.append(msg);
        PlayError playError = new PlayError(Integer.valueOf(errorInfo.getCode().getValue()), errorInfo.getMsg());
        if (c16645r.m72517z(playError)) {
            return;
        }
        InterfaceC16633f interfaceC16633f = c16645r.f55951d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onPlayError(playError, c16645r.f55954g);
        }
        Iterator it = c16645r.f55961n.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onPlayError(playError, c16645r.f55954g);
        }
        if (errorInfo.getCode() == ErrorCode.ERROR_DECODE_AUDIO) {
            c16645r.prepare();
            c16645r.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m72479E(C16645r c16645r) {
        if (c16645r.f55942D) {
            return;
        }
        c16645r.f55959l = true;
        if (c16645r.f55941C && c16645r.f55963p > 0) {
            C27311e.f83046a.m106401a(c16645r.f55948a, "aliyun onPrepare 内部的解码切换，已有播放进度，直接播放", true);
            c16645r.seekTo(c16645r.f55963p);
            c16645r.play();
        } else {
            InterfaceC16633f interfaceC16633f = c16645r.f55951d;
            if (interfaceC16633f != null) {
                interfaceC16633f.onPrepare(c16645r.f55954g);
            }
            Iterator it = c16645r.f55961n.iterator();
            while (it.hasNext()) {
                ((InterfaceC16633f) it.next()).onPrepare(c16645r.f55954g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m72480F(C16645r c16645r, InfoBean infoBean) {
        if (c16645r.f55942D) {
            return;
        }
        long extraValue = infoBean.getExtraValue();
        if (infoBean.getCode() == InfoCode.CurrentPosition) {
            c16645r.f55963p = extraValue;
            c16645r.f55940B = extraValue;
            c16645r.m72490P();
            InterfaceC16633f interfaceC16633f = c16645r.f55951d;
            if (interfaceC16633f != null) {
                interfaceC16633f.onProgress(extraValue, c16645r.f55954g);
            }
            Iterator it = c16645r.f55961n.iterator();
            while (it.hasNext()) {
                ((InterfaceC16633f) it.next()).onProgress(extraValue, c16645r.f55954g);
            }
        }
        if (infoBean.getCode() == InfoCode.LoopingStart) {
            InterfaceC16633f interfaceC16633f2 = c16645r.f55951d;
            if (interfaceC16633f2 != null) {
                interfaceC16633f2.onLoopingStart();
            }
            Iterator it2 = c16645r.f55961n.iterator();
            while (it2.hasNext()) {
                ((InterfaceC16633f) it2.next()).onLoopingStart();
            }
        }
        if (infoBean.getCode() == InfoCode.BufferedPosition) {
            c16645r.f55968u = extraValue;
            c16645r.f55969v = SystemClock.elapsedRealtime();
            InterfaceC16633f interfaceC16633f3 = c16645r.f55951d;
            if (interfaceC16633f3 != null) {
                interfaceC16633f3.onBufferedPosition(extraValue, c16645r.f55954g);
            }
            Iterator it3 = c16645r.f55961n.iterator();
            while (it3.hasNext()) {
                ((InterfaceC16633f) it3.next()).onBufferedPosition(extraValue, c16645r.f55954g);
            }
        }
        if (infoBean.getCode() == InfoCode.SwitchToSoftwareVideoDecoder) {
            C27311e.f83046a.m106403e(c16645r.f55948a, "aliyun 硬解失败，自动切换到软件", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m72481G(C16645r c16645r, int i11) {
        if (c16645r.f55942D) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setOnStateChangedListener status:");
        sb2.append(i11);
        boolean z11 = i11 == 3;
        c16645r.f55955h = z11;
        InterfaceC16633f interfaceC16633f = c16645r.f55951d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onIsPlayingChanged(z11);
        }
        Iterator it = c16645r.f55961n.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onIsPlayingChanged(c16645r.f55955h);
        }
        c16645r.f55958k = i11 == 6;
        C16630c c16630c = c16645r.f55950c;
        if (c16630c != null) {
            c16630c.m72410f(c16645r.f55955h);
        }
        if (i11 == 3) {
            c16645r.m72493T(c16645r.f55963p);
            InterfaceC16633f interfaceC16633f2 = c16645r.f55951d;
            if (interfaceC16633f2 != null) {
                interfaceC16633f2.onVideoStart(c16645r.f55954g);
            }
            Iterator it2 = c16645r.f55961n.iterator();
            while (it2.hasNext()) {
                ((InterfaceC16633f) it2.next()).onVideoStart(c16645r.f55954g);
            }
            return;
        }
        if (i11 == 4) {
            c16645r.m72515w(c16645r.f55963p);
            c16645r.m72490P();
            InterfaceC16633f interfaceC16633f3 = c16645r.f55951d;
            if (interfaceC16633f3 != null) {
                interfaceC16633f3.onVideoPause(c16645r.f55954g);
            }
            Iterator it3 = c16645r.f55961n.iterator();
            while (it3.hasNext()) {
                ((InterfaceC16633f) it3.next()).onVideoPause(c16645r.f55954g);
            }
            return;
        }
        if (i11 == 5) {
            c16645r.m72515w(c16645r.f55963p);
            c16645r.m72490P();
            c16645r.m72486L("stopped");
            return;
        }
        if (i11 != 6) {
            if (i11 != 7) {
                return;
            }
            c16645r.m72515w(c16645r.f55963p);
            c16645r.m72490P();
            return;
        }
        c16645r.m72515w(c16645r.f55963p);
        c16645r.m72490P();
        c16645r.m72486L(MediaItem.MUSIC_FLOAT_STATE_COMPLETION);
        InterfaceC16633f interfaceC16633f4 = c16645r.f55951d;
        if (interfaceC16633f4 != null) {
            interfaceC16633f4.onCompletion(c16645r.f55954g);
        }
        Iterator it4 = c16645r.f55961n.iterator();
        while (it4.hasNext()) {
            ((InterfaceC16633f) it4.next()).onCompletion(c16645r.f55954g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m72482H(C16645r c16645r) {
        if (c16645r.f55942D) {
            return;
        }
        InterfaceC16633f interfaceC16633f = c16645r.f55951d;
        if (interfaceC16633f != null) {
            interfaceC16633f.setOnSeekCompleteListener();
        }
        Iterator it = c16645r.f55961n.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).setOnSeekCompleteListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m72483I(C16645r c16645r) {
        MediaInfo mediaInfo;
        List<TrackInfo> trackInfos;
        if (c16645r.f55942D) {
            return;
        }
        AliPlayer aliPlayer = c16645r.f55949b;
        if (aliPlayer != null && (mediaInfo = aliPlayer.getMediaInfo()) != null && (trackInfos = mediaInfo.getTrackInfos()) != null) {
            for (TrackInfo trackInfo : trackInfos) {
                C27311e.f83046a.m106401a(c16645r.f55948a, "setOnInfoListener onRenderFirstFrame " + AbstractC5796o.m27447j(trackInfo), true);
                TrackInfo.Type type = trackInfo.mType;
                int i11 = type == null ? -1 : c.f55979a[type.ordinal()];
                if (i11 == 1) {
                    int i12 = trackInfo.videoBitrate;
                    c16645r.f55964q = i12;
                    InterfaceC16633f interfaceC16633f = c16645r.f55951d;
                    if (interfaceC16633f != null) {
                        interfaceC16633f.onTracksVideoBitrateChange(i12);
                    }
                    Iterator it = c16645r.f55961n.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC16633f) it.next()).onTracksVideoBitrateChange(c16645r.f55964q);
                    }
                } else if (i11 == 2) {
                    int i13 = trackInfo.videoBitrate;
                    c16645r.f55965r = i13;
                    InterfaceC16633f interfaceC16633f2 = c16645r.f55951d;
                    if (interfaceC16633f2 != null) {
                        interfaceC16633f2.onTracksAudioBitrateChange(i13);
                    }
                    Iterator it2 = c16645r.f55961n.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC16633f) it2.next()).onTracksAudioBitrateChange(c16645r.f55965r);
                    }
                }
            }
        }
        int i14 = c16645r.f55964q;
        int i15 = c16645r.f55965r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setOnInfoListener onRenderFirstFrame，videoBitrate:");
        sb2.append(i14);
        sb2.append(", audioBitrate:");
        sb2.append(i15);
        InterfaceC16633f interfaceC16633f3 = c16645r.f55951d;
        if (interfaceC16633f3 != null) {
            interfaceC16633f3.onRenderFirstFrame();
        }
        Iterator it3 = c16645r.f55961n.iterator();
        while (it3.hasNext()) {
            ((InterfaceC16633f) it3.next()).onRenderFirstFrame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m72484J(C16645r c16645r, int i11, int i12) {
        if (c16645r.f55942D) {
            return;
        }
        InterfaceC16633f interfaceC16633f = c16645r.f55951d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onVideoSizeChanged(i11, i12);
        }
        Iterator it = c16645r.f55961n.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onVideoSizeChanged(i11, i12);
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m72485K() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jF = RangesKt.m97936f(this.f55963p, 0L);
        boolean z11 = jElapsedRealtime - this.f55969v <= 2000;
        long jF2 = z11 ? RangesKt.m97936f(this.f55968u, jF) : jF;
        long jF3 = RangesKt.m97936f(jF2 - jF, 0L);
        double dJ = RangesKt.m97940j((jF3 * 100.0d) / this.f55966s, 0.0d, 100.0d);
        this.f55960m = Double.valueOf(dJ);
        boolean z12 = jF3 >= this.f55966s - this.f55967t;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dJ)}, 1));
        Intrinsics.m97801g(str, "format(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("aliyun-buffer-pool scene=release, current=");
        sb2.append(jF);
        sb2.append(", bufferedPosition=");
        sb2.append(jF2);
        sb2.append(", bufferedMs=");
        sb2.append(jF3);
        sb2.append(", poolPercent=");
        sb2.append(str);
        sb2.append(", isPoolFull=");
        sb2.append(z12);
        sb2.append(", bufferedFresh=");
        sb2.append(z11);
    }

    /* JADX INFO: renamed from: L */
    private final void m72486L(String str) {
        String str2;
        a aVarM72519x = m72519x();
        Double dM72522c = aVarM72519x.m72522c();
        if (dM72522c != null) {
            double dDoubleValue = dM72522c.doubleValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            str2 = String.format("%.4f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1));
            Intrinsics.m97801g(str2, "format(...)");
        } else {
            str2 = "null";
        }
        long jM72521b = aVarM72519x.m72521b();
        long jM72520a = aVarM72519x.m72520a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("aliyun-bw scene=");
        sb2.append(str);
        sb2.append(", downloadBytes=");
        sb2.append(jM72521b);
        sb2.append(", consumedEstimated=");
        sb2.append(jM72520a);
        sb2.append(", redundancyRate=");
        sb2.append(str2);
    }

    /* JADX INFO: renamed from: M */
    private final void m72487M() {
        this.f55970w = -1L;
        this.f55971x = -1L;
        this.f55972y = 0L;
        this.f55973z.clear();
        this.f55939A = -1L;
        this.f55940B = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m72488N(final Function0 function0) {
        Handler handler = this.f55943E;
        if (handler == null || Intrinsics.m97797c(Thread.currentThread(), handler.getLooper().getThread())) {
            function0.invoke();
        } else {
            handler.post(new Runnable() { // from class: com.transsion.player.orplayer.q
                @Override // java.lang.Runnable
                public final void run() {
                    C16645r.m72489O(function0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final void m72489O(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: P */
    private final void m72490P() {
        long uidRxBytes = TrafficStats.getUidRxBytes(this.f55962o.getApplicationInfo().uid);
        if (uidRxBytes <= 0 || uidRxBytes == -1) {
            return;
        }
        if (this.f55970w < 0) {
            this.f55970w = uidRxBytes;
            this.f55971x = uidRxBytes;
            return;
        }
        long j11 = this.f55971x;
        if (j11 >= 0 && uidRxBytes >= j11) {
            this.f55972y += uidRxBytes - j11;
        }
        this.f55971x = uidRxBytes;
    }

    /* JADX INFO: renamed from: R */
    private final void m72491R(C23622d c23622d, boolean z11) {
        CacheConfig cacheConfig = new CacheConfig();
        cacheConfig.mEnable = z11;
        cacheConfig.mMaxDurationS = 120L;
        File externalCacheDir = this.f55962o.getExternalCacheDir();
        String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
        String str = absolutePath + File.separator + "video_cache";
        cacheConfig.mDir = str;
        cacheConfig.mMaxSizeMB = c23622d.m93452a();
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setCacheConfig(cacheConfig);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            AliPlayerGlobalSettings.enableLocalCache(z11, 0, str);
            AliPlayerGlobalSettings.setCacheUrlHashCallback(new AliPlayerGlobalSettings.OnGetUrlHashCallback() { // from class: com.transsion.player.orplayer.p
                @Override // com.aliyun.player.AliPlayerGlobalSettings.OnGetUrlHashCallback
                public final String getUrlHashCallback(String str2) {
                    return C16645r.m72492S(str2);
                }
            });
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final String m72492S(String str) {
        try {
            URI uri = new URI(str);
            C27310d.a aVar = C27310d.f83044a;
            String string = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
            Intrinsics.m97801g(string, "toString(...)");
            return aVar.m106396a(string);
        } catch (Exception unused) {
            C27310d.a aVar2 = C27310d.f83044a;
            if (str == null) {
                str = "";
            }
            return aVar2.m106396a(str);
        }
    }

    /* JADX INFO: renamed from: T */
    private final void m72493T(long j11) {
        if (this.f55939A < 0) {
            this.f55939A = RangesKt.m97936f(j11, 0L);
        }
    }

    /* JADX INFO: renamed from: U */
    private final long m72494U() {
        long jF = 0;
        for (b bVar : this.f55973z) {
            jF += RangesKt.m97936f(bVar.m72523a() - bVar.m72524b(), 0L);
        }
        long j11 = this.f55939A;
        if (j11 < 0) {
            return jF;
        }
        long j12 = this.f55940B;
        return j12 > j11 ? jF + (j12 - j11) : jF;
    }

    /* JADX INFO: renamed from: v */
    private final void m72514v() {
        SurfaceHolder holder;
        SurfaceView surfaceView = this.f55946H;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.removeCallback(this.f55944F);
        }
        this.f55946H = null;
        TextureView textureView = this.f55945G;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f55945G = null;
    }

    /* JADX INFO: renamed from: w */
    private final void m72515w(long j11) {
        long j12 = this.f55939A;
        if (j12 < 0) {
            return;
        }
        long jF = RangesKt.m97936f(j11, j12);
        long j13 = this.f55939A;
        if (jF > j13) {
            this.f55973z.add(new b(j13, jF));
        }
        this.f55939A = -1L;
    }

    /* JADX INFO: renamed from: y */
    private final long m72516y() {
        int iE = RangesKt.m97935e(this.f55964q, 0) + RangesKt.m97935e(this.f55965r, 0);
        if (iE > 0) {
            return iE;
        }
        return 800000L;
    }

    /* JADX INFO: renamed from: z */
    private final boolean m72517z(PlayError playError) {
        Integer errorCode;
        Integer errorCode2 = playError.getErrorCode();
        if ((errorCode2 == null || errorCode2.intValue() != 537133057) && ((errorCode = playError.getErrorCode()) == null || errorCode.intValue() != 537133058)) {
            return false;
        }
        if (this.f55941C) {
            C27311e.f83046a.m106401a(this.f55948a, "aliyun 已经切过软解，还是出错不再处理", true);
            return false;
        }
        C27311e.f83046a.m106402c(this.f55948a, "aliyun onError -- 解码失败，强制切到软解", true);
        InterfaceC16633f interfaceC16633f = this.f55951d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onAliyunDecodeErrorChangeSoftwareDecoder(this.f55954g);
        }
        Iterator it = this.f55961n.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onAliyunDecodeErrorChangeSoftwareDecoder(this.f55954g);
        }
        stop();
        reset();
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.enableHardwareDecoder(false);
        }
        C23403e c23403e = this.f55954g;
        if (c23403e != null) {
            setDataSource(c23403e);
            prepare();
        }
        this.f55941C = true;
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m72518Q(InterfaceC16632e interfaceC16632e) {
        this.f55952e = interfaceC16632e;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean addDataSource(C23403e c23403e) {
        return InterfaceC16634g.b.m72451a(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void addPlayerListener(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        if (this.f55961n.contains(listener)) {
            return;
        }
        this.f55961n.add(listener);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void changeTrackSelection(C26907d c26907d, int i11) {
        InterfaceC16634g.b.m72453c(this, c26907d, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void clearScreen() {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.clearScreen();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void clearSurfaceOnly() {
        SurfaceTexture surfaceTexture;
        SurfaceHolder holder;
        Surface surface;
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setSurface(null);
        }
        SurfaceView surfaceView = this.f55946H;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null && (surface = holder.getSurface()) != null) {
            surface.release();
        }
        TextureView textureView = this.f55945G;
        if (textureView != null && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            surfaceTexture.release();
        }
        m72514v();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public C23403e currentMediaSource() {
        return this.f55954g;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void enableHardwareDecoder(boolean z11) {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.enableHardwareDecoder(z11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public Pair getBitrate() {
        return new Pair(Integer.valueOf(this.f55964q), Integer.valueOf(this.f55965r));
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public long getCurrentPosition() {
        return this.f55963p;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public C26906c getCurrentTracks() {
        return InterfaceC16634g.b.m72458h(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public C26905b getCurrentVideoFormat() {
        return InterfaceC16634g.b.m72459i(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public Object getDownloadBitrate() {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            return aliPlayer.getOption(IPlayer.Option.DownloadBitrate);
        }
        return null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public long getDuration() {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            return aliPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public int getVideoHeight() {
        AliPlayer aliPlayer = this.f55949b;
        return aliPlayer != null ? aliPlayer.getVideoHeight() : InterfaceC16634g.b.m72461k(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public int getVideoWidth() {
        AliPlayer aliPlayer = this.f55949b;
        return aliPlayer != null ? aliPlayer.getVideoWidth() : InterfaceC16634g.b.m72462l(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public Float getVolume() {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            return Float.valueOf(aliPlayer.getVolume());
        }
        return null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isComplete() {
        return this.f55958k;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isLoading() {
        return this.f55956i;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isMute() {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            return aliPlayer.isMute();
        }
        return false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isPlaying() {
        return this.f55955h;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isPrepared() {
        return this.f55959l;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void pause() {
        C16630c c16630c = this.f55950c;
        if (c16630c != null) {
            c16630c.m72411g(true);
        }
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.pause();
        }
        C16630c c16630c2 = this.f55950c;
        if (c16630c2 != null) {
            c16630c2.m72408b();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void play() {
        InterfaceC16633f interfaceC16633f = this.f55951d;
        if (interfaceC16633f != null) {
            interfaceC16633f.initPlayer();
        }
        Iterator it = this.f55961n.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).initPlayer();
        }
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.start();
        }
        C16630c c16630c = this.f55950c;
        if (c16630c != null) {
            c16630c.m72411g(false);
        }
        C16630c c16630c2 = this.f55950c;
        if (c16630c2 != null) {
            c16630c2.m72409e();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void prepare() {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.prepare();
        }
        this.f55957j = false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void release() {
        if (this.f55942D) {
            return;
        }
        this.f55942D = true;
        InterfaceC16633f interfaceC16633f = this.f55951d;
        ArrayList arrayList = new ArrayList(this.f55961n);
        this.f55951d = null;
        this.f55961n.clear();
        long jF = RangesKt.m97936f(this.f55940B, this.f55963p);
        this.f55963p = jF;
        this.f55940B = jF;
        m72485K();
        a aVarM72519x = m72519x();
        InterfaceC16632e interfaceC16632e = this.f55952e;
        if (interfaceC16632e != null) {
            interfaceC16632e.mo72132a(aVarM72519x.m72522c(), aVarM72519x.m72521b(), aVarM72519x.m72520a(), this.f55960m);
        }
        this.f55953f = "";
        m72515w(this.f55963p);
        m72490P();
        m72486L("release");
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setOnRenderingStartListener(null);
        }
        AliPlayer aliPlayer2 = this.f55949b;
        if (aliPlayer2 != null) {
            aliPlayer2.setOnVideoSizeChangedListener(null);
        }
        AliPlayer aliPlayer3 = this.f55949b;
        if (aliPlayer3 != null) {
            aliPlayer3.setOnErrorListener(null);
        }
        AliPlayer aliPlayer4 = this.f55949b;
        if (aliPlayer4 != null) {
            aliPlayer4.setOnLoadingStatusListener(null);
        }
        AliPlayer aliPlayer5 = this.f55949b;
        if (aliPlayer5 != null) {
            aliPlayer5.setOnPreparedListener(null);
        }
        AliPlayer aliPlayer6 = this.f55949b;
        if (aliPlayer6 != null) {
            aliPlayer6.setOnInfoListener(null);
        }
        AliPlayer aliPlayer7 = this.f55949b;
        if (aliPlayer7 != null) {
            aliPlayer7.setOnStateChangedListener(null);
        }
        AliPlayer aliPlayer8 = this.f55949b;
        if (aliPlayer8 != null) {
            aliPlayer8.setOnSeekCompleteListener(null);
        }
        AliPlayer aliPlayer9 = this.f55949b;
        if (aliPlayer9 != null) {
            aliPlayer9.release();
        }
        this.f55949b = null;
        if (interfaceC16633f != null) {
            InterfaceC16633f.a.m72443u(interfaceC16633f, null, 1, null);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC16633f.a.m72443u((InterfaceC16633f) it.next(), null, 1, null);
        }
        C16630c c16630c = this.f55950c;
        if (c16630c != null) {
            c16630c.m72408b();
        }
        m72514v();
        this.f55959l = false;
        this.f55941C = false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void release(String str) {
        InterfaceC16634g.b.m72465o(this, str);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean removeDataSource(C23403e c23403e) {
        return InterfaceC16634g.b.m72466p(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void removePlayerListener(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f55961n.remove(listener);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean requestForce() {
        return InterfaceC16634g.b.m72468r(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void reset() {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.stop();
        }
        AliPlayer aliPlayer2 = this.f55949b;
        if (aliPlayer2 != null) {
            aliPlayer2.reset();
        }
        AliPlayer aliPlayer3 = this.f55949b;
        if (aliPlayer3 != null) {
            aliPlayer3.clearScreen();
        }
        C16630c c16630c = this.f55950c;
        if (c16630c != null) {
            c16630c.m72408b();
        }
        if (!this.f55957j) {
            InterfaceC16633f interfaceC16633f = this.f55951d;
            if (interfaceC16633f != null) {
                interfaceC16633f.onPlayerReset();
            }
            Iterator it = this.f55961n.iterator();
            while (it.hasNext()) {
                ((InterfaceC16633f) it.next()).onPlayerReset();
            }
        }
        this.f55957j = true;
        this.f55959l = false;
        this.f55941C = false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void seekTo(long j11) {
        m72515w(this.f55963p);
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setMaxAccurateSeekDelta(150000);
        }
        AliPlayer aliPlayer2 = this.f55949b;
        if (aliPlayer2 != null) {
            aliPlayer2.seekTo(j11, IPlayer.SeekMode.Accurate);
        }
        if (this.f55955h) {
            m72493T(j11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void seekTo(String str, long j11) {
        InterfaceC16634g.b.m72469s(this, str, j11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setAutoPlay(boolean z11) {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setDataSource(C23403e mediaSource) {
        Intrinsics.m97802h(mediaSource, "mediaSource");
        m72487M();
        this.f55968u = 0L;
        this.f55969v = 0L;
        UrlSource urlSource = new UrlSource();
        String strM92935k = mediaSource.m92935k();
        this.f55953f = strM92935k;
        this.f55954g = mediaSource;
        urlSource.setUri(strM92935k);
        InterfaceC16633f interfaceC16633f = this.f55951d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onSetDataSource();
        }
        Iterator it = this.f55961n.iterator();
        while (it.hasNext()) {
            ((InterfaceC16633f) it.next()).onSetDataSource();
        }
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setDataSource(urlSource);
        }
        this.f55959l = false;
        this.f55941C = false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setLooping(boolean z11) {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setLoop(z11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setMute(boolean z11) {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setMute(z11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setPlayerConfig(C23622d vodConfig) {
        Intrinsics.m97802h(vodConfig, "vodConfig");
        AliPlayer aliPlayer = this.f55949b;
        PlayerConfig config = aliPlayer != null ? aliPlayer.getConfig() : null;
        Intrinsics.m97800f(config, "null cannot be cast to non-null type com.aliyun.player.nativeclass.PlayerConfig");
        config.mClearFrameWhenStop = vodConfig.m93453b();
        config.mEnableLocalCache = vodConfig.m93461j();
        config.mPositionTimerIntervalMs = vodConfig.m93462k();
        config.mMaxBufferDuration = vodConfig.m93458g();
        config.mHighBufferDuration = vodConfig.m93457f();
        config.mStartBufferDuration = vodConfig.m93465n();
        config.mNetworkRetryCount = vodConfig.m93464m();
        config.mNetworkTimeout = vodConfig.m93459h();
        config.mDisableAudio = vodConfig.m93454c();
        config.mDisableVideo = vodConfig.m93455d();
        int iM93458g = vodConfig.m93458g();
        Integer numValueOf = Integer.valueOf(iM93458g);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Aliplayer config:");
        sb2.append(numValueOf);
        if (iM93458g > 0) {
            config.mMaxBufferDuration = iM93458g;
        }
        AliPlayer aliPlayer2 = this.f55949b;
        if (aliPlayer2 != null) {
            aliPlayer2.setConfig(config);
        }
        this.f55966s = RangesKt.m97936f(vodConfig.m93458g(), 1L);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setPlayerListener(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f55951d = listener;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setScaleMode(ScaleMode scaleMode) {
        Intrinsics.m97802h(scaleMode, "scaleMode");
        int i11 = c.f55980b[scaleMode.ordinal()];
        if (i11 == 1) {
            AliPlayer aliPlayer = this.f55949b;
            if (aliPlayer != null) {
                aliPlayer.setScaleMode(IPlayer.ScaleMode.SCALE_ASPECT_FILL);
                return;
            }
            return;
        }
        if (i11 == 2) {
            AliPlayer aliPlayer2 = this.f55949b;
            if (aliPlayer2 != null) {
                aliPlayer2.setScaleMode(IPlayer.ScaleMode.SCALE_TO_FILL);
                return;
            }
            return;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AliPlayer aliPlayer3 = this.f55949b;
        if (aliPlayer3 != null) {
            aliPlayer3.setScaleMode(IPlayer.ScaleMode.SCALE_ASPECT_FIT);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setSpeed(float f11) {
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setSpeed(f11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setSurfaceView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        Surface surface;
        AliPlayer aliPlayer;
        SurfaceHolder holder2;
        m72514v();
        this.f55946H = surfaceView;
        Thread threadCurrentThread = Thread.currentThread();
        if (surfaceView != null) {
            this.f55943E = threadCurrentThread instanceof HandlerThread ? new Handler(((HandlerThread) threadCurrentThread).getLooper()) : new Handler(Looper.getMainLooper());
        }
        if (surfaceView != null && (holder2 = surfaceView.getHolder()) != null) {
            holder2.addCallback(this.f55944F);
        }
        if (surfaceView == null || (holder = surfaceView.getHolder()) == null || (surface = holder.getSurface()) == null || !surface.isValid() || (aliPlayer = this.f55949b) == null) {
            return;
        }
        aliPlayer.setSurface(surface);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setTextureView(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        AliPlayer aliPlayer;
        m72514v();
        this.f55945G = textureView;
        Thread threadCurrentThread = Thread.currentThread();
        if (this.f55946H != null) {
            this.f55943E = threadCurrentThread instanceof HandlerThread ? new Handler(((HandlerThread) threadCurrentThread).getLooper()) : new Handler(Looper.getMainLooper());
        }
        if (textureView != null) {
            textureView.setSurfaceTextureListener(this.f55947I);
        }
        if (textureView == null || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        if (!surface.isValid() || (aliPlayer = this.f55949b) == null) {
            return;
        }
        aliPlayer.setSurface(surface);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setVipResolution(boolean z11, int i11) {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setVolume(float f11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setVolume   volume:");
        sb2.append(f11);
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.setVolume(RangesKt.m97941k(f11, 0.0f, 2.0f));
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void stop() {
        this.f55953f = "";
        C16630c c16630c = this.f55950c;
        if (c16630c != null) {
            c16630c.m72411g(true);
        }
        AliPlayer aliPlayer = this.f55949b;
        if (aliPlayer != null) {
            aliPlayer.stop();
        }
        C16630c c16630c2 = this.f55950c;
        if (c16630c2 != null) {
            c16630c2.m72408b();
        }
        this.f55941C = false;
    }

    /* JADX INFO: renamed from: x */
    public final a m72519x() {
        Double dValueOf;
        long jM72494U = (long) ((m72494U() / 1000.0d) * (m72516y() / 8.0d));
        if (jM72494U <= 0) {
            dValueOf = null;
        } else {
            long j11 = this.f55972y;
            dValueOf = Double.valueOf((j11 - jM72494U) / j11);
        }
        if (dValueOf != null && dValueOf.doubleValue() < 0.0d) {
            dValueOf = Double.valueOf(0.0d);
        }
        return new a(this.f55972y, jM72494U, dValueOf);
    }
}
