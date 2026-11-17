package com.transsion.moviedetail.staff;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.cloud.tmc.integration.event.EventConstants;
import com.google.gson.JsonObject;
import com.transsion.moviedetail.staff.bean.MovieStaffList;
import com.transsion.moviedetail.staff.bean.MovieStaffSubjectList;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.postdetail.bean.Pager;
import io.reactivex.rxjava3.core.AbstractC24093j;
import io.reactivex.rxjava3.core.InterfaceC24096m;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p349dh.C22982c;
import p666oz.InterfaceC26760h;
import p871wg.AbstractC28362a;
import p871wg.C28365d;

/* JADX INFO: renamed from: com.transsion.moviedetail.staff.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C16147y extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final C3187b0 f54891a = new C3187b0();

    /* JADX INFO: renamed from: b */
    private final C3187b0 f54892b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private final C3187b0 f54893c = new C3187b0();

    /* JADX INFO: renamed from: d */
    private final C3187b0 f54894d = new C3187b0();

    /* JADX INFO: renamed from: e */
    private final C3187b0 f54895e = new C3187b0();

    /* JADX INFO: renamed from: f */
    private final Lazy f54896f = LazyKt.m97097b(new Function0() { // from class: com.transsion.moviedetail.staff.x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C16147y.m70760x();
        }
    });

    /* JADX INFO: renamed from: g */
    private int f54897g = 1;

    /* JADX INFO: renamed from: h */
    private boolean f54898h = true;

    /* JADX INFO: renamed from: i */
    private InterfaceC24104c f54899i;

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.y$a */
    public static final class a extends AbstractC28362a {
        a() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C16147y.this.f54895e.mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MovieStaffList movieStaffList) {
            super.mo66458c(movieStaffList);
            C16147y.this.f54895e.mo14858q(movieStaffList);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.y$b */
    public static final class b extends AbstractC28362a {
        b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C16147y.this.f54891a.mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(Staff staff) {
            super.mo66458c(staff);
            C16147y.this.f54891a.mo14858q(staff);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.y$c */
    public static final class c extends AbstractC28362a {
        c() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            InterfaceC24104c interfaceC24104c;
            C16147y.this.f54893c.mo14858q(null);
            InterfaceC24104c interfaceC24104c2 = C16147y.this.f54899i;
            if (interfaceC24104c2 == null || interfaceC24104c2.isDisposed() || (interfaceC24104c = C16147y.this.f54899i) == null) {
                return;
            }
            interfaceC24104c.dispose();
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MovieStaffSubjectList movieStaffSubjectList) {
            InterfaceC24104c interfaceC24104c;
            Pager pager;
            Boolean hasMore;
            super.mo66458c(movieStaffSubjectList);
            if (movieStaffSubjectList != null && (pager = movieStaffSubjectList.getPager()) != null && (hasMore = pager.getHasMore()) != null) {
                C16147y.this.f54898h = hasMore.booleanValue();
            }
            C16147y.this.f54893c.mo14858q(movieStaffSubjectList);
            if (movieStaffSubjectList != null) {
                C16147y c16147y = C16147y.this;
                List arrayList = (List) c16147y.f54892b.m14847f();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(movieStaffSubjectList);
                c16147y.f54892b.mo14858q(arrayList);
            }
            C16147y.this.f54897g++;
            InterfaceC24104c interfaceC24104c2 = C16147y.this.f54899i;
            if (interfaceC24104c2 == null || interfaceC24104c2.isDisposed() || (interfaceC24104c = C16147y.this.f54899i) == null) {
                return;
            }
            interfaceC24104c.dispose();
        }

        @Override // p871wg.AbstractC28362a, io.reactivex.rxjava3.core.InterfaceC24098o
        public void onSubscribe(InterfaceC24104c d11) {
            Intrinsics.m97802h(d11, "d");
            super.onSubscribe(d11);
            C16147y.this.f54899i = d11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.y$d */
    static final class d implements InterfaceC26760h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JsonObject f54903a;

        d(JsonObject jsonObject) {
            this.f54903a = jsonObject;
        }

        @Override // p666oz.InterfaceC26760h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RequestBody apply(JsonObject it) {
            Intrinsics.m97802h(it, "it");
            RequestBody.Companion companion = RequestBody.INSTANCE;
            String string = this.f54903a.toString();
            Intrinsics.m97801g(string, "toString(...)");
            return companion.create(string, MediaType.INSTANCE.parse("application/json"));
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.y$e */
    static final class e implements InterfaceC26760h {
        e() {
        }

        @Override // p666oz.InterfaceC26760h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC24096m apply(RequestBody it) {
            Intrinsics.m97802h(it, "it");
            return InterfaceC16123a.a.m70733d(C16147y.this.m70759r(), it, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.staff.y$f */
    public static final class f extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f54906e;

        f(int i11) {
            this.f54906e = i11;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C16147y.this.f54894d.mo14858q(-1);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(String str) {
            super.mo66458c(str);
            C16147y.this.f54894d.mo14858q(Integer.valueOf(this.f54906e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC16123a m70759r() {
        return (InterfaceC16123a) this.f54896f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final InterfaceC16123a m70760x() {
        return (InterfaceC16123a) C22982c.f70163e.m91553a().m91552h(InterfaceC16123a.class);
    }

    /* JADX INFO: renamed from: n */
    public final void m70761n() {
        this.f54893c.mo14858q(null);
    }

    /* JADX INFO: renamed from: o */
    public final void m70762o(String str) {
        if (str == null) {
            return;
        }
        InterfaceC16123a.a.m70731b(m70759r(), str, null, 2, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new a());
    }

    /* JADX INFO: renamed from: p */
    public final void m70763p(String str) {
        if (str == null) {
            return;
        }
        InterfaceC16123a.a.m70730a(m70759r(), str, null, 2, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new b());
    }

    /* JADX INFO: renamed from: q */
    public final void m70764q(String str, int i11) {
        if (str == null || !this.f54898h) {
            return;
        }
        InterfaceC24104c interfaceC24104c = this.f54899i;
        if (interfaceC24104c == null || interfaceC24104c.isDisposed()) {
            int i12 = this.f54897g;
            int i13 = 1;
            if (i12 > 1) {
                i13 = i11 + 1 + ((i12 - 2) * 60);
                i11 = i13 + 59;
            }
            InterfaceC16123a.a.m70732c(m70759r(), str, i13, i11, 1, null, 16, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new c());
        }
    }

    /* JADX INFO: renamed from: s */
    public final LiveData m70765s() {
        return this.f54895e;
    }

    /* JADX INFO: renamed from: t */
    public final LiveData m70766t() {
        return this.f54891a;
    }

    /* JADX INFO: renamed from: u */
    public final LiveData m70767u() {
        return this.f54892b;
    }

    /* JADX INFO: renamed from: v */
    public final LiveData m70768v() {
        return this.f54893c;
    }

    /* JADX INFO: renamed from: w */
    public final LiveData m70769w() {
        return this.f54894d;
    }

    /* JADX INFO: renamed from: y */
    public final void m70770y(String str, int i11) {
        if (str == null) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("staffId", str);
        jsonObject.addProperty(EventConstants.KEY_ACTION, Integer.valueOf(i11));
        AbstractC24093j.m95068t(jsonObject).m95087u(new d(jsonObject)).m95082n(new e()).m95079f(C28365d.f87067a.m109702c()).subscribe(new f(i11));
    }
}
