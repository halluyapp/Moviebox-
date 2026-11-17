package com.transsion.postdetail.p306ui.fragment.preload;

import androidx.p1004lifecycle.C3187b0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p843vm.AbstractC28132b;
import p985zo.InterfaceC29209b;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoDataLoader extends AbstractC28132b {

    /* JADX INFO: renamed from: f */
    private String f57425f;

    /* JADX INFO: renamed from: g */
    private final Lazy f57426g;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoDataLoader() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public VideoDataLoader(String postId) {
        Intrinsics.m97802h(postId, "postId");
        this.f57425f = postId;
        this.f57426g = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.preload.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoDataLoader.m74564o();
            }
        });
    }

    public /* synthetic */ VideoDataLoader(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC29209b m74563n() {
        return (InterfaceC29209b) this.f57426g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC29209b m74564o() {
        return (InterfaceC29209b) C22982c.f70163e.m91553a().m91552h(InterfaceC29209b.class);
    }

    @Override // p843vm.AbstractC28132b
    /* JADX INFO: renamed from: h */
    public void mo70647h(C3187b0 c3187b0) {
        m109264j(AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new VideoDataLoader$loadDataFromService$1(this, null), 3, null));
    }

    /* JADX INFO: renamed from: m */
    public final String m74565m() {
        return this.f57425f;
    }

    /* JADX INFO: renamed from: p */
    public final void m74566p(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f57425f = str;
    }
}
