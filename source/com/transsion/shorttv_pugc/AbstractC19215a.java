package com.transsion.shorttv_pugc;

import fo.C23403e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19215a {
    /* JADX INFO: renamed from: a */
    public static final C23403e m80424a(ShorttvModel.UGCVideo uGCVideo) {
        Intrinsics.m97802h(uGCVideo, "<this>");
        String playUrl = uGCVideo.getPlayUrl();
        String playUrl2 = uGCVideo.getPlayUrl();
        if (playUrl2 == null) {
            playUrl2 = "";
        }
        return new C23403e(playUrl, playUrl2, uGCVideo.videoUGCPosition(), null, null, 24, null);
    }
}
