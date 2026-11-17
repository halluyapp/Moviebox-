package com.transsion.player.mediasession;

import android.app.Application;
import android.content.ComponentName;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.core.os.AbstractC2411d;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaBrowserCompatHelper {

    /* JADX INFO: renamed from: h */
    public static final C16609a f55880h = new C16609a(null);

    /* JADX INFO: renamed from: i */
    private static final Lazy f55881i = LazyKt.m97097b(new Function0() { // from class: com.transsion.player.mediasession.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MediaBrowserCompatHelper.m72348q();
        }
    });

    /* JADX INFO: renamed from: d */
    private MediaBrowserCompat f55885d;

    /* JADX INFO: renamed from: e */
    private MediaControllerCompat f55886e;

    /* JADX INFO: renamed from: g */
    private boolean f55888g;

    /* JADX INFO: renamed from: a */
    private final MediaBrowserCompat.AbstractC0150n f55882a = new C16612d();

    /* JADX INFO: renamed from: b */
    private final MediaControllerCompat.AbstractC0162a f55883b = new C16611c();

    /* JADX INFO: renamed from: c */
    private final MediaBrowserCompat.C0139c f55884c = new C16610b();

    /* JADX INFO: renamed from: f */
    private List f55887f = new ArrayList();

    /* JADX INFO: renamed from: com.transsion.player.mediasession.MediaBrowserCompatHelper$a */
    public static final class C16609a {
        private C16609a() {
        }

        public /* synthetic */ C16609a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MediaBrowserCompatHelper m72359a() {
            return (MediaBrowserCompatHelper) MediaBrowserCompatHelper.f55881i.getValue();
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.mediasession.MediaBrowserCompatHelper$b */
    public static final class C16610b extends MediaBrowserCompat.C0139c {
        C16610b() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0139c
        /* JADX INFO: renamed from: a */
        public void mo608a() {
            String strM594c;
            super.mo608a();
            try {
                try {
                    MediaBrowserCompat mediaBrowserCompat = MediaBrowserCompatHelper.this.f55885d;
                    if (mediaBrowserCompat != null && (strM594c = mediaBrowserCompat.m594c()) != null) {
                        MediaBrowserCompatHelper mediaBrowserCompatHelper = MediaBrowserCompatHelper.this;
                        MediaBrowserCompat mediaBrowserCompat2 = mediaBrowserCompatHelper.f55885d;
                        if (mediaBrowserCompat2 != null) {
                            mediaBrowserCompat2.m598g(strM594c);
                        }
                        MediaBrowserCompat mediaBrowserCompat3 = mediaBrowserCompatHelper.f55885d;
                        if (mediaBrowserCompat3 != null) {
                            mediaBrowserCompat3.m597f(strM594c, mediaBrowserCompatHelper.f55882a);
                        }
                    }
                    MediaBrowserCompatHelper mediaBrowserCompatHelper2 = MediaBrowserCompatHelper.this;
                    Application applicationM27275a = Utils.m27275a();
                    MediaBrowserCompat mediaBrowserCompat4 = MediaBrowserCompatHelper.this.f55885d;
                    Intrinsics.m97799e(mediaBrowserCompat4);
                    mediaBrowserCompatHelper2.f55886e = new MediaControllerCompat(applicationM27275a, mediaBrowserCompat4.m595d());
                    MediaControllerCompat mediaControllerCompat = MediaBrowserCompatHelper.this.f55886e;
                    if (mediaControllerCompat != null) {
                        mediaControllerCompat.m698c(MediaBrowserCompatHelper.this.f55883b);
                    }
                    List<Function1> list = MediaBrowserCompatHelper.this.f55887f;
                    MediaBrowserCompatHelper mediaBrowserCompatHelper3 = MediaBrowserCompatHelper.this;
                    for (Function1 function1 : list) {
                        MediaControllerCompat mediaControllerCompat2 = mediaBrowserCompatHelper3.f55886e;
                        function1.invoke(mediaControllerCompat2 != null ? mediaControllerCompat2.m697b() : null);
                    }
                    MediaBrowserCompatHelper.this.f55887f.clear();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    C16625i.f55907a.m72389a("mediaSource --> connectionCallback --> e = " + Log.getStackTraceString(e11));
                }
            } finally {
                MediaBrowserCompatHelper.this.f55888g = false;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0139c
        /* JADX INFO: renamed from: b */
        public void mo609b() {
            super.mo609b();
            MediaBrowserCompatHelper.this.f55888g = false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0139c
        /* JADX INFO: renamed from: c */
        public void mo610c() {
            super.mo610c();
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.mediasession.MediaBrowserCompatHelper$c */
    public static final class C16611c extends MediaControllerCompat.AbstractC0162a {
        C16611c() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0162a
        /* JADX INFO: renamed from: d */
        public void mo715d(MediaMetadataCompat metadata) {
            Intrinsics.m97802h(metadata, "metadata");
            super.mo715d(metadata);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.AbstractC0162a
        /* JADX INFO: renamed from: e */
        public void mo716e(PlaybackStateCompat playbackStateCompat) {
            super.mo716e(playbackStateCompat);
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.mediasession.MediaBrowserCompatHelper$d */
    public static final class C16612d extends MediaBrowserCompat.AbstractC0150n {
        C16612d() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.AbstractC0150n
        /* JADX INFO: renamed from: a */
        public void mo640a(String parentId, List children) {
            Intrinsics.m97802h(parentId, "parentId");
            Intrinsics.m97802h(children, "children");
            super.mo640a(parentId, children);
            C16625i.f55907a.m72389a("mediaSource --> subscriptionCallback --> onChildrenLoaded() --> parentId = " + parentId + " -- children = " + children);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m72332A(MediaControllerCompat.AbstractC0166e abstractC0166e) {
        if (abstractC0166e != null) {
            abstractC0166e.mo734c();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final MediaBrowserCompatHelper m72348q() {
        return new MediaBrowserCompatHelper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Unit m72349s(MediaItem mediaItem, MediaControllerCompat.AbstractC0166e abstractC0166e) {
        if (abstractC0166e != null) {
            abstractC0166e.mo732a("transsion_pause", AbstractC2411d.m11891b(new Pair("MediaItem", mediaItem)));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Unit m72350u(MediaItem mediaItem, MediaControllerCompat.AbstractC0166e abstractC0166e) {
        if (abstractC0166e != null) {
            abstractC0166e.mo732a("transsion_play", AbstractC2411d.m11891b(new Pair("MediaItem", mediaItem)));
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w */
    private final void m72351w(Function1 function1) {
        m72353p(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Unit m72352y(MediaControllerCompat.AbstractC0166e abstractC0166e) {
        if (abstractC0166e != null) {
            abstractC0166e.mo733b();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p */
    public final void m72353p(Function1 function1) {
        Object objM99058d;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaBrowserCompat mediaBrowserCompat = this.f55885d;
            Object obj = null;
            if (mediaBrowserCompat != null && mediaBrowserCompat.m596e()) {
                if (function1 != null) {
                    MediaControllerCompat mediaControllerCompat = this.f55886e;
                    function1.invoke(mediaControllerCompat != null ? mediaControllerCompat.m697b() : null);
                    return;
                }
                return;
            }
            if (this.f55888g) {
                if (function1 != null) {
                    this.f55887f.add(function1);
                    return;
                }
                return;
            }
            this.f55888g = true;
            Application applicationM27275a = Utils.m27275a();
            if (applicationM27275a != null) {
                if (ThreadUtils.m27235i()) {
                    if (function1 != null) {
                        this.f55887f.add(function1);
                    }
                    MediaBrowserCompat mediaBrowserCompat2 = new MediaBrowserCompat(applicationM27275a, new ComponentName(applicationM27275a, (Class<?>) MediaService.class), this.f55884c, null);
                    this.f55885d = mediaBrowserCompat2;
                    mediaBrowserCompat2.m592a();
                    objM99058d = Unit.f75682a;
                } else {
                    objM99058d = AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new MediaBrowserCompatHelper$init$1$2$2(function1, this, applicationM27275a, null), 3, null);
                }
                obj = objM99058d;
            }
            Result.m112707constructorimpl(obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m72354r(final MediaItem mediaItem) {
        m72351w(new Function1() { // from class: com.transsion.player.mediasession.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaBrowserCompatHelper.m72349s(mediaItem, (MediaControllerCompat.AbstractC0166e) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m72355t(final MediaItem mediaItem) {
        m72351w(new Function1() { // from class: com.transsion.player.mediasession.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaBrowserCompatHelper.m72350u(mediaItem, (MediaControllerCompat.AbstractC0166e) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m72356v(String mediaId) {
        Intrinsics.m97802h(mediaId, "mediaId");
    }

    /* JADX INFO: renamed from: x */
    public final void m72357x() {
        m72351w(new Function1() { // from class: com.transsion.player.mediasession.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaBrowserCompatHelper.m72352y((MediaControllerCompat.AbstractC0166e) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m72358z() {
        m72351w(new Function1() { // from class: com.transsion.player.mediasession.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaBrowserCompatHelper.m72332A((MediaControllerCompat.AbstractC0166e) obj);
            }
        });
    }
}
