package com.transsion.postdetail.p304ad;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.transsion.p285ad.bidding.base.AbsAdBidding;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.strategy.C14058c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ad.BaseVideoAdHelper$loadNativeAd$1", m97637f = "BaseVideoAdHelper.kt", m97638l = {268}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class BaseVideoAdHelper$loadNativeAd$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Function0<Unit> $onFail;
    final /* synthetic */ String $sceneId;
    int label;
    final /* synthetic */ BaseVideoAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseVideoAdHelper$loadNativeAd$1(Context context, BaseVideoAdHelper baseVideoAdHelper, String str, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super BaseVideoAdHelper$loadNativeAd$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.this$0 = baseVideoAdHelper;
        this.$sceneId = str;
        this.$callback = function0;
        this.$onFail = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseVideoAdHelper$loadNativeAd$1(this.$ctx, this.this$0, this.$sceneId, this.$callback, this.$onFail, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((BaseVideoAdHelper$loadNativeAd$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            Context context = this.$ctx;
            AppCompatActivity appCompatActivity = null;
            AppCompatActivity appCompatActivity2 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (appCompatActivity2 != null) {
                if (!appCompatActivity2.isDestroyed() && !appCompatActivity2.isFinishing()) {
                    appCompatActivity = appCompatActivity2;
                }
                if (appCompatActivity != null) {
                    this.this$0.m72778v1(new BiddingNativeManager());
                    BiddingNativeManager biddingNativeManagerM72775u0 = this.this$0.m72775u0();
                    if (biddingNativeManagerM72775u0 != null) {
                        biddingNativeManagerM72775u0.m62830L0(this.$sceneId);
                    }
                    BiddingNativeManager biddingNativeManagerM72775u1 = this.this$0.m72775u0();
                    if (biddingNativeManagerM72775u1 != null) {
                        biddingNativeManagerM72775u1.m62828J0(C14058c.f49742a.m63681a(this.this$0.m72762j0()));
                    }
                    BiddingNativeManager biddingNativeManagerM72775u2 = this.this$0.m72775u0();
                    if (biddingNativeManagerM72775u2 != null) {
                        biddingNativeManagerM72775u2.m62827I0(appCompatActivity);
                    }
                    BiddingNativeManager biddingNativeManagerM72775u3 = this.this$0.m72775u0();
                    if (biddingNativeManagerM72775u3 != null) {
                        biddingNativeManagerM72775u3.m62829K0(this.this$0.m72696o2(this.$sceneId, this.$callback, this.$onFail));
                    }
                    BiddingNativeManager biddingNativeManagerM72775u4 = this.this$0.m72775u0();
                    if (biddingNativeManagerM72775u4 != null) {
                        this.label = 1;
                        if (AbsAdBidding.m62816t0(biddingNativeManagerM72775u4, 0, false, this, 3, null) == objF) {
                            return objF;
                        }
                    }
                }
            }
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        return Unit.f75682a;
    }
}
