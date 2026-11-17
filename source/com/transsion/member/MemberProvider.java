package com.transsion.member;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import cn.C5144k;
import com.blankj.utilcode.util.AbstractC5775a;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5796o;
import com.google.gson.JsonObject;
import com.p282tn.lib.net.bean.BaseDto;
import com.therouter.TheRouter;
import com.transsion.baseui.fragment.EmptyFragment;
import com.transsion.member.dialog.CheckMemberRightsLoadingDialog;
import com.transsion.member.dialog.ClaimMemberDialog;
import com.transsion.member.dialog.MemberGuideDialog;
import com.transsion.member.dialog.MemberMiddleStateDialog;
import com.transsion.member.dialog.PurchaseSucceedDialog;
import com.transsion.memberapi.GlobalTaskInfo;
import com.transsion.memberapi.MemberAdTaskInfo;
import com.transsion.memberapi.MemberCheckResult;
import com.transsion.memberapi.MemberDetail;
import com.transsion.memberapi.MemberInfo;
import com.transsion.memberapi.MemberSceneType;
import com.transsion.memberapi.MemberSource;
import com.transsion.memberapi.MemberTaskInfo;
import com.transsion.memberapi.MemberTaskItem;
import com.transsion.memberapi.OpType;
import com.transsion.memberapi.TaskRewards;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.flow.AbstractC25021i1;
import kotlinx.coroutines.flow.InterfaceC25018h1;
import kotlinx.coroutines.flow.InterfaceC25075x0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import p017an.InterfaceC0127a;
import p349dh.C22982c;
import p352dn.InterfaceC22997a;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC22999c;
import p352dn.InterfaceC23000d;
import p352dn.InterfaceC23002f;
import p352dn.InterfaceC23006j;
import p666oz.InterfaceC26758f;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import p944yh.C28951b;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes.dex */
public final class MemberProvider implements InterfaceC22998b {

    /* JADX INFO: renamed from: b */
    private volatile MemberDetail f54156b;

    /* JADX INFO: renamed from: c */
    private volatile MemberTaskInfo f54157c;

    /* JADX INFO: renamed from: g */
    private ClaimMemberDialog f54161g;

