package com.transsion.transfer.androidasync.http.server;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
class AsyncHttpServerRouter$1$1 implements Comparator<File> {
    final /* synthetic */ AbstractC19916m this$1;

    AsyncHttpServerRouter$1$1(AbstractC19916m abstractC19916m) {
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return file.getName().compareTo(file2.getName());
    }
}
