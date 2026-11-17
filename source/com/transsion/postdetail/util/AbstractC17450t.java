package com.transsion.postdetail.util;

import com.p282tn.lib.util.networkinfo.NetworkType;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.postdetail.layer.local.LocalUiType;
import com.transsion.subtitle.helper.LocalVideoUiType;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.postdetail.util.t */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17450t {

    /* JADX INFO: renamed from: com.transsion.postdetail.util.t$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57842a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f57843b;

        static {
            int[] iArr = new int[NetworkType.values().length];
            try {
                iArr[NetworkType.NETWORK_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.NETWORK_5G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkType.NETWORK_4G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkType.NETWORK_3G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkType.NETWORK_2G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f57842a = iArr;
            int[] iArr2 = new int[LocalUiType.values().length];
            try {
                iArr2[LocalUiType.LAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LocalUiType.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LocalUiType.PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f57843b = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Video m74975a(List list) {
        Object obj = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Video video = (Video) it.next();
                Integer definition = video.getDefinition();
                if (definition != null && definition.intValue() == 3) {
                    obj = video;
                }
            }
        }
        if (obj == null && list != null && (!list.isEmpty())) {
            obj = list.get(0);
        }
        return (Video) obj;
    }

    /* JADX INFO: renamed from: b */
    public static final String m74976b(DownloadBean downloadBean) {
        if (downloadBean == null || !downloadBean.isInnerRes()) {
            return "2";
        }
        return (downloadBean == null || downloadBean.getStatus() != 5) ? "1" : "0";
    }

    /* JADX INFO: renamed from: c */
    public static final LocalVideoUiType m74977c(LocalUiType uiType) {
        Intrinsics.m97802h(uiType, "uiType");
        int i11 = a.f57843b[uiType.ordinal()];
        if (i11 == 1) {
            return LocalVideoUiType.LAND;
        }
        if (i11 == 2) {
            return LocalVideoUiType.MIDDLE;
        }
        if (i11 == 3) {
            return LocalVideoUiType.PORTRAIT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public static final String m74978d() {
        return new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())).toString();
    }
}
