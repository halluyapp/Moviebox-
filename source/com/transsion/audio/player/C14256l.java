package com.transsion.audio.player;

import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import com.aliyun.player.AliPlayer;
import com.aliyun.player.AliPlayerFactory;
import com.aliyun.player.IPlayer;
import com.aliyun.player.bean.ErrorCode;
import com.aliyun.player.bean.ErrorInfo;
import com.aliyun.player.bean.InfoBean;
import com.aliyun.player.bean.InfoCode;
import com.aliyun.player.nativeclass.CacheConfig;
import com.aliyun.player.nativeclass.TrackInfo;
import com.aliyun.player.source.UrlSource;
import com.blankj.utilcode.util.Utils;
import com.transsion.player.orplayer.C16630c;
import com.transsion.player.orplayer.InterfaceC16631d;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.p1003enum.ScaleMode;
import fo.C23403e;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mh.C25835b;
import p438go.C23620b;
import p438go.C23622d;
import p683po.C26905b;
import p683po.C26906c;
import p683po.C26907d;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.audio.player.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C14256l implements InterfaceC16634g {

    /* JADX INFO: renamed from: a */
    private final String f50495a = "OrAudioPlayer";

    /* JADX INFO: renamed from: b */
    private AliPlayer f50496b;

    /* JADX INFO: renamed from: c */
    private C16630c f50497c;

    /* JADX INFO: renamed from: d */
    private InterfaceC16633f f50498d;

    /* JADX INFO: renamed from: e */
    private boolean f50499e;

    /* JADX INFO: renamed from: f */
    private boolean f50500f;

    /* JADX INFO: renamed from: com.transsion.audio.player.l$a */
    public static final class a implements InterfaceC16631d {
        a() {
        }

        @Override // com.transsion.player.orplayer.InterfaceC16631d
        public boolean isMute() {
            AliPlayer aliPlayer = C14256l.this.f50496b;
            if (aliPlayer != null) {
                return aliPlayer.isMute();
            }
            return false;
        }

        @Override // com.transsion.player.orplayer.InterfaceC16631d
        public void pause() {
            AliPlayer aliPlayer = C14256l.this.f50496b;
            if (aliPlayer != null) {
                aliPlayer.pause();
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16631d
        public void play() {
            AliPlayer aliPlayer = C14256l.this.f50496b;
            if (aliPlayer != null) {
                aliPlayer.start();
            }
        }

        @Override // com.transsion.player.orplayer.InterfaceC16631d
        public void setVolume(float f11) {
            AliPlayer aliPlayer = C14256l.this.f50496b;
            if (aliPlayer != null) {
                aliPlayer.setVolume(f11);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.player.l$b */
    public static final class b implements IPlayer.OnLoadingStatusListener {
        b() {
        }

        @Override // com.aliyun.player.IPlayer.OnLoadingStatusListener
        public void onLoadingBegin() {
            C26866a.a.m104898f(C26866a.f81698a, C14256l.this.f50495a, "onLoadingBegin--->", false, 4, null);
            InterfaceC16633f interfaceC16633f = C14256l.this.f50498d;
            if (interfaceC16633f != null) {
                InterfaceC16633f.a.m72432j(interfaceC16633f, null, 1, null);
            }
        }

        @Override // com.aliyun.player.IPlayer.OnLoadingStatusListener
        public void onLoadingEnd() {
            C26866a.a.m104898f(C26866a.f81698a, C14256l.this.f50495a, "onLoadingEnd----->", false, 4, null);
            InterfaceC16633f interfaceC16633f = C14256l.this.f50498d;
            if (interfaceC16633f != null) {
                InterfaceC16633f.a.m72434l(interfaceC16633f, null, 1, null);
            }
        }

        @Override // com.aliyun.player.IPlayer.OnLoadingStatusListener
        public void onLoadingProgress(int i11, float f11) {
            C26866a.a.m104898f(C26866a.f81698a, C14256l.this.f50495a, "onLoadingProgress percent:" + i11 + ",netSpeed:" + f11, false, 4, null);
            InterfaceC16633f interfaceC16633f = C14256l.this.f50498d;
            if (interfaceC16633f != null) {
                InterfaceC16633f.a.m72436n(interfaceC16633f, i11, f11, null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.player.l$c */
    public static final class c implements IPlayer.OnTrackChangedListener {
        c() {
        }

        @Override // com.aliyun.player.IPlayer.OnTrackChangedListener
        public void onChangedFail(TrackInfo trackInfo, ErrorInfo errorInfo) {
        }

        @Override // com.aliyun.player.IPlayer.OnTrackChangedListener
        public void onChangedSuccess(TrackInfo trackInfo) {
        }
    }

    public C14256l(Context context) {
        m64616o(context);
    }

    /* JADX INFO: renamed from: A */
    private final void m64603A() {
        if (C23620b.f72130a.m93449c()) {
            CacheConfig cacheConfig = new CacheConfig();
            cacheConfig.mEnable = true;
            cacheConfig.mMaxDurationS = 1200L;
            File externalCacheDir = Utils.m27275a().getExternalCacheDir();
            String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
            cacheConfig.mDir = absolutePath + File.separator + "video_cache";
            cacheConfig.mMaxSizeMB = 50;
            AliPlayer aliPlayer = this.f50496b;
            if (aliPlayer != null) {
                aliPlayer.setCacheConfig(cacheConfig);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m64616o(Context context) {
        if (this.f50496b == null) {
            AliPlayer aliPlayerCreateAliPlayer = AliPlayerFactory.createAliPlayer(context);
            aliPlayerCreateAliPlayer.setTraceId(C25835b.f78806a.m101493h());
            this.f50496b = aliPlayerCreateAliPlayer;
            m64617p();
            m64603A();
            m64619r();
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m64617p() {
        this.f50497c = new C16630c(new a(), new Function1() { // from class: com.transsion.audio.player.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14256l.m64618q(this.f50488a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Unit m64618q(C14256l c14256l, boolean z11) {
        InterfaceC16633f interfaceC16633f = c14256l.f50498d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onFocusChange(z11);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: r */
    private final void m64619r() {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.setOnCompletionListener(new IPlayer.OnCompletionListener() { // from class: com.transsion.audio.player.d
                @Override // com.aliyun.player.IPlayer.OnCompletionListener
                public final void onCompletion() {
                    C14256l.m64620s();
                }
            });
        }
        AliPlayer aliPlayer2 = this.f50496b;
        if (aliPlayer2 != null) {
            aliPlayer2.setOnErrorListener(new IPlayer.OnErrorListener() { // from class: com.transsion.audio.player.e
                @Override // com.aliyun.player.IPlayer.OnErrorListener
                public final void onError(ErrorInfo errorInfo) {
                    C14256l.m64621t(this.f50489a, errorInfo);
                }
            });
        }
        AliPlayer aliPlayer3 = this.f50496b;
        if (aliPlayer3 != null) {
            aliPlayer3.setOnPreparedListener(new IPlayer.OnPreparedListener() { // from class: com.transsion.audio.player.f
                @Override // com.aliyun.player.IPlayer.OnPreparedListener
                public final void onPrepared() {
                    C14256l.m64622u(this.f50490a);
                }
            });
        }
        AliPlayer aliPlayer4 = this.f50496b;
        if (aliPlayer4 != null) {
            aliPlayer4.setOnVideoSizeChangedListener(new IPlayer.OnVideoSizeChangedListener() { // from class: com.transsion.audio.player.g
                @Override // com.aliyun.player.IPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(int i11, int i12) {
                    C14256l.m64623v(this.f50491a, i11, i12);
                }
            });
        }
        AliPlayer aliPlayer5 = this.f50496b;
        if (aliPlayer5 != null) {
            aliPlayer5.setOnRenderingStartListener(new IPlayer.OnRenderingStartListener() { // from class: com.transsion.audio.player.h
                @Override // com.aliyun.player.IPlayer.OnRenderingStartListener
                public final void onRenderingStart() {
                    C14256l.m64624w(this.f50492a);
                }
            });
        }
        AliPlayer aliPlayer6 = this.f50496b;
        if (aliPlayer6 != null) {
            aliPlayer6.setOnInfoListener(new IPlayer.OnInfoListener() { // from class: com.transsion.audio.player.i
                @Override // com.aliyun.player.IPlayer.OnInfoListener
                public final void onInfo(InfoBean infoBean) {
                    C14256l.m64625x(this.f50493a, infoBean);
                }
            });
        }
        AliPlayer aliPlayer7 = this.f50496b;
        if (aliPlayer7 != null) {
            aliPlayer7.setOnLoadingStatusListener(new b());
        }
        AliPlayer aliPlayer8 = this.f50496b;
        if (aliPlayer8 != null) {
            aliPlayer8.setOnSeekCompleteListener(new IPlayer.OnSeekCompleteListener() { // from class: com.transsion.audio.player.j
                @Override // com.aliyun.player.IPlayer.OnSeekCompleteListener
                public final void onSeekComplete() {
                    C14256l.m64626y();
                }
            });
        }
        AliPlayer aliPlayer9 = this.f50496b;
        if (aliPlayer9 != null) {
            aliPlayer9.setOnTrackChangedListener(new c());
        }
        AliPlayer aliPlayer10 = this.f50496b;
        if (aliPlayer10 != null) {
            aliPlayer10.setOnStateChangedListener(new IPlayer.OnStateChangedListener() { // from class: com.transsion.audio.player.k
                @Override // com.aliyun.player.IPlayer.OnStateChangedListener
                public final void onStateChanged(int i11) {
                    C14256l.m64627z(this.f50494a, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m64620s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m64621t(C14256l c14256l, ErrorInfo errorInfo) {
        C26866a.a.m104898f(C26866a.f81698a, c14256l.f50495a, "onError code:" + errorInfo.getCode() + ",msg:" + errorInfo.getMsg(), false, 4, null);
        PlayError playError = new PlayError(Integer.valueOf(errorInfo.getCode().getValue()), errorInfo.getMsg());
        InterfaceC16633f interfaceC16633f = c14256l.f50498d;
        if (interfaceC16633f != null) {
            InterfaceC16633f.a.m72440r(interfaceC16633f, playError, null, 2, null);
        }
        if (errorInfo.getCode() == ErrorCode.ERROR_DECODE_AUDIO) {
            c14256l.prepare();
            c14256l.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m64622u(C14256l c14256l) {
        InterfaceC16633f interfaceC16633f = c14256l.f50498d;
        if (interfaceC16633f != null) {
            InterfaceC16633f.a.m72446x(interfaceC16633f, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m64623v(C14256l c14256l, int i11, int i12) {
        InterfaceC16633f interfaceC16633f = c14256l.f50498d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onVideoSizeChanged(i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m64624w(C14256l c14256l) {
        InterfaceC16633f interfaceC16633f = c14256l.f50498d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onRenderFirstFrame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m64625x(C14256l c14256l, InfoBean infoBean) {
        if (infoBean.getCode() == InfoCode.CurrentPosition) {
            long extraValue = infoBean.getExtraValue();
            InterfaceC16633f interfaceC16633f = c14256l.f50498d;
            if (interfaceC16633f != null) {
                InterfaceC16633f.a.m72448z(interfaceC16633f, extraValue, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m64626y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m64627z(C14256l c14256l, int i11) {
        InterfaceC16633f interfaceC16633f;
        C26866a.a.m104898f(C26866a.f81698a, c14256l.f50495a, "setOnStateChangedListener status:" + i11, false, 4, null);
        boolean z11 = i11 == 3;
        c14256l.f50499e = z11;
        InterfaceC16633f interfaceC16633f2 = c14256l.f50498d;
        if (interfaceC16633f2 != null) {
            interfaceC16633f2.onIsPlayingChanged(z11);
        }
        c14256l.f50500f = i11 == 6;
        C16630c c16630c = c14256l.f50497c;
        if (c16630c != null) {
            c16630c.m72410f(c14256l.f50499e);
        }
        if (i11 == 3) {
            InterfaceC16633f interfaceC16633f3 = c14256l.f50498d;
            if (interfaceC16633f3 != null) {
                InterfaceC16633f.a.m72421J(interfaceC16633f3, null, 1, null);
                return;
            }
            return;
        }
        if (i11 == 4 || i11 == 5) {
            InterfaceC16633f interfaceC16633f4 = c14256l.f50498d;
            if (interfaceC16633f4 != null) {
                InterfaceC16633f.a.m72418G(interfaceC16633f4, null, 1, null);
                return;
            }
            return;
        }
        if (i11 == 6 && (interfaceC16633f = c14256l.f50498d) != null) {
            InterfaceC16633f.a.m72428f(interfaceC16633f, null, 1, null);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean addDataSource(C23403e c23403e) {
        return InterfaceC16634g.b.m72451a(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void addPlayerListener(InterfaceC16633f interfaceC16633f) {
        InterfaceC16634g.b.m72452b(this, interfaceC16633f);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void changeTrackSelection(C26907d c26907d, int i11) {
        InterfaceC16634g.b.m72453c(this, c26907d, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void clearScreen() {
        InterfaceC16634g.b.m72454d(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void clearSurfaceOnly() {
        InterfaceC16634g.b.m72455e(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public C23403e currentMediaSource() {
        return InterfaceC16634g.b.m72456f(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void enableHardwareDecoder(boolean z11) {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.enableHardwareDecoder(z11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public Pair getBitrate() {
        return new Pair(0, 0);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public long getCurrentPosition() {
        return InterfaceC16634g.b.m72457g(this);
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
        return InterfaceC16634g.b.m72460j(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public long getDuration() {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            return aliPlayer.getDuration();
        }
        return 0L;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public int getVideoHeight() {
        return InterfaceC16634g.b.m72461k(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public int getVideoWidth() {
        return InterfaceC16634g.b.m72462l(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public Float getVolume() {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            return Float.valueOf(aliPlayer.getVolume());
        }
        return null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isComplete() {
        return this.f50500f;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isLoading() {
        return InterfaceC16634g.b.m72463m(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isMute() {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            return aliPlayer.isMute();
        }
        return false;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isPlaying() {
        return this.f50499e;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean isPrepared() {
        return InterfaceC16634g.b.m72464n(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void pause() {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.pause();
        }
        C16630c c16630c = this.f50497c;
        if (c16630c != null) {
            c16630c.m72411g(true);
        }
        C16630c c16630c2 = this.f50497c;
        if (c16630c2 != null) {
            c16630c2.m72408b();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void play() {
        C16630c c16630c;
        InterfaceC16633f interfaceC16633f = this.f50498d;
        if (interfaceC16633f != null) {
            interfaceC16633f.initPlayer();
        }
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.start();
        }
        C16630c c16630c2 = this.f50497c;
        if (c16630c2 != null) {
            c16630c2.m72411g(false);
        }
        if (isMute() || (c16630c = this.f50497c) == null) {
            return;
        }
        c16630c.m72409e();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void prepare() {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.prepare();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void release() {
        InterfaceC16633f interfaceC16633f = this.f50498d;
        if (interfaceC16633f != null) {
            InterfaceC16633f.a.m72443u(interfaceC16633f, null, 1, null);
        }
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.release();
        }
        this.f50496b = null;
        C16630c c16630c = this.f50497c;
        if (c16630c != null) {
            c16630c.m72408b();
        }
        this.f50497c = null;
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
    public void removePlayerListener(InterfaceC16633f interfaceC16633f) {
        InterfaceC16634g.b.m72467q(this, interfaceC16633f);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public boolean requestForce() {
        return InterfaceC16634g.b.m72468r(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void reset() {
        InterfaceC16633f interfaceC16633f = this.f50498d;
        if (interfaceC16633f != null) {
            interfaceC16633f.onPlayerReset();
        }
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.reset();
        }
        C16630c c16630c = this.f50497c;
        if (c16630c != null) {
            c16630c.m72408b();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void seekTo(long j11) {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.setMaxAccurateSeekDelta(150000);
        }
        AliPlayer aliPlayer2 = this.f50496b;
        if (aliPlayer2 != null) {
            aliPlayer2.seekTo(j11, IPlayer.SeekMode.Accurate);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void seekTo(String str, long j11) {
        InterfaceC16634g.b.m72469s(this, str, j11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setAutoPlay(boolean z11) {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.setAutoPlay(z11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setDataSource(C23403e mediaSource) {
        Intrinsics.m97802h(mediaSource, "mediaSource");
        UrlSource urlSource = new UrlSource();
        urlSource.setUri(mediaSource.m92935k());
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.setDataSource(urlSource);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setLooping(boolean z11) {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.setLoop(z11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setMute(boolean z11) {
        InterfaceC16634g.b.m72472v(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setPlayerConfig(C23622d c23622d) {
        InterfaceC16634g.b.m72473w(this, c23622d);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setPlayerListener(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f50498d = listener;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setScaleMode(ScaleMode scaleMode) {
        InterfaceC16634g.b.m72474x(this, scaleMode);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setSpeed(float f11) {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.setSpeed(f11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setSurfaceView(SurfaceView surfaceView) {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setTextureView(TextureView textureView) {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setVipResolution(boolean z11, int i11) {
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void setVolume(float f11) {
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.setVolume(f11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16634g
    public void stop() {
        C16630c c16630c;
        AliPlayer aliPlayer = this.f50496b;
        if (aliPlayer != null) {
            aliPlayer.stop();
        }
        C16630c c16630c2 = this.f50497c;
        if (c16630c2 != null) {
            c16630c2.m72411g(true);
        }
        if (isMute() || (c16630c = this.f50497c) == null) {
            return;
        }
        c16630c.m72408b();
    }
}
