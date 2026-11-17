package com.transsion.member;

import com.tencent.mmkv.MMKV;
import com.transsion.memberapi.MemberCheckResult;
import com.transsion.memberapi.MemberSceneType;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;
import ki.C24649b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p411fh.C23366a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.member.MemberProvider$checkShowAdState$1", m97637f = "MemberProvider.kt", m97638l = {Sdk$SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m97639m = "invokeSuspend")
final class MemberProvider$checkShowAdState$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    int label;
    final /* synthetic */ MemberProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MemberProvider$checkShowAdState$1(MemberProvider memberProvider, Function0<Unit> function0, Continuation<? super MemberProvider$checkShowAdState$1> continuation) {
        super(2, continuation);
        this.this$0 = memberProvider;
        this.$callback = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Unit m69877d(MemberProvider memberProvider, Function0 function0, MemberCheckResult memberCheckResult) {
        List<String> vipAdScenes;
        String pointUrl;
        Integer multiDownloadLimit;
        String inviteH5Url;
        String inviteRewardDays;
        Boolean vipPayEnable;
        Boolean vipEnable;
        Boolean boolIsPassed;
        String string;
        C15777a c15777a = C15777a.f54210a;
        String strM69838T = memberProvider.m69838T();
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        String str = "";
        if (mmkvM92790c != null && (string = mmkvM92790c.getString("sp_code", "")) != null) {
            str = string;
        }
        c15777a.m69947a(strM69838T + " --> checkShowAdState() --> SP_CODE = " + str + " --> it = " + memberCheckResult);
        if (memberCheckResult != null && (boolIsPassed = memberCheckResult.isPassed()) != null) {
            boolIsPassed.booleanValue();
            C15886w.f54411a.m70116b().putBoolean("kv_is_skip_ad", true);
            C24649b.f75311a.m96816c(true);
        }
        if (memberCheckResult != null && (vipEnable = memberCheckResult.getVipEnable()) != null) {
            C15886w.f54411a.m70116b().putBoolean("kv_is_enable_member", vipEnable.booleanValue());
        }
        if (memberCheckResult != null && (vipPayEnable = memberCheckResult.getVipPayEnable()) != null) {
            C15886w.f54411a.m70116b().putBoolean("kv_is_pay_enable_member", vipPayEnable.booleanValue());
        }
        if (memberCheckResult != null && (inviteRewardDays = memberCheckResult.getInviteRewardDays()) != null) {
            C15886w.f54411a.m70116b().putString("kv_invite_Reward_Days", inviteRewardDays);
        }
        if (memberCheckResult != null && (inviteH5Url = memberCheckResult.getInviteH5Url()) != null) {
            C15886w.f54411a.m70116b().putString("kv_invite_H5_Url", inviteH5Url);
        }
        if (memberCheckResult != null && (multiDownloadLimit = memberCheckResult.getMultiDownloadLimit()) != null) {
            C15886w.f54411a.m70116b().putInt("kv_parallel_download_task_num", multiDownloadLimit.intValue());
        }
        if (memberCheckResult != null && (pointUrl = memberCheckResult.getPointUrl()) != null) {
            C15886w.f54411a.m70116b().putString("kv_point_url", pointUrl);
        }
        if (memberCheckResult != null && (vipAdScenes = memberCheckResult.getVipAdScenes()) != null) {
            C24649b.f75311a.m96814a(vipAdScenes);
        }
        if (function0 != null) {
        }
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemberProvider$checkShowAdState$1(this.this$0, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MemberProvider$checkShowAdState$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            MemberProvider memberProvider = this.this$0;
            MemberSceneType memberSceneType = MemberSceneType.SCENE_AD;
            Integer numM97634d = Boxing.m97634d(0);
            final MemberProvider memberProvider2 = this.this$0;
            final Function0<Unit> function0 = this.$callback;
            Function1 function1 = new Function1() { // from class: com.transsion.member.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return MemberProvider$checkShowAdState$1.m69877d(memberProvider2, function0, (MemberCheckResult) obj2);
                }
            };
            this.label = 1;
            if (memberProvider.mo69848b(memberSceneType, numM97634d, function1, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
