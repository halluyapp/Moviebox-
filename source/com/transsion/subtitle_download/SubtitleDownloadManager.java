package com.transsion.subtitle_download;

import android.text.TextUtils;
import com.transsion.subtitle_download.bean.SubtitleAppType;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.task.C19769q;
import com.transsion.subtitle_download.task.GetInStationSubtitleListTask;
import com.transsion.subtitle_download.utils.C19771b;
import com.transsion.subtitle_download.utils.ObserveNetworkState;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleDownloadManager {

    /* JADX INFO: renamed from: a */
    public static final SubtitleDownloadManager f63041a = new SubtitleDownloadManager();

    /* JADX INFO: renamed from: b */
    private static SubtitleAppType f63042b = SubtitleAppType.MB;

    /* JADX INFO: renamed from: c */
    private static final CopyOnWriteArrayList f63043c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    private static Function0 f63044d;

    private SubtitleDownloadManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final String m82261i() {
        String simpleName = SubtitleDownloadManager.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: b */
    public final void m82262b(InterfaceC19743a listener) {
        Intrinsics.m97802h(listener, "listener");
        f63043c.add(listener);
    }

    /* JADX INFO: renamed from: c */
    public final Object m82263c(String str, Continuation continuation) {
        Object objM98910g = AbstractC25088i.m98910g(C25220y0.m99268b(), new SubtitleDownloadManager$deleteSubtitle$2(str, null), continuation);
        return objM98910g == IntrinsicsKt.m97630f() ? objM98910g : Unit.f75682a;
    }

    /* JADX INFO: renamed from: d */
    public final void m82264d(SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(dbBean, "dbBean");
        GetInStationSubtitleListTask.f63057a.m82311h(dbBean);
    }

    /* JADX INFO: renamed from: e */
    public final void m82265e(String str, String str2, String str3, String str4, String str5, int i11, int i12, int i13, int i14, String str6, Function1 function1) {
        GetInStationSubtitleListTask.f63057a.m82312i(str, str2, str4, i12, i13, i14, str3, str5, str6, i11, function1);
    }

    /* JADX INFO: renamed from: f */
    public final void m82266f(String str, String str2, String videoResourceId, String str3, String str4, String str5, String idType, Function1 function1) {
        Intrinsics.m97802h(videoResourceId, "videoResourceId");
        Intrinsics.m97802h(idType, "idType");
        GetInStationSubtitleListTask.f63057a.m82313j(str, str2, videoResourceId, str3, str4, str5, idType, function1);
    }

    /* JADX INFO: renamed from: g */
    public final String m82267g() {
        Function0 function0 = f63044d;
        if (function0 != null) {
            return (String) function0.invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final SubtitleAppType m82268h() {
        return f63042b;
    }

    /* JADX INFO: renamed from: j */
    public final Object m82269j(String str, Continuation continuation) {
        return AbstractC25088i.m98910g(C25220y0.m99268b(), new SubtitleDownloadManager$getSubtitleList$2(str, null), continuation);
    }

    /* JADX INFO: renamed from: k */
    public final void m82270k(SubtitleAppType appType) {
        Intrinsics.m97802h(appType, "appType");
        f63042b = appType;
        C19771b.f63088a.m82366b(m82261i() + " --> init() --> 字幕下载工具初始化");
        ObserveNetworkState.f63086a.m82363d();
    }

    /* JADX INFO: renamed from: l */
    public final void m82271l(Function0 function0) {
        f63044d = function0;
    }

    /* JADX INFO: renamed from: m */
    public final Object m82272m(SubtitleDownloadTable subtitleDownloadTable, Continuation continuation) {
        if (!TextUtils.isEmpty(subtitleDownloadTable.getPath()) && !TextUtils.isEmpty(subtitleDownloadTable.getResourceId()) && !TextUtils.isEmpty(subtitleDownloadTable.getId())) {
            Object objM98910g = AbstractC25088i.m98910g(C25220y0.m99268b(), new SubtitleDownloadManager$migration$2(subtitleDownloadTable, null), continuation);
            return objM98910g == IntrinsicsKt.m97630f() ? objM98910g : Unit.f75682a;
        }
        C19771b.f63088a.m82366b(m82261i() + " --> migration() --> 缺少必要字段 --> path = " + subtitleDownloadTable.getPath() + " -- resourceId = " + subtitleDownloadTable.getResourceId() + " -- id = " + subtitleDownloadTable.getId());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: n */
    public final void m82273n(SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        C19769q.f63085a.m82358c(stDownloadTable);
        Iterator it = f63043c.iterator();
        while (it.hasNext()) {
            ((InterfaceC19743a) it.next()).onComplete(stDownloadTable);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m82274o(Exception e11, SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(e11, "e");
        Intrinsics.m97802h(dbBean, "dbBean");
        Iterator it = f63043c.iterator();
        while (it.hasNext()) {
            ((InterfaceC19743a) it.next()).onFail(e11, dbBean);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m82275p(int i11, SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        Iterator it = f63043c.iterator();
        while (it.hasNext()) {
            ((InterfaceC19743a) it.next()).onDownloading(i11, stDownloadTable);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m82276q(SubtitleDownloadTable bean) {
        Intrinsics.m97802h(bean, "bean");
        Iterator it = f63043c.iterator();
        while (it.hasNext()) {
            ((InterfaceC19743a) it.next()).onSaveDownload(bean);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m82277r(SubtitleDownloadTable stDownloadTable) {
        Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        Iterator it = f63043c.iterator();
        while (it.hasNext()) {
            ((InterfaceC19743a) it.next()).onUnGzZip(stDownloadTable);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m82278s(InterfaceC19743a listener) {
        Intrinsics.m97802h(listener, "listener");
        f63043c.remove(listener);
    }
}
