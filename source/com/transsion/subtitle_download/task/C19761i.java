package com.transsion.subtitle_download.task;

import android.app.Application;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.kernel.utils.UrlUtils;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19771b;
import com.transsion.subtitle_download.utils.C19774e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p554io.CloseableKt;
import kotlin.text.StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.transsion.subtitle_download.task.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C19761i extends AbstractC19754b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Unit m82336o(SubtitleDownloadTable subtitleDownloadTable, int i11) {
        SubtitleDownloadManager.f63041a.m82275p(i11, subtitleDownloadTable);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Unit m82337p(SubtitleDownloadTable subtitleDownloadTable, String str, C19761i c19761i) {
        subtitleDownloadTable.setPath(str);
        C19774e.f63091a.m82380j(subtitleDownloadTable);
        subtitleDownloadTable.setStatus(5);
        SubtitleDownloadDatabase.Companion companion = SubtitleDownloadDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        companion.m82292b(applicationM27275a).mo82290l0().mo106547f(subtitleDownloadTable);
        C19771b.f63088a.m82365a(c19761i.m82325l() + " --> disposeOnResponse() --> 文件保存在 = " + str + " -- resourceId = " + subtitleDownloadTable.getResourceId() + " --> getSubtitleInfo = " + subtitleDownloadTable.getSubtitleInfo());
        SubtitleDownloadManager.f63041a.m82273n(subtitleDownloadTable);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: q */
    private final String m82338q(Response response) {
        String strHeader$default = Response.header$default(response, HttpHeaders.CONTENT_DISPOSITION, null, 2, null);
        if (strHeader$default != null) {
            Matcher matcher = Pattern.compile("filename=\"?([^\";]*)\"?").matcher(strHeader$default);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    @Override // com.transsion.subtitle_download.task.AbstractC19754b
    /* JADX INFO: renamed from: i */
    public void mo82322i(Response response, final SubtitleDownloadTable dbBean) {
        String str;
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
        String strM82338q = m82338q(response);
        if (strM82338q == null) {
            strM82338q = dbBean.getName() + "." + strValueOf;
        }
        if (dbBean.getEp() > 0) {
            str = AbstractC19754b.f63060a.m82328c() + File.separatorChar + dbBean.getSubjectFileName() + "_S" + dbBean.getSe() + "_E" + dbBean.getEp();
        } else {
            str = AbstractC19754b.f63060a.m82328c() + File.separatorChar + dbBean.getSubjectFileName();
        }
        C19774e c19774e = C19774e.f63091a;
        c19774e.m82372a(str);
        final String path = c19774e.m82378h(str, strM82338q).getPath();
        C19771b.f63088a.m82365a(m82325l() + " --> disposeOnResponse() --> 接口请求成功 开始保存数据到本 --> " + dbBean.getName() + "." + dbBean.getResourceId() + ",文件大小 = " + contentLength + " --> destination = " + path);
        Intrinsics.m97799e(path);
        mo82323j(response, path, contentLength, dbBean, new Function1() { // from class: com.transsion.subtitle_download.task.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C19761i.m82336o(dbBean, ((Integer) obj).intValue());
            }
        }, new Function0() { // from class: com.transsion.subtitle_download.task.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C19761i.m82337p(dbBean, path, this);
            }
        });
    }

    @Override // com.transsion.subtitle_download.task.AbstractC19754b
    /* JADX INFO: renamed from: j */
    public boolean mo82323j(Response response, String destination, long j11, SubtitleDownloadTable dbBean, Function1 progressCallback, Function0 completeCallback) {
        InputStream inputStreamByteStream;
        Intrinsics.m97802h(response, "response");
        Intrinsics.m97802h(destination, "destination");
        Intrinsics.m97802h(dbBean, "dbBean");
        Intrinsics.m97802h(progressCallback, "progressCallback");
        Intrinsics.m97802h(completeCallback, "completeCallback");
        C19774e c19774e = C19774e.f63091a;
        AbstractC19754b.a aVar = AbstractC19754b.f63060a;
        c19774e.m82372a(aVar.m82328c());
        c19774e.m82372a(aVar.m82329d());
        try {
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null || (inputStreamByteStream = responseBodyBody.byteStream()) == null) {
                return false;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(destination);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i11 = inputStreamByteStream.read(bArr);
                        if (i11 == -1) {
                            completeCallback.invoke();
                            CloseableKt.m97669a(fileOutputStream, null);
                            CloseableKt.m97669a(inputStreamByteStream, null);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i11);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.m97669a(inputStreamByteStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.m97669a(fileOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
