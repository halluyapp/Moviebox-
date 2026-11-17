package com.transsion.postdetail.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.postdetail.bean.CommentBody;
import com.transsion.postdetail.bean.CommentLikeBody;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p985zo.InterfaceC29208a;
import pg.C26866a;
import to.C27837a;

/* JADX INFO: loaded from: classes6.dex */
public final class CommentViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: i */
    public static final C17451a f57848i = new C17451a(null);

    /* JADX INFO: renamed from: b */
    private final C3187b0 f57849b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f57850c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f57851d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f57852e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f57853f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f57854g;

    /* JADX INFO: renamed from: h */
    private final Lazy f57855h;

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.CommentViewModel$a */
    public static final class C17451a {
        private C17451a() {
        }

        public /* synthetic */ C17451a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f57849b = new C3187b0();
        this.f57850c = new C3187b0();
        this.f57851d = new C3187b0();
        this.f57852e = new C3187b0();
        this.f57853f = new C3187b0();
        this.f57854g = new C3187b0();
        this.f57855h = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommentViewModel.m74984f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC29208a m74984f() {
        return (InterfaceC29208a) C22982c.f70163e.m91553a().m91552h(InterfaceC29208a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC29208a m74985i() {
        return (InterfaceC29208a) this.f57855h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m74986r(String str) {
        C26866a.a.m104898f(C26866a.f81698a, "CommentViewModel", str, false, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m74987g(String topicType, String commentId) {
        Intrinsics.m97802h(topicType, "topicType");
        Intrinsics.m97802h(commentId, "commentId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new CommentViewModel$deleteComment$1(topicType, this, commentId, null), 3, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m74988h(String postId, String topicType, String rootCommentId, String page, int i11, String locCommentId) {
        Intrinsics.m97802h(postId, "postId");
        Intrinsics.m97802h(topicType, "topicType");
        Intrinsics.m97802h(rootCommentId, "rootCommentId");
        Intrinsics.m97802h(page, "page");
        Intrinsics.m97802h(locCommentId, "locCommentId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new CommentViewModel$getCommentList$1(this, postId, topicType, rootCommentId, page, locCommentId, i11, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m74989j() {
        return this.f57853f;
    }

    /* JADX INFO: renamed from: k */
    public final C3187b0 m74990k() {
        return this.f57850c;
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m74991l() {
        return this.f57851d;
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m74992m() {
        return this.f57852e;
    }

    /* JADX INFO: renamed from: n */
    public final C3187b0 m74993n() {
        return this.f57849b;
    }

    /* JADX INFO: renamed from: o */
    public final C3187b0 m74994o() {
        return this.f57854g;
    }

    /* JADX INFO: renamed from: p */
    public final void m74995p(C27837a info, String topicType, String page, int i11) {
        Intrinsics.m97802h(info, "info");
        Intrinsics.m97802h(topicType, "topicType");
        Intrinsics.m97802h(page, "page");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new CommentViewModel$getSubCommentList$1(this, info, topicType, page, i11, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m74996q(CommentLikeBody commentBody) {
        Intrinsics.m97802h(commentBody, "commentBody");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new CommentViewModel$likeComment$1(commentBody, this, null), 3, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m74997s(String topicType, CommentBody commentBody) {
        Intrinsics.m97802h(topicType, "topicType");
        Intrinsics.m97802h(commentBody, "commentBody");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new CommentViewModel$postComment$1(commentBody, topicType, this, null), 3, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m74998t(String commentId) {
        Intrinsics.m97802h(commentId, "commentId");
        this.f57854g.mo14858q(commentId);
    }
}