    /* JADX INFO: renamed from: a */
    private final Lazy f54155a = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MemberProvider.m69841W();
        }
    });

    /* JADX INFO: renamed from: d */
    private final InterfaceC25075x0 f54158d = AbstractC25021i1.m98823a(null);

    /* JADX INFO: renamed from: e */
    private final InterfaceC25075x0 f54159e = AbstractC25021i1.m98823a(Boolean.FALSE);

    /* JADX INFO: renamed from: f */
    private String f54160f = "";

    /* JADX INFO: renamed from: com.transsion.member.MemberProvider$a */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15755a extends AbstractC28362a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function2 f54162d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Function1 f54163e;

        C15755a(Function2 function2, Function1 function1) {
            this.f54162d = function2;
            this.f54163e = function1;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15777a.f54210a.m69948b("claimTaskReward error:" + str2);
            Function2 function2 = this.f54162d;
            if (function2 != null) {
                function2.invoke(str, str2);
            }
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(TaskRewards taskRewards) {
            C15777a.f54210a.m69947a("claimTaskReward success");
            Function1 function1 = this.f54163e;
            if (function1 != null) {
                function1.invoke(taskRewards);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberProvider$b */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15756b extends AbstractC28362a {
        C15756b() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15777a.f54210a.m69948b("fetchGlobalTasks failed, code: " + str + ", message: " + str2);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(GlobalTaskInfo globalTaskInfo) {
            super.mo66458c(globalTaskInfo);
            if (globalTaskInfo == null) {
                C15777a.f54210a.m69948b("fetchGlobalTasks data error");
                return;
            }
            C15777a.f54210a.m69947a("fetchGlobalTasks succeed " + globalTaskInfo.getTaskInfo());
            MemberProvider.this.f54158d.setValue(globalTaskInfo.getTaskInfo());
            MemberProvider.this.f54159e.setValue(Boolean.valueOf(globalTaskInfo.getTaskInfo() != null));
            C5144k.f17646a.m24038T(globalTaskInfo.getGlobalTaskConf());
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberProvider$c */
    /* JADX INFO: loaded from: classes5.dex */
    static final class C15757c implements InterfaceC26758f {

        /* JADX INFO: renamed from: a */
        public static final C15757c f54165a = new C15757c();

        C15757c() {
        }

        @Override // p666oz.InterfaceC26758f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(BaseDto it) {
            Intrinsics.m97802h(it, "it");
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberProvider$d */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15758d extends AbstractC28362a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC23000d f54166d;

        C15758d(InterfaceC23000d interfaceC23000d) {
            this.f54166d = interfaceC23000d;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15777a.f54210a.m69948b("fetchMemberAdTaskInfo onFailure:" + str + ", " + str2);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MemberAdTaskInfo memberAdTaskInfo) {
            super.mo66458c(memberAdTaskInfo);
            C15777a.f54210a.m69948b("fetchMemberAdTaskInfo onSuccess:" + memberAdTaskInfo);
            InterfaceC23000d interfaceC23000d = this.f54166d;
            if (interfaceC23000d != null) {
                interfaceC23000d.mo22827a(memberAdTaskInfo, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberProvider$e */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15759e extends AbstractC28362a {
        C15759e() {
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15777a.f54210a.m69948b("Fetch member detail failed " + str + ", " + str2);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MemberDetail memberDetail) {
            super.mo66458c(memberDetail);
            if (memberDetail == null) {
                C15777a.f54210a.m69948b("Fetch member detail failed");
                return;
            }
            C15777a.f54210a.m69947a("Fetch member detail succeed " + memberDetail);
            MemberProvider.this.f54156b = memberDetail;
            C15886w.f54411a.m70116b().putString("MEMBER_JSON", AbstractC5796o.m27447j(MemberProvider.this.f54156b));
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberProvider$f */
    /* JADX INFO: loaded from: classes5.dex */
    static final class C15760f implements InterfaceC26758f {
        C15760f() {
        }

        @Override // p666oz.InterfaceC26758f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(BaseDto it) {
            Intrinsics.m97802h(it, "it");
            MemberTaskInfo memberTaskInfo = (MemberTaskInfo) it.getData();
            if (memberTaskInfo != null) {
                MemberProvider memberProvider = MemberProvider.this;
                C15886w.f54411a.m70116b().putString("MEMBER_TASK_JSON", AbstractC5796o.m27447j(memberTaskInfo));
                memberProvider.f54157c = memberTaskInfo;
                memberProvider.f54160f = memberProvider.m69839U();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberProvider$g */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15761g extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC23000d f54170e;

        C15761g(InterfaceC23000d interfaceC23000d) {
            this.f54170e = interfaceC23000d;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15777a.f54210a.m69948b("MemberProvider --> fetchMemberTaskInfo onFailure:" + str + ", " + str2);
            C5144k.f17646a.m24037S(MemberProvider.this.f54157c);
            InterfaceC23000d interfaceC23000d = this.f54170e;
            if (interfaceC23000d != null) {
                interfaceC23000d.mo22828b(MemberProvider.this.f54157c, true);
            }
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(MemberTaskInfo memberTaskInfo) {
            super.mo66458c(memberTaskInfo);
            C15777a.f54210a.m69948b("MemberProvider --> fetchMemberTaskInfo onSuccess:" + memberTaskInfo);
            C5144k.f17646a.m24037S(memberTaskInfo);
            InterfaceC23000d interfaceC23000d = this.f54170e;
            if (interfaceC23000d != null) {
                interfaceC23000d.mo22828b(memberTaskInfo, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.MemberProvider$h */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15762h extends AbstractC28362a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function1 f54171d;

        C15762h(Function1 function1) {
            this.f54171d = function1;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C15777a.f54210a.m69948b("Upload operation stat failed " + str + ", " + str2);
            Function1 function1 = this.f54171d;
            if (function1 != null) {
                function1.invoke(null);
            }
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: c */
        public void mo66458c(Object obj) {
            super.mo66458c(obj);
            C15777a.f54210a.m69948b("Upload operation stat succeed " + obj);
            Function1 function1 = this.f54171d;
            if (function1 != null) {
                function1.invoke("ok");
            }
        }
    }

    public MemberProvider() {
        Object objM112707constructorimpl;
        String string = C15886w.f54411a.m70116b().getString("MEMBER_JSON", null);
        if (string == null || string.length() == 0) {
            this.f54156b = null;
        } else {
            try {
                this.f54156b = (MemberDetail) AbstractC5796o.m27441d(string, MemberDetail.class);
            } catch (Exception unused) {
                this.f54156b = null;
            }
        }
        String string2 = C15886w.f54411a.m70116b().getString("MEMBER_TASK_JSON", null);
        if (string2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl((MemberTaskInfo) AbstractC5796o.m27441d(string2, MemberTaskInfo.class));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            this.f54157c = (MemberTaskInfo) (Result.m112713isFailureimpl(objM112707constructorimpl) ? null : objM112707constructorimpl);
        }
        if (mo69843B()) {
            ObserveLoginAction.f54204c.m69946a().m69944j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final Unit m69836R(Function2 function2, String str, String str2) {
        if (function2 != null) {
            function2.invoke(str, str2);
        }
        C28951b.a aVar = C28951b.f88586a;
        if (str2 == null) {
            return Unit.f75682a;
        }
        aVar.m111455e(str2);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final Unit m69837S(MemberProvider memberProvider, Function0 function0, TaskRewards taskRewards) {
        memberProvider.f54158d.setValue(null);
        memberProvider.f54159e.setValue(Boolean.FALSE);
        if (taskRewards != null && taskRewards.getTips() != null) {
            C28951b.f88586a.m111455e(taskRewards.getTips());
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final String m69838T() {
        String simpleName = MemberProvider.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final String m69839U() {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(Calendar.getInstance().getTimeInMillis() - ((long) 14400000)));
        Intrinsics.m97801g(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: V */
    private final InterfaceC0127a m69840V() {
        return (InterfaceC0127a) this.f54155a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final InterfaceC0127a m69841W() {
        return (InterfaceC0127a) C22982c.f70163e.m91553a().m91552h(InterfaceC0127a.class);
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: A */
    public void mo69842A(final Function2 function2, final Function0 function0) throws JSONException {
        MemberTaskItem memberTaskItem = (MemberTaskItem) this.f54158d.getValue();
        if (memberTaskItem != null) {
            mo69858l(memberTaskItem, new Function2() { // from class: com.transsion.member.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MemberProvider.m69836R(function2, (String) obj, (String) obj2);
                }
            }, new Function1() { // from class: com.transsion.member.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MemberProvider.m69837S(this.f54237a, function0, (TaskRewards) obj);
                }
            });
        }
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: B */
    public boolean mo69843B() {
        return C15886w.f54411a.m70116b().getBoolean("kv_is_enable_member", true);
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: C */
    public void mo69844C(Function0 function0) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new MemberProvider$checkShowAdState$1(this, function0, null), 3, null);
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: D */
    public int mo69845D() {
        return C15886w.f54411a.m70116b().getInt("kv_parallel_download_task_num", 1);
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: E */
    public void mo69846E() {
        ClaimMemberDialog claimMemberDialog = this.f54161g;
        if (claimMemberDialog != null) {
            claimMemberDialog.m69998r0();
        }
        this.f54161g = null;
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: a */
    public InterfaceC25018h1 mo69847a() {
        return this.f54159e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: b */
    public Object mo69848b(MemberSceneType memberSceneType, Integer num, Function1 function1, Continuation continuation) throws Throwable {
        MemberProvider$checkMemberRights$1 memberProvider$checkMemberRights$1;
        Object objM112707constructorimpl;
        if (continuation instanceof MemberProvider$checkMemberRights$1) {
            memberProvider$checkMemberRights$1 = (MemberProvider$checkMemberRights$1) continuation;
            int i11 = memberProvider$checkMemberRights$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                memberProvider$checkMemberRights$1.label = i11 - Integer.MIN_VALUE;
            } else {
                memberProvider$checkMemberRights$1 = new MemberProvider$checkMemberRights$1(this, continuation);
            }
        } else {
            memberProvider$checkMemberRights$1 = new MemberProvider$checkMemberRights$1(this, continuation);
        }
        Object objM581m = memberProvider$checkMemberRights$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = memberProvider$checkMemberRights$1.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    function1 = (Function1) memberProvider$checkMemberRights$1.L$0;
                    ResultKt.m97107b(objM581m);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(objM581m);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(objM581m);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("sceneType", memberSceneType != null ? memberSceneType.getValue() : null);
            if (num != null) {
                jsonObject.addProperty("resolution", num);
            }
            RequestBody.Companion companion = RequestBody.INSTANCE;
            String string = jsonObject.toString();
            Intrinsics.m97801g(string, "toString(...)");
            RequestBody requestBodyCreate = companion.create(string, MediaType.INSTANCE.parse("application/json"));
            Result.Companion companion2 = Result.INSTANCE;
            InterfaceC0127a interfaceC0127aM69840V = m69840V();
            String strM111992a = C29182a.f89053a.m111992a();
            memberProvider$checkMemberRights$1.L$0 = function1;
            memberProvider$checkMemberRights$1.label = 1;
            objM581m = interfaceC0127aM69840V.m581m(strM111992a, requestBodyCreate, memberProvider$checkMemberRights$1);
            if (objM581m == objF) {
                return objF;
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM581m);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C15777a.f54210a.m69948b(m69838T() + " --> checkMemberRights() ---> getOrElse() --> it = " + thM112710exceptionOrNullimpl);
            objM112707constructorimpl = null;
        }
        BaseDto baseDto = (BaseDto) objM112707constructorimpl;
        if (function1 != null) {
            AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
            MemberProvider$checkMemberRights$2$1 memberProvider$checkMemberRights$2$1 = new MemberProvider$checkMemberRights$2$1(function1, baseDto, null);
            memberProvider$checkMemberRights$1.L$0 = null;
            memberProvider$checkMemberRights$1.label = 2;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, memberProvider$checkMemberRights$2$1, memberProvider$checkMemberRights$1) == objF) {
                return objF;
            }
        }
        return Unit.f75682a;
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: c */
    public void mo69849c(InterfaceC23002f listener) {
        Intrinsics.m97802h(listener, "listener");
        ObserveLoginAction.f54204c.m69946a().m69945n(listener);
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: d */
    public boolean mo69850d() {
        return C15886w.f54411a.m70116b().getBoolean("kv_is_pay_enable_member", false);
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: e */
    public boolean mo69851e() {
        C15886w.f54411a.m70116b().getBoolean("kv_is_skip_ad", false);
        return true;
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: f */
    public void mo69852f() {
        m69840V().m583o(C29182a.f89053a.m111992a()).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15756b());
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: g */
    public void mo69853g(Activity activity, String title, String buttonTitle, InterfaceC23006j interfaceC23006j) {
        Intrinsics.m97802h(title, "title");
        Intrinsics.m97802h(buttonTitle, "buttonTitle");
        PurchaseSucceedDialog purchaseSucceedDialog = new PurchaseSucceedDialog(title, buttonTitle, interfaceC23006j);
        purchaseSucceedDialog.m70060s0(interfaceC23006j);
        purchaseSucceedDialog.m70061t0(title);
        purchaseSucceedDialog.m70059r0(buttonTitle);
        purchaseSucceedDialog.m65436k0(activity, "PurchaseSucceedDialog");
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: h */
    public void mo69854h() {
        C5144k.f17646a.m24041Y();
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: i */
    public boolean mo69855i(Fragment fragment) {
        return fragment instanceof MemberFragment;
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: j */
    public void mo69856j(InterfaceC23000d interfaceC23000d) {
        m69840V().m580l(C29182a.f89053a.m111992a()).m95079f(C28365d.f87067a.m109702c()).m95080h(C15757c.f54165a).subscribe(new C15758d(interfaceC23000d));
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: k */
    public void mo69857k(MemberDetail memberDetail) {
        this.f54156b = memberDetail;
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: l */
    public void mo69858l(MemberTaskItem item, Function2 function2, Function1 function1) throws JSONException {
        Intrinsics.m97802h(item, "item");
        JSONObject jSONObject = new JSONObject();
        C15777a.f54210a.m69947a("claimTaskReward taskId: " + item.getTaskId());
        Object taskId = item.getTaskId();
        if (taskId == null) {
            taskId = 0;
        }
        jSONObject.put("taskId", taskId);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.m97801g(string, "toString(...)");
        m69840V().m578j(C29182a.f89053a.m111992a(), companion.create(string, MediaType.INSTANCE.parse("application/json"))).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15755a(function2, function1));
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: m */
    public MemberDetail mo69859m() {
        return this.f54156b;
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: n */
    public void mo69860n(Activity activity, MemberSource memberSource, InterfaceC22999c interfaceC22999c, boolean z11, String sceneId) {
        Intrinsics.m97802h(sceneId, "sceneId");
        if (mo69843B()) {
            MemberMiddleStateDialog memberMiddleStateDialogM70018a = MemberMiddleStateDialog.INSTANCE.m70018a(z11);
            memberMiddleStateDialogM70018a.m70015p0(interfaceC22999c);
            memberMiddleStateDialogM70018a.m70016q0(memberSource);
            memberMiddleStateDialogM70018a.m70017r0(sceneId);
            memberMiddleStateDialogM70018a.m65436k0(activity, "MemberMiddleStateDialog");
            return;
        }
        C15777a.f54210a.m69948b(m69838T() + " --> startMemberPage() --> 当前不开发会员功能");
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: o */
    public void mo69861o(InterfaceC23000d interfaceC23000d) {
        m69840V().m582n(C29182a.f89053a.m111992a()).m95079f(C28365d.f87067a.m109702c()).m95080h(new C15760f()).subscribe(new C15761g(interfaceC23000d));
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: p */
    public void mo69862p(InterfaceC23002f listener) {
        Intrinsics.m97802h(listener, "listener");
        ObserveLoginAction.f54204c.m69946a().m69942e(listener);
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: q */
    public boolean mo69863q() {
        MemberInfo memberInfo;
        MemberDetail memberDetail = this.f54156b;
        if (memberDetail == null || (memberInfo = memberDetail.getMemberInfo()) == null) {
            return false;
        }
        return memberInfo.isActive();
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: r */
    public void mo69864r(OpType opType, Function1 function1) {
        Intrinsics.m97802h(opType, "opType");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("opType", opType.getValue());
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String string = jsonObject.toString();
        Intrinsics.m97801g(string, "toString(...)");
        m69840V().m576h(C29182a.f89053a.m111992a(), companion.create(string, MediaType.INSTANCE.parse("application/json"))).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15762h(function1));
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: s */
    public void mo69865s() {
        m69840V().m579k(C29182a.f89053a.m111992a()).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15759e());
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: t */
    public void mo69866t() {
        C5144k.f17646a.m24042a0();
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: u */
    public void mo69867u(Integer num, InterfaceC22997a interfaceC22997a) {
        C15777a.f54210a.m69947a(m69838T() + " --> showCheckResolutionRightsDialog() --> 这里不需要判断了，统一下载的时候会有校验 ");
        if (interfaceC22997a != null) {
            interfaceC22997a.mo66169e();
        }
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: v */
    public void mo69868v(Activity activity, MemberSource source, MemberCheckResult memberCheckResult, InterfaceC22999c callback) {
        Intrinsics.m97802h(source, "source");
        Intrinsics.m97802h(callback, "callback");
        MemberGuideDialog memberGuideDialog = new MemberGuideDialog();
        memberGuideDialog.m70009r0(callback);
        memberGuideDialog.m70011w0(source);
        memberGuideDialog.m70010v0(memberCheckResult);
        memberGuideDialog.m65436k0(activity, "MemberGuideDialog");
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: w */
    public Fragment mo69869w() {
        Fragment fragmentM61860k = TheRouter.m61773c("/member/MemberFragment").m61860k();
        return fragmentM61860k == null ? new EmptyFragment() : fragmentM61860k;
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: x */
    public void mo69870x() {
        C5144k.f17646a.m24039W();
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: y */
    public void mo69871y(MemberSceneType sceneType, Integer num, InterfaceC22997a interfaceC22997a) {
        Intrinsics.m97802h(sceneType, "sceneType");
        CheckMemberRightsLoadingDialog checkMemberRightsLoadingDialog = new CheckMemberRightsLoadingDialog();
        checkMemberRightsLoadingDialog.m69985u0(interfaceC22997a);
        checkMemberRightsLoadingDialog.m69986v0(sceneType, num);
        checkMemberRightsLoadingDialog.m65436k0(AbstractC5775a.m27311b(), "CheckMemberRightsDialog");
    }

    @Override // p352dn.InterfaceC22998b
    /* JADX INFO: renamed from: z */
    public void mo69872z(float f11) {
        C15777a.f54210a.m69947a("checkMemberShipShow data:" + this.f54158d.getValue());
        try {
            if (this.f54158d.getValue() != null) {
                ClaimMemberDialog claimMemberDialog = new ClaimMemberDialog();
                claimMemberDialog.m70000y0((MemberTaskItem) this.f54158d.getValue());
                claimMemberDialog.m70001z0(AbstractC5776a0.m27313a(f11));
                claimMemberDialog.m65436k0(AbstractC5775a.m27311b(), "ClaimMemberDialog");
                this.f54161g = claimMemberDialog;
            }
        } catch (Exception e11) {
            C15777a.f54210a.m69948b("checkMemberShipShow error:" + e11.getMessage());
        }
    }
}
