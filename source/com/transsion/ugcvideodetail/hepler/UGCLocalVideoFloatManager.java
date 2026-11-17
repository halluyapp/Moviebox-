package com.transsion.ugcvideodetail.hepler;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.therouter.TheRouter;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.videofloat.manager.AbstractC21107b;
import com.transsnet.downloader.manager.C21851p;
import fo.C23403e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import org.mvel2.ast.ASTNode;
import p750rp.InterfaceC27316b;
import p755rx.C27425a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UGCLocalVideoFloatManager extends AbstractC21107b {

    /* JADX INFO: renamed from: b */
    public static final UGCLocalVideoFloatManager f64337b = new UGCLocalVideoFloatManager();

    /* JADX INFO: renamed from: c */
    private static Map f64338c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    private static final Lazy f64339d = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.hepler.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCLocalVideoFloatManager.m84019o();
        }
    });

    private UGCLocalVideoFloatManager() {
    }

    /* JADX INFO: renamed from: d */
    private final MediaItem m84013d(DownloadBean downloadBean) {
        String ugcVideoName = downloadBean.getUgcVideoName();
        if (ugcVideoName == null) {
            ugcVideoName = downloadBean.getTitleName();
        }
        String str = ugcVideoName;
        String subjectId = downloadBean.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        String str2 = subjectId;
        String cover = downloadBean.getCover();
        String ugcVideoId = downloadBean.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = downloadBean.getResourceId();
        }
        return new MediaItem(str, "", cover, null, null, null, m84014e(downloadBean), null, str2, ugcVideoId, null, null, null, null, 15544, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0095  */
    /* JADX INFO: renamed from: e */
    private final PendingIntent m84014e(DownloadBean downloadBean) {
        Intent intentMo94643a;
        InterfaceC27316b interfaceC27316b = (InterfaceC27316b) TheRouter.m61774d(InterfaceC27316b.class, new Object[0]);
        if (interfaceC27316b != null) {
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            intentMo94643a = interfaceC27316b.mo94643a(applicationM27275a);
            if (intentMo94643a != null) {
                intentMo94643a.addFlags(603979776);
                intentMo94643a.setData(Uri.parse("oneroom://com.community.oneroom?type=/ugc_video/local_detail" + UrlUtils.AND_MARK + "id" + UrlUtils.EQUAL_MARK + downloadBean.getUgcVideoId() + UrlUtils.AND_MARK + "resource_id" + UrlUtils.EQUAL_MARK + downloadBean.getResourceId() + UrlUtils.AND_MARK + "ugcCategory" + UrlUtils.EQUAL_MARK + downloadBean.getUgcVideoType() + UrlUtils.AND_MARK + "ops" + UrlUtils.EQUAL_MARK + downloadBean.getOps() + UrlUtils.AND_MARK + "extra_page_from" + UrlUtils.EQUAL_MARK + "media_notification"));
            } else {
                intentMo94643a = null;
            }
        } else {
            intentMo94643a = null;
        }
        return PendingIntent.getActivity(Utils.m27275a(), 0, intentMo94643a, m84015f());
    }

    /* JADX INFO: renamed from: f */
    private final int m84015f() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 67108864;
        }
        return ASTNode.NOJIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final UGCVideoDetailPlayDao m84016g() {
        return (UGCVideoDetailPlayDao) f64339d.getValue();
    }

    /* JADX INFO: renamed from: k */
    private final void m84017k(C27425a c27425a, DownloadBean downloadBean) {
        String strMo88676h;
        String path;
        if (!downloadBean.isCompleted() || (path = downloadBean.getPath()) == null || path.length() == 0) {
            strMo88676h = C21851p.f67672a.m88759a(Utils.m27275a()).mo88676h(downloadBean);
        } else {
            strMo88676h = downloadBean.getPath();
            Intrinsics.m97799e(strMo88676h);
        }
        String str = strMo88676h;
        C26866a.f81698a.m104912c("VideoFloat", "local-----playNextWithLocalData, 开始播放, url:" + str, true);
        String path2 = downloadBean.getPath();
        if (path2 == null) {
            path2 = str;
        }
        C23403e c23403e = new C23403e(String.valueOf(path2.hashCode()), str, 0, PlayMimeType.DEFAULT, m84013d(downloadBean), 4, null);
        c27425a.m106641y(downloadBean);
        c27425a.m106642z(downloadBean.getEp());
        c27425a.m106613H(downloadBean.getSe());
        c27425a.m106612G(downloadBean.getResourceId());
        c27425a.m106611F(0L);
        c27425a.m106622f().stop();
        c27425a.m106622f().reset();
        c27425a.m106622f().clearScreen();
        c27425a.m106622f().setDataSource(c23403e);
        c27425a.m106622f().prepare();
        c27425a.m106622f().play();
    }

    /* JADX INFO: renamed from: m */
    private final void m84018m(C27425a c27425a) {
        if (c27425a != null) {
            String str = c27425a.m106634r() + "+" + c27425a.m106633q() + "+" + c27425a.m106620c();
            C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "saveHistory--key:" + str + ", value:" + c27425a.m106630n(), false, 4, null);
            f64338c.put(str, Long.valueOf(c27425a.m106630n()));
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new UGCLocalVideoFloatManager$saveHistoryInner$2(c27425a, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final UGCVideoDetailPlayDao m84019o() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64864A1();
    }

    /* JADX INFO: renamed from: h */
    public void m84020h() {
        m86582a().clear();
    }

    /* JADX INFO: renamed from: i */
    public void m84021i(C27425a c27425a) {
        DownloadBean downloadBeanM106619b;
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "openDetail--1", false, 4, null);
        m84018m(c27425a);
        if (c27425a == null || (downloadBeanM106619b = c27425a.m106619b()) == null) {
            return;
        }
        AbstractC5114k.m23933p(TheRouter.m61773c("/ugc_video/local_detail").m61857K("id", downloadBeanM106619b.getUgcVideoId()).m61857K("resource_id", downloadBeanM106619b.getResourceId()).m61857K("ugcCategory", downloadBeanM106619b.getUgcVideoType()).m61857K("ops", downloadBeanM106619b.getOps()));
    }

    /* JADX INFO: renamed from: j */
    public boolean m84022j(C27425a c27425a) {
        DownloadBean downloadBeanM106619b;
        List<DownloadBean> seriesList;
        int i11;
        String path;
        if (c27425a == null || (downloadBeanM106619b = c27425a.m106619b()) == null || (seriesList = downloadBeanM106619b.getSeriesList()) == null || seriesList.isEmpty()) {
            return false;
        }
        DownloadBean downloadBeanM106619b2 = c27425a.m106619b();
        Iterator<DownloadBean> it = seriesList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            DownloadBean next = it.next();
            if (Intrinsics.m97797c(next.getUgcVideoId(), downloadBeanM106619b2 != null ? downloadBeanM106619b2.getUgcVideoId() : null)) {
                break;
            }
            if (Intrinsics.m97797c(next.getResourceId(), downloadBeanM106619b2 != null ? downloadBeanM106619b2.getResourceId() : null)) {
                break;
            }
            i12++;
        }
        if (i12 < 0 || (i11 = i12 + 1) >= seriesList.size()) {
            C26866a.f81698a.m104912c("VideoFloat", "local-----playNext, 没有下一集", true);
            return false;
        }
        DownloadBean downloadBean = seriesList.get(i11);
        if (downloadBean.isCompleted() && ((path = downloadBean.getPath()) == null || path.length() == 0)) {
            C26866a.f81698a.m104912c("VideoFloat", "local-----playNext, 下一集文件不存在，无法播放", true);
            return false;
        }
        C26866a.f81698a.m104912c("VideoFloat", "local-----playNext, name:" + downloadBean.getUgcVideoName() + ",nextEp:" + downloadBean.getEp(), true);
        m84017k(c27425a, downloadBean);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m84023l(C27425a c27425a) {
        m84018m(c27425a);
    }

    /* JADX INFO: renamed from: n */
    public void m84024n(List list) {
        Intrinsics.m97802h(list, "list");
        C26866a.a.m104898f(C26866a.f81698a, "VideoFloat", "stream-----setPlayList:" + list.size(), false, 4, null);
        m86582a().clear();
        m86582a().addAll(list);
    }
}
