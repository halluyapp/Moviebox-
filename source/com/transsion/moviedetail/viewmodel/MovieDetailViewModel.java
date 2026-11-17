package com.transsion.moviedetail.viewmodel;

import android.app.Application;
import android.text.SpannableStringBuilder;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.cloud.tmc.integration.event.EventConstants;
import com.google.gson.JsonObject;
import com.transsion.baselib.locale.C14468d;
import com.transsion.moviedetail.R$string;
import com.transsion.moviedetail.preload.C16114b;
import com.transsion.moviedetail.preload.MovieDetailDownloadListLoader;
import com.transsion.moviedetail.preload.MovieDetailResourcesSeasonLoader;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p523jn.InterfaceC24449a;
import p843vm.AbstractC28132b;
import p843vm.C28135e;
import sy.InterfaceC27663a;

/* JADX INFO: loaded from: classes6.dex */
public final class MovieDetailViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: r */
    public static final C16185a f54970r = new C16185a(null);

    /* JADX INFO: renamed from: b */
    private final Lazy f54971b;

    /* JADX INFO: renamed from: c */
    private final Lazy f54972c;

    /* JADX INFO: renamed from: d */
    private final Lazy f54973d;

    /* JADX INFO: renamed from: e */
    private final Lazy f54974e;

    /* JADX INFO: renamed from: f */
    private final Lazy f54975f;

    /* JADX INFO: renamed from: g */
    private final Lazy f54976g;

    /* JADX INFO: renamed from: h */
    private final Lazy f54977h;

    /* JADX INFO: renamed from: i */
    private final Lazy f54978i;

    /* JADX INFO: renamed from: j */
    private final C3187b0 f54979j;

    /* JADX INFO: renamed from: k */
    private final Lazy f54980k;

    /* JADX INFO: renamed from: l */
    private final C3187b0 f54981l;

    /* JADX INFO: renamed from: m */
    private C16114b f54982m;

    /* JADX INFO: renamed from: n */
    private MovieDetailDownloadListLoader f54983n;

    /* JADX INFO: renamed from: o */
    private MovieDetailResourcesSeasonLoader f54984o;

    /* JADX INFO: renamed from: p */
    private final Lazy f54985p;

    /* JADX INFO: renamed from: q */
    private boolean f54986q;

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.MovieDetailViewModel$a */
    public static final class C16185a {
        private C16185a() {
        }

        public /* synthetic */ C16185a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f54971b = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70904q();
            }
        });
        this.f54972c = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70885Z();
            }
        });
        this.f54973d = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70905r();
            }
        });
        this.f54974e = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70883X();
            }
        });
        this.f54975f = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.moviedetail.viewmodel.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70887b0();
            }
        });
        this.f54976g = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70886a0();
            }
        });
        this.f54977h = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70881U();
            }
        });
        this.f54978i = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70892e0();
            }
        });
        this.f54979j = new C3187b0();
        this.f54980k = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70884Y();
            }
        });
        this.f54981l = new C3187b0();
        this.f54985p = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.viewmodel.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieDetailViewModel.m70889c0();
            }
        });
    }

    /* JADX INFO: renamed from: C */
    private final Locale m70873C(String str) {
        Locale locale = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    locale = Intrinsics.m97797c(str, "in_id") ? new Locale("id") : new Locale(str);
                }
            } catch (Exception unused) {
            }
        }
        return locale;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m70874E(MovieDetailViewModel movieDetailViewModel, String str, Integer num, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        movieDetailViewModel.m70909D(str, num, z11);
    }

    /* JADX INFO: renamed from: G */
    private final C3187b0 m70875G() {
        return (C3187b0) this.f54977h.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final void m70876M(String str) {
        MovieDetailResourcesSeasonLoader movieDetailResourcesSeasonLoader = this.f54984o;
        if (movieDetailResourcesSeasonLoader != null) {
            if (str == null) {
                str = "";
            }
            movieDetailResourcesSeasonLoader.m70656p(str);
        }
        MovieDetailResourcesSeasonLoader movieDetailResourcesSeasonLoader2 = this.f54984o;
        if (movieDetailResourcesSeasonLoader2 != null) {
            movieDetailResourcesSeasonLoader2.m109262f(m70915L());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final InterfaceC24449a m70877N() {
        return (InterfaceC24449a) this.f54975f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final InterfaceC27663a m70878O() {
        return (InterfaceC27663a) this.f54976g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final C3187b0 m70879R() {
        return (C3187b0) this.f54978i.getValue();
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m70880T(MovieDetailViewModel movieDetailViewModel, int i11, String str, Integer num, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        movieDetailViewModel.m70918S(i11, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C3187b0 m70881U() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m70882W(MovieDetailViewModel movieDetailViewModel, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        movieDetailViewModel.m70919V(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C3187b0 m70883X() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C3187b0 m70884Y() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C3187b0 m70885Z() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC27663a m70886a0() {
        return (InterfaceC27663a) C22982c.f70163e.m91553a().m91552h(InterfaceC27663a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final InterfaceC24449a m70887b0() {
        return (InterfaceC24449a) C22982c.f70163e.m91553a().m91552h(InterfaceC24449a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C3187b0 m70889c0() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C3187b0 m70892e0() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C3187b0 m70904q() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C3187b0 m70905r() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m70906u(MovieDetailViewModel movieDetailViewModel, String str, Integer num, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        movieDetailViewModel.m70922t(str, num, i11, z11);
    }

    /* JADX INFO: renamed from: A */
    public final LiveData m70907A() {
        return this.f54979j;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m70908B() {
        return this.f54986q;
    }

    /* JADX INFO: renamed from: D */
    public final void m70909D(String subjectId, Integer num, boolean z11) {
        Intrinsics.m97802h(subjectId, "subjectId");
        C16114b c16114b = this.f54982m;
        if (c16114b != null) {
            c16114b.m70664q(subjectId);
        }
        C16114b c16114b2 = this.f54982m;
        if (c16114b2 != null) {
            c16114b2.m70663p(num);
        }
        C16114b c16114b3 = this.f54982m;
        if (c16114b3 != null) {
            c16114b3.m70662o(z11);
        }
        C16114b c16114b4 = this.f54982m;
        if (c16114b4 != null) {
            c16114b4.m109262f(m70875G());
        }
    }

    /* JADX INFO: renamed from: F */
    public final LiveData m70910F() {
        return m70875G();
    }

    /* JADX INFO: renamed from: H */
    public final C3187b0 m70911H() {
        return this.f54981l;
    }

    /* JADX INFO: renamed from: I */
    public final C3187b0 m70912I() {
        return (C3187b0) this.f54974e.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final void m70913J() {
        this.f54986q = true;
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MovieDetailViewModel$getRoomPostEntrance$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: K */
    public final C3187b0 m70914K() {
        return (C3187b0) this.f54980k.getValue();
    }

    /* JADX INFO: renamed from: L */
    public final C3187b0 m70915L() {
        return (C3187b0) this.f54972c.getValue();
    }

    /* JADX INFO: renamed from: P */
    public final C3187b0 m70916P() {
        return (C3187b0) this.f54985p.getValue();
    }

    /* JADX INFO: renamed from: Q */
    public final LiveData m70917Q() {
        return m70879R();
    }

    /* JADX INFO: renamed from: S */
    public final void m70918S(int i11, String subjectId, Integer num) {
        AbstractC28132b abstractC28132b;
        AbstractC28132b abstractC28132b2;
        Object next;
        Object next2;
        Intrinsics.m97802h(subjectId, "subjectId");
        List listM109266a = C28135e.f86323a.m109266a(i11);
        Object obj = null;
        if (listM109266a != null) {
            Iterator it = listM109266a.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!(((AbstractC28132b) next2) instanceof C16114b));
            abstractC28132b = (AbstractC28132b) next2;
        } else {
            abstractC28132b = null;
        }
        C16114b c16114b = (C16114b) abstractC28132b;
        if (c16114b == null) {
            c16114b = new C16114b(subjectId, num, false, 4, null);
        }
        this.f54982m = c16114b;
        if (listM109266a != null) {
            Iterator it2 = listM109266a.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((AbstractC28132b) next) instanceof MovieDetailDownloadListLoader));
            abstractC28132b2 = (AbstractC28132b) next;
        } else {
            abstractC28132b2 = null;
        }
        MovieDetailDownloadListLoader movieDetailDownloadListLoader = (MovieDetailDownloadListLoader) abstractC28132b2;
        if (movieDetailDownloadListLoader == null) {
            movieDetailDownloadListLoader = new MovieDetailDownloadListLoader(subjectId);
        }
        this.f54983n = movieDetailDownloadListLoader;
        if (listM109266a != null) {
            for (Object obj2 : listM109266a) {
                if (((AbstractC28132b) obj2) instanceof MovieDetailResourcesSeasonLoader) {
                    obj = obj2;
                    break;
                }
            }
            obj = (AbstractC28132b) obj;
        }
        MovieDetailResourcesSeasonLoader movieDetailResourcesSeasonLoader = (MovieDetailResourcesSeasonLoader) obj;
        if (movieDetailResourcesSeasonLoader == null) {
            movieDetailResourcesSeasonLoader = new MovieDetailResourcesSeasonLoader(subjectId);
        }
        this.f54984o = movieDetailResourcesSeasonLoader;
        m70876M(subjectId);
        m70927z(subjectId);
    }

    /* JADX INFO: renamed from: V */
    public final void m70919V(String str, boolean z11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MovieDetailViewModel$postRequestResource$1(str, z11, this, null), 3, null);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m70920d0(String subjectId, int i11) {
        Intrinsics.m97802h(subjectId, "subjectId");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("subjectId", subjectId);
        jsonObject.addProperty(EventConstants.KEY_ACTION, Integer.valueOf(i11));
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MovieDetailViewModel$wantToSee$1(jsonObject, this, null), 3, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m70921s(boolean z11, String str, Integer num, int i11, boolean z12) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new MovieDetailViewModel$fetchLocalRec$1(z11, str, num, i11, z12, this, null), 2, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m70922t(String str, Integer num, int i11, boolean z11) {
        if (str == null || str.length() == 0) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new MovieDetailViewModel$fetchRec$1(str, num, i11, z11, this, null), 2, null);
    }

    /* JADX INFO: renamed from: v */
    public final CharSequence m70923v(String str) {
        List listS0;
        List listU0 = (str == null || (listS0 = StringsKt.m98117S0(str, new String[]{","}, false, 0, 6, null)) == null) ? null : CollectionsKt.m97343U0(listS0);
        List list = listU0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        C14468d.b bVar = C14468d.f50894f;
        Locale localeM65212l = bVar.m65224e().m65212l();
        Locale localeM65211k = bVar.m65224e().m65211k();
        int i11 = -1;
        int i12 = 0;
        if (Intrinsics.m97797c(localeM65212l, localeM65211k)) {
            Iterator it = listU0.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                Locale localeM70873C = m70873C((String) it.next());
                if (Intrinsics.m97797c(localeM70873C != null ? localeM70873C.getLanguage() : null, localeM65212l != null ? localeM65212l.getLanguage() : null)) {
                    i11 = i13;
                    break;
                }
                i13++;
            }
            if (i11 > 0) {
                listU0.add(0, listU0.remove(i11));
            }
        } else {
            Iterator it2 = listU0.iterator();
            int i14 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i14 = -1;
                    break;
                }
                Locale localeM70873C2 = m70873C((String) it2.next());
                if (Intrinsics.m97797c(localeM70873C2 != null ? localeM70873C2.getLanguage() : null, localeM65211k != null ? localeM65211k.getLanguage() : null)) {
                    break;
                }
                i14++;
            }
            if (i14 > 0) {
                listU0.add(0, listU0.remove(i14));
            }
            Iterator it3 = listU0.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                Locale localeM70873C3 = m70873C((String) it3.next());
                if (Intrinsics.m97797c(localeM70873C3 != null ? localeM70873C3.getLanguage() : null, localeM65212l != null ? localeM65212l.getLanguage() : null)) {
                    i11 = i15;
                    break;
                }
                i15++;
            }
            if (i11 > 0) {
                listU0.add(0, listU0.remove(i11));
            }
        }
        Application applicationM14886b = m14886b();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) applicationM14886b.getString(R$string.movie_detail_subtitles));
        spannableStringBuilder.append((CharSequence) " ");
        for (Object obj : listU0) {
            int i16 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.m97515u();
            }
            spannableStringBuilder.append((CharSequence) obj);
            if (i12 != listU0.size() - 1) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            i12 = i16;
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: w */
    public final C3187b0 m70924w() {
        return (C3187b0) this.f54973d.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final void m70925x(String str, int i11, int i12, int i13, int i14) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MovieDetailViewModel$getDownloadList$1(this, str, i14, i11, i12, i13, null), 3, null);
    }

    /* JADX INFO: renamed from: y */
    public final C3187b0 m70926y() {
        return (C3187b0) this.f54971b.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final void m70927z(String str) {
        MovieDetailDownloadListLoader movieDetailDownloadListLoader = this.f54983n;
        if (movieDetailDownloadListLoader != null) {
            if (str == null) {
                str = "";
            }
            movieDetailDownloadListLoader.m70649p(str);
        }
        MovieDetailDownloadListLoader movieDetailDownloadListLoader2 = this.f54983n;
        if (movieDetailDownloadListLoader2 != null) {
            movieDetailDownloadListLoader2.m109262f(m70926y());
        }
    }
}
