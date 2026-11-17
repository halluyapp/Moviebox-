package com.transsion.player.mediasession;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.core.app.AbstractC2391z;
import androidx.core.app.NotificationCompat;
import androidx.media.app.C3279c;
import androidx.media.session.MediaButtonReceiver;
import androidx.media3.common.util.AbstractC3349g0;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5779c;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.transsion.player.R$mipmap;
import com.transsion.player.R$string;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.mvel2.ast.ASTNode;
import p588m.AbstractC25770f;
import ro.C27314h;

/* JADX INFO: renamed from: com.transsion.player.mediasession.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16624h {

    /* JADX INFO: renamed from: b */
    private static boolean f55899b;

    /* JADX INFO: renamed from: c */
    private static MediaSessionCompat f55900c;

    /* JADX INFO: renamed from: d */
    private static MediaService f55901d;

    /* JADX INFO: renamed from: e */
    private static MediaItem f55902e;

    /* JADX INFO: renamed from: f */
    private static Integer f55903f;

    /* JADX INFO: renamed from: g */
    private static Bitmap f55904g;

    /* JADX INFO: renamed from: a */
    public static final C16624h f55898a = new C16624h();

    /* JADX INFO: renamed from: h */
    private static String f55905h = "";

    /* JADX INFO: renamed from: i */
    private static final a f55906i = new a();

    /* JADX INFO: renamed from: com.transsion.player.mediasession.h$a */
    public static final class a extends CustomTarget {
        a() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
            C16625i.f55907a.m72389a(C16624h.f55898a.m72379i() + " --> loadAlbum --> onLoadCleared() ---> 加载失败");
        }

        @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
            super.onLoadFailed(drawable);
            C16625i c16625i = C16625i.f55907a;
            C16624h c16624h = C16624h.f55898a;
            c16625i.m72389a(c16624h.m72379i() + " --> loadAlbum --> onLoadFailed() ---> 加载失败");
            C16624h.f55904g = BitmapFactory.decodeResource(Utils.m27275a().getResources(), R$mipmap.player_ic_notification_icon);
            c16624h.m72386o(C16624h.f55901d, C16624h.f55902e, C16624h.f55903f, C16624h.f55900c);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Bitmap resource, Transition transition) {
            Intrinsics.m97802h(resource, "resource");
            String str = C16624h.f55905h;
            MediaItem mediaItem = C16624h.f55902e;
            if (TextUtils.equals(str, mediaItem != null ? mediaItem.getCoverUrl() : null)) {
                C16624h.f55904g = resource;
                C16624h.f55898a.m72386o(C16624h.f55901d, C16624h.f55902e, C16624h.f55903f, C16624h.f55900c);
            }
        }
    }

    private C16624h() {
    }

    /* JADX INFO: renamed from: h */
    private final Bitmap m72378h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m72383q(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final String m72379i() {
        String simpleName = C16624h.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: k */
    private final String m72380k(String str) {
        return C27314h.f83051a.m106412b(str, AbstractC5776a0.m27313a(48.0f), (120 & 4) != 0 ? true : true, (120 & 8) != 0, (120 & 16) != 0 ? 0 : 0, (120 & 32) != 0 ? false : false, (120 & 64) != 0 ? false : false);
    }

    /* JADX INFO: renamed from: m */
    private final void m72381m(MediaService mediaService, MediaItem mediaItem, Integer num, MediaSessionCompat mediaSessionCompat) {
        String title;
        String subTitle;
        f55901d = mediaService;
        f55902e = mediaItem;
        f55903f = num;
        f55900c = mediaSessionCompat;
        m72382n();
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        NotificationCompat.C2360m c2360m = new NotificationCompat.C2360m(applicationM27275a, "MUSIC_NOTIFICATION_ID");
        String str = "VideoPlayer";
        if (mediaItem == null || (title = mediaItem.getTitle()) == null) {
            title = "VideoPlayer";
        }
        NotificationCompat.C2360m c2360mM11594q = c2360m.m11594q(title);
        if (mediaItem != null && (subTitle = mediaItem.getSubTitle()) != null) {
            str = subTitle;
        }
        NotificationCompat.C2360m c2360mM11593p = c2360mM11594q.m11593p(str);
        Intrinsics.m97801g(c2360mM11593p, "setContentText(...)");
        Bitmap bitmap = f55904g;
        if (bitmap == null) {
            c2360mM11593p.m11602z(BitmapFactory.decodeResource(Utils.m27275a().getResources(), R$mipmap.player_ic_push_small_logo));
        } else {
            c2360mM11593p.m11602z(bitmap);
        }
        c2360mM11593p.m11598u(MusicNotificationBroadcastReceiver.INSTANCE.m72365a());
        Object systemService = null;
        if ((mediaItem != null ? mediaItem.getPendingIntent() : null) != null) {
            c2360mM11593p.m11592o(mediaItem.getPendingIntent());
        }
        c2360mM11593p.m11577N(1);
        if (num != null && num.intValue() == 3) {
            c2360mM11593p.m11580b(new NotificationCompat.C2349b.a(R$mipmap.player_pause, "pause", MediaButtonReceiver.m15119a(applicationM27275a, 2L)).m11505a());
        } else {
            c2360mM11593p.m11580b(new NotificationCompat.C2349b.a(R$mipmap.player_play, MediaItem.MUSIC_FLOAT_STATE_PLAY, MediaButtonReceiver.m15119a(applicationM27275a, 4L)).m11505a());
        }
        C3279c c3279c = new C3279c();
        MediaSessionCompat mediaSessionCompat2 = f55900c;
        c2360mM11593p.m11574K(c3279c.m15112q(mediaSessionCompat2 != null ? mediaSessionCompat2.m738b() : null).m15113r(0));
        c2360mM11593p.m11572I(R$mipmap.player_ic_push_small_logo);
        try {
            Notification notificationM11581c = c2360mM11593p.m11581c();
            Intrinsics.m97799e(notificationM11581c);
            notificationM11581c.flags = 224;
            if (f55899b) {
                if (mediaService != null) {
                    try {
                        systemService = mediaService.getSystemService("notification");
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        return;
                    }
                }
                Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).notify(89757, notificationM11581c);
                return;
            }
            if (!AbstractC5779c.m27333j()) {
                C16625i.f55907a.m72390b("Service is restricted, cannot start foreground.");
                return;
            }
            if (mediaService != null) {
                try {
                    mediaService.startForeground(89757, notificationM11581c);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                    try {
                        Object systemService2 = mediaService.getSystemService("notification");
                        Intrinsics.m97800f(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                        ((NotificationManager) systemService2).notify(89757, notificationM11581c);
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                }
            }
            f55899b = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m72382n() {
        Object objM112707constructorimpl;
        String coverUrl;
        MediaItem mediaItem = f55902e;
        String coverUrl2 = mediaItem != null ? mediaItem.getCoverUrl() : null;
        if (TextUtils.isEmpty(coverUrl2) || TextUtils.equals(f55905h, coverUrl2)) {
            return;
        }
        f55905h = coverUrl2;
        if (coverUrl2 != null && StringsKt.m98132c0(coverUrl2, "http", false, 2, null)) {
            f55904g = null;
            RequestBuilder requestBuilderDiskCacheStrategy = Glide.with(Utils.m27275a()).asBitmap().centerInside().diskCacheStrategy(DiskCacheStrategy.DATA);
            MediaItem mediaItem2 = f55902e;
            if (mediaItem2 == null || (coverUrl = mediaItem2.getCoverUrl()) == null) {
                coverUrl = "";
            }
            Intrinsics.m97799e(requestBuilderDiskCacheStrategy.load2(m72380k(coverUrl)).into(f55906i));
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            f55904g = f55898a.m72378h(f55905h);
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            f55904g = BitmapFactory.decodeResource(Utils.m27275a().getResources(), R$mipmap.player_ic_push_small_logo);
        }
        m72381m(f55901d, f55902e, f55903f, f55900c);
    }

    /* JADX INFO: renamed from: q */
    private final Bitmap m72383q(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iM27313a = AbstractC5776a0.m27313a(48.0f);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int iRound = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i11 = options.outWidth;
            int i12 = options.outHeight;
            if (i11 <= iM27313a && i12 <= iM27313a) {
                options.inJustDecodeBounds = false;
                return BitmapFactory.decodeFile(str, options);
            }
            if (i12 > iM27313a || i11 > iM27313a) {
                float f11 = iM27313a;
                iRound = Math.round(RangesKt.m97934d(i12 / f11, i11 / f11));
            }
            options.inSampleSize = iRound;
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m72384j() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 67108864;
        }
        return ASTNode.NOJIT;
    }

    /* JADX INFO: renamed from: l */
    public final void m72385l() {
        C16625i.f55907a.m72389a(m72379i() + " --> initNotificationChannel() --> 初始化 通知的 渠道");
        Object systemService = Utils.m27275a().getSystemService("notification");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC3349g0.m15796a();
            NotificationChannel notificationChannelM101309a = AbstractC25770f.m101309a("MUSIC_NOTIFICATION_ID", Utils.m27275a().getString(R$string.player_notification_name), 3);
            notificationChannelM101309a.setSound(null, null);
            notificationChannelM101309a.setDescription("playing media");
            notificationManager.createNotificationChannel(notificationChannelM101309a);
        }
        MusicNotificationBroadcastReceiver.INSTANCE.m72366b();
    }

    /* JADX INFO: renamed from: o */
    public final void m72386o(MediaService mediaService, MediaItem mediaItem, Integer num, MediaSessionCompat mediaSessionCompat) {
        if (mediaItem != null) {
            m72381m(mediaService, mediaItem, num, mediaSessionCompat);
            return;
        }
        C16625i.f55907a.m72390b(m72379i() + " --> notifyNotification() --> mediaItem == null --> return");
        m72387p();
    }

    /* JADX INFO: renamed from: p */
    public final void m72387p() {
        MediaService mediaService = f55901d;
        if (mediaService != null) {
            AbstractC2391z.m11809a(mediaService, 1);
        }
        Object systemService = Utils.m27275a().getSystemService("notification");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(89757);
        f55899b = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m72388r(boolean z11) {
        f55899b = z11;
    }
}
