package com.transsion.postdetail.viewmodel;

import android.net.Uri;
import android.text.TextUtils;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import ch.C5096b;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.C14489h;
import com.transsion.publish.R$string;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import okhttp3.RequestBody;
import p349dh.C22982c;
import p411fh.C23367b;
import p743rh.C27287m;
import p944yh.C28951b;
import p946yj.C28959b;
import p985zo.InterfaceC29209b;

/* JADX INFO: loaded from: classes6.dex */
public final class PostRecommendFragmentViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: d */
    public static final C17476a f57885d = new C17476a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f57886a = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostRecommendFragmentViewModel.m75067j();
        }
    });

    /* JADX INFO: renamed from: b */
    private final C3187b0 f57887b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private final Lazy f57888c = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostRecommendFragmentViewModel.m75065f();
        }
    });

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.PostRecommendFragmentViewModel$a */
    public static final class C17476a {
        private C17476a() {
        }

        public /* synthetic */ C17476a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C3187b0 m75065f() {
        return new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC29209b m75066i() {
        return (InterfaceC29209b) this.f57886a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC29209b m75067j() {
        return (InterfaceC29209b) C22982c.f70163e.m91553a().m91552h(InterfaceC29209b.class);
    }

    /* JADX INFO: renamed from: g */
    public final void m75068g(String postId, int i11, int i12, int i13) {
        String string;
        Intrinsics.m97802h(postId, "postId");
        if (TextUtils.isEmpty(postId)) {
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.upload_no_network);
            this.f57887b.mo14855n(null);
            return;
        }
        ImmVideoRequestEntity immVideoRequestEntity = new ImmVideoRequestEntity();
        immVideoRequestEntity.setPage(String.valueOf(i12));
        immVideoRequestEntity.setPerPage(i13);
        immVideoRequestEntity.setSessionId(C5096b.f17579a.m23868h());
        Uri uriM65300c = C14489h.f50945a.m65300c();
        if (uriM65300c == null || (string = uriM65300c.toString()) == null) {
            string = "";
        }
        immVideoRequestEntity.setDeepLink(string);
        immVideoRequestEntity.setUserPrefer("");
        immVideoRequestEntity.setLatest_events(C28959b.f88597a.m111468e());
        immVideoRequestEntity.setPostId(postId);
        immVideoRequestEntity.setTabId(i11);
        C23367b.a aVar = C23367b.f71265a;
        String strM27447j = AbstractC5796o.m27447j(immVideoRequestEntity);
        Intrinsics.m97801g(strM27447j, "toJson(...)");
        RequestBody requestBodyM92796a = aVar.m92796a(strM27447j);
        if (requestBodyM92796a != null) {
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new PostRecommendFragmentViewModel$getImmVideoList$1$1(this, requestBodyM92796a, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final LiveData m75069h() {
        return this.f57887b;
    }
}
