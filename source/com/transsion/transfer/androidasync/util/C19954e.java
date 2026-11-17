package com.transsion.transfer.androidasync.util;

import java.util.Hashtable;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.util.e */
/* JADX INFO: loaded from: classes6.dex */
public class C19954e {

    /* JADX INFO: renamed from: a */
    private Hashtable f63594a = new Hashtable();

    /* JADX INFO: renamed from: a */
    public Object m82895a(String str) {
        return this.f63594a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public void m82896b(String str, Object obj) {
        this.f63594a.put(str, obj);
    }
}
