package com.transsion.videodetail;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.videodetail.bean.VideoDetailMediaSource;
import com.transsion.videodetail.bean.VideoDetailStream;
import com.transsion.videodetail.bean.VideoDetailStreamList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25204t1;
import p349dh.C22982c;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoDetailViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final C3187b0 f65706a = new C3187b0();

    /* JADX INFO: renamed from: b */
    private final C3187b0 f65707b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private final C3187b0 f65708c = new C3187b0();

    /* JADX INFO: renamed from: d */
    private final C3187b0 f65709d = new C3187b0();

    /* JADX INFO: renamed from: e */
    private final C3187b0 f65710e = new C3187b0();

    /* JADX INFO: renamed from: f */
    private final HashMap f65711f = new HashMap();

    /* JADX INFO: renamed from: g */
    private final C3187b0 f65712g = new C3187b0();

    /* JADX INFO: renamed from: h */
    private final Lazy f65713h = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.a1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VideoDetailViewModel.m86103E();
        }
    });

    /* JADX INFO: renamed from: i */
    private final Lazy f65714i = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.b1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VideoDetailViewModel.m86102D();
        }
    });

    /* JADX INFO: renamed from: j */
    private String f65715j;

    /* JADX INFO: renamed from: k */
    private InterfaceC25204t1 f65716k;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final VideoDetailPlayDao m86101A() {
        return (VideoDetailPlayDao) this.f65713h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC20941b m86102D() {
        return (InterfaceC20941b) C22982c.f70163e.m91553a().m91552h(InterfaceC20941b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final VideoDetailPlayDao m86103E() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final String m86116o(Integer num) {
        int iIntValue = num != null ? num.intValue() : 0;
        if (1 > iIntValue || iIntValue >= 10) {
            return String.valueOf(iIntValue);
        }
        return "0" + iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m86117p(String str, List list) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new VideoDetailViewModel$fetchEpisodeMediaList$1(this, list, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final InterfaceC20941b m86118z() {
        return (InterfaceC20941b) this.f65714i.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final void m86119B(VideoDetailMediaSource videoDetailMediaSource) {
        if (Intrinsics.m97797c(videoDetailMediaSource, this.f65710e.m14847f())) {
            return;
        }
        this.f65710e.mo14858q(videoDetailMediaSource);
    }

    /* JADX INFO: renamed from: C */
    public final void m86120C() {
        this.f65706a.mo14858q(null);
        this.f65707b.mo14858q(null);
        this.f65708c.mo14858q(new ArrayList());
        this.f65709d.mo14858q(new LinkedHashMap());
        this.f65710e.mo14858q(null);
    }

    /* JADX INFO: renamed from: n */
    public final void m86121n() {
        this.f65712g.mo14858q(null);
    }

    /* JADX INFO: renamed from: q */
    public final void m86122q(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new VideoDetailViewModel$fetchHistory$1(this, subjectId, null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m86123r(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        if (this.f65706a.m14847f() == null) {
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new VideoDetailViewModel$fetchSeason$1(subjectId, this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final LiveData m86124s() {
        return this.f65708c;
    }

    /* JADX INFO: renamed from: t */
    public final LiveData m86125t() {
        return this.f65709d;
    }

    /* JADX INFO: renamed from: u */
    public final LiveData m86126u() {
        return this.f65712g;
    }

    /* JADX INFO: renamed from: v */
    public final void m86127v(VideoDetailMediaSource videoDetailMediaSource) {
        String string;
        String string2;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104908v(aVar, "VideoDetailEpisode", "--------getPlayInfo:" + videoDetailMediaSource, false, 4, null);
        if (videoDetailMediaSource == null) {
            return;
        }
        String subjectId = videoDetailMediaSource.getSubjectId();
        int se2 = videoDetailMediaSource.getSe();
        int ep2 = videoDetailMediaSource.getEp();
        String str = subjectId + "-" + se2 + "-" + ep2;
        InterfaceC25204t1 interfaceC25204t1 = this.f65716k;
        if (interfaceC25204t1 != null && interfaceC25204t1.isActive()) {
            if (Intrinsics.m97797c(this.f65715j, str)) {
                C26866a.a.m104898f(aVar, "CommonInfo", "正在请求中 key：" + str, false, 4, null);
                return;
            }
            InterfaceC25204t1 interfaceC25204t2 = this.f65716k;
            if (interfaceC25204t2 != null) {
                InterfaceC25204t1.a.m99217b(interfaceC25204t2, null, 1, null);
            }
        }
        VideoDetailStreamList videoDetailStreamList = (VideoDetailStreamList) this.f65711f.get(str);
        if (videoDetailStreamList != null) {
            this.f65707b.mo14858q(videoDetailStreamList);
            return;
        }
        DownloadBean downloadBean = videoDetailMediaSource.getDownloadBean();
        if (downloadBean == null) {
            this.f65715j = str;
            this.f65716k = AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new VideoDetailViewModel$getPlayInfo$2(this, subjectId, se2, ep2, videoDetailMediaSource, str, null), 3, null);
            return;
        }
        String resourceId = downloadBean.getResourceId();
        String str2 = resourceId == null ? "" : resourceId;
        String path = downloadBean.getPath();
        String str3 = path == null ? "" : path;
        String strValueOf = String.valueOf(downloadBean.getResolution());
        Long size = downloadBean.getSize();
        String str4 = (size == null || (string2 = size.toString()) == null) ? "0" : string2;
        Long duration = downloadBean.getDuration();
        String str5 = (duration == null || (string = duration.toString()) == null) ? "0" : string;
        List listEmptyList = Collections.emptyList();
        Intrinsics.m97801g(listEmptyList, "emptyList(...)");
        VideoDetailStream videoDetailStream = new VideoDetailStream("DEFAULT", str2, str3, strValueOf, str4, str5, "", listEmptyList);
        C3187b0 c3187b0 = this.f65707b;
        VideoDetailStreamList videoDetailStreamList2 = new VideoDetailStreamList(CollectionsKt.m97502h(videoDetailStream), 0, 0, null, 14, null);
        videoDetailStreamList2.setEp(ep2);
        videoDetailStreamList2.setSe(se2);
        c3187b0.mo14858q(videoDetailStreamList2);
    }

    /* JADX INFO: renamed from: w */
    public final LiveData m86128w() {
        return this.f65707b;
    }

    /* JADX INFO: renamed from: x */
    public final LiveData m86129x() {
        return this.f65710e;
    }

    /* JADX INFO: renamed from: y */
    public final LiveData m86130y() {
        return this.f65706a;
    }
}
