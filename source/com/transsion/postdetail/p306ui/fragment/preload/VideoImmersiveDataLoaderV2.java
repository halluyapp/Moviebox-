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
public final class VideoImmersiveDataLoaderV2 extends AbstractC28132b {

    /* JADX INFO: renamed from: f */
    private String f57431f;

    /* JADX INFO: renamed from: g */
    private String f57432g;

    /* JADX INFO: renamed from: h */
    private String f57433h;

    /* JADX INFO: renamed from: i */
    private int f57434i;

    /* JADX INFO: renamed from: j */
    private final Lazy f57435j;

    public VideoImmersiveDataLoaderV2(String str, String postId, String page, int i11) {
        Intrinsics.m97802h(postId, "postId");
        Intrinsics.m97802h(page, "page");
        this.f57431f = str;
        this.f57432g = postId;
        this.f57433h = page;
        this.f57434i = i11;
        this.f57435j = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.preload.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VideoImmersiveDataLoaderV2.m74577r();
            }
        });
    }

    public /* synthetic */ VideoImmersiveDataLoaderV2(String str, String str2, String str3, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? "0" : str2, (i12 & 4) != 0 ? "1" : str3, (i12 & 8) != 0 ? 8 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC29209b m74576q() {
        return (InterfaceC29209b) this.f57435j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC29209b m74577r() {
        return (InterfaceC29209b) C22982c.f70163e.m91553a().m91552h(InterfaceC29209b.class);
    }

    @Override // p843vm.AbstractC28132b
    /* JADX INFO: renamed from: h */
    public void mo70647h(C3187b0 c3187b0) {
        m109264j(AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new VideoImmersiveDataLoaderV2$loadDataFromService$1(this, null), 3, null));
    }

    /* JADX INFO: renamed from: m */
    public final String m74578m() {
        return this.f57433h;
    }

    /* JADX INFO: renamed from: n */
    public final String m74579n() {
        return this.f57431f;
    }

    /* JADX INFO: renamed from: o */
    public final int m74580o() {
        return this.f57434i;
    }

    /* JADX INFO: renamed from: p */
    public final String m74581p() {
        return this.f57432g;
    }

    /* JADX INFO: renamed from: s */
    public final void m74582s(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f57433h = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m74583t(int i11) {
        this.f57434i = i11;
    }

    /* JADX INFO: renamed from: u */
    public final void m74584u(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.f57432g = str;
    }
}
