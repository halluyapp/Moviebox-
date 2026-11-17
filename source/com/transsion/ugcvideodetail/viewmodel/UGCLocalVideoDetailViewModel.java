package com.transsion.ugcvideodetail.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;

/* JADX INFO: loaded from: classes6.dex */
public final class UGCLocalVideoDetailViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: g */
    public static final C20355a f64498g = new C20355a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f64499a = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.viewmodel.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCLocalVideoDetailViewModel.m84219l();
        }
    });

    /* JADX INFO: renamed from: b */
    private final C3187b0 f64500b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private final C3187b0 f64501c = new C3187b0();

    /* JADX INFO: renamed from: d */
    private final C3187b0 f64502d = new C3187b0();

    /* JADX INFO: renamed from: e */
    private final C3187b0 f64503e;

    /* JADX INFO: renamed from: f */
    private final LiveData f64504f;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel$a */
    public static final class C20355a {
        private C20355a() {
        }

        public /* synthetic */ C20355a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UGCLocalVideoDetailViewModel() {
        C3187b0 c3187b0 = new C3187b0();
        this.f64503e = c3187b0;
        this.f64504f = c3187b0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final UGCVideoDetailPlayDao m84218g() {
        return (UGCVideoDetailPlayDao) this.f64499a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final UGCVideoDetailPlayDao m84219l() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64864A1();
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m84220e() {
        return this.f64501c;
    }

    /* JADX INFO: renamed from: f */
    public final C3187b0 m84221f() {
        return this.f64500b;
    }

    /* JADX INFO: renamed from: h */
    public final void m84222h(String resourceId) {
        Intrinsics.m97802h(resourceId, "resourceId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCLocalVideoDetailViewModel$getPlayInfo$1(resourceId, this, null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final C3187b0 m84223i() {
        return this.f64502d;
    }

    /* JADX INFO: renamed from: j */
    public final void m84224j(String resourceId) {
        Intrinsics.m97802h(resourceId, "resourceId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCLocalVideoDetailViewModel$getPlayList$1(resourceId, this, null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final LiveData m84225k() {
        return this.f64504f;
    }
}
