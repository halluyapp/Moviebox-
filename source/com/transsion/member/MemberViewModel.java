package com.transsion.member;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.therouter.TheRouter;
import com.transsion.member.bean.request.InviteUserShareInfoReq;
import com.transsion.member.constants.TaskType;
import com.transsion.memberapi.MemberAdTaskInfo;
import com.transsion.memberapi.MemberDetail;
import com.transsion.memberapi.MemberTaskGroup;
import com.transsion.memberapi.MemberTaskInfo;
import com.transsion.memberapi.MemberTaskInviteRewards;
import com.transsion.memberapi.MemberTaskItem;
import com.transsion.memberapi.MemberTaskItemCheckInInfo;
import com.transsion.memberapi.MemberTaskItemInvite;
import com.transsion.memberapi.MemberTaskRewardInfo;
import com.transsion.memberapi.MemberTaskSubmitCheckInRes;
import com.transsion.memberapi.SkuData;
import com.transsion.memberapi.SkuItem;
import com.transsion.payment.lib.bean.HttpErrorBodyBean;
import io.reactivex.rxjava3.core.AbstractC24093j;
import io.reactivex.rxjava3.core.InterfaceC24096m;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p017an.InterfaceC0127a;
import p349dh.C22982c;
import p352dn.C23001e;
import p352dn.C23005i;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC23000d;
import p666oz.InterfaceC26758f;
import p666oz.InterfaceC26759g;
import p666oz.InterfaceC26760h;
import p787ti.C27821b;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import p978zg.C29182a;
import pg.C26866a;
import retrofit2.HttpException;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes5.dex */
public final class MemberViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: o */
    public static final C15763a f54172o = new C15763a(null);

    /* JADX INFO: renamed from: p */
    public static final int f54173p = 8;

    /* JADX INFO: renamed from: b */
    private final Lazy f54174b;

    /* JADX INFO: renamed from: c */
    private final Lazy f54175c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f54176d;

    /* JADX INFO: renamed from: e */
    private final C3187b0 f54177e;

    /* JADX INFO: renamed from: f */
    private final C3187b0 f54178f;

    /* JADX INFO: renamed from: g */
    private final C3187b0 f54179g;

    /* JADX INFO: renamed from: h */
    private final C3187b0 f54180h;

    /* JADX INFO: renamed from: i */
    private final C3187b0 f54181i;

    /* JADX INFO: renamed from: j */
    private final C3187b0 f54182j;

    /* JADX INFO: renamed from: k */
    private final C3187b0 f54183k;

    /* JADX INFO: renamed from: l */
    private Map f54184l;

    /* JADX INFO: renamed from: m */
    private InterfaceC24104c f54185m;

    /* JADX INFO: renamed from: n */
    private InterfaceC24104c f54186n;

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$a */
    public static final class C15763a {
        private C15763a() {
        }

        public /* synthetic */ C15763a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$b */
    static final class C15764b implements InterfaceC26758f {

        /* JADX INFO: renamed from: a */
        public static final C15764b f54187a = new C15764b();

        C15764b() {
        }

        @Override // p666oz.InterfaceC26758f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(BaseDto it) {
            Intrinsics.m97802h(it, "it");
            MemberDetail memberDetail = (MemberDetail) it.getData();
            if (memberDetail != null) {
                C15886w.f54411a.m70116b().putString("MEMBER_JSON", AbstractC5796o.m27447j(memberDetail));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$c */
    public static final class C15765c extends AbstractC28362a {
        C15765c() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            MemberViewModel.this.f54176d.mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MemberDetail memberDetail) {
            super.mo66458c(memberDetail);
            MemberViewModel.this.f54176d.mo14858q(memberDetail);
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            if (interfaceC22998b != null) {
                interfaceC22998b.mo69857k(memberDetail);
            }
        }

        @Override // p871wg.AbstractC28362a, io.reactivex.rxjava3.core.InterfaceC24098o
        public void onSubscribe(InterfaceC24104c d11) {
            Intrinsics.m97802h(d11, "d");
            super.onSubscribe(d11);
            MemberViewModel.this.f54185m = d11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$d */
    public static final class C15766d implements InterfaceC23000d {
        C15766d() {
        }

        @Override // p352dn.InterfaceC23000d
        /* JADX INFO: renamed from: a */
        public void mo22827a(MemberAdTaskInfo memberAdTaskInfo, boolean z11) {
            InterfaceC23000d.a.m91588a(this, memberAdTaskInfo, z11);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:54:0x00e2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[SYNTHETIC] */
        @Override // p352dn.InterfaceC23000d
        /* JADX INFO: renamed from: b */
        public void mo22828b(MemberTaskInfo memberTaskInfo, boolean z11) {
            List<MemberTaskGroup> arrayList;
            ArrayList arrayList2 = new ArrayList();
            if (memberTaskInfo == null || (arrayList = memberTaskInfo.getList()) == null) {
                arrayList = new ArrayList<>();
            }
            for (MemberTaskGroup memberTaskGroup : arrayList) {
                List<MemberTaskItem> taskItems = memberTaskGroup.getTaskItems();
                if (!taskItems.isEmpty()) {
                    MemberTaskItem memberTaskItem = (MemberTaskItem) CollectionsKt.m97359i0(taskItems);
                    List<MemberTaskItemInvite> inviteList = memberTaskItem.getInviteList();
                    boolean z12 = false;
                    boolean z13 = inviteList != null && (inviteList.isEmpty() ^ true);
                    List<MemberTaskItemCheckInInfo> checkInList = memberTaskItem.getCheckInList();
                    if (checkInList != null && (!checkInList.isEmpty())) {
                        z12 = true;
                    }
                    if (z13 || z12) {
                        arrayList2.add(new MemberTaskItem(null, null, Integer.valueOf(TaskType.TITLE.getValue()), null, null, memberTaskGroup.getGroupName(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, memberTaskGroup.getGroupName(), memberTaskGroup.getGroupUrl(), memberTaskGroup.getGroupInfo(), 2097115, null));
                        for (MemberTaskItem memberTaskItem2 : taskItems) {
                            Integer taskSubType = memberTaskItem2.getTaskSubType();
                            int value = TaskType.DOWNLOAD_APP.getValue();
                            if (taskSubType == null || taskSubType.intValue() != value) {
                                Integer taskSubType2 = memberTaskItem2.getTaskSubType();
                                int value2 = TaskType.OPEN_APP.getValue();
                                if (taskSubType2 != null && taskSubType2.intValue() == value2) {
                                    if (C27821b.f85501a.m108171n()) {
                                    }
                                }
                                arrayList2.add(memberTaskItem2);
                            } else if (C27821b.f85501a.m108171n()) {
                                arrayList2.add(memberTaskItem2);
                            }
                        }
                    }
                }
            }
            MemberViewModel.this.f54179g.mo14858q(arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$e */
    static final class C15767e implements InterfaceC26760h {

        /* JADX INFO: renamed from: a */
        public static final C15767e f54190a = new C15767e();

        C15767e() {
        }

        @Override // p666oz.InterfaceC26760h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC24096m apply(Throwable it) {
            Intrinsics.m97802h(it, "it");
            String string = C15886w.f54411a.m70116b().getString("SKU_LIST_JSON", null);
            if (string == null || string.length() == 0) {
                return AbstractC24093j.m95065l(it);
            }
            try {
                SkuData skuData = (SkuData) AbstractC5796o.m27442e(string, AbstractC5796o.m27445h(SkuData.class, new Type[0]));
                BaseDto baseDto = new BaseDto();
                baseDto.setCode("0");
                baseDto.setData(skuData);
                return AbstractC24093j.m95068t(baseDto);
            } catch (Exception unused) {
                return AbstractC24093j.m95065l(it);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$f */
    static final class C15768f implements InterfaceC26758f {

        /* JADX INFO: renamed from: a */
        public static final C15768f f54191a = new C15768f();

        C15768f() {
        }

        @Override // p666oz.InterfaceC26758f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(BaseDto it) {
            Intrinsics.m97802h(it, "it");
            SkuData skuData = (SkuData) it.getData();
            if (skuData != null) {
                List<SkuItem> skuList = skuData.getSkuList();
                List<SkuItem> listK0 = skuList != null ? CollectionsKt.m97333K0(skuList, 3) : null;
                if (listK0 == null) {
                    listK0 = CollectionsKt.m97506l();
                }
                skuData.setSkuList(listK0);
                List<SkuItem> skuPointList = skuData.getSkuPointList();
                List<SkuItem> listK1 = skuPointList != null ? CollectionsKt.m97333K0(skuPointList, 3) : null;
                if (listK1 == null) {
                    listK1 = CollectionsKt.m97506l();
                }
                skuData.setSkuPointList(listK1);
                C15886w.f54411a.m70116b().putString("SKU_LIST_JSON", AbstractC5796o.m27447j(skuData));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$g */
    public static final class C15769g extends AbstractC28362a {
        C15769g() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            MemberViewModel.this.f54177e.mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(SkuData skuData) {
            super.mo66458c(skuData);
            MemberViewModel.this.f54177e.mo14858q(skuData);
        }

        @Override // p871wg.AbstractC28362a, io.reactivex.rxjava3.core.InterfaceC24098o
        public void onSubscribe(InterfaceC24104c d11) {
            Intrinsics.m97802h(d11, "d");
            super.onSubscribe(d11);
            MemberViewModel.this.f54186n = d11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$h */
    public static final class C15770h extends AbstractC28362a {
        C15770h() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15777a.f54210a.m69948b("requestInviteUserMore failed " + str + ", " + str2);
            MemberViewModel.this.f54182j.mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MemberTaskInviteRewards memberTaskInviteRewards) {
            super.mo66458c(memberTaskInviteRewards);
            C15777a.f54210a.m69948b("requestInviteUserMore onSuccess:" + memberTaskInviteRewards);
            MemberViewModel.this.f54182j.mo14858q(memberTaskInviteRewards);
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$i */
    static final class C15771i implements InterfaceC26759g {

        /* JADX INFO: renamed from: a */
        public static final C15771i f54194a = new C15771i();

        C15771i() {
        }

        @Override // p666oz.InterfaceC26759g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Triple mo69926a(BaseDto response1, BaseDto response2, BaseDto response3) {
            Intrinsics.m97802h(response1, "response1");
            Intrinsics.m97802h(response2, "response2");
            Intrinsics.m97802h(response3, "response3");
            return new Triple(response1.getData(), response2.getData(), response3.getData());
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$j */
    static final class C15772j implements InterfaceC26758f {
        C15772j() {
        }

        @Override // p666oz.InterfaceC26758f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Triple it) {
            Intrinsics.m97802h(it, "it");
            C3187b0 c3187b0 = MemberViewModel.this.f54183k;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("WhatsApp", it.getFirst());
            linkedHashMap.put("Telegram", it.getSecond());
            linkedHashMap.put("CopyLink", it.getThird());
            c3187b0.mo14858q(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$k */
    static final class C15773k implements InterfaceC26758f {
        C15773k() {
        }

        @Override // p666oz.InterfaceC26758f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            Intrinsics.m97802h(it, "it");
            MemberViewModel.this.f54183k.mo14858q(new LinkedHashMap());
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$l */
    public static final class C15774l extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f54198e;

        C15774l(int i11) {
            this.f54198e = i11;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15777a.f54210a.m69948b("taskCheckInSubmit failed " + str + ", " + str2);
            MemberViewModel.this.f54180h.mo14858q(new Pair(Integer.valueOf(this.f54198e), null));
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MemberTaskSubmitCheckInRes memberTaskSubmitCheckInRes) {
            super.mo66458c(memberTaskSubmitCheckInRes);
            MemberViewModel.this.f54180h.mo14858q(new Pair(Integer.valueOf(this.f54198e), memberTaskSubmitCheckInRes));
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberViewModel$m */
    public static final class C15775m extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f54200e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f54201f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f54202g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f54203h;

        C15775m(int i11, String str, int i12, int i13) {
            this.f54200e = i11;
            this.f54201f = str;
            this.f54202g = i12;
            this.f54203h = i13;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15777a.f54210a.m69948b("taskCheckInSubmit failed " + str + ", " + str2);
            MemberViewModel.this.f54181i.mo14858q(new C23001e(-this.f54200e, this.f54201f, this.f54202g, this.f54203h, null));
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MemberTaskRewardInfo memberTaskRewardInfo) {
            super.mo66458c(memberTaskRewardInfo);
            MemberViewModel.this.f54181i.mo14858q(new C23001e(this.f54200e, this.f54201f, this.f54202g, this.f54203h, memberTaskRewardInfo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f54174b = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MemberViewModel.m69882F();
            }
        });
        this.f54175c = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MemberViewModel.m69883G();
            }
        });
        this.f54176d = new C3187b0();
        this.f54177e = new C3187b0();
        this.f54178f = new C3187b0();
        this.f54179g = new C3187b0();
        this.f54180h = new C3187b0();
        this.f54181i = new C3187b0();
        this.f54182j = new C3187b0();
        this.f54183k = new C3187b0();
        this.f54184l = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final InterfaceC0127a m69882F() {
        return (InterfaceC0127a) C22982c.f70163e.m91553a().m91552h(InterfaceC0127a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final InterfaceC22998b m69883G() {
        return (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
    }

    /* JADX INFO: renamed from: H */
    private final void m69884H() {
        SkuData skuData = (SkuData) C23005i.f70224a.m91598b().m14847f();
        C26866a.a.m104898f(C26866a.f81698a, "MemberViewModel", "Preload skuCache is " + skuData, false, 4, null);
        this.f54177e.mo14858q(skuData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    public final Object m69885I(SkuItem skuItem, Continuation continuation) throws Throwable {
        MemberViewModel$redeem$1 memberViewModel$redeem$1;
        String message;
        String code;
        String reason;
        if (continuation instanceof MemberViewModel$redeem$1) {
            memberViewModel$redeem$1 = (MemberViewModel$redeem$1) continuation;
            int i11 = memberViewModel$redeem$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                memberViewModel$redeem$1.label = i11 - Integer.MIN_VALUE;
            } else {
                memberViewModel$redeem$1 = new MemberViewModel$redeem$1(this, continuation);
            }
        } else {
            memberViewModel$redeem$1 = new MemberViewModel$redeem$1(this, continuation);
        }
        Object objM569a = memberViewModel$redeem$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = memberViewModel$redeem$1.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM569a);
                Result.Companion companion = Result.INSTANCE;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("skuId", skuItem.getSkuId());
                if (this.f54184l.get(skuItem.getSkuId()) != null) {
                    jSONObject.put("clientOrderId", this.f54184l.get(skuItem.getSkuId()));
                } else {
                    jSONObject.put("clientOrderId", UUID.randomUUID().toString());
                    this.f54184l.put(skuItem.getSkuId(), jSONObject.getString("clientOrderId"));
                }
                RequestBody.Companion companion2 = RequestBody.INSTANCE;
                String string = jSONObject.toString();
                Intrinsics.m97801g(string, "toString(...)");
                RequestBody requestBodyCreate = companion2.create(string, MediaType.INSTANCE.parse("application/json"));
                InterfaceC0127a interfaceC0127aM69900u = m69900u();
                String strM111992a = C29182a.f89053a.m111992a();
                memberViewModel$redeem$1.label = 1;
                objM569a = interfaceC0127aM69900u.m569a(strM111992a, requestBodyCreate, memberViewModel$redeem$1);
                if (objM569a == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(objM569a);
            }
            return objM569a;
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(Result.m112707constructorimpl(ResultKt.m97106a(th2)));
            if (thM112710exceptionOrNullimpl == null) {
                throw new KotlinNothingValueException();
            }
            if (!(thM112710exceptionOrNullimpl instanceof HttpException)) {
                C26866a.a.m104901l(C26866a.f81698a, "MemberViewModel", "it = " + thM112710exceptionOrNullimpl, false, 4, null);
                return null;
            }
            HttpErrorBodyBean httpErrorBodyBeanM71456a = HttpErrorBodyBean.INSTANCE.m71456a((HttpException) thM112710exceptionOrNullimpl);
            String str = "";
            if (httpErrorBodyBeanM71456a == null || (message = httpErrorBodyBeanM71456a.getMessage()) == null) {
                message = "";
            }
            if (httpErrorBodyBeanM71456a == null || (code = httpErrorBodyBeanM71456a.getCode()) == null) {
                code = "";
            }
            if (httpErrorBodyBeanM71456a != null && (reason = httpErrorBodyBeanM71456a.getReason()) != null) {
                str = reason;
            }
            return new BaseDto(message, code, null, str);
        }
    }

    /* JADX INFO: renamed from: u */
    private final InterfaceC0127a m69900u() {
        return (InterfaceC0127a) this.f54174b.getValue();
    }

    /* JADX INFO: renamed from: w */
    private final InterfaceC22998b m69901w() {
        return (InterfaceC22998b) this.f54175c.getValue();
    }

    /* JADX INFO: renamed from: A */
    public final LiveData m69902A() {
        return this.f54177e;
    }

    /* JADX INFO: renamed from: B */
    public final LiveData m69903B() {
        return this.f54180h;
    }

    /* JADX INFO: renamed from: C */
    public final LiveData m69904C() {
        return this.f54181i;
    }

    /* JADX INFO: renamed from: D */
    public final LiveData m69905D() {
        return this.f54179g;
    }

    /* JADX INFO: renamed from: E */
    public final void m69906E() {
        String string = C15886w.f54411a.m70116b().getString("MEMBER_JSON", null);
        if (string != null && string.length() != 0) {
            try {
                this.f54176d.mo14858q((MemberDetail) AbstractC5796o.m27441d(string, MemberDetail.class));
            } catch (Exception e11) {
                C26866a.a.m104898f(C26866a.f81698a, "MemberViewModel", "No member detail cache " + e11, false, 4, null);
            }
        }
        String string2 = C15886w.f54411a.m70116b().getString("SKU_LIST_JSON", null);
        if (string2 == null || string2.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, "MemberViewModel", "Preload sku local cache", false, 4, null);
            m69884H();
        } else {
            try {
                this.f54177e.mo14858q((SkuData) AbstractC5796o.m27442e(string2, AbstractC5796o.m27445h(SkuData.class, new Type[0])));
                C26866a.a.m104898f(C26866a.f81698a, "MemberViewModel", "Sku list mmkv cache exists", false, 4, null);
            } catch (Exception unused) {
                C26866a.a.m104898f(C26866a.f81698a, "MemberViewModel", "No Sku list mmkv cache that needs to preload sku local cache", false, 4, null);
                m69884H();
            }
        }
        m69913r();
    }

    /* JADX INFO: renamed from: J */
    public final void m69907J(SkuItem skuItem) {
        Intrinsics.m97802h(skuItem, "skuItem");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new MemberViewModel$redeemProduct$1(this, skuItem, null), 3, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m69908K(int i11, int i12) {
        InterfaceC0127a.a.m584a(m69900u(), null, i11, i12, 1, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15770h());
    }

    /* JADX INFO: renamed from: L */
    public final void m69909L() {
        AbstractC24093j.m95059H(InterfaceC0127a.a.m585b(m69900u(), null, new InviteUserShareInfoReq(null, "WhatsApp", null, 5, null), 1, null), InterfaceC0127a.a.m585b(m69900u(), null, new InviteUserShareInfoReq(null, "Telegram", null, 5, null), 1, null), InterfaceC0127a.a.m585b(m69900u(), null, new InviteUserShareInfoReq(null, "CopyLink", null, 5, null), 1, null), C15771i.f54194a).m95079f(C28365d.f87067a.m109702c()).m95070B(new C15772j(), new C15773k());
    }

    /* JADX INFO: renamed from: M */
    public final void m69910M(int i11) {
        InterfaceC0127a.a.m591h(m69900u(), null, null, 3, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15774l(i11));
    }

    /* JADX INFO: renamed from: N */
    public final void m69911N(int i11, String rewardId, int i12, int i13) {
        Intrinsics.m97802h(rewardId, "rewardId");
        InterfaceC0127a.a.m589f(m69900u(), null, rewardId, 1, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15775m(i11, rewardId, i12, i13));
    }

    /* JADX INFO: renamed from: q */
    public final void m69912q() {
        InterfaceC24104c interfaceC24104c;
        InterfaceC24104c interfaceC24104c2 = this.f54185m;
        if (interfaceC24104c2 != null && !interfaceC24104c2.isDisposed() && (interfaceC24104c = this.f54185m) != null) {
            interfaceC24104c.dispose();
        }
        InterfaceC0127a.a.m586c(m69900u(), null, 1, null).m95088v(AbstractC27875a.m108402c()).m95080h(C15764b.f54187a).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15765c());
    }

    /* JADX INFO: renamed from: r */
    public final void m69913r() {
        InterfaceC22998b interfaceC22998bM69901w = m69901w();
        if (interfaceC22998bM69901w != null) {
            interfaceC22998bM69901w.mo69861o(new C15766d());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m69914s() {
        InterfaceC24104c interfaceC24104c;
        InterfaceC24104c interfaceC24104c2 = this.f54186n;
        if (interfaceC24104c2 != null && !interfaceC24104c2.isDisposed() && (interfaceC24104c = this.f54186n) != null) {
            interfaceC24104c.dispose();
        }
        InterfaceC0127a.a.m588e(m69900u(), null, 1, null).m95088v(AbstractC27875a.m108402c()).m95090x(C15767e.f54190a).m95080h(C15768f.f54191a).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15769g());
    }

    /* JADX INFO: renamed from: t */
    public final LiveData m69915t() {
        return this.f54182j;
    }

    /* JADX INFO: renamed from: v */
    public final LiveData m69916v() {
        return this.f54176d;
    }

    /* JADX INFO: renamed from: x */
    public final LiveData m69917x() {
        return this.f54178f;
    }

    /* JADX INFO: renamed from: y */
    public final LiveData m69918y() {
        return this.f54183k;
    }

    /* JADX INFO: renamed from: z */
    public final SkuData m69919z() {
        return (SkuData) this.f54177e.m14847f();
    }
}
