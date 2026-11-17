package com.transsion.player;

import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cloud.tmc.miniapp.prepare.steps.PrepareException;
import com.google.common.collect.AbstractC10813r4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.player.DashDemoActivity;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.PlayError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p464ho.C23881h;
import p683po.C26905b;
import p683po.C26906c;
import p683po.C26907d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0006X\u0086D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m97100d2 = {"Lcom/transsion/player/DashDemoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/transsion/player/orplayer/f;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lpo/c;", "tracks", "onTracksChange", "(Lpo/c;)V", "", "width", "height", "onVideoSizeChanged", "(II)V", "Landroid/view/TextureView;", "a", "Landroid/view/TextureView;", "textureView", "Lho/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lho/h;", "getPalyer", "()Lho/h;", "setPalyer", "(Lho/h;)V", "palyer", "", "c", "F", "speed", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "trackIndex", "", "e", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "LibPlayer_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class DashDemoActivity extends AppCompatActivity implements InterfaceC16633f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TextureView textureView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C23881h palyer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float speed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int trackIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String TAG = "DashActivity";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m71711R(DashDemoActivity dashDemoActivity, TextView textView, View view) {
        Object next;
        C23881h c23881h = dashDemoActivity.palyer;
        if (c23881h != null) {
            Iterator<E> it = c23881h.getCurrentTracks().m105022a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C26907d) next).m105027e() != 2);
            C26907d c26907d = (C26907d) next;
            if (c26907d != null) {
                int iM105026d = c26907d.m105026d();
                int i11 = dashDemoActivity.trackIndex + 1;
                dashDemoActivity.trackIndex = i11;
                int i12 = i11 % iM105026d;
                c23881h.changeTrackSelection(c26907d, i12);
                C26905b c26905b = c26907d.m105024b()[i12];
                textView.setText("codecs:" + c26905b.m105017b() + " peakBitrate:" + c26905b.m105020e() + "  " + c26905b.m105021f() + "*" + c26905b.m105018c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final void m71712S(DashDemoActivity dashDemoActivity, View view) {
        C23881h c23881h = dashDemoActivity.palyer;
        if (c23881h != null) {
            long currentPosition = c23881h.getCurrentPosition();
            C23881h c23881h2 = dashDemoActivity.palyer;
            if (c23881h2 != null) {
                c23881h2.seekTo(currentPosition + ((long) 10000));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m71713U(DashDemoActivity dashDemoActivity, View view) {
        float f11 = dashDemoActivity.speed + 0.25f;
        dashDemoActivity.speed = f11;
        Log.e(dashDemoActivity.TAG, "speed:" + f11);
        C23881h c23881h = dashDemoActivity.palyer;
        if (c23881h != null) {
            c23881h.setSpeed(dashDemoActivity.speed);
        }
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
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e c23403e) {
        InterfaceC16633f.a.m72427e(this, c23403e);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_dash);
        this.textureView = (TextureView) findViewById(R$id.f55470tv);
        String str = getFilesDir().getAbsolutePath() + "/test265/1.mpd";
        C23881h c23881h = new C23881h(this, null, false, 6, null);
        TextureView textureView = this.textureView;
        if (textureView == null) {
            Intrinsics.m97819y("textureView");
            textureView = null;
        }
        c23881h.setTextureView(textureView);
        c23881h.addPlayerListener(this);
        c23881h.m94573O(new C23403e(PrepareException.ERROR_DOWNLOAD_PACKAGE_URL_EMPTY, str, 0, null, null, 28, null));
        c23881h.prepare();
        c23881h.play();
        this.palyer = c23881h;
        final TextView textView = (TextView) findViewById(R$id.tv_index);
        textView.setOnClickListener(new View.OnClickListener() { // from class: fo.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashDemoActivity.m71711R(this.f71368a, textView, view);
            }
        });
        findViewById(R$id.tv_seek).setOnClickListener(new View.OnClickListener() { // from class: fo.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashDemoActivity.m71712S(this.f71370a, view);
            }
        });
        findViewById(R$id.tv_speed).setOnClickListener(new View.OnClickListener() { // from class: fo.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashDemoActivity.m71713U(this.f71371a, view);
            }
        });
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
    public void onLoadingBegin(C23403e c23403e) {
        InterfaceC16633f.a.m72431i(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e c23403e) {
        InterfaceC16633f.a.m72433k(this, c23403e);
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

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError playError, C23403e c23403e) {
        InterfaceC16633f.a.m72439q(this, playError, c23403e);
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
    public void onProgress(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72447y(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
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
    public void onTracksChange(C26906c tracks) {
        Intrinsics.m97802h(tracks, "tracks");
        Log.e(this.TAG, "onTracksChanged  tracks:" + tracks);
        AbstractC10813r4 it = tracks.m105022a().iterator();
        Intrinsics.m97801g(it, "iterator(...)");
        while (it.hasNext()) {
            C26907d c26907d = (C26907d) it.next();
            int iM105027e = c26907d.m105027e();
            boolean zM105023a = c26907d.m105023a();
            for (C26905b c26905b : c26907d.m105024b()) {
                Log.e(this.TAG, "onTracksChanged  trackInGroupIsSupported:" + zM105023a + " \ntrackFormat:" + c26905b + " \n");
            }
            Log.e(this.TAG, "onTracksChanged  trackType:" + iM105027e + " \ntrackInGroupIsSupported:" + zM105023a + " \n");
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksVideoBitrateChange(int i11) {
        InterfaceC16633f.a.m72416E(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e c23403e) {
        InterfaceC16633f.a.m72417F(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int width, int height) {
        Log.e(this.TAG, "onVideoSizeChanged  width:" + width + " height:" + height);
        if (width > 0 || height > 0) {
            TextureView textureView = this.textureView;
            TextureView textureView2 = null;
            if (textureView == null) {
                Intrinsics.m97819y("textureView");
                textureView = null;
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) textureView.getLayoutParams();
            if (c2308b != null) {
                ((ViewGroup.MarginLayoutParams) c2308b).width = 720;
            }
            if (c2308b != null) {
                ((ViewGroup.MarginLayoutParams) c2308b).height = (height * 720) / width;
            }
            TextureView textureView3 = this.textureView;
            if (textureView3 == null) {
                Intrinsics.m97819y("textureView");
            } else {
                textureView2 = textureView3;
            }
            textureView2.setLayoutParams(c2308b);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e c23403e) {
        InterfaceC16633f.a.m72420I(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }
}
