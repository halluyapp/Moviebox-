package com.transsion.home.fragment.home;

import android.app.Activity;
import android.content.Context;
import com.transsion.version.update.UpdateManager;
import com.vungle.ads.internal.protos.Sdk$SDKError;
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
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.fragment.home.HomeSearchViewManager$handleUpdateIcon$1$1", m97637f = "HomeSearchViewManager.kt", m97638l = {Sdk$SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m97639m = "invokeSuspend")
final class HomeSearchViewManager$handleUpdateIcon$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeSearchViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeSearchViewManager$handleUpdateIcon$1$1(HomeSearchViewManager homeSearchViewManager, Continuation<? super HomeSearchViewManager$handleUpdateIcon$1$1> continuation) {
        super(2, continuation);
        this.this$0 = homeSearchViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeSearchViewManager$handleUpdateIcon$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((HomeSearchViewManager$handleUpdateIcon$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            UpdateManager updateManagerM85865a = UpdateManager.f65568f.m85865a();
            Context context = this.this$0.f52948d;
            if (context == null) {
                Intrinsics.m97819y("context");
                context = null;
            }
            this.label = 1;
            obj = updateManagerM85865a.m85864i((Activity) context, "app_center", "wefeed-mobile-bff", "", true, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C26866a.a.m104898f(C26866a.f81698a, "update", "checkUpdate " + zBooleanValue, false, 4, null);
        return Unit.f75682a;
    }
}
