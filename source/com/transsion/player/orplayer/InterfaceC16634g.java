package com.transsion.player.orplayer;

import android.content.Context;
import android.view.SurfaceView;
import android.view.TextureView;
import com.transsion.player.p1003enum.ScaleMode;
import fo.C23403e;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import no.InterfaceC26075z;
import p438go.C23622d;
import p683po.C26905b;
import p683po.C26906c;
import p683po.C26907d;

/* JADX INFO: renamed from: com.transsion.player.orplayer.g */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC16634g {

    /* JADX INFO: renamed from: com.transsion.player.orplayer.g$a */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Context f55928a;

        /* JADX INFO: renamed from: b */
        private C23622d f55929b;

        public a(Context context) {
            Intrinsics.m97802h(context, "context");
            this.f55928a = context;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC16634g m72449a() {
            return new C16645r(this.f55928a, this.f55929b);
        }

        /* JADX INFO: renamed from: b */
        public final a m72450b(C23622d config) {
            Intrinsics.m97802h(config, "config");
            this.f55929b = config;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.orplayer.g$b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static boolean m72451a(InterfaceC16634g interfaceC16634g, C23403e mediaSource) {
            Intrinsics.m97802h(mediaSource, "mediaSource");
            return false;
        }

        /* JADX INFO: renamed from: b */
        public static void m72452b(InterfaceC16634g interfaceC16634g, InterfaceC16633f listener) {
            Intrinsics.m97802h(listener, "listener");
        }

        /* JADX INFO: renamed from: c */
        public static void m72453c(InterfaceC16634g interfaceC16634g, C26907d mediaTrackGroup, int i11) {
            Intrinsics.m97802h(mediaTrackGroup, "mediaTrackGroup");
        }

        /* JADX INFO: renamed from: d */
        public static void m72454d(InterfaceC16634g interfaceC16634g) {
        }

        /* JADX INFO: renamed from: e */
        public static void m72455e(InterfaceC16634g interfaceC16634g) {
        }

        /* JADX INFO: renamed from: f */
        public static C23403e m72456f(InterfaceC16634g interfaceC16634g) {
            return null;
        }

        /* JADX INFO: renamed from: g */
        public static long m72457g(InterfaceC16634g interfaceC16634g) {
            return 0L;
        }

        /* JADX INFO: renamed from: h */
        public static C26906c m72458h(InterfaceC16634g interfaceC16634g) {
            return null;
        }

        /* JADX INFO: renamed from: i */
        public static C26905b m72459i(InterfaceC16634g interfaceC16634g) {
            return null;
        }

        /* JADX INFO: renamed from: j */
        public static Object m72460j(InterfaceC16634g interfaceC16634g) {
            return null;
        }

        /* JADX INFO: renamed from: k */
        public static int m72461k(InterfaceC16634g interfaceC16634g) {
            return 0;
        }

        /* JADX INFO: renamed from: l */
        public static int m72462l(InterfaceC16634g interfaceC16634g) {
            return 0;
        }

        /* JADX INFO: renamed from: m */
        public static boolean m72463m(InterfaceC16634g interfaceC16634g) {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public static boolean m72464n(InterfaceC16634g interfaceC16634g) {
            return false;
        }

        /* JADX INFO: renamed from: o */
        public static void m72465o(InterfaceC16634g interfaceC16634g, String str) {
        }

        /* JADX INFO: renamed from: p */
        public static boolean m72466p(InterfaceC16634g interfaceC16634g, C23403e mediaSource) {
            Intrinsics.m97802h(mediaSource, "mediaSource");
            return false;
        }

        /* JADX INFO: renamed from: q */
        public static void m72467q(InterfaceC16634g interfaceC16634g, InterfaceC16633f listener) {
            Intrinsics.m97802h(listener, "listener");
        }

        /* JADX INFO: renamed from: r */
        public static boolean m72468r(InterfaceC16634g interfaceC16634g) {
            return false;
        }

        /* JADX INFO: renamed from: s */
        public static void m72469s(InterfaceC16634g interfaceC16634g, String uuid, long j11) {
            Intrinsics.m97802h(uuid, "uuid");
        }

        /* JADX INFO: renamed from: t */
        public static void m72470t(InterfaceC16634g interfaceC16634g) {
        }

        /* JADX INFO: renamed from: u */
        public static void m72471u(InterfaceC16634g interfaceC16634g, InterfaceC26075z listener) {
            Intrinsics.m97802h(listener, "listener");
        }

        /* JADX INFO: renamed from: v */
        public static void m72472v(InterfaceC16634g interfaceC16634g, boolean z11) {
        }

        /* JADX INFO: renamed from: w */
        public static void m72473w(InterfaceC16634g interfaceC16634g, C23622d vodConfig) {
            Intrinsics.m97802h(vodConfig, "vodConfig");
        }

        /* JADX INFO: renamed from: x */
        public static void m72474x(InterfaceC16634g interfaceC16634g, ScaleMode scaleMode) {
            Intrinsics.m97802h(scaleMode, "scaleMode");
        }
    }

    boolean addDataSource(C23403e c23403e);

    void addPlayerListener(InterfaceC16633f interfaceC16633f);

    void changeTrackSelection(C26907d c26907d, int i11);

    void clearScreen();

    void clearSurfaceOnly();

    C23403e currentMediaSource();

    void enableHardwareDecoder(boolean z11);

    Pair getBitrate();

    long getCurrentPosition();

    C26906c getCurrentTracks();

    C26905b getCurrentVideoFormat();

    Object getDownloadBitrate();

    long getDuration();

    int getVideoHeight();

    int getVideoWidth();

    Float getVolume();

    boolean isComplete();

    boolean isLoading();

    boolean isMute();

    boolean isPlaying();

    boolean isPrepared();

    void pause();

    void play();

    void prepare();

    void release();

    void release(String str);

    boolean removeDataSource(C23403e c23403e);

    void removePlayerListener(InterfaceC16633f interfaceC16633f);

    boolean requestForce();

    void reset();

    void seekTo(long j11);

    void seekTo(String str, long j11);

    void setAutoPlay(boolean z11);

    void setDataSource(C23403e c23403e);

    void setLooping(boolean z11);

    void setMute(boolean z11);

    void setPlayerConfig(C23622d c23622d);

    void setPlayerListener(InterfaceC16633f interfaceC16633f);

    void setScaleMode(ScaleMode scaleMode);

    void setSpeed(float f11);

    void setSurfaceView(SurfaceView surfaceView);

    void setTextureView(TextureView textureView);

    void setVipResolution(boolean z11, int i11);

    void setVolume(float f11);

    void stop();
}
