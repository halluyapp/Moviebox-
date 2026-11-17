package com.transsion.postdetail.viewmodel;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p985zo.InterfaceC29208a;

/* JADX INFO: loaded from: classes6.dex */
public final class PostDetailCommentsFragmentViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final Lazy f57869a = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailCommentsFragmentViewModel.m75017d();
        }
    });

    /* JADX INFO: renamed from: b */
    private final C3187b0 f57870b = new C3187b0();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC29208a m75017d() {
        return (InterfaceC29208a) C22982c.f70163e.m91553a().m91552h(InterfaceC29208a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC29208a m75018f() {
        return (InterfaceC29208a) this.f57869a.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m75019e(String postId, String rootCommentId, String page, int i11) {
        Intrinsics.m97802h(postId, "postId");
        Intrinsics.m97802h(rootCommentId, "rootCommentId");
        Intrinsics.m97802h(page, "page");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PostDetailCommentsFragmentViewModel$getCommentList$1(this, postId, rootCommentId, page, i11, null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final C3187b0 m75020g() {
        return this.f57870b;
    }
}
