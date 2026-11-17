package com.transsion.player.mediasession;

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.transsion.player.orplayer.InterfaceC16634g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.C26053g0;

/* JADX INFO: renamed from: com.transsion.player.mediasession.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C16622f extends MediaSessionCompat.AbstractC0176b {

    /* JADX INFO: renamed from: i */
    public static final a f55894i = new a(null);

    /* JADX INFO: renamed from: f */
    private final MediaSessionCompat f55895f;

    /* JADX INFO: renamed from: g */
    private final MediaService f55896g;

    /* JADX INFO: renamed from: h */
    private MediaItem f55897h;

    /* JADX INFO: renamed from: com.transsion.player.mediasession.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C16622f(MediaSessionCompat mediaSessionCompat, MediaService mediaService) {
        Intrinsics.m97802h(mediaService, "mediaService");
        this.f55895f = mediaSessionCompat;
        this.f55896g = mediaService;
    }

    /* JADX INFO: renamed from: E */
    private final void m72367E(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat != null) {
            C16624h.f55898a.m72386o(this.f55896g, this.f55897h, Integer.valueOf(playbackStateCompat.getState()), this.f55895f);
        }
    }

    /* JADX INFO: renamed from: F */
    private final String m72368F() {
        String simpleName = C16622f.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: G */
    private final PlaybackStateCompat m72369G(int i11) {
        Long position;
        MediaItem mediaItem = this.f55897h;
        PlaybackStateCompat playbackStateCompatM867a = new PlaybackStateCompat.C0187d().m868b(775L).m869c(i11, (mediaItem == null || (position = mediaItem.getPosition()) == null) ? 0L : position.longValue(), 1.0f).m867a();
        MediaSessionCompat mediaSessionCompat = this.f55895f;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.m744i(playbackStateCompatM867a);
        }
        Intrinsics.m97799e(playbackStateCompatM867a);
        return playbackStateCompatM867a;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0176b
    /* JADX INFO: renamed from: A */
    public void mo754A() {
        super.mo754A();
        C16625i.f55907a.m72389a(m72368F() + " --> mediaSessionCallback --> onSkipToPrevious() -- 暂不处理该事件");
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0176b
    /* JADX INFO: renamed from: C */
    public void mo756C() {
        super.mo756C();
        C16625i.f55907a.m72389a(m72368F() + " --> mediaSessionCallback --> onStop()");
        m72369G(1);
        InterfaceC16634g interfaceC16634gM102142h = C26053g0.f79567a.m102142h();
        if (interfaceC16634gM102142h != null) {
            interfaceC16634gM102142h.release();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0176b
    /* JADX INFO: renamed from: e */
    public void mo762e(String str, Bundle bundle) {
        Long duration;
        super.mo762e(str, bundle);
        PlaybackStateCompat playbackStateCompatM72369G = null;
        this.f55897h = bundle != null ? (MediaItem) bundle.getParcelable("MediaItem") : null;
        if (Intrinsics.m97797c(str, "transsion_play")) {
            MediaSessionCompat mediaSessionCompat = this.f55895f;
            if (mediaSessionCompat != null) {
                MediaMetadataCompat.C0156b c0156b = new MediaMetadataCompat.C0156b();
                MediaItem mediaItem = this.f55897h;
                MediaMetadataCompat.C0156b c0156bM679c = c0156b.m679c(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, mediaItem != null ? mediaItem.getMediaId() : null);
                MediaItem mediaItem2 = this.f55897h;
                mediaSessionCompat.m743h(c0156bM679c.m678b(MediaMetadataCompat.METADATA_KEY_DURATION, (mediaItem2 == null || (duration = mediaItem2.getDuration()) == null) ? 0L : duration.longValue()).m677a());
            }
            playbackStateCompatM72369G = m72369G(3);
        } else if (Intrinsics.m97797c(str, "transsion_pause")) {
            playbackStateCompatM72369G = m72369G(2);
        }
        m72367E(playbackStateCompatM72369G);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0176b
    /* JADX INFO: renamed from: h */
    public void mo765h() {
        super.mo765h();
        C16625i.f55907a.m72389a(m72368F() + " --> mediaSessionCallback --> onPause()");
        m72367E(m72369G(2));
        InterfaceC16634g interfaceC16634gM102142h = C26053g0.f79567a.m102142h();
        if (interfaceC16634gM102142h != null) {
            interfaceC16634gM102142h.pause();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0176b
    /* JADX INFO: renamed from: i */
    public void mo766i() {
        super.mo766i();
        C16625i.f55907a.m72389a(m72368F() + " --> mediaSessionCallback --> onPlay()");
        m72367E(m72369G(3));
        InterfaceC16634g interfaceC16634gM102142h = C26053g0.f79567a.m102142h();
        if (interfaceC16634gM102142h != null) {
            interfaceC16634gM102142h.play();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0176b
    /* JADX INFO: renamed from: s */
    public void mo776s(long j11) {
        super.mo776s(j11);
        MediaItem mediaItem = this.f55897h;
        if (mediaItem != null) {
            mediaItem.setPosition(Long.valueOf(j11));
        }
        C16625i.f55907a.m72389a(m72368F() + " --> mediaSessionCallback --> onSeekTo() --> mediaItem = " + this.f55897h);
        InterfaceC16634g interfaceC16634gM102142h = C26053g0.f79567a.m102142h();
        if (interfaceC16634gM102142h != null) {
            interfaceC16634gM102142h.seekTo(j11);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0176b
    /* JADX INFO: renamed from: z */
    public void mo783z() {
        super.mo783z();
        C16625i.f55907a.m72389a(m72368F() + " --> mediaSessionCallback --> onSkipToNext() -- 暂不处理该事件");
    }
}
