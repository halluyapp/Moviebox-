package com.transsion.shorttv.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.Utils;
import com.transsion.shorttv.bean.ShortTVFavInfo;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p314db.ShortTvAdUnlockDao;
import com.transsion.shorttv.p314db.ShortTvDatabase;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p659os.C26718d;
import p790ts.InterfaceC27847a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvDownloadViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: k */
    public static final C19171a f61585k = new C19171a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f61586a = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvDownloadViewModel.m80264u();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f61587b = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.viewmodel.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvDownloadViewModel.m80260f(this.f61660a);
        }
    });

    /* JADX INFO: renamed from: c */
    private final C3187b0 f61588c = new C3187b0();

    /* JADX INFO: renamed from: d */
    private final C3187b0 f61589d = new C3187b0();

    /* JADX INFO: renamed from: e */
    private final C3187b0 f61590e = new C3187b0();

    /* JADX INFO: renamed from: f */
    private final C3187b0 f61591f = new C3187b0();

    /* JADX INFO: renamed from: g */
    private final C3187b0 f61592g = new C3187b0();

    /* JADX INFO: renamed from: h */
    private final C3187b0 f61593h = new C3187b0();

    /* JADX INFO: renamed from: i */
    private final C3187b0 f61594i = new C3187b0();

    /* JADX INFO: renamed from: j */
    private final C3187b0 f61595j = new C3187b0();

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$a */
    public static final class C19171a {
        private C19171a() {
        }

        public /* synthetic */ C19171a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final ShortTvAdUnlockDao m80260f(ShortTvDownloadViewModel shortTvDownloadViewModel) {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ShortTvDatabase.Companion companion2 = ShortTvDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            objM112707constructorimpl = Result.m112707constructorimpl(companion2.m79351b(applicationM27275a).mo79348j0());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "ShortTvDownload", "adUnlockDao init failed: " + thM112710exceptionOrNullimpl, false, 4, null);
        }
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = null;
        }
        return (ShortTvAdUnlockDao) objM112707constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final ShortTvAdUnlockDao m80261h() {
        return (ShortTvAdUnlockDao) this.f61587b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC27847a m80262k() {
        return (InterfaceC27847a) this.f61586a.getValue();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m80263o(ShortTvDownloadViewModel shortTvDownloadViewModel, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        shortTvDownloadViewModel.m80270n(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC27847a m80264u() {
        return (InterfaceC27847a) C22982c.f70163e.m91553a().m91552h(InterfaceC27847a.class);
    }

    /* JADX INFO: renamed from: g */
    public final void m80265g(Subject subject) {
        ShortTVFavInfo shortTVFavInfo;
        if (subject == null || (shortTVFavInfo = subject.getShortTVFavInfo()) == null) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvDownloadViewModel$favorite$1(subject, shortTVFavInfo.getHasFavorite(), this, shortTVFavInfo, null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m80266i(String subjectId, int i11, int i12) {
        Intrinsics.m97802h(subjectId, "subjectId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvDownloadViewModel$getEpisodeList$1(this, subjectId, i11, i12, null), 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m80267j() {
        return this.f61595j;
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m80268l() {
        return this.f61593h;
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m80269m() {
        return this.f61592g;
    }

    /* JADX INFO: renamed from: n */
    public final void m80270n(String subjectId, boolean z11) {
        Intrinsics.m97802h(subjectId, "subjectId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvDownloadViewModel$getShortTvInfo$1(subjectId, this, z11, null), 2, null);
    }

    /* JADX INFO: renamed from: p */
    public final C3187b0 m80271p() {
        return this.f61594i;
    }

    /* JADX INFO: renamed from: q */
    public final C3187b0 m80272q() {
        return this.f61588c;
    }

    /* JADX INFO: renamed from: r */
    public final C3187b0 m80273r() {
        return this.f61589d;
    }

    /* JADX INFO: renamed from: s */
    public final void m80274s(int i11) {
        Subject subject = (Subject) this.f61594i.m14847f();
        if (subject != null) {
            subject.setPaid(i11);
        }
        this.f61594i.mo14855n(subject);
    }

    /* JADX INFO: renamed from: t */
    public final void m80275t(String subjectId) {
        Set<Integer> adUnlockedEps;
        Intrinsics.m97802h(subjectId, "subjectId");
        C26866a.a aVar = C26866a.f81698a;
        Subject subject = (Subject) this.f61594i.m14847f();
        C26866a.a.m104905r(aVar, "ShortTvDownload", new String[]{"will saveAdUnlockedEps, eps: " + (subject != null ? subject.getAdUnlockedEps() : null)}, false, 4, null);
        Subject subject2 = (Subject) this.f61594i.m14847f();
        if (subject2 == null || (adUnlockedEps = subject2.getAdUnlockedEps()) == null || adUnlockedEps.isEmpty()) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTvDownloadViewModel$saveAdUnlockedEps$1(subjectId, adUnlockedEps, this, null), 3, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m80276v(C26718d item) {
        Intrinsics.m97802h(item, "item");
        Map linkedHashMap = (Map) this.f61588c.m14847f();
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (item.m104505d()) {
            linkedHashMap.remove(Integer.valueOf(item.m104503b()));
        } else {
            linkedHashMap.put(Integer.valueOf(item.m104503b()), item);
        }
        this.f61588c.mo14858q(linkedHashMap);
    }

    /* JADX INFO: renamed from: w */
    public final void m80277w(String str, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvDownloadViewModel$startDownloadResource$1(list, this, str, null), 2, null);
    }
}
