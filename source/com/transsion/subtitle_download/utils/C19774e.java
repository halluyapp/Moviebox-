package com.transsion.subtitle_download.utils;

import android.os.Build;
import com.blankj.utilcode.util.AbstractC5794m;
import com.blankj.utilcode.util.Utils;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import java.io.File;
import java.util.Locale;
import java.util.Random;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p854vz.AbstractC28242a;
import ph.C26867a;

/* JADX INFO: renamed from: com.transsion.subtitle_download.utils.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C19774e {

    /* JADX INFO: renamed from: a */
    public static final C19774e f63091a = new C19774e();

    private C19774e() {
    }

    /* JADX INFO: renamed from: d */
    private final String m82371d() {
        String simpleName = C19774e.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: a */
    public final void m82372a(String directoryPath) {
        Intrinsics.m97802h(directoryPath, "directoryPath");
        File file = new File(directoryPath);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX INFO: renamed from: b */
    public final void m82373b(String str) {
        Object objM112707constructorimpl;
        String str2;
        try {
            Result.Companion companion = Result.INSTANCE;
            File file = new File(str == null ? "" : str);
            if (file.exists()) {
                str2 = file.delete() ? "文件删除成功" : "文件删除失败";
            } else {
                str2 = "文件不存在";
            }
            C19771b.f63088a.m82365a(f63091a.m82371d() + " --> deleteFile() --> " + str2 + " --> path = " + str);
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return;
        }
        C19771b.f63088a.m82366b(f63091a.m82371d() + " --> deleteFile() --> 删除文件发生异常 --> it = " + thM112710exceptionOrNullimpl);
    }

    /* JADX INFO: renamed from: c */
    public final String m82374c(int i11) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public final String m82375e() {
        return "en";
    }

    /* JADX INFO: renamed from: f */
    public final String m82376f() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM82267g = SubtitleDownloadManager.f63041a.m82267g();
            Locale locale = Build.VERSION.SDK_INT >= 24 ? Utils.m27275a().getResources().getConfiguration().getLocales().get(0) : Utils.m27275a().getResources().getConfiguration().locale;
            objM112707constructorimpl = Result.m112707constructorimpl((Intrinsics.m97797c(locale.getLanguage(), strM82267g) || strM82267g == null || strM82267g.length() <= 0) ? locale.getLanguage() : new Locale(strM82267g, locale.getCountry()).getLanguage());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            objM112707constructorimpl = "";
        }
        return (String) objM112707constructorimpl;
    }

    /* JADX INFO: renamed from: g */
    public final String m82377g() {
        return C26867a.f81701a.m104925a(System.currentTimeMillis() + m82374c(10));
    }

    /* JADX INFO: renamed from: h */
    public final File m82378h(String directory, String fileName) {
        Intrinsics.m97802h(directory, "directory");
        Intrinsics.m97802h(fileName, "fileName");
        String strK1 = StringsKt.m98149k1(fileName, '.', null, 2, null);
        String str = "";
        String strC1 = StringsKt.m98133c1(fileName, '.', "");
        if (strC1.length() > 0) {
            str = "." + strC1;
        }
        File file = new File(directory, fileName);
        int i11 = 1;
        while (file.exists()) {
            file = new File(directory, strK1 + "_" + i11 + str);
            i11++;
        }
        return file;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m82379i(String str) {
        if (str != null) {
            return new File(str).exists();
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m82380j(SubtitleDownloadTable subtitleBean) {
        Intrinsics.m97802h(subtitleBean, "subtitleBean");
        String path = subtitleBean.getPath();
        if (path == null) {
            path = "";
        }
        if (!new File(path).exists()) {
            return false;
        }
        try {
            String path2 = subtitleBean.getPath();
            Intrinsics.m97799e(path2);
            String strM109436b = AbstractC28242a.m109436b(AbstractC5794m.m27422b(path2), true);
            C19771b.f63088a.m82365a(m82371d() + " --> parseFileCharsetName() --> fileCharsetName = " + strM109436b);
            Intrinsics.m97799e(strM109436b);
            if (strM109436b.length() <= 0) {
                return true;
            }
            subtitleBean.setFileCharsetName(strM109436b);
            return true;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }
}
