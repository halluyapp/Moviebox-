package com.transsion.ugcvideodetail.hepler;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.therouter.TheRouter;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayInfo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
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
import p850vv.AbstractC28228b;
import p922xv.InterfaceC28667a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UGCVideoFloatManager extends AbstractC21107b {

    /* JADX INFO: renamed from: b */
    public static final UGCVideoFloatManager f64340b = new UGCVideoFloatManager();

    /* JADX INFO: renamed from: c */
    private static Map f64341c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private static final Lazy f64342d = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.hepler.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCVideoFloatManager.m84040w();
        }
    });

    /* JADX INFO: renamed from: e */
    private static final Lazy f64343e = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.hepler.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCVideoFloatManager.m84039v();
        }
    });

    private UGCVideoFloatManager() {
    }

    /* JADX INFO: renamed from: g */
    private final MediaItem m84030g(C24715a c24715a, UGCVideoPlayInfo uGCVideoPlayInfo) {
        return new MediaItem(c24715a != null ? c24715a.m97064t() : null, "", c24715a != null ? c24715a.m97047c() : null, null, null, null, m84031h(c24715a, uGCVideoPlayInfo), null, c24715a != null ? c24715a.m97059o() : null, uGCVideoPlayInfo.getUgcVideoId(), null, null, null, null, 15544, null);
    }

    /* JADX INFO: renamed from: h */
    private final PendingIntent m84031h(C24715a c24715a, UGCVideoPlayInfo uGCVideoPlayInfo) {
        UGCVideo uGCVideoM97065u;
        UGCVideo uGCVideoM97065u2;
        InterfaceC27316b interfaceC27316b = (InterfaceC27316b) TheRouter.m61774d(InterfaceC27316b.class, new Object[0]);
        StringBuilder sb2 = new StringBuilder("oneroom://com.community.oneroom?type=");
        sb2.append("/ugc_video/detail");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_resource_id");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(uGCVideoPlayInfo.getUgcVideoId());
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("ugc_video_type");
        sb2.append(UrlUtils.EQUAL_MARK);
        Intent intent = null;
        sb2.append((c24715a == null || (uGCVideoM97065u2 = c24715a.m97065u()) == null) ? null : uGCVideoM97065u2.getCategory());
        sb2.append(UrlUtils.AND_MARK);
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("id");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append((c24715a == null || (uGCVideoM97065u = c24715a.m97065u()) == null) ? null : uGCVideoM97065u.getUgcVideoId());
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
        return PendingIntent.getActivity(Utils.m27275a(), 0, intent, m84032j());
    }

    /* JADX INFO: renamed from: j */
    private final int m84032j() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 67108864;
        }
        return ASTNode.NOJIT;
    }

    /* JADX INFO: renamed from: k */
    private final void m84033k(String str, Function1 function1) {
        if (str == null || str.length() == 0) {
            function1.invoke(null);
        } else {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new UGCVideoFloatManager$getPlayInfo$1(str, function1, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC28667a m84034l() {
        return (InterfaceC28667a) f64343e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final UGCVideoDetailPlayDao m84035m() {
        return (UGCVideoDetailPlayDao) f64342d.getValue();
    }

    /* JADX INFO: renamed from: n */
    private final void m84036n(C27425a c27425a, C24715a c24715a, UGCVideoPlayInfo uGCVideoPlayInfo) {
        LinkedHashMap linkedHashMap;
        UGCVideoPlayStream uGCVideoPlayStream = (UGCVideoPlayStream) CollectionsKt.m97361k0(uGCVideoPlayInfo.getResources());
        if (uGCVideoPlayStream == null) {
            return;
        }
        if (uGCVideoPlayStream.getSignCookie().length() > 0) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("cookie", uGCVideoPlayStream.getSignCookie());
        } else {
            linkedHashMap = null;
        }
        C26866a.f81698a.m104912c("VideoFloat", "stream-----getPlayInfoSuccess,开始播放, se:" + uGCVideoPlayInfo.getUgcVideoId(), true);
        C23403e c23403e = new C23403e(String.valueOf(uGCVideoPlayStream.getUrl().hashCode()), uGCVideoPlayStream.getUrl(), 0, m84041i(uGCVideoPlayStream.getFormat()), m84030g(c24715a, uGCVideoPlayInfo), 4, null);
        c23403e.m92940q(linkedHashMap);
        UGCVideo uGCVideoM106638v = c27425a.m106638v();
        if (uGCVideoM106638v != null) {
            uGCVideoM106638v.setUgcVideoId(uGCVideoPlayInfo.getUgcVideoId());
        }
        c27425a.m106616K(uGCVideoPlayStream.getIdType());
        c27425a.m106611F(0L);
        c27425a.m106622f().stop();
        c27425a.m106622f().reset();
        c27425a.m106622f().clearScreen();
        c27425a.m106622f().setDataSource(c23403e);
        c27425a.m106622f().prepare();
        c27425a.m106622f().play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m84037r(C24715a c24715a, C27425a c27425a, C24715a c24715a2, UGCVideoPlayInfo uGCVideoPlayInfo) {
        if (uGCVideoPlayInfo != null) {
            f64340b.m84036n(c27425a, c24715a2, uGCVideoPlayInfo);
            return Unit.f75682a;
        }
        C26866a.f81698a.m104912c("VideoFloat", "ugc-----playNext,nextSe:" + c24715a.m97056l() + ",nextEp:" + c24715a.m97049e() + " 下一集数据为空，无法播放", true);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: t */
    private final void m84038t(C27425a c27425a) {
        if (c27425a != null) {
            String str = c27425a.m106634r() + "+" + c27425a.m106633q() + "+" + c27425a.m106620c();
            C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "saveHistory--key:" + str + ", value:" + c27425a.m106630n(), false, 4, null);
            f64341c.put(str, Long.valueOf(c27425a.m106630n()));
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new UGCVideoFloatManager$saveHistoryInner$2(c27425a, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC28667a m84039v() {
        return (InterfaceC28667a) C22982c.f70163e.m91553a().m91552h(InterfaceC28667a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final UGCVideoDetailPlayDao m84040w() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64864A1();
    }

    /* JADX INFO: renamed from: i */
    public final PlayMimeType m84041i(String format) {
        Intrinsics.m97802h(format, "format");
        String upperCase = format.toUpperCase(Locale.ROOT);
        Intrinsics.m97801g(upperCase, "toUpperCase(...)");
        if (Intrinsics.m97797c(upperCase, "DASH")) {
            return PlayMimeType.DASH;
        }
        return Intrinsics.m97797c(upperCase, "HLS") ? PlayMimeType.HLS : PlayMimeType.DEFAULT;
    }

    /* JADX INFO: renamed from: o */
    public void m84042o() {
        m86582a().clear();
    }

    /* JADX INFO: renamed from: p */
    public void m84043p(C27425a c27425a) {
        UGCVideo uGCVideoM106638v;
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "openDetail--1", false, 4, null);
        m84038t(c27425a);
        if (c27425a == null || (uGCVideoM106638v = c27425a.m106638v()) == null) {
            return;
        }
        AbstractC28228b.m109413b(uGCVideoM106638v, null, 1, null);
    }

    /* JADX INFO: renamed from: q */
    public boolean m84044q(final C27425a c27425a) {
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
        C26866a.f81698a.m104912c("VideoFloat", "ugc-----playNext, name:" + c24715a4.m97060p() + ",nextSe:" + c24715a4.m97056l() + ",nextEp:" + c24715a4.m97049e(), true);
        if (c27425a == null) {
            return false;
        }
        UGCVideo uGCVideoM106638v = c27425a.m106638v();
        m84033k(uGCVideoM106638v != null ? uGCVideoM106638v.getUgcVideoId() : null, new Function1() { // from class: com.transsion.ugcvideodetail.hepler.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoFloatManager.m84037r(c24715a4, c27425a, c24715a3, (UGCVideoPlayInfo) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m84045s(C27425a c27425a) {
        m84038t(c27425a);
    }

    /* JADX INFO: renamed from: u */
    public void m84046u(List list) {
        Intrinsics.m97802h(list, "list");
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "stream-----setPlayList:" + list.size(), false, 4, null);
        m86582a().clear();
        m86582a().addAll(list);
    }
}
