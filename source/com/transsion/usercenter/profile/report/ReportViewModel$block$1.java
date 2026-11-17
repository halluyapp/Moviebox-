package com.transsion.usercenter.profile.report;

import com.google.gson.JsonObject;
import com.p282tn.lib.net.bean.BaseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.profile.report.ReportViewModel$block$1", m97637f = "ReportViewModel.kt", m97638l = {64}, m97639m = "invokeSuspend")
final class ReportViewModel$block$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonObject $json;
    int label;
    final /* synthetic */ ReportViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.report.ReportViewModel$block$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/tn/lib/net/bean/BaseDto;", "", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.usercenter.profile.report.ReportViewModel$block$1$1", m97637f = "ReportViewModel.kt", m97638l = {59, 60}, m97639m = "invokeSuspend")
    static final class C207291 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ JsonObject $json;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ReportViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C207291(JsonObject jsonObject, ReportViewModel reportViewModel, Continuation<? super C207291> continuation) {
            super(2, continuation);
            this.$json = jsonObject;
            this.this$0 = reportViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C207291 c207291 = new C207291(this.$json, this.this$0, continuation);
            c207291.L$0 = obj;
            return c207291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C207291) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x006f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            RequestBody requestBodyM92796a;
            InterfaceC24998b interfaceC24998b;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b2 = (InterfaceC24998b) this.L$0;
                C23367b.a aVar = C23367b.f71265a;
                String string = this.$json.toString();
                Intrinsics.m97801g(string, "toString(...)");
                requestBodyM92796a = aVar.m92796a(string);
                if (requestBodyM92796a != null) {
                    InterfaceC20739b interfaceC20739bM85467k = this.this$0.m85467k();
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.L$0 = interfaceC24998b2;
                    this.L$1 = requestBodyM92796a;
                    this.label = 1;
                    Object objM85479a = interfaceC20739bM85467k.m85479a(strM111992a, requestBodyM92796a, this);
                    if (objM85479a == objF) {
                        return objF;
                    }
                    interfaceC24998b = interfaceC24998b2;
                    obj = objM85479a;
                    this.L$0 = requestBodyM92796a;
                    this.L$1 = null;
                    this.label = 2;
                    if (interfaceC24998b.emit((BaseDto) obj, this) == objF) {
                        return objF;
                    }
                }
            } else if (i11 == 1) {
                requestBodyM92796a = (RequestBody) this.L$1;
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                ResultKt.m97107b(obj);
                this.L$0 = requestBodyM92796a;
                this.L$1 = null;
                this.label = 2;
                if (interfaceC24998b.emit((BaseDto) obj, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.report.ReportViewModel$block$1$2 */
    @Metadata(m97099d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/tn/lib/net/bean/BaseDto;", "", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.usercenter.profile.report.ReportViewModel$block$1$2", m97637f = "ReportViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C207302 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ReportViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C207302(ReportViewModel reportViewModel, Continuation<? super C207302> continuation) {
            super(3, continuation);
            this.this$0 = reportViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            return new C207302(this.this$0, continuation).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.this$0.m85471i().mo14858q(null);
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.profile.report.ReportViewModel$block$1$a */
    static final class C20731a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ReportViewModel f65312a;

        C20731a(ReportViewModel reportViewModel) {
            this.f65312a = reportViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(BaseDto baseDto, Continuation continuation) {
            this.f65312a.m85471i().mo14858q(baseDto);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportViewModel$block$1(JsonObject jsonObject, ReportViewModel reportViewModel, Continuation<? super ReportViewModel$block$1> continuation) {
        super(2, continuation);
        this.$json = jsonObject;
        this.this$0 = reportViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReportViewModel$block$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ReportViewModel$block$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C207291(this.$json, this.this$0, null)), C25220y0.m99268b()), new C207302(this.this$0, null));
            C20731a c20731a = new C20731a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c20731a, this) == objF) {
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
