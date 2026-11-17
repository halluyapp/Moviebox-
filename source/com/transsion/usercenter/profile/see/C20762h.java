package com.transsion.usercenter.profile.see;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.usercenter.profile.InterfaceC20647b;
import com.transsion.usercenter.profile.see.bean.ProfileSeeData;
import com.transsion.usercenter.profile.see.bean.ProfileSeeItem;
import com.transsion.usercenter.profile.see.bean.ProfileSeeMultiItemData;
import com.transsion.usercenter.profile.see.bean.ProfileSeeStaffItem;
import com.transsion.usercenter.profile.see.bean.ProfileSeeSubjectItem;
import com.transsion.usercenter.profile.see.bean.ProfileSeeTimeItem;
import com.transsnet.downloader.viewmodel.C22149a0;
import io.reactivex.rxjava3.core.AbstractC24093j;
import io.reactivex.rxjava3.core.InterfaceC24096m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p349dh.C22982c;
import p666oz.InterfaceC26760h;
import p871wg.AbstractC28362a;
import p871wg.C28365d;

/* JADX INFO: renamed from: com.transsion.usercenter.profile.see.h */
/* JADX INFO: loaded from: classes7.dex */
public final class C20762h extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Lazy f65352b;

    /* JADX INFO: renamed from: c */
    private int f65353c;

    /* JADX INFO: renamed from: d */
    private int f65354d;

    /* JADX INFO: renamed from: e */
    private ArrayList f65355e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f65356f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f65357g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f65358h;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.see.h$a */
    static final class a implements InterfaceC26760h {
        a() {
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
        @Override // p666oz.InterfaceC26760h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC24096m apply(BaseDto it) {
            ArrayList arrayList;
            Iterable iterableEmptyList;
            Intrinsics.m97802h(it, "it");
            ProfileSeeData profileSeeData = (ProfileSeeData) it.getData();
            if (profileSeeData != null) {
                C20762h c20762h = C20762h.this;
                List<ProfileSeeItem> items = profileSeeData.getItems();
                if (items != null) {
                    arrayList = new ArrayList();
                    for (ProfileSeeItem profileSeeItem : items) {
                        ProfileSeeSubjectItem subject = profileSeeItem.getSubject();
                        ProfileSeeStaffItem staff = profileSeeItem.getStaff();
                        if (subject != null) {
                            String mySeeTime = subject.getMySeeTime();
                            String strM85524j = c20762h.m85524j(mySeeTime != null ? Long.parseLong(mySeeTime) : 0L);
                            if (c20762h.f65355e.contains(strM85524j)) {
                                iterableEmptyList = CollectionsKt.m97502h(subject);
                            } else {
                                c20762h.f65355e.add(strM85524j);
                                iterableEmptyList = CollectionsKt.m97502h(new ProfileSeeTimeItem(strM85524j), subject);
                            }
                        } else if (staff != null) {
                            String mySeeTime2 = staff.getMySeeTime();
                            String strM85524j2 = c20762h.m85524j(mySeeTime2 != null ? Long.parseLong(mySeeTime2) : 0L);
                            if (c20762h.f65355e.contains(strM85524j2)) {
                                iterableEmptyList = CollectionsKt.m97502h(staff);
                            } else {
                                c20762h.f65355e.add(strM85524j2);
                                iterableEmptyList = CollectionsKt.m97502h(new ProfileSeeTimeItem(strM85524j2), staff);
                            }
                        } else {
                            iterableEmptyList = Collections.emptyList();
                        }
                        Intrinsics.m97799e(iterableEmptyList);
                        CollectionsKt.m97521B(arrayList, iterableEmptyList);
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
            } else {
                arrayList = new ArrayList();
            }
            BaseDto baseDto = new BaseDto();
            ProfileSeeData profileSeeData2 = (ProfileSeeData) it.getData();
            baseDto.setData(new ProfileSeeMultiItemData(profileSeeData2 != null ? profileSeeData2.getPager() : null, arrayList));
            baseDto.setCode(it.getCode());
            baseDto.setMsg(it.getMsg());
            baseDto.setReason(it.getReason());
            return AbstractC24093j.m95068t(baseDto);
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.see.h$b */
    public static final class b extends AbstractC28362a {
        b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C20762h.this.f65356f.mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(ProfileSeeMultiItemData profileSeeMultiItemData) {
            Pager pager;
            super.mo66458c(profileSeeMultiItemData);
            C20762h.this.f65356f.mo14858q(profileSeeMultiItemData);
            if (profileSeeMultiItemData == null || (pager = profileSeeMultiItemData.getPager()) == null) {
                return;
            }
            C20762h c20762h = C20762h.this;
            String nextPage = pager.getNextPage();
            c20762h.f65353c = nextPage != null ? Integer.parseInt(nextPage) : 1;
            Integer perPage = pager.getPerPage();
            c20762h.f65354d = perPage != null ? perPage.intValue() : 10;
            C3187b0 c3187b0 = c20762h.f65358h;
            int totalCount = pager.getTotalCount();
            if (totalCount == null) {
                totalCount = 0;
            }
            c3187b0.mo14858q(totalCount);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20762h(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f65352b = LazyKt.m97096a(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.transsion.usercenter.profile.see.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C20762h.m85526p();
            }
        });
        this.f65353c = 1;
        this.f65354d = 10;
        this.f65355e = new ArrayList();
        this.f65356f = new C3187b0();
        this.f65357g = new C3187b0();
        this.f65358h = new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final String m85524j(long j11) {
        return C22149a0.f68261a.m89781z(j11 * ((long) 1000));
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC20647b m85525m() {
        return (InterfaceC20647b) this.f65352b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC20647b m85526p() {
        return (InterfaceC20647b) C22982c.f70163e.m91553a().m91552h(InterfaceC20647b.class);
    }

    /* JADX INFO: renamed from: k */
    public final LiveData m85527k() {
        return this.f65358h;
    }

    /* JADX INFO: renamed from: l */
    public final LiveData m85528l() {
        return this.f65357g;
    }

    /* JADX INFO: renamed from: n */
    public final LiveData m85529n() {
        return this.f65356f;
    }

    /* JADX INFO: renamed from: o */
    public final void m85530o(String userId, int i11) {
        Intrinsics.m97802h(userId, "userId");
        InterfaceC20647b.a.m85299i(m85525m(), userId, this.f65353c, this.f65354d, i11, null, 16, null).m95082n(new a()).m95079f(C28365d.f87067a.m109702c()).subscribe(new b());
    }

    /* JADX INFO: renamed from: q */
    public final void m85531q(String userId, int i11) {
        Intrinsics.m97802h(userId, "userId");
        this.f65353c = 1;
        this.f65354d = 10;
        this.f65355e.clear();
        m85530o(userId, i11);
    }
}
