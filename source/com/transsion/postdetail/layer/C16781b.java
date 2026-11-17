package com.transsion.postdetail.layer;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.ORPlayerPreloadManager;
import com.transsion.player.orplayer.PlayError;
import com.transsion.web.api.WebConstants;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import no.C26053g0;
import p016ak.C0117a;
import p016ak.InterfaceC0119c;
import p550kj.C24662i;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16781b {

    /* JADX INFO: renamed from: C */
    private InterfaceC0119c f56419C;

    /* JADX INFO: renamed from: F */
    private int f56422F;

    /* JADX INFO: renamed from: b */
    private InterfaceC16634g f56425b;

    /* JADX INFO: renamed from: c */
    private String f56426c;

    /* JADX INFO: renamed from: d */
    private PostSubjectItem f56427d;

    /* JADX INFO: renamed from: e */
    private long f56428e;

    /* JADX INFO: renamed from: f */
    private long f56429f;

    /* JADX INFO: renamed from: g */
    private long f56430g;

    /* JADX INFO: renamed from: h */
    private long f56431h;

    /* JADX INFO: renamed from: i */
    private long f56432i;

    /* JADX INFO: renamed from: j */
    private int f56433j;

    /* JADX INFO: renamed from: k */
    private Double f56434k;

    /* JADX INFO: renamed from: l */
    private long f56435l;

    /* JADX INFO: renamed from: m */
    private long f56436m;

    /* JADX INFO: renamed from: n */
    private long f56437n;

    /* JADX INFO: renamed from: o */
    private int f56438o;

    /* JADX INFO: renamed from: p */
    private long f56439p;

    /* JADX INFO: renamed from: q */
    private long f56440q;

    /* JADX INFO: renamed from: r */
    private Double f56441r;

    /* JADX INFO: renamed from: s */
    private long f56442s;

    /* JADX INFO: renamed from: t */
    private Integer f56443t;

    /* JADX INFO: renamed from: u */
    private String f56444u;

    /* JADX INFO: renamed from: v */
    private String f56445v;

    /* JADX INFO: renamed from: w */
    private String f56446w;

    /* JADX INFO: renamed from: x */
    private boolean f56447x;

    /* JADX INFO: renamed from: a */
    private final String f56424a = C16781b.class.getSimpleName();

    /* JADX INFO: renamed from: y */
    private boolean f56448y = true;

    /* JADX INFO: renamed from: z */
    private String f56449z = "";

    /* JADX INFO: renamed from: A */
    private String f56417A = "";

    /* JADX INFO: renamed from: B */
    private int f56418B = -1;

    /* JADX INFO: renamed from: D */
    private String f56420D = "";

    /* JADX INFO: renamed from: E */
    private String f56421E = "";

    /* JADX INFO: renamed from: G */
    private String f56423G = "postdetail";

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m73117e(C16781b c16781b, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c16781b.m73124d(z11);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC0119c m73118f() {
        if (this.f56419C == null) {
            this.f56419C = (InterfaceC0119c) C0117a.f402a.m550a(InterfaceC0119c.class);
        }
        return this.f56419C;
    }

    /* JADX INFO: renamed from: q */
    private final void m73119q(boolean z11) {
        this.f56428e = 0L;
        this.f56429f = 0L;
        this.f56430g = 0L;
        this.f56431h = 0L;
        this.f56432i = 0L;
        this.f56433j = 0;
        this.f56435l = 0L;
        this.f56436m = 0L;
        this.f56437n = 0L;
        this.f56438o = 0;
        this.f56439p = 0L;
        this.f56440q = 0L;
        this.f56442s = 0L;
        if (z11) {
            return;
        }
        this.f56418B = -1;
        this.f56447x = false;
    }

    /* JADX INFO: renamed from: A */
    public final void m73120A(String url) {
        Intrinsics.m97802h(url, "url");
        this.f56417A = url;
    }

    /* JADX INFO: renamed from: a */
    public final void m73121a(int i11, int i12) {
        this.f56429f = System.currentTimeMillis();
        C26866a.a.m104898f(C26866a.f81698a, "video_play", "addSurface", false, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m73122b() {
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56424a;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "clickPause", false, 4, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "pause");
        C24662i.f75350a.m96884s(this.f56423G, "module_name", linkedHashMap);
    }

    /* JADX INFO: renamed from: c */
    public final void m73123c() {
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56424a;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "clickPlay", false, 4, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", MediaItem.MUSIC_FLOAT_STATE_PLAY);
        C24662i.f75350a.m96884s(this.f56423G, "module_name", linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0192  */
    /* JADX INFO: renamed from: d */
    public final void m73124d(boolean z11) {
        String postId;
        String subjectId;
        String itemType;
        String strValueOf;
        String strValueOf2;
        String rec_ops;
        Subject subject;
        Subject subject2;
        if (this.f56428e == 0 && !this.f56447x) {
            C26866a.a aVar = C26866a.f81698a;
            String TAG = this.f56424a;
            Intrinsics.m97801g(TAG, "TAG");
            C26866a.a.m104898f(aVar, TAG, "exitPlay, return", false, 4, null);
            return;
        }
        if (!this.f56447x) {
            C26866a.a aVar2 = C26866a.f81698a;
            String TAG2 = this.f56424a;
            Intrinsics.m97801g(TAG2, "TAG");
            C26866a.a.m104908v(aVar2, TAG2, "curVideoIsApp2Background = " + z11, false, 4, null);
            this.f56447x = z11;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PostSubjectItem postSubjectItem = this.f56427d;
        if (postSubjectItem == null || (postId = postSubjectItem.getPostId()) == null) {
            postId = "";
        }
        linkedHashMap.put("post_id", postId);
        linkedHashMap.put("opt_type", this.f56420D);
        PostSubjectItem postSubjectItem2 = this.f56427d;
        if (postSubjectItem2 == null || (subject2 = postSubjectItem2.getSubject()) == null || (subjectId = subject2.getSubjectId()) == null) {
            subjectId = "";
        }
        linkedHashMap.put("subject_id", subjectId);
        String str = this.f56444u;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("base_post_id", str);
        PostSubjectItem postSubjectItem3 = this.f56427d;
        if (postSubjectItem3 == null || (itemType = postSubjectItem3.getItemType()) == null) {
            itemType = "";
        }
        linkedHashMap.put("item_type", itemType);
        linkedHashMap.put("ep", this.f56421E);
        String str2 = this.f56445v;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("base_item_type", str2);
        PostSubjectItem postSubjectItem4 = this.f56427d;
        linkedHashMap.put("has_resource", String.valueOf((postSubjectItem4 == null || (subject = postSubjectItem4.getSubject()) == null) ? null : subject.getHasResource()));
        String strM96877i = this.f56449z;
        if (strM96877i.length() == 0) {
            strM96877i = C24662i.f75350a.m96877i();
        }
        linkedHashMap.put(WebConstants.PAGE_FROM, strM96877i);
        PostSubjectItem postSubjectItem5 = this.f56427d;
        if (!TextUtils.isEmpty(postSubjectItem5 != null ? postSubjectItem5.getRec_ops() : null)) {
            PostSubjectItem postSubjectItem6 = this.f56427d;
            if (postSubjectItem6 == null || (rec_ops = postSubjectItem6.getRec_ops()) == null) {
                rec_ops = "";
            }
            linkedHashMap.put("ops", rec_ops);
        }
        if (C26053g0.f79567a.m102143i()) {
            String str3 = this.f56446w;
            if (str3 != null && str3.length() != 0) {
                String str4 = this.f56446w;
                linkedHashMap.put("subpage_name", str4 != null ? str4 : "");
            }
            int i11 = this.f56422F;
            if (i11 > 0) {
                linkedHashMap.put("subject_type", String.valueOf(i11));
            }
        }
        if (this.f56430g > 0 || (this.f56447x && this.f56437n > 0)) {
            linkedHashMap.put("is_start", "1");
            long j11 = this.f56428e;
            if (j11 > 0) {
                long j12 = this.f56430g;
                if (j12 > 0) {
                    strValueOf = String.valueOf(j12 - j11);
                } else {
                    strValueOf = "0";
                }
            } else {
                strValueOf = "0";
            }
            linkedHashMap.put("delay_v", strValueOf);
            long j13 = this.f56429f;
            if (j13 > 0) {
                long j14 = this.f56430g;
                if (j14 > 0) {
                    strValueOf2 = String.valueOf(j14 - j13);
                } else {
                    strValueOf2 = "0";
                }
            } else {
                strValueOf2 = "0";
            }
            linkedHashMap.put("delay", strValueOf2);
            linkedHashMap.put("buffer_time", String.valueOf(this.f56431h));
            linkedHashMap.put("buffer_count", String.valueOf(this.f56433j));
            linkedHashMap.put("play_complete", String.valueOf(((this.f56435l / this.f56442s) * 100.0f) + (this.f56438o * 100.0f)));
            linkedHashMap.put("play_duration", String.valueOf(this.f56437n));
            linkedHashMap.put("pause_duration", String.valueOf(this.f56440q));
            linkedHashMap.put("completeCount", String.valueOf(this.f56438o));
        } else {
            linkedHashMap.put("is_start", "0");
            linkedHashMap.put("delay_v", this.f56428e > 0 ? String.valueOf(System.currentTimeMillis() - this.f56428e) : "0");
            linkedHashMap.put("delay", this.f56429f > 0 ? String.valueOf(System.currentTimeMillis() - this.f56429f) : "0");
        }
        Double d11 = this.f56434k;
        if (d11 != null && d11.doubleValue() > 0.0d) {
            linkedHashMap.put("redundancyRate", String.valueOf(this.f56434k));
        }
        Double d12 = this.f56441r;
        if (d12 != null && d12.doubleValue() > 0.0d) {
            linkedHashMap.put("poolPercentDouble", String.valueOf(this.f56441r));
        }
        linkedHashMap.put("app_to_background", z11 ? "1" : "0");
        linkedHashMap.put("is_preloaded", ORPlayerPreloadManager.f55908i.m72403a().m72396e(this.f56417A) ? "1" : "0");
        linkedHashMap.put("url", this.f56417A);
        PostSubjectItem postSubjectItem7 = this.f56427d;
        linkedHashMap.put("builtin", (postSubjectItem7 == null || !postSubjectItem7.getBuiltIn()) ? "0" : "1");
        long j15 = this.f56442s;
        if (j15 > 0) {
            linkedHashMap.put("total_duration", String.valueOf(j15));
        }
        int i12 = this.f56418B;
        if (i12 >= 0) {
            linkedHashMap.put(RequestParameters.POSITION, String.valueOf(i12));
        }
        Integer num = this.f56443t;
        if (num != null) {
            linkedHashMap.put("error_code", String.valueOf(num));
        }
        if (!this.f56447x || this.f56437n > 0 || this.f56448y) {
            if (z11) {
                this.f56448y = false;
            }
            InterfaceC0119c interfaceC0119cM73118f = m73118f();
            if (interfaceC0119cM73118f != null) {
                interfaceC0119cM73118f.mo557b(this.f56437n);
            }
            C24662i.f75350a.m96875H(this.f56423G, "video_play", this.f56437n, linkedHashMap);
            m73119q(z11);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m73125g() {
        this.f56428e = System.currentTimeMillis();
        this.f56448y = true;
        C26866a.a.m104898f(C26866a.f81698a, "video_play", "initView", false, 4, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m73126h() {
        this.f56432i = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: i */
    public final void m73127i() {
        if (this.f56432i > 0) {
            this.f56431h += System.currentTimeMillis() - this.f56432i;
            this.f56433j++;
            this.f56432i = 0L;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m73128j() {
        this.f56438o++;
        this.f56435l = 0L;
    }

    /* JADX INFO: renamed from: k */
    public final void m73129k(PlayError errorInfo) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        this.f56443t = errorInfo.getErrorCode();
    }

    /* JADX INFO: renamed from: l */
    public final void m73130l(long j11) {
        InterfaceC16634g interfaceC16634g = this.f56425b;
        this.f56442s = interfaceC16634g != null ? interfaceC16634g.getDuration() : 0L;
        long j12 = this.f56436m;
        long j13 = j11 - j12;
        if (1 <= j13 && j13 < 1000) {
            this.f56437n += j11 - j12;
        }
        this.f56436m = j11;
        if (j11 > this.f56435l) {
            this.f56435l = j11;
        }
        InterfaceC0119c interfaceC0119cM73118f = m73118f();
        if (interfaceC0119cM73118f != null) {
            interfaceC0119cM73118f.mo556a(this.f56437n);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m73131m() {
        C26866a.a.m104898f(C26866a.f81698a, "video_play", "onRenderFirstFrame", false, 4, null);
        this.f56430g = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: n */
    public final void m73132n() {
        this.f56439p = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: o */
    public final void m73133o() {
        if (this.f56439p != 0) {
            this.f56440q += System.currentTimeMillis() - this.f56439p;
            this.f56439p = 0L;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m73134p() {
        m73117e(this, false, 1, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m73135r(String str) {
        this.f56445v = str;
    }

    /* JADX INFO: renamed from: s */
    public final void m73136s(String str) {
        this.f56444u = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m73137t(String pageFrom) {
        Intrinsics.m97802h(pageFrom, "pageFrom");
        this.f56449z = pageFrom;
    }

    /* JADX INFO: renamed from: u */
    public final void m73138u(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f56423G = str;
    }

    /* JADX INFO: renamed from: v */
    public final void m73139v(InterfaceC16634g orPlayer) {
        Intrinsics.m97802h(orPlayer, "orPlayer");
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56424a;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "setPlayer----->", false, 4, null);
        this.f56425b = orPlayer;
    }

    /* JADX INFO: renamed from: w */
    public final void m73140w(Integer num) {
        this.f56418B = num != null ? num.intValue() : -1;
    }

    /* JADX INFO: renamed from: x */
    public final void m73141x(String str, PostSubjectItem postSubjectItem) {
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f56424a;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "setPostData----->", false, 4, null);
        this.f56426c = str;
        this.f56427d = postSubjectItem;
    }

    /* JADX INFO: renamed from: y */
    public final void m73142y(int i11) {
        this.f56422F = i11;
    }

    /* JADX INFO: renamed from: z */
    public final void m73143z(String subpageName) {
        Intrinsics.m97802h(subpageName, "subpageName");
        this.f56446w = subpageName;
    }
}
