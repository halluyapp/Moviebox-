package com.transsion.home.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.home.bean.CategoryBean;
import com.transsion.moviedetailapi.bean.CategoryItemBean;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import sl.InterfaceC27628b;

/* JADX INFO: loaded from: classes5.dex */
public final class CategoryViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private int f53625b;

    /* JADX INFO: renamed from: c */
    private int f53626c;

    /* JADX INFO: renamed from: d */
    private final Lazy f53627d;

    /* JADX INFO: renamed from: e */
    private final Lazy f53628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f53625b = 1;
        this.f53626c = 10;
        this.f53627d = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CategoryViewModel.m68904n();
            }
        });
        this.f53628e = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.viewmodel.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CategoryViewModel.m68901h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C3187b0 m68901h() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC27628b m68902l() {
        return (InterfaceC27628b) this.f53627d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m68903m(CategoryBean categoryBean) {
        List<CategoryItemBean> list;
        if (categoryBean == null || (list = categoryBean.getList()) == null) {
            return;
        }
        for (CategoryItemBean categoryItemBean : list) {
            Subject subject = categoryItemBean.getSubject();
            String ops = subject != null ? subject.getOps() : null;
            if (ops == null || ops.length() == 0) {
                Subject subject2 = categoryItemBean.getSubject();
                if (subject2 != null) {
                    subject2.setOps(categoryBean.getOps());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC27628b m68904n() {
        return (InterfaceC27628b) C22982c.f70163e.m91553a().m91552h(InterfaceC27628b.class);
    }

    /* JADX INFO: renamed from: i */
    public final void m68905i(String type) {
        Intrinsics.m97802h(type, "type");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new CategoryViewModel$getCategoryList$1(type, this, null), 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m68906j() {
        return (C3187b0) this.f53628e.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final int m68907k() {
        return this.f53625b;
    }

    /* JADX INFO: renamed from: o */
    public final void m68908o(int i11) {
        this.f53625b = i11;
    }
}
