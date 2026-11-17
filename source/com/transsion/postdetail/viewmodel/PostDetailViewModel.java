package com.transsion.postdetail.viewmodel;

import android.text.TextUtils;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.postdetail.p306ui.fragment.preload.VideoDataLoader;
import com.transsion.postdetail.p306ui.fragment.preload.VideoImmersiveDataLoaderV2;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p653on.InterfaceC26367a;
import p843vm.AbstractC28132b;
import p843vm.C28135e;
import p985zo.InterfaceC29209b;

/* JADX INFO: loaded from: classes6.dex */
public final class PostDetailViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: d */
    private VideoDataLoader f57875d;

    /* JADX INFO: renamed from: e */
    private VideoImmersiveDataLoaderV2 f57876e;

    /* JADX INFO: renamed from: a */
    private final String f57872a = "PostDetailViewModel";

    /* JADX INFO: renamed from: b */
    private final Lazy f57873b = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailViewModel.m75028L();
        }
    });

    /* JADX INFO: renamed from: c */
    private final Lazy f57874c = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.postdetail.viewmodel.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailViewModel.m75043p();
        }
    });

    /* JADX INFO: renamed from: f */
    private final Lazy f57877f = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailViewModel.m75026J();
        }
    });

    /* JADX INFO: renamed from: g */
    private final Lazy f57878g = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailViewModel.m75025I();
        }
    });

    /* JADX INFO: renamed from: h */
    private final Lazy f57879h = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailViewModel.m75023E();
        }
    });

    /* JADX INFO: renamed from: i */
    private final Lazy f57880i = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailViewModel.m75024H();
        }
    });

    /* JADX INFO: renamed from: j */
    private final Lazy f57881j = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailViewModel.m75044q();
        }
    });

    /* JADX INFO: renamed from: k */
    private final Lazy f57882k = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailViewModel.m75027K();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final InterfaceC29209b m75022D() {
        return (InterfaceC29209b) this.f57873b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C3187b0 m75023E() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C3187b0 m75024H() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C3187b0 m75025I() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C3187b0 m75026J() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C3187b0 m75027K() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final InterfaceC29209b m75028L() {
        return (InterfaceC29209b) C22982c.f70163e.m91553a().m91552h(InterfaceC29209b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC26367a m75043p() {
        return (InterfaceC26367a) C22982c.f70163e.m91553a().m91552h(InterfaceC26367a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C3187b0 m75044q() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final InterfaceC26367a m75045s() {
        return (InterfaceC26367a) this.f57874c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final C3187b0 m75046w() {
        return (C3187b0) this.f57879h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final C3187b0 m75047z() {
        return (C3187b0) this.f57877f.getValue();
    }

    /* JADX INFO: renamed from: A */
    public final LiveData m75048A() {
        return m75047z();
    }

    /* JADX INFO: renamed from: B */
    public final PostSubjectBean m75049B() {
        VideoImmersiveDataLoaderV2 videoImmersiveDataLoaderV2 = this.f57876e;
        if (videoImmersiveDataLoaderV2 != null) {
            return (PostSubjectBean) videoImmersiveDataLoaderV2.m109258a();
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final C3187b0 m75050C() {
        return (C3187b0) this.f57882k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: F */
    public final void m75051F(Integer num, String str) {
        AbstractC28132b abstractC28132b;
        Object next;
        ?? r11 = 0;
        Object obj = null;
        List listM109266a = num != null ? C28135e.f86323a.m109266a(num.intValue()) : null;
        if (listM109266a != null) {
            Iterator it = listM109266a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((AbstractC28132b) next) instanceof VideoDataLoader));
            abstractC28132b = (AbstractC28132b) next;
        } else {
            abstractC28132b = null;
        }
        VideoDataLoader videoDataLoader = (VideoDataLoader) abstractC28132b;
        if (videoDataLoader == null) {
            videoDataLoader = new VideoDataLoader(r11, 1, r11);
        }
        this.f57875d = videoDataLoader;
        if (listM109266a != null) {
            for (Object obj2 : listM109266a) {
                if (((AbstractC28132b) obj2) instanceof VideoImmersiveDataLoaderV2) {
                    obj = obj2;
                    break;
                }
            }
            r11 = (AbstractC28132b) obj;
        }
        VideoImmersiveDataLoaderV2 videoImmersiveDataLoaderV2 = (VideoImmersiveDataLoaderV2) r11;
        if (videoImmersiveDataLoaderV2 == null) {
            videoImmersiveDataLoaderV2 = new VideoImmersiveDataLoaderV2(str, null, null, 0, 14, null);
        }
        this.f57876e = videoImmersiveDataLoaderV2;
    }

    /* JADX INFO: renamed from: G */
    public void m75052G(String str, int i11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PostDetailViewModel$like$1(str, i11, this, null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m75053r(String postId) {
        Intrinsics.m97802h(postId, "postId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PostDetailViewModel$deletePost$1(postId, this, null), 3, null);
    }

    /* JADX INFO: renamed from: t */
    public final C3187b0 m75054t() {
        return (C3187b0) this.f57881j.getValue();
    }

    /* JADX INFO: renamed from: u */
    public final void m75055u(String postId, int i11, String nextPage, int i12, boolean z11, int i13) {
        Intrinsics.m97802h(postId, "postId");
        Intrinsics.m97802h(nextPage, "nextPage");
        if (!z11) {
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PostDetailViewModel$getImmVideoList$1(this, postId, null), 3, null);
            return;
        }
        VideoImmersiveDataLoaderV2 videoImmersiveDataLoaderV2 = this.f57876e;
        if (videoImmersiveDataLoaderV2 != null) {
            videoImmersiveDataLoaderV2.m74584u(postId);
        }
        VideoImmersiveDataLoaderV2 videoImmersiveDataLoaderV3 = this.f57876e;
        if (videoImmersiveDataLoaderV3 != null) {
            videoImmersiveDataLoaderV3.m74582s(nextPage);
        }
        VideoImmersiveDataLoaderV2 videoImmersiveDataLoaderV4 = this.f57876e;
        if (videoImmersiveDataLoaderV4 != null) {
            videoImmersiveDataLoaderV4.m74583t(i12);
        }
        VideoImmersiveDataLoaderV2 videoImmersiveDataLoaderV5 = this.f57876e;
        if (videoImmersiveDataLoaderV5 != null) {
            videoImmersiveDataLoaderV5.m109262f(m75046w());
        }
    }

    /* JADX INFO: renamed from: v */
    public final LiveData m75056v() {
        return m75046w();
    }

    /* JADX INFO: renamed from: x */
    public final void m75057x(String postId) {
        Intrinsics.m97802h(postId, "postId");
        if (TextUtils.isEmpty(postId)) {
            return;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PostDetailViewModel$getPostDetail$1(this, postId, null), 3, null);
    }

    /* JADX INFO: renamed from: y */
    public final C3187b0 m75058y() {
        return (C3187b0) this.f57878g.getValue();
    }
}
