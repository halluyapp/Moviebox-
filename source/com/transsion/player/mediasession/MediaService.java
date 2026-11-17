package com.transsion.player.mediasession;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media.MediaBrowserServiceCompat;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0003¨\u0006\u001c"}, m97100d2 = {"Lcom/transsion/player/mediasession/MediaService;", "Landroidx/media/MediaBrowserServiceCompat;", "<init>", "()V", "", "s", "()Ljava/lang/String;", "", "t", "onCreate", "clientPackageName", "", "clientUid", "Landroid/os/Bundle;", "rootHints", "Landroidx/media/MediaBrowserServiceCompat$e;", "f", "(Ljava/lang/String;ILandroid/os/Bundle;)Landroidx/media/MediaBrowserServiceCompat$e;", "parentId", "Landroidx/media/MediaBrowserServiceCompat$k;", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "result", "g", "(Ljava/lang/String;Landroidx/media/MediaBrowserServiceCompat$k;)V", "onDestroy", "j", "a", "LibPlayer_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MediaService extends MediaBrowserServiceCompat {
    /* JADX INFO: renamed from: s */
    private final String m72362s() {
        String simpleName = MediaService.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: t */
    private final void m72363t() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, "media_service_id");
            mediaSessionCompat.m739d(true);
            mediaSessionCompat.m744i(new PlaybackStateCompat.C0187d().m868b(775L).m867a());
            mediaSessionCompat.m740e(new C16622f(mediaSessionCompat, this));
            m15059r(mediaSessionCompat.m738b());
            mediaSessionCompat.m742g(PendingIntent.getBroadcast(this, 1, new Intent(this, (Class<?>) MusicIntentReceiver.class), C16624h.f55898a.m72384j()));
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C16625i.f55907a.m72390b(m72362s() + " --> initMediaSessionCompat() --> it = " + thM112710exceptionOrNullimpl);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    /* JADX INFO: renamed from: f */
    public MediaBrowserServiceCompat.C3265e mo15047f(String clientPackageName, int clientUid, Bundle rootHints) {
        Intrinsics.m97802h(clientPackageName, "clientPackageName");
        return new MediaBrowserServiceCompat.C3265e("media_service_id", null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    /* JADX INFO: renamed from: g */
    public void mo15048g(String parentId, MediaBrowserServiceCompat.C3271k result) {
        Intrinsics.m97802h(parentId, "parentId");
        Intrinsics.m97802h(result, "result");
        result.m15094f(null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public void onCreate() {
        super.onCreate();
        C16625i.f55907a.m72389a(m72362s() + " --> onCreate()");
        C16624h.f55898a.m72385l();
        m72363t();
    }

    @Override // androidx.media.MediaBrowserServiceCompat, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C16625i.f55907a.m72390b(m72362s() + " --> onDestroy() --> 服务销毁的时候停止通知");
    }
}
