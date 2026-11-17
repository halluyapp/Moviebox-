package com.transsion.publish.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.place.PlaceDao;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import np.InterfaceC26076a;
import p349dh.C22982c;

/* JADX INFO: loaded from: classes6.dex */
public final class LocationPlaceViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final Lazy f58432a = LazyKt.m97097b(new Function0() { // from class: com.transsion.publish.viewmodel.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocationPlaceViewModel.m75701q();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f58433b = LazyKt.m97097b(new Function0() { // from class: com.transsion.publish.viewmodel.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocationPlaceViewModel.m75700p();
        }
    });

    /* JADX INFO: renamed from: c */
    private final C3187b0 f58434c = new C3187b0();

    /* JADX INFO: renamed from: d */
    private final C3187b0 f58435d = new C3187b0();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final PlaceDao m75698m() {
        return (PlaceDao) this.f58433b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC26076a m75699n() {
        return (InterfaceC26076a) this.f58432a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final PlaceDao m75700p() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64873t1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC26076a m75701q() {
        return (InterfaceC26076a) C22982c.f70163e.m91553a().m91552h(InterfaceC26076a.class);
    }

    /* JADX INFO: renamed from: h */
    public final void m75702h() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new LocationPlaceViewModel$clearCache$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m75703i() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new LocationPlaceViewModel$getCache$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m75704j() {
        return this.f58435d;
    }

    /* JADX INFO: renamed from: k */
    public final void m75705k(Double d11, Double d12) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new LocationPlaceViewModel$getLocationPlaceList$1(this, d11, d12, null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m75706l() {
        return this.f58434c;
    }

    /* JADX INFO: renamed from: o */
    public final void m75707o(List list) {
        Intrinsics.m97802h(list, "list");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new LocationPlaceViewModel$insertCache$1(list, this, null), 2, null);
    }
}
