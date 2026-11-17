package com.transsion.shorttv._channel.p312ui.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.shorttv._channel.model.ShortTvCategoryBean;
import com.transsion.shorttv._channel.model.ShortTvCategoryItemBean;
import com.transsion.shorttv.bean.Subject;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import sr.InterfaceC27643a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvCategoryViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private int f60458b;

    /* JADX INFO: renamed from: c */
    private int f60459c;

    /* JADX INFO: renamed from: d */
    private final Lazy f60460d;

    /* JADX INFO: renamed from: e */
    private final Lazy f60461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvCategoryViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f60458b = 1;
        this.f60459c = 10;
        this.f60460d = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv._channel.ui.viewmodel.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvCategoryViewModel.m78831n();
            }
        });
        this.f60461e = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv._channel.ui.viewmodel.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvCategoryViewModel.m78828h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C3187b0 m78828h() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC27643a m78829l() {
        return (InterfaceC27643a) this.f60460d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m78830m(ShortTvCategoryBean shortTvCategoryBean) {
        List<ShortTvCategoryItemBean> list;
        if (shortTvCategoryBean == null || (list = shortTvCategoryBean.getList()) == null) {
            return;
        }
        for (ShortTvCategoryItemBean shortTvCategoryItemBean : list) {
            Subject subject = shortTvCategoryItemBean.getSubject();
            String ops = subject != null ? subject.getOps() : null;
            if (ops == null || ops.length() == 0) {
                Subject subject2 = shortTvCategoryItemBean.getSubject();
                if (subject2 != null) {
                    subject2.setOps(shortTvCategoryBean.getOps());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC27643a m78831n() {
        return (InterfaceC27643a) C22982c.f70163e.m91553a().m91552h(InterfaceC27643a.class);
    }

    /* JADX INFO: renamed from: i */
    public final void m78832i(String type) {
        Intrinsics.m97802h(type, "type");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new ShortTvCategoryViewModel$getCategoryList$1(type, this, null), 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m78833j() {
        return (C3187b0) this.f60461e.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final int m78834k() {
        return this.f60458b;
    }

    /* JADX INFO: renamed from: o */
    public final void m78835o(int i11) {
        this.f60458b = i11;
    }
}
