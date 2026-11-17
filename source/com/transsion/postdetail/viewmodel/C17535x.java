package com.transsion.postdetail.viewmodel;

import android.net.Uri;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import ch.C5096b;
import com.transsion.baselib.report.C14489h;
import com.transsion.moviedetailapi.bean.ShortTVRespData;
import com.transsion.postdetail.p306ui.fragment.preload.ShortTvVideoImmersiveDataLoader;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p349dh.C22982c;
import p653on.InterfaceC26367a;
import p843vm.AbstractC28132b;
import p843vm.C28135e;
import p946yj.C28958a;
import p946yj.C28959b;
import p985zo.InterfaceC29209b;

/* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C17535x extends AbstractC3223t0 {

    /* JADX INFO: renamed from: d */
    private ShortTvVideoImmersiveDataLoader f57937d;

    /* JADX INFO: renamed from: a */
    private final String f57934a = "ShortTvDetailViewModel";

    /* JADX INFO: renamed from: b */
    private final Lazy f57935b = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17535x.m75163t();
        }
    });

    /* JADX INFO: renamed from: c */
    private final Lazy f57936c = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.postdetail.viewmodel.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17535x.m75157h();
        }
    });

    /* JADX INFO: renamed from: e */
    private final Lazy f57938e = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17535x.m75160p();
        }
    });

    /* JADX INFO: renamed from: f */
    private final Lazy f57939f = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17535x.m75161r();
        }
    });

    /* JADX INFO: renamed from: g */
    private final Lazy f57940g = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17535x.m75158i();
        }
    });

    /* JADX INFO: renamed from: h */
    private final Lazy f57941h = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17535x.m75162s();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC26367a m75157h() {
        return (InterfaceC26367a) C22982c.f70163e.m91553a().m91552h(InterfaceC26367a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C3187b0 m75158i() {
        return new C3187b0();
    }

    /* JADX INFO: renamed from: m */
    private final C3187b0 m75159m() {
        return (C3187b0) this.f57938e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C3187b0 m75160p() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C3187b0 m75161r() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C3187b0 m75162s() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC29209b m75163t() {
        return (InterfaceC29209b) C22982c.f70163e.m91553a().m91552h(InterfaceC29209b.class);
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m75164j() {
        return (C3187b0) this.f57940g.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m75165k(String postId, int i11, String nextPage, int i12, int i13) {
        String string;
        Intrinsics.m97802h(postId, "postId");
        Intrinsics.m97802h(nextPage, "nextPage");
        ImmVideoRequestEntity immVideoRequestEntity = new ImmVideoRequestEntity();
        immVideoRequestEntity.setPage(nextPage);
        immVideoRequestEntity.setPerPage(i12);
        immVideoRequestEntity.setSessionId(C5096b.f17579a.m23868h());
        Uri uriM65300c = C14489h.f50945a.m65300c();
        if (uriM65300c == null || (string = uriM65300c.toString()) == null) {
            string = "";
        }
        immVideoRequestEntity.setDeepLink(string);
        immVideoRequestEntity.setUserPrefer("");
        immVideoRequestEntity.setLatest_events(new C28958a(C28959b.f88597a.m111468e()));
        if (postId.length() == 0) {
            postId = "0";
        }
        immVideoRequestEntity.setPostId(postId);
        immVideoRequestEntity.setTabId(i11);
        immVideoRequestEntity.setImmersiveRecType(i13);
        ShortTvVideoImmersiveDataLoader shortTvVideoImmersiveDataLoader = this.f57937d;
        if (shortTvVideoImmersiveDataLoader != null) {
            shortTvVideoImmersiveDataLoader.m74559r(immVideoRequestEntity);
        }
        ShortTvVideoImmersiveDataLoader shortTvVideoImmersiveDataLoader2 = this.f57937d;
        if (shortTvVideoImmersiveDataLoader2 != null) {
            shortTvVideoImmersiveDataLoader2.m109262f(m75159m());
        }
    }

    /* JADX INFO: renamed from: l */
    public final LiveData m75166l() {
        return m75159m();
    }

    /* JADX INFO: renamed from: n */
    public final ShortTVRespData m75167n() {
        ShortTvVideoImmersiveDataLoader shortTvVideoImmersiveDataLoader = this.f57937d;
        if (shortTvVideoImmersiveDataLoader != null) {
            return (ShortTVRespData) shortTvVideoImmersiveDataLoader.m109258a();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final C3187b0 m75168o() {
        return (C3187b0) this.f57941h.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final void m75169q(Integer num) {
        List listM109266a;
        AbstractC28132b abstractC28132b;
        Object next;
        if (num != null) {
            listM109266a = C28135e.f86323a.m109266a(num.intValue());
        } else {
            listM109266a = null;
        }
        if (listM109266a != null) {
            Iterator it = listM109266a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((AbstractC28132b) next) instanceof ShortTvVideoImmersiveDataLoader));
            abstractC28132b = (AbstractC28132b) next;
        } else {
            abstractC28132b = null;
        }
        ShortTvVideoImmersiveDataLoader shortTvVideoImmersiveDataLoader = (ShortTvVideoImmersiveDataLoader) abstractC28132b;
        if (shortTvVideoImmersiveDataLoader == null) {
            shortTvVideoImmersiveDataLoader = new ShortTvVideoImmersiveDataLoader(null, 1, null);
        }
        this.f57937d = shortTvVideoImmersiveDataLoader;
    }
}
