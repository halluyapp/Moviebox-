package com.transsion.subtitle;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14482a;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.subtitle.helper.SubtitleSearchHelper;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.bean.SubtitleAppType;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsnet.downloader.manager.C21851p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import mu.InterfaceC25911c;
import p528ju.C24469a;
import p648oj.InterfaceC26287v0;
import p743rh.C27287m;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
public final class VideoSubtitleManagerImp implements InterfaceC19714h {

    /* JADX INFO: renamed from: g */
    public static final C19654a f62776g = new C19654a(null);

    /* JADX INFO: renamed from: b */
    private final Lazy f62777b = LazyKt.m97097b(new Function0() { // from class: com.transsion.subtitle.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VideoSubtitleManagerImp.m81922D();
        }
    });

    /* JADX INFO: renamed from: c */
    private Set f62778c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    private final String f62779d = VideoSubtitleManagerImp.class.getSimpleName();

    /* JADX INFO: renamed from: e */
    private final InterfaceC25149n0 f62780e = AbstractC25153o0.m99079a(C25220y0.m99269c());

    /* JADX INFO: renamed from: f */
    private final VideoSubtitleManagerImp$resDownloadListener$1 f62781f = new VideoSubtitleManagerImp$resDownloadListener$1(this);

    /* JADX INFO: renamed from: com.transsion.subtitle.VideoSubtitleManagerImp$a */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C19654a {
        private C19654a() {
        }

        public /* synthetic */ C19654a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final InterfaceC26287v0 m81919A() {
        return (InterfaceC26287v0) this.f62777b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final String m81920B() {
        return C14496b.f50966a.m65344b().getString("k_language_short_name", null);
    }

    /* JADX INFO: renamed from: C */
    private final void m81921C() {
        if (!C14496b.f50966a.m65344b().getBoolean("subtitle_old_db_move", false)) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new VideoSubtitleManagerImp$initOldSubtitleMoveDB$1(this, null), 3, null);
            return;
        }
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), this.f62779d + " 转移数据库, 已转移过，不再处理", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC26287v0 m81922D() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64877x1();
    }

    /* JADX INFO: renamed from: s */
    private final void m81931s(DownloadBean downloadBean, Function1 function1) {
        if (!downloadBean.isVideo() || downloadBean.isMusic()) {
            return;
        }
        if (C27287m.f83003a.m106330e()) {
            if (downloadBean.isUGCVideo()) {
                m81937y(downloadBean, function1);
                return;
            } else if (downloadBean.getIsStream()) {
                m81935w(downloadBean, function1);
                return;
            } else {
                m81933u(downloadBean, function1);
                return;
            }
        }
        C26866a.f81698a.m104921x(C14482a.f50937a.m65273a(), this.f62779d + " checkDownloadSubtitle ,无网络不做检测", true);
    }

    /* JADX INFO: renamed from: t */
    static /* synthetic */ void m81932t(VideoSubtitleManagerImp videoSubtitleManagerImp, DownloadBean downloadBean, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        videoSubtitleManagerImp.m81931s(downloadBean, function1);
    }

    /* JADX INFO: renamed from: u */
    private final void m81933u(final DownloadBean downloadBean, final Function1 function1) {
        String resourceId = downloadBean.getResourceId();
        if (resourceId == null || resourceId.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, C14482a.f50937a.m65273a(), this.f62779d + " checkDownloadSubtitleNormal fail， has no resourceId", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        String resourceId2 = downloadBean.getResourceId();
        if ((resourceId2 != null ? StringsKt.m98218x(resourceId2) : null) == null) {
            C26866a.a.m104910z(C26866a.f81698a, C14482a.f50937a.m65273a(), this.f62779d + " checkDownloadSubtitleNormal ,resourceId is abnormal", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), this.f62779d + " checkDownloadSubtitleNormal, name = " + downloadBean.getName() + " subjectId:" + downloadBean.getSubjectId() + " subtitleResId:" + downloadBean.getSubtitleResId() + " resourceId:" + downloadBean.getResourceId(), true);
        if (downloadBean.isOutside()) {
            downloadBean.getPostIdNotNull();
        } else if (downloadBean.getPostId() == null) {
            downloadBean.getResourceId();
        }
        SubtitleDownloadManager.f63041a.m82265e(downloadBean.getSubjectId(), downloadBean.getSubtitleResId(), downloadBean.getResourceId(), null, downloadBean.getSubjectName(), 1, downloadBean.getEpse(), downloadBean.getEp(), downloadBean.getSe(), downloadBean.getOps(), new Function1() { // from class: com.transsion.subtitle.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoSubtitleManagerImp.m81934v(this.f62981a, function1, downloadBean, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Unit m81934v(VideoSubtitleManagerImp videoSubtitleManagerImp, Function1 function1, DownloadBean downloadBean, boolean z11) {
        AbstractC25136k.m99058d(videoSubtitleManagerImp.f62780e, null, null, new VideoSubtitleManagerImp$checkDownloadSubtitleNormal$1$1(function1, z11, videoSubtitleManagerImp, downloadBean, null), 3, null);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w */
    private final void m81935w(final DownloadBean downloadBean, final Function1 function1) {
        String resourceId = downloadBean.getResourceId();
        if (resourceId == null || resourceId.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, C14482a.f50937a.m65273a(), this.f62779d + " checkStreamSubtitle fail， has no resourceId", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        String resourceId2 = downloadBean.getResourceId();
        if ((resourceId2 != null ? StringsKt.m98218x(resourceId2) : null) == null) {
            C26866a.a.m104910z(C26866a.f81698a, C14482a.f50937a.m65273a(), this.f62779d + " checkStreamSubtitle ,resourceId is abnormal", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), this.f62779d + " checkStreamSubtitle, name = " + downloadBean.getName() + " subjectId:" + downloadBean.getSubjectId() + " subtitleResId:" + downloadBean.getSubtitleResId() + " resourceId:" + downloadBean.getResourceId(), true);
        SubtitleDownloadManager.f63041a.m82265e(downloadBean.getSubjectId(), downloadBean.getSubtitleResId(), downloadBean.getResourceId(), null, downloadBean.getSubjectName(), 2, downloadBean.getEpse(), downloadBean.getEp(), downloadBean.getSe(), downloadBean.getOps(), new Function1() { // from class: com.transsion.subtitle.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoSubtitleManagerImp.m81936x(this.f62984a, function1, downloadBean, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Unit m81936x(VideoSubtitleManagerImp videoSubtitleManagerImp, Function1 function1, DownloadBean downloadBean, boolean z11) {
        AbstractC25136k.m99058d(videoSubtitleManagerImp.f62780e, null, null, new VideoSubtitleManagerImp$checkStreamSubtitle$1$1(function1, z11, videoSubtitleManagerImp, downloadBean, null), 3, null);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: y */
    private final void m81937y(final DownloadBean downloadBean, final Function1 function1) {
        String ugcVideoId = downloadBean.getUgcVideoId();
        if (ugcVideoId == null || ugcVideoId.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, C14482a.f50937a.m65273a(), this.f62779d + " checkUGCVideoSubtitle fail，UGC视频缺少ugcVideoId", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        String resourceId = downloadBean.getResourceId();
        if (resourceId == null || resourceId.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, C14482a.f50937a.m65273a(), this.f62779d + " checkUGCVideoSubtitle fail，UGC视频缺少resourceId（videoResourceId）", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        String subtitleIdType = downloadBean.getSubtitleIdType();
        if (subtitleIdType == null) {
            subtitleIdType = downloadBean.getIsStream() ? "StreamId" : "ResourceId";
        }
        String str = subtitleIdType;
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), this.f62779d + " checkUGCVideoSubtitle, name = " + downloadBean.getName() + " ugcVideoId:" + downloadBean.getUgcVideoId() + " collectionId:" + downloadBean.getUgcVideoCollectionId() + " videoResourceId:" + resourceId + " idType:" + str, true);
        SubtitleDownloadManager.f63041a.m82266f(downloadBean.getSubjectId(), downloadBean.getSubtitleResId(), resourceId, downloadBean.getUgcVideoId(), downloadBean.getUgcVideoCollectionId(), downloadBean.getOps(), str, new Function1() { // from class: com.transsion.subtitle.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoSubtitleManagerImp.m81938z(this.f62978a, function1, downloadBean, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Unit m81938z(VideoSubtitleManagerImp videoSubtitleManagerImp, Function1 function1, DownloadBean downloadBean, boolean z11) {
        AbstractC25136k.m99058d(videoSubtitleManagerImp.f62780e, null, null, new VideoSubtitleManagerImp$checkUGCVideoSubtitle$1$1(function1, z11, videoSubtitleManagerImp, downloadBean, null), 3, null);
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: a */
    public Object mo81939a(String str, Continuation continuation) throws Throwable {
        VideoSubtitleManagerImp$getSubtitleList$1 videoSubtitleManagerImp$getSubtitleList$1;
        List list;
        if (continuation instanceof VideoSubtitleManagerImp$getSubtitleList$1) {
            videoSubtitleManagerImp$getSubtitleList$1 = (VideoSubtitleManagerImp$getSubtitleList$1) continuation;
            int i11 = videoSubtitleManagerImp$getSubtitleList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                videoSubtitleManagerImp$getSubtitleList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                videoSubtitleManagerImp$getSubtitleList$1 = new VideoSubtitleManagerImp$getSubtitleList$1(this, continuation);
            }
        } else {
            videoSubtitleManagerImp$getSubtitleList$1 = new VideoSubtitleManagerImp$getSubtitleList$1(this, continuation);
        }
        Object obj = videoSubtitleManagerImp$getSubtitleList$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = videoSubtitleManagerImp$getSubtitleList$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(obj);
            ArrayList arrayList = new ArrayList();
            SubtitleDownloadManager subtitleDownloadManager = SubtitleDownloadManager.f63041a;
            videoSubtitleManagerImp$getSubtitleList$1.L$0 = arrayList;
            videoSubtitleManagerImp$getSubtitleList$1.label = 1;
            Object objM82269j = subtitleDownloadManager.m82269j(str, videoSubtitleManagerImp$getSubtitleList$1);
            if (objM82269j == objF) {
                return objF;
            }
            obj = objM82269j;
            list = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) videoSubtitleManagerImp$getSubtitleList$1.L$0;
            ResultKt.m97107b(obj);
        }
        List list2 = (List) obj;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(new C24469a((SubtitleDownloadTable) it.next()));
            }
        }
        return list;
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: b */
    public void mo81940b(InterfaceC19743a listener) {
        Intrinsics.m97802h(listener, "listener");
        SubtitleDownloadManager.f63041a.m82262b(listener);
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: c */
    public void mo81941c(InterfaceC19743a listener) {
        Intrinsics.m97802h(listener, "listener");
        SubtitleDownloadManager.f63041a.m82278s(listener);
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: d */
    public void mo81942d(DownloadBean bean, Function1 function1) {
        Intrinsics.m97802h(bean, "bean");
        m81931s(bean, function1);
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    public void destroy() {
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: e */
    public void mo81943e(InterfaceC25911c listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f62778c.remove(listener);
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: f */
    public void mo81944f(InterfaceC25911c listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f62778c.add(listener);
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: g */
    public void mo81945g(C24469a bean) {
        Intrinsics.m97802h(bean, "bean");
        Iterator it = this.f62778c.iterator();
        while (it.hasNext()) {
            ((InterfaceC25911c) it.next()).mo81898g(bean);
        }
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: h */
    public void mo81946h(C24469a bean) {
        Intrinsics.m97802h(bean, "bean");
        SubtitleDownloadManager.f63041a.m82264d(bean.m96011b());
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: i */
    public void mo81947i(DownloadBean bean) {
        Intrinsics.m97802h(bean, "bean");
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), this.f62779d + " 打开字幕弹窗检测字幕，subjectId:" + bean.getSubjectId() + " subtitleResId:" + bean.getSubtitleResId(), true);
        m81932t(this, bean, null, 2, null);
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    public void init() {
        SubtitleSearchHelper.f62938c.m82160a().m82159j();
        SubtitleDownloadManager subtitleDownloadManager = SubtitleDownloadManager.f63041a;
        subtitleDownloadManager.m82271l(new Function0() { // from class: com.transsion.subtitle.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoSubtitleManagerImp.m81920B();
            }
        });
        subtitleDownloadManager.m82270k(SubtitleAppType.MB);
        C21851p.f67672a.m88759a(Utils.m27275a()).mo88690u(this.f62781f);
        m81921C();
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    /* JADX INFO: renamed from: j */
    public void mo81948j(C24469a bean) {
        Intrinsics.m97802h(bean, "bean");
        SubtitleDownloadManager.f63041a.m82264d(bean.m96011b());
    }

    @Override // com.transsion.subtitle.InterfaceC19714h
    public void reset() {
    }
}
