package com.transsion.subtitle_download.task;

import android.app.Application;
import android.os.Environment;
import com.blankj.utilcode.util.Utils;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19771b;
import com.transsion.subtitle_download.utils.C19774e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p554io.CloseableKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.transsion.subtitle_download.task.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19754b {

    /* JADX INFO: renamed from: a */
    public static final a f63060a = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: b */
    private static final String f63061b;

    /* JADX INFO: renamed from: c */
    private static final String f63062c;

    /* JADX INFO: renamed from: d */
    private static final Lazy f63063d;

    /* JADX INFO: renamed from: com.transsion.subtitle_download.task.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final OkHttpClient m82327b() {
            return (OkHttpClient) AbstractC19754b.f63063d.getValue();
        }

        /* JADX INFO: renamed from: c */
        public final String m82328c() {
            return AbstractC19754b.f63061b;
        }

        /* JADX INFO: renamed from: d */
        public final String m82329d() {
            return AbstractC19754b.f63062c;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle_download.task.b$b */
    public static final class b implements Callback {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SubtitleDownloadTable f63065b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function0 f63066c;

        b(SubtitleDownloadTable subtitleDownloadTable, Function0 function0) {
            this.f63065b = subtitleDownloadTable;
            this.f63066c = function0;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e11) {
            Intrinsics.m97802h(call, "call");
            Intrinsics.m97802h(e11, "e");
            AbstractC19754b.this.m82321h(this.f63065b, new RuntimeException(e11.getMessage()));
            this.f63066c.invoke();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            int iCode;
            Intrinsics.m97802h(call, "call");
            Intrinsics.m97802h(response, "response");
            if (response.isSuccessful()) {
                AbstractC19754b.this.mo82322i(response, this.f63065b);
                this.f63066c.invoke();
            } else if (response.code() != 404 && 400 <= (iCode = response.code()) && iCode < 600) {
                AbstractC19754b.this.m82320g(response, this.f63065b, this.f63066c);
            } else {
                AbstractC19754b.this.m82321h(this.f63065b, new RuntimeException(response.message()));
                this.f63066c.invoke();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        File externalFilesDir = Utils.m27275a().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        String absolutePath = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        char c11 = File.separatorChar;
        f63061b = absolutePath + c11 + "subtitle";
        File externalFilesDir2 = Utils.m27275a().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        f63062c = (externalFilesDir2 != null ? externalFilesDir2.getAbsolutePath() : null) + c11 + "subtitle_zip";
        f63063d = LazyKt.m97097b(new Function0() { // from class: com.transsion.subtitle_download.task.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC19754b.m82319f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final OkHttpClient m82319f() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.connectTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).readTimeout(30L, timeUnit).cache(null).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m82320g(Response response, SubtitleDownloadTable subtitleDownloadTable, Function0 function0) {
        m82321h(subtitleDownloadTable, new RuntimeException(response.message()));
        function0.invoke();
    }

    /* JADX INFO: renamed from: h */
    public final void m82321h(SubtitleDownloadTable dbBean, Exception e11) {
        Intrinsics.m97802h(dbBean, "dbBean");
        Intrinsics.m97802h(e11, "e");
        dbBean.setFailCount(dbBean.getFailCount() + 1);
        C19771b c19771b = C19771b.f63088a;
        c19771b.m82366b(m82325l() + " --> disposeOnFailure() --> e = " + e11.getMessage() + " -- getSubtitleInfo = " + dbBean.getSubtitleInfo() + " --> dbBean.failCount = " + dbBean.getFailCount());
        dbBean.setStatus(6);
        if (dbBean.getType() == 2 || dbBean.getType() == 4 || dbBean.getType() == 5 || dbBean.getFailCount() > 5) {
            c19771b.m82366b(m82325l() + " --> disposeOnFailure() --> delete(dbBean) --> 如果是搜索字幕，下载失败就从数据库移除 --> getSubtitleInfo = " + dbBean.getSubtitleInfo() + " --> failCount = " + dbBean.getFailCount());
            SubtitleDownloadDatabase.Companion companion = SubtitleDownloadDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            companion.m82292b(applicationM27275a).mo82290l0().mo106548g(dbBean);
        } else {
            SubtitleDownloadDatabase.Companion companion2 = SubtitleDownloadDatabase.INSTANCE;
            Application applicationM27275a2 = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a2, "getApp(...)");
            companion2.m82292b(applicationM27275a2).mo82290l0().mo106547f(dbBean);
        }
        SubtitleDownloadManager.f63041a.m82274o(e11, dbBean);
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo82322i(Response response, SubtitleDownloadTable subtitleDownloadTable);

    /* JADX INFO: renamed from: j */
    public boolean mo82323j(Response response, String destination, long j11, SubtitleDownloadTable dbBean, Function1 progressCallback, Function0 completeCallback) {
        Intrinsics.m97802h(response, "response");
        Intrinsics.m97802h(destination, "destination");
        Intrinsics.m97802h(dbBean, "dbBean");
        Intrinsics.m97802h(progressCallback, "progressCallback");
        Intrinsics.m97802h(completeCallback, "completeCallback");
        if (j11 <= 0 && !dbBean.isOpenSbNewApi()) {
            m82321h(dbBean, new RuntimeException(m82325l() + " --> disposeOutputStream --> length <= 0 --> length = " + j11));
            return false;
        }
        C19774e c19774e = C19774e.f63091a;
        c19774e.m82372a(f63061b);
        c19774e.m82372a(f63062c);
        try {
            ResponseBody responseBodyBody = response.body();
            InputStream inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(destination);
                try {
                    byte[] bArr = new byte[102400];
                    dbBean.setStatus(2);
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (inputStreamByteStream != null && (i11 = inputStreamByteStream.read(bArr)) == -1) {
                            Unit unit = Unit.f75682a;
                            CloseableKt.m97669a(fileOutputStream, null);
                            CloseableKt.m97669a(inputStreamByteStream, null);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i11);
                        i12 += i11;
                        int i13 = (int) (((i12 * 1.0f) / j11) * 100);
                        progressCallback.invoke(Integer.valueOf(i13));
                        if (i13 >= 100) {
                            completeCallback.invoke();
                        }
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
        } catch (Exception e11) {
            m82321h(dbBean, new RuntimeException(m82325l() + " --> disposeOutputStream --> 字幕下载出问题了,e = " + e11.getMessage()));
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m82324k(SubtitleDownloadTable dbBean, Function0 callback) {
        Intrinsics.m97802h(dbBean, "dbBean");
        Intrinsics.m97802h(callback, "callback");
        C19771b c19771b = C19771b.f63088a;
        c19771b.m82365a(m82325l() + " --> download() --> 字幕下载 --> 开始执行下载任务了 --> getSubtitleInfo = " + dbBean.getSubtitleInfo());
        c19771b.m82365a("开始执行下载任务了 --> url = " + dbBean.getUrl());
        Request.Builder builder = new Request.Builder();
        String url = dbBean.getUrl();
        if (url == null) {
            url = "";
        }
        f63060a.m82327b().newCall(builder.url(url).build()).enqueue(new b(dbBean, callback));
    }

    /* JADX INFO: renamed from: l */
    public final String m82325l() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
