package com.transsion.subtitle_download.task;

import android.app.Application;
import android.net.Uri;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.blankj.utilcode.util.Utils;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19770a;
import com.transsion.subtitle_download.utils.C19771b;
import com.transsion.subtitle_download.utils.C19774e;
import java.io.File;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.transsion.subtitle_download.task.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C19764l extends AbstractC19754b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Unit m82341o(SubtitleDownloadTable subtitleDownloadTable, int i11) {
        SubtitleDownloadManager.f63041a.m82275p(i11, subtitleDownloadTable);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Unit m82342p(SubtitleDownloadTable subtitleDownloadTable, String str, C19764l c19764l) {
        subtitleDownloadTable.setZipPath(str);
        SubtitleDownloadDatabase.Companion companion = SubtitleDownloadDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        companion.m82292b(applicationM27275a).mo82290l0().mo106547f(subtitleDownloadTable);
        C19771b.f63088a.m82365a(c19764l.m82325l() + " --> disposeOnResponse() --> 压缩文件保存在 = " + str + " -- getSubtitleInfo = " + subtitleDownloadTable.getSubtitleInfo());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m82343q(SubtitleDownloadTable subtitleDownloadTable) {
        if (C19774e.f63091a.m82380j(subtitleDownloadTable)) {
            C19771b.f63088a.m82365a(m82325l() + " --> parseFileCharsetName() --> 字幕压缩包下载成功 --> 开始解析字幕文件的编码格式 --> 成功 --> 保存状态到数据库");
            subtitleDownloadTable.setStatus(5);
            SubtitleDownloadDatabase.Companion companion = SubtitleDownloadDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            companion.m82292b(applicationM27275a).mo82290l0().mo106547f(subtitleDownloadTable);
            SubtitleDownloadManager.f63041a.m82273n(subtitleDownloadTable);
            return true;
        }
        try {
            Result.Companion companion2 = Result.INSTANCE;
            String path = subtitleDownloadTable.getPath();
            if (path == null) {
                path = "";
            }
            Result.m112707constructorimpl(Boolean.valueOf(new File(path).delete()));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        m82321h(subtitleDownloadTable, new RuntimeException(m82325l() + " --> parseFileCharsetName() --> 解析字幕文件的编码格式失败 --> 删除字幕文件"));
        return false;
    }

    /* JADX INFO: renamed from: r */
    private final boolean m82344r(SubtitleDownloadTable subtitleDownloadTable) {
        String str;
        boolean z11;
        SubtitleDownloadManager.f63041a.m82277r(subtitleDownloadTable);
        String zipPath = subtitleDownloadTable.getZipPath();
        C19771b c19771b = C19771b.f63088a;
        c19771b.m82365a(m82325l() + " --> unGzZip() --> 字幕压缩包下载成功 --> 开始解压缩 .... zipPath = " + zipPath);
        if (subtitleDownloadTable.getEp() > 0) {
            str = AbstractC19754b.f63060a.m82328c() + File.separatorChar + subtitleDownloadTable.getSubjectFileName() + "_S" + subtitleDownloadTable.getSe() + "_E" + subtitleDownloadTable.getEp();
        } else {
            str = AbstractC19754b.f63060a.m82328c() + File.separatorChar + subtitleDownloadTable.getSubjectFileName();
        }
        C19774e.f63091a.m82372a(str);
        String str2 = str + File.separatorChar + subtitleDownloadTable.getName();
        boolean zM82364a = C19770a.f63087a.m82364a(subtitleDownloadTable.getZipPath(), str2);
        if (zM82364a) {
            c19771b.m82365a(m82325l() + " --> unGzZip() --> 字幕压缩包下载成功 --> 开始解压缩 --> 解压缩成功");
            subtitleDownloadTable.setPath(str2);
            z11 = true;
        } else {
            m82321h(subtitleDownloadTable, new RuntimeException(m82325l() + " --> unGzZip() --> 字幕压缩文件解压失败"));
            z11 = false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            new File(zipPath).delete();
            c19771b.m82365a(m82325l() + " --> unGzZip() --> result = " + zM82364a + " -- 无论成功失败，都删除压缩包 -- 这里修改成删除压缩缓存文件夹里面的所有文件");
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return z11;
    }

    @Override // com.transsion.subtitle_download.task.AbstractC19754b
    /* JADX INFO: renamed from: i */
    public void mo82322i(Response response, final SubtitleDownloadTable dbBean) {
        String str;
        Intrinsics.m97802h(response, "response");
        Intrinsics.m97802h(dbBean, "dbBean");
        int iCode = response.code();
        if (200 > iCode || iCode >= 300) {
            m82321h(dbBean, new RuntimeException(m82325l() + " --> disposeOnResponse() --> 搜索字幕接口请求失败 --> response.code = " + response.code()));
            return;
        }
        String str2 = response.headers().get(HttpHeaders.CONTENT_DISPOSITION);
        List listS0 = str2 != null ? StringsKt.m98117S0(str2, new String[]{"filename="}, false, 0, 6, null) : null;
        C19771b c19771b = C19771b.f63088a;
        c19771b.m82365a(m82325l() + " --> disposeOnResponse() --> 请求成功 --> response.code = " + response.code() + " -- list = " + listS0);
        if (listS0 == null || !(!listS0.isEmpty()) || listS0.size() <= 1) {
            str = AbstractC19754b.f63060a.m82329d() + File.separatorChar + Uri.decode(dbBean.getName()).hashCode();
        } else {
            String strReplace = new Regex("[\\\\/:*?\"<>|]").replace(Uri.decode((String) listS0.get(1)).toString(), "");
            str = AbstractC19754b.f63060a.m82329d() + File.separatorChar + strReplace;
        }
        final String str3 = str;
        ResponseBody responseBodyBody = response.body();
        if (mo82323j(response, str3, responseBodyBody != null ? responseBodyBody.getContentLength() : 0L, dbBean, new Function1() { // from class: com.transsion.subtitle_download.task.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C19764l.m82341o(dbBean, ((Integer) obj).intValue());
            }
        }, new Function0() { // from class: com.transsion.subtitle_download.task.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C19764l.m82342p(dbBean, str3, this);
            }
        }) && m82344r(dbBean) && m82343q(dbBean)) {
            c19771b.m82366b("--------------------------------------------------------------------");
        }
    }
}
