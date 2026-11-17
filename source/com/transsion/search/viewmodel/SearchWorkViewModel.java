package com.transsion.search.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchWorkViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: e */
    private int f60027e;

    /* JADX INFO: renamed from: a */
    private boolean f60023a = true;

    /* JADX INFO: renamed from: b */
    private final C3187b0 f60024b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private final List f60025c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final Lazy f60026d = LazyKt.m97097b(new Function0() { // from class: com.transsion.search.viewmodel.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchWorkViewModel.m78101n();
        }
    });

    /* JADX INFO: renamed from: f */
    private int f60028f = 50;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final VideoDetailPlayDao m78099j() {
        return (VideoDetailPlayDao) this.f60026d.getValue();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m78100l(SearchWorkViewModel searchWorkViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        searchWorkViewModel.m78105k(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final VideoDetailPlayDao m78101n() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m78102g() {
        return this.f60023a;
    }

    /* JADX INFO: renamed from: h */
    public final C3187b0 m78103h() {
        return this.f60024b;
    }

    /* JADX INFO: renamed from: i */
    public final int m78104i() {
        return this.f60027e;
    }

    /* JADX INFO: renamed from: k */
    public final void m78105k(boolean z11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new SearchWorkViewModel$getVideoHistoryList$1(z11, this, null), 2, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m78106m(int i11) {
        this.f60027e = i11;
    }
}
