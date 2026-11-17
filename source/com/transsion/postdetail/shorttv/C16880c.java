package com.transsion.postdetail.shorttv;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import ck.AbstractC5114k;
import ck.C5123t;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.therouter.router.RouteItem;
import com.transsion.baselib.report.C14492k;
import com.transsion.moviedetailapi.SubjectType;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p410fg.InterfaceC23360b;
import p718qs.C27125a;
import p723qx.InterfaceC27138e;
import p981zj.AbstractC29189b;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv.c */
/* JADX INFO: loaded from: classes.dex */
public final class C16880c {

    /* JADX INFO: renamed from: a */
    public static final a f56765a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final Lazy f56766b = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.shorttv.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C16880c.m73622c();
        }
    });

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C16880c m73624a() {
            return (C16880c) C16880c.f56766b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C16880c m73622c() {
        return new C16880c();
    }

    /* JADX INFO: renamed from: d */
    public final void m73623d(RouteItem postcard, InterfaceC23360b callback) {
        Object next;
        Object objM112707constructorimpl;
        String localClassName;
        Intrinsics.m97802h(postcard, "postcard");
        Intrinsics.m97802h(callback, "callback");
        Iterator it = C14492k.f50955a.m65320m().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                localClassName = ((Activity) next).getLocalClassName();
                Intrinsics.m97801g(localClassName, "getLocalClassName(...)");
            }
        } while (!StringsKt.m98132c0(localClassName, "MainActivity", false, 2, null));
        Activity activityM65321o = (Activity) next;
        if (activityM65321o == null) {
            activityM65321o = C14492k.f50955a.m65321o();
        }
        if (!Intrinsics.m97797c(postcard.getPath(), "/movie/detail")) {
            if (!Intrinsics.m97797c(postcard.getPath(), "/video/detail")) {
                callback.mo61885a(postcard);
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                if (postcard.getExtras().getInt("subject_type", SubjectType.MOVIE.getValue()) == SubjectType.MUSIC.getValue()) {
                    if (activityM65321o != null && !activityM65321o.isDestroyed() && !activityM65321o.isFinishing()) {
                        Navigator.m61845x(AbstractC5114k.m23919b(TheRouter.m61773c("/playvideo/music_detail"), postcard.getExtras()), activityM65321o, null, 2, null);
                    }
                    AbstractC29189b.m112003a(callback);
                } else {
                    callback.mo61885a(postcard);
                }
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null) {
                return;
            }
            callback.mo61885a(postcard);
            return;
        }
        try {
            Bundle extras = postcard.getExtras();
            extras.putLong("ts_enter", SystemClock.elapsedRealtime());
            int i11 = extras.getInt("subject_type", SubjectType.MOVIE.getValue());
            boolean z11 = extras.getBoolean("without_intercept", false);
            InterfaceC27138e.b.m105607a(InterfaceC27138e.f82251a.m105606b(), false, 1, null);
            if (!z11 && i11 == SubjectType.SHORT_TV.getValue()) {
                if (activityM65321o != null && !activityM65321o.isDestroyed() && !activityM65321o.isFinishing()) {
                    Navigator.m61845x(AbstractC5114k.m23919b(TheRouter.m61773c(C27125a.f82236a.m105544b()), postcard.getExtras()), activityM65321o, null, 2, null);
                }
                AbstractC29189b.m112003a(callback);
                return;
            }
            if (i11 != SubjectType.MUSIC.getValue()) {
                if (!C5123t.f17614a.m23960b()) {
                    callback.mo61885a(postcard);
                    return;
                }
                if (activityM65321o != null && !activityM65321o.isDestroyed() && !activityM65321o.isFinishing()) {
                    Navigator.m61845x(AbstractC5114k.m23919b(TheRouter.m61773c("/playvideo/detail"), postcard.getExtras()), activityM65321o, null, 2, null);
                }
                AbstractC29189b.m112003a(callback);
                return;
            }
            try {
                Result.Companion companion3 = Result.INSTANCE;
                postcard.getExtras().putBoolean("is_music_liked_fragment", extras.getBoolean("is_music_liked_fragment"));
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th3));
            }
            if (activityM65321o != null && !activityM65321o.isDestroyed() && !activityM65321o.isFinishing()) {
                Navigator.m61845x(AbstractC5114k.m23919b(TheRouter.m61773c("/playvideo/music_detail"), postcard.getExtras()), activityM65321o, null, 2, null);
            }
            AbstractC29189b.m112003a(callback);
        } catch (Exception unused) {
            callback.mo61885a(postcard);
        }
    }
}
