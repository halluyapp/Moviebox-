package com.transsion.postdetail.viewmodel;

import android.content.Context;
import android.location.Address;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.p299mb.config.manager.ConfigBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p023ap.C4697a;
import p349dh.C22982c;
import p653on.InterfaceC26367a;
import p913xm.C28615f;
import p985zo.InterfaceC29210c;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class RoomPostViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: p */
    public static final C17480a f57890p = new C17480a(null);

    /* JADX INFO: renamed from: a */
    private final Lazy f57891a = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomPostViewModel.m75093l0();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f57892b = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.postdetail.viewmodel.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomPostViewModel.m75106y();
        }
    });

    /* JADX INFO: renamed from: c */
    private final Lazy f57893c = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomPostViewModel.m75105x();
        }
    });

    /* JADX INFO: renamed from: d */
    private final Lazy f57894d = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.viewmodel.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(RoomPostViewModel.m75076Y());
        }
    });

    /* JADX INFO: renamed from: e */
    private final C3187b0 f57895e = new C3187b0();

    /* JADX INFO: renamed from: f */
    private final C3187b0 f57896f = new C3187b0();

    /* JADX INFO: renamed from: g */
    private final C3187b0 f57897g = new C3187b0();

    /* JADX INFO: renamed from: h */
    private final C3187b0 f57898h = new C3187b0();

    /* JADX INFO: renamed from: i */
    private final C3187b0 f57899i = new C3187b0();

    /* JADX INFO: renamed from: j */
    private final C3187b0 f57900j = new C3187b0();

    /* JADX INFO: renamed from: k */
    private final C3187b0 f57901k = new C3187b0();

    /* JADX INFO: renamed from: l */
    private final C3187b0 f57902l = new C3187b0();

    /* JADX INFO: renamed from: m */
    private final C3187b0 f57903m = new C3187b0();

    /* JADX INFO: renamed from: n */
    private final C3187b0 f57904n = new C3187b0();

    /* JADX INFO: renamed from: o */
    private long f57905o;

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.RoomPostViewModel$a */
    public static final class C17480a {
        private C17480a() {
        }

        public /* synthetic */ C17480a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final C4697a m75071A() {
        return (C4697a) this.f57893c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final InterfaceC26367a m75072B() {
        return (InterfaceC26367a) this.f57892b.getValue();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m75073P(RoomPostViewModel roomPostViewModel, boolean z11, boolean z12, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = 9;
        }
        roomPostViewModel.m75119O(z11, z12, str, str2, str3, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final InterfaceC29210c m75074S() {
        return (InterfaceC29210c) this.f57891a.getValue();
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m75075V(RoomPostViewModel roomPostViewModel, boolean z11, boolean z12, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = 9;
        }
        roomPostViewModel.m75123U(z11, z12, str, str2, str3, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final boolean m75076Y() {
        String value;
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_room_post_cache", true);
        if (configBeanM110360c == null || (value = configBeanM110360c.getValue()) == null) {
            return false;
        }
        return Intrinsics.m97797c(StringsKt.m98153m1(value), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a0 */
    private final List m75077a0(String str) {
        List<PostSubjectItem> items;
        PostSubjectBean postSubjectBean = (PostSubjectBean) AbstractC5796o.m27441d(str, PostSubjectBean.class);
        return (postSubjectBean == null || (items = postSubjectBean.getItems()) == null) ? CollectionsKt.m97506l() : items;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public final List m75079b0() {
        Object objM112707constructorimpl;
        List listL;
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = C14496b.f50966a.m65344b().getString("post_explore_exposed_cache", "");
            if (string == null || string.length() == 0) {
                listL = CollectionsKt.m97506l();
            } else {
                listL = m75077a0(string);
                C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", "loadExposedCacheItems, size:" + listL.size(), false, 4, null);
            }
            objM112707constructorimpl = Result.m112707constructorimpl(listL);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "RoomPostVM", "loadExposedCacheItems failed: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
        List listL2 = CollectionsKt.m97506l();
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = listL2;
        }
        return (List) objM112707constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public final List m75081c0() {
        Object objM112707constructorimpl;
        List listL;
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = C14496b.f50966a.m65344b().getString("room_cache_data", "");
            if (string == null || string.length() == 0) {
                listL = CollectionsKt.m97506l();
            } else {
                listL = m75077a0(string);
                C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", "loadManualCacheItems, size:" + listL.size(), false, 4, null);
            }
            objM112707constructorimpl = Result.m112707constructorimpl(listL);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "RoomPostVM", "loadManualCacheItems failed: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
        List listL2 = CollectionsKt.m97506l();
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = listL2;
        }
        return (List) objM112707constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public final List m75083d0(String str, String str2) {
        Object objM112707constructorimpl;
        List listL;
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = C14496b.f50966a.m65344b().getString(str, "");
            if (string == null || string.length() == 0) {
                listL = CollectionsKt.m97506l();
            } else {
                listL = m75077a0(string);
                C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", str2 + ", size:" + listL.size(), false, 4, null);
            }
            objM112707constructorimpl = Result.m112707constructorimpl(listL);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "RoomPostVM", str2 + " failed: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
        List listL2 = CollectionsKt.m97506l();
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = listL2;
        }
        return (List) objM112707constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final PostSubjectBean m75091k0(List list, List list2, List list3) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            PostSubjectItem postSubjectItem = (PostSubjectItem) obj;
            if (!postSubjectItem.isRoomCacheListStart() && !postSubjectItem.isRoomCacheListEnd()) {
                arrayList.add(obj);
            }
        }
        if (list.isEmpty() && list2.isEmpty() && arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PostSubjectItem postSubjectItem2 = (PostSubjectItem) it.next();
            String postId = postSubjectItem2.getPostId();
            if (postId != null) {
                linkedHashSet.add(postId);
            }
            arrayList2.add(postSubjectItem2);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            PostSubjectItem postSubjectItem3 = (PostSubjectItem) it2.next();
            if (postSubjectItem3.getPostId() != null) {
                String postId2 = postSubjectItem3.getPostId();
                Intrinsics.m97799e(postId2);
                if (linkedHashSet.add(postId2)) {
                }
            }
            arrayList2.add(postSubjectItem3);
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                PostSubjectItem postSubjectItem4 = (PostSubjectItem) obj2;
                if (postSubjectItem4.getPostId() != null) {
                    String postId3 = postSubjectItem4.getPostId();
                    Intrinsics.m97799e(postId3);
                    if (linkedHashSet.add(postId3)) {
                    }
                }
                arrayList3.add(obj2);
            }
            if (!arrayList3.isEmpty()) {
                PostSubjectItem postSubjectItem5 = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
                postSubjectItem5.setRoomCacheListStart(true);
                postSubjectItem5.setRoomCache(true);
                arrayList2.add(postSubjectItem5);
                arrayList2.addAll(arrayList3);
                PostSubjectItem postSubjectItem6 = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
                postSubjectItem6.setRoomCacheListEnd(true);
                postSubjectItem6.setRoomCache(true);
                arrayList2.add(postSubjectItem6);
            }
        }
        PostSubjectBean postSubjectBean = new PostSubjectBean(arrayList2, null, null, null);
        postSubjectBean.setRefresh(true);
        return postSubjectBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final InterfaceC29210c m75093l0() {
        return (InterfaceC29210c) C22982c.f70163e.m91553a().m91552h(InterfaceC29210c.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C4697a m75105x() {
        return new C4697a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final InterfaceC26367a m75106y() {
        return (InterfaceC26367a) C22982c.f70163e.m91553a().m91552h(InterfaceC26367a.class);
    }

    /* JADX INFO: renamed from: C */
    public final C3187b0 m75107C() {
        return this.f57900j;
    }

    /* JADX INFO: renamed from: D */
    public final C3187b0 m75108D() {
        return this.f57895e;
    }

    /* JADX INFO: renamed from: E */
    public final C3187b0 m75109E() {
        return this.f57896f;
    }

    /* JADX INFO: renamed from: F */
    public final int m75110F() {
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_room_post_cache_count", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        Integer numV = value != null ? StringsKt.m98216v(value) : null;
        if (numV != null) {
            return numV.intValue();
        }
        return 24;
    }

    /* JADX INFO: renamed from: G */
    public final C3187b0 m75111G() {
        return this.f57897g;
    }

    /* JADX INFO: renamed from: H */
    public final C3187b0 m75112H() {
        return this.f57899i;
    }

    /* JADX INFO: renamed from: I */
    public final C3187b0 m75113I() {
        return this.f57898h;
    }

    /* JADX INFO: renamed from: J */
    public final void m75114J(Context context, boolean z11, boolean z12, String str, int i11, String str2) {
        Intrinsics.m97802h(context, "context");
        if (!m75125X()) {
            m75127e0();
        }
        if (z11) {
            C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", "getPostExplore [AB:" + (m75125X() ? "实验组-新缓存策略" : "对照组-旧缓存策略") + "]", false, 4, null);
            if (m75125X()) {
                m75129g0();
            } else {
                m75130h0();
            }
            m75128f0();
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomPostViewModel$getPostExplore$1(z11, this, z12, str, i11, str2, null), 3, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m75115K(boolean z11, String str, int i11, String str2) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RoomPostViewModel$getPostExploreMoreCache$1(this, str, i11, str2, z11, null), 2, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m75116L(boolean z11, String str, int i11, double d11, double d12) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RoomPostViewModel$getPostNearby$1(this, str, i11, d12, d11, z11, null), 2, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m75117M(boolean z11, String str, String str2, int i11, String sortType, boolean z12) {
        Intrinsics.m97802h(sortType, "sortType");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomPostViewModel$getPostNewest$1(this, str, str2, i11, sortType, z12, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m75118N(boolean z11, String groupId, String str, int i11, boolean z12) {
        Intrinsics.m97802h(groupId, "groupId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomPostViewModel$getPostPopular$1(this, groupId, str, i11, z12, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m75119O(boolean z11, boolean z12, String tabId, String str, String str2, int i11) {
        Intrinsics.m97802h(tabId, "tabId");
        if (z11) {
            m75131i0(tabId);
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomPostViewModel$getPostSubPageList$1(z11, tabId, z12, this, str, i11, str2, null), 3, null);
    }

    /* JADX INFO: renamed from: Q */
    public final void m75120Q(double d11, double d12, Address address) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomPostViewModel$getRecommendRooms$1(this, d11, d12, address, null), 3, null);
    }

    /* JADX INFO: renamed from: R */
    public final C3187b0 m75121R() {
        return this.f57901k;
    }

    /* JADX INFO: renamed from: T */
    public final C3187b0 m75122T() {
        return this.f57904n;
    }

    /* JADX INFO: renamed from: U */
    public final void m75123U(boolean z11, boolean z12, String tabId, String str, String str2, int i11) {
        Intrinsics.m97802h(tabId, "tabId");
        if (z11) {
            m75132j0(tabId);
        }
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomPostViewModel$getStaggeredPostPageList$1(z11, tabId, z12, this, str, i11, str2, null), 3, null);
    }

    /* JADX INFO: renamed from: W */
    public final C3187b0 m75124W() {
        return this.f57903m;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m75125X() {
        return ((Boolean) this.f57894d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Z */
    public final void m75126Z(String str, int i11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomPostViewModel$like$1(str, i11, this, null), 3, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m75127e0() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RoomPostViewModel$loadPostExploreActiveSaveCache$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m75128f0() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RoomPostViewModel$loadPostExploreBuiltInCache$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m75129g0() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RoomPostViewModel$loadPostExploreCombinedCache$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75130h0() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RoomPostViewModel$loadPostExploreNetCache$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75131i0(String tabId) {
        Intrinsics.m97802h(tabId, "tabId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RoomPostViewModel$loadPostSubPageCache$1(tabId, this, null), 2, null);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75132j0(String tabId) {
        Intrinsics.m97802h(tabId, "tabId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RoomPostViewModel$loadStaggeredPostPageCache$1(tabId, this, null), 2, null);
    }

    /* JADX INFO: renamed from: z */
    public final void m75133z(String str) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new RoomPostViewModel$deletePost$1(str, this, null), 3, null);
    }
}
