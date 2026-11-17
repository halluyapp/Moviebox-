package com.transsion.mbwidget.data;

import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.mbwidget.C15716d;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.mbwidget.data.WidgetDataManager$saveToCache$1", m97637f = "WidgetDataManager.kt", m97638l = {}, m97639m = "invokeSuspend")
final class WidgetDataManager$saveToCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ DeskWidgetResp $resp;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetDataManager$saveToCache$1(DeskWidgetResp deskWidgetResp, Continuation<? super WidgetDataManager$saveToCache$1> continuation) {
        super(2, continuation);
        this.$resp = deskWidgetResp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WidgetDataManager$saveToCache$1 widgetDataManager$saveToCache$1 = new WidgetDataManager$saveToCache$1(this.$resp, continuation);
        widgetDataManager$saveToCache$1.L$0 = obj;
        return widgetDataManager$saveToCache$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((WidgetDataManager$saveToCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        DeskWidgetResp deskWidgetResp = this.$resp;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (deskWidgetResp.getHotList().isEmpty()) {
                deskWidgetResp.setHotList(WidgetDataManager.f54103g);
            }
            if (deskWidgetResp.getInterestList().isEmpty()) {
                deskWidgetResp.setInterestList(WidgetDataManager.f54104h);
            }
            Result.m112707constructorimpl(C15716d.f54081a.m69635k().putString("hot_widget_cache_key", AbstractC5796o.m27447j(deskWidgetResp)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return Unit.f75682a;
    }
}
