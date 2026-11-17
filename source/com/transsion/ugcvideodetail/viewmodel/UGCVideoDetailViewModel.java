package com.transsion.ugcvideodetail.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.Utils;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCCollectionVideoGroupDao;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayInfo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
import com.transsnet.downloader.manager.DownloadEsHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p922xv.InterfaceC28667a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public class UGCVideoDetailViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: H */
    public static final C20362a f64507H = new C20362a(null);

    /* JADX INFO: renamed from: A */
    private String f64508A;

    /* JADX INFO: renamed from: B */
    private int f64509B;

    /* JADX INFO: renamed from: C */
    private int f64510C;

    /* JADX INFO: renamed from: D */
    private final C3187b0 f64511D;

    /* JADX INFO: renamed from: E */
    private final LiveData f64512E;

    /* JADX INFO: renamed from: F */
    private final C3187b0 f64513F;

    /* JADX INFO: renamed from: G */
    private final LiveData f64514G;

    /* JADX INFO: renamed from: a */
    private String f64515a;

    /* JADX INFO: renamed from: f */
    private String f64520f;

    /* JADX INFO: renamed from: g */
    private String f64521g;

    /* JADX INFO: renamed from: k */
    private final C3187b0 f64525k;

    /* JADX INFO: renamed from: l */
    private final LiveData f64526l;

    /* JADX INFO: renamed from: m */
    private final C3187b0 f64527m;

    /* JADX INFO: renamed from: n */
    private final C3187b0 f64528n;

    /* JADX INFO: renamed from: o */
    private final LiveData f64529o;

    /* JADX INFO: renamed from: p */
    private final C3187b0 f64530p;

    /* JADX INFO: renamed from: q */
    private final LiveData f64531q;

    /* JADX INFO: renamed from: r */
    private final C3187b0 f64532r;

    /* JADX INFO: renamed from: s */
    private final C3187b0 f64533s;

    /* JADX INFO: renamed from: t */
    private final LiveData f64534t;

    /* JADX INFO: renamed from: u */
    private final C3187b0 f64535u;

    /* JADX INFO: renamed from: v */
    private final LiveData f64536v;

    /* JADX INFO: renamed from: w */
    private final C3187b0 f64537w;

    /* JADX INFO: renamed from: x */
    private final LiveData f64538x;

    /* JADX INFO: renamed from: y */
    private String f64539y;

    /* JADX INFO: renamed from: z */
    private final Set f64540z;

    /* JADX INFO: renamed from: b */
    private final Lazy f64516b = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.viewmodel.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCVideoDetailViewModel.m84254x();
        }
    });

    /* JADX INFO: renamed from: c */
    private final Lazy f64517c = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.viewmodel.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCVideoDetailViewModel.m84231Z();
        }
    });

    /* JADX INFO: renamed from: d */
    private final Lazy f64518d = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.viewmodel.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCVideoDetailViewModel.m84253w();
        }
    });

    /* JADX INFO: renamed from: e */
    private String f64519e = "";

    /* JADX INFO: renamed from: h */
    private final C3187b0 f64522h = new C3187b0();

    /* JADX INFO: renamed from: i */
    private final C3187b0 f64523i = new C3187b0();

    /* JADX INFO: renamed from: j */
    private final C3187b0 f64524j = new C3187b0();

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$a */
    public static final class C20362a {
        private C20362a() {
        }

        public /* synthetic */ C20362a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel$b */
    public static final class C20363b {

        /* JADX INFO: renamed from: a */
        private final List f64541a;

        /* JADX INFO: renamed from: b */
        private final String f64542b;

        public C20363b(List videos, String str) {
            Intrinsics.m97802h(videos, "videos");
            this.f64541a = videos;
            this.f64542b = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m84293a() {
            return this.f64542b;
        }

        /* JADX INFO: renamed from: b */
        public final List m84294b() {
            return this.f64541a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20363b)) {
                return false;
            }
            C20363b c20363b = (C20363b) obj;
            return Intrinsics.m97797c(this.f64541a, c20363b.f64541a) && Intrinsics.m97797c(this.f64542b, c20363b.f64542b);
        }

        public int hashCode() {
            int iHashCode = this.f64541a.hashCode() * 31;
            String str = this.f64542b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ReplacePlayListData(videos=" + this.f64541a + ", clickedVideoId=" + this.f64542b + ")";
        }
    }

    public UGCVideoDetailViewModel() {
        C3187b0 c3187b0 = new C3187b0();
        this.f64525k = c3187b0;
        this.f64526l = c3187b0;
        this.f64527m = new C3187b0();
        C3187b0 c3187b1 = new C3187b0();
        this.f64528n = c3187b1;
        this.f64529o = c3187b1;
        C3187b0 c3187b2 = new C3187b0();
        this.f64530p = c3187b2;
        this.f64531q = c3187b2;
        this.f64532r = new C3187b0();
        C3187b0 c3187b3 = new C3187b0();
        this.f64533s = c3187b3;
        this.f64534t = c3187b3;
        C3187b0 c3187b4 = new C3187b0();
        this.f64535u = c3187b4;
        this.f64536v = c3187b4;
        C3187b0 c3187b5 = new C3187b0();
        this.f64537w = c3187b5;
        this.f64538x = c3187b5;
        this.f64540z = new LinkedHashSet();
        C3187b0 c3187b6 = new C3187b0();
        this.f64511D = c3187b6;
        this.f64512E = c3187b6;
        C3187b0 c3187b7 = new C3187b0();
        this.f64513F = c3187b7;
        this.f64514G = c3187b7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final InterfaceC28667a m84228F() {
        return (InterfaceC28667a) this.f64516b.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final void m84229V(String str, String str2) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCVideoDetailViewModel$getVideoDetail$1(this, str, str2, null), 3, null);
    }

    /* JADX INFO: renamed from: W */
    private final void m84230W(String str) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCVideoDetailViewModel$getVideoDetailBySubject$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final UGCVideoDetailPlayDao m84231Z() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64864A1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final boolean m84242k0(String str, int i11, int i12) {
        int i13;
        int i14;
        if (!Intrinsics.m97797c(str, this.f64508A) || (i13 = this.f64509B) <= 0 || (i14 = this.f64510C) <= 0 || i11 < i13 || i12 > i14) {
            return true;
        }
        C26866a.a.m104898f(C26866a.f81698a, "UGCVideoDetailViewModel", "PlayList range already covered: requested[" + i11 + "-" + i12 + "], loaded[" + i13 + "-" + i14 + "]", false, 4, null);
        return false;
    }

    /* JADX INFO: renamed from: v */
    private final void m84252v() {
        this.f64540z.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final UGCCollectionVideoGroupDao m84253w() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64879z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final InterfaceC28667a m84254x() {
        return (InterfaceC28667a) C22982c.f70163e.m91553a().m91552h(InterfaceC28667a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002f, B:31:0x0072, B:33:0x0076, B:35:0x007c, B:38:0x0083, B:40:0x008b, B:42:0x0091, B:44:0x0099, B:45:0x00a8, B:48:0x00b5, B:21:0x0042, B:27:0x005a, B:24:0x0049), top: B:52:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: y */
    public final Object m84255y(String str, Continuation continuation) throws Throwable {
        UGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1 uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1;
        DownloadBean downloadBean;
        BaseDto baseDto;
        String path;
        UGCVideoPlayInfo uGCVideoPlayInfo;
        List<UGCVideoPlayStream> resources;
        UGCVideoPlayStream uGCVideoPlayStream;
        if (continuation instanceof UGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1) {
            uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1 = (UGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1) continuation;
            int i11 = uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1.label = i11 - Integer.MIN_VALUE;
            } else {
                uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1 = new UGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1(this, continuation);
            }
        } else {
            uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1 = new UGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1(this, continuation);
        }
        UGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1 uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2 = uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$1;
        Object objM88567R = uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    str = (String) uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2.L$0;
                    ResultKt.m97107b(objM88567R);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    downloadBean = (DownloadBean) uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2.L$0;
                    ResultKt.m97107b(objM88567R);
                }
                baseDto = (BaseDto) objM88567R;
                if (downloadBean != null && (path = downloadBean.getPath()) != null && path.length() != 0 && (uGCVideoPlayInfo = (UGCVideoPlayInfo) baseDto.getData()) != null && (resources = uGCVideoPlayInfo.getResources()) != null && (uGCVideoPlayStream = (UGCVideoPlayStream) CollectionsKt.m97361k0(resources)) != null) {
                    String path2 = downloadBean.getPath();
                    Intrinsics.m97799e(path2);
                    uGCVideoPlayStream.setUrl(path2);
                    uGCVideoPlayStream.setFormat("Mp4");
                }
                if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                    return (UGCVideoPlayInfo) baseDto.getData();
                }
                return null;
            }
            ResultKt.m97107b(objM88567R);
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2.L$0 = str;
            uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2.label = 1;
            objM88567R = downloadEsHelperM88598a.m88567R(str, uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2);
            if (objM88567R == objF) {
                return objF;
            }
            DownloadBean downloadBean2 = (DownloadBean) objM88567R;
            InterfaceC28667a interfaceC28667aM84228F = m84228F();
            uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2.L$0 = downloadBean2;
            uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2.label = 2;
            Object objM110476i = InterfaceC28667a.a.m110476i(interfaceC28667aM84228F, str, null, uGCVideoDetailViewModel$fetchVideoPlayInfoInternal$2, 2, null);
            if (objM110476i == objF) {
                return objF;
            }
            objM88567R = objM110476i;
            downloadBean = downloadBean2;
            baseDto = (BaseDto) objM88567R;
            if (downloadBean != null) {
                String path3 = downloadBean.getPath();
                Intrinsics.m97799e(path3);
                uGCVideoPlayStream.setUrl(path3);
                uGCVideoPlayStream.setFormat("Mp4");
            }
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                return null;
            }
            return (UGCVideoPlayInfo) baseDto.getData();
        } catch (Throwable th2) {
            C26866a.a.m104901l(C26866a.f81698a, "UGCVideoDetailViewModel", "fetchVideoPlayInfoInternal error:" + th2, false, 4, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final C3187b0 m84256A() {
        return this.f64524j;
    }

    /* JADX INFO: renamed from: B */
    public final C3187b0 m84257B() {
        return this.f64523i;
    }

    /* JADX INFO: renamed from: C */
    public final C3187b0 m84258C() {
        return this.f64532r;
    }

    /* JADX INFO: renamed from: D */
    public final C3187b0 m84259D() {
        return this.f64522h;
    }

    /* JADX INFO: renamed from: E */
    public final String m84260E() {
        return this.f64539y;
    }

    /* JADX INFO: renamed from: G */
    public final LiveData m84261G() {
        return this.f64529o;
    }

    /* JADX INFO: renamed from: H */
    public final C3187b0 m84262H() {
        return this.f64527m;
    }

    /* JADX INFO: renamed from: I */
    public final LiveData m84263I() {
        return this.f64512E;
    }

    /* JADX INFO: renamed from: J */
    public final LiveData m84264J() {
        return this.f64526l;
    }

    /* JADX INFO: renamed from: K */
    protected final UGCVideoDetailPlayDao m84265K() {
        return (UGCVideoDetailPlayDao) this.f64517c.getValue();
    }

    /* JADX INFO: renamed from: L */
    public final LiveData m84266L() {
        return this.f64531q;
    }

    /* JADX INFO: renamed from: M */
    public final LiveData m84267M() {
        return this.f64534t;
    }

    /* JADX INFO: renamed from: N */
    public final LiveData m84268N() {
        return this.f64536v;
    }

    /* JADX INFO: renamed from: O */
    public String m84269O() {
        return this.f64521g;
    }

    /* JADX INFO: renamed from: P */
    public String m84270P() {
        return this.f64520f;
    }

    /* JADX INFO: renamed from: Q */
    public final LiveData m84271Q() {
        return this.f64538x;
    }

    /* JADX INFO: renamed from: R */
    public final LiveData m84272R() {
        return this.f64514G;
    }

    /* JADX INFO: renamed from: S */
    public final int m84273S(int i11) {
        return (i11 - 1) / 50;
    }

    /* JADX INFO: renamed from: T */
    public String m84274T() {
        return this.f64519e;
    }

    /* JADX INFO: renamed from: U */
    public final void m84275U(boolean z11, String str, String str2) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCVideoDetailViewModel$getUGCDetailForYouList$1(z11, this, str, str2, null), 3, null);
    }

    /* JADX INFO: renamed from: X */
    public final void m84276X(String collectionId, int i11, int i12, boolean z11) {
        Intrinsics.m97802h(collectionId, "collectionId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCVideoDetailViewModel$getVideoPlayList$1(this, collectionId, i11, i12, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: Y */
    protected final C3187b0 m84277Y() {
        return this.f64525k;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m84278a0(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return this.f64540z.contains(str);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m84279b0(String ugcVideoId) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCVideoDetailViewModel$loadHistory$1(this, ugcVideoId, null), 3, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m84280c0(String ugcVideoId, String str) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        m84252v();
        if (!Intrinsics.m97797c(str, this.f64508A)) {
            this.f64508A = null;
            this.f64509B = 0;
            this.f64510C = 0;
        }
        m84229V(ugcVideoId, str);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m84281d0(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        m84252v();
        m84230W(subjectId);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m84282e0(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f64540z.add(str);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m84283f0(String str) {
        this.f64539y = str;
    }

    /* JADX INFO: renamed from: g0 */
    public void m84284g0(String str) {
        this.f64521g = str;
    }

    /* JADX INFO: renamed from: h0 */
    public void m84285h0(String str) {
        this.f64520f = str;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m84286i0(List list, String str) {
        List list2 = list;
        if (list2 == null || list2.isEmpty() || str == null || str.length() == 0) {
            return;
        }
        this.f64537w.mo14858q(new C20363b(list, str));
    }

    /* JADX INFO: renamed from: j0 */
    public void m84287j0(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f64519e = str;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m84288l0(String ugcVideoId, boolean z11) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCVideoDetailViewModel$toggleFavorite$1(this, ugcVideoId, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m84289m0(String ugcVideoId, boolean z11) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCVideoDetailViewModel$toggleLike$1(this, ugcVideoId, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m84290n0(String targetUID, boolean z11) {
        Intrinsics.m97802h(targetUID, "targetUID");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCVideoDetailViewModel$toggleSubscription$1(this, targetUID, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m84291u(List list, boolean z11) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Iterable<UGCVideo> arrayList = (List) this.f64532r.m14847f();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UGCVideo uGCVideo : arrayList) {
            String ugcVideoId = uGCVideo.getUgcVideoId();
            if (ugcVideoId != null) {
                linkedHashMap.put(ugcVideoId, uGCVideo);
            }
        }
        if (z11) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UGCVideo uGCVideo2 = (UGCVideo) it.next();
                String ugcVideoId2 = uGCVideo2.getUgcVideoId();
                if (ugcVideoId2 != null) {
                    linkedHashMap.put(ugcVideoId2, uGCVideo2);
                }
            }
        } else {
            for (UGCVideo uGCVideo3 : CollectionsKt.m97539T(list)) {
                String ugcVideoId3 = uGCVideo3.getUgcVideoId();
                if (ugcVideoId3 != null && !linkedHashMap.containsKey(ugcVideoId3)) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put(ugcVideoId3, uGCVideo3);
                    linkedHashMap2.putAll(linkedHashMap);
                    linkedHashMap.clear();
                    linkedHashMap.putAll(linkedHashMap2);
                }
            }
        }
        C3187b0 c3187b0 = this.f64532r;
        Collection collectionValues = linkedHashMap.values();
        Intrinsics.m97801g(collectionValues, "<get-values>(...)");
        c3187b0.mo14858q(CollectionsKt.m97343U0(collectionValues));
    }

    /* JADX INFO: renamed from: z */
    protected final UGCCollectionVideoGroupDao m84292z() {
        return (UGCCollectionVideoGroupDao) this.f64518d.getValue();
    }
}
