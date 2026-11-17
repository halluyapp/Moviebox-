package com.transsion.transfer.androidasync.http;

import android.text.TextUtils;
import com.cloud.tmc.kernel.utils.UrlUtils;

/* JADX INFO: renamed from: com.transsion.transfer.androidasync.http.u */
/* JADX INFO: loaded from: classes6.dex */
public class C19924u implements InterfaceC19926w, Cloneable {

    /* JADX INFO: renamed from: a */
    private final String f63544a;

    /* JADX INFO: renamed from: b */
    private final String f63545b;

    public C19924u(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f63544a = str;
        this.f63545b = str2;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC19926w)) {
            return false;
        }
        C19924u c19924u = (C19924u) obj;
        return this.f63544a.equals(c19924u.f63544a) && TextUtils.equals(this.f63545b, c19924u.f63545b);
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19926w
    public String getName() {
        return this.f63544a;
    }

    @Override // com.transsion.transfer.androidasync.http.InterfaceC19926w
    public String getValue() {
        return this.f63545b;
    }

    public int hashCode() {
        return this.f63544a.hashCode() ^ this.f63545b.hashCode();
    }

    public String toString() {
        return this.f63544a + UrlUtils.EQUAL_MARK + this.f63545b;
    }
}
