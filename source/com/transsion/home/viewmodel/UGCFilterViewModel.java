package com.transsion.home.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.home.bean.ugc.UGCFilterItem;
import com.transsion.home.bean.ugc.UGCFilterResponse;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import sl.InterfaceC27629c;

/* JADX INFO: loaded from: classes5.dex */
public final class UGCFilterViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: f */
    public static final C15546a f53702f = new C15546a(null);

    /* JADX INFO: renamed from: g */
    public static final int f53703g = 8;

    /* JADX INFO: renamed from: b */
    private final Lazy f53704b;

    /* JADX INFO: renamed from: c */
    private final Lazy f53705c;

    /* JADX INFO: renamed from: d */
    private final Lazy f53706d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC27629c f53707e;

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.UGCFilterViewModel$a */
    public static final class C15546a {
        private C15546a() {
        }

        public /* synthetic */ C15546a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCFilterViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f53704b = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCFilterViewModel.m69084g();
            }
        });
        this.f53705c = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCFilterViewModel.m69086q();
            }
        });
        this.f53706d = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCFilterViewModel.m69085p();
            }
        });
        this.f53707e = (InterfaceC27629c) C22982c.f70163e.m91553a().m91552h(InterfaceC27629c.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C3187b0 m69084g() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C3187b0 m69085p() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C3187b0 m69086q() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: h */
    public final UGCFilterItem m69087h(String str) {
        UGCFilterResponse uGCFilterResponse;
        BaseDto baseDto = (BaseDto) m69090k().m14847f();
        Object obj = null;
        List<UGCFilterItem> items = (baseDto == null || (uGCFilterResponse = (UGCFilterResponse) baseDto.getData()) == null) ? null : uGCFilterResponse.getItems();
        if (items == null) {
            return null;
        }
        for (Object obj2 : items) {
            if (Intrinsics.m97797c(((UGCFilterItem) obj2).getCategoryId(), str)) {
                obj = obj2;
                break;
            }
        }
        return (UGCFilterItem) obj;
    }

    /* JADX INFO: renamed from: i */
    public final void m69088i(String category) {
        Intrinsics.m97802h(category, "category");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new UGCFilterViewModel$getFilterItems$1(category, this, null), 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final LiveData m69089j() {
        return m69090k();
    }

    /* JADX INFO: renamed from: k */
    public final C3187b0 m69090k() {
        return (C3187b0) this.f53704b.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m69091l() {
        return (C3187b0) this.f53706d.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m69092m(String category, int i11, int i12, String str, Integer num, Integer num2, Integer num3, String str2, boolean z11) {
        Intrinsics.m97802h(category, "category");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new UGCFilterViewModel$getUGCContentList$1(category.length() == 0 ? "Education" : category, i11, str, num, num2, num3, z11, this, i12, str2, null), 2, null);
    }

    /* JADX INFO: renamed from: n */
    public final LiveData m69093n() {
        return m69094o();
    }

    /* JADX INFO: renamed from: o */
    public final C3187b0 m69094o() {
        return (C3187b0) this.f53705c.getValue();
    }
}
