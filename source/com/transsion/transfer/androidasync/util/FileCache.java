package com.transsion.transfer.androidasync.util;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FileCache {

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.util.FileCache$1 */
    class C199481 implements Comparator<File> {
        final /* synthetic */ FileCache this$0;

        C199481(FileCache fileCache) {
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified();
            long jLastModified2 = file2.lastModified();
            if (jLastModified < jLastModified2) {
                return -1;
            }
            return jLastModified2 > jLastModified ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.util.FileCache$2 */
    class C199492 extends Thread {
        final /* synthetic */ FileCache this$0;

        C199492(FileCache fileCache) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            throw null;
        }
    }
}
