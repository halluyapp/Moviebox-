package com.transsion.shorttv._channel.p312ui.viewmodel;

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
import sr.InterfaceC27643a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvMovieViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: f */
    public static final C18725a f60462f = new C18725a(null);

    /* JADX INFO: renamed from: b */
    private final Lazy f60463b;

    /* JADX INFO: renamed from: c */
    private final Lazy f60464c;

    /* JADX INFO: renamed from: d */
    private final Lazy f60465d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC27643a f60466e;

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.viewmodel.ShortTvMovieViewModel$a */
    public static final class C18725a {
        private C18725a() {
        }

        public /* synthetic */ C18725a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvMovieViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f60463b = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv._channel.ui.viewmodel.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvMovieViewModel.m78840g();
            }
        });
        this.f60464c = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv._channel.ui.viewmodel.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvMovieViewModel.m78841n();
            }
        });
        this.f60465d = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv._channel.ui.viewmodel.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvMovieViewModel.m78842o();
            }
        });
        this.f60466e = (InterfaceC27643a) C22982c.f70163e.m91553a().m91552h(InterfaceC27643a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C3187b0 m78840g() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C3187b0 m78841n() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C3187b0 m78842o() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: h */
    public final void m78843h(String version) {
        Intrinsics.m97802h(version, "version");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvMovieViewModel$getFilterItems$1(this, version, null), 2, null);
    }

    /* JADX INFO: renamed from: i */
    public final LiveData m78844i() {
        return m78845j();
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m78845j() {
        return (C3187b0) this.f60463b.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m78846k(int i11, int i12, String str, Map map, boolean z11) {
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
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvMovieViewModel$getMovieList$2(jsonObject, this, z11, str, map, null), 2, null);
    }

    /* JADX INFO: renamed from: l */
    public final LiveData m78847l() {
        return m78848m();
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m78848m() {
        return (C3187b0) this.f60464c.getValue();
    }
}
