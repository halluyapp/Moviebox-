package com.transsion.player.longvideo.p302ui.dialog;

import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.therouter.TheRouter;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p352dn.InterfaceC22998b;
import p550kj.C24662i;
import p553ko.C24715a;
import p553ko.C24716b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.dialog.LongVdPlayerConfigDialog$onViewCreated$1$1$1", m97637f = "LongVdPlayerConfigDialog.kt", m97638l = {Sdk$SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m97639m = "invokeSuspend")
final class LongVdPlayerConfigDialog$onViewCreated$1$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C24716b $config;
    int label;
    final /* synthetic */ LongVdPlayerConfigDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongVdPlayerConfigDialog$onViewCreated$1$1$1(C24716b c24716b, LongVdPlayerConfigDialog longVdPlayerConfigDialog, Continuation<? super LongVdPlayerConfigDialog$onViewCreated$1$1$1> continuation) {
        super(2, continuation);
        this.$config = c24716b;
        this.this$0 = longVdPlayerConfigDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LongVdPlayerConfigDialog$onViewCreated$1$1$1(this.$config, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LongVdPlayerConfigDialog$onViewCreated$1$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            ?? Mo69863q = interfaceC22998b != null ? interfaceC22998b.mo69863q() : 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("module_name", "clarity");
            linkedHashMap.put(NativeComponentConstants.KEY_COMPONENT_TYPE, this.$config.m97074d());
            C24715a c24715a = this.this$0.longVdPlayerBean;
            linkedHashMap.put("subject_id", c24715a != null ? c24715a.m97059o() : null);
            linkedHashMap.put("is_member", String.valueOf((int) Mo69863q));
            C24662i c24662i = C24662i.f75350a;
            String str = this.this$0.pageName;
            if (str == null) {
                str = "vip_resolution";
            }
            c24662i.m96881p(str, linkedHashMap);
            LongVdPlayerConfigDialog longVdPlayerConfigDialog = this.this$0;
            C24716b c24716b = this.$config;
            this.label = 1;
            obj = longVdPlayerConfigDialog.m72163w0(c24716b, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.dismissAllowingStateLoss();
        } else {
            this.this$0.m72153A0(this.$config);
        }
        return Unit.f75682a;
    }
}
