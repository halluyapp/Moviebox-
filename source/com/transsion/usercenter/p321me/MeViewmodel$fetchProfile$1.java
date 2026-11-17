package com.transsion.usercenter.p321me;

import ck.C5110g;
import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.usercenter.profile.C20663e0;
import com.transsion.usercenter.profile.InterfaceC20647b;
import com.transsion.usercenter.profile.bean.MinePageInfo;
import com.transsnet.loginapi.bean.UserInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p772sw.C27660c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.me.MeViewmodel$fetchProfile$1", m97637f = "MeViewmodel.kt", m97638l = {107, 109}, m97639m = "invokeSuspend")
final class MeViewmodel$fetchProfile$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MeViewmodel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MeViewmodel$fetchProfile$1(MeViewmodel meViewmodel, Continuation<? super MeViewmodel$fetchProfile$1> continuation) {
        super(2, continuation);
        this.this$0 = meViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MeViewmodel$fetchProfile$1 meViewmodel$fetchProfile$1 = new MeViewmodel$fetchProfile$1(this.this$0, continuation);
        meViewmodel$fetchProfile$1.L$0 = obj;
        return meViewmodel$fetchProfile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MeViewmodel$fetchProfile$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        MeViewmodel meViewmodel;
        BaseDto baseDto;
        MinePageInfo minePageInfo;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                MeViewmodel meViewmodel2 = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                meViewmodel2.m84961F();
                if (C5110g.f17601a.m23911b()) {
                    InterfaceC20647b interfaceC20647bM84959C = meViewmodel2.m84959C();
                    this.L$0 = meViewmodel2;
                    this.label = 1;
                    Object objM85300j = InterfaceC20647b.a.m85300j(interfaceC20647bM84959C, null, null, this, 3, null);
                    if (objM85300j == objF) {
                        return objF;
                    }
                    meViewmodel = meViewmodel2;
                    obj = objM85300j;
                    baseDto = (BaseDto) obj;
                } else {
                    InterfaceC20647b interfaceC20647bM84959C2 = meViewmodel2.m84959C();
                    this.L$0 = meViewmodel2;
                    this.label = 2;
                    Object objM85293c = InterfaceC20647b.a.m85293c(interfaceC20647bM84959C2, null, null, this, 3, null);
                    if (objM85293c == objF) {
                        return objF;
                    }
                    meViewmodel = meViewmodel2;
                    obj = objM85293c;
                    baseDto = (BaseDto) obj;
                }
            } else if (i11 == 1) {
                meViewmodel = (MeViewmodel) this.L$0;
                ResultKt.m97107b(obj);
                baseDto = (BaseDto) obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                meViewmodel = (MeViewmodel) this.L$0;
                ResultKt.m97107b(obj);
                baseDto = (BaseDto) obj;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fetchProfile, result:");
            sb2.append(baseDto);
            if (Intrinsics.m97797c(baseDto.getCode(), "0") && (minePageInfo = (MinePageInfo) baseDto.getData()) != null) {
                UserInfo userInfo = minePageInfo.getUserInfo();
                if (userInfo != null) {
                    C20663e0.f65192a.m85330b().putString("PROFILE_JSON", AbstractC5796o.m27447j(userInfo));
                }
                meViewmodel.f64975n = minePageInfo;
                C27660c c27660c = C27660c.f84831a;
                UserInfo userInfo2 = minePageInfo.getUserInfo();
                c27660c.m107604d(userInfo2 != null ? userInfo2.getUsername() : null);
                meViewmodel.m84969N();
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("fetchProfile, error:");
            sb3.append(thM112710exceptionOrNullimpl);
        }
        return Unit.f75682a;
    }
}
