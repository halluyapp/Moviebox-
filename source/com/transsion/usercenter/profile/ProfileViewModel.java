package com.transsion.usercenter.profile;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.therouter.TheRouter;
import com.transsion.usercenter.profile.bean.ProfileEntranceInfo;
import com.transsion.usercenter.profile.bean.ProfileInfo;
import com.transsnet.loginapi.bean.UserInfo;
import io.reactivex.rxjava3.core.AbstractC24093j;
import io.reactivex.rxjava3.core.InterfaceC24096m;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p349dh.C22982c;
import p441gz.InterfaceC23704a;
import p666oz.InterfaceC26758f;
import p666oz.InterfaceC26760h;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f65153b;

    /* JADX INFO: renamed from: c */
    private final Lazy f65154c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f65155d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f65156e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f65157f;

    /* JADX INFO: renamed from: g */
    private InterfaceC24104c f65158g;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileViewModel$a */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class C20638a extends AbstractC28362a {
        C20638a() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fetchEntrance: error:");
            sb2.append(str2);
            ProfileViewModel.this.m85265l().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(ProfileEntranceInfo profileEntranceInfo) {
            super.mo66458c(profileEntranceInfo);
            ProfileViewModel.this.m85265l().mo14858q(profileEntranceInfo);
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileViewModel$b */
    /* JADX INFO: loaded from: classes7.dex */
    static final class C20639b implements InterfaceC26760h {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f65160a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ProfileViewModel f65161b;

        C20639b(String str, ProfileViewModel profileViewModel) {
            this.f65160a = str;
            this.f65161b = profileViewModel;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002d  */
        @Override // p666oz.InterfaceC26760h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC24096m apply(Throwable it) {
            String string;
            UserInfo userInfoMo90386h;
            Intrinsics.m97802h(it, "it");
            String str = this.f65160a;
            if (str == null || str.length() == 0) {
                string = C20663e0.f65192a.m85330b().getString("PROFILE_JSON", null);
                if (string != null && string.length() != 0) {
                    try {
                        ProfileInfo profileInfo = (ProfileInfo) AbstractC5796o.m27441d(string, ProfileInfo.class);
                        BaseDto baseDto = new BaseDto();
                        baseDto.setCode("0");
                        baseDto.setData(profileInfo);
                        return AbstractC24093j.m95068t(baseDto);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } else {
                String str2 = this.f65160a;
                InterfaceC23704a interfaceC23704aM85258n = this.f65161b.m85258n();
                if (Intrinsics.m97797c(str2, (interfaceC23704aM85258n == null || (userInfoMo90386h = interfaceC23704aM85258n.mo90386h()) == null) ? null : userInfoMo90386h.getUserId())) {
                    string = C20663e0.f65192a.m85330b().getString("PROFILE_JSON", null);
                    if (string != null) {
                        ProfileInfo profileInfo2 = (ProfileInfo) AbstractC5796o.m27441d(string, ProfileInfo.class);
                        BaseDto baseDto2 = new BaseDto();
                        baseDto2.setCode("0");
                        baseDto2.setData(profileInfo2);
                        return AbstractC24093j.m95068t(baseDto2);
                    }
                }
            }
            return AbstractC24093j.m95065l(it);
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileViewModel$c */
    /* JADX INFO: loaded from: classes7.dex */
    static final class C20640c implements InterfaceC26758f {

        /* JADX INFO: renamed from: a */
        public static final C20640c f65162a = new C20640c();

        C20640c() {
        }

        @Override // p666oz.InterfaceC26758f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(BaseDto it) {
            Intrinsics.m97802h(it, "it");
            ProfileInfo profileInfo = (ProfileInfo) it.getData();
            if (profileInfo != null) {
                C20663e0.f65192a.m85330b().putString("PROFILE_JSON", AbstractC5796o.m27447j(profileInfo));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.ProfileViewModel$d */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class C20641d extends AbstractC28362a {
        C20641d() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            ProfileViewModel.this.f65155d.mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(ProfileInfo profileInfo) {
            super.mo66458c(profileInfo);
            ProfileViewModel.this.f65155d.mo14858q(profileInfo);
        }

        @Override // p871wg.AbstractC28362a, io.reactivex.rxjava3.core.InterfaceC24098o
        public void onSubscribe(InterfaceC24104c d11) {
            Intrinsics.m97802h(d11, "d");
            super.onSubscribe(d11);
            ProfileViewModel.this.f65158g = d11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f65153b = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileViewModel.m85260q();
            }
        });
        this.f65154c = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.profile.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileViewModel.m85261r();
            }
        });
        this.f65155d = new C3187b0();
        this.f65156e = new C3187b0();
        this.f65157f = new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC23704a m85258n() {
        return (InterfaceC23704a) this.f65153b.getValue();
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC20647b m85259o() {
        return (InterfaceC20647b) this.f65154c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC23704a m85260q() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC20647b m85261r() {
        return (InterfaceC20647b) C22982c.f70163e.m91553a().m91552h(InterfaceC20647b.class);
    }

    /* JADX INFO: renamed from: i */
    public final void m85262i() {
        InterfaceC20647b.a.m85297g(m85259o(), null, 1, null).m95088v(AbstractC27875a.m108402c()).m95079f(C28365d.f87067a.m109702c()).subscribe(new C20638a());
    }

    /* JADX INFO: renamed from: j */
    public final void m85263j() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ProfileViewModel$fetchLatestDownloadList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m85264k(String str) {
        InterfaceC24104c interfaceC24104c;
        InterfaceC24104c interfaceC24104c2 = this.f65158g;
        if (interfaceC24104c2 != null && !interfaceC24104c2.isDisposed() && (interfaceC24104c = this.f65158g) != null) {
            interfaceC24104c.dispose();
        }
        InterfaceC20647b.a.m85298h(m85259o(), str == null ? "" : str, null, 2, null).m95088v(AbstractC27875a.m108402c()).m95090x(new C20639b(str, this)).m95080h(C20640c.f65162a).m95079f(C28365d.f87067a.m109702c()).subscribe(new C20641d());
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m85265l() {
        return this.f65157f;
    }

    /* JADX INFO: renamed from: m */
    public final LiveData m85266m() {
        return this.f65156e;
    }

    /* JADX INFO: renamed from: p */
    public final LiveData m85267p() {
        return this.f65155d;
    }
}
