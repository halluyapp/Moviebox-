package com.transsion.home.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import sl.InterfaceC27629c;

/* JADX INFO: loaded from: classes.dex */
public final class MovieViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: f */
    public static final C15539a f53647f = new C15539a(null);

    /* JADX INFO: renamed from: g */
    public static final int f53648g = 8;

    /* JADX INFO: renamed from: b */
    private final Lazy f53649b;

    /* JADX INFO: renamed from: c */
    private final Lazy f53650c;

    /* JADX INFO: renamed from: d */
    private final Lazy f53651d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC27629c f53652e;

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.MovieViewModel$a */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15539a {
        private C15539a() {
        }

        public /* synthetic */ C15539a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f53649b = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieViewModel.m68953g();
            }
        });
        this.f53650c = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieViewModel.m68954o();
            }
        });
        this.f53651d = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MovieViewModel.m68955p();
            }
        });
        this.f53652e = (InterfaceC27629c) C22982c.f70163e.m91553a().m91552h(InterfaceC27629c.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C3187b0 m68953g() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C3187b0 m68954o() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C3187b0 m68955p() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: h */
    public final void m68956h(Integer num, String version) {
        Intrinsics.m97802h(version, "version");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new MovieViewModel$getFilterItems$1(this, num, version, null), 2, null);
    }

    /* JADX INFO: renamed from: i */
    public final LiveData m68957i() {
        return m68958j();
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m68958j() {
        return (C3187b0) this.f53649b.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m68959k(int i11, int i12, String str, Map map, boolean z11) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("page", Integer.valueOf(i11));
        jsonObject.addProperty("perPage", Integer.valueOf(i12));
        jsonObject.addProperty(TmcStartParams.KEY_CHANNEL_ID, str);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (StringsKt.m98132c0((CharSequence) entry.getValue(), ",", false, 2, null)) {
                    JsonArray jsonArray = new JsonArray();
                    Iterator it = StringsKt.m98117S0((CharSequence) entry.getValue(), new String[]{","}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        jsonArray.add((String) it.next());
                    }
                    jsonObject.add((String) entry.getKey(), jsonArray);
                } else {
                    jsonObject.addProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new MovieViewModel$getMovieList$2(jsonObject, this, z11, str, map, null), 2, null);
    }

    /* JADX INFO: renamed from: l */
    public final LiveData m68960l() {
        return m68961m();
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m68961m() {
        return (C3187b0) this.f53650c.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final C3187b0 m68962n() {
        return (C3187b0) this.f53651d.getValue();
    }
}
