package com.transsion.subroom.activity;

import android.app.Application;
import com.p282tn.lib.thread.C13714b;
import com.transsion.usercenter.setting.labelsfeedback.sender.FBSender;
import com.transsion.usercenterapi.UpdateResultEvent;
import com.transsion.version.update.UpdateManager;
import com.transsnet.downloader.notification.DownloadNotificationUtils;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subroom.activity.MainActivity$createDelayTask$1", m97637f = "MainActivity.kt", m97638l = {1184, 1185, 1195}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class MainActivity$createDelayTask$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$createDelayTask$1(MainActivity mainActivity, Continuation<? super MainActivity$createDelayTask$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m81671d() {
        DownloadNotificationUtils.f67678a.m88797G();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$createDelayTask$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MainActivity$createDelayTask$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else if (i11 == 2) {
                ResultKt.m97107b(obj);
                if (((Boolean) obj).booleanValue()) {
                    UpdateResultEvent updateResultEvent = new UpdateResultEvent(true);
                    FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                    String name = UpdateResultEvent.class.getName();
                    Intrinsics.m97801g(name, "getName(...)");
                    flowEventBus.postEvent(name, updateResultEvent, 0L);
                    C26866a.a.m104898f(C26866a.f81698a, "update", "NeedUpdate", false, 4, null);
                }
                this.label = 3;
                if (AbstractC25207u0.m99223a(3000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            C13714b.f48410a.m61985a(new Runnable() { // from class: com.transsion.subroom.activity.x
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity$createDelayTask$1.m81671d();
                }
            });
            FBSender fBSender = FBSender.f65533a;
            Application application = this.this$0.getApplication();
            Intrinsics.m97801g(application, "getApplication(...)");
            fBSender.m85823h(application);
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        this.label = 1;
        if (AbstractC25207u0.m99223a(2000L, this) == objF) {
            return objF;
        }
        UpdateManager updateManagerM85865a = UpdateManager.f65568f.m85865a();
        MainActivity mainActivity = this.this$0;
        this.label = 2;
        obj = UpdateManager.m85858j(updateManagerM85865a, mainActivity, "main_page", "wefeed-mobile-bff", "", false, this, 16, null);
        if (obj == objF) {
            return objF;
        }
        if (((Boolean) obj).booleanValue()) {
            UpdateResultEvent updateResultEvent2 = new UpdateResultEvent(true);
            FlowEventBus flowEventBus2 = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name2 = UpdateResultEvent.class.getName();
            Intrinsics.m97801g(name2, "getName(...)");
            flowEventBus2.postEvent(name2, updateResultEvent2, 0L);
            C26866a.a.m104898f(C26866a.f81698a, "update", "NeedUpdate", false, 4, null);
        }
        this.label = 3;
        if (AbstractC25207u0.m99223a(3000L, this) == objF) {
            return objF;
        }
        C13714b.f48410a.m61985a(new Runnable() { // from class: com.transsion.subroom.activity.x
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity$createDelayTask$1.m81671d();
            }
        });
        FBSender fBSender2 = FBSender.f65533a;
        Application application2 = this.this$0.getApplication();
        Intrinsics.m97801g(application2, "getApplication(...)");
        fBSender2.m85823h(application2);
        return Unit.f75682a;
    }
}
