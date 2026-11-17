package com.transsion.player.orplayer;

import com.transsion.player.orplayer.global.TnPlayerType;
import fo.C23403e;
import kotlin.jvm.internal.Intrinsics;
import p683po.C26906c;
import p683po.C26907d;

/* JADX INFO: renamed from: com.transsion.player.orplayer.f */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC16633f {

    /* JADX INFO: renamed from: com.transsion.player.orplayer.f$a */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        /* JADX INFO: renamed from: A */
        public static void m72412A(InterfaceC16633f interfaceC16633f) {
        }

        /* JADX INFO: renamed from: B */
        public static void m72413B(InterfaceC16633f interfaceC16633f) {
        }

        /* JADX INFO: renamed from: C */
        public static void m72414C(InterfaceC16633f interfaceC16633f, int i11) {
        }

        /* JADX INFO: renamed from: D */
        public static void m72415D(InterfaceC16633f interfaceC16633f, C26906c tracks) {
            Intrinsics.m97802h(tracks, "tracks");
        }

        /* JADX INFO: renamed from: E */
        public static void m72416E(InterfaceC16633f interfaceC16633f, int i11) {
        }

        /* JADX INFO: renamed from: F */
        public static void m72417F(InterfaceC16633f interfaceC16633f, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: G */
        public static /* synthetic */ void m72418G(InterfaceC16633f interfaceC16633f, C23403e c23403e, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVideoPause");
            }
            if ((i11 & 1) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onVideoPause(c23403e);
        }

        /* JADX INFO: renamed from: H */
        public static void m72419H(InterfaceC16633f interfaceC16633f, int i11, int i12) {
        }

        /* JADX INFO: renamed from: I */
        public static void m72420I(InterfaceC16633f interfaceC16633f, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: J */
        public static /* synthetic */ void m72421J(InterfaceC16633f interfaceC16633f, C23403e c23403e, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVideoStart");
            }
            if ((i11 & 1) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onVideoStart(c23403e);
        }

        /* JADX INFO: renamed from: K */
        public static void m72422K(InterfaceC16633f interfaceC16633f) {
        }

        /* JADX INFO: renamed from: a */
        public static void m72423a(InterfaceC16633f interfaceC16633f, boolean z11, int i11, int i12, C26907d dashVideoTracksGroup) {
            Intrinsics.m97802h(dashVideoTracksGroup, "dashVideoTracksGroup");
        }

        /* JADX INFO: renamed from: b */
        public static void m72424b(InterfaceC16633f interfaceC16633f) {
        }

        /* JADX INFO: renamed from: c */
        public static void m72425c(InterfaceC16633f interfaceC16633f, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: d */
        public static void m72426d(InterfaceC16633f interfaceC16633f, long j11, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: e */
        public static void m72427e(InterfaceC16633f interfaceC16633f, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m72428f(InterfaceC16633f interfaceC16633f, C23403e c23403e, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCompletion");
            }
            if ((i11 & 1) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onCompletion(c23403e);
        }

        /* JADX INFO: renamed from: g */
        public static void m72429g(InterfaceC16633f interfaceC16633f, boolean z11) {
        }

        /* JADX INFO: renamed from: h */
        public static void m72430h(InterfaceC16633f interfaceC16633f, boolean z11) {
        }

        /* JADX INFO: renamed from: i */
        public static void m72431i(InterfaceC16633f interfaceC16633f, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m72432j(InterfaceC16633f interfaceC16633f, C23403e c23403e, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoadingBegin");
            }
            if ((i11 & 1) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onLoadingBegin(c23403e);
        }

        /* JADX INFO: renamed from: k */
        public static void m72433k(InterfaceC16633f interfaceC16633f, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: l */
        public static /* synthetic */ void m72434l(InterfaceC16633f interfaceC16633f, C23403e c23403e, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoadingEnd");
            }
            if ((i11 & 1) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onLoadingEnd(c23403e);
        }

        /* JADX INFO: renamed from: m */
        public static void m72435m(InterfaceC16633f interfaceC16633f, int i11, float f11, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m72436n(InterfaceC16633f interfaceC16633f, int i11, float f11, C23403e c23403e, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLoadingProgress");
            }
            if ((i12 & 4) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onLoadingProgress(i11, f11, c23403e);
        }

        /* JADX INFO: renamed from: o */
        public static void m72437o(InterfaceC16633f interfaceC16633f) {
        }

        /* JADX INFO: renamed from: p */
        public static void m72438p(InterfaceC16633f interfaceC16633f, String str) {
        }

        /* JADX INFO: renamed from: q */
        public static void m72439q(InterfaceC16633f interfaceC16633f, PlayError errorInfo, C23403e c23403e) {
            Intrinsics.m97802h(errorInfo, "errorInfo");
        }

        /* JADX INFO: renamed from: r */
        public static /* synthetic */ void m72440r(InterfaceC16633f interfaceC16633f, PlayError playError, C23403e c23403e, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPlayError");
            }
            if ((i11 & 2) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onPlayError(playError, c23403e);
        }

        /* JADX INFO: renamed from: s */
        public static void m72441s(InterfaceC16633f interfaceC16633f, TnPlayerType errorType, C23403e c23403e) {
            Intrinsics.m97802h(errorType, "errorType");
        }

        /* JADX INFO: renamed from: t */
        public static void m72442t(InterfaceC16633f interfaceC16633f, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m72443u(InterfaceC16633f interfaceC16633f, C23403e c23403e, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPlayerRelease");
            }
            if ((i11 & 1) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onPlayerRelease(c23403e);
        }

        /* JADX INFO: renamed from: v */
        public static void m72444v(InterfaceC16633f interfaceC16633f) {
        }

        /* JADX INFO: renamed from: w */
        public static void m72445w(InterfaceC16633f interfaceC16633f, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: x */
        public static /* synthetic */ void m72446x(InterfaceC16633f interfaceC16633f, C23403e c23403e, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPrepare");
            }
            if ((i11 & 1) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onPrepare(c23403e);
        }

        /* JADX INFO: renamed from: y */
        public static void m72447y(InterfaceC16633f interfaceC16633f, long j11, C23403e c23403e) {
        }

        /* JADX INFO: renamed from: z */
        public static /* synthetic */ void m72448z(InterfaceC16633f interfaceC16633f, long j11, C23403e c23403e, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onProgress");
            }
            if ((i11 & 2) != 0) {
                c23403e = null;
            }
            interfaceC16633f.onProgress(j11, c23403e);
        }
    }

    void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d);

    void initPlayer();

    void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e);

    void onBufferedPosition(long j11, C23403e c23403e);

    void onCompletion(C23403e c23403e);

    void onFocusChange(boolean z11);

    void onIsPlayingChanged(boolean z11);

    void onLoadingBegin(C23403e c23403e);

    void onLoadingEnd(C23403e c23403e);

    void onLoadingProgress(int i11, float f11, C23403e c23403e);

    void onLoopingStart();

    void onMediaItemTransition(String str);

    void onPlayError(PlayError playError, C23403e c23403e);

    void onPlayerRelease(C23403e c23403e);

    void onPlayerReset();

    void onPrepare(C23403e c23403e);

    void onProgress(long j11, C23403e c23403e);

    void onRenderFirstFrame();

    void onSetDataSource();

    void onTracksAudioBitrateChange(int i11);

    void onTracksChange(C26906c c26906c);

    void onTracksVideoBitrateChange(int i11);

    void onVideoPause(C23403e c23403e);

    void onVideoSizeChanged(int i11, int i12);

    void onVideoStart(C23403e c23403e);

    void setOnSeekCompleteListener();
}
