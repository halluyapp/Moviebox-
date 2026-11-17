package com.transsion.postdetail.p306ui.fragment;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.postdetail.layer.listener.LayerFlag;
import com.transsion.postdetail.layer.local.C16791c0;
import com.transsion.postdetail.util.C17449s;
import com.transsion.postdetail.util.LocalVideoAdHelper;
import com.transsion.subtitle.VideoSubtitleControl;
import fo.C23403e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p415fq.InterfaceC23410a;
import p683po.C26906c;
import p683po.C26907d;
import p743rh.C27287m;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class LocalVideoDetailFragment$playerListener$1 implements InterfaceC16633f {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ LocalVideoDetailFragment f57175a;

    LocalVideoDetailFragment$playerListener$1(LocalVideoDetailFragment localVideoDetailFragment) {
        this.f57175a = localVideoDetailFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Unit m74234c(LocalVideoDetailFragment localVideoDetailFragment) {
        InterfaceC16634g interfaceC16634g = localVideoDetailFragment.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.play();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Unit m74235d(LocalVideoDetailFragment localVideoDetailFragment) {
        localVideoDetailFragment.m74142h2().m73111h(LayerFlag.PLAYER_FOREGROUND, Boolean.FALSE);
        InterfaceC16634g interfaceC16634g = localVideoDetailFragment.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.play();
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73452z(true);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e c23403e) {
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73436i();
        }
        C26866a.a.m104898f(C26866a.f81698a, this.f57175a.TAG, "onCompletion", false, 4, null);
        this.f57175a.m74124a3();
        this.f57175a.localVideoAdHelper.m74897w2();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        C26866a.a.m104898f(C26866a.f81698a, this.f57175a.TAG, "onIsPlayingChanged：" + z11, false, 4, null);
        VideoSubtitleControl videoSubtitleControl = this.f57175a.subtitleControl;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81887b0(z11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e c23403e) {
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73437j();
        }
        C26866a.a.m104898f(C26866a.f81698a, this.f57175a.TAG, "onLoadingBegin", false, 4, null);
        this.f57175a.m74142h2().m73110g(LayerFlag.LOADING_BEGIN, Boolean.FALSE);
        if (this.f57175a.isDownloadingPlay) {
            this.f57175a.m74118Y1();
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e c23403e) {
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73438k();
        }
        C26866a.a.m104898f(C26866a.f81698a, this.f57175a.TAG, "onLoadingEnd", false, 4, null);
        this.f57175a.getHandler().removeCallbacksAndMessages(null);
        this.f57175a.m74142h2().m73110g(LayerFlag.LOADING_END, Boolean.FALSE);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
        C26866a.a.m104898f(C26866a.f81698a, this.f57175a.TAG, "onLoopingStart", false, 4, null);
        this.f57175a.m74142h2().m73110g(LayerFlag.LOOPING_START, new Object[0]);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e c23403e) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        this.f57175a.m74176q3();
        this.f57175a.errorInfo = errorInfo;
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73440m(errorInfo);
        }
        C26866a.a aVar = C26866a.f81698a;
        aVar.m104915i("long_video_play", "onPlayError()  errorCode:" + errorInfo.getErrorCode() + " errorMessage:" + errorInfo.getErrorMessage() + "  playProgress = " + this.f57175a.playProgress + " url:" + (c23403e != null ? c23403e.m92935k() : null) + " --> 长播放失败了", true);
        this.f57175a.m74142h2().m73110g(LayerFlag.PLAY_ERROR, errorInfo);
        LocalVideoDetailFragment localVideoDetailFragment = this.f57175a;
        Integer errorCode = errorInfo.getErrorCode();
        localVideoDetailFragment.isPlayerNetTimeout = errorCode != null && errorCode.intValue() == 537067524;
        if (this.f57175a.playProgress > 0) {
            LocalVideoDetailFragment localVideoDetailFragment2 = this.f57175a;
            LocalVideoDetailFragment.m74183s3(localVideoDetailFragment2, localVideoDetailFragment2.downloadBean, this.f57175a.playProgress, false, 4, null);
        }
        if (C27287m.f83003a.m106330e()) {
            if (this.f57175a.isPlayerNetTimeout) {
                return;
            }
            aVar.m104921x("long_video_play", "video error，reload~~ from onPlayError", true);
            LocalVideoDetailFragment.m74168o3(this.f57175a, false, 1, null);
            return;
        }
        C26866a.a.m104898f(aVar, this.f57175a.TAG, "onPlayError， not net----", false, 4, null);
        DownloadBean downloadBean = this.f57175a.downloadBean;
        if ((downloadBean != null ? downloadBean.getProgress() : 0L) > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            this.f57175a.m74142h2().m73110g(LayerFlag.LOADING_END, new Object[0]);
            this.f57175a.m74142h2().m73111h(LayerFlag.NETWORK_CHANGE, Boolean.FALSE);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerRelease(C23403e c23403e) {
        InterfaceC16633f.a.m72442t(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerReset() {
        C26866a.a.m104898f(C26866a.f81698a, this.f57175a.TAG, "onPlayerReset", false, 4, null);
        this.f57175a.m74142h2().m73110g(LayerFlag.PLAYER_RESET, new Object[0]);
        this.f57175a.localVideoAdHelper.m74898y2();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e c23403e) {
        this.f57175a.m74176q3();
        this.f57175a.isPlayerNetTimeout = false;
        this.f57175a.isPrepare = true;
        C26866a.a aVar = C26866a.f81698a;
        String str = this.f57175a.TAG;
        DownloadBean downloadBean = this.f57175a.downloadBean;
        C26866a.a.m104898f(aVar, str, "onPrepare, epse = " + (downloadBean != null ? Integer.valueOf(downloadBean.getEpse()) : null), false, 4, null);
        if (this.f57175a.downloadBean == null) {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f57175a), C25220y0.m99268b(), null, new LocalVideoDetailFragment$playerListener$1$onPrepare$1(this.f57175a, null), 2, null);
        } else {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this.f57175a), C25220y0.m99269c(), null, new LocalVideoDetailFragment$playerListener$1$onPrepare$2(this.f57175a, null), 2, null);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long j11, C23403e c23403e) {
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73441n(j11);
        }
        this.f57175a.playProgress = j11;
        this.f57175a.m74142h2().m73110g(LayerFlag.PROGRESS, Long.valueOf(j11));
        LocalVideoAdHelper localVideoAdHelper = this.f57175a.localVideoAdHelper;
        final LocalVideoDetailFragment localVideoDetailFragment = this.f57175a;
        localVideoAdHelper.m72732N(j11, new Function0() { // from class: com.transsion.postdetail.ui.fragment.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoDetailFragment$playerListener$1.m74234c(localVideoDetailFragment);
            }
        });
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73442o();
        }
        C26866a.a.m104898f(C26866a.f81698a, this.f57175a.TAG, "onRenderFirstFrame", false, 4, null);
        this.f57175a.m74142h2().m73110g(LayerFlag.RENDER_FIRST_FRAME, new Object[0]);
        InterfaceC16634g interfaceC16634g = this.f57175a.orPlayer;
        if (interfaceC16634g != null) {
            interfaceC16634g.pause();
        }
        LocalVideoAdHelper localVideoAdHelper = this.f57175a.localVideoAdHelper;
        final LocalVideoDetailFragment localVideoDetailFragment = this.f57175a;
        localVideoAdHelper.m72752a2(new Function0() { // from class: com.transsion.postdetail.ui.fragment.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoDetailFragment$playerListener$1.m74235d(localVideoDetailFragment);
            }
        });
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksAudioBitrateChange(int i11) {
        InterfaceC16633f.a.m72414C(this, i11);
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73448u(i11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksChange(C26906c c26906c) {
        InterfaceC16633f.a.m72415D(this, c26906c);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksVideoBitrateChange(int i11) {
        InterfaceC16633f.a.m72416E(this, i11);
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73449v(i11);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e c23403e) {
        this.f57175a.m74220z3(true);
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73450w();
        }
        C26866a.a.m104898f(C26866a.f81698a, this.f57175a.TAG, "onVideoPause", false, 4, null);
        FragmentActivity activity = this.f57175a.getActivity();
        if (activity != null) {
            C17449s.f57841a.m74974b(activity, false);
        }
        this.f57175a.m74142h2().m73110g(LayerFlag.VIDEO_PAUSE, new Object[0]);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        this.f57175a.videoWidth = i11;
        this.f57175a.videoHeight = i12;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.f57175a.TAG, "onVideoSizeChanged", false, 4, null);
        C26866a.a.m104898f(aVar, this.f57175a.TAG, "onVideoSizeChanged width:" + i11 + ",height:" + i12, false, 4, null);
        this.f57175a.m74142h2().m73110g(LayerFlag.VIDEO_SIZE_CHANGED, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e c23403e) {
        this.f57175a.m74176q3();
        this.f57175a.m74220z3(false);
        C16791c0 c16791c0 = this.f57175a.localVideoDot;
        if (c16791c0 != null) {
            c16791c0.m73451x();
        }
        C26866a.a.m104898f(C26866a.f81698a, this.f57175a.TAG, "onVideoStart", false, 4, null);
        this.f57175a.playingDownloadHandler.removeCallbacks(this.f57175a.notNetRunnable);
        this.f57175a.m74142h2().m73110g(LayerFlag.VIDEO_START, new Object[0]);
        this.f57175a.m74142h2().m73110g(LayerFlag.LOADING_END, new Object[0]);
        InterfaceC23410a interfaceC23410aM74128c2 = this.f57175a.m74128c2();
        if (interfaceC23410aM74128c2 != null) {
            interfaceC23410aM74128c2.pause();
        }
        this.f57175a.m74062E3();
        this.f57175a.localVideoAdHelper.m74890A2();
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }
}
