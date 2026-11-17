package com.transsion.postdetail.layer.local;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14453d;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14486e;
import com.transsion.baselib.report.C14492k;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.orplayer.global.TnPlayerType;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.util.C22094h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.C26053g0;
import p016ak.C0117a;
import p016ak.InterfaceC0119c;
import p528ju.C24469a;
import p550kj.C24662i;
import p723qx.InterfaceC27138e;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.local.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16791c0 {

    /* JADX INFO: renamed from: g0 */
    public static final a f56537g0 = new a(null);

    /* JADX INFO: renamed from: A */
    private String f56538A;

    /* JADX INFO: renamed from: B */
    private String f56539B;

    /* JADX INFO: renamed from: C */
    private String f56540C;

    /* JADX INFO: renamed from: D */
    private String f56541D;

    /* JADX INFO: renamed from: E */
    private String f56542E;

    /* JADX INFO: renamed from: F */
    private String f56543F;

    /* JADX INFO: renamed from: H */
    private String f56545H;

    /* JADX INFO: renamed from: I */
    private String f56546I;

    /* JADX INFO: renamed from: J */
    private DownloadBean f56547J;

    /* JADX INFO: renamed from: K */
    private String f56548K;

    /* JADX INFO: renamed from: L */
    private int f56549L;

    /* JADX INFO: renamed from: M */
    private boolean f56550M;

    /* JADX INFO: renamed from: N */
    private int f56551N;

    /* JADX INFO: renamed from: O */
    private int f56552O;

    /* JADX INFO: renamed from: R */
    private String f56555R;

    /* JADX INFO: renamed from: U */
    private UGCVideo f56558U;

    /* JADX INFO: renamed from: V */
    private String f56559V;

    /* JADX INFO: renamed from: W */
    private String f56560W;

    /* JADX INFO: renamed from: X */
    private String f56561X;

    /* JADX INFO: renamed from: a */
    private InterfaceC16634g f56564a;

    /* JADX INFO: renamed from: a0 */
    private boolean f56565a0;

    /* JADX INFO: renamed from: b0 */
    private TnPlayerType f56567b0;

    /* JADX INFO: renamed from: c */
    private long f56568c;

    /* JADX INFO: renamed from: c0 */
    private boolean f56569c0;

    /* JADX INFO: renamed from: d */
    private long f56570d;

    /* JADX INFO: renamed from: d0 */
    private boolean f56571d0;

    /* JADX INFO: renamed from: e */
    private long f56572e;

    /* JADX INFO: renamed from: e0 */
    private InterfaceC0119c f56573e0;

    /* JADX INFO: renamed from: f */
    private long f56574f;

    /* JADX INFO: renamed from: f0 */
    private boolean f56575f0;

    /* JADX INFO: renamed from: g */
    private long f56576g;

    /* JADX INFO: renamed from: h */
    private int f56577h;

    /* JADX INFO: renamed from: i */
    private int f56578i;

    /* JADX INFO: renamed from: j */
    private Double f56579j;

    /* JADX INFO: renamed from: k */
    private Double f56580k;

    /* JADX INFO: renamed from: l */
    private long f56581l;

    /* JADX INFO: renamed from: m */
    private long f56582m;

    /* JADX INFO: renamed from: n */
    private long f56583n;

    /* JADX INFO: renamed from: o */
    private long f56584o;

    /* JADX INFO: renamed from: p */
    private long f56585p;

    /* JADX INFO: renamed from: q */
    private long f56586q;

    /* JADX INFO: renamed from: r */
    private boolean f56587r;

    /* JADX INFO: renamed from: t */
    private boolean f56589t;

    /* JADX INFO: renamed from: u */
    private boolean f56590u;

    /* JADX INFO: renamed from: v */
    private long f56591v;

    /* JADX INFO: renamed from: w */
    private long f56592w;

    /* JADX INFO: renamed from: x */
    private int f56593x;

    /* JADX INFO: renamed from: y */
    private long f56594y;

    /* JADX INFO: renamed from: z */
    private Integer f56595z;

    /* JADX INFO: renamed from: b */
    private final String f56566b = "long_video_play";

    /* JADX INFO: renamed from: s */
    private boolean f56588s = true;

    /* JADX INFO: renamed from: G */
    private int f56544G = -1;

    /* JADX INFO: renamed from: P */
    private int f56553P = -1;

    /* JADX INFO: renamed from: Q */
    private int f56554Q = -1;

    /* JADX INFO: renamed from: S */
    private String f56556S = "local_video_detail";

    /* JADX INFO: renamed from: T */
    private String f56557T = "long_video_play";

    /* JADX INFO: renamed from: Y */
    private Map f56562Y = new LinkedHashMap();

    /* JADX INFO: renamed from: Z */
    private final List f56563Z = new ArrayList();

    /* JADX INFO: renamed from: com.transsion.postdetail.layer.local.c0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m73410c(C16791c0 c16791c0, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c16791c0.m73431b(z11);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC0119c m73411f() {
        if (this.f56573e0 == null) {
            this.f56573e0 = (InterfaceC0119c) C0117a.f402a.m550a(InterfaceC0119c.class);
        }
        return this.f56573e0;
    }

    /* JADX INFO: renamed from: y */
    private final void m73412y(boolean z11) {
        this.f56568c = 0L;
        this.f56570d = 0L;
        this.f56572e = 0L;
        this.f56574f = 0L;
        this.f56576g = 0L;
        this.f56577h = 0;
        this.f56582m = 0L;
        this.f56583n = 0L;
        this.f56591v = 0L;
        this.f56592w = 0L;
        this.f56593x = 0;
        this.f56584o = 0L;
        this.f56585p = 0L;
        this.f56586q = 0L;
        this.f56578i = 0;
        this.f56587r = false;
        this.f56595z = null;
        this.f56538A = null;
        this.f56549L = 0;
        this.f56539B = "";
        if (z11) {
            return;
        }
        this.f56581l = 0L;
        this.f56594y = 0L;
        this.f56567b0 = null;
        this.f56569c0 = false;
        this.f56571d0 = false;
        this.f56590u = false;
    }

    /* JADX INFO: renamed from: A */
    public final void m73413A(DownloadBean downloadBean, String str) {
        this.f56548K = str;
        this.f56547J = downloadBean;
        if (downloadBean == null || !downloadBean.isInnerRes()) {
            this.f56545H = "2";
            this.f56546I = downloadBean != null ? downloadBean.getPath() : null;
        } else if (downloadBean == null || downloadBean.getStatus() != 5) {
            this.f56545H = "1";
            this.f56546I = downloadBean != null ? downloadBean.getUrl() : null;
        } else {
            this.f56545H = "0";
            this.f56546I = downloadBean.getPath();
        }
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "setData", false, 4, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m73414B(int i11) {
        this.f56554Q = i11;
    }

    /* JADX INFO: renamed from: C */
    public final void m73415C(int i11) {
        this.f56553P = i11;
    }

    /* JADX INFO: renamed from: D */
    public final void m73416D(boolean z11) {
        this.f56589t = z11;
    }

    /* JADX INFO: renamed from: E */
    public final void m73417E(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f56557T = str;
    }

    /* JADX INFO: renamed from: F */
    public final void m73418F(boolean z11) {
        this.f56565a0 = z11;
    }

    /* JADX INFO: renamed from: G */
    public final void m73419G(boolean z11) {
        this.f56575f0 = z11;
    }

    /* JADX INFO: renamed from: H */
    public final void m73420H(int i11, String str) {
        String str2;
        if (i11 == 1 || this.f56549L != 1 || (str2 = this.f56539B) == null || str2.length() <= 0) {
            this.f56549L = i11;
            this.f56539B = str;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m73421I(InterfaceC16634g interfaceC16634g) {
        this.f56564a = interfaceC16634g;
    }

    /* JADX INFO: renamed from: J */
    public final void m73422J(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f56556S = str;
    }

    /* JADX INFO: renamed from: K */
    public final void m73423K(String str) {
        this.f56545H = str;
    }

    /* JADX INFO: renamed from: L */
    public final void m73424L(String str) {
        this.f56555R = str;
    }

    /* JADX INFO: renamed from: M */
    public final void m73425M(boolean z11) {
        this.f56571d0 = z11;
    }

    /* JADX INFO: renamed from: N */
    public final void m73426N(String str) {
        this.f56559V = str;
    }

    /* JADX INFO: renamed from: O */
    public final void m73427O(String str) {
        this.f56561X = str;
    }

    /* JADX INFO: renamed from: P */
    public final void m73428P(String str) {
        this.f56560W = str;
    }

    /* JADX INFO: renamed from: Q */
    public final void m73429Q(UGCVideo uGCVideo) {
        this.f56558U = uGCVideo;
    }

    /* JADX INFO: renamed from: a */
    public final void m73430a() {
        this.f56570d = System.currentTimeMillis();
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "addSurface", false, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:170:0x0307  */
    /* JADX WARN: Code duplicated, block: B:173:0x0318  */
    /* JADX WARN: Code duplicated, block: B:188:0x0379  */
    /* JADX WARN: Code duplicated, block: B:190:0x0388  */
    /* JADX WARN: Code duplicated, block: B:192:0x038e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0394  */
    /* JADX WARN: Code duplicated, block: B:196:0x039e  */
    /* JADX WARN: Code duplicated, block: B:198:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:199:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:202:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:205:0x0439  */
    /* JADX WARN: Code duplicated, block: B:206:0x043c  */
    /* JADX WARN: Code duplicated, block: B:209:0x045a  */
    /* JADX WARN: Code duplicated, block: B:210:0x045d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0467  */
    /* JADX WARN: Code duplicated, block: B:214:0x046a  */
    /* JADX WARN: Code duplicated, block: B:217:0x0474  */
    /* JADX WARN: Code duplicated, block: B:220:0x0481  */
    /* JADX WARN: Code duplicated, block: B:221:0x0484  */
    /* JADX WARN: Code duplicated, block: B:224:0x048e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0491  */
    /* JADX WARN: Code duplicated, block: B:228:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:231:0x04b1 A[LOOP:1: B:229:0x04ab->B:231:0x04b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:237:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:240:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:244:0x0513 A[Catch: all -> 0x0540, TryCatch #0 {all -> 0x0540, blocks: (B:241:0x04f8, B:242:0x050d, B:244:0x0513, B:246:0x051f, B:249:0x0531), top: B:302:0x04f8 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0544  */
    /* JADX WARN: Code duplicated, block: B:256:0x054e  */
    /* JADX WARN: Code duplicated, block: B:262:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:268:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:275:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:276:0x0608  */
    /* JADX WARN: Code duplicated, block: B:278:0x0612  */
    /* JADX WARN: Code duplicated, block: B:279:0x0617  */
    /* JADX WARN: Code duplicated, block: B:282:0x061c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0621  */
    /* JADX WARN: Code duplicated, block: B:289:0x066e  */
    /* JADX WARN: Code duplicated, block: B:294:0x067c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0687  */
    /* JADX WARN: Code duplicated, block: B:302:0x04f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x051f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0530 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x050d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:275:0x05ea, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final void m73431b(boolean z11) {
        String postId;
        String subjectId;
        String resourceId;
        String ugcVideoId;
        int epse;
        int epse2;
        int i11;
        int i12;
        long j11;
        Object obj;
        String strValueOf;
        long j12;
        String strValueOf2;
        long j13;
        Object obj2;
        long j14;
        long j15;
        Object obj3;
        Object obj4;
        TnPlayerType tnPlayerType;
        Object obj5;
        Object obj6;
        Map mapM89450a;
        Integer num;
        String str;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap;
        String lan;
        DownloadBean downloadBean;
        boolean z12;
        C26866a.a aVar;
        DownloadBean downloadBean2;
        String subjectId2;
        DownloadBean downloadBean3;
        String resourceId2;
        DownloadBean downloadBean4;
        String subjectId3;
        DownloadBean downloadBean5;
        String resourceId3;
        InterfaceC0119c interfaceC0119cM73411f;
        Long size;
        Long size2;
        String ops;
        String ugcVideoCollectionId;
        String subjectId4;
        UGCVideoBelongToCollection belongToCollection;
        if (this.f56568c == 0 && !this.f56590u) {
            C26866a.a.m104898f(C26866a.f81698a, this.f56566b, " exitPlay, return", false, 4, null);
            return;
        }
        if (!this.f56590u) {
            C26866a.a.m104908v(C26866a.f81698a, this.f56566b, " curVideoIsApp2Background = " + z11, false, 4, null);
            this.f56590u = z11;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        DownloadBean downloadBean6 = this.f56547J;
        if (downloadBean6 == null || (postId = downloadBean6.getPostId()) == null) {
            postId = "";
        }
        linkedHashMap2.put("post_id", postId);
        DownloadBean downloadBean7 = this.f56547J;
        if (downloadBean7 == null || (subjectId = downloadBean7.getSubjectId()) == null) {
            subjectId = "";
        }
        linkedHashMap2.put("subject_id", subjectId);
        DownloadBean downloadBean8 = this.f56547J;
        if (downloadBean8 == null || (resourceId = downloadBean8.getResourceId()) == null) {
            resourceId = "";
        }
        linkedHashMap2.put("resource_id", resourceId);
        String str4 = this.f56545H;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap2.put("play_type", str4);
        String strM96877i = this.f56548K;
        if (strM96877i == null) {
            strM96877i = C24662i.f75350a.m96877i();
        }
        linkedHashMap2.put(WebConstants.PAGE_FROM, strM96877i);
        String str5 = this.f56546I;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap2.put("url", str5);
        C14453d c14453d = C14453d.f50863a;
        linkedHashMap2.put("speed", String.valueOf(c14453d.m65162d()));
        linkedHashMap2.put("scale_mode", String.valueOf(c14453d.m65161c().getValue()));
        linkedHashMap2.put("lock", this.f56565a0 ? "1" : "0");
        if (C26053g0.f79567a.m102143i()) {
            Double d11 = this.f56579j;
            if (d11 != null && d11.doubleValue() > 0.0d) {
                linkedHashMap2.put("redundancyRate", String.valueOf(this.f56579j));
            }
            Double d12 = this.f56580k;
            if (d12 != null && d12.doubleValue() > 0.0d) {
                linkedHashMap2.put("poolPercentDouble", String.valueOf(this.f56580k));
            }
        }
        UGCVideo uGCVideo = this.f56558U;
        if (uGCVideo == null || (ugcVideoId = uGCVideo.getUgcVideoId()) == null) {
            DownloadBean downloadBean9 = this.f56547J;
            ugcVideoId = downloadBean9 != null ? downloadBean9.getUgcVideoId() : null;
        }
        if (ugcVideoId != null && ugcVideoId.length() != 0) {
            UGCVideo uGCVideo2 = this.f56558U;
            if (uGCVideo2 == null || (belongToCollection = uGCVideo2.getBelongToCollection()) == null || (ugcVideoCollectionId = belongToCollection.getCollectionId()) == null) {
                DownloadBean downloadBean10 = this.f56547J;
                ugcVideoCollectionId = downloadBean10 != null ? downloadBean10.getUgcVideoCollectionId() : null;
                if (ugcVideoCollectionId == null) {
                    ugcVideoCollectionId = "";
                }
            }
            linkedHashMap2.put("content_id", ugcVideoId);
            linkedHashMap2.put("belong_to_collection_id", ugcVideoCollectionId);
            linkedHashMap2.put("content_type", "ugc_video");
            DownloadBean downloadBean11 = this.f56547J;
            if (downloadBean11 == null || (subjectId4 = downloadBean11.getSubjectId()) == null) {
                subjectId4 = "";
            }
            linkedHashMap2.put("refer_subject_id", subjectId4);
        }
        String str6 = this.f56559V;
        if (str6 != null) {
            linkedHashMap2.put("parent_content_id", str6);
        }
        String str7 = this.f56560W;
        if (str7 != null) {
            linkedHashMap2.put("track_id", str7);
        }
        String str8 = this.f56561X;
        if (str8 != null) {
            linkedHashMap2.put("parent_track_id", str8);
        }
        InterfaceC27138e.a aVar2 = InterfaceC27138e.f82251a;
        linkedHashMap2.put("pip_feature", String.valueOf(aVar2.m105606b().mo86568c()));
        linkedHashMap2.put("pip_system_feature", String.valueOf(aVar2.m105606b().mo86573h()));
        String str9 = this.f56555R;
        if (str9 != null && str9.length() > 0) {
            String str10 = this.f56555R;
            Intrinsics.m97799e(str10);
            linkedHashMap2.put("resolution", str10);
        }
        if (Intrinsics.m97797c(this.f56545H, "0") || Intrinsics.m97797c(this.f56545H, "1")) {
            DownloadBean downloadBean12 = this.f56547J;
            linkedHashMap2.put("item_type", String.valueOf(downloadBean12 != null ? Integer.valueOf(downloadBean12.getType()) : null));
        }
        DownloadBean downloadBean13 = this.f56547J;
        if (!TextUtils.isEmpty(downloadBean13 != null ? downloadBean13.getOps() : null)) {
            DownloadBean downloadBean14 = this.f56547J;
            if (downloadBean14 == null || (ops = downloadBean14.getOps()) == null) {
                ops = "";
            }
            linkedHashMap2.put("ops", ops);
        }
        DownloadBean downloadBean15 = this.f56547J;
        if (downloadBean15 != null && (size2 = downloadBean15.getSize()) != null) {
            linkedHashMap2.put("resource_size", String.valueOf(size2.longValue()));
        }
        DownloadBean downloadBean16 = this.f56547J;
        if (downloadBean16 != null) {
            long progress = downloadBean16.getProgress();
            if (Intrinsics.m97797c(this.f56545H, "1")) {
                float f11 = progress * 100.0f;
                DownloadBean downloadBean17 = this.f56547J;
                linkedHashMap2.put("downloaded_percent", String.valueOf(f11 / ((downloadBean17 == null || (size = downloadBean17.getSize()) == null) ? 1L : size.longValue())));
            }
        }
        for (Map.Entry entry : this.f56562Y.entrySet()) {
            linkedHashMap2.put("subtitle_use_time_" + ((C24469a) entry.getKey()).m96011b().getType() + "_" + ((C24469a) entry.getKey()).m96011b().getLan(), String.valueOf(((Number) entry.getValue()).longValue()));
        }
        DownloadBean downloadBean18 = this.f56547J;
        if (downloadBean18 != null && downloadBean18.isSeries()) {
            DownloadBean downloadBean19 = this.f56547J;
            if ((downloadBean19 != null ? downloadBean19.getEp() : 0) > 0) {
                DownloadBean downloadBean20 = this.f56547J;
                epse = downloadBean20 != null ? downloadBean20.getSe() : 0;
                DownloadBean downloadBean21 = this.f56547J;
                if (downloadBean21 != null) {
                    epse2 = downloadBean21.getEp();
                }
            } else {
                DownloadBean downloadBean22 = this.f56547J;
                epse = downloadBean22 != null ? downloadBean22.getEpse() / 100 : 0;
                DownloadBean downloadBean23 = this.f56547J;
                if (downloadBean23 != null) {
                    epse2 = downloadBean23.getEpse() % 100;
                }
            }
            if (epse > 0) {
                linkedHashMap2.put("seasons", String.valueOf(epse));
            }
            if (epse2 > 0) {
                linkedHashMap2.put("episode", String.valueOf(epse2));
            }
            i11 = this.f56553P;
            if (i11 >= 0) {
                linkedHashMap2.put(RequestParameters.POSITION, String.valueOf(i11));
            }
            i12 = this.f56554Q;
            if (i12 >= 0) {
                linkedHashMap2.put("parent_position", String.valueOf(i12));
            }
            if (this.f56591v != 0) {
                this.f56592w += System.currentTimeMillis() - this.f56591v;
                this.f56591v = 0L;
            }
            if (this.f56572e <= 0 || this.f56590u) {
                linkedHashMap2.put("is_start", "1");
                j11 = this.f56568c;
                obj = "1";
                if (j11 > 0) {
                    j15 = this.f56572e;
                    if (j15 > 0) {
                        strValueOf = String.valueOf(j15 - j11);
                    } else {
                        strValueOf = "0";
                    }
                } else {
                    strValueOf = "0";
                }
                linkedHashMap2.put("delay_v", strValueOf);
                j12 = this.f56570d;
                if (j12 > 0) {
                    j14 = this.f56572e;
                    if (j14 > 0) {
                        strValueOf2 = String.valueOf(j14 - j12);
                    } else {
                        strValueOf2 = "0";
                    }
                } else {
                    strValueOf2 = "0";
                }
                linkedHashMap2.put("delay", strValueOf2);
                linkedHashMap2.put("buffer_time", String.valueOf(this.f56574f));
                linkedHashMap2.put("buffer_count", String.valueOf(this.f56577h));
                linkedHashMap2.put("seek_count", String.valueOf(this.f56578i));
                j13 = this.f56594y;
                if (j13 > 0) {
                    linkedHashMap2.put("play_complete", String.valueOf((this.f56581l / j13) * 100.0f));
                    linkedHashMap2.put("total_duration", String.valueOf(this.f56594y));
                }
                linkedHashMap2.put("play_duration", String.valueOf(this.f56583n));
                linkedHashMap2.put("play_duration_middlepage", String.valueOf(this.f56585p));
                linkedHashMap2.put("play_duration_fullscreen", String.valueOf(this.f56584o));
                linkedHashMap2.put("play_duration_pip", String.valueOf(this.f56586q));
                linkedHashMap2.put("pause_duration", String.valueOf(this.f56592w));
                linkedHashMap2.put("pause_count", String.valueOf(this.f56593x));
                if (this.f56587r) {
                    obj2 = obj;
                } else {
                    obj2 = "0";
                }
                linkedHashMap2.put(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, obj2);
                linkedHashMap2.put("video_bitrate", String.valueOf(this.f56551N));
                linkedHashMap2.put("audio_bitrate", String.valueOf(this.f56552O));
            } else {
                linkedHashMap2.put("is_start", "0");
                linkedHashMap2.put("delay_v", this.f56568c > 0 ? String.valueOf(System.currentTimeMillis() - this.f56568c) : "0");
                linkedHashMap2.put("delay", this.f56570d > 0 ? String.valueOf(System.currentTimeMillis() - this.f56570d) : "0");
                linkedHashMap2.put("not_play_error_msg", String.valueOf(this.f56539B));
                obj = "1";
            }
            if (z11) {
                obj3 = obj;
            } else {
                obj3 = "0";
            }
            linkedHashMap2.put("app_to_background", obj3);
            if (this.f56550M) {
                obj4 = obj;
            } else {
                obj4 = "0";
            }
            linkedHashMap2.put("is_replay", obj4);
            tnPlayerType = this.f56567b0;
            if (tnPlayerType != null) {
                linkedHashMap2.put("error_player", String.valueOf(tnPlayerType));
            }
            if (this.f56569c0) {
                obj5 = obj;
            } else {
                obj5 = "0";
            }
            linkedHashMap2.put("aliyun_2_sfotdecoder", obj5);
            if (this.f56571d0) {
                obj6 = obj;
            } else {
                obj6 = "0";
            }
            linkedHashMap2.put("timeout_replay", obj6);
            mapM89450a = C22094h.f68115a.m89450a();
            if (!mapM89450a.isEmpty()) {
                for (Map.Entry entry2 : mapM89450a.entrySet()) {
                    linkedHashMap2.put((String) entry2.getKey(), String.valueOf(((Number) entry2.getValue()).longValue()));
                }
            }
            num = this.f56595z;
            if (num != null) {
                linkedHashMap2.put("player_error_code", String.valueOf(num.intValue()));
            }
            str = this.f56538A;
            if (str != null) {
                linkedHashMap2.put("player_error_msg", str);
            }
            if (this.f56563Z.isEmpty()) {
                linkedHashMap2.put("subtitle_downloaded", "0");
            } else {
                try {
                    linkedHashMap = new LinkedHashMap();
                    List list = this.f56563Z;
                    ArrayList<C24469a> arrayList = new ArrayList();
                    arrayList.addAll(list);
                    for (C24469a c24469a : arrayList) {
                        if (c24469a.m96013d()) {
                            lan = c24469a.m96011b().getLan();
                            Intrinsics.m97799e(lan);
                            if (linkedHashMap.containsKey(lan)) {
                                String lan2 = c24469a.m96011b().getLan();
                                Intrinsics.m97799e(lan2);
                                linkedHashMap.put(lan2, "");
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
                str2 = this.f56542E;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap2.put("subtitle_type", str2);
                str3 = this.f56543F;
                if (str3 == null) {
                    str3 = "";
                }
                linkedHashMap2.put("subtitle_lan", str3);
                linkedHashMap2.put("subtitle_from", String.valueOf(this.f56544G));
                C26866a.a.m104898f(C26866a.f81698a, "ORSubtitle", "LanName= " + this.f56542E + ",Lan = " + this.f56543F + ", From = " + this.f56544G, false, 4, null);
            }
            if (TextUtils.isEmpty(this.f56540C) || !TextUtils.isEmpty(this.f56541D)) {
                linkedHashMap2.put("subtitle_bilingual", CollectionsKt.m97511q(this.f56540C, this.f56541D).toString());
            }
            downloadBean = this.f56547J;
            if (downloadBean == null && downloadBean.getSubjectType() == 6) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 && (interfaceC0119cM73411f = m73411f()) != null) {
                interfaceC0119cM73411f.mo557b(this.f56583n);
            }
            aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, this.f56566b, "video exit， report and reset data", false, 4, null);
            if (this.f56595z != null) {
                aVar.m104915i(this.f56566b, "error " + C24662i.f75350a.m96880o(linkedHashMap2), true);
            } else {
                String str11 = this.f56566b;
                Object obj7 = linkedHashMap2.get("is_start");
                downloadBean2 = this.f56547J;
                if (downloadBean2 != null) {
                    subjectId2 = downloadBean2.getSubjectId();
                } else {
                    subjectId2 = null;
                }
                downloadBean3 = this.f56547J;
                if (downloadBean3 != null) {
                    resourceId2 = downloadBean3.getResourceId();
                } else {
                    resourceId2 = null;
                }
                aVar.m104915i(str11, "is_start=" + obj7 + " subject_id=" + subjectId2 + " requestId=" + resourceId2 + " urlOrPath=" + this.f56546I, true);
            }
            C24662i.f75350a.m96875H(this.f56556S, this.f56557T, this.f56583n, linkedHashMap2);
            Bundle bundle = new Bundle();
            downloadBean4 = this.f56547J;
            if (downloadBean4 != null || (subjectId3 = downloadBean4.getSubjectId()) == null) {
                subjectId3 = "";
            }
            bundle.putString("subject_id", subjectId3);
            downloadBean5 = this.f56547J;
            if (downloadBean5 != null || (resourceId3 = downloadBean5.getResourceId()) == null) {
                resourceId3 = "";
            }
            bundle.putString("resource_id", resourceId3);
            String str12 = this.f56545H;
            bundle.putString("play_type", str12 != null ? str12 : "");
            bundle.putBoolean("is_music_liked_fragment", this.f56575f0);
            C14486e.f50941a.m65287l(this.f56557T, bundle, C14492k.f50955a.m65321o());
            m73412y(z11);
        }
        epse = 0;
        epse2 = 0;
        if (epse > 0) {
            linkedHashMap2.put("seasons", String.valueOf(epse));
        }
        if (epse2 > 0) {
            linkedHashMap2.put("episode", String.valueOf(epse2));
        }
        i11 = this.f56553P;
        if (i11 >= 0) {
            linkedHashMap2.put(RequestParameters.POSITION, String.valueOf(i11));
        }
        i12 = this.f56554Q;
        if (i12 >= 0) {
            linkedHashMap2.put("parent_position", String.valueOf(i12));
        }
        if (this.f56591v != 0) {
            this.f56592w += System.currentTimeMillis() - this.f56591v;
            this.f56591v = 0L;
        }
        if (this.f56572e <= 0) {
            linkedHashMap2.put("is_start", "1");
            j11 = this.f56568c;
            obj = "1";
            if (j11 > 0) {
                j15 = this.f56572e;
                if (j15 > 0) {
                    strValueOf = String.valueOf(j15 - j11);
                } else {
                    strValueOf = "0";
                }
            } else {
                strValueOf = "0";
            }
            linkedHashMap2.put("delay_v", strValueOf);
            j12 = this.f56570d;
            if (j12 > 0) {
                j14 = this.f56572e;
                if (j14 > 0) {
                    strValueOf2 = String.valueOf(j14 - j12);
                } else {
                    strValueOf2 = "0";
                }
            } else {
                strValueOf2 = "0";
            }
            linkedHashMap2.put("delay", strValueOf2);
            linkedHashMap2.put("buffer_time", String.valueOf(this.f56574f));
            linkedHashMap2.put("buffer_count", String.valueOf(this.f56577h));
            linkedHashMap2.put("seek_count", String.valueOf(this.f56578i));
            j13 = this.f56594y;
            if (j13 > 0) {
                linkedHashMap2.put("play_complete", String.valueOf((this.f56581l / j13) * 100.0f));
                linkedHashMap2.put("total_duration", String.valueOf(this.f56594y));
            }
            linkedHashMap2.put("play_duration", String.valueOf(this.f56583n));
            linkedHashMap2.put("play_duration_middlepage", String.valueOf(this.f56585p));
            linkedHashMap2.put("play_duration_fullscreen", String.valueOf(this.f56584o));
            linkedHashMap2.put("play_duration_pip", String.valueOf(this.f56586q));
            linkedHashMap2.put("pause_duration", String.valueOf(this.f56592w));
            linkedHashMap2.put("pause_count", String.valueOf(this.f56593x));
            if (this.f56587r) {
                obj2 = obj;
            } else {
                obj2 = "0";
            }
            linkedHashMap2.put(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, obj2);
            linkedHashMap2.put("video_bitrate", String.valueOf(this.f56551N));
            linkedHashMap2.put("audio_bitrate", String.valueOf(this.f56552O));
        } else {
            linkedHashMap2.put("is_start", "1");
            j11 = this.f56568c;
            obj = "1";
            if (j11 > 0) {
                j15 = this.f56572e;
                if (j15 > 0) {
                    strValueOf = String.valueOf(j15 - j11);
                } else {
                    strValueOf = "0";
                }
            } else {
                strValueOf = "0";
            }
            linkedHashMap2.put("delay_v", strValueOf);
            j12 = this.f56570d;
            if (j12 > 0) {
                j14 = this.f56572e;
                if (j14 > 0) {
                    strValueOf2 = String.valueOf(j14 - j12);
                } else {
                    strValueOf2 = "0";
                }
            } else {
                strValueOf2 = "0";
            }
            linkedHashMap2.put("delay", strValueOf2);
            linkedHashMap2.put("buffer_time", String.valueOf(this.f56574f));
            linkedHashMap2.put("buffer_count", String.valueOf(this.f56577h));
            linkedHashMap2.put("seek_count", String.valueOf(this.f56578i));
            j13 = this.f56594y;
            if (j13 > 0) {
                linkedHashMap2.put("play_complete", String.valueOf((this.f56581l / j13) * 100.0f));
                linkedHashMap2.put("total_duration", String.valueOf(this.f56594y));
            }
            linkedHashMap2.put("play_duration", String.valueOf(this.f56583n));
            linkedHashMap2.put("play_duration_middlepage", String.valueOf(this.f56585p));
            linkedHashMap2.put("play_duration_fullscreen", String.valueOf(this.f56584o));
            linkedHashMap2.put("play_duration_pip", String.valueOf(this.f56586q));
            linkedHashMap2.put("pause_duration", String.valueOf(this.f56592w));
            linkedHashMap2.put("pause_count", String.valueOf(this.f56593x));
            if (this.f56587r) {
                obj2 = obj;
            } else {
                obj2 = "0";
            }
            linkedHashMap2.put(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, obj2);
            linkedHashMap2.put("video_bitrate", String.valueOf(this.f56551N));
            linkedHashMap2.put("audio_bitrate", String.valueOf(this.f56552O));
        }
        if (z11) {
            obj3 = obj;
        } else {
            obj3 = "0";
        }
        linkedHashMap2.put("app_to_background", obj3);
        if (this.f56550M) {
            obj4 = obj;
        } else {
            obj4 = "0";
        }
        linkedHashMap2.put("is_replay", obj4);
        tnPlayerType = this.f56567b0;
        if (tnPlayerType != null) {
            linkedHashMap2.put("error_player", String.valueOf(tnPlayerType));
        }
        if (this.f56569c0) {
            obj5 = obj;
        } else {
            obj5 = "0";
        }
        linkedHashMap2.put("aliyun_2_sfotdecoder", obj5);
        if (this.f56571d0) {
            obj6 = obj;
        } else {
            obj6 = "0";
        }
        linkedHashMap2.put("timeout_replay", obj6);
        mapM89450a = C22094h.f68115a.m89450a();
        if (!mapM89450a.isEmpty()) {
            while (r3.hasNext()) {
                linkedHashMap2.put((String) entry2.getKey(), String.valueOf(((Number) entry2.getValue()).longValue()));
            }
        }
        num = this.f56595z;
        if (num != null) {
            linkedHashMap2.put("player_error_code", String.valueOf(num.intValue()));
        }
        str = this.f56538A;
        if (str != null) {
            linkedHashMap2.put("player_error_msg", str);
        }
        if (this.f56563Z.isEmpty()) {
            linkedHashMap2.put("subtitle_downloaded", "0");
        } else {
            linkedHashMap = new LinkedHashMap();
            List list2 = this.f56563Z;
            ArrayList<C24469a> arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            while (r4.hasNext()) {
                if (c24469a.m96013d()) {
                    lan = c24469a.m96011b().getLan();
                    Intrinsics.m97799e(lan);
                    if (linkedHashMap.containsKey(lan)) {
                        String lan3 = c24469a.m96011b().getLan();
                        Intrinsics.m97799e(lan3);
                        linkedHashMap.put(lan3, "");
                    }
                }
            }
            str2 = this.f56542E;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap2.put("subtitle_type", str2);
            str3 = this.f56543F;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap2.put("subtitle_lan", str3);
            linkedHashMap2.put("subtitle_from", String.valueOf(this.f56544G));
            C26866a.a.m104898f(C26866a.f81698a, "ORSubtitle", "LanName= " + this.f56542E + ",Lan = " + this.f56543F + ", From = " + this.f56544G, false, 4, null);
        }
        if (TextUtils.isEmpty(this.f56540C)) {
            linkedHashMap2.put("subtitle_bilingual", CollectionsKt.m97511q(this.f56540C, this.f56541D).toString());
        } else {
            linkedHashMap2.put("subtitle_bilingual", CollectionsKt.m97511q(this.f56540C, this.f56541D).toString());
        }
        downloadBean = this.f56547J;
        if (downloadBean == null) {
            z12 = false;
        } else {
            z12 = false;
        }
        if (!z12) {
            interfaceC0119cM73411f.mo557b(this.f56583n);
        }
        aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, this.f56566b, "video exit， report and reset data", false, 4, null);
        if (this.f56595z != null) {
            aVar.m104915i(this.f56566b, "error " + C24662i.f75350a.m96880o(linkedHashMap2), true);
        } else {
            String str13 = this.f56566b;
            Object obj8 = linkedHashMap2.get("is_start");
            downloadBean2 = this.f56547J;
            if (downloadBean2 != null) {
                subjectId2 = downloadBean2.getSubjectId();
            } else {
                subjectId2 = null;
            }
            downloadBean3 = this.f56547J;
            if (downloadBean3 != null) {
                resourceId2 = downloadBean3.getResourceId();
            } else {
                resourceId2 = null;
            }
            aVar.m104915i(str13, "is_start=" + obj8 + " subject_id=" + subjectId2 + " requestId=" + resourceId2 + " urlOrPath=" + this.f56546I, true);
        }
        C24662i.f75350a.m96875H(this.f56556S, this.f56557T, this.f56583n, linkedHashMap2);
        Bundle bundle2 = new Bundle();
        downloadBean4 = this.f56547J;
        if (downloadBean4 != null) {
            subjectId3 = "";
        } else {
            subjectId3 = "";
        }
        bundle2.putString("subject_id", subjectId3);
        downloadBean5 = this.f56547J;
        if (downloadBean5 != null) {
            resourceId3 = "";
        } else {
            resourceId3 = "";
        }
        bundle2.putString("resource_id", resourceId3);
        String str14 = this.f56545H;
        bundle2.putString("play_type", str14 != null ? str14 : "");
        bundle2.putBoolean("is_music_liked_fragment", this.f56575f0);
        C14486e.f50941a.m65287l(this.f56557T, bundle2, C14492k.f50955a.m65321o());
        m73412y(z11);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m73432d() {
        return this.f56565a0;
    }

    /* JADX INFO: renamed from: e */
    public final Map m73433e() {
        return this.f56562Y;
    }

    /* JADX INFO: renamed from: g */
    public final void m73434g() {
        this.f56568c = System.currentTimeMillis();
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "initView", false, 4, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m73435h(Double d11, long j11, long j12, Double d12) {
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "onBandwidthRedundancyRate", false, 4, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onBandwidthRedundancyRate: redundancyRate:");
        sb2.append(d11);
        sb2.append("，totalDownloadBytesAll : ");
        sb2.append(j11);
        sb2.append("，consumed:");
        sb2.append(j12);
        sb2.append(",poolPercent:");
        sb2.append(d12);
        this.f56579j = d11;
        this.f56580k = d12;
    }

    /* JADX INFO: renamed from: i */
    public final void m73436i() {
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "onCompletion", false, 4, null);
        this.f56587r = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m73437j() {
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "onLoadingBegin", false, 4, null);
        this.f56576g = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: k */
    public final void m73438k() {
        if (this.f56576g > 0) {
            this.f56574f += System.currentTimeMillis() - this.f56576g;
            this.f56577h++;
            this.f56576g = 0L;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m73439l(LocalUiType uiType) {
        Intrinsics.m97802h(uiType, "uiType");
        this.f56588s = uiType == LocalUiType.MIDDLE;
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "onLocalUiChanged， uiType= " + uiType, false, 4, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m73440m(PlayError errorInfo) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        this.f56595z = errorInfo.getErrorCode();
        String errorMessage = errorInfo.getErrorMessage();
        this.f56538A = errorMessage;
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "onPlayError, playerErrorCode  =" + this.f56595z + ", playerErrorMessage =" + errorMessage, false, 4, null);
        m73420H(3, this.f56538A);
    }

    /* JADX INFO: renamed from: n */
    public final void m73441n(long j11) {
        InterfaceC0119c interfaceC0119cM73411f;
        if (this.f56594y <= 0) {
            InterfaceC16634g interfaceC16634g = this.f56564a;
            this.f56594y = interfaceC16634g != null ? interfaceC16634g.getDuration() : 0L;
        }
        long j12 = this.f56582m;
        long j13 = j11 - j12;
        if (1 <= j13 && j13 < 2000) {
            this.f56583n += j11 - j12;
            if (this.f56589t) {
                this.f56586q += j11 - j12;
            } else if (this.f56588s) {
                this.f56585p += j11 - j12;
            } else {
                this.f56584o += j11 - j12;
            }
        }
        this.f56582m = j11;
        if (j11 > this.f56581l) {
            this.f56581l = j11;
        }
        DownloadBean downloadBean = this.f56547J;
        if ((downloadBean == null || downloadBean.getSubjectType() != 6) && (interfaceC0119cM73411f = m73411f()) != null) {
            interfaceC0119cM73411f.mo556a(this.f56583n);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m73442o() {
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "onRenderFirstFrame", false, 4, null);
        this.f56572e = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: p */
    public final void m73443p() {
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "oonReplayonReplay", false, 4, null);
        this.f56550M = true;
        this.f56590u = false;
    }

    /* JADX INFO: renamed from: q */
    public final void m73444q() {
        this.f56578i++;
    }

    /* JADX INFO: renamed from: r */
    public final void m73445r(List list) {
        Intrinsics.m97802h(list, "list");
        this.f56563Z.clear();
        this.f56563Z.addAll(list);
    }

    /* JADX INFO: renamed from: s */
    public final void m73446s(String name, String lan, int i11) {
        Intrinsics.m97802h(name, "name");
        Intrinsics.m97802h(lan, "lan");
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "onSubtitleSelected = " + name, false, 4, null);
        this.f56542E = name;
        this.f56543F = lan;
        this.f56544G = i11;
    }

    /* JADX INFO: renamed from: t */
    public final void m73447t(String str, String str2) {
        this.f56540C = str;
        this.f56541D = str2;
    }

    /* JADX INFO: renamed from: u */
    public final void m73448u(int i11) {
        this.f56552O = i11;
    }

    /* JADX INFO: renamed from: v */
    public final void m73449v(int i11) {
        this.f56551N = i11;
    }

    /* JADX INFO: renamed from: w */
    public final void m73450w() {
        this.f56593x++;
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "onVideoPause", false, 4, null);
        this.f56591v = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: x */
    public final void m73451x() {
        C26866a.a.m104898f(C26866a.f81698a, this.f56566b, "onVideoStart", false, 4, null);
        if (this.f56591v != 0) {
            this.f56592w += System.currentTimeMillis() - this.f56591v;
            this.f56591v = 0L;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m73452z(boolean z11) {
        this.f56569c0 = z11;
    }
}
