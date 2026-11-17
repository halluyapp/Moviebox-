package com.transsion.postdetail.util;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.ShortTVPlayDao;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.ShortTvInfoEpisodeList;
import com.transsion.videofloat.manager.AbstractC21107b;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.InterfaceC21842g;
import fo.C23403e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import org.mvel2.ast.ASTNode;
import p349dh.C22982c;
import p654oo.InterfaceC26373f;
import p659os.AbstractC26725k;
import p659os.AbstractC26726l;
import p659os.C26719e;
import p755rx.C27425a;
import p790ts.InterfaceC27847a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTVFloatManager extends AbstractC21107b {

    /* JADX INFO: renamed from: b */
    public static final ShortTVFloatManager f57812b = new ShortTVFloatManager();

    /* JADX INFO: renamed from: c */
    private static final InterfaceC27847a f57813c = (InterfaceC27847a) C22982c.f70163e.m91553a().m91552h(InterfaceC27847a.class);

    /* JADX INFO: renamed from: d */
    private static final Lazy f57814d = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.util.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVFloatManager.m74916i();
        }
    });

    /* JADX INFO: renamed from: e */
    private static final Lazy f57815e = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.util.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTVFloatManager.m74925x();
        }
    });

    private ShortTVFloatManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final InterfaceC21842g m74916i() {
        return C21851p.f67672a.m88759a(Utils.m27275a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC21842g m74917j() {
        return (InterfaceC21842g) f57814d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final ShortTVPlayDao m74918l() {
        return (ShortTVPlayDao) f57815e.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final void m74919m(String str, int i11, Function1 function1) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ShortTVFloatManager$getShortTvEpisodeList$1(i11, str, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    private final void m74920n(C27425a c27425a, List list) {
        Object next;
        Map mapMo102959a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ShortTVItem shortTVItem = (ShortTVItem) it.next();
                Iterator it2 = f57812b.m86582a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    AbstractC26725k abstractC26725k = (AbstractC26725k) next;
                    if ((abstractC26725k instanceof C26719e) && ((C26719e) abstractC26725k).m104511c() == shortTVItem.getEp()) {
                        break;
                    }
                }
                AbstractC26725k abstractC26725k2 = (AbstractC26725k) next;
                if (abstractC26725k2 != null && (abstractC26725k2 instanceof C26719e)) {
                    C26719e c26719e = (C26719e) abstractC26725k2;
                    ShortTVItem shortTVItemM104512d = c26719e.m104512d();
                    String id2 = shortTVItemM104512d != null ? shortTVItemM104512d.getId() : null;
                    if (id2 != null && id2.length() != 0) {
                        shortTVItem.setId(id2);
                    }
                    C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "handleNewData----设置播放数据  ep:" + shortTVItem.getEp(), false, 4, null);
                    c26719e.m104516h(shortTVItem);
                }
                C23403e mediaSource = shortTVItem.toMediaSource();
                if (mediaSource != null) {
                    InterfaceC16634g interfaceC16634gM106622f = c27425a.m106622f();
                    InterfaceC26373f interfaceC26373f = interfaceC16634gM106622f instanceof InterfaceC26373f ? (InterfaceC26373f) interfaceC16634gM106622f : null;
                    boolean zContainsKey = (interfaceC26373f == null || (mapMo102959a = interfaceC26373f.mo102959a()) == null) ? false : mapMo102959a.containsKey(mediaSource.m92929e());
                    C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "addDataSource----updateShortTvInfoList  ep:" + shortTVItem.getEp() + ",inPlayerList:" + zContainsKey, false, 4, null);
                    if (!zContainsKey) {
                        c27425a.m106622f().addDataSource(mediaSource);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Unit m74921q(C27425a c27425a) {
        f57812b.m74927o();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("oneroom://com.community.oneroom?type=/shorts/detail&id=" + (c27425a != null ? c27425a.m106634r() : null) + "&ep=" + (c27425a != null ? Integer.valueOf(c27425a.m106620c()) : null) + "&ms=" + (c27425a != null ? Long.valueOf(c27425a.m106630n()) : null)));
        intent.setFlags(ASTNode.DEOP);
        Utils.m27275a().startActivity(intent);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Unit m74922s(C27425a c27425a, ShortTvInfoEpisodeList shortTvInfoEpisodeList) {
        if (shortTvInfoEpisodeList != null) {
            f57812b.m74920n(c27425a, shortTvInfoEpisodeList.getItems());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: u */
    private final void m74923u(C27425a c27425a, Function0 function0) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ShortTVFloatManager$saveHistoryInner$1(c27425a, function0, null), 3, null);
    }

    /* JADX INFO: renamed from: v */
    static /* synthetic */ void m74924v(ShortTVFloatManager shortTVFloatManager, C27425a c27425a, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        shortTVFloatManager.m74923u(c27425a, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final ShortTVPlayDao m74925x() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64875v1();
    }

    /* JADX INFO: renamed from: k */
    public final String m74926k(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        return "SHORT_TV" + subjectId;
    }

    /* JADX INFO: renamed from: o */
    public void m74927o() {
        m86582a().clear();
    }

    /* JADX INFO: renamed from: p */
    public void m74928p(final C27425a c27425a) {
        m74923u(c27425a, new Function0() { // from class: com.transsion.postdetail.util.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTVFloatManager.m74921q(c27425a);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public boolean m74929r(final C27425a c27425a) {
        AbstractC26725k abstractC26725k;
        String id2;
        Iterator it = m86582a().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            AbstractC26725k abstractC26725k2 = (AbstractC26725k) it.next();
            C26719e c26719e = abstractC26725k2 instanceof C26719e ? (C26719e) abstractC26725k2 : null;
            if (Intrinsics.m97797c(c26719e != null ? Integer.valueOf(c26719e.m104511c()) : null, c27425a != null ? Integer.valueOf(c27425a.m106620c()) : null)) {
                break;
            }
            i11++;
        }
        int size = m86582a().size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = 0;
                abstractC26725k = null;
                break;
            }
            abstractC26725k = (AbstractC26725k) m86582a().get(i12);
            if (i12 > i11 && (abstractC26725k instanceof C26719e)) {
                break;
            }
            i12++;
        }
        C26719e c26719e2 = (C26719e) abstractC26725k;
        C26866a.f81698a.m104912c("VideoFloat", "shorttv-----playNext, size:" + m86582a().size() + ", ep:" + (c27425a != null ? Integer.valueOf(c27425a.m106620c()) : null) + " nextEp:" + (c26719e2 != null ? Integer.valueOf(c26719e2.m104511c()) : null), true);
        if (abstractC26725k == null) {
            return false;
        }
        int i13 = i12 + 5;
        if (m86582a().size() > i13) {
            AbstractC26725k abstractC26725k3 = (AbstractC26725k) m86582a().get(i13);
            if (abstractC26725k3 instanceof C26719e) {
                C26719e c26719e3 = (C26719e) abstractC26725k3;
                if (AbstractC26726l.m104527b(c26719e3) && c27425a != null) {
                    f57812b.m74919m(c27425a.m106634r(), c26719e3.m104511c(), new Function1() { // from class: com.transsion.postdetail.util.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShortTVFloatManager.m74922s(c27425a, (ShortTvInfoEpisodeList) obj);
                        }
                    });
                }
            }
        }
        if (c27425a != null) {
            C26719e c26719e4 = (C26719e) abstractC26725k;
            c27425a.m106642z(c26719e4.m104511c());
            c27425a.m106611F(0L);
            InterfaceC16634g interfaceC16634gM106622f = c27425a.m106622f();
            ShortTVItem shortTVItemM104512d = c26719e4.m104512d();
            if (shortTVItemM104512d == null || (id2 = shortTVItemM104512d.getId()) == null) {
                id2 = "";
            }
            interfaceC16634gM106622f.seekTo(id2, 0L);
            c27425a.m106622f().play();
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void m74930t(C27425a c27425a) {
        m74924v(this, c27425a, null, 2, null);
    }

    /* JADX INFO: renamed from: w */
    public void m74931w(List list) {
        Intrinsics.m97802h(list, "list");
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "shorttv-----setPlayList:" + list.size(), false, 4, null);
        m86582a().clear();
        m86582a().addAll(list);
    }
}
