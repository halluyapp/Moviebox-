package com.transsion.rewardscenter.task.dada;

import androidx.p1004lifecycle.C3187b0;
import aq.C4698a;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.transsion.rewardscenter.model.RewardsCenterModel;
import com.transsion.rewardscenter.p309ui.RewardsCenterFragment;
import com.transsion.rewardscenter.utils.RewardsCenterApiHelper;
import com.transsion.rewardscenterapi.DaDaInfo;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.rewardscenter.task.dada.DadaActivateView$checkSetDefault$1", m97637f = "DaDaActivateView.kt", m97638l = {401, TTAdConstant.DEEPLINK_UNAVAILABLE_CODE}, m97639m = "invokeSuspend")
final class DadaActivateView$checkSetDefault$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onFailure;
    final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
    final /* synthetic */ long $time;
    int label;
    final /* synthetic */ DadaActivateView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DadaActivateView$checkSetDefault$1(DadaActivateView dadaActivateView, long j11, Function1<? super String, Unit> function1, Function1<? super Boolean, Unit> function2, Continuation<? super DadaActivateView$checkSetDefault$1> continuation) {
        super(2, continuation);
        this.this$0 = dadaActivateView;
        this.$time = j11;
        this.$onFailure = function1;
        this.$onSuccess = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m76425g(DadaActivateView dadaActivateView, Function1 function1, String str, String str2) {
        RewardsCenterModel rewardsCenterModelM22756c;
        C3187b0 c3187b0M76117o;
        C4698a c4698a = dadaActivateView.ctxConfig;
        if (c4698a != null && (rewardsCenterModelM22756c = c4698a.m22756c()) != null && (c3187b0M76117o = rewardsCenterModelM22756c.m76117o()) != null) {
            c3187b0M76117o.mo14855n(Boolean.FALSE);
        }
        if (function1 != null) {
            function1.invoke(str2);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m76426h(DadaActivateView dadaActivateView, Function1 function1, DaDaInfo daDaInfo) {
        RewardsCenterModel rewardsCenterModelM22756c;
        C3187b0 c3187b0M76117o;
        C4698a c4698a = dadaActivateView.ctxConfig;
        if (c4698a != null && (rewardsCenterModelM22756c = c4698a.m22756c()) != null && (c3187b0M76117o = rewardsCenterModelM22756c.m76117o()) != null) {
            c3187b0M76117o.mo14855n(Boolean.FALSE);
        }
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(daDaInfo != null ? daDaInfo.isSetDefault() : false));
        }
        C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "--> checkDadaSetDefault: " + daDaInfo, false, 4, null);
        if (daDaInfo != null && daDaInfo.isSetDefault()) {
            dadaActivateView.setTaskState(DadaTaskState.SET_DEFAULT);
        }
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DadaActivateView$checkSetDefault$1(this.this$0, this.$time, this.$onFailure, this.$onSuccess, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((DadaActivateView$checkSetDefault$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        WeakReference weakReferenceM22754a;
        RewardsCenterFragment rewardsCenterFragment;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        C4698a c4698a = this.this$0.ctxConfig;
        if (c4698a != null && (weakReferenceM22754a = c4698a.m22754a()) != null && (rewardsCenterFragment = (RewardsCenterFragment) weakReferenceM22754a.get()) != null) {
            rewardsCenterFragment.showLoading();
        }
        long j11 = this.$time;
        if (j11 > 0) {
            this.label = 1;
            if (AbstractC25207u0.m99223a(j11, this) == objF) {
                return objF;
            }
        }
        RewardsCenterApiHelper rewardsCenterApiHelper = RewardsCenterApiHelper.f58979a;
        final DadaActivateView dadaActivateView = this.this$0;
        final Function1<String, Unit> function1 = this.$onFailure;
        Function2 function2 = new Function2() { // from class: com.transsion.rewardscenter.task.dada.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return DadaActivateView$checkSetDefault$1.m76425g(dadaActivateView, function1, (String) obj2, (String) obj3);
            }
        };
        final DadaActivateView dadaActivateView2 = this.this$0;
        final Function1<Boolean, Unit> function3 = this.$onSuccess;
        Function1 function4 = new Function1() { // from class: com.transsion.rewardscenter.task.dada.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return DadaActivateView$checkSetDefault$1.m76426h(dadaActivateView2, function3, (DaDaInfo) obj2);
            }
        };
        this.label = 2;
        if (rewardsCenterApiHelper.m76619j(function2, function4, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
