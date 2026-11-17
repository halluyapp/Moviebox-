package com.transsion.player.orplayer;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p775t1.AbstractC27679a;
import ro.C27311e;

/* JADX INFO: renamed from: com.transsion.player.orplayer.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C16630c implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    private final InterfaceC16631d f55920a;

    /* JADX INFO: renamed from: b */
    private final Function1 f55921b;

    /* JADX INFO: renamed from: c */
    private String f55922c;

    /* JADX INFO: renamed from: d */
    private final AudioManager f55923d;

    /* JADX INFO: renamed from: e */
    private boolean f55924e;

    /* JADX INFO: renamed from: f */
    private boolean f55925f;

    /* JADX INFO: renamed from: g */
    private boolean f55926g;

    /* JADX INFO: renamed from: h */
    private AudioFocusRequest f55927h;

    public C16630c(InterfaceC16631d player, Function1 callback) {
        Intrinsics.m97802h(player, "player");
        Intrinsics.m97802h(callback, "callback");
        this.f55920a = player;
        this.f55921b = callback;
        this.f55922c = "AudioFocusHelper";
        Object systemService = Utils.m27275a().getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.f55923d = (AudioManager) systemService;
        C27311e.m106397b(C27311e.f83046a, this.f55922c, "AudioFocusHelper orPlayer " + this, false, 4, null);
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest.Builder builderM107673a = AbstractC27679a.m107673a(1);
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setUsage(14);
            builder.setContentType(2);
            builderM107673a.setAudioAttributes(builder.build());
            builderM107673a.setAcceptsDelayedFocusGain(true);
            builderM107673a.setOnAudioFocusChangeListener(this);
            this.f55927h = builderM107673a.build();
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m72406c(int i11) {
        C27311e c27311e = C27311e.f83046a;
        C27311e.m106397b(c27311e, this.f55922c, "handleAudioFocusChange ------------ " + this + ", focusChange = " + i11, false, 4, null);
        if (i11 == -3) {
            if (!this.f55926g || this.f55920a.isMute()) {
                return;
            }
            C27311e.m106397b(c27311e, this.f55922c, "handleAudioFocusChange AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK, focusChange = " + i11, false, 4, null);
            this.f55920a.setVolume(1.0f);
            return;
        }
        if (i11 == -2 || i11 == -1) {
            C27311e.m106400i(c27311e, this.f55922c, "handleAudioFocusChange LOSS, focusChange = " + i11 + ", isUserPause = " + this.f55925f, false, 4, null);
            this.f55921b.invoke(Boolean.TRUE);
            if (this.f55926g) {
                this.f55920a.pause();
                return;
            }
            return;
        }
        if (i11 == 1 || i11 == 2) {
            C27311e.m106397b(c27311e, this.f55922c, "handleAudioFocusChange GAIN, focusChange = " + i11 + "， mStartRequested = " + this.f55924e + ", isUserPause = " + this.f55925f, false, 4, null);
            this.f55921b.invoke(Boolean.FALSE);
            if (this.f55924e && !this.f55925f) {
                this.f55920a.play();
            }
            if (this.f55920a.isMute()) {
                return;
            }
            this.f55920a.setVolume(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m72407d(C16630c c16630c, int i11) {
        c16630c.m72406c(i11);
    }

    /* JADX INFO: renamed from: b */
    public final void m72408b() {
        C27311e.m106397b(C27311e.f83046a, this.f55922c, "abandonFocus " + this, false, 4, null);
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.f55927h;
            if (audioFocusRequest != null) {
                this.f55923d.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f55923d.abandonAudioFocus(this);
        }
        this.f55924e = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m72409e() {
        C27311e c27311e = C27311e.f83046a;
        C27311e.m106397b(c27311e, this.f55922c, "requestFocus " + this, false, 4, null);
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = this.f55927h;
            if (audioFocusRequest != null) {
                int iRequestAudioFocus = this.f55923d.requestAudioFocus(audioFocusRequest);
                C27311e.m106397b(c27311e, this.f55922c, "requestFocus, result:" + iRequestAudioFocus, false, 4, null);
            }
        } else {
            int iRequestAudioFocus2 = this.f55923d.requestAudioFocus(this, 3, 1);
            C27311e.m106397b(c27311e, this.f55922c, "requestFocus, result:" + iRequestAudioFocus2, false, 4, null);
        }
        this.f55924e = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m72410f(boolean z11) {
        this.f55926g = z11;
    }

    /* JADX INFO: renamed from: g */
    public final void m72411g(boolean z11) {
        this.f55925f = z11;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int i11) {
        ThreadUtils.m27236j(new Runnable() { // from class: com.transsion.player.orplayer.b
            @Override // java.lang.Runnable
            public final void run() {
                C16630c.m72407d(this.f55918a, i11);
            }
        });
    }
}
