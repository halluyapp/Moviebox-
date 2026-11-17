package com.transsion.postdetail.util;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.therouter.TheRouter;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.videofloat.manager.AbstractC21107b;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.DownloadEsHelper;
import fo.C23403e;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
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
public final class LocalFloatManager extends AbstractC21107b {

    /* JADX INFO: renamed from: b */
    public static final LocalFloatManager f57803b = new LocalFloatManager();

    private LocalFloatManager() {
    }

    /* JADX INFO: renamed from: c */
    private final DownloadBean m74871c(C27425a c27425a) {
        Object next;
        String strM106632p;
        Iterator it = m86582a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(((DownloadBean) next).getResourceId(), c27425a != null ? c27425a.m106632p() : null));
        DownloadBean downloadBean = (DownloadBean) next;
        if (downloadBean != null) {
            return downloadBean;
        }
        if (c27425a == null || (strM106632p = c27425a.m106632p()) == null) {
            return null;
        }
        return DownloadEsHelper.f67591m.m88598a().m88589q(strM106632p);
    }

    /* JADX INFO: renamed from: d */
    private final StringBuilder m74872d(DownloadBean downloadBean) {
        StringBuilder sb2 = new StringBuilder("oneroom://com.community.oneroom?type=");
        sb2.append("/video/detail");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_resource_id");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(downloadBean.getResourceId());
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_local_path");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(downloadBean.getPath());
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_url");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(downloadBean.getUrl());
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_page_from");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append("media_notification");
        sb2.append(UrlUtils.AND_MARK);
        sb2.append("extra_completed");
        sb2.append(UrlUtils.EQUAL_MARK);
        sb2.append(downloadBean.isCompleted());
        Intrinsics.m97801g(sb2, "append(...)");
        return sb2;
    }

    /* JADX INFO: renamed from: e */
    private final MediaItem m74873e(DownloadBean downloadBean) {
        String titleName = downloadBean.getTitleName();
        String subjectId = downloadBean.getSubjectId();
        return new MediaItem(titleName, "", downloadBean.getCover(), null, null, null, m74874f(downloadBean), null, subjectId, downloadBean.getResourceId(), Boolean.FALSE, null, null, null, 14520, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    /* JADX INFO: renamed from: f */
    private final PendingIntent m74874f(DownloadBean downloadBean) {
        Intent intentMo94643a;
        InterfaceC27316b interfaceC27316b = (InterfaceC27316b) TheRouter.m61774d(InterfaceC27316b.class, new Object[0]);
        StringBuilder sbM74872d = m74872d(downloadBean);
        if (interfaceC27316b != null) {
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            intentMo94643a = interfaceC27316b.mo94643a(applicationM27275a);
            if (intentMo94643a != null) {
                intentMo94643a.addFlags(603979776);
                intentMo94643a.setData(Uri.parse(sbM74872d.toString()));
            } else {
                intentMo94643a = null;
            }
        } else {
            intentMo94643a = null;
        }
        return PendingIntent.getActivity(Utils.m27275a(), 0, intentMo94643a, m74875g());
    }

    /* JADX INFO: renamed from: g */
    private final int m74875g() {
        if (Build.VERSION.SDK_INT >= 31) {
            return 67108864;
        }
        return ASTNode.NOJIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Unit m74876k(C27425a c27425a) {
        LocalFloatManager localFloatManager = f57803b;
        DownloadBean downloadBeanM74871c = localFloatManager.m74871c(c27425a);
        if (downloadBeanM74871c != null) {
            localFloatManager.m74880i();
            StringBuilder sbM74872d = localFloatManager.m74872d(downloadBeanM74871c);
            C26866a.f81698a.m104915i("VideoFloat", localFloatManager.getClass().getSimpleName() + " open page deeplink:" + ((Object) sbM74872d), true);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(sbM74872d.toString()));
            intent.setFlags(ASTNode.DEOP);
            Utils.m27275a().startActivity(intent);
        } else {
            C26866a.a.m104901l(C26866a.f81698a, "video_float", localFloatManager.getClass().getSimpleName() + " getCurPlayingBean null", false, 4, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: n */
    private final void m74877n(C27425a c27425a, Function0 function0) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new LocalFloatManager$saveHistoryInner$1(c27425a, function0, null), 3, null);
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ void m74878o(LocalFloatManager localFloatManager, C27425a c27425a, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        localFloatManager.m74877n(c27425a, function0);
    }

    /* JADX INFO: renamed from: h */
    public final String m74879h(String tag) {
        Intrinsics.m97802h(tag, "tag");
        return "LOCAL" + tag;
    }

    /* JADX INFO: renamed from: i */
    public void m74880i() {
        m86582a().clear();
    }

    /* JADX INFO: renamed from: j */
    public void m74881j(final C27425a c27425a) {
        C26866a.f81698a.m104912c("VideoFloat", LocalFloatManager.class.getSimpleName() + " --- openDetail", true);
        m74877n(c27425a, new Function0() { // from class: com.transsion.postdetail.util.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalFloatManager.m74876k(c27425a);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX INFO: renamed from: l */
    public boolean m74882l(C27425a c27425a) {
        DownloadBean downloadBean;
        String strMo88676h;
        String str;
        C23403e c23403e;
        Iterator it = m86582a().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            DownloadBean downloadBean2 = (DownloadBean) it.next();
            if (c27425a != null && downloadBean2.getEp() == c27425a.m106620c()) {
                break;
            }
            i11++;
        }
        int size = m86582a().size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                downloadBean = null;
                break;
            }
            downloadBean = (DownloadBean) m86582a().get(i12);
            if (i12 > i11 && downloadBean.getCanPlay() && (!downloadBean.isCompleted() || downloadBean.isFileExist())) {
                break;
            }
            i12++;
        }
        if (downloadBean == null) {
            return false;
        }
        if (downloadBean.isCompleted()) {
            strMo88676h = downloadBean.getPath();
            if (strMo88676h == null) {
                str = "";
            }
            C26866a.a aVar = C26866a.f81698a;
            Integer numValueOf = c27425a != null ? Integer.valueOf(c27425a.m106620c()) : null;
            aVar.m104912c("VideoFloat", "local----playNext , ep:" + numValueOf + ", nextEp:" + downloadBean.getEp(), true);
            String path = downloadBean.getPath();
            c23403e = new C23403e(String.valueOf((path != null ? path : "").hashCode()), str, 0, PlayMimeType.DEFAULT, m74873e(downloadBean), 4, null);
            if (c27425a != null) {
                c27425a.m106642z(downloadBean.getEp());
                c27425a.m106613H(downloadBean.getSe());
                c27425a.m106612G(downloadBean.getResourceId());
                c27425a.m106611F(0L);
                c27425a.m106622f().clearScreen();
                c27425a.m106622f().stop();
                c27425a.m106622f().reset();
                c27425a.m106622f().setDataSource(c23403e);
                c27425a.m106622f().prepare();
                c27425a.m106622f().play();
            }
            return true;
        }
        strMo88676h = C21851p.f67672a.m88759a(Utils.m27275a()).mo88676h(downloadBean);
        str = strMo88676h;
        C26866a.a aVar2 = C26866a.f81698a;
        if (c27425a != null) {
        }
        aVar2.m104912c("VideoFloat", "local----playNext , ep:" + numValueOf + ", nextEp:" + downloadBean.getEp(), true);
        String path2 = downloadBean.getPath();
        c23403e = new C23403e(String.valueOf((path2 != null ? path2 : "").hashCode()), str, 0, PlayMimeType.DEFAULT, m74873e(downloadBean), 4, null);
        if (c27425a != null) {
            c27425a.m106642z(downloadBean.getEp());
            c27425a.m106613H(downloadBean.getSe());
            c27425a.m106612G(downloadBean.getResourceId());
            c27425a.m106611F(0L);
            c27425a.m106622f().clearScreen();
            c27425a.m106622f().stop();
            c27425a.m106622f().reset();
            c27425a.m106622f().setDataSource(c23403e);
            c27425a.m106622f().prepare();
            c27425a.m106622f().play();
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m74883m(C27425a c27425a) {
        m74878o(this, c27425a, null, 2, null);
    }

    /* JADX INFO: renamed from: p */
    public void m74884p(List list) {
        Intrinsics.m97802h(list, "list");
        m86582a().clear();
        m86582a().addAll(list);
    }
}
