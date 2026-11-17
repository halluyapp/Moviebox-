package com.transsion.subtitle_download.task;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19771b;
import com.transsion.subtitle_download.utils.C19774e;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.transsion.subtitle_download.task.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C19758f extends AbstractC19754b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Unit m82332o(SubtitleDownloadTable subtitleDownloadTable, int i11) {
        SubtitleDownloadManager.f63041a.m82275p(i11, subtitleDownloadTable);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Unit m82333p(SubtitleDownloadTable subtitleDownloadTable, String str, C19758f c19758f) {
        subtitleDownloadTable.setPath(str);
        C19774e.f63091a.m82380j(subtitleDownloadTable);
        subtitleDownloadTable.setStatus(5);
        SubtitleDownloadDatabase.Companion companion = SubtitleDownloadDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        companion.m82292b(applicationM27275a).mo82290l0().mo106547f(subtitleDownloadTable);
        C19771b.f63088a.m82365a(c19758f.m82325l() + " --> disposeOnResponse() --> 文件保存在 = " + str + " -- resourceId = " + subtitleDownloadTable.getResourceId() + " --> getSubtitleInfo = " + subtitleDownloadTable.getSubtitleInfo());
        SubtitleDownloadManager.f63041a.m82273n(subtitleDownloadTable);
        return Unit.f75682a;
    }

    @Override // com.transsion.subtitle_download.task.AbstractC19754b
    /* JADX INFO: renamed from: i */
    public void mo82322i(Response response, final SubtitleDownloadTable dbBean) {
        String str;
        String str2;
        String strH1;
        Intrinsics.m97802h(response, "response");
        Intrinsics.m97802h(dbBean, "dbBean");
        ResponseBody responseBodyBody = response.body();
        long contentLength = responseBodyBody != null ? responseBodyBody.getContentLength() : 0L;
        if (response.body() == null) {
            C19771b.f63088a.m82366b(m82325l() + " --> disposeOnResponse() --> null == response.body --> headers = " + response.headers());
        }
        String url = dbBean.getUrl();
        String strF1 = null;
        if (url != null && (strH1 = StringsKt.m98143h1(url, UrlUtils.QUESTION_MARK, null, 2, null)) != null) {
            strF1 = StringsKt.m98139f1(strH1, ".", null, 2, null);
        }
        String strValueOf = String.valueOf(strF1);
        if (dbBean.getEp() > 0) {
            str = dbBean.getSubjectFileName() + "_S" + dbBean.getSe() + "_E" + dbBean.getEp() + "_" + dbBean.getLanName() + "." + strValueOf;
        } else {
            str = dbBean.getSubjectFileName() + "_" + dbBean.getLanName() + "." + strValueOf;
        }
        if (dbBean.getEp() > 0) {
            str2 = AbstractC19754b.f63060a.m82328c() + File.separatorChar + dbBean.getSubjectFileName() + "_S" + dbBean.getSe() + "_E" + dbBean.getEp();
        } else {
            str2 = AbstractC19754b.f63060a.m82328c() + File.separatorChar + dbBean.getSubjectFileName();
        }
        C19774e c19774e = C19774e.f63091a;
        c19774e.m82372a(str2);
        final String path = c19774e.m82378h(str2, str).getPath();
        C19771b.f63088a.m82365a(m82325l() + " --> disposeOnResponse() --> 接口请求成功 开始保存数据到本 --> " + dbBean.getName() + "." + dbBean.getResourceId() + ",文件大小 = " + contentLength + " --> destination = " + path);
        Intrinsics.m97799e(path);
        mo82323j(response, path, contentLength, dbBean, new Function1() { // from class: com.transsion.subtitle_download.task.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C19758f.m82332o(dbBean, ((Integer) obj).intValue());
            }
        }, new Function0() { // from class: com.transsion.subtitle_download.task.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C19758f.m82333p(dbBean, path, this);
            }
        });
    }
}
