package com.transsion.subtitle_download.task;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.Utils;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19771b;
import com.transsion.subtitle_download.utils.C19774e;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.subtitle_download.task.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C19768p {

    /* JADX INFO: renamed from: a */
    public static final C19768p f63082a = new C19768p();

    /* JADX INFO: renamed from: b */
    private static final LinkedBlockingDeque f63083b = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: c */
    private static volatile boolean f63084c;

    private C19768p() {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m82348e(C19768p c19768p, SubtitleDownloadTable subtitleDownloadTable, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c19768p.m82355d(subtitleDownloadTable, z11);
    }

    /* JADX INFO: renamed from: f */
    private final void m82349f() {
        f63084c = false;
        m82350g();
    }

    /* JADX INFO: renamed from: g */
    private final void m82350g() {
        Object objM112707constructorimpl;
        Unit unit;
        if (!f63084c) {
            LinkedBlockingDeque linkedBlockingDeque = f63083b;
            if (!linkedBlockingDeque.isEmpty()) {
                f63084c = true;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    SubtitleDownloadTable subtitleDownloadTable = (SubtitleDownloadTable) linkedBlockingDeque.removeFirst();
                    if (subtitleDownloadTable != null) {
                        int type = subtitleDownloadTable.getType();
                        if (type == 4) {
                            new C19764l().m82324k(subtitleDownloadTable, new Function0() { // from class: com.transsion.subtitle_download.task.m
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C19768p.m82351h(this.f63079a);
                                }
                            });
                        } else if (type != 5) {
                            new C19758f().m82324k(subtitleDownloadTable, new Function0() { // from class: com.transsion.subtitle_download.task.o
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C19768p.m82353j(this.f63081a);
                                }
                            });
                        } else {
                            new C19761i().m82324k(subtitleDownloadTable, new Function0() { // from class: com.transsion.subtitle_download.task.n
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C19768p.m82352i(this.f63080a);
                                }
                            });
                        }
                        unit = Unit.f75682a;
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
                Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                if (thM112710exceptionOrNullimpl == null) {
                    return;
                }
                C19771b c19771b = C19771b.f63088a;
                C19768p c19768p = f63082a;
                c19771b.m82366b(c19768p.m82354k() + " --> downloadNext() --> 执行下载任务发生异常 -- it = " + Log.getStackTraceString(thM112710exceptionOrNullimpl));
                c19768p.m82349f();
                return;
            }
        }
        LinkedBlockingDeque linkedBlockingDeque2 = f63083b;
        if (linkedBlockingDeque2.isEmpty()) {
            C19771b.f63088a.m82367c(m82354k() + " --> downloadNext() --> taskList = " + linkedBlockingDeque2.size() + " -- 当前没有可执行任务了");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m82351h(C19768p c19768p) {
        c19768p.m82349f();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Unit m82352i(C19768p c19768p) {
        c19768p.m82349f();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Unit m82353j(C19768p c19768p) {
        c19768p.m82349f();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: k */
    private final String m82354k() {
        String simpleName = C19768p.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: d */
    public final void m82355d(SubtitleDownloadTable dbBean, boolean z11) {
        Intrinsics.m97802h(dbBean, "dbBean");
        if (C19774e.f63091a.m82379i(dbBean.getPath())) {
            C19771b.f63088a.m82367c(m82354k() + " --> addTaskAndExecute() --> 开始下载字幕 --> 如果字幕资源已经下载完成了，那就直接跳过 --> next() -- getSubtitleInfo = " + dbBean.getSubtitleInfo());
            dbBean.setStatus(5);
            SubtitleDownloadDatabase.Companion c19749d = SubtitleDownloadDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            c19749d.m82292b(applicationM27275a).mo82290l0().mo106547f(dbBean);
            SubtitleDownloadManager.f63041a.m82273n(dbBean);
            return;
        }
        Iterator it = f63083b.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (TextUtils.equals(((SubtitleDownloadTable) it.next()).getId(), dbBean.getId())) {
                z12 = true;
            }
        }
        if (z12) {
            return;
        }
        C19769q.f63085a.m82359d(dbBean);
        if (z11) {
            f63083b.addFirst(dbBean);
        } else {
            f63083b.add(dbBean);
        }
        C19771b.f63088a.m82365a(m82354k() + " --> addTaskAndExecute() --> 剩余任务数量 -- taskList.size = " + f63083b.size() + " --> isDownloading = " + f63084c + " --> dbBean.failCount = " + dbBean.getFailCount());
        m82350g();
    }
}
