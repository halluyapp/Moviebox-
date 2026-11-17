package com.transsion.usercenter.setting.labelsfeedback.sender;

import android.app.Application;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.setting.labelsfeedback.model.FbDataModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.setting.labelsfeedback.sender.FBSender$send$1", m97637f = "FBSender.kt", m97638l = {}, m97639m = "invokeSuspend")
final class FBSender$send$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Application $application;
    final /* synthetic */ FbDataModel $model;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FBSender$send$1(FbDataModel fbDataModel, Application application, Continuation<? super FBSender$send$1> continuation) {
        super(2, continuation);
        this.$model = fbDataModel;
        this.$application = application;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FBSender$send$1(this.$model, this.$application, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((FBSender$send$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        try {
            String strM27447j = AbstractC5796o.m27447j(this.$model);
            FBSender fBSender = FBSender.f65533a;
            Intrinsics.m97799e(strM27447j);
            fBSender.m85820j(strM27447j, this.$application);
        } catch (Exception unused) {
            C28951b.f88586a.m111454d(R$string.upload_failed);
        }
        return Unit.f75682a;
    }
}
