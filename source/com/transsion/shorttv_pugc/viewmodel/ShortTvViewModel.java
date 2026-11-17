package com.transsion.shorttv_pugc.viewmodel;

import android.content.Context;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.utils.ShortTvExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25138k1;
import kotlinx.coroutines.AbstractC25146m1;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import p349dh.C22982c;
import p357dt.C23049a;
import p883wt.InterfaceC28436a;
import p920xt.InterfaceC28656a;
import p920xt.InterfaceC28658c;
import p920xt.InterfaceC28659d;
import p920xt.InterfaceC28660e;
import p920xt.InterfaceC28661f;
import p920xt.InterfaceC28663h;
import p920xt.InterfaceC28664i;
import pg.C26866a;
import yt.InterfaceC29008a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: M */
    public static final C19533a f62486M = new C19533a(null);

    /* JADX INFO: renamed from: A */
    private final Lazy f62487A;

    /* JADX INFO: renamed from: B */
    private final Lazy f62488B;

    /* JADX INFO: renamed from: C */
    private final Lazy f62489C;

    /* JADX INFO: renamed from: D */
    private final Lazy f62490D;

    /* JADX INFO: renamed from: E */
    private final Lazy f62491E;

    /* JADX INFO: renamed from: F */
    private final List f62492F;

    /* JADX INFO: renamed from: G */
    private final List f62493G;

    /* JADX INFO: renamed from: H */
    private String f62494H;

    /* JADX INFO: renamed from: I */
    private List f62495I;

    /* JADX INFO: renamed from: J */
    private String f62496J;

    /* JADX INFO: renamed from: K */
    private boolean f62497K;

    /* JADX INFO: renamed from: L */
    private String f62498L;

    /* JADX INFO: renamed from: a */
    private final InterfaceC28436a f62499a = (InterfaceC28436a) C22982c.f70163e.m91553a().m91552h(InterfaceC28436a.class);

    /* JADX INFO: renamed from: b */
    private final AbstractC25138k1 f62500b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f62501c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f62502d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f62503e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f62504f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f62505g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f62506h;

    /* JADX INFO: renamed from: i */
    private final LiveData f62507i;

    /* JADX INFO: renamed from: j */
    private final C3187b0 f62508j;

    /* JADX INFO: renamed from: k */
    private final LiveData f62509k;

    /* JADX INFO: renamed from: l */
    private final C3187b0 f62510l;

    /* JADX INFO: renamed from: m */
    private final LiveData f62511m;

    /* JADX INFO: renamed from: n */
    private final C3187b0 f62512n;

    /* JADX INFO: renamed from: o */
    private final LiveData f62513o;

    /* JADX INFO: renamed from: p */
    private final C3187b0 f62514p;

    /* JADX INFO: renamed from: q */
    private final LiveData f62515q;

    /* JADX INFO: renamed from: r */
    private final C3187b0 f62516r;

    /* JADX INFO: renamed from: s */
    private final LiveData f62517s;

    /* JADX INFO: renamed from: t */
    private final C3187b0 f62518t;

    /* JADX INFO: renamed from: u */
    private LiveData f62519u;

    /* JADX INFO: renamed from: v */
    private final C3187b0 f62520v;

    /* JADX INFO: renamed from: w */
    private final LiveData f62521w;

    /* JADX INFO: renamed from: x */
    private final InterfaceC29008a f62522x;

    /* JADX INFO: renamed from: y */
    private final Lazy f62523y;

    /* JADX INFO: renamed from: z */
    private final Lazy f62524z;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel$a */
    public static final class C19533a {
        private C19533a() {
        }

        public /* synthetic */ C19533a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ShortTvViewModel() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.m97801g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f62500b = AbstractC25146m1.m99074c(executorServiceNewSingleThreadExecutor);
        this.f62501c = new C3187b0();
        this.f62502d = new C3187b0();
        this.f62503e = new C3187b0();
        this.f62504f = new C3187b0();
        this.f62505g = new C3187b0();
        C3187b0 c3187b0 = new C3187b0();
        this.f62506h = c3187b0;
        this.f62507i = c3187b0;
        C3187b0 c3187b1 = new C3187b0();
        this.f62508j = c3187b1;
        this.f62509k = c3187b1;
        C3187b0 c3187b2 = new C3187b0();
        this.f62510l = c3187b2;
        this.f62511m = c3187b2;
        C3187b0 c3187b3 = new C3187b0();
        this.f62512n = c3187b3;
        this.f62513o = c3187b3;
        C3187b0 c3187b4 = new C3187b0();
        this.f62514p = c3187b4;
        this.f62515q = c3187b4;
        C3187b0 c3187b5 = new C3187b0();
        this.f62516r = c3187b5;
        this.f62517s = c3187b5;
        C3187b0 c3187b6 = new C3187b0();
        this.f62518t = c3187b6;
        this.f62519u = c3187b6;
        C3187b0 c3187b7 = new C3187b0();
        this.f62520v = c3187b7;
        this.f62521w = c3187b7;
        this.f62522x = C23049a.f70283a.m91696b();
        this.f62523y = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.viewmodel.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m81380j0(this.f62525a);
            }
        });
        this.f62524z = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.viewmodel.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m81384l0(this.f62526a);
            }
        });
        this.f62487A = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.viewmodel.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m81382k0(this.f62527a);
            }
        });
        this.f62488B = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.viewmodel.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m81387o0(this.f62528a);
            }
        });
        this.f62489C = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.viewmodel.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m81385m0(this.f62529a);
            }
        });
        this.f62490D = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.viewmodel.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m81388p0(this.f62530a);
            }
        });
        this.f62491E = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.viewmodel.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvViewModel.m81386n0(this.f62531a);
            }
        });
        this.f62492F = new ArrayList();
        this.f62493G = new ArrayList();
        this.f62494H = "";
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m81370a0(ShortTvViewModel shortTvViewModel, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shortTvViewModel.f62494H;
        }
        shortTvViewModel.m81414Z(str, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final InterfaceC28658c m81380j0(ShortTvViewModel shortTvViewModel) {
        InterfaceC29008a interfaceC29008a = shortTvViewModel.f62522x;
        if (interfaceC29008a != null) {
            return interfaceC29008a.mo73655b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final InterfaceC28659d m81382k0(ShortTvViewModel shortTvViewModel) {
        InterfaceC29008a interfaceC29008a = shortTvViewModel.f62522x;
        if (interfaceC29008a != null) {
            return interfaceC29008a.mo73658e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final InterfaceC28660e m81384l0(ShortTvViewModel shortTvViewModel) {
        InterfaceC29008a interfaceC29008a = shortTvViewModel.f62522x;
        if (interfaceC29008a != null) {
            return interfaceC29008a.mo73659f();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final InterfaceC28661f m81385m0(ShortTvViewModel shortTvViewModel) {
        InterfaceC29008a interfaceC29008a = shortTvViewModel.f62522x;
        if (interfaceC29008a != null) {
            return interfaceC29008a.mo73654a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final InterfaceC28663h m81386n0(ShortTvViewModel shortTvViewModel) {
        InterfaceC29008a interfaceC29008a = shortTvViewModel.f62522x;
        if (interfaceC29008a != null) {
            return interfaceC29008a.mo73657d();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final InterfaceC28656a m81387o0(ShortTvViewModel shortTvViewModel) {
        InterfaceC29008a interfaceC29008a = shortTvViewModel.f62522x;
        if (interfaceC29008a != null) {
            return interfaceC29008a.mo73662i();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final InterfaceC28664i m81388p0(ShortTvViewModel shortTvViewModel) {
        InterfaceC29008a interfaceC29008a = shortTvViewModel.f62522x;
        if (interfaceC29008a != null) {
            return interfaceC29008a.mo73656c();
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final LiveData m81389A() {
        return this.f62519u;
    }

    /* JADX INFO: renamed from: B */
    public final LiveData m81390B() {
        return this.f62509k;
    }

    /* JADX INFO: renamed from: C */
    public final Object m81391C(String str, Continuation continuation) {
        InterfaceC28661f interfaceC28661fM81403O = m81403O();
        if (interfaceC28661fM81403O != null) {
            return interfaceC28661fM81403O.mo73796c(str, continuation);
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final LiveData m81392D() {
        return this.f62517s;
    }

    /* JADX INFO: renamed from: E */
    public final LiveData m81393E() {
        return this.f62511m;
    }

    /* JADX INFO: renamed from: F */
    public final int m81394F() {
        ShorttvModel.UGCVideo uGCVideo = (ShorttvModel.UGCVideo) CollectionsKt.m97361k0(this.f62493G);
        if (uGCVideo != null) {
            return uGCVideo.getEp();
        }
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public final int m81395G() {
        ShorttvModel.UGCVideo uGCVideo = (ShorttvModel.UGCVideo) CollectionsKt.m97372v0(this.f62493G);
        if (uGCVideo != null) {
            return uGCVideo.getEp();
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public final void m81396H(int i11) {
    }

    /* JADX INFO: renamed from: I */
    public final String m81397I() {
        return this.f62496J;
    }

    /* JADX INFO: renamed from: J */
    public final LiveData m81398J() {
        return this.f62513o;
    }

    /* JADX INFO: renamed from: K */
    public final void m81399K(String nextPage, int i11, boolean z11) {
        Intrinsics.m97802h(nextPage, "nextPage");
    }

    /* JADX INFO: renamed from: L */
    public final InterfaceC28658c m81400L() {
        return (InterfaceC28658c) this.f62523y.getValue();
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceC28659d m81401M() {
        return (InterfaceC28659d) this.f62487A.getValue();
    }

    /* JADX INFO: renamed from: N */
    public final InterfaceC28660e m81402N() {
        return (InterfaceC28660e) this.f62524z.getValue();
    }

    /* JADX INFO: renamed from: O */
    public final InterfaceC28661f m81403O() {
        return (InterfaceC28661f) this.f62489C.getValue();
    }

    /* JADX INFO: renamed from: P */
    public final InterfaceC28663h m81404P() {
        return (InterfaceC28663h) this.f62491E.getValue();
    }

    /* JADX INFO: renamed from: Q */
    public final InterfaceC28656a m81405Q() {
        return (InterfaceC28656a) this.f62488B.getValue();
    }

    /* JADX INFO: renamed from: R */
    public final InterfaceC28664i m81406R() {
        return (InterfaceC28664i) this.f62490D.getValue();
    }

    /* JADX INFO: renamed from: S */
    public final LiveData m81407S() {
        return this.f62515q;
    }

    /* JADX INFO: renamed from: T */
    public final C3187b0 m81408T() {
        return this.f62501c;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m81409U() {
        return this.f62497K;
    }

    /* JADX INFO: renamed from: V */
    public final void m81410V(ShorttvModel.UGCVideo uGCVideo) {
        String ugcVideoId;
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo;
        Boolean hasLike;
        String likeNum;
        if (uGCVideo == null || (ugcVideoId = uGCVideo.getUgcVideoId()) == null || (interactiveInfo = uGCVideo.getInteractiveInfo()) == null || (hasLike = interactiveInfo.getHasLike()) == null) {
            return;
        }
        boolean zBooleanValue = hasLike.booleanValue();
        interactiveInfo.setHasLike(Boolean.valueOf(!zBooleanValue));
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo2 = uGCVideo.getInteractiveInfo();
        interactiveInfo.setLikeNum(String.valueOf(((interactiveInfo2 == null || (likeNum = interactiveInfo2.getLikeNum()) == null) ? 0L : Long.parseLong(likeNum)) + ((long) (zBooleanValue ? -1 : 1))));
        this.f62510l.mo14858q(Boolean.valueOf(!zBooleanValue));
        ShortTvExtKt.m81310m(!zBooleanValue ? R$string.short_tv_liked : R$string.short_tv_liked_removed);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$like$1(this, ugcVideoId, zBooleanValue, null), 3, null);
    }

    /* JADX INFO: renamed from: W */
    public final void m81411W(Context context) {
        Intrinsics.m97802h(context, "context");
    }

    /* JADX INFO: renamed from: X */
    public final void m81412X() {
        this.f62504f.mo14858q(this.f62503e.m14847f());
    }

    /* JADX INFO: renamed from: Y */
    public final InterfaceC25204t1 m81413Y(String str, String str2, String str3) {
        return AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$requestFirstVideo$1(str, this, str3, str2, null), 3, null);
    }

    /* JADX INFO: renamed from: Z */
    public final void m81414Z(String str, int i11, int i12) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), this.f62500b, null, new ShortTvViewModel$requestVideoCollection$1(str, i11, i12, this, null), 2, null);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m81415b0(ShorttvModel.UGCVideo uGCVideo, long j11) {
        if (uGCVideo == null) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvViewModel$saveHistory$1(this, uGCVideo, j11, null), 2, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m81416c0(int i11) {
        Iterator it = this.f62492F.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((ShorttvModel.UGCVideo) it.next()).getEp() == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0 || this.f62503e.m14847f() == null) {
            Integer num = (Integer) this.f62503e.m14847f();
            if (num != null && i11 == num.intValue()) {
                return;
            }
            this.f62503e.mo14855n(Integer.valueOf(i11));
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "scrollToEp：" + i11 + " 当前不存在该集", false, 4, null);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m81417d0(String str) {
        this.f62498L = str;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m81418e0(String str) {
        this.f62494H = str;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m81419f0(List list) {
        this.f62495I = list;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m81420g0(String str) {
        this.f62496J = str;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m81421h0(boolean z11) {
        this.f62497K = z11;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m81422i0(ShorttvModel.UGCVideo uGCVideo) {
    }

    /* JADX INFO: renamed from: m */
    public final void m81423m() {
        this.f62516r.mo14858q(null);
    }

    /* JADX INFO: renamed from: n */
    public final void m81424n(ShorttvModel.UGCVideo uGCVideo) {
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo;
        Boolean hasFavorite;
        String favoriteNum;
        if (uGCVideo == null || (interactiveInfo = uGCVideo.getInteractiveInfo()) == null || (hasFavorite = interactiveInfo.getHasFavorite()) == null) {
            return;
        }
        boolean zBooleanValue = hasFavorite.booleanValue();
        String ugcVideoId = uGCVideo.getUgcVideoId();
        if (ugcVideoId == null) {
            return;
        }
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo2 = uGCVideo.getInteractiveInfo();
        if (interactiveInfo2 != null) {
            interactiveInfo2.setHasFavorite(Boolean.valueOf(!zBooleanValue));
        }
        ShorttvModel.UGCVideoInteractiveInfo interactiveInfo3 = uGCVideo.getInteractiveInfo();
        if (interactiveInfo3 != null) {
            ShorttvModel.UGCVideoInteractiveInfo interactiveInfo4 = uGCVideo.getInteractiveInfo();
            interactiveInfo3.setFavoriteNum(String.valueOf(((interactiveInfo4 == null || (favoriteNum = interactiveInfo4.getFavoriteNum()) == null) ? 0L : Long.parseLong(favoriteNum)) + ((long) (zBooleanValue ? -1 : 1))));
        }
        this.f62506h.mo14858q(Boolean.valueOf(!zBooleanValue));
        ShortTvExtKt.m81310m(!zBooleanValue ? R$string.short_tv_favorite : R$string.short_tv_favorite_removed);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$favorite$1(this, ugcVideoId, zBooleanValue, null), 3, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m81425o(ShorttvModel.UGCVideo uGCVideo) {
        ShorttvModel.UGCVideoCreator creator;
        String uid;
        Boolean hasSubscribe;
        if (uGCVideo == null || (creator = uGCVideo.getCreator()) == null || (uid = creator.getUid()) == null || (hasSubscribe = creator.getHasSubscribe()) == null) {
            return;
        }
        boolean zBooleanValue = hasSubscribe.booleanValue();
        creator.setHasSubscribe(Boolean.valueOf(!zBooleanValue));
        this.f62508j.mo14858q(Boolean.valueOf(!zBooleanValue));
        ShortTvExtKt.m81310m(!zBooleanValue ? R$string.short_tv_subscribe : R$string.short_tv_unsubscribe);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvViewModel$follow$1(this, uid, zBooleanValue, null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    public final List m81426p() {
        return this.f62492F;
    }

    /* JADX INFO: renamed from: q */
    public final String m81427q() {
        return this.f62498L;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m81428q0(boolean z11) {
        this.f62514p.mo14858q(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: r */
    public final String m81429r() {
        return this.f62494H;
    }

    /* JADX INFO: renamed from: s */
    public final C3187b0 m81430s() {
        return this.f62503e;
    }

    /* JADX INFO: renamed from: t */
    public final ShorttvModel.UGCVideo m81431t() {
        Integer num = (Integer) this.f62503e.m14847f();
        if (num == null) {
            return null;
        }
        return (ShorttvModel.UGCVideo) this.f62492F.get(ShortTvExtKt.m81301d(num.intValue()));
    }

    /* JADX INFO: renamed from: u */
    public final LiveData m81432u() {
        return this.f62521w;
    }

    /* JADX INFO: renamed from: v */
    public final List m81433v() {
        return this.f62495I;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m81434w(String str, Continuation continuation) throws Throwable {
        ShortTvViewModel$getDownloadVideo$1 shortTvViewModel$getDownloadVideo$1;
        if (continuation instanceof ShortTvViewModel$getDownloadVideo$1) {
            shortTvViewModel$getDownloadVideo$1 = (ShortTvViewModel$getDownloadVideo$1) continuation;
            int i11 = shortTvViewModel$getDownloadVideo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                shortTvViewModel$getDownloadVideo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                shortTvViewModel$getDownloadVideo$1 = new ShortTvViewModel$getDownloadVideo$1(this, continuation);
            }
        } else {
            shortTvViewModel$getDownloadVideo$1 = new ShortTvViewModel$getDownloadVideo$1(this, continuation);
        }
        Object objMo73793e = shortTvViewModel$getDownloadVideo$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = shortTvViewModel$getDownloadVideo$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(objMo73793e);
            InterfaceC28658c interfaceC28658cM81400L = m81400L();
            if (interfaceC28658cM81400L != null) {
                shortTvViewModel$getDownloadVideo$1.label = 1;
                objMo73793e = interfaceC28658cM81400L.mo73793e(str, shortTvViewModel$getDownloadVideo$1);
                if (objMo73793e == objF) {
                    return objF;
                }
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(objMo73793e);
        ShorttvModel.UGCVideo uGCVideo = (ShorttvModel.UGCVideo) objMo73793e;
        if (uGCVideo != null) {
            List list = this.f62495I;
            if (list == null) {
                return uGCVideo;
            }
            Boxing.m97631a(list.add(uGCVideo));
            return uGCVideo;
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final C3187b0 m81435x() {
        return this.f62502d;
    }

    /* JADX INFO: renamed from: y */
    public final LiveData m81436y() {
        return this.f62507i;
    }

    /* JADX INFO: renamed from: z */
    public final List m81437z() {
        return this.f62493G;
    }
}
