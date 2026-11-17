package com.transsion.transfer.androidasync.http;

import com.transsion.transfer.androidasync.util.TaggedList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class Headers {

    /* JADX INFO: renamed from: a */
    final Multimap f63303a = new Multimap() { // from class: com.transsion.transfer.androidasync.http.Headers.1
        @Override // com.transsion.transfer.androidasync.http.Multimap
        protected List<String> newList() {
            return new TaggedList();
        }
    };

    /* JADX INFO: renamed from: a */
    public Headers m82633a(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.US);
        this.f63303a.add(lowerCase, str2);
        ((TaggedList) this.f63303a.get(lowerCase)).tagNull(str);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Headers m82634b(String str) {
        if (str != null) {
            String[] strArrSplit = str.trim().split(":", 2);
            if (strArrSplit.length == 2) {
                m82633a(strArrSplit[0].trim(), strArrSplit[1].trim());
            } else {
                m82633a(strArrSplit[0].trim(), "");
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m82635c(String str) {
        return this.f63303a.getString(str.toLowerCase(Locale.US));
    }

    /* JADX INFO: renamed from: d */
    public String m82636d(String str) {
        List listM82637e = m82637e(str.toLowerCase(Locale.US));
        if (listM82637e == null || listM82637e.size() == 0) {
            return null;
        }
        return (String) listM82637e.get(0);
    }

    /* JADX INFO: renamed from: e */
    public List m82637e(String str) {
        return this.f63303a.remove(str.toLowerCase(Locale.US));
    }

    /* JADX INFO: renamed from: f */
    public Headers m82638f(String str, String str2) {
        if (str2 != null && (str2.contains("\n") || str2.contains("\r"))) {
            throw new IllegalArgumentException("value must not contain a new line or line feed");
        }
        String lowerCase = str.toLowerCase(Locale.US);
        this.f63303a.put(lowerCase, str2);
        ((TaggedList) this.f63303a.get(lowerCase)).tagNull(str);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public String m82639g(String str) {
        return m82640h().insert(0, str + "\r\n").toString();
    }

    /* JADX INFO: renamed from: h */
    public StringBuilder m82640h() {
        StringBuilder sb2 = new StringBuilder(256);
        Iterator<String> it = this.f63303a.keySet().iterator();
        while (it.hasNext()) {
            TaggedList<String> taggedList = (TaggedList) this.f63303a.get(it.next());
            for (String str : taggedList) {
                sb2.append((String) taggedList.tag());
                sb2.append(": ");
                sb2.append(str);
                sb2.append("\r\n");
            }
        }
        sb2.append("\r\n");
        return sb2;
    }

    public String toString() {
        return m82640h().toString();
    }
}
