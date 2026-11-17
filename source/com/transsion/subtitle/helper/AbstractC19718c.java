package com.transsion.subtitle.helper;

import android.os.Build;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.download.SubtitleBean;
import com.transsion.baselib.p291db.download.SubtitleLanguageMapBean;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p528ju.C24469a;

/* JADX INFO: renamed from: com.transsion.subtitle.helper.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19718c {
    /* JADX INFO: renamed from: a */
    public static final Locale m82167a() {
        String string = C14496b.f50966a.m65344b().getString("k_language_short_name", null);
        Locale locale = Build.VERSION.SDK_INT >= 24 ? Utils.m27275a().getResources().getConfiguration().getLocales().get(0) : Utils.m27275a().getResources().getConfiguration().locale;
        if (!Intrinsics.m97797c(locale.getLanguage(), string) && string != null && string.length() > 0) {
            return new Locale(string, locale.getCountry());
        }
        Intrinsics.m97799e(locale);
        return locale;
    }

    /* JADX INFO: renamed from: b */
    public static final String m82168b(C24469a c24469a) {
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        String fileCharsetName;
        if (c24469a != null && (subtitleDownloadTableM96011b = c24469a.m96011b()) != null && (fileCharsetName = subtitleDownloadTableM96011b.getFileCharsetName()) != null) {
            return fileCharsetName;
        }
        String strName = Charsets.UTF_8.name();
        Intrinsics.m97801g(strName, "name(...)");
        return strName;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m82169c(String language, List list) {
        String upperCase;
        Intrinsics.m97802h(language, "language");
        Intrinsics.m97802h(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String lan = ((SubtitleBean) it.next()).getLan();
            if (lan != null) {
                upperCase = lan.toUpperCase(Locale.ROOT);
                Intrinsics.m97801g(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            String upperCase2 = language.toUpperCase(Locale.ROOT);
            Intrinsics.m97801g(upperCase2, "toUpperCase(...)");
            if (Intrinsics.m97797c(upperCase, upperCase2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final void m82170d(List list) {
        Intrinsics.m97802h(list, "list");
        Locale locale = Build.VERSION.SDK_INT >= 24 ? Utils.m27275a().getResources().getConfiguration().getLocales().get(0) : Utils.m27275a().getResources().getConfiguration().locale;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            }
            SubtitleLanguageMapBean subtitleLanguageMapBean = (SubtitleLanguageMapBean) list.get(i11);
            if (Intrinsics.m97797c(Intrinsics.m97797c(subtitleLanguageMapBean.getLan(), "in_id") ? "in" : subtitleLanguageMapBean.getLan(), locale.getLanguage())) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 > 0) {
            list.add(0, (SubtitleLanguageMapBean) list.remove(i11));
        }
    }
}
