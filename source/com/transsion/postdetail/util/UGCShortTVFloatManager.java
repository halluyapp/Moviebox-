package com.transsion.postdetail.util;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.ShortTVPlayDao;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.videofloat.manager.AbstractC21107b;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.InterfaceC21842g;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p755rx.C27425a;
import p790ts.InterfaceC27847a;
import p850vv.AbstractC28228b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UGCShortTVFloatManager extends AbstractC21107b {

    /* JADX INFO: renamed from: b */
    public static final UGCShortTVFloatManager f57816b = new UGCShortTVFloatManager();

    /* JADX INFO: renamed from: c */
    private static final InterfaceC27847a f57817c = (InterfaceC27847a) C22982c.f70163e.m91553a().m91552h(InterfaceC27847a.class);

    /* JADX INFO: renamed from: d */
    private static final Lazy f57818d = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.util.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCShortTVFloatManager.m74937g();
        }
    });

    /* JADX INFO: renamed from: e */
    private static final Lazy f57819e = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.util.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCShortTVFloatManager.m74943s();
        }
    });

    /* JADX INFO: renamed from: f */
    private static final Lazy f57820f = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.util.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCShortTVFloatManager.m74942r();
        }
    });

    private UGCShortTVFloatManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC21842g m74937g() {
        return C21851p.f67672a.m88759a(Utils.m27275a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final UGCVideoDetailPlayDao m74938i() {
        return (UGCVideoDetailPlayDao) f57819e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Unit m74939l(C27425a c27425a) {
        UGCVideo uGCVideoM106638v;
        f57816b.m74945j();
        if (c27425a != null && (uGCVideoM106638v = c27425a.m106638v()) != null) {
            AbstractC28228b.m109413b(uGCVideoM106638v, null, 1, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: o */
    private final void m74940o(C27425a c27425a, Function0 function0) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new UGCShortTVFloatManager$saveHistoryInner$1(c27425a, function0, null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    static /* synthetic */ void m74941p(UGCShortTVFloatManager uGCShortTVFloatManager, C27425a c27425a, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        uGCShortTVFloatManager.m74940o(c27425a, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final ShortTVPlayDao m74942r() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64875v1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final UGCVideoDetailPlayDao m74943s() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64864A1();
    }

    /* JADX INFO: renamed from: h */
    public final String m74944h(String ugcVideoId) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        return "SHORT_TV" + ugcVideoId;
    }

    /* JADX INFO: renamed from: j */
    public void m74945j() {
        m86582a().clear();
    }

    /* JADX INFO: renamed from: k */
    public void m74946k(final C27425a c27425a) {
        m74940o(c27425a, new Function0() { // from class: com.transsion.postdetail.util.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCShortTVFloatManager.m74939l(c27425a);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public boolean m74947m(C27425a c27425a) {
        ShorttvModel.UGCVideo uGCVideo;
        Iterator it = m86582a().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            ShorttvModel.UGCVideo uGCVideo2 = (ShorttvModel.UGCVideo) it.next();
            if (!(uGCVideo2 instanceof ShorttvModel.UGCVideo)) {
                uGCVideo2 = null;
            }
            if (Intrinsics.m97797c(uGCVideo2 != null ? Integer.valueOf(uGCVideo2.getEp()) : null, c27425a != null ? Integer.valueOf(c27425a.m106620c()) : null)) {
                break;
            }
            i11++;
        }
        int size = m86582a().size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = 0;
                uGCVideo = null;
                break;
            }
            uGCVideo = (ShorttvModel.UGCVideo) m86582a().get(i12);
            if (i12 > i11 && (uGCVideo instanceof ShorttvModel.UGCVideo)) {
                break;
            }
            i12++;
        }
        C26866a.f81698a.m104912c("VideoFloat", "shorttv-----playNext, size:" + m86582a().size() + ", ep:" + (c27425a != null ? Integer.valueOf(c27425a.m106620c()) : null) + " nextEp:" + (uGCVideo != null ? Integer.valueOf(uGCVideo.getEp()) : null), true);
        if (uGCVideo == null) {
            return false;
        }
        int i13 = i12 + 5;
        if (m86582a().size() > i13) {
            ShorttvModel.UGCVideo uGCVideo3 = (ShorttvModel.UGCVideo) m86582a().get(i13);
            if (uGCVideo3 instanceof ShorttvModel.UGCVideo) {
                uGCVideo3.isDataNotComplete();
            }
        }
        if (c27425a != null) {
            c27425a.m106642z(uGCVideo.getEp());
            c27425a.m106611F(0L);
            InterfaceC16634g interfaceC16634gM106622f = c27425a.m106622f();
            String playUrl = uGCVideo.getPlayUrl();
            if (playUrl == null) {
                playUrl = "";
            }
            interfaceC16634gM106622f.seekTo(playUrl, 0L);
            c27425a.m106622f().play();
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m74948n(C27425a c27425a) {
        m74941p(this, c27425a, null, 2, null);
    }

    /* JADX INFO: renamed from: q */
    public void m74949q(List list) {
        Intrinsics.m97802h(list, "list");
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "shorttv-----setPlayList:" + list.size(), false, 4, null);
        m86582a().clear();
        m86582a().addAll(list);
    }
}
