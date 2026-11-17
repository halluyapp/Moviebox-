package com.transsion.postdetail.viewmodel;

import android.util.Log;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.moviedetailapi.bean.Subject;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p743rh.C27287m;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import p978zg.C29182a;
import sy.InterfaceC27663a;

/* JADX INFO: loaded from: classes6.dex */
public final class LocalVideoDetailViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final String f57862a = "LocalVideoViewModel";

    /* JADX INFO: renamed from: b */
    private final Lazy f57863b = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalVideoDetailViewModel.m75007k();
        }
    });

    /* JADX INFO: renamed from: c */
    private C3187b0 f57864c = new C3187b0();

    /* JADX INFO: renamed from: d */
    private C3187b0 f57865d = new C3187b0();

    /* JADX INFO: renamed from: e */
    private C3187b0 f57866e = new C3187b0();

    /* JADX INFO: renamed from: f */
    private final C3187b0 f57867f = new C3187b0();

    /* JADX INFO: renamed from: j */
    private final InterfaceC27663a m75006j() {
        return (InterfaceC27663a) this.f57863b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC27663a m75007k() {
        return (InterfaceC27663a) C22982c.f70163e.m91553a().m91552h(InterfaceC27663a.class);
    }

    /* JADX INFO: renamed from: d */
    public final void m75008d(String str) {
        if (str == null || str.length() == 0) {
            this.f57867f.mo14855n(null);
        } else if (C27287m.f83003a.m106330e()) {
            m75006j().m107615h(C29182a.f89053a.m111992a(), str).m95079f(C28365d.f87067a.m109702c()).subscribe(new AbstractC28362a() { // from class: com.transsion.postdetail.viewmodel.LocalVideoDetailViewModel$fetchMovieData$1
                @Override // p871wg.AbstractC28362a
                /* JADX INFO: renamed from: a */
                public void mo66457a(String str2, String str3) {
                    this.f57868d.m75011g().mo14855n(null);
                    Log.e(this.f57868d.f57862a, "message:" + str3);
                }

                @Override // p871wg.AbstractC28362a
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void mo66458c(Subject subject) {
                    AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this.f57868d), null, null, new LocalVideoDetailViewModel$fetchMovieData$1$onSuccess$1(this.f57868d, subject, null), 3, null);
                }

                @Override // p871wg.AbstractC28362a, io.reactivex.rxjava3.core.InterfaceC24098o
                public void onSubscribe(InterfaceC24104c d11) {
                    Intrinsics.m97802h(d11, "d");
                    super.onSubscribe(d11);
                }
            });
        } else {
            this.f57867f.mo14855n(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m75009e() {
        return this.f57865d;
    }

    /* JADX INFO: renamed from: f */
    public final C3187b0 m75010f() {
        return this.f57866e;
    }

    /* JADX INFO: renamed from: g */
    public final C3187b0 m75011g() {
        return this.f57867f;
    }

    /* JADX INFO: renamed from: h */
    public final void m75012h(DownloadBean downloadBean) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new LocalVideoDetailViewModel$getSeriesFromLocal$1(downloadBean, this, null), 2, null);
    }

    /* JADX INFO: renamed from: i */
    public final C3187b0 m75013i() {
        return this.f57864c;
    }
}
