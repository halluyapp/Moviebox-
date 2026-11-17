package com.transsion.videodetail.util;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.therouter.TheRouter;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.videodetail.InterfaceC20941b;
import com.transsion.videodetail.bean.VideoDetailStream;
import com.transsion.videodetail.bean.VideoDetailStreamList;
import com.transsion.videofloat.manager.AbstractC21107b;
import fo.C23403e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import org.mvel2.ast.ASTNode;
import p349dh.C22982c;
import p553ko.C24715a;
import p750rp.InterfaceC27316b;
import p755rx.C27425a;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
public final class StreamFloatManager extends AbstractC21107b {

    /* JADX INFO: renamed from: b */
    public static final StreamFloatManager f65956b = new StreamFloatManager();

    /* JADX INFO: renamed from: c */
    private static Map f65957c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private static final Lazy f65958d = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.util.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StreamFloatManager.m86492x();
        }
    });

    /* JADX INFO: renamed from: e */
    private static final Lazy f65959e = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.util.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StreamFloatManager.m86491w();
        }
    });

    private StreamFloatManager() {
    }

    /* JADX INFO: renamed from: h */
    private final MediaItem m86481h(C24715a c24715a, VideoDetailStream videoDetailStream, int i11, int i12) {
        return new MediaItem(c24715a != null ? c24715a.m97064t() : null, "", c24715a != null ? c24715a.m97047c() : null, null, null, null, m86482i(c24715a, videoDetailStream.getId(), i11, i12), null, c24715a != null ? c24715a.m97059o() : null, videoDetailStream.getId(), null, null, null, null, 15544, null);
    }

    /* JADX INFO: renamed from: i */
    private final PendingIntent m86482i(C24715a c24715a, String str, int i11, int i12) {
        InterfaceC27316b interfaceC27316b = (InterfaceC27316b) TheRouter.m61774d(InterfaceC27316b.class, new Object[0]);
        StringBuilder sb2 = new StringBuilder("oneroom://com.community.oneroom?type=");
        sb2.append("/playvideo/detail");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_resource_id");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(str);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("subject_type");
        sb2.append(UrlUtils.EQUAL_MARK);
        Intent intent = null;
        sb2.append(c24715a != null ? c24715a.m97062r() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("season");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(i11);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("episode");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(i12);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("id");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c24715a != null ? c24715a.m97059o() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("ops");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c24715a != null ? c24715a.m97061q() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_page_from");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append("media_notification");
        sb2.append(UrlUtils.AND_MARK);
        if (interfaceC27316b != null) {
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            Intent intentMo94643a = interfaceC27316b.mo94643a(applicationM27275a);
            if (intentMo94643a != null) {
                intentMo94643a.addFlags(603979776);
                intentMo94643a.setData(Uri.parse(sb2.toString()));
                intent = intentMo94643a;
            }
        }
        return PendingIntent.getActivity(Utils.m27275a(), 0, intent, m86484k());
    }

    /* JADX INFO: renamed from: j */
    private final PlayMimeType m86483j(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.m97801g(upperCase, "toUpperCase(...)");
        if (Intrinsics.m97797c(upperCase, "DASH")) {
            return PlayMimeType.DASH;
        }
        return Intrinsics.m97797c(upperCase, "HLS") ? PlayMimeType.HLS : PlayMimeType.DEFAULT;
    }

    /* JADX INFO: renamed from: k */
    private final int m86484k() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 67108864;
        }
        return ASTNode.NOJIT;
    }

    /* JADX INFO: renamed from: l */
    private final void m86485l(String str, int i11, int i12, Function1 function1) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new StreamFloatManager$getPlayInfo$1(str, i11, i12, function1, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC20941b m86486m() {
        return (InterfaceC20941b) f65959e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final VideoDetailPlayDao m86487n() {
        return (VideoDetailPlayDao) f65958d.getValue();
    }

    /* JADX INFO: renamed from: o */
    private final void m86488o(C27425a c27425a, C24715a c24715a, int i11, int i12, VideoDetailStreamList videoDetailStreamList) {
        Object next;
        VideoDetailStream videoDetailStream = (VideoDetailStream) CollectionsKt.m97361k0(videoDetailStreamList.getStreams());
        if (videoDetailStream == null) {
            return;
        }
        LinkedHashMap linkedHashMap = null;
        if (Intrinsics.m97797c(videoDetailStream.getFormat(), "DEFAULT") || (Intrinsics.m97797c(videoDetailStream.getFormat(), "HLS") && videoDetailStreamList.getStreams().size() > 1)) {
            Iterator<T> it = videoDetailStreamList.getStreams().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(((VideoDetailStream) next).getResolutions(), c27425a.m106631o()));
            VideoDetailStream videoDetailStream2 = (VideoDetailStream) next;
            if (videoDetailStream2 != null) {
                videoDetailStream = videoDetailStream2;
            }
        }
        if (videoDetailStream.getSignCookie().length() > 0) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("cookie", videoDetailStream.getSignCookie());
        }
        C26866a.f81698a.m104912c("VideoFloat", "stream-----getPlayInfoSuccess,开始播放, se:" + i11 + ",ep:" + i12, true);
        C23403e c23403e = new C23403e(String.valueOf(videoDetailStream.getUrl().hashCode()), videoDetailStream.getUrl(), 0, m86483j(videoDetailStream.getFormat()), m86481h(c24715a, videoDetailStream, i11, i12), 4, null);
        c23403e.m92940q(linkedHashMap);
        c27425a.m106642z(i12);
        c27425a.m106613H(i11);
        c27425a.m106611F(0L);
        c27425a.m106622f().stop();
        c27425a.m106622f().reset();
        c27425a.m106622f().clearScreen();
        c27425a.m106622f().setDataSource(c23403e);
        c27425a.m106622f().prepare();
        c27425a.m106622f().play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Unit m86489s(C24715a c24715a, C27425a c27425a, C24715a c24715a2, VideoDetailStreamList videoDetailStreamList) {
        if (videoDetailStreamList != null) {
            f65956b.m86488o(c27425a, c24715a2, c24715a.m97056l(), c24715a.m97049e(), videoDetailStreamList);
            return Unit.f75682a;
        }
        C26866a.f81698a.m104912c("VideoFloat", "stream-----playNext,nextSe:" + c24715a.m97056l() + ",nextEp:" + c24715a.m97049e() + " 下一集数据为空，无法播放", true);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: u */
    private final void m86490u(C27425a c27425a) {
        if (c27425a != null) {
            String str = c27425a.m106634r() + "+" + c27425a.m106633q() + "+" + c27425a.m106620c();
            C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "saveHistory--key:" + str + ", value:" + c27425a.m106630n(), false, 4, null);
            f65957c.put(str, Long.valueOf(c27425a.m106630n()));
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new StreamFloatManager$saveHistoryInner$2(c27425a, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC20941b m86491w() {
        return (InterfaceC20941b) C22982c.f70163e.m91553a().m91552h(InterfaceC20941b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final VideoDetailPlayDao m86492x() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: renamed from: g */
    public final Long m86493g(String key) {
        Intrinsics.m97802h(key, "key");
        return (Long) f65957c.remove(key);
    }

    /* JADX INFO: renamed from: p */
    public void m86494p() {
        m86582a().clear();
    }

    /* JADX INFO: renamed from: q */
    public void m86495q(C27425a c27425a) {
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "VideoFloat", "openDetail--1", false, 4, null);
        m86490u(c27425a);
        StringBuilder sb2 = new StringBuilder("oneroom://com.community.oneroom?type=/playvideo/detail");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("id");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27425a != null ? c27425a.m106634r() : null);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("season");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27425a != null ? c27425a.m106633q() : 0);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("episode");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(c27425a != null ? c27425a.m106620c() : 0);
        sb2.append(UrlUtils.AND_MARK);
        C26866a.a.m104898f(aVar, "VideoFloat", "openDetail--end", false, 4, null);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(sb2.toString()));
        intent.setFlags(ASTNode.DEOP);
        Utils.m27275a().startActivity(intent);
    }

    /* JADX INFO: renamed from: r */
    public boolean m86496r(final C27425a c27425a) {
        Object next;
        Iterator it = m86582a().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            C24715a c24715a = (C24715a) it.next();
            if (c27425a != null && c24715a.m97049e() == c27425a.m106620c()) {
                break;
            }
            i11++;
        }
        Iterator it2 = m86582a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            C24715a c24715a2 = (C24715a) next;
            if (c27425a != null && c24715a2.m97049e() == c27425a.m106620c()) {
                break;
            }
        }
        final C24715a c24715a3 = (C24715a) next;
        int i12 = i11 + 1;
        if (i12 >= m86582a().size()) {
            return false;
        }
        final C24715a c24715a4 = (C24715a) m86582a().get(i12);
        C26866a.f81698a.m104912c("VideoFloat", "stream-----playNext, name:" + c24715a4.m97060p() + ",nextSe:" + c24715a4.m97056l() + ",nextEp:" + c24715a4.m97049e(), true);
        if (c27425a == null) {
            return false;
        }
        m86485l(c27425a.m106634r(), c24715a4.m97056l(), c24715a4.m97049e(), new Function1() { // from class: com.transsion.videodetail.util.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamFloatManager.m86489s(c24715a4, c27425a, c24715a3, (VideoDetailStreamList) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void m86497t(C27425a c27425a) {
        m86490u(c27425a);
    }

    /* JADX INFO: renamed from: v */
    public void m86498v(List list) {
        Intrinsics.m97802h(list, "list");
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "stream-----setPlayList:" + list.size(), false, 4, null);
        m86582a().clear();
        m86582a().addAll(list);
    }
}
