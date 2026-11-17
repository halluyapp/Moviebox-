package com.transsion.usercenter.laboratory;

import com.transsion.p285ad.p286db.mcc.LocalMcc;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25089i0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import ni.InterfaceC26009a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.laboratory.LabCountryDialog$handleMcc$1", m97637f = "LabCountryDialog.kt", m97638l = {73}, m97639m = "invokeSuspend")
final class LabCountryDialog$handleMcc$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $text;
    Object L$0;
    int label;
    final /* synthetic */ LabCountryDialog this$0;

    /* JADX INFO: renamed from: com.transsion.usercenter.laboratory.LabCountryDialog$handleMcc$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.usercenter.laboratory.LabCountryDialog$handleMcc$1$1", m97637f = "LabCountryDialog.kt", m97638l = {74}, m97639m = "invokeSuspend")
    static final class C204911 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<LocalMcc> $localMcc;
        final /* synthetic */ String $text;
        int label;
        final /* synthetic */ LabCountryDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C204911(LabCountryDialog labCountryDialog, String str, Ref.ObjectRef<LocalMcc> objectRef, Continuation<? super C204911> continuation) {
            super(2, continuation);
            this.this$0 = labCountryDialog;
            this.$text = str;
            this.$localMcc = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C204911(this.this$0, this.$text, this.$localMcc, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C204911) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC26009a interfaceC26009aM84806v0 = this.this$0.m84806v0();
                String str = this.$text;
                this.label = 1;
                obj = interfaceC26009aM84806v0.mo102063b(str, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            List list = (List) obj;
            this.$localMcc.element = list != null ? (LocalMcc) CollectionsKt.m97361k0(list) : 0;
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LabCountryDialog$handleMcc$1(LabCountryDialog labCountryDialog, String str, Continuation<? super LabCountryDialog$handleMcc$1> continuation) {
        super(2, continuation);
        this.this$0 = labCountryDialog;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LabCountryDialog$handleMcc$1(this.this$0, this.$text, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LabCountryDialog$handleMcc$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        String mcc;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            AbstractC25089i0 abstractC25089i0M99268b = C25220y0.m99268b();
            C204911 c204911 = new C204911(this.this$0, this.$text, objectRef2, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (AbstractC25088i.m98910g(abstractC25089i0M99268b, c204911, this) == objF) {
                return objF;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            ResultKt.m97107b(obj);
        }
        LabCountryDialog labCountryDialog = this.this$0;
        String str = this.$text;
        LocalMcc localMcc = (LocalMcc) objectRef.element;
        if (localMcc == null || (mcc = localMcc.getMcc()) == null) {
            mcc = "";
        }
        labCountryDialog.m84797D0(str, mcc);
        this.this$0.dismiss();
        return Unit.f75682a;
    }
}
