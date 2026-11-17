package com.transsion.subtitle_download;

import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.subtitle_download.a */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC19743a {

    /* JADX INFO: renamed from: com.transsion.subtitle_download.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m82279a(InterfaceC19743a interfaceC19743a, SubtitleDownloadTable bean) {
            Intrinsics.m97802h(bean, "bean");
        }

        /* JADX INFO: renamed from: b */
        public static void m82280b(InterfaceC19743a interfaceC19743a, SubtitleDownloadTable stDownloadTable) {
            Intrinsics.m97802h(stDownloadTable, "stDownloadTable");
        }
    }

    void onComplete(SubtitleDownloadTable subtitleDownloadTable);

    void onDownloading(int i11, SubtitleDownloadTable subtitleDownloadTable);

    void onFail(Exception exc, SubtitleDownloadTable subtitleDownloadTable);

    void onSaveDownload(SubtitleDownloadTable subtitleDownloadTable);

    void onUnGzZip(SubtitleDownloadTable subtitleDownloadTable);
}
