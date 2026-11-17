package com.transsion.ugcvideodetail.hepler;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.orplayer.ORPlayerPreloadManager;
import com.transsion.player.orplayer.PlayError;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.web.api.WebConstants;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p016ak.C0117a;
import p016ak.InterfaceC0119c;
import p550kj.C24662i;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C20310a {

    /* JADX INFO: renamed from: a */
    private final String f64344a;

    /* JADX INFO: renamed from: b */
    private final String f64345b;

    /* JADX INFO: renamed from: c */
    private final String f64346c;

    /* JADX INFO: renamed from: d */
    private InterfaceC16634g f64347d;

    /* JADX INFO: renamed from: e */
    private UGCVideo f64348e;

    /* JADX INFO: renamed from: f */
    private long f64349f;

    /* JADX INFO: renamed from: g */
    private long f64350g;

    /* JADX INFO: renamed from: h */
    private long f64351h;

    /* JADX INFO: renamed from: i */
    private long f64352i;

    /* JADX INFO: renamed from: j */
    private long f64353j;

    /* JADX INFO: renamed from: k */
    private int f64354k;

    /* JADX INFO: renamed from: l */
    private long f64355l;

    /* JADX INFO: renamed from: m */
    private long f64356m;

    /* JADX INFO: renamed from: n */
    private long f64357n;

    /* JADX INFO: renamed from: o */
    private int f64358o;

    /* JADX INFO: renamed from: p */
    private long f64359p;

    /* JADX INFO: renamed from: q */
    private long f64360q;

    /* JADX INFO: renamed from: r */
    private long f64361r;

    /* JADX INFO: renamed from: s */
    private Integer f64362s;

    /* JADX INFO: renamed from: t */
    private boolean f64363t;

    /* JADX INFO: renamed from: u */
    private boolean f64364u;

    /* JADX INFO: renamed from: v */
    private String f64365v;

    /* JADX INFO: renamed from: w */
    private int f64366w;

    /* JADX INFO: renamed from: x */
    private InterfaceC0119c f64367x;

    /* JADX INFO: renamed from: y */
    private String f64368y;

    /* JADX INFO: renamed from: z */
    private int f64369z;

    public C20310a(String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        this.f64344a = pageName;
        this.f64345b = str;
        this.f64346c = C20310a.class.getSimpleName();
        this.f64364u = true;
        this.f64365v = "";
        this.f64366w = -1;
        this.f64368y = "";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m84047d(C20310a c20310a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c20310a.m84051b(z11);
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC0119c m84048e() {
        if (this.f64367x == null) {
            this.f64367x = (InterfaceC0119c) C0117a.f402a.m550a(InterfaceC0119c.class);
        }
        return this.f64367x;
    }

    /* JADX INFO: renamed from: q */
    private final void m84049q(boolean z11) {
        this.f64349f = 0L;
        this.f64350g = 0L;
        this.f64351h = 0L;
        this.f64352i = 0L;
        this.f64353j = 0L;
        this.f64354k = 0;
        this.f64355l = 0L;
        this.f64356m = 0L;
        this.f64357n = 0L;
        this.f64358o = 0;
        this.f64359p = 0L;
        this.f64360q = 0L;
        this.f64361r = 0L;
        if (z11) {
            return;
        }
        this.f64366w = -1;
        this.f64363t = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m84050a() {
        this.f64350g = System.currentTimeMillis();
        C26866a.a.m104898f(C26866a.f81698a, "video_play", "addSurface", false, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX INFO: renamed from: b */
    public final void m84051b(boolean z11) {
        String ops;
        String strValueOf;
        String strValueOf2;
        if (this.f64349f == 0 && !this.f64363t) {
            C26866a.a aVar = C26866a.f81698a;
            String TAG = this.f64346c;
            Intrinsics.m97801g(TAG, "TAG");
            C26866a.a.m104898f(aVar, TAG, "exitPlay, return", false, 4, null);
            return;
        }
        if (!this.f64363t) {
            C26866a.a aVar2 = C26866a.f81698a;
            String TAG2 = this.f64346c;
            Intrinsics.m97801g(TAG2, "TAG");
            C26866a.a.m104908v(aVar2, TAG2, "curVideoIsApp2Background = " + z11, false, 4, null);
            this.f64363t = z11;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ep", this.f64368y);
        String strM96877i = this.f64345b;
        if (strM96877i == null) {
            strM96877i = C24662i.f75350a.m96877i();
        }
        linkedHashMap.put(WebConstants.PAGE_FROM, strM96877i);
        UGCVideo uGCVideo = this.f64348e;
        if (uGCVideo == null || (ops = uGCVideo.getOps()) == null) {
            ops = "";
        }
        linkedHashMap.put("ops", ops);
        int i11 = this.f64369z;
        if (i11 > 0) {
            linkedHashMap.put("subject_type", String.valueOf(i11));
        }
        if (this.f64351h > 0 || (this.f64363t && this.f64357n > 0)) {
            linkedHashMap.put("is_start", "1");
            long j11 = this.f64349f;
            if (j11 > 0) {
                long j12 = this.f64351h;
                if (j12 > 0) {
                    strValueOf = String.valueOf(j12 - j11);
                } else {
                    strValueOf = "0";
                }
            } else {
                strValueOf = "0";
            }
            linkedHashMap.put("delay_v", strValueOf);
            long j13 = this.f64350g;
            if (j13 > 0) {
                long j14 = this.f64351h;
                if (j14 > 0) {
                    strValueOf2 = String.valueOf(j14 - j13);
                } else {
                    strValueOf2 = "0";
                }
            } else {
                strValueOf2 = "0";
            }
            linkedHashMap.put("delay", strValueOf2);
            linkedHashMap.put("buffer_time", String.valueOf(this.f64352i));
            linkedHashMap.put("buffer_count", String.valueOf(this.f64354k));
            linkedHashMap.put("play_complete", String.valueOf(((this.f64355l / this.f64361r) * 100.0f) + (this.f64358o * 100.0f)));
            linkedHashMap.put("play_duration", String.valueOf(this.f64357n));
            linkedHashMap.put("pause_duration", String.valueOf(this.f64360q));
            linkedHashMap.put("completeCount", String.valueOf(this.f64358o));
        } else {
            linkedHashMap.put("is_start", "0");
            linkedHashMap.put("delay_v", this.f64349f > 0 ? String.valueOf(System.currentTimeMillis() - this.f64349f) : "0");
            linkedHashMap.put("delay", this.f64350g > 0 ? String.valueOf(System.currentTimeMillis() - this.f64350g) : "0");
        }
        linkedHashMap.put("app_to_background", z11 ? "1" : "0");
        linkedHashMap.put("is_preloaded", ORPlayerPreloadManager.f55908i.m72403a().m72396e(this.f64365v) ? "1" : "0");
        linkedHashMap.put("url", this.f64365v);
        long j15 = this.f64361r;
        if (j15 > 0) {
            linkedHashMap.put("total_duration", String.valueOf(j15));
        }
        int i12 = this.f64366w;
        if (i12 >= 0) {
            linkedHashMap.put(RequestParameters.POSITION, String.valueOf(i12));
        }
        Integer num = this.f64362s;
        if (num != null) {
            linkedHashMap.put("error_code", String.valueOf(num));
        }
        if (!this.f64363t || this.f64357n > 0 || this.f64364u) {
            if (z11) {
                this.f64364u = false;
            }
            InterfaceC0119c interfaceC0119cM84048e = m84048e();
            if (interfaceC0119cM84048e != null) {
                interfaceC0119cM84048e.mo557b(this.f64357n);
            }
            C24662i.f75350a.m96875H(this.f64344a, "video_play", this.f64357n, linkedHashMap);
            m84049q(z11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m84052c(boolean z11, boolean z12) {
        if (z11) {
            m84051b(z12);
        } else {
            m84049q(z12);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m84053f() {
        this.f64349f = System.currentTimeMillis();
        this.f64364u = true;
        C26866a.a.m104898f(C26866a.f81698a, "video_play", "initView", false, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m84054g() {
        m84059l(this.f64361r);
    }

    /* JADX INFO: renamed from: h */
    public final void m84055h() {
        this.f64353j = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: i */
    public final void m84056i() {
        if (this.f64353j > 0) {
            this.f64352i += System.currentTimeMillis() - this.f64353j;
            this.f64354k++;
            this.f64353j = 0L;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m84057j() {
        this.f64358o++;
        this.f64355l = 0L;
    }

    /* JADX INFO: renamed from: k */
    public final void m84058k(PlayError errorInfo) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        this.f64362s = errorInfo.getErrorCode();
    }

    /* JADX INFO: renamed from: l */
    public final void m84059l(long j11) {
        if (this.f64361r <= 0) {
            InterfaceC16634g interfaceC16634g = this.f64347d;
            this.f64361r = interfaceC16634g != null ? interfaceC16634g.getDuration() : 0L;
        }
        long j12 = this.f64356m;
        long j13 = j11 - j12;
        if (1 <= j13 && j13 < 1000) {
            this.f64357n += j11 - j12;
        }
        this.f64356m = j11;
        if (j11 > this.f64355l) {
            this.f64355l = j11;
        }
        InterfaceC0119c interfaceC0119cM84048e = m84048e();
        if (interfaceC0119cM84048e != null) {
            interfaceC0119cM84048e.mo556a(this.f64357n);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m84060m() {
        C26866a.a.m104898f(C26866a.f81698a, "video_play", "onRenderFirstFrame", false, 4, null);
        this.f64351h = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: n */
    public final void m84061n() {
        this.f64359p = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: o */
    public final void m84062o() {
        if (this.f64359p != 0) {
            this.f64360q += System.currentTimeMillis() - this.f64359p;
            this.f64359p = 0L;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m84063p() {
        m84047d(this, false, 1, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m84064r(Integer num) {
        this.f64366w = num != null ? num.intValue() : -1;
    }

    /* JADX INFO: renamed from: s */
    public final void m84065s(UGCVideo uGCVideo) {
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f64346c;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "setData----->", false, 4, null);
        this.f64348e = uGCVideo;
    }

    /* JADX INFO: renamed from: t */
    public final void m84066t(InterfaceC16634g interfaceC16634g) {
        C26866a.a aVar = C26866a.f81698a;
        String TAG = this.f64346c;
        Intrinsics.m97801g(TAG, "TAG");
        C26866a.a.m104898f(aVar, TAG, "setPlayer----->", false, 4, null);
        this.f64347d = interfaceC16634g;
    }

    /* JADX INFO: renamed from: u */
    public final void m84067u(String url) {
        Intrinsics.m97802h(url, "url");
        this.f64365v = url;
    }
}
