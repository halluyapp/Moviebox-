package com.transsion.audio.player;

import android.text.TextUtils;
import com.blankj.utilcode.util.Utils;
import com.transsion.audio.view.C14266d;
import com.transsion.audio.viewmodel.HistoryListManager;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import fo.C23403e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p683po.C26906c;
import p683po.C26907d;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioPlayer {

    /* JADX INFO: renamed from: i */
    public static final C14244a f50463i = new C14244a(null);

    /* JADX INFO: renamed from: j */
    private static final Lazy f50464j = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.audio.player.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AudioPlayer.m64571x();
        }
    });

    /* JADX INFO: renamed from: b */
    private InterfaceC16634g f50466b;

    /* JADX INFO: renamed from: c */
    private C14245a f50467c;

    /* JADX INFO: renamed from: d */
    private long f50468d;

    /* JADX INFO: renamed from: e */
    private AudioBean f50469e;

    /* JADX INFO: renamed from: f */
    private AudioBean f50470f;

    /* JADX INFO: renamed from: a */
    private long f50465a = 1;

    /* JADX INFO: renamed from: g */
    private List f50471g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private String f50472h = "";

    /* JADX INFO: renamed from: com.transsion.audio.player.AudioPlayer$a */
    public static final class C14244a {
        private C14244a() {
        }

        public /* synthetic */ C14244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AudioPlayer m64593a() {
            return (AudioPlayer) AudioPlayer.f50464j.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m64547A(boolean z11) {
        for (InterfaceC16633f interfaceC16633f : this.f50471g) {
            if (interfaceC16633f != null) {
                interfaceC16633f.onIsPlayingChanged(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final void m64548B(C23403e c23403e) {
        for (InterfaceC16633f interfaceC16633f : this.f50471g) {
            if (interfaceC16633f != null) {
                interfaceC16633f.onLoadingBegin(c23403e);
            }
        }
        C14245a c14245a = this.f50467c;
        if (c14245a != null) {
            c14245a.m64596c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final void m64549C(C23403e c23403e) {
        for (InterfaceC16633f interfaceC16633f : this.f50471g) {
            if (interfaceC16633f != null) {
                interfaceC16633f.onLoadingEnd(c23403e);
            }
        }
        C14245a c14245a = this.f50467c;
        if (c14245a != null) {
            c14245a.m64597d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final void m64550D(int i11, float f11, C23403e c23403e) {
        for (InterfaceC16633f interfaceC16633f : this.f50471g) {
            if (interfaceC16633f != null) {
                interfaceC16633f.onLoadingProgress(i11, f11, c23403e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m64551E(C23403e c23403e) {
        AudioBean audioBean = this.f50469e;
        if (audioBean == null || audioBean.getStatus() != 6) {
            C14266d.m64662k().m64673q(4);
            m64568n(4);
            for (InterfaceC16633f interfaceC16633f : this.f50471g) {
                if (interfaceC16633f != null) {
                    interfaceC16633f.onVideoPause(c23403e);
                }
            }
            C14245a c14245a = this.f50467c;
            if (c14245a != null) {
                c14245a.m64601h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m64552F(C23403e c23403e) {
        C14266d.m64662k().m64673q(3);
        m64568n(3);
        for (InterfaceC16633f interfaceC16633f : this.f50471g) {
            if (interfaceC16633f != null) {
                interfaceC16633f.onVideoStart(c23403e);
            }
        }
        C14245a c14245a = this.f50467c;
        if (c14245a != null) {
            c14245a.m64602i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final void m64553H(PlayError playError, C23403e c23403e) {
        m64568n(7);
        for (InterfaceC16633f interfaceC16633f : this.f50471g) {
            if (interfaceC16633f != null) {
                interfaceC16633f.onPlayError(playError, c23403e);
            }
        }
        C14245a c14245a = this.f50467c;
        if (c14245a != null) {
            c14245a.m64598e(playError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m64554I(C23403e c23403e) {
        m64568n(0);
        C14266d.m64662k().m64673q(0);
        for (InterfaceC16633f interfaceC16633f : this.f50471g) {
            if (interfaceC16633f != null) {
                interfaceC16633f.onPlayerRelease(c23403e);
            }
        }
        C14245a c14245a = this.f50467c;
        if (c14245a != null) {
            c14245a.m64595b();
        }
        this.f50467c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final void m64555M(long j11, C23403e c23403e) {
        C14266d.m64662k().m64672p(Long.valueOf(j11), Long.valueOf(this.f50465a));
        AudioBean audioBean = this.f50469e;
        if (audioBean != null) {
            audioBean.setReadProcess(Long.valueOf(j11));
        }
        if (System.currentTimeMillis() - this.f50468d > 1000) {
            for (InterfaceC16633f interfaceC16633f : this.f50471g) {
                if (interfaceC16633f != null) {
                    interfaceC16633f.onProgress(j11, c23403e);
                }
            }
            AudioBean audioBean2 = this.f50469e;
            if (audioBean2 != null) {
                HistoryListManager.f50535e.m64709b().m64707w(audioBean2);
            }
            this.f50468d = System.currentTimeMillis();
            String str = this.f50472h;
            AudioBean audioBean3 = this.f50469e;
            if (!TextUtils.equals(str, audioBean3 != null ? audioBean3.getAudioUrl() : null)) {
                AudioBean audioBean4 = this.f50469e;
                this.f50472h = audioBean4 != null ? audioBean4.getAudioUrl() : null;
            }
        }
        C14245a c14245a = this.f50467c;
        if (c14245a != null) {
            c14245a.m64599f(j11);
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m64568n(int i11) {
        AudioBean audioBean = this.f50469e;
        int status = audioBean != null ? audioBean.getStatus() : 1;
        switch (i11) {
            case 2:
            case 3:
                status = 3;
                break;
            case 4:
            case 5:
                status = 4;
                break;
            case 6:
                status = 6;
                break;
            case 7:
                status = 7;
                break;
        }
        AudioBean audioBean2 = this.f50469e;
        if (audioBean2 == null || audioBean2.getStatus() != 6 || status < 4) {
            AudioBean audioBean3 = this.f50469e;
            if (audioBean3 != null) {
                audioBean3.setStatus(status);
            }
            AudioBean audioBean4 = this.f50469e;
            if (audioBean4 != null) {
                HistoryListManager.f50535e.m64709b().m64700k(audioBean4);
            }
            C26866a.a aVar = C26866a.f81698a;
            AudioBean audioBean5 = this.f50469e;
            Integer numValueOf = audioBean5 != null ? Integer.valueOf(audioBean5.getStatus()) : null;
            AudioBean audioBean6 = this.f50469e;
            C26866a.a.m104898f(aVar, "audio_log", "onStateChanged " + numValueOf + " ..title.. " + (audioBean6 != null ? audioBean6.getTitle() : null), false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m64569o(C23403e c23403e) {
        m64568n(6);
        C14266d.m64662k().m64673q(6);
        for (InterfaceC16633f interfaceC16633f : this.f50471g) {
            if (interfaceC16633f != null) {
                interfaceC16633f.onCompletion(c23403e);
            }
        }
        C14245a c14245a = this.f50467c;
        if (c14245a != null) {
            c14245a.m64595b();
        }
        this.f50467c = null;
    }

    /* JADX INFO: renamed from: w */
    private final void m64570w() {
        C14256l c14256l = new C14256l(Utils.m27275a());
        this.f50466b = c14256l;
        c14256l.setPlayerListener(new InterfaceC16633f() { // from class: com.transsion.audio.player.AudioPlayer$initPlayer$1
            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
                InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void initPlayer() {
                InterfaceC16633f.a.m72424b(this);
                C26866a.a.m104898f(C26866a.f81698a, "audio_log", "AudioPlayer --> initPlayer --> initPlayer ...", false, 4, null);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
                InterfaceC16633f.a.m72425c(this, c23403e);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onBufferedPosition(long j11, C23403e c23403e) {
                InterfaceC16633f.a.m72426d(this, j11, c23403e);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onCompletion(C23403e c23403e) {
                InterfaceC16633f.a.m72427e(this, c23403e);
                this.f50473a.m64569o(c23403e);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onFocusChange(boolean z11) {
                InterfaceC16633f.a.m72429g(this, z11);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onIsPlayingChanged(boolean z11) {
                this.f50473a.m64547A(z11);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onLoadingBegin(C23403e c23403e) {
                InterfaceC16633f.a.m72431i(this, c23403e);
                this.f50473a.m64548B(c23403e);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onLoadingEnd(C23403e c23403e) {
                InterfaceC16633f.a.m72433k(this, c23403e);
                this.f50473a.m64549C(c23403e);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
                InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
                this.f50473a.m64550D(i11, f11, c23403e);
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
            public void onPlayError(PlayError errorInfo, C23403e c23403e) {
                Intrinsics.m97802h(errorInfo, "errorInfo");
                InterfaceC16633f.a.m72439q(this, errorInfo, c23403e);
                this.f50473a.m64553H(errorInfo, c23403e);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onPlayerRelease(C23403e c23403e) {
                InterfaceC16633f.a.m72442t(this, c23403e);
                this.f50473a.m64554I(c23403e);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onPlayerReset() {
                InterfaceC16633f.a.m72444v(this);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onPrepare(C23403e c23403e) {
                InterfaceC16633f.a.m72445w(this, c23403e);
                C26866a.a.m104898f(C26866a.f81698a, "audio_log", "AudioPlayer --> initPlayer -->onPrepare ...", false, 4, null);
                AudioPlayer audioPlayer = this.f50473a;
                InterfaceC16634g interfaceC16634gM64590v = audioPlayer.m64590v();
                audioPlayer.m64579Q(interfaceC16634gM64590v != null ? interfaceC16634gM64590v.getDuration() : 1L);
                AudioBean audioBeanM64589u = this.f50473a.m64589u();
                if (audioBeanM64589u != null) {
                    audioBeanM64589u.setDuration(Long.valueOf(this.f50473a.m64587s()));
                }
                AudioPlayer audioPlayer2 = this.f50473a;
                audioPlayer2.m64580R(audioPlayer2.m64589u());
                if (this.f50473a.m64588t() == null) {
                    InterfaceC16634g interfaceC16634gM64590v2 = this.f50473a.m64590v();
                    if (interfaceC16634gM64590v2 != null) {
                        interfaceC16634gM64590v2.play();
                        return;
                    }
                    return;
                }
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99267a()), null, null, new AudioPlayer$initPlayer$1$onPrepare$1(this.f50473a, null), 3, null);
                InterfaceC16634g interfaceC16634gM64590v3 = this.f50473a.m64590v();
                if (interfaceC16634gM64590v3 != null) {
                    interfaceC16634gM64590v3.play();
                }
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onProgress(long j11, C23403e c23403e) {
                InterfaceC16633f.a.m72447y(this, j11, c23403e);
                this.f50473a.m64555M(j11, c23403e);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onRenderFirstFrame() {
                InterfaceC16633f.a.m72412A(this);
                C14245a c14245aM64586r = this.f50473a.m64586r();
                if (c14245aM64586r != null) {
                    c14245aM64586r.m64600g();
                }
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onSetDataSource() {
                InterfaceC16633f.a.m72413B(this);
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
            public void onVideoPause(C23403e c23403e) {
                InterfaceC16633f.a.m72417F(this, c23403e);
                this.f50473a.m64551E(c23403e);
                C26866a.a.m104898f(C26866a.f81698a, "player", "AudioPlayer --> initPlayer --> onStateChanged 4 ...", false, 4, null);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onVideoSizeChanged(int i11, int i12) {
                InterfaceC16633f.a.m72419H(this, i11, i12);
                C26866a.a.m104898f(C26866a.f81698a, "audio_log", "AudioPlayer --> initPlayer --> onVideoSizeChanged ...", false, 4, null);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void onVideoStart(C23403e c23403e) {
                InterfaceC16633f.a.m72420I(this, c23403e);
                this.f50473a.m64552F(c23403e);
                C26866a.a.m104898f(C26866a.f81698a, "player", "onStateChanged 3 ...", false, 4, null);
            }

            @Override // com.transsion.player.orplayer.InterfaceC16633f
            public void setOnSeekCompleteListener() {
                InterfaceC16633f.a.m72422K(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final AudioPlayer m64571x() {
        return new AudioPlayer();
    }

    /* JADX INFO: renamed from: G */
    public final void m64572G() {
        InterfaceC16634g interfaceC16634g = this.f50466b;
        if (interfaceC16634g != null) {
            interfaceC16634g.pause();
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m64573J() {
        InterfaceC16634g interfaceC16634g = this.f50466b;
        if (interfaceC16634g != null) {
            return interfaceC16634g.isPlaying();
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final void m64574K() {
        InterfaceC16634g interfaceC16634g = this.f50466b;
        if (interfaceC16634g != null) {
            interfaceC16634g.prepare();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m64575L(AudioBean audio) {
        Intrinsics.m97802h(audio, "audio");
        if (this.f50466b == null) {
            m64570w();
        }
        C26866a.a.m104898f(C26866a.f81698a, "audio_log", "AudioPlayer --> prepare --> " + audio, false, 4, null);
        this.f50470f = audio;
        C14245a c14245a = this.f50467c;
        if (c14245a != null) {
            if (c14245a != null) {
                c14245a.m64595b();
            }
            this.f50467c = null;
        }
        this.f50467c = new C14245a(audio);
        String url = audio.getUrl();
        if (url != null) {
            InterfaceC16634g interfaceC16634g = this.f50466b;
            if (interfaceC16634g != null) {
                interfaceC16634g.stop();
            }
            InterfaceC16634g interfaceC16634g2 = this.f50466b;
            if (interfaceC16634g2 != null) {
                interfaceC16634g2.setDataSource(new C23403e(url, url, 0, null, null, 28, null));
            }
            InterfaceC16634g interfaceC16634g3 = this.f50466b;
            if (interfaceC16634g3 != null) {
                interfaceC16634g3.prepare();
            }
        }
        for (InterfaceC16633f interfaceC16633f : this.f50471g) {
            if (interfaceC16633f != null) {
                interfaceC16633f.onPrepare(new C23403e(audio.getAudioUrl(), audio.getAudioUrl(), 0, null, null, 28, null));
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m64576N() {
        InterfaceC16634g interfaceC16634g = this.f50466b;
        if (interfaceC16634g != null) {
            interfaceC16634g.release();
        }
        this.f50466b = null;
        this.f50469e = null;
        C14245a c14245a = this.f50467c;
        if (c14245a != null) {
            c14245a.m64595b();
        }
        this.f50467c = null;
    }

    /* JADX INFO: renamed from: O */
    public final void m64577O(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f50471g.remove(listener);
    }

    /* JADX INFO: renamed from: P */
    public final void m64578P(long j11) {
        InterfaceC16634g interfaceC16634g = this.f50466b;
        if (interfaceC16634g != null) {
            interfaceC16634g.seekTo(j11);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m64579Q(long j11) {
        this.f50465a = j11;
    }

    /* JADX INFO: renamed from: R */
    public final void m64580R(AudioBean audioBean) {
        this.f50469e = audioBean;
    }

    /* JADX INFO: renamed from: S */
    public final void m64581S() {
        InterfaceC16634g interfaceC16634g = this.f50466b;
        if (interfaceC16634g != null) {
            interfaceC16634g.play();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m64582T() {
        InterfaceC16634g interfaceC16634g = this.f50466b;
        if (interfaceC16634g != null) {
            interfaceC16634g.stop();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m64583m(InterfaceC16633f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f50471g.add(listener);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m64584p() {
        return this.f50466b == null;
    }

    /* JADX INFO: renamed from: q */
    public final void m64585q() {
        InterfaceC16634g interfaceC16634g = this.f50466b;
        if (interfaceC16634g != null) {
            interfaceC16634g.stop();
        }
        m64576N();
    }

    /* JADX INFO: renamed from: r */
    public final C14245a m64586r() {
        return this.f50467c;
    }

    /* JADX INFO: renamed from: s */
    public final long m64587s() {
        return this.f50465a;
    }

    /* JADX INFO: renamed from: t */
    public final AudioBean m64588t() {
        return this.f50469e;
    }

    /* JADX INFO: renamed from: u */
    public final AudioBean m64589u() {
        return this.f50470f;
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC16634g m64590v() {
        return this.f50466b;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m64591y(AudioBean audio) {
        Intrinsics.m97802h(audio, "audio");
        String audioUrl = audio.getAudioUrl();
        AudioBean audioBean = this.f50469e;
        return TextUtils.equals(audioUrl, audioBean != null ? audioBean.getAudioUrl() : null);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m64592z(String audioUrl) {
        Intrinsics.m97802h(audioUrl, "audioUrl");
        AudioBean audioBean = this.f50469e;
        return TextUtils.equals(audioUrl, audioBean != null ? audioBean.getAudioUrl() : null);
    }
}
