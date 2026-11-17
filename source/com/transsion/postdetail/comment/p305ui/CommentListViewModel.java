package com.transsion.postdetail.comment.p305ui;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p985zo.InterfaceC29208a;

/* JADX INFO: loaded from: classes6.dex */
public final class CommentListViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f56298b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f56299c;

    /* JADX INFO: renamed from: d */
    private final List f56300d;

    /* JADX INFO: renamed from: e */
    private String f56301e;

    /* JADX INFO: renamed from: f */
    private int f56302f;

    /* JADX INFO: renamed from: g */
    private boolean f56303g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentListViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f56298b = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.comment.ui.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommentListViewModel.m72949j();
            }
        });
        this.f56299c = new C3187b0();
        this.f56300d = new ArrayList();
        this.f56301e = "1";
        this.f56302f = 20;
        this.f56303g = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC29208a m72949j() {
        return (InterfaceC29208a) C22982c.f70163e.m91553a().m91552h(InterfaceC29208a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC29208a m72950l() {
        return (InterfaceC29208a) this.f56298b.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m72951k(boolean z11) {
        if (z11) {
            this.f56301e = "1";
            this.f56300d.clear();
            this.f56303g = true;
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new CommentListViewModel$getCommentList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m72952m() {
        return this.f56299c;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m72953n() {
        return this.f56303g;
    }
}
