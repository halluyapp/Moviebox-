package com.transsion.postdetail.shorttv.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.ShortTVPlayDao;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p349dh.C22982c;
import p985zo.InterfaceC29209b;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTVContentViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f56793b;

    /* JADX INFO: renamed from: c */
    private final Lazy f56794c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f56795d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f56796e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f56797f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f56798g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f56799h;

    /* JADX INFO: renamed from: i */
    private final C3187b0 f56800i;

    /* JADX INFO: renamed from: j */
    private final Lazy f56801j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTVContentViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f56793b = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.shorttv.viewmodel.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTVContentViewModel.m73737m();
            }
        });
        this.f56794c = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.shorttv.viewmodel.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTVContentViewModel.m73738n();
            }
        });
        this.f56795d = new C3187b0();
        this.f56796e = new C3187b0();
        this.f56797f = new C3187b0();
        this.f56798g = new C3187b0();
        this.f56799h = new C3187b0();
        this.f56800i = new C3187b0();
        this.f56801j = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.shorttv.viewmodel.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTVContentViewModel.m73735g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final InterfaceC25149n0 m73735g() {
        return AbstractC25153o0.m99079a(C25220y0.m99268b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC29209b m73736k() {
        return (InterfaceC29209b) this.f56793b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC29209b m73737m() {
        return (InterfaceC29209b) C22982c.f70163e.m91553a().m91552h(InterfaceC29209b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final ShortTVPlayDao m73738n() {
        Application applicationM27275a = Utils.m27275a();
        if (applicationM27275a != null) {
            return AppDatabase.INSTANCE.m64881b(applicationM27275a).mo64875v1();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final C3187b0 m73739h() {
        return this.f56797f;
    }

    /* JADX INFO: renamed from: i */
    public final C3187b0 m73740i() {
        return this.f56798g;
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m73741j() {
        return this.f56800i;
    }

    /* JADX INFO: renamed from: l */
    public final void m73742l(String nextPage, int i11, boolean z11) {
        Intrinsics.m97802h(nextPage, "nextPage");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ShortTVContentViewModel$getShortTVFavoriteList$1(this, nextPage, i11, z11, null), 3, null);
    }
}
